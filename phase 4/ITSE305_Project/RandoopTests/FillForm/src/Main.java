public class Main {
    public static void main(String[] args) {
        // Provide the user information
        String firstName = "John";
        String lastName = "Doe";
        String username = "johndoe";
        String email = "john.doe@example.com";
        String password = "password123";
        String dob = "1990-01-01";
        String country = "United States";

        // Register the user
        User user = Registration.registerUser(firstName, lastName, username, email, password, dob, country);

        // Display the registration summary
        Display.displaySummary(user);
    }
}
