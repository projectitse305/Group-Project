import java.util.HashMap;
import java.util.Scanner;

public class Register {

    // HashMap to store user credentials (username, password)
    static HashMap<String, String> users = new HashMap<String, String>();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice = 0;

        // Menu loop
        while (choice != 3) {
            System.out.println("Select an option: ");
            System.out.println("1. Register");
            System.out.println("2. Login");
            System.out.println("3. Quit");
            choice = scanner.nextInt();
            scanner.nextLine(); // Consume the newline character

            // Switch statement to handle user choice
            switch (choice) {
                case 1:
                    registerUser(scanner);
                    break;
                case 2:
                    loginUser(scanner);
                    break;
                case 3:
                    break; // Exit the loop if user chooses to quit
                default:
                    System.out.println("Invalid choice");
            }
        }
        scanner.close(); // Close the scanner to prevent resource leak
    }

    // Method to register a new user
    static void registerUser(Scanner scanner) {
        System.out.println("Enter your username:");
        String username = scanner.nextLine();
        System.out.println("Enter your password:");
        String password = scanner.nextLine();

        // Check if the username already exists
        if (users.containsKey(username)) {
            System.out.println("User already exists.");
        } else {
            // Add the new user to the HashMap
            users.put(username, password);
            System.out.println("Registration successful.");
        }
    }

    // Method to login an existing user
    static void loginUser(Scanner scanner) {
        System.out.println("Enter your username:");
        String username = scanner.nextLine();
        System.out.println("Enter your password:");
        String password = scanner.nextLine();

        // Check if the username exists in the HashMap
        if (!users.containsKey(username)) {
            System.out.println("Invalid username or password.");
        } else {
            // Check if the entered password matches the stored password for the username
            if (users.get(username).equals(password)) {
                System.out.println("Login successful.");
            } else {
                System.out.println("Invalid username or password.");
            }
        }
    }
}