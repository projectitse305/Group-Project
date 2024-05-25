
// Class representing a simple user registration form
public class FillForm {

    // Method to register a user with provided information
    static User registerUser(String firstName, String lastName, String username,
            String email, String password, String dob, String country) {
        User user = new User();
        user.setFirstName(firstName);
        user.setLastName(lastName);
        user.setUsername(username);
        user.setEmail(email);
        user.setPassword(password);
        user.setDob(dob);
        user.setCountry(country);
        return user;
    }

    // Private method to display a summary of user registration information
    private static void displaySummary(User user) {
        System.out.println("\nUser Registration Summary:");
        System.out.println("First Name: " + user.getFirstName());
        System.out.println("Last Name: " + user.getLastName());
        System.out.println("Username: " + user.getUsername());
        System.out.println("Email: " + user.getEmail());
        System.out.println("Date of Birth: " + user.getDob());
        System.out.println("Country: " + user.getCountry());
    }

    // Inner class representing a user with basic information
    static class User {
        private String firstName;
        private String lastName;
        private String username;
        private String email;
        private String password;
        private String dob;
        private String country;

        // Setters to assign values to user properties
        public void setFirstName(String firstName) {
            this.firstName = firstName;
        }

        public void setLastName(String lastName) {
            this.lastName = lastName;
        }

        public void setUsername(String username) {
            this.username = username;
        }

        public void setEmail(String email) {
            this.email = email;
        }

        public void setPassword(String password) {
            this.password = password;
        }

        public void setDob(String dob) {
            this.dob = dob;
        }

        public void setCountry(String country) {
            this.country = country;
        }

        // Getters to retrieve user information
        public String getFirstName() {
            return firstName;
        }

        public String getLastName() {
            return lastName;
        }

        public String getUsername() {
            return username;
        }

        public String getEmail() {
            return email;
        }

        public String getPassword() {
            return password;
        }

        public String getDob() {
            return dob;
        }

        public String getCountry() {
            return country;
        }
    }
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
        FillForm.User user = FillForm.registerUser(firstName, lastName, username, email, password, dob, country);

        // Display the registration summary
        FillForm.displaySummary(user);
    }
}
