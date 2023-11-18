import socket
client_socket = socket.socket(socket.AF_INET, socket.SOCK_STREAM)
server_address = ('S40-41043-15', 8000) # Change 'localhost' to your desired IP

client_socket.connect(server_address)
data = "20175012-20188671"
client_socket.sendall(data.encode())
echoed_data = client_socket.recv(1024)
print("Echoed data from server:", echoed_data.decode())
client_socket.close()