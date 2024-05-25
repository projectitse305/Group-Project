import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest3 {

    public static boolean debug = false;

    @Test
    public void test1501() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1501");
        User user0 = new User();
        java.lang.String str1 = user0.getPassword();
        user0.setCountry("hi!");
        java.lang.String str4 = user0.getUsername();
        user0.setPassword("");
        user0.setFirstName("hi!");
        user0.setDob("hi!");
        user0.setFirstName("");
        user0.setFirstName("");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str4);
    }

    @Test
    public void test1502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1502");
        User user0 = new User();
        user0.setPassword("hi!");
        user0.setPassword("");
        java.lang.String str5 = user0.getPassword();
        user0.setCountry("hi!");
        java.lang.String str8 = user0.getPassword();
        java.lang.String str9 = user0.getDob();
        user0.setDob("");
        java.lang.String str12 = user0.getUsername();
        user0.setPassword("hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test1503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1503");
        User user0 = new User();
        java.lang.String str1 = user0.getPassword();
        user0.setCountry("hi!");
        java.lang.String str4 = user0.getFirstName();
        user0.setLastName("hi!");
        user0.setLastName("hi!");
        user0.setEmail("hi!");
        user0.setCountry("");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str4);
    }

    @Test
    public void test1504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1504");
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
        user0.setPassword("");
        java.lang.String str20 = user0.getFirstName();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
    }

    @Test
    public void test1505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1505");
        User user0 = new User();
        java.lang.String str1 = user0.getPassword();
        user0.setUsername("");
        user0.setLastName("");
        java.lang.String str6 = user0.getUsername();
        java.lang.String str7 = user0.getUsername();
        user0.setFirstName("hi!");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test1506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1506");
        User user0 = new User();
        java.lang.String str1 = user0.getPassword();
        user0.setCountry("hi!");
        java.lang.String str4 = user0.getFirstName();
        java.lang.String str5 = user0.getDob();
        java.lang.String str6 = user0.getLastName();
        user0.setLastName("");
        user0.setEmail("");
        java.lang.String str11 = user0.getLastName();
        user0.setFirstName("");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test1507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1507");
        User user0 = new User();
        user0.setLastName("");
        java.lang.String str3 = user0.getCountry();
        java.lang.String str4 = user0.getDob();
        user0.setUsername("");
        java.lang.String str7 = user0.getFirstName();
        user0.setCountry("");
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test1508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1508");
        User user0 = new User();
        java.lang.String str1 = user0.getPassword();
        user0.setUsername("hi!");
        user0.setFirstName("");
        java.lang.String str6 = user0.getPassword();
        user0.setLastName("");
        java.lang.String str9 = user0.getDob();
        java.lang.String str10 = user0.getLastName();
        java.lang.String str11 = user0.getFirstName();
        user0.setFirstName("");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test1509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1509");
        User user0 = new User();
        java.lang.String str1 = user0.getPassword();
        user0.setCountry("hi!");
        java.lang.String str4 = user0.getFirstName();
        user0.setLastName("hi!");
        user0.setDob("hi!");
        user0.setDob("hi!");
        user0.setEmail("hi!");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str4);
    }

    @Test
    public void test1510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1510");
        User user0 = new User();
        java.lang.String str1 = user0.getPassword();
        java.lang.String str2 = user0.getPassword();
        java.lang.String str3 = user0.getFirstName();
        user0.setDob("hi!");
        java.lang.String str6 = user0.getEmail();
        user0.setPassword("hi!");
        user0.setDob("");
        user0.setPassword("hi!");
        user0.setCountry("hi!");
        user0.setUsername("");
        java.lang.String str17 = user0.getUsername();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
    }

    @Test
    public void test1511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1511");
        User user0 = new User();
        java.lang.String str1 = user0.getPassword();
        java.lang.String str2 = user0.getUsername();
        java.lang.String str3 = user0.getEmail();
        user0.setUsername("");
        java.lang.String str6 = user0.getFirstName();
        java.lang.String str7 = user0.getUsername();
        java.lang.String str8 = user0.getCountry();
        java.lang.String str9 = user0.getDob();
        user0.setCountry("hi!");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test1512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1512");
        User user0 = new User();
        java.lang.String str1 = user0.getPassword();
        user0.setCountry("hi!");
        java.lang.String str4 = user0.getFirstName();
        java.lang.String str5 = user0.getDob();
        java.lang.String str6 = user0.getLastName();
        user0.setLastName("");
        user0.setPassword("hi!");
        java.lang.String str11 = user0.getPassword();
        user0.setCountry("");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
    }

    @Test
    public void test1513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1513");
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
        user0.setFirstName("");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(str14);
    }

    @Test
    public void test1514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1514");
        User user0 = new User();
        java.lang.String str1 = user0.getPassword();
        java.lang.String str2 = user0.getPassword();
        user0.setUsername("");
        java.lang.String str5 = user0.getCountry();
        java.lang.String str6 = user0.getCountry();
        java.lang.String str7 = user0.getLastName();
        user0.setFirstName("");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test1515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1515");
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
        java.lang.String str17 = user0.getFirstName();
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
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
    }

    @Test
    public void test1516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1516");
        User user0 = new User();
        java.lang.String str1 = user0.getPassword();
        user0.setCountry("hi!");
        java.lang.String str4 = user0.getFirstName();
        java.lang.String str5 = user0.getDob();
        java.lang.String str6 = user0.getLastName();
        java.lang.String str7 = user0.getCountry();
        user0.setEmail("hi!");
        user0.setLastName("hi!");
        user0.setEmail("");
        java.lang.String str14 = user0.getEmail();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test1517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1517");
        User user0 = new User();
        java.lang.String str1 = user0.getPassword();
        user0.setUsername("");
        java.lang.String str4 = user0.getLastName();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str4);
    }

    @Test
    public void test1518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1518");
        User user0 = new User();
        user0.setPassword("hi!");
        java.lang.String str3 = user0.getPassword();
        java.lang.String str4 = user0.getFirstName();
        java.lang.String str5 = user0.getPassword();
        user0.setUsername("");
        java.lang.String str8 = user0.getUsername();
        user0.setDob("");
        user0.setLastName("hi!");
        user0.setCountry("hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test1519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1519");
        User user0 = new User();
        java.lang.String str1 = user0.getPassword();
        java.lang.String str2 = user0.getUsername();
        java.lang.String str3 = user0.getEmail();
        user0.setFirstName("");
        user0.setLastName("hi!");
        java.lang.String str8 = user0.getFirstName();
        user0.setDob("");
        user0.setDob("hi!");
        user0.setEmail("");
        user0.setUsername("hi!");
        user0.setEmail("hi!");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test1520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1520");
        User user0 = new User();
        user0.setPassword("hi!");
        user0.setPassword("");
        java.lang.String str5 = user0.getPassword();
        java.lang.String str6 = user0.getEmail();
        user0.setFirstName("hi!");
        user0.setFirstName("hi!");
        java.lang.String str11 = user0.getPassword();
        java.lang.String str12 = user0.getUsername();
        user0.setLastName("");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test1521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1521");
        User user0 = new User();
        java.lang.String str1 = user0.getPassword();
        user0.setCountry("hi!");
        java.lang.String str4 = user0.getPassword();
        java.lang.String str5 = user0.getPassword();
        java.lang.String str6 = user0.getEmail();
        java.lang.String str7 = user0.getUsername();
        java.lang.String str8 = user0.getPassword();
        java.lang.String str9 = user0.getPassword();
        user0.setEmail("");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test1522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1522");
        User user0 = new User();
        java.lang.String str1 = user0.getPassword();
        java.lang.String str2 = user0.getLastName();
        java.lang.String str3 = user0.getEmail();
        java.lang.String str4 = user0.getDob();
        user0.setDob("");
        java.lang.String str7 = user0.getCountry();
        java.lang.String str8 = user0.getPassword();
        user0.setLastName("");
        java.lang.String str11 = user0.getUsername();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test1523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1523");
        User user0 = new User();
        java.lang.String str1 = user0.getPassword();
        java.lang.String str2 = user0.getPassword();
        java.lang.String str3 = user0.getFirstName();
        user0.setDob("hi!");
        java.lang.String str6 = user0.getEmail();
        user0.setPassword("hi!");
        java.lang.String str9 = user0.getPassword();
        java.lang.String str10 = user0.getEmail();
        user0.setCountry("");
        user0.setFirstName("");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test1524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1524");
        User user0 = new User();
        java.lang.String str1 = user0.getPassword();
        java.lang.String str2 = user0.getUsername();
        user0.setDob("");
        java.lang.String str5 = user0.getLastName();
        java.lang.String str6 = user0.getDob();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test1525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1525");
        User user0 = new User();
        java.lang.String str1 = user0.getPassword();
        java.lang.String str2 = user0.getPassword();
        java.lang.String str3 = user0.getPassword();
        user0.setLastName("");
        user0.setUsername("hi!");
        user0.setUsername("");
        user0.setUsername("");
        user0.setUsername("hi!");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test1526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1526");
        User user0 = new User();
        java.lang.String str1 = user0.getPassword();
        user0.setUsername("");
        user0.setFirstName("hi!");
        java.lang.String str6 = user0.getCountry();
        user0.setCountry("");
        user0.setEmail("");
        user0.setPassword("hi!");
        user0.setEmail("hi!");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test1527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1527");
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
        java.lang.String str16 = user0.getCountry();
        java.lang.String str17 = user0.getPassword();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertNull(str17);
    }

    @Test
    public void test1528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1528");
        User user0 = new User();
        user0.setPassword("hi!");
        java.lang.String str3 = user0.getPassword();
        user0.setLastName("hi!");
        user0.setUsername("hi!");
        user0.setEmail("");
        java.lang.String str10 = user0.getUsername();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
    }

    @Test
    public void test1529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1529");
        User user0 = new User();
        java.lang.String str1 = user0.getFirstName();
        java.lang.String str2 = user0.getCountry();
        java.lang.String str3 = user0.getFirstName();
        user0.setFirstName("");
        user0.setPassword("hi!");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test1530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1530");
        User user0 = new User();
        java.lang.String str1 = user0.getPassword();
        java.lang.String str2 = user0.getPassword();
        user0.setLastName("hi!");
        java.lang.String str5 = user0.getCountry();
        user0.setCountry("hi!");
        java.lang.String str8 = user0.getPassword();
        java.lang.String str9 = user0.getUsername();
        user0.setCountry("hi!");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test1531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1531");
        User user0 = new User();
        java.lang.String str1 = user0.getPassword();
        java.lang.String str2 = user0.getUsername();
        java.lang.String str3 = user0.getEmail();
        java.lang.String str4 = user0.getLastName();
        java.lang.String str5 = user0.getFirstName();
        user0.setFirstName("");
        user0.setCountry("");
        java.lang.String str10 = user0.getUsername();
        java.lang.String str11 = user0.getCountry();
        java.lang.String str12 = user0.getCountry();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test1532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1532");
        User user0 = new User();
        user0.setPassword("hi!");
        java.lang.String str3 = user0.getPassword();
        java.lang.String str4 = user0.getFirstName();
        java.lang.String str5 = user0.getLastName();
        user0.setCountry("");
        user0.setCountry("");
        user0.setPassword("hi!");
        java.lang.Class<?> wildcardClass12 = user0.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test1533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1533");
        User user0 = new User();
        java.lang.String str1 = user0.getPassword();
        user0.setUsername("");
        user0.setFirstName("hi!");
        user0.setDob("");
        user0.setEmail("");
        user0.setDob("");
        java.lang.String str12 = user0.getFirstName();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
    }

    @Test
    public void test1534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1534");
        User user0 = new User();
        java.lang.String str1 = user0.getPassword();
        java.lang.String str2 = user0.getUsername();
        java.lang.String str3 = user0.getEmail();
        user0.setUsername("");
        user0.setUsername("");
        java.lang.String str8 = user0.getUsername();
        java.lang.String str9 = user0.getPassword();
        user0.setEmail("");
        java.lang.Class<?> wildcardClass12 = user0.getClass();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test1535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1535");
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
        user0.setFirstName("");
        java.lang.String str17 = user0.getDob();
        java.lang.String str18 = user0.getPassword();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertNull(str18);
    }

    @Test
    public void test1536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1536");
        User user0 = new User();
        java.lang.String str1 = user0.getPassword();
        user0.setUsername("hi!");
        user0.setCountry("hi!");
        java.lang.String str6 = user0.getCountry();
        java.lang.String str7 = user0.getLastName();
        user0.setLastName("hi!");
        user0.setLastName("hi!");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test1537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1537");
        User user0 = new User();
        java.lang.String str1 = user0.getPassword();
        user0.setCountry("hi!");
        java.lang.String str4 = user0.getFirstName();
        user0.setLastName("hi!");
        user0.setDob("hi!");
        java.lang.String str9 = user0.getFirstName();
        user0.setPassword("");
        user0.setDob("");
        java.lang.String str14 = user0.getUsername();
        java.lang.String str15 = user0.getFirstName();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(str15);
    }

    @Test
    public void test1538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1538");
        User user0 = new User();
        java.lang.String str1 = user0.getPassword();
        user0.setCountry("hi!");
        java.lang.String str4 = user0.getFirstName();
        java.lang.String str5 = user0.getDob();
        java.lang.String str6 = user0.getLastName();
        user0.setFirstName("hi!");
        user0.setEmail("hi!");
        user0.setPassword("hi!");
        user0.setDob("hi!");
        java.lang.String str15 = user0.getLastName();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str15);
    }

    @Test
    public void test1539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1539");
        User user0 = new User();
        java.lang.String str1 = user0.getPassword();
        user0.setUsername("hi!");
        user0.setFirstName("hi!");
        user0.setUsername("");
        java.lang.String str8 = user0.getDob();
        user0.setFirstName("");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test1540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1540");
        User user0 = new User();
        java.lang.String str1 = user0.getFirstName();
        user0.setPassword("");
        java.lang.String str4 = user0.getUsername();
        user0.setLastName("");
        user0.setFirstName("hi!");
        user0.setPassword("hi!");
        java.lang.String str11 = user0.getDob();
        user0.setUsername("");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test1541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1541");
        User user0 = new User();
        java.lang.String str1 = user0.getPassword();
        user0.setCountry("hi!");
        java.lang.String str4 = user0.getFirstName();
        java.lang.String str5 = user0.getDob();
        java.lang.String str6 = user0.getEmail();
        user0.setFirstName("hi!");
        user0.setCountry("hi!");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test1542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1542");
        User user0 = new User();
        user0.setPassword("hi!");
        user0.setPassword("");
        java.lang.String str5 = user0.getPassword();
        user0.setCountry("hi!");
        user0.setLastName("hi!");
        user0.setFirstName("");
        java.lang.String str12 = user0.getPassword();
        user0.setEmail("");
        user0.setLastName("");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test1543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1543");
        User user0 = new User();
        java.lang.String str1 = user0.getPassword();
        java.lang.String str2 = user0.getUsername();
        java.lang.String str3 = user0.getEmail();
        user0.setUsername("");
        java.lang.String str6 = user0.getFirstName();
        java.lang.String str7 = user0.getUsername();
        user0.setPassword("");
        java.lang.String str10 = user0.getPassword();
        user0.setUsername("hi!");
        user0.setCountry("hi!");
        user0.setEmail("hi!");
        user0.setUsername("");
        java.lang.String str19 = user0.getPassword();
        java.lang.String str20 = user0.getFirstName();
        java.lang.String str21 = user0.getDob();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertNull(str21);
    }

    @Test
    public void test1544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1544");
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
        java.lang.String str16 = user0.getFirstName();
        java.lang.String str17 = user0.getDob();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
    }

    @Test
    public void test1545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1545");
        User user0 = new User();
        java.lang.String str1 = user0.getPassword();
        java.lang.String str2 = user0.getUsername();
        java.lang.String str3 = user0.getEmail();
        user0.setFirstName("");
        user0.setLastName("hi!");
        java.lang.String str8 = user0.getFirstName();
        java.lang.String str9 = user0.getUsername();
        user0.setLastName("");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test1546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1546");
        User user0 = new User();
        user0.setPassword("hi!");
        user0.setPassword("");
        java.lang.String str5 = user0.getDob();
        user0.setEmail("");
        user0.setUsername("");
        user0.setPassword("");
        user0.setLastName("");
        user0.setLastName("hi!");
        user0.setEmail("hi!");
        org.junit.Assert.assertNull(str5);
    }

    @Test
    public void test1547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1547");
        User user0 = new User();
        java.lang.String str1 = user0.getPassword();
        java.lang.String str2 = user0.getPassword();
        user0.setLastName("hi!");
        java.lang.String str5 = user0.getCountry();
        user0.setLastName("hi!");
        java.lang.String str8 = user0.getDob();
        user0.setDob("");
        java.lang.String str11 = user0.getUsername();
        java.lang.String str12 = user0.getUsername();
        user0.setEmail("");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test1548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1548");
        User user0 = new User();
        java.lang.String str1 = user0.getPassword();
        java.lang.String str2 = user0.getUsername();
        java.lang.String str3 = user0.getEmail();
        java.lang.String str4 = user0.getLastName();
        user0.setDob("");
        java.lang.String str7 = user0.getLastName();
        user0.setPassword("hi!");
        user0.setFirstName("");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test1549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1549");
        User user0 = new User();
        user0.setPassword("hi!");
        user0.setPassword("");
        java.lang.String str5 = user0.getPassword();
        user0.setCountry("hi!");
        user0.setLastName("hi!");
        java.lang.String str10 = user0.getFirstName();
        java.lang.String str11 = user0.getFirstName();
        user0.setCountry("");
        user0.setPassword("");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test1550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1550");
        User user0 = new User();
        user0.setPassword("hi!");
        user0.setPassword("");
        java.lang.String str5 = user0.getDob();
        user0.setEmail("");
        user0.setUsername("");
        user0.setFirstName("hi!");
        user0.setFirstName("");
        user0.setEmail("");
        user0.setDob("hi!");
        user0.setDob("hi!");
        java.lang.String str20 = user0.getUsername();
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
    }

    @Test
    public void test1551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1551");
        User user0 = new User();
        java.lang.String str1 = user0.getPassword();
        java.lang.String str2 = user0.getPassword();
        user0.setLastName("hi!");
        java.lang.String str5 = user0.getCountry();
        user0.setLastName("hi!");
        user0.setPassword("");
        user0.setUsername("hi!");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str5);
    }

    @Test
    public void test1552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1552");
        User user0 = new User();
        java.lang.String str1 = user0.getPassword();
        java.lang.String str2 = user0.getPassword();
        java.lang.String str3 = user0.getPassword();
        java.lang.String str4 = user0.getDob();
        user0.setUsername("");
        user0.setUsername("hi!");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
    }

    @Test
    public void test1553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1553");
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
        java.lang.String str13 = user0.getFirstName();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
    }

    @Test
    public void test1554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1554");
        User user0 = new User();
        user0.setPassword("hi!");
        user0.setPassword("");
        java.lang.String str5 = user0.getPassword();
        user0.setCountry("hi!");
        java.lang.String str8 = user0.getPassword();
        java.lang.String str9 = user0.getDob();
        user0.setDob("hi!");
        user0.setFirstName("");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test1555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1555");
        User user0 = new User();
        java.lang.String str1 = user0.getPassword();
        java.lang.String str2 = user0.getUsername();
        java.lang.String str3 = user0.getEmail();
        user0.setUsername("");
        user0.setDob("hi!");
        java.lang.String str8 = user0.getCountry();
        java.lang.String str9 = user0.getDob();
        user0.setFirstName("");
        java.lang.String str12 = user0.getUsername();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test1556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1556");
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
        java.lang.String str14 = user0.getEmail();
        user0.setEmail("");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertNull(str14);
    }

    @Test
    public void test1557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1557");
        User user0 = new User();
        user0.setPassword("hi!");
        java.lang.String str3 = user0.getPassword();
        java.lang.String str4 = user0.getFirstName();
        java.lang.String str5 = user0.getLastName();
        user0.setCountry("");
        user0.setUsername("");
        user0.setUsername("");
        user0.setCountry("");
        user0.setEmail("hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
    }

    @Test
    public void test1558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1558");
        User user0 = new User();
        java.lang.String str1 = user0.getPassword();
        java.lang.String str2 = user0.getUsername();
        java.lang.String str3 = user0.getEmail();
        user0.setFirstName("");
        user0.setLastName("hi!");
        user0.setUsername("hi!");
        java.lang.String str10 = user0.getUsername();
        user0.setLastName("");
        java.lang.String str13 = user0.getUsername();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
    }

    @Test
    public void test1559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1559");
        User user0 = new User();
        java.lang.String str1 = user0.getPassword();
        user0.setCountry("hi!");
        java.lang.String str4 = user0.getUsername();
        java.lang.String str5 = user0.getPassword();
        user0.setDob("");
        java.lang.String str8 = user0.getCountry();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
    }

    @Test
    public void test1560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1560");
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
        user0.setFirstName("");
        java.lang.String str17 = user0.getDob();
        java.lang.String str18 = user0.getUsername();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertNull(str18);
    }

    @Test
    public void test1561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1561");
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
        user0.setFirstName("");
        user0.setFirstName("");
        java.lang.String str21 = user0.getPassword();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str21);
    }

    @Test
    public void test1562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1562");
        User user0 = new User();
        user0.setPassword("hi!");
        user0.setPassword("");
        java.lang.String str5 = user0.getPassword();
        java.lang.String str6 = user0.getEmail();
        user0.setFirstName("hi!");
        java.lang.String str9 = user0.getPassword();
        user0.setEmail("hi!");
        java.lang.String str12 = user0.getPassword();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test1563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1563");
        User user0 = new User();
        java.lang.String str1 = user0.getPassword();
        java.lang.String str2 = user0.getUsername();
        java.lang.String str3 = user0.getEmail();
        user0.setFirstName("");
        user0.setFirstName("hi!");
        user0.setDob("hi!");
        java.lang.String str10 = user0.getFirstName();
        user0.setDob("");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
    }

    @Test
    public void test1564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1564");
        User user0 = new User();
        java.lang.String str1 = user0.getPassword();
        user0.setUsername("hi!");
        user0.setCountry("hi!");
        user0.setFirstName("");
        user0.setCountry("");
        java.lang.String str10 = user0.getDob();
        user0.setLastName("hi!");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test1565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1565");
        User user0 = new User();
        java.lang.String str1 = user0.getPassword();
        user0.setUsername("");
        java.lang.String str4 = user0.getCountry();
        java.lang.String str5 = user0.getEmail();
        user0.setEmail("");
        java.lang.Class<?> wildcardClass8 = user0.getClass();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test1566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1566");
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
        java.lang.String str18 = user0.getPassword();
        user0.setCountry("hi!");
        java.lang.String str21 = user0.getFirstName();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertNull(str21);
    }

    @Test
    public void test1567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1567");
        User user0 = new User();
        java.lang.String str1 = user0.getPassword();
        java.lang.String str2 = user0.getPassword();
        user0.setLastName("hi!");
        java.lang.String str5 = user0.getCountry();
        user0.setCountry("hi!");
        user0.setLastName("");
        java.lang.String str10 = user0.getCountry();
        java.lang.String str11 = user0.getDob();
        user0.setDob("");
        user0.setFirstName("hi!");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test1568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1568");
        User user0 = new User();
        java.lang.String str1 = user0.getPassword();
        java.lang.String str2 = user0.getUsername();
        java.lang.String str3 = user0.getEmail();
        user0.setFirstName("");
        user0.setLastName("hi!");
        user0.setUsername("hi!");
        user0.setDob("");
        java.lang.String str12 = user0.getCountry();
        user0.setLastName("hi!");
        user0.setCountry("");
        user0.setCountry("hi!");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test1569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1569");
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
        java.lang.String str15 = user0.getCountry();
        java.lang.String str16 = user0.getLastName();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
    }

    @Test
    public void test1570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1570");
        User user0 = new User();
        java.lang.String str1 = user0.getPassword();
        user0.setCountry("hi!");
        java.lang.String str4 = user0.getFirstName();
        user0.setLastName("hi!");
        user0.setDob("hi!");
        java.lang.String str9 = user0.getFirstName();
        user0.setPassword("");
        java.lang.String str12 = user0.getCountry();
        java.lang.String str13 = user0.getCountry();
        java.lang.String str14 = user0.getLastName();
        user0.setLastName("");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
    }

    @Test
    public void test1571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1571");
        User user0 = new User();
        java.lang.String str1 = user0.getPassword();
        java.lang.String str2 = user0.getUsername();
        java.lang.String str3 = user0.getEmail();
        user0.setFirstName("");
        user0.setLastName("hi!");
        user0.setUsername("hi!");
        java.lang.String str10 = user0.getDob();
        java.lang.String str11 = user0.getFirstName();
        user0.setEmail("");
        java.lang.String str14 = user0.getFirstName();
        java.lang.String str15 = user0.getDob();
        user0.setCountry("hi!");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNull(str15);
    }

    @Test
    public void test1572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1572");
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
        user0.setCountry("");
        user0.setLastName("hi!");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertNull(str13);
    }

    @Test
    public void test1573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1573");
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
        java.lang.String str16 = user0.getPassword();
        java.lang.String str17 = user0.getUsername();
        java.lang.String str18 = user0.getCountry();
        user0.setLastName("hi!");
        java.lang.String str21 = user0.getDob();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!" + "'", str21, "hi!");
    }

    @Test
    public void test1574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1574");
        User user0 = new User();
        user0.setPassword("hi!");
        user0.setPassword("");
        java.lang.String str5 = user0.getPassword();
        user0.setCountry("hi!");
        java.lang.String str8 = user0.getPassword();
        user0.setCountry("hi!");
        user0.setEmail("hi!");
        java.lang.Class<?> wildcardClass13 = user0.getClass();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test1575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1575");
        User user0 = new User();
        user0.setPassword("hi!");
        user0.setPassword("");
        java.lang.String str5 = user0.getPassword();
        user0.setCountry("hi!");
        java.lang.String str8 = user0.getPassword();
        java.lang.String str9 = user0.getDob();
        user0.setEmail("hi!");
        java.lang.String str12 = user0.getLastName();
        user0.setPassword("");
        java.lang.String str15 = user0.getEmail();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
    }

    @Test
    public void test1576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1576");
        User user0 = new User();
        java.lang.String str1 = user0.getPassword();
        user0.setCountry("hi!");
        java.lang.String str4 = user0.getPassword();
        java.lang.String str5 = user0.getPassword();
        java.lang.String str6 = user0.getEmail();
        java.lang.String str7 = user0.getUsername();
        user0.setDob("hi!");
        user0.setLastName("hi!");
        java.lang.String str12 = user0.getDob();
        java.lang.String str13 = user0.getEmail();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertNull(str13);
    }

    @Test
    public void test1577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1577");
        User user0 = new User();
        java.lang.String str1 = user0.getPassword();
        java.lang.String str2 = user0.getUsername();
        java.lang.String str3 = user0.getEmail();
        user0.setFirstName("");
        user0.setUsername("");
        java.lang.String str8 = user0.getFirstName();
        user0.setPassword("hi!");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test1578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1578");
        User user0 = new User();
        java.lang.String str1 = user0.getPassword();
        user0.setCountry("hi!");
        java.lang.String str4 = user0.getFirstName();
        user0.setLastName("hi!");
        user0.setDob("hi!");
        java.lang.String str9 = user0.getFirstName();
        java.lang.String str10 = user0.getDob();
        java.lang.String str11 = user0.getLastName();
        java.lang.String str12 = user0.getEmail();
        java.lang.String str13 = user0.getUsername();
        user0.setEmail("hi!");
        java.lang.String str16 = user0.getPassword();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(str16);
    }

    @Test
    public void test1579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1579");
        User user0 = new User();
        java.lang.String str1 = user0.getPassword();
        java.lang.String str2 = user0.getPassword();
        java.lang.String str3 = user0.getFirstName();
        user0.setDob("hi!");
        java.lang.String str6 = user0.getEmail();
        user0.setEmail("");
        user0.setUsername("");
        java.lang.String str11 = user0.getLastName();
        java.lang.String str12 = user0.getDob();
        user0.setEmail("");
        java.lang.String str15 = user0.getUsername();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
    }

    @Test
    public void test1580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1580");
        User user0 = new User();
        java.lang.String str1 = user0.getPassword();
        java.lang.String str2 = user0.getUsername();
        java.lang.String str3 = user0.getEmail();
        user0.setFirstName("");
        user0.setLastName("hi!");
        user0.setUsername("hi!");
        java.lang.String str10 = user0.getDob();
        java.lang.String str11 = user0.getPassword();
        user0.setLastName("");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test1581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1581");
        User user0 = new User();
        user0.setPassword("hi!");
        java.lang.String str3 = user0.getPassword();
        java.lang.String str4 = user0.getFirstName();
        java.lang.String str5 = user0.getLastName();
        user0.setCountry("");
        user0.setUsername("");
        user0.setUsername("");
        user0.setCountry("");
        user0.setUsername("");
        user0.setPassword("");
        user0.setEmail("hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
    }

    @Test
    public void test1582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1582");
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
        user0.setPassword("hi!");
        java.lang.String str16 = user0.getFirstName();
        java.lang.String str17 = user0.getEmail();
        java.lang.String str18 = user0.getUsername();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertNull(str18);
    }

    @Test
    public void test1583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1583");
        User user0 = new User();
        java.lang.String str1 = user0.getPassword();
        java.lang.String str2 = user0.getPassword();
        java.lang.String str3 = user0.getFirstName();
        user0.setDob("hi!");
        java.lang.String str6 = user0.getEmail();
        java.lang.String str7 = user0.getFirstName();
        java.lang.String str8 = user0.getFirstName();
        user0.setCountry("hi!");
        java.lang.String str11 = user0.getLastName();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test1584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1584");
        User user0 = new User();
        java.lang.String str1 = user0.getFirstName();
        user0.setPassword("");
        user0.setEmail("hi!");
        java.lang.String str6 = user0.getLastName();
        java.lang.String str7 = user0.getLastName();
        user0.setFirstName("");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test1585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1585");
        User user0 = new User();
        java.lang.String str1 = user0.getPassword();
        java.lang.String str2 = user0.getUsername();
        java.lang.String str3 = user0.getEmail();
        user0.setUsername("");
        java.lang.String str6 = user0.getFirstName();
        java.lang.String str7 = user0.getUsername();
        java.lang.String str8 = user0.getFirstName();
        java.lang.String str9 = user0.getEmail();
        user0.setCountry("hi!");
        user0.setUsername("");
        user0.setDob("hi!");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test1586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1586");
        User user0 = new User();
        java.lang.String str1 = user0.getPassword();
        user0.setUsername("");
        user0.setFirstName("hi!");
        user0.setDob("");
        user0.setEmail("");
        java.lang.String str10 = user0.getEmail();
        java.lang.Class<?> wildcardClass11 = user0.getClass();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test1587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1587");
        User user0 = new User();
        java.lang.String str1 = user0.getPassword();
        user0.setUsername("hi!");
        user0.setCountry("hi!");
        user0.setLastName("");
        user0.setDob("hi!");
        java.lang.String str10 = user0.getCountry();
        user0.setDob("hi!");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
    }

    @Test
    public void test1588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1588");
        User user0 = new User();
        user0.setPassword("hi!");
        user0.setPassword("");
        java.lang.String str5 = user0.getPassword();
        java.lang.String str6 = user0.getDob();
        java.lang.String str7 = user0.getDob();
        user0.setPassword("hi!");
        java.lang.String str10 = user0.getEmail();
        java.lang.String str11 = user0.getFirstName();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test1589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1589");
        User user0 = new User();
        java.lang.String str1 = user0.getPassword();
        java.lang.String str2 = user0.getPassword();
        user0.setLastName("hi!");
        java.lang.String str5 = user0.getUsername();
        java.lang.String str6 = user0.getCountry();
        java.lang.Class<?> wildcardClass7 = user0.getClass();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test1590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1590");
        User user0 = new User();
        java.lang.String str1 = user0.getFirstName();
        user0.setPassword("");
        java.lang.String str4 = user0.getUsername();
        user0.setLastName("");
        user0.setCountry("hi!");
        java.lang.Class<?> wildcardClass9 = user0.getClass();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test1591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1591");
        User user0 = new User();
        user0.setPassword("hi!");
        user0.setPassword("");
        java.lang.String str5 = user0.getFirstName();
        user0.setEmail("hi!");
        user0.setPassword("hi!");
        user0.setEmail("");
        user0.setEmail("");
        org.junit.Assert.assertNull(str5);
    }

    @Test
    public void test1592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1592");
        User user0 = new User();
        user0.setPassword("hi!");
        user0.setLastName("");
        user0.setCountry("hi!");
        java.lang.String str7 = user0.getDob();
        java.lang.String str8 = user0.getFirstName();
        user0.setUsername("");
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test1593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1593");
        User user0 = new User();
        java.lang.String str1 = user0.getPassword();
        user0.setCountry("hi!");
        user0.setUsername("hi!");
        java.lang.String str6 = user0.getUsername();
        user0.setLastName("");
        java.lang.String str9 = user0.getDob();
        java.lang.String str10 = user0.getUsername();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
    }

    @Test
    public void test1594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1594");
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
        java.lang.String str22 = user0.getEmail();
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
    public void test1595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1595");
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
        user0.setEmail("");
        user0.setDob("");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(str14);
    }

    @Test
    public void test1596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1596");
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
        user0.setLastName("hi!");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test1597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1597");
        User user0 = new User();
        java.lang.String str1 = user0.getPassword();
        java.lang.String str2 = user0.getUsername();
        java.lang.String str3 = user0.getEmail();
        user0.setFirstName("");
        user0.setLastName("hi!");
        java.lang.String str8 = user0.getFirstName();
        java.lang.String str9 = user0.getPassword();
        java.lang.String str10 = user0.getPassword();
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
    public void test1598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1598");
        User user0 = new User();
        java.lang.String str1 = user0.getPassword();
        java.lang.String str2 = user0.getUsername();
        java.lang.String str3 = user0.getCountry();
        java.lang.String str4 = user0.getPassword();
        java.lang.String str5 = user0.getUsername();
        user0.setEmail("");
        user0.setDob("");
        java.lang.String str10 = user0.getFirstName();
        user0.setPassword("hi!");
        user0.setFirstName("");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test1599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1599");
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
        java.lang.String str20 = user0.getDob();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
    }

    @Test
    public void test1600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1600");
        User user0 = new User();
        java.lang.String str1 = user0.getPassword();
        java.lang.String str2 = user0.getUsername();
        java.lang.String str3 = user0.getEmail();
        user0.setFirstName("");
        user0.setLastName("hi!");
        java.lang.String str8 = user0.getFirstName();
        user0.setFirstName("hi!");
        user0.setCountry("");
        user0.setUsername("hi!");
        user0.setLastName("hi!");
        java.lang.String str17 = user0.getCountry();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
    }

    @Test
    public void test1601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1601");
        User user0 = new User();
        java.lang.String str1 = user0.getPassword();
        user0.setCountry("hi!");
        java.lang.String str4 = user0.getFirstName();
        user0.setLastName("hi!");
        user0.setDob("hi!");
        java.lang.String str9 = user0.getEmail();
        user0.setDob("hi!");
        java.lang.String str12 = user0.getDob();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
    }

    @Test
    public void test1602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1602");
        User user0 = new User();
        java.lang.String str1 = user0.getPassword();
        java.lang.String str2 = user0.getPassword();
        user0.setUsername("");
        java.lang.String str5 = user0.getCountry();
        java.lang.String str6 = user0.getCountry();
        java.lang.String str7 = user0.getFirstName();
        user0.setDob("hi!");
        user0.setDob("hi!");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test1603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1603");
        User user0 = new User();
        java.lang.String str1 = user0.getPassword();
        java.lang.String str2 = user0.getUsername();
        java.lang.String str3 = user0.getEmail();
        java.lang.String str4 = user0.getLastName();
        user0.setDob("");
        user0.setFirstName("hi!");
        java.lang.String str9 = user0.getFirstName();
        user0.setDob("");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
    }

    @Test
    public void test1604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1604");
        User user0 = new User();
        user0.setPassword("hi!");
        user0.setPassword("");
        java.lang.String str5 = user0.getPassword();
        java.lang.String str6 = user0.getEmail();
        user0.setCountry("hi!");
        user0.setEmail("hi!");
        user0.setDob("");
        java.lang.String str13 = user0.getLastName();
        java.lang.Class<?> wildcardClass14 = user0.getClass();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test1605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1605");
        User user0 = new User();
        user0.setPassword("hi!");
        java.lang.String str3 = user0.getPassword();
        java.lang.String str4 = user0.getFirstName();
        java.lang.String str5 = user0.getLastName();
        user0.setCountry("");
        user0.setUsername("");
        user0.setFirstName("hi!");
        user0.setEmail("hi!");
        java.lang.String str14 = user0.getLastName();
        user0.setCountry("hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str14);
    }

    @Test
    public void test1606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1606");
        User user0 = new User();
        java.lang.String str1 = user0.getPassword();
        java.lang.String str2 = user0.getUsername();
        java.lang.String str3 = user0.getCountry();
        user0.setPassword("");
        user0.setLastName("");
        user0.setUsername("");
        user0.setUsername("hi!");
        java.lang.String str12 = user0.getEmail();
        java.lang.String str13 = user0.getFirstName();
        java.lang.String str14 = user0.getCountry();
        java.lang.String str15 = user0.getDob();
        user0.setDob("hi!");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(str15);
    }

    @Test
    public void test1607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1607");
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
        java.lang.String str19 = user0.getLastName();
        java.lang.String str20 = user0.getUsername();
        user0.setCountry("hi!");
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
    }

    @Test
    public void test1608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1608");
        User user0 = new User();
        user0.setPassword("hi!");
        user0.setPassword("");
        user0.setUsername("");
        user0.setFirstName("");
        user0.setEmail("");
        java.lang.String str11 = user0.getDob();
        user0.setUsername("hi!");
        java.lang.String str14 = user0.getFirstName();
        java.lang.String str15 = user0.getUsername();
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
    }

    @Test
    public void test1609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1609");
        User user0 = new User();
        user0.setPassword("hi!");
        java.lang.String str3 = user0.getPassword();
        java.lang.String str4 = user0.getFirstName();
        java.lang.String str5 = user0.getLastName();
        user0.setCountry("");
        user0.setUsername("");
        user0.setUsername("");
        java.lang.String str12 = user0.getPassword();
        java.lang.String str13 = user0.getUsername();
        user0.setCountry("hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test1610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1610");
        User user0 = new User();
        java.lang.String str1 = user0.getPassword();
        java.lang.String str2 = user0.getUsername();
        java.lang.String str3 = user0.getEmail();
        user0.setFirstName("");
        java.lang.String str6 = user0.getCountry();
        java.lang.String str7 = user0.getLastName();
        java.lang.String str8 = user0.getFirstName();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test1611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1611");
        User user0 = new User();
        java.lang.String str1 = user0.getPassword();
        java.lang.String str2 = user0.getUsername();
        java.lang.String str3 = user0.getEmail();
        user0.setFirstName("");
        user0.setLastName("hi!");
        user0.setCountry("");
        user0.setUsername("hi!");
        java.lang.String str12 = user0.getDob();
        java.lang.String str13 = user0.getUsername();
        java.lang.String str14 = user0.getEmail();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertNull(str14);
    }

    @Test
    public void test1612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1612");
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
        user0.setUsername("");
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
    public void test1613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1613");
        User user0 = new User();
        java.lang.String str1 = user0.getPassword();
        user0.setCountry("hi!");
        java.lang.String str4 = user0.getFirstName();
        user0.setLastName("hi!");
        user0.setDob("hi!");
        user0.setLastName("hi!");
        java.lang.String str11 = user0.getFirstName();
        user0.setLastName("");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test1614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1614");
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
        user0.setUsername("hi!");
        java.lang.String str19 = user0.getLastName();
        user0.setEmail("");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
    }

    @Test
    public void test1615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1615");
        User user0 = new User();
        java.lang.String str1 = user0.getPassword();
        java.lang.String str2 = user0.getUsername();
        java.lang.String str3 = user0.getDob();
        user0.setLastName("hi!");
        java.lang.String str6 = user0.getPassword();
        java.lang.String str7 = user0.getCountry();
        user0.setEmail("hi!");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test1616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1616");
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
        java.lang.String str13 = user0.getDob();
        java.lang.String str14 = user0.getLastName();
        user0.setPassword("");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertNull(str14);
    }

    @Test
    public void test1617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1617");
        User user0 = new User();
        user0.setPassword("hi!");
        user0.setPassword("");
        java.lang.String str5 = user0.getPassword();
        java.lang.String str6 = user0.getPassword();
        user0.setUsername("hi!");
        java.lang.String str9 = user0.getCountry();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test1618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1618");
        User user0 = new User();
        user0.setPassword("hi!");
        user0.setPassword("");
        java.lang.String str5 = user0.getPassword();
        user0.setCountry("hi!");
        java.lang.String str8 = user0.getPassword();
        java.lang.String str9 = user0.getDob();
        java.lang.String str10 = user0.getUsername();
        user0.setEmail("");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test1619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1619");
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
        user0.setLastName("");
        user0.setFirstName("");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertNull(str13);
    }

    @Test
    public void test1620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1620");
        User user0 = new User();
        java.lang.String str1 = user0.getPassword();
        user0.setCountry("hi!");
        user0.setUsername("hi!");
        user0.setCountry("");
        java.lang.String str8 = user0.getFirstName();
        user0.setDob("hi!");
        java.lang.String str11 = user0.getFirstName();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test1621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1621");
        User user0 = new User();
        java.lang.String str1 = user0.getPassword();
        java.lang.String str2 = user0.getUsername();
        java.lang.String str3 = user0.getEmail();
        user0.setFirstName("");
        user0.setLastName("hi!");
        user0.setUsername("hi!");
        java.lang.String str10 = user0.getPassword();
        java.lang.String str11 = user0.getEmail();
        user0.setLastName("hi!");
        user0.setFirstName("hi!");
        java.lang.String str16 = user0.getCountry();
        java.lang.String str17 = user0.getFirstName();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
    }

    @Test
    public void test1622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1622");
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
        java.lang.String str14 = user0.getFirstName();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test1623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1623");
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
        user0.setPassword("");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
    }

    @Test
    public void test1624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1624");
        User user0 = new User();
        java.lang.String str1 = user0.getPassword();
        java.lang.String str2 = user0.getPassword();
        java.lang.String str3 = user0.getFirstName();
        user0.setDob("hi!");
        java.lang.String str6 = user0.getEmail();
        user0.setPassword("hi!");
        java.lang.String str9 = user0.getPassword();
        java.lang.String str10 = user0.getEmail();
        user0.setCountry("");
        java.lang.String str13 = user0.getDob();
        java.lang.String str14 = user0.getFirstName();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertNull(str14);
    }

    @Test
    public void test1625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1625");
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
        user0.setDob("");
        user0.setDob("");
        user0.setCountry("");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertNull(str14);
    }

    @Test
    public void test1626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1626");
        User user0 = new User();
        java.lang.String str1 = user0.getPassword();
        user0.setUsername("hi!");
        user0.setFirstName("");
        java.lang.String str6 = user0.getPassword();
        user0.setEmail("hi!");
        user0.setPassword("");
        java.lang.String str11 = user0.getPassword();
        user0.setPassword("");
        user0.setPassword("hi!");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test1627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1627");
        User user0 = new User();
        java.lang.String str1 = user0.getPassword();
        java.lang.String str2 = user0.getPassword();
        user0.setLastName("hi!");
        java.lang.String str5 = user0.getCountry();
        user0.setLastName("hi!");
        user0.setEmail("");
        java.lang.String str10 = user0.getLastName();
        user0.setUsername("");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
    }

    @Test
    public void test1628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1628");
        User user0 = new User();
        java.lang.String str1 = user0.getPassword();
        user0.setCountry("hi!");
        java.lang.String str4 = user0.getPassword();
        java.lang.String str5 = user0.getDob();
        user0.setCountry("hi!");
        java.lang.String str8 = user0.getCountry();
        java.lang.String str9 = user0.getCountry();
        java.lang.String str10 = user0.getPassword();
        java.lang.String str11 = user0.getCountry();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
    }

    @Test
    public void test1629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1629");
        User user0 = new User();
        user0.setPassword("hi!");
        user0.setPassword("");
        java.lang.String str5 = user0.getPassword();
        user0.setFirstName("");
        java.lang.String str8 = user0.getUsername();
        java.lang.String str9 = user0.getLastName();
        user0.setFirstName("");
        user0.setUsername("hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test1630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1630");
        User user0 = new User();
        user0.setPassword("hi!");
        java.lang.String str3 = user0.getPassword();
        java.lang.String str4 = user0.getFirstName();
        java.lang.String str5 = user0.getLastName();
        user0.setCountry("");
        user0.setCountry("");
        user0.setPassword("hi!");
        user0.setCountry("");
        java.lang.String str14 = user0.getDob();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str14);
    }

    @Test
    public void test1631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1631");
        User user0 = new User();
        java.lang.String str1 = user0.getPassword();
        java.lang.String str2 = user0.getUsername();
        java.lang.String str3 = user0.getEmail();
        user0.setFirstName("");
        java.lang.String str6 = user0.getCountry();
        java.lang.String str7 = user0.getLastName();
        user0.setPassword("");
        java.lang.String str10 = user0.getUsername();
        java.lang.Class<?> wildcardClass11 = user0.getClass();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test1632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1632");
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
        user0.setEmail("");
        user0.setFirstName("");
        user0.setCountry("");
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
    public void test1633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1633");
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
        java.lang.String str14 = user0.getEmail();
        java.lang.String str15 = user0.getFirstName();
        java.lang.String str16 = user0.getFirstName();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
    }

    @Test
    public void test1634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1634");
        User user0 = new User();
        java.lang.String str1 = user0.getPassword();
        user0.setUsername("hi!");
        user0.setCountry("hi!");
        java.lang.String str6 = user0.getLastName();
        java.lang.String str7 = user0.getEmail();
        java.lang.String str8 = user0.getFirstName();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test1635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1635");
        User user0 = new User();
        user0.setPassword("hi!");
        user0.setPassword("");
        java.lang.String str5 = user0.getFirstName();
        user0.setLastName("hi!");
        user0.setFirstName("");
        user0.setUsername("hi!");
        user0.setLastName("");
        org.junit.Assert.assertNull(str5);
    }

    @Test
    public void test1636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1636");
        User user0 = new User();
        java.lang.String str1 = user0.getPassword();
        java.lang.String str2 = user0.getUsername();
        java.lang.String str3 = user0.getEmail();
        user0.setFirstName("");
        user0.setLastName("hi!");
        java.lang.String str8 = user0.getFirstName();
        user0.setDob("");
        user0.setDob("hi!");
        user0.setEmail("");
        java.lang.String str15 = user0.getDob();
        user0.setFirstName("");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
    }

    @Test
    public void test1637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1637");
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
        java.lang.String str14 = user0.getDob();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNull(str14);
    }

    @Test
    public void test1638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1638");
        User user0 = new User();
        java.lang.String str1 = user0.getPassword();
        user0.setCountry("hi!");
        java.lang.String str4 = user0.getFirstName();
        java.lang.String str5 = user0.getFirstName();
        user0.setDob("");
        user0.setFirstName("hi!");
        user0.setDob("");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
    }

    @Test
    public void test1639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1639");
        User user0 = new User();
        user0.setPassword("hi!");
        user0.setPassword("");
        java.lang.String str5 = user0.getDob();
        user0.setEmail("");
        java.lang.String str8 = user0.getUsername();
        user0.setCountry("");
        user0.setPassword("hi!");
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test1640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1640");
        User user0 = new User();
        java.lang.String str1 = user0.getPassword();
        user0.setCountry("hi!");
        java.lang.String str4 = user0.getFirstName();
        java.lang.String str5 = user0.getDob();
        java.lang.String str6 = user0.getLastName();
        user0.setFirstName("hi!");
        user0.setDob("");
        java.lang.String str11 = user0.getUsername();
        user0.setCountry("hi!");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test1641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1641");
        User user0 = new User();
        java.lang.String str1 = user0.getPassword();
        user0.setUsername("hi!");
        user0.setFirstName("");
        java.lang.String str6 = user0.getPassword();
        user0.setLastName("");
        java.lang.String str9 = user0.getDob();
        java.lang.String str10 = user0.getEmail();
        java.lang.String str11 = user0.getUsername();
        java.lang.String str12 = user0.getPassword();
        user0.setEmail("");
        user0.setEmail("");
        user0.setUsername("hi!");
        java.lang.String str19 = user0.getFirstName();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
    }

    @Test
    public void test1642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1642");
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
        user0.setUsername("hi!");
        java.lang.Class<?> wildcardClass21 = user0.getClass();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test1643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1643");
        User user0 = new User();
        java.lang.String str1 = user0.getPassword();
        user0.setUsername("hi!");
        user0.setFirstName("");
        java.lang.String str6 = user0.getPassword();
        java.lang.String str7 = user0.getCountry();
        java.lang.String str8 = user0.getCountry();
        user0.setLastName("");
        user0.setEmail("");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test1644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1644");
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
        java.lang.String str19 = user0.getUsername();
        user0.setEmail("");
        java.lang.String str22 = user0.getPassword();
        java.lang.Class<?> wildcardClass23 = user0.getClass();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertNull(str22);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test1645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1645");
        User user0 = new User();
        java.lang.String str1 = user0.getPassword();
        user0.setUsername("");
        java.lang.String str4 = user0.getCountry();
        java.lang.String str5 = user0.getEmail();
        user0.setCountry("hi!");
        user0.setDob("");
        user0.setCountry("hi!");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
    }

    @Test
    public void test1646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1646");
        User user0 = new User();
        user0.setPassword("hi!");
        user0.setPassword("");
        user0.setPassword("");
        user0.setLastName("");
        java.lang.String str9 = user0.getCountry();
        java.lang.String str10 = user0.getLastName();
        java.lang.String str11 = user0.getDob();
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test1647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1647");
        User user0 = new User();
        java.lang.String str1 = user0.getPassword();
        java.lang.String str2 = user0.getUsername();
        java.lang.String str3 = user0.getDob();
        user0.setUsername("");
        java.lang.String str6 = user0.getFirstName();
        user0.setPassword("");
        user0.setEmail("");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test1648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1648");
        User user0 = new User();
        java.lang.String str1 = user0.getPassword();
        java.lang.String str2 = user0.getPassword();
        user0.setUsername("");
        java.lang.String str5 = user0.getCountry();
        java.lang.String str6 = user0.getCountry();
        java.lang.String str7 = user0.getLastName();
        java.lang.String str8 = user0.getDob();
        user0.setCountry("hi!");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test1649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1649");
        User user0 = new User();
        java.lang.String str1 = user0.getPassword();
        user0.setCountry("hi!");
        java.lang.String str4 = user0.getFirstName();
        user0.setLastName("hi!");
        java.lang.String str7 = user0.getFirstName();
        user0.setCountry("hi!");
        java.lang.String str10 = user0.getLastName();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
    }

    @Test
    public void test1650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1650");
        User user0 = new User();
        java.lang.String str1 = user0.getPassword();
        user0.setCountry("hi!");
        java.lang.String str4 = user0.getFirstName();
        user0.setLastName("hi!");
        user0.setDob("hi!");
        java.lang.String str9 = user0.getFirstName();
        user0.setPassword("");
        java.lang.String str12 = user0.getCountry();
        java.lang.String str13 = user0.getCountry();
        user0.setCountry("hi!");
        java.lang.String str16 = user0.getCountry();
        user0.setFirstName("");
        java.lang.String str19 = user0.getEmail();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertNull(str19);
    }

    @Test
    public void test1651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1651");
        User user0 = new User();
        java.lang.String str1 = user0.getFirstName();
        java.lang.String str2 = user0.getPassword();
        java.lang.String str3 = user0.getDob();
        user0.setCountry("");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test1652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1652");
        User user0 = new User();
        java.lang.String str1 = user0.getPassword();
        java.lang.String str2 = user0.getPassword();
        java.lang.String str3 = user0.getPassword();
        java.lang.String str4 = user0.getDob();
        user0.setFirstName("hi!");
        user0.setDob("");
        java.lang.String str9 = user0.getUsername();
        user0.setEmail("hi!");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test1653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1653");
        User user0 = new User();
        java.lang.String str1 = user0.getPassword();
        java.lang.String str2 = user0.getUsername();
        java.lang.String str3 = user0.getEmail();
        user0.setFirstName("");
        user0.setLastName("hi!");
        java.lang.String str8 = user0.getFirstName();
        user0.setDob("");
        java.lang.String str11 = user0.getEmail();
        user0.setUsername("");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test1654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1654");
        User user0 = new User();
        java.lang.String str1 = user0.getPassword();
        java.lang.String str2 = user0.getPassword();
        java.lang.String str3 = user0.getFirstName();
        user0.setDob("hi!");
        java.lang.String str6 = user0.getEmail();
        java.lang.String str7 = user0.getDob();
        user0.setLastName("hi!");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
    }

    @Test
    public void test1655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1655");
        User user0 = new User();
        java.lang.String str1 = user0.getPassword();
        java.lang.String str2 = user0.getPassword();
        java.lang.String str3 = user0.getFirstName();
        user0.setDob("hi!");
        java.lang.String str6 = user0.getEmail();
        java.lang.String str7 = user0.getFirstName();
        user0.setLastName("hi!");
        java.lang.String str10 = user0.getFirstName();
        java.lang.String str11 = user0.getFirstName();
        user0.setLastName("");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test1656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1656");
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
        user0.setLastName("");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
    }

    @Test
    public void test1657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1657");
        User user0 = new User();
        user0.setPassword("hi!");
        user0.setPassword("");
        java.lang.String str5 = user0.getPassword();
        java.lang.String str6 = user0.getEmail();
        user0.setCountry("hi!");
        java.lang.String str9 = user0.getDob();
        user0.setEmail("hi!");
        java.lang.String str12 = user0.getDob();
        java.lang.String str13 = user0.getDob();
        user0.setLastName("hi!");
        java.lang.String str16 = user0.getPassword();
        user0.setCountry("hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
    }

    @Test
    public void test1658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1658");
        User user0 = new User();
        java.lang.String str1 = user0.getPassword();
        user0.setUsername("hi!");
        user0.setFirstName("");
        java.lang.String str6 = user0.getPassword();
        user0.setUsername("hi!");
        user0.setEmail("");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test1659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1659");
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
        java.lang.String str14 = user0.getEmail();
        java.lang.String str15 = user0.getPassword();
        java.lang.String str16 = user0.getUsername();
        user0.setFirstName("hi!");
        java.lang.String str19 = user0.getUsername();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
    }

    @Test
    public void test1660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1660");
        User user0 = new User();
        java.lang.String str1 = user0.getPassword();
        user0.setUsername("hi!");
        java.lang.String str4 = user0.getUsername();
        java.lang.String str5 = user0.getEmail();
        java.lang.String str6 = user0.getDob();
        java.lang.String str7 = user0.getEmail();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test1661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1661");
        User user0 = new User();
        java.lang.String str1 = user0.getPassword();
        user0.setUsername("");
        user0.setLastName("");
        user0.setEmail("hi!");
        user0.setFirstName("hi!");
        user0.setEmail("");
        org.junit.Assert.assertNull(str1);
    }

    @Test
    public void test1662() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1662");
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
        java.lang.String str17 = user0.getLastName();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str17);
    }

    @Test
    public void test1663() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1663");
        User user0 = new User();
        java.lang.String str1 = user0.getPassword();
        java.lang.String str2 = user0.getUsername();
        user0.setDob("");
        java.lang.String str5 = user0.getEmail();
        java.lang.String str6 = user0.getCountry();
        user0.setPassword("hi!");
        user0.setPassword("");
        java.lang.String str11 = user0.getCountry();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test1664() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1664");
        User user0 = new User();
        java.lang.String str1 = user0.getPassword();
        java.lang.String str2 = user0.getUsername();
        java.lang.String str3 = user0.getEmail();
        user0.setFirstName("");
        user0.setLastName("hi!");
        user0.setUsername("hi!");
        user0.setDob("");
        java.lang.String str12 = user0.getCountry();
        user0.setLastName("hi!");
        java.lang.Class<?> wildcardClass15 = user0.getClass();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test1665() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1665");
        User user0 = new User();
        user0.setLastName("");
        java.lang.String str3 = user0.getUsername();
        user0.setEmail("");
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test1666() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1666");
        User user0 = new User();
        java.lang.String str1 = user0.getPassword();
        java.lang.String str2 = user0.getPassword();
        java.lang.String str3 = user0.getFirstName();
        user0.setDob("hi!");
        java.lang.String str6 = user0.getEmail();
        user0.setPassword("hi!");
        user0.setDob("");
        java.lang.String str11 = user0.getLastName();
        java.lang.String str12 = user0.getEmail();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test1667() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1667");
        User user0 = new User();
        user0.setUsername("");
        java.lang.String str3 = user0.getDob();
        java.lang.String str4 = user0.getUsername();
        java.lang.String str5 = user0.getPassword();
        java.lang.String str6 = user0.getFirstName();
        java.lang.String str7 = user0.getLastName();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test1668() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1668");
        User user0 = new User();
        java.lang.String str1 = user0.getPassword();
        user0.setUsername("hi!");
        user0.setCountry("hi!");
        java.lang.String str6 = user0.getLastName();
        user0.setUsername("");
        java.lang.String str9 = user0.getLastName();
        java.lang.String str10 = user0.getEmail();
        user0.setLastName("hi!");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test1669() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1669");
        User user0 = new User();
        java.lang.String str1 = user0.getPassword();
        user0.setCountry("hi!");
        java.lang.String str4 = user0.getFirstName();
        java.lang.String str5 = user0.getDob();
        java.lang.String str6 = user0.getLastName();
        java.lang.String str7 = user0.getCountry();
        java.lang.String str8 = user0.getPassword();
        user0.setFirstName("hi!");
        java.lang.String str11 = user0.getEmail();
        java.lang.String str12 = user0.getCountry();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
    }

    @Test
    public void test1670() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1670");
        User user0 = new User();
        user0.setLastName("");
        user0.setDob("hi!");
        user0.setCountry("");
        user0.setFirstName("hi!");
    }

    @Test
    public void test1671() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1671");
        User user0 = new User();
        java.lang.String str1 = user0.getPassword();
        user0.setUsername("");
        user0.setFirstName("hi!");
        user0.setDob("");
        user0.setLastName("");
        user0.setUsername("");
        java.lang.String str12 = user0.getDob();
        java.lang.String str13 = user0.getFirstName();
        java.lang.String str14 = user0.getCountry();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertNull(str14);
    }

    @Test
    public void test1672() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1672");
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
        user0.setDob("");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(str15);
    }

    @Test
    public void test1673() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1673");
        User user0 = new User();
        java.lang.String str1 = user0.getPassword();
        user0.setCountry("hi!");
        java.lang.String str4 = user0.getPassword();
        java.lang.String str5 = user0.getPassword();
        java.lang.String str6 = user0.getFirstName();
        java.lang.String str7 = user0.getCountry();
        user0.setEmail("hi!");
        user0.setPassword("hi!");
        user0.setUsername("hi!");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
    }

    @Test
    public void test1674() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1674");
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
        java.lang.String str15 = user0.getUsername();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str15);
    }

    @Test
    public void test1675() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1675");
        User user0 = new User();
        user0.setUsername("");
        java.lang.String str3 = user0.getUsername();
        java.lang.String str4 = user0.getFirstName();
        user0.setEmail("");
        user0.setDob("");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNull(str4);
    }

    @Test
    public void test1676() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1676");
        User user0 = new User();
        java.lang.String str1 = user0.getPassword();
        user0.setCountry("hi!");
        java.lang.String str4 = user0.getFirstName();
        user0.setLastName("hi!");
        user0.setDob("hi!");
        java.lang.String str9 = user0.getFirstName();
        user0.setCountry("");
        java.lang.String str12 = user0.getFirstName();
        user0.setUsername("");
        user0.setEmail("");
        java.lang.String str17 = user0.getFirstName();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str17);
    }

    @Test
    public void test1677() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1677");
        User user0 = new User();
        user0.setPassword("hi!");
        user0.setPassword("");
        java.lang.String str5 = user0.getPassword();
        java.lang.String str6 = user0.getEmail();
        java.lang.String str7 = user0.getLastName();
        java.lang.String str8 = user0.getEmail();
        user0.setLastName("");
        java.lang.String str11 = user0.getDob();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test1678() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1678");
        User user0 = new User();
        java.lang.String str1 = user0.getPassword();
        java.lang.String str2 = user0.getUsername();
        java.lang.String str3 = user0.getCountry();
        user0.setPassword("");
        user0.setLastName("");
        user0.setUsername("");
        user0.setLastName("hi!");
        user0.setFirstName("");
        java.lang.String str14 = user0.getUsername();
        java.lang.String str15 = user0.getLastName();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
    }

    @Test
    public void test1679() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1679");
        User user0 = new User();
        user0.setPassword("hi!");
        user0.setPassword("");
        java.lang.String str5 = user0.getPassword();
        user0.setCountry("hi!");
        user0.setLastName("hi!");
        java.lang.String str10 = user0.getFirstName();
        java.lang.String str11 = user0.getFirstName();
        java.lang.String str12 = user0.getUsername();
        java.lang.String str13 = user0.getCountry();
        java.lang.String str14 = user0.getUsername();
        java.lang.String str15 = user0.getFirstName();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(str15);
    }

    @Test
    public void test1680() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1680");
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
        user0.setDob("hi!");
        java.lang.String str24 = user0.getFirstName();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertNull(str24);
    }

    @Test
    public void test1681() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1681");
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
        user0.setEmail("");
        java.lang.String str16 = user0.getLastName();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(str16);
    }

    @Test
    public void test1682() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1682");
        User user0 = new User();
        user0.setPassword("hi!");
        user0.setPassword("");
        java.lang.String str5 = user0.getPassword();
        user0.setFirstName("");
        user0.setLastName("");
        user0.setPassword("hi!");
        user0.setUsername("");
        user0.setDob("");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
    }

    @Test
    public void test1683() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1683");
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
        java.lang.String str13 = user0.getLastName();
        java.lang.String str14 = user0.getFirstName();
        java.lang.String str15 = user0.getEmail();
        java.lang.Class<?> wildcardClass16 = user0.getClass();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test1684() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1684");
        User user0 = new User();
        java.lang.String str1 = user0.getPassword();
        java.lang.String str2 = user0.getUsername();
        java.lang.String str3 = user0.getEmail();
        user0.setUsername("");
        java.lang.String str6 = user0.getFirstName();
        java.lang.String str7 = user0.getUsername();
        java.lang.String str8 = user0.getFirstName();
        java.lang.String str9 = user0.getUsername();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test1685() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1685");
        User user0 = new User();
        user0.setPassword("hi!");
        user0.setPassword("");
        java.lang.String str5 = user0.getPassword();
        java.lang.String str6 = user0.getEmail();
        java.lang.String str7 = user0.getEmail();
        java.lang.String str8 = user0.getPassword();
        java.lang.Class<?> wildcardClass9 = user0.getClass();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test1686() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1686");
        User user0 = new User();
        java.lang.String str1 = user0.getPassword();
        user0.setUsername("hi!");
        user0.setFirstName("");
        java.lang.String str6 = user0.getPassword();
        user0.setLastName("");
        java.lang.String str9 = user0.getDob();
        java.lang.String str10 = user0.getLastName();
        java.lang.String str11 = user0.getFirstName();
        java.lang.String str12 = user0.getPassword();
        user0.setDob("hi!");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test1687() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1687");
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
        user0.setDob("hi!");
        java.lang.String str16 = user0.getCountry();
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
    public void test1688() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1688");
        User user0 = new User();
        java.lang.String str1 = user0.getPassword();
        java.lang.String str2 = user0.getUsername();
        java.lang.String str3 = user0.getEmail();
        user0.setFirstName("");
        user0.setLastName("hi!");
        java.lang.String str8 = user0.getFirstName();
        user0.setFirstName("hi!");
        user0.setCountry("");
        java.lang.String str13 = user0.getPassword();
        java.lang.String str14 = user0.getLastName();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
    }

    @Test
    public void test1689() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1689");
        User user0 = new User();
        user0.setUsername("");
        java.lang.String str3 = user0.getUsername();
        user0.setPassword("hi!");
        java.lang.String str6 = user0.getEmail();
        java.lang.String str7 = user0.getPassword();
        java.lang.Class<?> wildcardClass8 = user0.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test1690() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1690");
        User user0 = new User();
        java.lang.String str1 = user0.getPassword();
        java.lang.String str2 = user0.getUsername();
        java.lang.String str3 = user0.getEmail();
        user0.setFirstName("");
        user0.setLastName("hi!");
        user0.setUsername("hi!");
        user0.setDob("");
        java.lang.String str12 = user0.getCountry();
        user0.setUsername("");
        user0.setPassword("");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test1691() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1691");
        User user0 = new User();
        java.lang.String str1 = user0.getPassword();
        java.lang.String str2 = user0.getUsername();
        user0.setDob("");
        java.lang.String str5 = user0.getEmail();
        java.lang.String str6 = user0.getCountry();
        user0.setPassword("hi!");
        user0.setCountry("");
        java.lang.String str11 = user0.getDob();
        user0.setLastName("hi!");
        user0.setDob("hi!");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test1692() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1692");
        User user0 = new User();
        user0.setPassword("hi!");
        user0.setPassword("");
        java.lang.String str5 = user0.getDob();
        user0.setEmail("");
        user0.setUsername("");
        java.lang.String str10 = user0.getFirstName();
        user0.setDob("hi!");
        user0.setPassword("");
        java.lang.String str15 = user0.getCountry();
        java.lang.String str16 = user0.getUsername();
        java.lang.String str17 = user0.getDob();
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
    }

    @Test
    public void test1693() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1693");
        User user0 = new User();
        java.lang.String str1 = user0.getPassword();
        java.lang.String str2 = user0.getPassword();
        java.lang.String str3 = user0.getPassword();
        java.lang.String str4 = user0.getDob();
        user0.setFirstName("hi!");
        user0.setDob("");
        java.lang.String str9 = user0.getUsername();
        user0.setEmail("");
        user0.setCountry("hi!");
        java.lang.String str14 = user0.getPassword();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str14);
    }

    @Test
    public void test1694() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1694");
        User user0 = new User();
        user0.setPassword("hi!");
        java.lang.String str3 = user0.getPassword();
        java.lang.String str4 = user0.getFirstName();
        java.lang.String str5 = user0.getLastName();
        user0.setCountry("");
        java.lang.String str8 = user0.getCountry();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test1695() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1695");
        User user0 = new User();
        java.lang.String str1 = user0.getPassword();
        user0.setCountry("hi!");
        java.lang.String str4 = user0.getFirstName();
        java.lang.String str5 = user0.getFirstName();
        java.lang.String str6 = user0.getLastName();
        java.lang.String str7 = user0.getLastName();
        user0.setUsername("hi!");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test1696() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1696");
        User user0 = new User();
        java.lang.String str1 = user0.getFirstName();
        user0.setPassword("");
        user0.setEmail("hi!");
        user0.setCountry("");
        java.lang.String str8 = user0.getUsername();
        java.lang.String str9 = user0.getEmail();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
    }

    @Test
    public void test1697() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1697");
        User user0 = new User();
        java.lang.String str1 = user0.getPassword();
        java.lang.String str2 = user0.getUsername();
        java.lang.String str3 = user0.getCountry();
        user0.setEmail("hi!");
        java.lang.String str6 = user0.getPassword();
        java.lang.String str7 = user0.getEmail();
        java.lang.String str8 = user0.getPassword();
        user0.setDob("hi!");
        user0.setDob("hi!");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test1698() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1698");
        User user0 = new User();
        java.lang.String str1 = user0.getPassword();
        user0.setCountry("hi!");
        java.lang.String str4 = user0.getFirstName();
        java.lang.String str5 = user0.getDob();
        java.lang.String str6 = user0.getLastName();
        user0.setLastName("");
        user0.setDob("hi!");
        java.lang.String str11 = user0.getCountry();
        java.lang.String str12 = user0.getCountry();
        user0.setPassword("hi!");
        java.lang.String str15 = user0.getUsername();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertNull(str15);
    }

    @Test
    public void test1699() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1699");
        User user0 = new User();
        java.lang.String str1 = user0.getPassword();
        user0.setCountry("hi!");
        java.lang.String str4 = user0.getFirstName();
        java.lang.String str5 = user0.getDob();
        java.lang.String str6 = user0.getLastName();
        java.lang.String str7 = user0.getCountry();
        user0.setEmail("hi!");
        user0.setLastName("hi!");
        java.lang.String str12 = user0.getCountry();
        user0.setLastName("");
        user0.setFirstName("");
        user0.setEmail("hi!");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
    }

    @Test
    public void test1700() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1700");
        User user0 = new User();
        java.lang.String str1 = user0.getFirstName();
        java.lang.String str2 = user0.getCountry();
        user0.setUsername("hi!");
        user0.setEmail("");
        user0.setLastName("");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
    }

    @Test
    public void test1701() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1701");
        User user0 = new User();
        user0.setUsername("");
        java.lang.String str3 = user0.getUsername();
        user0.setCountry("hi!");
        java.lang.String str6 = user0.getPassword();
        user0.setLastName("");
        user0.setEmail("");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test1702() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1702");
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
        user0.setEmail("hi!");
        java.lang.String str15 = user0.getPassword();
        java.lang.String str16 = user0.getPassword();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
    }

    @Test
    public void test1703() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1703");
        User user0 = new User();
        java.lang.String str1 = user0.getPassword();
        user0.setCountry("hi!");
        java.lang.String str4 = user0.getPassword();
        java.lang.String str5 = user0.getDob();
        user0.setCountry("hi!");
        java.lang.String str8 = user0.getCountry();
        java.lang.String str9 = user0.getPassword();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test1704() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1704");
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
        user0.setEmail("");
        java.lang.Class<?> wildcardClass16 = user0.getClass();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test1705() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1705");
        User user0 = new User();
        user0.setPassword("hi!");
        java.lang.String str3 = user0.getPassword();
        java.lang.String str4 = user0.getFirstName();
        java.lang.String str5 = user0.getLastName();
        user0.setCountry("");
        user0.setPassword("");
        java.lang.String str10 = user0.getFirstName();
        user0.setLastName("hi!");
        java.lang.String str13 = user0.getFirstName();
        user0.setDob("");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str13);
    }

    @Test
    public void test1706() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1706");
        User user0 = new User();
        java.lang.String str1 = user0.getPassword();
        user0.setUsername("hi!");
        user0.setCountry("hi!");
        java.lang.String str6 = user0.getLastName();
        user0.setLastName("");
        user0.setPassword("");
        java.lang.String str11 = user0.getEmail();
        java.lang.String str12 = user0.getUsername();
        user0.setPassword("");
        java.lang.String str15 = user0.getCountry();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
    }

    @Test
    public void test1707() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1707");
        User user0 = new User();
        java.lang.String str1 = user0.getPassword();
        user0.setCountry("hi!");
        java.lang.String str4 = user0.getPassword();
        java.lang.String str5 = user0.getDob();
        java.lang.String str6 = user0.getCountry();
        java.lang.String str7 = user0.getEmail();
        java.lang.String str8 = user0.getCountry();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
    }

    @Test
    public void test1708() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1708");
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
        java.lang.String str15 = user0.getUsername();
        java.lang.String str16 = user0.getUsername();
        user0.setUsername("");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNull(str16);
    }

    @Test
    public void test1709() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1709");
        User user0 = new User();
        user0.setPassword("hi!");
        user0.setPassword("");
        java.lang.String str5 = user0.getPassword();
        java.lang.String str6 = user0.getDob();
        java.lang.String str7 = user0.getEmail();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test1710() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1710");
        User user0 = new User();
        java.lang.String str1 = user0.getPassword();
        java.lang.String str2 = user0.getPassword();
        java.lang.String str3 = user0.getFirstName();
        user0.setDob("hi!");
        java.lang.String str6 = user0.getEmail();
        user0.setPassword("hi!");
        java.lang.String str9 = user0.getCountry();
        user0.setDob("");
        java.lang.String str12 = user0.getFirstName();
        user0.setPassword("hi!");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test1711() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1711");
        User user0 = new User();
        java.lang.String str1 = user0.getPassword();
        user0.setCountry("hi!");
        java.lang.String str4 = user0.getFirstName();
        java.lang.String str5 = user0.getFirstName();
        java.lang.String str6 = user0.getLastName();
        java.lang.String str7 = user0.getLastName();
        user0.setCountry("hi!");
        java.lang.String str10 = user0.getFirstName();
        user0.setDob("");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test1712() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1712");
        User user0 = new User();
        user0.setPassword("hi!");
        user0.setPassword("");
        java.lang.String str5 = user0.getDob();
        user0.setEmail("");
        user0.setUsername("");
        user0.setFirstName("hi!");
        java.lang.String str12 = user0.getPassword();
        java.lang.String str13 = user0.getUsername();
        user0.setCountry("hi!");
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test1713() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1713");
        User user0 = new User();
        java.lang.String str1 = user0.getPassword();
        user0.setCountry("hi!");
        java.lang.String str4 = user0.getUsername();
        user0.setPassword("");
        user0.setUsername("");
        user0.setEmail("");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str4);
    }

    @Test
    public void test1714() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1714");
        User user0 = new User();
        user0.setLastName("");
        java.lang.String str3 = user0.getCountry();
        user0.setEmail("hi!");
        java.lang.String str6 = user0.getEmail();
        java.lang.String str7 = user0.getFirstName();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test1715() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1715");
        User user0 = new User();
        user0.setPassword("hi!");
        user0.setPassword("hi!");
    }

    @Test
    public void test1716() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1716");
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
        user0.setCountry("hi!");
        java.lang.String str18 = user0.getFirstName();
        java.lang.String str19 = user0.getEmail();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertNull(str19);
    }

    @Test
    public void test1717() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1717");
        User user0 = new User();
        java.lang.String str1 = user0.getPassword();
        user0.setCountry("hi!");
        java.lang.String str4 = user0.getFirstName();
        user0.setLastName("hi!");
        user0.setDob("hi!");
        java.lang.String str9 = user0.getFirstName();
        java.lang.String str10 = user0.getEmail();
        java.lang.String str11 = user0.getDob();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
    }

    @Test
    public void test1718() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1718");
        User user0 = new User();
        java.lang.String str1 = user0.getPassword();
        user0.setCountry("hi!");
        user0.setUsername("hi!");
        java.lang.String str6 = user0.getUsername();
        user0.setUsername("hi!");
        user0.setUsername("hi!");
        user0.setPassword("hi!");
        user0.setEmail("hi!");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
    }

    @Test
    public void test1719() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1719");
        User user0 = new User();
        java.lang.String str1 = user0.getPassword();
        java.lang.String str2 = user0.getUsername();
        java.lang.String str3 = user0.getEmail();
        user0.setUsername("");
        java.lang.String str6 = user0.getFirstName();
        java.lang.String str7 = user0.getUsername();
        user0.setPassword("");
        java.lang.String str10 = user0.getPassword();
        user0.setUsername("hi!");
        user0.setCountry("hi!");
        java.lang.String str15 = user0.getUsername();
        user0.setLastName("hi!");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
    }

    @Test
    public void test1720() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1720");
        User user0 = new User();
        java.lang.String str1 = user0.getPassword();
        user0.setCountry("hi!");
        java.lang.String str4 = user0.getFirstName();
        user0.setLastName("hi!");
        user0.setDob("hi!");
        java.lang.String str9 = user0.getFirstName();
        user0.setCountry("");
        user0.setLastName("hi!");
        java.lang.String str14 = user0.getCountry();
        java.lang.String str15 = user0.getDob();
        java.lang.String str16 = user0.getCountry();
        user0.setDob("");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
    }

    @Test
    public void test1721() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1721");
        User user0 = new User();
        java.lang.String str1 = user0.getPassword();
        java.lang.String str2 = user0.getUsername();
        java.lang.String str3 = user0.getEmail();
        user0.setUsername("");
        java.lang.String str6 = user0.getPassword();
        java.lang.String str7 = user0.getDob();
        user0.setFirstName("");
        java.lang.String str10 = user0.getCountry();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test1722() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1722");
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
        user0.setUsername("hi!");
        user0.setPassword("");
        user0.setDob("hi!");
        user0.setFirstName("hi!");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str13);
    }

    @Test
    public void test1723() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1723");
        User user0 = new User();
        user0.setUsername("");
        java.lang.String str3 = user0.getDob();
        java.lang.String str4 = user0.getUsername();
        java.lang.String str5 = user0.getPassword();
        user0.setPassword("");
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNull(str5);
    }

    @Test
    public void test1724() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1724");
        User user0 = new User();
        java.lang.String str1 = user0.getPassword();
        java.lang.String str2 = user0.getPassword();
        user0.setLastName("hi!");
        java.lang.String str5 = user0.getCountry();
        user0.setLastName("hi!");
        java.lang.String str8 = user0.getDob();
        user0.setDob("");
        java.lang.String str11 = user0.getUsername();
        user0.setEmail("hi!");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test1725() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1725");
        User user0 = new User();
        user0.setPassword("hi!");
        user0.setPassword("");
        java.lang.String str5 = user0.getPassword();
        java.lang.String str6 = user0.getEmail();
        user0.setCountry("hi!");
        java.lang.String str9 = user0.getDob();
        java.lang.String str10 = user0.getUsername();
        java.lang.String str11 = user0.getUsername();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test1726() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1726");
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
        java.lang.String str15 = user0.getPassword();
        user0.setEmail("hi!");
        user0.setPassword("");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(str15);
    }

    @Test
    public void test1727() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1727");
        User user0 = new User();
        java.lang.String str1 = user0.getPassword();
        java.lang.String str2 = user0.getUsername();
        java.lang.String str3 = user0.getEmail();
        user0.setUsername("");
        java.lang.String str6 = user0.getFirstName();
        java.lang.String str7 = user0.getUsername();
        java.lang.String str8 = user0.getCountry();
        java.lang.String str9 = user0.getFirstName();
        java.lang.String str10 = user0.getEmail();
        user0.setFirstName("");
        java.lang.String str13 = user0.getCountry();
        java.lang.String str14 = user0.getDob();
        user0.setLastName("hi!");
        user0.setLastName("");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(str14);
    }

    @Test
    public void test1728() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1728");
        User user0 = new User();
        java.lang.String str1 = user0.getPassword();
        java.lang.String str2 = user0.getUsername();
        java.lang.String str3 = user0.getEmail();
        user0.setFirstName("");
        user0.setLastName("hi!");
        user0.setCountry("");
        user0.setUsername("hi!");
        user0.setDob("hi!");
        user0.setLastName("");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test1729() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1729");
        User user0 = new User();
        java.lang.String str1 = user0.getFirstName();
        user0.setPassword("");
        user0.setEmail("hi!");
        java.lang.String str6 = user0.getLastName();
        java.lang.String str7 = user0.getUsername();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test1730() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1730");
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
        java.lang.String str15 = user0.getPassword();
        java.lang.String str16 = user0.getPassword();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNull(str16);
    }

    @Test
    public void test1731() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1731");
        User user0 = new User();
        java.lang.String str1 = user0.getPassword();
        user0.setCountry("hi!");
        java.lang.String str4 = user0.getFirstName();
        java.lang.String str5 = user0.getDob();
        java.lang.String str6 = user0.getLastName();
        user0.setFirstName("hi!");
        user0.setDob("hi!");
        user0.setUsername("");
        java.lang.String str13 = user0.getFirstName();
        user0.setLastName("");
        user0.setFirstName("hi!");
        user0.setUsername("");
        java.lang.String str20 = user0.getPassword();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertNull(str20);
    }

    @Test
    public void test1732() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1732");
        User user0 = new User();
        java.lang.String str1 = user0.getPassword();
        java.lang.String str2 = user0.getUsername();
        java.lang.String str3 = user0.getEmail();
        user0.setFirstName("");
        user0.setLastName("hi!");
        user0.setUsername("hi!");
        java.lang.String str10 = user0.getDob();
        java.lang.String str11 = user0.getFirstName();
        user0.setEmail("");
        java.lang.String str14 = user0.getCountry();
        java.lang.String str15 = user0.getEmail();
        user0.setEmail("");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
    }

    @Test
    public void test1733() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1733");
        User user0 = new User();
        user0.setPassword("hi!");
        user0.setPassword("");
        java.lang.String str5 = user0.getPassword();
        java.lang.String str6 = user0.getPassword();
        user0.setPassword("");
        user0.setCountry("");
        user0.setEmail("");
        user0.setUsername("hi!");
        java.lang.String str15 = user0.getFirstName();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNull(str15);
    }

    @Test
    public void test1734() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1734");
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
        user0.setUsername("");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str14);
    }

    @Test
    public void test1735() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1735");
        User user0 = new User();
        java.lang.String str1 = user0.getPassword();
        java.lang.String str2 = user0.getUsername();
        java.lang.String str3 = user0.getCountry();
        user0.setFirstName("hi!");
        user0.setDob("hi!");
        user0.setCountry("");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test1736() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1736");
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
        user0.setCountry("");
        java.lang.String str17 = user0.getCountry();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
    }

    @Test
    public void test1737() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1737");
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
        java.lang.String str18 = user0.getLastName();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
    }

    @Test
    public void test1738() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1738");
        User user0 = new User();
        java.lang.String str1 = user0.getPassword();
        java.lang.String str2 = user0.getUsername();
        java.lang.String str3 = user0.getEmail();
        user0.setUsername("");
        java.lang.String str6 = user0.getFirstName();
        java.lang.String str7 = user0.getUsername();
        java.lang.String str8 = user0.getCountry();
        java.lang.String str9 = user0.getCountry();
        java.lang.String str10 = user0.getFirstName();
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
    public void test1739() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1739");
        User user0 = new User();
        java.lang.String str1 = user0.getPassword();
        java.lang.String str2 = user0.getUsername();
        java.lang.String str3 = user0.getEmail();
        user0.setFirstName("");
        user0.setLastName("hi!");
        user0.setUsername("hi!");
        java.lang.String str10 = user0.getDob();
        java.lang.String str11 = user0.getFirstName();
        user0.setEmail("");
        user0.setFirstName("hi!");
        user0.setLastName("hi!");
        java.lang.String str18 = user0.getFirstName();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
    }

    @Test
    public void test1740() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1740");
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
        user0.setUsername("");
        java.lang.String str17 = user0.getEmail();
        java.lang.String str18 = user0.getFirstName();
        java.lang.String str19 = user0.getCountry();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertNull(str19);
    }

    @Test
    public void test1741() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1741");
        User user0 = new User();
        java.lang.String str1 = user0.getPassword();
        user0.setUsername("hi!");
        user0.setFirstName("");
        java.lang.String str6 = user0.getPassword();
        user0.setEmail("hi!");
        java.lang.String str9 = user0.getCountry();
        user0.setLastName("hi!");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test1742() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1742");
        User user0 = new User();
        java.lang.String str1 = user0.getPassword();
        java.lang.String str2 = user0.getPassword();
        java.lang.String str3 = user0.getPassword();
        java.lang.String str4 = user0.getDob();
        user0.setFirstName("hi!");
        user0.setCountry("hi!");
        user0.setDob("hi!");
        user0.setEmail("hi!");
        user0.setFirstName("hi!");
        user0.setFirstName("");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
    }

    @Test
    public void test1743() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1743");
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
        java.lang.String str17 = user0.getPassword();
        user0.setFirstName("hi!");
        java.lang.String str20 = user0.getEmail();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertNull(str20);
    }

    @Test
    public void test1744() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1744");
        User user0 = new User();
        java.lang.String str1 = user0.getPassword();
        java.lang.String str2 = user0.getUsername();
        java.lang.String str3 = user0.getEmail();
        user0.setUsername("");
        java.lang.String str6 = user0.getFirstName();
        java.lang.String str7 = user0.getUsername();
        java.lang.String str8 = user0.getFirstName();
        java.lang.String str9 = user0.getEmail();
        java.lang.String str10 = user0.getFirstName();
        user0.setUsername("");
        user0.setEmail("hi!");
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
    public void test1745() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1745");
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
        java.lang.String str16 = user0.getCountry();
        java.lang.String str17 = user0.getEmail();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertNull(str17);
    }

    @Test
    public void test1746() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1746");
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
        user0.setFirstName("hi!");
        java.lang.String str19 = user0.getEmail();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertNull(str19);
    }

    @Test
    public void test1747() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1747");
        User user0 = new User();
        java.lang.String str1 = user0.getPassword();
        java.lang.String str2 = user0.getUsername();
        java.lang.String str3 = user0.getCountry();
        user0.setPassword("");
        user0.setLastName("");
        user0.setUsername("");
        user0.setUsername("");
        java.lang.String str12 = user0.getPassword();
        user0.setEmail("");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test1748() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1748");
        User user0 = new User();
        java.lang.String str1 = user0.getPassword();
        java.lang.String str2 = user0.getUsername();
        java.lang.String str3 = user0.getEmail();
        user0.setUsername("");
        java.lang.String str6 = user0.getFirstName();
        java.lang.String str7 = user0.getUsername();
        java.lang.String str8 = user0.getCountry();
        java.lang.String str9 = user0.getFirstName();
        java.lang.String str10 = user0.getEmail();
        user0.setFirstName("");
        java.lang.Class<?> wildcardClass13 = user0.getClass();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test1749() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1749");
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
        java.lang.String str19 = user0.getLastName();
        java.lang.String str20 = user0.getUsername();
        java.lang.String str21 = user0.getEmail();
        user0.setEmail("");
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
    }

    @Test
    public void test1750() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1750");
        User user0 = new User();
        java.lang.String str1 = user0.getPassword();
        user0.setUsername("");
        user0.setFirstName("hi!");
        java.lang.String str6 = user0.getPassword();
        user0.setEmail("");
        java.lang.String str9 = user0.getCountry();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test1751() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1751");
        User user0 = new User();
        java.lang.String str1 = user0.getPassword();
        user0.setUsername("hi!");
        user0.setFirstName("");
        java.lang.String str6 = user0.getPassword();
        user0.setUsername("hi!");
        user0.setPassword("hi!");
        user0.setEmail("");
        java.lang.String str13 = user0.getFirstName();
        java.lang.String str14 = user0.getPassword();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
    }

    @Test
    public void test1752() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1752");
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
        java.lang.String str20 = user0.getDob();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
    }

    @Test
    public void test1753() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1753");
        User user0 = new User();
        java.lang.String str1 = user0.getPassword();
        user0.setCountry("hi!");
        java.lang.String str4 = user0.getPassword();
        java.lang.String str5 = user0.getDob();
        java.lang.String str6 = user0.getCountry();
        java.lang.String str7 = user0.getEmail();
        java.lang.String str8 = user0.getPassword();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test1754() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1754");
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
        user0.setPassword("");
        user0.setEmail("hi!");
        user0.setEmail("hi!");
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
    public void test1755() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1755");
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
        user0.setEmail("hi!");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
    }

    @Test
    public void test1756() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1756");
        User user0 = new User();
        java.lang.String str1 = user0.getPassword();
        user0.setUsername("hi!");
        user0.setCountry("hi!");
        java.lang.String str6 = user0.getLastName();
        user0.setLastName("");
        user0.setPassword("");
        java.lang.String str11 = user0.getEmail();
        java.lang.String str12 = user0.getUsername();
        user0.setPassword("");
        user0.setLastName("hi!");
        java.lang.String str17 = user0.getPassword();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
    }

    @Test
    public void test1757() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1757");
        User user0 = new User();
        java.lang.String str1 = user0.getPassword();
        user0.setCountry("hi!");
        user0.setUsername("hi!");
        java.lang.String str6 = user0.getUsername();
        user0.setLastName("");
        user0.setFirstName("");
        java.lang.String str11 = user0.getDob();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test1758() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1758");
        User user0 = new User();
        java.lang.String str1 = user0.getPassword();
        user0.setCountry("hi!");
        java.lang.String str4 = user0.getPassword();
        user0.setFirstName("");
        user0.setLastName("hi!");
        java.lang.String str9 = user0.getEmail();
        java.lang.String str10 = user0.getDob();
        java.lang.Class<?> wildcardClass11 = user0.getClass();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test1759() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1759");
        User user0 = new User();
        java.lang.String str1 = user0.getPassword();
        java.lang.String str2 = user0.getUsername();
        java.lang.String str3 = user0.getEmail();
        user0.setUsername("");
        user0.setDob("hi!");
        java.lang.String str8 = user0.getCountry();
        java.lang.String str9 = user0.getDob();
        user0.setFirstName("");
        java.lang.String str12 = user0.getFirstName();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test1760() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1760");
        User user0 = new User();
        java.lang.String str1 = user0.getPassword();
        user0.setCountry("hi!");
        java.lang.String str4 = user0.getPassword();
        java.lang.String str5 = user0.getPassword();
        java.lang.String str6 = user0.getEmail();
        java.lang.String str7 = user0.getDob();
        java.lang.String str8 = user0.getEmail();
        java.lang.Class<?> wildcardClass9 = user0.getClass();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test1761() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1761");
        User user0 = new User();
        java.lang.String str1 = user0.getPassword();
        java.lang.String str2 = user0.getUsername();
        java.lang.String str3 = user0.getEmail();
        user0.setFirstName("");
        user0.setLastName("hi!");
        user0.setUsername("hi!");
        java.lang.String str10 = user0.getUsername();
        java.lang.String str11 = user0.getDob();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test1762() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1762");
        User user0 = new User();
        java.lang.String str1 = user0.getPassword();
        user0.setCountry("hi!");
        java.lang.String str4 = user0.getFirstName();
        java.lang.String str5 = user0.getDob();
        java.lang.String str6 = user0.getLastName();
        java.lang.String str7 = user0.getCountry();
        user0.setEmail("hi!");
        user0.setLastName("hi!");
        java.lang.String str12 = user0.getCountry();
        java.lang.String str13 = user0.getLastName();
        java.lang.String str14 = user0.getFirstName();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertNull(str14);
    }

    @Test
    public void test1763() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1763");
        User user0 = new User();
        java.lang.String str1 = user0.getPassword();
        java.lang.String str2 = user0.getPassword();
        user0.setLastName("hi!");
        java.lang.String str5 = user0.getCountry();
        user0.setCountry("hi!");
        user0.setLastName("");
        java.lang.String str10 = user0.getPassword();
        user0.setLastName("");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test1764() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1764");
        User user0 = new User();
        java.lang.String str1 = user0.getPassword();
        user0.setCountry("hi!");
        user0.setUsername("hi!");
        user0.setPassword("");
        java.lang.String str8 = user0.getCountry();
        java.lang.String str9 = user0.getCountry();
        user0.setEmail("");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
    }

    @Test
    public void test1765() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1765");
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
        java.lang.String str13 = user0.getFirstName();
        java.lang.String str14 = user0.getCountry();
        java.lang.String str15 = user0.getCountry();
        java.lang.String str16 = user0.getEmail();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertNull(str16);
    }

    @Test
    public void test1766() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1766");
        User user0 = new User();
        java.lang.String str1 = user0.getPassword();
        user0.setCountry("hi!");
        java.lang.String str4 = user0.getPassword();
        java.lang.String str5 = user0.getPassword();
        user0.setCountry("");
        java.lang.String str8 = user0.getCountry();
        java.lang.String str9 = user0.getLastName();
        user0.setFirstName("hi!");
        user0.setFirstName("hi!");
        java.lang.String str14 = user0.getFirstName();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
    }

    @Test
    public void test1767() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1767");
        User user0 = new User();
        java.lang.String str1 = user0.getPassword();
        java.lang.String str2 = user0.getLastName();
        java.lang.String str3 = user0.getEmail();
        java.lang.String str4 = user0.getDob();
        user0.setDob("");
        java.lang.String str7 = user0.getCountry();
        java.lang.String str8 = user0.getPassword();
        user0.setLastName("");
        java.lang.String str11 = user0.getEmail();
        java.lang.String str12 = user0.getUsername();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test1768() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1768");
        User user0 = new User();
        java.lang.String str1 = user0.getPassword();
        user0.setCountry("hi!");
        java.lang.String str4 = user0.getFirstName();
        user0.setLastName("hi!");
        user0.setDob("hi!");
        java.lang.String str9 = user0.getFirstName();
        user0.setCountry("");
        user0.setEmail("");
        user0.setEmail("hi!");
        user0.setEmail("hi!");
        user0.setLastName("");
        user0.setFirstName("hi!");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test1769() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1769");
        User user0 = new User();
        java.lang.String str1 = user0.getPassword();
        java.lang.String str2 = user0.getUsername();
        java.lang.String str3 = user0.getEmail();
        java.lang.String str4 = user0.getLastName();
        java.lang.String str5 = user0.getEmail();
        java.lang.String str6 = user0.getUsername();
        java.lang.String str7 = user0.getDob();
        java.lang.String str8 = user0.getFirstName();
        user0.setCountry("");
        java.lang.String str11 = user0.getPassword();
        user0.setEmail("hi!");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test1770() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1770");
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
        user0.setCountry("hi!");
        user0.setPassword("hi!");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
    }

    @Test
    public void test1771() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1771");
        User user0 = new User();
        java.lang.String str1 = user0.getPassword();
        user0.setCountry("hi!");
        user0.setUsername("hi!");
        user0.setPassword("");
        java.lang.String str8 = user0.getUsername();
        java.lang.String str9 = user0.getPassword();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test1772() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1772");
        User user0 = new User();
        java.lang.String str1 = user0.getPassword();
        user0.setCountry("hi!");
        java.lang.String str4 = user0.getFirstName();
        java.lang.String str5 = user0.getDob();
        java.lang.String str6 = user0.getLastName();
        user0.setLastName("");
        user0.setDob("hi!");
        user0.setEmail("");
        java.lang.String str13 = user0.getCountry();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
    }

    @Test
    public void test1773() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1773");
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
        user0.setFirstName("hi!");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test1774() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1774");
        User user0 = new User();
        user0.setLastName("");
        user0.setDob("hi!");
        user0.setCountry("");
        java.lang.String str7 = user0.getCountry();
        java.lang.String str8 = user0.getFirstName();
        user0.setEmail("hi!");
        user0.setLastName("");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test1775() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1775");
        User user0 = new User();
        user0.setPassword("hi!");
        user0.setPassword("");
        user0.setUsername("");
        user0.setFirstName("");
        user0.setEmail("");
        java.lang.String str11 = user0.getDob();
        user0.setPassword("");
        user0.setCountry("hi!");
        java.lang.String str16 = user0.getFirstName();
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
    }

    @Test
    public void test1776() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1776");
        User user0 = new User();
        java.lang.String str1 = user0.getPassword();
        user0.setUsername("hi!");
        user0.setCountry("hi!");
        java.lang.String str6 = user0.getLastName();
        user0.setUsername("");
        java.lang.String str9 = user0.getLastName();
        user0.setPassword("hi!");
        java.lang.String str12 = user0.getLastName();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test1777() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1777");
        User user0 = new User();
        user0.setPassword("hi!");
        user0.setPassword("");
        java.lang.String str5 = user0.getPassword();
        java.lang.String str6 = user0.getEmail();
        user0.setCountry("hi!");
        user0.setEmail("hi!");
        user0.setDob("");
        java.lang.String str13 = user0.getLastName();
        user0.setPassword("hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str13);
    }

    @Test
    public void test1778() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1778");
        User user0 = new User();
        user0.setPassword("hi!");
        user0.setPassword("");
        java.lang.String str5 = user0.getPassword();
        user0.setCountry("hi!");
        user0.setLastName("hi!");
        user0.setFirstName("");
        user0.setDob("hi!");
        user0.setEmail("");
        java.lang.String str16 = user0.getFirstName();
        java.lang.Class<?> wildcardClass17 = user0.getClass();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test1779() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1779");
        User user0 = new User();
        java.lang.String str1 = user0.getPassword();
        user0.setCountry("hi!");
        user0.setUsername("hi!");
        user0.setCountry("");
        java.lang.String str8 = user0.getFirstName();
        user0.setLastName("hi!");
        java.lang.String str11 = user0.getDob();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test1780() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1780");
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
        user0.setPassword("hi!");
        user0.setFirstName("hi!");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test1781() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1781");
        User user0 = new User();
        java.lang.String str1 = user0.getPassword();
        user0.setCountry("hi!");
        java.lang.String str4 = user0.getFirstName();
        user0.setLastName("hi!");
        user0.setDob("hi!");
        java.lang.String str9 = user0.getEmail();
        java.lang.String str10 = user0.getCountry();
        user0.setDob("hi!");
        java.lang.String str13 = user0.getCountry();
        java.lang.String str14 = user0.getDob();
        java.lang.Class<?> wildcardClass15 = user0.getClass();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test1782() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1782");
        User user0 = new User();
        user0.setPassword("hi!");
        user0.setPassword("");
        java.lang.String str5 = user0.getDob();
        user0.setEmail("");
        user0.setUsername("");
        java.lang.String str10 = user0.getFirstName();
        user0.setUsername("");
        java.lang.String str13 = user0.getUsername();
        java.lang.String str14 = user0.getDob();
        java.lang.String str15 = user0.getDob();
        user0.setCountry("");
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(str15);
    }

    @Test
    public void test1783() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1783");
        User user0 = new User();
        java.lang.String str1 = user0.getPassword();
        java.lang.String str2 = user0.getUsername();
        java.lang.String str3 = user0.getEmail();
        user0.setFirstName("");
        user0.setLastName("hi!");
        user0.setUsername("hi!");
        java.lang.String str10 = user0.getDob();
        java.lang.String str11 = user0.getFirstName();
        user0.setEmail("");
        java.lang.String str14 = user0.getCountry();
        java.lang.String str15 = user0.getLastName();
        java.lang.String str16 = user0.getEmail();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
    }

    @Test
    public void test1784() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1784");
        User user0 = new User();
        java.lang.String str1 = user0.getPassword();
        user0.setCountry("hi!");
        java.lang.String str4 = user0.getFirstName();
        user0.setLastName("hi!");
        user0.setDob("hi!");
        java.lang.String str9 = user0.getEmail();
        java.lang.String str10 = user0.getCountry();
        user0.setDob("hi!");
        java.lang.String str13 = user0.getCountry();
        user0.setEmail("hi!");
        user0.setLastName("");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
    }

    @Test
    public void test1785() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1785");
        User user0 = new User();
        user0.setPassword("hi!");
        user0.setPassword("");
        java.lang.String str5 = user0.getPassword();
        java.lang.String str6 = user0.getEmail();
        java.lang.String str7 = user0.getEmail();
        java.lang.String str8 = user0.getFirstName();
        user0.setFirstName("");
        user0.setPassword("hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test1786() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1786");
        User user0 = new User();
        user0.setUsername("");
        java.lang.String str3 = user0.getUsername();
        user0.setCountry("hi!");
        java.lang.String str6 = user0.getPassword();
        java.lang.String str7 = user0.getEmail();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test1787() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1787");
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
        user0.setLastName("hi!");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str16);
    }

    @Test
    public void test1788() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1788");
        User user0 = new User();
        java.lang.String str1 = user0.getPassword();
        java.lang.String str2 = user0.getPassword();
        user0.setUsername("");
        java.lang.String str5 = user0.getCountry();
        user0.setDob("");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str5);
    }

    @Test
    public void test1789() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1789");
        User user0 = new User();
        java.lang.String str1 = user0.getPassword();
        java.lang.String str2 = user0.getUsername();
        java.lang.String str3 = user0.getEmail();
        user0.setUsername("");
        java.lang.String str6 = user0.getFirstName();
        java.lang.String str7 = user0.getUsername();
        user0.setPassword("");
        java.lang.String str10 = user0.getPassword();
        java.lang.String str11 = user0.getEmail();
        java.lang.String str12 = user0.getUsername();
        java.lang.String str13 = user0.getPassword();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test1790() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1790");
        User user0 = new User();
        java.lang.String str1 = user0.getPassword();
        user0.setCountry("hi!");
        java.lang.String str4 = user0.getPassword();
        java.lang.String str5 = user0.getPassword();
        java.lang.String str6 = user0.getEmail();
        java.lang.String str7 = user0.getUsername();
        user0.setFirstName("hi!");
        user0.setEmail("hi!");
        java.lang.String str12 = user0.getLastName();
        user0.setDob("");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test1791() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1791");
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
        user0.setFirstName("hi!");
        user0.setPassword("");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test1792() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1792");
        User user0 = new User();
        java.lang.String str1 = user0.getPassword();
        java.lang.String str2 = user0.getUsername();
        user0.setDob("");
        java.lang.String str5 = user0.getEmail();
        java.lang.String str6 = user0.getCountry();
        java.lang.String str7 = user0.getPassword();
        java.lang.String str8 = user0.getLastName();
        java.lang.String str9 = user0.getDob();
        java.lang.String str10 = user0.getPassword();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test1793() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1793");
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
        java.lang.String str13 = user0.getFirstName();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str13);
    }

    @Test
    public void test1794() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1794");
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
        user0.setLastName("hi!");
        user0.setPassword("");
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
    }

    @Test
    public void test1795() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1795");
        User user0 = new User();
        java.lang.String str1 = user0.getPassword();
        java.lang.String str2 = user0.getUsername();
        user0.setDob("");
        user0.setUsername("hi!");
        user0.setPassword("");
        user0.setCountry("");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
    }

    @Test
    public void test1796() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1796");
        User user0 = new User();
        java.lang.String str1 = user0.getPassword();
        user0.setCountry("hi!");
        java.lang.String str4 = user0.getUsername();
        java.lang.String str5 = user0.getPassword();
        user0.setDob("");
        user0.setDob("");
        user0.setPassword("hi!");
        java.lang.String str12 = user0.getLastName();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test1797() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1797");
        User user0 = new User();
        java.lang.String str1 = user0.getPassword();
        java.lang.String str2 = user0.getUsername();
        java.lang.String str3 = user0.getEmail();
        user0.setFirstName("");
        user0.setLastName("hi!");
        java.lang.String str8 = user0.getFirstName();
        java.lang.String str9 = user0.getPassword();
        java.lang.String str10 = user0.getPassword();
        user0.setCountry("");
        java.lang.String str13 = user0.getFirstName();
        java.lang.String str14 = user0.getPassword();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNull(str14);
    }

    @Test
    public void test1798() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1798");
        User user0 = new User();
        java.lang.String str1 = user0.getPassword();
        user0.setUsername("hi!");
        user0.setFirstName("");
        java.lang.String str6 = user0.getPassword();
        user0.setLastName("");
        java.lang.String str9 = user0.getDob();
        java.lang.String str10 = user0.getEmail();
        java.lang.String str11 = user0.getUsername();
        java.lang.String str12 = user0.getPassword();
        user0.setEmail("");
        java.lang.String str15 = user0.getLastName();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
    }

    @Test
    public void test1799() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1799");
        User user0 = new User();
        java.lang.String str1 = user0.getPassword();
        user0.setCountry("hi!");
        java.lang.String str4 = user0.getPassword();
        java.lang.String str5 = user0.getDob();
        java.lang.String str6 = user0.getCountry();
        java.lang.String str7 = user0.getUsername();
        user0.setCountry("");
        user0.setFirstName("hi!");
        user0.setDob("");
        user0.setDob("hi!");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test1800() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1800");
        User user0 = new User();
        user0.setPassword("hi!");
        user0.setPassword("");
        java.lang.String str5 = user0.getPassword();
        java.lang.String str6 = user0.getEmail();
        user0.setFirstName("hi!");
        java.lang.String str9 = user0.getFirstName();
        java.lang.String str10 = user0.getCountry();
        user0.setFirstName("");
        java.lang.String str13 = user0.getLastName();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str13);
    }

    @Test
    public void test1801() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1801");
        User user0 = new User();
        java.lang.String str1 = user0.getPassword();
        user0.setCountry("hi!");
        java.lang.String str4 = user0.getUsername();
        user0.setPassword("");
        user0.setFirstName("");
        java.lang.String str9 = user0.getUsername();
        user0.setCountry("");
        user0.setDob("hi!");
        java.lang.String str14 = user0.getUsername();
        java.lang.String str15 = user0.getPassword();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
    }

    @Test
    public void test1802() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1802");
        User user0 = new User();
        java.lang.String str1 = user0.getPassword();
        user0.setUsername("");
        java.lang.String str4 = user0.getCountry();
        java.lang.String str5 = user0.getEmail();
        user0.setCountry("hi!");
        user0.setDob("");
        java.lang.String str10 = user0.getDob();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test1803() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1803");
        User user0 = new User();
        user0.setUsername("");
        java.lang.String str3 = user0.getDob();
        java.lang.String str4 = user0.getDob();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
    }

    @Test
    public void test1804() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1804");
        User user0 = new User();
        java.lang.String str1 = user0.getPassword();
        user0.setCountry("hi!");
        user0.setLastName("");
        user0.setCountry("");
        user0.setUsername("");
        org.junit.Assert.assertNull(str1);
    }

    @Test
    public void test1805() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1805");
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
        java.lang.String str17 = user0.getCountry();
        java.lang.String str18 = user0.getCountry();
        user0.setUsername("hi!");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertNull(str18);
    }

    @Test
    public void test1806() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1806");
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
        java.lang.String str15 = user0.getUsername();
        java.lang.String str16 = user0.getEmail();
        java.lang.String str17 = user0.getEmail();
        user0.setEmail("hi!");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
    }

    @Test
    public void test1807() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1807");
        User user0 = new User();
        user0.setUsername("");
        java.lang.String str3 = user0.getDob();
        java.lang.String str4 = user0.getUsername();
        java.lang.String str5 = user0.getPassword();
        user0.setFirstName("");
        user0.setDob("");
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNull(str5);
    }

    @Test
    public void test1808() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1808");
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
        java.lang.String str13 = user0.getFirstName();
        java.lang.String str14 = user0.getCountry();
        java.lang.String str15 = user0.getCountry();
        java.lang.String str16 = user0.getLastName();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
    }

    @Test
    public void test1809() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1809");
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
        java.lang.String str15 = user0.getDob();
        user0.setDob("hi!");
        user0.setDob("hi!");
        user0.setCountry("");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str15);
    }

    @Test
    public void test1810() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1810");
        User user0 = new User();
        java.lang.String str1 = user0.getPassword();
        user0.setUsername("hi!");
        user0.setFirstName("");
        java.lang.String str6 = user0.getPassword();
        java.lang.String str7 = user0.getCountry();
        user0.setCountry("hi!");
        java.lang.String str10 = user0.getDob();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test1811() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1811");
        User user0 = new User();
        user0.setPassword("hi!");
        user0.setPassword("");
        java.lang.String str5 = user0.getPassword();
        java.lang.String str6 = user0.getEmail();
        user0.setCountry("hi!");
        java.lang.String str9 = user0.getDob();
        user0.setCountry("hi!");
        java.lang.String str12 = user0.getPassword();
        java.lang.String str13 = user0.getLastName();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNull(str13);
    }

    @Test
    public void test1812() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1812");
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
        user0.setLastName("");
        user0.setCountry("");
        java.lang.String str18 = user0.getCountry();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
    }

    @Test
    public void test1813() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1813");
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
        java.lang.String str17 = user0.getDob();
        user0.setUsername("");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
    }

    @Test
    public void test1814() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1814");
        User user0 = new User();
        java.lang.String str1 = user0.getPassword();
        java.lang.String str2 = user0.getUsername();
        java.lang.String str3 = user0.getEmail();
        user0.setFirstName("");
        user0.setLastName("hi!");
        user0.setUsername("hi!");
        user0.setEmail("");
        java.lang.String str12 = user0.getEmail();
        java.lang.String str13 = user0.getCountry();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNull(str13);
    }

    @Test
    public void test1815() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1815");
        User user0 = new User();
        java.lang.String str1 = user0.getPassword();
        java.lang.String str2 = user0.getUsername();
        java.lang.String str3 = user0.getCountry();
        user0.setLastName("");
        user0.setDob("hi!");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test1816() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1816");
        User user0 = new User();
        java.lang.String str1 = user0.getPassword();
        user0.setUsername("hi!");
        java.lang.String str4 = user0.getDob();
        user0.setUsername("");
        user0.setLastName("");
        user0.setEmail("hi!");
        user0.setEmail("");
        java.lang.String str13 = user0.getFirstName();
        user0.setUsername("");
        java.lang.Class<?> wildcardClass16 = user0.getClass();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test1817() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1817");
        User user0 = new User();
        java.lang.String str1 = user0.getPassword();
        user0.setCountry("hi!");
        java.lang.String str4 = user0.getFirstName();
        java.lang.String str5 = user0.getDob();
        java.lang.String str6 = user0.getLastName();
        user0.setFirstName("hi!");
        user0.setEmail("hi!");
        user0.setPassword("hi!");
        user0.setDob("hi!");
        user0.setUsername("");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test1818() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1818");
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
        user0.setPassword("");
        user0.setEmail("hi!");
        user0.setEmail("");
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
    public void test1819() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1819");
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
        user0.setEmail("hi!");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNull(str17);
    }

    @Test
    public void test1820() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1820");
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
        java.lang.String str16 = user0.getFirstName();
        java.lang.String str17 = user0.getCountry();
        java.lang.String str18 = user0.getEmail();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertNull(str18);
    }

    @Test
    public void test1821() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1821");
        User user0 = new User();
        java.lang.String str1 = user0.getPassword();
        user0.setCountry("hi!");
        java.lang.String str4 = user0.getFirstName();
        java.lang.String str5 = user0.getDob();
        java.lang.String str6 = user0.getLastName();
        user0.setLastName("");
        user0.setDob("hi!");
        java.lang.String str11 = user0.getEmail();
        java.lang.String str12 = user0.getPassword();
        user0.setDob("hi!");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test1822() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1822");
        User user0 = new User();
        java.lang.String str1 = user0.getPassword();
        user0.setCountry("hi!");
        java.lang.String str4 = user0.getFirstName();
        java.lang.String str5 = user0.getDob();
        java.lang.String str6 = user0.getLastName();
        user0.setFirstName("hi!");
        user0.setUsername("");
        user0.setFirstName("");
        java.lang.String str13 = user0.getFirstName();
        user0.setLastName("hi!");
        user0.setDob("");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test1823() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1823");
        User user0 = new User();
        java.lang.String str1 = user0.getPassword();
        java.lang.String str2 = user0.getPassword();
        user0.setLastName("hi!");
        java.lang.String str5 = user0.getCountry();
        user0.setLastName("hi!");
        java.lang.String str8 = user0.getDob();
        user0.setDob("");
        user0.setEmail("");
        java.lang.String str13 = user0.getDob();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test1824() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1824");
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
        java.lang.String str14 = user0.getUsername();
        java.lang.String str15 = user0.getUsername();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
    }

    @Test
    public void test1825() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1825");
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
        user0.setFirstName("hi!");
        user0.setPassword("hi!");
        user0.setUsername("");
        java.lang.String str20 = user0.getCountry();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
    }

    @Test
    public void test1826() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1826");
        User user0 = new User();
        user0.setPassword("hi!");
        user0.setPassword("");
        java.lang.String str5 = user0.getPassword();
        java.lang.String str6 = user0.getDob();
        java.lang.String str7 = user0.getPassword();
        user0.setFirstName("");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test1827() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1827");
        User user0 = new User();
        java.lang.String str1 = user0.getPassword();
        java.lang.String str2 = user0.getPassword();
        user0.setPassword("");
        java.lang.String str5 = user0.getPassword();
        java.lang.Class<?> wildcardClass6 = user0.getClass();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test1828() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1828");
        User user0 = new User();
        java.lang.String str1 = user0.getPassword();
        java.lang.String str2 = user0.getPassword();
        user0.setLastName("hi!");
        user0.setLastName("hi!");
        java.lang.Class<?> wildcardClass7 = user0.getClass();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test1829() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1829");
        User user0 = new User();
        java.lang.String str1 = user0.getPassword();
        java.lang.String str2 = user0.getUsername();
        java.lang.String str3 = user0.getCountry();
        user0.setPassword("");
        user0.setLastName("");
        user0.setUsername("");
        user0.setUsername("hi!");
        user0.setUsername("");
        user0.setLastName("hi!");
        java.lang.String str16 = user0.getUsername();
        user0.setDob("hi!");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
    }

    @Test
    public void test1830() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1830");
        User user0 = new User();
        java.lang.String str1 = user0.getPassword();
        user0.setCountry("hi!");
        java.lang.String str4 = user0.getFirstName();
        user0.setLastName("hi!");
        user0.setDob("hi!");
        java.lang.String str9 = user0.getFirstName();
        user0.setCountry("");
        user0.setEmail("");
        user0.setEmail("hi!");
        user0.setUsername("");
        java.lang.String str18 = user0.getPassword();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str18);
    }

    @Test
    public void test1831() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1831");
        User user0 = new User();
        java.lang.String str1 = user0.getPassword();
        java.lang.String str2 = user0.getPassword();
        user0.setUsername("");
        java.lang.String str5 = user0.getCountry();
        java.lang.String str6 = user0.getCountry();
        java.lang.String str7 = user0.getFirstName();
        user0.setDob("hi!");
        user0.setLastName("hi!");
        java.lang.String str12 = user0.getCountry();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test1832() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1832");
        User user0 = new User();
        java.lang.String str1 = user0.getPassword();
        user0.setUsername("hi!");
        user0.setCountry("hi!");
        user0.setFirstName("");
        user0.setLastName("hi!");
        user0.setEmail("");
        java.lang.Class<?> wildcardClass12 = user0.getClass();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test1833() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1833");
        User user0 = new User();
        java.lang.String str1 = user0.getPassword();
        user0.setCountry("hi!");
        java.lang.String str4 = user0.getUsername();
        user0.setPassword("");
        user0.setFirstName("hi!");
        user0.setCountry("");
        user0.setCountry("");
        java.lang.String str13 = user0.getDob();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str13);
    }

    @Test
    public void test1834() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1834");
        User user0 = new User();
        java.lang.String str1 = user0.getPassword();
        user0.setCountry("hi!");
        java.lang.String str4 = user0.getFirstName();
        user0.setLastName("hi!");
        user0.setDob("hi!");
        java.lang.String str9 = user0.getFirstName();
        user0.setPassword("");
        java.lang.String str12 = user0.getCountry();
        java.lang.String str13 = user0.getCountry();
        java.lang.String str14 = user0.getLastName();
        java.lang.Class<?> wildcardClass15 = user0.getClass();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test1835() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1835");
        User user0 = new User();
        java.lang.String str1 = user0.getPassword();
        user0.setUsername("hi!");
        user0.setCountry("hi!");
        user0.setFirstName("");
        user0.setUsername("");
        java.lang.String str10 = user0.getLastName();
        user0.setFirstName("hi!");
        user0.setLastName("");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test1836() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1836");
        User user0 = new User();
        java.lang.String str1 = user0.getPassword();
        java.lang.String str2 = user0.getPassword();
        java.lang.String str3 = user0.getPassword();
        java.lang.String str4 = user0.getDob();
        user0.setFirstName("hi!");
        user0.setCountry("hi!");
        java.lang.String str9 = user0.getFirstName();
        user0.setUsername("");
        java.lang.String str12 = user0.getUsername();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test1837() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1837");
        User user0 = new User();
        java.lang.String str1 = user0.getPassword();
        java.lang.String str2 = user0.getUsername();
        user0.setDob("");
        java.lang.String str5 = user0.getEmail();
        user0.setLastName("hi!");
        java.lang.String str8 = user0.getDob();
        user0.setPassword("");
        java.lang.String str11 = user0.getEmail();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test1838() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1838");
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
        java.lang.String str14 = user0.getPassword();
        java.lang.Class<?> wildcardClass15 = user0.getClass();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test1839() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1839");
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
        user0.setEmail("");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
    }

    @Test
    public void test1840() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1840");
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
        java.lang.String str14 = user0.getFirstName();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test1841() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1841");
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
        java.lang.Class<?> wildcardClass15 = user0.getClass();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test1842() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1842");
        User user0 = new User();
        java.lang.String str1 = user0.getPassword();
        java.lang.String str2 = user0.getUsername();
        java.lang.String str3 = user0.getEmail();
        user0.setFirstName("");
        user0.setLastName("hi!");
        java.lang.String str8 = user0.getFirstName();
        user0.setDob("");
        user0.setDob("hi!");
        java.lang.String str13 = user0.getCountry();
        java.lang.String str14 = user0.getCountry();
        java.lang.String str15 = user0.getDob();
        user0.setPassword("");
        user0.setUsername("hi!");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
    }

    @Test
    public void test1843() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1843");
        User user0 = new User();
        user0.setPassword("hi!");
        java.lang.String str3 = user0.getPassword();
        java.lang.String str4 = user0.getFirstName();
        java.lang.String str5 = user0.getLastName();
        user0.setFirstName("");
        java.lang.String str8 = user0.getLastName();
        java.lang.String str9 = user0.getFirstName();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test1844() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1844");
        User user0 = new User();
        java.lang.String str1 = user0.getPassword();
        java.lang.String str2 = user0.getPassword();
        java.lang.String str3 = user0.getPassword();
        java.lang.String str4 = user0.getDob();
        user0.setPassword("");
        user0.setPassword("");
        java.lang.String str9 = user0.getEmail();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test1845() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1845");
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
        user0.setEmail("hi!");
        java.lang.Class<?> wildcardClass20 = user0.getClass();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test1846() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1846");
        User user0 = new User();
        user0.setPassword("hi!");
        user0.setPassword("");
        java.lang.String str5 = user0.getPassword();
        user0.setFirstName("");
        user0.setLastName("");
        user0.setPassword("hi!");
        java.lang.String str12 = user0.getEmail();
        java.lang.String str13 = user0.getLastName();
        user0.setLastName("");
        java.lang.String str16 = user0.getDob();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNull(str16);
    }

    @Test
    public void test1847() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1847");
        User user0 = new User();
        user0.setPassword("hi!");
        user0.setLastName("");
        java.lang.String str5 = user0.getFirstName();
        java.lang.String str6 = user0.getCountry();
        user0.setEmail("");
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test1848() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1848");
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
        java.lang.String str19 = user0.getCountry();
        user0.setFirstName("");
        java.lang.String str22 = user0.getFirstName();
        java.lang.String str23 = user0.getFirstName();
        java.lang.String str24 = user0.getUsername();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertNull(str24);
    }

    @Test
    public void test1849() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1849");
        User user0 = new User();
        java.lang.String str1 = user0.getPassword();
        java.lang.String str2 = user0.getPassword();
        user0.setUsername("");
        java.lang.String str5 = user0.getCountry();
        java.lang.String str6 = user0.getDob();
        java.lang.String str7 = user0.getFirstName();
        java.lang.String str8 = user0.getUsername();
        java.lang.String str9 = user0.getLastName();
        java.lang.Class<?> wildcardClass10 = user0.getClass();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test1850() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1850");
        User user0 = new User();
        java.lang.String str1 = user0.getPassword();
        user0.setUsername("hi!");
        user0.setFirstName("");
        java.lang.String str6 = user0.getPassword();
        user0.setLastName("");
        java.lang.String str9 = user0.getDob();
        java.lang.String str10 = user0.getEmail();
        java.lang.String str11 = user0.getUsername();
        java.lang.Class<?> wildcardClass12 = user0.getClass();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test1851() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1851");
        User user0 = new User();
        java.lang.String str1 = user0.getPassword();
        java.lang.String str2 = user0.getPassword();
        user0.setLastName("hi!");
        java.lang.String str5 = user0.getCountry();
        java.lang.String str6 = user0.getEmail();
        java.lang.String str7 = user0.getDob();
        user0.setEmail("");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test1852() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1852");
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
    public void test1853() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1853");
        User user0 = new User();
        java.lang.String str1 = user0.getPassword();
        user0.setCountry("hi!");
        java.lang.String str4 = user0.getFirstName();
        java.lang.String str5 = user0.getDob();
        java.lang.String str6 = user0.getLastName();
        user0.setLastName("");
        user0.setEmail("");
        java.lang.String str11 = user0.getLastName();
        user0.setDob("");
        user0.setEmail("");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test1854() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1854");
        User user0 = new User();
        java.lang.String str1 = user0.getPassword();
        user0.setUsername("");
        user0.setLastName("hi!");
        user0.setLastName("hi!");
        org.junit.Assert.assertNull(str1);
    }

    @Test
    public void test1855() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1855");
        User user0 = new User();
        java.lang.String str1 = user0.getPassword();
        java.lang.String str2 = user0.getPassword();
        java.lang.String str3 = user0.getPassword();
        java.lang.String str4 = user0.getFirstName();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
    }

    @Test
    public void test1856() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1856");
        User user0 = new User();
        user0.setPassword("hi!");
        java.lang.String str3 = user0.getPassword();
        java.lang.String str4 = user0.getFirstName();
        java.lang.String str5 = user0.getLastName();
        java.lang.String str6 = user0.getDob();
        java.lang.String str7 = user0.getUsername();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test1857() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1857");
        User user0 = new User();
        java.lang.String str1 = user0.getPassword();
        java.lang.String str2 = user0.getPassword();
        java.lang.String str3 = user0.getFirstName();
        user0.setDob("hi!");
        java.lang.String str6 = user0.getEmail();
        user0.setDob("");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test1858() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1858");
        User user0 = new User();
        java.lang.String str1 = user0.getPassword();
        user0.setCountry("hi!");
        java.lang.String str4 = user0.getFirstName();
        java.lang.String str5 = user0.getDob();
        java.lang.String str6 = user0.getEmail();
        java.lang.String str7 = user0.getFirstName();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test1859() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1859");
        User user0 = new User();
        java.lang.String str1 = user0.getPassword();
        java.lang.String str2 = user0.getPassword();
        user0.setLastName("hi!");
        java.lang.String str5 = user0.getCountry();
        user0.setCountry("hi!");
        java.lang.String str8 = user0.getPassword();
        java.lang.String str9 = user0.getUsername();
        java.lang.String str10 = user0.getUsername();
        java.lang.String str11 = user0.getUsername();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test1860() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1860");
        User user0 = new User();
        java.lang.String str1 = user0.getPassword();
        user0.setPassword("hi!");
        java.lang.String str4 = user0.getPassword();
        user0.setFirstName("hi!");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
    }

    @Test
    public void test1861() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1861");
        User user0 = new User();
        user0.setPassword("hi!");
        java.lang.String str3 = user0.getPassword();
        java.lang.String str4 = user0.getFirstName();
        java.lang.String str5 = user0.getLastName();
        user0.setCountry("");
        user0.setUsername("");
        user0.setFirstName("hi!");
        user0.setPassword("hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
    }

    @Test
    public void test1862() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1862");
        User user0 = new User();
        java.lang.String str1 = user0.getPassword();
        java.lang.String str2 = user0.getPassword();
        java.lang.String str3 = user0.getFirstName();
        user0.setDob("hi!");
        java.lang.String str6 = user0.getEmail();
        java.lang.String str7 = user0.getFirstName();
        user0.setLastName("hi!");
        java.lang.String str10 = user0.getFirstName();
        user0.setUsername("");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test1863() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1863");
        User user0 = new User();
        java.lang.String str1 = user0.getPassword();
        java.lang.String str2 = user0.getUsername();
        java.lang.String str3 = user0.getEmail();
        user0.setFirstName("");
        user0.setLastName("hi!");
        user0.setCountry("");
        user0.setUsername("hi!");
        java.lang.String str12 = user0.getDob();
        user0.setUsername("");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test1864() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1864");
        User user0 = new User();
        java.lang.String str1 = user0.getPassword();
        java.lang.String str2 = user0.getUsername();
        java.lang.String str3 = user0.getEmail();
        java.lang.String str4 = user0.getLastName();
        user0.setDob("");
        user0.setFirstName("hi!");
        user0.setLastName("");
        java.lang.String str11 = user0.getCountry();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test1865() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1865");
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
        java.lang.String str15 = user0.getLastName();
        java.lang.String str16 = user0.getLastName();
        user0.setCountry("");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
    }

    @Test
    public void test1866() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1866");
        User user0 = new User();
        java.lang.String str1 = user0.getPassword();
        user0.setFirstName("");
        java.lang.String str4 = user0.getFirstName();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
    }

    @Test
    public void test1867() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1867");
        User user0 = new User();
        java.lang.String str1 = user0.getPassword();
        java.lang.String str2 = user0.getUsername();
        java.lang.String str3 = user0.getEmail();
        user0.setFirstName("");
        user0.setLastName("hi!");
        user0.setUsername("hi!");
        user0.setDob("");
        java.lang.String str12 = user0.getLastName();
        java.lang.String str13 = user0.getPassword();
        user0.setPassword("");
        java.lang.String str16 = user0.getDob();
        user0.setLastName("");
        user0.setEmail("hi!");
        user0.setFirstName("hi!");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
    }

    @Test
    public void test1868() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1868");
        User user0 = new User();
        user0.setPassword("hi!");
        user0.setPassword("");
        java.lang.String str5 = user0.getDob();
        user0.setEmail("");
        user0.setUsername("");
        java.lang.String str10 = user0.getFirstName();
        user0.setUsername("");
        java.lang.String str13 = user0.getUsername();
        java.lang.String str14 = user0.getDob();
        java.lang.String str15 = user0.getDob();
        user0.setEmail("");
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(str15);
    }

    @Test
    public void test1869() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1869");
        User user0 = new User();
        java.lang.String str1 = user0.getPassword();
        java.lang.String str2 = user0.getPassword();
        java.lang.String str3 = user0.getFirstName();
        user0.setDob("hi!");
        java.lang.String str6 = user0.getEmail();
        java.lang.String str7 = user0.getFirstName();
        user0.setCountry("hi!");
        java.lang.String str10 = user0.getFirstName();
        java.lang.String str11 = user0.getCountry();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
    }

    @Test
    public void test1870() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1870");
        User user0 = new User();
        java.lang.String str1 = user0.getPassword();
        java.lang.String str2 = user0.getPassword();
        java.lang.String str3 = user0.getPassword();
        java.lang.String str4 = user0.getDob();
        user0.setFirstName("hi!");
        user0.setCountry("hi!");
        user0.setDob("hi!");
        java.lang.String str11 = user0.getUsername();
        user0.setEmail("");
        java.lang.String str14 = user0.getLastName();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str14);
    }

    @Test
    public void test1871() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1871");
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
        java.lang.String str14 = user0.getUsername();
        user0.setFirstName("hi!");
        java.lang.String str17 = user0.getUsername();
        java.lang.String str18 = user0.getDob();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
    }

    @Test
    public void test1872() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1872");
        User user0 = new User();
        java.lang.String str1 = user0.getPassword();
        java.lang.String str2 = user0.getUsername();
        java.lang.String str3 = user0.getEmail();
        user0.setFirstName("");
        user0.setLastName("hi!");
        java.lang.String str8 = user0.getFirstName();
        java.lang.String str9 = user0.getPassword();
        user0.setDob("hi!");
        user0.setDob("hi!");
        java.lang.String str14 = user0.getEmail();
        user0.setPassword("hi!");
        java.lang.String str17 = user0.getLastName();
        user0.setFirstName("hi!");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
    }

    @Test
    public void test1873() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1873");
        User user0 = new User();
        java.lang.String str1 = user0.getPassword();
        user0.setUsername("hi!");
        user0.setFirstName("");
        java.lang.String str6 = user0.getPassword();
        java.lang.String str7 = user0.getCountry();
        user0.setPassword("");
        java.lang.Class<?> wildcardClass10 = user0.getClass();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test1874() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1874");
        User user0 = new User();
        user0.setPassword("hi!");
        java.lang.String str3 = user0.getPassword();
        java.lang.String str4 = user0.getFirstName();
        java.lang.String str5 = user0.getPassword();
        user0.setFirstName("");
        java.lang.String str8 = user0.getCountry();
        user0.setUsername("");
        java.lang.String str11 = user0.getCountry();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test1875() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1875");
        User user0 = new User();
        java.lang.String str1 = user0.getPassword();
        user0.setCountry("hi!");
        java.lang.String str4 = user0.getFirstName();
        user0.setLastName("hi!");
        user0.setLastName("hi!");
        user0.setEmail("hi!");
        java.lang.String str11 = user0.getUsername();
        java.lang.String str12 = user0.getLastName();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
    }

    @Test
    public void test1876() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1876");
        User user0 = new User();
        java.lang.String str1 = user0.getPassword();
        java.lang.String str2 = user0.getUsername();
        java.lang.String str3 = user0.getEmail();
        java.lang.String str4 = user0.getLastName();
        user0.setDob("");
        java.lang.String str7 = user0.getLastName();
        user0.setPassword("hi!");
        user0.setPassword("");
        java.lang.String str12 = user0.getFirstName();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test1877() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1877");
        User user0 = new User();
        user0.setPassword("hi!");
        user0.setPassword("");
        java.lang.String str5 = user0.getPassword();
        java.lang.String str6 = user0.getEmail();
        user0.setCountry("hi!");
        java.lang.String str9 = user0.getDob();
        user0.setEmail("hi!");
        user0.setEmail("hi!");
        java.lang.String str14 = user0.getCountry();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
    }

    @Test
    public void test1878() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1878");
        User user0 = new User();
        java.lang.String str1 = user0.getPassword();
        java.lang.String str2 = user0.getUsername();
        user0.setDob("");
        java.lang.String str5 = user0.getEmail();
        user0.setFirstName("hi!");
        user0.setFirstName("hi!");
        user0.setFirstName("");
        java.lang.String str12 = user0.getCountry();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test1879() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1879");
        User user0 = new User();
        java.lang.String str1 = user0.getPassword();
        java.lang.String str2 = user0.getUsername();
        java.lang.String str3 = user0.getEmail();
        user0.setUsername("");
        java.lang.String str6 = user0.getFirstName();
        user0.setLastName("");
        java.lang.Class<?> wildcardClass9 = user0.getClass();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test1880() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1880");
        User user0 = new User();
        user0.setPassword("hi!");
        user0.setPassword("");
        java.lang.String str5 = user0.getPassword();
        java.lang.String str6 = user0.getPassword();
        user0.setPassword("");
        user0.setCountry("");
        user0.setLastName("");
        java.lang.String str13 = user0.getDob();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNull(str13);
    }

    @Test
    public void test1881() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1881");
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
        java.lang.Class<?> wildcardClass18 = user0.getClass();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test1882() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1882");
        User user0 = new User();
        java.lang.String str1 = user0.getPassword();
        user0.setCountry("hi!");
        user0.setUsername("hi!");
        user0.setCountry("");
        user0.setLastName("hi!");
        java.lang.String str10 = user0.getCountry();
        user0.setLastName("");
        java.lang.String str13 = user0.getUsername();
        user0.setDob("");
        user0.setUsername("hi!");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
    }

    @Test
    public void test1883() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1883");
        User user0 = new User();
        java.lang.String str1 = user0.getPassword();
        user0.setCountry("hi!");
        user0.setUsername("hi!");
        user0.setCountry("");
        user0.setLastName("hi!");
        java.lang.String str10 = user0.getCountry();
        user0.setEmail("");
        user0.setDob("");
        java.lang.String str15 = user0.getFirstName();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNull(str15);
    }

    @Test
    public void test1884() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1884");
        User user0 = new User();
        java.lang.String str1 = user0.getPassword();
        user0.setCountry("hi!");
        java.lang.String str4 = user0.getPassword();
        java.lang.String str5 = user0.getPassword();
        user0.setCountry("");
        java.lang.String str8 = user0.getCountry();
        java.lang.String str9 = user0.getLastName();
        user0.setFirstName("hi!");
        java.lang.String str12 = user0.getUsername();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test1885() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1885");
        User user0 = new User();
        user0.setPassword("hi!");
        java.lang.String str3 = user0.getPassword();
        java.lang.String str4 = user0.getFirstName();
        java.lang.String str5 = user0.getLastName();
        user0.setCountry("");
        user0.setLastName("");
        user0.setEmail("hi!");
        java.lang.String str12 = user0.getFirstName();
        java.lang.String str13 = user0.getUsername();
        user0.setFirstName("hi!");
        java.lang.Class<?> wildcardClass16 = user0.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test1886() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1886");
        User user0 = new User();
        java.lang.String str1 = user0.getPassword();
        user0.setCountry("hi!");
        java.lang.String str4 = user0.getUsername();
        java.lang.String str5 = user0.getPassword();
        java.lang.String str6 = user0.getDob();
        java.lang.String str7 = user0.getCountry();
        java.lang.String str8 = user0.getLastName();
        user0.setFirstName("hi!");
        user0.setCountry("hi!");
        java.lang.String str13 = user0.getUsername();
        user0.setEmail("hi!");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str13);
    }

    @Test
    public void test1887() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1887");
        User user0 = new User();
        java.lang.String str1 = user0.getPassword();
        user0.setUsername("hi!");
        user0.setCountry("hi!");
        java.lang.String str6 = user0.getLastName();
        user0.setLastName("");
        java.lang.String str9 = user0.getEmail();
        user0.setPassword("");
        java.lang.String str12 = user0.getLastName();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test1888() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1888");
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
        user0.setLastName("");
        user0.setPassword("");
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
    public void test1889() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1889");
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
        java.lang.String str16 = user0.getEmail();
        user0.setDob("");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertNull(str16);
    }

    @Test
    public void test1890() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1890");
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
        user0.setDob("");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
    }

    @Test
    public void test1891() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1891");
        User user0 = new User();
        java.lang.String str1 = user0.getPassword();
        user0.setCountry("hi!");
        java.lang.String str4 = user0.getUsername();
        java.lang.String str5 = user0.getPassword();
        java.lang.String str6 = user0.getUsername();
        java.lang.String str7 = user0.getEmail();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test1892() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1892");
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
        java.lang.String str16 = user0.getCountry();
        java.lang.String str17 = user0.getDob();
        java.lang.String str18 = user0.getFirstName();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
    }

    @Test
    public void test1893() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1893");
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
        user0.setPassword("");
        java.lang.String str15 = user0.getFirstName();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
    }

    @Test
    public void test1894() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1894");
        User user0 = new User();
        java.lang.String str1 = user0.getPassword();
        java.lang.String str2 = user0.getUsername();
        java.lang.String str3 = user0.getEmail();
        user0.setUsername("");
        user0.setPassword("hi!");
        java.lang.String str8 = user0.getLastName();
        user0.setPassword("hi!");
        java.lang.String str11 = user0.getDob();
        user0.setPassword("");
        user0.setCountry("hi!");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test1895() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1895");
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
        user0.setUsername("");
        java.lang.String str17 = user0.getEmail();
        java.lang.String str18 = user0.getEmail();
        java.lang.String str19 = user0.getEmail();
        java.lang.String str20 = user0.getCountry();
        java.lang.String str21 = user0.getFirstName();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
    }

    @Test
    public void test1896() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1896");
        User user0 = new User();
        java.lang.String str1 = user0.getPassword();
        user0.setCountry("hi!");
        java.lang.String str4 = user0.getFirstName();
        java.lang.String str5 = user0.getDob();
        java.lang.String str6 = user0.getLastName();
        user0.setFirstName("hi!");
        user0.setUsername("hi!");
        java.lang.String str11 = user0.getLastName();
        user0.setLastName("");
        user0.setEmail("hi!");
        java.lang.String str16 = user0.getFirstName();
        user0.setEmail("hi!");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
    }

    @Test
    public void test1897() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1897");
        User user0 = new User();
        java.lang.String str1 = user0.getPassword();
        java.lang.String str2 = user0.getPassword();
        user0.setLastName("hi!");
        java.lang.String str5 = user0.getCountry();
        user0.setFirstName("");
        user0.setDob("hi!");
        user0.setLastName("");
        java.lang.String str12 = user0.getFirstName();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test1898() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1898");
        User user0 = new User();
        user0.setPassword("hi!");
        user0.setPassword("");
        java.lang.String str5 = user0.getPassword();
        user0.setCountry("hi!");
        user0.setLastName("hi!");
        user0.setFirstName("");
        java.lang.String str12 = user0.getFirstName();
        java.lang.String str13 = user0.getCountry();
        java.lang.String str14 = user0.getFirstName();
        java.lang.Class<?> wildcardClass15 = user0.getClass();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test1899() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1899");
        User user0 = new User();
        java.lang.String str1 = user0.getPassword();
        java.lang.String str2 = user0.getPassword();
        java.lang.String str3 = user0.getFirstName();
        user0.setDob("hi!");
        java.lang.String str6 = user0.getEmail();
        user0.setPassword("hi!");
        java.lang.String str9 = user0.getPassword();
        java.lang.String str10 = user0.getEmail();
        user0.setCountry("");
        java.lang.String str13 = user0.getDob();
        java.lang.String str14 = user0.getPassword();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
    }

    @Test
    public void test1900() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1900");
        User user0 = new User();
        user0.setPassword("hi!");
        user0.setLastName("");
        java.lang.String str5 = user0.getDob();
        user0.setLastName("hi!");
        org.junit.Assert.assertNull(str5);
    }

    @Test
    public void test1901() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1901");
        User user0 = new User();
        java.lang.String str1 = user0.getPassword();
        java.lang.String str2 = user0.getUsername();
        java.lang.String str3 = user0.getEmail();
        user0.setFirstName("");
        user0.setLastName("hi!");
        java.lang.String str8 = user0.getFirstName();
        user0.setFirstName("hi!");
        user0.setCountry("");
        user0.setUsername("hi!");
        user0.setLastName("hi!");
        user0.setUsername("hi!");
        java.lang.String str19 = user0.getCountry();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
    }

    @Test
    public void test1902() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1902");
        User user0 = new User();
        java.lang.String str1 = user0.getPassword();
        java.lang.String str2 = user0.getUsername();
        java.lang.String str3 = user0.getEmail();
        java.lang.String str4 = user0.getLastName();
        user0.setUsername("hi!");
        user0.setCountry("");
        user0.setDob("hi!");
        java.lang.String str11 = user0.getUsername();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
    }

    @Test
    public void test1903() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1903");
        User user0 = new User();
        java.lang.String str1 = user0.getPassword();
        java.lang.String str2 = user0.getPassword();
        java.lang.String str3 = user0.getFirstName();
        user0.setDob("hi!");
        java.lang.String str6 = user0.getEmail();
        user0.setPassword("hi!");
        user0.setCountry("");
        java.lang.String str11 = user0.getPassword();
        java.lang.Class<?> wildcardClass12 = user0.getClass();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test1904() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1904");
        User user0 = new User();
        java.lang.String str1 = user0.getFirstName();
        user0.setPassword("");
        user0.setEmail("hi!");
        user0.setCountry("");
        user0.setDob("hi!");
        user0.setUsername("hi!");
        java.lang.Class<?> wildcardClass12 = user0.getClass();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test1905() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1905");
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
        user0.setLastName("hi!");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test1906() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1906");
        User user0 = new User();
        java.lang.String str1 = user0.getPassword();
        user0.setCountry("hi!");
        user0.setUsername("hi!");
        user0.setPassword("");
        user0.setUsername("");
        user0.setEmail("");
        user0.setCountry("hi!");
        user0.setEmail("");
        org.junit.Assert.assertNull(str1);
    }

    @Test
    public void test1907() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1907");
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
        java.lang.String str17 = user0.getEmail();
        java.lang.Class<?> wildcardClass18 = user0.getClass();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test1908() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1908");
        User user0 = new User();
        java.lang.String str1 = user0.getPassword();
        java.lang.String str2 = user0.getPassword();
        user0.setLastName("hi!");
        java.lang.String str5 = user0.getCountry();
        user0.setLastName("hi!");
        java.lang.String str8 = user0.getDob();
        user0.setDob("");
        java.lang.String str11 = user0.getLastName();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
    }

    @Test
    public void test1909() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1909");
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
        user0.setEmail("hi!");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str13);
    }

    @Test
    public void test1910() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1910");
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
        java.lang.String str18 = user0.getCountry();
        java.lang.Class<?> wildcardClass19 = user0.getClass();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test1911() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1911");
        User user0 = new User();
        java.lang.String str1 = user0.getPassword();
        user0.setCountry("hi!");
        java.lang.String str4 = user0.getPassword();
        user0.setCountry("");
        java.lang.String str7 = user0.getLastName();
        java.lang.String str8 = user0.getEmail();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test1912() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1912");
        User user0 = new User();
        java.lang.String str1 = user0.getPassword();
        java.lang.String str2 = user0.getUsername();
        java.lang.String str3 = user0.getEmail();
        user0.setFirstName("");
        user0.setLastName("hi!");
        user0.setCountry("");
        user0.setUsername("hi!");
        java.lang.String str12 = user0.getDob();
        java.lang.String str13 = user0.getUsername();
        java.lang.String str14 = user0.getCountry();
        user0.setCountry("");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test1913() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1913");
        User user0 = new User();
        user0.setLastName("");
        java.lang.String str3 = user0.getUsername();
        java.lang.String str4 = user0.getCountry();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
    }

    @Test
    public void test1914() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1914");
        User user0 = new User();
        java.lang.String str1 = user0.getPassword();
        user0.setCountry("hi!");
        java.lang.String str4 = user0.getFirstName();
        user0.setLastName("hi!");
        user0.setDob("hi!");
        java.lang.String str9 = user0.getEmail();
        user0.setEmail("hi!");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test1915() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1915");
        User user0 = new User();
        java.lang.String str1 = user0.getPassword();
        java.lang.String str2 = user0.getUsername();
        user0.setDob("");
        java.lang.String str5 = user0.getEmail();
        java.lang.String str6 = user0.getCountry();
        java.lang.String str7 = user0.getPassword();
        java.lang.String str8 = user0.getLastName();
        java.lang.String str9 = user0.getDob();
        user0.setUsername("hi!");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test1916() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1916");
        User user0 = new User();
        java.lang.String str1 = user0.getPassword();
        user0.setCountry("hi!");
        java.lang.String str4 = user0.getPassword();
        java.lang.String str5 = user0.getPassword();
        java.lang.String str6 = user0.getEmail();
        java.lang.String str7 = user0.getUsername();
        java.lang.String str8 = user0.getUsername();
        user0.setCountry("");
        user0.setDob("hi!");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test1917() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1917");
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
        java.lang.String str13 = user0.getLastName();
        java.lang.String str14 = user0.getUsername();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(str14);
    }

    @Test
    public void test1918() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1918");
        User user0 = new User();
        user0.setPassword("hi!");
        user0.setPassword("");
        user0.setPassword("");
        java.lang.String str7 = user0.getCountry();
        user0.setPassword("hi!");
        java.lang.String str10 = user0.getLastName();
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test1919() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1919");
        User user0 = new User();
        java.lang.String str1 = user0.getPassword();
        user0.setCountry("hi!");
        java.lang.String str4 = user0.getFirstName();
        java.lang.String str5 = user0.getDob();
        java.lang.String str6 = user0.getEmail();
        java.lang.String str7 = user0.getEmail();
        user0.setPassword("hi!");
        java.lang.String str10 = user0.getFirstName();
        user0.setCountry("");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test1920() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1920");
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
        user0.setEmail("");
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
    public void test1921() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1921");
        User user0 = new User();
        user0.setPassword("hi!");
        user0.setPassword("");
        java.lang.String str5 = user0.getFirstName();
        user0.setEmail("hi!");
        user0.setPassword("hi!");
        user0.setFirstName("hi!");
        user0.setLastName("");
        java.lang.String str14 = user0.getPassword();
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
    }

    @Test
    public void test1922() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1922");
        User user0 = new User();
        java.lang.String str1 = user0.getPassword();
        user0.setCountry("hi!");
        java.lang.String str4 = user0.getFirstName();
        user0.setLastName("hi!");
        java.lang.String str7 = user0.getFirstName();
        user0.setCountry("hi!");
        java.lang.String str10 = user0.getPassword();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test1923() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1923");
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
        user0.setFirstName("hi!");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertNull(str15);
    }

    @Test
    public void test1924() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1924");
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
        user0.setUsername("hi!");
        user0.setPassword("");
        user0.setDob("hi!");
        java.lang.String str22 = user0.getPassword();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
    }

    @Test
    public void test1925() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1925");
        User user0 = new User();
        java.lang.String str1 = user0.getPassword();
        user0.setUsername("hi!");
        java.lang.String str4 = user0.getUsername();
        java.lang.String str5 = user0.getEmail();
        java.lang.String str6 = user0.getDob();
        user0.setDob("hi!");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test1926() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1926");
        User user0 = new User();
        java.lang.String str1 = user0.getFirstName();
        user0.setPassword("");
        java.lang.String str4 = user0.getUsername();
        user0.setLastName("");
        user0.setFirstName("hi!");
        java.lang.String str9 = user0.getUsername();
        java.lang.String str10 = user0.getDob();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test1927() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1927");
        User user0 = new User();
        user0.setPassword("hi!");
        user0.setPassword("");
        java.lang.String str5 = user0.getPassword();
        java.lang.String str6 = user0.getEmail();
        user0.setFirstName("hi!");
        java.lang.String str9 = user0.getEmail();
        user0.setPassword("hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test1928() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1928");
        User user0 = new User();
        user0.setPassword("hi!");
        user0.setPassword("");
        java.lang.String str5 = user0.getPassword();
        java.lang.String str6 = user0.getDob();
        java.lang.String str7 = user0.getDob();
        user0.setLastName("");
        java.lang.String str10 = user0.getPassword();
        user0.setCountry("");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test1929() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1929");
        User user0 = new User();
        user0.setPassword("hi!");
        user0.setPassword("");
        java.lang.String str5 = user0.getPassword();
        user0.setFirstName("");
        java.lang.String str8 = user0.getUsername();
        java.lang.String str9 = user0.getPassword();
        java.lang.String str10 = user0.getFirstName();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test1930() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1930");
        User user0 = new User();
        user0.setPassword("hi!");
        user0.setPassword("");
        user0.setPassword("");
        java.lang.String str7 = user0.getCountry();
        user0.setPassword("hi!");
        user0.setCountry("hi!");
        user0.setFirstName("hi!");
        user0.setCountry("");
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test1931() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1931");
        User user0 = new User();
        java.lang.String str1 = user0.getFirstName();
        java.lang.String str2 = user0.getCountry();
        java.lang.String str3 = user0.getFirstName();
        user0.setUsername("hi!");
        user0.setPassword("hi!");
        user0.setCountry("hi!");
        java.lang.String str10 = user0.getEmail();
        java.lang.String str11 = user0.getFirstName();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test1932() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1932");
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
        user0.setUsername("");
        java.lang.String str15 = user0.getCountry();
        user0.setPassword("");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
    }

    @Test
    public void test1933() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1933");
        User user0 = new User();
        java.lang.String str1 = user0.getFirstName();
        user0.setPassword("");
        user0.setEmail("hi!");
        user0.setCountry("");
        user0.setDob("hi!");
        user0.setUsername("hi!");
        user0.setEmail("");
        org.junit.Assert.assertNull(str1);
    }

    @Test
    public void test1934() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1934");
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
        java.lang.String str16 = user0.getPassword();
        java.lang.String str17 = user0.getUsername();
        user0.setFirstName("");
        java.lang.String str20 = user0.getCountry();
        user0.setEmail("");
        java.lang.String str23 = user0.getDob();
        user0.setFirstName("");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
    }

    @Test
    public void test1935() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1935");
        User user0 = new User();
        java.lang.String str1 = user0.getPassword();
        user0.setCountry("hi!");
        java.lang.String str4 = user0.getPassword();
        java.lang.String str5 = user0.getDob();
        java.lang.String str6 = user0.getCountry();
        java.lang.String str7 = user0.getUsername();
        user0.setUsername("");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test1936() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1936");
        User user0 = new User();
        user0.setPassword("hi!");
        user0.setPassword("");
        java.lang.String str5 = user0.getDob();
        user0.setEmail("");
        user0.setUsername("");
        user0.setFirstName("hi!");
        java.lang.String str12 = user0.getPassword();
        user0.setPassword("");
        java.lang.String str15 = user0.getDob();
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNull(str15);
    }

    @Test
    public void test1937() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1937");
        User user0 = new User();
        java.lang.String str1 = user0.getPassword();
        java.lang.String str2 = user0.getPassword();
        java.lang.String str3 = user0.getPassword();
        java.lang.String str4 = user0.getDob();
        user0.setUsername("");
        java.lang.String str7 = user0.getCountry();
        java.lang.Class<?> wildcardClass8 = user0.getClass();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test1938() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1938");
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
        user0.setPassword("hi!");
        user0.setEmail("hi!");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
    }

    @Test
    public void test1939() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1939");
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
        java.lang.String str17 = user0.getFirstName();
        java.lang.String str18 = user0.getPassword();
        java.lang.String str19 = user0.getEmail();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertNull(str19);
    }

    @Test
    public void test1940() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1940");
        User user0 = new User();
        user0.setPassword("hi!");
        java.lang.String str3 = user0.getPassword();
        java.lang.String str4 = user0.getFirstName();
        java.lang.String str5 = user0.getPassword();
        java.lang.String str6 = user0.getFirstName();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test1941() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1941");
        User user0 = new User();
        java.lang.String str1 = user0.getPassword();
        user0.setUsername("");
        java.lang.String str4 = user0.getCountry();
        java.lang.String str5 = user0.getCountry();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
    }

    @Test
    public void test1942() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1942");
        User user0 = new User();
        user0.setPassword("hi!");
        user0.setPassword("");
        java.lang.String str5 = user0.getDob();
        user0.setEmail("");
        user0.setUsername("");
        user0.setPassword("");
        java.lang.String str12 = user0.getLastName();
        java.lang.String str13 = user0.getDob();
        user0.setLastName("");
        user0.setFirstName("hi!");
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str13);
    }

    @Test
    public void test1943() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1943");
        User user0 = new User();
        java.lang.String str1 = user0.getPassword();
        user0.setCountry("hi!");
        user0.setUsername("hi!");
        user0.setPassword("");
        user0.setCountry("hi!");
        user0.setEmail("");
        java.lang.String str12 = user0.getUsername();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
    }

    @Test
    public void test1944() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1944");
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
        java.lang.String str17 = user0.getCountry();
        java.lang.String str18 = user0.getLastName();
        user0.setPassword("hi!");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
    }

    @Test
    public void test1945() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1945");
        User user0 = new User();
        java.lang.String str1 = user0.getPassword();
        user0.setUsername("hi!");
        user0.setCountry("hi!");
        user0.setFirstName("");
        user0.setCountry("");
        java.lang.String str10 = user0.getPassword();
        java.lang.String str11 = user0.getPassword();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test1946() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1946");
        User user0 = new User();
        user0.setPassword("hi!");
        user0.setPassword("");
        java.lang.String str5 = user0.getPassword();
        java.lang.String str6 = user0.getDob();
        java.lang.String str7 = user0.getDob();
        user0.setLastName("");
        java.lang.String str10 = user0.getFirstName();
        java.lang.String str11 = user0.getEmail();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test1947() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1947");
        User user0 = new User();
        user0.setPassword("hi!");
        user0.setPassword("");
        java.lang.String str5 = user0.getDob();
        user0.setEmail("");
        user0.setUsername("");
        user0.setEmail("hi!");
        user0.setCountry("hi!");
        org.junit.Assert.assertNull(str5);
    }

    @Test
    public void test1948() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1948");
        User user0 = new User();
        java.lang.String str1 = user0.getPassword();
        java.lang.String str2 = user0.getUsername();
        java.lang.String str3 = user0.getEmail();
        user0.setUsername("");
        java.lang.String str6 = user0.getFirstName();
        java.lang.String str7 = user0.getUsername();
        java.lang.String str8 = user0.getCountry();
        java.lang.String str9 = user0.getFirstName();
        java.lang.String str10 = user0.getEmail();
        user0.setFirstName("");
        user0.setUsername("");
        java.lang.String str15 = user0.getUsername();
        user0.setUsername("hi!");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
    }

    @Test
    public void test1949() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1949");
        User user0 = new User();
        java.lang.String str1 = user0.getFirstName();
        java.lang.String str2 = user0.getCountry();
        user0.setFirstName("");
        java.lang.String str5 = user0.getFirstName();
        java.lang.String str6 = user0.getDob();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test1950() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1950");
        User user0 = new User();
        java.lang.String str1 = user0.getPassword();
        java.lang.String str2 = user0.getUsername();
        java.lang.String str3 = user0.getEmail();
        java.lang.String str4 = user0.getLastName();
        java.lang.String str5 = user0.getEmail();
        java.lang.String str6 = user0.getUsername();
        user0.setEmail("");
        java.lang.Class<?> wildcardClass9 = user0.getClass();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test1951() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1951");
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
        user0.setFirstName("");
        java.lang.String str17 = user0.getPassword();
        java.lang.String str18 = user0.getUsername();
        java.lang.String str19 = user0.getDob();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
    }

    @Test
    public void test1952() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1952");
        User user0 = new User();
        java.lang.String str1 = user0.getPassword();
        java.lang.String str2 = user0.getUsername();
        java.lang.String str3 = user0.getEmail();
        user0.setFirstName("");
        user0.setLastName("hi!");
        user0.setUsername("hi!");
        user0.setDob("");
        java.lang.String str12 = user0.getLastName();
        java.lang.String str13 = user0.getPassword();
        user0.setPassword("");
        java.lang.String str16 = user0.getDob();
        user0.setLastName("");
        user0.setPassword("hi!");
        java.lang.String str21 = user0.getPassword();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!" + "'", str21, "hi!");
    }

    @Test
    public void test1953() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1953");
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
        user0.setFirstName("hi!");
        java.lang.String str19 = user0.getPassword();
        user0.setFirstName("");
        user0.setEmail("");
        user0.setLastName("");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertNull(str19);
    }

    @Test
    public void test1954() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1954");
        User user0 = new User();
        java.lang.String str1 = user0.getPassword();
        user0.setUsername("hi!");
        user0.setCountry("hi!");
        java.lang.String str6 = user0.getLastName();
        user0.setLastName("");
        java.lang.String str9 = user0.getUsername();
        user0.setFirstName("hi!");
        user0.setUsername("");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
    }

    @Test
    public void test1955() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1955");
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
        user0.setEmail("hi!");
        java.lang.String str23 = user0.getFirstName();
        java.lang.String str24 = user0.getEmail();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "hi!" + "'", str24, "hi!");
    }

    @Test
    public void test1956() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1956");
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
        user0.setPassword("hi!");
        java.lang.String str16 = user0.getEmail();
        user0.setFirstName("hi!");
        java.lang.String str19 = user0.getUsername();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNull(str19);
    }

    @Test
    public void test1957() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1957");
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
        user0.setLastName("");
        user0.setFirstName("");
        user0.setLastName("");
        user0.setPassword("hi!");
        user0.setEmail("hi!");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str14);
    }

    @Test
    public void test1958() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1958");
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
        java.lang.String str17 = user0.getUsername();
        user0.setCountry("");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(str17);
    }

    @Test
    public void test1959() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1959");
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
        user0.setCountry("hi!");
        user0.setLastName("");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test1960() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1960");
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
        user0.setUsername("hi!");
        java.lang.Class<?> wildcardClass18 = user0.getClass();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test1961() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1961");
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
        user0.setDob("");
        java.lang.String str17 = user0.getCountry();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
    }

    @Test
    public void test1962() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1962");
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
        user0.setFirstName("");
        java.lang.String str17 = user0.getCountry();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(str17);
    }

    @Test
    public void test1963() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1963");
        User user0 = new User();
        java.lang.String str1 = user0.getPassword();
        java.lang.String str2 = user0.getUsername();
        java.lang.String str3 = user0.getEmail();
        user0.setUsername("");
        java.lang.String str6 = user0.getPassword();
        java.lang.String str7 = user0.getDob();
        user0.setLastName("hi!");
        user0.setDob("");
        java.lang.String str12 = user0.getFirstName();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test1964() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1964");
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
        java.lang.String str16 = user0.getFirstName();
        user0.setPassword("");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertNull(str16);
    }

    @Test
    public void test1965() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1965");
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
        user0.setPassword("");
        user0.setLastName("hi!");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str13);
    }

    @Test
    public void test1966() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1966");
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
        user0.setPassword("hi!");
        java.lang.String str19 = user0.getDob();
        java.lang.String str20 = user0.getPassword();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
    }

    @Test
    public void test1967() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1967");
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
        user0.setEmail("");
        java.lang.String str19 = user0.getEmail();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
    }

    @Test
    public void test1968() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1968");
        User user0 = new User();
        java.lang.String str1 = user0.getPassword();
        user0.setUsername("hi!");
        user0.setCountry("hi!");
        user0.setFirstName("");
        user0.setCountry("");
        java.lang.String str10 = user0.getLastName();
        user0.setCountry("hi!");
        java.lang.String str13 = user0.getFirstName();
        user0.setPassword("hi!");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test1969() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1969");
        User user0 = new User();
        java.lang.String str1 = user0.getFirstName();
        user0.setPassword("");
        user0.setEmail("hi!");
        user0.setCountry("");
        user0.setDob("hi!");
        user0.setCountry("hi!");
        java.lang.String str12 = user0.getLastName();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test1970() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1970");
        User user0 = new User();
        java.lang.String str1 = user0.getPassword();
        java.lang.String str2 = user0.getPassword();
        user0.setUsername("");
        java.lang.String str5 = user0.getCountry();
        user0.setLastName("");
        user0.setUsername("");
        java.lang.String str10 = user0.getUsername();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test1971() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1971");
        User user0 = new User();
        java.lang.String str1 = user0.getPassword();
        java.lang.String str2 = user0.getPassword();
        java.lang.String str3 = user0.getFirstName();
        user0.setDob("hi!");
        java.lang.String str6 = user0.getEmail();
        user0.setPassword("hi!");
        user0.setCountry("");
        user0.setLastName("hi!");
        user0.setPassword("hi!");
        java.lang.String str15 = user0.getCountry();
        user0.setPassword("hi!");
        java.lang.String str18 = user0.getLastName();
        user0.setFirstName("");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
    }

    @Test
    public void test1972() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1972");
        User user0 = new User();
        user0.setPassword("hi!");
        user0.setPassword("");
        java.lang.String str5 = user0.getPassword();
        user0.setFirstName("");
        user0.setFirstName("");
        user0.setUsername("");
        user0.setLastName("hi!");
        java.lang.Class<?> wildcardClass14 = user0.getClass();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test1973() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1973");
        User user0 = new User();
        java.lang.String str1 = user0.getPassword();
        user0.setCountry("hi!");
        java.lang.String str4 = user0.getFirstName();
        java.lang.String str5 = user0.getFirstName();
        java.lang.String str6 = user0.getLastName();
        user0.setFirstName("hi!");
        java.lang.String str9 = user0.getEmail();
        user0.setCountry("");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test1974() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1974");
        User user0 = new User();
        user0.setPassword("hi!");
        user0.setPassword("");
        java.lang.String str5 = user0.getPassword();
        user0.setCountry("hi!");
        java.lang.String str8 = user0.getPassword();
        java.lang.String str9 = user0.getDob();
        user0.setUsername("hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test1975() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1975");
        User user0 = new User();
        java.lang.String str1 = user0.getPassword();
        user0.setCountry("hi!");
        java.lang.String str4 = user0.getFirstName();
        user0.setLastName("hi!");
        user0.setDob("hi!");
        java.lang.String str9 = user0.getFirstName();
        java.lang.String str10 = user0.getDob();
        user0.setFirstName("hi!");
        java.lang.String str13 = user0.getCountry();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
    }

    @Test
    public void test1976() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1976");
        User user0 = new User();
        java.lang.String str1 = user0.getPassword();
        user0.setUsername("hi!");
        user0.setCountry("hi!");
        java.lang.String str6 = user0.getLastName();
        user0.setUsername("");
        java.lang.String str9 = user0.getLastName();
        user0.setPassword("hi!");
        java.lang.String str12 = user0.getDob();
        java.lang.String str13 = user0.getFirstName();
        user0.setEmail("");
        java.lang.String str16 = user0.getEmail();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
    }

    @Test
    public void test1977() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1977");
        User user0 = new User();
        java.lang.String str1 = user0.getPassword();
        user0.setUsername("hi!");
        user0.setFirstName("");
        java.lang.String str6 = user0.getPassword();
        user0.setLastName("");
        java.lang.String str9 = user0.getDob();
        java.lang.String str10 = user0.getEmail();
        java.lang.String str11 = user0.getPassword();
        java.lang.String str12 = user0.getFirstName();
        user0.setUsername("hi!");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test1978() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1978");
        User user0 = new User();
        user0.setPassword("hi!");
        user0.setPassword("");
        java.lang.String str5 = user0.getPassword();
        user0.setFirstName("");
        user0.setLastName("");
        user0.setPassword("hi!");
        user0.setUsername("");
        java.lang.String str14 = user0.getUsername();
        user0.setEmail("");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test1979() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1979");
        User user0 = new User();
        java.lang.String str1 = user0.getPassword();
        java.lang.String str2 = user0.getPassword();
        java.lang.String str3 = user0.getPassword();
        user0.setLastName("");
        user0.setUsername("hi!");
        user0.setUsername("");
        user0.setFirstName("");
        user0.setUsername("");
        user0.setCountry("");
        java.lang.Class<?> wildcardClass16 = user0.getClass();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test1980() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1980");
        User user0 = new User();
        java.lang.String str1 = user0.getPassword();
        user0.setCountry("hi!");
        java.lang.String str4 = user0.getFirstName();
        java.lang.String str5 = user0.getDob();
        java.lang.String str6 = user0.getLastName();
        user0.setFirstName("hi!");
        user0.setEmail("hi!");
        user0.setPassword("hi!");
        user0.setCountry("");
        java.lang.String str15 = user0.getFirstName();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
    }

    @Test
    public void test1981() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1981");
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
        java.lang.String str17 = user0.getPassword();
        user0.setFirstName("hi!");
        java.lang.String str20 = user0.getFirstName();
        java.lang.String str21 = user0.getCountry();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
    }

    @Test
    public void test1982() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1982");
        User user0 = new User();
        java.lang.String str1 = user0.getPassword();
        java.lang.String str2 = user0.getUsername();
        java.lang.String str3 = user0.getCountry();
        java.lang.String str4 = user0.getPassword();
        java.lang.String str5 = user0.getUsername();
        user0.setEmail("");
        java.lang.String str8 = user0.getPassword();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test1983() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1983");
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
        java.lang.String str15 = user0.getUsername();
        java.lang.String str16 = user0.getEmail();
        java.lang.String str17 = user0.getEmail();
        user0.setUsername("");
        user0.setFirstName("hi!");
        java.lang.Class<?> wildcardClass22 = user0.getClass();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test1984() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1984");
        User user0 = new User();
        java.lang.String str1 = user0.getPassword();
        user0.setUsername("");
        user0.setFirstName("hi!");
        java.lang.String str6 = user0.getCountry();
        user0.setUsername("hi!");
        java.lang.String str9 = user0.getCountry();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test1985() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1985");
        User user0 = new User();
        java.lang.String str1 = user0.getPassword();
        user0.setUsername("hi!");
        user0.setCountry("hi!");
        java.lang.String str6 = user0.getCountry();
        java.lang.String str7 = user0.getLastName();
        java.lang.String str8 = user0.getEmail();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test1986() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1986");
        User user0 = new User();
        user0.setPassword("hi!");
        java.lang.String str3 = user0.getPassword();
        java.lang.String str4 = user0.getFirstName();
        java.lang.String str5 = user0.getLastName();
        user0.setCountry("");
        user0.setCountry("");
        user0.setPassword("hi!");
        user0.setPassword("hi!");
        java.lang.String str14 = user0.getUsername();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str14);
    }

    @Test
    public void test1987() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1987");
        User user0 = new User();
        java.lang.String str1 = user0.getPassword();
        user0.setCountry("hi!");
        java.lang.String str4 = user0.getPassword();
        java.lang.String str5 = user0.getPassword();
        java.lang.String str6 = user0.getEmail();
        java.lang.String str7 = user0.getUsername();
        user0.setDob("hi!");
        user0.setLastName("hi!");
        java.lang.String str12 = user0.getDob();
        user0.setUsername("hi!");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
    }

    @Test
    public void test1988() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1988");
        User user0 = new User();
        user0.setPassword("hi!");
        user0.setPassword("");
        java.lang.String str5 = user0.getDob();
        user0.setEmail("");
        user0.setUsername("");
        java.lang.String str10 = user0.getFirstName();
        java.lang.String str11 = user0.getDob();
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test1989() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1989");
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
        user0.setPassword("");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
    }

    @Test
    public void test1990() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1990");
        User user0 = new User();
        java.lang.String str1 = user0.getPassword();
        user0.setCountry("hi!");
        java.lang.String str4 = user0.getFirstName();
        user0.setLastName("hi!");
        user0.setDob("hi!");
        java.lang.String str9 = user0.getFirstName();
        user0.setPassword("");
        java.lang.String str12 = user0.getCountry();
        java.lang.String str13 = user0.getCountry();
        user0.setCountry("hi!");
        java.lang.String str16 = user0.getCountry();
        java.lang.String str17 = user0.getDob();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
    }

    @Test
    public void test1991() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1991");
        User user0 = new User();
        user0.setPassword("hi!");
        user0.setPassword("");
        java.lang.String str5 = user0.getPassword();
        java.lang.String str6 = user0.getEmail();
        user0.setFirstName("hi!");
        user0.setFirstName("hi!");
        java.lang.String str11 = user0.getUsername();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test1992() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1992");
        User user0 = new User();
        java.lang.String str1 = user0.getPassword();
        java.lang.String str2 = user0.getUsername();
        java.lang.String str3 = user0.getEmail();
        user0.setUsername("");
        java.lang.String str6 = user0.getFirstName();
        java.lang.String str7 = user0.getUsername();
        user0.setPassword("");
        user0.setDob("");
        java.lang.String str12 = user0.getFirstName();
        java.lang.String str13 = user0.getLastName();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str13);
    }

    @Test
    public void test1993() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1993");
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
        java.lang.String str20 = user0.getLastName();
        java.lang.String str21 = user0.getLastName();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!" + "'", str21, "hi!");
    }

    @Test
    public void test1994() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1994");
        User user0 = new User();
        java.lang.String str1 = user0.getPassword();
        java.lang.String str2 = user0.getUsername();
        user0.setDob("");
        java.lang.String str5 = user0.getLastName();
        user0.setUsername("hi!");
        user0.setLastName("hi!");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str5);
    }

    @Test
    public void test1995() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1995");
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
        java.lang.String str14 = user0.getDob();
        java.lang.String str15 = user0.getEmail();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(str15);
    }

    @Test
    public void test1996() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1996");
        User user0 = new User();
        java.lang.String str1 = user0.getPassword();
        user0.setUsername("");
        user0.setLastName("");
        java.lang.String str6 = user0.getFirstName();
        user0.setEmail("");
        user0.setUsername("");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test1997() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1997");
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
        java.lang.String str13 = user0.getCountry();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str13);
    }

    @Test
    public void test1998() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1998");
        User user0 = new User();
        java.lang.String str1 = user0.getPassword();
        user0.setCountry("hi!");
        java.lang.String str4 = user0.getUsername();
        java.lang.String str5 = user0.getPassword();
        user0.setDob("");
        user0.setDob("");
        java.lang.String str10 = user0.getPassword();
        java.lang.Class<?> wildcardClass11 = user0.getClass();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test1999() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1999");
        User user0 = new User();
        java.lang.String str1 = user0.getPassword();
        user0.setUsername("hi!");
        user0.setFirstName("");
        java.lang.String str6 = user0.getPassword();
        user0.setLastName("");
        java.lang.String str9 = user0.getDob();
        java.lang.String str10 = user0.getUsername();
        user0.setEmail("");
        java.lang.String str13 = user0.getCountry();
        user0.setUsername("");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNull(str13);
    }

    @Test
    public void test2000() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test2000");
        User user0 = new User();
        java.lang.String str1 = user0.getFirstName();
        user0.setPassword("");
        java.lang.String str4 = user0.getUsername();
        user0.setLastName("");
        user0.setFirstName("");
        java.lang.String str9 = user0.getEmail();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str9);
    }
}

