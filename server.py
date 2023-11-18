import socket
server_socket = socket.socket(socket.AF_INET, socket.SOCK_STREAM)
server_address = ('192.168.86.44', 8000) # Change 'localhost' to your desired IP add

server_socket.bind(server_address)
server_socket.listen(1)
print("Waiting for a client to connect...")
client_socket, client_address = server_socket.accept()
print("Client connected:", client_address)
data = client_socket.recv(1024)
print("Received data:", data.decode())
client_socket.sendall(data)
client_socket.close()
server_socket.close()
