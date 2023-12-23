import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest2 {

    public static boolean debug = false;

    @Test
    public void test1001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1001");
        User user0 = new User();
        java.lang.String str1 = user0.getPassword();
        user0.setCountry("hi!");
        java.lang.String str4 = user0.getUsername();
        java.lang.String str5 = user0.getPassword();
        java.lang.String str6 = user0.getFirstName();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test1002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1002");
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
        java.lang.String str13 = user0.getDob();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str13);
    }

    @Test
    public void test1003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1003");
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
        java.lang.String str17 = user0.getDob();
        java.lang.Class<?> wildcardClass18 = user0.getClass();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test1004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1004");
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
        java.lang.String str15 = user0.getCountry();
        java.lang.String str16 = user0.getUsername();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
    }

    @Test
    public void test1005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1005");
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
        java.lang.String str17 = user0.getDob();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str17);
    }

    @Test
    public void test1006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1006");
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
        java.lang.String str14 = user0.getUsername();
        java.lang.String str15 = user0.getLastName();
        java.lang.Class<?> wildcardClass16 = user0.getClass();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test1007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1007");
        User user0 = new User();
        java.lang.String str1 = user0.getPassword();
        java.lang.String str2 = user0.getPassword();
        java.lang.String str3 = user0.getPassword();
        java.lang.String str4 = user0.getDob();
        user0.setUsername("");
        java.lang.String str7 = user0.getLastName();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test1008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1008");
        User user0 = new User();
        java.lang.String str1 = user0.getPassword();
        java.lang.String str2 = user0.getPassword();
        user0.setLastName("hi!");
        java.lang.String str5 = user0.getCountry();
        user0.setLastName("hi!");
        java.lang.String str8 = user0.getDob();
        user0.setDob("");
        java.lang.String str11 = user0.getUsername();
        user0.setPassword("");
        user0.setFirstName("hi!");
        user0.setDob("");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test1009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1009");
        User user0 = new User();
        java.lang.String str1 = user0.getPassword();
        user0.setCountry("hi!");
        java.lang.String str4 = user0.getPassword();
        java.lang.String str5 = user0.getPassword();
        java.lang.String str6 = user0.getEmail();
        user0.setPassword("");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test1010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1010");
        User user0 = new User();
        java.lang.String str1 = user0.getPassword();
        java.lang.String str2 = user0.getPassword();
        java.lang.String str3 = user0.getFirstName();
        user0.setDob("hi!");
        java.lang.String str6 = user0.getEmail();
        user0.setEmail("");
        user0.setFirstName("hi!");
        java.lang.String str11 = user0.getCountry();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test1011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1011");
        User user0 = new User();
        user0.setPassword("hi!");
        java.lang.String str3 = user0.getPassword();
        java.lang.String str4 = user0.getFirstName();
        java.lang.String str5 = user0.getEmail();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
    }

    @Test
    public void test1012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1012");
        User user0 = new User();
        java.lang.String str1 = user0.getPassword();
        user0.setCountry("hi!");
        java.lang.String str4 = user0.getUsername();
        java.lang.String str5 = user0.getPassword();
        java.lang.String str6 = user0.getUsername();
        user0.setCountry("hi!");
        java.lang.String str9 = user0.getPassword();
        java.lang.String str10 = user0.getLastName();
        user0.setDob("hi!");
        user0.setFirstName("hi!");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test1013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1013");
        User user0 = new User();
        java.lang.String str1 = user0.getFirstName();
        user0.setPassword("");
        user0.setEmail("hi!");
        user0.setCountry("");
        java.lang.String str8 = user0.getUsername();
        user0.setPassword("hi!");
        java.lang.String str11 = user0.getUsername();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test1014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1014");
        User user0 = new User();
        java.lang.String str1 = user0.getPassword();
        java.lang.String str2 = user0.getUsername();
        java.lang.String str3 = user0.getEmail();
        user0.setFirstName("");
        java.lang.String str6 = user0.getCountry();
        java.lang.String str7 = user0.getLastName();
        user0.setPassword("");
        java.lang.String str10 = user0.getEmail();
        user0.setEmail("");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test1015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1015");
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
        user0.setUsername("");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test1016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1016");
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
        java.lang.String str15 = user0.getLastName();
        java.lang.String str16 = user0.getDob();
        user0.setPassword("");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertNull(str16);
    }

    @Test
    public void test1017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1017");
        User user0 = new User();
        java.lang.String str1 = user0.getPassword();
        user0.setCountry("hi!");
        java.lang.String str4 = user0.getFirstName();
        java.lang.String str5 = user0.getDob();
        user0.setEmail("");
        user0.setEmail("");
        user0.setFirstName("");
        user0.setFirstName("");
        java.lang.String str14 = user0.getEmail();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test1018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1018");
        User user0 = new User();
        java.lang.String str1 = user0.getPassword();
        java.lang.String str2 = user0.getLastName();
        java.lang.String str3 = user0.getDob();
        java.lang.String str4 = user0.getEmail();
        java.lang.String str5 = user0.getCountry();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
    }

    @Test
    public void test1019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1019");
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
        user0.setUsername("hi!");
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
    }

    @Test
    public void test1020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1020");
        User user0 = new User();
        java.lang.String str1 = user0.getPassword();
        user0.setCountry("hi!");
        java.lang.String str4 = user0.getFirstName();
        java.lang.String str5 = user0.getDob();
        java.lang.String str6 = user0.getLastName();
        user0.setFirstName("hi!");
        java.lang.Class<?> wildcardClass9 = user0.getClass();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test1021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1021");
        User user0 = new User();
        java.lang.String str1 = user0.getPassword();
        user0.setCountry("hi!");
        java.lang.String str4 = user0.getFirstName();
        java.lang.String str5 = user0.getUsername();
        user0.setUsername("");
        java.lang.String str8 = user0.getLastName();
        java.lang.String str9 = user0.getEmail();
        java.lang.String str10 = user0.getCountry();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
    }

    @Test
    public void test1022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1022");
        User user0 = new User();
        user0.setPassword("hi!");
        user0.setPassword("");
        java.lang.String str5 = user0.getFirstName();
        user0.setLastName("hi!");
        java.lang.String str8 = user0.getPassword();
        user0.setFirstName("hi!");
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test1023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1023");
        User user0 = new User();
        java.lang.String str1 = user0.getPassword();
        user0.setCountry("hi!");
        java.lang.String str4 = user0.getFirstName();
        java.lang.String str5 = user0.getDob();
        java.lang.String str6 = user0.getLastName();
        java.lang.String str7 = user0.getCountry();
        user0.setEmail("hi!");
        user0.setUsername("hi!");
        java.lang.String str12 = user0.getLastName();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test1024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1024");
        User user0 = new User();
        java.lang.String str1 = user0.getPassword();
        user0.setCountry("hi!");
        java.lang.String str4 = user0.getFirstName();
        java.lang.String str5 = user0.getDob();
        java.lang.String str6 = user0.getLastName();
        user0.setFirstName("hi!");
        user0.setUsername("");
        java.lang.String str11 = user0.getLastName();
        java.lang.Class<?> wildcardClass12 = user0.getClass();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test1025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1025");
        User user0 = new User();
        user0.setPassword("hi!");
        user0.setPassword("");
        user0.setUsername("");
        user0.setLastName("");
        java.lang.String str9 = user0.getLastName();
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test1026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1026");
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
        user0.setCountry("");
        user0.setFirstName("");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test1027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1027");
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
        java.lang.String str14 = user0.getFirstName();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertNull(str14);
    }

    @Test
    public void test1028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1028");
        User user0 = new User();
        java.lang.String str1 = user0.getPassword();
        user0.setUsername("");
        java.lang.String str4 = user0.getCountry();
        java.lang.String str5 = user0.getEmail();
        user0.setEmail("");
        java.lang.String str8 = user0.getFirstName();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test1029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1029");
        User user0 = new User();
        java.lang.String str1 = user0.getPassword();
        java.lang.String str2 = user0.getUsername();
        java.lang.String str3 = user0.getEmail();
        user0.setFirstName("");
        user0.setLastName("hi!");
        java.lang.String str8 = user0.getFirstName();
        user0.setFirstName("hi!");
        user0.setDob("");
        user0.setEmail("hi!");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test1030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1030");
        User user0 = new User();
        java.lang.String str1 = user0.getPassword();
        user0.setCountry("hi!");
        java.lang.String str4 = user0.getUsername();
        user0.setPassword("");
        user0.setFirstName("hi!");
        user0.setDob("hi!");
        user0.setUsername("hi!");
        user0.setLastName("");
        java.lang.String str15 = user0.getUsername();
        user0.setFirstName("hi!");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
    }

    @Test
    public void test1031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1031");
        User user0 = new User();
        java.lang.String str1 = user0.getPassword();
        java.lang.String str2 = user0.getPassword();
        user0.setUsername("");
        java.lang.String str5 = user0.getCountry();
        java.lang.String str6 = user0.getCountry();
        java.lang.String str7 = user0.getCountry();
        java.lang.String str8 = user0.getFirstName();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test1032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1032");
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
        java.lang.String str18 = user0.getCountry();
        user0.setPassword("");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
    }

    @Test
    public void test1033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1033");
        User user0 = new User();
        java.lang.String str1 = user0.getPassword();
        user0.setCountry("hi!");
        java.lang.String str4 = user0.getPassword();
        java.lang.String str5 = user0.getDob();
        user0.setCountry("hi!");
        user0.setCountry("hi!");
        java.lang.String str10 = user0.getPassword();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test1034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1034");
        User user0 = new User();
        java.lang.String str1 = user0.getPassword();
        user0.setCountry("hi!");
        java.lang.String str4 = user0.getFirstName();
        user0.setLastName("hi!");
        user0.setDob("hi!");
        java.lang.String str9 = user0.getFirstName();
        user0.setLastName("hi!");
        user0.setCountry("");
        java.lang.String str14 = user0.getCountry();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test1035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1035");
        User user0 = new User();
        user0.setPassword("hi!");
        user0.setPassword("");
        java.lang.String str5 = user0.getFirstName();
        user0.setLastName("hi!");
        user0.setFirstName("");
        java.lang.String str10 = user0.getFirstName();
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test1036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1036");
        User user0 = new User();
        java.lang.String str1 = user0.getPassword();
        user0.setUsername("hi!");
        user0.setCountry("hi!");
        java.lang.String str6 = user0.getLastName();
        java.lang.String str7 = user0.getEmail();
        user0.setUsername("");
        java.lang.Class<?> wildcardClass10 = user0.getClass();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test1037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1037");
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
        java.lang.String str15 = user0.getLastName();
        java.lang.String str16 = user0.getEmail();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNull(str16);
    }

    @Test
    public void test1038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1038");
        User user0 = new User();
        java.lang.String str1 = user0.getPassword();
        java.lang.String str2 = user0.getUsername();
        java.lang.String str3 = user0.getEmail();
        user0.setUsername("");
        java.lang.String str6 = user0.getEmail();
        user0.setEmail("");
        user0.setPassword("");
        user0.setUsername("hi!");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test1039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1039");
        User user0 = new User();
        java.lang.String str1 = user0.getPassword();
        user0.setUsername("hi!");
        user0.setFirstName("");
        java.lang.String str6 = user0.getPassword();
        user0.setLastName("");
        user0.setDob("hi!");
        java.lang.String str11 = user0.getLastName();
        user0.setUsername("hi!");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test1040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1040");
        User user0 = new User();
        java.lang.String str1 = user0.getPassword();
        java.lang.String str2 = user0.getUsername();
        java.lang.String str3 = user0.getEmail();
        user0.setFirstName("");
        user0.setLastName("hi!");
        user0.setUsername("hi!");
        user0.setEmail("");
        java.lang.String str12 = user0.getEmail();
        java.lang.String str13 = user0.getEmail();
        user0.setLastName("hi!");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test1041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1041");
        User user0 = new User();
        java.lang.String str1 = user0.getPassword();
        java.lang.String str2 = user0.getPassword();
        user0.setLastName("hi!");
        java.lang.String str5 = user0.getCountry();
        user0.setCountry("hi!");
        user0.setLastName("");
        java.lang.String str10 = user0.getFirstName();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test1042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1042");
        User user0 = new User();
        java.lang.String str1 = user0.getFirstName();
        java.lang.String str2 = user0.getCountry();
        java.lang.String str3 = user0.getFirstName();
        user0.setCountry("hi!");
        user0.setPassword("");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test1043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1043");
        User user0 = new User();
        user0.setLastName("");
        user0.setDob("hi!");
        user0.setCountry("");
        java.lang.String str7 = user0.getCountry();
        user0.setFirstName("hi!");
        java.lang.String str10 = user0.getDob();
        java.lang.String str11 = user0.getEmail();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test1044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1044");
        User user0 = new User();
        java.lang.String str1 = user0.getPassword();
        user0.setCountry("hi!");
        java.lang.String str4 = user0.getFirstName();
        java.lang.String str5 = user0.getDob();
        java.lang.String str6 = user0.getEmail();
        java.lang.String str7 = user0.getEmail();
        user0.setPassword("hi!");
        java.lang.String str10 = user0.getFirstName();
        java.lang.String str11 = user0.getDob();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test1045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1045");
        User user0 = new User();
        java.lang.String str1 = user0.getFirstName();
        java.lang.String str2 = user0.getCountry();
        user0.setFirstName("");
        java.lang.String str5 = user0.getFirstName();
        user0.setCountry("hi!");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
    }

    @Test
    public void test1046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1046");
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
        user0.setPassword("hi!");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test1047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1047");
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
        user0.setEmail("hi!");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNull(str14);
    }

    @Test
    public void test1048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1048");
        User user0 = new User();
        java.lang.String str1 = user0.getPassword();
        user0.setUsername("hi!");
        java.lang.String str4 = user0.getDob();
        user0.setUsername("");
        user0.setLastName("");
        java.lang.String str9 = user0.getCountry();
        java.lang.String str10 = user0.getDob();
        java.lang.String str11 = user0.getUsername();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test1049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1049");
        User user0 = new User();
        java.lang.String str1 = user0.getPassword();
        user0.setCountry("hi!");
        java.lang.String str4 = user0.getPassword();
        user0.setEmail("hi!");
        user0.setLastName("");
        user0.setLastName("hi!");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str4);
    }

    @Test
    public void test1050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1050");
        User user0 = new User();
        java.lang.String str1 = user0.getPassword();
        user0.setUsername("hi!");
        user0.setCountry("hi!");
        java.lang.String str6 = user0.getLastName();
        user0.setLastName("");
        user0.setPassword("");
        java.lang.String str11 = user0.getEmail();
        java.lang.String str12 = user0.getEmail();
        user0.setCountry("hi!");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test1051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1051");
        User user0 = new User();
        java.lang.String str1 = user0.getPassword();
        user0.setUsername("");
        user0.setFirstName("hi!");
        java.lang.String str6 = user0.getCountry();
        user0.setCountry("");
        user0.setEmail("");
        java.lang.String str11 = user0.getLastName();
        java.lang.String str12 = user0.getEmail();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test1052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1052");
        User user0 = new User();
        java.lang.String str1 = user0.getPassword();
        java.lang.String str2 = user0.getUsername();
        java.lang.String str3 = user0.getEmail();
        user0.setUsername("");
        java.lang.String str6 = user0.getFirstName();
        java.lang.String str7 = user0.getUsername();
        java.lang.String str8 = user0.getCountry();
        java.lang.String str9 = user0.getDob();
        java.lang.String str10 = user0.getLastName();
        java.lang.String str11 = user0.getLastName();
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
    public void test1053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1053");
        User user0 = new User();
        java.lang.String str1 = user0.getPassword();
        java.lang.String str2 = user0.getUsername();
        java.lang.String str3 = user0.getDob();
        java.lang.String str4 = user0.getPassword();
        user0.setDob("hi!");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
    }

    @Test
    public void test1054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1054");
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
        java.lang.String str16 = user0.getDob();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str16);
    }

    @Test
    public void test1055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1055");
        User user0 = new User();
        java.lang.String str1 = user0.getPassword();
        java.lang.String str2 = user0.getUsername();
        java.lang.String str3 = user0.getEmail();
        user0.setFirstName("");
        user0.setLastName("hi!");
        user0.setUsername("hi!");
        java.lang.String str10 = user0.getPassword();
        java.lang.String str11 = user0.getEmail();
        java.lang.Class<?> wildcardClass12 = user0.getClass();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test1056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1056");
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
        user0.setFirstName("hi!");
        java.lang.String str20 = user0.getDob();
        user0.setEmail("");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str20);
    }

    @Test
    public void test1057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1057");
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
        java.lang.String str17 = user0.getLastName();
        user0.setUsername("hi!");
        java.lang.Class<?> wildcardClass20 = user0.getClass();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test1058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1058");
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
        java.lang.String str15 = user0.getEmail();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str15);
    }

    @Test
    public void test1059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1059");
        User user0 = new User();
        user0.setPassword("hi!");
        user0.setPassword("");
        java.lang.String str5 = user0.getPassword();
        user0.setCountry("hi!");
        java.lang.String str8 = user0.getPassword();
        java.lang.String str9 = user0.getDob();
        java.lang.String str10 = user0.getCountry();
        java.lang.String str11 = user0.getLastName();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test1060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1060");
        User user0 = new User();
        java.lang.String str1 = user0.getPassword();
        user0.setUsername("hi!");
        user0.setCountry("hi!");
        java.lang.String str6 = user0.getLastName();
        user0.setLastName("");
        user0.setPassword("");
        java.lang.String str11 = user0.getPassword();
        user0.setUsername("hi!");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test1061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1061");
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
        java.lang.String str15 = user0.getLastName();
        java.lang.Class<?> wildcardClass16 = user0.getClass();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test1062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1062");
        User user0 = new User();
        java.lang.String str1 = user0.getPassword();
        user0.setUsername("");
        user0.setFirstName("hi!");
        java.lang.String str6 = user0.getCountry();
        user0.setEmail("");
        user0.setEmail("");
        user0.setCountry("hi!");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test1063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1063");
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
        java.lang.Class<?> wildcardClass17 = user0.getClass();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test1064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1064");
        User user0 = new User();
        user0.setLastName("");
        java.lang.String str3 = user0.getUsername();
        java.lang.Class<?> wildcardClass4 = user0.getClass();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test1065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1065");
        User user0 = new User();
        user0.setPassword("hi!");
        user0.setPassword("");
        java.lang.String str5 = user0.getFirstName();
        user0.setEmail("hi!");
        java.lang.String str8 = user0.getLastName();
        user0.setEmail("hi!");
        user0.setEmail("");
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test1066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1066");
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
        user0.setCountry("hi!");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test1067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1067");
        User user0 = new User();
        java.lang.String str1 = user0.getPassword();
        java.lang.String str2 = user0.getPassword();
        user0.setUsername("");
        java.lang.String str5 = user0.getCountry();
        java.lang.String str6 = user0.getCountry();
        java.lang.String str7 = user0.getFirstName();
        user0.setLastName("");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test1068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1068");
        User user0 = new User();
        user0.setPassword("hi!");
        user0.setPassword("");
        user0.setUsername("");
        user0.setFirstName("");
        user0.setEmail("");
        java.lang.String str11 = user0.getDob();
        java.lang.String str12 = user0.getCountry();
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test1069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1069");
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
        java.lang.String str25 = user0.getUsername();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str23);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
    }

    @Test
    public void test1070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1070");
        User user0 = new User();
        java.lang.String str1 = user0.getPassword();
        user0.setCountry("hi!");
        java.lang.String str4 = user0.getPassword();
        java.lang.String str5 = user0.getPassword();
        user0.setCountry("");
        java.lang.String str8 = user0.getCountry();
        user0.setLastName("hi!");
        java.lang.String str11 = user0.getFirstName();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test1071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1071");
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
        user0.setFirstName("");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str13);
    }

    @Test
    public void test1072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1072");
        User user0 = new User();
        user0.setPassword("hi!");
        java.lang.String str3 = user0.getPassword();
        java.lang.String str4 = user0.getFirstName();
        java.lang.String str5 = user0.getLastName();
        user0.setCountry("");
        user0.setCountry("");
        user0.setPassword("hi!");
        user0.setCountry("");
        java.lang.String str14 = user0.getFirstName();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str14);
    }

    @Test
    public void test1073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1073");
        User user0 = new User();
        user0.setPassword("hi!");
        java.lang.String str3 = user0.getPassword();
        java.lang.String str4 = user0.getPassword();
        java.lang.String str5 = user0.getFirstName();
        user0.setDob("hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNull(str5);
    }

    @Test
    public void test1074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1074");
        User user0 = new User();
        user0.setPassword("hi!");
        user0.setPassword("");
        java.lang.String str5 = user0.getPassword();
        java.lang.String str6 = user0.getEmail();
        java.lang.String str7 = user0.getFirstName();
        java.lang.String str8 = user0.getPassword();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test1075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1075");
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
        user0.setFirstName("hi!");
        user0.setUsername("hi!");
        java.lang.Class<?> wildcardClass22 = user0.getClass();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test1076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1076");
        User user0 = new User();
        user0.setPassword("hi!");
        user0.setPassword("");
        java.lang.String str5 = user0.getPassword();
        user0.setCountry("hi!");
        java.lang.String str8 = user0.getPassword();
        java.lang.String str9 = user0.getDob();
        java.lang.String str10 = user0.getDob();
        java.lang.String str11 = user0.getUsername();
        user0.setFirstName("");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test1077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1077");
        User user0 = new User();
        java.lang.String str1 = user0.getPassword();
        java.lang.String str2 = user0.getUsername();
        java.lang.String str3 = user0.getEmail();
        java.lang.String str4 = user0.getLastName();
        java.lang.String str5 = user0.getEmail();
        user0.setUsername("");
        java.lang.String str8 = user0.getUsername();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test1078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1078");
        User user0 = new User();
        java.lang.String str1 = user0.getPassword();
        user0.setCountry("hi!");
        java.lang.String str4 = user0.getUsername();
        user0.setPassword("");
        user0.setFirstName("hi!");
        user0.setDob("hi!");
        user0.setUsername("hi!");
        user0.setLastName("");
        user0.setLastName("");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str4);
    }

    @Test
    public void test1079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1079");
        User user0 = new User();
        java.lang.String str1 = user0.getPassword();
        user0.setCountry("hi!");
        user0.setUsername("hi!");
        user0.setPassword("");
        user0.setUsername("");
        user0.setEmail("");
        java.lang.String str12 = user0.getCountry();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
    }

    @Test
    public void test1080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1080");
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
        java.lang.String str14 = user0.getFirstName();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str14);
    }

    @Test
    public void test1081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1081");
        User user0 = new User();
        user0.setUsername("");
        java.lang.String str3 = user0.getUsername();
        user0.setPassword("hi!");
        java.lang.String str6 = user0.getDob();
        java.lang.Class<?> wildcardClass7 = user0.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test1082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1082");
        User user0 = new User();
        java.lang.String str1 = user0.getFirstName();
        java.lang.String str2 = user0.getFirstName();
        java.lang.String str3 = user0.getUsername();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test1083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1083");
        User user0 = new User();
        user0.setPassword("hi!");
        user0.setPassword("");
        user0.setPassword("");
        user0.setCountry("");
        user0.setPassword("hi!");
    }

    @Test
    public void test1084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1084");
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
        user0.setEmail("");
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
    public void test1085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1085");
        User user0 = new User();
        java.lang.String str1 = user0.getPassword();
        java.lang.String str2 = user0.getUsername();
        java.lang.String str3 = user0.getCountry();
        user0.setPassword("");
        user0.setLastName("");
        java.lang.String str8 = user0.getFirstName();
        java.lang.String str9 = user0.getFirstName();
        user0.setLastName("");
        java.lang.String str12 = user0.getPassword();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test1086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1086");
        User user0 = new User();
        java.lang.String str1 = user0.getPassword();
        user0.setUsername("");
        user0.setFirstName("hi!");
        user0.setEmail("");
        org.junit.Assert.assertNull(str1);
    }

    @Test
    public void test1087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1087");
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
        java.lang.String str17 = user0.getLastName();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str17);
    }

    @Test
    public void test1088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1088");
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
        java.lang.String str15 = user0.getUsername();
        user0.setUsername("hi!");
        java.lang.Class<?> wildcardClass18 = user0.getClass();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test1089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1089");
        User user0 = new User();
        user0.setPassword("hi!");
        java.lang.String str3 = user0.getPassword();
        java.lang.String str4 = user0.getFirstName();
        java.lang.String str5 = user0.getLastName();
        user0.setPassword("");
        java.lang.String str8 = user0.getDob();
        user0.setPassword("hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test1090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1090");
        User user0 = new User();
        java.lang.String str1 = user0.getPassword();
        user0.setCountry("hi!");
        java.lang.String str4 = user0.getUsername();
        user0.setPassword("");
        user0.setFirstName("");
        java.lang.String str9 = user0.getLastName();
        java.lang.String str10 = user0.getEmail();
        user0.setDob("hi!");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test1091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1091");
        User user0 = new User();
        user0.setPassword("hi!");
        user0.setPassword("");
        java.lang.String str5 = user0.getPassword();
        user0.setCountry("hi!");
        java.lang.String str8 = user0.getPassword();
        java.lang.String str9 = user0.getDob();
        user0.setEmail("hi!");
        java.lang.String str12 = user0.getUsername();
        user0.setLastName("hi!");
        user0.setFirstName("");
        java.lang.String str17 = user0.getDob();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str17);
    }

    @Test
    public void test1092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1092");
        User user0 = new User();
        java.lang.String str1 = user0.getPassword();
        java.lang.String str2 = user0.getUsername();
        java.lang.String str3 = user0.getCountry();
        user0.setPassword("");
        user0.setLastName("");
        user0.setUsername("");
        user0.setFirstName("hi!");
        java.lang.String str12 = user0.getEmail();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test1093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1093");
        User user0 = new User();
        java.lang.String str1 = user0.getPassword();
        user0.setUsername("hi!");
        user0.setCountry("hi!");
        java.lang.String str6 = user0.getLastName();
        user0.setLastName("");
        java.lang.String str9 = user0.getUsername();
        java.lang.String str10 = user0.getDob();
        user0.setEmail("");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test1094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1094");
        User user0 = new User();
        java.lang.String str1 = user0.getFirstName();
        java.lang.String str2 = user0.getCountry();
        java.lang.String str3 = user0.getFirstName();
        user0.setPassword("hi!");
        java.lang.String str6 = user0.getDob();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test1095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1095");
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
        java.lang.String str15 = user0.getLastName();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
    }

    @Test
    public void test1096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1096");
        User user0 = new User();
        java.lang.String str1 = user0.getPassword();
        user0.setUsername("hi!");
        java.lang.String str4 = user0.getFirstName();
        java.lang.String str5 = user0.getUsername();
        java.lang.String str6 = user0.getCountry();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test1097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1097");
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
        java.lang.String str18 = user0.getFirstName();
        user0.setPassword("hi!");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
    }

    @Test
    public void test1098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1098");
        User user0 = new User();
        java.lang.String str1 = user0.getPassword();
        user0.setCountry("hi!");
        java.lang.String str4 = user0.getFirstName();
        user0.setLastName("hi!");
        user0.setDob("hi!");
        java.lang.String str9 = user0.getEmail();
        user0.setLastName("");
        java.lang.String str12 = user0.getDob();
        java.lang.String str13 = user0.getEmail();
        user0.setPassword("");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertNull(str13);
    }

    @Test
    public void test1099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1099");
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
        user0.setDob("");
        java.lang.String str15 = user0.getFirstName();
        user0.setFirstName("");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertNull(str15);
    }

    @Test
    public void test1100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1100");
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
        user0.setLastName("");
        user0.setCountry("hi!");
        java.lang.Class<?> wildcardClass19 = user0.getClass();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test1101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1101");
        User user0 = new User();
        java.lang.String str1 = user0.getFirstName();
        java.lang.String str2 = user0.getCountry();
        java.lang.String str3 = user0.getFirstName();
        user0.setUsername("hi!");
        user0.setPassword("hi!");
        user0.setPassword("");
        user0.setPassword("hi!");
        user0.setUsername("");
        java.lang.String str14 = user0.getFirstName();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str14);
    }

    @Test
    public void test1102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1102");
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
        java.lang.String str14 = user0.getPassword();
        user0.setEmail("");
        java.lang.String str17 = user0.getFirstName();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNull(str17);
    }

    @Test
    public void test1103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1103");
        User user0 = new User();
        user0.setPassword("hi!");
        user0.setPassword("");
        java.lang.String str5 = user0.getDob();
        user0.setEmail("");
        user0.setUsername("");
        java.lang.String str10 = user0.getFirstName();
        user0.setDob("hi!");
        user0.setPassword("");
        java.lang.String str15 = user0.getEmail();
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
    }

    @Test
    public void test1104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1104");
        User user0 = new User();
        java.lang.String str1 = user0.getPassword();
        user0.setUsername("");
        user0.setLastName("hi!");
        user0.setLastName("");
        java.lang.String str8 = user0.getEmail();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test1105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1105");
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
        user0.setPassword("hi!");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
    }

    @Test
    public void test1106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1106");
        User user0 = new User();
        user0.setPassword("hi!");
        user0.setPassword("");
        java.lang.String str5 = user0.getPassword();
        user0.setCountry("hi!");
        user0.setLastName("hi!");
        java.lang.String str10 = user0.getFirstName();
        java.lang.String str11 = user0.getLastName();
        java.lang.String str12 = user0.getEmail();
        java.lang.String str13 = user0.getDob();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str13);
    }

    @Test
    public void test1107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1107");
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
        java.lang.String str19 = user0.getUsername();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
    }

    @Test
    public void test1108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1108");
        User user0 = new User();
        java.lang.String str1 = user0.getPassword();
        user0.setCountry("hi!");
        java.lang.String str4 = user0.getFirstName();
        user0.setLastName("hi!");
        java.lang.String str7 = user0.getLastName();
        java.lang.String str8 = user0.getCountry();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
    }

    @Test
    public void test1109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1109");
        User user0 = new User();
        java.lang.String str1 = user0.getPassword();
        java.lang.String str2 = user0.getPassword();
        user0.setLastName("hi!");
        java.lang.String str5 = user0.getCountry();
        user0.setCountry("hi!");
        java.lang.String str8 = user0.getPassword();
        java.lang.String str9 = user0.getUsername();
        java.lang.String str10 = user0.getUsername();
        user0.setPassword("");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test1110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1110");
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
        java.lang.String str18 = user0.getFirstName();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
    }

    @Test
    public void test1111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1111");
        User user0 = new User();
        java.lang.String str1 = user0.getPassword();
        java.lang.String str2 = user0.getUsername();
        java.lang.String str3 = user0.getEmail();
        user0.setUsername("");
        java.lang.String str6 = user0.getDob();
        java.lang.String str7 = user0.getPassword();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test1112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1112");
        User user0 = new User();
        java.lang.String str1 = user0.getPassword();
        user0.setCountry("hi!");
        java.lang.String str4 = user0.getUsername();
        java.lang.String str5 = user0.getPassword();
        java.lang.String str6 = user0.getUsername();
        user0.setCountry("hi!");
        java.lang.String str9 = user0.getPassword();
        java.lang.String str10 = user0.getLastName();
        user0.setLastName("hi!");
        java.lang.String str13 = user0.getFirstName();
        user0.setFirstName("hi!");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str13);
    }

    @Test
    public void test1113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1113");
        User user0 = new User();
        java.lang.String str1 = user0.getPassword();
        user0.setCountry("hi!");
        user0.setUsername("hi!");
        user0.setPassword("");
        java.lang.String str8 = user0.getCountry();
        java.lang.String str9 = user0.getCountry();
        java.lang.String str10 = user0.getCountry();
        user0.setDob("");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
    }

    @Test
    public void test1114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1114");
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
        java.lang.String str13 = user0.getFirstName();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test1115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1115");
        User user0 = new User();
        user0.setPassword("hi!");
        user0.setPassword("");
        java.lang.String str5 = user0.getPassword();
        java.lang.String str6 = user0.getEmail();
        user0.setEmail("");
        user0.setFirstName("");
        user0.setDob("");
        user0.setUsername("");
        user0.setFirstName("hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test1116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1116");
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
        java.lang.String str15 = user0.getDob();
        java.lang.String str16 = user0.getUsername();
        java.lang.String str17 = user0.getDob();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
    }

    @Test
    public void test1117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1117");
        User user0 = new User();
        java.lang.String str1 = user0.getPassword();
        java.lang.String str2 = user0.getPassword();
        user0.setUsername("");
        java.lang.String str5 = user0.getCountry();
        java.lang.String str6 = user0.getCountry();
        java.lang.String str7 = user0.getFirstName();
        user0.setDob("hi!");
        user0.setDob("");
        java.lang.String str12 = user0.getPassword();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test1118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1118");
        User user0 = new User();
        java.lang.String str1 = user0.getPassword();
        user0.setCountry("hi!");
        java.lang.String str4 = user0.getUsername();
        user0.setPassword("");
        user0.setFirstName("");
        java.lang.String str9 = user0.getLastName();
        user0.setCountry("hi!");
        java.lang.String str12 = user0.getEmail();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test1119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1119");
        User user0 = new User();
        user0.setPassword("hi!");
        java.lang.String str3 = user0.getPassword();
        java.lang.String str4 = user0.getFirstName();
        java.lang.String str5 = user0.getPassword();
        user0.setUsername("");
        java.lang.String str8 = user0.getUsername();
        user0.setDob("");
        java.lang.String str11 = user0.getEmail();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test1120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1120");
        User user0 = new User();
        java.lang.String str1 = user0.getPassword();
        user0.setCountry("hi!");
        user0.setUsername("hi!");
        user0.setCountry("");
        user0.setLastName("");
        user0.setLastName("hi!");
        user0.setPassword("hi!");
        user0.setEmail("");
        org.junit.Assert.assertNull(str1);
    }

    @Test
    public void test1121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1121");
        User user0 = new User();
        java.lang.String str1 = user0.getPassword();
        user0.setUsername("hi!");
        user0.setCountry("hi!");
        java.lang.String str6 = user0.getLastName();
        user0.setLastName("");
        java.lang.String str9 = user0.getUsername();
        user0.setFirstName("hi!");
        user0.setLastName("");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
    }

    @Test
    public void test1122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1122");
        User user0 = new User();
        java.lang.String str1 = user0.getPassword();
        user0.setUsername("hi!");
        user0.setCountry("hi!");
        java.lang.String str6 = user0.getLastName();
        java.lang.String str7 = user0.getEmail();
        user0.setEmail("hi!");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test1123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1123");
        User user0 = new User();
        java.lang.String str1 = user0.getPassword();
        java.lang.String str2 = user0.getPassword();
        user0.setUsername("");
        java.lang.String str5 = user0.getCountry();
        java.lang.String str6 = user0.getCountry();
        java.lang.String str7 = user0.getEmail();
        java.lang.String str8 = user0.getCountry();
        user0.setUsername("");
        user0.setDob("hi!");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test1124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1124");
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
        user0.setUsername("hi!");
        java.lang.String str21 = user0.getFirstName();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!" + "'", str21, "hi!");
    }

    @Test
    public void test1125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1125");
        User user0 = new User();
        user0.setPassword("hi!");
        user0.setPassword("");
        java.lang.String str5 = user0.getPassword();
        user0.setCountry("hi!");
        user0.setLastName("hi!");
        java.lang.String str10 = user0.getFirstName();
        user0.setEmail("hi!");
        java.lang.String str13 = user0.getFirstName();
        java.lang.String str14 = user0.getFirstName();
        java.lang.String str15 = user0.getPassword();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
    }

    @Test
    public void test1126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1126");
        User user0 = new User();
        user0.setPassword("hi!");
        user0.setPassword("");
        java.lang.String str5 = user0.getPassword();
        user0.setCountry("hi!");
        user0.setLastName("hi!");
        java.lang.String str10 = user0.getFirstName();
        user0.setEmail("");
        user0.setFirstName("");
        user0.setCountry("");
        java.lang.String str17 = user0.getPassword();
        java.lang.String str18 = user0.getDob();
        user0.setDob("hi!");
        user0.setUsername("");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertNull(str18);
    }

    @Test
    public void test1127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1127");
        User user0 = new User();
        java.lang.String str1 = user0.getPassword();
        java.lang.String str2 = user0.getUsername();
        java.lang.String str3 = user0.getCountry();
        user0.setLastName("");
        user0.setFirstName("hi!");
        user0.setUsername("hi!");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test1128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1128");
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
        user0.setDob("");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
    }

    @Test
    public void test1129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1129");
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
        user0.setUsername("hi!");
        user0.setLastName("hi!");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
    }

    @Test
    public void test1130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1130");
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
        user0.setUsername("");
        user0.setUsername("");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test1131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1131");
        User user0 = new User();
        java.lang.String str1 = user0.getPassword();
        user0.setUsername("");
        user0.setLastName("");
        user0.setEmail("hi!");
        user0.setFirstName("hi!");
        java.lang.String str10 = user0.getCountry();
        user0.setEmail("hi!");
        java.lang.String str13 = user0.getPassword();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str13);
    }

    @Test
    public void test1132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1132");
        User user0 = new User();
        java.lang.String str1 = user0.getPassword();
        java.lang.String str2 = user0.getPassword();
        user0.setUsername("");
        java.lang.String str5 = user0.getCountry();
        java.lang.String str6 = user0.getDob();
        java.lang.String str7 = user0.getFirstName();
        user0.setCountry("");
        user0.setUsername("hi!");
        user0.setFirstName("hi!");
        user0.setUsername("");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test1133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1133");
        User user0 = new User();
        user0.setPassword("hi!");
        java.lang.String str3 = user0.getPassword();
        java.lang.String str4 = user0.getFirstName();
        java.lang.String str5 = user0.getLastName();
        user0.setCountry("");
        user0.setUsername("");
        user0.setUsername("");
        user0.setCountry("");
        user0.setCountry("");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
    }

    @Test
    public void test1134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1134");
        User user0 = new User();
        java.lang.String str1 = user0.getPassword();
        user0.setUsername("");
        user0.setFirstName("hi!");
        java.lang.String str6 = user0.getCountry();
        user0.setCountry("");
        user0.setEmail("");
        user0.setEmail("");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test1135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1135");
        User user0 = new User();
        java.lang.String str1 = user0.getPassword();
        java.lang.String str2 = user0.getUsername();
        java.lang.String str3 = user0.getEmail();
        java.lang.String str4 = user0.getLastName();
        user0.setDob("");
        user0.setCountry("hi!");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
    }

    @Test
    public void test1136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1136");
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
        user0.setLastName("hi!");
        user0.setEmail("hi!");
        user0.setEmail("");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
    }

    @Test
    public void test1137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1137");
        User user0 = new User();
        user0.setPassword("hi!");
        user0.setPassword("");
        java.lang.String str5 = user0.getPassword();
        java.lang.String str6 = user0.getEmail();
        java.lang.String str7 = user0.getEmail();
        java.lang.String str8 = user0.getPassword();
        user0.setLastName("");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test1138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1138");
        User user0 = new User();
        java.lang.String str1 = user0.getPassword();
        java.lang.String str2 = user0.getPassword();
        user0.setUsername("");
        java.lang.String str5 = user0.getUsername();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
    }

    @Test
    public void test1139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1139");
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
        user0.setLastName("");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test1140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1140");
        User user0 = new User();
        user0.setPassword("hi!");
        user0.setPassword("");
        java.lang.String str5 = user0.getDob();
        user0.setEmail("");
        user0.setUsername("");
        user0.setPassword("");
        java.lang.String str12 = user0.getLastName();
        user0.setCountry("");
        java.lang.String str15 = user0.getUsername();
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
    }

    @Test
    public void test1141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1141");
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
        user0.setCountry("");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
    }

    @Test
    public void test1142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1142");
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
        user0.setPassword("");
        java.lang.String str16 = user0.getLastName();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str16);
    }

    @Test
    public void test1143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1143");
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
        user0.setCountry("");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test1144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1144");
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
        user0.setPassword("");
        java.lang.String str17 = user0.getUsername();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertNull(str17);
    }

    @Test
    public void test1145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1145");
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
        user0.setLastName("");
        java.lang.String str17 = user0.getLastName();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
    }

    @Test
    public void test1146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1146");
        User user0 = new User();
        user0.setLastName("");
        java.lang.String str3 = user0.getUsername();
        java.lang.String str4 = user0.getPassword();
        user0.setUsername("");
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
    }

    @Test
    public void test1147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1147");
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
        java.lang.String str19 = user0.getPassword();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
    }

    @Test
    public void test1148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1148");
        User user0 = new User();
        java.lang.String str1 = user0.getFirstName();
        java.lang.String str2 = user0.getCountry();
        user0.setFirstName("");
        user0.setUsername("");
        java.lang.String str7 = user0.getEmail();
        user0.setUsername("hi!");
        java.lang.String str10 = user0.getEmail();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test1149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1149");
        User user0 = new User();
        java.lang.String str1 = user0.getPassword();
        user0.setUsername("");
        user0.setFirstName("hi!");
        java.lang.String str6 = user0.getCountry();
        user0.setEmail("");
        java.lang.String str9 = user0.getPassword();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test1150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1150");
        User user0 = new User();
        java.lang.String str1 = user0.getPassword();
        user0.setCountry("hi!");
        java.lang.String str4 = user0.getUsername();
        java.lang.String str5 = user0.getPassword();
        java.lang.String str6 = user0.getUsername();
        user0.setCountry("hi!");
        java.lang.String str9 = user0.getPassword();
        user0.setCountry("hi!");
        java.lang.String str12 = user0.getEmail();
        java.lang.Class<?> wildcardClass13 = user0.getClass();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test1151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1151");
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
        user0.setCountry("hi!");
        user0.setFirstName("");
        java.lang.String str20 = user0.getPassword();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
    }

    @Test
    public void test1152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1152");
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
        user0.setEmail("hi!");
        user0.setPassword("hi!");
        user0.setCountry("hi!");
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
    public void test1153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1153");
        User user0 = new User();
        user0.setPassword("hi!");
        user0.setPassword("");
        java.lang.String str5 = user0.getPassword();
        user0.setFirstName("");
        user0.setLastName("");
        user0.setPassword("hi!");
        java.lang.String str12 = user0.getEmail();
        user0.setCountry("hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test1154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1154");
        User user0 = new User();
        java.lang.String str1 = user0.getPassword();
        user0.setCountry("hi!");
        java.lang.String str4 = user0.getPassword();
        java.lang.String str5 = user0.getDob();
        user0.setFirstName("hi!");
        user0.setFirstName("");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
    }

    @Test
    public void test1155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1155");
        User user0 = new User();
        java.lang.String str1 = user0.getPassword();
        user0.setCountry("hi!");
        user0.setUsername("hi!");
        user0.setCountry("");
        java.lang.String str8 = user0.getFirstName();
        user0.setPassword("");
        user0.setPassword("hi!");
        java.lang.String str13 = user0.getFirstName();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str13);
    }

    @Test
    public void test1156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1156");
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
        user0.setFirstName("hi!");
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
    public void test1157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1157");
        User user0 = new User();
        java.lang.String str1 = user0.getPassword();
        user0.setUsername("");
        user0.setFirstName("hi!");
        java.lang.String str6 = user0.getCountry();
        user0.setUsername("");
        user0.setDob("hi!");
        user0.setEmail("");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test1158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1158");
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
        user0.setDob("");
        user0.setPassword("hi!");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test1159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1159");
        User user0 = new User();
        java.lang.String str1 = user0.getPassword();
        user0.setUsername("hi!");
        user0.setCountry("hi!");
        user0.setFirstName("");
        java.lang.String str8 = user0.getFirstName();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test1160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1160");
        User user0 = new User();
        java.lang.String str1 = user0.getPassword();
        java.lang.String str2 = user0.getPassword();
        java.lang.String str3 = user0.getFirstName();
        java.lang.String str4 = user0.getDob();
        java.lang.String str5 = user0.getEmail();
        java.lang.String str6 = user0.getDob();
        user0.setUsername("");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test1161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1161");
        User user0 = new User();
        java.lang.String str1 = user0.getPassword();
        user0.setCountry("hi!");
        java.lang.String str4 = user0.getPassword();
        java.lang.String str5 = user0.getPassword();
        user0.setCountry("");
        user0.setPassword("hi!");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
    }

    @Test
    public void test1162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1162");
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
        user0.setEmail("hi!");
        user0.setDob("hi!");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test1163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1163");
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
        user0.setEmail("");
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
    public void test1164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1164");
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
        user0.setUsername("");
        java.lang.String str16 = user0.getEmail();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNull(str16);
    }

    @Test
    public void test1165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1165");
        User user0 = new User();
        java.lang.String str1 = user0.getPassword();
        java.lang.String str2 = user0.getPassword();
        java.lang.String str3 = user0.getEmail();
        user0.setCountry("");
        user0.setPassword("");
        java.lang.String str8 = user0.getPassword();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test1166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1166");
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
        user0.setCountry("");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test1167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1167");
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
        java.lang.String str17 = user0.getEmail();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
    }

    @Test
    public void test1168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1168");
        User user0 = new User();
        java.lang.String str1 = user0.getPassword();
        java.lang.String str2 = user0.getUsername();
        java.lang.String str3 = user0.getEmail();
        user0.setLastName("");
        java.lang.String str6 = user0.getCountry();
        java.lang.String str7 = user0.getEmail();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test1169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1169");
        User user0 = new User();
        user0.setPassword("hi!");
        user0.setPassword("");
        java.lang.String str5 = user0.getPassword();
        user0.setFirstName("");
        java.lang.String str8 = user0.getUsername();
        user0.setUsername("");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test1170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1170");
        User user0 = new User();
        java.lang.String str1 = user0.getPassword();
        user0.setCountry("hi!");
        java.lang.String str4 = user0.getFirstName();
        java.lang.String str5 = user0.getFirstName();
        java.lang.String str6 = user0.getLastName();
        user0.setLastName("");
        java.lang.String str9 = user0.getLastName();
        user0.setDob("hi!");
        java.lang.String str12 = user0.getLastName();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test1171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1171");
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
        user0.setPassword("hi!");
        java.lang.String str22 = user0.getFirstName();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hi!" + "'", str22, "hi!");
    }

    @Test
    public void test1172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1172");
        User user0 = new User();
        java.lang.String str1 = user0.getPassword();
        user0.setCountry("hi!");
        java.lang.String str4 = user0.getFirstName();
        java.lang.String str5 = user0.getDob();
        java.lang.String str6 = user0.getLastName();
        user0.setFirstName("hi!");
        user0.setEmail("hi!");
        user0.setEmail("hi!");
        user0.setEmail("");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test1173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1173");
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
        user0.setEmail("hi!");
        user0.setPassword("hi!");
        java.lang.String str17 = user0.getFirstName();
        java.lang.String str18 = user0.getDob();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertNull(str18);
    }

    @Test
    public void test1174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1174");
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
        java.lang.String str17 = user0.getDob();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
    }

    @Test
    public void test1175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1175");
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
        user0.setUsername("hi!");
        user0.setDob("hi!");
        user0.setFirstName("");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test1176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1176");
        User user0 = new User();
        java.lang.String str1 = user0.getPassword();
        user0.setUsername("hi!");
        user0.setFirstName("");
        java.lang.String str6 = user0.getPassword();
        user0.setLastName("");
        user0.setEmail("");
        user0.setCountry("hi!");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test1177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1177");
        User user0 = new User();
        java.lang.String str1 = user0.getPassword();
        java.lang.String str2 = user0.getUsername();
        java.lang.String str3 = user0.getCountry();
        user0.setPassword("");
        java.lang.String str6 = user0.getUsername();
        user0.setLastName("hi!");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test1178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1178");
        User user0 = new User();
        user0.setPassword("hi!");
        user0.setPassword("");
        java.lang.String str5 = user0.getPassword();
        java.lang.String str6 = user0.getEmail();
        user0.setFirstName("hi!");
        java.lang.String str9 = user0.getCountry();
        user0.setDob("hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test1179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1179");
        User user0 = new User();
        java.lang.String str1 = user0.getPassword();
        java.lang.String str2 = user0.getPassword();
        user0.setLastName("hi!");
        java.lang.String str5 = user0.getCountry();
        user0.setFirstName("");
        user0.setDob("hi!");
        user0.setLastName("");
        java.lang.String str12 = user0.getUsername();
        java.lang.Class<?> wildcardClass13 = user0.getClass();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test1180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1180");
        User user0 = new User();
        java.lang.String str1 = user0.getPassword();
        java.lang.String str2 = user0.getUsername();
        java.lang.String str3 = user0.getEmail();
        user0.setFirstName("");
        user0.setLastName("hi!");
        java.lang.String str8 = user0.getFirstName();
        user0.setDob("");
        user0.setDob("hi!");
        java.lang.String str13 = user0.getUsername();
        java.lang.String str14 = user0.getDob();
        user0.setLastName("hi!");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
    }

    @Test
    public void test1181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1181");
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
        user0.setDob("");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
    }

    @Test
    public void test1182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1182");
        User user0 = new User();
        java.lang.String str1 = user0.getFirstName();
        user0.setPassword("");
        user0.setEmail("hi!");
        user0.setPassword("hi!");
        user0.setPassword("");
        user0.setUsername("");
        org.junit.Assert.assertNull(str1);
    }

    @Test
    public void test1183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1183");
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
        java.lang.String str16 = user0.getCountry();
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
    public void test1184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1184");
        User user0 = new User();
        user0.setPassword("hi!");
        user0.setPassword("");
        java.lang.String str5 = user0.getPassword();
        java.lang.String str6 = user0.getPassword();
        user0.setPassword("");
        user0.setLastName("");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test1185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1185");
        User user0 = new User();
        java.lang.String str1 = user0.getPassword();
        user0.setUsername("hi!");
        user0.setCountry("hi!");
        java.lang.String str6 = user0.getEmail();
        java.lang.String str7 = user0.getCountry();
        java.lang.String str8 = user0.getCountry();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
    }

    @Test
    public void test1186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1186");
        User user0 = new User();
        java.lang.String str1 = user0.getPassword();
        java.lang.String str2 = user0.getUsername();
        java.lang.String str3 = user0.getCountry();
        user0.setPassword("");
        user0.setLastName("");
        user0.setUsername("");
        user0.setUsername("");
        user0.setLastName("hi!");
        java.lang.String str14 = user0.getCountry();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str14);
    }

    @Test
    public void test1187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1187");
        User user0 = new User();
        java.lang.String str1 = user0.getPassword();
        user0.setUsername("");
        user0.setFirstName("hi!");
        java.lang.String str6 = user0.getCountry();
        user0.setCountry("");
        java.lang.String str9 = user0.getFirstName();
        user0.setLastName("");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
    }

    @Test
    public void test1188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1188");
        User user0 = new User();
        user0.setPassword("hi!");
        java.lang.String str3 = user0.getPassword();
        java.lang.String str4 = user0.getFirstName();
        java.lang.String str5 = user0.getLastName();
        user0.setCountry("");
        user0.setPassword("");
        java.lang.String str10 = user0.getEmail();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test1189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1189");
        User user0 = new User();
        java.lang.String str1 = user0.getPassword();
        user0.setCountry("hi!");
        java.lang.String str4 = user0.getFirstName();
        user0.setLastName("hi!");
        user0.setDob("hi!");
        java.lang.String str9 = user0.getFirstName();
        java.lang.String str10 = user0.getCountry();
        java.lang.String str11 = user0.getFirstName();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test1190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1190");
        User user0 = new User();
        user0.setPassword("hi!");
        user0.setPassword("");
        java.lang.String str5 = user0.getPassword();
        java.lang.String str6 = user0.getEmail();
        user0.setCountry("hi!");
        java.lang.String str9 = user0.getEmail();
        user0.setFirstName("hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test1191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1191");
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
        user0.setPassword("");
        java.lang.String str18 = user0.getPassword();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
    }

    @Test
    public void test1192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1192");
        User user0 = new User();
        java.lang.String str1 = user0.getPassword();
        java.lang.String str2 = user0.getPassword();
        user0.setLastName("hi!");
        java.lang.String str5 = user0.getCountry();
        java.lang.String str6 = user0.getEmail();
        user0.setDob("");
        user0.setLastName("hi!");
        java.lang.String str11 = user0.getLastName();
        java.lang.String str12 = user0.getDob();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test1193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1193");
        User user0 = new User();
        java.lang.String str1 = user0.getPassword();
        user0.setCountry("hi!");
        java.lang.String str4 = user0.getFirstName();
        java.lang.String str5 = user0.getDob();
        java.lang.String str6 = user0.getLastName();
        user0.setLastName("");
        user0.setFirstName("hi!");
        user0.setCountry("");
        user0.setUsername("hi!");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test1194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1194");
        User user0 = new User();
        user0.setPassword("hi!");
        user0.setPassword("");
        java.lang.String str5 = user0.getDob();
        user0.setEmail("");
        user0.setUsername("");
        user0.setPassword("");
        java.lang.String str12 = user0.getLastName();
        user0.setCountry("");
        java.lang.String str15 = user0.getFirstName();
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str15);
    }

    @Test
    public void test1195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1195");
        User user0 = new User();
        java.lang.String str1 = user0.getPassword();
        java.lang.String str2 = user0.getPassword();
        java.lang.String str3 = user0.getFirstName();
        user0.setDob("hi!");
        java.lang.String str6 = user0.getEmail();
        user0.setEmail("");
        java.lang.String str9 = user0.getFirstName();
        java.lang.String str10 = user0.getPassword();
        java.lang.String str11 = user0.getPassword();
        user0.setLastName("hi!");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test1196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1196");
        User user0 = new User();
        java.lang.String str1 = user0.getPassword();
        java.lang.String str2 = user0.getPassword();
        java.lang.String str3 = user0.getPassword();
        java.lang.String str4 = user0.getDob();
        user0.setFirstName("hi!");
        user0.setDob("");
        user0.setPassword("");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
    }

    @Test
    public void test1197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1197");
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
        java.lang.String str16 = user0.getEmail();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
    }

    @Test
    public void test1198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1198");
        User user0 = new User();
        user0.setLastName("");
        user0.setDob("hi!");
        user0.setCountry("");
        java.lang.String str7 = user0.getDob();
        java.lang.String str8 = user0.getCountry();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test1199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1199");
        User user0 = new User();
        java.lang.String str1 = user0.getPassword();
        java.lang.String str2 = user0.getUsername();
        java.lang.String str3 = user0.getCountry();
        java.lang.String str4 = user0.getFirstName();
        user0.setEmail("hi!");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
    }

    @Test
    public void test1200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1200");
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
        user0.setPassword("hi!");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str13);
    }

    @Test
    public void test1201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1201");
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
        java.lang.Class<?> wildcardClass14 = user0.getClass();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test1202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1202");
        User user0 = new User();
        java.lang.String str1 = user0.getPassword();
        user0.setUsername("hi!");
        java.lang.String str4 = user0.getDob();
        user0.setUsername("");
        user0.setLastName("");
        java.lang.String str9 = user0.getCountry();
        java.lang.Class<?> wildcardClass10 = user0.getClass();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test1203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1203");
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
        user0.setUsername("hi!");
        java.lang.String str19 = user0.getFirstName();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
    }

    @Test
    public void test1204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1204");
        User user0 = new User();
        java.lang.String str1 = user0.getPassword();
        user0.setCountry("hi!");
        user0.setUsername("hi!");
        user0.setPassword("");
        java.lang.String str8 = user0.getCountry();
        java.lang.String str9 = user0.getCountry();
        java.lang.String str10 = user0.getCountry();
        user0.setLastName("hi!");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
    }

    @Test
    public void test1205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1205");
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
        user0.setCountry("");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test1206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1206");
        User user0 = new User();
        java.lang.String str1 = user0.getPassword();
        java.lang.String str2 = user0.getUsername();
        java.lang.String str3 = user0.getEmail();
        user0.setFirstName("");
        user0.setLastName("hi!");
        user0.setCountry("");
        user0.setUsername("hi!");
        user0.setDob("hi!");
        user0.setPassword("");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test1207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1207");
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
        user0.setDob("");
        user0.setCountry("");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test1208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1208");
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
        user0.setEmail("hi!");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test1209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1209");
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
        java.lang.String str20 = user0.getLastName();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertNull(str20);
    }

    @Test
    public void test1210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1210");
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
        java.lang.String str17 = user0.getEmail();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
    }

    @Test
    public void test1211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1211");
        User user0 = new User();
        java.lang.String str1 = user0.getPassword();
        java.lang.String str2 = user0.getUsername();
        java.lang.String str3 = user0.getEmail();
        user0.setUsername("");
        user0.setDob("hi!");
        java.lang.String str8 = user0.getCountry();
        java.lang.Class<?> wildcardClass9 = user0.getClass();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test1212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1212");
        User user0 = new User();
        java.lang.String str1 = user0.getPassword();
        user0.setCountry("hi!");
        java.lang.String str4 = user0.getFirstName();
        java.lang.String str5 = user0.getDob();
        java.lang.String str6 = user0.getLastName();
        user0.setFirstName("hi!");
        user0.setDob("hi!");
        java.lang.String str11 = user0.getPassword();
        user0.setLastName("");
        user0.setUsername("");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test1213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1213");
        User user0 = new User();
        user0.setPassword("hi!");
        java.lang.String str3 = user0.getPassword();
        java.lang.String str4 = user0.getFirstName();
        java.lang.String str5 = user0.getPassword();
        java.lang.String str6 = user0.getLastName();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test1214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1214");
        User user0 = new User();
        java.lang.String str1 = user0.getPassword();
        user0.setCountry("hi!");
        java.lang.String str4 = user0.getPassword();
        java.lang.String str5 = user0.getDob();
        user0.setCountry("hi!");
        java.lang.String str8 = user0.getCountry();
        java.lang.String str9 = user0.getEmail();
        user0.setUsername("");
        user0.setFirstName("hi!");
        java.lang.String str14 = user0.getEmail();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str14);
    }

    @Test
    public void test1215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1215");
        User user0 = new User();
        java.lang.String str1 = user0.getPassword();
        java.lang.String str2 = user0.getUsername();
        java.lang.String str3 = user0.getEmail();
        user0.setUsername("");
        user0.setUsername("");
        user0.setLastName("");
        java.lang.String str10 = user0.getUsername();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test1216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1216");
        User user0 = new User();
        user0.setPassword("hi!");
        user0.setPassword("");
        java.lang.String str5 = user0.getDob();
        user0.setEmail("");
        user0.setUsername("");
        user0.setPassword("");
        user0.setLastName("");
        java.lang.String str14 = user0.getPassword();
        user0.setCountry("hi!");
        java.lang.String str17 = user0.getUsername();
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
    }

    @Test
    public void test1217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1217");
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
        user0.setCountry("");
        java.lang.String str15 = user0.getLastName();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str15);
    }

    @Test
    public void test1218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1218");
        User user0 = new User();
        java.lang.String str1 = user0.getPassword();
        java.lang.String str2 = user0.getUsername();
        user0.setDob("");
        java.lang.String str5 = user0.getEmail();
        user0.setFirstName("hi!");
        user0.setFirstName("hi!");
        user0.setFirstName("");
        user0.setUsername("hi!");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str5);
    }

    @Test
    public void test1219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1219");
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
        user0.setDob("");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test1220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1220");
        User user0 = new User();
        java.lang.String str1 = user0.getPassword();
        user0.setUsername("");
        user0.setFirstName("hi!");
        user0.setDob("");
        user0.setEmail("");
        java.lang.String str10 = user0.getPassword();
        java.lang.String str11 = user0.getFirstName();
        user0.setFirstName("");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
    }

    @Test
    public void test1221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1221");
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
        user0.setEmail("hi!");
        java.lang.String str15 = user0.getLastName();
        java.lang.String str16 = user0.getEmail();
        java.lang.Class<?> wildcardClass17 = user0.getClass();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test1222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1222");
        User user0 = new User();
        java.lang.String str1 = user0.getPassword();
        user0.setUsername("hi!");
        user0.setFirstName("");
        java.lang.String str6 = user0.getPassword();
        user0.setLastName("");
        java.lang.String str9 = user0.getDob();
        java.lang.String str10 = user0.getEmail();
        user0.setDob("hi!");
        java.lang.String str13 = user0.getDob();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
    }

    @Test
    public void test1223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1223");
        User user0 = new User();
        java.lang.String str1 = user0.getPassword();
        user0.setUsername("hi!");
        user0.setFirstName("");
        java.lang.String str6 = user0.getPassword();
        user0.setUsername("hi!");
        user0.setCountry("");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test1224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1224");
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
        user0.setEmail("");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNull(str15);
    }

    @Test
    public void test1225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1225");
        User user0 = new User();
        java.lang.String str1 = user0.getFirstName();
        java.lang.String str2 = user0.getPassword();
        java.lang.String str3 = user0.getDob();
        java.lang.String str4 = user0.getUsername();
        java.lang.String str5 = user0.getPassword();
        user0.setEmail("");
        user0.setLastName("");
        user0.setDob("");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
    }

    @Test
    public void test1226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1226");
        User user0 = new User();
        user0.setLastName("");
        java.lang.String str3 = user0.getCountry();
        java.lang.String str4 = user0.getDob();
        user0.setCountry("");
        java.lang.String str7 = user0.getFirstName();
        user0.setDob("");
        java.lang.Class<?> wildcardClass10 = user0.getClass();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test1227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1227");
        User user0 = new User();
        java.lang.String str1 = user0.getPassword();
        user0.setCountry("hi!");
        java.lang.String str4 = user0.getFirstName();
        user0.setLastName("hi!");
        user0.setDob("hi!");
        java.lang.String str9 = user0.getLastName();
        user0.setEmail("");
        java.lang.String str12 = user0.getDob();
        user0.setCountry("hi!");
        user0.setFirstName("");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
    }

    @Test
    public void test1228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1228");
        User user0 = new User();
        java.lang.String str1 = user0.getPassword();
        java.lang.String str2 = user0.getUsername();
        java.lang.String str3 = user0.getCountry();
        java.lang.String str4 = user0.getPassword();
        java.lang.String str5 = user0.getUsername();
        user0.setEmail("");
        java.lang.String str8 = user0.getEmail();
        java.lang.String str9 = user0.getCountry();
        java.lang.String str10 = user0.getLastName();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test1229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1229");
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
        user0.setPassword("hi!");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test1230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1230");
        User user0 = new User();
        java.lang.String str1 = user0.getPassword();
        user0.setUsername("");
        user0.setLastName("");
        java.lang.String str6 = user0.getUsername();
        java.lang.String str7 = user0.getUsername();
        java.lang.String str8 = user0.getCountry();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test1231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1231");
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
        java.lang.String str15 = user0.getEmail();
        java.lang.String str16 = user0.getLastName();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
    }

    @Test
    public void test1232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1232");
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
        java.lang.String str20 = user0.getPassword();
        user0.setFirstName("");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertNull(str20);
    }

    @Test
    public void test1233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1233");
        User user0 = new User();
        java.lang.String str1 = user0.getPassword();
        java.lang.String str2 = user0.getUsername();
        java.lang.String str3 = user0.getDob();
        user0.setLastName("hi!");
        java.lang.String str6 = user0.getPassword();
        user0.setLastName("hi!");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test1234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1234");
        User user0 = new User();
        java.lang.String str1 = user0.getPassword();
        user0.setCountry("hi!");
        java.lang.String str4 = user0.getFirstName();
        java.lang.String str5 = user0.getFirstName();
        java.lang.String str6 = user0.getLastName();
        java.lang.String str7 = user0.getLastName();
        user0.setCountry("hi!");
        java.lang.String str10 = user0.getFirstName();
        java.lang.String str11 = user0.getCountry();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
    }

    @Test
    public void test1235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1235");
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
        java.lang.String str15 = user0.getFirstName();
        java.lang.String str16 = user0.getFirstName();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNull(str16);
    }

    @Test
    public void test1236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1236");
        User user0 = new User();
        java.lang.String str1 = user0.getPassword();
        user0.setUsername("");
        user0.setFirstName("hi!");
        user0.setDob("");
        user0.setLastName("");
        user0.setUsername("");
        java.lang.String str12 = user0.getUsername();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test1237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1237");
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
        java.lang.String str18 = user0.getCountry();
        user0.setPassword("");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
    }

    @Test
    public void test1238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1238");
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
        user0.setFirstName("");
        java.lang.Class<?> wildcardClass16 = user0.getClass();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test1239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1239");
        User user0 = new User();
        java.lang.String str1 = user0.getPassword();
        user0.setCountry("hi!");
        java.lang.String str4 = user0.getFirstName();
        java.lang.String str5 = user0.getFirstName();
        java.lang.String str6 = user0.getPassword();
        user0.setPassword("");
        user0.setLastName("hi!");
        java.lang.String str11 = user0.getEmail();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test1240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1240");
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
        java.lang.String str18 = user0.getFirstName();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertNull(str18);
    }

    @Test
    public void test1241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1241");
        User user0 = new User();
        java.lang.String str1 = user0.getPassword();
        user0.setUsername("hi!");
        user0.setFirstName("");
        java.lang.String str6 = user0.getPassword();
        user0.setLastName("");
        java.lang.String str9 = user0.getDob();
        java.lang.String str10 = user0.getLastName();
        java.lang.String str11 = user0.getDob();
        user0.setPassword("");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test1242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1242");
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
        java.lang.String str16 = user0.getCountry();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
    }

    @Test
    public void test1243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1243");
        User user0 = new User();
        java.lang.String str1 = user0.getPassword();
        user0.setCountry("hi!");
        java.lang.String str4 = user0.getFirstName();
        java.lang.String str5 = user0.getDob();
        java.lang.String str6 = user0.getLastName();
        user0.setLastName("");
        user0.setFirstName("hi!");
        user0.setCountry("");
        java.lang.Class<?> wildcardClass13 = user0.getClass();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test1244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1244");
        User user0 = new User();
        java.lang.String str1 = user0.getPassword();
        java.lang.String str2 = user0.getLastName();
        java.lang.String str3 = user0.getEmail();
        java.lang.String str4 = user0.getDob();
        user0.setDob("");
        java.lang.String str7 = user0.getCountry();
        java.lang.String str8 = user0.getPassword();
        user0.setLastName("");
        java.lang.String str11 = user0.getDob();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test1245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1245");
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
        user0.setUsername("");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str14);
    }

    @Test
    public void test1246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1246");
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
        user0.setPassword("");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertNull(str13);
    }

    @Test
    public void test1247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1247");
        User user0 = new User();
        java.lang.String str1 = user0.getPassword();
        user0.setCountry("hi!");
        java.lang.String str4 = user0.getFirstName();
        user0.setLastName("hi!");
        user0.setDob("hi!");
        java.lang.String str9 = user0.getFirstName();
        java.lang.String str10 = user0.getEmail();
        java.lang.String str11 = user0.getPassword();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test1248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1248");
        User user0 = new User();
        user0.setPassword("hi!");
        user0.setPassword("");
        java.lang.String str5 = user0.getPassword();
        user0.setCountry("hi!");
        java.lang.String str8 = user0.getPassword();
        user0.setCountry("hi!");
        user0.setEmail("hi!");
        user0.setUsername("hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test1249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1249");
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
        java.lang.String str18 = user0.getEmail();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
    }

    @Test
    public void test1250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1250");
        User user0 = new User();
        java.lang.String str1 = user0.getPassword();
        java.lang.String str2 = user0.getPassword();
        java.lang.String str3 = user0.getFirstName();
        user0.setDob("hi!");
        java.lang.String str6 = user0.getEmail();
        user0.setEmail("");
        user0.setFirstName("hi!");
        java.lang.String str11 = user0.getEmail();
        java.lang.String str12 = user0.getPassword();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test1251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1251");
        User user0 = new User();
        user0.setPassword("hi!");
        user0.setPassword("");
        user0.setUsername("");
        user0.setFirstName("");
        user0.setEmail("");
        java.lang.String str11 = user0.getFirstName();
        java.lang.String str12 = user0.getDob();
        user0.setFirstName("");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test1252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1252");
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
        user0.setEmail("");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
    }

    @Test
    public void test1253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1253");
        User user0 = new User();
        user0.setPassword("hi!");
        user0.setPassword("");
        java.lang.String str5 = user0.getPassword();
        java.lang.String str6 = user0.getEmail();
        user0.setCountry("hi!");
        java.lang.String str9 = user0.getDob();
        user0.setDob("hi!");
        java.lang.String str12 = user0.getLastName();
        user0.setFirstName("");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test1254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1254");
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
        user0.setLastName("hi!");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(str17);
    }

    @Test
    public void test1255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1255");
        User user0 = new User();
        user0.setPassword("hi!");
        user0.setPassword("");
        user0.setPassword("");
        user0.setLastName("");
        java.lang.String str9 = user0.getCountry();
        java.lang.String str10 = user0.getCountry();
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test1256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1256");
        User user0 = new User();
        user0.setPassword("hi!");
        user0.setPassword("");
        user0.setUsername("");
        user0.setFirstName("");
        user0.setEmail("");
        java.lang.String str11 = user0.getFirstName();
        java.lang.String str12 = user0.getPassword();
        java.lang.String str13 = user0.getPassword();
        java.lang.String str14 = user0.getFirstName();
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test1257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1257");
        User user0 = new User();
        java.lang.String str1 = user0.getPassword();
        user0.setCountry("hi!");
        user0.setUsername("hi!");
        user0.setCountry("");
        java.lang.String str8 = user0.getFirstName();
        user0.setDob("hi!");
        java.lang.String str11 = user0.getCountry();
        user0.setEmail("hi!");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test1258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1258");
        User user0 = new User();
        java.lang.String str1 = user0.getPassword();
        user0.setCountry("hi!");
        java.lang.String str4 = user0.getFirstName();
        user0.setLastName("hi!");
        user0.setDob("hi!");
        java.lang.String str9 = user0.getFirstName();
        java.lang.String str10 = user0.getDob();
        java.lang.String str11 = user0.getDob();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
    }

    @Test
    public void test1259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1259");
        User user0 = new User();
        user0.setPassword("hi!");
        user0.setPassword("");
        java.lang.String str5 = user0.getFirstName();
        user0.setEmail("hi!");
        java.lang.String str8 = user0.getLastName();
        user0.setUsername("");
        user0.setPassword("hi!");
        user0.setUsername("hi!");
        user0.setCountry("hi!");
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test1260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1260");
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
        java.lang.String str16 = user0.getCountry();
        user0.setLastName("");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
    }

    @Test
    public void test1261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1261");
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
        java.lang.Class<?> wildcardClass18 = user0.getClass();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test1262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1262");
        User user0 = new User();
        java.lang.String str1 = user0.getPassword();
        user0.setUsername("hi!");
        java.lang.String str4 = user0.getDob();
        user0.setUsername("");
        user0.setLastName("");
        java.lang.String str9 = user0.getCountry();
        java.lang.String str10 = user0.getDob();
        java.lang.String str11 = user0.getFirstName();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test1263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1263");
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
        java.lang.String str17 = user0.getUsername();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
    }

    @Test
    public void test1264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1264");
        User user0 = new User();
        java.lang.String str1 = user0.getPassword();
        java.lang.String str2 = user0.getUsername();
        java.lang.String str3 = user0.getCountry();
        user0.setEmail("hi!");
        java.lang.String str6 = user0.getPassword();
        java.lang.String str7 = user0.getFirstName();
        java.lang.String str8 = user0.getCountry();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test1265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1265");
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
        java.lang.String str17 = user0.getPassword();
        java.lang.String str18 = user0.getFirstName();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertNull(str18);
    }

    @Test
    public void test1266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1266");
        User user0 = new User();
        java.lang.String str1 = user0.getFirstName();
        user0.setPassword("");
        user0.setEmail("hi!");
        java.lang.String str6 = user0.getLastName();
        java.lang.String str7 = user0.getPassword();
        user0.setFirstName("");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test1267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1267");
        User user0 = new User();
        java.lang.String str1 = user0.getFirstName();
        user0.setPassword("");
        user0.setUsername("hi!");
        java.lang.Class<?> wildcardClass6 = user0.getClass();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test1268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1268");
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
        java.lang.String str13 = user0.getUsername();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
    }

    @Test
    public void test1269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1269");
        User user0 = new User();
        java.lang.String str1 = user0.getPassword();
        java.lang.String str2 = user0.getLastName();
        java.lang.String str3 = user0.getEmail();
        java.lang.String str4 = user0.getDob();
        user0.setDob("");
        java.lang.String str7 = user0.getCountry();
        user0.setLastName("");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test1270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1270");
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
        java.lang.String str15 = user0.getPassword();
        java.lang.String str16 = user0.getLastName();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
    }

    @Test
    public void test1271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1271");
        User user0 = new User();
        java.lang.String str1 = user0.getPassword();
        user0.setCountry("hi!");
        java.lang.String str4 = user0.getUsername();
        java.lang.String str5 = user0.getPassword();
        java.lang.String str6 = user0.getDob();
        java.lang.String str7 = user0.getCountry();
        java.lang.String str8 = user0.getLastName();
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
    public void test1272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1272");
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
        java.lang.String str14 = user0.getDob();
        java.lang.String str15 = user0.getPassword();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNull(str15);
    }

    @Test
    public void test1273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1273");
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
        user0.setDob("hi!");
        java.lang.String str17 = user0.getDob();
        java.lang.String str18 = user0.getLastName();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertNull(str18);
    }

    @Test
    public void test1274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1274");
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
        java.lang.String str14 = user0.getDob();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
    }

    @Test
    public void test1275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1275");
        User user0 = new User();
        java.lang.String str1 = user0.getPassword();
        user0.setCountry("hi!");
        java.lang.String str4 = user0.getFirstName();
        user0.setLastName("hi!");
        user0.setDob("hi!");
        java.lang.String str9 = user0.getLastName();
        user0.setEmail("");
        java.lang.String str12 = user0.getDob();
        user0.setCountry("hi!");
        user0.setLastName("hi!");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
    }

    @Test
    public void test1276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1276");
        User user0 = new User();
        java.lang.String str1 = user0.getPassword();
        java.lang.String str2 = user0.getPassword();
        java.lang.String str3 = user0.getFirstName();
        user0.setDob("hi!");
        java.lang.String str6 = user0.getEmail();
        user0.setPassword("hi!");
        user0.setCountry("");
        user0.setLastName("hi!");
        java.lang.String str13 = user0.getFirstName();
        java.lang.String str14 = user0.getFirstName();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(str14);
    }

    @Test
    public void test1277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1277");
        User user0 = new User();
        user0.setPassword("hi!");
        user0.setPassword("");
        java.lang.String str5 = user0.getDob();
        user0.setEmail("");
        user0.setUsername("");
        user0.setPassword("");
        java.lang.String str12 = user0.getCountry();
        user0.setUsername("");
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test1278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1278");
        User user0 = new User();
        user0.setPassword("hi!");
        user0.setPassword("");
        java.lang.String str5 = user0.getPassword();
        user0.setCountry("hi!");
        user0.setLastName("hi!");
        user0.setFirstName("");
        java.lang.String str12 = user0.getPassword();
        java.lang.String str13 = user0.getPassword();
        java.lang.Class<?> wildcardClass14 = user0.getClass();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test1279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1279");
        User user0 = new User();
        java.lang.String str1 = user0.getPassword();
        java.lang.String str2 = user0.getPassword();
        java.lang.String str3 = user0.getCountry();
        user0.setLastName("hi!");
        java.lang.Class<?> wildcardClass6 = user0.getClass();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test1280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1280");
        User user0 = new User();
        java.lang.String str1 = user0.getPassword();
        java.lang.String str2 = user0.getPassword();
        user0.setLastName("hi!");
        java.lang.String str5 = user0.getCountry();
        java.lang.String str6 = user0.getEmail();
        java.lang.String str7 = user0.getDob();
        java.lang.String str8 = user0.getPassword();
        java.lang.String str9 = user0.getEmail();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test1281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1281");
        User user0 = new User();
        user0.setLastName("");
        user0.setUsername("hi!");
        user0.setLastName("");
        java.lang.String str7 = user0.getPassword();
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test1282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1282");
        User user0 = new User();
        java.lang.String str1 = user0.getPassword();
        user0.setUsername("hi!");
        user0.setCountry("hi!");
        user0.setFirstName("");
        user0.setUsername("");
        java.lang.String str10 = user0.getLastName();
        java.lang.String str11 = user0.getLastName();
        user0.setDob("hi!");
        user0.setUsername("hi!");
        user0.setCountry("");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test1283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1283");
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
        java.lang.String str15 = user0.getLastName();
        java.lang.String str16 = user0.getDob();
        user0.setUsername("hi!");
        java.lang.Class<?> wildcardClass19 = user0.getClass();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test1284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1284");
        User user0 = new User();
        java.lang.String str1 = user0.getPassword();
        java.lang.String str2 = user0.getUsername();
        java.lang.String str3 = user0.getEmail();
        user0.setUsername("");
        java.lang.String str6 = user0.getPassword();
        java.lang.String str7 = user0.getDob();
        user0.setLastName("");
        java.lang.String str10 = user0.getLastName();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test1285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1285");
        User user0 = new User();
        java.lang.String str1 = user0.getFirstName();
        java.lang.String str2 = user0.getCountry();
        user0.setUsername("hi!");
        java.lang.String str5 = user0.getUsername();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
    }

    @Test
    public void test1286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1286");
        User user0 = new User();
        user0.setPassword("hi!");
        user0.setPassword("");
        java.lang.String str5 = user0.getFirstName();
        user0.setLastName("hi!");
        user0.setFirstName("");
        java.lang.String str10 = user0.getDob();
        user0.setEmail("");
        java.lang.String str13 = user0.getEmail();
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test1287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1287");
        User user0 = new User();
        user0.setPassword("hi!");
        user0.setPassword("");
        java.lang.String str5 = user0.getPassword();
        java.lang.String str6 = user0.getEmail();
        user0.setFirstName("hi!");
        user0.setUsername("hi!");
        java.lang.String str11 = user0.getCountry();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test1288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1288");
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
        user0.setUsername("hi!");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertNull(str13);
    }

    @Test
    public void test1289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1289");
        User user0 = new User();
        java.lang.String str1 = user0.getPassword();
        java.lang.String str2 = user0.getUsername();
        java.lang.String str3 = user0.getEmail();
        user0.setUsername("");
        java.lang.String str6 = user0.getFirstName();
        java.lang.String str7 = user0.getUsername();
        user0.setPassword("");
        java.lang.String str10 = user0.getCountry();
        java.lang.String str11 = user0.getFirstName();
        user0.setFirstName("");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test1290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1290");
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
        java.lang.String str15 = user0.getDob();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertNull(str15);
    }

    @Test
    public void test1291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1291");
        User user0 = new User();
        user0.setPassword("hi!");
        user0.setPassword("");
        java.lang.String str5 = user0.getFirstName();
        user0.setEmail("hi!");
        user0.setPassword("hi!");
        java.lang.String str10 = user0.getEmail();
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
    }

    @Test
    public void test1292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1292");
        User user0 = new User();
        java.lang.String str1 = user0.getPassword();
        java.lang.String str2 = user0.getPassword();
        user0.setLastName("hi!");
        java.lang.String str5 = user0.getCountry();
        java.lang.String str6 = user0.getLastName();
        java.lang.String str7 = user0.getCountry();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test1293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1293");
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
        java.lang.String str18 = user0.getEmail();
        user0.setPassword("");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNull(str18);
    }

    @Test
    public void test1294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1294");
        User user0 = new User();
        java.lang.String str1 = user0.getFirstName();
        java.lang.String str2 = user0.getCountry();
        user0.setFirstName("");
        user0.setUsername("");
        java.lang.String str7 = user0.getCountry();
        java.lang.String str8 = user0.getEmail();
        java.lang.String str9 = user0.getEmail();
        user0.setEmail("");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test1295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1295");
        User user0 = new User();
        java.lang.String str1 = user0.getPassword();
        user0.setUsername("hi!");
        user0.setFirstName("hi!");
        java.lang.String str6 = user0.getPassword();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test1296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1296");
        User user0 = new User();
        java.lang.String str1 = user0.getPassword();
        user0.setCountry("hi!");
        java.lang.String str4 = user0.getFirstName();
        java.lang.String str5 = user0.getDob();
        java.lang.String str6 = user0.getLastName();
        user0.setDob("hi!");
        user0.setEmail("hi!");
        java.lang.String str11 = user0.getCountry();
        user0.setFirstName("");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
    }

    @Test
    public void test1297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1297");
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
        user0.setFirstName("");
        user0.setLastName("");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str13);
    }

    @Test
    public void test1298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1298");
        User user0 = new User();
        user0.setPassword("hi!");
        java.lang.String str3 = user0.getPassword();
        java.lang.String str4 = user0.getFirstName();
        java.lang.String str5 = user0.getLastName();
        user0.setCountry("");
        user0.setUsername("");
        user0.setUsername("");
        user0.setCountry("");
        java.lang.Class<?> wildcardClass14 = user0.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test1299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1299");
        User user0 = new User();
        java.lang.String str1 = user0.getPassword();
        java.lang.String str2 = user0.getPassword();
        user0.setLastName("hi!");
        java.lang.String str5 = user0.getCountry();
        java.lang.String str6 = user0.getEmail();
        user0.setDob("");
        user0.setCountry("");
        user0.setDob("hi!");
        java.lang.String str13 = user0.getPassword();
        user0.setCountry("");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str13);
    }

    @Test
    public void test1300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1300");
        User user0 = new User();
        java.lang.String str1 = user0.getPassword();
        user0.setUsername("hi!");
        user0.setFirstName("");
        java.lang.String str6 = user0.getPassword();
        user0.setLastName("");
        java.lang.String str9 = user0.getDob();
        java.lang.String str10 = user0.getEmail();
        user0.setDob("hi!");
        java.lang.String str13 = user0.getPassword();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str13);
    }

    @Test
    public void test1301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1301");
        User user0 = new User();
        java.lang.String str1 = user0.getPassword();
        user0.setCountry("hi!");
        java.lang.String str4 = user0.getFirstName();
        java.lang.String str5 = user0.getUsername();
        user0.setPassword("hi!");
        user0.setDob("");
        user0.setDob("hi!");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
    }

    @Test
    public void test1302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1302");
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
        user0.setDob("hi!");
        user0.setDob("");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str14);
    }

    @Test
    public void test1303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1303");
        User user0 = new User();
        java.lang.String str1 = user0.getPassword();
        java.lang.String str2 = user0.getUsername();
        user0.setDob("");
        java.lang.String str5 = user0.getEmail();
        java.lang.String str6 = user0.getCountry();
        user0.setPassword("hi!");
        java.lang.String str9 = user0.getCountry();
        java.lang.Class<?> wildcardClass10 = user0.getClass();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test1304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1304");
        User user0 = new User();
        user0.setPassword("hi!");
        user0.setPassword("");
        java.lang.String str5 = user0.getFirstName();
        user0.setEmail("hi!");
        java.lang.String str8 = user0.getLastName();
        user0.setPassword("");
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test1305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1305");
        User user0 = new User();
        java.lang.String str1 = user0.getPassword();
        user0.setCountry("hi!");
        java.lang.String str4 = user0.getPassword();
        java.lang.String str5 = user0.getPassword();
        java.lang.String str6 = user0.getFirstName();
        java.lang.String str7 = user0.getCountry();
        user0.setFirstName("hi!");
        user0.setDob("");
        java.lang.String str12 = user0.getEmail();
        user0.setEmail("");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test1306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1306");
        User user0 = new User();
        java.lang.String str1 = user0.getPassword();
        user0.setUsername("");
        user0.setLastName("hi!");
        user0.setLastName("");
        java.lang.Class<?> wildcardClass8 = user0.getClass();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test1307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1307");
        User user0 = new User();
        java.lang.String str1 = user0.getFirstName();
        user0.setPassword("");
        user0.setEmail("hi!");
        user0.setCountry("");
        user0.setDob("hi!");
        user0.setPassword("hi!");
        java.lang.String str12 = user0.getDob();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
    }

    @Test
    public void test1308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1308");
        User user0 = new User();
        java.lang.String str1 = user0.getPassword();
        user0.setCountry("hi!");
        java.lang.String str4 = user0.getUsername();
        user0.setPassword("");
        user0.setDob("hi!");
        user0.setDob("");
        user0.setEmail("");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str4);
    }

    @Test
    public void test1309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1309");
        User user0 = new User();
        java.lang.String str1 = user0.getPassword();
        java.lang.String str2 = user0.getUsername();
        java.lang.String str3 = user0.getEmail();
        user0.setUsername("");
        java.lang.String str6 = user0.getFirstName();
        java.lang.String str7 = user0.getUsername();
        java.lang.String str8 = user0.getCountry();
        user0.setLastName("");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test1310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1310");
        User user0 = new User();
        java.lang.String str1 = user0.getPassword();
        user0.setCountry("hi!");
        java.lang.String str4 = user0.getFirstName();
        user0.setLastName("hi!");
        user0.setDob("hi!");
        java.lang.String str9 = user0.getFirstName();
        user0.setCountry("");
        user0.setLastName("hi!");
        user0.setFirstName("");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test1311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1311");
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
        user0.setLastName("hi!");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test1312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1312");
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
        java.lang.String str16 = user0.getUsername();
        user0.setEmail("");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(str16);
    }

    @Test
    public void test1313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1313");
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
        java.lang.String str18 = user0.getPassword();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
    }

    @Test
    public void test1314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1314");
        User user0 = new User();
        java.lang.String str1 = user0.getPassword();
        java.lang.String str2 = user0.getUsername();
        java.lang.String str3 = user0.getEmail();
        java.lang.String str4 = user0.getLastName();
        java.lang.String str5 = user0.getFirstName();
        user0.setFirstName("");
        user0.setCountry("");
        java.lang.String str10 = user0.getUsername();
        user0.setCountry("");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test1315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1315");
        User user0 = new User();
        java.lang.String str1 = user0.getPassword();
        user0.setUsername("");
        user0.setFirstName("hi!");
        user0.setDob("");
        user0.setEmail("");
        java.lang.String str10 = user0.getPassword();
        java.lang.String str11 = user0.getFirstName();
        java.lang.String str12 = user0.getLastName();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test1316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1316");
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
        java.lang.String str15 = user0.getFirstName();
        user0.setLastName("");
        user0.setFirstName("");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
    }

    @Test
    public void test1317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1317");
        User user0 = new User();
        java.lang.String str1 = user0.getPassword();
        java.lang.String str2 = user0.getPassword();
        user0.setPassword("");
        java.lang.String str5 = user0.getEmail();
        java.lang.String str6 = user0.getLastName();
        java.lang.String str7 = user0.getCountry();
        user0.setPassword("");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test1318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1318");
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
        user0.setUsername("");
        java.lang.String str17 = user0.getEmail();
        user0.setCountry("");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(str17);
    }

    @Test
    public void test1319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1319");
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
        user0.setPassword("");
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
    public void test1320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1320");
        User user0 = new User();
        java.lang.String str1 = user0.getPassword();
        java.lang.String str2 = user0.getPassword();
        java.lang.String str3 = user0.getPassword();
        java.lang.String str4 = user0.getDob();
        user0.setFirstName("hi!");
        user0.setCountry("hi!");
        java.lang.String str9 = user0.getFirstName();
        user0.setPassword("");
        java.lang.String str12 = user0.getEmail();
        user0.setDob("");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test1321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1321");
        User user0 = new User();
        java.lang.String str1 = user0.getPassword();
        java.lang.String str2 = user0.getUsername();
        java.lang.String str3 = user0.getCountry();
        user0.setPassword("");
        user0.setLastName("");
        user0.setFirstName("");
        user0.setUsername("");
        user0.setCountry("");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test1322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1322");
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
        user0.setEmail("");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test1323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1323");
        User user0 = new User();
        user0.setPassword("hi!");
        user0.setPassword("");
        java.lang.String str5 = user0.getDob();
        user0.setEmail("");
        java.lang.String str8 = user0.getFirstName();
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test1324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1324");
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
        user0.setUsername("hi!");
        java.lang.String str13 = user0.getEmail();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str13);
    }

    @Test
    public void test1325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1325");
        User user0 = new User();
        java.lang.String str1 = user0.getPassword();
        user0.setCountry("hi!");
        java.lang.String str4 = user0.getFirstName();
        java.lang.String str5 = user0.getDob();
        java.lang.String str6 = user0.getLastName();
        user0.setLastName("");
        user0.setPassword("hi!");
        java.lang.String str11 = user0.getPassword();
        user0.setFirstName("");
        user0.setEmail("hi!");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
    }

    @Test
    public void test1326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1326");
        User user0 = new User();
        user0.setPassword("hi!");
        user0.setPassword("");
        java.lang.String str5 = user0.getDob();
        user0.setEmail("");
        user0.setUsername("");
        user0.setFirstName("hi!");
        user0.setFirstName("");
        user0.setCountry("hi!");
        org.junit.Assert.assertNull(str5);
    }

    @Test
    public void test1327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1327");
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
        java.lang.String str18 = user0.getLastName();
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
    public void test1328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1328");
        User user0 = new User();
        java.lang.String str1 = user0.getPassword();
        java.lang.String str2 = user0.getPassword();
        java.lang.String str3 = user0.getPassword();
        java.lang.String str4 = user0.getDob();
        user0.setFirstName("hi!");
        user0.setCountry("hi!");
        java.lang.String str9 = user0.getFirstName();
        user0.setPassword("");
        java.lang.String str12 = user0.getEmail();
        java.lang.String str13 = user0.getLastName();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str13);
    }

    @Test
    public void test1329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1329");
        User user0 = new User();
        java.lang.String str1 = user0.getPassword();
        java.lang.String str2 = user0.getPassword();
        java.lang.String str3 = user0.getFirstName();
        user0.setDob("hi!");
        java.lang.String str6 = user0.getEmail();
        user0.setPassword("hi!");
        user0.setDob("");
        user0.setPassword("hi!");
        java.lang.String str13 = user0.getCountry();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str13);
    }

    @Test
    public void test1330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1330");
        User user0 = new User();
        user0.setPassword("hi!");
        user0.setPassword("");
        user0.setUsername("");
        java.lang.String str7 = user0.getEmail();
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test1331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1331");
        User user0 = new User();
        java.lang.String str1 = user0.getPassword();
        java.lang.String str2 = user0.getUsername();
        java.lang.String str3 = user0.getEmail();
        user0.setUsername("");
        user0.setDob("hi!");
        java.lang.String str8 = user0.getCountry();
        java.lang.String str9 = user0.getLastName();
        java.lang.String str10 = user0.getDob();
        user0.setEmail("");
        java.lang.String str13 = user0.getFirstName();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNull(str13);
    }

    @Test
    public void test1332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1332");
        User user0 = new User();
        java.lang.String str1 = user0.getPassword();
        java.lang.String str2 = user0.getUsername();
        java.lang.String str3 = user0.getEmail();
        user0.setUsername("");
        user0.setUsername("");
        java.lang.String str8 = user0.getFirstName();
        java.lang.String str9 = user0.getPassword();
        java.lang.String str10 = user0.getPassword();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test1333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1333");
        User user0 = new User();
        java.lang.String str1 = user0.getPassword();
        java.lang.String str2 = user0.getPassword();
        user0.setUsername("");
        java.lang.String str5 = user0.getCountry();
        user0.setUsername("");
        user0.setEmail("hi!");
        user0.setFirstName("hi!");
        java.lang.String str12 = user0.getEmail();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
    }

    @Test
    public void test1334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1334");
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
        user0.setPassword("");
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
    public void test1335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1335");
        User user0 = new User();
        user0.setPassword("hi!");
        user0.setPassword("");
        java.lang.String str5 = user0.getPassword();
        java.lang.String str6 = user0.getEmail();
        java.lang.String str7 = user0.getEmail();
        user0.setFirstName("hi!");
        user0.setCountry("hi!");
        user0.setDob("hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test1336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1336");
        User user0 = new User();
        java.lang.String str1 = user0.getPassword();
        java.lang.String str2 = user0.getPassword();
        java.lang.String str3 = user0.getPassword();
        user0.setLastName("");
        user0.setUsername("hi!");
        java.lang.String str8 = user0.getDob();
        user0.setCountry("");
        java.lang.String str11 = user0.getCountry();
        user0.setEmail("hi!");
        java.lang.String str14 = user0.getCountry();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test1337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1337");
        User user0 = new User();
        java.lang.String str1 = user0.getPassword();
        user0.setCountry("hi!");
        user0.setUsername("hi!");
        java.lang.String str6 = user0.getUsername();
        user0.setLastName("");
        java.lang.String str9 = user0.getLastName();
        user0.setFirstName("hi!");
        java.lang.String str12 = user0.getLastName();
        java.lang.Class<?> wildcardClass13 = user0.getClass();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test1338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1338");
        User user0 = new User();
        user0.setPassword("hi!");
        user0.setPassword("");
        java.lang.String str5 = user0.getPassword();
        user0.setCountry("hi!");
        user0.setLastName("hi!");
        java.lang.String str10 = user0.getFirstName();
        java.lang.String str11 = user0.getLastName();
        user0.setLastName("");
        user0.setEmail("");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
    }

    @Test
    public void test1339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1339");
        User user0 = new User();
        user0.setPassword("hi!");
        user0.setPassword("");
        java.lang.String str5 = user0.getDob();
        user0.setEmail("");
        user0.setUsername("");
        user0.setFirstName("hi!");
        user0.setEmail("");
        user0.setCountry("hi!");
        org.junit.Assert.assertNull(str5);
    }

    @Test
    public void test1340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1340");
        User user0 = new User();
        user0.setPassword("hi!");
        user0.setPassword("");
        java.lang.String str5 = user0.getPassword();
        java.lang.String str6 = user0.getEmail();
        user0.setCountry("hi!");
        java.lang.String str9 = user0.getDob();
        user0.setCountry("hi!");
        java.lang.String str12 = user0.getEmail();
        java.lang.String str13 = user0.getEmail();
        user0.setLastName("");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str13);
    }

    @Test
    public void test1341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1341");
        User user0 = new User();
        user0.setPassword("hi!");
        user0.setPassword("");
        java.lang.String str5 = user0.getPassword();
        user0.setCountry("hi!");
        java.lang.String str8 = user0.getPassword();
        java.lang.String str9 = user0.getDob();
        java.lang.String str10 = user0.getCountry();
        java.lang.String str11 = user0.getEmail();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test1342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1342");
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
        java.lang.String str14 = user0.getUsername();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
    }

    @Test
    public void test1343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1343");
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
        java.lang.String str18 = user0.getCountry();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNull(str18);
    }

    @Test
    public void test1344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1344");
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
        java.lang.String str20 = user0.getDob();
        java.lang.String str21 = user0.getUsername();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
    }

    @Test
    public void test1345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1345");
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
        user0.setLastName("");
        user0.setPassword("");
        user0.setPassword("hi!");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str13);
    }

    @Test
    public void test1346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1346");
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
        user0.setEmail("");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
    }

    @Test
    public void test1347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1347");
        User user0 = new User();
        user0.setPassword("hi!");
        java.lang.String str3 = user0.getPassword();
        java.lang.String str4 = user0.getFirstName();
        java.lang.String str5 = user0.getLastName();
        user0.setFirstName("");
        java.lang.String str8 = user0.getLastName();
        java.lang.Class<?> wildcardClass9 = user0.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test1348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1348");
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
        java.lang.String str13 = user0.getFirstName();
        user0.setCountry("");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str13);
    }

    @Test
    public void test1349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1349");
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
        user0.setUsername("");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test1350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1350");
        User user0 = new User();
        user0.setPassword("hi!");
        user0.setLastName("");
        user0.setCountry("hi!");
        java.lang.String str7 = user0.getDob();
        java.lang.String str8 = user0.getCountry();
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
    }

    @Test
    public void test1351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1351");
        User user0 = new User();
        user0.setUsername("");
        java.lang.String str3 = user0.getDob();
        java.lang.String str4 = user0.getUsername();
        java.lang.String str5 = user0.getLastName();
        user0.setEmail("");
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNull(str5);
    }

    @Test
    public void test1352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1352");
        User user0 = new User();
        java.lang.String str1 = user0.getPassword();
        java.lang.String str2 = user0.getUsername();
        java.lang.String str3 = user0.getEmail();
        user0.setUsername("");
        user0.setUsername("");
        java.lang.String str8 = user0.getFirstName();
        user0.setLastName("");
        user0.setCountry("hi!");
        user0.setEmail("hi!");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test1353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1353");
        User user0 = new User();
        user0.setLastName("");
        java.lang.String str3 = user0.getCountry();
        java.lang.String str4 = user0.getDob();
        user0.setUsername("");
        java.lang.String str7 = user0.getFirstName();
        java.lang.String str8 = user0.getFirstName();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test1354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1354");
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
        user0.setDob("hi!");
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
    }

    @Test
    public void test1355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1355");
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
        java.lang.Class<?> wildcardClass15 = user0.getClass();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test1356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1356");
        User user0 = new User();
        java.lang.String str1 = user0.getPassword();
        user0.setUsername("hi!");
        user0.setCountry("hi!");
        user0.setFirstName("");
        user0.setUsername("");
        user0.setPassword("hi!");
        org.junit.Assert.assertNull(str1);
    }

    @Test
    public void test1357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1357");
        User user0 = new User();
        java.lang.String str1 = user0.getPassword();
        java.lang.String str2 = user0.getPassword();
        java.lang.String str3 = user0.getPassword();
        user0.setLastName("");
        user0.setUsername("hi!");
        user0.setUsername("");
        user0.setFirstName("");
        user0.setUsername("");
        user0.setFirstName("");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test1358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1358");
        User user0 = new User();
        user0.setPassword("hi!");
        user0.setLastName("");
        user0.setDob("");
        java.lang.String str7 = user0.getCountry();
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test1359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1359");
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
        user0.setDob("");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test1360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1360");
        User user0 = new User();
        java.lang.String str1 = user0.getPassword();
        java.lang.String str2 = user0.getPassword();
        java.lang.String str3 = user0.getFirstName();
        user0.setDob("hi!");
        java.lang.String str6 = user0.getEmail();
        user0.setPassword("hi!");
        user0.setDob("");
        user0.setPassword("hi!");
        user0.setPassword("");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test1361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1361");
        User user0 = new User();
        java.lang.String str1 = user0.getPassword();
        user0.setUsername("");
        user0.setFirstName("hi!");
        java.lang.String str6 = user0.getCountry();
        user0.setUsername("");
        java.lang.String str9 = user0.getLastName();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test1362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1362");
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
        user0.setEmail("hi!");
        java.lang.Class<?> wildcardClass18 = user0.getClass();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test1363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1363");
        User user0 = new User();
        java.lang.String str1 = user0.getPassword();
        java.lang.String str2 = user0.getPassword();
        user0.setLastName("hi!");
        java.lang.String str5 = user0.getCountry();
        user0.setCountry("hi!");
        java.lang.String str8 = user0.getEmail();
        java.lang.String str9 = user0.getLastName();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
    }

    @Test
    public void test1364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1364");
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
        user0.setPassword("");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str13);
    }

    @Test
    public void test1365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1365");
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
        java.lang.String str16 = user0.getCountry();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
    }

    @Test
    public void test1366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1366");
        User user0 = new User();
        java.lang.String str1 = user0.getFirstName();
        java.lang.String str2 = user0.getCountry();
        java.lang.String str3 = user0.getEmail();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test1367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1367");
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
        java.lang.String str14 = user0.getDob();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
    }

    @Test
    public void test1368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1368");
        User user0 = new User();
        java.lang.String str1 = user0.getFirstName();
        user0.setPassword("");
        user0.setUsername("hi!");
        java.lang.String str6 = user0.getDob();
        java.lang.String str7 = user0.getUsername();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
    }

    @Test
    public void test1369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1369");
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
        user0.setCountry("hi!");
        java.lang.String str21 = user0.getFirstName();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!" + "'", str21, "hi!");
    }

    @Test
    public void test1370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1370");
        User user0 = new User();
        java.lang.String str1 = user0.getPassword();
        user0.setUsername("hi!");
        user0.setCountry("hi!");
        user0.setFirstName("");
        user0.setCountry("");
        user0.setLastName("");
        user0.setPassword("hi!");
        java.lang.String str14 = user0.getCountry();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test1371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1371");
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
        user0.setLastName("");
        user0.setFirstName("hi!");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
    }

    @Test
    public void test1372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1372");
        User user0 = new User();
        java.lang.String str1 = user0.getPassword();
        user0.setCountry("hi!");
        java.lang.String str4 = user0.getFirstName();
        java.lang.String str5 = user0.getDob();
        java.lang.String str6 = user0.getLastName();
        user0.setFirstName("hi!");
        user0.setUsername("hi!");
        java.lang.String str11 = user0.getLastName();
        java.lang.String str12 = user0.getFirstName();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
    }

    @Test
    public void test1373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1373");
        User user0 = new User();
        java.lang.String str1 = user0.getPassword();
        user0.setUsername("");
        java.lang.String str4 = user0.getCountry();
        user0.setCountry("");
        java.lang.String str7 = user0.getFirstName();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test1374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1374");
        User user0 = new User();
        java.lang.String str1 = user0.getPassword();
        user0.setCountry("hi!");
        java.lang.String str4 = user0.getFirstName();
        java.lang.String str5 = user0.getUsername();
        user0.setPassword("hi!");
        user0.setDob("hi!");
        java.lang.Class<?> wildcardClass10 = user0.getClass();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test1375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1375");
        User user0 = new User();
        java.lang.String str1 = user0.getPassword();
        java.lang.String str2 = user0.getUsername();
        java.lang.String str3 = user0.getEmail();
        user0.setFirstName("");
        user0.setLastName("hi!");
        user0.setCountry("");
        user0.setUsername("hi!");
        java.lang.String str12 = user0.getDob();
        user0.setLastName("");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test1376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1376");
        User user0 = new User();
        java.lang.String str1 = user0.getPassword();
        java.lang.String str2 = user0.getUsername();
        java.lang.String str3 = user0.getCountry();
        java.lang.String str4 = user0.getFirstName();
        java.lang.String str5 = user0.getLastName();
        java.lang.String str6 = user0.getFirstName();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test1377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1377");
        User user0 = new User();
        java.lang.String str1 = user0.getPassword();
        user0.setCountry("hi!");
        java.lang.String str4 = user0.getPassword();
        java.lang.String str5 = user0.getPassword();
        java.lang.String str6 = user0.getEmail();
        java.lang.String str7 = user0.getUsername();
        java.lang.String str8 = user0.getCountry();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
    }

    @Test
    public void test1378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1378");
        User user0 = new User();
        java.lang.String str1 = user0.getPassword();
        user0.setUsername("hi!");
        user0.setCountry("hi!");
        java.lang.String str6 = user0.getEmail();
        java.lang.String str7 = user0.getDob();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test1379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1379");
        User user0 = new User();
        user0.setUsername("");
        java.lang.String str3 = user0.getUsername();
        user0.setPassword("hi!");
        java.lang.String str6 = user0.getEmail();
        user0.setDob("");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test1380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1380");
        User user0 = new User();
        user0.setPassword("hi!");
        user0.setPassword("");
        java.lang.String str5 = user0.getPassword();
        java.lang.String str6 = user0.getDob();
        java.lang.String str7 = user0.getDob();
        user0.setLastName("hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test1381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1381");
        User user0 = new User();
        user0.setLastName("");
        user0.setDob("hi!");
        user0.setCountry("");
        java.lang.String str7 = user0.getCountry();
        user0.setDob("hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test1382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1382");
        User user0 = new User();
        java.lang.String str1 = user0.getPassword();
        user0.setCountry("hi!");
        java.lang.String str4 = user0.getFirstName();
        user0.setLastName("hi!");
        user0.setLastName("hi!");
        java.lang.String str9 = user0.getPassword();
        java.lang.Class<?> wildcardClass10 = user0.getClass();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test1383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1383");
        User user0 = new User();
        java.lang.String str1 = user0.getPassword();
        user0.setCountry("hi!");
        java.lang.String str4 = user0.getPassword();
        user0.setFirstName("");
        user0.setPassword("hi!");
        java.lang.String str9 = user0.getLastName();
        user0.setFirstName("hi!");
        user0.setLastName("");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test1384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1384");
        User user0 = new User();
        java.lang.String str1 = user0.getFirstName();
        user0.setPassword("");
        java.lang.String str4 = user0.getEmail();
        java.lang.String str5 = user0.getDob();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
    }

    @Test
    public void test1385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1385");
        User user0 = new User();
        java.lang.String str1 = user0.getPassword();
        user0.setUsername("");
        user0.setFirstName("hi!");
        java.lang.String str6 = user0.getCountry();
        user0.setEmail("");
        user0.setUsername("hi!");
        user0.setFirstName("hi!");
        user0.setEmail("");
        user0.setCountry("");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test1386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1386");
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
        java.lang.String str14 = user0.getUsername();
        user0.setLastName("");
        java.lang.String str17 = user0.getEmail();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
    }

    @Test
    public void test1387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1387");
        User user0 = new User();
        java.lang.String str1 = user0.getPassword();
        user0.setUsername("hi!");
        user0.setCountry("hi!");
        java.lang.String str6 = user0.getLastName();
        user0.setLastName("");
        java.lang.String str9 = user0.getUsername();
        user0.setFirstName("hi!");
        java.lang.String str12 = user0.getDob();
        java.lang.String str13 = user0.getLastName();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test1388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1388");
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
        java.lang.String str16 = user0.getDob();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
    }

    @Test
    public void test1389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1389");
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
        java.lang.String str25 = user0.getUsername();
        user0.setUsername("hi!");
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
    }

    @Test
    public void test1390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1390");
        User user0 = new User();
        java.lang.String str1 = user0.getFirstName();
        user0.setPassword("");
        user0.setEmail("hi!");
        java.lang.String str6 = user0.getLastName();
        user0.setCountry("");
        user0.setCountry("hi!");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test1391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1391");
        User user0 = new User();
        java.lang.String str1 = user0.getPassword();
        java.lang.String str2 = user0.getUsername();
        java.lang.String str3 = user0.getCountry();
        user0.setPassword("");
        java.lang.String str6 = user0.getDob();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test1392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1392");
        User user0 = new User();
        java.lang.String str1 = user0.getPassword();
        user0.setUsername("hi!");
        user0.setCountry("hi!");
        java.lang.String str6 = user0.getLastName();
        user0.setUsername("");
        java.lang.String str9 = user0.getLastName();
        user0.setEmail("hi!");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test1393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1393");
        User user0 = new User();
        java.lang.String str1 = user0.getPassword();
        user0.setCountry("hi!");
        java.lang.String str4 = user0.getPassword();
        user0.setFirstName("");
        user0.setLastName("hi!");
        java.lang.String str9 = user0.getUsername();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test1394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1394");
        User user0 = new User();
        java.lang.String str1 = user0.getPassword();
        user0.setCountry("hi!");
        java.lang.String str4 = user0.getFirstName();
        user0.setLastName("hi!");
        user0.setDob("hi!");
        java.lang.String str9 = user0.getFirstName();
        java.lang.String str10 = user0.getDob();
        user0.setFirstName("hi!");
        java.lang.String str13 = user0.getDob();
        user0.setPassword("");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
    }

    @Test
    public void test1395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1395");
        User user0 = new User();
        java.lang.String str1 = user0.getPassword();
        user0.setCountry("hi!");
        java.lang.String str4 = user0.getFirstName();
        java.lang.String str5 = user0.getDob();
        java.lang.String str6 = user0.getLastName();
        user0.setLastName("");
        user0.setEmail("");
        java.lang.String str11 = user0.getUsername();
        java.lang.String str12 = user0.getLastName();
        java.lang.String str13 = user0.getEmail();
        java.lang.String str14 = user0.getPassword();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNull(str14);
    }

    @Test
    public void test1396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1396");
        User user0 = new User();
        java.lang.String str1 = user0.getPassword();
        user0.setCountry("hi!");
        java.lang.String str4 = user0.getFirstName();
        user0.setLastName("hi!");
        java.lang.String str7 = user0.getLastName();
        user0.setEmail("");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
    }

    @Test
    public void test1397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1397");
        User user0 = new User();
        java.lang.String str1 = user0.getPassword();
        user0.setCountry("hi!");
        java.lang.String str4 = user0.getPassword();
        user0.setEmail("hi!");
        user0.setUsername("hi!");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str4);
    }

    @Test
    public void test1398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1398");
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
        user0.setCountry("hi!");
        user0.setUsername("");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(str22);
    }

    @Test
    public void test1399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1399");
        User user0 = new User();
        java.lang.String str1 = user0.getPassword();
        user0.setCountry("hi!");
        java.lang.String str4 = user0.getFirstName();
        user0.setLastName("hi!");
        user0.setDob("hi!");
        java.lang.String str9 = user0.getFirstName();
        java.lang.String str10 = user0.getCountry();
        java.lang.String str11 = user0.getDob();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
    }

    @Test
    public void test1400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1400");
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
        user0.setDob("hi!");
        user0.setPassword("hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
    }

    @Test
    public void test1401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1401");
        User user0 = new User();
        java.lang.String str1 = user0.getPassword();
        user0.setUsername("hi!");
        user0.setCountry("hi!");
        java.lang.String str6 = user0.getLastName();
        user0.setLastName("");
        user0.setPassword("");
        java.lang.String str11 = user0.getEmail();
        java.lang.String str12 = user0.getUsername();
        user0.setLastName("hi!");
        user0.setPassword("");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
    }

    @Test
    public void test1402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1402");
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
        java.lang.String str17 = user0.getCountry();
        user0.setDob("");
        java.lang.String str20 = user0.getPassword();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
    }

    @Test
    public void test1403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1403");
        User user0 = new User();
        java.lang.String str1 = user0.getFirstName();
        user0.setPassword("");
        user0.setEmail("hi!");
        java.lang.String str6 = user0.getLastName();
        java.lang.String str7 = user0.getPassword();
        java.lang.String str8 = user0.getPassword();
        java.lang.String str9 = user0.getPassword();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test1404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1404");
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
        user0.setDob("");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str14);
    }

    @Test
    public void test1405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1405");
        User user0 = new User();
        java.lang.String str1 = user0.getPassword();
        user0.setCountry("hi!");
        java.lang.String str4 = user0.getPassword();
        java.lang.String str5 = user0.getPassword();
        user0.setCountry("");
        java.lang.String str8 = user0.getCountry();
        user0.setLastName("hi!");
        java.lang.String str11 = user0.getEmail();
        user0.setDob("");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test1406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1406");
        User user0 = new User();
        java.lang.String str1 = user0.getPassword();
        java.lang.String str2 = user0.getUsername();
        java.lang.String str3 = user0.getEmail();
        user0.setFirstName("");
        java.lang.String str6 = user0.getCountry();
        java.lang.String str7 = user0.getLastName();
        user0.setPassword("");
        user0.setFirstName("hi!");
        user0.setDob("");
        user0.setEmail("");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test1407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1407");
        User user0 = new User();
        java.lang.String str1 = user0.getFirstName();
        java.lang.String str2 = user0.getCountry();
        java.lang.String str3 = user0.getFirstName();
        user0.setCountry("hi!");
        java.lang.Class<?> wildcardClass6 = user0.getClass();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test1408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1408");
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
        java.lang.String str15 = user0.getPassword();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
    }

    @Test
    public void test1409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1409");
        User user0 = new User();
        java.lang.String str1 = user0.getPassword();
        user0.setUsername("hi!");
        java.lang.String str4 = user0.getDob();
        user0.setUsername("");
        user0.setLastName("");
        user0.setEmail("hi!");
        java.lang.String str11 = user0.getDob();
        user0.setPassword("hi!");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test1410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1410");
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
        user0.setLastName("");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str16);
    }

    @Test
    public void test1411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1411");
        User user0 = new User();
        java.lang.String str1 = user0.getPassword();
        user0.setCountry("hi!");
        java.lang.String str4 = user0.getUsername();
        user0.setPassword("");
        user0.setFirstName("");
        java.lang.String str9 = user0.getUsername();
        user0.setCountry("");
        user0.setDob("hi!");
        user0.setPassword("hi!");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test1412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1412");
        User user0 = new User();
        java.lang.String str1 = user0.getPassword();
        java.lang.String str2 = user0.getUsername();
        java.lang.String str3 = user0.getEmail();
        user0.setFirstName("");
        user0.setLastName("hi!");
        user0.setUsername("hi!");
        java.lang.String str10 = user0.getUsername();
        java.lang.String str11 = user0.getCountry();
        java.lang.String str12 = user0.getFirstName();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test1413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1413");
        User user0 = new User();
        java.lang.String str1 = user0.getPassword();
        user0.setUsername("hi!");
        user0.setFirstName("");
        java.lang.String str6 = user0.getPassword();
        user0.setEmail("hi!");
        java.lang.String str9 = user0.getEmail();
        java.lang.String str10 = user0.getFirstName();
        user0.setLastName("hi!");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test1414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1414");
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
        user0.setEmail("hi!");
        java.lang.String str17 = user0.getEmail();
        java.lang.String str18 = user0.getUsername();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
    }

    @Test
    public void test1415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1415");
        User user0 = new User();
        java.lang.String str1 = user0.getPassword();
        user0.setCountry("hi!");
        user0.setUsername("hi!");
        user0.setCountry("");
        user0.setLastName("hi!");
        java.lang.String str10 = user0.getCountry();
        user0.setLastName("");
        java.lang.String str13 = user0.getUsername();
        java.lang.String str14 = user0.getEmail();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertNull(str14);
    }

    @Test
    public void test1416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1416");
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
        user0.setUsername("");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
    }

    @Test
    public void test1417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1417");
        User user0 = new User();
        java.lang.String str1 = user0.getPassword();
        user0.setUsername("hi!");
        user0.setCountry("hi!");
        user0.setFirstName("");
        user0.setCountry("");
        java.lang.String str10 = user0.getLastName();
        user0.setCountry("hi!");
        java.lang.String str13 = user0.getCountry();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
    }

    @Test
    public void test1418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1418");
        User user0 = new User();
        java.lang.String str1 = user0.getPassword();
        user0.setCountry("hi!");
        java.lang.String str4 = user0.getPassword();
        java.lang.String str5 = user0.getPassword();
        java.lang.String str6 = user0.getFirstName();
        java.lang.String str7 = user0.getCountry();
        user0.setFirstName("hi!");
        user0.setDob("");
        java.lang.String str12 = user0.getEmail();
        java.lang.String str13 = user0.getUsername();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str13);
    }

    @Test
    public void test1419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1419");
        User user0 = new User();
        java.lang.String str1 = user0.getPassword();
        java.lang.String str2 = user0.getPassword();
        java.lang.String str3 = user0.getFirstName();
        user0.setPassword("");
        java.lang.String str6 = user0.getLastName();
        user0.setFirstName("");
        java.lang.String str9 = user0.getPassword();
        java.lang.String str10 = user0.getUsername();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test1420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1420");
        User user0 = new User();
        user0.setPassword("hi!");
        user0.setLastName("");
        java.lang.String str5 = user0.getPassword();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
    }

    @Test
    public void test1421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1421");
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
        java.lang.String str20 = user0.getPassword();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
    }

    @Test
    public void test1422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1422");
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
        java.lang.String str20 = user0.getLastName();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(str20);
    }

    @Test
    public void test1423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1423");
        User user0 = new User();
        java.lang.String str1 = user0.getPassword();
        user0.setCountry("hi!");
        java.lang.String str4 = user0.getUsername();
        java.lang.String str5 = user0.getPassword();
        java.lang.String str6 = user0.getUsername();
        user0.setCountry("hi!");
        user0.setLastName("hi!");
        user0.setUsername("hi!");
        java.lang.Class<?> wildcardClass13 = user0.getClass();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test1424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1424");
        User user0 = new User();
        user0.setPassword("hi!");
        user0.setPassword("");
        java.lang.String str5 = user0.getPassword();
        user0.setCountry("hi!");
        java.lang.String str8 = user0.getCountry();
        java.lang.String str9 = user0.getFirstName();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test1425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1425");
        User user0 = new User();
        java.lang.String str1 = user0.getPassword();
        java.lang.String str2 = user0.getLastName();
        java.lang.String str3 = user0.getEmail();
        user0.setFirstName("");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test1426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1426");
        User user0 = new User();
        java.lang.String str1 = user0.getPassword();
        java.lang.String str2 = user0.getPassword();
        user0.setUsername("");
        java.lang.String str5 = user0.getCountry();
        java.lang.String str6 = user0.getDob();
        java.lang.String str7 = user0.getFirstName();
        user0.setCountry("");
        user0.setUsername("hi!");
        java.lang.Class<?> wildcardClass12 = user0.getClass();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test1427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1427");
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
        java.lang.String str14 = user0.getFirstName();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test1428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1428");
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
        user0.setLastName("");
        java.lang.String str17 = user0.getEmail();
        user0.setCountry("hi!");
        user0.setCountry("");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNull(str17);
    }

    @Test
    public void test1429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1429");
        User user0 = new User();
        java.lang.String str1 = user0.getPassword();
        java.lang.String str2 = user0.getUsername();
        java.lang.String str3 = user0.getEmail();
        java.lang.String str4 = user0.getLastName();
        java.lang.String str5 = user0.getFirstName();
        user0.setFirstName("");
        user0.setUsername("hi!");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
    }

    @Test
    public void test1430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1430");
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
        user0.setUsername("");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str13);
    }

    @Test
    public void test1431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1431");
        User user0 = new User();
        java.lang.String str1 = user0.getPassword();
        java.lang.String str2 = user0.getUsername();
        java.lang.String str3 = user0.getEmail();
        java.lang.String str4 = user0.getLastName();
        java.lang.String str5 = user0.getFirstName();
        user0.setFirstName("");
        java.lang.String str8 = user0.getUsername();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test1432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1432");
        User user0 = new User();
        java.lang.String str1 = user0.getPassword();
        user0.setUsername("hi!");
        user0.setCountry("hi!");
        java.lang.String str6 = user0.getLastName();
        user0.setLastName("hi!");
        user0.setFirstName("hi!");
        user0.setEmail("");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test1433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1433");
        User user0 = new User();
        user0.setPassword("hi!");
        java.lang.String str3 = user0.getPassword();
        user0.setLastName("hi!");
        user0.setUsername("hi!");
        user0.setLastName("hi!");
        java.lang.String str10 = user0.getDob();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test1434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1434");
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
        user0.setEmail("");
        java.lang.String str15 = user0.getDob();
        user0.setEmail("");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
    }

    @Test
    public void test1435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1435");
        User user0 = new User();
        java.lang.String str1 = user0.getPassword();
        user0.setCountry("hi!");
        java.lang.String str4 = user0.getFirstName();
        user0.setLastName("hi!");
        user0.setLastName("hi!");
        java.lang.String str9 = user0.getUsername();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test1436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1436");
        User user0 = new User();
        user0.setLastName("");
        user0.setDob("hi!");
        user0.setCountry("");
        java.lang.String str7 = user0.getCountry();
        java.lang.String str8 = user0.getFirstName();
        user0.setCountry("hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test1437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1437");
        User user0 = new User();
        user0.setPassword("hi!");
        user0.setPassword("");
        user0.setPassword("");
        java.lang.String str7 = user0.getLastName();
        java.lang.String str8 = user0.getEmail();
        user0.setLastName("hi!");
        user0.setLastName("hi!");
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test1438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1438");
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
        java.lang.String str14 = user0.getPassword();
        user0.setEmail("");
        java.lang.String str17 = user0.getDob();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNull(str17);
    }

    @Test
    public void test1439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1439");
        User user0 = new User();
        java.lang.String str1 = user0.getPassword();
        java.lang.String str2 = user0.getPassword();
        user0.setLastName("hi!");
        user0.setLastName("hi!");
        java.lang.String str7 = user0.getEmail();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test1440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1440");
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
        java.lang.String str15 = user0.getCountry();
        user0.setUsername("hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str15);
    }

    @Test
    public void test1441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1441");
        User user0 = new User();
        java.lang.String str1 = user0.getPassword();
        java.lang.String str2 = user0.getUsername();
        java.lang.String str3 = user0.getEmail();
        user0.setFirstName("");
        user0.setLastName("hi!");
        java.lang.String str8 = user0.getFirstName();
        java.lang.String str9 = user0.getUsername();
        user0.setUsername("hi!");
        user0.setDob("hi!");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test1442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1442");
        User user0 = new User();
        user0.setPassword("hi!");
        user0.setPassword("");
        java.lang.String str5 = user0.getPassword();
        user0.setCountry("hi!");
        user0.setLastName("hi!");
        user0.setFirstName("");
        java.lang.String str12 = user0.getFirstName();
        user0.setCountry("");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test1443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1443");
        User user0 = new User();
        java.lang.String str1 = user0.getPassword();
        user0.setUsername("");
        user0.setFirstName("hi!");
        java.lang.String str6 = user0.getCountry();
        user0.setCountry("");
        java.lang.String str9 = user0.getFirstName();
        java.lang.String str10 = user0.getUsername();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test1444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1444");
        User user0 = new User();
        java.lang.String str1 = user0.getPassword();
        java.lang.String str2 = user0.getPassword();
        java.lang.String str3 = user0.getPassword();
        java.lang.String str4 = user0.getDob();
        user0.setFirstName("hi!");
        user0.setDob("");
        java.lang.String str9 = user0.getEmail();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test1445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1445");
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
        java.lang.String str16 = user0.getPassword();
        java.lang.String str17 = user0.getDob();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
    }

    @Test
    public void test1446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1446");
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
        user0.setLastName("");
        user0.setLastName("");
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
    public void test1447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1447");
        User user0 = new User();
        java.lang.String str1 = user0.getPassword();
        java.lang.String str2 = user0.getUsername();
        user0.setDob("");
        java.lang.String str5 = user0.getEmail();
        java.lang.String str6 = user0.getCountry();
        user0.setPassword("hi!");
        user0.setCountry("");
        user0.setEmail("");
        java.lang.String str13 = user0.getCountry();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test1448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1448");
        User user0 = new User();
        java.lang.String str1 = user0.getPassword();
        user0.setCountry("hi!");
        java.lang.String str4 = user0.getFirstName();
        java.lang.String str5 = user0.getDob();
        java.lang.String str6 = user0.getEmail();
        user0.setUsername("hi!");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test1449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1449");
        User user0 = new User();
        java.lang.String str1 = user0.getPassword();
        java.lang.String str2 = user0.getUsername();
        java.lang.String str3 = user0.getEmail();
        java.lang.String str4 = user0.getLastName();
        user0.setDob("");
        java.lang.String str7 = user0.getLastName();
        java.lang.String str8 = user0.getCountry();
        java.lang.String str9 = user0.getDob();
        java.lang.Class<?> wildcardClass10 = user0.getClass();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test1450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1450");
        User user0 = new User();
        java.lang.String str1 = user0.getPassword();
        user0.setCountry("hi!");
        java.lang.String str4 = user0.getPassword();
        java.lang.String str5 = user0.getPassword();
        java.lang.String str6 = user0.getEmail();
        java.lang.String str7 = user0.getFirstName();
        user0.setDob("");
        user0.setLastName("");
        java.lang.Class<?> wildcardClass12 = user0.getClass();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test1451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1451");
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
        java.lang.String str13 = user0.getDob();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test1452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1452");
        User user0 = new User();
        user0.setPassword("hi!");
        java.lang.String str3 = user0.getPassword();
        java.lang.String str4 = user0.getFirstName();
        java.lang.String str5 = user0.getDob();
        user0.setEmail("");
        user0.setEmail("");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
    }

    @Test
    public void test1453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1453");
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
        user0.setLastName("hi!");
        user0.setEmail("hi!");
        user0.setDob("");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
    }

    @Test
    public void test1454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1454");
        User user0 = new User();
        java.lang.String str1 = user0.getPassword();
        user0.setCountry("hi!");
        user0.setUsername("hi!");
        java.lang.String str6 = user0.getUsername();
        user0.setUsername("hi!");
        user0.setUsername("hi!");
        user0.setCountry("");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
    }

    @Test
    public void test1455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1455");
        User user0 = new User();
        user0.setPassword("hi!");
        java.lang.String str3 = user0.getPassword();
        user0.setLastName("hi!");
        user0.setUsername("hi!");
        user0.setLastName("hi!");
        user0.setDob("hi!");
        user0.setFirstName("hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
    }

    @Test
    public void test1456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1456");
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
        java.lang.String str15 = user0.getCountry();
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(str15);
    }

    @Test
    public void test1457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1457");
        User user0 = new User();
        java.lang.String str1 = user0.getPassword();
        java.lang.String str2 = user0.getPassword();
        java.lang.String str3 = user0.getCountry();
        user0.setFirstName("");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test1458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1458");
        User user0 = new User();
        java.lang.String str1 = user0.getPassword();
        java.lang.String str2 = user0.getUsername();
        java.lang.String str3 = user0.getEmail();
        user0.setFirstName("");
        user0.setLastName("hi!");
        user0.setCountry("");
        user0.setCountry("");
        java.lang.Class<?> wildcardClass12 = user0.getClass();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test1459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1459");
        User user0 = new User();
        java.lang.String str1 = user0.getPassword();
        user0.setCountry("hi!");
        java.lang.String str4 = user0.getFirstName();
        java.lang.String str5 = user0.getDob();
        user0.setEmail("");
        user0.setEmail("");
        java.lang.String str10 = user0.getUsername();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test1460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1460");
        User user0 = new User();
        java.lang.String str1 = user0.getPassword();
        user0.setCountry("hi!");
        user0.setUsername("hi!");
        user0.setPassword("");
        java.lang.String str8 = user0.getCountry();
        user0.setCountry("");
        java.lang.String str11 = user0.getFirstName();
        user0.setEmail("hi!");
        java.lang.String str14 = user0.getLastName();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str14);
    }

    @Test
    public void test1461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1461");
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
        user0.setLastName("hi!");
        user0.setEmail("hi!");
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
    }

    @Test
    public void test1462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1462");
        User user0 = new User();
        user0.setPassword("hi!");
        user0.setPassword("");
        java.lang.String str5 = user0.getFirstName();
        user0.setEmail("hi!");
        java.lang.String str8 = user0.getLastName();
        user0.setUsername("");
        java.lang.String str11 = user0.getDob();
        user0.setLastName("");
        user0.setCountry("");
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test1463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1463");
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
        java.lang.String str15 = user0.getUsername();
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
    }

    @Test
    public void test1464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1464");
        User user0 = new User();
        java.lang.String str1 = user0.getPassword();
        user0.setCountry("hi!");
        java.lang.String str4 = user0.getFirstName();
        user0.setLastName("hi!");
        user0.setDob("hi!");
        java.lang.String str9 = user0.getEmail();
        user0.setDob("hi!");
        user0.setPassword("hi!");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test1465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1465");
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
        java.lang.String str18 = user0.getLastName();
        user0.setPassword("");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(str18);
    }

    @Test
    public void test1466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1466");
        User user0 = new User();
        java.lang.String str1 = user0.getPassword();
        java.lang.String str2 = user0.getUsername();
        java.lang.String str3 = user0.getEmail();
        user0.setUsername("");
        java.lang.String str6 = user0.getPassword();
        java.lang.String str7 = user0.getDob();
        user0.setLastName("hi!");
        user0.setEmail("");
        java.lang.String str12 = user0.getEmail();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test1467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1467");
        User user0 = new User();
        user0.setPassword("hi!");
        java.lang.String str3 = user0.getPassword();
        user0.setLastName("hi!");
        user0.setUsername("hi!");
        user0.setLastName("hi!");
        java.lang.String str10 = user0.getUsername();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
    }

    @Test
    public void test1468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1468");
        User user0 = new User();
        java.lang.String str1 = user0.getPassword();
        user0.setCountry("hi!");
        java.lang.String str4 = user0.getFirstName();
        user0.setLastName("hi!");
        user0.setDob("hi!");
        java.lang.String str9 = user0.getFirstName();
        user0.setLastName("hi!");
        java.lang.String str12 = user0.getEmail();
        java.lang.String str13 = user0.getUsername();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str13);
    }

    @Test
    public void test1469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1469");
        User user0 = new User();
        user0.setPassword("hi!");
        user0.setPassword("");
        user0.setUsername("");
        user0.setFirstName("");
        user0.setEmail("");
        java.lang.String str11 = user0.getDob();
        user0.setPassword("");
        user0.setUsername("");
        java.lang.String str16 = user0.getEmail();
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
    }

    @Test
    public void test1470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1470");
        User user0 = new User();
        java.lang.String str1 = user0.getPassword();
        java.lang.String str2 = user0.getPassword();
        java.lang.String str3 = user0.getFirstName();
        java.lang.String str4 = user0.getDob();
        user0.setDob("hi!");
        java.lang.String str7 = user0.getLastName();
        user0.setLastName("hi!");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test1471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1471");
        User user0 = new User();
        java.lang.String str1 = user0.getPassword();
        user0.setCountry("hi!");
        java.lang.String str4 = user0.getUsername();
        java.lang.String str5 = user0.getPassword();
        java.lang.String str6 = user0.getDob();
        java.lang.Class<?> wildcardClass7 = user0.getClass();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test1472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1472");
        User user0 = new User();
        java.lang.String str1 = user0.getPassword();
        user0.setUsername("");
        user0.setFirstName("hi!");
        java.lang.String str6 = user0.getCountry();
        user0.setEmail("");
        user0.setUsername("hi!");
        user0.setFirstName("hi!");
        user0.setPassword("hi!");
        user0.setDob("");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test1473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1473");
        User user0 = new User();
        user0.setLastName("");
        user0.setDob("hi!");
        user0.setCountry("");
        java.lang.String str7 = user0.getDob();
        java.lang.String str8 = user0.getUsername();
        java.lang.String str9 = user0.getPassword();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test1474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1474");
        User user0 = new User();
        java.lang.String str1 = user0.getPassword();
        java.lang.String str2 = user0.getUsername();
        java.lang.String str3 = user0.getCountry();
        user0.setFirstName("");
        user0.setLastName("");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test1475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1475");
        User user0 = new User();
        java.lang.String str1 = user0.getPassword();
        java.lang.String str2 = user0.getPassword();
        java.lang.String str3 = user0.getFirstName();
        user0.setDob("hi!");
        java.lang.String str6 = user0.getEmail();
        user0.setPassword("hi!");
        java.lang.String str9 = user0.getPassword();
        java.lang.String str10 = user0.getEmail();
        java.lang.String str11 = user0.getCountry();
        java.lang.Class<?> wildcardClass12 = user0.getClass();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test1476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1476");
        User user0 = new User();
        java.lang.String str1 = user0.getPassword();
        user0.setCountry("hi!");
        java.lang.String str4 = user0.getPassword();
        java.lang.String str5 = user0.getDob();
        user0.setCountry("hi!");
        java.lang.String str8 = user0.getCountry();
        java.lang.String str9 = user0.getLastName();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test1477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1477");
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
        java.lang.String str13 = user0.getDob();
        java.lang.String str14 = user0.getCountry();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(str14);
    }

    @Test
    public void test1478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1478");
        User user0 = new User();
        java.lang.String str1 = user0.getPassword();
        user0.setCountry("hi!");
        java.lang.String str4 = user0.getFirstName();
        user0.setLastName("hi!");
        user0.setDob("hi!");
        java.lang.String str9 = user0.getFirstName();
        java.lang.String str10 = user0.getFirstName();
        user0.setLastName("hi!");
        user0.setLastName("hi!");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test1479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1479");
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
        user0.setEmail("");
        user0.setDob("hi!");
        java.lang.String str20 = user0.getPassword();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(str20);
    }

    @Test
    public void test1480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1480");
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
        java.lang.String str14 = user0.getUsername();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertNull(str14);
    }

    @Test
    public void test1481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1481");
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
        user0.setEmail("");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test1482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1482");
        User user0 = new User();
        java.lang.String str1 = user0.getPassword();
        user0.setCountry("hi!");
        java.lang.String str4 = user0.getFirstName();
        java.lang.String str5 = user0.getDob();
        user0.setEmail("hi!");
        user0.setEmail("hi!");
        java.lang.String str10 = user0.getUsername();
        user0.setEmail("hi!");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test1483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1483");
        User user0 = new User();
        user0.setUsername("");
        java.lang.String str3 = user0.getUsername();
        java.lang.String str4 = user0.getFirstName();
        user0.setPassword("hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNull(str4);
    }

    @Test
    public void test1484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1484");
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
        user0.setUsername("hi!");
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
    public void test1485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1485");
        User user0 = new User();
        java.lang.String str1 = user0.getFirstName();
        user0.setPassword("");
        user0.setUsername("hi!");
        java.lang.String str6 = user0.getDob();
        user0.setEmail("");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test1486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1486");
        User user0 = new User();
        java.lang.String str1 = user0.getPassword();
        java.lang.String str2 = user0.getUsername();
        java.lang.String str3 = user0.getCountry();
        user0.setPassword("");
        user0.setLastName("");
        user0.setUsername("");
        user0.setUsername("hi!");
        user0.setCountry("");
        java.lang.String str14 = user0.getUsername();
        java.lang.String str15 = user0.getLastName();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
    }

    @Test
    public void test1487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1487");
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
        user0.setPassword("");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
    }

    @Test
    public void test1488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1488");
        User user0 = new User();
        user0.setPassword("hi!");
        java.lang.String str3 = user0.getPassword();
        java.lang.String str4 = user0.getFirstName();
        java.lang.String str5 = user0.getPassword();
        user0.setUsername("");
        java.lang.String str8 = user0.getUsername();
        java.lang.String str9 = user0.getFirstName();
        user0.setLastName("hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test1489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1489");
        User user0 = new User();
        java.lang.String str1 = user0.getPassword();
        user0.setCountry("hi!");
        java.lang.String str4 = user0.getFirstName();
        java.lang.String str5 = user0.getDob();
        java.lang.String str6 = user0.getEmail();
        java.lang.String str7 = user0.getEmail();
        java.lang.Class<?> wildcardClass8 = user0.getClass();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test1490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1490");
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
        java.lang.String str16 = user0.getCountry();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
    }

    @Test
    public void test1491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1491");
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
        user0.setPassword("hi!");
        user0.setCountry("");
        user0.setFirstName("");
        user0.setFirstName("hi!");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
    }

    @Test
    public void test1492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1492");
        User user0 = new User();
        java.lang.String str1 = user0.getPassword();
        user0.setCountry("hi!");
        java.lang.String str4 = user0.getFirstName();
        java.lang.String str5 = user0.getDob();
        java.lang.String str6 = user0.getLastName();
        user0.setFirstName("hi!");
        java.lang.String str9 = user0.getUsername();
        user0.setPassword("");
        user0.setDob("hi!");
        java.lang.String str14 = user0.getLastName();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str14);
    }

    @Test
    public void test1493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1493");
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
        java.lang.String str13 = user0.getCountry();
        java.lang.String str14 = user0.getDob();
        user0.setCountry("");
        user0.setUsername("");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test1494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1494");
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
        java.lang.String str18 = user0.getUsername();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str18);
    }

    @Test
    public void test1495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1495");
        User user0 = new User();
        java.lang.String str1 = user0.getPassword();
        user0.setCountry("hi!");
        java.lang.String str4 = user0.getFirstName();
        user0.setLastName("hi!");
        user0.setDob("hi!");
        java.lang.String str9 = user0.getFirstName();
        user0.setPassword("");
        java.lang.String str12 = user0.getLastName();
        user0.setCountry("hi!");
        java.lang.String str15 = user0.getFirstName();
        java.lang.String str16 = user0.getFirstName();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNull(str16);
    }

    @Test
    public void test1496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1496");
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
        java.lang.String str13 = user0.getFirstName();
        java.lang.String str14 = user0.getEmail();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNull(str14);
    }

    @Test
    public void test1497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1497");
        User user0 = new User();
        user0.setPassword("hi!");
        user0.setPassword("");
        java.lang.String str5 = user0.getPassword();
        user0.setCountry("hi!");
        java.lang.String str8 = user0.getPassword();
        user0.setEmail("hi!");
        java.lang.String str11 = user0.getUsername();
        java.lang.String str12 = user0.getEmail();
        java.lang.String str13 = user0.getUsername();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertNull(str13);
    }

    @Test
    public void test1498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1498");
        User user0 = new User();
        java.lang.String str1 = user0.getPassword();
        java.lang.String str2 = user0.getPassword();
        java.lang.String str3 = user0.getFirstName();
        user0.setDob("hi!");
        java.lang.String str6 = user0.getEmail();
        java.lang.String str7 = user0.getFirstName();
        java.lang.String str8 = user0.getFirstName();
        java.lang.String str9 = user0.getFirstName();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test1499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1499");
        User user0 = new User();
        java.lang.String str1 = user0.getFirstName();
        java.lang.String str2 = user0.getCountry();
        user0.setFirstName("");
        user0.setUsername("");
        java.lang.String str7 = user0.getEmail();
        java.lang.String str8 = user0.getCountry();
        user0.setPassword("");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test1500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1500");
        User user0 = new User();
        java.lang.String str1 = user0.getPassword();
        user0.setCountry("hi!");
        java.lang.String str4 = user0.getFirstName();
        java.lang.String str5 = user0.getDob();
        java.lang.String str6 = user0.getLastName();
        user0.setFirstName("hi!");
        user0.setUsername("");
        user0.setCountry("");
        user0.setCountry("hi!");
        java.lang.String str15 = user0.getEmail();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str15);
    }
}

