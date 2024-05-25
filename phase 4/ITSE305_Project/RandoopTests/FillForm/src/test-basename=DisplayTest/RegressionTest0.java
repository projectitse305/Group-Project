import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest0 {

    public static boolean debug = false;

    @Test
    public void test0001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0001");
        User user0 = new User();
        java.lang.String str1 = user0.getPassword();
        java.lang.String str2 = user0.getUsername();
        java.lang.Class<?> wildcardClass3 = user0.getClass();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test0002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0002");
        User user0 = new User();
        java.lang.String str1 = user0.getPassword();
        user0.setCountry("hi!");
        java.lang.String str4 = user0.getPassword();
        java.lang.String str5 = user0.getPassword();
        java.lang.Class<?> wildcardClass6 = user0.getClass();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0003");
        User user0 = new User();
        java.lang.String str1 = user0.getPassword();
        user0.setUsername("hi!");
        user0.setFirstName("");
        java.lang.Class<?> wildcardClass6 = user0.getClass();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0004");
        User user0 = new User();
        user0.setPassword("hi!");
        java.lang.String str3 = user0.getPassword();
        java.lang.String str4 = user0.getPassword();
        java.lang.Class<?> wildcardClass5 = user0.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0005");
        User user0 = new User();
        java.lang.String str1 = user0.getPassword();
        java.lang.String str2 = user0.getPassword();
        java.lang.String str3 = user0.getPassword();
        java.lang.String str4 = user0.getDob();
        java.lang.Class<?> wildcardClass5 = user0.getClass();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0006");
        User user0 = new User();
        java.lang.String str1 = user0.getPassword();
        java.lang.String str2 = user0.getUsername();
        java.lang.String str3 = user0.getEmail();
        user0.setUsername("");
        java.lang.String str6 = user0.getFirstName();
        java.lang.String str7 = user0.getUsername();
        java.lang.Class<?> wildcardClass8 = user0.getClass();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0007");
        User user0 = new User();
        java.lang.String str1 = user0.getPassword();
        user0.setCountry("hi!");
        java.lang.String str4 = user0.getFirstName();
        user0.setLastName("hi!");
        java.lang.Class<?> wildcardClass7 = user0.getClass();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0008");
        User user0 = new User();
        user0.setPassword("hi!");
        user0.setPassword("");
        java.lang.String str5 = user0.getPassword();
        user0.setCountry("hi!");
        user0.setLastName("hi!");
        user0.setEmail("hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
    }

    @Test
    public void test0009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0009");
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
        java.lang.Class<?> wildcardClass13 = user0.getClass();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0010");
        User user0 = new User();
        java.lang.String str1 = user0.getPassword();
        java.lang.String str2 = user0.getUsername();
        java.lang.String str3 = user0.getEmail();
        user0.setFirstName("");
        user0.setLastName("hi!");
        user0.setCountry("");
        java.lang.Class<?> wildcardClass10 = user0.getClass();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0011");
        User user0 = new User();
        java.lang.String str1 = user0.getPassword();
        user0.setCountry("hi!");
        java.lang.String str4 = user0.getPassword();
        java.lang.Class<?> wildcardClass5 = user0.getClass();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0012");
        User user0 = new User();
        java.lang.String str1 = user0.getPassword();
        java.lang.String str2 = user0.getUsername();
        java.lang.String str3 = user0.getEmail();
        user0.setUsername("");
        java.lang.String str6 = user0.getFirstName();
        java.lang.String str7 = user0.getUsername();
        java.lang.String str8 = user0.getCountry();
        java.lang.String str9 = user0.getFirstName();
        java.lang.Class<?> wildcardClass10 = user0.getClass();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0013");
        User user0 = new User();
        java.lang.String str1 = user0.getPassword();
        java.lang.String str2 = user0.getUsername();
        java.lang.String str3 = user0.getCountry();
        user0.setPassword("");
        java.lang.String str6 = user0.getUsername();
        java.lang.Class<?> wildcardClass7 = user0.getClass();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0014");
        User user0 = new User();
        java.lang.String str1 = user0.getPassword();
        user0.setCountry("hi!");
        java.lang.String str4 = user0.getFirstName();
        java.lang.String str5 = user0.getDob();
        java.lang.String str6 = user0.getLastName();
        user0.setFirstName("hi!");
        user0.setUsername("hi!");
        java.lang.Class<?> wildcardClass11 = user0.getClass();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0015");
        User user0 = new User();
        java.lang.String str1 = user0.getPassword();
        java.lang.String str2 = user0.getUsername();
        user0.setDob("");
        java.lang.Class<?> wildcardClass5 = user0.getClass();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0016");
        User user0 = new User();
        user0.setPassword("hi!");
        java.lang.String str3 = user0.getPassword();
        java.lang.String str4 = user0.getPassword();
        java.lang.String str5 = user0.getFirstName();
        java.lang.Class<?> wildcardClass6 = user0.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0017");
        User user0 = new User();
        java.lang.String str1 = user0.getPassword();
        user0.setUsername("");
        user0.setLastName("");
        user0.setEmail("hi!");
        java.lang.Class<?> wildcardClass8 = user0.getClass();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0018");
        User user0 = new User();
        java.lang.String str1 = user0.getFirstName();
        java.lang.String str2 = user0.getCountry();
        user0.setFirstName("");
        user0.setUsername("");
        java.lang.Class<?> wildcardClass7 = user0.getClass();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0019");
        User user0 = new User();
        java.lang.String str1 = user0.getPassword();
        user0.setUsername("hi!");
        user0.setFirstName("");
        java.lang.String str6 = user0.getPassword();
        user0.setUsername("hi!");
        java.lang.Class<?> wildcardClass9 = user0.getClass();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0020");
        User user0 = new User();
        java.lang.String str1 = user0.getPassword();
        java.lang.String str2 = user0.getUsername();
        java.lang.String str3 = user0.getEmail();
        user0.setFirstName("");
        user0.setLastName("hi!");
        user0.setUsername("hi!");
        user0.setDob("");
        java.lang.String str12 = user0.getEmail();
        java.lang.Class<?> wildcardClass13 = user0.getClass();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0021");
        User user0 = new User();
        java.lang.String str1 = user0.getPassword();
        java.lang.String str2 = user0.getUsername();
        java.lang.String str3 = user0.getCountry();
        user0.setPassword("");
        java.lang.Class<?> wildcardClass6 = user0.getClass();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0022");
        User user0 = new User();
        java.lang.String str1 = user0.getPassword();
        user0.setUsername("hi!");
        java.lang.Class<?> wildcardClass4 = user0.getClass();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0023");
        User user0 = new User();
        java.lang.String str1 = user0.getPassword();
        java.lang.String str2 = user0.getUsername();
        java.lang.String str3 = user0.getEmail();
        user0.setFirstName("");
        user0.setLastName("hi!");
        user0.setUsername("hi!");
        java.lang.String str10 = user0.getDob();
        java.lang.String str11 = user0.getCountry();
        java.lang.Class<?> wildcardClass12 = user0.getClass();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0024");
        User user0 = new User();
        user0.setPassword("hi!");
        user0.setPassword("");
        user0.setPassword("");
        java.lang.String str7 = user0.getCountry();
        java.lang.Class<?> wildcardClass8 = user0.getClass();
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0025");
        User user0 = new User();
        java.lang.String str1 = user0.getPassword();
        java.lang.String str2 = user0.getPassword();
        java.lang.String str3 = user0.getFirstName();
        user0.setDob("hi!");
        java.lang.String str6 = user0.getEmail();
        user0.setPassword("hi!");
        user0.setDob("");
        java.lang.Class<?> wildcardClass11 = user0.getClass();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0026");
        User user0 = new User();
        java.lang.String str1 = user0.getPassword();
        user0.setCountry("hi!");
        java.lang.String str4 = user0.getFirstName();
        java.lang.String str5 = user0.getFirstName();
        java.lang.String str6 = user0.getLastName();
        java.lang.String str7 = user0.getLastName();
        user0.setCountry("");
        java.lang.Class<?> wildcardClass10 = user0.getClass();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0027");
        User user0 = new User();
        java.lang.String str1 = user0.getPassword();
        java.lang.String str2 = user0.getUsername();
        java.lang.String str3 = user0.getDob();
        java.lang.Class<?> wildcardClass4 = user0.getClass();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0028");
        User user0 = new User();
        user0.setFirstName("");
    }

    @Test
    public void test0029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0029");
        User user0 = new User();
        java.lang.String str1 = user0.getPassword();
        user0.setUsername("hi!");
        user0.setCountry("hi!");
        user0.setFirstName("");
        java.lang.Class<?> wildcardClass8 = user0.getClass();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0030");
        User user0 = new User();
        user0.setUsername("");
        java.lang.String str3 = user0.getUsername();
        java.lang.Class<?> wildcardClass4 = user0.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0031");
        User user0 = new User();
        user0.setPassword("hi!");
        java.lang.String str3 = user0.getPassword();
        java.lang.String str4 = user0.getFirstName();
        java.lang.String str5 = user0.getCountry();
        user0.setEmail("");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
    }

    @Test
    public void test0032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0032");
        User user0 = new User();
        java.lang.String str1 = user0.getPassword();
        java.lang.String str2 = user0.getUsername();
        java.lang.String str3 = user0.getEmail();
        user0.setFirstName("");
        java.lang.Class<?> wildcardClass6 = user0.getClass();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0033");
        User user0 = new User();
        java.lang.String str1 = user0.getPassword();
        user0.setCountry("hi!");
        java.lang.String str4 = user0.getPassword();
        java.lang.String str5 = user0.getPassword();
        java.lang.String str6 = user0.getEmail();
        java.lang.Class<?> wildcardClass7 = user0.getClass();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0034");
        User user0 = new User();
        java.lang.String str1 = user0.getPassword();
        java.lang.String str2 = user0.getPassword();
        user0.setUsername("");
        java.lang.String str5 = user0.getCountry();
        user0.setPassword("hi!");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str5);
    }

    @Test
    public void test0035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0035");
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
        java.lang.Class<?> wildcardClass15 = user0.getClass();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0036");
        User user0 = new User();
        java.lang.String str1 = user0.getPassword();
        java.lang.String str2 = user0.getUsername();
        java.lang.String str3 = user0.getEmail();
        user0.setFirstName("");
        user0.setLastName("hi!");
        user0.setUsername("hi!");
        java.lang.Class<?> wildcardClass10 = user0.getClass();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0037");
        User user0 = new User();
        user0.setPassword("hi!");
        user0.setPassword("");
        java.lang.String str5 = user0.getPassword();
        java.lang.String str6 = user0.getEmail();
        java.lang.String str7 = user0.getEmail();
        java.lang.String str8 = user0.getLastName();
        java.lang.Class<?> wildcardClass9 = user0.getClass();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0038");
        User user0 = new User();
        java.lang.String str1 = user0.getPassword();
        user0.setUsername("hi!");
        user0.setCountry("hi!");
        java.lang.String str6 = user0.getLastName();
        user0.setLastName("");
        java.lang.Class<?> wildcardClass9 = user0.getClass();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0039");
        User user0 = new User();
        java.lang.String str1 = user0.getFirstName();
        user0.setPassword("");
        java.lang.Class<?> wildcardClass4 = user0.getClass();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0040");
        User user0 = new User();
        user0.setPassword("hi!");
        user0.setPassword("");
        java.lang.String str5 = user0.getPassword();
        user0.setFirstName("");
        java.lang.Class<?> wildcardClass8 = user0.getClass();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0041");
        User user0 = new User();
        java.lang.String str1 = user0.getPassword();
        java.lang.String str2 = user0.getUsername();
        user0.setDob("");
        java.lang.String str5 = user0.getEmail();
        java.lang.String str6 = user0.getCountry();
        java.lang.String str7 = user0.getPassword();
        user0.setPassword("hi!");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test0042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0042");
        User user0 = new User();
        java.lang.String str1 = user0.getPassword();
        java.lang.String str2 = user0.getPassword();
        java.lang.String str3 = user0.getPassword();
        java.lang.String str4 = user0.getDob();
        user0.setFirstName("hi!");
        user0.setCountry("hi!");
        user0.setEmail("hi!");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
    }

    @Test
    public void test0043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0043");
        User user0 = new User();
        user0.setPassword("hi!");
        user0.setPassword("");
        java.lang.String str5 = user0.getPassword();
        java.lang.String str6 = user0.getEmail();
        java.lang.String str7 = user0.getEmail();
        java.lang.String str8 = user0.getLastName();
        user0.setFirstName("");
        java.lang.Class<?> wildcardClass11 = user0.getClass();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0044");
        User user0 = new User();
        java.lang.String str1 = user0.getPassword();
        java.lang.String str2 = user0.getPassword();
        user0.setLastName("hi!");
        java.lang.String str5 = user0.getCountry();
        user0.setLastName("hi!");
        java.lang.Class<?> wildcardClass8 = user0.getClass();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0045");
        User user0 = new User();
        java.lang.String str1 = user0.getPassword();
        java.lang.Class<?> wildcardClass2 = user0.getClass();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test0046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0046");
        User user0 = new User();
        java.lang.String str1 = user0.getPassword();
        user0.setCountry("hi!");
        java.lang.String str4 = user0.getUsername();
        user0.setPassword("");
        user0.setFirstName("hi!");
        user0.setCountry("");
        user0.setDob("hi!");
        java.lang.Class<?> wildcardClass13 = user0.getClass();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0047");
        User user0 = new User();
        java.lang.String str1 = user0.getPassword();
        user0.setUsername("hi!");
        user0.setFirstName("");
        java.lang.String str6 = user0.getPassword();
        user0.setEmail("hi!");
        user0.setPassword("");
        java.lang.String str11 = user0.getDob();
        java.lang.String str12 = user0.getUsername();
        java.lang.Class<?> wildcardClass13 = user0.getClass();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0048");
        User user0 = new User();
        user0.setPassword("hi!");
        user0.setPassword("");
        java.lang.String str5 = user0.getPassword();
        java.lang.String str6 = user0.getEmail();
        java.lang.String str7 = user0.getFirstName();
        user0.setEmail("hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test0049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0049");
        User user0 = new User();
        java.lang.String str1 = user0.getPassword();
        java.lang.String str2 = user0.getPassword();
        java.lang.String str3 = user0.getPassword();
        user0.setLastName("");
        user0.setUsername("hi!");
        user0.setUsername("");
        user0.setPassword("hi!");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test0050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0050");
        User user0 = new User();
        java.lang.String str1 = user0.getPassword();
        java.lang.String str2 = user0.getPassword();
        user0.setUsername("");
        user0.setEmail("");
        java.lang.String str7 = user0.getDob();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test0051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0051");
        User user0 = new User();
        user0.setPassword("hi!");
        user0.setPassword("");
        user0.setUsername("");
        java.lang.Class<?> wildcardClass7 = user0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0052");
        User user0 = new User();
        user0.setPassword("hi!");
        java.lang.String str3 = user0.getPassword();
        java.lang.String str4 = user0.getFirstName();
        java.lang.String str5 = user0.getLastName();
        java.lang.String str6 = user0.getDob();
        java.lang.String str7 = user0.getDob();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test0053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0053");
        User user0 = new User();
        java.lang.String str1 = user0.getPassword();
        user0.setCountry("hi!");
        java.lang.String str4 = user0.getFirstName();
        java.lang.String str5 = user0.getDob();
        java.lang.String str6 = user0.getLastName();
        user0.setLastName("");
        user0.setFirstName("hi!");
        java.lang.Class<?> wildcardClass11 = user0.getClass();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0054");
        User user0 = new User();
        user0.setLastName("");
        java.lang.String str3 = user0.getCountry();
        java.lang.String str4 = user0.getDob();
        user0.setUsername("");
        java.lang.String str7 = user0.getPassword();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test0055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0055");
        User user0 = new User();
        java.lang.String str1 = user0.getFirstName();
        user0.setPassword("");
        user0.setUsername("hi!");
        java.lang.String str6 = user0.getPassword();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test0056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0056");
        User user0 = new User();
        java.lang.String str1 = user0.getPassword();
        user0.setCountry("hi!");
        java.lang.String str4 = user0.getFirstName();
        java.lang.String str5 = user0.getDob();
        java.lang.String str6 = user0.getLastName();
        user0.setFirstName("hi!");
        user0.setUsername("hi!");
        user0.setDob("");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test0057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0057");
        User user0 = new User();
        java.lang.String str1 = user0.getPassword();
        java.lang.String str2 = user0.getPassword();
        java.lang.String str3 = user0.getFirstName();
        user0.setDob("hi!");
        java.lang.String str6 = user0.getEmail();
        java.lang.String str7 = user0.getFirstName();
        user0.setLastName("hi!");
        java.lang.Class<?> wildcardClass10 = user0.getClass();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0058");
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
        java.lang.Class<?> wildcardClass16 = user0.getClass();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0059");
        User user0 = new User();
        java.lang.String str1 = user0.getPassword();
        user0.setCountry("hi!");
        user0.setUsername("hi!");
        user0.setCountry("");
        java.lang.String str8 = user0.getFirstName();
        user0.setPassword("");
        java.lang.Class<?> wildcardClass11 = user0.getClass();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0060");
        User user0 = new User();
        java.lang.String str1 = user0.getPassword();
        user0.setCountry("hi!");
        java.lang.String str4 = user0.getPassword();
        java.lang.String str5 = user0.getDob();
        java.lang.String str6 = user0.getCountry();
        java.lang.String str7 = user0.getUsername();
        user0.setDob("hi!");
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
    public void test0061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0061");
        User user0 = new User();
        user0.setLastName("");
        java.lang.Class<?> wildcardClass3 = user0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test0062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0062");
        User user0 = new User();
        java.lang.String str1 = user0.getPassword();
        user0.setCountry("hi!");
        java.lang.String str4 = user0.getFirstName();
        java.lang.String str5 = user0.getDob();
        java.lang.String str6 = user0.getLastName();
        user0.setFirstName("hi!");
        user0.setUsername("");
        java.lang.String str11 = user0.getPassword();
        java.lang.Class<?> wildcardClass12 = user0.getClass();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0063");
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
        java.lang.Class<?> wildcardClass11 = user0.getClass();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0064");
        User user0 = new User();
        java.lang.String str1 = user0.getPassword();
        user0.setUsername("hi!");
        java.lang.String str4 = user0.getCountry();
        java.lang.String str5 = user0.getUsername();
        java.lang.String str6 = user0.getUsername();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
    }

    @Test
    public void test0065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0065");
        User user0 = new User();
        java.lang.String str1 = user0.getPassword();
        user0.setCountry("hi!");
        java.lang.String str4 = user0.getPassword();
        user0.setCountry("");
        java.lang.Class<?> wildcardClass7 = user0.getClass();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0066");
        User user0 = new User();
        java.lang.String str1 = user0.getPassword();
        user0.setCountry("hi!");
        java.lang.String str4 = user0.getUsername();
        java.lang.String str5 = user0.getPassword();
        user0.setDob("");
        java.lang.Class<?> wildcardClass8 = user0.getClass();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0067");
        User user0 = new User();
        java.lang.String str1 = user0.getPassword();
        user0.setUsername("hi!");
        user0.setFirstName("");
        java.lang.String str6 = user0.getPassword();
        user0.setLastName("");
        java.lang.String str9 = user0.getDob();
        user0.setFirstName("");
        user0.setPassword("");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test0068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0068");
        User user0 = new User();
        java.lang.String str1 = user0.getPassword();
        user0.setCountry("hi!");
        java.lang.String str4 = user0.getFirstName();
        user0.setLastName("hi!");
        user0.setDob("hi!");
        java.lang.String str9 = user0.getFirstName();
        user0.setPassword("");
        user0.setCountry("hi!");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test0069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0069");
        User user0 = new User();
        java.lang.String str1 = user0.getPassword();
        user0.setCountry("hi!");
        java.lang.String str4 = user0.getPassword();
        user0.setFirstName("");
        user0.setPassword("hi!");
        java.lang.String str9 = user0.getPassword();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
    }

    @Test
    public void test0070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0070");
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
        java.lang.Class<?> wildcardClass15 = user0.getClass();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0071");
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
        user0.setEmail("");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
    }

    @Test
    public void test0072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0072");
        User user0 = new User();
        java.lang.String str1 = user0.getPassword();
        user0.setUsername("hi!");
        user0.setFirstName("");
        java.lang.String str6 = user0.getPassword();
        user0.setLastName("");
        java.lang.String str9 = user0.getDob();
        user0.setFirstName("");
        user0.setDob("");
        java.lang.Class<?> wildcardClass14 = user0.getClass();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0073");
        User user0 = new User();
        java.lang.String str1 = user0.getPassword();
        user0.setCountry("hi!");
        java.lang.String str4 = user0.getFirstName();
        java.lang.String str5 = user0.getDob();
        java.lang.String str6 = user0.getLastName();
        java.lang.Class<?> wildcardClass7 = user0.getClass();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0074");
        User user0 = new User();
        java.lang.String str1 = user0.getPassword();
        java.lang.String str2 = user0.getPassword();
        user0.setLastName("hi!");
        java.lang.Class<?> wildcardClass5 = user0.getClass();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0075");
        User user0 = new User();
        java.lang.String str1 = user0.getPassword();
        user0.setCountry("hi!");
        java.lang.String str4 = user0.getFirstName();
        user0.setLastName("hi!");
        user0.setDob("hi!");
        java.lang.String str9 = user0.getFirstName();
        java.lang.String str10 = user0.getDob();
        java.lang.String str11 = user0.getLastName();
        java.lang.Class<?> wildcardClass12 = user0.getClass();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0076");
        User user0 = new User();
        java.lang.String str1 = user0.getFirstName();
        java.lang.String str2 = user0.getCountry();
        java.lang.String str3 = user0.getFirstName();
        user0.setFirstName("");
        java.lang.String str6 = user0.getLastName();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test0077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0077");
        User user0 = new User();
        java.lang.String str1 = user0.getPassword();
        java.lang.String str2 = user0.getPassword();
        user0.setUsername("");
        java.lang.String str5 = user0.getCountry();
        java.lang.String str6 = user0.getDob();
        java.lang.Class<?> wildcardClass7 = user0.getClass();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0078");
        User user0 = new User();
        java.lang.String str1 = user0.getPassword();
        user0.setCountry("hi!");
        java.lang.String str4 = user0.getFirstName();
        java.lang.String str5 = user0.getDob();
        java.lang.String str6 = user0.getLastName();
        java.lang.String str7 = user0.getCountry();
        java.lang.Class<?> wildcardClass8 = user0.getClass();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0079");
        User user0 = new User();
        java.lang.String str1 = user0.getPassword();
        java.lang.String str2 = user0.getUsername();
        java.lang.String str3 = user0.getEmail();
        user0.setFirstName("");
        user0.setLastName("hi!");
        user0.setUsername("");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test0080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0080");
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
        java.lang.Class<?> wildcardClass12 = user0.getClass();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0081");
        User user0 = new User();
        java.lang.String str1 = user0.getPassword();
        user0.setCountry("hi!");
        java.lang.String str4 = user0.getFirstName();
        java.lang.String str5 = user0.getDob();
        java.lang.String str6 = user0.getLastName();
        user0.setFirstName("hi!");
        user0.setUsername("");
        java.lang.String str11 = user0.getPassword();
        java.lang.String str12 = user0.getDob();
        user0.setUsername("");
        java.lang.Class<?> wildcardClass15 = user0.getClass();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0082");
        User user0 = new User();
        java.lang.String str1 = user0.getPassword();
        java.lang.String str2 = user0.getPassword();
        java.lang.String str3 = user0.getPassword();
        java.lang.String str4 = user0.getDob();
        user0.setFirstName("hi!");
        user0.setCountry("hi!");
        java.lang.String str9 = user0.getFirstName();
        java.lang.String str10 = user0.getLastName();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test0083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0083");
        User user0 = new User();
        user0.setLastName("hi!");
    }

    @Test
    public void test0084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0084");
        User user0 = new User();
        java.lang.String str1 = user0.getPassword();
        user0.setUsername("hi!");
        user0.setCountry("hi!");
        java.lang.Class<?> wildcardClass6 = user0.getClass();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0085");
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
        user0.setEmail("hi!");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test0086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0086");
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
        java.lang.Class<?> wildcardClass15 = user0.getClass();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0087");
        User user0 = new User();
        java.lang.String str1 = user0.getPassword();
        user0.setCountry("hi!");
        java.lang.String str4 = user0.getFirstName();
        user0.setLastName("hi!");
        user0.setDob("hi!");
        java.lang.String str9 = user0.getEmail();
        user0.setLastName("");
        java.lang.Class<?> wildcardClass12 = user0.getClass();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0088");
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
        user0.setUsername("hi!");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str13);
    }

    @Test
    public void test0089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0089");
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
        java.lang.String str14 = user0.getUsername();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
    }

    @Test
    public void test0090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0090");
        User user0 = new User();
        java.lang.String str1 = user0.getPassword();
        java.lang.String str2 = user0.getUsername();
        user0.setDob("");
        java.lang.String str5 = user0.getEmail();
        java.lang.String str6 = user0.getCountry();
        user0.setPassword("hi!");
        user0.setCountry("");
        user0.setEmail("");
        user0.setEmail("");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test0091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0091");
        User user0 = new User();
        user0.setPassword("hi!");
        user0.setPassword("");
        java.lang.String str5 = user0.getDob();
        user0.setEmail("");
        java.lang.String str8 = user0.getUsername();
        java.lang.Class<?> wildcardClass9 = user0.getClass();
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0092");
        User user0 = new User();
        user0.setPassword("hi!");
        user0.setPassword("");
        java.lang.String str5 = user0.getPassword();
        user0.setCountry("hi!");
        user0.setLastName("hi!");
        user0.setFirstName("");
        java.lang.String str12 = user0.getFirstName();
        java.lang.String str13 = user0.getLastName();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
    }

    @Test
    public void test0093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0093");
        User user0 = new User();
        java.lang.String str1 = user0.getPassword();
        java.lang.String str2 = user0.getUsername();
        java.lang.String str3 = user0.getEmail();
        user0.setUsername("");
        user0.setDob("hi!");
        java.lang.String str8 = user0.getCountry();
        java.lang.String str9 = user0.getDob();
        java.lang.Class<?> wildcardClass10 = user0.getClass();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0094");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Class<?> wildcardClass1 = obj0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test0095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0095");
        User user0 = new User();
        user0.setPassword("hi!");
        user0.setPassword("");
        java.lang.String str5 = user0.getDob();
        user0.setEmail("");
        user0.setLastName("hi!");
        java.lang.String str10 = user0.getEmail();
        java.lang.Class<?> wildcardClass11 = user0.getClass();
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0096");
        User user0 = new User();
        java.lang.String str1 = user0.getPassword();
        user0.setPassword("hi!");
        user0.setUsername("");
        org.junit.Assert.assertNull(str1);
    }

    @Test
    public void test0097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0097");
        User user0 = new User();
        java.lang.String str1 = user0.getPassword();
        user0.setUsername("hi!");
        java.lang.String str4 = user0.getCountry();
        java.lang.String str5 = user0.getUsername();
        user0.setUsername("");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
    }

    @Test
    public void test0098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0098");
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
        java.lang.Class<?> wildcardClass13 = user0.getClass();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0099");
        User user0 = new User();
        java.lang.String str1 = user0.getPassword();
        user0.setUsername("hi!");
        user0.setFirstName("");
        java.lang.String str6 = user0.getPassword();
        user0.setLastName("");
        java.lang.String str9 = user0.getDob();
        user0.setFirstName("");
        user0.setDob("");
        java.lang.String str14 = user0.getDob();
        java.lang.String str15 = user0.getCountry();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNull(str15);
    }

    @Test
    public void test0100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0100");
        User user0 = new User();
        java.lang.String str1 = user0.getPassword();
        user0.setUsername("");
        user0.setFirstName("hi!");
        java.lang.String str6 = user0.getPassword();
        user0.setEmail("");
        java.lang.Class<?> wildcardClass9 = user0.getClass();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0101");
        User user0 = new User();
        java.lang.String str1 = user0.getPassword();
        user0.setCountry("hi!");
        java.lang.String str4 = user0.getFirstName();
        java.lang.String str5 = user0.getDob();
        java.lang.String str6 = user0.getLastName();
        user0.setFirstName("hi!");
        java.lang.String str9 = user0.getLastName();
        java.lang.String str10 = user0.getFirstName();
        user0.setEmail("");
        java.lang.Class<?> wildcardClass13 = user0.getClass();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0102");
        User user0 = new User();
        java.lang.String str1 = user0.getPassword();
        user0.setCountry("hi!");
        java.lang.String str4 = user0.getFirstName();
        java.lang.String str5 = user0.getDob();
        java.lang.String str6 = user0.getLastName();
        java.lang.String str7 = user0.getEmail();
        java.lang.String str8 = user0.getCountry();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
    }

    @Test
    public void test0103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0103");
        User user0 = new User();
        java.lang.String str1 = user0.getPassword();
        user0.setCountry("hi!");
        java.lang.String str4 = user0.getFirstName();
        user0.setLastName("hi!");
        user0.setDob("hi!");
        java.lang.String str9 = user0.getFirstName();
        user0.setPassword("");
        user0.setPassword("");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test0104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0104");
        User user0 = new User();
        java.lang.String str1 = user0.getPassword();
        user0.setCountry("hi!");
        java.lang.String str4 = user0.getFirstName();
        java.lang.String str5 = user0.getDob();
        java.lang.String str6 = user0.getLastName();
        java.lang.String str7 = user0.getCountry();
        java.lang.String str8 = user0.getPassword();
        java.lang.Class<?> wildcardClass9 = user0.getClass();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0105");
        User user0 = new User();
        user0.setPassword("hi!");
        java.lang.String str3 = user0.getPassword();
        java.lang.String str4 = user0.getPassword();
        user0.setUsername("hi!");
        user0.setDob("hi!");
        java.lang.Class<?> wildcardClass9 = user0.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0106");
        User user0 = new User();
        java.lang.String str1 = user0.getPassword();
        user0.setCountry("hi!");
        java.lang.String str4 = user0.getFirstName();
        java.lang.String str5 = user0.getUsername();
        user0.setPassword("hi!");
        java.lang.Class<?> wildcardClass8 = user0.getClass();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0107");
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
        java.lang.String str20 = user0.getPassword();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
    }

    @Test
    public void test0108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0108");
        User user0 = new User();
        java.lang.String str1 = user0.getPassword();
        java.lang.String str2 = user0.getUsername();
        java.lang.String str3 = user0.getCountry();
        user0.setEmail("hi!");
        java.lang.String str6 = user0.getCountry();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test0109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0109");
        User user0 = new User();
        java.lang.String str1 = user0.getPassword();
        java.lang.String str2 = user0.getUsername();
        user0.setDob("");
        java.lang.String str5 = user0.getEmail();
        java.lang.String str6 = user0.getCountry();
        user0.setLastName("");
        user0.setLastName("hi!");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test0110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0110");
        User user0 = new User();
        java.lang.String str1 = user0.getPassword();
        user0.setCountry("hi!");
        java.lang.String str4 = user0.getFirstName();
        java.lang.String str5 = user0.getDob();
        java.lang.String str6 = user0.getLastName();
        user0.setFirstName("hi!");
        user0.setDob("");
        java.lang.String str11 = user0.getUsername();
        java.lang.Class<?> wildcardClass12 = user0.getClass();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0111");
        User user0 = new User();
        java.lang.String str1 = user0.getPassword();
        user0.setCountry("hi!");
        java.lang.String str4 = user0.getUsername();
        user0.setPassword("");
        user0.setFirstName("hi!");
        user0.setCountry("");
        java.lang.Class<?> wildcardClass11 = user0.getClass();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0112");
        User user0 = new User();
        java.lang.String str1 = user0.getPassword();
        java.lang.String str2 = user0.getPassword();
        java.lang.String str3 = user0.getFirstName();
        user0.setDob("hi!");
        java.lang.String str6 = user0.getEmail();
        user0.setPassword("hi!");
        java.lang.String str9 = user0.getPassword();
        user0.setDob("hi!");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
    }

    @Test
    public void test0113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0113");
        User user0 = new User();
        java.lang.String str1 = user0.getPassword();
        java.lang.String str2 = user0.getUsername();
        java.lang.String str3 = user0.getEmail();
        user0.setFirstName("");
        user0.setLastName("hi!");
        java.lang.String str8 = user0.getFirstName();
        java.lang.String str9 = user0.getUsername();
        user0.setUsername("hi!");
        user0.setCountry("");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test0114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0114");
        User user0 = new User();
        java.lang.String str1 = user0.getPassword();
        java.lang.String str2 = user0.getUsername();
        java.lang.String str3 = user0.getEmail();
        user0.setUsername("");
        user0.setUsername("");
        java.lang.String str8 = user0.getCountry();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test0115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0115");
        User user0 = new User();
        java.lang.String str1 = user0.getPassword();
        user0.setCountry("hi!");
        java.lang.String str4 = user0.getFirstName();
        java.lang.String str5 = user0.getDob();
        java.lang.String str6 = user0.getLastName();
        java.lang.String str7 = user0.getCountry();
        user0.setEmail("hi!");
        user0.setLastName("hi!");
        java.lang.Class<?> wildcardClass12 = user0.getClass();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0116");
        User user0 = new User();
        java.lang.String str1 = user0.getPassword();
        user0.setCountry("hi!");
        java.lang.String str4 = user0.getFirstName();
        user0.setLastName("hi!");
        user0.setDob("hi!");
        java.lang.String str9 = user0.getEmail();
        java.lang.String str10 = user0.getCountry();
        java.lang.Class<?> wildcardClass11 = user0.getClass();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0117");
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
        user0.setPassword("hi!");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str13);
    }

    @Test
    public void test0118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0118");
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
        java.lang.Class<?> wildcardClass14 = user0.getClass();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0119");
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
        java.lang.String str15 = user0.getLastName();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str15);
    }

    @Test
    public void test0120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0120");
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
        java.lang.String str18 = user0.getPassword();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertNull(str18);
    }

    @Test
    public void test0121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0121");
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
        user0.setEmail("");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test0122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0122");
        User user0 = new User();
        java.lang.String str1 = user0.getPassword();
        java.lang.String str2 = user0.getUsername();
        java.lang.String str3 = user0.getCountry();
        user0.setEmail("hi!");
        java.lang.String str6 = user0.getPassword();
        java.lang.String str7 = user0.getEmail();
        java.lang.String str8 = user0.getPassword();
        user0.setPassword("hi!");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test0123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0123");
        User user0 = new User();
        java.lang.String str1 = user0.getPassword();
        java.lang.String str2 = user0.getUsername();
        java.lang.String str3 = user0.getCountry();
        user0.setPassword("");
        user0.setLastName("");
        user0.setUsername("");
        user0.setLastName("hi!");
        java.lang.String str12 = user0.getUsername();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test0124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0124");
        User user0 = new User();
        user0.setPassword("hi!");
        user0.setPassword("");
        java.lang.String str5 = user0.getPassword();
        java.lang.String str6 = user0.getEmail();
        user0.setCountry("hi!");
        java.lang.String str9 = user0.getEmail();
        java.lang.Class<?> wildcardClass10 = user0.getClass();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0125");
        User user0 = new User();
        java.lang.String str1 = user0.getPassword();
        user0.setCountry("hi!");
        java.lang.String str4 = user0.getUsername();
        java.lang.String str5 = user0.getPassword();
        java.lang.String str6 = user0.getDob();
        java.lang.String str7 = user0.getLastName();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test0126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0126");
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
        java.lang.String str13 = user0.getEmail();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str13);
    }

    @Test
    public void test0127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0127");
        User user0 = new User();
        java.lang.String str1 = user0.getPassword();
        user0.setCountry("hi!");
        java.lang.String str4 = user0.getFirstName();
        user0.setLastName("hi!");
        user0.setDob("hi!");
        java.lang.Class<?> wildcardClass9 = user0.getClass();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0128");
        User user0 = new User();
        java.lang.String str1 = user0.getPassword();
        java.lang.String str2 = user0.getUsername();
        java.lang.String str3 = user0.getEmail();
        user0.setFirstName("");
        user0.setLastName("hi!");
        user0.setUsername("hi!");
        user0.setDob("");
        java.lang.String str12 = user0.getCountry();
        user0.setPassword("");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test0129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0129");
        User user0 = new User();
        java.lang.String str1 = user0.getPassword();
        user0.setCountry("hi!");
        java.lang.String str4 = user0.getUsername();
        user0.setPassword("");
        user0.setFirstName("hi!");
        java.lang.String str9 = user0.getUsername();
        user0.setFirstName("hi!");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test0130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0130");
        User user0 = new User();
        java.lang.String str1 = user0.getPassword();
        java.lang.String str2 = user0.getPassword();
        java.lang.String str3 = user0.getCountry();
        java.lang.Class<?> wildcardClass4 = user0.getClass();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0131");
        User user0 = new User();
        java.lang.String str1 = user0.getPassword();
        user0.setCountry("hi!");
        java.lang.String str4 = user0.getPassword();
        java.lang.String str5 = user0.getPassword();
        user0.setEmail("hi!");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
    }

    @Test
    public void test0132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0132");
        User user0 = new User();
        java.lang.String str1 = user0.getPassword();
        user0.setCountry("hi!");
        java.lang.String str4 = user0.getPassword();
        java.lang.String str5 = user0.getDob();
        user0.setCountry("hi!");
        java.lang.Class<?> wildcardClass8 = user0.getClass();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0133");
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
        user0.setCountry("hi!");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str13);
    }

    @Test
    public void test0134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0134");
        User user0 = new User();
        java.lang.String str1 = user0.getPassword();
        java.lang.String str2 = user0.getUsername();
        java.lang.String str3 = user0.getCountry();
        user0.setEmail("hi!");
        java.lang.String str6 = user0.getPassword();
        java.lang.String str7 = user0.getEmail();
        java.lang.String str8 = user0.getUsername();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test0135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0135");
        User user0 = new User();
        user0.setPassword("hi!");
        user0.setPassword("");
        java.lang.String str5 = user0.getPassword();
        user0.setFirstName("");
        java.lang.String str8 = user0.getUsername();
        java.lang.String str9 = user0.getLastName();
        user0.setUsername("hi!");
        java.lang.String str12 = user0.getPassword();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test0136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0136");
        User user0 = new User();
        java.lang.String str1 = user0.getPassword();
        java.lang.String str2 = user0.getUsername();
        java.lang.String str3 = user0.getEmail();
        user0.setFirstName("");
        user0.setLastName("hi!");
        user0.setUsername("hi!");
        java.lang.String str10 = user0.getUsername();
        user0.setDob("hi!");
        java.lang.String str13 = user0.getEmail();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNull(str13);
    }

    @Test
    public void test0137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0137");
        User user0 = new User();
        user0.setPassword("hi!");
        user0.setPassword("");
        java.lang.String str5 = user0.getPassword();
        user0.setCountry("hi!");
        user0.setLastName("hi!");
        user0.setFirstName("");
        java.lang.String str12 = user0.getPassword();
        user0.setEmail("hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test0138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0138");
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
        user0.setFirstName("");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test0139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0139");
        User user0 = new User();
        java.lang.String str1 = user0.getPassword();
        user0.setUsername("hi!");
        user0.setCountry("hi!");
        java.lang.String str6 = user0.getLastName();
        user0.setLastName("");
        user0.setPassword("");
        java.lang.String str11 = user0.getEmail();
        java.lang.Class<?> wildcardClass12 = user0.getClass();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0140");
        User user0 = new User();
        java.lang.String str1 = user0.getPassword();
        user0.setCountry("hi!");
        java.lang.String str4 = user0.getFirstName();
        user0.setLastName("hi!");
        user0.setLastName("hi!");
        java.lang.String str9 = user0.getLastName();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
    }

    @Test
    public void test0141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0141");
        User user0 = new User();
        java.lang.String str1 = user0.getPassword();
        user0.setUsername("hi!");
        java.lang.String str4 = user0.getPassword();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str4);
    }

    @Test
    public void test0142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0142");
        User user0 = new User();
        java.lang.String str1 = user0.getPassword();
        java.lang.String str2 = user0.getUsername();
        java.lang.String str3 = user0.getEmail();
        user0.setFirstName("");
        user0.setLastName("hi!");
        user0.setUsername("hi!");
        java.lang.String str10 = user0.getDob();
        java.lang.Class<?> wildcardClass11 = user0.getClass();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0143");
        User user0 = new User();
        java.lang.String str1 = user0.getPassword();
        java.lang.String str2 = user0.getUsername();
        java.lang.String str3 = user0.getCountry();
        user0.setPassword("");
        java.lang.String str6 = user0.getUsername();
        java.lang.String str7 = user0.getDob();
        java.lang.Class<?> wildcardClass8 = user0.getClass();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0144");
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
        java.lang.Class<?> wildcardClass12 = user0.getClass();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0145");
        User user0 = new User();
        java.lang.String str1 = user0.getPassword();
        java.lang.String str2 = user0.getUsername();
        java.lang.String str3 = user0.getCountry();
        user0.setPassword("");
        java.lang.String str6 = user0.getUsername();
        java.lang.String str7 = user0.getDob();
        user0.setPassword("");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test0146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0146");
        User user0 = new User();
        java.lang.String str1 = user0.getPassword();
        user0.setUsername("hi!");
        user0.setFirstName("");
        java.lang.String str6 = user0.getPassword();
        user0.setEmail("hi!");
        user0.setCountry("hi!");
        java.lang.String str11 = user0.getCountry();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
    }

    @Test
    public void test0147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0147");
        User user0 = new User();
        user0.setPassword("hi!");
        user0.setPassword("");
        java.lang.String str5 = user0.getPassword();
        user0.setFirstName("");
        user0.setLastName("");
        java.lang.Class<?> wildcardClass10 = user0.getClass();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0148");
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
        java.lang.String str15 = user0.getFirstName();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
    }

    @Test
    public void test0149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0149");
        User user0 = new User();
        java.lang.String str1 = user0.getPassword();
        user0.setCountry("hi!");
        java.lang.String str4 = user0.getPassword();
        java.lang.String str5 = user0.getDob();
        java.lang.String str6 = user0.getCountry();
        java.lang.String str7 = user0.getUsername();
        user0.setDob("hi!");
        user0.setFirstName("hi!");
        java.lang.String str12 = user0.getLastName();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test0150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0150");
        User user0 = new User();
        java.lang.String str1 = user0.getPassword();
        user0.setCountry("hi!");
        java.lang.String str4 = user0.getPassword();
        user0.setCountry("");
        user0.setUsername("");
        user0.setFirstName("");
        java.lang.Class<?> wildcardClass11 = user0.getClass();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0151");
        User user0 = new User();
        java.lang.String str1 = user0.getPassword();
        user0.setCountry("hi!");
        user0.setUsername("hi!");
        user0.setCountry("");
        user0.setLastName("");
        user0.setLastName("hi!");
        user0.setCountry("");
        org.junit.Assert.assertNull(str1);
    }

    @Test
    public void test0152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0152");
        User user0 = new User();
        java.lang.String str1 = user0.getPassword();
        user0.setUsername("");
        user0.setLastName("");
        user0.setEmail("hi!");
        user0.setFirstName("hi!");
        java.lang.Class<?> wildcardClass10 = user0.getClass();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0153");
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
        user0.setDob("hi!");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
    }

    @Test
    public void test0154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0154");
        User user0 = new User();
        java.lang.String str1 = user0.getPassword();
        java.lang.String str2 = user0.getUsername();
        java.lang.String str3 = user0.getEmail();
        java.lang.String str4 = user0.getLastName();
        java.lang.String str5 = user0.getFirstName();
        user0.setFirstName("");
        user0.setCountry("");
        java.lang.String str10 = user0.getDob();
        java.lang.String str11 = user0.getDob();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test0155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0155");
        User user0 = new User();
        java.lang.String str1 = user0.getPassword();
        user0.setUsername("hi!");
        user0.setCountry("hi!");
        java.lang.String str6 = user0.getLastName();
        user0.setUsername("");
        java.lang.Class<?> wildcardClass9 = user0.getClass();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0156");
        User user0 = new User();
        java.lang.String str1 = user0.getPassword();
        user0.setCountry("hi!");
        java.lang.String str4 = user0.getFirstName();
        java.lang.String str5 = user0.getDob();
        java.lang.String str6 = user0.getLastName();
        user0.setFirstName("hi!");
        java.lang.String str9 = user0.getUsername();
        java.lang.String str10 = user0.getEmail();
        user0.setPassword("hi!");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test0157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0157");
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
        java.lang.Class<?> wildcardClass14 = user0.getClass();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0158");
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
        java.lang.String str14 = user0.getFirstName();
        user0.setPassword("");
        java.lang.Class<?> wildcardClass17 = user0.getClass();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test0159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0159");
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
        java.lang.Class<?> wildcardClass14 = user0.getClass();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0160");
        User user0 = new User();
        java.lang.String str1 = user0.getPassword();
        user0.setCountry("hi!");
        java.lang.String str4 = user0.getFirstName();
        java.lang.String str5 = user0.getDob();
        java.lang.String str6 = user0.getLastName();
        user0.setFirstName("hi!");
        user0.setDob("hi!");
        java.lang.String str11 = user0.getPassword();
        java.lang.String str12 = user0.getEmail();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test0161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0161");
        User user0 = new User();
        user0.setPassword("hi!");
        user0.setPassword("");
        user0.setUsername("");
        java.lang.String str7 = user0.getDob();
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test0162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0162");
        User user0 = new User();
        java.lang.String str1 = user0.getPassword();
        java.lang.String str2 = user0.getUsername();
        user0.setDob("");
        java.lang.String str5 = user0.getEmail();
        user0.setLastName("hi!");
        java.lang.String str8 = user0.getCountry();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test0163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0163");
        User user0 = new User();
        java.lang.String str1 = user0.getPassword();
        java.lang.String str2 = user0.getPassword();
        user0.setLastName("hi!");
        java.lang.String str5 = user0.getCountry();
        user0.setFirstName("");
        user0.setFirstName("");
        java.lang.String str10 = user0.getEmail();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test0164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0164");
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
        java.lang.String str13 = user0.getFirstName();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test0165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0165");
        User user0 = new User();
        user0.setPassword("hi!");
        user0.setPassword("");
        java.lang.String str5 = user0.getPassword();
        user0.setCountry("hi!");
        java.lang.String str8 = user0.getPassword();
        user0.setEmail("hi!");
        user0.setEmail("hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test0166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0166");
        User user0 = new User();
        java.lang.String str1 = user0.getPassword();
        user0.setCountry("hi!");
        java.lang.String str4 = user0.getPassword();
        java.lang.String str5 = user0.getPassword();
        java.lang.String str6 = user0.getEmail();
        java.lang.String str7 = user0.getCountry();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
    }

    @Test
    public void test0167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0167");
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
        java.lang.String str14 = user0.getCountry();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str14);
    }

    @Test
    public void test0168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0168");
        User user0 = new User();
        java.lang.String str1 = user0.getPassword();
        user0.setCountry("hi!");
        java.lang.String str4 = user0.getFirstName();
        java.lang.String str5 = user0.getFirstName();
        java.lang.String str6 = user0.getLastName();
        java.lang.String str7 = user0.getLastName();
        user0.setCountry("hi!");
        user0.setDob("hi!");
        user0.setEmail("hi!");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test0169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0169");
        User user0 = new User();
        java.lang.String str1 = user0.getPassword();
        user0.setUsername("hi!");
        user0.setFirstName("");
        java.lang.String str6 = user0.getPassword();
        user0.setEmail("hi!");
        user0.setPassword("");
        java.lang.String str11 = user0.getFirstName();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test0170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0170");
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
        java.lang.String str14 = user0.getEmail();
        java.lang.String str15 = user0.getLastName();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNull(str15);
    }

    @Test
    public void test0171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0171");
        User user0 = new User();
        java.lang.String str1 = user0.getPassword();
        user0.setCountry("hi!");
        java.lang.String str4 = user0.getFirstName();
        java.lang.String str5 = user0.getDob();
        java.lang.String str6 = user0.getLastName();
        java.lang.String str7 = user0.getCountry();
        java.lang.String str8 = user0.getPassword();
        java.lang.String str9 = user0.getFirstName();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test0172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0172");
        User user0 = new User();
        java.lang.String str1 = user0.getPassword();
        java.lang.String str2 = user0.getPassword();
        user0.setUsername("");
        user0.setEmail("");
        user0.setUsername("hi!");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
    }

    @Test
    public void test0173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0173");
        User user0 = new User();
        java.lang.String str1 = user0.getPassword();
        user0.setUsername("hi!");
        java.lang.String str4 = user0.getDob();
        user0.setUsername("");
        user0.setLastName("");
        java.lang.Class<?> wildcardClass9 = user0.getClass();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0174");
        User user0 = new User();
        java.lang.String str1 = user0.getPassword();
        user0.setCountry("hi!");
        java.lang.String str4 = user0.getFirstName();
        java.lang.String str5 = user0.getFirstName();
        user0.setCountry("hi!");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
    }

    @Test
    public void test0175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0175");
        User user0 = new User();
        user0.setPassword("hi!");
        java.lang.String str3 = user0.getPassword();
        java.lang.String str4 = user0.getFirstName();
        java.lang.String str5 = user0.getLastName();
        user0.setFirstName("");
        java.lang.String str8 = user0.getFirstName();
        java.lang.String str9 = user0.getUsername();
        user0.setLastName("hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test0176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0176");
        User user0 = new User();
        user0.setPassword("hi!");
        user0.setPassword("");
        java.lang.String str5 = user0.getPassword();
        user0.setCountry("hi!");
        user0.setLastName("hi!");
        user0.setFirstName("");
        java.lang.String str12 = user0.getPassword();
        user0.setEmail("");
        java.lang.Class<?> wildcardClass15 = user0.getClass();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0177");
        User user0 = new User();
        java.lang.String str1 = user0.getPassword();
        user0.setCountry("hi!");
        java.lang.String str4 = user0.getFirstName();
        java.lang.String str5 = user0.getDob();
        java.lang.String str6 = user0.getLastName();
        user0.setFirstName("hi!");
        user0.setDob("hi!");
        java.lang.String str11 = user0.getPassword();
        java.lang.Class<?> wildcardClass12 = user0.getClass();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0178");
        User user0 = new User();
        user0.setPassword("hi!");
        user0.setPassword("");
        java.lang.String str5 = user0.getPassword();
        user0.setCountry("hi!");
        java.lang.String str8 = user0.getPassword();
        java.lang.String str9 = user0.getDob();
        java.lang.String str10 = user0.getUsername();
        java.lang.String str11 = user0.getFirstName();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test0179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0179");
        User user0 = new User();
        java.lang.String str1 = user0.getPassword();
        java.lang.String str2 = user0.getUsername();
        java.lang.String str3 = user0.getEmail();
        java.lang.String str4 = user0.getLastName();
        user0.setDob("");
        java.lang.String str7 = user0.getUsername();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test0180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0180");
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
        java.lang.String str18 = user0.getFirstName();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertNull(str18);
    }

    @Test
    public void test0181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0181");
        User user0 = new User();
        java.lang.String str1 = user0.getPassword();
        java.lang.String str2 = user0.getUsername();
        java.lang.String str3 = user0.getEmail();
        java.lang.String str4 = user0.getLastName();
        user0.setDob("");
        java.lang.String str7 = user0.getLastName();
        user0.setDob("hi!");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test0182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0182");
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
        java.lang.Class<?> wildcardClass15 = user0.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0183");
        User user0 = new User();
        java.lang.String str1 = user0.getPassword();
        user0.setUsername("hi!");
        user0.setFirstName("");
        java.lang.String str6 = user0.getPassword();
        user0.setLastName("");
        java.lang.String str9 = user0.getDob();
        user0.setFirstName("");
        user0.setDob("");
        java.lang.String str14 = user0.getFirstName();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test0184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0184");
        User user0 = new User();
        java.lang.String str1 = user0.getPassword();
        user0.setUsername("hi!");
        user0.setCountry("hi!");
        user0.setFirstName("");
        user0.setCountry("");
        java.lang.String str10 = user0.getPassword();
        java.lang.String str11 = user0.getDob();
        user0.setDob("");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test0185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0185");
        User user0 = new User();
        user0.setPassword("hi!");
        user0.setPassword("");
        java.lang.String str5 = user0.getDob();
        user0.setEmail("");
        user0.setUsername("");
        java.lang.String str10 = user0.getFirstName();
        user0.setDob("hi!");
        java.lang.String str13 = user0.getEmail();
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test0186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0186");
        User user0 = new User();
        java.lang.String str1 = user0.getPassword();
        user0.setUsername("hi!");
        user0.setFirstName("");
        java.lang.String str6 = user0.getPassword();
        user0.setEmail("hi!");
        java.lang.String str9 = user0.getEmail();
        java.lang.String str10 = user0.getFirstName();
        java.lang.Class<?> wildcardClass11 = user0.getClass();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0187");
        User user0 = new User();
        java.lang.String str1 = user0.getFirstName();
        java.lang.String str2 = user0.getUsername();
        user0.setPassword("");
        java.lang.Class<?> wildcardClass5 = user0.getClass();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0188");
        User user0 = new User();
        java.lang.String str1 = user0.getPassword();
        user0.setCountry("hi!");
        java.lang.String str4 = user0.getPassword();
        user0.setFirstName("");
        user0.setLastName("hi!");
        user0.setUsername("hi!");
        user0.setFirstName("");
        user0.setUsername("hi!");
        user0.setEmail("hi!");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str4);
    }

    @Test
    public void test0189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0189");
        User user0 = new User();
        java.lang.String str1 = user0.getPassword();
        user0.setUsername("");
        user0.setLastName("");
        user0.setEmail("");
        org.junit.Assert.assertNull(str1);
    }

    @Test
    public void test0190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0190");
        User user0 = new User();
        java.lang.String str1 = user0.getPassword();
        user0.setUsername("hi!");
        user0.setFirstName("");
        java.lang.String str6 = user0.getPassword();
        user0.setEmail("hi!");
        user0.setPassword("");
        user0.setCountry("");
        java.lang.Class<?> wildcardClass13 = user0.getClass();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0191");
        User user0 = new User();
        user0.setPassword("hi!");
        user0.setPassword("");
        user0.setUsername("");
        user0.setUsername("hi!");
        java.lang.String str9 = user0.getPassword();
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test0192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0192");
        User user0 = new User();
        java.lang.String str1 = user0.getPassword();
        user0.setCountry("hi!");
        java.lang.String str4 = user0.getFirstName();
        java.lang.String str5 = user0.getDob();
        java.lang.String str6 = user0.getLastName();
        java.lang.String str7 = user0.getUsername();
        user0.setLastName("hi!");
        user0.setPassword("");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test0193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0193");
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
        user0.setDob("");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test0194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0194");
        User user0 = new User();
        java.lang.String str1 = user0.getPassword();
        java.lang.String str2 = user0.getUsername();
        java.lang.String str3 = user0.getEmail();
        user0.setFirstName("");
        user0.setLastName("hi!");
        java.lang.String str8 = user0.getFirstName();
        user0.setDob("");
        user0.setLastName("");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test0195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0195");
        User user0 = new User();
        java.lang.String str1 = user0.getPassword();
        java.lang.String str2 = user0.getPassword();
        user0.setUsername("");
        java.lang.String str5 = user0.getCountry();
        java.lang.String str6 = user0.getDob();
        java.lang.String str7 = user0.getFirstName();
        user0.setPassword("hi!");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test0196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0196");
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
        java.lang.Class<?> wildcardClass14 = user0.getClass();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0197");
        User user0 = new User();
        java.lang.String str1 = user0.getPassword();
        user0.setUsername("");
        user0.setFirstName("hi!");
        java.lang.String str6 = user0.getCountry();
        user0.setEmail("");
        java.lang.Class<?> wildcardClass9 = user0.getClass();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0198");
        User user0 = new User();
        java.lang.String str1 = user0.getPassword();
        user0.setCountry("hi!");
        user0.setUsername("hi!");
        java.lang.String str6 = user0.getUsername();
        user0.setLastName("");
        java.lang.String str9 = user0.getLastName();
        user0.setFirstName("hi!");
        java.lang.String str12 = user0.getEmail();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test0199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0199");
        User user0 = new User();
        java.lang.String str1 = user0.getPassword();
        user0.setUsername("hi!");
        user0.setFirstName("");
        java.lang.String str6 = user0.getPassword();
        user0.setEmail("hi!");
        user0.setPassword("");
        java.lang.String str11 = user0.getDob();
        java.lang.String str12 = user0.getUsername();
        java.lang.String str13 = user0.getPassword();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test0200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0200");
        User user0 = new User();
        java.lang.String str1 = user0.getPassword();
        java.lang.String str2 = user0.getUsername();
        java.lang.String str3 = user0.getEmail();
        user0.setFirstName("");
        user0.setLastName("hi!");
        user0.setUsername("hi!");
        java.lang.String str10 = user0.getPassword();
        user0.setCountry("hi!");
        user0.setEmail("hi!");
        java.lang.String str15 = user0.getEmail();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
    }

    @Test
    public void test0201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0201");
        User user0 = new User();
        user0.setPassword("hi!");
        user0.setPassword("");
        user0.setPassword("");
        java.lang.String str7 = user0.getCountry();
        user0.setPassword("hi!");
        user0.setCountry("");
        java.lang.Class<?> wildcardClass12 = user0.getClass();
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0202");
        User user0 = new User();
        java.lang.String str1 = user0.getPassword();
        user0.setUsername("hi!");
        user0.setDob("");
        org.junit.Assert.assertNull(str1);
    }

    @Test
    public void test0203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0203");
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
        user0.setCountry("");
        java.lang.String str17 = user0.getDob();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
    }

    @Test
    public void test0204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0204");
        User user0 = new User();
        java.lang.String str1 = user0.getPassword();
        user0.setUsername("hi!");
        java.lang.String str4 = user0.getDob();
        user0.setUsername("");
        java.lang.Class<?> wildcardClass7 = user0.getClass();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0205");
        User user0 = new User();
        java.lang.String str1 = user0.getPassword();
        java.lang.String str2 = user0.getUsername();
        java.lang.String str3 = user0.getEmail();
        user0.setUsername("");
        user0.setUsername("");
        user0.setFirstName("");
        java.lang.String str10 = user0.getFirstName();
        user0.setPassword("hi!");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test0206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0206");
        User user0 = new User();
        java.lang.String str1 = user0.getPassword();
        java.lang.String str2 = user0.getPassword();
        java.lang.String str3 = user0.getPassword();
        user0.setLastName("");
        user0.setUsername("hi!");
        java.lang.String str8 = user0.getPassword();
        user0.setDob("hi!");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test0207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0207");
        User user0 = new User();
        java.lang.String str1 = user0.getPassword();
        java.lang.String str2 = user0.getUsername();
        java.lang.String str3 = user0.getEmail();
        java.lang.String str4 = user0.getLastName();
        java.lang.String str5 = user0.getEmail();
        user0.setLastName("hi!");
        java.lang.String str8 = user0.getEmail();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test0208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0208");
        User user0 = new User();
        java.lang.String str1 = user0.getPassword();
        user0.setCountry("hi!");
        java.lang.String str4 = user0.getFirstName();
        user0.setCountry("");
        java.lang.String str7 = user0.getEmail();
        user0.setEmail("");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test0209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0209");
        User user0 = new User();
        user0.setPassword("hi!");
        user0.setPassword("");
        java.lang.String str5 = user0.getFirstName();
        user0.setEmail("hi!");
        java.lang.String str8 = user0.getLastName();
        user0.setUsername("");
        user0.setLastName("hi!");
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test0210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0210");
        User user0 = new User();
        java.lang.String str1 = user0.getPassword();
        user0.setCountry("hi!");
        java.lang.String str4 = user0.getFirstName();
        java.lang.String str5 = user0.getDob();
        java.lang.String str6 = user0.getLastName();
        user0.setLastName("");
        user0.setEmail("");
        java.lang.String str11 = user0.getLastName();
        user0.setDob("hi!");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test0211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0211");
        User user0 = new User();
        java.lang.String str1 = user0.getPassword();
        user0.setCountry("hi!");
        java.lang.String str4 = user0.getFirstName();
        user0.setLastName("hi!");
        user0.setDob("hi!");
        java.lang.String str9 = user0.getFirstName();
        java.lang.String str10 = user0.getDob();
        user0.setFirstName("hi!");
        user0.setDob("hi!");
        java.lang.Class<?> wildcardClass15 = user0.getClass();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0212");
        User user0 = new User();
        user0.setPassword("hi!");
        user0.setPassword("");
        java.lang.String str5 = user0.getPassword();
        java.lang.String str6 = user0.getEmail();
        user0.setFirstName("hi!");
        java.lang.String str9 = user0.getFirstName();
        user0.setDob("hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
    }

    @Test
    public void test0213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0213");
        User user0 = new User();
        java.lang.String str1 = user0.getPassword();
        user0.setUsername("hi!");
        user0.setCountry("hi!");
        java.lang.String str6 = user0.getLastName();
        user0.setUsername("");
        java.lang.String str9 = user0.getLastName();
        user0.setUsername("");
        user0.setCountry("hi!");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test0214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0214");
        User user0 = new User();
        user0.setLastName("");
        java.lang.String str3 = user0.getCountry();
        java.lang.Class<?> wildcardClass4 = user0.getClass();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0215");
        User user0 = new User();
        java.lang.String str1 = user0.getPassword();
        user0.setCountry("hi!");
        java.lang.String str4 = user0.getFirstName();
        user0.setLastName("hi!");
        user0.setDob("hi!");
        java.lang.String str9 = user0.getFirstName();
        java.lang.String str10 = user0.getEmail();
        user0.setDob("");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test0216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0216");
        User user0 = new User();
        user0.setPassword("hi!");
        java.lang.String str3 = user0.getPassword();
        java.lang.String str4 = user0.getFirstName();
        java.lang.String str5 = user0.getCountry();
        user0.setUsername("");
        java.lang.String str8 = user0.getEmail();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test0217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0217");
        User user0 = new User();
        java.lang.String str1 = user0.getPassword();
        java.lang.String str2 = user0.getUsername();
        java.lang.String str3 = user0.getEmail();
        java.lang.String str4 = user0.getLastName();
        user0.setUsername("hi!");
        java.lang.String str7 = user0.getEmail();
        java.lang.Class<?> wildcardClass8 = user0.getClass();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0218");
        User user0 = new User();
        user0.setPassword("hi!");
        user0.setPassword("");
        java.lang.String str5 = user0.getPassword();
        java.lang.String str6 = user0.getEmail();
        user0.setEmail("");
        user0.setFirstName("");
        user0.setFirstName("hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test0219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0219");
        User user0 = new User();
        java.lang.String str1 = user0.getPassword();
        java.lang.String str2 = user0.getUsername();
        java.lang.String str3 = user0.getEmail();
        user0.setUsername("");
        user0.setUsername("");
        java.lang.String str8 = user0.getFirstName();
        user0.setPassword("hi!");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test0220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0220");
        User user0 = new User();
        java.lang.String str1 = user0.getPassword();
        java.lang.String str2 = user0.getPassword();
        java.lang.String str3 = user0.getPassword();
        java.lang.String str4 = user0.getDob();
        user0.setFirstName("hi!");
        user0.setDob("");
        user0.setLastName("");
        user0.setLastName("hi!");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
    }

    @Test
    public void test0221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0221");
        User user0 = new User();
        user0.setPassword("hi!");
        java.lang.String str3 = user0.getPassword();
        java.lang.String str4 = user0.getFirstName();
        java.lang.String str5 = user0.getLastName();
        user0.setFirstName("");
        java.lang.String str8 = user0.getFirstName();
        user0.setPassword("hi!");
        java.lang.String str11 = user0.getLastName();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test0222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0222");
        User user0 = new User();
        java.lang.String str1 = user0.getPassword();
        user0.setCountry("hi!");
        java.lang.String str4 = user0.getFirstName();
        user0.setLastName("hi!");
        user0.setDob("hi!");
        java.lang.String str9 = user0.getEmail();
        user0.setLastName("");
        java.lang.String str12 = user0.getPassword();
        user0.setUsername("hi!");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test0223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0223");
        User user0 = new User();
        user0.setPassword("hi!");
        user0.setPassword("");
        java.lang.String str5 = user0.getPassword();
        java.lang.String str6 = user0.getEmail();
        java.lang.String str7 = user0.getEmail();
        java.lang.String str8 = user0.getFirstName();
        java.lang.String str9 = user0.getUsername();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test0224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0224");
        User user0 = new User();
        user0.setPassword("hi!");
        user0.setPassword("");
        java.lang.String str5 = user0.getPassword();
        java.lang.String str6 = user0.getEmail();
        user0.setCountry("hi!");
        java.lang.String str9 = user0.getDob();
        user0.setEmail("");
        java.lang.String str12 = user0.getPassword();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test0225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0225");
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
        java.lang.Class<?> wildcardClass15 = user0.getClass();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0226");
        User user0 = new User();
        java.lang.String str1 = user0.getPassword();
        java.lang.String str2 = user0.getPassword();
        java.lang.String str3 = user0.getPassword();
        java.lang.String str4 = user0.getDob();
        user0.setFirstName("hi!");
        user0.setDob("");
        java.lang.String str9 = user0.getCountry();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test0227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0227");
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
        user0.setCountry("");
        user0.setEmail("");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str14);
    }

    @Test
    public void test0228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0228");
        User user0 = new User();
        user0.setPassword("hi!");
        user0.setPassword("");
        user0.setUsername("");
        user0.setUsername("hi!");
        java.lang.String str9 = user0.getDob();
        java.lang.String str10 = user0.getDob();
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test0229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0229");
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
        user0.setDob("hi!");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test0230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0230");
        User user0 = new User();
        java.lang.String str1 = user0.getPassword();
        java.lang.String str2 = user0.getUsername();
        java.lang.String str3 = user0.getEmail();
        user0.setUsername("");
        java.lang.String str6 = user0.getFirstName();
        java.lang.String str7 = user0.getUsername();
        java.lang.String str8 = user0.getFirstName();
        java.lang.Class<?> wildcardClass9 = user0.getClass();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0231");
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
        java.lang.Class<?> wildcardClass15 = user0.getClass();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0232");
        User user0 = new User();
        java.lang.String str1 = user0.getPassword();
        user0.setCountry("hi!");
        java.lang.String str4 = user0.getFirstName();
        java.lang.String str5 = user0.getDob();
        java.lang.String str6 = user0.getLastName();
        java.lang.String str7 = user0.getCountry();
        java.lang.String str8 = user0.getPassword();
        java.lang.String str9 = user0.getCountry();
        user0.setCountry("");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
    }

    @Test
    public void test0233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0233");
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
        java.lang.Class<?> wildcardClass18 = user0.getClass();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test0234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0234");
        User user0 = new User();
        java.lang.String str1 = user0.getFirstName();
        java.lang.String str2 = user0.getCountry();
        user0.setUsername("hi!");
        user0.setLastName("hi!");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
    }

    @Test
    public void test0235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0235");
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
        java.lang.String str15 = user0.getUsername();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNull(str15);
    }

    @Test
    public void test0236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0236");
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
        java.lang.String str16 = user0.getEmail();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertNull(str16);
    }

    @Test
    public void test0237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0237");
        User user0 = new User();
        java.lang.String str1 = user0.getPassword();
        user0.setCountry("hi!");
        java.lang.String str4 = user0.getUsername();
        user0.setPassword("");
        user0.setFirstName("");
        java.lang.String str9 = user0.getLastName();
        java.lang.String str10 = user0.getFirstName();
        java.lang.String str11 = user0.getLastName();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test0238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0238");
        User user0 = new User();
        java.lang.String str1 = user0.getPassword();
        java.lang.String str2 = user0.getPassword();
        java.lang.String str3 = user0.getFirstName();
        java.lang.String str4 = user0.getDob();
        java.lang.String str5 = user0.getDob();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
    }

    @Test
    public void test0239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0239");
        User user0 = new User();
        java.lang.String str1 = user0.getPassword();
        java.lang.String str2 = user0.getUsername();
        user0.setDob("");
        java.lang.String str5 = user0.getEmail();
        java.lang.String str6 = user0.getCountry();
        java.lang.String str7 = user0.getPassword();
        java.lang.String str8 = user0.getUsername();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test0240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0240");
        User user0 = new User();
        user0.setPassword("hi!");
        user0.setPassword("");
        java.lang.String str5 = user0.getPassword();
        user0.setCountry("hi!");
        java.lang.String str8 = user0.getPassword();
        java.lang.String str9 = user0.getDob();
        user0.setDob("");
        java.lang.String str12 = user0.getPassword();
        java.lang.String str13 = user0.getPassword();
        user0.setCountry("");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test0241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0241");
        User user0 = new User();
        java.lang.String str1 = user0.getPassword();
        user0.setCountry("hi!");
        user0.setUsername("hi!");
        user0.setCountry("");
        java.lang.String str8 = user0.getFirstName();
        java.lang.String str9 = user0.getLastName();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test0242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0242");
        User user0 = new User();
        java.lang.String str1 = user0.getPassword();
        user0.setCountry("hi!");
        java.lang.String str4 = user0.getFirstName();
        user0.setLastName("hi!");
        user0.setDob("hi!");
        java.lang.String str9 = user0.getEmail();
        user0.setLastName("");
        java.lang.String str12 = user0.getEmail();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test0243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0243");
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
        user0.setCountry("");
        user0.setCountry("");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test0244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0244");
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
        user0.setCountry("");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str15);
    }

    @Test
    public void test0245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0245");
        User user0 = new User();
        user0.setPassword("hi!");
        java.lang.String str3 = user0.getPassword();
        java.lang.String str4 = user0.getPassword();
        java.lang.String str5 = user0.getLastName();
        java.lang.String str6 = user0.getPassword();
        java.lang.Class<?> wildcardClass7 = user0.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0246");
        User user0 = new User();
        java.lang.String str1 = user0.getPassword();
        user0.setCountry("hi!");
        java.lang.String str4 = user0.getFirstName();
        java.lang.String str5 = user0.getFirstName();
        java.lang.String str6 = user0.getLastName();
        user0.setLastName("");
        java.lang.String str9 = user0.getLastName();
        user0.setUsername("hi!");
        user0.setDob("");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test0247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0247");
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
        java.lang.Class<?> wildcardClass18 = user0.getClass();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test0248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0248");
        User user0 = new User();
        user0.setPassword("hi!");
        user0.setPassword("");
        java.lang.String str5 = user0.getPassword();
        user0.setCountry("hi!");
        user0.setLastName("hi!");
        java.lang.String str10 = user0.getFirstName();
        java.lang.String str11 = user0.getLastName();
        java.lang.String str12 = user0.getFirstName();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test0249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0249");
        User user0 = new User();
        java.lang.String str1 = user0.getPassword();
        java.lang.String str2 = user0.getUsername();
        java.lang.String str3 = user0.getEmail();
        user0.setLastName("");
        user0.setUsername("hi!");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test0250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0250");
        User user0 = new User();
        java.lang.String str1 = user0.getPassword();
        user0.setCountry("hi!");
        java.lang.String str4 = user0.getFirstName();
        java.lang.String str5 = user0.getDob();
        java.lang.String str6 = user0.getLastName();
        java.lang.String str7 = user0.getCountry();
        user0.setEmail("hi!");
        user0.setDob("");
        user0.setUsername("");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
    }

    @Test
    public void test0251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0251");
        User user0 = new User();
        java.lang.String str1 = user0.getPassword();
        java.lang.String str2 = user0.getUsername();
        java.lang.String str3 = user0.getEmail();
        user0.setFirstName("");
        java.lang.String str6 = user0.getCountry();
        java.lang.String str7 = user0.getLastName();
        user0.setPassword("");
        java.lang.Class<?> wildcardClass10 = user0.getClass();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0252");
        User user0 = new User();
        java.lang.String str1 = user0.getPassword();
        java.lang.String str2 = user0.getUsername();
        java.lang.String str3 = user0.getCountry();
        user0.setPassword("");
        user0.setLastName("");
        user0.setUsername("");
        user0.setUsername("hi!");
        user0.setUsername("");
        java.lang.Class<?> wildcardClass14 = user0.getClass();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0253");
        User user0 = new User();
        java.lang.String str1 = user0.getPassword();
        java.lang.String str2 = user0.getPassword();
        java.lang.String str3 = user0.getFirstName();
        user0.setDob("hi!");
        java.lang.String str6 = user0.getEmail();
        user0.setPassword("hi!");
        java.lang.String str9 = user0.getCountry();
        user0.setDob("");
        java.lang.Class<?> wildcardClass12 = user0.getClass();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0254");
        User user0 = new User();
        user0.setPassword("hi!");
        java.lang.String str3 = user0.getPassword();
        java.lang.String str4 = user0.getPassword();
        java.lang.String str5 = user0.getLastName();
        java.lang.String str6 = user0.getPassword();
        user0.setCountry("hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
    }

    @Test
    public void test0255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0255");
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
        user0.setUsername("");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test0256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0256");
        User user0 = new User();
        java.lang.String str1 = user0.getPassword();
        java.lang.String str2 = user0.getUsername();
        java.lang.String str3 = user0.getCountry();
        java.lang.String str4 = user0.getPassword();
        java.lang.String str5 = user0.getUsername();
        user0.setFirstName("");
        java.lang.String str8 = user0.getPassword();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test0257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0257");
        User user0 = new User();
        user0.setLastName("");
        user0.setDob("hi!");
        java.lang.Class<?> wildcardClass5 = user0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0258");
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
        java.lang.String str14 = user0.getPassword();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
    }

    @Test
    public void test0259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0259");
        User user0 = new User();
        user0.setPassword("hi!");
        java.lang.String str3 = user0.getPassword();
        java.lang.String str4 = user0.getFirstName();
        java.lang.String str5 = user0.getPassword();
        user0.setFirstName("");
        java.lang.Class<?> wildcardClass8 = user0.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0260");
        User user0 = new User();
        java.lang.String str1 = user0.getPassword();
        java.lang.String str2 = user0.getPassword();
        java.lang.String str3 = user0.getPassword();
        user0.setLastName("");
        user0.setUsername("hi!");
        java.lang.String str8 = user0.getDob();
        user0.setEmail("");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test0261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0261");
        User user0 = new User();
        java.lang.String str1 = user0.getPassword();
        java.lang.String str2 = user0.getPassword();
        user0.setLastName("hi!");
        java.lang.String str5 = user0.getCountry();
        java.lang.String str6 = user0.getEmail();
        java.lang.String str7 = user0.getLastName();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
    }

    @Test
    public void test0262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0262");
        User user0 = new User();
        java.lang.String str1 = user0.getPassword();
        java.lang.String str2 = user0.getUsername();
        java.lang.String str3 = user0.getEmail();
        user0.setFirstName("");
        user0.setUsername("");
        user0.setLastName("hi!");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test0263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0263");
        User user0 = new User();
        java.lang.String str1 = user0.getPassword();
        user0.setUsername("hi!");
        user0.setCountry("hi!");
        java.lang.String str6 = user0.getLastName();
        user0.setUsername("");
        java.lang.String str9 = user0.getLastName();
        user0.setPassword("hi!");
        user0.setLastName("hi!");
        user0.setPassword("hi!");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test0264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0264");
        User user0 = new User();
        java.lang.String str1 = user0.getPassword();
        user0.setCountry("hi!");
        user0.setUsername("hi!");
        user0.setPassword("");
        java.lang.String str8 = user0.getUsername();
        user0.setLastName("hi!");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
    }

    @Test
    public void test0265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0265");
        User user0 = new User();
        java.lang.String str1 = user0.getPassword();
        user0.setCountry("hi!");
        java.lang.String str4 = user0.getFirstName();
        user0.setLastName("hi!");
        user0.setDob("hi!");
        java.lang.String str9 = user0.getFirstName();
        java.lang.String str10 = user0.getDob();
        user0.setFirstName("hi!");
        user0.setDob("hi!");
        user0.setUsername("hi!");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
    }

    @Test
    public void test0266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0266");
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
        user0.setUsername("");
        java.lang.Class<?> wildcardClass16 = user0.getClass();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0267");
        User user0 = new User();
        java.lang.String str1 = user0.getPassword();
        java.lang.String str2 = user0.getUsername();
        java.lang.String str3 = user0.getEmail();
        user0.setUsername("");
        user0.setUsername("");
        user0.setFirstName("");
        java.lang.String str10 = user0.getFirstName();
        java.lang.String str11 = user0.getCountry();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test0268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0268");
        User user0 = new User();
        java.lang.String str1 = user0.getFirstName();
        java.lang.String str2 = user0.getPassword();
        user0.setDob("hi!");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
    }

    @Test
    public void test0269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0269");
        User user0 = new User();
        java.lang.String str1 = user0.getPassword();
        user0.setCountry("hi!");
        java.lang.String str4 = user0.getPassword();
        user0.setCountry("");
        user0.setUsername("");
        user0.setFirstName("");
        user0.setFirstName("");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str4);
    }

    @Test
    public void test0270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0270");
        User user0 = new User();
        java.lang.String str1 = user0.getPassword();
        user0.setCountry("hi!");
        java.lang.String str4 = user0.getPassword();
        java.lang.String str5 = user0.getDob();
        user0.setCountry("");
        java.lang.Class<?> wildcardClass8 = user0.getClass();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0271");
        User user0 = new User();
        user0.setPassword("hi!");
        user0.setPassword("");
        java.lang.String str5 = user0.getPassword();
        user0.setFirstName("");
        user0.setEmail("");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
    }

    @Test
    public void test0272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0272");
        User user0 = new User();
        java.lang.String str1 = user0.getPassword();
        java.lang.String str2 = user0.getPassword();
        user0.setUsername("");
        java.lang.String str5 = user0.getCountry();
        user0.setUsername("hi!");
        java.lang.Class<?> wildcardClass8 = user0.getClass();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0273");
        User user0 = new User();
        user0.setPassword("hi!");
        user0.setPassword("");
        java.lang.String str5 = user0.getUsername();
        java.lang.String str6 = user0.getLastName();
        user0.setEmail("hi!");
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test0274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0274");
        User user0 = new User();
        java.lang.String str1 = user0.getPassword();
        java.lang.String str2 = user0.getUsername();
        user0.setDob("");
        java.lang.String str5 = user0.getEmail();
        java.lang.String str6 = user0.getCountry();
        user0.setPassword("hi!");
        user0.setCountry("");
        user0.setEmail("");
        java.lang.String str13 = user0.getDob();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test0275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0275");
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
        java.lang.String str13 = user0.getEmail();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertNull(str13);
    }

    @Test
    public void test0276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0276");
        User user0 = new User();
        java.lang.String str1 = user0.getFirstName();
        user0.setPassword("");
        user0.setEmail("hi!");
        user0.setUsername("hi!");
        org.junit.Assert.assertNull(str1);
    }

    @Test
    public void test0277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0277");
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
        java.lang.String str12 = user0.getFirstName();
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
    public void test0278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0278");
        User user0 = new User();
        java.lang.String str1 = user0.getPassword();
        user0.setCountry("hi!");
        java.lang.String str4 = user0.getUsername();
        user0.setPassword("");
        user0.setUsername("");
        user0.setUsername("hi!");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str4);
    }

    @Test
    public void test0279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0279");
        User user0 = new User();
        java.lang.String str1 = user0.getPassword();
        user0.setCountry("hi!");
        user0.setUsername("hi!");
        user0.setCountry("");
        java.lang.String str8 = user0.getFirstName();
        user0.setPassword("");
        user0.setPassword("hi!");
        java.lang.String str13 = user0.getCountry();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test0280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0280");
        User user0 = new User();
        java.lang.String str1 = user0.getPassword();
        java.lang.String str2 = user0.getPassword();
        user0.setLastName("hi!");
        java.lang.String str5 = user0.getCountry();
        user0.setLastName("hi!");
        java.lang.String str8 = user0.getDob();
        user0.setDob("");
        user0.setEmail("");
        user0.setCountry("");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test0281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0281");
        User user0 = new User();
        java.lang.String str1 = user0.getPassword();
        user0.setCountry("hi!");
        java.lang.String str4 = user0.getFirstName();
        java.lang.String str5 = user0.getDob();
        java.lang.String str6 = user0.getLastName();
        user0.setFirstName("hi!");
        user0.setUsername("");
        user0.setCountry("");
        java.lang.String str13 = user0.getPassword();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str13);
    }

    @Test
    public void test0282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0282");
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
        user0.setPassword("hi!");
        java.lang.String str22 = user0.getLastName();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
    }

    @Test
    public void test0283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0283");
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
        user0.setEmail("hi!");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test0284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0284");
        User user0 = new User();
        java.lang.String str1 = user0.getPassword();
        java.lang.String str2 = user0.getPassword();
        java.lang.String str3 = user0.getFirstName();
        user0.setDob("hi!");
        java.lang.String str6 = user0.getEmail();
        user0.setEmail("");
        user0.setUsername("");
        java.lang.String str11 = user0.getLastName();
        java.lang.Class<?> wildcardClass12 = user0.getClass();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0285");
        User user0 = new User();
        java.lang.String str1 = user0.getPassword();
        user0.setCountry("hi!");
        java.lang.String str4 = user0.getUsername();
        user0.setPassword("");
        user0.setFirstName("");
        java.lang.String str9 = user0.getLastName();
        user0.setCountry("hi!");
        java.lang.String str12 = user0.getCountry();
        java.lang.Class<?> wildcardClass13 = user0.getClass();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0286");
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
        java.lang.String str12 = user0.getLastName();
        java.lang.String str13 = user0.getCountry();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
    }

    @Test
    public void test0287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0287");
        User user0 = new User();
        user0.setPassword("hi!");
        user0.setPassword("");
        java.lang.String str5 = user0.getPassword();
        user0.setCountry("hi!");
        user0.setLastName("hi!");
        java.lang.String str10 = user0.getFirstName();
        java.lang.String str11 = user0.getLastName();
        user0.setLastName("");
        java.lang.String str14 = user0.getUsername();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertNull(str14);
    }

    @Test
    public void test0288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0288");
        User user0 = new User();
        user0.setPassword("hi!");
        user0.setPassword("");
        java.lang.String str5 = user0.getDob();
        user0.setEmail("");
        user0.setUsername("");
        user0.setPassword("");
        java.lang.String str12 = user0.getCountry();
        java.lang.String str13 = user0.getCountry();
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str13);
    }

    @Test
    public void test0289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0289");
        User user0 = new User();
        user0.setPassword("hi!");
        user0.setPassword("");
        java.lang.String str5 = user0.getDob();
        user0.setEmail("");
        user0.setUsername("");
        user0.setPassword("");
        user0.setLastName("");
        java.lang.String str14 = user0.getFirstName();
        user0.setCountry("hi!");
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str14);
    }

    @Test
    public void test0290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0290");
        User user0 = new User();
        user0.setPassword("hi!");
        user0.setPassword("");
        java.lang.String str5 = user0.getPassword();
        user0.setFirstName("");
        user0.setLastName("");
        user0.setPassword("hi!");
        java.lang.Class<?> wildcardClass12 = user0.getClass();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0291");
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
        java.lang.String str15 = user0.getEmail();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNull(str15);
    }

    @Test
    public void test0292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0292");
        User user0 = new User();
        java.lang.String str1 = user0.getPassword();
        java.lang.String str2 = user0.getPassword();
        java.lang.String str3 = user0.getPassword();
        user0.setLastName("");
        user0.setUsername("hi!");
        user0.setUsername("");
        user0.setFirstName("");
        user0.setLastName("");
        java.lang.String str14 = user0.getPassword();
        user0.setCountry("");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str14);
    }

    @Test
    public void test0293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0293");
        User user0 = new User();
        java.lang.String str1 = user0.getPassword();
        java.lang.String str2 = user0.getUsername();
        java.lang.String str3 = user0.getEmail();
        user0.setFirstName("");
        user0.setLastName("hi!");
        user0.setUsername("hi!");
        user0.setEmail("");
        java.lang.String str12 = user0.getEmail();
        user0.setUsername("hi!");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test0294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0294");
        User user0 = new User();
        user0.setPassword("hi!");
        user0.setPassword("");
        java.lang.String str5 = user0.getPassword();
        java.lang.String str6 = user0.getEmail();
        java.lang.String str7 = user0.getLastName();
        java.lang.String str8 = user0.getEmail();
        java.lang.String str9 = user0.getUsername();
        java.lang.String str10 = user0.getDob();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test0295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0295");
        User user0 = new User();
        java.lang.String str1 = user0.getPassword();
        user0.setCountry("hi!");
        java.lang.String str4 = user0.getFirstName();
        java.lang.String str5 = user0.getDob();
        user0.setEmail("");
        user0.setEmail("");
        user0.setFirstName("");
        user0.setFirstName("");
        user0.setFirstName("hi!");
        java.lang.Class<?> wildcardClass16 = user0.getClass();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0296");
        User user0 = new User();
        user0.setPassword("hi!");
        user0.setPassword("");
        java.lang.String str5 = user0.getDob();
        user0.setEmail("");
        user0.setUsername("");
        java.lang.String str10 = user0.getFirstName();
        user0.setDob("hi!");
        user0.setPassword("");
        user0.setPassword("");
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test0297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0297");
        User user0 = new User();
        user0.setPassword("hi!");
        java.lang.String str3 = user0.getPassword();
        java.lang.String str4 = user0.getFirstName();
        java.lang.String str5 = user0.getLastName();
        user0.setFirstName("");
        java.lang.String str8 = user0.getFirstName();
        java.lang.String str9 = user0.getUsername();
        java.lang.Class<?> wildcardClass10 = user0.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0298");
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
        user0.setPassword("hi!");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test0299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0299");
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
        java.lang.String str13 = user0.getCountry();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
    }

    @Test
    public void test0300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0300");
        User user0 = new User();
        user0.setPassword("hi!");
        user0.setPassword("");
        java.lang.String str5 = user0.getPassword();
        user0.setFirstName("");
        user0.setFirstName("");
        user0.setUsername("");
        java.lang.Class<?> wildcardClass12 = user0.getClass();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0301");
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
        user0.setDob("");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
    }

    @Test
    public void test0302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0302");
        User user0 = new User();
        java.lang.String str1 = user0.getPassword();
        user0.setCountry("hi!");
        java.lang.String str4 = user0.getPassword();
        java.lang.String str5 = user0.getDob();
        java.lang.String str6 = user0.getCountry();
        java.lang.String str7 = user0.getUsername();
        java.lang.String str8 = user0.getPassword();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test0303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0303");
        User user0 = new User();
        java.lang.String str1 = user0.getPassword();
        java.lang.String str2 = user0.getPassword();
        java.lang.String str3 = user0.getPassword();
        java.lang.String str4 = user0.getDob();
        user0.setLastName("hi!");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
    }

    @Test
    public void test0304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0304");
        User user0 = new User();
        java.lang.String str1 = user0.getFirstName();
        java.lang.String str2 = user0.getCountry();
        user0.setFirstName("");
        user0.setUsername("");
        java.lang.String str7 = user0.getCountry();
        java.lang.String str8 = user0.getEmail();
        user0.setUsername("");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test0305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0305");
        User user0 = new User();
        java.lang.String str1 = user0.getPassword();
        java.lang.String str2 = user0.getUsername();
        java.lang.String str3 = user0.getCountry();
        user0.setEmail("hi!");
        java.lang.String str6 = user0.getPassword();
        java.lang.String str7 = user0.getEmail();
        java.lang.String str8 = user0.getPassword();
        java.lang.String str9 = user0.getFirstName();
        user0.setUsername("hi!");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test0306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0306");
        User user0 = new User();
        java.lang.String str1 = user0.getPassword();
        java.lang.String str2 = user0.getUsername();
        java.lang.String str3 = user0.getEmail();
        java.lang.String str4 = user0.getLastName();
        user0.setDob("");
        java.lang.String str7 = user0.getLastName();
        java.lang.String str8 = user0.getEmail();
        user0.setDob("");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test0307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0307");
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
        user0.setEmail("hi!");
        user0.setEmail("hi!");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
    }

    @Test
    public void test0308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0308");
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
        java.lang.Class<?> wildcardClass13 = user0.getClass();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0309");
        User user0 = new User();
        java.lang.String str1 = user0.getFirstName();
        user0.setPassword("");
        java.lang.String str4 = user0.getUsername();
        java.lang.String str5 = user0.getUsername();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
    }

    @Test
    public void test0310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0310");
        User user0 = new User();
        java.lang.String str1 = user0.getPassword();
        java.lang.String str2 = user0.getUsername();
        user0.setDob("");
        java.lang.String str5 = user0.getEmail();
        java.lang.String str6 = user0.getCountry();
        java.lang.String str7 = user0.getPassword();
        java.lang.String str8 = user0.getDob();
        user0.setDob("hi!");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test0311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0311");
        User user0 = new User();
        java.lang.String str1 = user0.getPassword();
        java.lang.String str2 = user0.getUsername();
        java.lang.String str3 = user0.getEmail();
        user0.setFirstName("");
        user0.setLastName("hi!");
        user0.setUsername("hi!");
        user0.setDob("");
        java.lang.String str12 = user0.getEmail();
        java.lang.String str13 = user0.getFirstName();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test0312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0312");
        User user0 = new User();
        java.lang.String str1 = user0.getPassword();
        user0.setCountry("hi!");
        java.lang.String str4 = user0.getFirstName();
        java.lang.String str5 = user0.getDob();
        user0.setEmail("");
        user0.setEmail("");
        user0.setFirstName("");
        java.lang.String str12 = user0.getEmail();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test0313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0313");
        User user0 = new User();
        java.lang.String str1 = user0.getPassword();
        user0.setUsername("");
        user0.setLastName("");
        java.lang.String str6 = user0.getFirstName();
        java.lang.String str7 = user0.getPassword();
        java.lang.String str8 = user0.getUsername();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test0314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0314");
        User user0 = new User();
        user0.setPassword("hi!");
        user0.setPassword("");
        java.lang.String str5 = user0.getDob();
        user0.setEmail("");
        user0.setLastName("hi!");
        java.lang.String str10 = user0.getDob();
        java.lang.Class<?> wildcardClass11 = user0.getClass();
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0315");
        User user0 = new User();
        java.lang.String str1 = user0.getPassword();
        user0.setUsername("hi!");
        user0.setCountry("hi!");
        user0.setFirstName("");
        user0.setLastName("hi!");
        java.lang.Class<?> wildcardClass10 = user0.getClass();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0316");
        User user0 = new User();
        user0.setLastName("");
        user0.setDob("hi!");
        user0.setCountry("");
        java.lang.String str7 = user0.getCountry();
        java.lang.String str8 = user0.getFirstName();
        java.lang.String str9 = user0.getPassword();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test0317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0317");
        User user0 = new User();
        java.lang.String str1 = user0.getPassword();
        java.lang.String str2 = user0.getUsername();
        java.lang.String str3 = user0.getCountry();
        user0.setFirstName("");
        java.lang.String str6 = user0.getUsername();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test0318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0318");
        User user0 = new User();
        java.lang.String str1 = user0.getPassword();
        user0.setCountry("hi!");
        java.lang.String str4 = user0.getUsername();
        user0.setPassword("");
        user0.setFirstName("hi!");
        user0.setCountry("");
        user0.setUsername("hi!");
        user0.setEmail("");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str4);
    }

    @Test
    public void test0319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0319");
        User user0 = new User();
        user0.setLastName("");
        user0.setDob("hi!");
        user0.setCountry("");
        java.lang.String str7 = user0.getDob();
        java.lang.String str8 = user0.getDob();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
    }

    @Test
    public void test0320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0320");
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
        java.lang.String str13 = user0.getUsername();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test0321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0321");
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
        java.lang.String str19 = user0.getEmail();
        java.lang.Class<?> wildcardClass20 = user0.getClass();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test0322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0322");
        User user0 = new User();
        java.lang.String str1 = user0.getPassword();
        java.lang.String str2 = user0.getUsername();
        java.lang.String str3 = user0.getEmail();
        user0.setFirstName("");
        user0.setLastName("hi!");
        user0.setUsername("hi!");
        java.lang.String str10 = user0.getUsername();
        user0.setLastName("");
        java.lang.String str13 = user0.getLastName();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test0323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0323");
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
        user0.setUsername("");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test0324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0324");
        User user0 = new User();
        java.lang.String str1 = user0.getPassword();
        user0.setCountry("hi!");
        java.lang.String str4 = user0.getUsername();
        java.lang.String str5 = user0.getPassword();
        user0.setUsername("");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
    }

    @Test
    public void test0325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0325");
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
        java.lang.Class<?> wildcardClass13 = user0.getClass();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0326");
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
        user0.setLastName("");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str14);
    }

    @Test
    public void test0327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0327");
        User user0 = new User();
        java.lang.String str1 = user0.getPassword();
        user0.setUsername("hi!");
        user0.setFirstName("");
        java.lang.String str6 = user0.getPassword();
        java.lang.String str7 = user0.getCountry();
        user0.setPassword("");
        user0.setPassword("");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test0328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0328");
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
        user0.setPassword("hi!");
        java.lang.String str20 = user0.getEmail();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(str20);
    }

    @Test
    public void test0329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0329");
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
    public void test0330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0330");
        User user0 = new User();
        java.lang.String str1 = user0.getPassword();
        user0.setCountry("hi!");
        java.lang.String str4 = user0.getFirstName();
        user0.setLastName("hi!");
        user0.setDob("hi!");
        java.lang.String str9 = user0.getFirstName();
        user0.setCountry("");
        user0.setEmail("");
        java.lang.String str14 = user0.getCountry();
        java.lang.String str15 = user0.getPassword();
        java.lang.Class<?> wildcardClass16 = user0.getClass();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0331");
        User user0 = new User();
        java.lang.String str1 = user0.getPassword();
        java.lang.String str2 = user0.getUsername();
        java.lang.String str3 = user0.getEmail();
        user0.setFirstName("");
        user0.setLastName("hi!");
        user0.setUsername("hi!");
        java.lang.String str10 = user0.getDob();
        java.lang.String str11 = user0.getFirstName();
        user0.setUsername("");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test0332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0332");
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
        user0.setEmail("");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
    }

    @Test
    public void test0333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0333");
        User user0 = new User();
        java.lang.String str1 = user0.getPassword();
        user0.setCountry("hi!");
        user0.setUsername("hi!");
        user0.setCountry("");
        user0.setLastName("hi!");
        java.lang.String str10 = user0.getCountry();
        user0.setLastName("");
        java.lang.String str13 = user0.getUsername();
        user0.setFirstName("hi!");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
    }

    @Test
    public void test0334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0334");
        User user0 = new User();
        java.lang.String str1 = user0.getPassword();
        user0.setCountry("hi!");
        user0.setUsername("hi!");
        java.lang.String str6 = user0.getUsername();
        user0.setUsername("hi!");
        user0.setUsername("hi!");
        user0.setPassword("hi!");
        user0.setEmail("");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
    }

    @Test
    public void test0335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0335");
        User user0 = new User();
        java.lang.String str1 = user0.getFirstName();
        user0.setPassword("");
        user0.setEmail("hi!");
        user0.setCountry("");
        user0.setDob("hi!");
        java.lang.Class<?> wildcardClass10 = user0.getClass();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0336");
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
        java.lang.String str18 = user0.getUsername();
        user0.setDob("hi!");
        java.lang.String str21 = user0.getUsername();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!" + "'", str21, "hi!");
    }

    @Test
    public void test0337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0337");
        User user0 = new User();
        java.lang.String str1 = user0.getPassword();
        user0.setUsername("hi!");
        user0.setCountry("hi!");
        user0.setFirstName("");
        user0.setUsername("");
        java.lang.String str10 = user0.getLastName();
        java.lang.String str11 = user0.getLastName();
        user0.setDob("hi!");
        java.lang.String str14 = user0.getPassword();
        java.lang.String str15 = user0.getCountry();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
    }

    @Test
    public void test0338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0338");
        User user0 = new User();
        java.lang.String str1 = user0.getPassword();
        user0.setCountry("hi!");
        java.lang.String str4 = user0.getPassword();
        java.lang.String str5 = user0.getPassword();
        java.lang.String str6 = user0.getEmail();
        java.lang.String str7 = user0.getLastName();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test0339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0339");
        User user0 = new User();
        java.lang.String str1 = user0.getPassword();
        java.lang.String str2 = user0.getUsername();
        java.lang.String str3 = user0.getEmail();
        user0.setUsername("");
        user0.setUsername("");
        user0.setLastName("");
        java.lang.String str10 = user0.getFirstName();
        java.lang.String str11 = user0.getLastName();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test0340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0340");
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
        java.lang.String str16 = user0.getFirstName();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
    }

    @Test
    public void test0341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0341");
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
        user0.setCountry("");
        user0.setEmail("");
        java.lang.String str19 = user0.getUsername();
        java.lang.String str20 = user0.getLastName();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertNull(str20);
    }

    @Test
    public void test0342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0342");
        User user0 = new User();
        user0.setPassword("hi!");
        user0.setPassword("");
        java.lang.String str5 = user0.getDob();
        user0.setEmail("");
        user0.setUsername("");
        user0.setPassword("");
        user0.setLastName("");
        java.lang.String str14 = user0.getPassword();
        user0.setEmail("");
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test0343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0343");
        User user0 = new User();
        java.lang.String str1 = user0.getPassword();
        java.lang.String str2 = user0.getPassword();
        java.lang.String str3 = user0.getFirstName();
        user0.setPassword("");
        user0.setCountry("");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test0344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0344");
        User user0 = new User();
        user0.setPassword("hi!");
        user0.setPassword("");
        java.lang.String str5 = user0.getPassword();
        user0.setCountry("hi!");
        user0.setLastName("hi!");
        user0.setFirstName("");
        java.lang.String str12 = user0.getPassword();
        java.lang.String str13 = user0.getEmail();
        java.lang.String str14 = user0.getLastName();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
    }

    @Test
    public void test0345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0345");
        User user0 = new User();
        java.lang.String str1 = user0.getPassword();
        user0.setCountry("hi!");
        java.lang.String str4 = user0.getPassword();
        java.lang.String str5 = user0.getPassword();
        java.lang.String str6 = user0.getFirstName();
        java.lang.String str7 = user0.getCountry();
        user0.setFirstName("hi!");
        user0.setDob("");
        java.lang.String str12 = user0.getFirstName();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
    }

    @Test
    public void test0346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0346");
        User user0 = new User();
        java.lang.String str1 = user0.getPassword();
        user0.setCountry("hi!");
        java.lang.String str4 = user0.getFirstName();
        user0.setLastName("hi!");
        user0.setDob("hi!");
        java.lang.String str9 = user0.getFirstName();
        java.lang.String str10 = user0.getFirstName();
        java.lang.String str11 = user0.getLastName();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
    }

    @Test
    public void test0347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0347");
        User user0 = new User();
        java.lang.String str1 = user0.getPassword();
        java.lang.String str2 = user0.getPassword();
        java.lang.String str3 = user0.getPassword();
        java.lang.String str4 = user0.getDob();
        user0.setDob("hi!");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
    }

    @Test
    public void test0348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0348");
        User user0 = new User();
        java.lang.String str1 = user0.getFirstName();
        user0.setPassword("");
        user0.setEmail("hi!");
        user0.setPassword("hi!");
        java.lang.String str8 = user0.getPassword();
        java.lang.String str9 = user0.getLastName();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test0349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0349");
        User user0 = new User();
        java.lang.String str1 = user0.getPassword();
        java.lang.String str2 = user0.getPassword();
        user0.setUsername("");
        java.lang.String str5 = user0.getCountry();
        java.lang.String str6 = user0.getCountry();
        java.lang.String str7 = user0.getCountry();
        java.lang.String str8 = user0.getLastName();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test0350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0350");
        User user0 = new User();
        user0.setPassword("hi!");
        user0.setPassword("");
        java.lang.String str5 = user0.getDob();
        user0.setEmail("");
        user0.setUsername("");
        user0.setPassword("");
        java.lang.String str12 = user0.getUsername();
        java.lang.Class<?> wildcardClass13 = user0.getClass();
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0351");
        User user0 = new User();
        java.lang.String str1 = user0.getPassword();
        user0.setCountry("hi!");
        java.lang.String str4 = user0.getFirstName();
        user0.setLastName("hi!");
        user0.setDob("hi!");
        java.lang.String str9 = user0.getEmail();
        user0.setDob("hi!");
        user0.setEmail("hi!");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test0352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0352");
        User user0 = new User();
        java.lang.String str1 = user0.getFirstName();
        user0.setPassword("");
        user0.setEmail("hi!");
        java.lang.String str6 = user0.getLastName();
        java.lang.String str7 = user0.getPassword();
        java.lang.String str8 = user0.getPassword();
        user0.setCountry("hi!");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test0353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0353");
        User user0 = new User();
        java.lang.String str1 = user0.getPassword();
        java.lang.String str2 = user0.getUsername();
        user0.setDob("");
        java.lang.String str5 = user0.getEmail();
        user0.setUsername("");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str5);
    }

    @Test
    public void test0354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0354");
        User user0 = new User();
        java.lang.String str1 = user0.getPassword();
        user0.setCountry("hi!");
        java.lang.String str4 = user0.getFirstName();
        java.lang.String str5 = user0.getDob();
        java.lang.String str6 = user0.getLastName();
        user0.setFirstName("hi!");
        user0.setEmail("hi!");
        user0.setLastName("");
        java.lang.Class<?> wildcardClass13 = user0.getClass();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0355");
        User user0 = new User();
        java.lang.String str1 = user0.getPassword();
        java.lang.String str2 = user0.getUsername();
        java.lang.String str3 = user0.getEmail();
        user0.setUsername("");
        java.lang.String str6 = user0.getPassword();
        java.lang.String str7 = user0.getLastName();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test0356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0356");
        User user0 = new User();
        java.lang.String str1 = user0.getPassword();
        java.lang.String str2 = user0.getPassword();
        java.lang.String str3 = user0.getPassword();
        java.lang.String str4 = user0.getDob();
        user0.setFirstName("hi!");
        user0.setDob("");
        java.lang.String str9 = user0.getUsername();
        java.lang.String str10 = user0.getFirstName();
        user0.setLastName("hi!");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
    }

    @Test
    public void test0357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0357");
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
        user0.setDob("");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test0358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0358");
        User user0 = new User();
        java.lang.String str1 = user0.getPassword();
        java.lang.String str2 = user0.getUsername();
        java.lang.String str3 = user0.getEmail();
        user0.setUsername("");
        java.lang.String str6 = user0.getFirstName();
        java.lang.String str7 = user0.getUsername();
        java.lang.String str8 = user0.getFirstName();
        user0.setUsername("");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test0359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0359");
        User user0 = new User();
        java.lang.String str1 = user0.getPassword();
        user0.setCountry("hi!");
        java.lang.String str4 = user0.getPassword();
        java.lang.String str5 = user0.getPassword();
        java.lang.String str6 = user0.getDob();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test0360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0360");
        User user0 = new User();
        java.lang.String str1 = user0.getPassword();
        java.lang.String str2 = user0.getUsername();
        java.lang.String str3 = user0.getEmail();
        java.lang.String str4 = user0.getLastName();
        user0.setDob("");
        user0.setFirstName("hi!");
        user0.setDob("hi!");
        java.lang.String str11 = user0.getDob();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
    }

    @Test
    public void test0361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0361");
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
        java.lang.String str20 = user0.getCountry();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
    }

    @Test
    public void test0362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0362");
        User user0 = new User();
        user0.setPassword("hi!");
        user0.setPassword("");
        java.lang.String str5 = user0.getPassword();
        user0.setCountry("hi!");
        user0.setLastName("hi!");
        java.lang.String str10 = user0.getFirstName();
        user0.setEmail("");
        java.lang.String str13 = user0.getCountry();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
    }

    @Test
    public void test0363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0363");
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
        java.lang.String str14 = user0.getDob();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertNull(str14);
    }

    @Test
    public void test0364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0364");
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
        user0.setLastName("hi!");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test0365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0365");
        User user0 = new User();
        java.lang.String str1 = user0.getPassword();
        java.lang.String str2 = user0.getPassword();
        user0.setLastName("hi!");
        java.lang.String str5 = user0.getCountry();
        user0.setCountry("hi!");
        user0.setLastName("");
        java.lang.String str10 = user0.getCountry();
        user0.setDob("");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
    }

    @Test
    public void test0366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0366");
        User user0 = new User();
        java.lang.String str1 = user0.getPassword();
        java.lang.String str2 = user0.getUsername();
        java.lang.String str3 = user0.getEmail();
        user0.setUsername("");
        java.lang.String str6 = user0.getEmail();
        user0.setEmail("");
        java.lang.Class<?> wildcardClass9 = user0.getClass();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0367");
        User user0 = new User();
        java.lang.String str1 = user0.getPassword();
        user0.setCountry("hi!");
        user0.setUsername("hi!");
        user0.setPassword("");
        user0.setUsername("");
        java.lang.Class<?> wildcardClass10 = user0.getClass();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0368");
        User user0 = new User();
        user0.setPassword("hi!");
        user0.setPassword("");
        java.lang.String str5 = user0.getPassword();
        java.lang.String str6 = user0.getEmail();
        user0.setEmail("");
        user0.setFirstName("");
        user0.setDob("");
        user0.setUsername("");
        user0.setEmail("hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test0369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0369");
        User user0 = new User();
        java.lang.String str1 = user0.getPassword();
        java.lang.String str2 = user0.getPassword();
        java.lang.String str3 = user0.getFirstName();
        java.lang.String str4 = user0.getPassword();
        user0.setDob("");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
    }

    @Test
    public void test0370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0370");
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
        user0.setLastName("hi!");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test0371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0371");
        User user0 = new User();
        user0.setPassword("hi!");
        user0.setPassword("");
        user0.setUsername("");
        user0.setFirstName("");
        user0.setEmail("");
        java.lang.String str11 = user0.getDob();
        user0.setPassword("");
        user0.setUsername("");
        user0.setFirstName("hi!");
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test0372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0372");
        User user0 = new User();
        java.lang.String str1 = user0.getPassword();
        user0.setCountry("hi!");
        java.lang.String str4 = user0.getUsername();
        java.lang.String str5 = user0.getPassword();
        java.lang.String str6 = user0.getUsername();
        user0.setCountry("hi!");
        user0.setLastName("hi!");
        java.lang.String str11 = user0.getPassword();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test0373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0373");
        User user0 = new User();
        java.lang.String str1 = user0.getPassword();
        user0.setCountry("hi!");
        java.lang.String str4 = user0.getFirstName();
        java.lang.String str5 = user0.getDob();
        java.lang.String str6 = user0.getLastName();
        java.lang.String str7 = user0.getUsername();
        user0.setUsername("");
        java.lang.Class<?> wildcardClass10 = user0.getClass();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0374");
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
        java.lang.Class<?> wildcardClass15 = user0.getClass();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0375");
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
        java.lang.String str14 = user0.getCountry();
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
    public void test0376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0376");
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
        java.lang.Class<?> wildcardClass18 = user0.getClass();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test0377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0377");
        User user0 = new User();
        java.lang.String str1 = user0.getPassword();
        java.lang.String str2 = user0.getPassword();
        user0.setLastName("hi!");
        java.lang.String str5 = user0.getCountry();
        user0.setCountry("hi!");
        user0.setEmail("hi!");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str5);
    }

    @Test
    public void test0378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0378");
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
        java.lang.String str15 = user0.getPassword();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str15);
    }

    @Test
    public void test0379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0379");
        User user0 = new User();
        user0.setPassword("hi!");
        user0.setPassword("");
        java.lang.String str5 = user0.getPassword();
        java.lang.String str6 = user0.getEmail();
        user0.setCountry("hi!");
        java.lang.String str9 = user0.getFirstName();
        user0.setEmail("");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test0380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0380");
        User user0 = new User();
        java.lang.String str1 = user0.getFirstName();
        java.lang.String str2 = user0.getCountry();
        java.lang.String str3 = user0.getFirstName();
        java.lang.String str4 = user0.getEmail();
        java.lang.String str5 = user0.getUsername();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
    }

    @Test
    public void test0381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0381");
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
        java.lang.String str17 = user0.getUsername();
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
        org.junit.Assert.assertNull(str17);
    }

    @Test
    public void test0382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0382");
        User user0 = new User();
        java.lang.String str1 = user0.getPassword();
        java.lang.String str2 = user0.getUsername();
        java.lang.String str3 = user0.getEmail();
        java.lang.String str4 = user0.getLastName();
        java.lang.String str5 = user0.getFirstName();
        user0.setFirstName("");
        user0.setCountry("");
        java.lang.String str10 = user0.getFirstName();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test0383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0383");
        User user0 = new User();
        java.lang.String str1 = user0.getPassword();
        user0.setCountry("hi!");
        java.lang.String str4 = user0.getPassword();
        java.lang.String str5 = user0.getPassword();
        java.lang.String str6 = user0.getFirstName();
        java.lang.String str7 = user0.getCountry();
        user0.setEmail("hi!");
        java.lang.String str10 = user0.getLastName();
        user0.setDob("");
        user0.setLastName("");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test0384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0384");
        User user0 = new User();
        java.lang.String str1 = user0.getPassword();
        java.lang.String str2 = user0.getUsername();
        java.lang.String str3 = user0.getEmail();
        user0.setUsername("");
        java.lang.String str6 = user0.getEmail();
        user0.setLastName("hi!");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test0385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0385");
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
        java.lang.String str16 = user0.getPassword();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str16);
    }

    @Test
    public void test0386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0386");
        User user0 = new User();
        user0.setPassword("hi!");
        user0.setPassword("");
        java.lang.String str5 = user0.getPassword();
        user0.setCountry("hi!");
        user0.setLastName("hi!");
        java.lang.String str10 = user0.getFirstName();
        user0.setEmail("hi!");
        user0.setFirstName("hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test0387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0387");
        User user0 = new User();
        java.lang.String str1 = user0.getPassword();
        user0.setCountry("hi!");
        java.lang.String str4 = user0.getPassword();
        java.lang.String str5 = user0.getPassword();
        java.lang.String str6 = user0.getEmail();
        java.lang.String str7 = user0.getUsername();
        user0.setFirstName("hi!");
        java.lang.String str10 = user0.getCountry();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
    }

    @Test
    public void test0388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0388");
        User user0 = new User();
        java.lang.String str1 = user0.getPassword();
        java.lang.String str2 = user0.getUsername();
        java.lang.String str3 = user0.getEmail();
        user0.setFirstName("");
        java.lang.String str6 = user0.getCountry();
        java.lang.Class<?> wildcardClass7 = user0.getClass();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0389");
        User user0 = new User();
        java.lang.String str1 = user0.getPassword();
        java.lang.String str2 = user0.getPassword();
        java.lang.String str3 = user0.getPassword();
        java.lang.String str4 = user0.getDob();
        user0.setFirstName("hi!");
        user0.setDob("");
        java.lang.String str9 = user0.getUsername();
        java.lang.Class<?> wildcardClass10 = user0.getClass();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0390");
        User user0 = new User();
        java.lang.String str1 = user0.getPassword();
        user0.setUsername("hi!");
        java.lang.String str4 = user0.getDob();
        user0.setUsername("");
        java.lang.String str7 = user0.getUsername();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test0391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0391");
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
        user0.setEmail("hi!");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test0392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0392");
        User user0 = new User();
        java.lang.String str1 = user0.getPassword();
        java.lang.String str2 = user0.getUsername();
        java.lang.String str3 = user0.getCountry();
        user0.setPassword("");
        user0.setLastName("");
        user0.setUsername("");
        java.lang.String str10 = user0.getFirstName();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test0393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0393");
        User user0 = new User();
        java.lang.String str1 = user0.getPassword();
        java.lang.String str2 = user0.getUsername();
        java.lang.String str3 = user0.getEmail();
        user0.setFirstName("");
        user0.setLastName("hi!");
        user0.setUsername("hi!");
        java.lang.String str10 = user0.getDob();
        java.lang.String str11 = user0.getCountry();
        java.lang.String str12 = user0.getCountry();
        java.lang.String str13 = user0.getPassword();
        user0.setEmail("");
        java.lang.Class<?> wildcardClass16 = user0.getClass();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0394");
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
        java.lang.String str18 = user0.getDob();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
    }

    @Test
    public void test0395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0395");
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
        java.lang.Class<?> wildcardClass11 = user0.getClass();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0396");
        User user0 = new User();
        user0.setPassword("hi!");
        user0.setPassword("");
        java.lang.String str5 = user0.getPassword();
        java.lang.String str6 = user0.getEmail();
        user0.setEmail("");
        user0.setFirstName("");
        user0.setDob("");
        user0.setDob("hi!");
        java.lang.String str15 = user0.getDob();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
    }

    @Test
    public void test0397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0397");
        User user0 = new User();
        user0.setPassword("hi!");
        user0.setPassword("");
        java.lang.String str5 = user0.getPassword();
        user0.setCountry("hi!");
        user0.setLastName("hi!");
        user0.setFirstName("");
        java.lang.String str12 = user0.getFirstName();
        java.lang.String str13 = user0.getUsername();
        user0.setPassword("");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNull(str13);
    }

    @Test
    public void test0398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0398");
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
        java.lang.Class<?> wildcardClass14 = user0.getClass();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0399");
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
        java.lang.String str14 = user0.getCountry();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str14);
    }

    @Test
    public void test0400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0400");
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
        user0.setDob("hi!");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test0401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0401");
        User user0 = new User();
        java.lang.String str1 = user0.getPassword();
        user0.setCountry("hi!");
        java.lang.String str4 = user0.getPassword();
        user0.setFirstName("");
        user0.setLastName("hi!");
        user0.setUsername("hi!");
        java.lang.Class<?> wildcardClass11 = user0.getClass();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0402");
        User user0 = new User();
        java.lang.String str1 = user0.getPassword();
        user0.setUsername("hi!");
        user0.setFirstName("");
        java.lang.String str6 = user0.getPassword();
        user0.setEmail("hi!");
        user0.setCountry("");
        java.lang.Class<?> wildcardClass11 = user0.getClass();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0403");
        User user0 = new User();
        java.lang.String str1 = user0.getPassword();
        java.lang.String str2 = user0.getUsername();
        java.lang.String str3 = user0.getEmail();
        user0.setUsername("");
        java.lang.String str6 = user0.getFirstName();
        user0.setUsername("");
        java.lang.String str9 = user0.getPassword();
        user0.setEmail("");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test0404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0404");
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
        java.lang.String str16 = user0.getFirstName();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNull(str16);
    }

    @Test
    public void test0405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0405");
        User user0 = new User();
        java.lang.String str1 = user0.getPassword();
        java.lang.String str2 = user0.getPassword();
        java.lang.String str3 = user0.getPassword();
        user0.setLastName("");
        java.lang.String str6 = user0.getLastName();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test0406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0406");
        User user0 = new User();
        user0.setPassword("hi!");
        user0.setPassword("");
        java.lang.String str5 = user0.getPassword();
        user0.setCountry("hi!");
        java.lang.String str8 = user0.getPassword();
        java.lang.String str9 = user0.getDob();
        user0.setDob("");
        java.lang.String str12 = user0.getUsername();
        java.lang.String str13 = user0.getPassword();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test0407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0407");
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
        user0.setDob("");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
    }

    @Test
    public void test0408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0408");
        User user0 = new User();
        user0.setLastName("");
        java.lang.String str3 = user0.getCountry();
        java.lang.String str4 = user0.getDob();
        user0.setCountry("");
        java.lang.Class<?> wildcardClass7 = user0.getClass();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0409");
        User user0 = new User();
        java.lang.String str1 = user0.getPassword();
        java.lang.String str2 = user0.getLastName();
        java.lang.String str3 = user0.getDob();
        user0.setFirstName("");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test0410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0410");
        User user0 = new User();
        java.lang.String str1 = user0.getFirstName();
        java.lang.String str2 = user0.getCountry();
        java.lang.String str3 = user0.getFirstName();
        user0.setUsername("hi!");
        java.lang.String str6 = user0.getUsername();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
    }

    @Test
    public void test0411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0411");
        User user0 = new User();
        java.lang.String str1 = user0.getPassword();
        java.lang.String str2 = user0.getUsername();
        java.lang.String str3 = user0.getEmail();
        user0.setUsername("");
        java.lang.String str6 = user0.getPassword();
        java.lang.String str7 = user0.getDob();
        user0.setLastName("");
        user0.setEmail("");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test0412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0412");
        User user0 = new User();
        java.lang.String str1 = user0.getPassword();
        user0.setUsername("hi!");
        user0.setFirstName("");
        java.lang.String str6 = user0.getPassword();
        user0.setEmail("hi!");
        user0.setCountry("hi!");
        user0.setLastName("");
        user0.setDob("hi!");
        java.lang.Class<?> wildcardClass15 = user0.getClass();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0413");
        User user0 = new User();
        java.lang.String str1 = user0.getPassword();
        user0.setCountry("hi!");
        java.lang.String str4 = user0.getFirstName();
        java.lang.String str5 = user0.getDob();
        java.lang.String str6 = user0.getLastName();
        user0.setFirstName("hi!");
        user0.setUsername("hi!");
        java.lang.String str11 = user0.getUsername();
        user0.setLastName("hi!");
        user0.setCountry("hi!");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
    }

    @Test
    public void test0414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0414");
        User user0 = new User();
        java.lang.String str1 = user0.getPassword();
        user0.setCountry("hi!");
        java.lang.String str4 = user0.getUsername();
        user0.setPassword("");
        user0.setFirstName("");
        java.lang.String str9 = user0.getLastName();
        java.lang.String str10 = user0.getFirstName();
        user0.setEmail("hi!");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test0415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0415");
        User user0 = new User();
        java.lang.String str1 = user0.getPassword();
        user0.setCountry("hi!");
        java.lang.String str4 = user0.getFirstName();
        user0.setLastName("hi!");
        user0.setDob("hi!");
        java.lang.String str9 = user0.getLastName();
        java.lang.String str10 = user0.getCountry();
        java.lang.String str11 = user0.getLastName();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
    }

    @Test
    public void test0416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0416");
        User user0 = new User();
        java.lang.String str1 = user0.getPassword();
        java.lang.String str2 = user0.getUsername();
        java.lang.String str3 = user0.getEmail();
        java.lang.String str4 = user0.getLastName();
        user0.setDob("");
        user0.setFirstName("hi!");
        user0.setDob("");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
    }

    @Test
    public void test0417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0417");
        User user0 = new User();
        java.lang.String str1 = user0.getPassword();
        java.lang.String str2 = user0.getUsername();
        java.lang.String str3 = user0.getEmail();
        user0.setFirstName("");
        user0.setLastName("hi!");
        java.lang.String str8 = user0.getFirstName();
        java.lang.String str9 = user0.getUsername();
        java.lang.String str10 = user0.getLastName();
        user0.setPassword("hi!");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
    }

    @Test
    public void test0418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0418");
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
        user0.setUsername("");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test0419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0419");
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
        java.lang.String str14 = user0.getLastName();
        user0.setLastName("hi!");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str14);
    }

    @Test
    public void test0420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0420");
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
        user0.setLastName("hi!");
        user0.setFirstName("");
        user0.setCountry("hi!");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
    }

    @Test
    public void test0421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0421");
        User user0 = new User();
        java.lang.String str1 = user0.getPassword();
        java.lang.String str2 = user0.getUsername();
        java.lang.String str3 = user0.getEmail();
        user0.setUsername("");
        user0.setUsername("");
        java.lang.String str8 = user0.getUsername();
        java.lang.Class<?> wildcardClass9 = user0.getClass();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0422");
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
        user0.setCountry("");
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
    public void test0423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0423");
        User user0 = new User();
        user0.setLastName("");
        java.lang.String str3 = user0.getCountry();
        java.lang.String str4 = user0.getDob();
        user0.setPassword("hi!");
        java.lang.String str7 = user0.getCountry();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test0424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0424");
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
        user0.setLastName("");
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test0425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0425");
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
        java.lang.String str15 = user0.getFirstName();
        java.lang.Class<?> wildcardClass16 = user0.getClass();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0426");
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
        java.lang.Class<?> wildcardClass22 = user0.getClass();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test0427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0427");
        User user0 = new User();
        java.lang.String str1 = user0.getPassword();
        user0.setUsername("");
        user0.setLastName("");
        user0.setEmail("hi!");
        user0.setFirstName("hi!");
        java.lang.String str10 = user0.getCountry();
        user0.setLastName("hi!");
        java.lang.Class<?> wildcardClass13 = user0.getClass();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0428");
        User user0 = new User();
        java.lang.String str1 = user0.getPassword();
        user0.setCountry("hi!");
        java.lang.String str4 = user0.getPassword();
        user0.setFirstName("");
        user0.setLastName("hi!");
        user0.setUsername("hi!");
        user0.setFirstName("");
        user0.setUsername("hi!");
        java.lang.String str15 = user0.getLastName();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
    }

    @Test
    public void test0429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0429");
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
        java.lang.String str17 = user0.getPassword();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
    }

    @Test
    public void test0430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0430");
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
        java.lang.String str15 = user0.getUsername();
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
    public void test0431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0431");
        User user0 = new User();
        java.lang.String str1 = user0.getPassword();
        user0.setCountry("hi!");
        user0.setUsername("hi!");
        java.lang.String str6 = user0.getUsername();
        user0.setUsername("hi!");
        user0.setUsername("hi!");
        user0.setPassword("hi!");
        java.lang.String str13 = user0.getFirstName();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertNull(str13);
    }

    @Test
    public void test0432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0432");
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
        user0.setDob("");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str14);
    }

    @Test
    public void test0433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0433");
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
        user0.setFirstName("hi!");
        user0.setPassword("");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
    }

    @Test
    public void test0434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0434");
        User user0 = new User();
        java.lang.String str1 = user0.getPassword();
        java.lang.String str2 = user0.getUsername();
        java.lang.String str3 = user0.getEmail();
        user0.setUsername("");
        java.lang.String str6 = user0.getPassword();
        java.lang.String str7 = user0.getDob();
        java.lang.String str8 = user0.getDob();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test0435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0435");
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
        user0.setDob("");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test0436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0436");
        User user0 = new User();
        java.lang.String str1 = user0.getPassword();
        java.lang.String str2 = user0.getUsername();
        java.lang.String str3 = user0.getCountry();
        user0.setPassword("");
        user0.setLastName("");
        user0.setUsername("");
        java.lang.String str10 = user0.getUsername();
        java.lang.String str11 = user0.getEmail();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test0437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0437");
        User user0 = new User();
        java.lang.String str1 = user0.getPassword();
        user0.setUsername("");
        user0.setLastName("");
        java.lang.String str6 = user0.getFirstName();
        java.lang.String str7 = user0.getPassword();
        java.lang.String str8 = user0.getLastName();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test0438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0438");
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
        user0.setLastName("");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
    }

    @Test
    public void test0439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0439");
        User user0 = new User();
        java.lang.String str1 = user0.getPassword();
        java.lang.String str2 = user0.getUsername();
        user0.setDob("");
        java.lang.String str5 = user0.getEmail();
        java.lang.String str6 = user0.getCountry();
        user0.setPassword("hi!");
        user0.setCountry("");
        user0.setEmail("");
        java.lang.Class<?> wildcardClass13 = user0.getClass();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0440");
        User user0 = new User();
        user0.setPassword("hi!");
        user0.setPassword("");
        java.lang.String str5 = user0.getPassword();
        user0.setFirstName("");
        user0.setLastName("");
        user0.setPassword("hi!");
        user0.setEmail("");
        user0.setEmail("");
        java.lang.Class<?> wildcardClass16 = user0.getClass();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0441");
        User user0 = new User();
        java.lang.String str1 = user0.getPassword();
        java.lang.String str2 = user0.getUsername();
        java.lang.String str3 = user0.getEmail();
        user0.setFirstName("");
        user0.setLastName("hi!");
        user0.setUsername("hi!");
        java.lang.String str10 = user0.getDob();
        user0.setFirstName("hi!");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test0442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0442");
        User user0 = new User();
        user0.setPassword("hi!");
        user0.setPassword("");
        user0.setPassword("");
        user0.setLastName("");
        java.lang.String str9 = user0.getCountry();
        java.lang.String str10 = user0.getLastName();
        java.lang.Class<?> wildcardClass11 = user0.getClass();
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0443");
        User user0 = new User();
        user0.setPassword("hi!");
        user0.setPassword("");
        user0.setPassword("");
        user0.setLastName("");
        java.lang.String str9 = user0.getCountry();
        java.lang.String str10 = user0.getLastName();
        user0.setLastName("");
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test0444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0444");
        User user0 = new User();
        user0.setLastName("");
        java.lang.String str3 = user0.getCountry();
        user0.setEmail("hi!");
        user0.setLastName("hi!");
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test0445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0445");
        User user0 = new User();
        java.lang.String str1 = user0.getPassword();
        user0.setCountry("hi!");
        java.lang.String str4 = user0.getUsername();
        user0.setPassword("");
        user0.setFirstName("hi!");
        user0.setCountry("");
        user0.setCountry("");
        java.lang.Class<?> wildcardClass13 = user0.getClass();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0446");
        User user0 = new User();
        user0.setPassword("hi!");
        user0.setPassword("");
        java.lang.String str5 = user0.getDob();
        user0.setEmail("");
        user0.setLastName("hi!");
        java.lang.String str10 = user0.getDob();
        java.lang.String str11 = user0.getDob();
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test0447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0447");
        User user0 = new User();
        user0.setPassword("hi!");
        user0.setPassword("");
        java.lang.String str5 = user0.getPassword();
        user0.setCountry("hi!");
        java.lang.String str8 = user0.getPassword();
        user0.setCountry("hi!");
        user0.setCountry("");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test0448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0448");
        User user0 = new User();
        java.lang.String str1 = user0.getPassword();
        user0.setCountry("hi!");
        java.lang.String str4 = user0.getFirstName();
        user0.setLastName("hi!");
        user0.setDob("hi!");
        user0.setLastName("hi!");
        java.lang.String str11 = user0.getFirstName();
        java.lang.Class<?> wildcardClass12 = user0.getClass();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0449");
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
        java.lang.String str19 = user0.getUsername();
        user0.setCountry("");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
    }

    @Test
    public void test0450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0450");
        User user0 = new User();
        java.lang.String str1 = user0.getPassword();
        java.lang.String str2 = user0.getPassword();
        java.lang.String str3 = user0.getFirstName();
        user0.setDob("hi!");
        java.lang.String str6 = user0.getEmail();
        user0.setPassword("hi!");
        user0.setDob("");
        user0.setPassword("hi!");
        java.lang.Class<?> wildcardClass13 = user0.getClass();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0451");
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
        user0.setUsername("hi!");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
    }

    @Test
    public void test0452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0452");
        User user0 = new User();
        java.lang.String str1 = user0.getPassword();
        user0.setUsername("hi!");
        user0.setFirstName("");
        java.lang.String str6 = user0.getPassword();
        user0.setLastName("");
        java.lang.String str9 = user0.getDob();
        java.lang.String str10 = user0.getEmail();
        user0.setLastName("");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test0453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0453");
        User user0 = new User();
        user0.setLastName("");
        user0.setDob("hi!");
        user0.setCountry("");
        user0.setLastName("hi!");
    }

    @Test
    public void test0454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0454");
        User user0 = new User();
        java.lang.String str1 = user0.getPassword();
        java.lang.String str2 = user0.getPassword();
        user0.setLastName("hi!");
        java.lang.String str5 = user0.getCountry();
        java.lang.String str6 = user0.getEmail();
        user0.setDob("");
        user0.setCountry("");
        user0.setDob("hi!");
        java.lang.String str13 = user0.getLastName();
        user0.setCountry("hi!");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
    }

    @Test
    public void test0455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0455");
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
        user0.setLastName("hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
    }

    @Test
    public void test0456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0456");
        User user0 = new User();
        java.lang.String str1 = user0.getPassword();
        java.lang.String str2 = user0.getUsername();
        java.lang.String str3 = user0.getEmail();
        user0.setUsername("");
        user0.setDob("hi!");
        user0.setUsername("");
        java.lang.String str10 = user0.getLastName();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test0457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0457");
        User user0 = new User();
        java.lang.String str1 = user0.getPassword();
        java.lang.String str2 = user0.getUsername();
        java.lang.String str3 = user0.getEmail();
        user0.setFirstName("");
        user0.setLastName("hi!");
        user0.setUsername("hi!");
        java.lang.String str10 = user0.getPassword();
        user0.setCountry("hi!");
        user0.setEmail("hi!");
        user0.setPassword("");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test0458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0458");
        User user0 = new User();
        user0.setPassword("hi!");
        user0.setPassword("");
        java.lang.String str5 = user0.getPassword();
        java.lang.String str6 = user0.getEmail();
        java.lang.String str7 = user0.getLastName();
        java.lang.String str8 = user0.getEmail();
        java.lang.String str9 = user0.getUsername();
        user0.setLastName("hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test0459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0459");
        User user0 = new User();
        java.lang.String str1 = user0.getPassword();
        java.lang.String str2 = user0.getPassword();
        user0.setLastName("hi!");
        java.lang.String str5 = user0.getCountry();
        user0.setFirstName("");
        user0.setDob("hi!");
        user0.setLastName("");
        java.lang.String str12 = user0.getUsername();
        user0.setLastName("hi!");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test0460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0460");
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
        java.lang.Class<?> wildcardClass13 = user0.getClass();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0461");
        User user0 = new User();
        java.lang.String str1 = user0.getPassword();
        user0.setCountry("hi!");
        java.lang.String str4 = user0.getFirstName();
        java.lang.String str5 = user0.getUsername();
        user0.setUsername("");
        java.lang.String str8 = user0.getFirstName();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test0462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0462");
        User user0 = new User();
        user0.setPassword("hi!");
        user0.setPassword("");
        java.lang.String str5 = user0.getPassword();
        java.lang.String str6 = user0.getEmail();
        user0.setEmail("");
        user0.setDob("hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test0463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0463");
        User user0 = new User();
        java.lang.String str1 = user0.getFirstName();
        java.lang.String str2 = user0.getCountry();
        user0.setUsername("hi!");
        java.lang.Class<?> wildcardClass5 = user0.getClass();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0464");
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
        java.lang.Class<?> wildcardClass22 = user0.getClass();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test0465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0465");
        User user0 = new User();
        user0.setLastName("");
        java.lang.String str3 = user0.getCountry();
        java.lang.String str4 = user0.getDob();
        user0.setCountry("");
        java.lang.String str7 = user0.getLastName();
        user0.setFirstName("");
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test0466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0466");
        User user0 = new User();
        java.lang.String str1 = user0.getPassword();
        java.lang.String str2 = user0.getUsername();
        user0.setLastName("hi!");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
    }

    @Test
    public void test0467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0467");
        User user0 = new User();
        user0.setLastName("");
        user0.setDob("hi!");
        user0.setCountry("");
        java.lang.String str7 = user0.getCountry();
        java.lang.String str8 = user0.getFirstName();
        user0.setEmail("");
        user0.setPassword("");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test0468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0468");
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
        java.lang.String str13 = user0.getEmail();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str13);
    }

    @Test
    public void test0469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0469");
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
        user0.setUsername("");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str15);
    }

    @Test
    public void test0470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0470");
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
        user0.setCountry("");
        user0.setLastName("");
        user0.setFirstName("hi!");
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
    public void test0471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0471");
        User user0 = new User();
        java.lang.String str1 = user0.getPassword();
        java.lang.String str2 = user0.getPassword();
        user0.setLastName("hi!");
        java.lang.String str5 = user0.getCountry();
        java.lang.String str6 = user0.getEmail();
        user0.setDob("");
        user0.setEmail("");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test0472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0472");
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
        java.lang.Class<?> wildcardClass12 = user0.getClass();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0473");
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
        java.lang.String str18 = user0.getPassword();
        java.lang.String str19 = user0.getDob();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
    }

    @Test
    public void test0474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0474");
        User user0 = new User();
        java.lang.String str1 = user0.getPassword();
        user0.setCountry("hi!");
        java.lang.String str4 = user0.getUsername();
        java.lang.String str5 = user0.getPassword();
        java.lang.String str6 = user0.getUsername();
        user0.setUsername("hi!");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test0475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0475");
        User user0 = new User();
        user0.setPassword("hi!");
        user0.setPassword("");
        user0.setPassword("");
        java.lang.String str7 = user0.getCountry();
        user0.setPassword("hi!");
        user0.setCountry("hi!");
        user0.setFirstName("hi!");
        java.lang.String str14 = user0.getCountry();
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
    }

    @Test
    public void test0476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0476");
        User user0 = new User();
        java.lang.String str1 = user0.getPassword();
        java.lang.String str2 = user0.getUsername();
        java.lang.String str3 = user0.getCountry();
        java.lang.String str4 = user0.getCountry();
        user0.setCountry("");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
    }

    @Test
    public void test0477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0477");
        User user0 = new User();
        java.lang.String str1 = user0.getPassword();
        user0.setCountry("hi!");
        java.lang.String str4 = user0.getUsername();
        java.lang.String str5 = user0.getPassword();
        java.lang.String str6 = user0.getUsername();
        user0.setCountry("hi!");
        java.lang.String str9 = user0.getPassword();
        user0.setCountry("hi!");
        user0.setFirstName("");
        user0.setUsername("");
        java.lang.String str16 = user0.getDob();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str16);
    }

    @Test
    public void test0478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0478");
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
        java.lang.String str18 = user0.getDob();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str18);
    }

    @Test
    public void test0479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0479");
        User user0 = new User();
        java.lang.String str1 = user0.getPassword();
        java.lang.String str2 = user0.getUsername();
        java.lang.String str3 = user0.getCountry();
        user0.setPassword("");
        user0.setLastName("");
        java.lang.String str8 = user0.getFirstName();
        java.lang.String str9 = user0.getFirstName();
        java.lang.String str10 = user0.getPassword();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test0480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0480");
        User user0 = new User();
        java.lang.String str1 = user0.getPassword();
        java.lang.String str2 = user0.getPassword();
        user0.setPassword("");
        java.lang.String str5 = user0.getEmail();
        user0.setUsername("hi!");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str5);
    }

    @Test
    public void test0481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0481");
        User user0 = new User();
        java.lang.String str1 = user0.getPassword();
        user0.setUsername("hi!");
        user0.setFirstName("");
        java.lang.String str6 = user0.getPassword();
        user0.setEmail("hi!");
        user0.setPassword("");
        java.lang.String str11 = user0.getDob();
        java.lang.String str12 = user0.getUsername();
        user0.setDob("");
        user0.setEmail("");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
    }

    @Test
    public void test0482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0482");
        User user0 = new User();
        java.lang.String str1 = user0.getPassword();
        user0.setUsername("hi!");
        user0.setCountry("hi!");
        user0.setFirstName("");
        user0.setUsername("");
        java.lang.String str10 = user0.getLastName();
        java.lang.String str11 = user0.getLastName();
        java.lang.Class<?> wildcardClass12 = user0.getClass();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0483");
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
        java.lang.Class<?> wildcardClass17 = user0.getClass();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test0484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0484");
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
        java.lang.Class<?> wildcardClass14 = user0.getClass();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0485");
        User user0 = new User();
        java.lang.String str1 = user0.getPassword();
        user0.setCountry("hi!");
        java.lang.String str4 = user0.getPassword();
        java.lang.String str5 = user0.getPassword();
        java.lang.String str6 = user0.getEmail();
        java.lang.String str7 = user0.getFirstName();
        user0.setDob("");
        user0.setDob("hi!");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test0486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0486");
        User user0 = new User();
        java.lang.String str1 = user0.getPassword();
        user0.setCountry("hi!");
        java.lang.String str4 = user0.getFirstName();
        user0.setLastName("hi!");
        java.lang.String str7 = user0.getLastName();
        java.lang.String str8 = user0.getFirstName();
        java.lang.String str9 = user0.getDob();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test0487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0487");
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
        java.lang.Class<?> wildcardClass16 = user0.getClass();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0488");
        User user0 = new User();
        java.lang.String str1 = user0.getPassword();
        java.lang.String str2 = user0.getUsername();
        java.lang.String str3 = user0.getEmail();
        user0.setFirstName("");
        java.lang.String str6 = user0.getCountry();
        java.lang.String str7 = user0.getLastName();
        java.lang.String str8 = user0.getEmail();
        java.lang.Class<?> wildcardClass9 = user0.getClass();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0489");
        User user0 = new User();
        java.lang.String str1 = user0.getPassword();
        java.lang.String str2 = user0.getUsername();
        java.lang.String str3 = user0.getEmail();
        user0.setUsername("");
        user0.setUsername("");
        java.lang.String str8 = user0.getFirstName();
        user0.setDob("hi!");
        user0.setFirstName("hi!");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test0490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0490");
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
        java.lang.Class<?> wildcardClass13 = user0.getClass();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0491");
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
        user0.setLastName("");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test0492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0492");
        User user0 = new User();
        java.lang.String str1 = user0.getPassword();
        user0.setCountry("hi!");
        java.lang.String str4 = user0.getPassword();
        java.lang.String str5 = user0.getPassword();
        user0.setCountry("");
        user0.setDob("hi!");
        java.lang.String str10 = user0.getPassword();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test0493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0493");
        User user0 = new User();
        user0.setPassword("hi!");
        user0.setLastName("");
        java.lang.String str5 = user0.getFirstName();
        user0.setDob("");
        org.junit.Assert.assertNull(str5);
    }

    @Test
    public void test0494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0494");
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
        user0.setFirstName("hi!");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test0495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0495");
        User user0 = new User();
        java.lang.String str1 = user0.getPassword();
        user0.setCountry("hi!");
        java.lang.String str4 = user0.getFirstName();
        user0.setLastName("hi!");
        user0.setDob("hi!");
        java.lang.String str9 = user0.getFirstName();
        user0.setCountry("");
        java.lang.String str12 = user0.getFirstName();
        java.lang.Class<?> wildcardClass13 = user0.getClass();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0496");
        User user0 = new User();
        user0.setPassword("hi!");
        user0.setPassword("");
        java.lang.String str5 = user0.getFirstName();
        user0.setLastName("hi!");
        user0.setFirstName("");
        java.lang.String str10 = user0.getDob();
        java.lang.String str11 = user0.getDob();
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test0497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0497");
        User user0 = new User();
        java.lang.String str1 = user0.getPassword();
        user0.setCountry("hi!");
        java.lang.String str4 = user0.getFirstName();
        java.lang.String str5 = user0.getDob();
        java.lang.String str6 = user0.getLastName();
        user0.setFirstName("hi!");
        user0.setUsername("");
        java.lang.String str11 = user0.getPassword();
        java.lang.String str12 = user0.getDob();
        java.lang.String str13 = user0.getUsername();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test0498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0498");
        User user0 = new User();
        java.lang.String str1 = user0.getPassword();
        java.lang.String str2 = user0.getUsername();
        java.lang.String str3 = user0.getCountry();
        java.lang.String str4 = user0.getPassword();
        java.lang.String str5 = user0.getUsername();
        user0.setFirstName("");
        user0.setFirstName("hi!");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
    }

    @Test
    public void test0499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0499");
        User user0 = new User();
        java.lang.String str1 = user0.getPassword();
        java.lang.String str2 = user0.getPassword();
        java.lang.String str3 = user0.getPassword();
        java.lang.String str4 = user0.getDob();
        user0.setFirstName("hi!");
        user0.setDob("");
        java.lang.String str9 = user0.getUsername();
        java.lang.String str10 = user0.getFirstName();
        java.lang.Class<?> wildcardClass11 = user0.getClass();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0500");
        User user0 = new User();
        java.lang.String str1 = user0.getPassword();
        java.lang.String str2 = user0.getPassword();
        java.lang.String str3 = user0.getFirstName();
        user0.setPassword("");
        user0.setFirstName("");
        user0.setEmail("");
        user0.setDob("");
        java.lang.String str12 = user0.getPassword();
        java.lang.String str13 = user0.getUsername();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNull(str13);
    }
}

