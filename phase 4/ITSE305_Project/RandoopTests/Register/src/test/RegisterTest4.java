import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegisterTest4 {

    public static boolean debug = false;

    @Test
    public void test2001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest4.test2001");
        Register register0 = new Register();
        register0.runRegistrationSystem((int) (byte) -1);
        register0.runRegistrationSystem((int) (short) 10);
        register0.loginUser("hi!", "");
        register0.registerUser("", "hi!");
        register0.loginUser("", "hi!");
        register0.loginUser("", "");
    }

    @Test
    public void test2002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest4.test2002");
        Register register0 = new Register();
        register0.loginUser("", "hi!");
        register0.loginUser("", "hi!");
        register0.loginUser("hi!", "hi!");
        register0.runRegistrationSystem((int) '4');
        register0.loginUser("", "hi!");
        register0.registerUser("hi!", "");
    }

    @Test
    public void test2003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest4.test2003");
        Register register0 = new Register();
        register0.runRegistrationSystem((int) (byte) -1);
        register0.registerUser("hi!", "");
        register0.registerUser("", "");
        register0.registerUser("", "hi!");
        java.lang.Class<?> wildcardClass12 = register0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test2004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest4.test2004");
        Register register0 = new Register();
        register0.loginUser("hi!", "hi!");
        register0.runRegistrationSystem(0);
        register0.registerUser("", "");
        register0.runRegistrationSystem((-1));
        register0.loginUser("", "");
        register0.registerUser("hi!", "hi!");
        register0.registerUser("", "");
        register0.registerUser("", "");
        java.lang.Class<?> wildcardClass23 = register0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test2005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest4.test2005");
        Register register0 = new Register();
        register0.runRegistrationSystem((int) '#');
        register0.registerUser("", "hi!");
        register0.runRegistrationSystem((int) (short) 0);
        register0.runRegistrationSystem((int) (byte) 1);
        register0.loginUser("", "hi!");
        register0.registerUser("hi!", "");
    }

    @Test
    public void test2006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest4.test2006");
        Register register0 = new Register();
        register0.registerUser("hi!", "");
        register0.runRegistrationSystem(1);
        register0.registerUser("", "");
        register0.runRegistrationSystem((int) (short) 10);
        register0.registerUser("hi!", "hi!");
        register0.registerUser("hi!", "");
        register0.registerUser("", "hi!");
        register0.runRegistrationSystem(1);
        register0.runRegistrationSystem((int) '#');
    }

    @Test
    public void test2007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest4.test2007");
        Register register0 = new Register();
        register0.runRegistrationSystem((int) (short) 0);
        register0.loginUser("hi!", "hi!");
        register0.loginUser("", "");
        register0.registerUser("hi!", "");
        register0.registerUser("hi!", "");
        register0.loginUser("", "");
        register0.runRegistrationSystem((int) (short) 0);
        java.lang.Class<?> wildcardClass20 = register0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test2008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest4.test2008");
        Register register0 = new Register();
        register0.runRegistrationSystem((int) (byte) -1);
        register0.registerUser("hi!", "");
        register0.runRegistrationSystem((int) (short) 1);
        register0.loginUser("", "hi!");
        register0.registerUser("", "");
        register0.runRegistrationSystem((int) (short) 0);
        register0.loginUser("", "");
        register0.registerUser("hi!", "hi!");
        register0.runRegistrationSystem((int) (short) 0);
        register0.runRegistrationSystem((int) (byte) 1);
        register0.registerUser("", "hi!");
        register0.loginUser("", "");
    }

    @Test
    public void test2009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest4.test2009");
        Register register0 = new Register();
        register0.runRegistrationSystem((int) (byte) -1);
        register0.runRegistrationSystem((int) (byte) 10);
        register0.registerUser("", "");
        register0.loginUser("", "");
        register0.runRegistrationSystem((int) (byte) 0);
        register0.runRegistrationSystem((int) (byte) -1);
        register0.registerUser("hi!", "");
        register0.registerUser("hi!", "hi!");
        register0.runRegistrationSystem((int) (short) 1);
        register0.runRegistrationSystem((int) (byte) 10);
    }

    @Test
    public void test2010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest4.test2010");
        Register register0 = new Register();
        register0.runRegistrationSystem((int) (short) 0);
        register0.loginUser("hi!", "hi!");
        register0.loginUser("", "");
        register0.registerUser("hi!", "");
        register0.registerUser("hi!", "hi!");
        register0.runRegistrationSystem((int) (byte) 1);
        register0.runRegistrationSystem((int) 'a');
        register0.registerUser("hi!", "");
        register0.runRegistrationSystem(10);
        register0.registerUser("hi!", "");
        register0.loginUser("", "hi!");
    }

    @Test
    public void test2011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest4.test2011");
        Register register0 = new Register();
        register0.registerUser("hi!", "");
        register0.registerUser("hi!", "");
        register0.loginUser("hi!", "");
        register0.loginUser("hi!", "");
        register0.runRegistrationSystem(10);
        register0.registerUser("", "");
        register0.registerUser("hi!", "hi!");
        register0.loginUser("hi!", "hi!");
        register0.runRegistrationSystem((int) '#');
        register0.registerUser("hi!", "");
        register0.registerUser("", "hi!");
        register0.runRegistrationSystem((int) (short) 100);
        register0.registerUser("", "hi!");
    }

    @Test
    public void test2012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest4.test2012");
        Register register0 = new Register();
        register0.runRegistrationSystem((int) (short) 0);
        register0.loginUser("hi!", "hi!");
        register0.registerUser("", "");
        register0.runRegistrationSystem((int) '#');
        register0.runRegistrationSystem((int) '#');
        register0.loginUser("hi!", "");
        register0.registerUser("hi!", "");
    }

    @Test
    public void test2013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest4.test2013");
        Register register0 = new Register();
        register0.runRegistrationSystem((int) (byte) -1);
        register0.runRegistrationSystem((int) (byte) 10);
        register0.loginUser("", "hi!");
        register0.registerUser("hi!", "");
        register0.loginUser("", "hi!");
        register0.loginUser("hi!", "");
    }

    @Test
    public void test2014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest4.test2014");
        Register register0 = new Register();
        register0.registerUser("hi!", "");
        register0.loginUser("", "hi!");
        register0.runRegistrationSystem((int) (byte) -1);
        register0.loginUser("", "");
        register0.runRegistrationSystem((int) (short) 100);
        register0.registerUser("", "hi!");
        register0.loginUser("hi!", "hi!");
        register0.runRegistrationSystem((int) (byte) 100);
        register0.loginUser("", "hi!");
        register0.runRegistrationSystem(1);
    }

    @Test
    public void test2015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest4.test2015");
        Register register0 = new Register();
        register0.runRegistrationSystem((int) (byte) -1);
        register0.registerUser("hi!", "");
        register0.loginUser("hi!", "hi!");
        register0.loginUser("hi!", "");
        register0.loginUser("hi!", "");
        register0.loginUser("hi!", "hi!");
        register0.registerUser("hi!", "");
        register0.registerUser("hi!", "");
        register0.runRegistrationSystem((int) (byte) 10);
        register0.registerUser("hi!", "hi!");
    }

    @Test
    public void test2016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest4.test2016");
        Register register0 = new Register();
        register0.loginUser("hi!", "hi!");
        register0.registerUser("hi!", "");
        register0.registerUser("", "");
        register0.runRegistrationSystem((int) (byte) 100);
        register0.registerUser("hi!", "");
        register0.runRegistrationSystem(1);
        register0.runRegistrationSystem(0);
        register0.runRegistrationSystem((int) '4');
        register0.runRegistrationSystem((int) (short) 1);
        register0.loginUser("", "hi!");
        register0.loginUser("", "");
        register0.loginUser("", "");
        register0.loginUser("hi!", "hi!");
        register0.registerUser("hi!", "");
    }

    @Test
    public void test2017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest4.test2017");
        Register register0 = new Register();
        register0.registerUser("hi!", "");
        register0.runRegistrationSystem(1);
        register0.registerUser("", "");
        register0.runRegistrationSystem((int) (short) -1);
        register0.loginUser("", "");
        register0.loginUser("hi!", "");
        register0.loginUser("hi!", "hi!");
        register0.registerUser("", "hi!");
        register0.loginUser("hi!", "");
        java.lang.Class<?> wildcardClass26 = register0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass26);
    }

    @Test
    public void test2018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest4.test2018");
        Register register0 = new Register();
        register0.runRegistrationSystem((int) '#');
        register0.registerUser("", "hi!");
        register0.runRegistrationSystem((int) (short) 0);
        register0.runRegistrationSystem((int) (byte) 1);
        register0.runRegistrationSystem((int) 'a');
        register0.registerUser("", "");
        register0.registerUser("hi!", "hi!");
        java.lang.Class<?> wildcardClass18 = register0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test2019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest4.test2019");
        Register register0 = new Register();
        register0.loginUser("hi!", "hi!");
        register0.registerUser("hi!", "");
        register0.registerUser("", "");
        register0.registerUser("", "hi!");
        register0.registerUser("", "");
        register0.loginUser("", "hi!");
        register0.registerUser("", "");
        register0.loginUser("", "hi!");
        register0.registerUser("", "");
        register0.registerUser("", "hi!");
    }

    @Test
    public void test2020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest4.test2020");
        Register register0 = new Register();
        register0.runRegistrationSystem((int) '#');
        register0.registerUser("", "hi!");
        register0.runRegistrationSystem((int) (short) 0);
        register0.runRegistrationSystem((int) (byte) 1);
        register0.registerUser("", "");
        register0.runRegistrationSystem((int) (short) 10);
        register0.loginUser("", "hi!");
        register0.registerUser("hi!", "hi!");
        java.lang.Class<?> wildcardClass21 = register0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test2021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest4.test2021");
        Register register0 = new Register();
        register0.runRegistrationSystem((int) '#');
        register0.registerUser("", "hi!");
        register0.runRegistrationSystem((int) (short) 0);
        register0.runRegistrationSystem((int) (byte) 1);
        register0.loginUser("", "hi!");
        register0.registerUser("", "hi!");
        register0.registerUser("", "");
        register0.registerUser("", "");
        register0.runRegistrationSystem((int) (short) 0);
        java.lang.Class<?> wildcardClass24 = register0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test2022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest4.test2022");
        Register register0 = new Register();
        register0.runRegistrationSystem((int) (short) 0);
        register0.loginUser("hi!", "hi!");
        register0.loginUser("", "");
        register0.registerUser("hi!", "");
        register0.registerUser("hi!", "hi!");
        register0.runRegistrationSystem((int) 'a');
        register0.runRegistrationSystem((int) 'a');
        register0.loginUser("", "hi!");
        register0.loginUser("", "");
        java.lang.Class<?> wildcardClass25 = register0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test2023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest4.test2023");
        Register register0 = new Register();
        register0.registerUser("hi!", "");
        register0.runRegistrationSystem(1);
        register0.registerUser("", "hi!");
        register0.loginUser("hi!", "");
        register0.registerUser("hi!", "");
        register0.registerUser("hi!", "");
        register0.runRegistrationSystem(1);
    }

    @Test
    public void test2024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest4.test2024");
        Register register0 = new Register();
        register0.registerUser("hi!", "");
        register0.registerUser("hi!", "");
        register0.loginUser("hi!", "");
        register0.loginUser("hi!", "");
        register0.runRegistrationSystem(10);
        register0.runRegistrationSystem((int) ' ');
        register0.registerUser("", "");
        java.lang.Class<?> wildcardClass20 = register0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test2025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest4.test2025");
        Register register0 = new Register();
        register0.loginUser("hi!", "hi!");
        register0.registerUser("hi!", "");
        register0.registerUser("hi!", "");
        register0.registerUser("", "hi!");
        register0.loginUser("", "");
        register0.runRegistrationSystem((int) (byte) 100);
        register0.runRegistrationSystem((int) 'a');
        register0.registerUser("hi!", "");
        register0.registerUser("", "");
        register0.registerUser("", "");
        register0.registerUser("hi!", "");
        register0.registerUser("hi!", "hi!");
    }

    @Test
    public void test2026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest4.test2026");
        Register register0 = new Register();
        register0.loginUser("hi!", "hi!");
        register0.registerUser("hi!", "");
        register0.registerUser("hi!", "");
        register0.registerUser("", "");
        register0.runRegistrationSystem(100);
        register0.runRegistrationSystem((int) (byte) -1);
        register0.registerUser("hi!", "hi!");
        register0.runRegistrationSystem(100);
        register0.loginUser("", "hi!");
        register0.registerUser("", "hi!");
    }

    @Test
    public void test2027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest4.test2027");
        Register register0 = new Register();
        register0.runRegistrationSystem((int) (byte) -1);
        register0.runRegistrationSystem((int) (short) 10);
        register0.runRegistrationSystem(10);
        register0.loginUser("", "");
        register0.runRegistrationSystem(10);
        register0.runRegistrationSystem((int) (byte) 0);
        register0.registerUser("hi!", "");
    }

    @Test
    public void test2028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest4.test2028");
        Register register0 = new Register();
        register0.loginUser("hi!", "hi!");
        register0.registerUser("hi!", "");
        register0.registerUser("hi!", "");
        java.lang.Class<?> wildcardClass10 = register0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test2029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest4.test2029");
        Register register0 = new Register();
        register0.runRegistrationSystem((int) (short) 0);
        register0.loginUser("hi!", "hi!");
        register0.loginUser("hi!", "");
        register0.loginUser("", "hi!");
        register0.registerUser("hi!", "hi!");
        register0.loginUser("hi!", "hi!");
        register0.registerUser("", "hi!");
        register0.registerUser("hi!", "");
    }

    @Test
    public void test2030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest4.test2030");
        Register register0 = new Register();
        register0.loginUser("hi!", "hi!");
        register0.registerUser("hi!", "");
        register0.registerUser("hi!", "");
        register0.registerUser("", "hi!");
        register0.loginUser("", "");
        register0.runRegistrationSystem((int) (short) -1);
        register0.registerUser("hi!", "");
        register0.runRegistrationSystem((int) (byte) 10);
        register0.registerUser("hi!", "hi!");
        register0.runRegistrationSystem((int) 'a');
        register0.runRegistrationSystem((int) (byte) 100);
        register0.registerUser("", "hi!");
    }

    @Test
    public void test2031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest4.test2031");
        Register register0 = new Register();
        register0.runRegistrationSystem((int) (short) 0);
        register0.loginUser("hi!", "hi!");
        register0.registerUser("", "");
        register0.runRegistrationSystem((int) '#');
        register0.registerUser("", "hi!");
        register0.loginUser("", "");
        register0.registerUser("hi!", "hi!");
        register0.loginUser("", "");
        register0.runRegistrationSystem((int) (short) 1);
        register0.registerUser("", "hi!");
    }

    @Test
    public void test2032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest4.test2032");
        Register register0 = new Register();
        register0.runRegistrationSystem((int) '#');
        register0.registerUser("", "hi!");
        register0.runRegistrationSystem((int) (short) 0);
        register0.runRegistrationSystem((int) (byte) 1);
        register0.runRegistrationSystem((int) 'a');
        register0.registerUser("hi!", "hi!");
        register0.registerUser("", "");
        register0.loginUser("", "hi!");
        java.lang.Class<?> wildcardClass21 = register0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test2033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest4.test2033");
        Register register0 = new Register();
        register0.registerUser("hi!", "");
        register0.registerUser("hi!", "");
        register0.runRegistrationSystem((int) (byte) 0);
        register0.registerUser("", "");
        register0.runRegistrationSystem((int) (byte) 10);
        register0.registerUser("", "hi!");
        register0.registerUser("hi!", "");
        register0.loginUser("hi!", "hi!");
    }

    @Test
    public void test2034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest4.test2034");
        Register register0 = new Register();
        register0.loginUser("hi!", "hi!");
        register0.runRegistrationSystem(0);
        register0.loginUser("hi!", "");
        register0.runRegistrationSystem((int) (byte) 100);
        register0.runRegistrationSystem(0);
    }

    @Test
    public void test2035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest4.test2035");
        Register register0 = new Register();
        register0.runRegistrationSystem((int) (byte) -1);
        register0.registerUser("hi!", "");
        register0.runRegistrationSystem((int) (short) 1);
        register0.runRegistrationSystem(10);
        register0.runRegistrationSystem(10);
        register0.registerUser("hi!", "");
    }

    @Test
    public void test2036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest4.test2036");
        Register register0 = new Register();
        register0.loginUser("hi!", "hi!");
        register0.registerUser("hi!", "");
        register0.registerUser("", "");
        register0.registerUser("hi!", "");
        register0.registerUser("hi!", "");
        register0.registerUser("", "");
        register0.runRegistrationSystem((int) '#');
        register0.loginUser("", "");
        register0.registerUser("hi!", "");
    }

    @Test
    public void test2037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest4.test2037");
        Register register0 = new Register();
        register0.runRegistrationSystem((int) '#');
        register0.registerUser("", "hi!");
        register0.runRegistrationSystem((int) (short) 0);
        register0.runRegistrationSystem((int) (byte) 1);
        register0.registerUser("", "");
        register0.runRegistrationSystem((int) (short) 10);
        register0.loginUser("hi!", "");
        register0.registerUser("hi!", "hi!");
        register0.registerUser("hi!", "hi!");
        register0.runRegistrationSystem((-1));
        register0.runRegistrationSystem(0);
        java.lang.Class<?> wildcardClass28 = register0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test2038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest4.test2038");
        Register register0 = new Register();
        register0.loginUser("hi!", "hi!");
        register0.registerUser("hi!", "");
        register0.registerUser("hi!", "");
        register0.registerUser("", "hi!");
        register0.runRegistrationSystem((int) (byte) 100);
        java.lang.Class<?> wildcardClass15 = register0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test2039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest4.test2039");
        Register register0 = new Register();
        register0.runRegistrationSystem((int) (short) 0);
        register0.loginUser("hi!", "hi!");
        register0.loginUser("", "");
        register0.registerUser("hi!", "");
        register0.registerUser("hi!", "hi!");
        register0.runRegistrationSystem((int) (byte) 1);
        register0.runRegistrationSystem((int) (byte) 0);
        register0.registerUser("hi!", "");
        register0.registerUser("hi!", "hi!");
        register0.loginUser("", "hi!");
        java.lang.Class<?> wildcardClass28 = register0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test2040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest4.test2040");
        Register register0 = new Register();
        register0.runRegistrationSystem((int) (byte) -1);
        register0.runRegistrationSystem((int) (byte) 10);
        register0.registerUser("", "");
        register0.runRegistrationSystem((int) (byte) -1);
        register0.runRegistrationSystem((int) '#');
        register0.registerUser("", "hi!");
        java.lang.Class<?> wildcardClass15 = register0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test2041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest4.test2041");
        Register register0 = new Register();
        register0.registerUser("hi!", "");
        register0.loginUser("", "hi!");
        register0.runRegistrationSystem((int) 'a');
        register0.loginUser("", "hi!");
        register0.loginUser("", "hi!");
        register0.registerUser("", "");
        register0.registerUser("hi!", "");
        register0.runRegistrationSystem((int) ' ');
        register0.loginUser("", "hi!");
        register0.registerUser("", "");
    }

    @Test
    public void test2042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest4.test2042");
        Register register0 = new Register();
        register0.registerUser("hi!", "");
        register0.loginUser("", "hi!");
        register0.runRegistrationSystem((int) (byte) -1);
        register0.loginUser("", "");
        register0.runRegistrationSystem((-1));
        register0.loginUser("", "");
        register0.loginUser("", "");
        register0.loginUser("hi!", "hi!");
        register0.loginUser("hi!", "");
    }

    @Test
    public void test2043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest4.test2043");
        Register register0 = new Register();
        register0.registerUser("hi!", "");
        register0.registerUser("hi!", "");
        register0.loginUser("hi!", "");
        register0.loginUser("hi!", "");
        register0.runRegistrationSystem(10);
        register0.registerUser("", "");
        register0.loginUser("hi!", "");
        register0.loginUser("", "");
        register0.loginUser("", "hi!");
        register0.runRegistrationSystem((int) (short) 1);
    }

    @Test
    public void test2044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest4.test2044");
        Register register0 = new Register();
        register0.loginUser("hi!", "hi!");
        register0.registerUser("hi!", "hi!");
        register0.loginUser("", "");
        register0.loginUser("hi!", "");
        register0.runRegistrationSystem((int) (short) 10);
        register0.loginUser("", "");
        register0.runRegistrationSystem((int) (byte) 100);
        java.lang.Class<?> wildcardClass20 = register0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test2045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest4.test2045");
        Register register0 = new Register();
        register0.runRegistrationSystem((int) '#');
        register0.loginUser("hi!", "hi!");
        register0.runRegistrationSystem((int) (byte) 10);
        register0.registerUser("hi!", "hi!");
        register0.runRegistrationSystem((int) (byte) 100);
        register0.registerUser("hi!", "");
        register0.loginUser("hi!", "");
        register0.runRegistrationSystem((int) '#');
        java.lang.Class<?> wildcardClass21 = register0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test2046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest4.test2046");
        Register register0 = new Register();
        register0.loginUser("hi!", "hi!");
        register0.registerUser("hi!", "");
        register0.registerUser("", "");
        register0.registerUser("", "hi!");
        register0.loginUser("", "hi!");
        register0.registerUser("hi!", "hi!");
        register0.loginUser("", "");
        register0.registerUser("hi!", "hi!");
    }

    @Test
    public void test2047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest4.test2047");
        Register register0 = new Register();
        register0.loginUser("", "hi!");
        register0.loginUser("", "hi!");
        register0.loginUser("hi!", "hi!");
        register0.registerUser("", "");
        register0.runRegistrationSystem((int) (short) 100);
        register0.loginUser("hi!", "");
        register0.loginUser("", "hi!");
        java.lang.Class<?> wildcardClass21 = register0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test2048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest4.test2048");
        Register register0 = new Register();
        register0.runRegistrationSystem((int) (byte) -1);
        register0.registerUser("hi!", "");
        register0.loginUser("hi!", "hi!");
        register0.loginUser("hi!", "");
        register0.loginUser("hi!", "");
        register0.runRegistrationSystem((int) (byte) 0);
        register0.registerUser("", "hi!");
    }

    @Test
    public void test2049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest4.test2049");
        Register register0 = new Register();
        register0.registerUser("hi!", "");
        register0.runRegistrationSystem(1);
        register0.registerUser("", "hi!");
        register0.runRegistrationSystem(100);
        register0.runRegistrationSystem((int) 'a');
        register0.loginUser("hi!", "hi!");
        register0.runRegistrationSystem((int) (short) 100);
    }

    @Test
    public void test2050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest4.test2050");
        Register register0 = new Register();
        register0.registerUser("hi!", "");
        register0.loginUser("", "hi!");
        register0.runRegistrationSystem(0);
        register0.registerUser("hi!", "hi!");
        register0.loginUser("", "hi!");
        register0.registerUser("", "");
        register0.runRegistrationSystem((int) (short) -1);
        register0.registerUser("hi!", "");
        java.lang.Class<?> wildcardClass23 = register0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test2051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest4.test2051");
        Register register0 = new Register();
        register0.loginUser("hi!", "hi!");
        register0.registerUser("hi!", "");
        register0.loginUser("hi!", "hi!");
        register0.runRegistrationSystem(100);
        register0.registerUser("hi!", "");
        register0.runRegistrationSystem((int) (short) -1);
        register0.runRegistrationSystem((int) (byte) 100);
        register0.registerUser("hi!", "");
        register0.loginUser("", "hi!");
    }

    @Test
    public void test2052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest4.test2052");
        Register register0 = new Register();
        register0.registerUser("hi!", "");
        register0.registerUser("hi!", "");
        register0.registerUser("hi!", "");
        register0.runRegistrationSystem((int) (byte) 0);
        register0.loginUser("hi!", "");
    }

    @Test
    public void test2053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest4.test2053");
        Register register0 = new Register();
        register0.runRegistrationSystem((int) (byte) -1);
        register0.runRegistrationSystem((int) (byte) 10);
        register0.registerUser("", "");
        register0.registerUser("", "hi!");
        register0.loginUser("hi!", "");
        register0.loginUser("", "");
    }

    @Test
    public void test2054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest4.test2054");
        Register register0 = new Register();
        register0.registerUser("hi!", "");
        register0.loginUser("", "hi!");
        register0.runRegistrationSystem((int) 'a');
        register0.loginUser("", "hi!");
        register0.loginUser("", "hi!");
        register0.loginUser("", "hi!");
        register0.runRegistrationSystem((int) (byte) 100);
    }

    @Test
    public void test2055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest4.test2055");
        Register register0 = new Register();
        register0.registerUser("hi!", "");
        register0.loginUser("", "hi!");
        register0.loginUser("", "hi!");
        register0.runRegistrationSystem(10);
        register0.registerUser("", "");
        register0.runRegistrationSystem((int) (short) 0);
        register0.registerUser("", "hi!");
    }

    @Test
    public void test2056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest4.test2056");
        Register register0 = new Register();
        register0.runRegistrationSystem((int) (byte) -1);
        register0.registerUser("hi!", "");
        register0.loginUser("hi!", "hi!");
        register0.loginUser("hi!", "hi!");
        register0.runRegistrationSystem((int) (short) 1);
        register0.registerUser("hi!", "hi!");
        register0.registerUser("", "");
        register0.runRegistrationSystem((int) (byte) 10);
        java.lang.Class<?> wildcardClass22 = register0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test2057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest4.test2057");
        Register register0 = new Register();
        register0.loginUser("hi!", "hi!");
        register0.registerUser("hi!", "");
        register0.registerUser("", "");
        register0.registerUser("hi!", "");
        register0.registerUser("hi!", "");
        register0.registerUser("", "");
        register0.runRegistrationSystem(0);
        register0.loginUser("", "");
        register0.loginUser("", "hi!");
        register0.runRegistrationSystem((int) '4');
        register0.registerUser("hi!", "hi!");
        register0.loginUser("hi!", "");
        register0.registerUser("", "hi!");
        register0.registerUser("", "");
    }

    @Test
    public void test2058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest4.test2058");
        Register register0 = new Register();
        register0.runRegistrationSystem((int) '#');
        register0.loginUser("hi!", "hi!");
        register0.runRegistrationSystem((int) (byte) 10);
        register0.registerUser("hi!", "");
        register0.registerUser("hi!", "hi!");
        register0.runRegistrationSystem(10);
        register0.registerUser("hi!", "hi!");
    }

    @Test
    public void test2059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest4.test2059");
        Register register0 = new Register();
        register0.runRegistrationSystem((int) (byte) -1);
        register0.registerUser("hi!", "");
        register0.loginUser("hi!", "hi!");
        register0.loginUser("hi!", "");
        register0.loginUser("", "");
        register0.runRegistrationSystem(1);
        register0.registerUser("hi!", "hi!");
        register0.loginUser("", "hi!");
        register0.loginUser("hi!", "");
        register0.runRegistrationSystem((int) (short) -1);
        register0.registerUser("", "");
        register0.runRegistrationSystem((int) 'a');
        register0.loginUser("hi!", "");
        register0.loginUser("hi!", "");
    }

    @Test
    public void test2060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest4.test2060");
        Register register0 = new Register();
        register0.registerUser("hi!", "");
        register0.loginUser("", "");
        register0.runRegistrationSystem((int) 'a');
        register0.registerUser("", "");
        register0.loginUser("", "hi!");
        java.lang.Class<?> wildcardClass15 = register0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test2061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest4.test2061");
        Register register0 = new Register();
        register0.runRegistrationSystem((int) (byte) -1);
        register0.runRegistrationSystem((int) (short) 10);
        register0.runRegistrationSystem((int) (byte) -1);
        register0.runRegistrationSystem(10);
        register0.registerUser("", "");
        register0.registerUser("", "hi!");
        register0.loginUser("hi!", "hi!");
    }

    @Test
    public void test2062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest4.test2062");
        Register register0 = new Register();
        register0.registerUser("hi!", "");
        register0.loginUser("", "hi!");
        register0.runRegistrationSystem((int) 'a');
        register0.loginUser("", "hi!");
        register0.loginUser("", "hi!");
        register0.loginUser("", "hi!");
        register0.registerUser("", "hi!");
        register0.runRegistrationSystem((int) '4');
        register0.registerUser("", "hi!");
        register0.loginUser("hi!", "hi!");
        register0.loginUser("", "");
    }

    @Test
    public void test2063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest4.test2063");
        Register register0 = new Register();
        register0.runRegistrationSystem((int) (short) 0);
        register0.loginUser("hi!", "hi!");
        register0.registerUser("", "");
        register0.runRegistrationSystem((int) '#');
        register0.registerUser("", "hi!");
        register0.registerUser("", "hi!");
        register0.registerUser("hi!", "hi!");
        register0.registerUser("hi!", "hi!");
        register0.loginUser("hi!", "hi!");
        java.lang.Class<?> wildcardClass26 = register0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass26);
    }

    @Test
    public void test2064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest4.test2064");
        Register register0 = new Register();
        register0.loginUser("hi!", "hi!");
        register0.runRegistrationSystem(0);
        register0.registerUser("", "");
        register0.runRegistrationSystem((-1));
        register0.runRegistrationSystem((int) (short) 10);
        register0.registerUser("hi!", "hi!");
        register0.registerUser("hi!", "");
    }

    @Test
    public void test2065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest4.test2065");
        Register register0 = new Register();
        register0.loginUser("hi!", "hi!");
        register0.registerUser("", "");
        register0.loginUser("hi!", "hi!");
        java.lang.Class<?> wildcardClass10 = register0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test2066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest4.test2066");
        Register register0 = new Register();
        register0.runRegistrationSystem((int) (byte) -1);
        register0.runRegistrationSystem((int) (byte) 10);
        register0.registerUser("", "");
        register0.registerUser("", "hi!");
        register0.runRegistrationSystem((int) '4');
        register0.loginUser("hi!", "");
        register0.loginUser("hi!", "hi!");
        register0.loginUser("", "hi!");
        java.lang.Class<?> wildcardClass22 = register0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test2067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest4.test2067");
        Register register0 = new Register();
        register0.runRegistrationSystem((int) (byte) -1);
        register0.runRegistrationSystem((int) (byte) 10);
        register0.registerUser("", "");
        register0.loginUser("", "");
        register0.registerUser("", "hi!");
        register0.registerUser("", "hi!");
        register0.loginUser("hi!", "");
        register0.registerUser("hi!", "");
        register0.loginUser("", "");
        register0.registerUser("", "hi!");
    }

    @Test
    public void test2068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest4.test2068");
        Register register0 = new Register();
        register0.registerUser("hi!", "");
        register0.loginUser("", "hi!");
        register0.loginUser("", "hi!");
        register0.runRegistrationSystem(10);
        register0.runRegistrationSystem((-1));
        register0.runRegistrationSystem((int) (short) 1);
        register0.registerUser("hi!", "hi!");
        register0.registerUser("hi!", "hi!");
        register0.loginUser("", "hi!");
    }

    @Test
    public void test2069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest4.test2069");
        Register register0 = new Register();
        register0.registerUser("hi!", "");
        register0.loginUser("", "hi!");
        register0.runRegistrationSystem((int) 'a');
        register0.loginUser("hi!", "");
        register0.runRegistrationSystem((int) (byte) 1);
        register0.loginUser("hi!", "hi!");
        register0.loginUser("", "");
        register0.loginUser("", "hi!");
        register0.runRegistrationSystem((int) (short) -1);
        java.lang.Class<?> wildcardClass25 = register0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test2070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest4.test2070");
        Register register0 = new Register();
        register0.loginUser("hi!", "hi!");
        register0.runRegistrationSystem(0);
        register0.registerUser("", "");
        register0.runRegistrationSystem((-1));
        register0.runRegistrationSystem((int) (short) 10);
        register0.registerUser("hi!", "hi!");
        register0.runRegistrationSystem((int) (byte) 100);
        register0.registerUser("hi!", "hi!");
        register0.registerUser("hi!", "hi!");
    }

    @Test
    public void test2071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest4.test2071");
        Register register0 = new Register();
        register0.runRegistrationSystem((int) (short) 0);
        register0.loginUser("hi!", "hi!");
        register0.registerUser("", "");
        register0.runRegistrationSystem((-1));
        register0.runRegistrationSystem((int) (short) 0);
        register0.runRegistrationSystem((int) ' ');
        register0.loginUser("", "");
        register0.loginUser("", "hi!");
        register0.runRegistrationSystem(0);
        register0.registerUser("hi!", "hi!");
    }

    @Test
    public void test2072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest4.test2072");
        Register register0 = new Register();
        register0.runRegistrationSystem((int) (short) 0);
        register0.loginUser("hi!", "hi!");
        register0.registerUser("", "");
        register0.runRegistrationSystem((int) '#');
        register0.runRegistrationSystem((int) (byte) 0);
        register0.runRegistrationSystem(0);
        register0.registerUser("", "");
        register0.registerUser("hi!", "hi!");
        register0.runRegistrationSystem(0);
        register0.loginUser("", "");
    }

    @Test
    public void test2073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest4.test2073");
        Register register0 = new Register();
        register0.runRegistrationSystem((int) '#');
        register0.registerUser("", "hi!");
        register0.runRegistrationSystem((int) (short) 0);
        register0.runRegistrationSystem((int) (byte) 1);
        register0.loginUser("", "hi!");
        register0.registerUser("", "hi!");
        register0.registerUser("", "");
        register0.runRegistrationSystem((-1));
        register0.registerUser("", "");
    }

    @Test
    public void test2074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest4.test2074");
        Register register0 = new Register();
        register0.registerUser("hi!", "");
        register0.loginUser("", "hi!");
        register0.runRegistrationSystem((int) (byte) -1);
        register0.runRegistrationSystem(1);
        register0.loginUser("hi!", "");
        register0.runRegistrationSystem((int) (short) 100);
    }

    @Test
    public void test2075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest4.test2075");
        Register register0 = new Register();
        register0.loginUser("hi!", "hi!");
        register0.registerUser("hi!", "");
        register0.registerUser("", "");
        register0.registerUser("hi!", "");
        register0.registerUser("hi!", "");
        register0.runRegistrationSystem((int) 'a');
        register0.runRegistrationSystem((int) (short) 100);
        register0.registerUser("hi!", "");
        java.lang.Class<?> wildcardClass23 = register0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test2076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest4.test2076");
        Register register0 = new Register();
        register0.runRegistrationSystem((int) '#');
        register0.registerUser("", "hi!");
        register0.loginUser("hi!", "hi!");
        register0.runRegistrationSystem((int) (short) 10);
        register0.registerUser("hi!", "");
        register0.loginUser("", "");
        java.lang.Class<?> wildcardClass17 = register0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test2077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest4.test2077");
        Register register0 = new Register();
        register0.registerUser("hi!", "");
        register0.registerUser("hi!", "");
        register0.runRegistrationSystem((int) (byte) 0);
        register0.registerUser("", "");
        register0.runRegistrationSystem((int) (byte) 10);
        register0.runRegistrationSystem((int) (byte) 1);
        register0.registerUser("", "hi!");
        register0.runRegistrationSystem((int) (short) 1);
        register0.registerUser("hi!", "");
    }

    @Test
    public void test2078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest4.test2078");
        Register register0 = new Register();
        register0.runRegistrationSystem((int) (byte) -1);
        register0.registerUser("hi!", "");
        register0.loginUser("hi!", "hi!");
        register0.loginUser("hi!", "");
        register0.registerUser("hi!", "");
        register0.registerUser("hi!", "hi!");
        register0.runRegistrationSystem((int) (short) 10);
        register0.loginUser("", "");
        register0.loginUser("hi!", "");
        register0.runRegistrationSystem((int) (short) 0);
        java.lang.Class<?> wildcardClass28 = register0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test2079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest4.test2079");
        Register register0 = new Register();
        register0.loginUser("hi!", "hi!");
        register0.registerUser("hi!", "");
        register0.registerUser("", "");
        register0.runRegistrationSystem((int) (byte) 100);
        register0.registerUser("hi!", "");
        register0.runRegistrationSystem(1);
        register0.runRegistrationSystem(0);
        register0.runRegistrationSystem((int) '4');
        register0.runRegistrationSystem((int) (short) 1);
        register0.loginUser("", "hi!");
        register0.loginUser("", "");
        register0.loginUser("", "");
        register0.runRegistrationSystem((int) (short) 10);
    }

    @Test
    public void test2080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest4.test2080");
        Register register0 = new Register();
        register0.loginUser("hi!", "hi!");
        register0.registerUser("hi!", "");
        register0.loginUser("hi!", "hi!");
        register0.registerUser("", "");
        register0.runRegistrationSystem(0);
        register0.registerUser("", "");
        register0.runRegistrationSystem(0);
        register0.runRegistrationSystem(0);
    }

    @Test
    public void test2081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest4.test2081");
        Register register0 = new Register();
        register0.loginUser("hi!", "hi!");
        register0.registerUser("hi!", "");
        register0.registerUser("", "");
        register0.registerUser("", "hi!");
        register0.runRegistrationSystem((int) (short) 100);
        register0.loginUser("hi!", "hi!");
        register0.loginUser("hi!", "hi!");
        register0.loginUser("hi!", "");
        register0.loginUser("", "hi!");
    }

    @Test
    public void test2082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest4.test2082");
        Register register0 = new Register();
        register0.runRegistrationSystem((int) (byte) -1);
        register0.runRegistrationSystem((int) (byte) 10);
        register0.registerUser("", "");
        register0.loginUser("", "");
        register0.registerUser("", "hi!");
        register0.registerUser("hi!", "");
        register0.runRegistrationSystem((int) (short) 100);
        register0.loginUser("hi!", "");
        register0.loginUser("hi!", "");
        register0.loginUser("", "");
        java.lang.Class<?> wildcardClass28 = register0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test2083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest4.test2083");
        Register register0 = new Register();
        register0.registerUser("hi!", "");
        register0.registerUser("hi!", "");
        register0.loginUser("hi!", "");
        register0.loginUser("", "hi!");
        register0.loginUser("", "");
        register0.registerUser("", "");
        register0.runRegistrationSystem(1);
    }

    @Test
    public void test2084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest4.test2084");
        Register register0 = new Register();
        register0.runRegistrationSystem((int) (short) 0);
        register0.loginUser("hi!", "hi!");
        register0.registerUser("", "");
        register0.runRegistrationSystem((-1));
        register0.runRegistrationSystem((int) (short) 0);
        register0.registerUser("", "");
        register0.registerUser("", "");
        register0.loginUser("hi!", "hi!");
        register0.loginUser("hi!", "");
        register0.loginUser("hi!", "");
        register0.loginUser("hi!", "");
    }

    @Test
    public void test2085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest4.test2085");
        Register register0 = new Register();
        register0.loginUser("hi!", "hi!");
        register0.registerUser("hi!", "");
        register0.registerUser("hi!", "");
        register0.registerUser("", "hi!");
        register0.loginUser("hi!", "");
        register0.registerUser("", "");
        register0.loginUser("", "");
        register0.runRegistrationSystem((int) 'a');
        java.lang.Class<?> wildcardClass24 = register0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test2086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest4.test2086");
        Register register0 = new Register();
        register0.loginUser("hi!", "hi!");
        register0.registerUser("hi!", "");
        register0.registerUser("hi!", "");
        register0.registerUser("", "hi!");
        register0.loginUser("", "");
        register0.runRegistrationSystem((int) (short) -1);
        register0.runRegistrationSystem((int) '#');
        register0.registerUser("hi!", "");
        register0.registerUser("", "hi!");
        register0.loginUser("", "");
    }

    @Test
    public void test2087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest4.test2087");
        Register register0 = new Register();
        register0.loginUser("hi!", "hi!");
        register0.runRegistrationSystem(0);
        register0.loginUser("hi!", "");
        register0.runRegistrationSystem((int) (byte) 100);
        register0.registerUser("hi!", "hi!");
        register0.runRegistrationSystem((int) (short) 0);
    }

    @Test
    public void test2088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest4.test2088");
        Register register0 = new Register();
        register0.registerUser("hi!", "");
        register0.loginUser("", "hi!");
        register0.runRegistrationSystem((int) 'a');
        register0.loginUser("", "hi!");
        register0.loginUser("hi!", "");
        register0.loginUser("hi!", "hi!");
        register0.runRegistrationSystem(0);
        register0.loginUser("", "");
        register0.runRegistrationSystem((int) '4');
        register0.registerUser("hi!", "");
        register0.registerUser("", "hi!");
        register0.loginUser("hi!", "hi!");
    }

    @Test
    public void test2089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest4.test2089");
        Register register0 = new Register();
        register0.loginUser("hi!", "hi!");
        register0.registerUser("hi!", "");
        register0.registerUser("", "");
        register0.registerUser("", "hi!");
        register0.runRegistrationSystem((int) (short) 100);
        register0.loginUser("hi!", "hi!");
        register0.loginUser("", "");
        register0.runRegistrationSystem((int) ' ');
    }

    @Test
    public void test2090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest4.test2090");
        Register register0 = new Register();
        register0.loginUser("hi!", "hi!");
        register0.runRegistrationSystem(0);
        register0.runRegistrationSystem(10);
        register0.loginUser("", "");
        register0.runRegistrationSystem((int) (short) 1);
        register0.registerUser("", "hi!");
    }

    @Test
    public void test2091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest4.test2091");
        Register register0 = new Register();
        register0.runRegistrationSystem((int) (short) 0);
        register0.loginUser("hi!", "hi!");
        register0.registerUser("", "");
        register0.runRegistrationSystem((int) '#');
        register0.runRegistrationSystem((int) (byte) 0);
        register0.registerUser("", "");
        register0.runRegistrationSystem((int) '#');
    }

    @Test
    public void test2092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest4.test2092");
        Register register0 = new Register();
        register0.runRegistrationSystem((int) (byte) -1);
        register0.runRegistrationSystem((int) (byte) 10);
        register0.registerUser("", "");
        register0.runRegistrationSystem((int) (byte) -1);
        register0.loginUser("hi!", "hi!");
        register0.loginUser("hi!", "hi!");
        java.lang.Class<?> wildcardClass16 = register0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test2093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest4.test2093");
        Register register0 = new Register();
        register0.registerUser("hi!", "");
        register0.loginUser("", "hi!");
        register0.runRegistrationSystem((int) 'a');
        register0.loginUser("", "hi!");
        register0.loginUser("", "hi!");
        register0.registerUser("", "");
        register0.registerUser("hi!", "");
        register0.runRegistrationSystem((int) ' ');
        register0.loginUser("", "hi!");
        java.lang.Class<?> wildcardClass26 = register0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass26);
    }

    @Test
    public void test2094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest4.test2094");
        Register register0 = new Register();
        register0.runRegistrationSystem((int) (byte) -1);
        register0.loginUser("", "hi!");
        register0.runRegistrationSystem((int) 'a');
        register0.loginUser("", "hi!");
    }

    @Test
    public void test2095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest4.test2095");
        Register register0 = new Register();
        register0.runRegistrationSystem((int) '#');
        register0.registerUser("", "hi!");
        register0.loginUser("hi!", "hi!");
        register0.runRegistrationSystem((int) (short) 10);
        register0.runRegistrationSystem((int) (byte) 100);
    }

    @Test
    public void test2096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest4.test2096");
        Register register0 = new Register();
        register0.loginUser("hi!", "hi!");
        register0.registerUser("hi!", "");
        register0.registerUser("", "");
        register0.registerUser("", "");
        register0.runRegistrationSystem((int) (short) 0);
        register0.registerUser("hi!", "");
        register0.loginUser("", "hi!");
        java.lang.Class<?> wildcardClass21 = register0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test2097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest4.test2097");
        Register register0 = new Register();
        register0.loginUser("hi!", "hi!");
        register0.registerUser("hi!", "");
        register0.loginUser("hi!", "hi!");
        register0.runRegistrationSystem(100);
        register0.registerUser("hi!", "");
        register0.registerUser("", "");
        register0.runRegistrationSystem(10);
        register0.loginUser("", "");
        register0.runRegistrationSystem((int) 'a');
    }

    @Test
    public void test2098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest4.test2098");
        Register register0 = new Register();
        register0.loginUser("hi!", "hi!");
        register0.registerUser("hi!", "");
        register0.registerUser("", "");
        register0.registerUser("", "hi!");
        register0.loginUser("", "hi!");
        register0.loginUser("hi!", "hi!");
        register0.runRegistrationSystem(100);
        register0.loginUser("", "");
        java.lang.Class<?> wildcardClass24 = register0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test2099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest4.test2099");
        Register register0 = new Register();
        register0.registerUser("hi!", "");
        register0.loginUser("", "hi!");
        register0.runRegistrationSystem((int) 'a');
        register0.loginUser("", "hi!");
        register0.runRegistrationSystem((int) (byte) -1);
        register0.loginUser("", "hi!");
        register0.registerUser("", "");
        register0.registerUser("hi!", "");
    }

    @Test
    public void test2100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest4.test2100");
        Register register0 = new Register();
        register0.registerUser("hi!", "");
        register0.registerUser("hi!", "");
        register0.runRegistrationSystem((int) (byte) 0);
        register0.registerUser("", "");
        register0.loginUser("", "");
        register0.runRegistrationSystem(100);
        register0.runRegistrationSystem(0);
    }

    @Test
    public void test2101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest4.test2101");
        Register register0 = new Register();
        register0.runRegistrationSystem((int) (byte) -1);
        register0.registerUser("hi!", "");
        register0.loginUser("hi!", "hi!");
        register0.loginUser("hi!", "");
        register0.loginUser("", "");
        register0.runRegistrationSystem(1);
        register0.loginUser("hi!", "hi!");
        register0.loginUser("hi!", "");
        register0.runRegistrationSystem((int) (byte) -1);
        register0.runRegistrationSystem((int) '4');
        register0.runRegistrationSystem((int) (byte) -1);
    }

    @Test
    public void test2102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest4.test2102");
        Register register0 = new Register();
        register0.runRegistrationSystem((int) '#');
        register0.registerUser("", "hi!");
        register0.runRegistrationSystem((int) (short) 0);
        register0.runRegistrationSystem((int) (byte) 1);
        register0.registerUser("", "");
        register0.runRegistrationSystem((int) (short) 10);
        register0.loginUser("", "hi!");
        register0.registerUser("", "");
    }

    @Test
    public void test2103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest4.test2103");
        Register register0 = new Register();
        register0.loginUser("hi!", "hi!");
        register0.runRegistrationSystem(0);
        register0.runRegistrationSystem(10);
        register0.runRegistrationSystem((int) (byte) 100);
        java.lang.Class<?> wildcardClass10 = register0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test2104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest4.test2104");
        Register register0 = new Register();
        register0.loginUser("hi!", "hi!");
        register0.registerUser("hi!", "hi!");
        register0.registerUser("", "hi!");
        register0.registerUser("hi!", "");
        register0.loginUser("hi!", "hi!");
        register0.runRegistrationSystem((int) (byte) -1);
        register0.runRegistrationSystem(100);
    }

    @Test
    public void test2105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest4.test2105");
        Register register0 = new Register();
        register0.loginUser("hi!", "hi!");
        register0.registerUser("hi!", "");
        register0.registerUser("", "");
        register0.registerUser("", "");
        register0.runRegistrationSystem((int) (byte) -1);
        register0.runRegistrationSystem((int) (byte) 100);
        register0.runRegistrationSystem(0);
        register0.registerUser("", "hi!");
    }

    @Test
    public void test2106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest4.test2106");
        Register register0 = new Register();
        register0.runRegistrationSystem((int) (short) 0);
        register0.loginUser("hi!", "hi!");
        register0.registerUser("", "");
        register0.runRegistrationSystem((-1));
        register0.loginUser("", "hi!");
        register0.loginUser("", "");
        register0.runRegistrationSystem((int) ' ');
        register0.runRegistrationSystem((int) (short) 1);
        register0.registerUser("", "");
        register0.registerUser("", "hi!");
        register0.loginUser("", "");
    }

    @Test
    public void test2107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest4.test2107");
        Register register0 = new Register();
        register0.runRegistrationSystem((int) (byte) -1);
        register0.registerUser("hi!", "");
        register0.registerUser("", "hi!");
        register0.runRegistrationSystem((int) (short) 10);
        register0.registerUser("hi!", "hi!");
        register0.loginUser("", "hi!");
    }

    @Test
    public void test2108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest4.test2108");
        Register register0 = new Register();
        register0.runRegistrationSystem((int) (byte) -1);
        register0.registerUser("hi!", "");
        register0.runRegistrationSystem((int) (short) 1);
        register0.loginUser("", "hi!");
        register0.registerUser("", "");
        register0.runRegistrationSystem((int) (short) 0);
        register0.loginUser("", "");
        register0.registerUser("hi!", "hi!");
        register0.registerUser("hi!", "hi!");
        register0.loginUser("hi!", "");
        java.lang.Class<?> wildcardClass28 = register0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test2109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest4.test2109");
        Register register0 = new Register();
        register0.runRegistrationSystem((int) '#');
        register0.loginUser("hi!", "hi!");
        register0.loginUser("hi!", "hi!");
        register0.runRegistrationSystem(10);
        java.lang.Class<?> wildcardClass11 = register0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test2110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest4.test2110");
        Register register0 = new Register();
        register0.runRegistrationSystem((int) (short) 0);
        register0.loginUser("hi!", "hi!");
        register0.registerUser("", "");
        register0.runRegistrationSystem((-1));
        register0.loginUser("", "hi!");
        register0.loginUser("", "");
        register0.runRegistrationSystem((int) ' ');
        register0.runRegistrationSystem((int) (short) 1);
        register0.loginUser("hi!", "hi!");
        register0.runRegistrationSystem((int) (byte) 100);
        register0.runRegistrationSystem((-1));
        register0.loginUser("", "");
        register0.registerUser("", "hi!");
    }

    @Test
    public void test2111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest4.test2111");
        Register register0 = new Register();
        register0.runRegistrationSystem((int) (short) 0);
        register0.loginUser("hi!", "hi!");
        register0.registerUser("", "");
        register0.runRegistrationSystem((int) '#');
        register0.runRegistrationSystem((int) (byte) 0);
        register0.registerUser("", "");
        register0.runRegistrationSystem((int) (byte) 10);
        register0.loginUser("hi!", "");
        register0.loginUser("hi!", "hi!");
    }

    @Test
    public void test2112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest4.test2112");
        Register register0 = new Register();
        register0.loginUser("hi!", "hi!");
        register0.registerUser("hi!", "");
        register0.registerUser("", "");
        register0.registerUser("", "hi!");
        register0.runRegistrationSystem((int) (short) 100);
        register0.loginUser("hi!", "hi!");
        register0.loginUser("hi!", "hi!");
        register0.loginUser("hi!", "");
        register0.registerUser("", "");
    }

    @Test
    public void test2113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest4.test2113");
        Register register0 = new Register();
        register0.runRegistrationSystem((int) (byte) -1);
        register0.registerUser("hi!", "");
        register0.runRegistrationSystem((int) (byte) -1);
        register0.runRegistrationSystem((int) 'a');
        register0.loginUser("", "");
        register0.registerUser("", "");
        java.lang.Class<?> wildcardClass16 = register0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test2114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest4.test2114");
        Register register0 = new Register();
        register0.registerUser("hi!", "");
        register0.loginUser("", "hi!");
        register0.runRegistrationSystem((int) (byte) -1);
        register0.loginUser("", "");
        register0.runRegistrationSystem((int) (short) 100);
        register0.registerUser("", "hi!");
        register0.runRegistrationSystem((int) ' ');
        register0.registerUser("hi!", "");
    }

    @Test
    public void test2115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest4.test2115");
        Register register0 = new Register();
        register0.runRegistrationSystem((int) (byte) -1);
        register0.registerUser("hi!", "");
        register0.runRegistrationSystem(0);
        register0.runRegistrationSystem(1);
        register0.registerUser("", "");
        register0.loginUser("hi!", "");
        register0.loginUser("hi!", "");
    }

    @Test
    public void test2116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest4.test2116");
        Register register0 = new Register();
        register0.registerUser("hi!", "");
        register0.loginUser("", "hi!");
        register0.runRegistrationSystem((int) (byte) -1);
        register0.loginUser("", "");
        register0.loginUser("hi!", "");
        register0.registerUser("hi!", "hi!");
        register0.registerUser("hi!", "hi!");
    }

    @Test
    public void test2117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest4.test2117");
        Register register0 = new Register();
        register0.registerUser("hi!", "");
        register0.registerUser("hi!", "");
        register0.loginUser("hi!", "");
        register0.loginUser("hi!", "");
        register0.runRegistrationSystem(10);
        register0.registerUser("", "");
        register0.registerUser("", "hi!");
        register0.loginUser("hi!", "");
    }

    @Test
    public void test2118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest4.test2118");
        Register register0 = new Register();
        register0.registerUser("hi!", "");
        register0.registerUser("hi!", "");
        register0.loginUser("hi!", "hi!");
        register0.loginUser("hi!", "");
        register0.registerUser("hi!", "hi!");
        register0.loginUser("hi!", "");
        java.lang.Class<?> wildcardClass19 = register0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test2119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest4.test2119");
        Register register0 = new Register();
        register0.runRegistrationSystem((int) (short) 0);
        register0.loginUser("hi!", "hi!");
        register0.loginUser("", "");
        register0.loginUser("hi!", "");
        register0.loginUser("", "hi!");
    }

    @Test
    public void test2120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest4.test2120");
        Register register0 = new Register();
        register0.runRegistrationSystem((int) (byte) -1);
        register0.registerUser("hi!", "");
        register0.loginUser("hi!", "hi!");
        register0.loginUser("hi!", "");
        register0.loginUser("hi!", "");
        register0.loginUser("hi!", "hi!");
        register0.registerUser("hi!", "");
        register0.registerUser("hi!", "");
        java.lang.Class<?> wildcardClass24 = register0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test2121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest4.test2121");
        Register register0 = new Register();
        register0.loginUser("hi!", "hi!");
        register0.registerUser("hi!", "");
        register0.registerUser("hi!", "");
        register0.registerUser("", "");
        register0.runRegistrationSystem(100);
        register0.runRegistrationSystem((int) (byte) -1);
        register0.runRegistrationSystem(1);
        register0.loginUser("", "hi!");
        register0.registerUser("", "hi!");
        register0.registerUser("", "hi!");
        register0.loginUser("", "hi!");
        register0.runRegistrationSystem((int) ' ');
        register0.runRegistrationSystem((int) (byte) 0);
        register0.runRegistrationSystem((int) (byte) 10);
    }

    @Test
    public void test2122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest4.test2122");
        Register register0 = new Register();
        register0.registerUser("hi!", "");
        register0.loginUser("", "hi!");
        register0.runRegistrationSystem((int) (byte) -1);
        register0.runRegistrationSystem(1);
        register0.loginUser("hi!", "");
        register0.runRegistrationSystem(0);
        register0.registerUser("", "hi!");
        register0.runRegistrationSystem((int) (short) 100);
        register0.runRegistrationSystem((int) (short) 1);
        register0.runRegistrationSystem((-1));
        java.lang.Class<?> wildcardClass25 = register0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test2123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest4.test2123");
        Register register0 = new Register();
        register0.registerUser("hi!", "");
        register0.loginUser("", "hi!");
        register0.runRegistrationSystem((int) 'a');
        register0.loginUser("", "hi!");
        register0.runRegistrationSystem((int) (byte) -1);
        register0.loginUser("", "hi!");
        register0.runRegistrationSystem((int) (short) 1);
        register0.registerUser("hi!", "hi!");
    }

    @Test
    public void test2124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest4.test2124");
        Register register0 = new Register();
        register0.registerUser("", "hi!");
        register0.registerUser("", "hi!");
        register0.registerUser("hi!", "");
        register0.runRegistrationSystem((int) '#');
        register0.loginUser("", "");
        register0.registerUser("hi!", "hi!");
    }

    @Test
    public void test2125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest4.test2125");
        Register register0 = new Register();
        register0.registerUser("hi!", "");
        register0.loginUser("", "hi!");
        register0.runRegistrationSystem((int) 'a');
        register0.loginUser("hi!", "");
        register0.runRegistrationSystem((-1));
        register0.registerUser("hi!", "");
        register0.loginUser("", "hi!");
        register0.runRegistrationSystem(100);
        register0.runRegistrationSystem((int) (short) 100);
        register0.runRegistrationSystem(1);
    }

    @Test
    public void test2126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest4.test2126");
        Register register0 = new Register();
        register0.runRegistrationSystem((int) (short) 0);
        register0.loginUser("hi!", "hi!");
        register0.registerUser("", "");
        register0.runRegistrationSystem((int) '#');
        register0.registerUser("", "hi!");
        register0.registerUser("", "hi!");
        register0.registerUser("", "");
        register0.runRegistrationSystem((int) ' ');
        register0.loginUser("hi!", "hi!");
        register0.runRegistrationSystem((int) 'a');
    }

    @Test
    public void test2127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest4.test2127");
        Register register0 = new Register();
        register0.loginUser("hi!", "hi!");
        register0.registerUser("hi!", "");
        register0.registerUser("", "");
        register0.registerUser("", "hi!");
        register0.loginUser("hi!", "");
        register0.runRegistrationSystem((int) 'a');
        register0.runRegistrationSystem(1);
    }

    @Test
    public void test2128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest4.test2128");
        Register register0 = new Register();
        register0.runRegistrationSystem((int) (short) 0);
        register0.loginUser("hi!", "hi!");
        register0.registerUser("", "");
        register0.runRegistrationSystem((-1));
        register0.loginUser("", "hi!");
        register0.loginUser("", "");
        register0.runRegistrationSystem((int) ' ');
        register0.runRegistrationSystem((int) (byte) 0);
    }

    @Test
    public void test2129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest4.test2129");
        Register register0 = new Register();
        register0.registerUser("hi!", "");
        register0.loginUser("", "hi!");
        register0.runRegistrationSystem((int) 'a');
        register0.loginUser("", "hi!");
        register0.runRegistrationSystem((int) (short) 10);
        register0.runRegistrationSystem((int) 'a');
        register0.registerUser("", "hi!");
        java.lang.Class<?> wildcardClass19 = register0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test2130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest4.test2130");
        Register register0 = new Register();
        register0.runRegistrationSystem((int) (short) 0);
        register0.loginUser("hi!", "hi!");
        register0.registerUser("", "");
        register0.runRegistrationSystem((-1));
        register0.runRegistrationSystem((int) (byte) -1);
        register0.runRegistrationSystem((int) (byte) 0);
    }

    @Test
    public void test2131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest4.test2131");
        Register register0 = new Register();
        register0.registerUser("hi!", "");
        register0.loginUser("", "hi!");
        register0.runRegistrationSystem((int) 'a');
        register0.loginUser("", "hi!");
        register0.loginUser("hi!", "");
        register0.loginUser("hi!", "hi!");
        register0.runRegistrationSystem(0);
        register0.loginUser("", "");
        register0.runRegistrationSystem((-1));
        java.lang.Class<?> wildcardClass25 = register0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test2132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest4.test2132");
        Register register0 = new Register();
        register0.registerUser("hi!", "");
        register0.registerUser("hi!", "");
        register0.loginUser("hi!", "");
        register0.loginUser("hi!", "");
        register0.runRegistrationSystem(10);
        register0.registerUser("", "");
        register0.registerUser("", "");
        register0.registerUser("", "hi!");
        register0.loginUser("hi!", "");
        register0.runRegistrationSystem(0);
        register0.runRegistrationSystem((int) (short) 100);
        java.lang.Class<?> wildcardClass31 = register0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test2133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest4.test2133");
        Register register0 = new Register();
        register0.loginUser("hi!", "hi!");
        register0.registerUser("hi!", "");
        register0.registerUser("", "");
        register0.registerUser("", "hi!");
        register0.registerUser("", "");
        register0.registerUser("hi!", "hi!");
        register0.loginUser("", "");
        java.lang.Class<?> wildcardClass22 = register0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test2134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest4.test2134");
        Register register0 = new Register();
        register0.loginUser("hi!", "hi!");
        register0.registerUser("hi!", "");
        register0.registerUser("", "");
        register0.registerUser("hi!", "");
        register0.registerUser("hi!", "");
        register0.registerUser("", "");
        register0.runRegistrationSystem(0);
        register0.loginUser("", "");
        register0.loginUser("", "hi!");
        register0.runRegistrationSystem((int) '4');
        register0.registerUser("hi!", "hi!");
        register0.loginUser("hi!", "");
        register0.registerUser("", "hi!");
        register0.registerUser("hi!", "hi!");
    }

    @Test
    public void test2135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest4.test2135");
        Register register0 = new Register();
        register0.runRegistrationSystem((int) '#');
        register0.registerUser("", "hi!");
        register0.runRegistrationSystem((int) (short) 0);
        register0.runRegistrationSystem((int) (byte) 1);
        register0.registerUser("", "");
        register0.runRegistrationSystem((int) (short) 10);
        register0.loginUser("hi!", "");
        register0.registerUser("hi!", "hi!");
        register0.loginUser("hi!", "");
        java.lang.Class<?> wildcardClass24 = register0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test2136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest4.test2136");
        Register register0 = new Register();
        register0.loginUser("hi!", "hi!");
        register0.loginUser("", "hi!");
        register0.runRegistrationSystem((int) (byte) 0);
        register0.registerUser("hi!", "");
    }

    @Test
    public void test2137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest4.test2137");
        Register register0 = new Register();
        register0.runRegistrationSystem((int) (short) 0);
        register0.loginUser("hi!", "hi!");
        register0.registerUser("", "");
        register0.runRegistrationSystem((-1));
        register0.runRegistrationSystem((int) (short) 0);
        register0.registerUser("", "");
        register0.runRegistrationSystem((int) (short) -1);
        register0.runRegistrationSystem((int) (short) -1);
        register0.registerUser("hi!", "");
        register0.registerUser("", "hi!");
    }

    @Test
    public void test2138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest4.test2138");
        Register register0 = new Register();
        register0.registerUser("hi!", "");
        register0.loginUser("", "hi!");
        register0.runRegistrationSystem((int) 'a');
        register0.loginUser("hi!", "");
        register0.runRegistrationSystem((-1));
        register0.registerUser("hi!", "");
        register0.runRegistrationSystem((int) (byte) 1);
        register0.registerUser("hi!", "");
        register0.loginUser("", "");
    }

    @Test
    public void test2139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest4.test2139");
        Register register0 = new Register();
        register0.runRegistrationSystem((int) '#');
        register0.registerUser("", "hi!");
        register0.registerUser("", "hi!");
        register0.registerUser("", "");
        register0.runRegistrationSystem((int) (byte) 10);
        register0.runRegistrationSystem((int) (short) 100);
        register0.runRegistrationSystem((int) 'a');
    }

    @Test
    public void test2140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest4.test2140");
        Register register0 = new Register();
        register0.loginUser("hi!", "hi!");
        register0.registerUser("hi!", "");
        register0.registerUser("hi!", "");
        register0.registerUser("", "hi!");
        register0.loginUser("hi!", "");
        register0.loginUser("hi!", "hi!");
        register0.loginUser("", "hi!");
        register0.runRegistrationSystem((int) ' ');
        register0.runRegistrationSystem((int) '#');
        register0.runRegistrationSystem((int) (short) 100);
        register0.loginUser("", "hi!");
    }

    @Test
    public void test2141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest4.test2141");
        Register register0 = new Register();
        register0.registerUser("hi!", "");
        register0.loginUser("", "hi!");
        register0.runRegistrationSystem((int) 'a');
        register0.loginUser("", "hi!");
        register0.loginUser("hi!", "");
        register0.loginUser("hi!", "hi!");
        register0.loginUser("hi!", "");
        register0.loginUser("", "");
        register0.runRegistrationSystem((int) '4');
        register0.runRegistrationSystem((int) 'a');
        java.lang.Class<?> wildcardClass28 = register0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test2142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest4.test2142");
        Register register0 = new Register();
        register0.runRegistrationSystem((int) '#');
        register0.loginUser("hi!", "hi!");
        register0.loginUser("", "hi!");
        register0.runRegistrationSystem((-1));
        register0.runRegistrationSystem((int) (short) 100);
        java.lang.Class<?> wildcardClass13 = register0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test2143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest4.test2143");
        Register register0 = new Register();
        register0.loginUser("hi!", "hi!");
        register0.registerUser("hi!", "");
        register0.registerUser("", "");
        register0.registerUser("hi!", "");
        register0.registerUser("hi!", "");
        register0.registerUser("", "");
        register0.runRegistrationSystem(100);
        register0.loginUser("", "");
        register0.registerUser("", "");
        register0.runRegistrationSystem((int) '#');
    }

    @Test
    public void test2144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest4.test2144");
        Register register0 = new Register();
        register0.loginUser("hi!", "hi!");
        register0.registerUser("hi!", "");
        register0.loginUser("hi!", "hi!");
        register0.runRegistrationSystem(100);
        register0.runRegistrationSystem((int) (byte) 1);
        register0.registerUser("", "");
        register0.loginUser("", "hi!");
        register0.runRegistrationSystem((int) (short) 1);
        register0.registerUser("", "hi!");
    }

    @Test
    public void test2145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest4.test2145");
        Register register0 = new Register();
        register0.loginUser("hi!", "hi!");
        register0.loginUser("hi!", "hi!");
        register0.loginUser("", "hi!");
        register0.registerUser("", "");
        register0.registerUser("", "");
        register0.runRegistrationSystem((int) (short) 100);
        register0.loginUser("", "");
        register0.registerUser("", "");
        java.lang.Class<?> wildcardClass24 = register0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test2146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest4.test2146");
        Register register0 = new Register();
        register0.runRegistrationSystem((int) (byte) -1);
        register0.runRegistrationSystem((int) (byte) 10);
        register0.registerUser("", "");
        register0.loginUser("", "");
        register0.registerUser("", "hi!");
        register0.registerUser("", "hi!");
        register0.loginUser("", "");
        java.lang.Class<?> wildcardClass20 = register0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test2147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest4.test2147");
        Register register0 = new Register();
        register0.registerUser("", "");
        register0.registerUser("", "hi!");
        register0.registerUser("", "");
        register0.loginUser("hi!", "");
        register0.registerUser("", "hi!");
        register0.loginUser("", "");
    }

    @Test
    public void test2148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest4.test2148");
        Register register0 = new Register();
        register0.loginUser("hi!", "hi!");
        register0.registerUser("hi!", "");
        register0.registerUser("hi!", "");
        register0.registerUser("", "hi!");
        register0.loginUser("hi!", "");
        register0.registerUser("", "");
        register0.loginUser("", "");
        register0.runRegistrationSystem((int) 'a');
        register0.registerUser("", "");
    }

    @Test
    public void test2149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest4.test2149");
        Register register0 = new Register();
        register0.runRegistrationSystem((int) '#');
        register0.registerUser("", "hi!");
        register0.loginUser("hi!", "hi!");
        register0.runRegistrationSystem((int) (short) 1);
    }

    @Test
    public void test2150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest4.test2150");
        Register register0 = new Register();
        register0.runRegistrationSystem((int) (short) 0);
        register0.loginUser("hi!", "hi!");
        register0.registerUser("", "");
        register0.runRegistrationSystem((-1));
        register0.runRegistrationSystem((int) (short) 10);
        register0.runRegistrationSystem((int) '4');
        register0.registerUser("", "hi!");
        register0.registerUser("", "");
        java.lang.Class<?> wildcardClass21 = register0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test2151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest4.test2151");
        Register register0 = new Register();
        register0.runRegistrationSystem((int) (byte) -1);
        register0.registerUser("hi!", "");
        register0.loginUser("hi!", "hi!");
        register0.loginUser("hi!", "");
        register0.loginUser("", "");
        register0.runRegistrationSystem(1);
        register0.registerUser("hi!", "hi!");
        register0.loginUser("", "hi!");
        register0.loginUser("", "hi!");
        register0.registerUser("hi!", "");
    }

    @Test
    public void test2152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest4.test2152");
        Register register0 = new Register();
        register0.loginUser("hi!", "hi!");
        register0.runRegistrationSystem(0);
        register0.registerUser("", "");
        register0.loginUser("", "hi!");
        register0.registerUser("", "");
        register0.registerUser("hi!", "hi!");
        register0.registerUser("hi!", "");
        register0.runRegistrationSystem((int) (short) 10);
        java.lang.Class<?> wildcardClass23 = register0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test2153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest4.test2153");
        Register register0 = new Register();
        register0.registerUser("hi!", "");
        register0.registerUser("hi!", "");
        register0.runRegistrationSystem((int) (byte) 0);
        register0.registerUser("", "");
        register0.loginUser("", "");
        register0.loginUser("", "hi!");
        register0.loginUser("hi!", "");
        register0.runRegistrationSystem(0);
        register0.runRegistrationSystem(1);
    }

    @Test
    public void test2154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest4.test2154");
        Register register0 = new Register();
        register0.runRegistrationSystem((int) (byte) -1);
        register0.registerUser("hi!", "");
        register0.loginUser("hi!", "hi!");
        register0.loginUser("hi!", "");
        register0.registerUser("hi!", "");
        register0.registerUser("hi!", "hi!");
        register0.runRegistrationSystem((int) (short) 10);
        register0.runRegistrationSystem((-1));
        register0.loginUser("hi!", "");
        register0.runRegistrationSystem(10);
        register0.registerUser("", "");
    }

    @Test
    public void test2155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest4.test2155");
        Register register0 = new Register();
        register0.registerUser("hi!", "");
        register0.loginUser("", "hi!");
        register0.runRegistrationSystem((int) 'a');
        register0.loginUser("hi!", "");
        register0.runRegistrationSystem((-1));
        register0.registerUser("hi!", "");
        register0.registerUser("hi!", "hi!");
        register0.loginUser("", "hi!");
        register0.loginUser("hi!", "hi!");
        register0.runRegistrationSystem((-1));
    }

    @Test
    public void test2156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest4.test2156");
        Register register0 = new Register();
        register0.loginUser("hi!", "hi!");
        register0.registerUser("hi!", "");
        register0.registerUser("hi!", "");
        register0.registerUser("", "hi!");
        register0.loginUser("", "");
        register0.runRegistrationSystem((int) (short) -1);
        register0.registerUser("hi!", "");
        register0.runRegistrationSystem((int) '#');
    }

    @Test
    public void test2157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest4.test2157");
        Register register0 = new Register();
        register0.runRegistrationSystem((int) (byte) -1);
        register0.registerUser("hi!", "");
        register0.runRegistrationSystem((int) (byte) -1);
        register0.loginUser("hi!", "hi!");
        register0.registerUser("", "");
        register0.registerUser("hi!", "hi!");
        register0.loginUser("", "");
        register0.loginUser("", "hi!");
        register0.loginUser("hi!", "");
    }

    @Test
    public void test2158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest4.test2158");
        Register register0 = new Register();
        register0.runRegistrationSystem((int) (byte) -1);
        register0.registerUser("hi!", "");
        register0.runRegistrationSystem((int) (short) 1);
        register0.loginUser("", "hi!");
        register0.registerUser("", "");
        register0.runRegistrationSystem((int) (short) 0);
        register0.runRegistrationSystem((int) (short) 1);
        register0.loginUser("", "hi!");
    }

    @Test
    public void test2159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest4.test2159");
        Register register0 = new Register();
        register0.registerUser("hi!", "");
        register0.registerUser("hi!", "");
        register0.loginUser("hi!", "");
        register0.loginUser("hi!", "");
        register0.runRegistrationSystem(10);
        register0.registerUser("", "");
        register0.loginUser("hi!", "");
        register0.loginUser("", "");
        register0.loginUser("", "hi!");
        register0.registerUser("", "hi!");
    }

    @Test
    public void test2160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest4.test2160");
        Register register0 = new Register();
        register0.runRegistrationSystem((int) '#');
        register0.registerUser("", "hi!");
        register0.registerUser("", "hi!");
        register0.registerUser("", "");
        register0.runRegistrationSystem((int) (byte) 10);
        register0.runRegistrationSystem((int) (short) 100);
        register0.runRegistrationSystem((int) (short) 1);
        register0.runRegistrationSystem(0);
        register0.registerUser("", "hi!");
    }

    @Test
    public void test2161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest4.test2161");
        Register register0 = new Register();
        register0.loginUser("hi!", "hi!");
        register0.registerUser("hi!", "");
        register0.registerUser("hi!", "");
        register0.registerUser("", "hi!");
        register0.loginUser("", "");
        register0.runRegistrationSystem((int) (byte) 100);
        register0.runRegistrationSystem((int) 'a');
        register0.registerUser("hi!", "");
        register0.registerUser("", "");
        register0.registerUser("", "");
        register0.registerUser("hi!", "");
        java.lang.Class<?> wildcardClass32 = register0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass32);
    }

    @Test
    public void test2162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest4.test2162");
        Register register0 = new Register();
        register0.registerUser("hi!", "");
        register0.runRegistrationSystem(1);
        register0.registerUser("", "");
        register0.registerUser("hi!", "");
        register0.registerUser("hi!", "hi!");
        register0.loginUser("hi!", "");
        register0.runRegistrationSystem((int) (short) 10);
        register0.registerUser("hi!", "");
        register0.registerUser("hi!", "");
        java.lang.Class<?> wildcardClass26 = register0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass26);
    }

    @Test
    public void test2163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest4.test2163");
        Register register0 = new Register();
        register0.runRegistrationSystem((int) (byte) -1);
        register0.runRegistrationSystem((int) (byte) 10);
        register0.registerUser("", "");
        register0.loginUser("", "");
        register0.registerUser("", "hi!");
        register0.registerUser("", "hi!");
        register0.loginUser("hi!", "");
        register0.loginUser("", "hi!");
        register0.registerUser("", "");
        register0.registerUser("", "hi!");
        register0.loginUser("", "hi!");
        java.lang.Class<?> wildcardClass32 = register0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass32);
    }

    @Test
    public void test2164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest4.test2164");
        Register register0 = new Register();
        register0.runRegistrationSystem((int) (byte) -1);
        register0.registerUser("hi!", "");
        register0.runRegistrationSystem((int) (short) 1);
        register0.loginUser("", "hi!");
        register0.registerUser("", "");
        register0.runRegistrationSystem((int) (short) 0);
        register0.loginUser("", "");
        register0.registerUser("hi!", "hi!");
        register0.runRegistrationSystem((int) (short) 0);
        register0.runRegistrationSystem((int) (byte) 1);
        register0.registerUser("", "hi!");
        register0.runRegistrationSystem((int) (byte) 0);
        register0.registerUser("hi!", "hi!");
    }

    @Test
    public void test2165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest4.test2165");
        Register register0 = new Register();
        register0.runRegistrationSystem((int) '#');
        register0.loginUser("hi!", "hi!");
        register0.loginUser("hi!", "hi!");
        register0.loginUser("hi!", "");
        register0.loginUser("", "hi!");
        register0.runRegistrationSystem((int) '#');
        register0.registerUser("", "");
    }

    @Test
    public void test2166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest4.test2166");
        Register register0 = new Register();
        register0.loginUser("hi!", "hi!");
        register0.registerUser("hi!", "");
        register0.registerUser("", "");
        register0.registerUser("", "hi!");
        register0.runRegistrationSystem((int) (short) 100);
        register0.runRegistrationSystem((int) (byte) 1);
        register0.runRegistrationSystem((-1));
        register0.registerUser("", "");
        register0.runRegistrationSystem((int) 'a');
    }

    @Test
    public void test2167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest4.test2167");
        Register register0 = new Register();
        register0.loginUser("hi!", "hi!");
        register0.registerUser("hi!", "");
        register0.loginUser("hi!", "hi!");
        register0.runRegistrationSystem(100);
        register0.registerUser("hi!", "");
        register0.registerUser("", "");
        register0.runRegistrationSystem(10);
        register0.runRegistrationSystem((int) (byte) 100);
    }

    @Test
    public void test2168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest4.test2168");
        Register register0 = new Register();
        register0.runRegistrationSystem((int) '#');
        register0.registerUser("", "hi!");
        register0.runRegistrationSystem((int) (short) 0);
        register0.runRegistrationSystem((int) (byte) 1);
        register0.registerUser("", "");
        register0.runRegistrationSystem((int) (short) 10);
        register0.loginUser("", "hi!");
        register0.registerUser("hi!", "hi!");
        register0.registerUser("", "hi!");
        register0.runRegistrationSystem(1);
        register0.runRegistrationSystem(1);
    }

    @Test
    public void test2169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest4.test2169");
        Register register0 = new Register();
        register0.runRegistrationSystem((int) (short) 0);
        register0.loginUser("hi!", "hi!");
        register0.loginUser("", "");
        register0.registerUser("hi!", "");
        register0.registerUser("hi!", "hi!");
        register0.runRegistrationSystem((int) (byte) 1);
        register0.runRegistrationSystem((int) 'a');
        register0.registerUser("hi!", "");
        java.lang.Class<?> wildcardClass22 = register0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test2170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest4.test2170");
        Register register0 = new Register();
        register0.registerUser("hi!", "");
        register0.registerUser("hi!", "");
        register0.loginUser("hi!", "");
        register0.loginUser("", "hi!");
        register0.loginUser("", "");
        register0.registerUser("", "hi!");
    }

    @Test
    public void test2171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest4.test2171");
        Register register0 = new Register();
        register0.registerUser("hi!", "");
        register0.loginUser("", "hi!");
        register0.runRegistrationSystem((int) 'a');
        register0.loginUser("", "hi!");
        register0.loginUser("hi!", "");
        register0.loginUser("hi!", "hi!");
        register0.runRegistrationSystem(0);
        register0.runRegistrationSystem((int) (short) 10);
        register0.runRegistrationSystem(0);
    }

    @Test
    public void test2172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest4.test2172");
        Register register0 = new Register();
        register0.runRegistrationSystem((int) (short) 0);
        register0.loginUser("hi!", "hi!");
        register0.registerUser("", "");
        register0.runRegistrationSystem((-1));
        register0.runRegistrationSystem((int) (short) 10);
        register0.runRegistrationSystem(10);
        register0.registerUser("hi!", "");
        register0.runRegistrationSystem(0);
    }

    @Test
    public void test2173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest4.test2173");
        Register register0 = new Register();
        register0.runRegistrationSystem((int) '#');
        register0.registerUser("", "hi!");
        register0.runRegistrationSystem((int) (short) 0);
        register0.runRegistrationSystem((int) (byte) 1);
        register0.registerUser("", "");
        register0.loginUser("", "hi!");
    }

    @Test
    public void test2174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest4.test2174");
        Register register0 = new Register();
        register0.loginUser("hi!", "hi!");
        register0.registerUser("hi!", "");
        register0.registerUser("hi!", "");
        register0.registerUser("", "hi!");
        register0.loginUser("", "");
        register0.runRegistrationSystem((int) (short) -1);
        register0.registerUser("hi!", "");
        register0.runRegistrationSystem((int) (byte) 10);
        register0.registerUser("", "");
        register0.registerUser("", "");
        register0.loginUser("hi!", "");
        register0.loginUser("hi!", "hi!");
        register0.registerUser("", "");
    }

    @Test
    public void test2175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest4.test2175");
        Register register0 = new Register();
        register0.loginUser("hi!", "hi!");
        register0.registerUser("hi!", "");
        register0.loginUser("hi!", "");
        register0.loginUser("", "hi!");
    }

    @Test
    public void test2176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest4.test2176");
        Register register0 = new Register();
        register0.runRegistrationSystem((int) (short) 0);
        register0.loginUser("hi!", "hi!");
        register0.registerUser("", "");
        register0.loginUser("", "hi!");
        register0.registerUser("hi!", "");
        register0.registerUser("hi!", "");
        register0.runRegistrationSystem((int) '4');
        register0.loginUser("", "");
        register0.loginUser("", "hi!");
        register0.runRegistrationSystem(10);
    }

    @Test
    public void test2177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest4.test2177");
        Register register0 = new Register();
        register0.loginUser("hi!", "hi!");
        register0.runRegistrationSystem(0);
        register0.loginUser("", "hi!");
        register0.registerUser("", "hi!");
        register0.runRegistrationSystem(10);
        register0.loginUser("hi!", "hi!");
        register0.registerUser("hi!", "hi!");
        register0.loginUser("", "");
    }

    @Test
    public void test2178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest4.test2178");
        Register register0 = new Register();
        register0.registerUser("hi!", "");
        register0.runRegistrationSystem(1);
        register0.registerUser("", "");
        register0.loginUser("hi!", "hi!");
        register0.loginUser("hi!", "");
        register0.registerUser("", "");
    }

    @Test
    public void test2179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest4.test2179");
        Register register0 = new Register();
        register0.runRegistrationSystem((int) (short) 0);
        register0.loginUser("hi!", "hi!");
        register0.loginUser("", "");
        register0.registerUser("hi!", "");
        register0.registerUser("hi!", "hi!");
        register0.runRegistrationSystem((int) (byte) 1);
        register0.runRegistrationSystem((int) 'a');
        java.lang.Class<?> wildcardClass19 = register0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test2180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest4.test2180");
        Register register0 = new Register();
        register0.loginUser("hi!", "hi!");
        register0.registerUser("hi!", "");
        register0.registerUser("", "");
        register0.registerUser("", "hi!");
        register0.loginUser("hi!", "hi!");
        register0.loginUser("hi!", "hi!");
        register0.loginUser("", "hi!");
        register0.registerUser("hi!", "hi!");
        register0.registerUser("", "");
        register0.runRegistrationSystem((int) 'a');
        register0.loginUser("hi!", "");
    }

    @Test
    public void test2181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest4.test2181");
        Register register0 = new Register();
        register0.registerUser("hi!", "");
        register0.runRegistrationSystem(1);
        register0.loginUser("hi!", "");
        register0.registerUser("hi!", "");
        register0.registerUser("", "");
        java.lang.Class<?> wildcardClass15 = register0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test2182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest4.test2182");
        Register register0 = new Register();
        register0.loginUser("hi!", "hi!");
        register0.registerUser("hi!", "");
        register0.registerUser("hi!", "");
        register0.registerUser("", "");
        register0.runRegistrationSystem(100);
        register0.runRegistrationSystem((int) (byte) -1);
        register0.runRegistrationSystem(1);
        register0.loginUser("", "");
        register0.runRegistrationSystem(1);
    }

    @Test
    public void test2183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest4.test2183");
        Register register0 = new Register();
        register0.loginUser("hi!", "hi!");
        register0.registerUser("hi!", "");
        register0.registerUser("hi!", "");
        register0.registerUser("", "hi!");
        register0.loginUser("", "");
        register0.loginUser("hi!", "");
        register0.registerUser("", "");
        register0.runRegistrationSystem(100);
        java.lang.Class<?> wildcardClass24 = register0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test2184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest4.test2184");
        Register register0 = new Register();
        register0.runRegistrationSystem((int) (byte) -1);
        register0.registerUser("hi!", "");
        register0.registerUser("", "hi!");
        register0.runRegistrationSystem((int) (short) 10);
        register0.registerUser("hi!", "");
        register0.loginUser("hi!", "");
    }

    @Test
    public void test2185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest4.test2185");
        Register register0 = new Register();
        register0.loginUser("hi!", "hi!");
        register0.registerUser("hi!", "");
        register0.registerUser("hi!", "");
        register0.registerUser("", "hi!");
        register0.loginUser("", "");
        register0.runRegistrationSystem((int) (short) -1);
        register0.registerUser("hi!", "");
        register0.runRegistrationSystem((int) (byte) 10);
        register0.registerUser("hi!", "hi!");
        register0.runRegistrationSystem((int) (short) -1);
        register0.registerUser("", "");
        register0.runRegistrationSystem((int) (short) -1);
        register0.loginUser("hi!", "");
        register0.runRegistrationSystem((int) (byte) -1);
        register0.runRegistrationSystem(1);
        java.lang.Class<?> wildcardClass40 = register0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass40);
    }

    @Test
    public void test2186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest4.test2186");
        Register register0 = new Register();
        register0.registerUser("hi!", "");
        register0.loginUser("", "hi!");
        register0.runRegistrationSystem((int) 'a');
        register0.loginUser("", "hi!");
        register0.loginUser("", "hi!");
        register0.runRegistrationSystem((int) ' ');
        register0.registerUser("", "");
    }

    @Test
    public void test2187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest4.test2187");
        Register register0 = new Register();
        register0.loginUser("hi!", "hi!");
        register0.registerUser("hi!", "hi!");
        register0.runRegistrationSystem((int) (byte) 100);
        register0.loginUser("", "hi!");
        register0.loginUser("hi!", "hi!");
        register0.runRegistrationSystem((int) (byte) -1);
    }

    @Test
    public void test2188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest4.test2188");
        Register register0 = new Register();
        register0.runRegistrationSystem((int) (byte) -1);
        register0.registerUser("hi!", "");
        register0.runRegistrationSystem(0);
        register0.registerUser("hi!", "hi!");
        register0.loginUser("hi!", "");
    }

    @Test
    public void test2189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest4.test2189");
        Register register0 = new Register();
        register0.runRegistrationSystem((int) (short) 0);
        register0.loginUser("hi!", "hi!");
        register0.registerUser("", "");
        register0.runRegistrationSystem((-1));
        register0.runRegistrationSystem((int) (short) 0);
        register0.registerUser("", "");
        register0.runRegistrationSystem((int) (short) -1);
        register0.loginUser("hi!", "");
        register0.runRegistrationSystem(0);
        register0.runRegistrationSystem((int) (byte) 0);
        register0.registerUser("hi!", "hi!");
    }

    @Test
    public void test2190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest4.test2190");
        Register register0 = new Register();
        register0.runRegistrationSystem((int) '#');
        register0.registerUser("", "hi!");
        register0.runRegistrationSystem(0);
        register0.loginUser("", "");
        register0.runRegistrationSystem((int) (byte) -1);
    }

    @Test
    public void test2191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest4.test2191");
        Register register0 = new Register();
        register0.runRegistrationSystem((int) (byte) -1);
        register0.registerUser("hi!", "");
        register0.registerUser("", "hi!");
        register0.runRegistrationSystem((int) (short) 10);
        register0.loginUser("hi!", "hi!");
        register0.loginUser("", "hi!");
        register0.loginUser("hi!", "");
        register0.runRegistrationSystem(0);
        register0.registerUser("hi!", "");
        register0.registerUser("", "");
    }

    @Test
    public void test2192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest4.test2192");
        Register register0 = new Register();
        register0.loginUser("hi!", "hi!");
        register0.registerUser("hi!", "");
        register0.registerUser("", "");
        register0.registerUser("hi!", "");
        register0.registerUser("hi!", "");
        register0.runRegistrationSystem((int) (short) 10);
        register0.loginUser("", "");
        register0.runRegistrationSystem((int) (short) 0);
        register0.registerUser("hi!", "");
        register0.runRegistrationSystem((int) (byte) 1);
    }

    @Test
    public void test2193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest4.test2193");
        Register register0 = new Register();
        register0.runRegistrationSystem((int) '#');
        register0.registerUser("", "hi!");
        register0.runRegistrationSystem((int) (short) 0);
        register0.runRegistrationSystem((int) (byte) 1);
        register0.registerUser("", "");
        register0.loginUser("", "");
        register0.loginUser("", "");
        register0.runRegistrationSystem((int) (short) 0);
        register0.registerUser("", "");
        register0.runRegistrationSystem((int) (byte) 0);
        register0.loginUser("", "");
        register0.registerUser("hi!", "hi!");
        register0.runRegistrationSystem((int) (byte) 10);
    }

    @Test
    public void test2194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest4.test2194");
        Register register0 = new Register();
        register0.runRegistrationSystem((int) '#');
        register0.registerUser("", "hi!");
        register0.runRegistrationSystem((int) (short) 0);
        register0.runRegistrationSystem((int) (byte) 1);
        register0.registerUser("", "");
        register0.runRegistrationSystem((int) (short) 10);
        register0.runRegistrationSystem((int) (short) -1);
        register0.loginUser("", "hi!");
        register0.registerUser("", "");
        register0.loginUser("", "hi!");
        register0.runRegistrationSystem((int) ' ');
        register0.runRegistrationSystem(0);
    }

    @Test
    public void test2195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest4.test2195");
        Register register0 = new Register();
        register0.runRegistrationSystem((int) (byte) -1);
        register0.runRegistrationSystem((int) '#');
        register0.registerUser("hi!", "hi!");
        register0.runRegistrationSystem((int) (byte) 1);
        register0.registerUser("hi!", "hi!");
        register0.loginUser("hi!", "hi!");
        register0.loginUser("hi!", "hi!");
        register0.runRegistrationSystem((int) (short) 10);
    }

    @Test
    public void test2196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest4.test2196");
        Register register0 = new Register();
        register0.runRegistrationSystem((int) '#');
        register0.registerUser("", "hi!");
        register0.runRegistrationSystem((int) (short) 0);
        register0.runRegistrationSystem((int) (byte) 1);
        register0.runRegistrationSystem((int) 'a');
        register0.registerUser("", "");
        register0.loginUser("hi!", "");
        java.lang.Class<?> wildcardClass18 = register0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test2197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest4.test2197");
        Register register0 = new Register();
        register0.loginUser("hi!", "hi!");
        register0.registerUser("hi!", "");
        register0.loginUser("hi!", "hi!");
        register0.runRegistrationSystem(100);
        register0.runRegistrationSystem((int) (byte) 1);
        register0.loginUser("", "");
        register0.registerUser("hi!", "hi!");
        register0.runRegistrationSystem(10);
        register0.runRegistrationSystem((int) (byte) -1);
        register0.registerUser("", "hi!");
        java.lang.Class<?> wildcardClass27 = register0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test2198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest4.test2198");
        Register register0 = new Register();
        register0.runRegistrationSystem((int) (short) 0);
        register0.loginUser("hi!", "hi!");
        register0.registerUser("", "");
        register0.runRegistrationSystem((-1));
        register0.runRegistrationSystem((int) (short) 0);
        register0.registerUser("", "");
        register0.registerUser("", "");
        register0.runRegistrationSystem((int) (short) -1);
        register0.runRegistrationSystem((int) (short) 100);
    }

    @Test
    public void test2199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest4.test2199");
        Register register0 = new Register();
        register0.runRegistrationSystem((int) '#');
        register0.registerUser("", "hi!");
        register0.runRegistrationSystem((int) (short) 0);
        register0.runRegistrationSystem((int) (byte) 1);
        register0.registerUser("", "");
        register0.runRegistrationSystem((int) (short) 10);
        register0.loginUser("hi!", "");
        register0.registerUser("hi!", "hi!");
        register0.registerUser("", "hi!");
    }

    @Test
    public void test2200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest4.test2200");
        Register register0 = new Register();
        register0.runRegistrationSystem((int) '#');
        register0.loginUser("", "hi!");
        register0.loginUser("hi!", "hi!");
        register0.runRegistrationSystem((int) (byte) 10);
        register0.loginUser("hi!", "hi!");
    }

    @Test
    public void test2201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest4.test2201");
        Register register0 = new Register();
        register0.registerUser("hi!", "");
        register0.runRegistrationSystem(1);
        register0.registerUser("", "");
        register0.runRegistrationSystem((int) (short) -1);
        register0.loginUser("", "");
        register0.registerUser("", "hi!");
        register0.runRegistrationSystem(100);
    }

    @Test
    public void test2202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest4.test2202");
        Register register0 = new Register();
        register0.runRegistrationSystem((int) (short) 0);
        register0.loginUser("hi!", "hi!");
        register0.registerUser("", "");
        register0.loginUser("", "hi!");
        register0.registerUser("hi!", "");
        register0.loginUser("hi!", "");
        register0.registerUser("", "");
        register0.loginUser("hi!", "hi!");
    }

    @Test
    public void test2203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest4.test2203");
        Register register0 = new Register();
        register0.runRegistrationSystem((int) (short) 0);
        register0.loginUser("hi!", "hi!");
        register0.loginUser("", "");
        register0.registerUser("hi!", "");
        register0.registerUser("hi!", "hi!");
        register0.runRegistrationSystem((int) (byte) 1);
        register0.runRegistrationSystem((int) 'a');
        register0.registerUser("hi!", "");
        register0.registerUser("", "hi!");
        register0.registerUser("", "hi!");
        register0.registerUser("", "hi!");
    }

    @Test
    public void test2204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest4.test2204");
        Register register0 = new Register();
        register0.runRegistrationSystem((int) (short) 0);
        register0.loginUser("hi!", "hi!");
        register0.registerUser("", "");
        register0.loginUser("", "hi!");
        register0.registerUser("hi!", "");
        register0.runRegistrationSystem((int) '#');
        register0.runRegistrationSystem((int) (byte) -1);
        register0.loginUser("", "");
        register0.registerUser("hi!", "hi!");
    }

    @Test
    public void test2205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest4.test2205");
        Register register0 = new Register();
        register0.runRegistrationSystem((int) (byte) -1);
        register0.registerUser("hi!", "");
        register0.loginUser("hi!", "hi!");
        register0.runRegistrationSystem((int) (byte) 1);
        register0.registerUser("hi!", "hi!");
        register0.registerUser("hi!", "");
        register0.runRegistrationSystem((-1));
        register0.registerUser("", "hi!");
    }

    @Test
    public void test2206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest4.test2206");
        Register register0 = new Register();
        register0.registerUser("hi!", "");
        register0.registerUser("hi!", "");
        register0.runRegistrationSystem((int) (byte) 0);
        register0.runRegistrationSystem((int) (short) 10);
        register0.registerUser("", "");
        register0.registerUser("", "hi!");
        register0.loginUser("hi!", "");
    }

    @Test
    public void test2207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest4.test2207");
        Register register0 = new Register();
        register0.runRegistrationSystem((int) (byte) -1);
        register0.runRegistrationSystem((int) (short) 10);
        register0.runRegistrationSystem((int) (byte) -1);
        register0.runRegistrationSystem(10);
        register0.registerUser("", "");
        register0.registerUser("hi!", "");
        register0.registerUser("hi!", "hi!");
        register0.loginUser("", "");
    }

    @Test
    public void test2208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest4.test2208");
        Register register0 = new Register();
        register0.loginUser("hi!", "hi!");
        register0.registerUser("hi!", "hi!");
        register0.runRegistrationSystem((int) (byte) 100);
        register0.loginUser("", "hi!");
        register0.runRegistrationSystem((int) (short) 100);
        register0.runRegistrationSystem((int) (byte) 10);
        register0.runRegistrationSystem((int) (short) 100);
    }

    @Test
    public void test2209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest4.test2209");
        Register register0 = new Register();
        register0.loginUser("hi!", "hi!");
        register0.registerUser("hi!", "");
        register0.registerUser("hi!", "");
        register0.registerUser("", "");
        register0.runRegistrationSystem(100);
        register0.runRegistrationSystem((int) (byte) -1);
        register0.runRegistrationSystem(1);
        register0.loginUser("", "");
        register0.runRegistrationSystem((int) ' ');
        register0.loginUser("hi!", "hi!");
    }

    @Test
    public void test2210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest4.test2210");
        Register register0 = new Register();
        register0.runRegistrationSystem((int) (short) 0);
        register0.loginUser("hi!", "hi!");
        register0.registerUser("", "");
        register0.runRegistrationSystem((int) '#');
        register0.runRegistrationSystem((int) (byte) 0);
        register0.registerUser("", "");
        register0.registerUser("", "hi!");
        register0.loginUser("", "");
        register0.loginUser("hi!", "");
        register0.runRegistrationSystem(100);
    }

    @Test
    public void test2211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest4.test2211");
        Register register0 = new Register();
        register0.runRegistrationSystem((int) (short) 0);
        register0.loginUser("hi!", "hi!");
        register0.registerUser("", "");
        register0.runRegistrationSystem((int) '#');
        register0.runRegistrationSystem((int) (byte) 0);
        register0.runRegistrationSystem(0);
        register0.registerUser("", "");
        register0.registerUser("", "");
        register0.loginUser("hi!", "hi!");
        register0.loginUser("", "hi!");
    }

    @Test
    public void test2212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest4.test2212");
        Register register0 = new Register();
        register0.runRegistrationSystem((int) (byte) -1);
        register0.runRegistrationSystem((int) (short) 10);
        register0.runRegistrationSystem((int) (byte) 100);
        java.lang.Class<?> wildcardClass7 = register0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test2213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest4.test2213");
        Register register0 = new Register();
        register0.runRegistrationSystem((int) (byte) -1);
        register0.registerUser("hi!", "");
        register0.loginUser("hi!", "hi!");
        register0.loginUser("hi!", "");
        register0.loginUser("hi!", "");
        register0.registerUser("", "hi!");
        register0.loginUser("hi!", "");
        register0.loginUser("hi!", "hi!");
        register0.runRegistrationSystem((-1));
        register0.loginUser("", "hi!");
        register0.registerUser("hi!", "hi!");
    }

    @Test
    public void test2214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest4.test2214");
        Register register0 = new Register();
        register0.registerUser("hi!", "");
        register0.loginUser("", "hi!");
        register0.runRegistrationSystem((int) (byte) -1);
        register0.runRegistrationSystem(1);
        register0.loginUser("hi!", "");
        register0.runRegistrationSystem(0);
        register0.loginUser("", "hi!");
        register0.registerUser("hi!", "");
    }

    @Test
    public void test2215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest4.test2215");
        Register register0 = new Register();
        register0.registerUser("hi!", "");
        register0.registerUser("hi!", "");
        register0.loginUser("hi!", "");
        register0.loginUser("hi!", "");
        register0.loginUser("", "hi!");
        register0.runRegistrationSystem((-1));
        java.lang.Class<?> wildcardClass18 = register0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test2216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest4.test2216");
        Register register0 = new Register();
        register0.runRegistrationSystem((int) (short) 0);
        register0.loginUser("hi!", "hi!");
        register0.loginUser("", "");
        register0.registerUser("hi!", "");
        register0.registerUser("hi!", "hi!");
        register0.runRegistrationSystem((int) 'a');
        register0.runRegistrationSystem((int) 'a');
        register0.loginUser("", "hi!");
        register0.registerUser("", "");
        register0.runRegistrationSystem((int) ' ');
        java.lang.Class<?> wildcardClass27 = register0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test2217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest4.test2217");
        Register register0 = new Register();
        register0.loginUser("hi!", "hi!");
        register0.loginUser("hi!", "");
        register0.runRegistrationSystem((int) '4');
        java.lang.Class<?> wildcardClass9 = register0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test2218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest4.test2218");
        Register register0 = new Register();
        register0.registerUser("hi!", "");
        register0.loginUser("", "hi!");
        register0.runRegistrationSystem((int) 'a');
        register0.loginUser("", "hi!");
        register0.loginUser("hi!", "");
        register0.registerUser("hi!", "hi!");
        register0.registerUser("", "");
    }

    @Test
    public void test2219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest4.test2219");
        Register register0 = new Register();
        register0.registerUser("hi!", "");
        register0.loginUser("", "hi!");
        register0.runRegistrationSystem((int) 'a');
        register0.loginUser("", "hi!");
        register0.runRegistrationSystem((int) (byte) -1);
        register0.loginUser("", "hi!");
        register0.loginUser("", "hi!");
        register0.loginUser("hi!", "hi!");
        register0.runRegistrationSystem(10);
        register0.registerUser("hi!", "hi!");
    }

    @Test
    public void test2220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest4.test2220");
        Register register0 = new Register();
        register0.runRegistrationSystem((int) '#');
        register0.registerUser("", "hi!");
        register0.registerUser("hi!", "hi!");
        register0.runRegistrationSystem((int) (short) 1);
        register0.runRegistrationSystem((int) ' ');
    }

    @Test
    public void test2221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest4.test2221");
        Register register0 = new Register();
        register0.runRegistrationSystem((int) '#');
        register0.runRegistrationSystem((int) (byte) 0);
    }

    @Test
    public void test2222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest4.test2222");
        Register register0 = new Register();
        register0.runRegistrationSystem((int) (short) 0);
        register0.loginUser("hi!", "hi!");
        register0.registerUser("", "");
        register0.runRegistrationSystem((-1));
        register0.runRegistrationSystem((int) (short) 0);
        register0.registerUser("", "");
        register0.runRegistrationSystem((int) (byte) 0);
        register0.runRegistrationSystem((int) '#');
        register0.runRegistrationSystem((int) (short) 1);
    }

    @Test
    public void test2223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest4.test2223");
        Register register0 = new Register();
        register0.registerUser("hi!", "");
        register0.loginUser("", "hi!");
        register0.runRegistrationSystem((int) 'a');
        register0.loginUser("hi!", "");
        register0.runRegistrationSystem((-1));
        register0.runRegistrationSystem(100);
        register0.runRegistrationSystem((int) (short) 0);
        register0.loginUser("hi!", "hi!");
    }

    @Test
    public void test2224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest4.test2224");
        Register register0 = new Register();
        register0.registerUser("hi!", "");
        register0.loginUser("", "hi!");
        register0.runRegistrationSystem((int) (byte) -1);
        register0.loginUser("", "");
        register0.runRegistrationSystem((-1));
        register0.loginUser("", "");
        register0.loginUser("", "");
        register0.loginUser("hi!", "");
        register0.registerUser("", "hi!");
    }

    @Test
    public void test2225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest4.test2225");
        Register register0 = new Register();
        register0.registerUser("hi!", "");
        register0.loginUser("", "");
        register0.runRegistrationSystem((int) 'a');
        register0.registerUser("", "");
        register0.registerUser("hi!", "hi!");
        register0.registerUser("", "");
        register0.loginUser("hi!", "");
        register0.loginUser("", "");
    }

    @Test
    public void test2226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest4.test2226");
        Register register0 = new Register();
        register0.loginUser("hi!", "hi!");
        register0.runRegistrationSystem(0);
        register0.registerUser("", "");
        register0.loginUser("", "hi!");
        register0.registerUser("", "");
        register0.loginUser("hi!", "hi!");
        register0.runRegistrationSystem(10);
        register0.loginUser("", "");
        register0.runRegistrationSystem((int) 'a');
        register0.runRegistrationSystem((int) (short) 10);
        register0.runRegistrationSystem((int) (byte) 1);
        java.lang.Class<?> wildcardClass29 = register0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass29);
    }

    @Test
    public void test2227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest4.test2227");
        Register register0 = new Register();
        register0.registerUser("hi!", "");
        register0.loginUser("", "hi!");
        register0.runRegistrationSystem((int) (byte) -1);
        register0.runRegistrationSystem(10);
        register0.registerUser("", "hi!");
        register0.loginUser("hi!", "");
        register0.registerUser("", "");
        register0.runRegistrationSystem((int) (short) 100);
    }

    @Test
    public void test2228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest4.test2228");
        Register register0 = new Register();
        register0.registerUser("hi!", "");
        register0.loginUser("", "hi!");
        register0.runRegistrationSystem((int) (byte) -1);
        register0.runRegistrationSystem(1);
        register0.loginUser("hi!", "");
        register0.runRegistrationSystem(0);
        register0.registerUser("", "hi!");
        register0.runRegistrationSystem((int) (byte) -1);
    }

    @Test
    public void test2229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest4.test2229");
        Register register0 = new Register();
        register0.loginUser("hi!", "hi!");
        register0.registerUser("hi!", "");
        register0.registerUser("hi!", "");
        register0.registerUser("", "hi!");
        register0.loginUser("", "");
        register0.runRegistrationSystem((int) (byte) 100);
        register0.runRegistrationSystem((int) 'a');
        register0.registerUser("hi!", "");
        register0.registerUser("", "");
        register0.registerUser("", "");
        register0.registerUser("hi!", "");
        register0.runRegistrationSystem(10);
    }

    @Test
    public void test2230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest4.test2230");
        Register register0 = new Register();
        register0.runRegistrationSystem((int) '#');
        register0.runRegistrationSystem((int) (short) 100);
        register0.runRegistrationSystem((int) (byte) 100);
        register0.runRegistrationSystem(100);
        register0.runRegistrationSystem(1);
        register0.runRegistrationSystem((int) (byte) 1);
    }

    @Test
    public void test2231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest4.test2231");
        Register register0 = new Register();
        register0.registerUser("hi!", "");
        register0.registerUser("hi!", "");
        register0.loginUser("hi!", "");
        register0.loginUser("hi!", "");
        register0.runRegistrationSystem(10);
        register0.registerUser("", "");
        register0.loginUser("hi!", "");
        register0.loginUser("", "");
        register0.runRegistrationSystem((int) (byte) -1);
    }

    @Test
    public void test2232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest4.test2232");
        Register register0 = new Register();
        register0.runRegistrationSystem((int) (byte) -1);
        register0.registerUser("hi!", "");
        register0.runRegistrationSystem(0);
        register0.runRegistrationSystem((int) (byte) 10);
        register0.registerUser("hi!", "hi!");
        register0.loginUser("hi!", "hi!");
    }

    @Test
    public void test2233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest4.test2233");
        Register register0 = new Register();
        register0.loginUser("", "hi!");
        register0.registerUser("", "");
        register0.loginUser("hi!", "hi!");
        register0.registerUser("hi!", "");
        register0.loginUser("hi!", "");
    }

    @Test
    public void test2234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest4.test2234");
        Register register0 = new Register();
        register0.runRegistrationSystem((int) (short) 0);
        register0.loginUser("hi!", "hi!");
        register0.registerUser("", "");
        register0.runRegistrationSystem((-1));
        register0.runRegistrationSystem((int) (short) 0);
        register0.runRegistrationSystem((int) ' ');
        register0.loginUser("hi!", "hi!");
        register0.loginUser("", "hi!");
    }

    @Test
    public void test2235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest4.test2235");
        Register register0 = new Register();
        register0.runRegistrationSystem((int) '#');
        register0.registerUser("", "hi!");
        register0.registerUser("", "hi!");
        register0.registerUser("", "hi!");
        register0.loginUser("hi!", "hi!");
        register0.loginUser("", "hi!");
    }

    @Test
    public void test2236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest4.test2236");
        Register register0 = new Register();
        register0.registerUser("hi!", "");
        register0.registerUser("hi!", "");
        register0.loginUser("hi!", "");
        register0.loginUser("hi!", "");
        register0.loginUser("", "hi!");
        register0.loginUser("hi!", "");
        register0.loginUser("", "hi!");
        java.lang.Class<?> wildcardClass22 = register0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test2237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest4.test2237");
        Register register0 = new Register();
        register0.loginUser("hi!", "hi!");
        register0.runRegistrationSystem(0);
        register0.loginUser("", "hi!");
        register0.registerUser("", "hi!");
        register0.runRegistrationSystem(10);
        register0.registerUser("hi!", "");
        register0.runRegistrationSystem((int) (short) 100);
        java.lang.Class<?> wildcardClass19 = register0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test2238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest4.test2238");
        Register register0 = new Register();
        register0.runRegistrationSystem((int) '#');
        register0.loginUser("hi!", "hi!");
        register0.runRegistrationSystem((int) (byte) 10);
        register0.registerUser("hi!", "hi!");
        register0.runRegistrationSystem((int) (byte) 100);
        register0.registerUser("hi!", "");
        register0.registerUser("hi!", "hi!");
        register0.registerUser("", "hi!");
        register0.runRegistrationSystem((int) '#');
        register0.runRegistrationSystem(0);
        register0.runRegistrationSystem((int) 'a');
        java.lang.Class<?> wildcardClass28 = register0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test2239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest4.test2239");
        Register register0 = new Register();
        register0.registerUser("hi!", "");
        register0.loginUser("", "hi!");
        register0.runRegistrationSystem((int) (byte) -1);
        register0.loginUser("", "");
        register0.runRegistrationSystem((int) (short) 100);
        register0.registerUser("", "hi!");
        register0.loginUser("hi!", "hi!");
        register0.runRegistrationSystem((int) (byte) 100);
        register0.loginUser("", "hi!");
        register0.loginUser("", "");
        register0.runRegistrationSystem(1);
    }

    @Test
    public void test2240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest4.test2240");
        Register register0 = new Register();
        register0.runRegistrationSystem((int) '#');
        register0.runRegistrationSystem((int) (short) 100);
        register0.runRegistrationSystem((int) (byte) 100);
        register0.runRegistrationSystem(100);
        register0.runRegistrationSystem(0);
    }

    @Test
    public void test2241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest4.test2241");
        Register register0 = new Register();
        register0.loginUser("hi!", "hi!");
        register0.loginUser("hi!", "hi!");
        register0.registerUser("", "");
        register0.runRegistrationSystem((int) (short) 10);
        register0.loginUser("hi!", "");
        java.lang.Class<?> wildcardClass15 = register0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test2242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest4.test2242");
        Register register0 = new Register();
        register0.loginUser("hi!", "hi!");
        register0.registerUser("hi!", "");
        register0.registerUser("", "");
        register0.registerUser("", "");
        register0.runRegistrationSystem((int) (byte) 100);
        register0.runRegistrationSystem((int) (short) -1);
        register0.loginUser("hi!", "hi!");
        register0.registerUser("hi!", "hi!");
        register0.loginUser("", "hi!");
    }

    @Test
    public void test2243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest4.test2243");
        Register register0 = new Register();
        register0.runRegistrationSystem((int) (byte) -1);
        register0.runRegistrationSystem((int) (byte) 10);
        register0.registerUser("", "");
        register0.loginUser("", "");
        register0.registerUser("", "hi!");
        register0.registerUser("", "hi!");
        register0.loginUser("hi!", "");
        register0.registerUser("hi!", "");
        register0.registerUser("hi!", "hi!");
        register0.runRegistrationSystem(10);
        register0.loginUser("", "");
    }

    @Test
    public void test2244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest4.test2244");
        Register register0 = new Register();
        register0.runRegistrationSystem((int) (short) 0);
        register0.loginUser("hi!", "hi!");
        register0.registerUser("", "");
        register0.runRegistrationSystem((int) '#');
        register0.runRegistrationSystem((int) (byte) 0);
        register0.runRegistrationSystem(0);
        register0.registerUser("", "");
        register0.registerUser("hi!", "hi!");
        register0.runRegistrationSystem((int) (short) 0);
    }

    @Test
    public void test2245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest4.test2245");
        Register register0 = new Register();
        register0.registerUser("hi!", "");
        register0.loginUser("", "hi!");
        register0.runRegistrationSystem((int) 'a');
        register0.loginUser("", "hi!");
        register0.loginUser("", "hi!");
        register0.registerUser("", "");
        register0.registerUser("hi!", "");
        register0.runRegistrationSystem((int) ' ');
        register0.registerUser("hi!", "");
        java.lang.Class<?> wildcardClass26 = register0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass26);
    }

    @Test
    public void test2246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest4.test2246");
        Register register0 = new Register();
        register0.loginUser("hi!", "hi!");
        register0.runRegistrationSystem(0);
        register0.registerUser("", "");
        register0.loginUser("", "hi!");
        register0.registerUser("", "");
        register0.runRegistrationSystem(1);
        register0.registerUser("", "hi!");
        register0.registerUser("", "");
    }

    @Test
    public void test2247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest4.test2247");
        Register register0 = new Register();
        register0.loginUser("hi!", "hi!");
        register0.registerUser("hi!", "");
        register0.registerUser("", "");
        register0.registerUser("", "hi!");
        register0.loginUser("hi!", "hi!");
        register0.loginUser("hi!", "hi!");
        register0.loginUser("", "hi!");
        register0.registerUser("hi!", "hi!");
        register0.registerUser("", "");
        register0.registerUser("hi!", "hi!");
    }

    @Test
    public void test2248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest4.test2248");
        Register register0 = new Register();
        register0.runRegistrationSystem((int) '#');
        register0.registerUser("", "hi!");
        register0.runRegistrationSystem((int) (short) 0);
        register0.runRegistrationSystem((int) (byte) 1);
        register0.loginUser("", "hi!");
        register0.runRegistrationSystem((int) (byte) 10);
        register0.runRegistrationSystem((int) (byte) 1);
    }

    @Test
    public void test2249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest4.test2249");
        Register register0 = new Register();
        register0.loginUser("hi!", "hi!");
        register0.registerUser("hi!", "");
        register0.registerUser("", "");
        register0.registerUser("hi!", "");
        register0.registerUser("hi!", "");
        register0.registerUser("", "");
        register0.runRegistrationSystem(0);
        register0.loginUser("", "");
        register0.loginUser("", "hi!");
        java.lang.Class<?> wildcardClass27 = register0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test2250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest4.test2250");
        Register register0 = new Register();
        register0.loginUser("hi!", "hi!");
        register0.registerUser("hi!", "");
        register0.registerUser("hi!", "");
        register0.registerUser("", "hi!");
        register0.loginUser("", "");
        register0.runRegistrationSystem((int) (short) -1);
        register0.registerUser("hi!", "");
        register0.runRegistrationSystem((int) (byte) 10);
        register0.registerUser("hi!", "hi!");
        register0.runRegistrationSystem((int) (short) -1);
        register0.registerUser("", "hi!");
        register0.registerUser("hi!", "hi!");
        register0.runRegistrationSystem((int) (byte) 10);
        java.lang.Class<?> wildcardClass36 = register0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass36);
    }

    @Test
    public void test2251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest4.test2251");
        Register register0 = new Register();
        register0.registerUser("hi!", "");
        register0.loginUser("", "hi!");
        register0.runRegistrationSystem((int) (byte) -1);
        register0.runRegistrationSystem(10);
        register0.registerUser("", "hi!");
        register0.runRegistrationSystem(10);
        register0.runRegistrationSystem((int) (byte) 1);
        register0.loginUser("", "hi!");
        register0.loginUser("", "hi!");
    }

    @Test
    public void test2252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest4.test2252");
        Register register0 = new Register();
        register0.runRegistrationSystem((int) '#');
        register0.loginUser("hi!", "hi!");
        register0.loginUser("hi!", "hi!");
        register0.loginUser("hi!", "");
        register0.runRegistrationSystem((int) (short) 100);
        register0.runRegistrationSystem((int) '#');
        java.lang.Class<?> wildcardClass16 = register0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test2253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest4.test2253");
        Register register0 = new Register();
        register0.runRegistrationSystem((int) (short) 0);
        register0.loginUser("hi!", "hi!");
        register0.registerUser("", "");
        register0.runRegistrationSystem((int) '#');
        register0.runRegistrationSystem((int) '#');
        register0.runRegistrationSystem(100);
    }

    @Test
    public void test2254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest4.test2254");
        Register register0 = new Register();
        register0.runRegistrationSystem((int) (byte) -1);
        register0.registerUser("hi!", "");
        register0.loginUser("hi!", "hi!");
        register0.runRegistrationSystem((int) (byte) 1);
        register0.registerUser("", "hi!");
        register0.loginUser("", "");
        register0.loginUser("hi!", "hi!");
        register0.loginUser("hi!", "hi!");
        register0.runRegistrationSystem(0);
        register0.loginUser("", "");
    }

    @Test
    public void test2255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest4.test2255");
        Register register0 = new Register();
        register0.runRegistrationSystem((int) (byte) -1);
        register0.runRegistrationSystem((int) (byte) 10);
        register0.registerUser("", "");
        register0.loginUser("", "");
        register0.registerUser("", "hi!");
        register0.registerUser("hi!", "");
        register0.loginUser("hi!", "hi!");
        register0.runRegistrationSystem((int) (short) 0);
        register0.registerUser("hi!", "hi!");
    }

    @Test
    public void test2256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest4.test2256");
        Register register0 = new Register();
        register0.loginUser("hi!", "hi!");
        register0.registerUser("hi!", "");
        register0.registerUser("hi!", "");
        register0.registerUser("", "hi!");
        register0.loginUser("", "");
        register0.runRegistrationSystem((int) (short) 10);
        register0.registerUser("hi!", "hi!");
        register0.runRegistrationSystem(0);
        register0.loginUser("", "hi!");
        register0.registerUser("", "");
        java.lang.Class<?> wildcardClass29 = register0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass29);
    }

    @Test
    public void test2257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest4.test2257");
        Register register0 = new Register();
        register0.runRegistrationSystem((int) (byte) -1);
        register0.runRegistrationSystem((int) (short) 10);
        register0.runRegistrationSystem((int) (short) -1);
        register0.runRegistrationSystem((int) (short) -1);
        register0.loginUser("", "hi!");
        register0.runRegistrationSystem((int) '#');
        java.lang.Class<?> wildcardClass14 = register0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test2258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest4.test2258");
        Register register0 = new Register();
        register0.runRegistrationSystem((int) '#');
        register0.loginUser("hi!", "hi!");
        register0.loginUser("hi!", "hi!");
        register0.loginUser("hi!", "");
        register0.runRegistrationSystem((int) (short) 100);
        register0.runRegistrationSystem((int) (short) 10);
        register0.registerUser("hi!", "");
        register0.runRegistrationSystem((int) (byte) 100);
    }

    @Test
    public void test2259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest4.test2259");
        Register register0 = new Register();
        register0.runRegistrationSystem((int) (short) 0);
        register0.loginUser("hi!", "hi!");
        register0.registerUser("", "");
        register0.runRegistrationSystem((int) '#');
        register0.registerUser("", "hi!");
        register0.registerUser("", "hi!");
        register0.registerUser("hi!", "hi!");
        register0.runRegistrationSystem((int) (byte) 100);
        register0.loginUser("", "hi!");
        register0.registerUser("hi!", "hi!");
        register0.registerUser("", "hi!");
        register0.registerUser("", "hi!");
        register0.runRegistrationSystem((int) (byte) 1);
        register0.loginUser("", "hi!");
    }

    @Test
    public void test2260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest4.test2260");
        Register register0 = new Register();
        register0.loginUser("hi!", "hi!");
        register0.registerUser("hi!", "");
        register0.loginUser("hi!", "hi!");
        register0.runRegistrationSystem(100);
        register0.loginUser("hi!", "hi!");
        register0.runRegistrationSystem((int) (byte) 1);
        register0.registerUser("hi!", "");
    }

    @Test
    public void test2261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest4.test2261");
        Register register0 = new Register();
        register0.runRegistrationSystem((int) '#');
        register0.registerUser("", "hi!");
        register0.loginUser("hi!", "");
        register0.loginUser("", "");
        java.lang.Class<?> wildcardClass12 = register0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test2262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest4.test2262");
        Register register0 = new Register();
        register0.runRegistrationSystem((int) (byte) -1);
        register0.runRegistrationSystem((int) (short) 10);
        register0.runRegistrationSystem((int) (short) -1);
        register0.registerUser("hi!", "");
        register0.runRegistrationSystem((int) (short) 1);
    }

    @Test
    public void test2263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest4.test2263");
        Register register0 = new Register();
        register0.registerUser("hi!", "");
        register0.loginUser("", "");
        register0.runRegistrationSystem((int) 'a');
        register0.runRegistrationSystem((int) (short) 100);
        register0.registerUser("hi!", "");
        register0.runRegistrationSystem((int) '#');
    }

    @Test
    public void test2264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest4.test2264");
        Register register0 = new Register();
        register0.runRegistrationSystem((int) '#');
        register0.registerUser("", "hi!");
        register0.loginUser("hi!", "hi!");
        register0.loginUser("", "hi!");
        register0.runRegistrationSystem((int) (byte) 1);
        register0.loginUser("hi!", "");
    }

    @Test
    public void test2265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest4.test2265");
        Register register0 = new Register();
        register0.loginUser("hi!", "hi!");
        register0.runRegistrationSystem(0);
        register0.registerUser("", "");
        register0.loginUser("", "hi!");
        register0.runRegistrationSystem((int) 'a');
        register0.loginUser("hi!", "hi!");
        java.lang.Class<?> wildcardClass17 = register0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test2266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest4.test2266");
        Register register0 = new Register();
        register0.registerUser("", "hi!");
        register0.registerUser("", "");
        register0.registerUser("hi!", "");
        register0.loginUser("hi!", "hi!");
        java.lang.Class<?> wildcardClass13 = register0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test2267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest4.test2267");
        Register register0 = new Register();
        register0.runRegistrationSystem((int) (short) 0);
        register0.loginUser("hi!", "hi!");
        register0.loginUser("hi!", "");
        register0.loginUser("", "hi!");
        register0.registerUser("hi!", "");
        register0.runRegistrationSystem((int) (byte) 0);
    }

    @Test
    public void test2268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest4.test2268");
        Register register0 = new Register();
        register0.runRegistrationSystem((int) '#');
        register0.registerUser("", "hi!");
        register0.runRegistrationSystem((int) (short) 0);
        register0.runRegistrationSystem((int) (byte) 1);
        register0.runRegistrationSystem((int) 'a');
        register0.registerUser("hi!", "hi!");
        register0.registerUser("", "");
        register0.loginUser("", "hi!");
        register0.registerUser("", "hi!");
    }

    @Test
    public void test2269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest4.test2269");
        Register register0 = new Register();
        register0.loginUser("hi!", "hi!");
        register0.registerUser("hi!", "");
        register0.registerUser("", "");
        register0.registerUser("", "");
        register0.runRegistrationSystem((int) (byte) 100);
        register0.runRegistrationSystem((int) (short) -1);
        register0.runRegistrationSystem(1);
        register0.runRegistrationSystem((-1));
    }

    @Test
    public void test2270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest4.test2270");
        Register register0 = new Register();
        register0.loginUser("hi!", "hi!");
        register0.registerUser("hi!", "");
        register0.loginUser("hi!", "hi!");
        register0.registerUser("", "");
        register0.runRegistrationSystem(0);
        register0.registerUser("", "");
        register0.runRegistrationSystem((int) (byte) 100);
        register0.runRegistrationSystem(1);
    }

    @Test
    public void test2271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest4.test2271");
        Register register0 = new Register();
        register0.registerUser("hi!", "");
        register0.loginUser("", "hi!");
        register0.runRegistrationSystem((int) (byte) -1);
        register0.runRegistrationSystem(1);
        register0.loginUser("hi!", "");
        register0.runRegistrationSystem(0);
        register0.loginUser("", "hi!");
        register0.runRegistrationSystem((int) (short) 100);
        register0.registerUser("hi!", "");
        register0.registerUser("", "");
    }

    @Test
    public void test2272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest4.test2272");
        Register register0 = new Register();
        register0.runRegistrationSystem((int) '#');
        register0.loginUser("hi!", "hi!");
        register0.runRegistrationSystem((int) (byte) 10);
        register0.registerUser("hi!", "");
        register0.registerUser("hi!", "hi!");
        register0.registerUser("", "");
        register0.runRegistrationSystem((int) ' ');
    }

    @Test
    public void test2273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest4.test2273");
        Register register0 = new Register();
        register0.loginUser("hi!", "hi!");
        register0.registerUser("hi!", "");
        register0.registerUser("hi!", "");
        register0.registerUser("", "hi!");
        register0.loginUser("", "");
        register0.runRegistrationSystem((int) (short) -1);
        register0.loginUser("", "");
        register0.runRegistrationSystem((int) (byte) 100);
        register0.registerUser("", "");
        register0.registerUser("hi!", "hi!");
        register0.runRegistrationSystem(1);
        java.lang.Class<?> wildcardClass31 = register0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test2274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest4.test2274");
        Register register0 = new Register();
        register0.runRegistrationSystem((int) (short) 0);
        register0.loginUser("hi!", "hi!");
        register0.registerUser("", "");
        register0.runRegistrationSystem((int) '#');
        register0.registerUser("", "hi!");
        register0.registerUser("", "");
        register0.registerUser("hi!", "hi!");
    }

    @Test
    public void test2275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest4.test2275");
        Register register0 = new Register();
        register0.runRegistrationSystem((int) (short) 0);
        register0.loginUser("hi!", "hi!");
        register0.loginUser("", "");
        register0.registerUser("hi!", "");
        register0.registerUser("hi!", "hi!");
        register0.runRegistrationSystem((int) (byte) 1);
        register0.runRegistrationSystem((int) 'a');
        register0.registerUser("hi!", "");
        register0.registerUser("", "hi!");
        register0.runRegistrationSystem(1);
    }

    @Test
    public void test2276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest4.test2276");
        Register register0 = new Register();
        register0.loginUser("hi!", "hi!");
        register0.registerUser("hi!", "");
        register0.registerUser("hi!", "");
        register0.registerUser("", "");
        register0.runRegistrationSystem(100);
        register0.runRegistrationSystem((int) (byte) -1);
        register0.runRegistrationSystem(1);
        register0.loginUser("", "hi!");
        java.lang.Class<?> wildcardClass22 = register0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test2277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest4.test2277");
        Register register0 = new Register();
        register0.loginUser("hi!", "hi!");
        register0.registerUser("hi!", "");
        register0.registerUser("hi!", "");
        register0.registerUser("", "");
        register0.loginUser("", "hi!");
        register0.registerUser("", "hi!");
        register0.registerUser("", "");
        register0.runRegistrationSystem(1);
        register0.runRegistrationSystem((int) (short) 100);
    }

    @Test
    public void test2278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest4.test2278");
        Register register0 = new Register();
        register0.loginUser("hi!", "hi!");
        register0.registerUser("hi!", "");
        register0.registerUser("hi!", "");
        register0.registerUser("", "hi!");
        register0.loginUser("", "");
        register0.loginUser("hi!", "");
        register0.registerUser("", "");
        register0.registerUser("", "");
    }

    @Test
    public void test2279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest4.test2279");
        Register register0 = new Register();
        register0.runRegistrationSystem((int) (short) 0);
        register0.loginUser("hi!", "hi!");
        register0.registerUser("", "");
        register0.runRegistrationSystem((int) '#');
        register0.runRegistrationSystem((int) '#');
        register0.loginUser("hi!", "");
        register0.runRegistrationSystem((int) (short) 0);
        register0.registerUser("hi!", "");
        register0.loginUser("hi!", "");
        register0.registerUser("hi!", "");
    }

    @Test
    public void test2280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest4.test2280");
        Register register0 = new Register();
        register0.loginUser("hi!", "hi!");
        register0.registerUser("hi!", "");
        register0.registerUser("", "");
        register0.registerUser("hi!", "");
        register0.registerUser("hi!", "");
        register0.registerUser("", "");
        register0.runRegistrationSystem(100);
        register0.runRegistrationSystem(100);
        register0.loginUser("", "");
        register0.runRegistrationSystem((int) (short) 100);
        register0.loginUser("hi!", "hi!");
        register0.runRegistrationSystem((int) (byte) 10);
        register0.loginUser("hi!", "hi!");
    }

    @Test
    public void test2281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest4.test2281");
        Register register0 = new Register();
        register0.registerUser("hi!", "");
        register0.loginUser("", "hi!");
        register0.runRegistrationSystem((int) 'a');
        register0.loginUser("", "hi!");
        register0.loginUser("", "hi!");
        register0.loginUser("", "hi!");
        register0.registerUser("hi!", "hi!");
        register0.runRegistrationSystem((int) (short) 10);
        register0.registerUser("hi!", "");
        register0.runRegistrationSystem((-1));
        register0.loginUser("", "hi!");
    }

    @Test
    public void test2282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest4.test2282");
        Register register0 = new Register();
        register0.runRegistrationSystem((int) (short) 0);
        register0.loginUser("hi!", "hi!");
        register0.registerUser("", "");
        register0.runRegistrationSystem((int) '#');
        register0.runRegistrationSystem((int) (byte) 0);
        register0.runRegistrationSystem(0);
        register0.registerUser("", "");
        register0.registerUser("", "");
        register0.runRegistrationSystem((int) (short) 10);
        java.lang.Class<?> wildcardClass23 = register0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test2283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest4.test2283");
        Register register0 = new Register();
        register0.runRegistrationSystem((int) '#');
        register0.registerUser("", "hi!");
        register0.runRegistrationSystem((int) (short) 0);
        register0.runRegistrationSystem((int) (byte) 1);
        register0.runRegistrationSystem((int) 'a');
        register0.runRegistrationSystem(0);
        register0.loginUser("hi!", "");
        register0.runRegistrationSystem((int) (byte) -1);
        register0.registerUser("", "hi!");
        java.lang.Class<?> wildcardClass22 = register0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test2284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest4.test2284");
        Register register0 = new Register();
        register0.loginUser("", "hi!");
        register0.loginUser("", "hi!");
        register0.loginUser("hi!", "hi!");
        register0.registerUser("", "");
        register0.runRegistrationSystem((int) (short) 100);
        register0.loginUser("hi!", "");
        register0.registerUser("", "hi!");
        register0.loginUser("hi!", "hi!");
        register0.registerUser("", "hi!");
    }

    @Test
    public void test2285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest4.test2285");
        Register register0 = new Register();
        register0.runRegistrationSystem((int) (short) 0);
        register0.loginUser("hi!", "hi!");
        register0.registerUser("", "");
        register0.runRegistrationSystem((-1));
        register0.loginUser("hi!", "");
        register0.registerUser("hi!", "hi!");
        register0.runRegistrationSystem(1);
        register0.runRegistrationSystem((int) (short) 100);
        register0.registerUser("hi!", "");
        register0.runRegistrationSystem((int) (byte) 0);
    }

    @Test
    public void test2286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest4.test2286");
        Register register0 = new Register();
        register0.runRegistrationSystem((int) '#');
        register0.registerUser("", "hi!");
        register0.loginUser("hi!", "hi!");
        register0.runRegistrationSystem((int) '#');
        register0.registerUser("", "");
        register0.registerUser("", "hi!");
        java.lang.Class<?> wildcardClass17 = register0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test2287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest4.test2287");
        Register register0 = new Register();
        register0.loginUser("hi!", "hi!");
        register0.registerUser("hi!", "");
        register0.registerUser("hi!", "");
        register0.registerUser("", "hi!");
        register0.loginUser("", "");
        register0.loginUser("hi!", "");
        register0.runRegistrationSystem((int) (short) -1);
        register0.runRegistrationSystem((int) '#');
        register0.runRegistrationSystem(10);
        register0.registerUser("", "");
    }

    @Test
    public void test2288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest4.test2288");
        Register register0 = new Register();
        register0.registerUser("hi!", "");
        register0.registerUser("hi!", "");
        register0.loginUser("hi!", "");
        register0.loginUser("hi!", "");
        register0.loginUser("", "hi!");
        register0.loginUser("", "hi!");
        register0.registerUser("", "");
        register0.runRegistrationSystem((int) 'a');
        register0.runRegistrationSystem(0);
    }

    @Test
    public void test2289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest4.test2289");
        Register register0 = new Register();
        register0.registerUser("hi!", "");
        register0.loginUser("", "hi!");
        register0.runRegistrationSystem((int) (byte) -1);
        register0.runRegistrationSystem(1);
        register0.runRegistrationSystem(10);
    }

    @Test
    public void test2290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest4.test2290");
        Register register0 = new Register();
        register0.runRegistrationSystem((int) '#');
        register0.loginUser("hi!", "hi!");
        register0.loginUser("hi!", "hi!");
        register0.loginUser("hi!", "");
        register0.loginUser("", "");
        register0.runRegistrationSystem((int) (short) 10);
        register0.runRegistrationSystem((int) (byte) 1);
        register0.loginUser("hi!", "");
        register0.registerUser("", "hi!");
        java.lang.Class<?> wildcardClass25 = register0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test2291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest4.test2291");
        Register register0 = new Register();
        register0.loginUser("hi!", "hi!");
        register0.registerUser("hi!", "");
        register0.registerUser("hi!", "");
        register0.registerUser("", "");
        register0.runRegistrationSystem(100);
        register0.runRegistrationSystem((int) (byte) -1);
        register0.runRegistrationSystem(1);
        register0.loginUser("", "hi!");
        register0.registerUser("", "hi!");
        register0.registerUser("", "hi!");
        register0.loginUser("", "hi!");
        register0.runRegistrationSystem((int) ' ');
        register0.runRegistrationSystem(0);
        java.lang.Class<?> wildcardClass35 = register0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass35);
    }

    @Test
    public void test2292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest4.test2292");
        Register register0 = new Register();
        register0.loginUser("hi!", "hi!");
        register0.registerUser("hi!", "");
        register0.registerUser("hi!", "");
        register0.registerUser("", "hi!");
        register0.loginUser("", "");
        register0.loginUser("hi!", "");
        register0.runRegistrationSystem((int) (short) -1);
        register0.runRegistrationSystem(1);
        register0.loginUser("hi!", "");
        java.lang.Class<?> wildcardClass26 = register0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass26);
    }

    @Test
    public void test2293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest4.test2293");
        Register register0 = new Register();
        register0.runRegistrationSystem((int) (byte) -1);
        register0.registerUser("hi!", "");
        register0.runRegistrationSystem((int) (short) 1);
        register0.loginUser("", "");
        register0.loginUser("", "hi!");
        register0.loginUser("hi!", "hi!");
        register0.loginUser("", "");
        register0.loginUser("hi!", "hi!");
        register0.runRegistrationSystem((int) 'a');
    }

    @Test
    public void test2294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest4.test2294");
        Register register0 = new Register();
        register0.runRegistrationSystem((int) '#');
        register0.registerUser("", "hi!");
        register0.runRegistrationSystem((int) (short) 0);
        register0.runRegistrationSystem((int) (byte) 1);
        register0.registerUser("", "");
        register0.runRegistrationSystem((int) (short) 10);
        register0.runRegistrationSystem((int) (short) -1);
        register0.loginUser("hi!", "hi!");
        register0.loginUser("hi!", "hi!");
        register0.runRegistrationSystem((int) (short) 0);
    }

    @Test
    public void test2295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest4.test2295");
        Register register0 = new Register();
        register0.registerUser("hi!", "");
        register0.loginUser("", "");
        register0.runRegistrationSystem((int) 'a');
        register0.registerUser("", "");
        register0.registerUser("", "");
        register0.loginUser("", "hi!");
        register0.registerUser("", "hi!");
    }

    @Test
    public void test2296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest4.test2296");
        Register register0 = new Register();
        register0.registerUser("hi!", "");
        register0.loginUser("", "hi!");
        register0.runRegistrationSystem((int) 'a');
        register0.loginUser("", "hi!");
        register0.loginUser("", "hi!");
        register0.runRegistrationSystem((int) ' ');
        register0.registerUser("hi!", "hi!");
        register0.runRegistrationSystem(100);
        register0.registerUser("hi!", "");
        register0.runRegistrationSystem((-1));
        register0.loginUser("", "");
        register0.runRegistrationSystem((int) ' ');
        register0.loginUser("hi!", "");
    }

    @Test
    public void test2297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest4.test2297");
        Register register0 = new Register();
        register0.loginUser("hi!", "hi!");
        register0.registerUser("hi!", "hi!");
        register0.registerUser("", "hi!");
        register0.runRegistrationSystem((int) (byte) -1);
        register0.runRegistrationSystem((int) (short) 10);
        register0.runRegistrationSystem(0);
        register0.runRegistrationSystem((int) 'a');
    }

    @Test
    public void test2298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest4.test2298");
        Register register0 = new Register();
        register0.runRegistrationSystem((int) '#');
        register0.registerUser("", "hi!");
        register0.registerUser("hi!", "");
        register0.runRegistrationSystem((int) (byte) 100);
        register0.runRegistrationSystem((int) (byte) 1);
        java.lang.Class<?> wildcardClass13 = register0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test2299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest4.test2299");
        Register register0 = new Register();
        register0.loginUser("hi!", "hi!");
        register0.runRegistrationSystem(0);
        register0.registerUser("", "");
        register0.loginUser("", "hi!");
        register0.registerUser("", "");
        register0.loginUser("hi!", "hi!");
        register0.runRegistrationSystem(10);
        register0.loginUser("", "");
        register0.runRegistrationSystem((int) 'a');
        register0.runRegistrationSystem((int) (byte) 0);
    }

    @Test
    public void test2300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest4.test2300");
        Register register0 = new Register();
        register0.loginUser("hi!", "hi!");
        register0.registerUser("hi!", "");
        register0.registerUser("hi!", "");
        register0.loginUser("", "hi!");
        register0.runRegistrationSystem((int) (byte) 100);
        register0.loginUser("", "hi!");
    }

    @Test
    public void test2301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest4.test2301");
        Register register0 = new Register();
        register0.loginUser("hi!", "hi!");
        register0.runRegistrationSystem(0);
        register0.runRegistrationSystem(10);
        register0.loginUser("", "");
        register0.runRegistrationSystem((int) (short) 1);
        register0.registerUser("hi!", "hi!");
        java.lang.Class<?> wildcardClass16 = register0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test2302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest4.test2302");
        Register register0 = new Register();
        register0.runRegistrationSystem((int) (short) 0);
        register0.loginUser("hi!", "hi!");
        register0.loginUser("", "");
        register0.registerUser("hi!", "");
        register0.registerUser("hi!", "hi!");
        register0.runRegistrationSystem((int) 'a');
        register0.loginUser("hi!", "");
        register0.runRegistrationSystem((int) 'a');
        register0.loginUser("hi!", "");
    }

    @Test
    public void test2303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest4.test2303");
        Register register0 = new Register();
        register0.runRegistrationSystem((int) '#');
        register0.registerUser("", "hi!");
        register0.runRegistrationSystem((int) (short) 0);
        register0.runRegistrationSystem((int) (byte) 1);
        register0.registerUser("", "");
        register0.runRegistrationSystem((int) (short) 10);
        register0.runRegistrationSystem((int) (short) -1);
        register0.loginUser("hi!", "hi!");
        register0.loginUser("hi!", "hi!");
        java.lang.Class<?> wildcardClass23 = register0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test2304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest4.test2304");
        Register register0 = new Register();
        register0.runRegistrationSystem((int) (byte) -1);
        register0.runRegistrationSystem((int) (byte) 10);
        register0.registerUser("", "");
        register0.loginUser("", "");
        register0.registerUser("", "hi!");
        register0.registerUser("", "hi!");
        register0.loginUser("", "");
        register0.loginUser("", "hi!");
        register0.runRegistrationSystem((int) (short) 100);
        register0.loginUser("hi!", "hi!");
        register0.loginUser("", "");
        register0.loginUser("hi!", "");
    }

    @Test
    public void test2305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest4.test2305");
        Register register0 = new Register();
        register0.registerUser("hi!", "");
        register0.loginUser("", "hi!");
        register0.runRegistrationSystem((int) (byte) -1);
        register0.runRegistrationSystem(1);
        register0.loginUser("hi!", "");
        register0.runRegistrationSystem(0);
        register0.registerUser("", "");
        register0.loginUser("", "");
        register0.runRegistrationSystem((int) (short) 10);
        register0.loginUser("hi!", "");
        register0.registerUser("hi!", "");
        register0.loginUser("hi!", "hi!");
        register0.loginUser("", "");
    }

    @Test
    public void test2306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest4.test2306");
        Register register0 = new Register();
        register0.loginUser("hi!", "hi!");
        register0.registerUser("hi!", "hi!");
        register0.loginUser("", "");
        register0.loginUser("hi!", "");
        register0.runRegistrationSystem((int) (short) 10);
        register0.registerUser("", "hi!");
    }

    @Test
    public void test2307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest4.test2307");
        Register register0 = new Register();
        register0.runRegistrationSystem((int) '#');
        register0.registerUser("", "hi!");
        register0.loginUser("hi!", "hi!");
        register0.loginUser("", "hi!");
        register0.runRegistrationSystem((int) (byte) 1);
        register0.runRegistrationSystem(0);
        register0.loginUser("", "hi!");
        register0.registerUser("", "hi!");
    }

    @Test
    public void test2308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest4.test2308");
        Register register0 = new Register();
        register0.runRegistrationSystem((int) (short) 0);
        register0.loginUser("hi!", "hi!");
        register0.loginUser("", "");
        register0.registerUser("hi!", "");
        register0.registerUser("hi!", "hi!");
        register0.runRegistrationSystem((int) (byte) 1);
        register0.runRegistrationSystem((int) 'a');
        register0.registerUser("hi!", "");
        register0.runRegistrationSystem(10);
        register0.registerUser("hi!", "hi!");
        register0.loginUser("hi!", "");
    }

    @Test
    public void test2309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest4.test2309");
        Register register0 = new Register();
        register0.runRegistrationSystem((int) (byte) -1);
        register0.registerUser("hi!", "");
        register0.loginUser("hi!", "hi!");
        register0.loginUser("hi!", "");
        register0.registerUser("hi!", "");
        register0.registerUser("hi!", "hi!");
        register0.runRegistrationSystem((int) (short) 10);
        register0.loginUser("", "");
        java.lang.Class<?> wildcardClass23 = register0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test2310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest4.test2310");
        Register register0 = new Register();
        register0.loginUser("hi!", "hi!");
        register0.registerUser("hi!", "");
        register0.registerUser("", "");
        register0.registerUser("", "hi!");
        register0.runRegistrationSystem((int) (short) 100);
        register0.loginUser("hi!", "hi!");
        register0.registerUser("hi!", "hi!");
        register0.registerUser("", "");
    }

    @Test
    public void test2311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest4.test2311");
        Register register0 = new Register();
        register0.loginUser("hi!", "hi!");
        register0.registerUser("hi!", "");
        register0.loginUser("hi!", "hi!");
        register0.runRegistrationSystem(100);
        register0.runRegistrationSystem((int) (byte) 1);
        register0.loginUser("", "");
        register0.registerUser("hi!", "hi!");
        register0.runRegistrationSystem((int) 'a');
    }

    @Test
    public void test2312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest4.test2312");
        Register register0 = new Register();
        register0.registerUser("hi!", "");
        register0.runRegistrationSystem(1);
        register0.registerUser("", "");
        register0.registerUser("hi!", "");
        register0.runRegistrationSystem((int) '4');
        register0.runRegistrationSystem((int) (short) -1);
    }

    @Test
    public void test2313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest4.test2313");
        Register register0 = new Register();
        register0.registerUser("hi!", "");
        register0.loginUser("", "hi!");
        register0.runRegistrationSystem((int) 'a');
        register0.loginUser("", "hi!");
        register0.loginUser("", "hi!");
        register0.runRegistrationSystem((int) ' ');
        register0.registerUser("hi!", "hi!");
        register0.runRegistrationSystem(100);
        register0.registerUser("hi!", "");
        register0.runRegistrationSystem((-1));
        register0.loginUser("", "hi!");
    }

    @Test
    public void test2314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest4.test2314");
        Register register0 = new Register();
        register0.runRegistrationSystem((int) (byte) -1);
        register0.registerUser("hi!", "");
        register0.loginUser("hi!", "hi!");
        register0.loginUser("hi!", "");
        register0.loginUser("", "");
        register0.runRegistrationSystem(1);
        register0.loginUser("hi!", "hi!");
        register0.loginUser("hi!", "");
        register0.loginUser("", "");
        register0.loginUser("", "");
    }

    @Test
    public void test2315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest4.test2315");
        Register register0 = new Register();
        register0.registerUser("hi!", "");
        register0.registerUser("hi!", "");
        register0.runRegistrationSystem((int) (byte) 0);
        register0.registerUser("", "");
        register0.runRegistrationSystem((int) (byte) 10);
        register0.registerUser("", "hi!");
        register0.runRegistrationSystem((int) (byte) 1);
    }

    @Test
    public void test2316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest4.test2316");
        Register register0 = new Register();
        register0.loginUser("hi!", "hi!");
        register0.registerUser("hi!", "");
        register0.registerUser("", "");
        register0.runRegistrationSystem((int) (byte) 100);
        register0.registerUser("", "hi!");
        register0.runRegistrationSystem((int) (short) 10);
        register0.loginUser("hi!", "");
    }

    @Test
    public void test2317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest4.test2317");
        Register register0 = new Register();
        register0.runRegistrationSystem((int) (short) 0);
        register0.loginUser("hi!", "hi!");
        register0.registerUser("", "");
        register0.runRegistrationSystem((int) '#');
        register0.registerUser("", "hi!");
        register0.registerUser("", "hi!");
        register0.registerUser("hi!", "hi!");
        register0.runRegistrationSystem((int) (byte) 100);
        register0.loginUser("", "hi!");
        register0.registerUser("hi!", "hi!");
        register0.loginUser("", "hi!");
    }

    @Test
    public void test2318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest4.test2318");
        Register register0 = new Register();
        register0.registerUser("hi!", "");
        register0.registerUser("hi!", "");
        register0.runRegistrationSystem((int) (byte) 0);
        register0.runRegistrationSystem((int) (short) 10);
        register0.registerUser("", "");
        register0.registerUser("", "");
        register0.registerUser("", "hi!");
    }

    @Test
    public void test2319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest4.test2319");
        Register register0 = new Register();
        register0.runRegistrationSystem((int) (short) 0);
        register0.loginUser("hi!", "hi!");
        register0.registerUser("", "");
        register0.runRegistrationSystem((-1));
        register0.runRegistrationSystem((int) (short) 0);
        register0.registerUser("", "");
        register0.runRegistrationSystem((int) (short) -1);
        register0.loginUser("hi!", "");
        register0.runRegistrationSystem(0);
        register0.registerUser("hi!", "hi!");
        register0.runRegistrationSystem(1);
        register0.loginUser("", "");
    }

    @Test
    public void test2320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest4.test2320");
        Register register0 = new Register();
        register0.runRegistrationSystem((int) (byte) -1);
        register0.registerUser("hi!", "");
        register0.runRegistrationSystem((int) (short) 1);
        register0.loginUser("", "hi!");
        register0.loginUser("hi!", "");
        register0.registerUser("hi!", "");
    }

    @Test
    public void test2321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest4.test2321");
        Register register0 = new Register();
        register0.runRegistrationSystem((int) '#');
        register0.registerUser("", "hi!");
        register0.runRegistrationSystem((int) (short) 0);
        register0.runRegistrationSystem((int) (byte) 1);
        register0.registerUser("", "");
        register0.runRegistrationSystem((int) (short) 10);
        register0.loginUser("hi!", "");
        register0.registerUser("hi!", "hi!");
        register0.runRegistrationSystem((int) 'a');
        register0.registerUser("hi!", "");
    }

    @Test
    public void test2322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest4.test2322");
        Register register0 = new Register();
        register0.runRegistrationSystem((int) (short) 0);
        register0.loginUser("hi!", "hi!");
        register0.registerUser("", "");
        register0.runRegistrationSystem((-1));
        register0.runRegistrationSystem((int) (short) 0);
        register0.runRegistrationSystem((int) ' ');
        register0.loginUser("hi!", "hi!");
        register0.loginUser("hi!", "");
        register0.loginUser("hi!", "hi!");
    }

    @Test
    public void test2323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest4.test2323");
        Register register0 = new Register();
        register0.loginUser("hi!", "hi!");
        register0.registerUser("hi!", "");
        register0.registerUser("", "");
        register0.registerUser("hi!", "");
        register0.registerUser("hi!", "");
        register0.registerUser("", "");
        register0.loginUser("", "");
        register0.runRegistrationSystem((int) (short) 10);
        register0.loginUser("", "hi!");
        register0.loginUser("hi!", "");
        register0.loginUser("", "hi!");
    }

    @Test
    public void test2324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest4.test2324");
        Register register0 = new Register();
        register0.runRegistrationSystem((int) (short) 0);
        register0.loginUser("hi!", "hi!");
        register0.registerUser("", "");
        register0.loginUser("", "hi!");
        register0.registerUser("hi!", "");
        register0.registerUser("hi!", "");
        register0.runRegistrationSystem((int) (byte) 1);
        register0.runRegistrationSystem(0);
    }

    @Test
    public void test2325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest4.test2325");
        Register register0 = new Register();
        register0.runRegistrationSystem((int) (short) 0);
        register0.loginUser("hi!", "hi!");
        register0.registerUser("", "");
        register0.runRegistrationSystem((int) '#');
        register0.runRegistrationSystem((int) (byte) 0);
        register0.runRegistrationSystem(0);
        register0.registerUser("", "hi!");
        register0.registerUser("", "hi!");
        register0.registerUser("hi!", "");
        register0.registerUser("", "");
    }

    @Test
    public void test2326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest4.test2326");
        Register register0 = new Register();
        register0.runRegistrationSystem((int) (short) 0);
        register0.loginUser("hi!", "hi!");
        register0.registerUser("", "");
        register0.runRegistrationSystem((-1));
        register0.registerUser("", "");
        register0.loginUser("", "");
        register0.loginUser("hi!", "hi!");
        register0.runRegistrationSystem((int) (byte) 0);
        register0.loginUser("", "");
        register0.loginUser("hi!", "hi!");
    }

    @Test
    public void test2327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest4.test2327");
        Register register0 = new Register();
        register0.runRegistrationSystem((int) (byte) -1);
        register0.runRegistrationSystem((int) (short) 10);
        register0.runRegistrationSystem(10);
        register0.loginUser("", "");
        register0.registerUser("hi!", "hi!");
        register0.runRegistrationSystem((int) (short) 10);
        register0.runRegistrationSystem(0);
        register0.runRegistrationSystem((int) (byte) 10);
        register0.registerUser("hi!", "");
    }

    @Test
    public void test2328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest4.test2328");
        Register register0 = new Register();
        register0.loginUser("hi!", "hi!");
        register0.registerUser("hi!", "");
        register0.loginUser("hi!", "hi!");
        register0.runRegistrationSystem(100);
        register0.runRegistrationSystem((int) (byte) 1);
        register0.registerUser("", "");
        register0.registerUser("hi!", "hi!");
        register0.loginUser("hi!", "hi!");
        register0.loginUser("", "hi!");
    }

    @Test
    public void test2329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest4.test2329");
        Register register0 = new Register();
        register0.loginUser("hi!", "hi!");
        register0.registerUser("hi!", "");
        register0.registerUser("hi!", "");
        register0.registerUser("", "");
        register0.runRegistrationSystem(100);
        register0.runRegistrationSystem((int) (byte) -1);
        register0.runRegistrationSystem(1);
        register0.loginUser("", "hi!");
        register0.registerUser("", "hi!");
        register0.loginUser("hi!", "hi!");
        java.lang.Class<?> wildcardClass28 = register0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test2330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest4.test2330");
        Register register0 = new Register();
        register0.registerUser("hi!", "");
        register0.loginUser("", "hi!");
        register0.runRegistrationSystem((int) 'a');
        register0.loginUser("hi!", "");
        register0.runRegistrationSystem((-1));
        register0.registerUser("hi!", "");
        register0.registerUser("hi!", "hi!");
        register0.loginUser("", "hi!");
        register0.loginUser("", "hi!");
    }

    @Test
    public void test2331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest4.test2331");
        Register register0 = new Register();
        register0.runRegistrationSystem((int) '#');
        register0.registerUser("", "hi!");
        register0.runRegistrationSystem((int) (short) 0);
        register0.runRegistrationSystem((int) (byte) 1);
        register0.runRegistrationSystem((int) 'a');
        register0.registerUser("hi!", "hi!");
        register0.runRegistrationSystem((int) '4');
        register0.runRegistrationSystem((int) (short) -1);
        register0.registerUser("", "hi!");
        register0.loginUser("", "");
    }

    @Test
    public void test2332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest4.test2332");
        Register register0 = new Register();
        register0.runRegistrationSystem((int) '#');
        register0.registerUser("", "hi!");
        register0.loginUser("hi!", "hi!");
        register0.runRegistrationSystem(100);
        register0.loginUser("", "hi!");
        register0.loginUser("hi!", "");
    }

    @Test
    public void test2333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest4.test2333");
        Register register0 = new Register();
        register0.registerUser("hi!", "");
        register0.runRegistrationSystem(1);
        register0.registerUser("", "");
        register0.registerUser("hi!", "");
        register0.registerUser("hi!", "");
        register0.runRegistrationSystem((int) (short) -1);
    }

    @Test
    public void test2334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest4.test2334");
        Register register0 = new Register();
        register0.loginUser("hi!", "hi!");
        register0.runRegistrationSystem(0);
        register0.registerUser("", "");
        register0.runRegistrationSystem((-1));
        register0.loginUser("", "");
        register0.registerUser("hi!", "hi!");
        register0.registerUser("", "");
        register0.registerUser("", "");
        register0.loginUser("", "");
    }

    @Test
    public void test2335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest4.test2335");
        Register register0 = new Register();
        register0.loginUser("hi!", "hi!");
        register0.registerUser("hi!", "hi!");
        register0.loginUser("", "");
        register0.loginUser("hi!", "");
        register0.runRegistrationSystem((int) (short) 10);
        register0.loginUser("", "");
        register0.runRegistrationSystem((int) (byte) 100);
        register0.registerUser("hi!", "");
        register0.loginUser("hi!", "");
        register0.loginUser("", "hi!");
        register0.runRegistrationSystem((int) 'a');
    }

    @Test
    public void test2336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest4.test2336");
        Register register0 = new Register();
        register0.loginUser("hi!", "hi!");
        register0.registerUser("hi!", "");
        register0.registerUser("hi!", "");
        register0.registerUser("", "");
        register0.runRegistrationSystem(100);
        register0.runRegistrationSystem((int) (byte) -1);
        register0.registerUser("hi!", "hi!");
        register0.registerUser("hi!", "hi!");
        register0.runRegistrationSystem((int) (byte) 0);
    }

    @Test
    public void test2337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest4.test2337");
        Register register0 = new Register();
        register0.runRegistrationSystem((int) (byte) -1);
        register0.runRegistrationSystem((int) '#');
        register0.loginUser("", "");
        register0.runRegistrationSystem((int) (short) 0);
        register0.loginUser("hi!", "");
        register0.runRegistrationSystem((int) (byte) 10);
        java.lang.Class<?> wildcardClass15 = register0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test2338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest4.test2338");
        Register register0 = new Register();
        register0.runRegistrationSystem((int) (byte) -1);
        register0.runRegistrationSystem((int) (short) 10);
        register0.loginUser("", "");
        register0.registerUser("", "");
        java.lang.Class<?> wildcardClass11 = register0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test2339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest4.test2339");
        Register register0 = new Register();
        register0.registerUser("hi!", "");
        register0.loginUser("", "hi!");
        register0.runRegistrationSystem((int) (byte) -1);
        register0.runRegistrationSystem(10);
        register0.registerUser("", "hi!");
        register0.loginUser("hi!", "");
        register0.registerUser("hi!", "hi!");
        register0.loginUser("hi!", "");
        register0.loginUser("hi!", "hi!");
    }

    @Test
    public void test2340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest4.test2340");
        Register register0 = new Register();
        register0.registerUser("hi!", "");
        register0.loginUser("", "hi!");
        register0.runRegistrationSystem((int) 'a');
        register0.loginUser("", "hi!");
        register0.runRegistrationSystem((int) 'a');
        register0.registerUser("hi!", "hi!");
        java.lang.Class<?> wildcardClass17 = register0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test2341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest4.test2341");
        Register register0 = new Register();
        register0.runRegistrationSystem((int) (byte) -1);
        register0.registerUser("hi!", "");
        register0.loginUser("hi!", "hi!");
        register0.loginUser("hi!", "");
        register0.loginUser("hi!", "");
        register0.registerUser("", "hi!");
        register0.loginUser("hi!", "");
        register0.runRegistrationSystem((int) (byte) -1);
        register0.registerUser("hi!", "hi!");
    }

    @Test
    public void test2342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest4.test2342");
        Register register0 = new Register();
        register0.registerUser("hi!", "");
        register0.loginUser("", "hi!");
        register0.runRegistrationSystem((int) 'a');
        register0.loginUser("hi!", "");
        register0.runRegistrationSystem((int) (byte) 1);
        register0.registerUser("hi!", "");
        register0.runRegistrationSystem(0);
        register0.runRegistrationSystem((int) (short) 10);
    }

    @Test
    public void test2343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest4.test2343");
        Register register0 = new Register();
        register0.runRegistrationSystem((int) (short) 0);
        register0.loginUser("hi!", "hi!");
        register0.loginUser("", "");
        register0.registerUser("hi!", "");
        register0.registerUser("hi!", "hi!");
        register0.runRegistrationSystem((int) 'a');
        register0.runRegistrationSystem((int) (short) 10);
        java.lang.Class<?> wildcardClass19 = register0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test2344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest4.test2344");
        Register register0 = new Register();
        register0.registerUser("hi!", "");
        register0.loginUser("", "hi!");
        register0.runRegistrationSystem((int) (byte) -1);
        register0.runRegistrationSystem(10);
        register0.registerUser("", "hi!");
        register0.loginUser("hi!", "");
        register0.runRegistrationSystem((int) '#');
    }

    @Test
    public void test2345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest4.test2345");
        Register register0 = new Register();
        register0.registerUser("hi!", "");
        register0.runRegistrationSystem(1);
        register0.loginUser("hi!", "");
        register0.loginUser("hi!", "hi!");
    }

    @Test
    public void test2346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest4.test2346");
        Register register0 = new Register();
        register0.runRegistrationSystem((int) (byte) -1);
        register0.runRegistrationSystem((int) '#');
        register0.runRegistrationSystem(100);
        register0.registerUser("hi!", "hi!");
        register0.loginUser("hi!", "");
        register0.runRegistrationSystem((int) '#');
        register0.registerUser("", "hi!");
        register0.loginUser("", "hi!");
    }

    @Test
    public void test2347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest4.test2347");
        Register register0 = new Register();
        register0.runRegistrationSystem((int) '#');
        register0.registerUser("", "hi!");
        register0.runRegistrationSystem((int) (short) 0);
        register0.runRegistrationSystem((int) (byte) 1);
        register0.runRegistrationSystem((int) 'a');
        register0.registerUser("", "");
        register0.registerUser("hi!", "hi!");
        register0.loginUser("hi!", "");
        register0.runRegistrationSystem((int) (short) -1);
        register0.registerUser("hi!", "hi!");
    }

    @Test
    public void test2348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest4.test2348");
        Register register0 = new Register();
        register0.runRegistrationSystem((int) '#');
        register0.registerUser("", "hi!");
        register0.runRegistrationSystem((int) (short) 0);
        register0.runRegistrationSystem((int) (byte) 1);
        register0.runRegistrationSystem((int) 'a');
        register0.registerUser("hi!", "hi!");
        register0.loginUser("hi!", "hi!");
        register0.runRegistrationSystem((int) (short) 100);
    }

    @Test
    public void test2349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest4.test2349");
        Register register0 = new Register();
        register0.loginUser("hi!", "hi!");
        register0.registerUser("hi!", "");
        register0.loginUser("hi!", "hi!");
        register0.registerUser("", "");
        register0.runRegistrationSystem(0);
        register0.registerUser("", "");
        register0.runRegistrationSystem((int) '#');
        register0.runRegistrationSystem((int) '#');
        register0.loginUser("", "");
    }

    @Test
    public void test2350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest4.test2350");
        Register register0 = new Register();
        register0.runRegistrationSystem((int) (byte) -1);
        register0.runRegistrationSystem((int) (short) 10);
        register0.runRegistrationSystem((int) (byte) -1);
        register0.runRegistrationSystem(10);
        register0.loginUser("", "hi!");
        java.lang.Class<?> wildcardClass12 = register0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test2351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest4.test2351");
        Register register0 = new Register();
        register0.loginUser("hi!", "hi!");
        register0.registerUser("hi!", "");
        register0.registerUser("", "");
        register0.registerUser("", "hi!");
        register0.registerUser("", "");
        register0.registerUser("hi!", "hi!");
        register0.registerUser("hi!", "");
        register0.registerUser("", "hi!");
    }

    @Test
    public void test2352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest4.test2352");
        Register register0 = new Register();
        register0.runRegistrationSystem((int) (byte) -1);
        register0.registerUser("hi!", "");
        register0.runRegistrationSystem((int) (short) 1);
        register0.loginUser("", "");
        register0.loginUser("", "hi!");
        register0.runRegistrationSystem(100);
        register0.runRegistrationSystem((int) '4');
        register0.registerUser("", "");
    }

    @Test
    public void test2353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest4.test2353");
        Register register0 = new Register();
        register0.registerUser("hi!", "");
        register0.loginUser("", "hi!");
        register0.runRegistrationSystem((int) 'a');
        register0.loginUser("", "hi!");
        register0.loginUser("", "hi!");
        register0.registerUser("", "");
        register0.registerUser("", "hi!");
        register0.loginUser("hi!", "");
        register0.runRegistrationSystem((int) (short) 1);
        register0.runRegistrationSystem((int) (byte) 1);
    }

    @Test
    public void test2354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest4.test2354");
        Register register0 = new Register();
        register0.runRegistrationSystem((int) (byte) -1);
        register0.registerUser("hi!", "");
        register0.runRegistrationSystem((int) (short) 1);
        register0.loginUser("", "hi!");
        register0.registerUser("", "");
        register0.runRegistrationSystem((int) (short) 0);
        register0.loginUser("", "");
        register0.registerUser("hi!", "hi!");
        register0.loginUser("hi!", "hi!");
    }

    @Test
    public void test2355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest4.test2355");
        Register register0 = new Register();
        register0.loginUser("hi!", "hi!");
        register0.runRegistrationSystem(0);
        register0.loginUser("hi!", "");
        register0.runRegistrationSystem((int) (short) -1);
    }

    @Test
    public void test2356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest4.test2356");
        Register register0 = new Register();
        register0.loginUser("hi!", "hi!");
        register0.registerUser("hi!", "");
        register0.registerUser("", "");
        register0.registerUser("hi!", "");
        register0.runRegistrationSystem((int) (byte) 0);
        register0.registerUser("", "");
        register0.loginUser("", "");
        register0.runRegistrationSystem((int) '#');
        register0.loginUser("hi!", "hi!");
        register0.loginUser("", "");
        java.lang.Class<?> wildcardClass29 = register0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass29);
    }

    @Test
    public void test2357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest4.test2357");
        Register register0 = new Register();
        register0.loginUser("hi!", "hi!");
        register0.registerUser("hi!", "");
        register0.registerUser("hi!", "");
        register0.registerUser("", "hi!");
        register0.loginUser("", "");
        register0.runRegistrationSystem((int) (short) -1);
        register0.registerUser("hi!", "");
        register0.runRegistrationSystem((int) (byte) 10);
        register0.loginUser("hi!", "");
        register0.loginUser("hi!", "");
        register0.registerUser("", "hi!");
    }

    @Test
    public void test2358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest4.test2358");
        Register register0 = new Register();
        register0.runRegistrationSystem((int) (byte) -1);
        register0.runRegistrationSystem((int) '#');
        register0.registerUser("hi!", "hi!");
        register0.runRegistrationSystem((int) (short) 10);
        register0.runRegistrationSystem(0);
        register0.registerUser("", "");
        register0.registerUser("hi!", "");
        register0.runRegistrationSystem(0);
        register0.registerUser("", "hi!");
    }

    @Test
    public void test2359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest4.test2359");
        Register register0 = new Register();
        register0.loginUser("hi!", "hi!");
        register0.registerUser("hi!", "");
        register0.registerUser("", "");
        register0.registerUser("", "hi!");
        register0.runRegistrationSystem((int) (short) 100);
        register0.runRegistrationSystem((int) (byte) 10);
        register0.registerUser("hi!", "hi!");
    }

    @Test
    public void test2360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest4.test2360");
        Register register0 = new Register();
        register0.runRegistrationSystem((int) (byte) -1);
        register0.registerUser("hi!", "");
        register0.loginUser("hi!", "hi!");
        register0.loginUser("hi!", "");
        register0.runRegistrationSystem((int) (byte) 10);
        register0.registerUser("hi!", "hi!");
        register0.registerUser("", "");
        register0.loginUser("hi!", "");
    }

    @Test
    public void test2361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest4.test2361");
        Register register0 = new Register();
        register0.registerUser("hi!", "");
        register0.runRegistrationSystem(1);
        register0.registerUser("", "");
        register0.runRegistrationSystem((int) (short) 10);
        register0.loginUser("hi!", "");
        register0.loginUser("", "hi!");
        java.lang.Class<?> wildcardClass17 = register0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test2362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest4.test2362");
        Register register0 = new Register();
        register0.loginUser("hi!", "hi!");
        register0.registerUser("hi!", "");
        register0.registerUser("", "");
        register0.registerUser("", "hi!");
        register0.loginUser("", "hi!");
        register0.registerUser("hi!", "hi!");
        register0.loginUser("", "");
        register0.registerUser("", "");
    }

    @Test
    public void test2363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest4.test2363");
        Register register0 = new Register();
        register0.runRegistrationSystem((int) (byte) -1);
        register0.registerUser("hi!", "");
        register0.loginUser("hi!", "hi!");
        register0.runRegistrationSystem((int) (byte) 1);
        register0.registerUser("", "hi!");
        register0.runRegistrationSystem((int) 'a');
        register0.registerUser("", "");
        java.lang.Class<?> wildcardClass19 = register0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test2364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest4.test2364");
        Register register0 = new Register();
        register0.loginUser("hi!", "hi!");
        register0.registerUser("hi!", "");
        register0.registerUser("", "");
        register0.registerUser("", "hi!");
        register0.runRegistrationSystem((int) (short) 100);
        register0.registerUser("", "hi!");
        register0.runRegistrationSystem(0);
        register0.loginUser("hi!", "hi!");
        register0.loginUser("", "");
    }

    @Test
    public void test2365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest4.test2365");
        Register register0 = new Register();
        register0.loginUser("hi!", "hi!");
        register0.registerUser("hi!", "");
        register0.registerUser("hi!", "");
        register0.registerUser("", "");
        register0.runRegistrationSystem(100);
        register0.loginUser("", "");
        register0.runRegistrationSystem((int) (short) 0);
        register0.runRegistrationSystem(1);
        register0.loginUser("", "");
    }

    @Test
    public void test2366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest4.test2366");
        Register register0 = new Register();
        register0.loginUser("hi!", "hi!");
        register0.loginUser("hi!", "hi!");
        register0.registerUser("", "");
        register0.registerUser("hi!", "hi!");
        register0.runRegistrationSystem(10);
        register0.registerUser("", "hi!");
    }

    @Test
    public void test2367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest4.test2367");
        Register register0 = new Register();
        register0.runRegistrationSystem((int) (short) 0);
        register0.loginUser("hi!", "hi!");
        register0.registerUser("", "");
        register0.runRegistrationSystem((-1));
        register0.runRegistrationSystem((int) (short) 10);
        register0.runRegistrationSystem(0);
        register0.registerUser("", "hi!");
        register0.loginUser("hi!", "");
        register0.loginUser("", "hi!");
    }

    @Test
    public void test2368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest4.test2368");
        Register register0 = new Register();
        register0.loginUser("", "hi!");
        register0.loginUser("", "hi!");
        register0.loginUser("hi!", "hi!");
        register0.runRegistrationSystem((int) '4');
        register0.loginUser("", "");
        register0.registerUser("", "hi!");
        register0.registerUser("", "");
        register0.loginUser("hi!", "hi!");
        register0.runRegistrationSystem((int) (short) 100);
        register0.loginUser("hi!", "");
    }

    @Test
    public void test2369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest4.test2369");
        Register register0 = new Register();
        register0.runRegistrationSystem((int) (byte) -1);
        register0.registerUser("hi!", "");
        register0.loginUser("hi!", "hi!");
        register0.loginUser("", "");
        register0.loginUser("hi!", "hi!");
    }

    @Test
    public void test2370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest4.test2370");
        Register register0 = new Register();
        register0.runRegistrationSystem((int) '#');
        register0.loginUser("hi!", "hi!");
        register0.loginUser("hi!", "hi!");
        register0.loginUser("hi!", "");
        register0.registerUser("", "hi!");
        register0.loginUser("", "hi!");
        register0.runRegistrationSystem((int) (short) 0);
    }

    @Test
    public void test2371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest4.test2371");
        Register register0 = new Register();
        register0.loginUser("hi!", "hi!");
        register0.loginUser("", "hi!");
        register0.runRegistrationSystem((int) (byte) 0);
        register0.registerUser("", "");
        register0.registerUser("", "hi!");
        register0.registerUser("hi!", "hi!");
        register0.loginUser("hi!", "hi!");
    }

    @Test
    public void test2372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest4.test2372");
        Register register0 = new Register();
        register0.loginUser("hi!", "hi!");
        register0.registerUser("hi!", "");
        register0.registerUser("hi!", "");
        register0.registerUser("", "hi!");
        register0.loginUser("", "");
        register0.registerUser("", "hi!");
        register0.registerUser("", "hi!");
        register0.runRegistrationSystem((int) '#');
    }

    @Test
    public void test2373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest4.test2373");
        Register register0 = new Register();
        register0.runRegistrationSystem((int) '#');
        register0.registerUser("", "hi!");
        register0.runRegistrationSystem((int) (short) 0);
        register0.runRegistrationSystem((int) (byte) 1);
        register0.runRegistrationSystem((int) 'a');
        register0.registerUser("", "");
        register0.registerUser("", "hi!");
        register0.registerUser("hi!", "");
    }

    @Test
    public void test2374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest4.test2374");
        Register register0 = new Register();
        register0.loginUser("hi!", "hi!");
        register0.registerUser("hi!", "");
        register0.registerUser("hi!", "");
        register0.registerUser("", "hi!");
        register0.loginUser("", "");
        register0.runRegistrationSystem((int) (short) -1);
        register0.registerUser("hi!", "");
        register0.runRegistrationSystem((int) (byte) 10);
        register0.registerUser("hi!", "hi!");
        register0.registerUser("hi!", "hi!");
        register0.loginUser("hi!", "");
        register0.loginUser("", "");
        register0.loginUser("hi!", "");
    }

    @Test
    public void test2375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest4.test2375");
        Register register0 = new Register();
        register0.runRegistrationSystem((int) '#');
        register0.runRegistrationSystem((int) (short) 100);
        register0.runRegistrationSystem((int) '4');
        register0.runRegistrationSystem((int) (short) -1);
        register0.loginUser("", "hi!");
        java.lang.Class<?> wildcardClass12 = register0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test2376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest4.test2376");
        Register register0 = new Register();
        register0.loginUser("hi!", "hi!");
        register0.registerUser("hi!", "");
        register0.registerUser("hi!", "");
        register0.registerUser("", "hi!");
        register0.loginUser("", "");
        register0.runRegistrationSystem((int) (short) -1);
        register0.registerUser("hi!", "");
        register0.registerUser("", "hi!");
    }

    @Test
    public void test2377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest4.test2377");
        Register register0 = new Register();
        register0.registerUser("hi!", "");
        register0.loginUser("", "hi!");
        register0.runRegistrationSystem((int) 'a');
        register0.loginUser("", "hi!");
        register0.runRegistrationSystem((int) (byte) -1);
        register0.runRegistrationSystem((int) (short) 1);
        java.lang.Class<?> wildcardClass16 = register0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test2378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest4.test2378");
        Register register0 = new Register();
        register0.registerUser("hi!", "");
        register0.loginUser("", "hi!");
        register0.runRegistrationSystem((int) (byte) -1);
        register0.runRegistrationSystem(1);
        register0.loginUser("hi!", "");
        register0.runRegistrationSystem(0);
        register0.registerUser("", "");
        register0.loginUser("", "");
        register0.loginUser("hi!", "");
        register0.loginUser("", "");
        java.lang.Class<?> wildcardClass28 = register0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test2379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest4.test2379");
        Register register0 = new Register();
        register0.runRegistrationSystem((int) (byte) -1);
        register0.registerUser("hi!", "");
        register0.runRegistrationSystem((int) (short) 1);
        register0.loginUser("", "hi!");
        register0.registerUser("", "");
        register0.runRegistrationSystem((int) (short) 0);
        register0.loginUser("", "");
        register0.registerUser("hi!", "hi!");
        register0.runRegistrationSystem((int) (short) 0);
        register0.runRegistrationSystem((int) (byte) 1);
        register0.registerUser("", "");
        register0.runRegistrationSystem(0);
    }

    @Test
    public void test2380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest4.test2380");
        Register register0 = new Register();
        register0.runRegistrationSystem((int) (byte) -1);
        register0.runRegistrationSystem((int) (byte) 10);
        register0.registerUser("", "");
        register0.loginUser("", "");
        register0.runRegistrationSystem((int) (byte) 100);
    }

    @Test
    public void test2381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest4.test2381");
        Register register0 = new Register();
        register0.runRegistrationSystem((int) (byte) -1);
        register0.registerUser("hi!", "");
        register0.loginUser("hi!", "hi!");
        register0.runRegistrationSystem((int) (short) -1);
        java.lang.Class<?> wildcardClass11 = register0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test2382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest4.test2382");
        Register register0 = new Register();
        register0.runRegistrationSystem((int) (byte) -1);
        register0.runRegistrationSystem((int) (byte) 10);
        register0.registerUser("", "");
        register0.loginUser("", "");
        register0.registerUser("", "hi!");
        register0.registerUser("hi!", "");
        register0.runRegistrationSystem((int) (short) 100);
        register0.loginUser("hi!", "hi!");
    }

    @Test
    public void test2383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest4.test2383");
        Register register0 = new Register();
        register0.loginUser("hi!", "hi!");
        register0.registerUser("hi!", "");
        register0.registerUser("hi!", "");
        register0.registerUser("", "hi!");
        register0.loginUser("", "");
        register0.registerUser("", "hi!");
        register0.registerUser("", "hi!");
        register0.runRegistrationSystem((int) (short) 1);
    }

    @Test
    public void test2384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest4.test2384");
        Register register0 = new Register();
        register0.loginUser("hi!", "hi!");
        register0.registerUser("hi!", "hi!");
        register0.loginUser("hi!", "hi!");
        register0.runRegistrationSystem(0);
        register0.runRegistrationSystem((int) (byte) 1);
    }

    @Test
    public void test2385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest4.test2385");
        Register register0 = new Register();
        register0.runRegistrationSystem((int) '#');
        register0.loginUser("hi!", "hi!");
        register0.runRegistrationSystem((int) (byte) 10);
        register0.registerUser("hi!", "");
        register0.loginUser("", "");
        register0.loginUser("hi!", "");
    }

    @Test
    public void test2386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest4.test2386");
        Register register0 = new Register();
        register0.runRegistrationSystem((int) '#');
        register0.runRegistrationSystem((int) (short) 100);
        register0.runRegistrationSystem((int) (byte) 100);
        register0.runRegistrationSystem(100);
        register0.registerUser("hi!", "");
    }

    @Test
    public void test2387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest4.test2387");
        Register register0 = new Register();
        register0.runRegistrationSystem((int) '#');
        register0.loginUser("hi!", "hi!");
        register0.loginUser("hi!", "hi!");
        register0.loginUser("hi!", "");
        register0.registerUser("", "hi!");
        register0.registerUser("hi!", "");
        register0.registerUser("", "");
    }

    @Test
    public void test2388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest4.test2388");
        Register register0 = new Register();
        register0.runRegistrationSystem((int) '#');
        register0.registerUser("", "hi!");
        register0.runRegistrationSystem((int) (short) 0);
        register0.runRegistrationSystem((int) (byte) 1);
        register0.runRegistrationSystem((int) (byte) 0);
        register0.loginUser("", "");
        register0.runRegistrationSystem((int) (byte) 0);
        register0.registerUser("hi!", "");
    }

    @Test
    public void test2389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest4.test2389");
        Register register0 = new Register();
        register0.runRegistrationSystem((int) (byte) -1);
        register0.runRegistrationSystem((int) (byte) 10);
        register0.loginUser("hi!", "");
        register0.loginUser("hi!", "");
        register0.loginUser("hi!", "hi!");
    }

    @Test
    public void test2390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest4.test2390");
        Register register0 = new Register();
        register0.runRegistrationSystem((int) (byte) -1);
        register0.registerUser("hi!", "");
        register0.runRegistrationSystem((int) (short) 1);
        register0.loginUser("", "hi!");
        register0.runRegistrationSystem((int) '4');
        register0.loginUser("", "");
        register0.registerUser("", "");
        register0.runRegistrationSystem((int) (byte) 0);
        register0.loginUser("", "hi!");
    }

    @Test
    public void test2391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest4.test2391");
        Register register0 = new Register();
        register0.runRegistrationSystem((int) '#');
        register0.registerUser("", "hi!");
        register0.runRegistrationSystem((int) (short) 0);
        register0.runRegistrationSystem((int) (byte) 1);
        register0.registerUser("", "");
        register0.runRegistrationSystem((int) (short) 10);
        register0.registerUser("hi!", "");
        register0.registerUser("", "");
        java.lang.Class<?> wildcardClass21 = register0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test2392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest4.test2392");
        Register register0 = new Register();
        register0.runRegistrationSystem((int) (short) 0);
        register0.loginUser("hi!", "hi!");
        register0.registerUser("", "");
        register0.runRegistrationSystem((int) '#');
        register0.runRegistrationSystem((int) (byte) 0);
        register0.runRegistrationSystem(0);
        register0.registerUser("", "hi!");
        register0.registerUser("", "hi!");
        register0.loginUser("", "");
        register0.registerUser("hi!", "");
        register0.loginUser("hi!", "hi!");
    }

    @Test
    public void test2393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest4.test2393");
        Register register0 = new Register();
        register0.loginUser("hi!", "hi!");
        register0.runRegistrationSystem(0);
        register0.registerUser("", "");
        register0.runRegistrationSystem((-1));
        register0.registerUser("", "");
        register0.loginUser("", "hi!");
        register0.registerUser("", "hi!");
        register0.registerUser("", "");
        java.lang.Class<?> wildcardClass23 = register0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test2394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest4.test2394");
        Register register0 = new Register();
        register0.runRegistrationSystem((int) (short) 0);
        register0.loginUser("hi!", "hi!");
        register0.registerUser("", "");
        register0.runRegistrationSystem((-1));
        register0.loginUser("", "hi!");
        register0.loginUser("", "");
        register0.runRegistrationSystem((int) ' ');
        register0.runRegistrationSystem((int) (short) 1);
        register0.runRegistrationSystem((int) 'a');
    }

    @Test
    public void test2395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest4.test2395");
        Register register0 = new Register();
        register0.registerUser("hi!", "");
        register0.runRegistrationSystem(1);
        register0.registerUser("", "");
        register0.runRegistrationSystem((int) (short) -1);
        register0.loginUser("", "");
        register0.loginUser("hi!", "");
        register0.loginUser("hi!", "hi!");
        register0.loginUser("hi!", "hi!");
        register0.registerUser("", "");
        register0.registerUser("", "");
        register0.loginUser("hi!", "");
    }

    @Test
    public void test2396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest4.test2396");
        Register register0 = new Register();
        register0.registerUser("hi!", "");
        register0.registerUser("hi!", "");
        register0.runRegistrationSystem((int) (byte) 0);
        register0.registerUser("", "");
        register0.runRegistrationSystem((int) (byte) 10);
        register0.registerUser("", "hi!");
        register0.registerUser("hi!", "");
        register0.runRegistrationSystem((int) 'a');
        register0.runRegistrationSystem(0);
    }

    @Test
    public void test2397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest4.test2397");
        Register register0 = new Register();
        register0.loginUser("hi!", "hi!");
        register0.registerUser("hi!", "");
        register0.registerUser("", "");
        register0.registerUser("", "");
        register0.runRegistrationSystem((int) (byte) 100);
        register0.runRegistrationSystem((int) (short) -1);
        register0.loginUser("", "hi!");
        register0.loginUser("", "");
        register0.runRegistrationSystem((int) '4');
    }

    @Test
    public void test2398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest4.test2398");
        Register register0 = new Register();
        register0.runRegistrationSystem((int) '#');
        register0.registerUser("", "hi!");
        register0.registerUser("", "hi!");
        register0.registerUser("", "");
        register0.runRegistrationSystem((int) (byte) 10);
        register0.registerUser("", "hi!");
        register0.runRegistrationSystem((int) (short) 0);
    }

    @Test
    public void test2399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest4.test2399");
        Register register0 = new Register();
        register0.loginUser("hi!", "hi!");
        register0.registerUser("hi!", "");
        register0.registerUser("hi!", "");
        register0.registerUser("", "");
        register0.runRegistrationSystem(100);
        register0.runRegistrationSystem((int) (byte) -1);
        register0.runRegistrationSystem(1);
        register0.loginUser("", "");
        register0.runRegistrationSystem((int) ' ');
        register0.registerUser("hi!", "");
        register0.registerUser("", "hi!");
        register0.runRegistrationSystem((-1));
    }

    @Test
    public void test2400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest4.test2400");
        Register register0 = new Register();
        register0.runRegistrationSystem((int) (byte) -1);
        register0.registerUser("hi!", "");
        register0.loginUser("hi!", "hi!");
        register0.loginUser("hi!", "hi!");
        register0.runRegistrationSystem((int) (short) 1);
        register0.registerUser("hi!", "hi!");
        register0.registerUser("", "");
        register0.registerUser("hi!", "hi!");
        register0.loginUser("hi!", "");
    }

    @Test
    public void test2401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest4.test2401");
        Register register0 = new Register();
        register0.registerUser("hi!", "");
        register0.registerUser("hi!", "");
        register0.loginUser("hi!", "");
        register0.loginUser("hi!", "");
        register0.runRegistrationSystem(10);
        register0.registerUser("", "");
        register0.registerUser("hi!", "hi!");
        register0.loginUser("hi!", "hi!");
        register0.registerUser("hi!", "hi!");
        register0.runRegistrationSystem((int) (short) 100);
        register0.registerUser("", "hi!");
        register0.registerUser("", "hi!");
    }

    @Test
    public void test2402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest4.test2402");
        Register register0 = new Register();
        register0.runRegistrationSystem((int) (byte) -1);
        register0.runRegistrationSystem((int) (short) 10);
        register0.runRegistrationSystem((int) (byte) -1);
        register0.runRegistrationSystem(10);
        register0.registerUser("", "");
        register0.registerUser("hi!", "");
        register0.loginUser("hi!", "");
    }

    @Test
    public void test2403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest4.test2403");
        Register register0 = new Register();
        register0.runRegistrationSystem((int) (short) 0);
        register0.loginUser("hi!", "hi!");
        register0.registerUser("", "");
        register0.runRegistrationSystem((-1));
        register0.runRegistrationSystem((int) (short) 10);
        register0.runRegistrationSystem(0);
        register0.registerUser("", "hi!");
        register0.loginUser("hi!", "");
        register0.loginUser("", "");
    }

    @Test
    public void test2404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest4.test2404");
        Register register0 = new Register();
        register0.runRegistrationSystem((int) (short) 0);
        register0.loginUser("hi!", "hi!");
        register0.registerUser("", "");
        register0.runRegistrationSystem((-1));
        register0.registerUser("", "");
        register0.loginUser("hi!", "hi!");
        register0.registerUser("hi!", "");
        register0.loginUser("hi!", "hi!");
        register0.loginUser("", "hi!");
    }

    @Test
    public void test2405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest4.test2405");
        Register register0 = new Register();
        register0.registerUser("hi!", "");
        register0.loginUser("", "hi!");
        register0.runRegistrationSystem((int) (byte) -1);
        register0.runRegistrationSystem(1);
        register0.loginUser("hi!", "");
        register0.runRegistrationSystem((int) (short) -1);
        register0.registerUser("", "");
        register0.loginUser("", "");
        register0.runRegistrationSystem(1);
    }

    @Test
    public void test2406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest4.test2406");
        Register register0 = new Register();
        register0.runRegistrationSystem((int) (short) 0);
        register0.loginUser("hi!", "hi!");
        register0.registerUser("", "");
        register0.runRegistrationSystem((-1));
        register0.runRegistrationSystem((int) (short) 0);
        register0.registerUser("", "");
        register0.runRegistrationSystem((int) (short) -1);
        register0.loginUser("hi!", "");
        register0.runRegistrationSystem(0);
        java.lang.Class<?> wildcardClass23 = register0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test2407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest4.test2407");
        Register register0 = new Register();
        register0.runRegistrationSystem((int) (short) 0);
        register0.loginUser("hi!", "hi!");
        register0.loginUser("hi!", "");
        register0.loginUser("", "hi!");
        register0.registerUser("hi!", "hi!");
        register0.loginUser("hi!", "hi!");
        register0.loginUser("hi!", "");
        java.lang.Class<?> wildcardClass21 = register0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test2408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest4.test2408");
        Register register0 = new Register();
        register0.loginUser("hi!", "hi!");
        register0.registerUser("hi!", "");
        register0.loginUser("hi!", "hi!");
        register0.registerUser("", "");
        register0.loginUser("", "");
        register0.loginUser("hi!", "");
        register0.registerUser("", "hi!");
        java.lang.Class<?> wildcardClass22 = register0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test2409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest4.test2409");
        Register register0 = new Register();
        register0.runRegistrationSystem((int) (short) 0);
        register0.loginUser("hi!", "hi!");
        register0.registerUser("", "");
        register0.runRegistrationSystem((-1));
        register0.runRegistrationSystem((int) (short) 0);
        register0.runRegistrationSystem((int) ' ');
        register0.loginUser("hi!", "hi!");
        register0.loginUser("hi!", "");
        register0.loginUser("", "hi!");
        register0.registerUser("", "");
    }

    @Test
    public void test2410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest4.test2410");
        Register register0 = new Register();
        register0.registerUser("hi!", "");
        register0.loginUser("", "hi!");
        register0.runRegistrationSystem((int) 'a');
        register0.loginUser("", "hi!");
        register0.loginUser("hi!", "");
        register0.registerUser("hi!", "hi!");
        register0.registerUser("", "hi!");
        register0.registerUser("", "hi!");
        register0.runRegistrationSystem((int) ' ');
        register0.runRegistrationSystem((int) '4');
    }

    @Test
    public void test2411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest4.test2411");
        Register register0 = new Register();
        register0.loginUser("hi!", "hi!");
        register0.registerUser("hi!", "");
        register0.loginUser("hi!", "hi!");
        register0.runRegistrationSystem(100);
        register0.registerUser("hi!", "");
        register0.runRegistrationSystem((int) (short) -1);
        register0.runRegistrationSystem((int) (byte) 100);
        register0.loginUser("", "hi!");
    }

    @Test
    public void test2412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest4.test2412");
        Register register0 = new Register();
        register0.runRegistrationSystem((int) (byte) -1);
        register0.registerUser("hi!", "");
        register0.runRegistrationSystem((int) (short) 1);
        register0.loginUser("", "hi!");
        register0.runRegistrationSystem((int) '4');
        register0.loginUser("hi!", "");
        register0.runRegistrationSystem(10);
        register0.loginUser("", "hi!");
        register0.registerUser("hi!", "hi!");
        register0.runRegistrationSystem((int) (short) -1);
    }

    @Test
    public void test2413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest4.test2413");
        Register register0 = new Register();
        register0.runRegistrationSystem((int) (byte) -1);
        register0.registerUser("hi!", "");
        register0.runRegistrationSystem((int) (short) 1);
        register0.loginUser("", "");
        register0.loginUser("", "hi!");
        register0.runRegistrationSystem((int) (short) 1);
        register0.registerUser("", "");
        register0.registerUser("hi!", "");
        register0.loginUser("", "");
        register0.runRegistrationSystem((int) (byte) -1);
        register0.loginUser("", "");
    }

    @Test
    public void test2414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest4.test2414");
        Register register0 = new Register();
        register0.loginUser("", "hi!");
        register0.loginUser("", "hi!");
        register0.loginUser("hi!", "hi!");
        register0.runRegistrationSystem((int) '4');
        register0.loginUser("", "");
        register0.registerUser("", "hi!");
        register0.registerUser("", "hi!");
        register0.runRegistrationSystem((int) (byte) 1);
    }

    @Test
    public void test2415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest4.test2415");
        Register register0 = new Register();
        register0.loginUser("hi!", "hi!");
        register0.registerUser("hi!", "");
        register0.loginUser("hi!", "hi!");
        register0.runRegistrationSystem(100);
        register0.registerUser("hi!", "");
        register0.registerUser("", "");
        register0.runRegistrationSystem(10);
        register0.loginUser("", "");
        register0.registerUser("", "");
    }

    @Test
    public void test2416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest4.test2416");
        Register register0 = new Register();
        register0.runRegistrationSystem((int) (short) 0);
        register0.loginUser("hi!", "hi!");
        register0.registerUser("", "");
        register0.loginUser("", "hi!");
        register0.registerUser("hi!", "");
        register0.registerUser("hi!", "");
        register0.runRegistrationSystem(0);
        register0.runRegistrationSystem((int) (short) 1);
    }

    @Test
    public void test2417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest4.test2417");
        Register register0 = new Register();
        register0.registerUser("hi!", "");
        register0.loginUser("hi!", "hi!");
        register0.runRegistrationSystem((int) '#');
        register0.registerUser("hi!", "");
        register0.registerUser("hi!", "");
        register0.loginUser("", "hi!");
    }

    @Test
    public void test2418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest4.test2418");
        Register register0 = new Register();
        register0.loginUser("hi!", "hi!");
        register0.registerUser("hi!", "hi!");
        register0.runRegistrationSystem((int) (byte) 100);
        register0.runRegistrationSystem((-1));
        register0.loginUser("hi!", "");
        register0.registerUser("", "hi!");
        java.lang.Class<?> wildcardClass17 = register0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test2419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest4.test2419");
        Register register0 = new Register();
        register0.loginUser("hi!", "hi!");
        register0.registerUser("hi!", "");
        register0.registerUser("", "");
        register0.runRegistrationSystem((int) (byte) 100);
        register0.registerUser("hi!", "");
        register0.runRegistrationSystem(1);
        register0.runRegistrationSystem(0);
        register0.runRegistrationSystem((int) '4');
        register0.runRegistrationSystem((int) (short) 1);
        register0.loginUser("", "hi!");
        register0.loginUser("", "");
        register0.loginUser("", "");
        register0.loginUser("hi!", "hi!");
        register0.loginUser("hi!", "");
    }

    @Test
    public void test2420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest4.test2420");
        Register register0 = new Register();
        register0.runRegistrationSystem((int) '#');
        register0.runRegistrationSystem((int) (short) 100);
        register0.runRegistrationSystem(100);
        register0.registerUser("", "hi!");
        register0.runRegistrationSystem(1);
    }

    @Test
    public void test2421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest4.test2421");
        Register register0 = new Register();
        register0.loginUser("hi!", "hi!");
        register0.registerUser("hi!", "");
        register0.registerUser("", "");
        register0.registerUser("", "hi!");
        register0.runRegistrationSystem((int) (short) 100);
        register0.runRegistrationSystem((int) (byte) 10);
        register0.runRegistrationSystem((int) ' ');
        register0.registerUser("hi!", "");
    }

    @Test
    public void test2422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest4.test2422");
        Register register0 = new Register();
        register0.runRegistrationSystem((int) '#');
        register0.registerUser("", "hi!");
        register0.loginUser("hi!", "hi!");
        register0.runRegistrationSystem((int) (short) 10);
        register0.registerUser("hi!", "");
        java.lang.Class<?> wildcardClass14 = register0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test2423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest4.test2423");
        Register register0 = new Register();
        register0.registerUser("hi!", "");
        register0.registerUser("hi!", "");
        register0.loginUser("hi!", "");
        register0.loginUser("hi!", "");
        register0.loginUser("", "hi!");
        register0.loginUser("", "hi!");
        register0.runRegistrationSystem((int) (short) 100);
        register0.runRegistrationSystem(1);
        register0.loginUser("hi!", "hi!");
        register0.loginUser("hi!", "");
    }

    @Test
    public void test2424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest4.test2424");
        Register register0 = new Register();
        register0.runRegistrationSystem((int) (byte) -1);
        register0.registerUser("hi!", "");
        register0.registerUser("", "");
        register0.loginUser("", "");
        register0.registerUser("hi!", "");
        register0.loginUser("", "hi!");
    }

    @Test
    public void test2425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest4.test2425");
        Register register0 = new Register();
        register0.loginUser("hi!", "hi!");
        register0.registerUser("hi!", "");
        register0.registerUser("", "");
        register0.registerUser("", "hi!");
        register0.loginUser("", "hi!");
        register0.registerUser("hi!", "hi!");
        register0.loginUser("hi!", "hi!");
        java.lang.Class<?> wildcardClass22 = register0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test2426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest4.test2426");
        Register register0 = new Register();
        register0.runRegistrationSystem((int) '#');
        register0.loginUser("hi!", "hi!");
        register0.loginUser("hi!", "hi!");
        register0.loginUser("hi!", "");
        register0.loginUser("", "");
        register0.runRegistrationSystem((int) (short) 10);
        register0.registerUser("", "hi!");
        register0.loginUser("hi!", "");
        register0.registerUser("hi!", "");
        register0.registerUser("", "hi!");
        register0.registerUser("hi!", "");
        register0.runRegistrationSystem((int) (short) 1);
    }

    @Test
    public void test2427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest4.test2427");
        Register register0 = new Register();
        register0.runRegistrationSystem((int) (short) 0);
        register0.loginUser("hi!", "hi!");
        register0.loginUser("", "");
        register0.registerUser("hi!", "");
        register0.registerUser("hi!", "hi!");
        register0.runRegistrationSystem((int) (byte) 1);
        register0.runRegistrationSystem((int) (byte) 0);
        register0.registerUser("hi!", "");
        register0.registerUser("hi!", "hi!");
        register0.loginUser("", "hi!");
        register0.loginUser("", "hi!");
        register0.runRegistrationSystem(10);
        register0.registerUser("hi!", "");
        register0.runRegistrationSystem((int) 'a');
    }

    @Test
    public void test2428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest4.test2428");
        Register register0 = new Register();
        register0.registerUser("hi!", "");
        register0.loginUser("", "hi!");
        register0.runRegistrationSystem((int) (byte) -1);
        register0.loginUser("", "");
        register0.runRegistrationSystem((int) (short) 0);
        register0.runRegistrationSystem((int) '#');
        register0.loginUser("hi!", "hi!");
    }

    @Test
    public void test2429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest4.test2429");
        Register register0 = new Register();
        register0.runRegistrationSystem((int) (byte) -1);
        register0.registerUser("hi!", "");
        register0.loginUser("hi!", "hi!");
        register0.loginUser("hi!", "");
        register0.loginUser("", "");
        register0.loginUser("hi!", "hi!");
        register0.registerUser("hi!", "hi!");
        register0.loginUser("hi!", "");
    }

    @Test
    public void test2430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest4.test2430");
        Register register0 = new Register();
        register0.loginUser("hi!", "hi!");
        register0.registerUser("hi!", "");
        register0.loginUser("hi!", "hi!");
        register0.runRegistrationSystem(100);
        register0.registerUser("hi!", "");
        register0.runRegistrationSystem((int) (short) -1);
        register0.loginUser("", "");
        register0.runRegistrationSystem((int) 'a');
        register0.registerUser("hi!", "hi!");
        register0.loginUser("", "");
    }

    @Test
    public void test2431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest4.test2431");
        Register register0 = new Register();
        register0.loginUser("hi!", "hi!");
        register0.registerUser("hi!", "");
        register0.registerUser("hi!", "");
        register0.registerUser("", "hi!");
        register0.loginUser("", "");
        register0.runRegistrationSystem((int) (short) -1);
        register0.registerUser("hi!", "");
        register0.runRegistrationSystem((int) (byte) 10);
        register0.registerUser("hi!", "hi!");
        register0.runRegistrationSystem((int) (short) -1);
        register0.registerUser("", "");
        register0.loginUser("hi!", "hi!");
        register0.loginUser("", "");
    }

    @Test
    public void test2432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest4.test2432");
        Register register0 = new Register();
        register0.loginUser("hi!", "hi!");
        register0.runRegistrationSystem(0);
        register0.registerUser("", "");
        register0.loginUser("", "hi!");
        register0.registerUser("", "");
        register0.registerUser("hi!", "");
        java.lang.Class<?> wildcardClass18 = register0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test2433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest4.test2433");
        Register register0 = new Register();
        register0.runRegistrationSystem((int) (byte) -1);
        register0.registerUser("hi!", "");
        register0.loginUser("hi!", "hi!");
        register0.loginUser("hi!", "");
        register0.loginUser("", "");
        register0.registerUser("", "hi!");
        register0.runRegistrationSystem(0);
        register0.loginUser("hi!", "hi!");
        register0.runRegistrationSystem((int) 'a');
        register0.loginUser("hi!", "hi!");
    }

    @Test
    public void test2434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest4.test2434");
        Register register0 = new Register();
        register0.runRegistrationSystem((int) '#');
        register0.loginUser("", "hi!");
        register0.runRegistrationSystem((int) (short) 1);
        register0.loginUser("", "");
        register0.registerUser("hi!", "");
        register0.registerUser("hi!", "");
    }

    @Test
    public void test2435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest4.test2435");
        Register register0 = new Register();
        register0.runRegistrationSystem((int) (short) 0);
        register0.loginUser("hi!", "hi!");
        register0.registerUser("", "");
        register0.runRegistrationSystem((-1));
        register0.runRegistrationSystem((int) (short) 0);
        register0.loginUser("hi!", "");
        register0.loginUser("hi!", "hi!");
    }

    @Test
    public void test2436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest4.test2436");
        Register register0 = new Register();
        register0.registerUser("hi!", "");
        register0.registerUser("hi!", "");
        register0.loginUser("hi!", "");
        register0.loginUser("hi!", "");
        register0.runRegistrationSystem(10);
        register0.registerUser("", "");
        register0.registerUser("", "");
        register0.runRegistrationSystem((int) (short) 10);
        register0.loginUser("", "");
        register0.runRegistrationSystem((int) (byte) 100);
    }

    @Test
    public void test2437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest4.test2437");
        Register register0 = new Register();
        register0.runRegistrationSystem((int) (short) 0);
        register0.loginUser("hi!", "hi!");
        register0.registerUser("", "");
        register0.runRegistrationSystem((int) '#');
        register0.runRegistrationSystem((int) '#');
        register0.loginUser("hi!", "");
        register0.runRegistrationSystem((int) (short) 0);
        register0.runRegistrationSystem(0);
        register0.registerUser("", "hi!");
    }

    @Test
    public void test2438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest4.test2438");
        Register register0 = new Register();
        register0.loginUser("hi!", "hi!");
        register0.loginUser("hi!", "");
        register0.runRegistrationSystem((int) '4');
        register0.runRegistrationSystem(0);
    }

    @Test
    public void test2439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest4.test2439");
        Register register0 = new Register();
        register0.runRegistrationSystem((int) (byte) -1);
        register0.registerUser("hi!", "");
        register0.runRegistrationSystem(0);
        register0.runRegistrationSystem(1);
        register0.registerUser("", "");
        register0.loginUser("hi!", "");
        register0.runRegistrationSystem(0);
        register0.registerUser("", "hi!");
    }

    @Test
    public void test2440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest4.test2440");
        Register register0 = new Register();
        register0.registerUser("hi!", "");
        register0.registerUser("hi!", "");
        register0.runRegistrationSystem((int) (byte) 0);
        register0.runRegistrationSystem((int) (short) 10);
        register0.registerUser("", "");
        register0.registerUser("", "");
        register0.loginUser("", "hi!");
    }

    @Test
    public void test2441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest4.test2441");
        Register register0 = new Register();
        register0.loginUser("hi!", "hi!");
        register0.registerUser("hi!", "");
        register0.registerUser("", "");
        register0.registerUser("", "hi!");
        register0.runRegistrationSystem((int) (short) 100);
        register0.runRegistrationSystem((int) (byte) 1);
        register0.loginUser("", "");
        register0.registerUser("hi!", "");
        register0.registerUser("hi!", "hi!");
        register0.loginUser("hi!", "");
    }

    @Test
    public void test2442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest4.test2442");
        Register register0 = new Register();
        register0.runRegistrationSystem((int) (byte) -1);
        register0.registerUser("hi!", "");
        register0.runRegistrationSystem((int) (byte) -1);
        register0.runRegistrationSystem((int) 'a');
        register0.loginUser("", "hi!");
        register0.loginUser("", "hi!");
        java.lang.Class<?> wildcardClass16 = register0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test2443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest4.test2443");
        Register register0 = new Register();
        register0.registerUser("hi!", "");
        register0.loginUser("", "hi!");
        register0.runRegistrationSystem((int) (byte) -1);
        register0.runRegistrationSystem(1);
        register0.loginUser("hi!", "");
        register0.runRegistrationSystem(0);
        register0.registerUser("", "");
        register0.loginUser("", "");
        register0.registerUser("", "hi!");
        register0.registerUser("hi!", "hi!");
    }

    @Test
    public void test2444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest4.test2444");
        Register register0 = new Register();
        register0.registerUser("hi!", "");
        register0.loginUser("", "");
        register0.runRegistrationSystem((int) 'a');
        register0.runRegistrationSystem((int) (short) 100);
        register0.runRegistrationSystem((int) (byte) -1);
        register0.runRegistrationSystem(100);
    }

    @Test
    public void test2445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest4.test2445");
        Register register0 = new Register();
        register0.loginUser("hi!", "hi!");
        register0.registerUser("hi!", "");
        register0.registerUser("", "");
        register0.registerUser("hi!", "");
        register0.registerUser("hi!", "");
        register0.registerUser("", "");
        register0.runRegistrationSystem(100);
        register0.loginUser("", "");
        register0.runRegistrationSystem((int) (byte) 10);
        register0.runRegistrationSystem((int) '4');
    }

    @Test
    public void test2446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest4.test2446");
        Register register0 = new Register();
        register0.loginUser("hi!", "hi!");
        register0.registerUser("hi!", "");
        register0.registerUser("hi!", "");
        register0.registerUser("", "hi!");
        register0.loginUser("", "");
        register0.runRegistrationSystem((int) (short) -1);
        register0.registerUser("hi!", "");
        register0.runRegistrationSystem((int) (byte) 10);
        register0.registerUser("hi!", "hi!");
        register0.runRegistrationSystem((int) 'a');
        register0.runRegistrationSystem((int) (byte) 100);
        register0.registerUser("hi!", "hi!");
        register0.loginUser("hi!", "hi!");
    }

    @Test
    public void test2447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest4.test2447");
        Register register0 = new Register();
        register0.registerUser("hi!", "");
        register0.runRegistrationSystem(1);
        register0.registerUser("", "");
        register0.runRegistrationSystem((int) (short) -1);
        register0.loginUser("", "");
        register0.loginUser("hi!", "");
        register0.registerUser("hi!", "hi!");
        register0.runRegistrationSystem(100);
        register0.registerUser("hi!", "hi!");
    }

    @Test
    public void test2448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest4.test2448");
        Register register0 = new Register();
        register0.runRegistrationSystem((int) (short) 0);
        register0.loginUser("hi!", "hi!");
        register0.loginUser("", "");
        register0.registerUser("hi!", "");
        register0.registerUser("hi!", "hi!");
        register0.runRegistrationSystem((int) 'a');
        register0.runRegistrationSystem((int) 'a');
        register0.loginUser("", "hi!");
        java.lang.Class<?> wildcardClass22 = register0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test2449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest4.test2449");
        Register register0 = new Register();
        register0.registerUser("hi!", "");
        register0.loginUser("", "hi!");
        register0.runRegistrationSystem((int) 'a');
        register0.loginUser("hi!", "");
        register0.runRegistrationSystem((-1));
        register0.registerUser("hi!", "");
        register0.runRegistrationSystem((int) (byte) 1);
        register0.registerUser("hi!", "");
        register0.loginUser("", "hi!");
        register0.loginUser("", "hi!");
    }

    @Test
    public void test2450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest4.test2450");
        Register register0 = new Register();
        register0.runRegistrationSystem((int) '#');
        register0.registerUser("", "hi!");
        register0.registerUser("", "hi!");
        register0.registerUser("", "");
        register0.registerUser("", "");
        register0.runRegistrationSystem((int) (byte) 0);
    }

    @Test
    public void test2451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest4.test2451");
        Register register0 = new Register();
        register0.loginUser("hi!", "hi!");
        register0.registerUser("hi!", "");
        register0.registerUser("hi!", "");
        register0.registerUser("", "");
        register0.runRegistrationSystem((int) (short) 0);
        register0.loginUser("hi!", "");
        register0.registerUser("", "hi!");
    }

    @Test
    public void test2452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest4.test2452");
        Register register0 = new Register();
        register0.registerUser("hi!", "");
        register0.registerUser("hi!", "");
        register0.loginUser("hi!", "");
        register0.loginUser("hi!", "");
        register0.runRegistrationSystem(1);
        register0.runRegistrationSystem((int) (short) 100);
        register0.loginUser("", "hi!");
        register0.registerUser("hi!", "hi!");
    }

    @Test
    public void test2453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest4.test2453");
        Register register0 = new Register();
        register0.runRegistrationSystem((int) '#');
        register0.registerUser("", "hi!");
        register0.runRegistrationSystem((int) (short) 0);
        register0.runRegistrationSystem((int) (byte) 1);
        register0.registerUser("", "");
        register0.loginUser("", "");
        register0.loginUser("", "");
        register0.runRegistrationSystem((int) (short) 0);
        register0.registerUser("", "");
        register0.runRegistrationSystem((int) (byte) 0);
        register0.runRegistrationSystem(1);
        java.lang.Class<?> wildcardClass28 = register0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test2454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest4.test2454");
        Register register0 = new Register();
        register0.runRegistrationSystem((int) (short) 0);
        register0.loginUser("hi!", "hi!");
        register0.registerUser("", "");
        register0.runRegistrationSystem((int) '#');
        register0.registerUser("", "hi!");
        register0.registerUser("", "hi!");
        register0.registerUser("hi!", "hi!");
        register0.runRegistrationSystem((int) (byte) 100);
        register0.loginUser("hi!", "hi!");
        register0.registerUser("", "hi!");
        register0.registerUser("hi!", "hi!");
        java.lang.Class<?> wildcardClass31 = register0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test2455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest4.test2455");
        Register register0 = new Register();
        register0.loginUser("hi!", "hi!");
        register0.registerUser("hi!", "");
        register0.registerUser("", "");
        register0.registerUser("hi!", "");
        register0.registerUser("hi!", "");
        register0.registerUser("hi!", "");
        register0.registerUser("hi!", "");
        register0.runRegistrationSystem((int) 'a');
        register0.runRegistrationSystem((int) (byte) 100);
    }

    @Test
    public void test2456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest4.test2456");
        Register register0 = new Register();
        register0.registerUser("hi!", "");
        register0.loginUser("", "");
        register0.runRegistrationSystem((int) 'a');
        register0.registerUser("", "");
        register0.registerUser("hi!", "hi!");
        register0.registerUser("", "");
        register0.loginUser("hi!", "");
        register0.registerUser("hi!", "");
        register0.registerUser("hi!", "hi!");
    }

    @Test
    public void test2457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest4.test2457");
        Register register0 = new Register();
        register0.runRegistrationSystem((int) '#');
        register0.registerUser("", "hi!");
        register0.runRegistrationSystem((int) (short) 0);
        register0.runRegistrationSystem((int) (byte) 1);
        register0.registerUser("", "");
        register0.runRegistrationSystem((int) (short) 10);
        register0.loginUser("hi!", "");
        register0.loginUser("", "hi!");
    }

    @Test
    public void test2458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest4.test2458");
        Register register0 = new Register();
        register0.loginUser("hi!", "hi!");
        register0.registerUser("hi!", "hi!");
        register0.registerUser("", "hi!");
        register0.runRegistrationSystem((int) (byte) -1);
        register0.runRegistrationSystem((int) (short) 10);
        register0.runRegistrationSystem(0);
        register0.registerUser("", "hi!");
    }

    @Test
    public void test2459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest4.test2459");
        Register register0 = new Register();
        register0.registerUser("hi!", "");
        register0.loginUser("", "hi!");
        register0.runRegistrationSystem((int) 'a');
        register0.loginUser("", "hi!");
        register0.loginUser("hi!", "");
        register0.registerUser("hi!", "hi!");
        register0.registerUser("", "hi!");
        register0.registerUser("", "hi!");
        register0.loginUser("", "");
        java.lang.Class<?> wildcardClass27 = register0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test2460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest4.test2460");
        Register register0 = new Register();
        register0.registerUser("hi!", "");
        register0.loginUser("", "hi!");
        register0.runRegistrationSystem((int) 'a');
        register0.loginUser("", "hi!");
        register0.runRegistrationSystem((int) (byte) -1);
        register0.loginUser("", "hi!");
        register0.registerUser("", "");
        register0.registerUser("", "");
    }

    @Test
    public void test2461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest4.test2461");
        Register register0 = new Register();
        register0.registerUser("hi!", "");
        register0.loginUser("", "hi!");
        register0.runRegistrationSystem((int) '#');
        register0.runRegistrationSystem(0);
        register0.runRegistrationSystem((int) (short) 0);
    }

    @Test
    public void test2462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest4.test2462");
        Register register0 = new Register();
        register0.registerUser("hi!", "");
        register0.loginUser("", "hi!");
        register0.runRegistrationSystem((int) (byte) -1);
        register0.runRegistrationSystem(1);
        register0.loginUser("hi!", "");
        register0.runRegistrationSystem(0);
        register0.registerUser("", "hi!");
        register0.runRegistrationSystem((int) (short) 100);
        register0.runRegistrationSystem((int) (short) 1);
        register0.registerUser("hi!", "");
    }

    @Test
    public void test2463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest4.test2463");
        Register register0 = new Register();
        register0.runRegistrationSystem((int) (byte) -1);
        register0.runRegistrationSystem((int) (byte) 10);
        register0.registerUser("", "hi!");
        java.lang.Class<?> wildcardClass8 = register0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test2464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest4.test2464");
        Register register0 = new Register();
        register0.runRegistrationSystem((int) '#');
        register0.registerUser("", "hi!");
        register0.registerUser("", "hi!");
        register0.registerUser("", "");
        register0.runRegistrationSystem((int) (byte) 10);
        register0.runRegistrationSystem((int) (short) 100);
        register0.runRegistrationSystem((int) (short) 1);
        register0.runRegistrationSystem((int) (byte) -1);
        register0.runRegistrationSystem((int) (short) -1);
    }

    @Test
    public void test2465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest4.test2465");
        Register register0 = new Register();
        register0.runRegistrationSystem((int) (short) 0);
        register0.loginUser("hi!", "hi!");
        register0.loginUser("", "");
        register0.runRegistrationSystem((int) (short) 1);
        register0.registerUser("", "");
    }

    @Test
    public void test2466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest4.test2466");
        Register register0 = new Register();
        register0.runRegistrationSystem((int) (byte) -1);
        register0.registerUser("hi!", "");
        register0.loginUser("hi!", "hi!");
        register0.runRegistrationSystem((int) (byte) 1);
        register0.runRegistrationSystem((int) ' ');
        register0.loginUser("", "hi!");
        register0.registerUser("hi!", "hi!");
        register0.loginUser("", "");
        register0.registerUser("hi!", "hi!");
        register0.runRegistrationSystem((int) ' ');
    }

    @Test
    public void test2467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest4.test2467");
        Register register0 = new Register();
        register0.registerUser("hi!", "");
        register0.loginUser("", "");
        register0.runRegistrationSystem((int) 'a');
        register0.registerUser("", "");
        register0.registerUser("", "");
        register0.loginUser("hi!", "");
    }

    @Test
    public void test2468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest4.test2468");
        Register register0 = new Register();
        register0.runRegistrationSystem((int) (byte) -1);
        register0.registerUser("hi!", "");
        register0.runRegistrationSystem((int) (byte) -1);
        register0.loginUser("hi!", "hi!");
        java.lang.Class<?> wildcardClass11 = register0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test2469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest4.test2469");
        Register register0 = new Register();
        register0.registerUser("hi!", "");
        register0.loginUser("", "hi!");
        register0.runRegistrationSystem((int) 'a');
        register0.loginUser("", "hi!");
        register0.loginUser("hi!", "");
        register0.registerUser("hi!", "hi!");
        register0.registerUser("", "hi!");
        register0.registerUser("", "");
        register0.runRegistrationSystem(100);
        register0.runRegistrationSystem((int) (byte) -1);
        register0.runRegistrationSystem((int) '#');
        register0.loginUser("", "hi!");
        register0.runRegistrationSystem((int) (byte) 100);
        java.lang.Class<?> wildcardClass35 = register0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass35);
    }

    @Test
    public void test2470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest4.test2470");
        Register register0 = new Register();
        register0.runRegistrationSystem((int) '#');
        register0.loginUser("hi!", "hi!");
        register0.loginUser("hi!", "hi!");
        register0.loginUser("hi!", "");
        register0.loginUser("", "");
        register0.runRegistrationSystem((int) (short) 1);
        register0.runRegistrationSystem((int) '4');
    }

    @Test
    public void test2471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest4.test2471");
        Register register0 = new Register();
        register0.runRegistrationSystem((int) (byte) -1);
        register0.runRegistrationSystem((int) (byte) 10);
        register0.registerUser("", "");
        register0.loginUser("", "");
        register0.registerUser("", "hi!");
        register0.registerUser("hi!", "");
        register0.loginUser("hi!", "hi!");
        register0.loginUser("", "hi!");
        register0.registerUser("hi!", "");
        register0.registerUser("", "");
        register0.loginUser("", "hi!");
    }

    @Test
    public void test2472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest4.test2472");
        Register register0 = new Register();
        register0.loginUser("hi!", "hi!");
        register0.registerUser("hi!", "");
        register0.registerUser("", "");
        register0.registerUser("hi!", "");
        register0.registerUser("", "");
        register0.loginUser("", "");
        register0.loginUser("hi!", "hi!");
        register0.loginUser("hi!", "");
        register0.loginUser("hi!", "");
    }

    @Test
    public void test2473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest4.test2473");
        Register register0 = new Register();
        register0.runRegistrationSystem((int) (byte) -1);
        register0.registerUser("hi!", "");
        register0.loginUser("hi!", "hi!");
        register0.loginUser("hi!", "");
        register0.runRegistrationSystem((int) (byte) -1);
        register0.loginUser("hi!", "");
        register0.registerUser("", "hi!");
        register0.loginUser("", "");
    }

    @Test
    public void test2474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest4.test2474");
        Register register0 = new Register();
        register0.loginUser("hi!", "hi!");
        register0.registerUser("hi!", "");
        register0.registerUser("", "");
        register0.registerUser("hi!", "");
        register0.registerUser("hi!", "");
        register0.registerUser("hi!", "");
        register0.registerUser("hi!", "");
        register0.runRegistrationSystem((int) 'a');
        register0.runRegistrationSystem((int) (short) -1);
        register0.runRegistrationSystem((int) (byte) -1);
        register0.runRegistrationSystem((int) (byte) 100);
        register0.registerUser("", "hi!");
        register0.runRegistrationSystem((int) (short) -1);
    }

    @Test
    public void test2475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest4.test2475");
        Register register0 = new Register();
        register0.registerUser("hi!", "");
        register0.loginUser("", "hi!");
        register0.runRegistrationSystem((int) 'a');
        register0.loginUser("hi!", "");
        register0.runRegistrationSystem((-1));
        register0.registerUser("hi!", "");
        register0.loginUser("", "hi!");
        register0.runRegistrationSystem((int) 'a');
        register0.registerUser("", "hi!");
        register0.runRegistrationSystem((-1));
        register0.runRegistrationSystem((int) (short) -1);
        register0.runRegistrationSystem((int) (byte) 0);
        java.lang.Class<?> wildcardClass31 = register0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test2476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest4.test2476");
        Register register0 = new Register();
        register0.runRegistrationSystem((int) '#');
        register0.registerUser("", "hi!");
        register0.loginUser("hi!", "hi!");
        register0.runRegistrationSystem(100);
        register0.runRegistrationSystem((int) (short) 10);
        register0.runRegistrationSystem((int) (short) 0);
        register0.registerUser("", "hi!");
        register0.loginUser("", "");
        java.lang.Class<?> wildcardClass21 = register0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test2477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest4.test2477");
        Register register0 = new Register();
        register0.registerUser("hi!", "");
        register0.registerUser("hi!", "");
        register0.loginUser("hi!", "hi!");
        register0.registerUser("", "");
        register0.registerUser("", "hi!");
        register0.runRegistrationSystem((int) '4');
    }

    @Test
    public void test2478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest4.test2478");
        Register register0 = new Register();
        register0.runRegistrationSystem((int) (byte) -1);
        register0.registerUser("hi!", "");
        register0.registerUser("", "hi!");
        register0.runRegistrationSystem((int) (short) 10);
        register0.loginUser("hi!", "hi!");
        register0.registerUser("", "");
        register0.runRegistrationSystem((int) (byte) -1);
        register0.loginUser("", "hi!");
        java.lang.Class<?> wildcardClass22 = register0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test2479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest4.test2479");
        Register register0 = new Register();
        register0.runRegistrationSystem((int) (short) 0);
        register0.loginUser("hi!", "hi!");
        register0.loginUser("", "");
        register0.registerUser("hi!", "");
        register0.registerUser("hi!", "hi!");
        register0.runRegistrationSystem((int) (byte) 1);
        register0.runRegistrationSystem((int) 'a');
        register0.registerUser("hi!", "");
        register0.registerUser("hi!", "");
        register0.loginUser("", "hi!");
    }

    @Test
    public void test2480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest4.test2480");
        Register register0 = new Register();
        register0.loginUser("hi!", "hi!");
        register0.registerUser("hi!", "");
        register0.registerUser("hi!", "");
        register0.registerUser("", "");
        register0.runRegistrationSystem(100);
        register0.runRegistrationSystem((int) (byte) -1);
        register0.runRegistrationSystem(1);
        register0.loginUser("", "hi!");
        register0.registerUser("", "hi!");
        register0.registerUser("", "hi!");
        register0.loginUser("", "hi!");
        register0.runRegistrationSystem((int) ' ');
        register0.runRegistrationSystem(0);
        register0.registerUser("hi!", "");
    }

    @Test
    public void test2481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest4.test2481");
        Register register0 = new Register();
        register0.runRegistrationSystem((int) '#');
        register0.registerUser("", "hi!");
        register0.registerUser("", "hi!");
        register0.registerUser("", "");
        register0.registerUser("", "");
        register0.runRegistrationSystem(100);
        register0.registerUser("hi!", "hi!");
    }

    @Test
    public void test2482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest4.test2482");
        Register register0 = new Register();
        register0.runRegistrationSystem((int) (short) 0);
        register0.loginUser("hi!", "hi!");
        register0.registerUser("", "");
        register0.runRegistrationSystem((int) '#');
        register0.runRegistrationSystem((int) '#');
        register0.loginUser("hi!", "");
        register0.runRegistrationSystem((int) (short) 0);
        register0.runRegistrationSystem(0);
        register0.runRegistrationSystem((int) ' ');
        register0.registerUser("", "");
        java.lang.Class<?> wildcardClass25 = register0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test2483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest4.test2483");
        Register register0 = new Register();
        register0.runRegistrationSystem((int) '#');
        register0.loginUser("hi!", "hi!");
        register0.runRegistrationSystem((int) (byte) 10);
        register0.registerUser("hi!", "hi!");
        register0.runRegistrationSystem((int) (short) 100);
    }

    @Test
    public void test2484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest4.test2484");
        Register register0 = new Register();
        register0.runRegistrationSystem((int) (byte) -1);
        register0.registerUser("hi!", "");
        register0.loginUser("hi!", "hi!");
        register0.loginUser("hi!", "");
        register0.registerUser("hi!", "");
        register0.registerUser("hi!", "hi!");
        register0.registerUser("", "hi!");
        register0.runRegistrationSystem(100);
        register0.runRegistrationSystem(0);
    }

    @Test
    public void test2485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest4.test2485");
        Register register0 = new Register();
        register0.registerUser("hi!", "");
        register0.loginUser("", "hi!");
        register0.runRegistrationSystem((int) 'a');
        register0.loginUser("hi!", "");
        register0.runRegistrationSystem((int) (byte) 1);
        register0.registerUser("hi!", "hi!");
        register0.loginUser("", "");
    }

    @Test
    public void test2486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest4.test2486");
        Register register0 = new Register();
        register0.runRegistrationSystem((int) '#');
        register0.registerUser("", "hi!");
        register0.runRegistrationSystem((int) (short) 0);
        register0.runRegistrationSystem((int) (byte) 1);
        register0.registerUser("", "");
        register0.runRegistrationSystem((int) (short) 10);
        register0.loginUser("hi!", "");
        register0.registerUser("hi!", "hi!");
        register0.registerUser("hi!", "hi!");
        register0.runRegistrationSystem((int) (short) -1);
        register0.loginUser("", "");
        register0.runRegistrationSystem((int) '4');
    }

    @Test
    public void test2487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest4.test2487");
        Register register0 = new Register();
        register0.runRegistrationSystem((int) (byte) -1);
        register0.registerUser("hi!", "");
        register0.loginUser("hi!", "hi!");
        register0.loginUser("hi!", "");
        register0.loginUser("hi!", "");
        register0.loginUser("hi!", "hi!");
        register0.registerUser("hi!", "");
        register0.runRegistrationSystem((int) (short) 10);
        java.lang.Class<?> wildcardClass23 = register0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test2488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest4.test2488");
        Register register0 = new Register();
        register0.loginUser("hi!", "hi!");
        register0.registerUser("hi!", "");
        register0.loginUser("hi!", "hi!");
        register0.runRegistrationSystem(100);
        register0.registerUser("hi!", "");
        register0.registerUser("", "");
        register0.runRegistrationSystem(0);
        register0.runRegistrationSystem(0);
        register0.runRegistrationSystem(0);
    }

    @Test
    public void test2489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest4.test2489");
        Register register0 = new Register();
        register0.registerUser("hi!", "");
        register0.loginUser("", "");
        register0.runRegistrationSystem((int) 'a');
        register0.registerUser("", "");
        register0.registerUser("", "");
        register0.loginUser("", "hi!");
        register0.runRegistrationSystem((int) (short) 100);
    }

    @Test
    public void test2490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest4.test2490");
        Register register0 = new Register();
        register0.runRegistrationSystem((int) (byte) -1);
        register0.registerUser("hi!", "");
        register0.runRegistrationSystem((int) (short) 1);
        register0.loginUser("", "");
        register0.loginUser("", "hi!");
        register0.runRegistrationSystem((int) (short) 1);
        register0.registerUser("", "");
        register0.registerUser("hi!", "");
        register0.loginUser("", "");
        java.lang.Class<?> wildcardClass25 = register0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test2491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest4.test2491");
        Register register0 = new Register();
        register0.registerUser("hi!", "");
        register0.loginUser("", "");
        register0.runRegistrationSystem((int) 'a');
        register0.registerUser("", "");
        register0.registerUser("hi!", "hi!");
        register0.registerUser("", "");
        register0.registerUser("", "");
        register0.runRegistrationSystem((int) (short) 10);
        register0.runRegistrationSystem((int) (byte) -1);
        register0.runRegistrationSystem(100);
        register0.registerUser("hi!", "");
    }

    @Test
    public void test2492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest4.test2492");
        Register register0 = new Register();
        register0.loginUser("hi!", "hi!");
        register0.registerUser("", "");
        register0.loginUser("hi!", "hi!");
        register0.runRegistrationSystem((int) '4');
        java.lang.Class<?> wildcardClass12 = register0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test2493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest4.test2493");
        Register register0 = new Register();
        register0.registerUser("hi!", "");
        register0.loginUser("", "hi!");
        register0.runRegistrationSystem((int) 'a');
        register0.loginUser("hi!", "");
        register0.runRegistrationSystem((-1));
        register0.registerUser("hi!", "");
        register0.loginUser("", "hi!");
        register0.runRegistrationSystem((int) 'a');
        register0.registerUser("", "hi!");
        java.lang.Class<?> wildcardClass25 = register0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test2494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest4.test2494");
        Register register0 = new Register();
        register0.registerUser("hi!", "");
        register0.registerUser("hi!", "");
        register0.registerUser("hi!", "");
        register0.runRegistrationSystem((int) (byte) 0);
        register0.loginUser("", "hi!");
    }

    @Test
    public void test2495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest4.test2495");
        Register register0 = new Register();
        register0.runRegistrationSystem((int) (byte) -1);
        register0.registerUser("hi!", "");
        register0.loginUser("hi!", "hi!");
        register0.loginUser("hi!", "");
        register0.loginUser("", "");
        register0.runRegistrationSystem(1);
        register0.loginUser("hi!", "hi!");
        register0.loginUser("hi!", "");
        register0.runRegistrationSystem((int) (byte) -1);
        java.lang.Class<?> wildcardClass25 = register0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test2496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest4.test2496");
        Register register0 = new Register();
        register0.loginUser("hi!", "hi!");
        register0.loginUser("", "");
        register0.registerUser("", "hi!");
    }

    @Test
    public void test2497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest4.test2497");
        Register register0 = new Register();
        register0.registerUser("hi!", "");
        register0.registerUser("hi!", "");
        register0.loginUser("hi!", "");
        register0.registerUser("", "hi!");
        register0.loginUser("hi!", "");
    }

    @Test
    public void test2498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest4.test2498");
        Register register0 = new Register();
        register0.runRegistrationSystem((int) '#');
        register0.registerUser("", "hi!");
        register0.runRegistrationSystem((int) (short) 0);
        register0.loginUser("hi!", "hi!");
        register0.registerUser("", "hi!");
        java.lang.Class<?> wildcardClass14 = register0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test2499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest4.test2499");
        Register register0 = new Register();
        register0.loginUser("hi!", "hi!");
        register0.registerUser("hi!", "");
        register0.registerUser("", "");
        register0.registerUser("hi!", "");
        register0.registerUser("hi!", "");
        register0.registerUser("hi!", "");
        register0.registerUser("hi!", "");
        register0.runRegistrationSystem((int) 'a');
        register0.runRegistrationSystem((int) (short) -1);
        register0.runRegistrationSystem((int) (byte) -1);
        register0.registerUser("hi!", "hi!");
    }

    @Test
    public void test2500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest4.test2500");
        Register register0 = new Register();
        register0.runRegistrationSystem((int) (short) 0);
        register0.loginUser("hi!", "hi!");
        register0.registerUser("", "");
        register0.loginUser("", "hi!");
        register0.registerUser("hi!", "");
        register0.registerUser("hi!", "");
        register0.runRegistrationSystem((int) (byte) 1);
        register0.registerUser("", "");
        register0.loginUser("", "");
    }
}

