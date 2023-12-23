import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class FillFormTest {

    @Test
    public void testRegisterUser() {
        FillForm.User user = FillForm.registerUser(
                "Yousif", "Manhal", "Yousif123", "Yousif@gmail.com", "123", "19/9/2000", "Bahrain");

        assertEquals("Yousif", user.getFirstName());
        assertEquals("Manhal", user.getLastName());
        assertEquals("Yousif123", user.getUsername());
        assertEquals("Yousif@gmail.com", user.getEmail());
        assertEquals("123", user.getPassword());
        assertEquals("19/9/2000", user.getDob());
        assertEquals("Bahrain", user.getCountry());
    }

    @Test
    public void testDisplaySummary() {
        FillForm.User user = new FillForm.User();
        user.setFirstName("Yousif");
        user.setLastName("Manhal");
        user.setUsername("Yousif123");
        user.setEmail("Yousif@gmail.com");
        user.setPassword("123");
        user.setDob("19/9/2000");
        user.setCountry("Bahrain");

        System.out.println("\nUser Registration Summary:");
        System.out.println("First Name: " + user.getFirstName());
        System.out.println("Last Name: " + user.getLastName());
        System.out.println("Username: " + user.getUsername());
        System.out.println("Email: " + user.getEmail());
        System.out.println("Date of Birth: " + user.getDob());
        System.out.println("Country: " + user.getCountry());
    }
}
