public class Display {
    public static void displaySummary(User user) {
        System.out.println("\nUser Registration Summary:");
        System.out.println("First Name: " + user.getFirstName());
        System.out.println("Last Name: " + user.getLastName());
        System.out.println("Username: " + user.getUsername());
        System.out.println("Email: " + user.getEmail());
        System.out.println("Date of Birth: " + user.getDob());
        System.out.println("Country: " + user.getCountry());
    }
}
