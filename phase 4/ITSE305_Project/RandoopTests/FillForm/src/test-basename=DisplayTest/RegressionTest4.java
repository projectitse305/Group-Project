import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest4 {

    public static boolean debug = false;

    @Test
    public void test2001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2001");
        User user0 = new User();
        user0.setPassword("hi!");
        user0.setPassword("");
        java.lang.String str5 = user0.getDob();
        user0.setEmail("");
        user0.setUsername("");
        user0.setFirstName("hi!");
        java.lang.String str12 = user0.getPassword();
        java.lang.String str13 = user0.getCountry();
        java.lang.String str14 = user0.getDob();
        java.lang.String str15 = user0.getDob();
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(str15);
    }

    @Test
    public void test2002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2002");
        User user0 = new User();
        java.lang.String str1 = user0.getPassword();
        user0.setCountry("hi!");
        java.lang.String str4 = user0.getPassword();
        java.lang.String str5 = user0.getPassword();
        java.lang.String str6 = user0.getFirstName();
        java.lang.String str7 = user0.getCountry();
        user0.setFirstName("hi!");
        user0.setDob("");
        user0.setUsername("hi!");
        java.lang.String str14 = user0.getUsername();
        user0.setLastName("");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
    }

    @Test
    public void test2003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2003");
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
        java.lang.String str22 = user0.getCountry();
        user0.setFirstName("hi!");
        java.lang.String str25 = user0.getDob();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "hi!" + "'", str25, "hi!");
    }

    @Test
    public void test2004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2004");
        User user0 = new User();
        java.lang.String str1 = user0.getPassword();
        java.lang.String str2 = user0.getPassword();
        user0.setLastName("hi!");
        java.lang.String str5 = user0.getCountry();
        user0.setFirstName("");
        user0.setDob("hi!");
        java.lang.String str10 = user0.getEmail();
        java.lang.String str11 = user0.getDob();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
    }

    @Test
    public void test2005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2005");
        User user0 = new User();
        java.lang.String str1 = user0.getPassword();
        java.lang.String str2 = user0.getUsername();
        java.lang.String str3 = user0.getEmail();
        user0.setFirstName("");
        user0.setLastName("hi!");
        user0.setUsername("hi!");
        java.lang.String str10 = user0.getPassword();
        user0.setCountry("hi!");
        user0.setLastName("hi!");
        java.lang.String str15 = user0.getEmail();
        user0.setCountry("hi!");
        user0.setUsername("hi!");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str15);
    }

    @Test
    public void test2006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2006");
        User user0 = new User();
        java.lang.String str1 = user0.getPassword();
        user0.setCountry("hi!");
        java.lang.String str4 = user0.getFirstName();
        user0.setLastName("hi!");
        java.lang.String str7 = user0.getLastName();
        java.lang.String str8 = user0.getDob();
        java.lang.String str9 = user0.getPassword();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test2007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2007");
        User user0 = new User();
        java.lang.String str1 = user0.getPassword();
        user0.setCountry("hi!");
        java.lang.String str4 = user0.getFirstName();
        user0.setLastName("hi!");
        java.lang.String str7 = user0.getFirstName();
        java.lang.String str8 = user0.getFirstName();
        java.lang.String str9 = user0.getLastName();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
    }

    @Test
    public void test2008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2008");
        User user0 = new User();
        java.lang.String str1 = user0.getPassword();
        java.lang.String str2 = user0.getPassword();
        user0.setLastName("hi!");
        user0.setLastName("hi!");
        user0.setFirstName("");
        user0.setEmail("");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
    }

    @Test
    public void test2009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2009");
        User user0 = new User();
        java.lang.String str1 = user0.getPassword();
        user0.setCountry("hi!");
        java.lang.String str4 = user0.getFirstName();
        java.lang.String str5 = user0.getDob();
        java.lang.String str6 = user0.getEmail();
        java.lang.String str7 = user0.getEmail();
        java.lang.String str8 = user0.getEmail();
        user0.setCountry("hi!");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test2010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2010");
        User user0 = new User();
        java.lang.String str1 = user0.getPassword();
        java.lang.String str2 = user0.getPassword();
        java.lang.String str3 = user0.getFirstName();
        user0.setDob("hi!");
        java.lang.String str6 = user0.getEmail();
        java.lang.String str7 = user0.getFirstName();
        java.lang.String str8 = user0.getFirstName();
        user0.setLastName("");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test2011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2011");
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
        user0.setUsername("hi!");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
    }

    @Test
    public void test2012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2012");
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
        java.lang.String str21 = user0.getDob();
        java.lang.String str22 = user0.getPassword();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertNull(str22);
    }

    @Test
    public void test2013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2013");
        User user0 = new User();
        java.lang.String str1 = user0.getPassword();
        user0.setCountry("hi!");
        java.lang.String str4 = user0.getPassword();
        java.lang.String str5 = user0.getDob();
        user0.setCountry("");
        user0.setLastName("");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
    }

    @Test
    public void test2014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2014");
        User user0 = new User();
        java.lang.String str1 = user0.getPassword();
        user0.setCountry("hi!");
        java.lang.String str4 = user0.getPassword();
        java.lang.String str5 = user0.getDob();
        user0.setCountry("hi!");
        java.lang.String str8 = user0.getCountry();
        java.lang.String str9 = user0.getUsername();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test2015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2015");
        User user0 = new User();
        java.lang.String str1 = user0.getPassword();
        user0.setUsername("hi!");
        user0.setFirstName("");
        java.lang.String str6 = user0.getPassword();
        user0.setFirstName("");
        java.lang.String str9 = user0.getEmail();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test2016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2016");
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
        user0.setFirstName("");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
    }

    @Test
    public void test2017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2017");
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
        java.lang.String str16 = user0.getPassword();
        java.lang.String str17 = user0.getPassword();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNull(str17);
    }

    @Test
    public void test2018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2018");
        User user0 = new User();
        java.lang.String str1 = user0.getPassword();
        user0.setCountry("hi!");
        java.lang.String str4 = user0.getFirstName();
        java.lang.String str5 = user0.getFirstName();
        java.lang.String str6 = user0.getLastName();
        java.lang.String str7 = user0.getLastName();
        user0.setCountry("hi!");
        java.lang.String str10 = user0.getFirstName();
        java.lang.String str11 = user0.getDob();
        java.lang.String str12 = user0.getDob();
        user0.setEmail("hi!");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test2019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2019");
        User user0 = new User();
        java.lang.String str1 = user0.getPassword();
        user0.setUsername("hi!");
        user0.setFirstName("");
        java.lang.String str6 = user0.getPassword();
        user0.setLastName("");
        java.lang.String str9 = user0.getDob();
        java.lang.String str10 = user0.getEmail();
        java.lang.String str11 = user0.getUsername();
        user0.setUsername("hi!");
        java.lang.String str14 = user0.getFirstName();
        user0.setDob("hi!");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test2020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2020");
        User user0 = new User();
        java.lang.String str1 = user0.getPassword();
        java.lang.String str2 = user0.getPassword();
        java.lang.String str3 = user0.getFirstName();
        user0.setDob("hi!");
        java.lang.String str6 = user0.getEmail();
        user0.setPassword("hi!");
        user0.setDob("");
        java.lang.String str11 = user0.getFirstName();
        user0.setFirstName("hi!");
        user0.setFirstName("hi!");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test2021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2021");
        User user0 = new User();
        java.lang.String str1 = user0.getPassword();
        java.lang.String str2 = user0.getUsername();
        java.lang.String str3 = user0.getEmail();
        user0.setUsername("");
        user0.setPassword("hi!");
        java.lang.String str8 = user0.getLastName();
        user0.setPassword("hi!");
        java.lang.String str11 = user0.getDob();
        user0.setEmail("");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test2022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2022");
        User user0 = new User();
        java.lang.String str1 = user0.getFirstName();
        user0.setPassword("");
        user0.setEmail("hi!");
        user0.setPassword("hi!");
        java.lang.String str8 = user0.getPassword();
        user0.setPassword("");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
    }

    @Test
    public void test2023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2023");
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
        user0.setEmail("hi!");
        java.lang.Class<?> wildcardClass17 = user0.getClass();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test2024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2024");
        User user0 = new User();
        java.lang.String str1 = user0.getPassword();
        user0.setUsername("hi!");
        user0.setCountry("hi!");
        user0.setFirstName("");
        user0.setCountry("");
        java.lang.String str10 = user0.getPassword();
        user0.setUsername("hi!");
        user0.setCountry("hi!");
        user0.setPassword("");
        user0.setEmail("");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test2025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2025");
        User user0 = new User();
        java.lang.String str1 = user0.getPassword();
        user0.setCountry("hi!");
        java.lang.String str4 = user0.getFirstName();
        user0.setLastName("hi!");
        user0.setDob("hi!");
        java.lang.String str9 = user0.getFirstName();
        java.lang.String str10 = user0.getDob();
        user0.setFirstName("hi!");
        user0.setEmail("hi!");
        java.lang.String str15 = user0.getFirstName();
        java.lang.String str16 = user0.getCountry();
        java.lang.String str17 = user0.getLastName();
        user0.setUsername("");
        java.lang.String str20 = user0.getPassword();
        user0.setDob("");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertNull(str20);
    }

    @Test
    public void test2026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2026");
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
        user0.setUsername("");
        java.lang.String str18 = user0.getCountry();
        java.lang.String str19 = user0.getUsername();
        user0.setEmail("hi!");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
    }

    @Test
    public void test2027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2027");
        User user0 = new User();
        java.lang.String str1 = user0.getPassword();
        user0.setCountry("hi!");
        java.lang.String str4 = user0.getFirstName();
        java.lang.String str5 = user0.getDob();
        java.lang.String str6 = user0.getEmail();
        java.lang.String str7 = user0.getEmail();
        java.lang.String str8 = user0.getEmail();
        java.lang.String str9 = user0.getLastName();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test2028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2028");
        User user0 = new User();
        java.lang.String str1 = user0.getPassword();
        user0.setCountry("hi!");
        java.lang.String str4 = user0.getFirstName();
        java.lang.String str5 = user0.getFirstName();
        java.lang.String str6 = user0.getPassword();
        user0.setPassword("");
        user0.setLastName("hi!");
        user0.setUsername("");
        user0.setLastName("hi!");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test2029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2029");
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
        java.lang.String str21 = user0.getLastName();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str21);
    }

    @Test
    public void test2030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2030");
        User user0 = new User();
        user0.setPassword("hi!");
        user0.setPassword("");
        java.lang.String str5 = user0.getDob();
        user0.setEmail("");
        user0.setUsername("");
        java.lang.String str10 = user0.getFirstName();
        user0.setUsername("");
        java.lang.String str13 = user0.getDob();
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str13);
    }

    @Test
    public void test2031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2031");
        User user0 = new User();
        java.lang.String str1 = user0.getPassword();
        java.lang.String str2 = user0.getUsername();
        java.lang.String str3 = user0.getEmail();
        user0.setFirstName("");
        user0.setUsername("");
        java.lang.String str8 = user0.getFirstName();
        user0.setFirstName("hi!");
        user0.setFirstName("hi!");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test2032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2032");
        User user0 = new User();
        java.lang.String str1 = user0.getPassword();
        user0.setCountry("hi!");
        java.lang.String str4 = user0.getUsername();
        user0.setPassword("");
        user0.setFirstName("");
        java.lang.String str9 = user0.getLastName();
        user0.setCountry("");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test2033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2033");
        User user0 = new User();
        user0.setUsername("");
        java.lang.String str3 = user0.getDob();
        java.lang.String str4 = user0.getCountry();
        user0.setDob("");
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
    }

    @Test
    public void test2034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2034");
        User user0 = new User();
        java.lang.String str1 = user0.getPassword();
        java.lang.String str2 = user0.getUsername();
        java.lang.String str3 = user0.getEmail();
        user0.setUsername("");
        java.lang.String str6 = user0.getFirstName();
        user0.setLastName("");
        java.lang.String str9 = user0.getLastName();
        user0.setDob("");
        user0.setDob("");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test2035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2035");
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
        java.lang.String str18 = user0.getPassword();
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
    }

    @Test
    public void test2036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2036");
        User user0 = new User();
        java.lang.String str1 = user0.getPassword();
        user0.setCountry("hi!");
        java.lang.String str4 = user0.getPassword();
        java.lang.String str5 = user0.getDob();
        java.lang.String str6 = user0.getEmail();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test2037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2037");
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
        java.lang.String str14 = user0.getLastName();
        java.lang.String str15 = user0.getPassword();
        java.lang.String str16 = user0.getUsername();
        java.lang.String str17 = user0.getDob();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
    }

    @Test
    public void test2038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2038");
        User user0 = new User();
        java.lang.String str1 = user0.getPassword();
        java.lang.String str2 = user0.getPassword();
        java.lang.String str3 = user0.getPassword();
        java.lang.String str4 = user0.getDob();
        user0.setFirstName("hi!");
        user0.setCountry("hi!");
        java.lang.String str9 = user0.getFirstName();
        user0.setUsername("");
        user0.setFirstName("");
        java.lang.String str14 = user0.getDob();
        java.lang.String str15 = user0.getEmail();
        user0.setCountry("hi!");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(str15);
    }

    @Test
    public void test2039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2039");
        User user0 = new User();
        java.lang.String str1 = user0.getPassword();
        java.lang.String str2 = user0.getUsername();
        java.lang.String str3 = user0.getEmail();
        user0.setUsername("");
        user0.setDob("hi!");
        user0.setUsername("");
        java.lang.String str10 = user0.getUsername();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test2040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2040");
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
        user0.setEmail("");
        user0.setFirstName("hi!");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
    }

    @Test
    public void test2041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2041");
        User user0 = new User();
        java.lang.String str1 = user0.getFirstName();
        java.lang.String str2 = user0.getCountry();
        user0.setFirstName("");
        user0.setUsername("");
        java.lang.String str7 = user0.getDob();
        java.lang.String str8 = user0.getFirstName();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test2042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2042");
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
        user0.setDob("");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test2043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2043");
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
        user0.setPassword("hi!");
        java.lang.String str18 = user0.getUsername();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
    }

    @Test
    public void test2044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2044");
        User user0 = new User();
        java.lang.String str1 = user0.getPassword();
        java.lang.String str2 = user0.getUsername();
        java.lang.String str3 = user0.getEmail();
        java.lang.String str4 = user0.getLastName();
        user0.setUsername("hi!");
        user0.setCountry("");
        user0.setDob("hi!");
        java.lang.Class<?> wildcardClass11 = user0.getClass();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test2045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2045");
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
        java.lang.String str16 = user0.getEmail();
        java.lang.String str17 = user0.getFirstName();
        user0.setPassword("");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertNull(str17);
    }

    @Test
    public void test2046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2046");
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
        java.lang.String str17 = user0.getCountry();
        java.lang.String str18 = user0.getDob();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertNull(str18);
    }

    @Test
    public void test2047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2047");
        User user0 = new User();
        user0.setPassword("hi!");
        user0.setPassword("");
        user0.setUsername("");
        user0.setFirstName("");
        user0.setEmail("");
        java.lang.String str11 = user0.getDob();
        user0.setPassword("");
        user0.setCountry("hi!");
        user0.setDob("");
        user0.setFirstName("hi!");
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test2048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2048");
        User user0 = new User();
        java.lang.String str1 = user0.getPassword();
        user0.setCountry("hi!");
        java.lang.String str4 = user0.getPassword();
        java.lang.String str5 = user0.getPassword();
        java.lang.String str6 = user0.getFirstName();
        java.lang.String str7 = user0.getCountry();
        user0.setFirstName("");
        java.lang.String str10 = user0.getFirstName();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test2049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2049");
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
        user0.setPassword("hi!");
        java.lang.String str16 = user0.getFirstName();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertNull(str16);
    }

    @Test
    public void test2050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2050");
        User user0 = new User();
        java.lang.String str1 = user0.getPassword();
        java.lang.String str2 = user0.getUsername();
        java.lang.String str3 = user0.getCountry();
        user0.setFirstName("hi!");
        java.lang.String str6 = user0.getEmail();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test2051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2051");
        User user0 = new User();
        java.lang.String str1 = user0.getPassword();
        java.lang.String str2 = user0.getUsername();
        java.lang.String str3 = user0.getEmail();
        user0.setFirstName("");
        java.lang.String str6 = user0.getCountry();
        java.lang.String str7 = user0.getLastName();
        user0.setPassword("");
        user0.setLastName("");
        user0.setDob("");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test2052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2052");
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
        user0.setEmail("");
        java.lang.String str19 = user0.getUsername();
        user0.setPassword("");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str19);
    }

    @Test
    public void test2053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2053");
        User user0 = new User();
        java.lang.String str1 = user0.getPassword();
        user0.setUsername("hi!");
        user0.setCountry("hi!");
        user0.setFirstName("");
        user0.setUsername("");
        java.lang.String str10 = user0.getLastName();
        java.lang.String str11 = user0.getLastName();
        user0.setUsername("");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test2054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2054");
        User user0 = new User();
        user0.setPassword("hi!");
        user0.setLastName("");
        java.lang.String str5 = user0.getCountry();
        java.lang.String str6 = user0.getUsername();
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test2055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2055");
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
        user0.setFirstName("");
        java.lang.Class<?> wildcardClass18 = user0.getClass();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test2056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2056");
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
        user0.setUsername("");
        user0.setEmail("");
        user0.setDob("");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str14);
    }

    @Test
    public void test2057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2057");
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
        user0.setEmail("hi!");
        java.lang.String str17 = user0.getFirstName();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
    }

    @Test
    public void test2058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2058");
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
        java.lang.String str13 = user0.getUsername();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test2059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2059");
        User user0 = new User();
        java.lang.String str1 = user0.getPassword();
        user0.setCountry("hi!");
        java.lang.String str4 = user0.getUsername();
        user0.setPassword("");
        user0.setFirstName("hi!");
        user0.setDob("hi!");
        user0.setCountry("hi!");
        user0.setLastName("");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str4);
    }

    @Test
    public void test2060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2060");
        User user0 = new User();
        java.lang.String str1 = user0.getPassword();
        user0.setCountry("hi!");
        java.lang.String str4 = user0.getFirstName();
        java.lang.String str5 = user0.getFirstName();
        java.lang.String str6 = user0.getPassword();
        user0.setCountry("");
        user0.setPassword("hi!");
        java.lang.String str11 = user0.getUsername();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test2061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2061");
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
        user0.setCountry("hi!");
        user0.setUsername("hi!");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test2062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2062");
        User user0 = new User();
        user0.setPassword("hi!");
        user0.setPassword("");
        java.lang.String str5 = user0.getPassword();
        user0.setFirstName("");
        user0.setLastName("");
        user0.setPassword("hi!");
        user0.setEmail("");
        user0.setEmail("");
        user0.setLastName("");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
    }

    @Test
    public void test2063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2063");
        User user0 = new User();
        java.lang.String str1 = user0.getPassword();
        user0.setCountry("hi!");
        java.lang.String str4 = user0.getFirstName();
        java.lang.String str5 = user0.getDob();
        java.lang.String str6 = user0.getLastName();
        user0.setFirstName("hi!");
        user0.setUsername("");
        java.lang.String str11 = user0.getPassword();
        user0.setFirstName("");
        java.lang.String str14 = user0.getUsername();
        java.lang.String str15 = user0.getFirstName();
        java.lang.String str16 = user0.getDob();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNull(str16);
    }

    @Test
    public void test2064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2064");
        User user0 = new User();
        user0.setLastName("");
        user0.setDob("hi!");
        user0.setCountry("");
        java.lang.String str7 = user0.getCountry();
        user0.setUsername("hi!");
        java.lang.String str10 = user0.getPassword();
        java.lang.String str11 = user0.getLastName();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test2065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2065");
        User user0 = new User();
        java.lang.String str1 = user0.getPassword();
        user0.setUsername("");
        user0.setFirstName("hi!");
        user0.setDob("");
        user0.setEmail("");
        user0.setDob("");
        user0.setUsername("");
        org.junit.Assert.assertNull(str1);
    }

    @Test
    public void test2066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2066");
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
        user0.setDob("");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertNull(str13);
    }

    @Test
    public void test2067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2067");
        User user0 = new User();
        java.lang.String str1 = user0.getPassword();
        java.lang.String str2 = user0.getUsername();
        java.lang.String str3 = user0.getEmail();
        user0.setUsername("");
        user0.setDob("hi!");
        java.lang.String str8 = user0.getCountry();
        java.lang.String str9 = user0.getDob();
        user0.setUsername("");
        user0.setCountry("hi!");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
    }

    @Test
    public void test2068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2068");
        User user0 = new User();
        java.lang.String str1 = user0.getPassword();
        user0.setCountry("hi!");
        user0.setLastName("");
        user0.setDob("");
        org.junit.Assert.assertNull(str1);
    }

    @Test
    public void test2069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2069");
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
        user0.setLastName("hi!");
        java.lang.String str18 = user0.getPassword();
        java.lang.String str19 = user0.getLastName();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
    }

    @Test
    public void test2070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2070");
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
        java.lang.String str17 = user0.getEmail();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(str17);
    }

    @Test
    public void test2071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2071");
        User user0 = new User();
        user0.setPassword("hi!");
        user0.setPassword("");
        java.lang.String str5 = user0.getDob();
        user0.setEmail("");
        user0.setUsername("");
        user0.setPassword("");
        java.lang.String str12 = user0.getLastName();
        java.lang.String str13 = user0.getDob();
        user0.setEmail("");
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str13);
    }

    @Test
    public void test2072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2072");
        User user0 = new User();
        java.lang.String str1 = user0.getPassword();
        user0.setUsername("hi!");
        user0.setCountry("hi!");
        java.lang.String str6 = user0.getEmail();
        user0.setPassword("hi!");
        user0.setDob("hi!");
        user0.setCountry("hi!");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test2073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2073");
        User user0 = new User();
        java.lang.String str1 = user0.getPassword();
        user0.setCountry("hi!");
        java.lang.String str4 = user0.getFirstName();
        user0.setLastName("hi!");
        user0.setDob("hi!");
        java.lang.String str9 = user0.getEmail();
        user0.setLastName("");
        java.lang.String str12 = user0.getDob();
        java.lang.String str13 = user0.getDob();
        java.lang.String str14 = user0.getFirstName();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertNull(str14);
    }

    @Test
    public void test2074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2074");
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
        user0.setUsername("");
        java.lang.String str18 = user0.getDob();
        user0.setCountry("hi!");
        user0.setFirstName("hi!");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
    }

    @Test
    public void test2075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2075");
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
        java.lang.String str16 = user0.getUsername();
        java.lang.String str17 = user0.getLastName();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNull(str17);
    }

    @Test
    public void test2076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2076");
        User user0 = new User();
        java.lang.String str1 = user0.getPassword();
        user0.setUsername("hi!");
        user0.setFirstName("");
        java.lang.String str6 = user0.getPassword();
        user0.setEmail("hi!");
        user0.setPassword("");
        java.lang.String str11 = user0.getPassword();
        user0.setPassword("");
        java.lang.String str14 = user0.getLastName();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNull(str14);
    }

    @Test
    public void test2077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2077");
        User user0 = new User();
        java.lang.String str1 = user0.getPassword();
        user0.setCountry("hi!");
        java.lang.String str4 = user0.getFirstName();
        java.lang.String str5 = user0.getDob();
        java.lang.String str6 = user0.getLastName();
        user0.setLastName("");
        user0.setEmail("");
        java.lang.String str11 = user0.getUsername();
        user0.setFirstName("");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test2078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2078");
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
        user0.setEmail("hi!");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertNull(str13);
    }

    @Test
    public void test2079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2079");
        User user0 = new User();
        java.lang.String str1 = user0.getPassword();
        user0.setCountry("hi!");
        java.lang.String str4 = user0.getPassword();
        java.lang.String str5 = user0.getPassword();
        java.lang.String str6 = user0.getFirstName();
        java.lang.String str7 = user0.getCountry();
        user0.setFirstName("hi!");
        user0.setDob("");
        user0.setUsername("hi!");
        user0.setFirstName("");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
    }

    @Test
    public void test2080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2080");
        User user0 = new User();
        java.lang.String str1 = user0.getPassword();
        java.lang.String str2 = user0.getUsername();
        java.lang.String str3 = user0.getEmail();
        user0.setFirstName("");
        user0.setLastName("hi!");
        java.lang.String str8 = user0.getFirstName();
        user0.setDob("");
        java.lang.String str11 = user0.getEmail();
        java.lang.String str12 = user0.getLastName();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
    }

    @Test
    public void test2081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2081");
        User user0 = new User();
        java.lang.String str1 = user0.getPassword();
        user0.setCountry("hi!");
        java.lang.String str4 = user0.getFirstName();
        user0.setLastName("hi!");
        user0.setDob("hi!");
        java.lang.String str9 = user0.getFirstName();
        user0.setCountry("");
        java.lang.String str12 = user0.getFirstName();
        user0.setDob("");
        java.lang.String str15 = user0.getPassword();
        user0.setFirstName("");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str15);
    }

    @Test
    public void test2082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2082");
        User user0 = new User();
        java.lang.String str1 = user0.getPassword();
        java.lang.String str2 = user0.getUsername();
        java.lang.String str3 = user0.getEmail();
        user0.setUsername("");
        java.lang.String str6 = user0.getFirstName();
        java.lang.String str7 = user0.getUsername();
        java.lang.String str8 = user0.getCountry();
        java.lang.String str9 = user0.getDob();
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
    public void test2083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2083");
        User user0 = new User();
        java.lang.String str1 = user0.getPassword();
        user0.setCountry("hi!");
        java.lang.String str4 = user0.getFirstName();
        java.lang.String str5 = user0.getDob();
        java.lang.String str6 = user0.getLastName();
        user0.setLastName("");
        user0.setPassword("hi!");
        java.lang.String str11 = user0.getPassword();
        user0.setPassword("hi!");
        user0.setLastName("");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
    }

    @Test
    public void test2084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2084");
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
        user0.setLastName("hi!");
        user0.setEmail("");
        java.lang.String str26 = user0.getPassword();
        user0.setLastName("");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertNull(str26);
    }

    @Test
    public void test2085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2085");
        User user0 = new User();
        java.lang.String str1 = user0.getPassword();
        java.lang.String str2 = user0.getUsername();
        java.lang.String str3 = user0.getEmail();
        user0.setFirstName("");
        user0.setLastName("hi!");
        user0.setUsername("hi!");
        java.lang.String str10 = user0.getPassword();
        java.lang.String str11 = user0.getEmail();
        java.lang.String str12 = user0.getLastName();
        user0.setCountry("");
        java.lang.String str15 = user0.getCountry();
        java.lang.String str16 = user0.getCountry();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
    }

    @Test
    public void test2086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2086");
        User user0 = new User();
        java.lang.String str1 = user0.getPassword();
        java.lang.String str2 = user0.getUsername();
        java.lang.String str3 = user0.getEmail();
        user0.setFirstName("");
        user0.setLastName("hi!");
        user0.setUsername("hi!");
        java.lang.String str10 = user0.getUsername();
        user0.setLastName("");
        user0.setFirstName("");
        user0.setCountry("");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
    }

    @Test
    public void test2087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2087");
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
        user0.setCountry("");
        java.lang.String str16 = user0.getLastName();
        java.lang.String str17 = user0.getEmail();
        java.lang.String str18 = user0.getFirstName();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
    }

    @Test
    public void test2088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2088");
        User user0 = new User();
        java.lang.String str1 = user0.getPassword();
        user0.setCountry("hi!");
        java.lang.String str4 = user0.getFirstName();
        user0.setLastName("hi!");
        user0.setDob("hi!");
        java.lang.String str9 = user0.getEmail();
        user0.setLastName("");
        java.lang.String str12 = user0.getDob();
        user0.setDob("");
        user0.setCountry("");
        user0.setLastName("hi!");
        user0.setCountry("");
        java.lang.String str21 = user0.getDob();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
    }

    @Test
    public void test2089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2089");
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
        user0.setUsername("");
        user0.setFirstName("hi!");
        java.lang.String str22 = user0.getLastName();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hi!" + "'", str22, "hi!");
    }

    @Test
    public void test2090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2090");
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
        user0.setFirstName("hi!");
        java.lang.String str18 = user0.getPassword();
        user0.setUsername("");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
    }

    @Test
    public void test2091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2091");
        User user0 = new User();
        java.lang.String str1 = user0.getPassword();
        java.lang.String str2 = user0.getUsername();
        user0.setDob("");
        java.lang.String str5 = user0.getEmail();
        user0.setFirstName("hi!");
        user0.setFirstName("hi!");
        user0.setPassword("hi!");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str5);
    }

    @Test
    public void test2092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2092");
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
        user0.setEmail("");
        java.lang.String str19 = user0.getUsername();
        java.lang.String str20 = user0.getUsername();
        java.lang.String str21 = user0.getCountry();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
    }

    @Test
    public void test2093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2093");
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
        java.lang.String str14 = user0.getUsername();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertNull(str14);
    }

    @Test
    public void test2094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2094");
        User user0 = new User();
        java.lang.String str1 = user0.getPassword();
        user0.setCountry("hi!");
        java.lang.String str4 = user0.getFirstName();
        user0.setLastName("hi!");
        user0.setDob("hi!");
        java.lang.String str9 = user0.getEmail();
        java.lang.String str10 = user0.getCountry();
        user0.setUsername("");
        java.lang.String str13 = user0.getPassword();
        user0.setCountry("hi!");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNull(str13);
    }

    @Test
    public void test2095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2095");
        User user0 = new User();
        user0.setPassword("hi!");
        user0.setPassword("");
        user0.setUsername("");
        user0.setFirstName("");
        user0.setEmail("");
        java.lang.String str11 = user0.getDob();
        user0.setPassword("");
        user0.setUsername("");
        user0.setDob("");
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test2096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2096");
        User user0 = new User();
        java.lang.String str1 = user0.getPassword();
        user0.setUsername("hi!");
        user0.setFirstName("");
        java.lang.String str6 = user0.getPassword();
        user0.setEmail("hi!");
        java.lang.String str9 = user0.getEmail();
        java.lang.String str10 = user0.getFirstName();
        user0.setPassword("");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test2097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2097");
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
        user0.setPassword("");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
    }

    @Test
    public void test2098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2098");
        User user0 = new User();
        user0.setPassword("hi!");
        user0.setPassword("");
        java.lang.String str5 = user0.getPassword();
        java.lang.String str6 = user0.getEmail();
        user0.setDob("");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test2099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2099");
        User user0 = new User();
        java.lang.String str1 = user0.getPassword();
        user0.setCountry("hi!");
        java.lang.String str4 = user0.getUsername();
        user0.setPassword("");
        user0.setFirstName("");
        user0.setEmail("");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str4);
    }

    @Test
    public void test2100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2100");
        User user0 = new User();
        java.lang.String str1 = user0.getPassword();
        user0.setCountry("hi!");
        java.lang.String str4 = user0.getFirstName();
        java.lang.String str5 = user0.getDob();
        java.lang.String str6 = user0.getLastName();
        user0.setFirstName("hi!");
        user0.setDob("hi!");
        java.lang.String str11 = user0.getPassword();
        user0.setPassword("hi!");
        java.lang.String str14 = user0.getUsername();
        java.lang.String str15 = user0.getDob();
        user0.setLastName("");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
    }

    @Test
    public void test2101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2101");
        User user0 = new User();
        java.lang.String str1 = user0.getPassword();
        user0.setCountry("hi!");
        java.lang.String str4 = user0.getUsername();
        user0.setPassword("");
        user0.setFirstName("hi!");
        user0.setCountry("");
        user0.setUsername("hi!");
        user0.setPassword("hi!");
        user0.setEmail("");
        user0.setUsername("");
        java.lang.String str19 = user0.getPassword();
        java.lang.String str20 = user0.getDob();
        user0.setUsername("");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
        org.junit.Assert.assertNull(str20);
    }

    @Test
    public void test2102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2102");
        User user0 = new User();
        java.lang.String str1 = user0.getPassword();
        java.lang.String str2 = user0.getPassword();
        user0.setLastName("hi!");
        java.lang.String str5 = user0.getCountry();
        user0.setFirstName("");
        user0.setDob("hi!");
        java.lang.String str10 = user0.getDob();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
    }

    @Test
    public void test2103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2103");
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
        java.lang.String str14 = user0.getFirstName();
        user0.setFirstName("");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test2104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2104");
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
        user0.setEmail("hi!");
        java.lang.String str17 = user0.getFirstName();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
    }

    @Test
    public void test2105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2105");
        User user0 = new User();
        user0.setPassword("hi!");
        user0.setPassword("");
        java.lang.String str5 = user0.getDob();
        user0.setEmail("");
        java.lang.String str8 = user0.getUsername();
        user0.setCountry("");
        user0.setEmail("");
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test2106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2106");
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
        user0.setLastName("");
        user0.setPassword("");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test2107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2107");
        User user0 = new User();
        java.lang.String str1 = user0.getPassword();
        user0.setCountry("hi!");
        java.lang.String str4 = user0.getFirstName();
        java.lang.String str5 = user0.getDob();
        java.lang.String str6 = user0.getLastName();
        user0.setLastName("");
        user0.setPassword("hi!");
        java.lang.String str11 = user0.getPassword();
        user0.setPassword("hi!");
        java.lang.String str14 = user0.getUsername();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertNull(str14);
    }

    @Test
    public void test2108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2108");
        User user0 = new User();
        java.lang.String str1 = user0.getPassword();
        java.lang.String str2 = user0.getPassword();
        user0.setLastName("hi!");
        java.lang.String str5 = user0.getCountry();
        user0.setCountry("hi!");
        java.lang.String str8 = user0.getPassword();
        java.lang.String str9 = user0.getUsername();
        java.lang.String str10 = user0.getUsername();
        java.lang.String str11 = user0.getDob();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test2109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2109");
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
        user0.setUsername("");
        user0.setCountry("");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
    }

    @Test
    public void test2110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2110");
        User user0 = new User();
        user0.setLastName("");
        java.lang.String str3 = user0.getCountry();
        java.lang.String str4 = user0.getDob();
        user0.setUsername("");
        user0.setCountry("hi!");
        java.lang.String str9 = user0.getPassword();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test2111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2111");
        User user0 = new User();
        java.lang.String str1 = user0.getPassword();
        user0.setCountry("hi!");
        java.lang.String str4 = user0.getUsername();
        user0.setPassword("");
        user0.setFirstName("hi!");
        user0.setDob("hi!");
        user0.setUsername("hi!");
        user0.setLastName("");
        java.lang.Class<?> wildcardClass15 = user0.getClass();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test2112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2112");
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
        java.lang.String str16 = user0.getDob();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNull(str16);
    }

    @Test
    public void test2113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2113");
        User user0 = new User();
        java.lang.String str1 = user0.getPassword();
        user0.setCountry("hi!");
        java.lang.String str4 = user0.getUsername();
        user0.setPassword("");
        user0.setFirstName("hi!");
        user0.setCountry("");
        user0.setCountry("hi!");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str4);
    }

    @Test
    public void test2114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2114");
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
        java.lang.String str16 = user0.getEmail();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNull(str16);
    }

    @Test
    public void test2115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2115");
        User user0 = new User();
        user0.setPassword("hi!");
        user0.setPassword("");
        java.lang.String str5 = user0.getPassword();
        java.lang.String str6 = user0.getEmail();
        user0.setEmail("");
        user0.setFirstName("");
        user0.setDob("");
        user0.setUsername("");
        java.lang.String str15 = user0.getDob();
        user0.setPassword("");
        java.lang.String str18 = user0.getDob();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
    }

    @Test
    public void test2116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2116");
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
        user0.setEmail("hi!");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test2117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2117");
        User user0 = new User();
        user0.setPassword("hi!");
        user0.setPassword("");
        java.lang.String str5 = user0.getDob();
        user0.setEmail("");
        user0.setUsername("");
        user0.setPassword("");
        java.lang.String str12 = user0.getLastName();
        user0.setLastName("");
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test2118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2118");
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
        java.lang.String str16 = user0.getCountry();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNull(str16);
    }

    @Test
    public void test2119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2119");
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
        java.lang.String str15 = user0.getFirstName();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
    }

    @Test
    public void test2120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2120");
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
        java.lang.String str17 = user0.getLastName();
        java.lang.String str18 = user0.getLastName();
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
    }

    @Test
    public void test2121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2121");
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
        user0.setFirstName("hi!");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
    }

    @Test
    public void test2122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2122");
        User user0 = new User();
        java.lang.String str1 = user0.getPassword();
        user0.setUsername("hi!");
        user0.setFirstName("");
        java.lang.String str6 = user0.getPassword();
        user0.setLastName("");
        java.lang.String str9 = user0.getDob();
        java.lang.String str10 = user0.getEmail();
        java.lang.String str11 = user0.getUsername();
        user0.setUsername("hi!");
        user0.setLastName("");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
    }

    @Test
    public void test2123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2123");
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
        user0.setPassword("");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test2124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2124");
        User user0 = new User();
        java.lang.String str1 = user0.getPassword();
        java.lang.String str2 = user0.getPassword();
        user0.setLastName("hi!");
        user0.setLastName("hi!");
        java.lang.String str7 = user0.getDob();
        java.lang.String str8 = user0.getUsername();
        java.lang.String str9 = user0.getUsername();
        user0.setLastName("");
        user0.setLastName("hi!");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test2125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2125");
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
        user0.setDob("hi!");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test2126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2126");
        User user0 = new User();
        java.lang.String str1 = user0.getPassword();
        user0.setCountry("hi!");
        java.lang.String str4 = user0.getFirstName();
        java.lang.String str5 = user0.getDob();
        java.lang.String str6 = user0.getLastName();
        java.lang.String str7 = user0.getCountry();
        java.lang.String str8 = user0.getPassword();
        java.lang.String str9 = user0.getPassword();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test2127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2127");
        User user0 = new User();
        user0.setPassword("hi!");
        user0.setPassword("");
        java.lang.String str5 = user0.getDob();
        user0.setEmail("");
        java.lang.String str8 = user0.getUsername();
        user0.setCountry("");
        java.lang.String str11 = user0.getLastName();
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test2128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2128");
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
        java.lang.String str17 = user0.getFirstName();
        user0.setFirstName("hi!");
        user0.setCountry("");
        user0.setDob("");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
    }

    @Test
    public void test2129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2129");
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
        user0.setEmail("hi!");
        java.lang.String str19 = user0.getDob();
        java.lang.String str20 = user0.getEmail();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
    }

    @Test
    public void test2130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2130");
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
        user0.setCountry("");
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
    public void test2131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2131");
        User user0 = new User();
        java.lang.String str1 = user0.getPassword();
        java.lang.String str2 = user0.getUsername();
        java.lang.String str3 = user0.getEmail();
        user0.setFirstName("");
        user0.setLastName("hi!");
        user0.setUsername("hi!");
        java.lang.String str10 = user0.getPassword();
        user0.setCountry("hi!");
        user0.setLastName("hi!");
        java.lang.String str15 = user0.getEmail();
        user0.setCountry("hi!");
        user0.setPassword("");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str15);
    }

    @Test
    public void test2132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2132");
        User user0 = new User();
        java.lang.String str1 = user0.getPassword();
        java.lang.String str2 = user0.getUsername();
        java.lang.String str3 = user0.getEmail();
        user0.setUsername("");
        java.lang.String str6 = user0.getEmail();
        user0.setEmail("");
        user0.setCountry("hi!");
        user0.setPassword("hi!");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test2133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2133");
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
        user0.setUsername("");
        java.lang.String str18 = user0.getCountry();
        user0.setEmail("");
        user0.setPassword("");
        user0.setPassword("");
        user0.setFirstName("");
        java.lang.String str27 = user0.getEmail();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
    }

    @Test
    public void test2134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2134");
        User user0 = new User();
        java.lang.String str1 = user0.getPassword();
        java.lang.String str2 = user0.getPassword();
        user0.setLastName("hi!");
        java.lang.String str5 = user0.getCountry();
        user0.setLastName("hi!");
        user0.setUsername("");
        java.lang.String str10 = user0.getLastName();
        user0.setCountry("hi!");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
    }

    @Test
    public void test2135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2135");
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
        user0.setPassword("hi!");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(str14);
    }

    @Test
    public void test2136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2136");
        User user0 = new User();
        java.lang.String str1 = user0.getPassword();
        user0.setCountry("hi!");
        java.lang.String str4 = user0.getPassword();
        user0.setCountry("");
        user0.setUsername("");
        user0.setFirstName("");
        java.lang.String str11 = user0.getLastName();
        user0.setLastName("");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test2137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2137");
        User user0 = new User();
        java.lang.String str1 = user0.getPassword();
        java.lang.String str2 = user0.getUsername();
        java.lang.String str3 = user0.getCountry();
        user0.setEmail("hi!");
        java.lang.String str6 = user0.getPassword();
        java.lang.String str7 = user0.getEmail();
        user0.setCountry("hi!");
        java.lang.String str10 = user0.getLastName();
        user0.setPassword("");
        user0.setEmail("");
        java.lang.Class<?> wildcardClass15 = user0.getClass();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test2138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2138");
        User user0 = new User();
        java.lang.String str1 = user0.getPassword();
        user0.setUsername("");
        user0.setLastName("");
        java.lang.String str6 = user0.getFirstName();
        java.lang.String str7 = user0.getDob();
        user0.setFirstName("");
        user0.setUsername("hi!");
        user0.setCountry("hi!");
        java.lang.String str14 = user0.getFirstName();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test2139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2139");
        User user0 = new User();
        user0.setPassword("hi!");
        user0.setPassword("");
        java.lang.String str5 = user0.getPassword();
        java.lang.String str6 = user0.getEmail();
        java.lang.String str7 = user0.getEmail();
        java.lang.String str8 = user0.getLastName();
        java.lang.String str9 = user0.getEmail();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test2140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2140");
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
        java.lang.String str14 = user0.getDob();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(str14);
    }

    @Test
    public void test2141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2141");
        User user0 = new User();
        java.lang.String str1 = user0.getPassword();
        user0.setUsername("hi!");
        user0.setFirstName("");
        java.lang.String str6 = user0.getPassword();
        user0.setLastName("");
        java.lang.String str9 = user0.getFirstName();
        user0.setDob("hi!");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test2142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2142");
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
        user0.setUsername("hi!");
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
    public void test2143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2143");
        User user0 = new User();
        java.lang.String str1 = user0.getPassword();
        user0.setUsername("hi!");
        user0.setFirstName("");
        java.lang.String str6 = user0.getPassword();
        user0.setLastName("");
        java.lang.String str9 = user0.getDob();
        java.lang.String str10 = user0.getLastName();
        user0.setEmail("");
        java.lang.Class<?> wildcardClass13 = user0.getClass();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test2144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2144");
        User user0 = new User();
        user0.setPassword("hi!");
        user0.setPassword("");
        java.lang.String str5 = user0.getFirstName();
        user0.setEmail("hi!");
        java.lang.String str8 = user0.getLastName();
        user0.setUsername("");
        user0.setFirstName("");
        user0.setCountry("");
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test2145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2145");
        User user0 = new User();
        java.lang.String str1 = user0.getPassword();
        java.lang.String str2 = user0.getUsername();
        java.lang.String str3 = user0.getEmail();
        java.lang.String str4 = user0.getLastName();
        user0.setDob("");
        java.lang.String str7 = user0.getLastName();
        java.lang.String str8 = user0.getEmail();
        user0.setUsername("hi!");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test2146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2146");
        User user0 = new User();
        java.lang.String str1 = user0.getPassword();
        java.lang.String str2 = user0.getUsername();
        java.lang.String str3 = user0.getEmail();
        user0.setFirstName("");
        user0.setLastName("hi!");
        user0.setUsername("hi!");
        java.lang.String str10 = user0.getUsername();
        user0.setLastName("");
        user0.setFirstName("hi!");
        java.lang.String str15 = user0.getLastName();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
    }

    @Test
    public void test2147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2147");
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
        java.lang.String str16 = user0.getEmail();
        java.lang.String str17 = user0.getLastName();
        user0.setEmail("");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
    }

    @Test
    public void test2148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2148");
        User user0 = new User();
        java.lang.String str1 = user0.getPassword();
        user0.setUsername("hi!");
        user0.setCountry("hi!");
        user0.setFirstName("");
        user0.setUsername("");
        java.lang.String str10 = user0.getLastName();
        java.lang.String str11 = user0.getLastName();
        user0.setFirstName("hi!");
        java.lang.String str14 = user0.getFirstName();
        java.lang.String str15 = user0.getEmail();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertNull(str15);
    }

    @Test
    public void test2149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2149");
        User user0 = new User();
        java.lang.String str1 = user0.getPassword();
        user0.setCountry("hi!");
        java.lang.String str4 = user0.getFirstName();
        java.lang.String str5 = user0.getDob();
        java.lang.String str6 = user0.getLastName();
        user0.setFirstName("hi!");
        java.lang.String str9 = user0.getLastName();
        java.lang.String str10 = user0.getPassword();
        java.lang.String str11 = user0.getCountry();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
    }

    @Test
    public void test2150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2150");
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
        user0.setLastName("hi!");
        java.lang.String str17 = user0.getLastName();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
    }

    @Test
    public void test2151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2151");
        User user0 = new User();
        java.lang.String str1 = user0.getPassword();
        user0.setUsername("hi!");
        user0.setCountry("hi!");
        java.lang.String str6 = user0.getLastName();
        user0.setLastName("");
        user0.setPassword("");
        java.lang.String str11 = user0.getEmail();
        java.lang.String str12 = user0.getUsername();
        user0.setUsername("");
        java.lang.String str15 = user0.getEmail();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertNull(str15);
    }

    @Test
    public void test2152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2152");
        User user0 = new User();
        java.lang.String str1 = user0.getFirstName();
        java.lang.String str2 = user0.getPassword();
        java.lang.String str3 = user0.getLastName();
        java.lang.String str4 = user0.getDob();
        java.lang.String str5 = user0.getPassword();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
    }

    @Test
    public void test2153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2153");
        User user0 = new User();
        user0.setLastName("");
        java.lang.String str3 = user0.getEmail();
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test2154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2154");
        User user0 = new User();
        user0.setPassword("hi!");
        java.lang.String str3 = user0.getPassword();
        java.lang.String str4 = user0.getFirstName();
        java.lang.String str5 = user0.getDob();
        java.lang.String str6 = user0.getLastName();
        java.lang.String str7 = user0.getLastName();
        java.lang.String str8 = user0.getUsername();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test2155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2155");
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
        user0.setUsername("hi!");
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
    public void test2156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2156");
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
        java.lang.String str14 = user0.getLastName();
        user0.setPassword("");
        user0.setLastName("");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str14);
    }

    @Test
    public void test2157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2157");
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
        java.lang.Class<?> wildcardClass13 = user0.getClass();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test2158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2158");
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
        user0.setUsername("");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str16);
    }

    @Test
    public void test2159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2159");
        User user0 = new User();
        java.lang.String str1 = user0.getPassword();
        java.lang.String str2 = user0.getUsername();
        java.lang.String str3 = user0.getEmail();
        user0.setFirstName("");
        user0.setLastName("hi!");
        java.lang.String str8 = user0.getFirstName();
        user0.setPassword("hi!");
        java.lang.String str11 = user0.getDob();
        user0.setUsername("");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test2160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2160");
        User user0 = new User();
        java.lang.String str1 = user0.getPassword();
        user0.setCountry("hi!");
        java.lang.String str4 = user0.getPassword();
        user0.setLastName("hi!");
        user0.setPassword("");
        java.lang.String str9 = user0.getLastName();
        java.lang.String str10 = user0.getLastName();
        java.lang.String str11 = user0.getLastName();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
    }

    @Test
    public void test2161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2161");
        User user0 = new User();
        java.lang.String str1 = user0.getPassword();
        java.lang.String str2 = user0.getUsername();
        java.lang.String str3 = user0.getEmail();
        user0.setUsername("");
        java.lang.String str6 = user0.getFirstName();
        user0.setLastName("");
        java.lang.String str9 = user0.getEmail();
        user0.setFirstName("hi!");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test2162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2162");
        User user0 = new User();
        java.lang.String str1 = user0.getPassword();
        java.lang.String str2 = user0.getUsername();
        java.lang.String str3 = user0.getEmail();
        user0.setUsername("");
        user0.setDob("hi!");
        java.lang.String str8 = user0.getCountry();
        java.lang.String str9 = user0.getDob();
        user0.setDob("");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
    }

    @Test
    public void test2163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2163");
        User user0 = new User();
        user0.setPassword("hi!");
        java.lang.String str3 = user0.getPassword();
        java.lang.String str4 = user0.getFirstName();
        java.lang.String str5 = user0.getLastName();
        user0.setCountry("");
        user0.setCountry("");
        user0.setPassword("hi!");
        user0.setPassword("hi!");
        java.lang.String str14 = user0.getFirstName();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str14);
    }

    @Test
    public void test2164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2164");
        User user0 = new User();
        java.lang.String str1 = user0.getPassword();
        java.lang.String str2 = user0.getUsername();
        java.lang.String str3 = user0.getEmail();
        user0.setUsername("");
        java.lang.String str6 = user0.getFirstName();
        java.lang.String str7 = user0.getUsername();
        java.lang.String str8 = user0.getCountry();
        java.lang.String str9 = user0.getFirstName();
        java.lang.String str10 = user0.getFirstName();
        java.lang.String str11 = user0.getUsername();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test2165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2165");
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
        user0.setPassword("");
        java.lang.String str20 = user0.getUsername();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
    }

    @Test
    public void test2166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2166");
        User user0 = new User();
        java.lang.String str1 = user0.getPassword();
        user0.setCountry("hi!");
        java.lang.String str4 = user0.getFirstName();
        user0.setCountry("");
        java.lang.String str7 = user0.getEmail();
        java.lang.String str8 = user0.getLastName();
        java.lang.String str9 = user0.getFirstName();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test2167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2167");
        User user0 = new User();
        user0.setPassword("hi!");
        user0.setPassword("");
        user0.setUsername("");
        user0.setFirstName("");
        user0.setEmail("");
        java.lang.String str11 = user0.getDob();
        user0.setPassword("");
        user0.setCountry("");
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test2168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2168");
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
        user0.setEmail("hi!");
        java.lang.String str19 = user0.getDob();
        java.lang.String str20 = user0.getLastName();
        user0.setFirstName("");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
        org.junit.Assert.assertNull(str20);
    }

    @Test
    public void test2169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2169");
        User user0 = new User();
        java.lang.String str1 = user0.getPassword();
        user0.setUsername("");
        user0.setFirstName("hi!");
        java.lang.String str6 = user0.getCountry();
        user0.setEmail("");
        user0.setUsername("hi!");
        user0.setUsername("hi!");
        user0.setEmail("hi!");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test2170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2170");
        User user0 = new User();
        java.lang.String str1 = user0.getPassword();
        user0.setUsername("hi!");
        java.lang.String str4 = user0.getCountry();
        java.lang.String str5 = user0.getUsername();
        java.lang.String str6 = user0.getLastName();
        java.lang.Class<?> wildcardClass7 = user0.getClass();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test2171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2171");
        User user0 = new User();
        java.lang.String str1 = user0.getPassword();
        java.lang.String str2 = user0.getPassword();
        java.lang.String str3 = user0.getPassword();
        java.lang.String str4 = user0.getDob();
        user0.setFirstName("hi!");
        user0.setCountry("hi!");
        java.lang.String str9 = user0.getFirstName();
        user0.setPassword("");
        user0.setPassword("hi!");
        user0.setEmail("hi!");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
    }

    @Test
    public void test2172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2172");
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
        java.lang.String str17 = user0.getPassword();
        java.lang.String str18 = user0.getFirstName();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertNull(str18);
    }

    @Test
    public void test2173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2173");
        User user0 = new User();
        java.lang.String str1 = user0.getPassword();
        java.lang.String str2 = user0.getUsername();
        java.lang.String str3 = user0.getEmail();
        user0.setFirstName("");
        user0.setLastName("hi!");
        java.lang.String str8 = user0.getFirstName();
        user0.setPassword("hi!");
        user0.setFirstName("");
        user0.setDob("");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test2174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2174");
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
        user0.setCountry("hi!");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
    }

    @Test
    public void test2175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2175");
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
        java.lang.String str21 = user0.getCountry();
        java.lang.String str22 = user0.getLastName();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!" + "'", str21, "hi!");
        org.junit.Assert.assertNull(str22);
    }

    @Test
    public void test2176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2176");
        User user0 = new User();
        java.lang.String str1 = user0.getPassword();
        java.lang.String str2 = user0.getUsername();
        java.lang.String str3 = user0.getCountry();
        java.lang.String str4 = user0.getPassword();
        java.lang.String str5 = user0.getUsername();
        user0.setEmail("");
        user0.setDob("");
        java.lang.String str10 = user0.getPassword();
        java.lang.String str11 = user0.getFirstName();
        java.lang.String str12 = user0.getLastName();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test2177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2177");
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
        java.lang.String str18 = user0.getUsername();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
    }

    @Test
    public void test2178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2178");
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
        java.lang.String str15 = user0.getUsername();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
    }

    @Test
    public void test2179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2179");
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
        user0.setUsername("");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
    }

    @Test
    public void test2180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2180");
        User user0 = new User();
        user0.setPassword("hi!");
        user0.setPassword("");
        java.lang.String str5 = user0.getPassword();
        java.lang.String str6 = user0.getEmail();
        java.lang.String str7 = user0.getEmail();
        java.lang.String str8 = user0.getLastName();
        user0.setFirstName("");
        java.lang.String str11 = user0.getLastName();
        java.lang.String str12 = user0.getLastName();
        user0.setEmail("hi!");
        java.lang.String str15 = user0.getUsername();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str15);
    }

    @Test
    public void test2181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2181");
        User user0 = new User();
        java.lang.String str1 = user0.getPassword();
        user0.setUsername("hi!");
        user0.setFirstName("");
        java.lang.String str6 = user0.getPassword();
        user0.setLastName("");
        java.lang.String str9 = user0.getDob();
        java.lang.String str10 = user0.getEmail();
        java.lang.String str11 = user0.getPassword();
        user0.setLastName("hi!");
        java.lang.String str14 = user0.getUsername();
        java.lang.String str15 = user0.getLastName();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
    }

    @Test
    public void test2182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2182");
        User user0 = new User();
        java.lang.String str1 = user0.getPassword();
        java.lang.String str2 = user0.getUsername();
        java.lang.String str3 = user0.getEmail();
        user0.setFirstName("");
        user0.setUsername("");
        user0.setEmail("hi!");
        user0.setCountry("hi!");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test2183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2183");
        User user0 = new User();
        user0.setPassword("hi!");
        user0.setPassword("");
        java.lang.String str5 = user0.getPassword();
        java.lang.String str6 = user0.getEmail();
        user0.setFirstName("hi!");
        java.lang.String str9 = user0.getCountry();
        java.lang.String str10 = user0.getDob();
        user0.setLastName("");
        java.lang.String str13 = user0.getCountry();
        user0.setFirstName("");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str13);
    }

    @Test
    public void test2184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2184");
        User user0 = new User();
        user0.setPassword("hi!");
        user0.setPassword("");
        java.lang.String str5 = user0.getPassword();
        user0.setCountry("hi!");
        user0.setLastName("hi!");
        user0.setFirstName("");
        user0.setLastName("hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
    }

    @Test
    public void test2185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2185");
        User user0 = new User();
        user0.setPassword("hi!");
        user0.setPassword("");
        java.lang.String str5 = user0.getPassword();
        java.lang.String str6 = user0.getEmail();
        user0.setFirstName("hi!");
        java.lang.String str9 = user0.getCountry();
        java.lang.String str10 = user0.getDob();
        user0.setLastName("");
        java.lang.String str13 = user0.getCountry();
        java.lang.String str14 = user0.getDob();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(str14);
    }

    @Test
    public void test2186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2186");
        User user0 = new User();
        java.lang.String str1 = user0.getFirstName();
        user0.setPassword("");
        user0.setEmail("hi!");
        java.lang.String str6 = user0.getLastName();
        user0.setCountry("");
        user0.setEmail("");
        java.lang.String str11 = user0.getUsername();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test2187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2187");
        User user0 = new User();
        java.lang.String str1 = user0.getPassword();
        java.lang.String str2 = user0.getPassword();
        java.lang.String str3 = user0.getFirstName();
        user0.setDob("hi!");
        java.lang.String str6 = user0.getEmail();
        user0.setPassword("hi!");
        java.lang.String str9 = user0.getPassword();
        java.lang.String str10 = user0.getEmail();
        user0.setPassword("hi!");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test2188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2188");
        User user0 = new User();
        java.lang.String str1 = user0.getPassword();
        java.lang.String str2 = user0.getUsername();
        java.lang.String str3 = user0.getEmail();
        user0.setFirstName("");
        user0.setLastName("hi!");
        user0.setUsername("hi!");
        java.lang.String str10 = user0.getPassword();
        java.lang.String str11 = user0.getFirstName();
        user0.setLastName("");
        java.lang.String str14 = user0.getUsername();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
    }

    @Test
    public void test2189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2189");
        User user0 = new User();
        user0.setLastName("");
        java.lang.String str3 = user0.getCountry();
        user0.setEmail("hi!");
        java.lang.String str6 = user0.getEmail();
        user0.setDob("");
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
    }

    @Test
    public void test2190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2190");
        User user0 = new User();
        java.lang.String str1 = user0.getFirstName();
        java.lang.String str2 = user0.getPassword();
        java.lang.String str3 = user0.getDob();
        java.lang.String str4 = user0.getEmail();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
    }

    @Test
    public void test2191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2191");
        User user0 = new User();
        user0.setPassword("hi!");
        java.lang.String str3 = user0.getPassword();
        java.lang.String str4 = user0.getFirstName();
        java.lang.String str5 = user0.getLastName();
        user0.setFirstName("");
        user0.setDob("");
        java.lang.String str10 = user0.getPassword();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
    }

    @Test
    public void test2192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2192");
        User user0 = new User();
        java.lang.String str1 = user0.getPassword();
        java.lang.String str2 = user0.getUsername();
        java.lang.String str3 = user0.getCountry();
        user0.setEmail("hi!");
        java.lang.String str6 = user0.getPassword();
        java.lang.String str7 = user0.getEmail();
        java.lang.String str8 = user0.getPassword();
        user0.setDob("hi!");
        java.lang.String str11 = user0.getPassword();
        java.lang.String str12 = user0.getDob();
        user0.setEmail("");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
    }

    @Test
    public void test2193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2193");
        User user0 = new User();
        java.lang.String str1 = user0.getPassword();
        java.lang.String str2 = user0.getUsername();
        java.lang.String str3 = user0.getEmail();
        user0.setFirstName("");
        user0.setLastName("hi!");
        user0.setUsername("hi!");
        user0.setEmail("");
        user0.setUsername("hi!");
        java.lang.String str14 = user0.getLastName();
        user0.setLastName("");
        user0.setCountry("");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
    }

    @Test
    public void test2194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2194");
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
        user0.setEmail("hi!");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test2195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2195");
        User user0 = new User();
        user0.setPassword("hi!");
        user0.setPassword("");
        java.lang.String str5 = user0.getFirstName();
        user0.setLastName("hi!");
        user0.setFirstName("");
        user0.setUsername("hi!");
        java.lang.String str12 = user0.getFirstName();
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test2196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2196");
        User user0 = new User();
        java.lang.String str1 = user0.getPassword();
        user0.setCountry("hi!");
        user0.setUsername("hi!");
        user0.setPassword("");
        user0.setDob("hi!");
        user0.setFirstName("hi!");
        org.junit.Assert.assertNull(str1);
    }

    @Test
    public void test2197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2197");
        User user0 = new User();
        java.lang.String str1 = user0.getPassword();
        java.lang.String str2 = user0.getUsername();
        java.lang.String str3 = user0.getCountry();
        user0.setPassword("");
        user0.setLastName("");
        user0.setUsername("");
        user0.setUsername("");
        java.lang.String str12 = user0.getPassword();
        java.lang.String str13 = user0.getPassword();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test2198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2198");
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
        user0.setEmail("hi!");
        user0.setLastName("");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test2199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2199");
        User user0 = new User();
        java.lang.String str1 = user0.getPassword();
        java.lang.String str2 = user0.getPassword();
        java.lang.String str3 = user0.getPassword();
        java.lang.String str4 = user0.getDob();
        user0.setFirstName("hi!");
        user0.setCountry("hi!");
        user0.setDob("hi!");
        java.lang.String str11 = user0.getFirstName();
        user0.setPassword("hi!");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
    }

    @Test
    public void test2200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2200");
        User user0 = new User();
        java.lang.String str1 = user0.getPassword();
        user0.setCountry("hi!");
        java.lang.String str4 = user0.getPassword();
        java.lang.String str5 = user0.getDob();
        user0.setCountry("hi!");
        java.lang.String str8 = user0.getCountry();
        java.lang.String str9 = user0.getEmail();
        user0.setFirstName("hi!");
        java.lang.String str12 = user0.getDob();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test2201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2201");
        User user0 = new User();
        java.lang.String str1 = user0.getPassword();
        user0.setCountry("hi!");
        java.lang.String str4 = user0.getFirstName();
        java.lang.String str5 = user0.getDob();
        java.lang.String str6 = user0.getLastName();
        user0.setFirstName("hi!");
        user0.setDob("hi!");
        user0.setUsername("");
        user0.setFirstName("");
        java.lang.Class<?> wildcardClass15 = user0.getClass();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test2202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2202");
        User user0 = new User();
        user0.setPassword("hi!");
        user0.setPassword("");
        java.lang.String str5 = user0.getPassword();
        java.lang.String str6 = user0.getEmail();
        java.lang.String str7 = user0.getFirstName();
        user0.setFirstName("");
        user0.setFirstName("hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test2203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2203");
        User user0 = new User();
        java.lang.String str1 = user0.getPassword();
        user0.setUsername("hi!");
        user0.setFirstName("");
        user0.setPassword("hi!");
        org.junit.Assert.assertNull(str1);
    }

    @Test
    public void test2204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2204");
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
        java.lang.String str16 = user0.getUsername();
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
    public void test2205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2205");
        User user0 = new User();
        java.lang.String str1 = user0.getPassword();
        java.lang.String str2 = user0.getUsername();
        java.lang.String str3 = user0.getEmail();
        user0.setFirstName("");
        user0.setLastName("hi!");
        user0.setUsername("hi!");
        java.lang.String str10 = user0.getUsername();
        user0.setLastName("");
        user0.setFirstName("");
        java.lang.String str15 = user0.getEmail();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNull(str15);
    }

    @Test
    public void test2206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2206");
        User user0 = new User();
        java.lang.String str1 = user0.getPassword();
        user0.setCountry("hi!");
        java.lang.String str4 = user0.getFirstName();
        java.lang.String str5 = user0.getFirstName();
        java.lang.String str6 = user0.getLastName();
        user0.setFirstName("hi!");
        java.lang.String str9 = user0.getEmail();
        java.lang.String str10 = user0.getDob();
        user0.setPassword("");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test2207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2207");
        User user0 = new User();
        user0.setLastName("");
        java.lang.String str3 = user0.getCountry();
        java.lang.String str4 = user0.getDob();
        user0.setCountry("");
        java.lang.String str7 = user0.getFirstName();
        java.lang.String str8 = user0.getFirstName();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test2208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2208");
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
        java.lang.String str14 = user0.getUsername();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(str14);
    }

    @Test
    public void test2209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2209");
        User user0 = new User();
        java.lang.String str1 = user0.getFirstName();
        user0.setPassword("");
        user0.setEmail("hi!");
        java.lang.String str6 = user0.getUsername();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test2210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2210");
        User user0 = new User();
        java.lang.String str1 = user0.getPassword();
        user0.setCountry("hi!");
        java.lang.String str4 = user0.getFirstName();
        java.lang.String str5 = user0.getDob();
        java.lang.String str6 = user0.getLastName();
        user0.setFirstName("hi!");
        java.lang.String str9 = user0.getUsername();
        user0.setPassword("hi!");
        user0.setEmail("");
        java.lang.Class<?> wildcardClass14 = user0.getClass();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test2211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2211");
        User user0 = new User();
        java.lang.String str1 = user0.getPassword();
        java.lang.String str2 = user0.getPassword();
        user0.setUsername("");
        java.lang.String str5 = user0.getCountry();
        java.lang.String str6 = user0.getDob();
        java.lang.String str7 = user0.getFirstName();
        java.lang.String str8 = user0.getUsername();
        user0.setLastName("");
        java.lang.String str11 = user0.getPassword();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test2212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2212");
        User user0 = new User();
        java.lang.String str1 = user0.getPassword();
        user0.setCountry("hi!");
        java.lang.String str4 = user0.getPassword();
        java.lang.String str5 = user0.getDob();
        user0.setCountry("hi!");
        java.lang.String str8 = user0.getCountry();
        java.lang.String str9 = user0.getEmail();
        user0.setUsername("");
        java.lang.String str12 = user0.getCountry();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
    }

    @Test
    public void test2213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2213");
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
        user0.setPassword("hi!");
        java.lang.String str15 = user0.getPassword();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
    }

    @Test
    public void test2214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2214");
        User user0 = new User();
        java.lang.String str1 = user0.getPassword();
        user0.setCountry("hi!");
        user0.setUsername("hi!");
        java.lang.String str6 = user0.getUsername();
        user0.setLastName("");
        java.lang.String str9 = user0.getLastName();
        user0.setEmail("");
        java.lang.String str12 = user0.getUsername();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
    }

    @Test
    public void test2215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2215");
        User user0 = new User();
        java.lang.String str1 = user0.getPassword();
        user0.setCountry("hi!");
        java.lang.String str4 = user0.getPassword();
        java.lang.String str5 = user0.getPassword();
        java.lang.String str6 = user0.getEmail();
        user0.setPassword("hi!");
        java.lang.String str9 = user0.getEmail();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test2216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2216");
        User user0 = new User();
        java.lang.String str1 = user0.getFirstName();
        user0.setPassword("");
        user0.setEmail("hi!");
        user0.setPassword("hi!");
        user0.setPassword("");
        java.lang.String str10 = user0.getDob();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test2217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2217");
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
        java.lang.String str20 = user0.getLastName();
        java.lang.String str21 = user0.getDob();
        user0.setCountry("");
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!" + "'", str21, "hi!");
    }

    @Test
    public void test2218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2218");
        User user0 = new User();
        java.lang.String str1 = user0.getPassword();
        user0.setUsername("hi!");
        user0.setCountry("hi!");
        java.lang.String str6 = user0.getLastName();
        user0.setLastName("");
        user0.setFirstName("hi!");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test2219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2219");
        User user0 = new User();
        user0.setPassword("hi!");
        java.lang.String str3 = user0.getPassword();
        java.lang.String str4 = user0.getFirstName();
        java.lang.String str5 = user0.getLastName();
        user0.setCountry("");
        user0.setUsername("");
        user0.setFirstName("hi!");
        user0.setFirstName("hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
    }

    @Test
    public void test2220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2220");
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
        java.lang.String str13 = user0.getUsername();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str13);
    }

    @Test
    public void test2221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2221");
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
        java.lang.String str14 = user0.getCountry();
        java.lang.String str15 = user0.getCountry();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(str15);
    }

    @Test
    public void test2222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2222");
        User user0 = new User();
        java.lang.String str1 = user0.getPassword();
        java.lang.String str2 = user0.getPassword();
        java.lang.String str3 = user0.getFirstName();
        user0.setPassword("");
        user0.setFirstName("");
        java.lang.String str8 = user0.getFirstName();
        user0.setCountry("");
        java.lang.String str11 = user0.getFirstName();
        user0.setEmail("hi!");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test2223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2223");
        User user0 = new User();
        java.lang.String str1 = user0.getPassword();
        java.lang.String str2 = user0.getUsername();
        java.lang.String str3 = user0.getEmail();
        user0.setFirstName("");
        user0.setLastName("hi!");
        java.lang.String str8 = user0.getFirstName();
        java.lang.String str9 = user0.getPassword();
        java.lang.String str10 = user0.getPassword();
        user0.setEmail("hi!");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test2224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2224");
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
        java.lang.String str18 = user0.getDob();
        user0.setLastName("hi!");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
    }

    @Test
    public void test2225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2225");
        User user0 = new User();
        user0.setPassword("hi!");
        user0.setPassword("");
        java.lang.String str5 = user0.getPassword();
        java.lang.String str6 = user0.getEmail();
        user0.setCountry("hi!");
        java.lang.String str9 = user0.getDob();
        user0.setCountry("hi!");
        java.lang.String str12 = user0.getEmail();
        user0.setCountry("hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test2226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2226");
        User user0 = new User();
        java.lang.String str1 = user0.getPassword();
        user0.setCountry("hi!");
        user0.setUsername("hi!");
        user0.setCountry("");
        java.lang.String str8 = user0.getFirstName();
        user0.setDob("hi!");
        java.lang.String str11 = user0.getCountry();
        java.lang.String str12 = user0.getEmail();
        java.lang.String str13 = user0.getLastName();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str13);
    }

    @Test
    public void test2227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2227");
        User user0 = new User();
        java.lang.String str1 = user0.getPassword();
        user0.setCountry("hi!");
        java.lang.String str4 = user0.getPassword();
        user0.setEmail("hi!");
        java.lang.String str7 = user0.getUsername();
        user0.setLastName("");
        java.lang.String str10 = user0.getFirstName();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test2228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2228");
        User user0 = new User();
        java.lang.String str1 = user0.getPassword();
        java.lang.String str2 = user0.getPassword();
        java.lang.String str3 = user0.getFirstName();
        user0.setDob("hi!");
        java.lang.String str6 = user0.getEmail();
        java.lang.String str7 = user0.getDob();
        java.lang.String str8 = user0.getPassword();
        java.lang.String str9 = user0.getCountry();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test2229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2229");
        User user0 = new User();
        java.lang.String str1 = user0.getFirstName();
        java.lang.String str2 = user0.getCountry();
        java.lang.String str3 = user0.getPassword();
        user0.setUsername("hi!");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test2230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2230");
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
        java.lang.String str13 = user0.getLastName();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str13);
    }

    @Test
    public void test2231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2231");
        User user0 = new User();
        java.lang.String str1 = user0.getPassword();
        user0.setCountry("hi!");
        java.lang.String str4 = user0.getPassword();
        java.lang.String str5 = user0.getPassword();
        java.lang.String str6 = user0.getEmail();
        java.lang.String str7 = user0.getFirstName();
        user0.setDob("");
        java.lang.String str10 = user0.getPassword();
        java.lang.String str11 = user0.getPassword();
        user0.setCountry("");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test2232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2232");
        User user0 = new User();
        user0.setPassword("hi!");
        java.lang.String str3 = user0.getPassword();
        user0.setLastName("hi!");
        user0.setUsername("hi!");
        user0.setLastName("hi!");
        java.lang.String str10 = user0.getCountry();
        java.lang.String str11 = user0.getPassword();
        user0.setUsername("");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
    }

    @Test
    public void test2233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2233");
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
        java.lang.String str15 = user0.getFirstName();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(str15);
    }

    @Test
    public void test2234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2234");
        User user0 = new User();
        java.lang.String str1 = user0.getPassword();
        java.lang.String str2 = user0.getPassword();
        java.lang.String str3 = user0.getFirstName();
        user0.setDob("hi!");
        java.lang.String str6 = user0.getEmail();
        user0.setEmail("");
        user0.setFirstName("hi!");
        java.lang.String str11 = user0.getDob();
        java.lang.String str12 = user0.getLastName();
        user0.setCountry("");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test2235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2235");
        User user0 = new User();
        java.lang.String str1 = user0.getPassword();
        user0.setCountry("hi!");
        java.lang.String str4 = user0.getFirstName();
        user0.setLastName("hi!");
        user0.setDob("hi!");
        java.lang.String str9 = user0.getEmail();
        java.lang.String str10 = user0.getCountry();
        user0.setDob("hi!");
        java.lang.Class<?> wildcardClass13 = user0.getClass();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test2236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2236");
        User user0 = new User();
        java.lang.String str1 = user0.getPassword();
        java.lang.String str2 = user0.getUsername();
        java.lang.String str3 = user0.getEmail();
        user0.setFirstName("");
        user0.setLastName("hi!");
        user0.setUsername("hi!");
        user0.setEmail("");
        java.lang.String str12 = user0.getEmail();
        user0.setLastName("hi!");
        java.lang.String str15 = user0.getFirstName();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
    }

    @Test
    public void test2237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2237");
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
        user0.setPassword("hi!");
        java.lang.String str14 = user0.getDob();
        user0.setLastName("");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str14);
    }

    @Test
    public void test2238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2238");
        User user0 = new User();
        java.lang.String str1 = user0.getPassword();
        user0.setUsername("hi!");
        user0.setFirstName("");
        java.lang.String str6 = user0.getPassword();
        user0.setLastName("");
        user0.setCountry("hi!");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test2239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2239");
        User user0 = new User();
        user0.setPassword("hi!");
        user0.setPassword("");
        user0.setUsername("");
        user0.setFirstName("");
        user0.setEmail("");
        java.lang.String str11 = user0.getDob();
        user0.setUsername("hi!");
        java.lang.String str14 = user0.getFirstName();
        java.lang.Class<?> wildcardClass15 = user0.getClass();
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test2240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2240");
        User user0 = new User();
        user0.setPassword("hi!");
        user0.setPassword("");
        java.lang.String str5 = user0.getPassword();
        user0.setCountry("hi!");
        user0.setLastName("hi!");
        user0.setFirstName("");
        java.lang.String str12 = user0.getUsername();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test2241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2241");
        User user0 = new User();
        user0.setPassword("hi!");
        java.lang.String str3 = user0.getPassword();
        java.lang.String str4 = user0.getFirstName();
        java.lang.String str5 = user0.getLastName();
        user0.setPassword("");
        user0.setEmail("hi!");
        java.lang.String str10 = user0.getLastName();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test2242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2242");
        User user0 = new User();
        java.lang.String str1 = user0.getPassword();
        user0.setUsername("hi!");
        user0.setCountry("hi!");
        user0.setFirstName("");
        user0.setUsername("");
        java.lang.String str10 = user0.getLastName();
        java.lang.String str11 = user0.getLastName();
        user0.setFirstName("hi!");
        java.lang.String str14 = user0.getFirstName();
        user0.setDob("");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
    }

    @Test
    public void test2243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2243");
        User user0 = new User();
        java.lang.String str1 = user0.getPassword();
        java.lang.String str2 = user0.getPassword();
        user0.setUsername("");
        java.lang.String str5 = user0.getCountry();
        user0.setUsername("hi!");
        java.lang.String str8 = user0.getLastName();
        user0.setPassword("hi!");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test2244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2244");
        User user0 = new User();
        java.lang.String str1 = user0.getPassword();
        java.lang.String str2 = user0.getUsername();
        user0.setDob("");
        java.lang.String str5 = user0.getEmail();
        java.lang.String str6 = user0.getCountry();
        user0.setPassword("hi!");
        java.lang.String str9 = user0.getEmail();
        java.lang.String str10 = user0.getCountry();
        java.lang.String str11 = user0.getPassword();
        user0.setPassword("");
        java.lang.String str14 = user0.getCountry();
        user0.setEmail("hi!");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertNull(str14);
    }

    @Test
    public void test2245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2245");
        User user0 = new User();
        java.lang.String str1 = user0.getPassword();
        java.lang.String str2 = user0.getPassword();
        java.lang.String str3 = user0.getPassword();
        java.lang.String str4 = user0.getDob();
        user0.setFirstName("hi!");
        user0.setCountry("hi!");
        user0.setDob("hi!");
        user0.setCountry("hi!");
        user0.setLastName("hi!");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
    }

    @Test
    public void test2246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2246");
        User user0 = new User();
        user0.setPassword("hi!");
        user0.setPassword("");
        java.lang.String str5 = user0.getPassword();
        user0.setCountry("hi!");
        user0.setLastName("hi!");
        user0.setFirstName("");
        java.lang.String str12 = user0.getFirstName();
        java.lang.String str13 = user0.getCountry();
        user0.setEmail("");
        user0.setUsername("hi!");
        user0.setEmail("hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
    }

    @Test
    public void test2247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2247");
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
        java.lang.String str18 = user0.getFirstName();
        java.lang.String str19 = user0.getEmail();
        user0.setLastName("");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertNull(str19);
    }

    @Test
    public void test2248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2248");
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
        java.lang.String str19 = user0.getUsername();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(str19);
    }

    @Test
    public void test2249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2249");
        User user0 = new User();
        java.lang.String str1 = user0.getPassword();
        java.lang.String str2 = user0.getUsername();
        java.lang.String str3 = user0.getEmail();
        user0.setUsername("");
        java.lang.String str6 = user0.getFirstName();
        java.lang.String str7 = user0.getUsername();
        user0.setPassword("");
        java.lang.String str10 = user0.getPassword();
        java.lang.String str11 = user0.getDob();
        java.lang.String str12 = user0.getCountry();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test2250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2250");
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
        java.lang.String str13 = user0.getDob();
        java.lang.String str14 = user0.getCountry();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
    }

    @Test
    public void test2251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2251");
        User user0 = new User();
        java.lang.String str1 = user0.getPassword();
        java.lang.String str2 = user0.getPassword();
        java.lang.String str3 = user0.getFirstName();
        user0.setPassword("");
        java.lang.String str6 = user0.getLastName();
        user0.setFirstName("");
        user0.setUsername("hi!");
        java.lang.String str11 = user0.getUsername();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
    }

    @Test
    public void test2252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2252");
        User user0 = new User();
        java.lang.String str1 = user0.getPassword();
        user0.setCountry("hi!");
        java.lang.String str4 = user0.getFirstName();
        java.lang.String str5 = user0.getDob();
        java.lang.String str6 = user0.getLastName();
        java.lang.String str7 = user0.getCountry();
        java.lang.String str8 = user0.getPassword();
        java.lang.String str9 = user0.getCountry();
        java.lang.String str10 = user0.getPassword();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test2253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2253");
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
        java.lang.String str18 = user0.getDob();
        user0.setFirstName("hi!");
        user0.setLastName("");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
    }

    @Test
    public void test2254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2254");
        User user0 = new User();
        java.lang.String str1 = user0.getPassword();
        user0.setCountry("hi!");
        java.lang.String str4 = user0.getFirstName();
        java.lang.String str5 = user0.getFirstName();
        java.lang.String str6 = user0.getLastName();
        java.lang.String str7 = user0.getLastName();
        user0.setCountry("hi!");
        java.lang.String str10 = user0.getFirstName();
        user0.setEmail("");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test2255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2255");
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
    public void test2256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2256");
        User user0 = new User();
        java.lang.String str1 = user0.getFirstName();
        user0.setPassword("");
        user0.setEmail("hi!");
        user0.setCountry("");
        java.lang.String str8 = user0.getUsername();
        user0.setUsername("hi!");
        java.lang.Class<?> wildcardClass11 = user0.getClass();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test2257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2257");
        User user0 = new User();
        java.lang.String str1 = user0.getPassword();
        user0.setUsername("hi!");
        user0.setCountry("hi!");
        java.lang.String str6 = user0.getLastName();
        user0.setLastName("");
        user0.setPassword("");
        java.lang.String str11 = user0.getPassword();
        java.lang.String str12 = user0.getFirstName();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test2258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2258");
        User user0 = new User();
        java.lang.String str1 = user0.getPassword();
        java.lang.String str2 = user0.getUsername();
        java.lang.String str3 = user0.getCountry();
        user0.setPassword("");
        user0.setLastName("");
        java.lang.String str8 = user0.getUsername();
        user0.setDob("");
        java.lang.String str11 = user0.getEmail();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test2259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2259");
        User user0 = new User();
        java.lang.String str1 = user0.getPassword();
        user0.setCountry("hi!");
        java.lang.String str4 = user0.getFirstName();
        user0.setLastName("hi!");
        java.lang.String str7 = user0.getLastName();
        java.lang.String str8 = user0.getFirstName();
        user0.setPassword("");
        java.lang.Class<?> wildcardClass11 = user0.getClass();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test2260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2260");
        User user0 = new User();
        java.lang.String str1 = user0.getPassword();
        user0.setCountry("hi!");
        java.lang.String str4 = user0.getPassword();
        user0.setFirstName("");
        user0.setLastName("hi!");
        user0.setPassword("");
        user0.setDob("hi!");
        user0.setFirstName("");
        java.lang.String str15 = user0.getDob();
        java.lang.String str16 = user0.getDob();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
    }

    @Test
    public void test2261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2261");
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
        user0.setDob("");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNull(str13);
    }

    @Test
    public void test2262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2262");
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
        java.lang.Class<?> wildcardClass19 = user0.getClass();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test2263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2263");
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
        user0.setUsername("");
        user0.setUsername("hi!");
        user0.setPassword("hi!");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test2264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2264");
        User user0 = new User();
        user0.setPassword("hi!");
        user0.setPassword("");
        java.lang.String str5 = user0.getDob();
        user0.setEmail("");
        user0.setUsername("");
        user0.setPassword("");
        user0.setLastName("");
        user0.setUsername("");
        java.lang.String str16 = user0.getEmail();
        user0.setPassword("");
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
    }

    @Test
    public void test2265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2265");
        User user0 = new User();
        java.lang.String str1 = user0.getPassword();
        user0.setCountry("hi!");
        java.lang.String str4 = user0.getPassword();
        user0.setFirstName("");
        user0.setPassword("hi!");
        java.lang.String str9 = user0.getLastName();
        java.lang.String str10 = user0.getPassword();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
    }

    @Test
    public void test2266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2266");
        User user0 = new User();
        user0.setPassword("hi!");
        user0.setPassword("");
        java.lang.String str5 = user0.getDob();
        user0.setEmail("");
        user0.setUsername("");
        user0.setPassword("");
        java.lang.String str12 = user0.getLastName();
        user0.setDob("");
        user0.setEmail("");
        user0.setFirstName("hi!");
        user0.setDob("");
        java.lang.String str21 = user0.getEmail();
        java.lang.String str22 = user0.getUsername();
        user0.setPassword("hi!");
        java.lang.String str25 = user0.getDob();
        java.lang.String str26 = user0.getLastName();
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertNull(str26);
    }

    @Test
    public void test2267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2267");
        User user0 = new User();
        java.lang.String str1 = user0.getPassword();
        java.lang.String str2 = user0.getPassword();
        java.lang.String str3 = user0.getFirstName();
        user0.setDob("hi!");
        java.lang.String str6 = user0.getEmail();
        java.lang.String str7 = user0.getFirstName();
        java.lang.String str8 = user0.getFirstName();
        user0.setCountry("hi!");
        user0.setFirstName("");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test2268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2268");
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
        java.lang.String str22 = user0.getEmail();
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
    }

    @Test
    public void test2269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2269");
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
        java.lang.Class<?> wildcardClass15 = user0.getClass();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test2270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2270");
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
        user0.setCountry("hi!");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test2271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2271");
        User user0 = new User();
        user0.setPassword("hi!");
        user0.setPassword("");
        java.lang.String str5 = user0.getPassword();
        java.lang.String str6 = user0.getEmail();
        user0.setFirstName("hi!");
        java.lang.String str9 = user0.getCountry();
        java.lang.String str10 = user0.getDob();
        user0.setFirstName("");
        java.lang.String str13 = user0.getLastName();
        user0.setEmail("");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str13);
    }

    @Test
    public void test2272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2272");
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
        user0.setDob("");
        user0.setUsername("");
        user0.setDob("");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
    }

    @Test
    public void test2273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2273");
        User user0 = new User();
        java.lang.String str1 = user0.getPassword();
        user0.setCountry("hi!");
        java.lang.String str4 = user0.getPassword();
        java.lang.String str5 = user0.getPassword();
        java.lang.String str6 = user0.getEmail();
        java.lang.String str7 = user0.getFirstName();
        user0.setDob("");
        user0.setLastName("");
        user0.setDob("hi!");
        user0.setUsername("hi!");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test2274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2274");
        User user0 = new User();
        java.lang.String str1 = user0.getPassword();
        user0.setCountry("hi!");
        java.lang.String str4 = user0.getPassword();
        java.lang.String str5 = user0.getDob();
        user0.setCountry("hi!");
        java.lang.String str8 = user0.getCountry();
        java.lang.String str9 = user0.getEmail();
        user0.setFirstName("hi!");
        user0.setDob("");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test2275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2275");
        User user0 = new User();
        java.lang.String str1 = user0.getPassword();
        java.lang.String str2 = user0.getUsername();
        java.lang.String str3 = user0.getEmail();
        user0.setFirstName("");
        user0.setLastName("hi!");
        user0.setCountry("");
        java.lang.String str10 = user0.getFirstName();
        user0.setEmail("");
        user0.setLastName("hi!");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test2276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2276");
        User user0 = new User();
        java.lang.String str1 = user0.getPassword();
        java.lang.String str2 = user0.getUsername();
        java.lang.String str3 = user0.getEmail();
        user0.setFirstName("");
        user0.setLastName("hi!");
        user0.setUsername("hi!");
        java.lang.String str10 = user0.getUsername();
        user0.setLastName("");
        user0.setFirstName("hi!");
        user0.setLastName("");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
    }

    @Test
    public void test2277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2277");
        User user0 = new User();
        user0.setPassword("hi!");
        user0.setPassword("");
        java.lang.String str5 = user0.getPassword();
        user0.setCountry("hi!");
        user0.setLastName("hi!");
        user0.setFirstName("");
        java.lang.String str12 = user0.getPassword();
        user0.setEmail("");
        user0.setEmail("hi!");
        user0.setFirstName("hi!");
        user0.setLastName("");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test2278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2278");
        User user0 = new User();
        java.lang.String str1 = user0.getPassword();
        user0.setCountry("hi!");
        java.lang.String str4 = user0.getPassword();
        user0.setFirstName("");
        user0.setPassword("hi!");
        java.lang.String str9 = user0.getLastName();
        user0.setPassword("hi!");
        java.lang.String str12 = user0.getCountry();
        user0.setFirstName("");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
    }

    @Test
    public void test2279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2279");
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
        user0.setFirstName("");
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
    public void test2280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2280");
        User user0 = new User();
        java.lang.String str1 = user0.getPassword();
        user0.setCountry("hi!");
        java.lang.String str4 = user0.getPassword();
        user0.setFirstName("");
        java.lang.String str7 = user0.getFirstName();
        user0.setEmail("hi!");
        java.lang.String str10 = user0.getPassword();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test2281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2281");
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
        java.lang.String str17 = user0.getEmail();
        user0.setEmail("");
        java.lang.String str20 = user0.getPassword();
        java.lang.String str21 = user0.getFirstName();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!" + "'", str21, "hi!");
    }

    @Test
    public void test2282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2282");
        User user0 = new User();
        java.lang.String str1 = user0.getPassword();
        user0.setCountry("hi!");
        java.lang.String str4 = user0.getFirstName();
        java.lang.String str5 = user0.getDob();
        java.lang.String str6 = user0.getLastName();
        java.lang.String str7 = user0.getCountry();
        user0.setEmail("hi!");
        user0.setDob("");
        java.lang.String str12 = user0.getEmail();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
    }

    @Test
    public void test2283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2283");
        User user0 = new User();
        java.lang.String str1 = user0.getPassword();
        java.lang.String str2 = user0.getUsername();
        java.lang.String str3 = user0.getEmail();
        user0.setFirstName("");
        user0.setLastName("hi!");
        user0.setUsername("hi!");
        java.lang.String str10 = user0.getUsername();
        user0.setDob("hi!");
        user0.setEmail("");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
    }

    @Test
    public void test2284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2284");
        User user0 = new User();
        user0.setPassword("hi!");
        user0.setPassword("");
        user0.setUsername("");
        user0.setLastName("");
        user0.setFirstName("hi!");
        java.lang.String str11 = user0.getDob();
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test2285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2285");
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
        java.lang.String str17 = user0.getPassword();
        user0.setLastName("");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNull(str17);
    }

    @Test
    public void test2286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2286");
        User user0 = new User();
        java.lang.String str1 = user0.getPassword();
        user0.setUsername("hi!");
        user0.setFirstName("");
        java.lang.String str6 = user0.getPassword();
        user0.setEmail("hi!");
        user0.setCountry("hi!");
        user0.setEmail("hi!");
        java.lang.String str13 = user0.getFirstName();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test2287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2287");
        User user0 = new User();
        user0.setPassword("hi!");
        user0.setPassword("");
        java.lang.String str5 = user0.getPassword();
        java.lang.String str6 = user0.getEmail();
        user0.setCountry("hi!");
        java.lang.String str9 = user0.getDob();
        user0.setEmail("hi!");
        user0.setEmail("hi!");
        java.lang.String str14 = user0.getFirstName();
        java.lang.String str15 = user0.getFirstName();
        user0.setEmail("hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(str15);
    }

    @Test
    public void test2288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2288");
        User user0 = new User();
        java.lang.String str1 = user0.getPassword();
        java.lang.String str2 = user0.getUsername();
        java.lang.String str3 = user0.getEmail();
        user0.setFirstName("");
        user0.setLastName("hi!");
        user0.setUsername("hi!");
        user0.setUsername("");
        java.lang.String str12 = user0.getDob();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test2289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2289");
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
        java.lang.String str22 = user0.getEmail();
        java.lang.String str23 = user0.getUsername();
        java.lang.Class<?> wildcardClass24 = user0.getClass();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(str22);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "hi!" + "'", str23, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test2290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2290");
        User user0 = new User();
        java.lang.String str1 = user0.getPassword();
        java.lang.String str2 = user0.getUsername();
        java.lang.String str3 = user0.getEmail();
        user0.setFirstName("");
        user0.setLastName("hi!");
        user0.setUsername("hi!");
        user0.setEmail("");
        user0.setEmail("");
        java.lang.String str14 = user0.getDob();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str14);
    }

    @Test
    public void test2291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2291");
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
        user0.setCountry("");
        user0.setLastName("");
        user0.setCountry("hi!");
        user0.setFirstName("hi!");
        java.lang.Class<?> wildcardClass22 = user0.getClass();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test2292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2292");
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
        java.lang.String str13 = user0.getLastName();
        java.lang.String str14 = user0.getUsername();
        user0.setLastName("hi!");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test2293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2293");
        User user0 = new User();
        java.lang.String str1 = user0.getPassword();
        java.lang.String str2 = user0.getUsername();
        java.lang.String str3 = user0.getEmail();
        user0.setFirstName("");
        user0.setLastName("hi!");
        user0.setCountry("");
        java.lang.String str10 = user0.getFirstName();
        java.lang.String str11 = user0.getDob();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test2294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2294");
        User user0 = new User();
        user0.setPassword("hi!");
        java.lang.String str3 = user0.getPassword();
        java.lang.String str4 = user0.getPassword();
        java.lang.String str5 = user0.getLastName();
        user0.setLastName("hi!");
        java.lang.String str8 = user0.getLastName();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
    }

    @Test
    public void test2295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2295");
        User user0 = new User();
        java.lang.String str1 = user0.getPassword();
        user0.setUsername("hi!");
        user0.setFirstName("");
        java.lang.String str6 = user0.getPassword();
        user0.setUsername("hi!");
        user0.setPassword("hi!");
        user0.setEmail("");
        user0.setEmail("hi!");
        java.lang.String str15 = user0.getUsername();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
    }

    @Test
    public void test2296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2296");
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
        user0.setUsername("");
        user0.setEmail("");
        user0.setFirstName("");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str14);
    }

    @Test
    public void test2297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2297");
        User user0 = new User();
        java.lang.String str1 = user0.getFirstName();
        java.lang.String str2 = user0.getCountry();
        user0.setCountry("");
        java.lang.String str5 = user0.getFirstName();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str5);
    }

    @Test
    public void test2298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2298");
        User user0 = new User();
        java.lang.String str1 = user0.getPassword();
        user0.setUsername("");
        user0.setFirstName("hi!");
        java.lang.String str6 = user0.getCountry();
        user0.setDob("hi!");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test2299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2299");
        User user0 = new User();
        user0.setLastName("");
        user0.setDob("hi!");
        user0.setCountry("");
        user0.setFirstName("");
    }

    @Test
    public void test2300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2300");
        User user0 = new User();
        java.lang.String str1 = user0.getPassword();
        user0.setCountry("hi!");
        java.lang.String str4 = user0.getFirstName();
        user0.setLastName("hi!");
        user0.setDob("hi!");
        java.lang.String str9 = user0.getEmail();
        user0.setLastName("hi!");
        user0.setDob("");
        user0.setEmail("");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test2301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2301");
        User user0 = new User();
        java.lang.String str1 = user0.getPassword();
        user0.setUsername("hi!");
        user0.setCountry("hi!");
        user0.setFirstName("");
        user0.setCountry("");
        user0.setLastName("");
        java.lang.String str12 = user0.getLastName();
        java.lang.String str13 = user0.getLastName();
        user0.setEmail("");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test2302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2302");
        User user0 = new User();
        java.lang.String str1 = user0.getFirstName();
        java.lang.String str2 = user0.getCountry();
        user0.setFirstName("");
        user0.setUsername("");
        java.lang.String str7 = user0.getLastName();
        user0.setFirstName("");
        user0.setFirstName("");
        user0.setFirstName("hi!");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test2303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2303");
        User user0 = new User();
        java.lang.String str1 = user0.getPassword();
        java.lang.String str2 = user0.getPassword();
        user0.setLastName("hi!");
        java.lang.String str5 = user0.getCountry();
        user0.setFirstName("");
        java.lang.String str8 = user0.getUsername();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test2304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2304");
        User user0 = new User();
        user0.setPassword("hi!");
        user0.setPassword("");
        java.lang.String str5 = user0.getDob();
        user0.setEmail("");
        user0.setUsername("");
        user0.setFirstName("hi!");
        java.lang.String str12 = user0.getDob();
        java.lang.String str13 = user0.getLastName();
        java.lang.String str14 = user0.getDob();
        user0.setLastName("");
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(str14);
    }

    @Test
    public void test2305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2305");
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
        java.lang.String str16 = user0.getDob();
        user0.setLastName("");
        java.lang.String str19 = user0.getCountry();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertNull(str19);
    }

    @Test
    public void test2306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2306");
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
        user0.setLastName("hi!");
        java.lang.String str16 = user0.getPassword();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
    }

    @Test
    public void test2307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2307");
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
        java.lang.String str15 = user0.getLastName();
        java.lang.String str16 = user0.getLastName();
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNull(str16);
    }

    @Test
    public void test2308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2308");
        User user0 = new User();
        java.lang.String str1 = user0.getPassword();
        user0.setPassword("hi!");
        user0.setLastName("");
        java.lang.String str6 = user0.getFirstName();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test2309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2309");
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
        java.lang.String str13 = user0.getCountry();
        user0.setCountry("");
        java.lang.String str16 = user0.getDob();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertNull(str16);
    }

    @Test
    public void test2310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2310");
        User user0 = new User();
        java.lang.String str1 = user0.getPassword();
        java.lang.String str2 = user0.getPassword();
        java.lang.String str3 = user0.getFirstName();
        user0.setPassword("");
        user0.setFirstName("");
        user0.setEmail("");
        user0.setDob("");
        java.lang.String str12 = user0.getPassword();
        user0.setUsername("hi!");
        java.lang.String str15 = user0.getEmail();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
    }

    @Test
    public void test2311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2311");
        User user0 = new User();
        user0.setPassword("hi!");
        user0.setPassword("");
        java.lang.String str5 = user0.getPassword();
        java.lang.String str6 = user0.getPassword();
        user0.setPassword("");
        java.lang.String str9 = user0.getPassword();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test2312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2312");
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
        java.lang.String str14 = user0.getCountry();
        java.lang.String str15 = user0.getCountry();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(str15);
    }

    @Test
    public void test2313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2313");
        User user0 = new User();
        java.lang.String str1 = user0.getPassword();
        user0.setUsername("hi!");
        user0.setCountry("hi!");
        java.lang.String str6 = user0.getLastName();
        user0.setCountry("hi!");
        user0.setPassword("hi!");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test2314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2314");
        User user0 = new User();
        java.lang.String str1 = user0.getFirstName();
        java.lang.String str2 = user0.getCountry();
        user0.setFirstName("");
        user0.setUsername("");
        java.lang.String str7 = user0.getCountry();
        java.lang.String str8 = user0.getFirstName();
        user0.setLastName("");
        user0.setCountry("hi!");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test2315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2315");
        User user0 = new User();
        java.lang.String str1 = user0.getPassword();
        user0.setCountry("hi!");
        java.lang.String str4 = user0.getPassword();
        java.lang.String str5 = user0.getDob();
        java.lang.String str6 = user0.getCountry();
        java.lang.String str7 = user0.getUsername();
        user0.setCountry("");
        user0.setFirstName("hi!");
        java.lang.Class<?> wildcardClass12 = user0.getClass();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test2316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2316");
        User user0 = new User();
        java.lang.String str1 = user0.getPassword();
        user0.setCountry("hi!");
        java.lang.String str4 = user0.getFirstName();
        user0.setLastName("hi!");
        user0.setDob("hi!");
        java.lang.String str9 = user0.getFirstName();
        java.lang.String str10 = user0.getDob();
        user0.setFirstName("hi!");
        user0.setEmail("hi!");
        java.lang.String str15 = user0.getFirstName();
        java.lang.String str16 = user0.getCountry();
        java.lang.String str17 = user0.getLastName();
        user0.setCountry("");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
    }

    @Test
    public void test2317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2317");
        User user0 = new User();
        user0.setPassword("hi!");
        user0.setPassword("");
        java.lang.String str5 = user0.getDob();
        user0.setEmail("");
        user0.setLastName("hi!");
        java.lang.String str10 = user0.getCountry();
        user0.setDob("hi!");
        user0.setFirstName("");
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test2318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2318");
        User user0 = new User();
        java.lang.String str1 = user0.getPassword();
        user0.setCountry("hi!");
        user0.setUsername("hi!");
        user0.setCountry("");
        java.lang.String str8 = user0.getFirstName();
        user0.setPassword("");
        user0.setLastName("hi!");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test2319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2319");
        User user0 = new User();
        java.lang.String str1 = user0.getPassword();
        user0.setUsername("hi!");
        java.lang.String str4 = user0.getUsername();
        user0.setDob("hi!");
        java.lang.String str7 = user0.getEmail();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test2320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2320");
        User user0 = new User();
        java.lang.String str1 = user0.getPassword();
        java.lang.String str2 = user0.getPassword();
        user0.setLastName("hi!");
        java.lang.String str5 = user0.getCountry();
        user0.setCountry("hi!");
        user0.setLastName("");
        user0.setDob("hi!");
        java.lang.String str12 = user0.getFirstName();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test2321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2321");
        User user0 = new User();
        user0.setLastName("");
        java.lang.String str3 = user0.getCountry();
        user0.setEmail("hi!");
        java.lang.String str6 = user0.getEmail();
        java.lang.String str7 = user0.getPassword();
        java.lang.String str8 = user0.getEmail();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
    }

    @Test
    public void test2322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2322");
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
        user0.setDob("");
        java.lang.String str17 = user0.getPassword();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
    }

    @Test
    public void test2323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2323");
        User user0 = new User();
        java.lang.String str1 = user0.getPassword();
        user0.setUsername("hi!");
        user0.setCountry("hi!");
        user0.setFirstName("");
        user0.setCountry("");
        java.lang.String str10 = user0.getPassword();
        user0.setDob("");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test2324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2324");
        User user0 = new User();
        user0.setPassword("hi!");
        user0.setPassword("");
        java.lang.String str5 = user0.getPassword();
        user0.setCountry("hi!");
        user0.setLastName("hi!");
        user0.setFirstName("");
        user0.setPassword("");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
    }

    @Test
    public void test2325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2325");
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
        java.lang.String str13 = user0.getUsername();
        java.lang.String str14 = user0.getFirstName();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
    }

    @Test
    public void test2326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2326");
        User user0 = new User();
        java.lang.String str1 = user0.getFirstName();
        user0.setPassword("");
        user0.setEmail("hi!");
        java.lang.String str6 = user0.getLastName();
        java.lang.String str7 = user0.getPassword();
        java.lang.String str8 = user0.getPassword();
        java.lang.String str9 = user0.getUsername();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test2327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2327");
        User user0 = new User();
        java.lang.String str1 = user0.getPassword();
        user0.setCountry("hi!");
        java.lang.String str4 = user0.getFirstName();
        user0.setLastName("hi!");
        user0.setDob("hi!");
        java.lang.String str9 = user0.getLastName();
        user0.setEmail("");
        java.lang.String str12 = user0.getPassword();
        user0.setLastName("");
        java.lang.String str15 = user0.getDob();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
    }

    @Test
    public void test2328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2328");
        User user0 = new User();
        java.lang.String str1 = user0.getPassword();
        java.lang.String str2 = user0.getUsername();
        java.lang.String str3 = user0.getEmail();
        java.lang.String str4 = user0.getLastName();
        java.lang.String str5 = user0.getFirstName();
        user0.setFirstName("");
        user0.setCountry("");
        java.lang.String str10 = user0.getUsername();
        java.lang.String str11 = user0.getLastName();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test2329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2329");
        User user0 = new User();
        user0.setPassword("hi!");
        user0.setPassword("");
        java.lang.String str5 = user0.getPassword();
        java.lang.String str6 = user0.getPassword();
        user0.setPassword("");
        user0.setCountry("");
        user0.setEmail("");
        user0.setUsername("hi!");
        java.lang.String str15 = user0.getEmail();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
    }

    @Test
    public void test2330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2330");
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
        java.lang.String str18 = user0.getLastName();
        java.lang.String str19 = user0.getPassword();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertNull(str19);
    }

    @Test
    public void test2331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2331");
        User user0 = new User();
        user0.setPassword("hi!");
        user0.setLastName("");
        java.lang.String str5 = user0.getFirstName();
        java.lang.String str6 = user0.getCountry();
        java.lang.String str7 = user0.getCountry();
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test2332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2332");
        User user0 = new User();
        java.lang.String str1 = user0.getPassword();
        user0.setCountry("hi!");
        user0.setUsername("hi!");
        user0.setCountry("");
        java.lang.String str8 = user0.getFirstName();
        user0.setPassword("");
        java.lang.String str11 = user0.getLastName();
        java.lang.String str12 = user0.getEmail();
        user0.setPassword("hi!");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test2333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2333");
        User user0 = new User();
        java.lang.String str1 = user0.getPassword();
        java.lang.String str2 = user0.getUsername();
        java.lang.String str3 = user0.getEmail();
        user0.setUsername("");
        user0.setPassword("hi!");
        java.lang.String str8 = user0.getLastName();
        user0.setPassword("hi!");
        user0.setUsername("");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test2334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2334");
        User user0 = new User();
        java.lang.String str1 = user0.getPassword();
        user0.setCountry("hi!");
        java.lang.String str4 = user0.getFirstName();
        java.lang.String str5 = user0.getDob();
        java.lang.String str6 = user0.getLastName();
        user0.setFirstName("hi!");
        user0.setUsername("");
        java.lang.String str11 = user0.getLastName();
        user0.setEmail("");
        user0.setLastName("");
        user0.setFirstName("");
        java.lang.String str18 = user0.getDob();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str18);
    }

    @Test
    public void test2335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2335");
        User user0 = new User();
        java.lang.String str1 = user0.getFirstName();
        java.lang.String str2 = user0.getCountry();
        user0.setFirstName("");
        java.lang.String str5 = user0.getFirstName();
        user0.setUsername("");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
    }

    @Test
    public void test2336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2336");
        User user0 = new User();
        java.lang.String str1 = user0.getPassword();
        user0.setCountry("hi!");
        java.lang.String str4 = user0.getFirstName();
        user0.setFirstName("hi!");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str4);
    }

    @Test
    public void test2337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2337");
        User user0 = new User();
        java.lang.String str1 = user0.getPassword();
        user0.setUsername("hi!");
        user0.setCountry("hi!");
        java.lang.String str6 = user0.getLastName();
        user0.setUsername("");
        java.lang.String str9 = user0.getLastName();
        java.lang.String str10 = user0.getPassword();
        user0.setPassword("hi!");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test2338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2338");
        User user0 = new User();
        java.lang.String str1 = user0.getPassword();
        user0.setCountry("hi!");
        user0.setUsername("hi!");
        java.lang.String str6 = user0.getUsername();
        user0.setUsername("hi!");
        user0.setUsername("hi!");
        java.lang.String str11 = user0.getPassword();
        user0.setUsername("hi!");
        java.lang.String str14 = user0.getDob();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str14);
    }

    @Test
    public void test2339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2339");
        User user0 = new User();
        java.lang.String str1 = user0.getPassword();
        user0.setCountry("hi!");
        java.lang.String str4 = user0.getFirstName();
        java.lang.String str5 = user0.getFirstName();
        java.lang.String str6 = user0.getLastName();
        java.lang.String str7 = user0.getLastName();
        user0.setCountry("hi!");
        user0.setDob("hi!");
        user0.setEmail("");
        user0.setLastName("hi!");
        java.lang.String str16 = user0.getUsername();
        user0.setDob("hi!");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str16);
    }

    @Test
    public void test2340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2340");
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
        user0.setPassword("hi!");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
    }

    @Test
    public void test2341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2341");
        User user0 = new User();
        java.lang.String str1 = user0.getPassword();
        user0.setCountry("hi!");
        java.lang.String str4 = user0.getFirstName();
        java.lang.String str5 = user0.getDob();
        java.lang.String str6 = user0.getLastName();
        java.lang.String str7 = user0.getUsername();
        user0.setPassword("hi!");
        java.lang.String str10 = user0.getCountry();
        user0.setFirstName("hi!");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
    }

    @Test
    public void test2342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2342");
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
        user0.setPassword("");
        java.lang.String str21 = user0.getUsername();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(str21);
    }

    @Test
    public void test2343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2343");
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
        java.lang.String str18 = user0.getEmail();
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
    }

    @Test
    public void test2344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2344");
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
        user0.setCountry("");
        user0.setCountry("hi!");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str14);
    }

    @Test
    public void test2345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2345");
        User user0 = new User();
        java.lang.String str1 = user0.getPassword();
        user0.setUsername("hi!");
        user0.setFirstName("");
        java.lang.String str6 = user0.getPassword();
        user0.setUsername("hi!");
        user0.setDob("");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test2346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2346");
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
        user0.setDob("hi!");
        user0.setUsername("");
        java.lang.String str17 = user0.getEmail();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
    }

    @Test
    public void test2347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2347");
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
        user0.setEmail("hi!");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test2348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2348");
        User user0 = new User();
        java.lang.String str1 = user0.getPassword();
        user0.setCountry("hi!");
        java.lang.String str4 = user0.getPassword();
        user0.setFirstName("");
        user0.setLastName("hi!");
        java.lang.String str9 = user0.getEmail();
        java.lang.String str10 = user0.getDob();
        java.lang.String str11 = user0.getCountry();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
    }

    @Test
    public void test2349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2349");
        User user0 = new User();
        user0.setPassword("hi!");
        user0.setPassword("");
        java.lang.String str5 = user0.getPassword();
        user0.setCountry("hi!");
        user0.setLastName("hi!");
        user0.setFirstName("");
        java.lang.String str12 = user0.getFirstName();
        java.lang.String str13 = user0.getUsername();
        user0.setCountry("hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNull(str13);
    }

    @Test
    public void test2350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2350");
        User user0 = new User();
        java.lang.String str1 = user0.getPassword();
        user0.setUsername("hi!");
        user0.setCountry("hi!");
        java.lang.String str6 = user0.getLastName();
        user0.setUsername("");
        java.lang.String str9 = user0.getLastName();
        user0.setPassword("hi!");
        user0.setLastName("hi!");
        user0.setCountry("hi!");
        user0.setUsername("");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test2351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2351");
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
        java.lang.String str15 = user0.getFirstName();
        java.lang.String str16 = user0.getUsername();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
    }

    @Test
    public void test2352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2352");
        User user0 = new User();
        java.lang.String str1 = user0.getPassword();
        user0.setCountry("hi!");
        java.lang.String str4 = user0.getFirstName();
        java.lang.String str5 = user0.getDob();
        java.lang.String str6 = user0.getLastName();
        user0.setFirstName("hi!");
        user0.setFirstName("hi!");
        java.lang.Class<?> wildcardClass11 = user0.getClass();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test2353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2353");
        User user0 = new User();
        java.lang.String str1 = user0.getPassword();
        java.lang.String str2 = user0.getUsername();
        user0.setDob("");
        java.lang.String str5 = user0.getEmail();
        java.lang.String str6 = user0.getCountry();
        user0.setLastName("");
        java.lang.String str9 = user0.getLastName();
        user0.setCountry("");
        user0.setEmail("hi!");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test2354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2354");
        User user0 = new User();
        user0.setPassword("hi!");
        java.lang.String str3 = user0.getPassword();
        java.lang.String str4 = user0.getFirstName();
        java.lang.String str5 = user0.getLastName();
        user0.setFirstName("");
        java.lang.String str8 = user0.getLastName();
        user0.setUsername("");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test2355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2355");
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
        user0.setPassword("");
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
    public void test2356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2356");
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
        user0.setEmail("");
        java.lang.String str19 = user0.getUsername();
        java.lang.String str20 = user0.getUsername();
        java.lang.String str21 = user0.getDob();
        user0.setUsername("");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!" + "'", str21, "hi!");
    }

    @Test
    public void test2357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2357");
        User user0 = new User();
        java.lang.String str1 = user0.getPassword();
        java.lang.String str2 = user0.getPassword();
        java.lang.String str3 = user0.getPassword();
        java.lang.String str4 = user0.getDob();
        user0.setFirstName("hi!");
        user0.setCountry("hi!");
        user0.setDob("hi!");
        java.lang.String str11 = user0.getFirstName();
        user0.setLastName("hi!");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
    }

    @Test
    public void test2358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2358");
        User user0 = new User();
        user0.setPassword("hi!");
        user0.setPassword("");
        java.lang.String str5 = user0.getPassword();
        user0.setCountry("hi!");
        user0.setLastName("hi!");
        user0.setFirstName("");
        java.lang.String str12 = user0.getFirstName();
        java.lang.String str13 = user0.getUsername();
        user0.setUsername("");
        java.lang.String str16 = user0.getUsername();
        java.lang.String str17 = user0.getDob();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertNull(str17);
    }

    @Test
    public void test2359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2359");
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
        java.lang.String str14 = user0.getLastName();
        user0.setLastName("hi!");
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
    public void test2360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2360");
        User user0 = new User();
        java.lang.String str1 = user0.getPassword();
        java.lang.String str2 = user0.getPassword();
        java.lang.String str3 = user0.getPassword();
        user0.setLastName("");
        user0.setUsername("hi!");
        user0.setUsername("");
        user0.setFirstName("");
        user0.setLastName("");
        java.lang.String str14 = user0.getEmail();
        java.lang.String str15 = user0.getPassword();
        user0.setFirstName("");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(str15);
    }

    @Test
    public void test2361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2361");
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
        user0.setUsername("hi!");
        java.lang.String str18 = user0.getLastName();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertNull(str18);
    }

    @Test
    public void test2362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2362");
        User user0 = new User();
        java.lang.String str1 = user0.getPassword();
        user0.setCountry("hi!");
        java.lang.String str4 = user0.getUsername();
        user0.setPassword("");
        user0.setDob("hi!");
        user0.setDob("");
        java.lang.String str11 = user0.getPassword();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test2363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2363");
        User user0 = new User();
        java.lang.String str1 = user0.getPassword();
        user0.setUsername("hi!");
        user0.setFirstName("");
        java.lang.String str6 = user0.getPassword();
        user0.setLastName("");
        java.lang.String str9 = user0.getDob();
        user0.setDob("");
        java.lang.String str12 = user0.getFirstName();
        java.lang.String str13 = user0.getFirstName();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test2364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2364");
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
        user0.setLastName("");
        user0.setEmail("");
        java.lang.String str17 = user0.getEmail();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
    }

    @Test
    public void test2365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2365");
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
        java.lang.String str24 = user0.getPassword();
        user0.setLastName("");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertNull(str24);
    }

    @Test
    public void test2366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2366");
        User user0 = new User();
        java.lang.String str1 = user0.getPassword();
        user0.setUsername("");
        user0.setFirstName("hi!");
        java.lang.String str6 = user0.getPassword();
        user0.setCountry("hi!");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test2367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2367");
        User user0 = new User();
        java.lang.String str1 = user0.getPassword();
        java.lang.String str2 = user0.getPassword();
        java.lang.String str3 = user0.getFirstName();
        user0.setDob("hi!");
        java.lang.String str6 = user0.getEmail();
        user0.setEmail("");
        java.lang.String str9 = user0.getFirstName();
        java.lang.String str10 = user0.getLastName();
        java.lang.String str11 = user0.getUsername();
        user0.setPassword("hi!");
        java.lang.String str14 = user0.getPassword();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
    }

    @Test
    public void test2368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2368");
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
        java.lang.String str15 = user0.getPassword();
        java.lang.Class<?> wildcardClass16 = user0.getClass();
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test2369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2369");
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
        user0.setLastName("");
        java.lang.String str15 = user0.getDob();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
    }

    @Test
    public void test2370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2370");
        User user0 = new User();
        java.lang.String str1 = user0.getPassword();
        user0.setCountry("hi!");
        java.lang.String str4 = user0.getFirstName();
        java.lang.String str5 = user0.getDob();
        java.lang.String str6 = user0.getLastName();
        user0.setLastName("");
        user0.setDob("hi!");
        java.lang.String str11 = user0.getUsername();
        user0.setUsername("");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test2371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2371");
        User user0 = new User();
        java.lang.String str1 = user0.getPassword();
        java.lang.String str2 = user0.getPassword();
        user0.setLastName("hi!");
        java.lang.String str5 = user0.getCountry();
        java.lang.String str6 = user0.getEmail();
        user0.setDob("");
        user0.setLastName("hi!");
        user0.setCountry("hi!");
        java.lang.String str13 = user0.getCountry();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
    }

    @Test
    public void test2372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2372");
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
        java.lang.String str16 = user0.getEmail();
        java.lang.String str17 = user0.getEmail();
        java.lang.String str18 = user0.getCountry();
        java.lang.String str19 = user0.getDob();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertNull(str19);
    }

    @Test
    public void test2373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2373");
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
        java.lang.String str15 = user0.getFirstName();
        user0.setEmail("");
        java.lang.String str18 = user0.getLastName();
        user0.setPassword("hi!");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertNull(str18);
    }

    @Test
    public void test2374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2374");
        User user0 = new User();
        java.lang.String str1 = user0.getFirstName();
        java.lang.String str2 = user0.getPassword();
        java.lang.String str3 = user0.getPassword();
        java.lang.String str4 = user0.getCountry();
        user0.setCountry("hi!");
        user0.setDob("");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
    }

    @Test
    public void test2375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2375");
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
    public void test2376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2376");
        User user0 = new User();
        java.lang.String str1 = user0.getPassword();
        user0.setUsername("hi!");
        user0.setCountry("hi!");
        user0.setFirstName("");
        user0.setCountry("");
        java.lang.String str10 = user0.getLastName();
        user0.setCountry("hi!");
        java.lang.String str13 = user0.getFirstName();
        java.lang.String str14 = user0.getLastName();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNull(str14);
    }

    @Test
    public void test2377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2377");
        User user0 = new User();
        java.lang.String str1 = user0.getPassword();
        java.lang.String str2 = user0.getUsername();
        java.lang.String str3 = user0.getCountry();
        user0.setPassword("");
        user0.setLastName("");
        user0.setUsername("");
        user0.setLastName("hi!");
        user0.setDob("");
        user0.setEmail("hi!");
        user0.setFirstName("hi!");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test2378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2378");
        User user0 = new User();
        java.lang.String str1 = user0.getPassword();
        java.lang.String str2 = user0.getUsername();
        java.lang.String str3 = user0.getEmail();
        user0.setUsername("");
        java.lang.String str6 = user0.getFirstName();
        java.lang.String str7 = user0.getUsername();
        user0.setPassword("");
        java.lang.String str10 = user0.getCountry();
        user0.setLastName("hi!");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test2379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2379");
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
        java.lang.Class<?> wildcardClass15 = user0.getClass();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test2380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2380");
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
        java.lang.String str15 = user0.getCountry();
        java.lang.String str16 = user0.getCountry();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
    }

    @Test
    public void test2381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2381");
        User user0 = new User();
        java.lang.String str1 = user0.getPassword();
        user0.setCountry("hi!");
        user0.setUsername("hi!");
        java.lang.String str6 = user0.getUsername();
        user0.setLastName("");
        java.lang.String str9 = user0.getLastName();
        user0.setFirstName("hi!");
        java.lang.String str12 = user0.getPassword();
        java.lang.String str13 = user0.getEmail();
        user0.setEmail("hi!");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str13);
    }

    @Test
    public void test2382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2382");
        User user0 = new User();
        java.lang.String str1 = user0.getPassword();
        user0.setCountry("hi!");
        java.lang.String str4 = user0.getFirstName();
        java.lang.String str5 = user0.getDob();
        java.lang.String str6 = user0.getLastName();
        user0.setLastName("");
        user0.setDob("hi!");
        java.lang.String str11 = user0.getDob();
        user0.setCountry("hi!");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
    }

    @Test
    public void test2383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2383");
        User user0 = new User();
        user0.setPassword("hi!");
        user0.setPassword("");
        java.lang.String str5 = user0.getPassword();
        java.lang.String str6 = user0.getEmail();
        java.lang.String str7 = user0.getEmail();
        java.lang.String str8 = user0.getFirstName();
        java.lang.String str9 = user0.getFirstName();
        java.lang.String str10 = user0.getPassword();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test2384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2384");
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
        user0.setDob("hi!");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test2385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2385");
        User user0 = new User();
        java.lang.String str1 = user0.getPassword();
        user0.setCountry("hi!");
        java.lang.String str4 = user0.getUsername();
        user0.setPassword("");
        user0.setFirstName("");
        java.lang.String str9 = user0.getUsername();
        user0.setCountry("");
        user0.setCountry("");
        user0.setDob("hi!");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test2386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2386");
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
        java.lang.String str18 = user0.getLastName();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertNull(str18);
    }

    @Test
    public void test2387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2387");
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
        user0.setUsername("");
        java.lang.String str14 = user0.getLastName();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str14);
    }

    @Test
    public void test2388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2388");
        User user0 = new User();
        java.lang.String str1 = user0.getPassword();
        java.lang.String str2 = user0.getPassword();
        user0.setLastName("hi!");
        java.lang.String str5 = user0.getCountry();
        java.lang.String str6 = user0.getEmail();
        user0.setDob("");
        user0.setLastName("hi!");
        user0.setLastName("hi!");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test2389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2389");
        User user0 = new User();
        java.lang.String str1 = user0.getPassword();
        user0.setCountry("hi!");
        java.lang.String str4 = user0.getFirstName();
        java.lang.String str5 = user0.getFirstName();
        java.lang.String str6 = user0.getLastName();
        java.lang.String str7 = user0.getLastName();
        user0.setCountry("hi!");
        java.lang.String str10 = user0.getFirstName();
        java.lang.String str11 = user0.getPassword();
        java.lang.String str12 = user0.getDob();
        user0.setPassword("");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test2390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2390");
        User user0 = new User();
        java.lang.String str1 = user0.getPassword();
        user0.setCountry("hi!");
        java.lang.String str4 = user0.getUsername();
        java.lang.String str5 = user0.getPassword();
        user0.setDob("");
        user0.setDob("");
        user0.setPassword("hi!");
        java.lang.String str12 = user0.getEmail();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test2391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2391");
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
        user0.setFirstName("");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test2392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2392");
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
        user0.setLastName("hi!");
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
    public void test2393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2393");
        User user0 = new User();
        java.lang.String str1 = user0.getPassword();
        java.lang.String str2 = user0.getUsername();
        java.lang.String str3 = user0.getCountry();
        user0.setEmail("hi!");
        java.lang.String str6 = user0.getPassword();
        java.lang.String str7 = user0.getFirstName();
        user0.setDob("hi!");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test2394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2394");
        User user0 = new User();
        java.lang.String str1 = user0.getPassword();
        user0.setCountry("hi!");
        java.lang.String str4 = user0.getUsername();
        user0.setPassword("");
        user0.setFirstName("hi!");
        user0.setCountry("");
        user0.setUsername("hi!");
        user0.setPassword("hi!");
        java.lang.String str15 = user0.getEmail();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str15);
    }

    @Test
    public void test2395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2395");
        User user0 = new User();
        user0.setPassword("hi!");
        java.lang.String str3 = user0.getPassword();
        java.lang.String str4 = user0.getFirstName();
        java.lang.String str5 = user0.getDob();
        java.lang.String str6 = user0.getLastName();
        java.lang.String str7 = user0.getDob();
        user0.setFirstName("");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test2396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2396");
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
        user0.setDob("hi!");
        java.lang.Class<?> wildcardClass18 = user0.getClass();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test2397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2397");
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
        java.lang.String str20 = user0.getFirstName();
        java.lang.Class<?> wildcardClass21 = user0.getClass();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test2398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2398");
        User user0 = new User();
        java.lang.String str1 = user0.getPassword();
        java.lang.String str2 = user0.getPassword();
        java.lang.String str3 = user0.getEmail();
        user0.setCountry("");
        user0.setPassword("");
        java.lang.String str8 = user0.getEmail();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test2399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2399");
        User user0 = new User();
        java.lang.String str1 = user0.getPassword();
        java.lang.String str2 = user0.getUsername();
        java.lang.String str3 = user0.getCountry();
        user0.setPassword("");
        java.lang.String str6 = user0.getPassword();
        user0.setPassword("");
        user0.setUsername("");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test2400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2400");
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
        java.lang.String str12 = user0.getPassword();
        java.lang.String str13 = user0.getLastName();
        java.lang.Class<?> wildcardClass14 = user0.getClass();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test2401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2401");
        User user0 = new User();
        java.lang.String str1 = user0.getPassword();
        java.lang.String str2 = user0.getUsername();
        java.lang.String str3 = user0.getEmail();
        user0.setUsername("");
        java.lang.String str6 = user0.getFirstName();
        java.lang.String str7 = user0.getUsername();
        java.lang.String str8 = user0.getCountry();
        java.lang.String str9 = user0.getFirstName();
        user0.setCountry("hi!");
        java.lang.String str12 = user0.getDob();
        java.lang.String str13 = user0.getCountry();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
    }

    @Test
    public void test2402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2402");
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
        java.lang.String str20 = user0.getLastName();
        user0.setLastName("");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertNull(str20);
    }

    @Test
    public void test2403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2403");
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
        java.lang.String str12 = user0.getEmail();
        java.lang.String str13 = user0.getUsername();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str13);
    }

    @Test
    public void test2404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2404");
        User user0 = new User();
        user0.setPassword("hi!");
        user0.setPassword("");
        java.lang.String str5 = user0.getPassword();
        java.lang.String str6 = user0.getEmail();
        java.lang.String str7 = user0.getPassword();
        java.lang.String str8 = user0.getEmail();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test2405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2405");
        User user0 = new User();
        java.lang.String str1 = user0.getPassword();
        user0.setCountry("hi!");
        java.lang.String str4 = user0.getFirstName();
        java.lang.String str5 = user0.getFirstName();
        java.lang.String str6 = user0.getLastName();
        user0.setFirstName("hi!");
        java.lang.String str9 = user0.getEmail();
        java.lang.String str10 = user0.getDob();
        java.lang.String str11 = user0.getLastName();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test2406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2406");
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
        java.lang.String str22 = user0.getUsername();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertNull(str22);
    }

    @Test
    public void test2407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2407");
        User user0 = new User();
        java.lang.String str1 = user0.getFirstName();
        user0.setPassword("");
        java.lang.String str4 = user0.getEmail();
        user0.setPassword("hi!");
        user0.setDob("");
        user0.setFirstName("hi!");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str4);
    }

    @Test
    public void test2408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2408");
        User user0 = new User();
        java.lang.String str1 = user0.getPassword();
        user0.setCountry("hi!");
        java.lang.String str4 = user0.getUsername();
        user0.setPassword("");
        user0.setFirstName("hi!");
        user0.setCountry("");
        user0.setUsername("hi!");
        user0.setPassword("hi!");
        java.lang.String str15 = user0.getFirstName();
        user0.setLastName("hi!");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
    }

    @Test
    public void test2409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2409");
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
        user0.setFirstName("hi!");
        user0.setEmail("hi!");
        user0.setEmail("hi!");
        user0.setPassword("");
        user0.setCountry("hi!");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test2410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2410");
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
        user0.setLastName("hi!");
        java.lang.String str24 = user0.getUsername();
        user0.setFirstName("hi!");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "hi!" + "'", str24, "hi!");
    }

    @Test
    public void test2411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2411");
        User user0 = new User();
        java.lang.String str1 = user0.getPassword();
        user0.setUsername("");
        user0.setLastName("");
        java.lang.String str6 = user0.getUsername();
        java.lang.String str7 = user0.getFirstName();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test2412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2412");
        User user0 = new User();
        java.lang.String str1 = user0.getPassword();
        user0.setUsername("hi!");
        user0.setFirstName("");
        java.lang.String str6 = user0.getPassword();
        user0.setEmail("hi!");
        user0.setPassword("");
        java.lang.String str11 = user0.getDob();
        java.lang.String str12 = user0.getUsername();
        java.lang.String str13 = user0.getDob();
        java.lang.String str14 = user0.getDob();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(str14);
    }

    @Test
    public void test2413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2413");
        User user0 = new User();
        java.lang.String str1 = user0.getPassword();
        java.lang.String str2 = user0.getUsername();
        java.lang.String str3 = user0.getEmail();
        user0.setUsername("");
        java.lang.String str6 = user0.getFirstName();
        java.lang.String str7 = user0.getCountry();
        user0.setUsername("");
        user0.setEmail("hi!");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test2414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2414");
        User user0 = new User();
        java.lang.String str1 = user0.getPassword();
        java.lang.String str2 = user0.getUsername();
        java.lang.String str3 = user0.getEmail();
        user0.setUsername("");
        user0.setDob("hi!");
        java.lang.String str8 = user0.getCountry();
        java.lang.String str9 = user0.getLastName();
        java.lang.String str10 = user0.getDob();
        java.lang.String str11 = user0.getCountry();
        user0.setEmail("hi!");
        java.lang.String str14 = user0.getCountry();
        java.lang.String str15 = user0.getUsername();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
    }

    @Test
    public void test2415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2415");
        User user0 = new User();
        user0.setPassword("hi!");
        user0.setPassword("");
        java.lang.String str5 = user0.getPassword();
        user0.setCountry("hi!");
        java.lang.String str8 = user0.getPassword();
        user0.setEmail("hi!");
        java.lang.String str11 = user0.getUsername();
        user0.setCountry("hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test2416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2416");
        User user0 = new User();
        java.lang.String str1 = user0.getPassword();
        java.lang.String str2 = user0.getPassword();
        user0.setLastName("hi!");
        user0.setEmail("hi!");
        java.lang.String str7 = user0.getCountry();
        java.lang.String str8 = user0.getDob();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test2417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2417");
        User user0 = new User();
        java.lang.String str1 = user0.getPassword();
        user0.setCountry("hi!");
        user0.setUsername("hi!");
        java.lang.String str6 = user0.getUsername();
        user0.setLastName("");
        java.lang.String str9 = user0.getLastName();
        java.lang.String str10 = user0.getUsername();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
    }

    @Test
    public void test2418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2418");
        User user0 = new User();
        user0.setPassword("hi!");
        java.lang.String str3 = user0.getPassword();
        java.lang.String str4 = user0.getFirstName();
        java.lang.String str5 = user0.getPassword();
        user0.setUsername("");
        java.lang.String str8 = user0.getUsername();
        user0.setDob("");
        user0.setLastName("hi!");
        user0.setFirstName("");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test2419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2419");
        User user0 = new User();
        java.lang.String str1 = user0.getPassword();
        java.lang.String str2 = user0.getUsername();
        java.lang.String str3 = user0.getEmail();
        java.lang.String str4 = user0.getLastName();
        user0.setDob("");
        java.lang.String str7 = user0.getFirstName();
        user0.setEmail("");
        java.lang.Class<?> wildcardClass10 = user0.getClass();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test2420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2420");
        User user0 = new User();
        java.lang.String str1 = user0.getPassword();
        user0.setUsername("hi!");
        java.lang.String str4 = user0.getDob();
        user0.setUsername("");
        user0.setLastName("");
        user0.setEmail("hi!");
        user0.setEmail("");
        java.lang.String str13 = user0.getPassword();
        user0.setPassword("");
        java.lang.String str16 = user0.getFirstName();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(str16);
    }

    @Test
    public void test2421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2421");
        User user0 = new User();
        user0.setPassword("hi!");
        user0.setPassword("");
        java.lang.String str5 = user0.getPassword();
        java.lang.String str6 = user0.getEmail();
        user0.setFirstName("hi!");
        user0.setFirstName("hi!");
        java.lang.String str11 = user0.getPassword();
        java.lang.String str12 = user0.getUsername();
        user0.setPassword("");
        user0.setUsername("");
        user0.setEmail("hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test2422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2422");
        User user0 = new User();
        java.lang.String str1 = user0.getPassword();
        user0.setUsername("hi!");
        user0.setCountry("hi!");
        java.lang.String str6 = user0.getLastName();
        user0.setUsername("");
        java.lang.String str9 = user0.getLastName();
        java.lang.String str10 = user0.getEmail();
        user0.setEmail("");
        java.lang.String str13 = user0.getUsername();
        java.lang.String str14 = user0.getEmail();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test2423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2423");
        User user0 = new User();
        java.lang.String str1 = user0.getPassword();
        user0.setUsername("hi!");
        user0.setFirstName("");
        java.lang.String str6 = user0.getPassword();
        user0.setEmail("hi!");
        user0.setCountry("hi!");
        java.lang.String str11 = user0.getDob();
        java.lang.String str12 = user0.getDob();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test2424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2424");
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
        java.lang.String str12 = user0.getFirstName();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
    }

    @Test
    public void test2425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2425");
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
        java.lang.String str14 = user0.getEmail();
        java.lang.Class<?> wildcardClass15 = user0.getClass();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test2426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2426");
        User user0 = new User();
        user0.setPassword("hi!");
        user0.setPassword("");
        java.lang.String str5 = user0.getPassword();
        java.lang.String str6 = user0.getEmail();
        java.lang.String str7 = user0.getEmail();
        java.lang.String str8 = user0.getFirstName();
        java.lang.String str9 = user0.getFirstName();
        user0.setEmail("");
        java.lang.String str12 = user0.getUsername();
        user0.setUsername("");
        java.lang.String str15 = user0.getFirstName();
        java.lang.String str16 = user0.getFirstName();
        user0.setLastName("");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNull(str16);
    }

    @Test
    public void test2427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2427");
        User user0 = new User();
        java.lang.String str1 = user0.getPassword();
        java.lang.String str2 = user0.getPassword();
        user0.setLastName("hi!");
        java.lang.String str5 = user0.getCountry();
        java.lang.String str6 = user0.getEmail();
        java.lang.String str7 = user0.getDob();
        user0.setUsername("hi!");
        user0.setEmail("hi!");
        java.lang.String str12 = user0.getCountry();
        user0.setCountry("");
        user0.setEmail("hi!");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test2428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2428");
        User user0 = new User();
        java.lang.String str1 = user0.getPassword();
        user0.setCountry("hi!");
        java.lang.String str4 = user0.getUsername();
        user0.setPassword("");
        user0.setFirstName("");
        java.lang.String str9 = user0.getLastName();
        user0.setCountry("hi!");
        java.lang.String str12 = user0.getLastName();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test2429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2429");
        User user0 = new User();
        java.lang.String str1 = user0.getPassword();
        user0.setCountry("hi!");
        java.lang.String str4 = user0.getFirstName();
        java.lang.String str5 = user0.getFirstName();
        java.lang.String str6 = user0.getLastName();
        user0.setLastName("");
        user0.setEmail("");
        java.lang.String str11 = user0.getLastName();
        user0.setDob("");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test2430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2430");
        User user0 = new User();
        user0.setPassword("hi!");
        user0.setPassword("");
        java.lang.String str5 = user0.getPassword();
        java.lang.String str6 = user0.getEmail();
        user0.setFirstName("hi!");
        user0.setFirstName("hi!");
        java.lang.String str11 = user0.getPassword();
        java.lang.String str12 = user0.getUsername();
        user0.setPassword("");
        user0.setUsername("");
        user0.setFirstName("");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test2431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2431");
        User user0 = new User();
        java.lang.String str1 = user0.getPassword();
        user0.setUsername("hi!");
        java.lang.String str4 = user0.getUsername();
        java.lang.String str5 = user0.getEmail();
        java.lang.String str6 = user0.getPassword();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test2432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2432");
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
        java.lang.String str13 = user0.getPassword();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str13);
    }

    @Test
    public void test2433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2433");
        User user0 = new User();
        user0.setPassword("hi!");
        user0.setPassword("");
        java.lang.String str5 = user0.getPassword();
        java.lang.String str6 = user0.getEmail();
        java.lang.String str7 = user0.getLastName();
        java.lang.String str8 = user0.getEmail();
        java.lang.String str9 = user0.getUsername();
        java.lang.String str10 = user0.getFirstName();
        java.lang.String str11 = user0.getPassword();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test2434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2434");
        User user0 = new User();
        java.lang.String str1 = user0.getPassword();
        user0.setCountry("hi!");
        user0.setUsername("hi!");
        user0.setPassword("");
        user0.setCountry("hi!");
        java.lang.String str10 = user0.getEmail();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test2435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2435");
        User user0 = new User();
        java.lang.String str1 = user0.getPassword();
        user0.setUsername("hi!");
        user0.setFirstName("");
        java.lang.String str6 = user0.getPassword();
        user0.setLastName("");
        java.lang.String str9 = user0.getDob();
        user0.setFirstName("");
        user0.setDob("");
        user0.setCountry("");
        user0.setUsername("");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test2436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2436");
        User user0 = new User();
        java.lang.String str1 = user0.getPassword();
        user0.setUsername("hi!");
        user0.setCountry("hi!");
        java.lang.String str6 = user0.getLastName();
        java.lang.String str7 = user0.getEmail();
        java.lang.String str8 = user0.getEmail();
        java.lang.String str9 = user0.getPassword();
        java.lang.String str10 = user0.getCountry();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
    }

    @Test
    public void test2437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2437");
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
        java.lang.Class<?> wildcardClass17 = user0.getClass();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test2438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2438");
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
        user0.setDob("");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertNull(str14);
    }

    @Test
    public void test2439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2439");
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
        java.lang.String str23 = user0.getDob();
        java.lang.String str24 = user0.getLastName();
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
    public void test2440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2440");
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
        user0.setLastName("");
        user0.setFirstName("hi!");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str14);
    }

    @Test
    public void test2441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2441");
        User user0 = new User();
        java.lang.String str1 = user0.getPassword();
        user0.setCountry("hi!");
        java.lang.String str4 = user0.getFirstName();
        user0.setLastName("hi!");
        user0.setDob("hi!");
        java.lang.String str9 = user0.getFirstName();
        java.lang.String str10 = user0.getDob();
        java.lang.String str11 = user0.getLastName();
        java.lang.String str12 = user0.getCountry();
        java.lang.String str13 = user0.getPassword();
        java.lang.Class<?> wildcardClass14 = user0.getClass();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test2442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2442");
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
        java.lang.String str18 = user0.getLastName();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(str18);
    }

    @Test
    public void test2443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2443");
        User user0 = new User();
        java.lang.String str1 = user0.getPassword();
        user0.setUsername("hi!");
        user0.setFirstName("");
        java.lang.String str6 = user0.getPassword();
        user0.setEmail("hi!");
        user0.setPassword("");
        java.lang.String str11 = user0.getDob();
        java.lang.String str12 = user0.getEmail();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
    }

    @Test
    public void test2444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2444");
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
        user0.setCountry("hi!");
        java.lang.String str23 = user0.getFirstName();
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
    public void test2445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2445");
        User user0 = new User();
        java.lang.String str1 = user0.getPassword();
        user0.setUsername("hi!");
        user0.setFirstName("");
        java.lang.String str6 = user0.getPassword();
        user0.setLastName("");
        user0.setDob("hi!");
        java.lang.String str11 = user0.getEmail();
        user0.setCountry("");
        user0.setUsername("");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test2446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2446");
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
        user0.setLastName("hi!");
        user0.setEmail("");
        java.lang.String str26 = user0.getEmail();
        user0.setLastName("hi!");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
    }

    @Test
    public void test2447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2447");
        User user0 = new User();
        user0.setLastName("");
        java.lang.String str3 = user0.getUsername();
        java.lang.String str4 = user0.getUsername();
        user0.setDob("hi!");
        user0.setDob("hi!");
        user0.setLastName("hi!");
        java.lang.Class<?> wildcardClass11 = user0.getClass();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test2448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2448");
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
        java.lang.String str17 = user0.getUsername();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
    }

    @Test
    public void test2449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2449");
        User user0 = new User();
        java.lang.String str1 = user0.getPassword();
        java.lang.String str2 = user0.getPassword();
        user0.setLastName("hi!");
        java.lang.String str5 = user0.getCountry();
        user0.setCountry("hi!");
        user0.setLastName("");
        java.lang.String str10 = user0.getDob();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test2450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2450");
        User user0 = new User();
        java.lang.String str1 = user0.getPassword();
        java.lang.String str2 = user0.getUsername();
        java.lang.String str3 = user0.getEmail();
        user0.setFirstName("");
        user0.setLastName("hi!");
        user0.setUsername("hi!");
        java.lang.String str10 = user0.getPassword();
        java.lang.String str11 = user0.getEmail();
        java.lang.String str12 = user0.getFirstName();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test2451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2451");
        User user0 = new User();
        java.lang.String str1 = user0.getPassword();
        user0.setCountry("hi!");
        java.lang.String str4 = user0.getFirstName();
        java.lang.String str5 = user0.getDob();
        java.lang.String str6 = user0.getLastName();
        user0.setFirstName("hi!");
        user0.setUsername("");
        user0.setDob("");
        user0.setCountry("");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test2452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2452");
        User user0 = new User();
        java.lang.String str1 = user0.getPassword();
        java.lang.String str2 = user0.getUsername();
        java.lang.String str3 = user0.getEmail();
        user0.setFirstName("");
        user0.setLastName("hi!");
        user0.setUsername("hi!");
        java.lang.String str10 = user0.getDob();
        java.lang.String str11 = user0.getPassword();
        java.lang.String str12 = user0.getUsername();
        user0.setFirstName("");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
    }

    @Test
    public void test2453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2453");
        User user0 = new User();
        java.lang.String str1 = user0.getPassword();
        user0.setCountry("hi!");
        user0.setUsername("hi!");
        java.lang.String str6 = user0.getUsername();
        user0.setLastName("");
        java.lang.String str9 = user0.getLastName();
        user0.setFirstName("hi!");
        java.lang.String str12 = user0.getPassword();
        user0.setCountry("hi!");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test2454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2454");
        User user0 = new User();
        java.lang.String str1 = user0.getPassword();
        java.lang.String str2 = user0.getUsername();
        java.lang.String str3 = user0.getEmail();
        user0.setUsername("");
        java.lang.String str6 = user0.getFirstName();
        user0.setLastName("");
        java.lang.String str9 = user0.getDob();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test2455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2455");
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
        java.lang.String str15 = user0.getUsername();
        java.lang.String str16 = user0.getEmail();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
    }

    @Test
    public void test2456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2456");
        User user0 = new User();
        java.lang.String str1 = user0.getPassword();
        java.lang.String str2 = user0.getUsername();
        java.lang.String str3 = user0.getEmail();
        java.lang.String str4 = user0.getLastName();
        user0.setDob("");
        java.lang.String str7 = user0.getLastName();
        user0.setPassword("hi!");
        user0.setPassword("");
        user0.setCountry("hi!");
        user0.setUsername("hi!");
        java.lang.String str16 = user0.getFirstName();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str16);
    }

    @Test
    public void test2457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2457");
        User user0 = new User();
        java.lang.String str1 = user0.getPassword();
        java.lang.String str2 = user0.getPassword();
        java.lang.String str3 = user0.getFirstName();
        user0.setDob("hi!");
        java.lang.String str6 = user0.getEmail();
        user0.setEmail("");
        java.lang.String str9 = user0.getDob();
        user0.setLastName("");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
    }

    @Test
    public void test2458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2458");
        User user0 = new User();
        user0.setPassword("hi!");
        java.lang.String str3 = user0.getPassword();
        java.lang.String str4 = user0.getFirstName();
        java.lang.String str5 = user0.getLastName();
        user0.setPassword("");
        java.lang.String str8 = user0.getEmail();
        java.lang.String str9 = user0.getDob();
        java.lang.String str10 = user0.getLastName();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test2459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2459");
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
        user0.setCountry("hi!");
        java.lang.String str19 = user0.getDob();
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNull(str19);
    }

    @Test
    public void test2460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2460");
        User user0 = new User();
        java.lang.String str1 = user0.getPassword();
        java.lang.String str2 = user0.getUsername();
        java.lang.String str3 = user0.getCountry();
        user0.setPassword("");
        user0.setLastName("");
        java.lang.String str8 = user0.getUsername();
        java.lang.String str9 = user0.getFirstName();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test2461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2461");
        User user0 = new User();
        java.lang.String str1 = user0.getPassword();
        java.lang.String str2 = user0.getPassword();
        java.lang.String str3 = user0.getPassword();
        user0.setLastName("");
        user0.setEmail("hi!");
        java.lang.String str8 = user0.getUsername();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test2462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2462");
        User user0 = new User();
        user0.setPassword("hi!");
        user0.setPassword("");
        java.lang.String str5 = user0.getDob();
        user0.setEmail("");
        user0.setUsername("");
        java.lang.String str10 = user0.getFirstName();
        user0.setUsername("");
        user0.setDob("");
        user0.setLastName("hi!");
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test2463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2463");
        User user0 = new User();
        user0.setPassword("hi!");
        user0.setPassword("");
        user0.setPassword("");
        java.lang.String str7 = user0.getLastName();
        java.lang.String str8 = user0.getEmail();
        java.lang.String str9 = user0.getFirstName();
        java.lang.Class<?> wildcardClass10 = user0.getClass();
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test2464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2464");
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
        user0.setCountry("");
        java.lang.String str18 = user0.getCountry();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
    }

    @Test
    public void test2465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2465");
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
        java.lang.String str16 = user0.getCountry();
        java.lang.String str17 = user0.getPassword();
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
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
    }

    @Test
    public void test2466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2466");
        User user0 = new User();
        java.lang.String str1 = user0.getPassword();
        java.lang.String str2 = user0.getUsername();
        java.lang.String str3 = user0.getEmail();
        user0.setUsername("");
        java.lang.String str6 = user0.getFirstName();
        java.lang.String str7 = user0.getUsername();
        java.lang.String str8 = user0.getCountry();
        java.lang.String str9 = user0.getFirstName();
        java.lang.String str10 = user0.getFirstName();
        user0.setFirstName("");
        user0.setLastName("hi!");
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
    public void test2467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2467");
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
        java.lang.String str14 = user0.getPassword();
        java.lang.String str15 = user0.getEmail();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNull(str15);
    }

    @Test
    public void test2468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2468");
        User user0 = new User();
        user0.setPassword("hi!");
        user0.setPassword("");
        java.lang.String str5 = user0.getPassword();
        user0.setCountry("hi!");
        user0.setLastName("hi!");
        java.lang.String str10 = user0.getFirstName();
        java.lang.String str11 = user0.getFirstName();
        user0.setUsername("");
        java.lang.String str14 = user0.getEmail();
        java.lang.String str15 = user0.getCountry();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
    }

    @Test
    public void test2469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2469");
        User user0 = new User();
        user0.setPassword("hi!");
        java.lang.String str3 = user0.getPassword();
        java.lang.String str4 = user0.getFirstName();
        java.lang.String str5 = user0.getLastName();
        user0.setFirstName("");
        java.lang.String str8 = user0.getFirstName();
        java.lang.String str9 = user0.getLastName();
        java.lang.String str10 = user0.getFirstName();
        java.lang.String str11 = user0.getEmail();
        java.lang.String str12 = user0.getCountry();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test2470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2470");
        User user0 = new User();
        java.lang.String str1 = user0.getPassword();
        user0.setCountry("hi!");
        user0.setUsername("hi!");
        user0.setCountry("");
        java.lang.String str8 = user0.getFirstName();
        user0.setLastName("hi!");
        user0.setLastName("");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test2471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2471");
        User user0 = new User();
        java.lang.String str1 = user0.getPassword();
        user0.setUsername("hi!");
        user0.setFirstName("");
        java.lang.String str6 = user0.getPassword();
        user0.setLastName("");
        java.lang.String str9 = user0.getDob();
        java.lang.String str10 = user0.getUsername();
        user0.setEmail("");
        user0.setEmail("");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
    }

    @Test
    public void test2472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2472");
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
        java.lang.String str15 = user0.getUsername();
        user0.setDob("");
        java.lang.String str18 = user0.getFirstName();
        java.lang.String str19 = user0.getLastName();
        java.lang.String str20 = user0.getCountry();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
    }

    @Test
    public void test2473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2473");
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
        java.lang.String str13 = user0.getCountry();
        user0.setCountry("");
        user0.setUsername("hi!");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
    }

    @Test
    public void test2474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2474");
        User user0 = new User();
        java.lang.String str1 = user0.getPassword();
        java.lang.String str2 = user0.getUsername();
        java.lang.String str3 = user0.getEmail();
        java.lang.String str4 = user0.getLastName();
        user0.setDob("");
        java.lang.String str7 = user0.getLastName();
        user0.setLastName("hi!");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test2475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2475");
        User user0 = new User();
        java.lang.String str1 = user0.getPassword();
        user0.setCountry("hi!");
        user0.setUsername("hi!");
        java.lang.String str6 = user0.getUsername();
        user0.setLastName("");
        java.lang.String str9 = user0.getLastName();
        user0.setFirstName("hi!");
        user0.setFirstName("hi!");
        user0.setEmail("hi!");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test2476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2476");
        User user0 = new User();
        java.lang.String str1 = user0.getFirstName();
        java.lang.String str2 = user0.getCountry();
        java.lang.String str3 = user0.getFirstName();
        user0.setFirstName("");
        java.lang.String str6 = user0.getFirstName();
        java.lang.String str7 = user0.getEmail();
        java.lang.String str8 = user0.getDob();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test2477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2477");
        User user0 = new User();
        user0.setLastName("");
        java.lang.String str3 = user0.getCountry();
        user0.setEmail("hi!");
        user0.setLastName("");
        java.lang.String str8 = user0.getLastName();
        user0.setCountry("");
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test2478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2478");
        User user0 = new User();
        java.lang.String str1 = user0.getPassword();
        user0.setCountry("hi!");
        java.lang.String str4 = user0.getFirstName();
        user0.setLastName("hi!");
        user0.setDob("hi!");
        java.lang.String str9 = user0.getFirstName();
        java.lang.String str10 = user0.getDob();
        java.lang.String str11 = user0.getLastName();
        java.lang.String str12 = user0.getCountry();
        user0.setUsername("hi!");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
    }

    @Test
    public void test2479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2479");
        User user0 = new User();
        java.lang.String str1 = user0.getPassword();
        java.lang.String str2 = user0.getPassword();
        java.lang.String str3 = user0.getFirstName();
        user0.setDob("hi!");
        java.lang.String str6 = user0.getEmail();
        user0.setPassword("hi!");
        user0.setDob("");
        java.lang.String str11 = user0.getLastName();
        java.lang.String str12 = user0.getFirstName();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test2480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2480");
        User user0 = new User();
        java.lang.String str1 = user0.getPassword();
        user0.setCountry("hi!");
        java.lang.String str4 = user0.getPassword();
        user0.setEmail("hi!");
        user0.setLastName("");
        user0.setUsername("hi!");
        user0.setFirstName("");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str4);
    }

    @Test
    public void test2481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2481");
        User user0 = new User();
        java.lang.String str1 = user0.getPassword();
        user0.setCountry("hi!");
        java.lang.String str4 = user0.getFirstName();
        user0.setLastName("hi!");
        user0.setDob("hi!");
        java.lang.String str9 = user0.getLastName();
        user0.setEmail("");
        java.lang.String str12 = user0.getPassword();
        java.lang.String str13 = user0.getEmail();
        user0.setCountry("hi!");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test2482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2482");
        User user0 = new User();
        java.lang.String str1 = user0.getPassword();
        user0.setUsername("hi!");
        user0.setCountry("hi!");
        java.lang.String str6 = user0.getLastName();
        user0.setLastName("");
        java.lang.String str9 = user0.getUsername();
        java.lang.String str10 = user0.getDob();
        java.lang.String str11 = user0.getFirstName();
        user0.setFirstName("hi!");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test2483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2483");
        User user0 = new User();
        user0.setLastName("");
        java.lang.String str3 = user0.getUsername();
        java.lang.String str4 = user0.getPassword();
        java.lang.String str5 = user0.getLastName();
        java.lang.String str6 = user0.getFirstName();
        java.lang.String str7 = user0.getUsername();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test2484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2484");
        User user0 = new User();
        java.lang.String str1 = user0.getFirstName();
        java.lang.String str2 = user0.getCountry();
        user0.setFirstName("");
        user0.setUsername("");
        java.lang.String str7 = user0.getEmail();
        user0.setUsername("hi!");
        java.lang.String str10 = user0.getFirstName();
        user0.setEmail("hi!");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test2485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2485");
        User user0 = new User();
        user0.setPassword("hi!");
        java.lang.String str3 = user0.getPassword();
        java.lang.String str4 = user0.getPassword();
        java.lang.String str5 = user0.getLastName();
        java.lang.String str6 = user0.getUsername();
        user0.setUsername("hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test2486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2486");
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
        java.lang.String str15 = user0.getLastName();
        user0.setLastName("");
        java.lang.String str18 = user0.getPassword();
        java.lang.String str19 = user0.getUsername();
        user0.setFirstName("");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
    }

    @Test
    public void test2487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2487");
        User user0 = new User();
        java.lang.String str1 = user0.getPassword();
        java.lang.String str2 = user0.getUsername();
        java.lang.String str3 = user0.getEmail();
        user0.setFirstName("");
        java.lang.String str6 = user0.getCountry();
        user0.setDob("hi!");
        java.lang.String str9 = user0.getEmail();
        user0.setPassword("");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test2488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2488");
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
        java.lang.String str20 = user0.getPassword();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
    }

    @Test
    public void test2489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2489");
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
        user0.setLastName("");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
    }

    @Test
    public void test2490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2490");
        User user0 = new User();
        java.lang.String str1 = user0.getPassword();
        java.lang.String str2 = user0.getPassword();
        java.lang.String str3 = user0.getPassword();
        java.lang.String str4 = user0.getDob();
        user0.setFirstName("hi!");
        user0.setCountry("hi!");
        java.lang.String str9 = user0.getFirstName();
        user0.setUsername("");
        user0.setFirstName("");
        java.lang.String str14 = user0.getDob();
        java.lang.String str15 = user0.getEmail();
        java.lang.String str16 = user0.getPassword();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNull(str16);
    }

    @Test
    public void test2491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2491");
        User user0 = new User();
        java.lang.String str1 = user0.getPassword();
        java.lang.String str2 = user0.getPassword();
        user0.setUsername("");
        java.lang.String str5 = user0.getCountry();
        java.lang.String str6 = user0.getFirstName();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test2492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2492");
        User user0 = new User();
        user0.setPassword("hi!");
        user0.setPassword("");
        java.lang.String str5 = user0.getPassword();
        user0.setFirstName("");
        java.lang.String str8 = user0.getUsername();
        java.lang.String str9 = user0.getLastName();
        user0.setUsername("hi!");
        java.lang.String str12 = user0.getDob();
        user0.setUsername("");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test2493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2493");
        User user0 = new User();
        java.lang.String str1 = user0.getPassword();
        java.lang.String str2 = user0.getPassword();
        user0.setUsername("");
        java.lang.String str5 = user0.getCountry();
        user0.setLastName("");
        java.lang.String str8 = user0.getDob();
        user0.setEmail("");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test2494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2494");
        User user0 = new User();
        user0.setLastName("");
        user0.setDob("hi!");
        user0.setCountry("");
        java.lang.String str7 = user0.getCountry();
        java.lang.String str8 = user0.getCountry();
        user0.setCountry("");
        java.lang.String str11 = user0.getUsername();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test2495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2495");
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
        user0.setDob("");
        java.lang.String str16 = user0.getUsername();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(str16);
    }

    @Test
    public void test2496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2496");
        User user0 = new User();
        user0.setPassword("hi!");
        user0.setPassword("");
        java.lang.String str5 = user0.getPassword();
        java.lang.String str6 = user0.getEmail();
        user0.setCountry("hi!");
        java.lang.String str9 = user0.getDob();
        user0.setCountry("hi!");
        java.lang.String str12 = user0.getEmail();
        java.lang.String str13 = user0.getDob();
        user0.setUsername("hi!");
        java.lang.String str16 = user0.getFirstName();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(str16);
    }

    @Test
    public void test2497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2497");
        User user0 = new User();
        java.lang.String str1 = user0.getFirstName();
        user0.setPassword("");
        user0.setEmail("hi!");
        user0.setCountry("");
        user0.setLastName("hi!");
        java.lang.String str10 = user0.getDob();
        java.lang.String str11 = user0.getEmail();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
    }

    @Test
    public void test2498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2498");
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
        user0.setUsername("hi!");
        java.lang.String str18 = user0.getFirstName();
        java.lang.String str19 = user0.getLastName();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
    }

    @Test
    public void test2499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2499");
        User user0 = new User();
        java.lang.String str1 = user0.getPassword();
        user0.setCountry("hi!");
        user0.setUsername("hi!");
        java.lang.String str6 = user0.getUsername();
        user0.setLastName("");
        java.lang.String str9 = user0.getPassword();
        user0.setDob("hi!");
        user0.setLastName("");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test2500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2500");
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
        java.lang.String str16 = user0.getPassword();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertNull(str16);
    }
}

