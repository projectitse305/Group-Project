import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest1 {

    public static boolean debug = false;

    @Test
    public void test0501() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0501");
        User user0 = new User();
        user0.setPassword("hi!");
        user0.setPassword("");
        java.lang.String str5 = user0.getPassword();
        user0.setCountry("hi!");
        user0.setLastName("hi!");
        user0.setFirstName("");
        java.lang.String str12 = user0.getFirstName();
        java.lang.String str13 = user0.getCountry();
        java.lang.String str14 = user0.getPassword();
        user0.setEmail("");
        java.lang.String str17 = user0.getUsername();
        java.lang.String str18 = user0.getFirstName();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
    }

    @Test
    public void test0502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0502");
        User user0 = new User();
        java.lang.String str1 = user0.getPassword();
        user0.setCountry("hi!");
        java.lang.String str4 = user0.getFirstName();
        java.lang.String str5 = user0.getDob();
        java.lang.String str6 = user0.getLastName();
        user0.setFirstName("hi!");
        java.lang.String str9 = user0.getUsername();
        java.lang.String str10 = user0.getEmail();
        java.lang.String str11 = user0.getLastName();
        java.lang.String str12 = user0.getFirstName();
        user0.setDob("");
        java.lang.Class<?> wildcardClass15 = user0.getClass();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0503");
        User user0 = new User();
        java.lang.String str1 = user0.getPassword();
        java.lang.String str2 = user0.getPassword();
        user0.setUsername("");
        java.lang.String str5 = user0.getCountry();
        java.lang.String str6 = user0.getCountry();
        java.lang.String str7 = user0.getEmail();
        user0.setFirstName("hi!");
        user0.setLastName("");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test0504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0504");
        User user0 = new User();
        java.lang.String str1 = user0.getPassword();
        user0.setUsername("hi!");
        user0.setCountry("hi!");
        java.lang.String str6 = user0.getLastName();
        user0.setLastName("");
        user0.setCountry("");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test0505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0505");
        User user0 = new User();
        java.lang.String str1 = user0.getPassword();
        user0.setCountry("hi!");
        java.lang.String str4 = user0.getFirstName();
        java.lang.String str5 = user0.getDob();
        java.lang.String str6 = user0.getLastName();
        java.lang.String str7 = user0.getCountry();
        user0.setEmail("hi!");
        user0.setUsername("hi!");
        java.lang.String str12 = user0.getFirstName();
        java.lang.Class<?> wildcardClass13 = user0.getClass();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0506");
        User user0 = new User();
        user0.setPassword("hi!");
        user0.setPassword("");
        java.lang.String str5 = user0.getDob();
        user0.setEmail("");
        user0.setUsername("");
        user0.setPassword("");
        java.lang.String str12 = user0.getCountry();
        java.lang.Class<?> wildcardClass13 = user0.getClass();
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0507");
        User user0 = new User();
        java.lang.String str1 = user0.getPassword();
        user0.setUsername("hi!");
        user0.setFirstName("");
        java.lang.String str6 = user0.getPassword();
        user0.setUsername("hi!");
        user0.setPassword("hi!");
        java.lang.Class<?> wildcardClass11 = user0.getClass();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0508");
        User user0 = new User();
        user0.setPassword("hi!");
        user0.setPassword("");
        java.lang.String str5 = user0.getPassword();
        java.lang.String str6 = user0.getEmail();
        user0.setCountry("hi!");
        java.lang.String str9 = user0.getDob();
        user0.setEmail("");
        java.lang.String str12 = user0.getDob();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test0509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0509");
        User user0 = new User();
        java.lang.String str1 = user0.getPassword();
        user0.setCountry("hi!");
        java.lang.String str4 = user0.getFirstName();
        user0.setLastName("hi!");
        user0.setDob("hi!");
        java.lang.String str9 = user0.getFirstName();
        user0.setCountry("");
        user0.setEmail("");
        user0.setPassword("");
        user0.setLastName("hi!");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test0510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0510");
        User user0 = new User();
        java.lang.String str1 = user0.getPassword();
        java.lang.String str2 = user0.getUsername();
        java.lang.String str3 = user0.getEmail();
        user0.setFirstName("");
        user0.setLastName("hi!");
        java.lang.String str8 = user0.getFirstName();
        user0.setDob("");
        java.lang.String str11 = user0.getEmail();
        user0.setCountry("hi!");
        java.lang.String str14 = user0.getEmail();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str14);
    }

    @Test
    public void test0511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0511");
        User user0 = new User();
        java.lang.String str1 = user0.getPassword();
        user0.setUsername("hi!");
        user0.setCountry("hi!");
        java.lang.String str6 = user0.getLastName();
        user0.setLastName("");
        user0.setPassword("");
        user0.setFirstName("");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test0512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0512");
        User user0 = new User();
        java.lang.String str1 = user0.getPassword();
        user0.setCountry("hi!");
        java.lang.String str4 = user0.getPassword();
        java.lang.String str5 = user0.getPassword();
        user0.setCountry("");
        user0.setDob("hi!");
        java.lang.String str10 = user0.getEmail();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test0513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0513");
        User user0 = new User();
        java.lang.String str1 = user0.getPassword();
        java.lang.String str2 = user0.getUsername();
        java.lang.String str3 = user0.getEmail();
        user0.setFirstName("");
        user0.setLastName("hi!");
        java.lang.String str8 = user0.getFirstName();
        java.lang.String str9 = user0.getUsername();
        java.lang.String str10 = user0.getDob();
        java.lang.String str11 = user0.getCountry();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test0514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0514");
        User user0 = new User();
        java.lang.String str1 = user0.getPassword();
        java.lang.String str2 = user0.getPassword();
        java.lang.String str3 = user0.getFirstName();
        user0.setDob("hi!");
        java.lang.String str6 = user0.getEmail();
        user0.setPassword("hi!");
        user0.setDob("");
        java.lang.String str11 = user0.getCountry();
        java.lang.String str12 = user0.getUsername();
        user0.setPassword("");
        user0.setDob("");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test0515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0515");
        User user0 = new User();
        java.lang.String str1 = user0.getPassword();
        java.lang.String str2 = user0.getUsername();
        java.lang.String str3 = user0.getEmail();
        user0.setUsername("");
        user0.setDob("hi!");
        java.lang.String str8 = user0.getCountry();
        java.lang.String str9 = user0.getLastName();
        java.lang.String str10 = user0.getDob();
        user0.setPassword("hi!");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
    }

    @Test
    public void test0516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0516");
        User user0 = new User();
        java.lang.String str1 = user0.getPassword();
        user0.setCountry("hi!");
        java.lang.String str4 = user0.getFirstName();
        user0.setLastName("hi!");
        user0.setDob("hi!");
        java.lang.String str9 = user0.getFirstName();
        user0.setLastName("hi!");
        user0.setCountry("");
        java.lang.String str14 = user0.getEmail();
        java.lang.String str15 = user0.getDob();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
    }

    @Test
    public void test0517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0517");
        User user0 = new User();
        java.lang.String str1 = user0.getPassword();
        user0.setCountry("hi!");
        java.lang.String str4 = user0.getFirstName();
        user0.setLastName("hi!");
        user0.setDob("hi!");
        java.lang.String str9 = user0.getFirstName();
        java.lang.String str10 = user0.getDob();
        java.lang.String str11 = user0.getCountry();
        user0.setDob("");
        user0.setFirstName("");
        java.lang.String str16 = user0.getEmail();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertNull(str16);
    }

    @Test
    public void test0518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0518");
        User user0 = new User();
        java.lang.String str1 = user0.getPassword();
        user0.setCountry("hi!");
        java.lang.String str4 = user0.getFirstName();
        java.lang.String str5 = user0.getDob();
        java.lang.String str6 = user0.getLastName();
        user0.setLastName("");
        user0.setDob("hi!");
        java.lang.String str11 = user0.getEmail();
        user0.setLastName("hi!");
        user0.setUsername("hi!");
        java.lang.String str16 = user0.getFirstName();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str16);
    }

    @Test
    public void test0519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0519");
        User user0 = new User();
        java.lang.String str1 = user0.getFirstName();
        java.lang.String str2 = user0.getCountry();
        user0.setFirstName("");
        user0.setUsername("");
        user0.setFirstName("hi!");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
    }

    @Test
    public void test0520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0520");
        User user0 = new User();
        java.lang.String str1 = user0.getPassword();
        java.lang.String str2 = user0.getUsername();
        java.lang.String str3 = user0.getCountry();
        user0.setEmail("hi!");
        java.lang.String str6 = user0.getPassword();
        java.lang.String str7 = user0.getEmail();
        user0.setCountry("hi!");
        java.lang.String str10 = user0.getLastName();
        user0.setEmail("");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test0521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0521");
        User user0 = new User();
        java.lang.String str1 = user0.getFirstName();
        java.lang.String str2 = user0.getCountry();
        java.lang.String str3 = user0.getFirstName();
        user0.setCountry("hi!");
        user0.setUsername("hi!");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test0522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0522");
        User user0 = new User();
        java.lang.String str1 = user0.getPassword();
        user0.setUsername("hi!");
        user0.setCountry("hi!");
        user0.setFirstName("");
        user0.setCountry("");
        java.lang.String str10 = user0.getPassword();
        user0.setUsername("hi!");
        user0.setCountry("hi!");
        java.lang.String str15 = user0.getEmail();
        user0.setEmail("hi!");
        java.lang.String str18 = user0.getCountry();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
    }

    @Test
    public void test0523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0523");
        User user0 = new User();
        java.lang.String str1 = user0.getPassword();
        user0.setCountry("hi!");
        java.lang.String str4 = user0.getFirstName();
        java.lang.String str5 = user0.getDob();
        java.lang.String str6 = user0.getLastName();
        user0.setFirstName("hi!");
        user0.setEmail("hi!");
        user0.setLastName("");
        java.lang.String str13 = user0.getPassword();
        user0.setUsername("");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str13);
    }

    @Test
    public void test0524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0524");
        User user0 = new User();
        java.lang.String str1 = user0.getPassword();
        user0.setCountry("hi!");
        java.lang.String str4 = user0.getPassword();
        user0.setFirstName("");
        user0.setPassword("hi!");
        java.lang.String str9 = user0.getLastName();
        user0.setPassword("hi!");
        java.lang.String str12 = user0.getDob();
        java.lang.String str13 = user0.getDob();
        java.lang.String str14 = user0.getCountry();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
    }

    @Test
    public void test0525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0525");
        User user0 = new User();
        java.lang.String str1 = user0.getPassword();
        user0.setCountry("hi!");
        user0.setLastName("");
        user0.setEmail("hi!");
        java.lang.String str8 = user0.getPassword();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test0526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0526");
        User user0 = new User();
        java.lang.String str1 = user0.getPassword();
        user0.setUsername("hi!");
        user0.setFirstName("");
        java.lang.String str6 = user0.getPassword();
        user0.setUsername("hi!");
        java.lang.String str9 = user0.getFirstName();
        user0.setEmail("");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test0527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0527");
        User user0 = new User();
        java.lang.String str1 = user0.getPassword();
        user0.setCountry("hi!");
        java.lang.String str4 = user0.getPassword();
        user0.setCountry("");
        user0.setUsername("");
        java.lang.String str9 = user0.getEmail();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test0528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0528");
        User user0 = new User();
        java.lang.String str1 = user0.getPassword();
        java.lang.String str2 = user0.getUsername();
        java.lang.String str3 = user0.getCountry();
        user0.setEmail("hi!");
        java.lang.String str6 = user0.getPassword();
        java.lang.String str7 = user0.getEmail();
        user0.setLastName("hi!");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
    }

    @Test
    public void test0529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0529");
        User user0 = new User();
        user0.setPassword("hi!");
        user0.setPassword("");
        java.lang.String str5 = user0.getPassword();
        user0.setCountry("hi!");
        user0.setLastName("hi!");
        java.lang.String str10 = user0.getFirstName();
        java.lang.String str11 = user0.getLastName();
        java.lang.String str12 = user0.getEmail();
        java.lang.Class<?> wildcardClass13 = user0.getClass();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0530");
        User user0 = new User();
        user0.setPassword("hi!");
        user0.setPassword("");
        java.lang.String str5 = user0.getPassword();
        user0.setCountry("hi!");
        user0.setLastName("hi!");
        java.lang.String str10 = user0.getFirstName();
        user0.setEmail("hi!");
        java.lang.String str13 = user0.getFirstName();
        java.lang.String str14 = user0.getCountry();
        java.lang.Class<?> wildcardClass15 = user0.getClass();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0531");
        User user0 = new User();
        java.lang.String str1 = user0.getPassword();
        user0.setCountry("hi!");
        java.lang.String str4 = user0.getFirstName();
        java.lang.String str5 = user0.getDob();
        java.lang.String str6 = user0.getLastName();
        user0.setFirstName("hi!");
        user0.setUsername("");
        user0.setCountry("");
        user0.setPassword("");
        user0.setUsername("");
        java.lang.String str17 = user0.getEmail();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str17);
    }

    @Test
    public void test0532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0532");
        User user0 = new User();
        user0.setLastName("");
        java.lang.String str3 = user0.getCountry();
        java.lang.String str4 = user0.getDob();
        user0.setCountry("");
        java.lang.String str7 = user0.getLastName();
        java.lang.Class<?> wildcardClass8 = user0.getClass();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0533");
        User user0 = new User();
        java.lang.String str1 = user0.getPassword();
        user0.setUsername("hi!");
        user0.setFirstName("");
        java.lang.String str6 = user0.getPassword();
        user0.setEmail("hi!");
        user0.setCountry("hi!");
        user0.setLastName("");
        java.lang.String str13 = user0.getCountry();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
    }

    @Test
    public void test0534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0534");
        User user0 = new User();
        java.lang.String str1 = user0.getPassword();
        java.lang.String str2 = user0.getPassword();
        user0.setUsername("");
        java.lang.String str5 = user0.getCountry();
        user0.setUsername("");
        user0.setEmail("");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str5);
    }

    @Test
    public void test0535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0535");
        User user0 = new User();
        user0.setPassword("hi!");
        user0.setPassword("");
        java.lang.String str5 = user0.getPassword();
        user0.setFirstName("");
        user0.setLastName("");
        user0.setPassword("hi!");
        user0.setEmail("");
        user0.setPassword("hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
    }

    @Test
    public void test0536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0536");
        User user0 = new User();
        java.lang.String str1 = user0.getPassword();
        user0.setCountry("hi!");
        user0.setUsername("hi!");
        user0.setCountry("");
        java.lang.String str8 = user0.getFirstName();
        user0.setPassword("");
        java.lang.String str11 = user0.getLastName();
        user0.setUsername("");
        java.lang.Class<?> wildcardClass14 = user0.getClass();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0537");
        User user0 = new User();
        java.lang.String str1 = user0.getPassword();
        user0.setUsername("hi!");
        user0.setFirstName("");
        java.lang.String str6 = user0.getPassword();
        user0.setEmail("hi!");
        user0.setCountry("hi!");
        user0.setEmail("hi!");
        user0.setCountry("hi!");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test0538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0538");
        User user0 = new User();
        java.lang.String str1 = user0.getPassword();
        user0.setCountry("hi!");
        java.lang.String str4 = user0.getUsername();
        user0.setPassword("");
        user0.setFirstName("");
        java.lang.String str9 = user0.getUsername();
        java.lang.String str10 = user0.getCountry();
        user0.setEmail("hi!");
        java.lang.String str13 = user0.getDob();
        java.lang.String str14 = user0.getPassword();
        java.lang.String str15 = user0.getCountry();
        java.lang.String str16 = user0.getFirstName();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
    }

    @Test
    public void test0539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0539");
        User user0 = new User();
        java.lang.String str1 = user0.getPassword();
        user0.setCountry("hi!");
        java.lang.String str4 = user0.getFirstName();
        java.lang.String str5 = user0.getDob();
        java.lang.String str6 = user0.getLastName();
        user0.setFirstName("hi!");
        user0.setDob("hi!");
        user0.setUsername("");
        java.lang.String str13 = user0.getLastName();
        user0.setDob("");
        java.lang.String str16 = user0.getLastName();
        user0.setDob("");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(str16);
    }

    @Test
    public void test0540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0540");
        User user0 = new User();
        java.lang.String str1 = user0.getPassword();
        user0.setUsername("");
        user0.setLastName("");
        user0.setEmail("hi!");
        user0.setPassword("hi!");
        java.lang.String str10 = user0.getUsername();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test0541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0541");
        User user0 = new User();
        java.lang.String str1 = user0.getPassword();
        user0.setCountry("hi!");
        java.lang.String str4 = user0.getFirstName();
        java.lang.String str5 = user0.getDob();
        java.lang.String str6 = user0.getLastName();
        user0.setFirstName("hi!");
        user0.setUsername("");
        user0.setCountry("");
        user0.setPassword("");
        java.lang.String str15 = user0.getUsername();
        java.lang.String str16 = user0.getUsername();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
    }

    @Test
    public void test0542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0542");
        User user0 = new User();
        java.lang.String str1 = user0.getPassword();
        user0.setCountry("hi!");
        java.lang.String str4 = user0.getPassword();
        java.lang.String str5 = user0.getDob();
        user0.setCountry("");
        user0.setPassword("");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
    }

    @Test
    public void test0543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0543");
        User user0 = new User();
        java.lang.String str1 = user0.getPassword();
        user0.setCountry("hi!");
        java.lang.String str4 = user0.getFirstName();
        java.lang.String str5 = user0.getDob();
        java.lang.String str6 = user0.getLastName();
        user0.setFirstName("hi!");
        user0.setUsername("");
        user0.setCountry("");
        user0.setPassword("");
        java.lang.String str15 = user0.getUsername();
        java.lang.Class<?> wildcardClass16 = user0.getClass();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0544");
        User user0 = new User();
        java.lang.String str1 = user0.getPassword();
        java.lang.String str2 = user0.getPassword();
        java.lang.String str3 = user0.getPassword();
        user0.setLastName("");
        user0.setUsername("hi!");
        user0.setUsername("");
        user0.setUsername("");
        user0.setFirstName("");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test0545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0545");
        User user0 = new User();
        java.lang.String str1 = user0.getPassword();
        user0.setCountry("hi!");
        java.lang.String str4 = user0.getFirstName();
        user0.setLastName("hi!");
        user0.setDob("hi!");
        java.lang.String str9 = user0.getFirstName();
        user0.setCountry("");
        user0.setLastName("hi!");
        user0.setPassword("");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test0546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0546");
        User user0 = new User();
        java.lang.String str1 = user0.getPassword();
        java.lang.String str2 = user0.getUsername();
        java.lang.String str3 = user0.getCountry();
        user0.setPassword("");
        java.lang.String str6 = user0.getPassword();
        java.lang.String str7 = user0.getFirstName();
        user0.setFirstName("");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test0547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0547");
        User user0 = new User();
        java.lang.String str1 = user0.getPassword();
        java.lang.String str2 = user0.getUsername();
        java.lang.String str3 = user0.getEmail();
        user0.setFirstName("");
        user0.setFirstName("hi!");
        java.lang.Class<?> wildcardClass8 = user0.getClass();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0548");
        User user0 = new User();
        java.lang.String str1 = user0.getPassword();
        java.lang.String str2 = user0.getUsername();
        java.lang.String str3 = user0.getEmail();
        user0.setFirstName("");
        user0.setLastName("hi!");
        user0.setUsername("hi!");
        user0.setEmail("");
        java.lang.Class<?> wildcardClass12 = user0.getClass();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0549");
        User user0 = new User();
        user0.setPassword("hi!");
        user0.setPassword("");
        java.lang.String str5 = user0.getPassword();
        user0.setCountry("hi!");
        user0.setLastName("hi!");
        user0.setFirstName("");
        java.lang.String str12 = user0.getPassword();
        user0.setEmail("");
        user0.setLastName("hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test0550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0550");
        User user0 = new User();
        java.lang.String str1 = user0.getPassword();
        java.lang.String str2 = user0.getUsername();
        java.lang.String str3 = user0.getCountry();
        user0.setPassword("");
        java.lang.String str6 = user0.getPassword();
        java.lang.String str7 = user0.getFirstName();
        java.lang.Class<?> wildcardClass8 = user0.getClass();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0551");
        User user0 = new User();
        java.lang.String str1 = user0.getPassword();
        user0.setCountry("hi!");
        java.lang.String str4 = user0.getPassword();
        java.lang.String str5 = user0.getDob();
        java.lang.String str6 = user0.getCountry();
        java.lang.String str7 = user0.getUsername();
        java.lang.String str8 = user0.getUsername();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test0552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0552");
        User user0 = new User();
        user0.setCountry("hi!");
    }

    @Test
    public void test0553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0553");
        User user0 = new User();
        java.lang.String str1 = user0.getPassword();
        java.lang.String str2 = user0.getUsername();
        java.lang.String str3 = user0.getEmail();
        user0.setUsername("");
        java.lang.String str6 = user0.getPassword();
        java.lang.String str7 = user0.getDob();
        user0.setLastName("hi!");
        user0.setDob("");
        user0.setDob("");
        java.lang.String str14 = user0.getEmail();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str14);
    }

    @Test
    public void test0554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0554");
        User user0 = new User();
        java.lang.String str1 = user0.getPassword();
        user0.setCountry("hi!");
        java.lang.String str4 = user0.getPassword();
        java.lang.String str5 = user0.getPassword();
        java.lang.String str6 = user0.getFirstName();
        java.lang.String str7 = user0.getCountry();
        user0.setEmail("hi!");
        java.lang.String str10 = user0.getLastName();
        user0.setUsername("");
        java.lang.String str13 = user0.getFirstName();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str13);
    }

    @Test
    public void test0555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0555");
        User user0 = new User();
        user0.setPassword("hi!");
        user0.setPassword("");
        java.lang.String str5 = user0.getFirstName();
        user0.setLastName("hi!");
        user0.setFirstName("");
        java.lang.String str10 = user0.getDob();
        java.lang.String str11 = user0.getFirstName();
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test0556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0556");
        User user0 = new User();
        user0.setPassword("hi!");
        user0.setPassword("");
        java.lang.String str5 = user0.getDob();
        user0.setEmail("");
        user0.setUsername("");
        user0.setPassword("");
        user0.setLastName("");
        java.lang.String str14 = user0.getCountry();
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str14);
    }

    @Test
    public void test0557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0557");
        User user0 = new User();
        java.lang.String str1 = user0.getPassword();
        user0.setCountry("hi!");
        java.lang.String str4 = user0.getFirstName();
        java.lang.String str5 = user0.getDob();
        java.lang.String str6 = user0.getLastName();
        user0.setFirstName("hi!");
        user0.setDob("hi!");
        user0.setLastName("");
        java.lang.String str13 = user0.getFirstName();
        user0.setCountry("hi!");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
    }

    @Test
    public void test0558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0558");
        User user0 = new User();
        java.lang.String str1 = user0.getPassword();
        java.lang.String str2 = user0.getPassword();
        java.lang.String str3 = user0.getFirstName();
        user0.setDob("hi!");
        java.lang.String str6 = user0.getEmail();
        user0.setPassword("hi!");
        user0.setDob("");
        java.lang.String str11 = user0.getCountry();
        user0.setFirstName("");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test0559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0559");
        User user0 = new User();
        java.lang.String str1 = user0.getPassword();
        user0.setCountry("hi!");
        java.lang.String str4 = user0.getFirstName();
        java.lang.String str5 = user0.getDob();
        java.lang.String str6 = user0.getLastName();
        user0.setFirstName("hi!");
        user0.setDob("hi!");
        user0.setUsername("");
        java.lang.String str13 = user0.getLastName();
        java.lang.String str14 = user0.getLastName();
        java.lang.String str15 = user0.getUsername();
        user0.setEmail("hi!");
        java.lang.String str18 = user0.getEmail();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
    }

    @Test
    public void test0560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0560");
        User user0 = new User();
        java.lang.String str1 = user0.getPassword();
        user0.setCountry("hi!");
        java.lang.String str4 = user0.getFirstName();
        user0.setLastName("hi!");
        user0.setDob("hi!");
        java.lang.String str9 = user0.getFirstName();
        user0.setPassword("");
        java.lang.String str12 = user0.getCountry();
        user0.setDob("");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
    }

    @Test
    public void test0561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0561");
        User user0 = new User();
        java.lang.String str1 = user0.getPassword();
        user0.setCountry("hi!");
        java.lang.String str4 = user0.getPassword();
        user0.setFirstName("");
        user0.setPassword("hi!");
        java.lang.String str9 = user0.getLastName();
        user0.setPassword("hi!");
        java.lang.String str12 = user0.getDob();
        java.lang.String str13 = user0.getCountry();
        java.lang.String str14 = user0.getLastName();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertNull(str14);
    }

    @Test
    public void test0562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0562");
        User user0 = new User();
        java.lang.String str1 = user0.getPassword();
        java.lang.String str2 = user0.getUsername();
        java.lang.String str3 = user0.getEmail();
        user0.setFirstName("");
        user0.setLastName("hi!");
        java.lang.String str8 = user0.getFirstName();
        java.lang.String str9 = user0.getUsername();
        java.lang.String str10 = user0.getDob();
        java.lang.String str11 = user0.getEmail();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test0563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0563");
        User user0 = new User();
        java.lang.String str1 = user0.getPassword();
        java.lang.String str2 = user0.getUsername();
        java.lang.String str3 = user0.getEmail();
        user0.setUsername("");
        java.lang.String str6 = user0.getDob();
        java.lang.String str7 = user0.getLastName();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test0564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0564");
        User user0 = new User();
        java.lang.String str1 = user0.getPassword();
        user0.setCountry("hi!");
        java.lang.String str4 = user0.getFirstName();
        user0.setLastName("hi!");
        user0.setDob("hi!");
        java.lang.String str9 = user0.getLastName();
        user0.setFirstName("");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
    }

    @Test
    public void test0565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0565");
        User user0 = new User();
        java.lang.String str1 = user0.getPassword();
        java.lang.String str2 = user0.getUsername();
        java.lang.String str3 = user0.getEmail();
        user0.setUsername("");
        java.lang.String str6 = user0.getFirstName();
        java.lang.String str7 = user0.getUsername();
        java.lang.String str8 = user0.getCountry();
        java.lang.String str9 = user0.getFirstName();
        java.lang.String str10 = user0.getPassword();
        user0.setPassword("hi!");
        user0.setLastName("");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test0566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0566");
        User user0 = new User();
        java.lang.String str1 = user0.getPassword();
        user0.setCountry("hi!");
        java.lang.String str4 = user0.getFirstName();
        java.lang.String str5 = user0.getFirstName();
        java.lang.String str6 = user0.getLastName();
        java.lang.String str7 = user0.getLastName();
        user0.setCountry("hi!");
        user0.setDob("hi!");
        user0.setFirstName("");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test0567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0567");
        User user0 = new User();
        java.lang.String str1 = user0.getPassword();
        java.lang.String str2 = user0.getUsername();
        java.lang.String str3 = user0.getEmail();
        user0.setUsername("");
        java.lang.String str6 = user0.getFirstName();
        java.lang.String str7 = user0.getUsername();
        user0.setPassword("");
        java.lang.String str10 = user0.getPassword();
        java.lang.String str11 = user0.getFirstName();
        java.lang.String str12 = user0.getUsername();
        user0.setPassword("hi!");
        java.lang.String str15 = user0.getCountry();
        user0.setPassword("");
        user0.setFirstName("hi!");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNull(str15);
    }

    @Test
    public void test0568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0568");
        User user0 = new User();
        java.lang.String str1 = user0.getPassword();
        user0.setCountry("hi!");
        java.lang.String str4 = user0.getFirstName();
        user0.setLastName("hi!");
        user0.setDob("hi!");
        java.lang.String str9 = user0.getFirstName();
        user0.setPassword("");
        java.lang.String str12 = user0.getCountry();
        java.lang.String str13 = user0.getLastName();
        user0.setFirstName("hi!");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
    }

    @Test
    public void test0569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0569");
        User user0 = new User();
        java.lang.String str1 = user0.getPassword();
        user0.setCountry("hi!");
        java.lang.String str4 = user0.getFirstName();
        java.lang.String str5 = user0.getDob();
        java.lang.String str6 = user0.getLastName();
        user0.setFirstName("hi!");
        java.lang.String str9 = user0.getUsername();
        user0.setPassword("");
        user0.setCountry("hi!");
        user0.setLastName("");
        java.lang.String str16 = user0.getEmail();
        user0.setCountry("");
        java.lang.String str19 = user0.getPassword();
        java.lang.String str20 = user0.getCountry();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
    }

    @Test
    public void test0570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0570");
        User user0 = new User();
        java.lang.String str1 = user0.getFirstName();
        user0.setPassword("");
        java.lang.String str4 = user0.getUsername();
        user0.setLastName("");
        user0.setCountry("hi!");
        java.lang.String str9 = user0.getEmail();
        java.lang.String str10 = user0.getFirstName();
        java.lang.Class<?> wildcardClass11 = user0.getClass();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0571");
        User user0 = new User();
        java.lang.String str1 = user0.getPassword();
        user0.setCountry("hi!");
        user0.setEmail("");
        org.junit.Assert.assertNull(str1);
    }

    @Test
    public void test0572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0572");
        User user0 = new User();
        java.lang.String str1 = user0.getPassword();
        user0.setUsername("");
        user0.setLastName("");
        user0.setPassword("");
        java.lang.Class<?> wildcardClass8 = user0.getClass();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0573");
        User user0 = new User();
        java.lang.String str1 = user0.getPassword();
        user0.setCountry("hi!");
        java.lang.String str4 = user0.getFirstName();
        java.lang.String str5 = user0.getFirstName();
        java.lang.String str6 = user0.getLastName();
        java.lang.String str7 = user0.getLastName();
        user0.setCountry("hi!");
        user0.setDob("hi!");
        java.lang.String str12 = user0.getDob();
        user0.setPassword("hi!");
        java.lang.String str15 = user0.getEmail();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertNull(str15);
    }

    @Test
    public void test0574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0574");
        User user0 = new User();
        java.lang.String str1 = user0.getPassword();
        user0.setCountry("hi!");
        user0.setUsername("hi!");
        user0.setCountry("");
        java.lang.String str8 = user0.getFirstName();
        user0.setPassword("");
        java.lang.String str11 = user0.getLastName();
        user0.setUsername("");
        user0.setCountry("hi!");
        java.lang.String str16 = user0.getEmail();
        java.lang.String str17 = user0.getDob();
        user0.setUsername("hi!");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNull(str17);
    }

    @Test
    public void test0575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0575");
        User user0 = new User();
        java.lang.String str1 = user0.getPassword();
        user0.setCountry("hi!");
        java.lang.String str4 = user0.getFirstName();
        user0.setLastName("hi!");
        user0.setDob("hi!");
        java.lang.String str9 = user0.getEmail();
        user0.setLastName("");
        java.lang.String str12 = user0.getDob();
        user0.setFirstName("");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
    }

    @Test
    public void test0576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0576");
        User user0 = new User();
        java.lang.String str1 = user0.getPassword();
        java.lang.String str2 = user0.getUsername();
        java.lang.String str3 = user0.getCountry();
        user0.setEmail("hi!");
        java.lang.String str6 = user0.getPassword();
        java.lang.String str7 = user0.getEmail();
        java.lang.String str8 = user0.getFirstName();
        user0.setFirstName("");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test0577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0577");
        User user0 = new User();
        java.lang.String str1 = user0.getPassword();
        user0.setCountry("hi!");
        java.lang.String str4 = user0.getPassword();
        user0.setFirstName("");
        user0.setLastName("hi!");
        java.lang.String str9 = user0.getEmail();
        user0.setPassword("");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test0578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0578");
        User user0 = new User();
        java.lang.String str1 = user0.getPassword();
        user0.setCountry("hi!");
        java.lang.String str4 = user0.getFirstName();
        user0.setLastName("hi!");
        user0.setDob("hi!");
        java.lang.String str9 = user0.getFirstName();
        java.lang.String str10 = user0.getDob();
        java.lang.String str11 = user0.getLastName();
        java.lang.String str12 = user0.getLastName();
        java.lang.String str13 = user0.getUsername();
        user0.setFirstName("hi!");
        java.lang.String str16 = user0.getFirstName();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
    }

    @Test
    public void test0579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0579");
        User user0 = new User();
        user0.setPassword("hi!");
        user0.setPassword("");
        java.lang.String str5 = user0.getDob();
        user0.setEmail("");
        user0.setUsername("");
        user0.setFirstName("hi!");
        user0.setFirstName("");
        user0.setEmail("");
        java.lang.String str16 = user0.getEmail();
        user0.setDob("");
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
    }

    @Test
    public void test0580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0580");
        User user0 = new User();
        user0.setLastName("");
        user0.setDob("hi!");
        user0.setCountry("");
        java.lang.String str7 = user0.getCountry();
        user0.setUsername("hi!");
        user0.setEmail("hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test0581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0581");
        User user0 = new User();
        user0.setPassword("hi!");
        user0.setPassword("");
        java.lang.String str5 = user0.getPassword();
        java.lang.String str6 = user0.getEmail();
        user0.setFirstName("hi!");
        java.lang.String str9 = user0.getCountry();
        java.lang.String str10 = user0.getDob();
        java.lang.String str11 = user0.getCountry();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test0582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0582");
        User user0 = new User();
        java.lang.String str1 = user0.getPassword();
        user0.setCountry("hi!");
        java.lang.String str4 = user0.getFirstName();
        java.lang.String str5 = user0.getDob();
        java.lang.String str6 = user0.getLastName();
        user0.setFirstName("hi!");
        user0.setEmail("hi!");
        user0.setDob("");
        java.lang.String str13 = user0.getLastName();
        java.lang.String str14 = user0.getFirstName();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
    }

    @Test
    public void test0583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0583");
        User user0 = new User();
        java.lang.String str1 = user0.getPassword();
        java.lang.String str2 = user0.getUsername();
        user0.setDob("");
        java.lang.String str5 = user0.getEmail();
        java.lang.String str6 = user0.getCountry();
        java.lang.String str7 = user0.getPassword();
        user0.setUsername("hi!");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test0584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0584");
        User user0 = new User();
        java.lang.String str1 = user0.getPassword();
        java.lang.String str2 = user0.getLastName();
        java.lang.String str3 = user0.getDob();
        user0.setLastName("");
        user0.setLastName("hi!");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test0585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0585");
        User user0 = new User();
        java.lang.String str1 = user0.getPassword();
        java.lang.String str2 = user0.getPassword();
        user0.setUsername("");
        java.lang.String str5 = user0.getCountry();
        java.lang.String str6 = user0.getDob();
        java.lang.String str7 = user0.getFirstName();
        java.lang.String str8 = user0.getEmail();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test0586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0586");
        User user0 = new User();
        java.lang.String str1 = user0.getPassword();
        java.lang.String str2 = user0.getUsername();
        java.lang.String str3 = user0.getEmail();
        user0.setFirstName("");
        user0.setUsername("");
        user0.setUsername("");
        java.lang.String str10 = user0.getLastName();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test0587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0587");
        User user0 = new User();
        user0.setPassword("hi!");
        user0.setPassword("");
        java.lang.String str5 = user0.getDob();
        user0.setEmail("");
        user0.setUsername("");
        user0.setPassword("");
        java.lang.Class<?> wildcardClass12 = user0.getClass();
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0588");
        User user0 = new User();
        java.lang.String str1 = user0.getPassword();
        java.lang.String str2 = user0.getUsername();
        java.lang.String str3 = user0.getEmail();
        user0.setFirstName("");
        java.lang.String str6 = user0.getCountry();
        java.lang.String str7 = user0.getLastName();
        java.lang.String str8 = user0.getLastName();
        user0.setFirstName("");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test0589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0589");
        User user0 = new User();
        user0.setPassword("hi!");
        java.lang.String str3 = user0.getPassword();
        java.lang.String str4 = user0.getPassword();
        user0.setFirstName("hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
    }

    @Test
    public void test0590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0590");
        User user0 = new User();
        user0.setPassword("hi!");
        user0.setPassword("");
        java.lang.String str5 = user0.getPassword();
        java.lang.String str6 = user0.getEmail();
        java.lang.String str7 = user0.getEmail();
        java.lang.String str8 = user0.getLastName();
        user0.setFirstName("");
        java.lang.String str11 = user0.getLastName();
        java.lang.String str12 = user0.getDob();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test0591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0591");
        User user0 = new User();
        user0.setPassword("hi!");
        user0.setPassword("");
        java.lang.String str5 = user0.getPassword();
        java.lang.String str6 = user0.getEmail();
        user0.setCountry("hi!");
        java.lang.String str9 = user0.getDob();
        user0.setDob("hi!");
        user0.setUsername("hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test0592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0592");
        User user0 = new User();
        java.lang.String str1 = user0.getFirstName();
        user0.setPassword("");
        user0.setEmail("hi!");
        user0.setCountry("");
        java.lang.String str8 = user0.getUsername();
        user0.setUsername("hi!");
        user0.setLastName("");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test0593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0593");
        User user0 = new User();
        java.lang.String str1 = user0.getPassword();
        user0.setCountry("hi!");
        java.lang.String str4 = user0.getFirstName();
        java.lang.String str5 = user0.getDob();
        java.lang.String str6 = user0.getLastName();
        user0.setFirstName("hi!");
        user0.setDob("hi!");
        user0.setUsername("");
        java.lang.String str13 = user0.getLastName();
        user0.setPassword("");
        user0.setCountry("hi!");
        user0.setEmail("");
        user0.setUsername("");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str13);
    }

    @Test
    public void test0594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0594");
        User user0 = new User();
        java.lang.String str1 = user0.getPassword();
        java.lang.String str2 = user0.getUsername();
        java.lang.String str3 = user0.getEmail();
        user0.setFirstName("");
        user0.setLastName("hi!");
        java.lang.String str8 = user0.getFirstName();
        user0.setDob("");
        java.lang.String str11 = user0.getEmail();
        java.lang.String str12 = user0.getPassword();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test0595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0595");
        User user0 = new User();
        java.lang.String str1 = user0.getPassword();
        user0.setCountry("hi!");
        java.lang.String str4 = user0.getFirstName();
        java.lang.String str5 = user0.getDob();
        java.lang.String str6 = user0.getLastName();
        user0.setFirstName("hi!");
        user0.setDob("hi!");
        user0.setUsername("");
        java.lang.String str13 = user0.getLastName();
        user0.setLastName("");
        user0.setLastName("hi!");
        java.lang.String str18 = user0.getLastName();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
    }

    @Test
    public void test0596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0596");
        User user0 = new User();
        java.lang.String str1 = user0.getPassword();
        java.lang.String str2 = user0.getPassword();
        java.lang.String str3 = user0.getPassword();
        java.lang.String str4 = user0.getDob();
        user0.setPassword("");
        java.lang.Class<?> wildcardClass7 = user0.getClass();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0597");
        User user0 = new User();
        java.lang.String str1 = user0.getPassword();
        java.lang.String str2 = user0.getUsername();
        java.lang.String str3 = user0.getEmail();
        user0.setFirstName("");
        java.lang.String str6 = user0.getCountry();
        java.lang.String str7 = user0.getLastName();
        java.lang.String str8 = user0.getEmail();
        java.lang.String str9 = user0.getLastName();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test0598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0598");
        User user0 = new User();
        user0.setPassword("hi!");
        user0.setPassword("");
        java.lang.String str5 = user0.getPassword();
        user0.setFirstName("");
        java.lang.String str8 = user0.getUsername();
        java.lang.String str9 = user0.getFirstName();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test0599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0599");
        User user0 = new User();
        java.lang.String str1 = user0.getPassword();
        java.lang.String str2 = user0.getPassword();
        user0.setLastName("hi!");
        java.lang.String str5 = user0.getCountry();
        user0.setLastName("hi!");
        java.lang.String str8 = user0.getDob();
        user0.setDob("");
        user0.setEmail("");
        user0.setLastName("");
        user0.setUsername("hi!");
        java.lang.Class<?> wildcardClass17 = user0.getClass();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test0600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0600");
        User user0 = new User();
        java.lang.String str1 = user0.getPassword();
        java.lang.String str2 = user0.getUsername();
        java.lang.String str3 = user0.getEmail();
        user0.setUsername("");
        java.lang.String str6 = user0.getFirstName();
        java.lang.String str7 = user0.getUsername();
        java.lang.String str8 = user0.getCountry();
        java.lang.String str9 = user0.getEmail();
        java.lang.String str10 = user0.getFirstName();
        user0.setUsername("");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test0601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0601");
        User user0 = new User();
        user0.setPassword("hi!");
        user0.setPassword("");
        java.lang.String str5 = user0.getPassword();
        user0.setCountry("hi!");
        java.lang.String str8 = user0.getPassword();
        java.lang.String str9 = user0.getDob();
        user0.setCountry("hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test0602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0602");
        User user0 = new User();
        java.lang.String str1 = user0.getPassword();
        user0.setCountry("hi!");
        java.lang.String str4 = user0.getPassword();
        user0.setFirstName("");
        user0.setLastName("hi!");
        user0.setPassword("");
        user0.setDob("hi!");
        java.lang.String str13 = user0.getFirstName();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test0603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0603");
        User user0 = new User();
        java.lang.String str1 = user0.getPassword();
        user0.setCountry("hi!");
        user0.setUsername("hi!");
        java.lang.String str6 = user0.getUsername();
        user0.setLastName("");
        java.lang.String str9 = user0.getLastName();
        user0.setFirstName("hi!");
        user0.setFirstName("hi!");
        java.lang.Class<?> wildcardClass14 = user0.getClass();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0604");
        User user0 = new User();
        java.lang.String str1 = user0.getPassword();
        user0.setCountry("hi!");
        java.lang.String str4 = user0.getFirstName();
        user0.setLastName("hi!");
        user0.setDob("hi!");
        java.lang.String str9 = user0.getFirstName();
        user0.setLastName("hi!");
        user0.setCountry("");
        java.lang.String str14 = user0.getEmail();
        java.lang.String str15 = user0.getUsername();
        java.lang.String str16 = user0.getUsername();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNull(str16);
    }

    @Test
    public void test0605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0605");
        User user0 = new User();
        java.lang.String str1 = user0.getPassword();
        user0.setCountry("hi!");
        java.lang.String str4 = user0.getFirstName();
        java.lang.String str5 = user0.getUsername();
        user0.setDob("hi!");
        java.lang.Class<?> wildcardClass8 = user0.getClass();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0606");
        User user0 = new User();
        java.lang.String str1 = user0.getFirstName();
        user0.setPassword("");
        user0.setEmail("hi!");
        user0.setPassword("hi!");
        java.lang.Class<?> wildcardClass8 = user0.getClass();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0607");
        User user0 = new User();
        java.lang.String str1 = user0.getPassword();
        java.lang.String str2 = user0.getPassword();
        user0.setPassword("");
        java.lang.String str5 = user0.getEmail();
        java.lang.String str6 = user0.getFirstName();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test0608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0608");
        User user0 = new User();
        java.lang.String str1 = user0.getPassword();
        java.lang.String str2 = user0.getUsername();
        java.lang.String str3 = user0.getEmail();
        user0.setFirstName("");
        user0.setLastName("hi!");
        java.lang.String str8 = user0.getFirstName();
        user0.setFirstName("hi!");
        user0.setCountry("");
        user0.setCountry("");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test0609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0609");
        User user0 = new User();
        java.lang.String str1 = user0.getPassword();
        user0.setCountry("hi!");
        java.lang.String str4 = user0.getFirstName();
        java.lang.String str5 = user0.getUsername();
        user0.setDob("hi!");
        java.lang.String str8 = user0.getDob();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
    }

    @Test
    public void test0610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0610");
        User user0 = new User();
        java.lang.String str1 = user0.getPassword();
        user0.setUsername("hi!");
        user0.setCountry("hi!");
        user0.setFirstName("");
        user0.setCountry("");
        java.lang.String str10 = user0.getPassword();
        user0.setUsername("hi!");
        user0.setCountry("hi!");
        user0.setDob("hi!");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test0611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0611");
        User user0 = new User();
        java.lang.String str1 = user0.getPassword();
        user0.setCountry("hi!");
        java.lang.String str4 = user0.getPassword();
        user0.setFirstName("");
        user0.setLastName("hi!");
        user0.setEmail("hi!");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str4);
    }

    @Test
    public void test0612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0612");
        User user0 = new User();
        user0.setPassword("hi!");
        user0.setPassword("");
        java.lang.String str5 = user0.getPassword();
        user0.setCountry("hi!");
        java.lang.String str8 = user0.getPassword();
        java.lang.String str9 = user0.getDob();
        user0.setDob("");
        java.lang.String str12 = user0.getUsername();
        java.lang.String str13 = user0.getCountry();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
    }

    @Test
    public void test0613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0613");
        User user0 = new User();
        java.lang.String str1 = user0.getPassword();
        java.lang.String str2 = user0.getPassword();
        user0.setLastName("hi!");
        java.lang.String str5 = user0.getCountry();
        user0.setLastName("hi!");
        java.lang.String str8 = user0.getDob();
        user0.setDob("");
        user0.setEmail("");
        user0.setLastName("");
        java.lang.Class<?> wildcardClass15 = user0.getClass();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0614");
        User user0 = new User();
        java.lang.String str1 = user0.getPassword();
        java.lang.String str2 = user0.getUsername();
        java.lang.String str3 = user0.getEmail();
        user0.setFirstName("");
        user0.setLastName("hi!");
        java.lang.String str8 = user0.getFirstName();
        java.lang.String str9 = user0.getUsername();
        user0.setUsername("hi!");
        user0.setUsername("hi!");
        java.lang.String str14 = user0.getPassword();
        user0.setUsername("");
        java.lang.String str17 = user0.getCountry();
        java.lang.String str18 = user0.getCountry();
        user0.setFirstName("hi!");
        user0.setCountry("hi!");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertNull(str18);
    }

    @Test
    public void test0615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0615");
        User user0 = new User();
        user0.setPassword("hi!");
        user0.setPassword("");
        java.lang.String str5 = user0.getPassword();
        user0.setFirstName("");
        java.lang.String str8 = user0.getUsername();
        java.lang.String str9 = user0.getPassword();
        java.lang.String str10 = user0.getCountry();
        user0.setUsername("hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test0616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0616");
        User user0 = new User();
        java.lang.String str1 = user0.getPassword();
        java.lang.String str2 = user0.getPassword();
        java.lang.String str3 = user0.getPassword();
        user0.setLastName("");
        user0.setUsername("hi!");
        java.lang.String str8 = user0.getDob();
        java.lang.String str9 = user0.getDob();
        java.lang.String str10 = user0.getEmail();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test0617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0617");
        User user0 = new User();
        java.lang.String str1 = user0.getPassword();
        user0.setCountry("hi!");
        java.lang.String str4 = user0.getFirstName();
        user0.setLastName("hi!");
        user0.setDob("hi!");
        java.lang.String str9 = user0.getFirstName();
        java.lang.String str10 = user0.getDob();
        java.lang.String str11 = user0.getLastName();
        user0.setPassword("");
        java.lang.String str14 = user0.getPassword();
        java.lang.Class<?> wildcardClass15 = user0.getClass();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0618");
        User user0 = new User();
        java.lang.String str1 = user0.getPassword();
        user0.setCountry("hi!");
        user0.setUsername("hi!");
        user0.setPassword("");
        user0.setUsername("hi!");
        user0.setCountry("");
        java.lang.String str12 = user0.getCountry();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test0619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0619");
        User user0 = new User();
        java.lang.String str1 = user0.getPassword();
        user0.setCountry("hi!");
        java.lang.String str4 = user0.getFirstName();
        java.lang.String str5 = user0.getDob();
        java.lang.String str6 = user0.getLastName();
        user0.setFirstName("hi!");
        user0.setDob("hi!");
        java.lang.String str11 = user0.getPassword();
        java.lang.String str12 = user0.getUsername();
        user0.setEmail("hi!");
        user0.setCountry("");
        java.lang.String str17 = user0.getDob();
        user0.setDob("hi!");
        java.lang.String str20 = user0.getUsername();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertNull(str20);
    }

    @Test
    public void test0620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0620");
        User user0 = new User();
        java.lang.String str1 = user0.getPassword();
        user0.setCountry("hi!");
        java.lang.String str4 = user0.getFirstName();
        java.lang.String str5 = user0.getDob();
        java.lang.String str6 = user0.getLastName();
        user0.setFirstName("hi!");
        java.lang.String str9 = user0.getLastName();
        java.lang.String str10 = user0.getFirstName();
        user0.setPassword("hi!");
        java.lang.String str13 = user0.getLastName();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNull(str13);
    }

    @Test
    public void test0621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0621");
        User user0 = new User();
        user0.setPassword("hi!");
        user0.setPassword("");
        java.lang.String str5 = user0.getDob();
        user0.setEmail("");
        user0.setUsername("");
        user0.setPassword("");
        user0.setLastName("");
        user0.setUsername("");
        user0.setEmail("hi!");
        org.junit.Assert.assertNull(str5);
    }

    @Test
    public void test0622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0622");
        User user0 = new User();
        java.lang.String str1 = user0.getPassword();
        user0.setCountry("hi!");
        java.lang.String str4 = user0.getFirstName();
        user0.setLastName("hi!");
        user0.setDob("hi!");
        java.lang.String str9 = user0.getFirstName();
        java.lang.String str10 = user0.getDob();
        java.lang.String str11 = user0.getLastName();
        java.lang.String str12 = user0.getLastName();
        user0.setPassword("hi!");
        java.lang.String str15 = user0.getFirstName();
        user0.setEmail("hi!");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertNull(str15);
    }

    @Test
    public void test0623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0623");
        User user0 = new User();
        java.lang.String str1 = user0.getPassword();
        java.lang.String str2 = user0.getUsername();
        java.lang.String str3 = user0.getEmail();
        user0.setUsername("");
        user0.setPassword("hi!");
        user0.setLastName("");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test0624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0624");
        User user0 = new User();
        java.lang.String str1 = user0.getPassword();
        java.lang.String str2 = user0.getUsername();
        java.lang.String str3 = user0.getCountry();
        java.lang.String str4 = user0.getCountry();
        user0.setDob("");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
    }

    @Test
    public void test0625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0625");
        User user0 = new User();
        java.lang.String str1 = user0.getPassword();
        user0.setCountry("hi!");
        java.lang.String str4 = user0.getFirstName();
        java.lang.String str5 = user0.getDob();
        java.lang.String str6 = user0.getLastName();
        user0.setFirstName("hi!");
        user0.setDob("");
        user0.setDob("");
        user0.setEmail("");
        user0.setUsername("hi!");
        java.lang.String str17 = user0.getDob();
        user0.setFirstName("");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
    }

    @Test
    public void test0626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0626");
        User user0 = new User();
        user0.setLastName("");
        java.lang.String str3 = user0.getUsername();
        user0.setCountry("");
        java.lang.String str6 = user0.getDob();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test0627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0627");
        User user0 = new User();
        user0.setPassword("hi!");
        user0.setPassword("");
        java.lang.String str5 = user0.getPassword();
        user0.setFirstName("");
        user0.setUsername("");
        java.lang.String str10 = user0.getPassword();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test0628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0628");
        User user0 = new User();
        java.lang.String str1 = user0.getPassword();
        java.lang.String str2 = user0.getUsername();
        java.lang.String str3 = user0.getEmail();
        user0.setFirstName("");
        user0.setLastName("hi!");
        user0.setUsername("hi!");
        java.lang.String str10 = user0.getUsername();
        java.lang.String str11 = user0.getLastName();
        user0.setDob("hi!");
        java.lang.Class<?> wildcardClass14 = user0.getClass();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0629");
        User user0 = new User();
        user0.setPassword("hi!");
        user0.setPassword("");
        java.lang.String str5 = user0.getDob();
        user0.setEmail("");
        user0.setUsername("");
        user0.setFirstName("hi!");
        user0.setFirstName("");
        java.lang.Class<?> wildcardClass14 = user0.getClass();
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0630");
        User user0 = new User();
        java.lang.String str1 = user0.getPassword();
        java.lang.String str2 = user0.getUsername();
        java.lang.String str3 = user0.getEmail();
        java.lang.String str4 = user0.getLastName();
        user0.setDob("");
        java.lang.String str7 = user0.getLastName();
        user0.setPassword("hi!");
        user0.setPassword("");
        java.lang.String str12 = user0.getEmail();
        java.lang.String str13 = user0.getLastName();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str13);
    }

    @Test
    public void test0631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0631");
        User user0 = new User();
        java.lang.String str1 = user0.getPassword();
        user0.setCountry("hi!");
        java.lang.String str4 = user0.getFirstName();
        java.lang.String str5 = user0.getDob();
        java.lang.String str6 = user0.getLastName();
        user0.setFirstName("hi!");
        user0.setUsername("hi!");
        user0.setUsername("");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test0632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0632");
        User user0 = new User();
        java.lang.String str1 = user0.getPassword();
        java.lang.String str2 = user0.getUsername();
        java.lang.String str3 = user0.getEmail();
        user0.setUsername("");
        user0.setPassword("hi!");
        java.lang.String str8 = user0.getLastName();
        user0.setPassword("hi!");
        user0.setLastName("");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test0633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0633");
        User user0 = new User();
        java.lang.String str1 = user0.getPassword();
        java.lang.String str2 = user0.getUsername();
        java.lang.String str3 = user0.getEmail();
        user0.setFirstName("");
        user0.setLastName("hi!");
        java.lang.String str8 = user0.getFirstName();
        java.lang.String str9 = user0.getUsername();
        user0.setUsername("hi!");
        user0.setUsername("hi!");
        java.lang.String str14 = user0.getFirstName();
        user0.setFirstName("");
        user0.setPassword("");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test0634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0634");
        User user0 = new User();
        java.lang.String str1 = user0.getPassword();
        user0.setCountry("hi!");
        java.lang.String str4 = user0.getFirstName();
        java.lang.String str5 = user0.getDob();
        java.lang.String str6 = user0.getLastName();
        java.lang.String str7 = user0.getCountry();
        java.lang.String str8 = user0.getPassword();
        user0.setFirstName("hi!");
        user0.setEmail("hi!");
        java.lang.String str13 = user0.getDob();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str13);
    }

    @Test
    public void test0635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0635");
        User user0 = new User();
        java.lang.String str1 = user0.getPassword();
        java.lang.String str2 = user0.getUsername();
        java.lang.String str3 = user0.getCountry();
        java.lang.String str4 = user0.getPassword();
        java.lang.String str5 = user0.getUsername();
        user0.setEmail("");
        java.lang.String str8 = user0.getEmail();
        user0.setPassword("");
        java.lang.Class<?> wildcardClass11 = user0.getClass();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0636");
        User user0 = new User();
        java.lang.String str1 = user0.getPassword();
        user0.setCountry("hi!");
        java.lang.String str4 = user0.getFirstName();
        java.lang.String str5 = user0.getDob();
        java.lang.String str6 = user0.getLastName();
        user0.setFirstName("hi!");
        user0.setDob("");
        user0.setDob("");
        java.lang.String str13 = user0.getCountry();
        user0.setEmail("");
        java.lang.String str16 = user0.getEmail();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
    }

    @Test
    public void test0637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0637");
        User user0 = new User();
        java.lang.String str1 = user0.getPassword();
        user0.setCountry("hi!");
        java.lang.String str4 = user0.getFirstName();
        java.lang.String str5 = user0.getDob();
        java.lang.String str6 = user0.getLastName();
        user0.setFirstName("hi!");
        user0.setDob("hi!");
        java.lang.String str11 = user0.getPassword();
        java.lang.String str12 = user0.getUsername();
        user0.setEmail("hi!");
        user0.setCountry("");
        user0.setFirstName("");
        java.lang.String str19 = user0.getPassword();
        java.lang.String str20 = user0.getFirstName();
        user0.setUsername("");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
    }

    @Test
    public void test0638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0638");
        User user0 = new User();
        java.lang.String str1 = user0.getPassword();
        java.lang.String str2 = user0.getPassword();
        user0.setLastName("hi!");
        java.lang.String str5 = user0.getCountry();
        user0.setLastName("hi!");
        java.lang.String str8 = user0.getDob();
        java.lang.String str9 = user0.getCountry();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test0639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0639");
        User user0 = new User();
        java.lang.String str1 = user0.getPassword();
        java.lang.String str2 = user0.getUsername();
        java.lang.String str3 = user0.getEmail();
        user0.setFirstName("");
        user0.setLastName("hi!");
        user0.setUsername("hi!");
        java.lang.String str10 = user0.getDob();
        java.lang.String str11 = user0.getFirstName();
        user0.setLastName("hi!");
        user0.setDob("hi!");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test0640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0640");
        User user0 = new User();
        java.lang.String str1 = user0.getPassword();
        java.lang.String str2 = user0.getUsername();
        java.lang.String str3 = user0.getEmail();
        user0.setFirstName("");
        user0.setLastName("hi!");
        user0.setUsername("hi!");
        java.lang.String str10 = user0.getUsername();
        user0.setLastName("");
        user0.setPassword("hi!");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
    }

    @Test
    public void test0641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0641");
        User user0 = new User();
        java.lang.String str1 = user0.getPassword();
        java.lang.String str2 = user0.getUsername();
        java.lang.String str3 = user0.getEmail();
        user0.setFirstName("");
        user0.setLastName("hi!");
        java.lang.String str8 = user0.getFirstName();
        java.lang.String str9 = user0.getPassword();
        java.lang.String str10 = user0.getLastName();
        user0.setLastName("hi!");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
    }

    @Test
    public void test0642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0642");
        User user0 = new User();
        java.lang.String str1 = user0.getPassword();
        user0.setCountry("hi!");
        user0.setUsername("hi!");
        user0.setCountry("");
        java.lang.String str8 = user0.getFirstName();
        user0.setDob("hi!");
        java.lang.String str11 = user0.getCountry();
        user0.setFirstName("");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test0643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0643");
        User user0 = new User();
        java.lang.String str1 = user0.getPassword();
        user0.setCountry("hi!");
        java.lang.String str4 = user0.getFirstName();
        java.lang.String str5 = user0.getDob();
        java.lang.String str6 = user0.getLastName();
        user0.setFirstName("hi!");
        java.lang.String str9 = user0.getUsername();
        java.lang.String str10 = user0.getEmail();
        java.lang.String str11 = user0.getLastName();
        java.lang.String str12 = user0.getFirstName();
        java.lang.String str13 = user0.getPassword();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertNull(str13);
    }

    @Test
    public void test0644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0644");
        User user0 = new User();
        java.lang.String str1 = user0.getPassword();
        user0.setCountry("hi!");
        java.lang.String str4 = user0.getPassword();
        java.lang.String str5 = user0.getPassword();
        java.lang.String str6 = user0.getFirstName();
        java.lang.String str7 = user0.getCountry();
        user0.setEmail("hi!");
        java.lang.String str10 = user0.getDob();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test0645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0645");
        User user0 = new User();
        java.lang.String str1 = user0.getPassword();
        user0.setCountry("hi!");
        java.lang.String str4 = user0.getPassword();
        java.lang.String str5 = user0.getDob();
        user0.setCountry("");
        java.lang.String str8 = user0.getEmail();
        java.lang.Class<?> wildcardClass9 = user0.getClass();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0646");
        User user0 = new User();
        java.lang.String str1 = user0.getPassword();
        user0.setCountry("hi!");
        java.lang.String str4 = user0.getFirstName();
        user0.setLastName("hi!");
        user0.setDob("hi!");
        java.lang.String str9 = user0.getEmail();
        java.lang.String str10 = user0.getCountry();
        user0.setUsername("");
        java.lang.String str13 = user0.getLastName();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
    }

    @Test
    public void test0647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0647");
        User user0 = new User();
        java.lang.String str1 = user0.getPassword();
        user0.setCountry("hi!");
        java.lang.String str4 = user0.getFirstName();
        java.lang.String str5 = user0.getDob();
        java.lang.String str6 = user0.getLastName();
        user0.setFirstName("hi!");
        java.lang.String str9 = user0.getUsername();
        user0.setPassword("");
        user0.setFirstName("hi!");
        java.lang.String str14 = user0.getDob();
        java.lang.String str15 = user0.getPassword();
        user0.setLastName("");
        java.lang.String str18 = user0.getPassword();
        java.lang.String str19 = user0.getDob();
        user0.setEmail("hi!");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertNull(str19);
    }

    @Test
    public void test0648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0648");
        User user0 = new User();
        java.lang.String str1 = user0.getPassword();
        java.lang.String str2 = user0.getPassword();
        user0.setUsername("");
        java.lang.String str5 = user0.getCountry();
        java.lang.String str6 = user0.getDob();
        java.lang.String str7 = user0.getFirstName();
        user0.setCountry("");
        java.lang.String str10 = user0.getUsername();
        user0.setLastName("");
        java.lang.String str13 = user0.getCountry();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test0649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0649");
        User user0 = new User();
        java.lang.String str1 = user0.getPassword();
        user0.setCountry("hi!");
        java.lang.String str4 = user0.getUsername();
        user0.setPassword("");
        user0.setFirstName("");
        java.lang.String str9 = user0.getUsername();
        java.lang.String str10 = user0.getCountry();
        user0.setEmail("hi!");
        java.lang.String str13 = user0.getDob();
        java.lang.String str14 = user0.getPassword();
        java.lang.String str15 = user0.getDob();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNull(str15);
    }

    @Test
    public void test0650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0650");
        User user0 = new User();
        user0.setLastName("");
        java.lang.String str3 = user0.getCountry();
        user0.setEmail("hi!");
        user0.setLastName("");
        java.lang.String str8 = user0.getLastName();
        java.lang.Class<?> wildcardClass9 = user0.getClass();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0651");
        User user0 = new User();
        java.lang.String str1 = user0.getPassword();
        java.lang.String str2 = user0.getPassword();
        java.lang.String str3 = user0.getPassword();
        user0.setLastName("");
        user0.setUsername("hi!");
        user0.setUsername("");
        java.lang.Class<?> wildcardClass10 = user0.getClass();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0652");
        User user0 = new User();
        java.lang.String str1 = user0.getPassword();
        user0.setUsername("hi!");
        user0.setFirstName("");
        java.lang.String str6 = user0.getPassword();
        user0.setLastName("");
        java.lang.String str9 = user0.getDob();
        java.lang.String str10 = user0.getEmail();
        java.lang.String str11 = user0.getPassword();
        java.lang.String str12 = user0.getEmail();
        user0.setEmail("");
        user0.setCountry("hi!");
        user0.setUsername("");
        user0.setUsername("");
        user0.setLastName("");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test0653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0653");
        User user0 = new User();
        java.lang.String str1 = user0.getPassword();
        java.lang.String str2 = user0.getUsername();
        java.lang.String str3 = user0.getCountry();
        user0.setEmail("hi!");
        java.lang.String str6 = user0.getPassword();
        java.lang.String str7 = user0.getEmail();
        java.lang.String str8 = user0.getPassword();
        user0.setDob("hi!");
        user0.setDob("");
        java.lang.String str13 = user0.getLastName();
        java.lang.String str14 = user0.getFirstName();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(str14);
    }

    @Test
    public void test0654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0654");
        User user0 = new User();
        java.lang.String str1 = user0.getPassword();
        java.lang.String str2 = user0.getUsername();
        java.lang.String str3 = user0.getEmail();
        user0.setFirstName("");
        user0.setLastName("hi!");
        java.lang.String str8 = user0.getFirstName();
        user0.setDob("");
        java.lang.String str11 = user0.getEmail();
        java.lang.String str12 = user0.getUsername();
        java.lang.Class<?> wildcardClass13 = user0.getClass();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0655");
        User user0 = new User();
        java.lang.String str1 = user0.getFirstName();
        java.lang.String str2 = user0.getCountry();
        java.lang.String str3 = user0.getFirstName();
        user0.setFirstName("");
        java.lang.String str6 = user0.getUsername();
        user0.setEmail("hi!");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test0656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0656");
        User user0 = new User();
        user0.setUsername("");
        java.lang.String str3 = user0.getDob();
        user0.setPassword("hi!");
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test0657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0657");
        User user0 = new User();
        java.lang.String str1 = user0.getPassword();
        user0.setCountry("hi!");
        java.lang.String str4 = user0.getFirstName();
        user0.setLastName("hi!");
        user0.setDob("hi!");
        java.lang.String str9 = user0.getFirstName();
        java.lang.String str10 = user0.getDob();
        java.lang.String str11 = user0.getLastName();
        java.lang.String str12 = user0.getLastName();
        java.lang.String str13 = user0.getUsername();
        user0.setFirstName("hi!");
        user0.setCountry("");
        java.lang.String str18 = user0.getUsername();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(str18);
    }

    @Test
    public void test0658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0658");
        User user0 = new User();
        java.lang.String str1 = user0.getPassword();
        user0.setCountry("hi!");
        java.lang.String str4 = user0.getFirstName();
        java.lang.String str5 = user0.getDob();
        java.lang.String str6 = user0.getLastName();
        user0.setFirstName("hi!");
        user0.setUsername("");
        java.lang.String str11 = user0.getPassword();
        java.lang.String str12 = user0.getUsername();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test0659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0659");
        User user0 = new User();
        java.lang.String str1 = user0.getPassword();
        user0.setCountry("hi!");
        java.lang.String str4 = user0.getFirstName();
        java.lang.String str5 = user0.getDob();
        java.lang.String str6 = user0.getLastName();
        user0.setFirstName("hi!");
        user0.setDob("");
        user0.setDob("");
        user0.setEmail("");
        user0.setUsername("hi!");
        java.lang.String str17 = user0.getFirstName();
        java.lang.String str18 = user0.getFirstName();
        java.lang.String str19 = user0.getCountry();
        user0.setPassword("hi!");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
    }

    @Test
    public void test0660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0660");
        User user0 = new User();
        java.lang.String str1 = user0.getPassword();
        java.lang.String str2 = user0.getUsername();
        java.lang.String str3 = user0.getCountry();
        user0.setEmail("hi!");
        java.lang.String str6 = user0.getPassword();
        user0.setFirstName("");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test0661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0661");
        User user0 = new User();
        user0.setPassword("hi!");
        user0.setPassword("");
        user0.setUsername("");
        user0.setFirstName("");
        user0.setEmail("");
        java.lang.String str11 = user0.getDob();
        java.lang.String str12 = user0.getDob();
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test0662() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0662");
        User user0 = new User();
        java.lang.String str1 = user0.getPassword();
        user0.setCountry("hi!");
        java.lang.String str4 = user0.getFirstName();
        java.lang.String str5 = user0.getDob();
        java.lang.String str6 = user0.getLastName();
        user0.setFirstName("hi!");
        user0.setUsername("");
        user0.setCountry("");
        user0.setPassword("");
        java.lang.String str15 = user0.getLastName();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str15);
    }

    @Test
    public void test0663() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0663");
        User user0 = new User();
        user0.setPassword("hi!");
        user0.setPassword("");
        java.lang.String str5 = user0.getDob();
        user0.setEmail("");
        user0.setUsername("");
        user0.setPassword("");
        java.lang.String str12 = user0.getLastName();
        user0.setCountry("");
        java.lang.String str15 = user0.getEmail();
        java.lang.Class<?> wildcardClass16 = user0.getClass();
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0664() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0664");
        User user0 = new User();
        java.lang.String str1 = user0.getPassword();
        user0.setCountry("hi!");
        java.lang.String str4 = user0.getFirstName();
        java.lang.String str5 = user0.getDob();
        java.lang.String str6 = user0.getLastName();
        user0.setFirstName("hi!");
        user0.setDob("hi!");
        java.lang.String str11 = user0.getPassword();
        java.lang.String str12 = user0.getFirstName();
        java.lang.String str13 = user0.getEmail();
        java.lang.String str14 = user0.getEmail();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(str14);
    }

    @Test
    public void test0665() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0665");
        User user0 = new User();
        java.lang.String str1 = user0.getPassword();
        java.lang.String str2 = user0.getUsername();
        java.lang.String str3 = user0.getEmail();
        user0.setFirstName("");
        user0.setLastName("hi!");
        user0.setUsername("hi!");
        java.lang.String str10 = user0.getUsername();
        user0.setDob("hi!");
        user0.setUsername("");
        user0.setPassword("");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
    }

    @Test
    public void test0666() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0666");
        User user0 = new User();
        java.lang.String str1 = user0.getPassword();
        user0.setCountry("hi!");
        java.lang.String str4 = user0.getFirstName();
        java.lang.String str5 = user0.getDob();
        java.lang.String str6 = user0.getLastName();
        user0.setFirstName("hi!");
        user0.setUsername("");
        java.lang.String str11 = user0.getPassword();
        user0.setPassword("");
        java.lang.String str14 = user0.getPassword();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test0667() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0667");
        User user0 = new User();
        java.lang.String str1 = user0.getPassword();
        user0.setUsername("hi!");
        user0.setCountry("hi!");
        user0.setFirstName("");
        user0.setUsername("");
        user0.setEmail("");
        java.lang.String str12 = user0.getEmail();
        java.lang.String str13 = user0.getDob();
        java.lang.String str14 = user0.getFirstName();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test0668() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0668");
        User user0 = new User();
        java.lang.String str1 = user0.getPassword();
        user0.setCountry("hi!");
        java.lang.String str4 = user0.getFirstName();
        user0.setEmail("");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str4);
    }

    @Test
    public void test0669() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0669");
        User user0 = new User();
        user0.setPassword("hi!");
        user0.setPassword("");
        java.lang.String str5 = user0.getPassword();
        java.lang.String str6 = user0.getEmail();
        java.lang.String str7 = user0.getLastName();
        user0.setFirstName("hi!");
        java.lang.Class<?> wildcardClass10 = user0.getClass();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0670() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0670");
        User user0 = new User();
        java.lang.String str1 = user0.getPassword();
        user0.setUsername("hi!");
        user0.setFirstName("");
        java.lang.String str6 = user0.getPassword();
        user0.setLastName("");
        java.lang.String str9 = user0.getDob();
        java.lang.String str10 = user0.getEmail();
        user0.setDob("hi!");
        java.lang.Class<?> wildcardClass13 = user0.getClass();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0671() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0671");
        User user0 = new User();
        java.lang.String str1 = user0.getPassword();
        java.lang.String str2 = user0.getUsername();
        java.lang.String str3 = user0.getEmail();
        user0.setUsername("");
        user0.setUsername("");
        java.lang.String str8 = user0.getUsername();
        user0.setDob("hi!");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test0672() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0672");
        User user0 = new User();
        java.lang.String str1 = user0.getPassword();
        user0.setUsername("hi!");
        user0.setCountry("hi!");
        java.lang.String str6 = user0.getLastName();
        user0.setUsername("");
        java.lang.String str9 = user0.getLastName();
        user0.setPassword("hi!");
        user0.setLastName("hi!");
        user0.setEmail("hi!");
        user0.setDob("");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test0673() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0673");
        User user0 = new User();
        java.lang.String str1 = user0.getPassword();
        user0.setCountry("hi!");
        java.lang.String str4 = user0.getFirstName();
        java.lang.String str5 = user0.getDob();
        java.lang.String str6 = user0.getLastName();
        java.lang.String str7 = user0.getEmail();
        user0.setFirstName("");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test0674() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0674");
        User user0 = new User();
        java.lang.String str1 = user0.getPassword();
        user0.setCountry("hi!");
        java.lang.String str4 = user0.getFirstName();
        user0.setLastName("hi!");
        user0.setDob("hi!");
        java.lang.String str9 = user0.getFirstName();
        java.lang.String str10 = user0.getDob();
        java.lang.String str11 = user0.getLastName();
        java.lang.String str12 = user0.getLastName();
        java.lang.String str13 = user0.getUsername();
        user0.setFirstName("hi!");
        user0.setCountry("hi!");
        user0.setDob("");
        java.lang.String str20 = user0.getEmail();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(str20);
    }

    @Test
    public void test0675() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0675");
        User user0 = new User();
        java.lang.String str1 = user0.getPassword();
        user0.setUsername("hi!");
        user0.setFirstName("");
        java.lang.String str6 = user0.getPassword();
        user0.setUsername("");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test0676() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0676");
        User user0 = new User();
        java.lang.String str1 = user0.getPassword();
        user0.setCountry("hi!");
        user0.setUsername("hi!");
        java.lang.String str6 = user0.getUsername();
        user0.setLastName("");
        java.lang.String str9 = user0.getUsername();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
    }

    @Test
    public void test0677() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0677");
        User user0 = new User();
        java.lang.String str1 = user0.getPassword();
        user0.setCountry("hi!");
        java.lang.String str4 = user0.getFirstName();
        java.lang.String str5 = user0.getDob();
        java.lang.String str6 = user0.getLastName();
        user0.setFirstName("hi!");
        user0.setUsername("");
        java.lang.String str11 = user0.getLastName();
        java.lang.String str12 = user0.getPassword();
        java.lang.String str13 = user0.getUsername();
        java.lang.String str14 = user0.getFirstName();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
    }

    @Test
    public void test0678() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0678");
        User user0 = new User();
        java.lang.String str1 = user0.getPassword();
        user0.setUsername("");
        user0.setLastName("");
        user0.setEmail("hi!");
        user0.setDob("hi!");
        java.lang.String str10 = user0.getFirstName();
        user0.setCountry("hi!");
        user0.setEmail("hi!");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test0679() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0679");
        User user0 = new User();
        user0.setPassword("hi!");
        user0.setPassword("");
        java.lang.String str5 = user0.getDob();
        user0.setEmail("");
        user0.setUsername("");
        user0.setPassword("");
        user0.setLastName("");
        java.lang.String str14 = user0.getPassword();
        user0.setFirstName("hi!");
        user0.setPassword("");
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test0680() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0680");
        User user0 = new User();
        java.lang.String str1 = user0.getPassword();
        user0.setCountry("hi!");
        user0.setUsername("hi!");
        user0.setPassword("");
        java.lang.String str8 = user0.getCountry();
        user0.setCountry("");
        java.lang.String str11 = user0.getEmail();
        java.lang.String str12 = user0.getUsername();
        java.lang.String str13 = user0.getLastName();
        java.lang.String str14 = user0.getDob();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(str14);
    }

    @Test
    public void test0681() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0681");
        User user0 = new User();
        user0.setPassword("hi!");
        user0.setPassword("");
        user0.setPassword("");
        java.lang.String str7 = user0.getCountry();
        user0.setPassword("hi!");
        user0.setCountry("");
        user0.setUsername("");
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test0682() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0682");
        User user0 = new User();
        java.lang.String str1 = user0.getPassword();
        user0.setUsername("hi!");
        java.lang.String str4 = user0.getCountry();
        user0.setDob("");
        user0.setDob("");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str4);
    }

    @Test
    public void test0683() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0683");
        User user0 = new User();
        java.lang.String str1 = user0.getPassword();
        user0.setCountry("hi!");
        java.lang.String str4 = user0.getFirstName();
        java.lang.String str5 = user0.getDob();
        java.lang.String str6 = user0.getLastName();
        user0.setFirstName("hi!");
        user0.setDob("hi!");
        user0.setUsername("");
        java.lang.String str13 = user0.getLastName();
        java.lang.String str14 = user0.getLastName();
        java.lang.String str15 = user0.getUsername();
        user0.setEmail("hi!");
        user0.setPassword("");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
    }

    @Test
    public void test0684() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0684");
        User user0 = new User();
        user0.setPassword("hi!");
        user0.setPassword("");
        java.lang.String str5 = user0.getDob();
        user0.setEmail("");
        user0.setUsername("");
        java.lang.String str10 = user0.getFirstName();
        user0.setDob("hi!");
        user0.setEmail("hi!");
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test0685() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0685");
        User user0 = new User();
        user0.setPassword("hi!");
        java.lang.String str3 = user0.getPassword();
        java.lang.String str4 = user0.getFirstName();
        java.lang.String str5 = user0.getLastName();
        user0.setCountry("");
        user0.setPassword("");
        java.lang.String str10 = user0.getFirstName();
        user0.setUsername("");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test0686() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0686");
        User user0 = new User();
        java.lang.String str1 = user0.getPassword();
        user0.setUsername("hi!");
        user0.setCountry("hi!");
        java.lang.String str6 = user0.getLastName();
        user0.setLastName("");
        java.lang.String str9 = user0.getUsername();
        java.lang.String str10 = user0.getDob();
        java.lang.String str11 = user0.getEmail();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test0687() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0687");
        User user0 = new User();
        java.lang.String str1 = user0.getPassword();
        java.lang.String str2 = user0.getUsername();
        java.lang.String str3 = user0.getEmail();
        java.lang.String str4 = user0.getLastName();
        user0.setDob("");
        java.lang.String str7 = user0.getLastName();
        user0.setPassword("hi!");
        java.lang.String str10 = user0.getUsername();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test0688() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0688");
        User user0 = new User();
        java.lang.String str1 = user0.getPassword();
        user0.setUsername("hi!");
        user0.setCountry("hi!");
        java.lang.String str6 = user0.getLastName();
        user0.setUsername("");
        java.lang.String str9 = user0.getLastName();
        user0.setPassword("hi!");
        user0.setLastName("hi!");
        user0.setEmail("hi!");
        user0.setUsername("");
        java.lang.String str18 = user0.getEmail();
        java.lang.String str19 = user0.getCountry();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
    }

    @Test
    public void test0689() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0689");
        User user0 = new User();
        java.lang.String str1 = user0.getPassword();
        java.lang.String str2 = user0.getUsername();
        java.lang.String str3 = user0.getEmail();
        java.lang.String str4 = user0.getLastName();
        java.lang.String str5 = user0.getFirstName();
        user0.setFirstName("");
        user0.setCountry("");
        java.lang.String str10 = user0.getUsername();
        user0.setDob("");
        java.lang.String str13 = user0.getPassword();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str13);
    }

    @Test
    public void test0690() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0690");
        User user0 = new User();
        java.lang.String str1 = user0.getPassword();
        user0.setCountry("hi!");
        java.lang.String str4 = user0.getFirstName();
        java.lang.String str5 = user0.getDob();
        java.lang.String str6 = user0.getLastName();
        java.lang.String str7 = user0.getCountry();
        java.lang.String str8 = user0.getPassword();
        java.lang.String str9 = user0.getEmail();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test0691() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0691");
        User user0 = new User();
        java.lang.String str1 = user0.getPassword();
        user0.setCountry("hi!");
        java.lang.String str4 = user0.getUsername();
        user0.setPassword("");
        user0.setFirstName("");
        java.lang.String str9 = user0.getUsername();
        java.lang.String str10 = user0.getCountry();
        java.lang.String str11 = user0.getLastName();
        user0.setUsername("hi!");
        user0.setPassword("hi!");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test0692() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0692");
        User user0 = new User();
        java.lang.String str1 = user0.getPassword();
        user0.setCountry("hi!");
        java.lang.String str4 = user0.getFirstName();
        user0.setLastName("hi!");
        user0.setDob("hi!");
        java.lang.String str9 = user0.getFirstName();
        user0.setCountry("");
        user0.setEmail("");
        user0.setEmail("");
        user0.setPassword("");
        user0.setPassword("hi!");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test0693() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0693");
        User user0 = new User();
        java.lang.String str1 = user0.getPassword();
        java.lang.String str2 = user0.getUsername();
        java.lang.String str3 = user0.getEmail();
        user0.setFirstName("");
        java.lang.String str6 = user0.getDob();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test0694() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0694");
        User user0 = new User();
        user0.setPassword("hi!");
        user0.setPassword("");
        java.lang.String str5 = user0.getPassword();
        java.lang.String str6 = user0.getEmail();
        java.lang.String str7 = user0.getEmail();
        user0.setFirstName("hi!");
        user0.setCountry("hi!");
        user0.setCountry("");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test0695() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0695");
        User user0 = new User();
        java.lang.String str1 = user0.getPassword();
        user0.setCountry("hi!");
        java.lang.String str4 = user0.getFirstName();
        user0.setLastName("hi!");
        user0.setDob("hi!");
        java.lang.String str9 = user0.getFirstName();
        user0.setLastName("hi!");
        user0.setCountry("");
        java.lang.String str14 = user0.getFirstName();
        user0.setPassword("");
        java.lang.String str17 = user0.getLastName();
        java.lang.String str18 = user0.getUsername();
        java.lang.String str19 = user0.getEmail();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertNull(str19);
    }

    @Test
    public void test0696() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0696");
        User user0 = new User();
        java.lang.String str1 = user0.getFirstName();
        java.lang.String str2 = user0.getCountry();
        user0.setFirstName("");
        user0.setUsername("");
        java.lang.String str7 = user0.getEmail();
        user0.setUsername("hi!");
        user0.setDob("hi!");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test0697() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0697");
        User user0 = new User();
        user0.setPassword("hi!");
        user0.setPassword("");
        java.lang.String str5 = user0.getPassword();
        java.lang.String str6 = user0.getEmail();
        user0.setCountry("hi!");
        user0.setFirstName("hi!");
        java.lang.String str11 = user0.getLastName();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test0698() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0698");
        User user0 = new User();
        java.lang.String str1 = user0.getPassword();
        java.lang.String str2 = user0.getUsername();
        java.lang.String str3 = user0.getEmail();
        java.lang.String str4 = user0.getLastName();
        java.lang.String str5 = user0.getFirstName();
        user0.setFirstName("");
        user0.setCountry("");
        java.lang.String str10 = user0.getUsername();
        java.lang.String str11 = user0.getUsername();
        user0.setFirstName("hi!");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test0699() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0699");
        User user0 = new User();
        java.lang.String str1 = user0.getFirstName();
        java.lang.String str2 = user0.getCountry();
        java.lang.String str3 = user0.getFirstName();
        user0.setPassword("hi!");
        java.lang.Class<?> wildcardClass6 = user0.getClass();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0700() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0700");
        User user0 = new User();
        java.lang.String str1 = user0.getPassword();
        java.lang.String str2 = user0.getUsername();
        java.lang.String str3 = user0.getEmail();
        user0.setFirstName("");
        user0.setLastName("hi!");
        java.lang.String str8 = user0.getFirstName();
        java.lang.String str9 = user0.getUsername();
        user0.setUsername("hi!");
        user0.setUsername("hi!");
        java.lang.String str14 = user0.getPassword();
        user0.setUsername("");
        java.lang.String str17 = user0.getPassword();
        java.lang.String str18 = user0.getDob();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertNull(str18);
    }

    @Test
    public void test0701() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0701");
        User user0 = new User();
        java.lang.String str1 = user0.getPassword();
        user0.setCountry("hi!");
        java.lang.String str4 = user0.getFirstName();
        user0.setLastName("hi!");
        user0.setDob("hi!");
        java.lang.String str9 = user0.getFirstName();
        user0.setCountry("");
        java.lang.String str12 = user0.getFirstName();
        java.lang.String str13 = user0.getFirstName();
        java.lang.Class<?> wildcardClass14 = user0.getClass();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0702() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0702");
        User user0 = new User();
        java.lang.String str1 = user0.getPassword();
        user0.setCountry("hi!");
        java.lang.String str4 = user0.getFirstName();
        java.lang.String str5 = user0.getDob();
        java.lang.String str6 = user0.getLastName();
        user0.setFirstName("hi!");
        user0.setUsername("");
        java.lang.String str11 = user0.getLastName();
        user0.setUsername("hi!");
        user0.setDob("");
        user0.setCountry("");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test0703() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0703");
        User user0 = new User();
        user0.setUsername("");
        java.lang.String str3 = user0.getCountry();
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test0704() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0704");
        User user0 = new User();
        java.lang.String str1 = user0.getPassword();
        user0.setCountry("hi!");
        java.lang.String str4 = user0.getFirstName();
        java.lang.String str5 = user0.getDob();
        java.lang.String str6 = user0.getLastName();
        user0.setFirstName("hi!");
        user0.setDob("hi!");
        user0.setUsername("");
        java.lang.String str13 = user0.getLastName();
        user0.setPassword("");
        user0.setCountry("hi!");
        user0.setEmail("");
        java.lang.Class<?> wildcardClass20 = user0.getClass();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test0705() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0705");
        User user0 = new User();
        java.lang.String str1 = user0.getPassword();
        user0.setCountry("hi!");
        user0.setUsername("hi!");
        java.lang.String str6 = user0.getUsername();
        user0.setLastName("");
        java.lang.String str9 = user0.getLastName();
        user0.setFirstName("hi!");
        java.lang.String str12 = user0.getPassword();
        java.lang.String str13 = user0.getDob();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str13);
    }

    @Test
    public void test0706() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0706");
        User user0 = new User();
        java.lang.String str1 = user0.getPassword();
        java.lang.String str2 = user0.getPassword();
        java.lang.String str3 = user0.getPassword();
        user0.setPassword("hi!");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test0707() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0707");
        User user0 = new User();
        java.lang.String str1 = user0.getPassword();
        user0.setCountry("hi!");
        java.lang.String str4 = user0.getFirstName();
        user0.setLastName("hi!");
        user0.setDob("hi!");
        java.lang.String str9 = user0.getFirstName();
        user0.setLastName("hi!");
        user0.setCountry("");
        java.lang.String str14 = user0.getEmail();
        user0.setFirstName("hi!");
        java.lang.String str17 = user0.getLastName();
        java.lang.String str18 = user0.getFirstName();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
    }

    @Test
    public void test0708() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0708");
        User user0 = new User();
        java.lang.String str1 = user0.getPassword();
        java.lang.String str2 = user0.getUsername();
        java.lang.String str3 = user0.getEmail();
        java.lang.String str4 = user0.getLastName();
        java.lang.String str5 = user0.getEmail();
        java.lang.String str6 = user0.getUsername();
        user0.setUsername("");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test0709() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0709");
        User user0 = new User();
        user0.setPassword("hi!");
        java.lang.String str3 = user0.getPassword();
        java.lang.String str4 = user0.getPassword();
        java.lang.String str5 = user0.getLastName();
        java.lang.String str6 = user0.getUsername();
        java.lang.String str7 = user0.getLastName();
        user0.setLastName("hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test0710() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0710");
        User user0 = new User();
        java.lang.String str1 = user0.getPassword();
        user0.setCountry("hi!");
        java.lang.String str4 = user0.getFirstName();
        java.lang.String str5 = user0.getDob();
        java.lang.String str6 = user0.getLastName();
        user0.setFirstName("hi!");
        user0.setDob("");
        user0.setDob("");
        java.lang.String str13 = user0.getCountry();
        java.lang.String str14 = user0.getLastName();
        user0.setDob("");
        java.lang.String str17 = user0.getLastName();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(str17);
    }

    @Test
    public void test0711() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0711");
        User user0 = new User();
        java.lang.String str1 = user0.getPassword();
        java.lang.String str2 = user0.getPassword();
        java.lang.String str3 = user0.getFirstName();
        user0.setDob("hi!");
        java.lang.String str6 = user0.getEmail();
        java.lang.String str7 = user0.getFirstName();
        java.lang.String str8 = user0.getUsername();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test0712() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0712");
        User user0 = new User();
        java.lang.String str1 = user0.getFirstName();
        java.lang.String str2 = user0.getCountry();
        user0.setFirstName("");
        user0.setUsername("");
        java.lang.String str7 = user0.getDob();
        user0.setPassword("hi!");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test0713() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0713");
        User user0 = new User();
        java.lang.String str1 = user0.getPassword();
        user0.setUsername("");
        user0.setLastName("");
        java.lang.String str6 = user0.getUsername();
        java.lang.String str7 = user0.getLastName();
        java.lang.String str8 = user0.getCountry();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test0714() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0714");
        User user0 = new User();
        java.lang.String str1 = user0.getPassword();
        user0.setCountry("hi!");
        java.lang.String str4 = user0.getPassword();
        java.lang.String str5 = user0.getPassword();
        user0.setCountry("hi!");
        user0.setCountry("");
        user0.setCountry("");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
    }

    @Test
    public void test0715() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0715");
        User user0 = new User();
        java.lang.String str1 = user0.getPassword();
        java.lang.String str2 = user0.getPassword();
        java.lang.String str3 = user0.getFirstName();
        user0.setDob("hi!");
        java.lang.String str6 = user0.getEmail();
        user0.setPassword("hi!");
        user0.setUsername("hi!");
        java.lang.String str11 = user0.getEmail();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test0716() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0716");
        User user0 = new User();
        java.lang.String str1 = user0.getPassword();
        java.lang.String str2 = user0.getUsername();
        java.lang.String str3 = user0.getDob();
        user0.setLastName("hi!");
        user0.setCountry("");
        java.lang.String str8 = user0.getDob();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test0717() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0717");
        User user0 = new User();
        java.lang.String str1 = user0.getPassword();
        java.lang.String str2 = user0.getUsername();
        user0.setDob("");
        java.lang.String str5 = user0.getEmail();
        java.lang.String str6 = user0.getCountry();
        user0.setLastName("");
        java.lang.String str9 = user0.getLastName();
        java.lang.Class<?> wildcardClass10 = user0.getClass();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0718() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0718");
        User user0 = new User();
        java.lang.String str1 = user0.getPassword();
        user0.setCountry("hi!");
        java.lang.String str4 = user0.getUsername();
        user0.setPassword("");
        user0.setFirstName("hi!");
        user0.setCountry("");
        user0.setUsername("hi!");
        java.lang.String str13 = user0.getUsername();
        java.lang.String str14 = user0.getLastName();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertNull(str14);
    }

    @Test
    public void test0719() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0719");
        User user0 = new User();
        java.lang.String str1 = user0.getPassword();
        java.lang.String str2 = user0.getPassword();
        java.lang.String str3 = user0.getFirstName();
        user0.setDob("hi!");
        java.lang.String str6 = user0.getEmail();
        java.lang.String str7 = user0.getFirstName();
        user0.setLastName("hi!");
        user0.setDob("");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test0720() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0720");
        User user0 = new User();
        java.lang.String str1 = user0.getPassword();
        java.lang.String str2 = user0.getUsername();
        java.lang.String str3 = user0.getCountry();
        user0.setPassword("");
        user0.setLastName("");
        user0.setUsername("");
        user0.setLastName("hi!");
        user0.setDob("");
        java.lang.String str14 = user0.getCountry();
        user0.setFirstName("hi!");
        java.lang.String str17 = user0.getLastName();
        user0.setLastName("hi!");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
    }

    @Test
    public void test0721() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0721");
        User user0 = new User();
        java.lang.String str1 = user0.getPassword();
        java.lang.String str2 = user0.getPassword();
        java.lang.String str3 = user0.getPassword();
        java.lang.String str4 = user0.getDob();
        user0.setFirstName("hi!");
        user0.setCountry("hi!");
        user0.setDob("hi!");
        user0.setEmail("hi!");
        user0.setLastName("");
        user0.setCountry("hi!");
        user0.setFirstName("");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
    }

    @Test
    public void test0722() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0722");
        User user0 = new User();
        java.lang.String str1 = user0.getPassword();
        java.lang.String str2 = user0.getUsername();
        java.lang.String str3 = user0.getCountry();
        java.lang.String str4 = user0.getFirstName();
        user0.setLastName("");
        java.lang.String str7 = user0.getPassword();
        java.lang.String str8 = user0.getPassword();
        user0.setUsername("");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test0723() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0723");
        User user0 = new User();
        user0.setPassword("hi!");
        user0.setPassword("");
        user0.setUsername("");
        user0.setFirstName("");
        java.lang.String str9 = user0.getCountry();
        user0.setFirstName("hi!");
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test0724() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0724");
        User user0 = new User();
        java.lang.String str1 = user0.getPassword();
        java.lang.String str2 = user0.getPassword();
        user0.setLastName("hi!");
        java.lang.String str5 = user0.getCountry();
        java.lang.String str6 = user0.getEmail();
        java.lang.String str7 = user0.getDob();
        java.lang.String str8 = user0.getCountry();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test0725() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0725");
        User user0 = new User();
        java.lang.String str1 = user0.getPassword();
        java.lang.String str2 = user0.getUsername();
        java.lang.String str3 = user0.getEmail();
        user0.setFirstName("");
        user0.setUsername("");
        user0.setUsername("");
        java.lang.String str10 = user0.getEmail();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test0726() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0726");
        User user0 = new User();
        java.lang.String str1 = user0.getPassword();
        user0.setCountry("hi!");
        java.lang.String str4 = user0.getFirstName();
        java.lang.String str5 = user0.getDob();
        java.lang.String str6 = user0.getLastName();
        java.lang.String str7 = user0.getUsername();
        user0.setFirstName("hi!");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test0727() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0727");
        User user0 = new User();
        java.lang.String str1 = user0.getPassword();
        user0.setUsername("hi!");
        user0.setCountry("hi!");
        user0.setFirstName("");
        user0.setUsername("");
        java.lang.String str10 = user0.getLastName();
        java.lang.String str11 = user0.getLastName();
        user0.setDob("hi!");
        user0.setPassword("hi!");
        user0.setPassword("hi!");
        java.lang.Class<?> wildcardClass18 = user0.getClass();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test0728() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0728");
        User user0 = new User();
        user0.setPassword("hi!");
        user0.setPassword("");
        user0.setPassword("");
        java.lang.String str7 = user0.getLastName();
        user0.setUsername("");
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test0729() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0729");
        User user0 = new User();
        java.lang.String str1 = user0.getPassword();
        java.lang.String str2 = user0.getUsername();
        java.lang.String str3 = user0.getCountry();
        user0.setEmail("hi!");
        java.lang.String str6 = user0.getPassword();
        java.lang.String str7 = user0.getEmail();
        java.lang.String str8 = user0.getPassword();
        user0.setDob("hi!");
        user0.setDob("");
        java.lang.String str13 = user0.getFirstName();
        java.lang.String str14 = user0.getPassword();
        user0.setPassword("");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(str14);
    }

    @Test
    public void test0730() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0730");
        User user0 = new User();
        user0.setLastName("");
        user0.setDob("hi!");
        user0.setCountry("");
        java.lang.String str7 = user0.getLastName();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test0731() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0731");
        User user0 = new User();
        java.lang.String str1 = user0.getPassword();
        user0.setUsername("hi!");
        user0.setFirstName("");
        java.lang.String str6 = user0.getPassword();
        user0.setLastName("");
        java.lang.String str9 = user0.getDob();
        user0.setDob("");
        user0.setEmail("");
        java.lang.String str14 = user0.getLastName();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test0732() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0732");
        User user0 = new User();
        java.lang.String str1 = user0.getPassword();
        user0.setUsername("");
        user0.setFirstName("hi!");
        java.lang.String str6 = user0.getCountry();
        user0.setEmail("");
        user0.setUsername("hi!");
        user0.setFirstName("hi!");
        user0.setUsername("");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test0733() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0733");
        User user0 = new User();
        java.lang.String str1 = user0.getPassword();
        user0.setCountry("hi!");
        java.lang.String str4 = user0.getPassword();
        java.lang.String str5 = user0.getPassword();
        java.lang.String str6 = user0.getEmail();
        java.lang.String str7 = user0.getUsername();
        java.lang.String str8 = user0.getUsername();
        user0.setDob("");
        user0.setDob("");
        user0.setPassword("hi!");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test0734() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0734");
        User user0 = new User();
        java.lang.String str1 = user0.getPassword();
        user0.setCountry("hi!");
        java.lang.String str4 = user0.getUsername();
        user0.setPassword("");
        user0.setFirstName("");
        java.lang.String str9 = user0.getUsername();
        java.lang.String str10 = user0.getCountry();
        user0.setCountry("hi!");
        java.lang.String str13 = user0.getEmail();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNull(str13);
    }

    @Test
    public void test0735() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0735");
        User user0 = new User();
        java.lang.String str1 = user0.getPassword();
        user0.setCountry("hi!");
        java.lang.String str4 = user0.getFirstName();
        user0.setLastName("hi!");
        user0.setDob("hi!");
        java.lang.String str9 = user0.getFirstName();
        user0.setCountry("");
        java.lang.String str12 = user0.getFirstName();
        java.lang.String str13 = user0.getDob();
        java.lang.String str14 = user0.getUsername();
        java.lang.String str15 = user0.getEmail();
        java.lang.String str16 = user0.getEmail();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNull(str16);
    }

    @Test
    public void test0736() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0736");
        User user0 = new User();
        java.lang.String str1 = user0.getPassword();
        user0.setCountry("hi!");
        java.lang.String str4 = user0.getUsername();
        user0.setPassword("");
        user0.setFirstName("");
        java.lang.String str9 = user0.getLastName();
        user0.setCountry("hi!");
        java.lang.String str12 = user0.getCountry();
        java.lang.String str13 = user0.getLastName();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertNull(str13);
    }

    @Test
    public void test0737() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0737");
        User user0 = new User();
        user0.setPassword("hi!");
        user0.setPassword("");
        java.lang.String str5 = user0.getPassword();
        user0.setFirstName("");
        user0.setUsername("");
        user0.setCountry("hi!");
        java.lang.String str12 = user0.getDob();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test0738() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0738");
        User user0 = new User();
        user0.setPassword("hi!");
        user0.setPassword("");
        java.lang.String str5 = user0.getPassword();
        java.lang.String str6 = user0.getDob();
        java.lang.String str7 = user0.getDob();
        user0.setLastName("");
        user0.setLastName("hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test0739() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0739");
        User user0 = new User();
        java.lang.String str1 = user0.getPassword();
        user0.setCountry("hi!");
        java.lang.String str4 = user0.getFirstName();
        java.lang.String str5 = user0.getDob();
        java.lang.String str6 = user0.getLastName();
        user0.setFirstName("hi!");
        user0.setDob("hi!");
        user0.setUsername("");
        java.lang.String str13 = user0.getLastName();
        user0.setPassword("");
        user0.setDob("");
        java.lang.String str18 = user0.getPassword();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
    }

    @Test
    public void test0740() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0740");
        User user0 = new User();
        java.lang.String str1 = user0.getPassword();
        java.lang.String str2 = user0.getUsername();
        java.lang.String str3 = user0.getEmail();
        user0.setFirstName("");
        user0.setUsername("");
        java.lang.String str8 = user0.getFirstName();
        user0.setFirstName("hi!");
        java.lang.String str11 = user0.getFirstName();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
    }

    @Test
    public void test0741() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0741");
        User user0 = new User();
        java.lang.String str1 = user0.getPassword();
        user0.setUsername("hi!");
        user0.setFirstName("");
        java.lang.String str6 = user0.getPassword();
        user0.setEmail("hi!");
        java.lang.String str9 = user0.getEmail();
        user0.setUsername("hi!");
        java.lang.String str12 = user0.getFirstName();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test0742() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0742");
        User user0 = new User();
        java.lang.String str1 = user0.getPassword();
        java.lang.String str2 = user0.getPassword();
        user0.setLastName("hi!");
        java.lang.String str5 = user0.getCountry();
        user0.setLastName("hi!");
        java.lang.String str8 = user0.getDob();
        user0.setDob("");
        java.lang.String str11 = user0.getUsername();
        user0.setCountry("");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test0743() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0743");
        User user0 = new User();
        java.lang.String str1 = user0.getPassword();
        user0.setCountry("hi!");
        java.lang.String str4 = user0.getFirstName();
        user0.setLastName("hi!");
        user0.setDob("hi!");
        java.lang.String str9 = user0.getFirstName();
        java.lang.String str10 = user0.getDob();
        java.lang.String str11 = user0.getLastName();
        user0.setUsername("");
        user0.setDob("");
        user0.setLastName("hi!");
        java.lang.String str18 = user0.getPassword();
        java.lang.String str19 = user0.getUsername();
        user0.setPassword("");
        user0.setFirstName("hi!");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
    }

    @Test
    public void test0744() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0744");
        User user0 = new User();
        java.lang.String str1 = user0.getPassword();
        user0.setCountry("hi!");
        java.lang.String str4 = user0.getFirstName();
        java.lang.String str5 = user0.getDob();
        java.lang.String str6 = user0.getLastName();
        user0.setFirstName("hi!");
        java.lang.String str9 = user0.getUsername();
        java.lang.String str10 = user0.getEmail();
        java.lang.String str11 = user0.getDob();
        java.lang.String str12 = user0.getPassword();
        user0.setPassword("hi!");
        user0.setCountry("hi!");
        java.lang.String str17 = user0.getEmail();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str17);
    }

    @Test
    public void test0745() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0745");
        User user0 = new User();
        java.lang.String str1 = user0.getPassword();
        java.lang.String str2 = user0.getPassword();
        java.lang.String str3 = user0.getFirstName();
        user0.setDob("hi!");
        java.lang.String str6 = user0.getDob();
        java.lang.String str7 = user0.getEmail();
        user0.setUsername("");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test0746() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0746");
        User user0 = new User();
        java.lang.String str1 = user0.getPassword();
        user0.setCountry("hi!");
        java.lang.String str4 = user0.getFirstName();
        java.lang.String str5 = user0.getDob();
        java.lang.String str6 = user0.getLastName();
        user0.setFirstName("hi!");
        user0.setDob("hi!");
        user0.setUsername("");
        java.lang.String str13 = user0.getLastName();
        user0.setLastName("");
        java.lang.String str16 = user0.getDob();
        java.lang.String str17 = user0.getLastName();
        user0.setDob("");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
    }

    @Test
    public void test0747() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0747");
        User user0 = new User();
        java.lang.String str1 = user0.getPassword();
        user0.setCountry("hi!");
        java.lang.String str4 = user0.getFirstName();
        java.lang.String str5 = user0.getDob();
        java.lang.String str6 = user0.getLastName();
        user0.setFirstName("hi!");
        java.lang.String str9 = user0.getUsername();
        java.lang.String str10 = user0.getEmail();
        java.lang.String str11 = user0.getDob();
        user0.setCountry("hi!");
        java.lang.String str14 = user0.getCountry();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
    }

    @Test
    public void test0748() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0748");
        User user0 = new User();
        java.lang.String str1 = user0.getPassword();
        java.lang.String str2 = user0.getPassword();
        java.lang.String str3 = user0.getFirstName();
        user0.setDob("hi!");
        java.lang.String str6 = user0.getEmail();
        user0.setPassword("hi!");
        user0.setDob("");
        user0.setPassword("hi!");
        java.lang.String str13 = user0.getUsername();
        user0.setEmail("");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str13);
    }

    @Test
    public void test0749() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0749");
        User user0 = new User();
        user0.setPassword("hi!");
        user0.setPassword("");
        java.lang.String str5 = user0.getPassword();
        user0.setCountry("hi!");
        java.lang.String str8 = user0.getPassword();
        user0.setFirstName("hi!");
        java.lang.String str11 = user0.getUsername();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test0750() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0750");
        User user0 = new User();
        java.lang.String str1 = user0.getPassword();
        java.lang.String str2 = user0.getPassword();
        user0.setUsername("");
        java.lang.String str5 = user0.getCountry();
        java.lang.String str6 = user0.getCountry();
        java.lang.String str7 = user0.getDob();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test0751() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0751");
        User user0 = new User();
        java.lang.String str1 = user0.getPassword();
        user0.setCountry("hi!");
        java.lang.String str4 = user0.getFirstName();
        java.lang.String str5 = user0.getDob();
        java.lang.String str6 = user0.getLastName();
        user0.setFirstName("hi!");
        user0.setDob("hi!");
        java.lang.String str11 = user0.getPassword();
        java.lang.String str12 = user0.getUsername();
        java.lang.String str13 = user0.getLastName();
        user0.setEmail("hi!");
        java.lang.String str16 = user0.getEmail();
        user0.setUsername("");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
    }

    @Test
    public void test0752() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0752");
        User user0 = new User();
        java.lang.String str1 = user0.getPassword();
        java.lang.String str2 = user0.getPassword();
        java.lang.String str3 = user0.getFirstName();
        user0.setDob("hi!");
        java.lang.String str6 = user0.getEmail();
        user0.setPassword("hi!");
        user0.setDob("");
        java.lang.String str11 = user0.getCountry();
        java.lang.String str12 = user0.getLastName();
        user0.setEmail("hi!");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test0753() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0753");
        User user0 = new User();
        java.lang.String str1 = user0.getPassword();
        java.lang.String str2 = user0.getUsername();
        java.lang.String str3 = user0.getEmail();
        user0.setFirstName("");
        user0.setLastName("hi!");
        java.lang.String str8 = user0.getFirstName();
        user0.setDob("");
        java.lang.String str11 = user0.getEmail();
        user0.setUsername("hi!");
        java.lang.String str14 = user0.getPassword();
        java.lang.String str15 = user0.getDob();
        java.lang.String str16 = user0.getUsername();
        java.lang.Class<?> wildcardClass17 = user0.getClass();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test0754() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0754");
        User user0 = new User();
        java.lang.String str1 = user0.getPassword();
        user0.setCountry("hi!");
        java.lang.String str4 = user0.getFirstName();
        user0.setLastName("hi!");
        user0.setDob("hi!");
        java.lang.String str9 = user0.getFirstName();
        user0.setCountry("");
        user0.setEmail("");
        user0.setEmail("");
        java.lang.String str16 = user0.getDob();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
    }

    @Test
    public void test0755() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0755");
        User user0 = new User();
        java.lang.String str1 = user0.getPassword();
        user0.setCountry("hi!");
        java.lang.String str4 = user0.getFirstName();
        java.lang.String str5 = user0.getDob();
        java.lang.String str6 = user0.getLastName();
        user0.setFirstName("hi!");
        user0.setDob("");
        user0.setDob("");
        java.lang.String str13 = user0.getCountry();
        java.lang.String str14 = user0.getLastName();
        java.lang.String str15 = user0.getCountry();
        user0.setCountry("");
        user0.setUsername("hi!");
        user0.setFirstName("");
        java.lang.String str22 = user0.getLastName();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertNull(str22);
    }

    @Test
    public void test0756() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0756");
        User user0 = new User();
        java.lang.String str1 = user0.getPassword();
        user0.setCountry("hi!");
        java.lang.String str4 = user0.getFirstName();
        user0.setLastName("hi!");
        user0.setDob("hi!");
        java.lang.String str9 = user0.getFirstName();
        user0.setCountry("");
        java.lang.String str12 = user0.getFirstName();
        java.lang.String str13 = user0.getDob();
        user0.setLastName("");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
    }

    @Test
    public void test0757() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0757");
        User user0 = new User();
        user0.setPassword("hi!");
        user0.setPassword("");
        java.lang.String str5 = user0.getPassword();
        user0.setCountry("hi!");
        user0.setLastName("hi!");
        user0.setFirstName("");
        java.lang.String str12 = user0.getFirstName();
        java.lang.String str13 = user0.getUsername();
        java.lang.String str14 = user0.getCountry();
        java.lang.String str15 = user0.getDob();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertNull(str15);
    }

    @Test
    public void test0758() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0758");
        User user0 = new User();
        user0.setPassword("hi!");
        user0.setPassword("");
        java.lang.String str5 = user0.getPassword();
        java.lang.String str6 = user0.getEmail();
        user0.setEmail("");
        user0.setPassword("hi!");
        java.lang.Class<?> wildcardClass11 = user0.getClass();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0759() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0759");
        User user0 = new User();
        java.lang.String str1 = user0.getFirstName();
        user0.setPassword("");
        java.lang.String str4 = user0.getEmail();
        java.lang.Class<?> wildcardClass5 = user0.getClass();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0760() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0760");
        User user0 = new User();
        java.lang.String str1 = user0.getFirstName();
        java.lang.String str2 = user0.getCountry();
        user0.setFirstName("");
        user0.setUsername("");
        java.lang.String str7 = user0.getEmail();
        user0.setFirstName("");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test0761() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0761");
        User user0 = new User();
        user0.setUsername("");
        java.lang.String str3 = user0.getUsername();
        user0.setCountry("hi!");
        user0.setFirstName("");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test0762() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0762");
        User user0 = new User();
        user0.setPassword("hi!");
        user0.setPassword("");
        java.lang.String str5 = user0.getPassword();
        user0.setFirstName("");
        java.lang.String str8 = user0.getUsername();
        java.lang.String str9 = user0.getLastName();
        user0.setUsername("hi!");
        user0.setPassword("hi!");
        user0.setEmail("hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test0763() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0763");
        User user0 = new User();
        java.lang.String str1 = user0.getPassword();
        user0.setCountry("hi!");
        java.lang.String str4 = user0.getFirstName();
        java.lang.String str5 = user0.getPassword();
        user0.setDob("");
        user0.setEmail("hi!");
        user0.setLastName("");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
    }

    @Test
    public void test0764() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0764");
        User user0 = new User();
        java.lang.String str1 = user0.getPassword();
        user0.setCountry("hi!");
        java.lang.String str4 = user0.getFirstName();
        java.lang.String str5 = user0.getDob();
        java.lang.String str6 = user0.getLastName();
        user0.setFirstName("hi!");
        java.lang.String str9 = user0.getUsername();
        java.lang.String str10 = user0.getEmail();
        java.lang.String str11 = user0.getLastName();
        java.lang.String str12 = user0.getFirstName();
        user0.setDob("");
        java.lang.String str15 = user0.getLastName();
        java.lang.String str16 = user0.getFirstName();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
    }

    @Test
    public void test0765() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0765");
        User user0 = new User();
        java.lang.String str1 = user0.getPassword();
        user0.setCountry("hi!");
        java.lang.String str4 = user0.getFirstName();
        user0.setLastName("hi!");
        user0.setDob("hi!");
        java.lang.String str9 = user0.getFirstName();
        user0.setPassword("");
        java.lang.String str12 = user0.getCountry();
        java.lang.String str13 = user0.getFirstName();
        java.lang.String str14 = user0.getEmail();
        java.lang.String str15 = user0.getUsername();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(str15);
    }

    @Test
    public void test0766() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0766");
        User user0 = new User();
        java.lang.String str1 = user0.getFirstName();
        java.lang.String str2 = user0.getCountry();
        user0.setFirstName("");
        user0.setUsername("");
        user0.setUsername("hi!");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
    }

    @Test
    public void test0767() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0767");
        User user0 = new User();
        java.lang.String str1 = user0.getPassword();
        java.lang.String str2 = user0.getUsername();
        java.lang.String str3 = user0.getEmail();
        user0.setUsername("");
        java.lang.String str6 = user0.getFirstName();
        user0.setLastName("");
        user0.setDob("hi!");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test0768() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0768");
        User user0 = new User();
        user0.setPassword("hi!");
        java.lang.String str3 = user0.getPassword();
        java.lang.String str4 = user0.getFirstName();
        java.lang.String str5 = user0.getLastName();
        user0.setCountry("");
        user0.setCountry("");
        user0.setPassword("hi!");
        user0.setPassword("hi!");
        user0.setEmail("hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
    }

    @Test
    public void test0769() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0769");
        User user0 = new User();
        java.lang.String str1 = user0.getPassword();
        java.lang.String str2 = user0.getPassword();
        java.lang.String str3 = user0.getFirstName();
        user0.setDob("hi!");
        java.lang.String str6 = user0.getDob();
        java.lang.String str7 = user0.getFirstName();
        user0.setEmail("");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test0770() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0770");
        User user0 = new User();
        java.lang.String str1 = user0.getFirstName();
        java.lang.String str2 = user0.getCountry();
        user0.setFirstName("");
        java.lang.String str5 = user0.getFirstName();
        java.lang.String str6 = user0.getEmail();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test0771() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0771");
        User user0 = new User();
        user0.setPassword("hi!");
        user0.setPassword("");
        java.lang.String str5 = user0.getPassword();
        user0.setCountry("hi!");
        user0.setLastName("hi!");
        user0.setFirstName("");
        java.lang.String str12 = user0.getFirstName();
        java.lang.String str13 = user0.getCountry();
        user0.setCountry("hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
    }

    @Test
    public void test0772() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0772");
        User user0 = new User();
        java.lang.String str1 = user0.getPassword();
        java.lang.String str2 = user0.getUsername();
        java.lang.String str3 = user0.getEmail();
        user0.setFirstName("");
        user0.setLastName("hi!");
        user0.setUsername("hi!");
        java.lang.String str10 = user0.getUsername();
        user0.setLastName("");
        user0.setEmail("hi!");
        user0.setPassword("hi!");
        user0.setCountry("");
        user0.setLastName("");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
    }

    @Test
    public void test0773() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0773");
        User user0 = new User();
        java.lang.String str1 = user0.getPassword();
        user0.setCountry("hi!");
        java.lang.String str4 = user0.getFirstName();
        java.lang.String str5 = user0.getDob();
        java.lang.String str6 = user0.getLastName();
        user0.setFirstName("hi!");
        java.lang.String str9 = user0.getUsername();
        java.lang.String str10 = user0.getEmail();
        java.lang.String str11 = user0.getLastName();
        java.lang.String str12 = user0.getCountry();
        user0.setDob("");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
    }

    @Test
    public void test0774() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0774");
        User user0 = new User();
        user0.setPassword("hi!");
        user0.setPassword("");
        java.lang.String str5 = user0.getPassword();
        java.lang.String str6 = user0.getEmail();
        user0.setFirstName("hi!");
        java.lang.String str9 = user0.getFirstName();
        java.lang.Class<?> wildcardClass10 = user0.getClass();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0775() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0775");
        User user0 = new User();
        java.lang.String str1 = user0.getPassword();
        user0.setCountry("hi!");
        java.lang.String str4 = user0.getUsername();
        user0.setPassword("");
        user0.setFirstName("hi!");
        user0.setDob("hi!");
        user0.setFirstName("");
        user0.setPassword("hi!");
        user0.setCountry("hi!");
        java.lang.String str17 = user0.getPassword();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
    }

    @Test
    public void test0776() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0776");
        User user0 = new User();
        java.lang.String str1 = user0.getPassword();
        java.lang.String str2 = user0.getPassword();
        java.lang.String str3 = user0.getFirstName();
        user0.setPassword("");
        user0.setFirstName("");
        user0.setPassword("hi!");
        user0.setEmail("hi!");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test0777() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0777");
        User user0 = new User();
        user0.setPassword("hi!");
        user0.setPassword("");
        java.lang.String str5 = user0.getPassword();
        java.lang.String str6 = user0.getEmail();
        user0.setEmail("");
        user0.setFirstName("");
        user0.setDob("");
        user0.setDob("hi!");
        java.lang.String str15 = user0.getEmail();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
    }

    @Test
    public void test0778() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0778");
        User user0 = new User();
        java.lang.String str1 = user0.getPassword();
        java.lang.String str2 = user0.getUsername();
        java.lang.String str3 = user0.getEmail();
        user0.setFirstName("");
        user0.setLastName("hi!");
        user0.setUsername("hi!");
        java.lang.String str10 = user0.getUsername();
        user0.setDob("hi!");
        user0.setUsername("");
        java.lang.String str15 = user0.getPassword();
        java.lang.String str16 = user0.getCountry();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNull(str16);
    }

    @Test
    public void test0779() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0779");
        User user0 = new User();
        java.lang.String str1 = user0.getPassword();
        user0.setCountry("hi!");
        java.lang.String str4 = user0.getFirstName();
        java.lang.String str5 = user0.getDob();
        java.lang.String str6 = user0.getLastName();
        user0.setFirstName("hi!");
        user0.setUsername("");
        java.lang.String str11 = user0.getPassword();
        java.lang.String str12 = user0.getEmail();
        java.lang.String str13 = user0.getLastName();
        user0.setDob("");
        user0.setUsername("");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str13);
    }

    @Test
    public void test0780() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0780");
        User user0 = new User();
        user0.setPassword("hi!");
        user0.setPassword("");
        user0.setUsername("");
        user0.setLastName("");
        java.lang.String str9 = user0.getEmail();
        java.lang.Class<?> wildcardClass10 = user0.getClass();
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0781() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0781");
        User user0 = new User();
        java.lang.String str1 = user0.getPassword();
        java.lang.String str2 = user0.getUsername();
        user0.setDob("");
        java.lang.String str5 = user0.getEmail();
        java.lang.String str6 = user0.getPassword();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test0782() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0782");
        User user0 = new User();
        java.lang.String str1 = user0.getPassword();
        java.lang.String str2 = user0.getUsername();
        java.lang.String str3 = user0.getCountry();
        user0.setEmail("hi!");
        java.lang.String str6 = user0.getPassword();
        java.lang.String str7 = user0.getEmail();
        java.lang.String str8 = user0.getPassword();
        user0.setDob("hi!");
        user0.setPassword("hi!");
        java.lang.String str13 = user0.getPassword();
        java.lang.String str14 = user0.getFirstName();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertNull(str14);
    }

    @Test
    public void test0783() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0783");
        User user0 = new User();
        java.lang.String str1 = user0.getPassword();
        java.lang.String str2 = user0.getPassword();
        java.lang.String str3 = user0.getPassword();
        user0.setLastName("");
        user0.setUsername("hi!");
        user0.setUsername("");
        user0.setFirstName("");
        java.lang.String str12 = user0.getFirstName();
        user0.setPassword("hi!");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test0784() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0784");
        User user0 = new User();
        java.lang.String str1 = user0.getPassword();
        user0.setCountry("hi!");
        java.lang.String str4 = user0.getFirstName();
        user0.setLastName("hi!");
        user0.setDob("hi!");
        java.lang.String str9 = user0.getFirstName();
        user0.setPassword("");
        java.lang.String str12 = user0.getCountry();
        java.lang.String str13 = user0.getFirstName();
        java.lang.String str14 = user0.getEmail();
        user0.setCountry("");
        user0.setCountry("hi!");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(str14);
    }

    @Test
    public void test0785() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0785");
        User user0 = new User();
        java.lang.String str1 = user0.getPassword();
        java.lang.String str2 = user0.getPassword();
        java.lang.String str3 = user0.getFirstName();
        user0.setDob("hi!");
        java.lang.String str6 = user0.getEmail();
        java.lang.String str7 = user0.getFirstName();
        user0.setLastName("");
        java.lang.Class<?> wildcardClass10 = user0.getClass();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0786() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0786");
        User user0 = new User();
        java.lang.String str1 = user0.getPassword();
        java.lang.String str2 = user0.getUsername();
        java.lang.String str3 = user0.getEmail();
        user0.setUsername("");
        java.lang.String str6 = user0.getPassword();
        java.lang.String str7 = user0.getDob();
        user0.setFirstName("");
        java.lang.String str10 = user0.getFirstName();
        java.lang.Class<?> wildcardClass11 = user0.getClass();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0787() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0787");
        User user0 = new User();
        java.lang.String str1 = user0.getPassword();
        user0.setCountry("hi!");
        java.lang.String str4 = user0.getFirstName();
        java.lang.String str5 = user0.getFirstName();
        java.lang.String str6 = user0.getLastName();
        user0.setLastName("");
        java.lang.String str9 = user0.getLastName();
        user0.setUsername("hi!");
        user0.setUsername("");
        java.lang.String str14 = user0.getPassword();
        user0.setPassword("hi!");
        java.lang.String str17 = user0.getCountry();
        user0.setFirstName("hi!");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
    }

    @Test
    public void test0788() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0788");
        User user0 = new User();
        java.lang.String str1 = user0.getPassword();
        user0.setCountry("hi!");
        java.lang.String str4 = user0.getFirstName();
        java.lang.String str5 = user0.getDob();
        java.lang.String str6 = user0.getLastName();
        user0.setFirstName("hi!");
        user0.setDob("hi!");
        user0.setUsername("");
        java.lang.String str13 = user0.getUsername();
        java.lang.String str14 = user0.getFirstName();
        user0.setEmail("hi!");
        java.lang.Class<?> wildcardClass17 = user0.getClass();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test0789() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0789");
        User user0 = new User();
        java.lang.String str1 = user0.getPassword();
        java.lang.String str2 = user0.getUsername();
        java.lang.String str3 = user0.getEmail();
        user0.setFirstName("");
        user0.setLastName("hi!");
        java.lang.String str8 = user0.getFirstName();
        java.lang.String str9 = user0.getUsername();
        user0.setUsername("hi!");
        user0.setUsername("hi!");
        java.lang.String str14 = user0.getPassword();
        user0.setUsername("");
        java.lang.String str17 = user0.getCountry();
        user0.setPassword("");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(str17);
    }

    @Test
    public void test0790() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0790");
        User user0 = new User();
        java.lang.String str1 = user0.getPassword();
        user0.setCountry("hi!");
        java.lang.String str4 = user0.getFirstName();
        user0.setLastName("hi!");
        user0.setDob("hi!");
        java.lang.String str9 = user0.getFirstName();
        java.lang.String str10 = user0.getDob();
        java.lang.String str11 = user0.getLastName();
        java.lang.String str12 = user0.getLastName();
        java.lang.String str13 = user0.getUsername();
        user0.setFirstName("hi!");
        java.lang.String str16 = user0.getUsername();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(str16);
    }

    @Test
    public void test0791() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0791");
        User user0 = new User();
        java.lang.String str1 = user0.getPassword();
        user0.setUsername("hi!");
        user0.setFirstName("");
        java.lang.String str6 = user0.getPassword();
        user0.setEmail("hi!");
        user0.setPassword("");
        java.lang.String str11 = user0.getDob();
        java.lang.String str12 = user0.getUsername();
        user0.setUsername("");
        java.lang.String str15 = user0.getUsername();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
    }

    @Test
    public void test0792() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0792");
        User user0 = new User();
        java.lang.String str1 = user0.getPassword();
        user0.setCountry("hi!");
        java.lang.String str4 = user0.getFirstName();
        java.lang.String str5 = user0.getDob();
        java.lang.String str6 = user0.getLastName();
        user0.setFirstName("hi!");
        user0.setDob("");
        user0.setDob("");
        user0.setPassword("hi!");
        java.lang.String str15 = user0.getCountry();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
    }

    @Test
    public void test0793() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0793");
        User user0 = new User();
        java.lang.String str1 = user0.getPassword();
        java.lang.String str2 = user0.getPassword();
        java.lang.String str3 = user0.getPassword();
        java.lang.String str4 = user0.getDob();
        user0.setFirstName("hi!");
        user0.setDob("");
        java.lang.String str9 = user0.getUsername();
        java.lang.String str10 = user0.getDob();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test0794() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0794");
        User user0 = new User();
        java.lang.String str1 = user0.getPassword();
        java.lang.String str2 = user0.getUsername();
        java.lang.String str3 = user0.getCountry();
        user0.setEmail("hi!");
        java.lang.String str6 = user0.getPassword();
        java.lang.String str7 = user0.getEmail();
        java.lang.String str8 = user0.getPassword();
        user0.setDob("hi!");
        user0.setCountry("hi!");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test0795() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0795");
        User user0 = new User();
        java.lang.String str1 = user0.getPassword();
        user0.setCountry("hi!");
        java.lang.String str4 = user0.getFirstName();
        java.lang.String str5 = user0.getDob();
        java.lang.String str6 = user0.getLastName();
        user0.setFirstName("hi!");
        java.lang.String str9 = user0.getUsername();
        user0.setPassword("");
        user0.setFirstName("hi!");
        java.lang.String str14 = user0.getDob();
        java.lang.String str15 = user0.getPassword();
        java.lang.String str16 = user0.getFirstName();
        user0.setCountry("");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
    }

    @Test
    public void test0796() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0796");
        User user0 = new User();
        java.lang.String str1 = user0.getPassword();
        java.lang.String str2 = user0.getPassword();
        user0.setLastName("hi!");
        java.lang.String str5 = user0.getCountry();
        user0.setCountry("hi!");
        java.lang.String str8 = user0.getPassword();
        user0.setDob("hi!");
        user0.setPassword("hi!");
        user0.setPassword("");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test0797() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0797");
        User user0 = new User();
        java.lang.String str1 = user0.getPassword();
        user0.setCountry("hi!");
        java.lang.String str4 = user0.getFirstName();
        user0.setLastName("hi!");
        user0.setDob("hi!");
        java.lang.String str9 = user0.getFirstName();
        java.lang.String str10 = user0.getDob();
        java.lang.String str11 = user0.getCountry();
        user0.setUsername("");
        java.lang.String str14 = user0.getLastName();
        java.lang.String str15 = user0.getDob();
        java.lang.String str16 = user0.getCountry();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
    }

    @Test
    public void test0798() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0798");
        User user0 = new User();
        java.lang.String str1 = user0.getPassword();
        user0.setUsername("");
        user0.setLastName("");
        user0.setEmail("hi!");
        user0.setFirstName("hi!");
        java.lang.String str10 = user0.getCountry();
        user0.setLastName("hi!");
        java.lang.String str13 = user0.getFirstName();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
    }

    @Test
    public void test0799() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0799");
        User user0 = new User();
        java.lang.String str1 = user0.getPassword();
        java.lang.String str2 = user0.getUsername();
        java.lang.String str3 = user0.getCountry();
        java.lang.String str4 = user0.getPassword();
        java.lang.String str5 = user0.getUsername();
        user0.setFirstName("");
        java.lang.String str8 = user0.getFirstName();
        java.lang.Class<?> wildcardClass9 = user0.getClass();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0800() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0800");
        User user0 = new User();
        java.lang.String str1 = user0.getPassword();
        java.lang.String str2 = user0.getUsername();
        java.lang.String str3 = user0.getEmail();
        user0.setFirstName("");
        user0.setLastName("hi!");
        java.lang.String str8 = user0.getFirstName();
        user0.setDob("");
        java.lang.String str11 = user0.getEmail();
        user0.setUsername("hi!");
        user0.setPassword("");
        java.lang.String str16 = user0.getLastName();
        java.lang.String str17 = user0.getUsername();
        user0.setPassword("");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
    }

    @Test
    public void test0801() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0801");
        User user0 = new User();
        user0.setPassword("hi!");
        java.lang.String str3 = user0.getPassword();
        java.lang.String str4 = user0.getPassword();
        user0.setUsername("hi!");
        user0.setFirstName("hi!");
        user0.setLastName("");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
    }

    @Test
    public void test0802() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0802");
        User user0 = new User();
        java.lang.String str1 = user0.getPassword();
        user0.setUsername("hi!");
        user0.setFirstName("");
        java.lang.String str6 = user0.getPassword();
        user0.setEmail("hi!");
        user0.setPassword("");
        user0.setCountry("");
        java.lang.String str13 = user0.getCountry();
        java.lang.String str14 = user0.getUsername();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
    }

    @Test
    public void test0803() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0803");
        User user0 = new User();
        java.lang.String str1 = user0.getPassword();
        user0.setCountry("hi!");
        java.lang.String str4 = user0.getFirstName();
        java.lang.String str5 = user0.getDob();
        java.lang.String str6 = user0.getLastName();
        user0.setFirstName("hi!");
        user0.setUsername("");
        java.lang.String str11 = user0.getLastName();
        java.lang.String str12 = user0.getUsername();
        user0.setLastName("hi!");
        java.lang.String str15 = user0.getPassword();
        java.lang.String str16 = user0.getDob();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNull(str16);
    }

    @Test
    public void test0804() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0804");
        User user0 = new User();
        java.lang.String str1 = user0.getPassword();
        user0.setCountry("hi!");
        java.lang.String str4 = user0.getFirstName();
        java.lang.String str5 = user0.getDob();
        java.lang.String str6 = user0.getLastName();
        java.lang.String str7 = user0.getUsername();
        user0.setUsername("");
        java.lang.String str10 = user0.getUsername();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test0805() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0805");
        User user0 = new User();
        java.lang.String str1 = user0.getPassword();
        java.lang.String str2 = user0.getPassword();
        java.lang.String str3 = user0.getPassword();
        user0.setLastName("");
        java.lang.String str6 = user0.getUsername();
        java.lang.String str7 = user0.getDob();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test0806() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0806");
        User user0 = new User();
        user0.setPassword("hi!");
        user0.setPassword("");
        java.lang.String str5 = user0.getPassword();
        user0.setFirstName("");
        user0.setFirstName("");
        user0.setUsername("");
        java.lang.String str12 = user0.getFirstName();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test0807() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0807");
        User user0 = new User();
        java.lang.String str1 = user0.getPassword();
        user0.setCountry("hi!");
        java.lang.String str4 = user0.getFirstName();
        user0.setLastName("hi!");
        user0.setDob("hi!");
        java.lang.String str9 = user0.getFirstName();
        java.lang.String str10 = user0.getDob();
        java.lang.String str11 = user0.getLastName();
        java.lang.String str12 = user0.getLastName();
        java.lang.String str13 = user0.getUsername();
        user0.setFirstName("hi!");
        user0.setCountry("hi!");
        user0.setDob("");
        user0.setPassword("hi!");
        java.lang.String str22 = user0.getUsername();
        java.lang.String str23 = user0.getFirstName();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(str22);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "hi!" + "'", str23, "hi!");
    }

    @Test
    public void test0808() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0808");
        User user0 = new User();
        java.lang.String str1 = user0.getPassword();
        user0.setCountry("hi!");
        java.lang.String str4 = user0.getFirstName();
        java.lang.String str5 = user0.getDob();
        java.lang.String str6 = user0.getLastName();
        user0.setFirstName("hi!");
        user0.setUsername("");
        java.lang.String str11 = user0.getLastName();
        user0.setUsername("hi!");
        user0.setDob("");
        java.lang.String str16 = user0.getPassword();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str16);
    }

    @Test
    public void test0809() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0809");
        User user0 = new User();
        java.lang.String str1 = user0.getPassword();
        user0.setUsername("");
        user0.setFirstName("hi!");
        user0.setDob("");
        user0.setEmail("");
        java.lang.String str10 = user0.getPassword();
        java.lang.Class<?> wildcardClass11 = user0.getClass();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0810() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0810");
        User user0 = new User();
        java.lang.String str1 = user0.getPassword();
        java.lang.String str2 = user0.getUsername();
        java.lang.String str3 = user0.getEmail();
        user0.setFirstName("");
        user0.setLastName("hi!");
        java.lang.String str8 = user0.getFirstName();
        java.lang.String str9 = user0.getUsername();
        user0.setUsername("hi!");
        user0.setUsername("hi!");
        java.lang.String str14 = user0.getPassword();
        user0.setUsername("");
        java.lang.Class<?> wildcardClass17 = user0.getClass();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test0811() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0811");
        User user0 = new User();
        user0.setPassword("hi!");
        user0.setPassword("");
        java.lang.String str5 = user0.getPassword();
        java.lang.String str6 = user0.getEmail();
        user0.setFirstName("hi!");
        user0.setFirstName("hi!");
        java.lang.String str11 = user0.getPassword();
        user0.setDob("hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test0812() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0812");
        User user0 = new User();
        java.lang.String str1 = user0.getPassword();
        user0.setCountry("hi!");
        java.lang.String str4 = user0.getFirstName();
        user0.setLastName("hi!");
        user0.setDob("hi!");
        java.lang.String str9 = user0.getFirstName();
        user0.setCountry("");
        user0.setEmail("");
        user0.setPassword("");
        user0.setFirstName("hi!");
        java.lang.String str18 = user0.getCountry();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
    }

    @Test
    public void test0813() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0813");
        User user0 = new User();
        java.lang.String str1 = user0.getPassword();
        user0.setCountry("hi!");
        java.lang.String str4 = user0.getFirstName();
        java.lang.String str5 = user0.getDob();
        java.lang.String str6 = user0.getLastName();
        user0.setLastName("");
        user0.setDob("hi!");
        java.lang.String str11 = user0.getCountry();
        user0.setEmail("");
        user0.setDob("");
        user0.setFirstName("hi!");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
    }

    @Test
    public void test0814() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0814");
        User user0 = new User();
        java.lang.String str1 = user0.getPassword();
        user0.setUsername("hi!");
        user0.setFirstName("");
        java.lang.String str6 = user0.getPassword();
        user0.setLastName("");
        java.lang.String str9 = user0.getDob();
        user0.setFirstName("");
        java.lang.String str12 = user0.getFirstName();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test0815() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0815");
        User user0 = new User();
        java.lang.String str1 = user0.getPassword();
        user0.setCountry("hi!");
        java.lang.String str4 = user0.getFirstName();
        user0.setLastName("hi!");
        user0.setDob("hi!");
        java.lang.String str9 = user0.getEmail();
        user0.setLastName("");
        user0.setCountry("");
        java.lang.String str14 = user0.getPassword();
        java.lang.Class<?> wildcardClass15 = user0.getClass();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0816() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0816");
        User user0 = new User();
        java.lang.String str1 = user0.getPassword();
        user0.setCountry("hi!");
        user0.setUsername("hi!");
        user0.setCountry("");
        user0.setLastName("hi!");
        java.lang.String str10 = user0.getCountry();
        user0.setLastName("");
        java.lang.String str13 = user0.getUsername();
        java.lang.String str14 = user0.getFirstName();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertNull(str14);
    }

    @Test
    public void test0817() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0817");
        User user0 = new User();
        java.lang.String str1 = user0.getPassword();
        user0.setCountry("hi!");
        user0.setUsername("hi!");
        user0.setCountry("");
        java.lang.String str8 = user0.getFirstName();
        user0.setPassword("");
        java.lang.String str11 = user0.getLastName();
        user0.setUsername("");
        user0.setCountry("hi!");
        java.lang.Class<?> wildcardClass16 = user0.getClass();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0818() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0818");
        User user0 = new User();
        java.lang.String str1 = user0.getPassword();
        user0.setUsername("hi!");
        user0.setFirstName("");
        java.lang.String str6 = user0.getPassword();
        user0.setEmail("hi!");
        java.lang.String str9 = user0.getEmail();
        user0.setUsername("hi!");
        user0.setLastName("");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
    }

    @Test
    public void test0819() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0819");
        User user0 = new User();
        java.lang.String str1 = user0.getPassword();
        java.lang.String str2 = user0.getUsername();
        java.lang.String str3 = user0.getEmail();
        user0.setUsername("");
        java.lang.String str6 = user0.getFirstName();
        java.lang.String str7 = user0.getCountry();
        user0.setUsername("");
        java.lang.String str10 = user0.getLastName();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test0820() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0820");
        User user0 = new User();
        user0.setPassword("hi!");
        user0.setPassword("");
        java.lang.String str5 = user0.getPassword();
        java.lang.String str6 = user0.getDob();
        java.lang.String str7 = user0.getLastName();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test0821() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0821");
        User user0 = new User();
        java.lang.String str1 = user0.getPassword();
        user0.setCountry("hi!");
        java.lang.String str4 = user0.getFirstName();
        java.lang.String str5 = user0.getDob();
        java.lang.String str6 = user0.getLastName();
        user0.setFirstName("hi!");
        java.lang.String str9 = user0.getUsername();
        java.lang.String str10 = user0.getEmail();
        java.lang.String str11 = user0.getLastName();
        java.lang.String str12 = user0.getFirstName();
        user0.setLastName("");
        java.lang.String str15 = user0.getCountry();
        java.lang.String str16 = user0.getCountry();
        java.lang.String str17 = user0.getUsername();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertNull(str17);
    }

    @Test
    public void test0822() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0822");
        User user0 = new User();
        user0.setPassword("hi!");
        user0.setPassword("");
        java.lang.String str5 = user0.getDob();
        user0.setEmail("");
        user0.setUsername("");
        user0.setPassword("");
        java.lang.String str12 = user0.getUsername();
        user0.setCountry("hi!");
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test0823() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0823");
        User user0 = new User();
        user0.setPassword("hi!");
        user0.setPassword("");
        java.lang.String str5 = user0.getPassword();
        user0.setCountry("hi!");
        user0.setLastName("hi!");
        user0.setFirstName("");
        java.lang.String str12 = user0.getPassword();
        java.lang.String str13 = user0.getEmail();
        user0.setLastName("hi!");
        user0.setFirstName("hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNull(str13);
    }

    @Test
    public void test0824() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0824");
        User user0 = new User();
        java.lang.String str1 = user0.getPassword();
        java.lang.String str2 = user0.getUsername();
        user0.setDob("");
        java.lang.String str5 = user0.getEmail();
        user0.setLastName("hi!");
        java.lang.String str8 = user0.getDob();
        user0.setPassword("");
        java.lang.String str11 = user0.getCountry();
        java.lang.String str12 = user0.getCountry();
        user0.setPassword("hi!");
        java.lang.String str15 = user0.getFirstName();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str15);
    }

    @Test
    public void test0825() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0825");
        User user0 = new User();
        java.lang.String str1 = user0.getPassword();
        java.lang.String str2 = user0.getUsername();
        java.lang.String str3 = user0.getEmail();
        user0.setFirstName("");
        user0.setLastName("hi!");
        java.lang.String str8 = user0.getFirstName();
        user0.setDob("");
        java.lang.String str11 = user0.getEmail();
        user0.setUsername("hi!");
        user0.setFirstName("");
        user0.setFirstName("hi!");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test0826() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0826");
        User user0 = new User();
        java.lang.String str1 = user0.getPassword();
        user0.setCountry("hi!");
        java.lang.String str4 = user0.getUsername();
        user0.setPassword("");
        user0.setFirstName("");
        java.lang.String str9 = user0.getUsername();
        user0.setLastName("");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test0827() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0827");
        User user0 = new User();
        java.lang.String str1 = user0.getPassword();
        user0.setCountry("hi!");
        java.lang.String str4 = user0.getFirstName();
        user0.setLastName("hi!");
        user0.setDob("hi!");
        java.lang.String str9 = user0.getFirstName();
        user0.setCountry("");
        java.lang.String str12 = user0.getFirstName();
        java.lang.String str13 = user0.getFirstName();
        java.lang.String str14 = user0.getDob();
        user0.setUsername("hi!");
        user0.setEmail("");
        user0.setEmail("");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
    }

    @Test
    public void test0828() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0828");
        User user0 = new User();
        java.lang.String str1 = user0.getPassword();
        java.lang.String str2 = user0.getUsername();
        java.lang.String str3 = user0.getEmail();
        user0.setFirstName("");
        user0.setLastName("hi!");
        user0.setCountry("");
        java.lang.String str10 = user0.getFirstName();
        user0.setEmail("");
        user0.setDob("");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test0829() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0829");
        User user0 = new User();
        java.lang.String str1 = user0.getPassword();
        user0.setCountry("hi!");
        java.lang.String str4 = user0.getFirstName();
        java.lang.String str5 = user0.getDob();
        java.lang.String str6 = user0.getLastName();
        user0.setFirstName("hi!");
        user0.setDob("hi!");
        java.lang.String str11 = user0.getPassword();
        java.lang.String str12 = user0.getUsername();
        java.lang.String str13 = user0.getLastName();
        user0.setEmail("hi!");
        java.lang.String str16 = user0.getEmail();
        java.lang.String str17 = user0.getUsername();
        java.lang.String str18 = user0.getCountry();
        java.lang.String str19 = user0.getLastName();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertNull(str19);
    }

    @Test
    public void test0830() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0830");
        User user0 = new User();
        java.lang.String str1 = user0.getPassword();
        user0.setCountry("hi!");
        java.lang.String str4 = user0.getUsername();
        user0.setPassword("");
        user0.setFirstName("");
        java.lang.String str9 = user0.getLastName();
        user0.setCountry("hi!");
        java.lang.String str12 = user0.getCountry();
        user0.setLastName("");
        user0.setPassword("hi!");
        java.lang.String str17 = user0.getDob();
        java.lang.String str18 = user0.getDob();
        user0.setDob("");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertNull(str18);
    }

    @Test
    public void test0831() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0831");
        User user0 = new User();
        java.lang.String str1 = user0.getPassword();
        java.lang.String str2 = user0.getPassword();
        java.lang.String str3 = user0.getPassword();
        java.lang.String str4 = user0.getDob();
        user0.setUsername("");
        java.lang.String str7 = user0.getCountry();
        java.lang.String str8 = user0.getEmail();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test0832() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0832");
        User user0 = new User();
        user0.setPassword("hi!");
        user0.setPassword("");
        user0.setPassword("");
        java.lang.String str7 = user0.getCountry();
        user0.setPassword("hi!");
        user0.setLastName("hi!");
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test0833() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0833");
        User user0 = new User();
        java.lang.String str1 = user0.getPassword();
        java.lang.String str2 = user0.getUsername();
        java.lang.String str3 = user0.getEmail();
        user0.setFirstName("");
        user0.setLastName("hi!");
        user0.setUsername("hi!");
        user0.setUsername("hi!");
        user0.setEmail("hi!");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test0834() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0834");
        User user0 = new User();
        user0.setPassword("hi!");
        user0.setPassword("");
        java.lang.String str5 = user0.getPassword();
        java.lang.String str6 = user0.getEmail();
        user0.setCountry("hi!");
        java.lang.String str9 = user0.getDob();
        user0.setEmail("hi!");
        java.lang.String str12 = user0.getCountry();
        java.lang.String str13 = user0.getCountry();
        user0.setPassword("");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
    }

    @Test
    public void test0835() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0835");
        User user0 = new User();
        java.lang.String str1 = user0.getPassword();
        user0.setCountry("hi!");
        java.lang.String str4 = user0.getFirstName();
        user0.setLastName("hi!");
        user0.setDob("hi!");
        java.lang.String str9 = user0.getFirstName();
        java.lang.String str10 = user0.getDob();
        java.lang.String str11 = user0.getLastName();
        java.lang.String str12 = user0.getLastName();
        java.lang.String str13 = user0.getUsername();
        java.lang.String str14 = user0.getUsername();
        user0.setLastName("hi!");
        java.lang.String str17 = user0.getDob();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
    }

    @Test
    public void test0836() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0836");
        User user0 = new User();
        java.lang.String str1 = user0.getFirstName();
        user0.setPassword("");
        user0.setEmail("hi!");
        user0.setCountry("");
        user0.setDob("hi!");
        user0.setUsername("hi!");
        user0.setUsername("hi!");
        user0.setDob("");
        user0.setFirstName("hi!");
        org.junit.Assert.assertNull(str1);
    }

    @Test
    public void test0837() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0837");
        User user0 = new User();
        java.lang.String str1 = user0.getPassword();
        java.lang.String str2 = user0.getUsername();
        java.lang.String str3 = user0.getEmail();
        user0.setUsername("");
        java.lang.String str6 = user0.getPassword();
        java.lang.String str7 = user0.getDob();
        java.lang.String str8 = user0.getPassword();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test0838() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0838");
        User user0 = new User();
        java.lang.String str1 = user0.getPassword();
        user0.setCountry("hi!");
        java.lang.String str4 = user0.getFirstName();
        java.lang.String str5 = user0.getDob();
        java.lang.String str6 = user0.getLastName();
        user0.setFirstName("hi!");
        java.lang.String str9 = user0.getLastName();
        java.lang.String str10 = user0.getFirstName();
        java.lang.String str11 = user0.getCountry();
        user0.setUsername("");
        user0.setUsername("hi!");
        java.lang.String str16 = user0.getFirstName();
        java.lang.String str17 = user0.getFirstName();
        java.lang.String str18 = user0.getLastName();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertNull(str18);
    }

    @Test
    public void test0839() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0839");
        User user0 = new User();
        java.lang.String str1 = user0.getPassword();
        user0.setCountry("hi!");
        java.lang.String str4 = user0.getFirstName();
        java.lang.String str5 = user0.getDob();
        java.lang.String str6 = user0.getLastName();
        user0.setFirstName("hi!");
        java.lang.String str9 = user0.getUsername();
        java.lang.String str10 = user0.getEmail();
        java.lang.String str11 = user0.getDob();
        java.lang.String str12 = user0.getPassword();
        user0.setPassword("hi!");
        user0.setCountry("hi!");
        java.lang.String str17 = user0.getLastName();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str17);
    }

    @Test
    public void test0840() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0840");
        User user0 = new User();
        java.lang.String str1 = user0.getPassword();
        java.lang.String str2 = user0.getUsername();
        java.lang.String str3 = user0.getEmail();
        user0.setUsername("");
        java.lang.String str6 = user0.getFirstName();
        user0.setLastName("hi!");
        java.lang.String str9 = user0.getLastName();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
    }

    @Test
    public void test0841() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0841");
        User user0 = new User();
        java.lang.String str1 = user0.getPassword();
        user0.setCountry("hi!");
        java.lang.String str4 = user0.getFirstName();
        java.lang.String str5 = user0.getDob();
        java.lang.String str6 = user0.getLastName();
        user0.setFirstName("hi!");
        user0.setUsername("");
        user0.setCountry("");
        user0.setPassword("");
        java.lang.String str15 = user0.getUsername();
        java.lang.String str16 = user0.getPassword();
        user0.setUsername("");
        java.lang.String str19 = user0.getEmail();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertNull(str19);
    }

    @Test
    public void test0842() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0842");
        User user0 = new User();
        java.lang.String str1 = user0.getPassword();
        user0.setCountry("hi!");
        java.lang.String str4 = user0.getPassword();
        user0.setFirstName("");
        java.lang.String str7 = user0.getCountry();
        java.lang.String str8 = user0.getUsername();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test0843() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0843");
        User user0 = new User();
        java.lang.String str1 = user0.getPassword();
        user0.setCountry("hi!");
        java.lang.String str4 = user0.getFirstName();
        user0.setLastName("hi!");
        user0.setDob("hi!");
        java.lang.String str9 = user0.getFirstName();
        user0.setCountry("");
        user0.setEmail("");
        user0.setEmail("");
        user0.setCountry("hi!");
        user0.setDob("");
        java.lang.String str20 = user0.getLastName();
        java.lang.String str21 = user0.getLastName();
        java.lang.String str22 = user0.getUsername();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!" + "'", str21, "hi!");
        org.junit.Assert.assertNull(str22);
    }

    @Test
    public void test0844() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0844");
        User user0 = new User();
        java.lang.String str1 = user0.getPassword();
        java.lang.String str2 = user0.getUsername();
        java.lang.String str3 = user0.getEmail();
        user0.setFirstName("");
        user0.setLastName("hi!");
        java.lang.String str8 = user0.getFirstName();
        java.lang.String str9 = user0.getUsername();
        user0.setUsername("hi!");
        user0.setUsername("hi!");
        java.lang.String str14 = user0.getPassword();
        user0.setUsername("");
        java.lang.String str17 = user0.getPassword();
        java.lang.Class<?> wildcardClass18 = user0.getClass();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test0845() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0845");
        User user0 = new User();
        java.lang.String str1 = user0.getPassword();
        user0.setCountry("hi!");
        java.lang.String str4 = user0.getUsername();
        user0.setPassword("");
        user0.setFirstName("");
        java.lang.String str9 = user0.getUsername();
        java.lang.String str10 = user0.getCountry();
        user0.setEmail("hi!");
        user0.setLastName("hi!");
        user0.setEmail("hi!");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
    }

    @Test
    public void test0846() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0846");
        User user0 = new User();
        java.lang.String str1 = user0.getPassword();
        java.lang.String str2 = user0.getPassword();
        user0.setFirstName("");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
    }

    @Test
    public void test0847() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0847");
        User user0 = new User();
        user0.setPassword("hi!");
        user0.setPassword("");
        java.lang.String str5 = user0.getFirstName();
        user0.setLastName("hi!");
        user0.setFirstName("");
        user0.setUsername("hi!");
        java.lang.String str12 = user0.getDob();
        user0.setPassword("hi!");
        user0.setDob("hi!");
        user0.setEmail("");
        java.lang.String str19 = user0.getUsername();
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
    }

    @Test
    public void test0848() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0848");
        User user0 = new User();
        java.lang.String str1 = user0.getPassword();
        user0.setCountry("hi!");
        java.lang.String str4 = user0.getFirstName();
        user0.setLastName("hi!");
        user0.setDob("hi!");
        java.lang.String str9 = user0.getFirstName();
        user0.setCountry("");
        user0.setEmail("");
        user0.setPassword("");
        user0.setFirstName("hi!");
        user0.setUsername("hi!");
        java.lang.String str20 = user0.getLastName();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
    }

    @Test
    public void test0849() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0849");
        User user0 = new User();
        java.lang.String str1 = user0.getFirstName();
        java.lang.String str2 = user0.getDob();
        user0.setEmail("hi!");
        java.lang.String str5 = user0.getCountry();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str5);
    }

    @Test
    public void test0850() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0850");
        User user0 = new User();
        java.lang.String str1 = user0.getPassword();
        user0.setCountry("hi!");
        user0.setUsername("hi!");
        user0.setCountry("");
        java.lang.String str8 = user0.getFirstName();
        user0.setPassword("");
        user0.setPassword("hi!");
        user0.setDob("hi!");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test0851() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0851");
        User user0 = new User();
        java.lang.String str1 = user0.getPassword();
        user0.setUsername("hi!");
        user0.setFirstName("");
        java.lang.String str6 = user0.getPassword();
        user0.setEmail("hi!");
        user0.setPassword("");
        java.lang.String str11 = user0.getPassword();
        user0.setPassword("");
        java.lang.String str14 = user0.getUsername();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
    }

    @Test
    public void test0852() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0852");
        User user0 = new User();
        java.lang.String str1 = user0.getPassword();
        java.lang.String str2 = user0.getPassword();
        java.lang.String str3 = user0.getFirstName();
        user0.setDob("hi!");
        java.lang.String str6 = user0.getEmail();
        java.lang.String str7 = user0.getFirstName();
        user0.setCountry("hi!");
        java.lang.String str10 = user0.getFirstName();
        java.lang.String str11 = user0.getUsername();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test0853() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0853");
        User user0 = new User();
        java.lang.String str1 = user0.getPassword();
        user0.setCountry("hi!");
        user0.setUsername("hi!");
        user0.setCountry("");
        java.lang.String str8 = user0.getFirstName();
        user0.setPassword("");
        java.lang.String str11 = user0.getLastName();
        user0.setEmail("hi!");
        java.lang.Class<?> wildcardClass14 = user0.getClass();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0854() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0854");
        User user0 = new User();
        java.lang.String str1 = user0.getPassword();
        java.lang.String str2 = user0.getUsername();
        java.lang.String str3 = user0.getEmail();
        java.lang.String str4 = user0.getLastName();
        java.lang.String str5 = user0.getFirstName();
        user0.setFirstName("");
        user0.setCountry("");
        java.lang.String str10 = user0.getDob();
        user0.setFirstName("hi!");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test0855() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0855");
        User user0 = new User();
        java.lang.String str1 = user0.getPassword();
        java.lang.String str2 = user0.getUsername();
        java.lang.String str3 = user0.getEmail();
        user0.setFirstName("");
        java.lang.String str6 = user0.getCountry();
        java.lang.String str7 = user0.getLastName();
        java.lang.String str8 = user0.getEmail();
        user0.setPassword("hi!");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test0856() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0856");
        User user0 = new User();
        java.lang.String str1 = user0.getPassword();
        java.lang.String str2 = user0.getUsername();
        java.lang.String str3 = user0.getCountry();
        user0.setPassword("");
        user0.setLastName("");
        user0.setUsername("");
        user0.setUsername("hi!");
        user0.setUsername("hi!");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test0857() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0857");
        User user0 = new User();
        java.lang.String str1 = user0.getPassword();
        user0.setCountry("hi!");
        java.lang.String str4 = user0.getFirstName();
        user0.setLastName("hi!");
        user0.setDob("hi!");
        java.lang.String str9 = user0.getEmail();
        java.lang.String str10 = user0.getCountry();
        user0.setDob("");
        java.lang.String str13 = user0.getUsername();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNull(str13);
    }

    @Test
    public void test0858() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0858");
        User user0 = new User();
        java.lang.String str1 = user0.getPassword();
        user0.setCountry("hi!");
        java.lang.String str4 = user0.getFirstName();
        user0.setLastName("hi!");
        user0.setDob("hi!");
        java.lang.String str9 = user0.getFirstName();
        user0.setLastName("hi!");
        user0.setCountry("");
        java.lang.String str14 = user0.getFirstName();
        user0.setUsername("");
        java.lang.String str17 = user0.getEmail();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(str17);
    }

    @Test
    public void test0859() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0859");
        User user0 = new User();
        java.lang.String str1 = user0.getPassword();
        user0.setCountry("hi!");
        java.lang.String str4 = user0.getUsername();
        java.lang.String str5 = user0.getPassword();
        java.lang.String str6 = user0.getUsername();
        user0.setCountry("hi!");
        java.lang.String str9 = user0.getPassword();
        java.lang.String str10 = user0.getLastName();
        user0.setPassword("");
        java.lang.String str13 = user0.getDob();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str13);
    }

    @Test
    public void test0860() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0860");
        User user0 = new User();
        user0.setPassword("hi!");
        user0.setPassword("");
        java.lang.String str5 = user0.getDob();
        user0.setEmail("");
        user0.setUsername("");
        user0.setLastName("");
        java.lang.Class<?> wildcardClass12 = user0.getClass();
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0861() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0861");
        User user0 = new User();
        java.lang.String str1 = user0.getPassword();
        java.lang.String str2 = user0.getPassword();
        user0.setUsername("");
        java.lang.String str5 = user0.getEmail();
        user0.setFirstName("hi!");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str5);
    }

    @Test
    public void test0862() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0862");
        User user0 = new User();
        java.lang.String str1 = user0.getPassword();
        java.lang.String str2 = user0.getUsername();
        java.lang.String str3 = user0.getEmail();
        user0.setFirstName("");
        user0.setLastName("hi!");
        java.lang.String str8 = user0.getFirstName();
        java.lang.String str9 = user0.getUsername();
        java.lang.String str10 = user0.getLastName();
        user0.setCountry("");
        java.lang.String str13 = user0.getUsername();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNull(str13);
    }

    @Test
    public void test0863() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0863");
        User user0 = new User();
        java.lang.String str1 = user0.getPassword();
        java.lang.String str2 = user0.getUsername();
        user0.setDob("");
        java.lang.String str5 = user0.getEmail();
        java.lang.String str6 = user0.getCountry();
        java.lang.String str7 = user0.getPassword();
        java.lang.String str8 = user0.getLastName();
        user0.setEmail("");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test0864() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0864");
        User user0 = new User();
        user0.setPassword("hi!");
        user0.setPassword("");
        java.lang.String str5 = user0.getFirstName();
        user0.setEmail("hi!");
        java.lang.String str8 = user0.getLastName();
        user0.setUsername("");
        user0.setPassword("hi!");
        user0.setEmail("");
        user0.setLastName("hi!");
        java.lang.String str17 = user0.getDob();
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str17);
    }

    @Test
    public void test0865() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0865");
        User user0 = new User();
        java.lang.String str1 = user0.getPassword();
        java.lang.String str2 = user0.getPassword();
        java.lang.String str3 = user0.getFirstName();
        user0.setPassword("");
        user0.setFirstName("");
        user0.setEmail("");
        java.lang.String str10 = user0.getFirstName();
        user0.setUsername("");
        user0.setCountry("hi!");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test0866() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0866");
        User user0 = new User();
        java.lang.String str1 = user0.getPassword();
        user0.setCountry("hi!");
        java.lang.String str4 = user0.getUsername();
        user0.setPassword("");
        user0.setFirstName("hi!");
        user0.setDob("hi!");
        user0.setFirstName("");
        user0.setPassword("hi!");
        java.lang.String str15 = user0.getEmail();
        java.lang.String str16 = user0.getPassword();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
    }

    @Test
    public void test0867() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0867");
        User user0 = new User();
        java.lang.String str1 = user0.getPassword();
        user0.setUsername("hi!");
        user0.setFirstName("");
        java.lang.String str6 = user0.getPassword();
        user0.setLastName("");
        java.lang.String str9 = user0.getFirstName();
        java.lang.String str10 = user0.getUsername();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
    }

    @Test
    public void test0868() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0868");
        User user0 = new User();
        java.lang.String str1 = user0.getPassword();
        java.lang.String str2 = user0.getPassword();
        java.lang.String str3 = user0.getPassword();
        java.lang.String str4 = user0.getDob();
        user0.setEmail("");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
    }

    @Test
    public void test0869() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0869");
        User user0 = new User();
        java.lang.String str1 = user0.getPassword();
        user0.setCountry("hi!");
        user0.setFirstName("hi!");
        org.junit.Assert.assertNull(str1);
    }

    @Test
    public void test0870() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0870");
        User user0 = new User();
        java.lang.String str1 = user0.getPassword();
        java.lang.String str2 = user0.getUsername();
        java.lang.String str3 = user0.getEmail();
        user0.setFirstName("");
        user0.setLastName("hi!");
        java.lang.String str8 = user0.getFirstName();
        java.lang.String str9 = user0.getUsername();
        user0.setUsername("hi!");
        user0.setUsername("hi!");
        java.lang.String str14 = user0.getPassword();
        user0.setUsername("");
        java.lang.String str17 = user0.getPassword();
        java.lang.String str18 = user0.getUsername();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
    }

    @Test
    public void test0871() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0871");
        User user0 = new User();
        java.lang.String str1 = user0.getPassword();
        java.lang.String str2 = user0.getLastName();
        java.lang.String str3 = user0.getEmail();
        java.lang.String str4 = user0.getDob();
        user0.setDob("");
        user0.setFirstName("hi!");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
    }

    @Test
    public void test0872() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0872");
        User user0 = new User();
        java.lang.String str1 = user0.getPassword();
        user0.setCountry("hi!");
        java.lang.String str4 = user0.getFirstName();
        java.lang.String str5 = user0.getDob();
        java.lang.String str6 = user0.getLastName();
        user0.setFirstName("hi!");
        java.lang.String str9 = user0.getUsername();
        java.lang.String str10 = user0.getEmail();
        user0.setDob("");
        java.lang.String str13 = user0.getDob();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test0873() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0873");
        User user0 = new User();
        java.lang.String str1 = user0.getPassword();
        user0.setUsername("hi!");
        user0.setFirstName("");
        java.lang.String str6 = user0.getPassword();
        user0.setLastName("");
        java.lang.String str9 = user0.getDob();
        user0.setDob("");
        user0.setEmail("");
        java.lang.String str14 = user0.getDob();
        user0.setDob("hi!");
        java.lang.String str17 = user0.getEmail();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
    }

    @Test
    public void test0874() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0874");
        User user0 = new User();
        java.lang.String str1 = user0.getPassword();
        user0.setUsername("hi!");
        user0.setFirstName("");
        java.lang.String str6 = user0.getPassword();
        user0.setLastName("");
        user0.setDob("hi!");
        user0.setDob("");
        java.lang.String str13 = user0.getLastName();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test0875() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0875");
        User user0 = new User();
        java.lang.String str1 = user0.getPassword();
        java.lang.String str2 = user0.getUsername();
        java.lang.String str3 = user0.getEmail();
        user0.setUsername("");
        java.lang.String str6 = user0.getFirstName();
        java.lang.String str7 = user0.getUsername();
        java.lang.String str8 = user0.getCountry();
        java.lang.String str9 = user0.getFirstName();
        java.lang.String str10 = user0.getPassword();
        java.lang.String str11 = user0.getEmail();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test0876() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0876");
        User user0 = new User();
        user0.setPassword("hi!");
        java.lang.String str3 = user0.getPassword();
        java.lang.String str4 = user0.getFirstName();
        java.lang.String str5 = user0.getLastName();
        user0.setFirstName("");
        java.lang.String str8 = user0.getLastName();
        java.lang.String str9 = user0.getPassword();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
    }

    @Test
    public void test0877() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0877");
        User user0 = new User();
        user0.setPassword("hi!");
        user0.setPassword("");
        java.lang.String str5 = user0.getPassword();
        user0.setFirstName("");
        java.lang.String str8 = user0.getUsername();
        java.lang.String str9 = user0.getLastName();
        user0.setUsername("hi!");
        user0.setPassword("hi!");
        user0.setCountry("");
        user0.setFirstName("hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test0878() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0878");
        User user0 = new User();
        java.lang.String str1 = user0.getPassword();
        java.lang.String str2 = user0.getUsername();
        java.lang.String str3 = user0.getEmail();
        user0.setFirstName("");
        java.lang.String str6 = user0.getCountry();
        java.lang.String str7 = user0.getFirstName();
        user0.setCountry("hi!");
        user0.setLastName("hi!");
        user0.setLastName("hi!");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test0879() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0879");
        User user0 = new User();
        java.lang.String str1 = user0.getPassword();
        java.lang.String str2 = user0.getUsername();
        java.lang.String str3 = user0.getEmail();
        user0.setFirstName("");
        user0.setLastName("hi!");
        user0.setUsername("hi!");
        java.lang.String str10 = user0.getPassword();
        java.lang.String str11 = user0.getFirstName();
        java.lang.String str12 = user0.getUsername();
        java.lang.String str13 = user0.getUsername();
        user0.setUsername("");
        java.lang.String str16 = user0.getCountry();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertNull(str16);
    }

    @Test
    public void test0880() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0880");
        User user0 = new User();
        java.lang.String str1 = user0.getPassword();
        user0.setCountry("hi!");
        java.lang.String str4 = user0.getFirstName();
        java.lang.String str5 = user0.getDob();
        java.lang.String str6 = user0.getLastName();
        user0.setFirstName("hi!");
        user0.setDob("hi!");
        user0.setUsername("");
        java.lang.String str13 = user0.getLastName();
        user0.setPassword("");
        user0.setCountry("hi!");
        user0.setDob("hi!");
        java.lang.Class<?> wildcardClass20 = user0.getClass();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test0881() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0881");
        User user0 = new User();
        user0.setPassword("hi!");
        java.lang.String str3 = user0.getPassword();
        java.lang.String str4 = user0.getFirstName();
        java.lang.String str5 = user0.getLastName();
        user0.setCountry("");
        user0.setUsername("");
        user0.setFirstName("hi!");
        java.lang.String str12 = user0.getPassword();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
    }

    @Test
    public void test0882() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0882");
        User user0 = new User();
        user0.setLastName("");
        user0.setDob("hi!");
        user0.setCountry("");
        java.lang.String str7 = user0.getCountry();
        user0.setLastName("hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test0883() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0883");
        User user0 = new User();
        java.lang.String str1 = user0.getPassword();
        user0.setCountry("hi!");
        java.lang.String str4 = user0.getFirstName();
        java.lang.String str5 = user0.getUsername();
        user0.setDob("hi!");
        user0.setEmail("");
        user0.setUsername("hi!");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
    }

    @Test
    public void test0884() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0884");
        User user0 = new User();
        user0.setPassword("hi!");
        user0.setPassword("");
        java.lang.String str5 = user0.getPassword();
        user0.setCountry("hi!");
        java.lang.String str8 = user0.getPassword();
        java.lang.String str9 = user0.getDob();
        user0.setDob("hi!");
        user0.setLastName("hi!");
        java.lang.String str14 = user0.getLastName();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
    }

    @Test
    public void test0885() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0885");
        User user0 = new User();
        java.lang.String str1 = user0.getPassword();
        java.lang.String str2 = user0.getPassword();
        java.lang.String str3 = user0.getPassword();
        java.lang.String str4 = user0.getDob();
        user0.setFirstName("hi!");
        user0.setPassword("hi!");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
    }

    @Test
    public void test0886() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0886");
        User user0 = new User();
        java.lang.String str1 = user0.getPassword();
        user0.setCountry("hi!");
        java.lang.String str4 = user0.getPassword();
        java.lang.String str5 = user0.getPassword();
        user0.setCountry("hi!");
        java.lang.String str8 = user0.getEmail();
        java.lang.String str9 = user0.getPassword();
        user0.setEmail("");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test0887() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0887");
        User user0 = new User();
        java.lang.String str1 = user0.getPassword();
        java.lang.String str2 = user0.getUsername();
        java.lang.String str3 = user0.getEmail();
        user0.setUsername("");
        java.lang.String str6 = user0.getFirstName();
        user0.setUsername("");
        user0.setDob("");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test0888() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0888");
        User user0 = new User();
        user0.setPassword("hi!");
        user0.setPassword("");
        java.lang.String str5 = user0.getPassword();
        java.lang.String str6 = user0.getEmail();
        user0.setCountry("hi!");
        java.lang.String str9 = user0.getDob();
        user0.setCountry("hi!");
        java.lang.String str12 = user0.getPassword();
        user0.setLastName("");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test0889() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0889");
        User user0 = new User();
        java.lang.String str1 = user0.getPassword();
        user0.setCountry("hi!");
        java.lang.String str4 = user0.getFirstName();
        java.lang.String str5 = user0.getDob();
        java.lang.String str6 = user0.getLastName();
        user0.setFirstName("hi!");
        user0.setDob("hi!");
        java.lang.String str11 = user0.getPassword();
        java.lang.String str12 = user0.getUsername();
        user0.setEmail("hi!");
        user0.setCountry("");
        user0.setCountry("");
        user0.setCountry("hi!");
        user0.setUsername("hi!");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test0890() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0890");
        User user0 = new User();
        java.lang.String str1 = user0.getPassword();
        user0.setCountry("hi!");
        java.lang.String str4 = user0.getFirstName();
        java.lang.String str5 = user0.getDob();
        java.lang.String str6 = user0.getLastName();
        user0.setFirstName("hi!");
        user0.setDob("");
        user0.setDob("");
        java.lang.String str13 = user0.getCountry();
        user0.setEmail("");
        user0.setPassword("hi!");
        java.lang.Class<?> wildcardClass18 = user0.getClass();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test0891() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0891");
        User user0 = new User();
        user0.setPassword("hi!");
        user0.setPassword("");
        java.lang.String str5 = user0.getUsername();
        java.lang.String str6 = user0.getLastName();
        java.lang.String str7 = user0.getLastName();
        user0.setCountry("hi!");
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test0892() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0892");
        User user0 = new User();
        java.lang.String str1 = user0.getPassword();
        user0.setCountry("hi!");
        java.lang.String str4 = user0.getFirstName();
        java.lang.String str5 = user0.getDob();
        java.lang.String str6 = user0.getLastName();
        user0.setFirstName("hi!");
        user0.setUsername("");
        java.lang.String str11 = user0.getLastName();
        java.lang.String str12 = user0.getUsername();
        java.lang.String str13 = user0.getEmail();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNull(str13);
    }

    @Test
    public void test0893() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0893");
        User user0 = new User();
        java.lang.String str1 = user0.getPassword();
        user0.setCountry("hi!");
        java.lang.String str4 = user0.getFirstName();
        user0.setLastName("hi!");
        user0.setDob("hi!");
        java.lang.String str9 = user0.getFirstName();
        user0.setLastName("hi!");
        user0.setCountry("");
        java.lang.String str14 = user0.getPassword();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str14);
    }

    @Test
    public void test0894() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0894");
        User user0 = new User();
        user0.setPassword("hi!");
        user0.setPassword("");
        java.lang.String str5 = user0.getPassword();
        java.lang.String str6 = user0.getEmail();
        user0.setFirstName("hi!");
        user0.setUsername("hi!");
        user0.setDob("hi!");
        java.lang.String str13 = user0.getCountry();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str13);
    }

    @Test
    public void test0895() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0895");
        User user0 = new User();
        java.lang.String str1 = user0.getPassword();
        user0.setCountry("hi!");
        java.lang.String str4 = user0.getFirstName();
        user0.setLastName("hi!");
        user0.setDob("hi!");
        java.lang.String str9 = user0.getFirstName();
        user0.setCountry("");
        user0.setEmail("");
        user0.setEmail("");
        user0.setLastName("");
        java.lang.Class<?> wildcardClass18 = user0.getClass();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test0896() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0896");
        User user0 = new User();
        user0.setPassword("hi!");
        user0.setPassword("");
        java.lang.String str5 = user0.getPassword();
        user0.setFirstName("");
        user0.setLastName("");
        user0.setPassword("hi!");
        java.lang.String str12 = user0.getEmail();
        java.lang.String str13 = user0.getDob();
        user0.setFirstName("hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str13);
    }

    @Test
    public void test0897() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0897");
        User user0 = new User();
        user0.setPassword("hi!");
        user0.setPassword("");
        java.lang.String str5 = user0.getPassword();
        java.lang.String str6 = user0.getEmail();
        user0.setFirstName("hi!");
        java.lang.String str9 = user0.getCountry();
        java.lang.String str10 = user0.getDob();
        user0.setFirstName("");
        user0.setPassword("hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test0898() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0898");
        User user0 = new User();
        java.lang.String str1 = user0.getPassword();
        user0.setUsername("hi!");
        user0.setCountry("hi!");
        java.lang.String str6 = user0.getLastName();
        user0.setUsername("");
        java.lang.String str9 = user0.getEmail();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test0899() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0899");
        User user0 = new User();
        java.lang.String str1 = user0.getPassword();
        user0.setCountry("hi!");
        java.lang.String str4 = user0.getFirstName();
        user0.setLastName("hi!");
        user0.setDob("hi!");
        java.lang.String str9 = user0.getFirstName();
        java.lang.String str10 = user0.getDob();
        java.lang.String str11 = user0.getLastName();
        user0.setUsername("");
        user0.setLastName("hi!");
        user0.setEmail("");
        user0.setUsername("");
        user0.setCountry("hi!");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
    }

    @Test
    public void test0900() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0900");
        User user0 = new User();
        java.lang.String str1 = user0.getPassword();
        java.lang.String str2 = user0.getUsername();
        java.lang.String str3 = user0.getEmail();
        user0.setFirstName("");
        user0.setLastName("hi!");
        user0.setUsername("hi!");
        java.lang.String str10 = user0.getDob();
        java.lang.String str11 = user0.getPassword();
        user0.setLastName("hi!");
        java.lang.String str14 = user0.getPassword();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str14);
    }

    @Test
    public void test0901() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0901");
        User user0 = new User();
        user0.setPassword("hi!");
        user0.setPassword("");
        user0.setPassword("");
        java.lang.String str7 = user0.getCountry();
        user0.setPassword("hi!");
        user0.setCountry("hi!");
        java.lang.String str12 = user0.getDob();
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test0902() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0902");
        User user0 = new User();
        java.lang.String str1 = user0.getPassword();
        java.lang.String str2 = user0.getPassword();
        java.lang.String str3 = user0.getFirstName();
        user0.setDob("hi!");
        java.lang.String str6 = user0.getEmail();
        java.lang.String str7 = user0.getDob();
        java.lang.String str8 = user0.getPassword();
        user0.setUsername("hi!");
        user0.setLastName("hi!");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test0903() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0903");
        User user0 = new User();
        java.lang.String str1 = user0.getPassword();
        user0.setCountry("hi!");
        java.lang.String str4 = user0.getFirstName();
        user0.setLastName("hi!");
        user0.setDob("hi!");
        java.lang.String str9 = user0.getFirstName();
        java.lang.String str10 = user0.getDob();
        java.lang.String str11 = user0.getLastName();
        java.lang.String str12 = user0.getLastName();
        user0.setPassword("hi!");
        java.lang.String str15 = user0.getCountry();
        user0.setPassword("");
        java.lang.String str18 = user0.getLastName();
        user0.setDob("");
        user0.setDob("hi!");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
    }

    @Test
    public void test0904() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0904");
        User user0 = new User();
        java.lang.String str1 = user0.getFirstName();
        user0.setPassword("");
        java.lang.String str4 = user0.getUsername();
        user0.setLastName("");
        user0.setFirstName("hi!");
        user0.setPassword("hi!");
        user0.setPassword("hi!");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str4);
    }

    @Test
    public void test0905() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0905");
        User user0 = new User();
        java.lang.String str1 = user0.getPassword();
        user0.setCountry("hi!");
        java.lang.String str4 = user0.getFirstName();
        user0.setLastName("hi!");
        user0.setDob("hi!");
        java.lang.String str9 = user0.getFirstName();
        java.lang.String str10 = user0.getDob();
        java.lang.String str11 = user0.getLastName();
        java.lang.String str12 = user0.getLastName();
        java.lang.String str13 = user0.getUsername();
        java.lang.String str14 = user0.getDob();
        user0.setLastName("hi!");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
    }

    @Test
    public void test0906() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0906");
        User user0 = new User();
        user0.setLastName("");
        user0.setDob("hi!");
        user0.setCountry("");
        java.lang.String str7 = user0.getDob();
        java.lang.String str8 = user0.getUsername();
        java.lang.String str9 = user0.getUsername();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test0907() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0907");
        User user0 = new User();
        user0.setPassword("hi!");
        user0.setPassword("");
        java.lang.String str5 = user0.getPassword();
        user0.setCountry("hi!");
        java.lang.String str8 = user0.getPassword();
        java.lang.String str9 = user0.getDob();
        java.lang.String str10 = user0.getUsername();
        user0.setPassword("hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test0908() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0908");
        User user0 = new User();
        user0.setPassword("hi!");
        user0.setPassword("");
        java.lang.String str5 = user0.getPassword();
        java.lang.String str6 = user0.getEmail();
        user0.setEmail("");
        user0.setFirstName("");
        user0.setPassword("hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test0909() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0909");
        User user0 = new User();
        java.lang.String str1 = user0.getPassword();
        java.lang.String str2 = user0.getPassword();
        java.lang.String str3 = user0.getFirstName();
        user0.setDob("hi!");
        java.lang.String str6 = user0.getDob();
        java.lang.String str7 = user0.getEmail();
        java.lang.String str8 = user0.getPassword();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test0910() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0910");
        User user0 = new User();
        java.lang.String str1 = user0.getPassword();
        user0.setCountry("hi!");
        java.lang.String str4 = user0.getFirstName();
        java.lang.String str5 = user0.getDob();
        java.lang.String str6 = user0.getLastName();
        user0.setFirstName("hi!");
        user0.setDob("hi!");
        user0.setUsername("");
        java.lang.String str13 = user0.getLastName();
        user0.setDob("");
        java.lang.String str16 = user0.getLastName();
        java.lang.String str17 = user0.getEmail();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNull(str17);
    }

    @Test
    public void test0911() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0911");
        User user0 = new User();
        java.lang.String str1 = user0.getPassword();
        java.lang.String str2 = user0.getPassword();
        java.lang.String str3 = user0.getCountry();
        user0.setLastName("hi!");
        user0.setUsername("");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test0912() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0912");
        User user0 = new User();
        java.lang.String str1 = user0.getPassword();
        java.lang.String str2 = user0.getUsername();
        java.lang.String str3 = user0.getEmail();
        user0.setFirstName("");
        user0.setLastName("hi!");
        java.lang.String str8 = user0.getFirstName();
        user0.setDob("");
        java.lang.String str11 = user0.getEmail();
        user0.setUsername("hi!");
        user0.setFirstName("");
        java.lang.String str16 = user0.getPassword();
        user0.setEmail("");
        user0.setCountry("hi!");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str16);
    }

    @Test
    public void test0913() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0913");
        User user0 = new User();
        java.lang.String str1 = user0.getPassword();
        user0.setUsername("hi!");
        user0.setCountry("hi!");
        java.lang.String str6 = user0.getLastName();
        user0.setLastName("");
        user0.setEmail("hi!");
        java.lang.Class<?> wildcardClass11 = user0.getClass();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0914() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0914");
        User user0 = new User();
        java.lang.String str1 = user0.getPassword();
        java.lang.String str2 = user0.getUsername();
        java.lang.String str3 = user0.getCountry();
        user0.setPassword("");
        user0.setLastName("");
        user0.setUsername("");
        user0.setLastName("hi!");
        user0.setDob("");
        java.lang.String str14 = user0.getEmail();
        user0.setCountry("");
        java.lang.String str17 = user0.getLastName();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
    }

    @Test
    public void test0915() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0915");
        User user0 = new User();
        user0.setPassword("hi!");
        user0.setPassword("");
        java.lang.String str5 = user0.getPassword();
        user0.setCountry("hi!");
        user0.setLastName("hi!");
        user0.setFirstName("");
        java.lang.String str12 = user0.getFirstName();
        java.lang.String str13 = user0.getCountry();
        user0.setCountry("");
        user0.setDob("hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
    }

    @Test
    public void test0916() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0916");
        User user0 = new User();
        java.lang.String str1 = user0.getPassword();
        java.lang.String str2 = user0.getUsername();
        java.lang.String str3 = user0.getEmail();
        user0.setFirstName("");
        user0.setLastName("hi!");
        user0.setUsername("hi!");
        user0.setDob("");
        java.lang.String str12 = user0.getEmail();
        user0.setEmail("");
        user0.setUsername("hi!");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test0917() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0917");
        User user0 = new User();
        java.lang.String str1 = user0.getPassword();
        java.lang.String str2 = user0.getUsername();
        java.lang.String str3 = user0.getCountry();
        java.lang.String str4 = user0.getPassword();
        java.lang.String str5 = user0.getUsername();
        user0.setEmail("");
        user0.setDob("");
        java.lang.String str10 = user0.getFirstName();
        user0.setUsername("");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test0918() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0918");
        User user0 = new User();
        user0.setPassword("hi!");
        user0.setPassword("");
        java.lang.String str5 = user0.getDob();
        user0.setEmail("");
        user0.setUsername("");
        user0.setPassword("");
        java.lang.String str12 = user0.getLastName();
        user0.setDob("");
        user0.setPassword("");
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test0919() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0919");
        User user0 = new User();
        java.lang.String str1 = user0.getPassword();
        user0.setUsername("hi!");
        user0.setFirstName("");
        java.lang.String str6 = user0.getPassword();
        java.lang.String str7 = user0.getCountry();
        user0.setPassword("");
        user0.setCountry("hi!");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test0920() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0920");
        User user0 = new User();
        user0.setPassword("hi!");
        user0.setPassword("");
        java.lang.String str5 = user0.getPassword();
        java.lang.String str6 = user0.getDob();
        java.lang.String str7 = user0.getDob();
        user0.setPassword("hi!");
        java.lang.String str10 = user0.getFirstName();
        user0.setPassword("hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test0921() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0921");
        User user0 = new User();
        java.lang.String str1 = user0.getPassword();
        java.lang.String str2 = user0.getPassword();
        user0.setUsername("");
        java.lang.String str5 = user0.getCountry();
        java.lang.String str6 = user0.getCountry();
        user0.setLastName("");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test0922() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0922");
        User user0 = new User();
        java.lang.String str1 = user0.getPassword();
        user0.setUsername("");
        user0.setLastName("");
        user0.setEmail("hi!");
        user0.setDob("hi!");
        java.lang.String str10 = user0.getFirstName();
        java.lang.String str11 = user0.getDob();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
    }

    @Test
    public void test0923() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0923");
        User user0 = new User();
        java.lang.String str1 = user0.getPassword();
        user0.setCountry("hi!");
        java.lang.String str4 = user0.getFirstName();
        user0.setLastName("hi!");
        java.lang.String str7 = user0.getLastName();
        java.lang.Class<?> wildcardClass8 = user0.getClass();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0924() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0924");
        User user0 = new User();
        java.lang.String str1 = user0.getPassword();
        java.lang.String str2 = user0.getUsername();
        java.lang.String str3 = user0.getEmail();
        java.lang.String str4 = user0.getLastName();
        java.lang.String str5 = user0.getFirstName();
        user0.setFirstName("");
        java.lang.Class<?> wildcardClass8 = user0.getClass();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0925() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0925");
        User user0 = new User();
        user0.setUsername("");
        java.lang.String str3 = user0.getDob();
        java.lang.String str4 = user0.getUsername();
        java.lang.String str5 = user0.getLastName();
        java.lang.String str6 = user0.getPassword();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test0926() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0926");
        User user0 = new User();
        java.lang.String str1 = user0.getPassword();
        java.lang.String str2 = user0.getPassword();
        java.lang.String str3 = user0.getPassword();
        java.lang.String str4 = user0.getDob();
        user0.setFirstName("hi!");
        user0.setDob("");
        java.lang.String str9 = user0.getPassword();
        user0.setFirstName("hi!");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test0927() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0927");
        User user0 = new User();
        user0.setPassword("hi!");
        user0.setPassword("");
        java.lang.String str5 = user0.getPassword();
        java.lang.String str6 = user0.getEmail();
        user0.setCountry("hi!");
        java.lang.String str9 = user0.getDob();
        user0.setDob("hi!");
        java.lang.String str12 = user0.getLastName();
        java.lang.String str13 = user0.getLastName();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str13);
    }

    @Test
    public void test0928() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0928");
        User user0 = new User();
        user0.setLastName("");
        user0.setDob("hi!");
        user0.setCountry("");
        java.lang.String str7 = user0.getCountry();
        java.lang.String str8 = user0.getFirstName();
        user0.setEmail("hi!");
        java.lang.String str11 = user0.getPassword();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test0929() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0929");
        User user0 = new User();
        java.lang.String str1 = user0.getPassword();
        user0.setCountry("hi!");
        java.lang.String str4 = user0.getPassword();
        user0.setEmail("hi!");
        java.lang.String str7 = user0.getUsername();
        user0.setLastName("");
        user0.setPassword("hi!");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test0930() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0930");
        User user0 = new User();
        java.lang.String str1 = user0.getPassword();
        java.lang.String str2 = user0.getPassword();
        java.lang.String str3 = user0.getPassword();
        user0.setLastName("");
        user0.setLastName("hi!");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test0931() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0931");
        User user0 = new User();
        java.lang.String str1 = user0.getPassword();
        user0.setCountry("hi!");
        java.lang.String str4 = user0.getPassword();
        java.lang.String str5 = user0.getPassword();
        java.lang.String str6 = user0.getFirstName();
        java.lang.String str7 = user0.getCountry();
        user0.setEmail("hi!");
        java.lang.String str10 = user0.getLastName();
        user0.setUsername("");
        user0.setCountry("");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test0932() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0932");
        User user0 = new User();
        java.lang.String str1 = user0.getPassword();
        user0.setCountry("hi!");
        java.lang.String str4 = user0.getFirstName();
        java.lang.String str5 = user0.getDob();
        java.lang.String str6 = user0.getLastName();
        user0.setFirstName("hi!");
        user0.setDob("");
        user0.setDob("");
        user0.setEmail("");
        user0.setLastName("hi!");
        user0.setFirstName("");
        java.lang.String str19 = user0.getLastName();
        java.lang.Class<?> wildcardClass20 = user0.getClass();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test0933() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0933");
        User user0 = new User();
        java.lang.String str1 = user0.getPassword();
        user0.setUsername("hi!");
        user0.setCountry("hi!");
        java.lang.String str6 = user0.getLastName();
        user0.setLastName("");
        java.lang.String str9 = user0.getUsername();
        user0.setFirstName("hi!");
        java.lang.String str12 = user0.getDob();
        java.lang.String str13 = user0.getUsername();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
    }

    @Test
    public void test0934() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0934");
        User user0 = new User();
        java.lang.String str1 = user0.getPassword();
        user0.setCountry("hi!");
        java.lang.String str4 = user0.getFirstName();
        java.lang.String str5 = user0.getDob();
        java.lang.String str6 = user0.getLastName();
        user0.setLastName("");
        user0.setEmail("");
        java.lang.String str11 = user0.getLastName();
        java.lang.String str12 = user0.getUsername();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test0935() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0935");
        User user0 = new User();
        java.lang.String str1 = user0.getPassword();
        java.lang.String str2 = user0.getPassword();
        java.lang.String str3 = user0.getFirstName();
        user0.setDob("hi!");
        java.lang.String str6 = user0.getEmail();
        java.lang.String str7 = user0.getUsername();
        user0.setUsername("hi!");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test0936() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0936");
        User user0 = new User();
        java.lang.String str1 = user0.getPassword();
        user0.setUsername("hi!");
        user0.setCountry("hi!");
        java.lang.String str6 = user0.getLastName();
        user0.setLastName("");
        java.lang.String str9 = user0.getUsername();
        user0.setFirstName("hi!");
        java.lang.String str12 = user0.getDob();
        java.lang.Class<?> wildcardClass13 = user0.getClass();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0937() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0937");
        User user0 = new User();
        java.lang.String str1 = user0.getPassword();
        java.lang.String str2 = user0.getUsername();
        java.lang.String str3 = user0.getEmail();
        user0.setFirstName("");
        user0.setLastName("hi!");
        user0.setUsername("hi!");
        java.lang.String str10 = user0.getDob();
        java.lang.String str11 = user0.getPassword();
        user0.setCountry("hi!");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test0938() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0938");
        User user0 = new User();
        user0.setPassword("hi!");
        user0.setPassword("");
        java.lang.String str5 = user0.getDob();
        user0.setEmail("");
        user0.setUsername("");
        user0.setFirstName("hi!");
        user0.setFirstName("");
        user0.setEmail("");
        user0.setLastName("hi!");
        user0.setEmail("hi!");
        org.junit.Assert.assertNull(str5);
    }

    @Test
    public void test0939() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0939");
        User user0 = new User();
        user0.setPassword("hi!");
        user0.setPassword("");
        java.lang.String str5 = user0.getPassword();
        java.lang.String str6 = user0.getEmail();
        user0.setFirstName("hi!");
        java.lang.String str9 = user0.getFirstName();
        user0.setEmail("hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
    }

    @Test
    public void test0940() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0940");
        User user0 = new User();
        user0.setPassword("hi!");
        user0.setPassword("");
        java.lang.String str5 = user0.getPassword();
        java.lang.String str6 = user0.getDob();
        java.lang.String str7 = user0.getDob();
        user0.setLastName("");
        java.lang.String str10 = user0.getFirstName();
        java.lang.String str11 = user0.getFirstName();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test0941() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0941");
        User user0 = new User();
        java.lang.String str1 = user0.getPassword();
        java.lang.String str2 = user0.getUsername();
        java.lang.String str3 = user0.getEmail();
        user0.setFirstName("");
        user0.setLastName("hi!");
        user0.setUsername("hi!");
        java.lang.String str10 = user0.getDob();
        java.lang.String str11 = user0.getCountry();
        user0.setPassword("");
        java.lang.String str14 = user0.getDob();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str14);
    }

    @Test
    public void test0942() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0942");
        User user0 = new User();
        java.lang.String str1 = user0.getPassword();
        user0.setUsername("hi!");
        user0.setFirstName("");
        java.lang.String str6 = user0.getPassword();
        user0.setLastName("");
        java.lang.String str9 = user0.getDob();
        java.lang.String str10 = user0.getEmail();
        java.lang.String str11 = user0.getPassword();
        java.lang.String str12 = user0.getEmail();
        user0.setEmail("");
        user0.setCountry("hi!");
        user0.setUsername("");
        user0.setUsername("");
        user0.setEmail("hi!");
        java.lang.String str23 = user0.getPassword();
        java.lang.String str24 = user0.getFirstName();
        java.lang.String str25 = user0.getEmail();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str23);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "hi!" + "'", str25, "hi!");
    }

    @Test
    public void test0943() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0943");
        User user0 = new User();
        java.lang.String str1 = user0.getPassword();
        java.lang.String str2 = user0.getPassword();
        java.lang.String str3 = user0.getPassword();
        java.lang.String str4 = user0.getDob();
        user0.setFirstName("hi!");
        user0.setCountry("hi!");
        user0.setDob("hi!");
        user0.setEmail("hi!");
        user0.setLastName("");
        user0.setCountry("hi!");
        java.lang.String str17 = user0.getCountry();
        java.lang.Class<?> wildcardClass18 = user0.getClass();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test0944() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0944");
        User user0 = new User();
        java.lang.String str1 = user0.getPassword();
        user0.setPassword("hi!");
        java.lang.String str4 = user0.getPassword();
        java.lang.String str5 = user0.getEmail();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNull(str5);
    }

    @Test
    public void test0945() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0945");
        User user0 = new User();
        java.lang.String str1 = user0.getPassword();
        user0.setCountry("hi!");
        java.lang.String str4 = user0.getFirstName();
        java.lang.String str5 = user0.getDob();
        java.lang.String str6 = user0.getLastName();
        user0.setFirstName("hi!");
        user0.setDob("");
        user0.setDob("");
        user0.setEmail("");
        user0.setLastName("hi!");
        java.lang.String str17 = user0.getUsername();
        java.lang.Class<?> wildcardClass18 = user0.getClass();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test0946() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0946");
        User user0 = new User();
        java.lang.String str1 = user0.getPassword();
        user0.setCountry("hi!");
        java.lang.String str4 = user0.getFirstName();
        java.lang.String str5 = user0.getFirstName();
        java.lang.String str6 = user0.getLastName();
        java.lang.String str7 = user0.getLastName();
        java.lang.String str8 = user0.getFirstName();
        java.lang.String str9 = user0.getCountry();
        java.lang.String str10 = user0.getFirstName();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test0947() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0947");
        User user0 = new User();
        java.lang.String str1 = user0.getPassword();
        java.lang.String str2 = user0.getUsername();
        java.lang.String str3 = user0.getEmail();
        user0.setFirstName("");
        user0.setLastName("hi!");
        java.lang.String str8 = user0.getFirstName();
        user0.setDob("");
        java.lang.String str11 = user0.getEmail();
        user0.setUsername("hi!");
        java.lang.String str14 = user0.getPassword();
        java.lang.String str15 = user0.getDob();
        java.lang.String str16 = user0.getDob();
        user0.setLastName("");
        java.lang.String str19 = user0.getDob();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
    }

    @Test
    public void test0948() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0948");
        User user0 = new User();
        user0.setPassword("hi!");
        user0.setPassword("");
        java.lang.String str5 = user0.getPassword();
        user0.setCountry("hi!");
        java.lang.String str8 = user0.getPassword();
        java.lang.String str9 = user0.getDob();
        java.lang.String str10 = user0.getUsername();
        user0.setDob("hi!");
        java.lang.String str13 = user0.getFirstName();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str13);
    }

    @Test
    public void test0949() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0949");
        User user0 = new User();
        java.lang.String str1 = user0.getPassword();
        user0.setCountry("hi!");
        java.lang.String str4 = user0.getFirstName();
        java.lang.String str5 = user0.getDob();
        java.lang.String str6 = user0.getLastName();
        user0.setLastName("");
        user0.setDob("hi!");
        java.lang.String str11 = user0.getCountry();
        java.lang.String str12 = user0.getPassword();
        user0.setPassword("hi!");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test0950() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0950");
        User user0 = new User();
        java.lang.String str1 = user0.getFirstName();
        user0.setPassword("");
        user0.setEmail("hi!");
        java.lang.String str6 = user0.getLastName();
        java.lang.String str7 = user0.getPassword();
        java.lang.String str8 = user0.getPassword();
        user0.setPassword("hi!");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test0951() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0951");
        User user0 = new User();
        java.lang.String str1 = user0.getPassword();
        user0.setCountry("hi!");
        java.lang.String str4 = user0.getFirstName();
        java.lang.String str5 = user0.getDob();
        java.lang.String str6 = user0.getLastName();
        user0.setFirstName("hi!");
        user0.setUsername("");
        java.lang.String str11 = user0.getPassword();
        java.lang.String str12 = user0.getEmail();
        user0.setFirstName("");
        user0.setFirstName("hi!");
        user0.setFirstName("");
        java.lang.String str19 = user0.getPassword();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str19);
    }

    @Test
    public void test0952() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0952");
        User user0 = new User();
        java.lang.String str1 = user0.getPassword();
        user0.setCountry("hi!");
        java.lang.String str4 = user0.getUsername();
        java.lang.String str5 = user0.getPassword();
        java.lang.String str6 = user0.getDob();
        java.lang.String str7 = user0.getCountry();
        java.lang.String str8 = user0.getLastName();
        java.lang.String str9 = user0.getDob();
        java.lang.String str10 = user0.getLastName();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test0953() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0953");
        User user0 = new User();
        java.lang.String str1 = user0.getPassword();
        user0.setCountry("hi!");
        java.lang.String str4 = user0.getFirstName();
        java.lang.String str5 = user0.getDob();
        java.lang.String str6 = user0.getLastName();
        user0.setFirstName("hi!");
        user0.setUsername("");
        java.lang.String str11 = user0.getLastName();
        user0.setPassword("");
        java.lang.String str14 = user0.getPassword();
        user0.setDob("hi!");
        user0.setFirstName("hi!");
        java.lang.String str19 = user0.getUsername();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
    }

    @Test
    public void test0954() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0954");
        User user0 = new User();
        user0.setPassword("hi!");
        java.lang.String str3 = user0.getPassword();
        java.lang.String str4 = user0.getFirstName();
        java.lang.String str5 = user0.getLastName();
        user0.setCountry("");
        user0.setLastName("");
        user0.setEmail("hi!");
        java.lang.String str12 = user0.getFirstName();
        java.lang.Class<?> wildcardClass13 = user0.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0955() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0955");
        User user0 = new User();
        java.lang.String str1 = user0.getPassword();
        user0.setCountry("hi!");
        java.lang.String str4 = user0.getFirstName();
        user0.setLastName("hi!");
        user0.setDob("hi!");
        java.lang.String str9 = user0.getFirstName();
        java.lang.String str10 = user0.getUsername();
        user0.setFirstName("hi!");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test0956() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0956");
        User user0 = new User();
        java.lang.String str1 = user0.getPassword();
        java.lang.String str2 = user0.getUsername();
        user0.setDob("");
        java.lang.String str5 = user0.getEmail();
        java.lang.String str6 = user0.getFirstName();
        user0.setLastName("");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test0957() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0957");
        User user0 = new User();
        java.lang.String str1 = user0.getPassword();
        user0.setCountry("hi!");
        java.lang.String str4 = user0.getFirstName();
        java.lang.String str5 = user0.getUsername();
        user0.setUsername("");
        java.lang.String str8 = user0.getLastName();
        user0.setPassword("");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test0958() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0958");
        User user0 = new User();
        java.lang.String str1 = user0.getPassword();
        user0.setCountry("hi!");
        java.lang.String str4 = user0.getFirstName();
        java.lang.String str5 = user0.getDob();
        java.lang.String str6 = user0.getLastName();
        user0.setFirstName("hi!");
        user0.setDob("hi!");
        java.lang.String str11 = user0.getPassword();
        java.lang.String str12 = user0.getFirstName();
        java.lang.String str13 = user0.getEmail();
        user0.setFirstName("hi!");
        java.lang.String str16 = user0.getCountry();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
    }

    @Test
    public void test0959() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0959");
        User user0 = new User();
        java.lang.String str1 = user0.getPassword();
        user0.setCountry("hi!");
        java.lang.String str4 = user0.getFirstName();
        java.lang.String str5 = user0.getDob();
        java.lang.String str6 = user0.getLastName();
        user0.setUsername("");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test0960() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0960");
        User user0 = new User();
        java.lang.String str1 = user0.getPassword();
        user0.setCountry("hi!");
        java.lang.String str4 = user0.getFirstName();
        java.lang.String str5 = user0.getDob();
        java.lang.String str6 = user0.getLastName();
        user0.setFirstName("hi!");
        user0.setDob("");
        user0.setDob("");
        user0.setEmail("");
        user0.setUsername("hi!");
        java.lang.String str17 = user0.getFirstName();
        java.lang.String str18 = user0.getFirstName();
        java.lang.String str19 = user0.getCountry();
        java.lang.String str20 = user0.getLastName();
        user0.setCountry("");
        java.lang.String str23 = user0.getUsername();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "hi!" + "'", str23, "hi!");
    }

    @Test
    public void test0961() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0961");
        User user0 = new User();
        user0.setLastName("");
        user0.setDob("hi!");
        user0.setCountry("");
        java.lang.String str7 = user0.getDob();
        java.lang.String str8 = user0.getUsername();
        java.lang.String str9 = user0.getLastName();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test0962() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0962");
        User user0 = new User();
        java.lang.String str1 = user0.getPassword();
        user0.setCountry("hi!");
        java.lang.String str4 = user0.getFirstName();
        user0.setLastName("hi!");
        java.lang.String str7 = user0.getFirstName();
        user0.setFirstName("hi!");
        user0.setPassword("hi!");
        java.lang.String str12 = user0.getUsername();
        user0.setUsername("hi!");
        user0.setPassword("hi!");
        java.lang.String str17 = user0.getDob();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str17);
    }

    @Test
    public void test0963() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0963");
        User user0 = new User();
        java.lang.String str1 = user0.getPassword();
        user0.setCountry("hi!");
        java.lang.String str4 = user0.getFirstName();
        java.lang.String str5 = user0.getDob();
        java.lang.String str6 = user0.getLastName();
        java.lang.String str7 = user0.getCountry();
        user0.setEmail("hi!");
        java.lang.String str10 = user0.getEmail();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
    }

    @Test
    public void test0964() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0964");
        User user0 = new User();
        java.lang.String str1 = user0.getPassword();
        user0.setCountry("hi!");
        java.lang.String str4 = user0.getUsername();
        user0.setPassword("");
        user0.setFirstName("");
        java.lang.String str9 = user0.getLastName();
        user0.setCountry("hi!");
        java.lang.String str12 = user0.getCountry();
        user0.setLastName("");
        user0.setPassword("hi!");
        user0.setCountry("");
        java.lang.String str19 = user0.getEmail();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertNull(str19);
    }

    @Test
    public void test0965() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0965");
        User user0 = new User();
        java.lang.String str1 = user0.getPassword();
        user0.setCountry("hi!");
        java.lang.String str4 = user0.getFirstName();
        user0.setLastName("hi!");
        user0.setDob("hi!");
        java.lang.String str9 = user0.getFirstName();
        java.lang.String str10 = user0.getDob();
        java.lang.String str11 = user0.getLastName();
        user0.setUsername("");
        user0.setLastName("hi!");
        user0.setEmail("");
        user0.setUsername("");
        java.lang.String str20 = user0.getFirstName();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertNull(str20);
    }

    @Test
    public void test0966() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0966");
        User user0 = new User();
        java.lang.String str1 = user0.getPassword();
        java.lang.String str2 = user0.getUsername();
        java.lang.String str3 = user0.getEmail();
        user0.setFirstName("");
        user0.setLastName("hi!");
        java.lang.String str8 = user0.getFirstName();
        java.lang.String str9 = user0.getUsername();
        java.lang.String str10 = user0.getLastName();
        user0.setCountry("");
        java.lang.String str13 = user0.getEmail();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNull(str13);
    }

    @Test
    public void test0967() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0967");
        User user0 = new User();
        java.lang.String str1 = user0.getPassword();
        user0.setCountry("hi!");
        java.lang.String str4 = user0.getPassword();
        java.lang.String str5 = user0.getPassword();
        user0.setCountry("hi!");
        java.lang.String str8 = user0.getEmail();
        java.lang.String str9 = user0.getPassword();
        java.lang.String str10 = user0.getUsername();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test0968() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0968");
        User user0 = new User();
        java.lang.String str1 = user0.getPassword();
        user0.setUsername("");
        user0.setFirstName("hi!");
        user0.setDob("");
        user0.setLastName("");
        java.lang.String str10 = user0.getPassword();
        user0.setPassword("hi!");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test0969() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0969");
        User user0 = new User();
        java.lang.String str1 = user0.getPassword();
        java.lang.String str2 = user0.getUsername();
        java.lang.String str3 = user0.getEmail();
        user0.setFirstName("");
        user0.setLastName("hi!");
        user0.setUsername("hi!");
        user0.setEmail("");
        user0.setEmail("");
        java.lang.String str14 = user0.getEmail();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test0970() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0970");
        User user0 = new User();
        java.lang.String str1 = user0.getPassword();
        user0.setCountry("hi!");
        java.lang.String str4 = user0.getPassword();
        java.lang.String str5 = user0.getPassword();
        user0.setCountry("");
        java.lang.String str8 = user0.getCountry();
        user0.setLastName("hi!");
        user0.setEmail("");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test0971() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0971");
        User user0 = new User();
        java.lang.String str1 = user0.getPassword();
        user0.setCountry("hi!");
        user0.setUsername("hi!");
        user0.setCountry("");
        user0.setLastName("");
        user0.setLastName("hi!");
        java.lang.Class<?> wildcardClass12 = user0.getClass();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0972() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0972");
        User user0 = new User();
        java.lang.String str1 = user0.getPassword();
        user0.setCountry("hi!");
        java.lang.String str4 = user0.getFirstName();
        user0.setLastName("hi!");
        java.lang.String str7 = user0.getFirstName();
        java.lang.String str8 = user0.getFirstName();
        user0.setFirstName("hi!");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test0973() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0973");
        User user0 = new User();
        java.lang.String str1 = user0.getPassword();
        java.lang.String str2 = user0.getUsername();
        java.lang.String str3 = user0.getCountry();
        user0.setEmail("hi!");
        java.lang.String str6 = user0.getPassword();
        java.lang.String str7 = user0.getEmail();
        java.lang.String str8 = user0.getPassword();
        user0.setDob("hi!");
        user0.setDob("");
        java.lang.String str13 = user0.getFirstName();
        java.lang.String str14 = user0.getPassword();
        user0.setLastName("hi!");
        java.lang.Class<?> wildcardClass17 = user0.getClass();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test0974() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0974");
        User user0 = new User();
        java.lang.String str1 = user0.getPassword();
        user0.setCountry("hi!");
        java.lang.String str4 = user0.getFirstName();
        java.lang.String str5 = user0.getDob();
        java.lang.String str6 = user0.getLastName();
        user0.setFirstName("hi!");
        user0.setDob("hi!");
        user0.setUsername("");
        java.lang.String str13 = user0.getLastName();
        user0.setDob("");
        java.lang.String str16 = user0.getEmail();
        java.lang.String str17 = user0.getFirstName();
        java.lang.String str18 = user0.getDob();
        user0.setLastName("hi!");
        user0.setLastName("");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
    }

    @Test
    public void test0975() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0975");
        User user0 = new User();
        java.lang.String str1 = user0.getPassword();
        user0.setCountry("hi!");
        java.lang.String str4 = user0.getPassword();
        java.lang.String str5 = user0.getDob();
        user0.setCountry("hi!");
        java.lang.String str8 = user0.getCountry();
        java.lang.String str9 = user0.getEmail();
        user0.setCountry("hi!");
        user0.setPassword("");
        java.lang.String str14 = user0.getPassword();
        user0.setUsername("hi!");
        java.lang.String str17 = user0.getUsername();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
    }

    @Test
    public void test0976() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0976");
        User user0 = new User();
        java.lang.String str1 = user0.getPassword();
        user0.setCountry("hi!");
        java.lang.String str4 = user0.getUsername();
        user0.setPassword("");
        user0.setFirstName("");
        java.lang.String str9 = user0.getLastName();
        user0.setCountry("hi!");
        java.lang.String str12 = user0.getCountry();
        java.lang.String str13 = user0.getUsername();
        user0.setCountry("hi!");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertNull(str13);
    }

    @Test
    public void test0977() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0977");
        User user0 = new User();
        java.lang.String str1 = user0.getPassword();
        user0.setUsername("");
        user0.setFirstName("hi!");
        user0.setDob("");
        user0.setLastName("");
        java.lang.String str10 = user0.getPassword();
        java.lang.String str11 = user0.getLastName();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test0978() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0978");
        User user0 = new User();
        java.lang.String str1 = user0.getPassword();
        java.lang.String str2 = user0.getUsername();
        java.lang.String str3 = user0.getEmail();
        user0.setUsername("");
        java.lang.String str6 = user0.getFirstName();
        java.lang.String str7 = user0.getUsername();
        user0.setPassword("");
        java.lang.String str10 = user0.getPassword();
        java.lang.String str11 = user0.getFirstName();
        java.lang.String str12 = user0.getUsername();
        java.lang.String str13 = user0.getLastName();
        user0.setLastName("");
        java.lang.String str16 = user0.getLastName();
        java.lang.String str17 = user0.getDob();
        user0.setFirstName("");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertNull(str17);
    }

    @Test
    public void test0979() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0979");
        User user0 = new User();
        java.lang.String str1 = user0.getPassword();
        user0.setUsername("hi!");
        user0.setFirstName("");
        java.lang.String str6 = user0.getPassword();
        user0.setLastName("");
        java.lang.String str9 = user0.getDob();
        java.lang.String str10 = user0.getEmail();
        java.lang.String str11 = user0.getPassword();
        java.lang.String str12 = user0.getEmail();
        user0.setEmail("");
        user0.setCountry("hi!");
        user0.setUsername("");
        user0.setUsername("");
        user0.setEmail("hi!");
        java.lang.String str23 = user0.getPassword();
        java.lang.String str24 = user0.getFirstName();
        user0.setEmail("");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str23);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
    }

    @Test
    public void test0980() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0980");
        User user0 = new User();
        java.lang.String str1 = user0.getPassword();
        java.lang.String str2 = user0.getUsername();
        java.lang.String str3 = user0.getDob();
        java.lang.String str4 = user0.getPassword();
        user0.setDob("");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
    }

    @Test
    public void test0981() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0981");
        User user0 = new User();
        user0.setPassword("hi!");
        user0.setPassword("");
        java.lang.String str5 = user0.getPassword();
        user0.setCountry("hi!");
        user0.setLastName("hi!");
        user0.setFirstName("");
        java.lang.String str12 = user0.getFirstName();
        java.lang.String str13 = user0.getCountry();
        java.lang.String str14 = user0.getPassword();
        user0.setUsername("");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test0982() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0982");
        User user0 = new User();
        user0.setPassword("hi!");
        user0.setPassword("");
        java.lang.String str5 = user0.getPassword();
        java.lang.String str6 = user0.getPassword();
        user0.setDob("");
        user0.setFirstName("hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test0983() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0983");
        User user0 = new User();
        java.lang.String str1 = user0.getPassword();
        java.lang.String str2 = user0.getUsername();
        java.lang.String str3 = user0.getDob();
        java.lang.String str4 = user0.getPassword();
        java.lang.String str5 = user0.getLastName();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
    }

    @Test
    public void test0984() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0984");
        User user0 = new User();
        java.lang.String str1 = user0.getPassword();
        user0.setCountry("hi!");
        java.lang.String str4 = user0.getFirstName();
        user0.setLastName("hi!");
        user0.setDob("hi!");
        java.lang.String str9 = user0.getFirstName();
        user0.setCountry("");
        java.lang.String str12 = user0.getFirstName();
        java.lang.String str13 = user0.getEmail();
        user0.setPassword("hi!");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str13);
    }

    @Test
    public void test0985() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0985");
        User user0 = new User();
        java.lang.String str1 = user0.getPassword();
        user0.setCountry("hi!");
        user0.setUsername("hi!");
        java.lang.String str6 = user0.getUsername();
        user0.setLastName("");
        user0.setEmail("hi!");
        user0.setCountry("");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
    }

    @Test
    public void test0986() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0986");
        User user0 = new User();
        user0.setPassword("hi!");
        user0.setPassword("");
        java.lang.String str5 = user0.getPassword();
        user0.setCountry("hi!");
        java.lang.String str8 = user0.getPassword();
        java.lang.String str9 = user0.getDob();
        java.lang.String str10 = user0.getUsername();
        user0.setEmail("hi!");
        user0.setFirstName("");
        user0.setDob("");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test0987() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0987");
        User user0 = new User();
        java.lang.String str1 = user0.getPassword();
        user0.setCountry("hi!");
        java.lang.String str4 = user0.getFirstName();
        java.lang.String str5 = user0.getDob();
        java.lang.String str6 = user0.getLastName();
        java.lang.String str7 = user0.getCountry();
        java.lang.String str8 = user0.getPassword();
        user0.setFirstName("hi!");
        user0.setEmail("hi!");
        user0.setDob("");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test0988() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0988");
        User user0 = new User();
        java.lang.String str1 = user0.getPassword();
        user0.setCountry("hi!");
        java.lang.String str4 = user0.getFirstName();
        user0.setLastName("hi!");
        user0.setDob("hi!");
        java.lang.String str9 = user0.getEmail();
        user0.setLastName("");
        user0.setCountry("");
        java.lang.String str14 = user0.getDob();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
    }

    @Test
    public void test0989() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0989");
        User user0 = new User();
        java.lang.String str1 = user0.getFirstName();
        java.lang.String str2 = user0.getPassword();
        java.lang.String str3 = user0.getDob();
        user0.setPassword("");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test0990() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0990");
        User user0 = new User();
        java.lang.String str1 = user0.getPassword();
        user0.setCountry("hi!");
        java.lang.String str4 = user0.getUsername();
        java.lang.String str5 = user0.getPassword();
        java.lang.String str6 = user0.getUsername();
        user0.setCountry("hi!");
        user0.setUsername("");
        java.lang.String str11 = user0.getDob();
        user0.setLastName("hi!");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test0991() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0991");
        User user0 = new User();
        java.lang.String str1 = user0.getPassword();
        user0.setCountry("hi!");
        java.lang.String str4 = user0.getPassword();
        user0.setFirstName("");
        java.lang.String str7 = user0.getFirstName();
        java.lang.String str8 = user0.getDob();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test0992() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0992");
        User user0 = new User();
        java.lang.String str1 = user0.getFirstName();
        user0.setPassword("");
        user0.setEmail("hi!");
        user0.setCountry("");
        user0.setLastName("hi!");
        java.lang.String str10 = user0.getDob();
        user0.setEmail("hi!");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test0993() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0993");
        User user0 = new User();
        java.lang.String str1 = user0.getPassword();
        user0.setCountry("hi!");
        java.lang.String str4 = user0.getUsername();
        user0.setPassword("");
        user0.setFirstName("");
        java.lang.String str9 = user0.getUsername();
        java.lang.String str10 = user0.getCountry();
        user0.setEmail("hi!");
        java.lang.String str13 = user0.getUsername();
        user0.setDob("hi!");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNull(str13);
    }

    @Test
    public void test0994() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0994");
        User user0 = new User();
        java.lang.String str1 = user0.getPassword();
        user0.setCountry("hi!");
        java.lang.String str4 = user0.getFirstName();
        java.lang.String str5 = user0.getDob();
        java.lang.String str6 = user0.getLastName();
        user0.setFirstName("hi!");
        user0.setDob("hi!");
        java.lang.String str11 = user0.getPassword();
        java.lang.String str12 = user0.getUsername();
        user0.setEmail("hi!");
        user0.setCountry("");
        user0.setFirstName("hi!");
        user0.setUsername("hi!");
        java.lang.String str21 = user0.getPassword();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str21);
    }

    @Test
    public void test0995() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0995");
        User user0 = new User();
        java.lang.String str1 = user0.getPassword();
        java.lang.String str2 = user0.getUsername();
        java.lang.String str3 = user0.getEmail();
        user0.setFirstName("");
        user0.setLastName("hi!");
        java.lang.String str8 = user0.getFirstName();
        java.lang.String str9 = user0.getUsername();
        java.lang.String str10 = user0.getLastName();
        user0.setCountry("");
        user0.setLastName("hi!");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
    }

    @Test
    public void test0996() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0996");
        User user0 = new User();
        java.lang.String str1 = user0.getPassword();
        user0.setUsername("hi!");
        user0.setCountry("hi!");
        java.lang.String str6 = user0.getLastName();
        user0.setUsername("");
        java.lang.String str9 = user0.getLastName();
        java.lang.String str10 = user0.getEmail();
        java.lang.String str11 = user0.getEmail();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test0997() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0997");
        User user0 = new User();
        java.lang.String str1 = user0.getPassword();
        user0.setCountry("hi!");
        java.lang.String str4 = user0.getPassword();
        java.lang.String str5 = user0.getPassword();
        java.lang.String str6 = user0.getEmail();
        java.lang.String str7 = user0.getUsername();
        user0.setFirstName("");
        user0.setUsername("");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test0998() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0998");
        User user0 = new User();
        java.lang.String str1 = user0.getPassword();
        user0.setUsername("hi!");
        user0.setFirstName("");
        java.lang.String str6 = user0.getPassword();
        user0.setUsername("hi!");
        java.lang.String str9 = user0.getFirstName();
        java.lang.String str10 = user0.getFirstName();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test0999() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0999");
        User user0 = new User();
        java.lang.String str1 = user0.getPassword();
        user0.setCountry("hi!");
        java.lang.String str4 = user0.getFirstName();
        user0.setLastName("hi!");
        user0.setDob("hi!");
        java.lang.String str9 = user0.getFirstName();
        user0.setCountry("");
        user0.setEmail("");
        user0.setEmail("");
        user0.setCountry("hi!");
        user0.setLastName("");
        user0.setLastName("hi!");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test1000() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test1000");
        User user0 = new User();
        user0.setPassword("hi!");
        user0.setPassword("");
        user0.setPassword("");
        java.lang.String str7 = user0.getUsername();
        user0.setLastName("");
        java.lang.Class<?> wildcardClass10 = user0.getClass();
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }
}

