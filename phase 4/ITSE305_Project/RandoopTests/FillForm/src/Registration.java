public class Registration {
    public static User registerUser(String firstName, String lastName, String username, String email, String password,  String dob, String country)
  {

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
    }


