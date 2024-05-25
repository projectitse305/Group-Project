import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegisterTest6 {

    public static boolean debug = false;

    @Test
    public void test3001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest6.test3001");
        Register register0 = new Register();
        register0.loginUser("hi!", "hi!");
        register0.registerUser("hi!", "");
        register0.registerUser("hi!", "");
        register0.registerUser("", "");
        register0.runRegistrationSystem(100);
        register0.registerUser("hi!", "");
        register0.registerUser("", "");
        register0.runRegistrationSystem((int) (byte) 100);
        register0.runRegistrationSystem((int) (byte) 0);
        register0.loginUser("", "");
        register0.registerUser("hi!", "");
    }

    @Test
    public void test3002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest6.test3002");
        Register register0 = new Register();
        register0.runRegistrationSystem((int) (short) 0);
        register0.loginUser("hi!", "hi!");
        register0.registerUser("", "");
        register0.runRegistrationSystem((int) '#');
        register0.runRegistrationSystem((int) (byte) 0);
        register0.runRegistrationSystem(0);
        register0.registerUser("", "hi!");
        register0.runRegistrationSystem((int) (short) -1);
        register0.runRegistrationSystem((int) (short) 10);
        java.lang.Class<?> wildcardClass22 = register0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test3003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest6.test3003");
        Register register0 = new Register();
        register0.runRegistrationSystem((int) '#');
        register0.registerUser("", "hi!");
        register0.registerUser("", "hi!");
        register0.registerUser("", "");
        register0.runRegistrationSystem((int) (byte) 10);
        register0.runRegistrationSystem((int) (short) 100);
        register0.runRegistrationSystem((int) (short) 0);
        register0.registerUser("", "");
        register0.loginUser("hi!", "");
        java.lang.Class<?> wildcardClass24 = register0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test3004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest6.test3004");
        Register register0 = new Register();
        register0.runRegistrationSystem((int) (byte) -1);
        register0.runRegistrationSystem((int) (short) 10);
        register0.runRegistrationSystem((int) (byte) 100);
        register0.runRegistrationSystem(10);
        register0.registerUser("", "hi!");
        register0.runRegistrationSystem(0);
        register0.loginUser("hi!", "");
        java.lang.Class<?> wildcardClass17 = register0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test3005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest6.test3005");
        Register register0 = new Register();
        register0.runRegistrationSystem((int) (byte) -1);
        register0.registerUser("hi!", "");
        register0.loginUser("hi!", "hi!");
        register0.runRegistrationSystem((int) (byte) 1);
        register0.runRegistrationSystem((int) ' ');
        register0.loginUser("", "hi!");
        register0.registerUser("hi!", "hi!");
        register0.loginUser("", "");
        register0.registerUser("hi!", "");
        register0.runRegistrationSystem(0);
    }

    @Test
    public void test3006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest6.test3006");
        Register register0 = new Register();
        register0.registerUser("hi!", "");
        register0.loginUser("hi!", "hi!");
        register0.runRegistrationSystem((int) '#');
        register0.loginUser("", "hi!");
        register0.loginUser("", "");
        register0.loginUser("", "hi!");
        register0.loginUser("hi!", "hi!");
    }

    @Test
    public void test3007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest6.test3007");
        Register register0 = new Register();
        register0.runRegistrationSystem((int) '#');
        register0.registerUser("", "hi!");
        register0.loginUser("hi!", "hi!");
        register0.runRegistrationSystem((int) (short) 10);
        register0.runRegistrationSystem(100);
        register0.registerUser("", "hi!");
        register0.runRegistrationSystem((int) '#');
    }

    @Test
    public void test3008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest6.test3008");
        Register register0 = new Register();
        register0.registerUser("hi!", "");
        register0.loginUser("", "");
        register0.runRegistrationSystem((int) 'a');
        register0.registerUser("", "");
        register0.registerUser("hi!", "hi!");
        register0.registerUser("", "");
        register0.registerUser("", "hi!");
        register0.runRegistrationSystem((int) ' ');
        register0.registerUser("", "hi!");
        register0.registerUser("", "");
    }

    @Test
    public void test3009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest6.test3009");
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
        register0.loginUser("hi!", "hi!");
        register0.loginUser("", "");
    }

    @Test
    public void test3010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest6.test3010");
        Register register0 = new Register();
        register0.runRegistrationSystem((int) (byte) -1);
        register0.registerUser("hi!", "");
        register0.loginUser("hi!", "hi!");
        register0.runRegistrationSystem((int) (byte) 1);
        register0.registerUser("hi!", "hi!");
        register0.runRegistrationSystem((int) '#');
        register0.registerUser("hi!", "");
    }

    @Test
    public void test3011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest6.test3011");
        Register register0 = new Register();
        register0.runRegistrationSystem((int) (byte) -1);
        register0.runRegistrationSystem((int) (byte) 10);
        register0.registerUser("", "");
        register0.loginUser("", "");
        register0.registerUser("", "hi!");
        register0.registerUser("hi!", "");
        register0.loginUser("hi!", "hi!");
        register0.loginUser("", "hi!");
        register0.runRegistrationSystem((int) '#');
        register0.loginUser("hi!", "hi!");
        register0.registerUser("", "");
        java.lang.Class<?> wildcardClass31 = register0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test3012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest6.test3012");
        Register register0 = new Register();
        register0.loginUser("hi!", "hi!");
        register0.registerUser("hi!", "");
        register0.loginUser("hi!", "hi!");
        register0.runRegistrationSystem(100);
        register0.runRegistrationSystem((int) (byte) 1);
        register0.loginUser("", "");
        register0.registerUser("hi!", "hi!");
        register0.loginUser("hi!", "");
        register0.runRegistrationSystem((int) (byte) -1);
    }

    @Test
    public void test3013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest6.test3013");
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
        register0.loginUser("hi!", "");
        register0.registerUser("", "");
        java.lang.Class<?> wildcardClass39 = register0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass39);
    }

    @Test
    public void test3014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest6.test3014");
        Register register0 = new Register();
        register0.runRegistrationSystem((int) (short) 0);
        register0.loginUser("hi!", "hi!");
        register0.registerUser("", "");
        register0.runRegistrationSystem((int) '#');
        register0.registerUser("", "hi!");
        register0.loginUser("", "");
        register0.loginUser("hi!", "hi!");
        register0.registerUser("hi!", "");
    }

    @Test
    public void test3015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest6.test3015");
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
        register0.runRegistrationSystem(1);
        register0.registerUser("hi!", "hi!");
        register0.runRegistrationSystem((int) (byte) 100);
    }

    @Test
    public void test3016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest6.test3016");
        Register register0 = new Register();
        register0.runRegistrationSystem((int) (byte) -1);
        register0.runRegistrationSystem((int) (byte) 10);
        register0.registerUser("", "");
        register0.loginUser("", "");
        register0.registerUser("", "hi!");
        register0.registerUser("", "hi!");
        register0.loginUser("hi!", "");
        register0.registerUser("", "");
        register0.registerUser("hi!", "");
        register0.loginUser("hi!", "");
    }

    @Test
    public void test3017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest6.test3017");
        Register register0 = new Register();
        register0.registerUser("hi!", "");
        register0.loginUser("", "hi!");
        register0.runRegistrationSystem((int) 'a');
        register0.loginUser("hi!", "");
        register0.runRegistrationSystem((-1));
        register0.registerUser("hi!", "");
        register0.loginUser("", "hi!");
        register0.runRegistrationSystem(100);
        register0.registerUser("", "");
        register0.registerUser("hi!", "");
        register0.registerUser("", "");
    }

    @Test
    public void test3018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest6.test3018");
        Register register0 = new Register();
        register0.loginUser("hi!", "hi!");
        register0.loginUser("hi!", "hi!");
        register0.registerUser("", "");
        register0.runRegistrationSystem((int) (byte) 1);
        register0.loginUser("hi!", "hi!");
        java.lang.Class<?> wildcardClass15 = register0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test3019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest6.test3019");
        Register register0 = new Register();
        register0.runRegistrationSystem((int) (byte) -1);
        register0.registerUser("hi!", "");
        register0.runRegistrationSystem((int) (byte) -1);
        register0.loginUser("hi!", "hi!");
        register0.runRegistrationSystem(0);
        register0.registerUser("hi!", "");
        register0.loginUser("hi!", "hi!");
        java.lang.Class<?> wildcardClass19 = register0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test3020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest6.test3020");
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
        register0.loginUser("", "");
        register0.registerUser("", "");
    }

    @Test
    public void test3021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest6.test3021");
        Register register0 = new Register();
        register0.registerUser("hi!", "");
        register0.loginUser("", "hi!");
        register0.runRegistrationSystem((int) 'a');
        register0.loginUser("", "hi!");
        register0.loginUser("", "hi!");
        register0.loginUser("", "hi!");
        register0.registerUser("hi!", "hi!");
        register0.runRegistrationSystem((int) (short) 10);
        java.lang.Class<?> wildcardClass23 = register0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test3022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest6.test3022");
        Register register0 = new Register();
        register0.registerUser("hi!", "");
        register0.loginUser("", "");
        register0.runRegistrationSystem((int) 'a');
        register0.registerUser("", "");
        register0.registerUser("hi!", "hi!");
        register0.registerUser("", "");
        register0.registerUser("", "hi!");
        register0.runRegistrationSystem(100);
    }

    @Test
    public void test3023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest6.test3023");
        Register register0 = new Register();
        register0.registerUser("hi!", "");
        register0.loginUser("", "hi!");
        register0.runRegistrationSystem((int) (byte) -1);
        register0.runRegistrationSystem(1);
        register0.runRegistrationSystem(0);
        register0.registerUser("hi!", "");
        register0.registerUser("", "");
        java.lang.Class<?> wildcardClass19 = register0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test3024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest6.test3024");
        Register register0 = new Register();
        register0.runRegistrationSystem((int) (byte) -1);
        register0.registerUser("hi!", "");
        register0.loginUser("hi!", "hi!");
        register0.loginUser("hi!", "");
        register0.runRegistrationSystem((int) (byte) -1);
        register0.registerUser("hi!", "hi!");
        register0.registerUser("", "hi!");
        register0.loginUser("", "");
    }

    @Test
    public void test3025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest6.test3025");
        Register register0 = new Register();
        register0.runRegistrationSystem((int) '#');
        register0.registerUser("", "hi!");
        register0.loginUser("hi!", "hi!");
        register0.loginUser("", "hi!");
        register0.runRegistrationSystem((int) (byte) 1);
        register0.runRegistrationSystem(0);
        java.lang.Class<?> wildcardClass16 = register0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test3026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest6.test3026");
        Register register0 = new Register();
        register0.registerUser("hi!", "");
        register0.loginUser("", "");
        register0.registerUser("hi!", "");
        register0.registerUser("", "");
    }

    @Test
    public void test3027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest6.test3027");
        Register register0 = new Register();
        register0.registerUser("hi!", "");
        register0.loginUser("", "hi!");
        register0.runRegistrationSystem((int) 'a');
        register0.loginUser("", "hi!");
        register0.loginUser("hi!", "");
        register0.loginUser("hi!", "hi!");
        register0.runRegistrationSystem(0);
        register0.loginUser("", "");
        register0.loginUser("hi!", "");
    }

    @Test
    public void test3028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest6.test3028");
        Register register0 = new Register();
        register0.runRegistrationSystem((int) '#');
        register0.loginUser("hi!", "hi!");
        register0.loginUser("hi!", "hi!");
        register0.loginUser("hi!", "");
        register0.loginUser("", "");
        register0.runRegistrationSystem((int) (short) 10);
        register0.runRegistrationSystem((int) (byte) 1);
        register0.loginUser("hi!", "");
        java.lang.Class<?> wildcardClass22 = register0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test3029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest6.test3029");
        Register register0 = new Register();
        register0.runRegistrationSystem((int) (short) 0);
        register0.loginUser("hi!", "hi!");
        register0.registerUser("", "");
        register0.runRegistrationSystem((int) '#');
        register0.registerUser("", "hi!");
        register0.registerUser("", "hi!");
        register0.registerUser("", "");
        register0.runRegistrationSystem((int) (byte) 0);
        register0.loginUser("hi!", "hi!");
        java.lang.Class<?> wildcardClass25 = register0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test3030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest6.test3030");
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
        register0.runRegistrationSystem((int) ' ');
    }

    @Test
    public void test3031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest6.test3031");
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
        register0.loginUser("hi!", "hi!");
        register0.registerUser("", "hi!");
        register0.runRegistrationSystem((-1));
    }

    @Test
    public void test3032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest6.test3032");
        Register register0 = new Register();
        register0.runRegistrationSystem((int) (byte) -1);
        register0.runRegistrationSystem((int) '#');
        register0.loginUser("", "");
        register0.runRegistrationSystem((int) (short) 0);
        register0.loginUser("hi!", "");
        register0.runRegistrationSystem((int) (byte) 10);
        register0.runRegistrationSystem(0);
        register0.runRegistrationSystem(0);
    }

    @Test
    public void test3033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest6.test3033");
        Register register0 = new Register();
        register0.runRegistrationSystem((int) (byte) -1);
        register0.runRegistrationSystem((int) (short) 10);
        register0.runRegistrationSystem(10);
        register0.loginUser("", "");
        register0.runRegistrationSystem((int) (byte) 1);
        java.lang.Class<?> wildcardClass12 = register0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test3034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest6.test3034");
        Register register0 = new Register();
        register0.runRegistrationSystem((int) '#');
        register0.registerUser("", "hi!");
        register0.loginUser("hi!", "hi!");
        register0.runRegistrationSystem(100);
        register0.runRegistrationSystem((int) (short) 10);
        register0.runRegistrationSystem((int) (short) 0);
        register0.loginUser("hi!", "");
        register0.loginUser("", "");
        register0.runRegistrationSystem((int) (byte) 100);
        java.lang.Class<?> wildcardClass23 = register0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test3035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest6.test3035");
        Register register0 = new Register();
        register0.runRegistrationSystem((int) (byte) -1);
        register0.registerUser("hi!", "");
        register0.registerUser("", "hi!");
        register0.loginUser("hi!", "hi!");
        register0.registerUser("hi!", "hi!");
        register0.loginUser("hi!", "hi!");
        register0.loginUser("hi!", "hi!");
        register0.loginUser("", "hi!");
        java.lang.Class<?> wildcardClass24 = register0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test3036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest6.test3036");
        Register register0 = new Register();
        register0.registerUser("hi!", "");
        register0.loginUser("", "hi!");
        register0.runRegistrationSystem((int) 'a');
        register0.loginUser("", "hi!");
        register0.runRegistrationSystem((int) (byte) -1);
        register0.loginUser("", "hi!");
        register0.loginUser("", "hi!");
        register0.loginUser("hi!", "hi!");
        register0.registerUser("hi!", "hi!");
        register0.loginUser("hi!", "hi!");
        register0.registerUser("hi!", "");
        java.lang.Class<?> wildcardClass32 = register0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass32);
    }

    @Test
    public void test3037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest6.test3037");
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
        register0.registerUser("", "");
    }

    @Test
    public void test3038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest6.test3038");
        Register register0 = new Register();
        register0.registerUser("hi!", "");
        register0.loginUser("", "hi!");
        register0.runRegistrationSystem((int) 'a');
        register0.loginUser("hi!", "");
        register0.runRegistrationSystem((-1));
        register0.registerUser("hi!", "");
        register0.runRegistrationSystem((int) (byte) 1);
        register0.registerUser("hi!", "");
        register0.loginUser("hi!", "");
        java.lang.Class<?> wildcardClass25 = register0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test3039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest6.test3039");
        Register register0 = new Register();
        register0.registerUser("hi!", "");
        register0.loginUser("", "hi!");
        register0.runRegistrationSystem((int) (byte) -1);
        register0.loginUser("", "");
        register0.runRegistrationSystem((-1));
        register0.loginUser("", "");
        register0.runRegistrationSystem((int) (short) 10);
        register0.registerUser("", "hi!");
        register0.loginUser("", "");
    }

    @Test
    public void test3040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest6.test3040");
        Register register0 = new Register();
        register0.runRegistrationSystem((int) (byte) -1);
        register0.registerUser("hi!", "");
        register0.registerUser("", "hi!");
        register0.runRegistrationSystem((int) (short) 10);
        register0.loginUser("hi!", "hi!");
        register0.registerUser("", "");
        register0.runRegistrationSystem((int) (byte) -1);
        java.lang.Class<?> wildcardClass19 = register0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test3041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest6.test3041");
        Register register0 = new Register();
        register0.registerUser("hi!", "");
        register0.registerUser("hi!", "");
        register0.loginUser("hi!", "");
        register0.loginUser("hi!", "");
        register0.loginUser("", "hi!");
        register0.loginUser("hi!", "");
        register0.loginUser("", "hi!");
        register0.loginUser("hi!", "hi!");
    }

    @Test
    public void test3042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest6.test3042");
        Register register0 = new Register();
        register0.loginUser("hi!", "hi!");
        register0.registerUser("hi!", "");
        register0.loginUser("hi!", "hi!");
        register0.runRegistrationSystem(100);
        register0.registerUser("hi!", "");
        register0.registerUser("", "hi!");
    }

    @Test
    public void test3043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest6.test3043");
        Register register0 = new Register();
        register0.runRegistrationSystem((int) (short) 0);
        register0.loginUser("hi!", "hi!");
        register0.registerUser("", "");
        register0.runRegistrationSystem((-1));
        register0.runRegistrationSystem((int) (short) 0);
        register0.registerUser("", "");
        register0.runRegistrationSystem((int) (short) -1);
        register0.runRegistrationSystem((int) (short) 10);
        register0.registerUser("hi!", "hi!");
    }

    @Test
    public void test3044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest6.test3044");
        Register register0 = new Register();
        register0.runRegistrationSystem((int) (short) 0);
        register0.loginUser("hi!", "hi!");
        register0.registerUser("", "");
        register0.runRegistrationSystem((-1));
        register0.runRegistrationSystem((int) (short) 10);
        register0.runRegistrationSystem(10);
        register0.loginUser("hi!", "");
        register0.registerUser("", "hi!");
        register0.registerUser("hi!", "hi!");
        register0.runRegistrationSystem((int) '#');
        java.lang.Class<?> wildcardClass26 = register0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass26);
    }

    @Test
    public void test3045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest6.test3045");
        Register register0 = new Register();
        register0.registerUser("hi!", "");
        register0.loginUser("", "hi!");
        register0.runRegistrationSystem(0);
        register0.registerUser("hi!", "hi!");
        register0.loginUser("", "hi!");
        register0.registerUser("", "");
        register0.runRegistrationSystem((-1));
        register0.loginUser("hi!", "");
        register0.runRegistrationSystem((int) (short) 100);
    }

    @Test
    public void test3046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest6.test3046");
        Register register0 = new Register();
        register0.runRegistrationSystem((int) (byte) -1);
        register0.registerUser("hi!", "");
        register0.runRegistrationSystem((int) (byte) -1);
        register0.loginUser("hi!", "hi!");
        register0.registerUser("", "");
        register0.registerUser("hi!", "hi!");
        register0.runRegistrationSystem((int) (byte) 0);
        register0.registerUser("", "hi!");
        register0.loginUser("", "");
    }

    @Test
    public void test3047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest6.test3047");
        Register register0 = new Register();
        register0.loginUser("hi!", "hi!");
        register0.registerUser("hi!", "");
        register0.registerUser("", "");
        register0.registerUser("hi!", "");
        register0.registerUser("hi!", "");
        register0.registerUser("", "");
        register0.loginUser("", "");
        register0.registerUser("", "");
        register0.loginUser("hi!", "");
        register0.runRegistrationSystem((-1));
        register0.runRegistrationSystem((int) '#');
    }

    @Test
    public void test3048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest6.test3048");
        Register register0 = new Register();
        register0.registerUser("hi!", "");
        register0.loginUser("", "");
        register0.runRegistrationSystem((int) 'a');
        register0.registerUser("", "");
        register0.registerUser("hi!", "hi!");
        register0.registerUser("", "");
        register0.registerUser("", "hi!");
        register0.runRegistrationSystem((int) ' ');
        register0.registerUser("", "hi!");
        register0.loginUser("", "");
    }

    @Test
    public void test3049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest6.test3049");
        Register register0 = new Register();
        register0.loginUser("hi!", "hi!");
        register0.registerUser("hi!", "");
        register0.registerUser("", "");
        register0.registerUser("hi!", "");
        register0.registerUser("hi!", "");
        register0.registerUser("", "");
        register0.loginUser("", "");
        register0.registerUser("", "");
        register0.loginUser("", "");
        register0.runRegistrationSystem(0);
        java.lang.Class<?> wildcardClass30 = register0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass30);
    }

    @Test
    public void test3050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest6.test3050");
        Register register0 = new Register();
        register0.runRegistrationSystem((int) (short) 0);
        register0.loginUser("hi!", "hi!");
        register0.loginUser("", "");
        register0.registerUser("hi!", "");
        register0.registerUser("hi!", "");
        register0.loginUser("hi!", "");
        java.lang.Class<?> wildcardClass18 = register0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test3051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest6.test3051");
        Register register0 = new Register();
        register0.runRegistrationSystem((int) (byte) -1);
        register0.registerUser("hi!", "");
        register0.loginUser("hi!", "hi!");
        register0.loginUser("hi!", "");
        register0.registerUser("hi!", "");
        register0.registerUser("hi!", "hi!");
        register0.registerUser("", "hi!");
        register0.loginUser("hi!", "hi!");
        register0.loginUser("hi!", "hi!");
        java.lang.Class<?> wildcardClass27 = register0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test3052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest6.test3052");
        Register register0 = new Register();
        register0.runRegistrationSystem((int) '#');
        register0.loginUser("hi!", "hi!");
        register0.loginUser("hi!", "hi!");
        register0.loginUser("hi!", "");
        register0.loginUser("", "");
        register0.runRegistrationSystem((int) (short) 10);
        register0.registerUser("", "hi!");
        register0.runRegistrationSystem(1);
    }

    @Test
    public void test3053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest6.test3053");
        Register register0 = new Register();
        register0.runRegistrationSystem((int) (byte) -1);
        register0.registerUser("hi!", "");
        register0.runRegistrationSystem((int) (byte) -1);
        register0.loginUser("hi!", "hi!");
        register0.registerUser("", "");
        register0.registerUser("", "");
        register0.loginUser("hi!", "");
        register0.registerUser("", "");
    }

    @Test
    public void test3054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest6.test3054");
        Register register0 = new Register();
        register0.registerUser("hi!", "");
        register0.registerUser("hi!", "");
        register0.loginUser("hi!", "");
        register0.loginUser("hi!", "");
        register0.loginUser("", "hi!");
        register0.loginUser("hi!", "");
        register0.loginUser("", "hi!");
        register0.runRegistrationSystem((int) 'a');
        java.lang.Class<?> wildcardClass24 = register0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test3055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest6.test3055");
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
        register0.runRegistrationSystem((int) '4');
        java.lang.Class<?> wildcardClass29 = register0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass29);
    }

    @Test
    public void test3056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest6.test3056");
        Register register0 = new Register();
        register0.runRegistrationSystem((int) '#');
        register0.loginUser("hi!", "hi!");
        register0.loginUser("hi!", "hi!");
        register0.loginUser("hi!", "");
        register0.registerUser("", "hi!");
        register0.registerUser("hi!", "");
        register0.loginUser("", "hi!");
        register0.loginUser("hi!", "hi!");
        register0.loginUser("", "");
    }

    @Test
    public void test3057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest6.test3057");
        Register register0 = new Register();
        register0.runRegistrationSystem((int) (short) 0);
        register0.loginUser("hi!", "hi!");
        register0.registerUser("", "");
        register0.runRegistrationSystem((int) '#');
        register0.runRegistrationSystem((int) (byte) 0);
        register0.runRegistrationSystem(0);
        register0.registerUser("", "");
        register0.registerUser("hi!", "hi!");
        register0.loginUser("hi!", "hi!");
        register0.runRegistrationSystem((int) (byte) 0);
    }

    @Test
    public void test3058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest6.test3058");
        Register register0 = new Register();
        register0.runRegistrationSystem((int) (short) 0);
        register0.loginUser("hi!", "hi!");
        register0.registerUser("", "");
        register0.runRegistrationSystem((-1));
        register0.runRegistrationSystem((int) (short) 0);
        register0.registerUser("", "");
        register0.registerUser("", "");
        register0.registerUser("", "");
        register0.registerUser("hi!", "");
        register0.registerUser("hi!", "");
    }

    @Test
    public void test3059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest6.test3059");
        Register register0 = new Register();
        register0.registerUser("hi!", "");
        register0.registerUser("hi!", "");
        register0.runRegistrationSystem((int) (byte) 0);
        register0.registerUser("", "");
        register0.loginUser("", "");
        register0.loginUser("", "hi!");
        register0.loginUser("hi!", "");
        register0.runRegistrationSystem(0);
        register0.runRegistrationSystem((int) (byte) 100);
        register0.runRegistrationSystem(1);
        register0.loginUser("", "");
        register0.registerUser("", "");
    }

    @Test
    public void test3060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest6.test3060");
        Register register0 = new Register();
        register0.loginUser("hi!", "hi!");
        register0.runRegistrationSystem(0);
        register0.registerUser("", "");
        register0.registerUser("", "hi!");
        register0.loginUser("hi!", "");
        register0.registerUser("", "");
        register0.loginUser("hi!", "hi!");
        register0.runRegistrationSystem((int) (byte) 1);
        register0.runRegistrationSystem((int) 'a');
    }

    @Test
    public void test3061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest6.test3061");
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
        register0.registerUser("", "hi!");
        register0.runRegistrationSystem((int) '4');
    }

    @Test
    public void test3062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest6.test3062");
        Register register0 = new Register();
        register0.runRegistrationSystem((int) '#');
        register0.registerUser("", "hi!");
        register0.loginUser("hi!", "hi!");
        register0.runRegistrationSystem(100);
        register0.runRegistrationSystem((int) (short) 10);
        register0.runRegistrationSystem((int) (short) 0);
        register0.registerUser("", "hi!");
        register0.loginUser("", "");
        register0.runRegistrationSystem(1);
    }

    @Test
    public void test3063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest6.test3063");
        Register register0 = new Register();
        register0.runRegistrationSystem((int) '#');
        register0.runRegistrationSystem((int) (short) 100);
        register0.runRegistrationSystem((int) '4');
        register0.loginUser("hi!", "");
        register0.loginUser("", "");
        register0.loginUser("", "hi!");
        register0.registerUser("hi!", "");
    }

    @Test
    public void test3064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest6.test3064");
        Register register0 = new Register();
        register0.registerUser("hi!", "");
        register0.loginUser("", "hi!");
        register0.runRegistrationSystem((int) 'a');
        register0.loginUser("hi!", "");
        register0.runRegistrationSystem((int) (byte) 1);
        register0.loginUser("hi!", "hi!");
        register0.registerUser("hi!", "hi!");
        register0.runRegistrationSystem((int) (short) 100);
        register0.runRegistrationSystem((int) (byte) -1);
        register0.registerUser("", "hi!");
        register0.loginUser("hi!", "hi!");
    }

    @Test
    public void test3065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest6.test3065");
        Register register0 = new Register();
        register0.runRegistrationSystem((int) '#');
        register0.registerUser("", "hi!");
        register0.loginUser("hi!", "hi!");
        register0.runRegistrationSystem((int) (short) 10);
        register0.registerUser("hi!", "");
        register0.loginUser("hi!", "hi!");
        register0.runRegistrationSystem((int) (byte) 1);
        java.lang.Class<?> wildcardClass19 = register0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test3066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest6.test3066");
        Register register0 = new Register();
        register0.registerUser("hi!", "");
        register0.registerUser("hi!", "");
        register0.loginUser("hi!", "");
        register0.loginUser("hi!", "");
        register0.runRegistrationSystem(10);
        register0.registerUser("", "");
        register0.registerUser("", "");
        register0.registerUser("hi!", "hi!");
        register0.registerUser("hi!", "hi!");
        java.lang.Class<?> wildcardClass27 = register0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test3067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest6.test3067");
        Register register0 = new Register();
        register0.registerUser("hi!", "");
        register0.loginUser("hi!", "hi!");
        register0.runRegistrationSystem((int) '#');
        java.lang.Class<?> wildcardClass9 = register0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test3068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest6.test3068");
        Register register0 = new Register();
        register0.registerUser("hi!", "");
        register0.loginUser("", "hi!");
        register0.runRegistrationSystem((int) 'a');
        register0.loginUser("", "hi!");
        register0.loginUser("", "hi!");
        register0.loginUser("", "hi!");
        register0.registerUser("", "hi!");
        register0.runRegistrationSystem((int) '4');
        register0.runRegistrationSystem((int) (short) 0);
        register0.loginUser("hi!", "hi!");
        register0.loginUser("hi!", "hi!");
    }

    @Test
    public void test3069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest6.test3069");
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
        register0.loginUser("", "hi!");
        register0.registerUser("", "hi!");
        register0.loginUser("", "");
    }

    @Test
    public void test3070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest6.test3070");
        Register register0 = new Register();
        register0.runRegistrationSystem((int) (byte) -1);
        register0.registerUser("hi!", "");
        register0.registerUser("", "hi!");
        register0.runRegistrationSystem((int) (short) 10);
        register0.runRegistrationSystem((int) (byte) 100);
        register0.runRegistrationSystem((int) (byte) 100);
    }

    @Test
    public void test3071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest6.test3071");
        Register register0 = new Register();
        register0.registerUser("hi!", "");
        register0.registerUser("hi!", "");
        register0.runRegistrationSystem((int) (byte) 0);
        register0.runRegistrationSystem((int) (short) 10);
        register0.registerUser("", "");
        register0.registerUser("", "hi!");
        register0.runRegistrationSystem((int) (short) 1);
        register0.registerUser("hi!", "hi!");
        register0.registerUser("hi!", "hi!");
        register0.registerUser("hi!", "hi!");
    }

    @Test
    public void test3072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest6.test3072");
        Register register0 = new Register();
        register0.loginUser("hi!", "hi!");
        register0.loginUser("hi!", "hi!");
        register0.registerUser("", "");
        register0.runRegistrationSystem((int) (byte) 1);
        register0.loginUser("hi!", "");
        register0.registerUser("", "");
        java.lang.Class<?> wildcardClass18 = register0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test3073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest6.test3073");
        Register register0 = new Register();
        register0.runRegistrationSystem((int) '#');
        register0.loginUser("hi!", "hi!");
        register0.runRegistrationSystem((int) (byte) 10);
        register0.registerUser("hi!", "");
        register0.registerUser("hi!", "hi!");
        register0.registerUser("", "");
        register0.runRegistrationSystem((int) '4');
        register0.runRegistrationSystem((int) 'a');
        java.lang.Class<?> wildcardClass21 = register0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test3074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest6.test3074");
        Register register0 = new Register();
        register0.loginUser("hi!", "hi!");
        register0.runRegistrationSystem(0);
        register0.loginUser("hi!", "");
        register0.loginUser("", "hi!");
        register0.loginUser("hi!", "hi!");
        java.lang.Class<?> wildcardClass15 = register0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test3075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest6.test3075");
        Register register0 = new Register();
        register0.loginUser("hi!", "hi!");
        register0.registerUser("hi!", "");
        register0.registerUser("", "");
        register0.registerUser("", "hi!");
        register0.loginUser("hi!", "hi!");
        register0.loginUser("hi!", "hi!");
        register0.registerUser("hi!", "hi!");
        register0.runRegistrationSystem(1);
    }

    @Test
    public void test3076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest6.test3076");
        Register register0 = new Register();
        register0.runRegistrationSystem((int) (byte) -1);
        register0.registerUser("hi!", "");
        register0.loginUser("hi!", "hi!");
        register0.runRegistrationSystem((int) (short) -1);
        register0.runRegistrationSystem((int) (byte) -1);
        register0.runRegistrationSystem((int) (byte) 1);
        register0.loginUser("", "hi!");
    }

    @Test
    public void test3077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest6.test3077");
        Register register0 = new Register();
        register0.runRegistrationSystem((int) (byte) -1);
        register0.registerUser("hi!", "");
        register0.runRegistrationSystem((int) (short) 1);
        register0.loginUser("", "");
        register0.loginUser("", "hi!");
        register0.runRegistrationSystem((int) (short) -1);
        register0.loginUser("", "");
        java.lang.Class<?> wildcardClass19 = register0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test3078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest6.test3078");
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
        register0.registerUser("", "hi!");
        register0.registerUser("", "hi!");
    }

    @Test
    public void test3079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest6.test3079");
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
        register0.runRegistrationSystem((int) '4');
    }

    @Test
    public void test3080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest6.test3080");
        Register register0 = new Register();
        register0.runRegistrationSystem((int) '#');
        register0.registerUser("", "hi!");
        register0.runRegistrationSystem((int) (short) 0);
        register0.runRegistrationSystem((int) (byte) 1);
        register0.runRegistrationSystem((int) 'a');
        register0.runRegistrationSystem(0);
        register0.loginUser("hi!", "");
        register0.runRegistrationSystem((int) (byte) -1);
        register0.registerUser("hi!", "hi!");
    }

    @Test
    public void test3081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest6.test3081");
        Register register0 = new Register();
        register0.registerUser("hi!", "");
        register0.loginUser("", "hi!");
        register0.runRegistrationSystem((int) (byte) -1);
        register0.runRegistrationSystem(1);
        register0.loginUser("hi!", "");
        register0.runRegistrationSystem((int) (short) -1);
        register0.registerUser("hi!", "");
        register0.runRegistrationSystem(100);
        register0.loginUser("", "");
    }

    @Test
    public void test3082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest6.test3082");
        Register register0 = new Register();
        register0.runRegistrationSystem((int) (byte) -1);
        register0.registerUser("hi!", "");
        register0.runRegistrationSystem((int) (short) 1);
        register0.loginUser("", "");
        register0.loginUser("", "hi!");
        register0.runRegistrationSystem(100);
        java.lang.Class<?> wildcardClass16 = register0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test3083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest6.test3083");
        Register register0 = new Register();
        register0.registerUser("hi!", "");
        register0.registerUser("hi!", "");
        register0.runRegistrationSystem((int) (byte) -1);
        register0.registerUser("", "hi!");
        register0.registerUser("hi!", "hi!");
        register0.registerUser("", "hi!");
        java.lang.Class<?> wildcardClass18 = register0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test3084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest6.test3084");
        Register register0 = new Register();
        register0.runRegistrationSystem((int) (short) 0);
        register0.loginUser("hi!", "hi!");
        register0.registerUser("", "");
        register0.runRegistrationSystem((-1));
        register0.loginUser("hi!", "");
        register0.registerUser("hi!", "hi!");
        register0.runRegistrationSystem(1);
        register0.runRegistrationSystem((int) (short) 100);
        register0.runRegistrationSystem((int) (short) 10);
        register0.runRegistrationSystem((int) ' ');
        java.lang.Class<?> wildcardClass25 = register0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test3085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest6.test3085");
        Register register0 = new Register();
        register0.runRegistrationSystem((int) (byte) -1);
        register0.runRegistrationSystem((int) (byte) 10);
        register0.registerUser("", "");
        register0.registerUser("", "hi!");
        register0.runRegistrationSystem((int) '4');
        register0.runRegistrationSystem((int) (short) 10);
        register0.loginUser("", "hi!");
    }

    @Test
    public void test3086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest6.test3086");
        Register register0 = new Register();
        register0.runRegistrationSystem((int) '#');
        register0.runRegistrationSystem((int) (short) 100);
        register0.registerUser("hi!", "");
        register0.registerUser("hi!", "");
        register0.loginUser("hi!", "");
        register0.registerUser("", "");
        register0.loginUser("hi!", "hi!");
        register0.runRegistrationSystem((int) '4');
    }

    @Test
    public void test3087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest6.test3087");
        Register register0 = new Register();
        register0.loginUser("hi!", "hi!");
        register0.registerUser("hi!", "hi!");
        register0.registerUser("", "hi!");
        register0.registerUser("hi!", "");
        register0.loginUser("hi!", "hi!");
        register0.runRegistrationSystem(100);
        register0.loginUser("hi!", "hi!");
        register0.runRegistrationSystem((int) (short) 100);
    }

    @Test
    public void test3088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest6.test3088");
        Register register0 = new Register();
        register0.loginUser("hi!", "hi!");
        register0.registerUser("hi!", "");
        register0.loginUser("hi!", "hi!");
        register0.registerUser("", "");
        register0.runRegistrationSystem(0);
        register0.registerUser("", "");
        java.lang.Class<?> wildcardClass18 = register0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test3089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest6.test3089");
        Register register0 = new Register();
        register0.loginUser("hi!", "hi!");
        register0.registerUser("hi!", "");
        register0.registerUser("hi!", "");
        register0.loginUser("", "hi!");
        register0.loginUser("", "hi!");
    }

    @Test
    public void test3090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest6.test3090");
        Register register0 = new Register();
        register0.loginUser("hi!", "hi!");
        register0.registerUser("hi!", "");
        register0.registerUser("", "");
        register0.registerUser("", "hi!");
        register0.runRegistrationSystem((int) (short) 100);
        register0.runRegistrationSystem((int) (byte) 1);
        register0.runRegistrationSystem((-1));
        register0.loginUser("", "");
        register0.runRegistrationSystem((int) (short) 1);
    }

    @Test
    public void test3091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest6.test3091");
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
        register0.runRegistrationSystem(1);
        register0.runRegistrationSystem((int) (short) 0);
        java.lang.Class<?> wildcardClass29 = register0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass29);
    }

    @Test
    public void test3092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest6.test3092");
        Register register0 = new Register();
        register0.runRegistrationSystem((int) (short) 0);
        register0.loginUser("hi!", "hi!");
        register0.registerUser("", "");
        register0.runRegistrationSystem((-1));
        register0.runRegistrationSystem((int) (short) 10);
        register0.runRegistrationSystem(10);
        register0.loginUser("", "hi!");
        register0.runRegistrationSystem((int) (byte) 100);
        register0.registerUser("", "");
        register0.runRegistrationSystem((int) (byte) 0);
    }

    @Test
    public void test3093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest6.test3093");
        Register register0 = new Register();
        register0.runRegistrationSystem((int) (byte) -1);
        register0.registerUser("hi!", "");
        register0.runRegistrationSystem(0);
        register0.runRegistrationSystem(1);
        register0.registerUser("", "");
        register0.loginUser("hi!", "");
        register0.runRegistrationSystem((int) (byte) 100);
        register0.runRegistrationSystem(0);
    }

    @Test
    public void test3094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest6.test3094");
        Register register0 = new Register();
        register0.runRegistrationSystem((int) (byte) -1);
        register0.registerUser("hi!", "");
        register0.loginUser("hi!", "hi!");
        register0.loginUser("hi!", "");
        register0.registerUser("hi!", "");
        register0.registerUser("hi!", "hi!");
        register0.registerUser("", "hi!");
        register0.loginUser("", "hi!");
        register0.loginUser("", "hi!");
        register0.runRegistrationSystem((int) '4');
        register0.runRegistrationSystem((int) (byte) 10);
        register0.registerUser("", "hi!");
        register0.loginUser("hi!", "");
    }

    @Test
    public void test3095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest6.test3095");
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
        register0.runRegistrationSystem((int) (byte) -1);
        register0.loginUser("", "hi!");
    }

    @Test
    public void test3096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest6.test3096");
        Register register0 = new Register();
        register0.runRegistrationSystem((int) (byte) -1);
        register0.runRegistrationSystem((int) (byte) 10);
        register0.registerUser("", "");
        register0.loginUser("", "");
        register0.runRegistrationSystem((int) (byte) 0);
        register0.runRegistrationSystem((int) (byte) -1);
        register0.registerUser("hi!", "");
        register0.loginUser("hi!", "hi!");
        register0.runRegistrationSystem(10);
    }

    @Test
    public void test3097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest6.test3097");
        Register register0 = new Register();
        register0.runRegistrationSystem((int) (short) 0);
        register0.loginUser("hi!", "hi!");
        register0.registerUser("", "");
        register0.runRegistrationSystem((int) '#');
        register0.runRegistrationSystem((int) (byte) 0);
        register0.registerUser("", "");
        register0.registerUser("", "hi!");
        register0.loginUser("hi!", "hi!");
        java.lang.Class<?> wildcardClass22 = register0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test3098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest6.test3098");
        Register register0 = new Register();
        register0.registerUser("hi!", "");
        register0.loginUser("", "hi!");
        register0.loginUser("", "hi!");
        register0.runRegistrationSystem(10);
        register0.loginUser("", "");
        register0.loginUser("", "hi!");
        register0.loginUser("", "hi!");
        register0.runRegistrationSystem(0);
    }

    @Test
    public void test3099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest6.test3099");
        Register register0 = new Register();
        register0.runRegistrationSystem((int) '#');
        register0.registerUser("", "hi!");
        register0.runRegistrationSystem((int) (short) 0);
        register0.runRegistrationSystem((int) (byte) 1);
        register0.runRegistrationSystem((int) 'a');
        register0.runRegistrationSystem(0);
        register0.runRegistrationSystem((int) (short) 10);
        register0.loginUser("hi!", "");
        register0.runRegistrationSystem((int) (byte) 10);
        register0.runRegistrationSystem(100);
        register0.runRegistrationSystem(0);
    }

    @Test
    public void test3100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest6.test3100");
        Register register0 = new Register();
        register0.runRegistrationSystem((int) (short) 0);
        register0.loginUser("hi!", "hi!");
        register0.registerUser("", "");
        register0.runRegistrationSystem((-1));
        register0.runRegistrationSystem((int) (short) 0);
        register0.registerUser("", "");
        register0.loginUser("hi!", "hi!");
        register0.runRegistrationSystem(100);
        register0.runRegistrationSystem(0);
    }

    @Test
    public void test3101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest6.test3101");
        Register register0 = new Register();
        register0.registerUser("", "");
        register0.registerUser("", "hi!");
        register0.registerUser("", "");
        register0.loginUser("hi!", "");
        register0.runRegistrationSystem((int) (short) 0);
        register0.runRegistrationSystem((int) (short) -1);
        register0.loginUser("hi!", "");
    }

    @Test
    public void test3102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest6.test3102");
        Register register0 = new Register();
        register0.registerUser("hi!", "");
        register0.loginUser("", "hi!");
        register0.runRegistrationSystem((int) 'a');
        register0.loginUser("", "hi!");
        register0.loginUser("", "hi!");
        register0.registerUser("", "");
        register0.registerUser("hi!", "");
        register0.runRegistrationSystem((int) ' ');
        register0.loginUser("hi!", "hi!");
    }

    @Test
    public void test3103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest6.test3103");
        Register register0 = new Register();
        register0.registerUser("hi!", "");
        register0.runRegistrationSystem(1);
        register0.registerUser("", "");
        register0.registerUser("hi!", "");
        register0.runRegistrationSystem((int) (short) 1);
        register0.registerUser("", "hi!");
        register0.registerUser("hi!", "hi!");
    }

    @Test
    public void test3104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest6.test3104");
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
        register0.runRegistrationSystem((int) (short) 10);
        java.lang.Class<?> wildcardClass38 = register0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass38);
    }

    @Test
    public void test3105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest6.test3105");
        Register register0 = new Register();
        register0.runRegistrationSystem((int) (byte) -1);
        register0.runRegistrationSystem((int) '#');
        register0.loginUser("", "");
        register0.runRegistrationSystem((int) (short) 0);
        register0.loginUser("hi!", "");
        register0.loginUser("", "hi!");
        register0.registerUser("hi!", "");
        java.lang.Class<?> wildcardClass19 = register0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test3106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest6.test3106");
        Register register0 = new Register();
        register0.runRegistrationSystem((int) (short) 0);
        register0.loginUser("hi!", "hi!");
        register0.registerUser("", "");
        register0.runRegistrationSystem((-1));
        register0.loginUser("", "hi!");
        register0.loginUser("hi!", "hi!");
        register0.registerUser("hi!", "");
        register0.runRegistrationSystem((int) (short) -1);
        register0.runRegistrationSystem(0);
        register0.runRegistrationSystem((int) (short) 0);
        register0.registerUser("hi!", "");
        register0.registerUser("", "");
        register0.registerUser("", "");
    }

    @Test
    public void test3107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest6.test3107");
        Register register0 = new Register();
        register0.loginUser("hi!", "hi!");
        register0.runRegistrationSystem(0);
        register0.runRegistrationSystem(10);
        register0.registerUser("hi!", "");
        register0.registerUser("hi!", "hi!");
        register0.loginUser("hi!", "hi!");
    }

    @Test
    public void test3108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest6.test3108");
        Register register0 = new Register();
        register0.loginUser("hi!", "hi!");
        register0.registerUser("hi!", "");
        register0.loginUser("hi!", "hi!");
        register0.registerUser("", "");
        register0.runRegistrationSystem(0);
        register0.registerUser("", "");
        register0.registerUser("", "hi!");
        register0.registerUser("", "hi!");
    }

    @Test
    public void test3109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest6.test3109");
        Register register0 = new Register();
        register0.runRegistrationSystem((int) (short) 0);
        register0.loginUser("hi!", "hi!");
        register0.registerUser("", "");
        register0.loginUser("", "hi!");
        register0.registerUser("hi!", "");
        register0.registerUser("hi!", "");
        register0.runRegistrationSystem((int) (byte) 1);
        register0.registerUser("", "");
        register0.loginUser("", "hi!");
    }

    @Test
    public void test3110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest6.test3110");
        Register register0 = new Register();
        register0.runRegistrationSystem((int) (byte) -1);
        register0.registerUser("hi!", "");
        register0.loginUser("hi!", "hi!");
        register0.runRegistrationSystem((int) (byte) 1);
        register0.registerUser("", "hi!");
        register0.loginUser("", "");
        register0.runRegistrationSystem(0);
        register0.registerUser("hi!", "hi!");
    }

    @Test
    public void test3111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest6.test3111");
        Register register0 = new Register();
        register0.runRegistrationSystem((int) '#');
        register0.registerUser("", "hi!");
        register0.registerUser("hi!", "");
        register0.runRegistrationSystem((int) (byte) 100);
        register0.registerUser("", "hi!");
    }

    @Test
    public void test3112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest6.test3112");
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
        register0.registerUser("hi!", "");
        register0.registerUser("", "hi!");
        register0.loginUser("hi!", "hi!");
        register0.runRegistrationSystem(0);
    }

    @Test
    public void test3113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest6.test3113");
        Register register0 = new Register();
        register0.loginUser("hi!", "hi!");
        register0.runRegistrationSystem(0);
        register0.registerUser("", "");
        register0.runRegistrationSystem((-1));
        register0.loginUser("", "");
        register0.registerUser("", "hi!");
        register0.registerUser("hi!", "hi!");
        java.lang.Class<?> wildcardClass20 = register0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test3114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest6.test3114");
        Register register0 = new Register();
        register0.runRegistrationSystem((int) '#');
        register0.registerUser("", "hi!");
        register0.runRegistrationSystem((int) (short) 0);
        register0.loginUser("hi!", "hi!");
        register0.registerUser("", "hi!");
        register0.runRegistrationSystem((int) (byte) -1);
        register0.runRegistrationSystem((int) (byte) -1);
        register0.registerUser("hi!", "");
        register0.registerUser("", "");
    }

    @Test
    public void test3115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest6.test3115");
        Register register0 = new Register();
        register0.runRegistrationSystem((int) '#');
        register0.registerUser("", "hi!");
        register0.runRegistrationSystem((int) (short) 0);
        register0.runRegistrationSystem((int) (byte) 1);
        register0.registerUser("", "");
        register0.loginUser("", "");
        register0.loginUser("", "");
        register0.registerUser("hi!", "hi!");
        register0.loginUser("", "hi!");
        register0.registerUser("hi!", "hi!");
        register0.runRegistrationSystem(0);
        register0.runRegistrationSystem((int) (short) -1);
    }

    @Test
    public void test3116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest6.test3116");
        Register register0 = new Register();
        register0.runRegistrationSystem((int) (byte) -1);
        register0.registerUser("hi!", "");
        register0.runRegistrationSystem((int) (short) 1);
        register0.loginUser("", "hi!");
        register0.runRegistrationSystem((int) '4');
        register0.loginUser("hi!", "");
        java.lang.Class<?> wildcardClass16 = register0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test3117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest6.test3117");
        Register register0 = new Register();
        register0.registerUser("hi!", "");
        register0.registerUser("hi!", "");
        register0.runRegistrationSystem((int) (byte) 0);
        register0.registerUser("", "");
        register0.runRegistrationSystem((int) (byte) 10);
        register0.registerUser("", "hi!");
        register0.registerUser("", "hi!");
        register0.runRegistrationSystem(0);
        register0.registerUser("", "");
        register0.loginUser("hi!", "");
    }

    @Test
    public void test3118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest6.test3118");
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
        register0.registerUser("hi!", "");
    }

    @Test
    public void test3119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest6.test3119");
        Register register0 = new Register();
        register0.loginUser("hi!", "hi!");
        register0.registerUser("hi!", "");
        register0.loginUser("hi!", "hi!");
        register0.runRegistrationSystem(100);
        register0.loginUser("hi!", "");
        register0.registerUser("", "");
    }

    @Test
    public void test3120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest6.test3120");
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
        register0.registerUser("hi!", "");
        register0.loginUser("", "");
        register0.runRegistrationSystem((int) (byte) 100);
        register0.registerUser("", "hi!");
        register0.loginUser("", "hi!");
    }

    @Test
    public void test3121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest6.test3121");
        Register register0 = new Register();
        register0.registerUser("", "hi!");
        register0.registerUser("", "");
        register0.registerUser("hi!", "");
        register0.loginUser("", "");
        register0.runRegistrationSystem((int) (byte) 0);
        register0.registerUser("", "hi!");
        register0.runRegistrationSystem((int) '4');
    }

    @Test
    public void test3122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest6.test3122");
        Register register0 = new Register();
        register0.runRegistrationSystem((int) (short) 0);
        register0.loginUser("hi!", "hi!");
        register0.registerUser("", "");
        register0.runRegistrationSystem((int) '#');
        register0.runRegistrationSystem((int) (byte) 0);
        register0.runRegistrationSystem(0);
        register0.registerUser("", "hi!");
        register0.runRegistrationSystem((int) (short) -1);
        register0.loginUser("hi!", "hi!");
        register0.loginUser("hi!", "hi!");
    }

    @Test
    public void test3123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest6.test3123");
        Register register0 = new Register();
        register0.runRegistrationSystem((int) '#');
        register0.registerUser("", "hi!");
        register0.runRegistrationSystem((int) (short) 0);
        register0.runRegistrationSystem((int) (byte) 1);
        register0.runRegistrationSystem((int) 'a');
        register0.registerUser("hi!", "hi!");
        register0.registerUser("", "");
        register0.runRegistrationSystem((int) (short) -1);
        register0.runRegistrationSystem((int) (short) 0);
        register0.runRegistrationSystem(100);
        register0.runRegistrationSystem((int) (short) 10);
    }

    @Test
    public void test3124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest6.test3124");
        Register register0 = new Register();
        register0.registerUser("hi!", "");
        register0.registerUser("hi!", "");
        register0.loginUser("hi!", "");
        register0.loginUser("hi!", "");
        register0.runRegistrationSystem(1);
        register0.runRegistrationSystem((int) (byte) -1);
        register0.registerUser("", "");
    }

    @Test
    public void test3125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest6.test3125");
        Register register0 = new Register();
        register0.runRegistrationSystem((int) (byte) -1);
        register0.runRegistrationSystem((int) (byte) 10);
        register0.registerUser("", "");
        register0.loginUser("", "");
        register0.registerUser("", "hi!");
        register0.registerUser("hi!", "");
        register0.loginUser("hi!", "hi!");
        register0.runRegistrationSystem((int) (byte) 0);
        register0.runRegistrationSystem((int) (short) 100);
    }

    @Test
    public void test3126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest6.test3126");
        Register register0 = new Register();
        register0.registerUser("hi!", "");
        register0.loginUser("", "hi!");
        register0.runRegistrationSystem((int) 'a');
        register0.loginUser("", "hi!");
        register0.loginUser("", "hi!");
        register0.runRegistrationSystem((int) ' ');
        register0.registerUser("hi!", "hi!");
        register0.runRegistrationSystem(100);
        java.lang.Class<?> wildcardClass22 = register0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test3127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest6.test3127");
        Register register0 = new Register();
        register0.loginUser("hi!", "hi!");
        register0.runRegistrationSystem(0);
        register0.loginUser("", "hi!");
        register0.registerUser("", "hi!");
        register0.runRegistrationSystem(10);
        register0.loginUser("hi!", "hi!");
        register0.loginUser("", "hi!");
        register0.registerUser("", "");
        java.lang.Class<?> wildcardClass23 = register0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test3128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest6.test3128");
        Register register0 = new Register();
        register0.loginUser("hi!", "hi!");
        register0.loginUser("hi!", "");
        register0.runRegistrationSystem((int) (byte) 1);
        register0.runRegistrationSystem(100);
        register0.runRegistrationSystem((int) '#');
    }

    @Test
    public void test3129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest6.test3129");
        Register register0 = new Register();
        register0.loginUser("hi!", "hi!");
        register0.registerUser("hi!", "");
        register0.registerUser("", "");
        register0.registerUser("hi!", "");
        register0.registerUser("hi!", "");
        register0.registerUser("", "");
        register0.runRegistrationSystem(0);
        register0.registerUser("", "");
    }

    @Test
    public void test3130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest6.test3130");
        Register register0 = new Register();
        register0.loginUser("hi!", "hi!");
        register0.runRegistrationSystem(0);
        register0.registerUser("", "");
        register0.loginUser("", "hi!");
        register0.registerUser("", "");
        register0.loginUser("", "");
        register0.loginUser("hi!", "");
        register0.runRegistrationSystem((int) (short) 100);
    }

    @Test
    public void test3131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest6.test3131");
        Register register0 = new Register();
        register0.runRegistrationSystem((int) (short) 0);
        register0.loginUser("hi!", "hi!");
        register0.registerUser("", "");
        register0.runRegistrationSystem((-1));
        register0.runRegistrationSystem((int) (short) 0);
        register0.runRegistrationSystem((int) ' ');
        register0.loginUser("hi!", "hi!");
        register0.registerUser("hi!", "");
    }

    @Test
    public void test3132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest6.test3132");
        Register register0 = new Register();
        register0.runRegistrationSystem((int) '#');
        register0.registerUser("", "hi!");
        register0.runRegistrationSystem((int) (short) 0);
        register0.runRegistrationSystem((int) (byte) 1);
        register0.runRegistrationSystem((int) 'a');
        register0.runRegistrationSystem(0);
        register0.runRegistrationSystem((int) (short) 10);
        register0.loginUser("", "");
    }

    @Test
    public void test3133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest6.test3133");
        Register register0 = new Register();
        register0.loginUser("hi!", "hi!");
        register0.runRegistrationSystem(0);
        register0.registerUser("", "");
        register0.loginUser("", "hi!");
        register0.registerUser("", "");
        register0.loginUser("", "hi!");
        register0.loginUser("", "hi!");
        register0.registerUser("", "");
        java.lang.Class<?> wildcardClass24 = register0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test3134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest6.test3134");
        Register register0 = new Register();
        register0.runRegistrationSystem((int) '#');
        register0.registerUser("", "hi!");
        register0.loginUser("hi!", "hi!");
        register0.loginUser("", "hi!");
        register0.runRegistrationSystem((int) (byte) 1);
        register0.registerUser("", "hi!");
        register0.loginUser("hi!", "hi!");
        register0.loginUser("", "");
        java.lang.Class<?> wildcardClass23 = register0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test3135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest6.test3135");
        Register register0 = new Register();
        register0.registerUser("", "hi!");
        register0.registerUser("", "hi!");
        register0.registerUser("hi!", "");
        register0.registerUser("", "hi!");
        register0.registerUser("hi!", "hi!");
        register0.registerUser("", "");
    }

    @Test
    public void test3136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest6.test3136");
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
        register0.runRegistrationSystem((int) '4');
        register0.registerUser("hi!", "");
    }

    @Test
    public void test3137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest6.test3137");
        Register register0 = new Register();
        register0.runRegistrationSystem((int) (short) 0);
        register0.loginUser("hi!", "hi!");
        register0.registerUser("", "");
        register0.runRegistrationSystem((-1));
        register0.runRegistrationSystem((int) (short) 10);
        register0.runRegistrationSystem(10);
        register0.loginUser("hi!", "");
        register0.runRegistrationSystem((int) (short) 0);
        register0.loginUser("", "");
        register0.registerUser("hi!", "hi!");
    }

    @Test
    public void test3138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest6.test3138");
        Register register0 = new Register();
        register0.loginUser("hi!", "hi!");
        register0.registerUser("hi!", "hi!");
        register0.loginUser("", "");
        register0.runRegistrationSystem((int) '4');
        register0.runRegistrationSystem((int) (byte) 100);
    }

    @Test
    public void test3139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest6.test3139");
        Register register0 = new Register();
        register0.loginUser("hi!", "hi!");
        register0.registerUser("hi!", "hi!");
        register0.loginUser("hi!", "hi!");
        register0.runRegistrationSystem(0);
        register0.loginUser("", "");
        register0.loginUser("hi!", "hi!");
    }

    @Test
    public void test3140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest6.test3140");
        Register register0 = new Register();
        register0.runRegistrationSystem((int) (byte) -1);
        register0.registerUser("hi!", "");
        register0.registerUser("", "hi!");
        register0.runRegistrationSystem((int) (short) 10);
        register0.loginUser("hi!", "hi!");
        register0.loginUser("", "hi!");
        register0.loginUser("hi!", "");
        register0.loginUser("hi!", "");
        register0.registerUser("", "");
        register0.runRegistrationSystem(1);
    }

    @Test
    public void test3141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest6.test3141");
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
        register0.registerUser("", "hi!");
        java.lang.Class<?> wildcardClass28 = register0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test3142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest6.test3142");
        Register register0 = new Register();
        register0.runRegistrationSystem((int) (short) 0);
        register0.loginUser("hi!", "hi!");
        register0.loginUser("", "");
        register0.registerUser("hi!", "");
        register0.registerUser("hi!", "hi!");
        register0.runRegistrationSystem((int) 'a');
        register0.loginUser("hi!", "");
        register0.runRegistrationSystem((int) 'a');
        java.lang.Class<?> wildcardClass22 = register0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test3143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest6.test3143");
        Register register0 = new Register();
        register0.loginUser("hi!", "hi!");
        register0.registerUser("hi!", "");
        register0.registerUser("", "");
        register0.registerUser("", "hi!");
        register0.loginUser("hi!", "hi!");
        register0.runRegistrationSystem(0);
        register0.loginUser("hi!", "hi!");
        register0.runRegistrationSystem((int) '#');
    }

    @Test
    public void test3144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest6.test3144");
        Register register0 = new Register();
        register0.loginUser("hi!", "hi!");
        register0.runRegistrationSystem(0);
        register0.registerUser("", "");
        register0.runRegistrationSystem((-1));
        register0.runRegistrationSystem((int) (short) 10);
        register0.registerUser("hi!", "hi!");
        register0.registerUser("", "hi!");
        register0.runRegistrationSystem((int) (short) -1);
    }

    @Test
    public void test3145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest6.test3145");
        Register register0 = new Register();
        register0.runRegistrationSystem((int) (byte) -1);
        register0.registerUser("hi!", "");
        register0.loginUser("hi!", "hi!");
        register0.runRegistrationSystem((int) (byte) 1);
        register0.registerUser("hi!", "hi!");
        register0.runRegistrationSystem(0);
        register0.runRegistrationSystem((int) '#');
    }

    @Test
    public void test3146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest6.test3146");
        Register register0 = new Register();
        register0.registerUser("hi!", "");
        register0.loginUser("", "hi!");
        register0.runRegistrationSystem((int) 'a');
        register0.loginUser("", "hi!");
        register0.loginUser("", "hi!");
        register0.registerUser("", "");
        register0.registerUser("", "hi!");
        register0.loginUser("hi!", "");
        register0.registerUser("", "hi!");
        register0.runRegistrationSystem((int) (byte) 1);
        register0.registerUser("", "");
    }

    @Test
    public void test3147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest6.test3147");
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
        register0.runRegistrationSystem((int) (short) 100);
    }

    @Test
    public void test3148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest6.test3148");
        Register register0 = new Register();
        register0.registerUser("hi!", "");
        register0.loginUser("", "hi!");
        register0.runRegistrationSystem((int) (byte) -1);
        register0.loginUser("", "");
        register0.runRegistrationSystem((-1));
        register0.loginUser("", "");
        register0.runRegistrationSystem((int) (short) 10);
        register0.registerUser("hi!", "");
        register0.registerUser("", "");
        register0.registerUser("hi!", "hi!");
        java.lang.Class<?> wildcardClass28 = register0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test3149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest6.test3149");
        Register register0 = new Register();
        register0.registerUser("hi!", "");
        register0.loginUser("", "");
        register0.runRegistrationSystem((int) 'a');
        register0.loginUser("", "");
        register0.runRegistrationSystem((int) (byte) 100);
        register0.registerUser("", "hi!");
        register0.runRegistrationSystem((int) 'a');
    }

    @Test
    public void test3150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest6.test3150");
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
        register0.runRegistrationSystem((int) (byte) 0);
        register0.registerUser("", "");
        register0.runRegistrationSystem((int) (byte) 0);
    }

    @Test
    public void test3151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest6.test3151");
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
        register0.runRegistrationSystem(0);
    }

    @Test
    public void test3152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest6.test3152");
        Register register0 = new Register();
        register0.registerUser("hi!", "");
        register0.runRegistrationSystem(1);
        register0.loginUser("hi!", "");
        register0.registerUser("", "hi!");
        register0.runRegistrationSystem((int) (short) 0);
        register0.runRegistrationSystem((int) (byte) 1);
        register0.runRegistrationSystem(1);
    }

    @Test
    public void test3153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest6.test3153");
        Register register0 = new Register();
        register0.runRegistrationSystem((int) (byte) -1);
        register0.registerUser("hi!", "");
        register0.runRegistrationSystem((int) (byte) -1);
        register0.runRegistrationSystem((int) (byte) -1);
        register0.registerUser("", "hi!");
    }

    @Test
    public void test3154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest6.test3154");
        Register register0 = new Register();
        register0.runRegistrationSystem((int) '#');
        register0.registerUser("", "hi!");
        register0.runRegistrationSystem((int) (short) 0);
        register0.runRegistrationSystem((int) (byte) 1);
        register0.runRegistrationSystem((int) (byte) 0);
        register0.registerUser("hi!", "");
        register0.runRegistrationSystem((int) (short) 100);
    }

    @Test
    public void test3155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest6.test3155");
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
        register0.runRegistrationSystem((int) 'a');
        register0.runRegistrationSystem((int) (short) 100);
    }

    @Test
    public void test3156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest6.test3156");
        Register register0 = new Register();
        register0.runRegistrationSystem((int) '#');
        register0.runRegistrationSystem((int) (short) 100);
        register0.runRegistrationSystem((int) '4');
        register0.runRegistrationSystem((int) (short) -1);
        register0.loginUser("", "hi!");
        register0.loginUser("", "");
    }

    @Test
    public void test3157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest6.test3157");
        Register register0 = new Register();
        register0.registerUser("hi!", "");
        register0.loginUser("", "hi!");
        register0.runRegistrationSystem((int) (byte) -1);
        register0.runRegistrationSystem(10);
        register0.registerUser("", "hi!");
        register0.runRegistrationSystem((int) (byte) 0);
        java.lang.Class<?> wildcardClass16 = register0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test3158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest6.test3158");
        Register register0 = new Register();
        register0.loginUser("hi!", "hi!");
        register0.loginUser("hi!", "hi!");
        register0.registerUser("", "");
        register0.runRegistrationSystem((-1));
        register0.registerUser("", "hi!");
        register0.registerUser("", "");
    }

    @Test
    public void test3159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest6.test3159");
        Register register0 = new Register();
        register0.runRegistrationSystem((int) (short) 0);
        register0.loginUser("hi!", "hi!");
        register0.registerUser("", "");
        register0.runRegistrationSystem((-1));
        register0.runRegistrationSystem((int) (short) 10);
        register0.runRegistrationSystem(10);
        register0.registerUser("hi!", "");
        register0.runRegistrationSystem((-1));
        register0.registerUser("", "");
        register0.loginUser("", "hi!");
        register0.loginUser("", "");
    }

    @Test
    public void test3160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest6.test3160");
        Register register0 = new Register();
        register0.registerUser("hi!", "");
        register0.runRegistrationSystem(1);
        register0.registerUser("", "hi!");
        register0.runRegistrationSystem(100);
        register0.runRegistrationSystem(0);
        register0.registerUser("", "hi!");
    }

    @Test
    public void test3161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest6.test3161");
        Register register0 = new Register();
        register0.runRegistrationSystem((int) '#');
        register0.registerUser("", "hi!");
        register0.loginUser("hi!", "hi!");
        register0.loginUser("", "hi!");
        register0.runRegistrationSystem((int) (byte) 1);
        register0.runRegistrationSystem(10);
        register0.registerUser("", "");
        register0.loginUser("", "");
        register0.registerUser("", "");
    }

    @Test
    public void test3162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest6.test3162");
        Register register0 = new Register();
        register0.runRegistrationSystem((int) '#');
        register0.registerUser("", "hi!");
        register0.loginUser("hi!", "hi!");
        register0.runRegistrationSystem(100);
        register0.runRegistrationSystem((int) (short) 10);
        register0.runRegistrationSystem((int) (short) 0);
        register0.loginUser("hi!", "");
        register0.runRegistrationSystem((int) (byte) 0);
        register0.loginUser("hi!", "");
        register0.runRegistrationSystem((int) (byte) -1);
    }

    @Test
    public void test3163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest6.test3163");
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
        register0.runRegistrationSystem(100);
    }

    @Test
    public void test3164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest6.test3164");
        Register register0 = new Register();
        register0.registerUser("hi!", "");
        register0.loginUser("", "hi!");
        register0.runRegistrationSystem((int) 'a');
        register0.loginUser("", "hi!");
        register0.loginUser("", "hi!");
        register0.registerUser("", "");
        register0.registerUser("hi!", "");
        register0.registerUser("hi!", "hi!");
        register0.loginUser("hi!", "hi!");
    }

    @Test
    public void test3165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest6.test3165");
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
        register0.registerUser("hi!", "");
        register0.registerUser("", "hi!");
        register0.runRegistrationSystem((int) (byte) 1);
        register0.loginUser("", "hi!");
    }

    @Test
    public void test3166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest6.test3166");
        Register register0 = new Register();
        register0.registerUser("hi!", "");
        register0.loginUser("", "hi!");
        register0.runRegistrationSystem((int) 'a');
        register0.loginUser("", "hi!");
        register0.loginUser("", "hi!");
        register0.loginUser("", "hi!");
        register0.registerUser("", "hi!");
        register0.runRegistrationSystem((int) (short) 1);
        register0.loginUser("", "");
        register0.runRegistrationSystem((int) ' ');
        register0.registerUser("hi!", "");
    }

    @Test
    public void test3167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest6.test3167");
        Register register0 = new Register();
        register0.registerUser("", "hi!");
        register0.loginUser("hi!", "hi!");
        register0.loginUser("hi!", "");
        register0.runRegistrationSystem(0);
    }

    @Test
    public void test3168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest6.test3168");
        Register register0 = new Register();
        register0.registerUser("hi!", "");
        register0.registerUser("hi!", "");
        register0.loginUser("hi!", "");
        register0.runRegistrationSystem((int) (byte) 1);
        register0.runRegistrationSystem((int) (short) 100);
    }

    @Test
    public void test3169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest6.test3169");
        Register register0 = new Register();
        register0.registerUser("hi!", "");
        register0.runRegistrationSystem(1);
        register0.registerUser("", "");
        register0.runRegistrationSystem((int) (short) -1);
        register0.loginUser("", "");
        register0.loginUser("hi!", "");
        register0.loginUser("hi!", "hi!");
        register0.registerUser("", "hi!");
        register0.registerUser("hi!", "");
        register0.loginUser("hi!", "");
        register0.runRegistrationSystem(1);
    }

    @Test
    public void test3170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest6.test3170");
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
        register0.loginUser("", "");
        register0.registerUser("hi!", "");
        java.lang.Class<?> wildcardClass31 = register0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test3171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest6.test3171");
        Register register0 = new Register();
        register0.runRegistrationSystem((int) '#');
        register0.loginUser("hi!", "hi!");
        register0.runRegistrationSystem((int) (byte) 10);
        register0.runRegistrationSystem((int) '#');
        register0.registerUser("", "hi!");
    }

    @Test
    public void test3172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest6.test3172");
        Register register0 = new Register();
        register0.runRegistrationSystem((int) '#');
        register0.loginUser("hi!", "hi!");
        register0.runRegistrationSystem((int) (byte) 10);
        register0.registerUser("hi!", "");
        register0.registerUser("hi!", "hi!");
        register0.registerUser("", "");
        register0.runRegistrationSystem((int) '4');
        register0.loginUser("hi!", "");
    }

    @Test
    public void test3173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest6.test3173");
        Register register0 = new Register();
        register0.runRegistrationSystem((int) (byte) -1);
        register0.registerUser("hi!", "");
        register0.runRegistrationSystem((int) (byte) 100);
        register0.runRegistrationSystem((int) (short) -1);
        register0.runRegistrationSystem(100);
        register0.loginUser("", "");
    }

    @Test
    public void test3174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest6.test3174");
        Register register0 = new Register();
        register0.registerUser("hi!", "");
        register0.runRegistrationSystem(1);
        register0.registerUser("", "");
        register0.runRegistrationSystem((int) (short) -1);
        register0.loginUser("", "");
        register0.loginUser("hi!", "");
        register0.loginUser("hi!", "hi!");
        register0.runRegistrationSystem((-1));
        register0.runRegistrationSystem((int) (byte) 100);
        register0.loginUser("hi!", "");
        register0.loginUser("", "hi!");
    }

    @Test
    public void test3175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest6.test3175");
        Register register0 = new Register();
        register0.runRegistrationSystem((int) (byte) -1);
        register0.runRegistrationSystem((int) (byte) 10);
        register0.registerUser("", "");
        register0.loginUser("", "");
        register0.runRegistrationSystem((int) (byte) 0);
        register0.runRegistrationSystem((int) (byte) -1);
        register0.registerUser("hi!", "hi!");
    }

    @Test
    public void test3176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest6.test3176");
        Register register0 = new Register();
        register0.loginUser("hi!", "hi!");
        register0.registerUser("hi!", "");
        register0.registerUser("", "");
        register0.runRegistrationSystem((int) (byte) 100);
        register0.runRegistrationSystem((-1));
    }

    @Test
    public void test3177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest6.test3177");
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
        register0.registerUser("hi!", "");
    }

    @Test
    public void test3178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest6.test3178");
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
        register0.runRegistrationSystem(0);
        register0.registerUser("", "hi!");
    }

    @Test
    public void test3179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest6.test3179");
        Register register0 = new Register();
        register0.registerUser("hi!", "");
        register0.loginUser("", "hi!");
        register0.runRegistrationSystem((int) 'a');
        register0.loginUser("hi!", "");
        register0.runRegistrationSystem((int) (byte) 1);
        register0.loginUser("hi!", "");
        register0.registerUser("", "");
    }

    @Test
    public void test3180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest6.test3180");
        Register register0 = new Register();
        register0.registerUser("", "hi!");
        register0.registerUser("", "");
        register0.runRegistrationSystem((int) (short) -1);
    }

    @Test
    public void test3181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest6.test3181");
        Register register0 = new Register();
        register0.registerUser("hi!", "");
        register0.loginUser("", "");
        register0.runRegistrationSystem((int) 'a');
        register0.registerUser("", "");
        register0.registerUser("hi!", "hi!");
        register0.registerUser("", "");
        register0.registerUser("hi!", "");
        register0.runRegistrationSystem(1);
        register0.loginUser("hi!", "hi!");
        register0.loginUser("", "");
        java.lang.Class<?> wildcardClass29 = register0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass29);
    }

    @Test
    public void test3182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest6.test3182");
        Register register0 = new Register();
        register0.loginUser("", "hi!");
        register0.loginUser("", "hi!");
        register0.loginUser("hi!", "hi!");
        register0.registerUser("", "");
        register0.loginUser("", "");
        register0.runRegistrationSystem((int) (short) -1);
        java.lang.Class<?> wildcardClass18 = register0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test3183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest6.test3183");
        Register register0 = new Register();
        register0.runRegistrationSystem((int) (byte) -1);
        register0.registerUser("hi!", "");
        register0.registerUser("", "hi!");
        register0.runRegistrationSystem((int) (short) 10);
        register0.loginUser("hi!", "hi!");
        register0.loginUser("", "hi!");
        register0.runRegistrationSystem((int) (byte) 100);
        register0.registerUser("hi!", "hi!");
        register0.loginUser("", "");
        register0.runRegistrationSystem((-1));
    }

    @Test
    public void test3184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest6.test3184");
        Register register0 = new Register();
        register0.loginUser("", "hi!");
        register0.registerUser("", "");
        register0.runRegistrationSystem((int) ' ');
        register0.loginUser("hi!", "");
        register0.loginUser("", "");
        java.lang.Class<?> wildcardClass15 = register0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test3185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest6.test3185");
        Register register0 = new Register();
        register0.runRegistrationSystem((int) '#');
        register0.loginUser("hi!", "hi!");
        register0.registerUser("", "");
        register0.loginUser("", "hi!");
        register0.loginUser("", "");
        register0.loginUser("", "hi!");
        java.lang.Class<?> wildcardClass18 = register0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test3186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest6.test3186");
        Register register0 = new Register();
        register0.loginUser("hi!", "hi!");
        register0.registerUser("hi!", "");
        register0.registerUser("hi!", "");
        register0.registerUser("", "");
        register0.loginUser("", "hi!");
        register0.registerUser("", "hi!");
        register0.registerUser("", "");
        register0.runRegistrationSystem(1);
        register0.registerUser("", "hi!");
    }

    @Test
    public void test3187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest6.test3187");
        Register register0 = new Register();
        register0.runRegistrationSystem((int) (byte) -1);
        register0.runRegistrationSystem((int) (byte) 10);
        register0.registerUser("", "");
        register0.loginUser("", "");
        register0.registerUser("", "hi!");
        register0.registerUser("", "hi!");
        register0.loginUser("hi!", "");
        register0.registerUser("hi!", "");
        register0.runRegistrationSystem(0);
    }

    @Test
    public void test3188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest6.test3188");
        Register register0 = new Register();
        register0.runRegistrationSystem((int) (byte) -1);
        register0.runRegistrationSystem((int) (byte) 10);
        register0.registerUser("", "");
        register0.loginUser("", "");
        register0.registerUser("", "hi!");
        register0.registerUser("hi!", "");
        register0.runRegistrationSystem((int) (short) 100);
        register0.registerUser("", "");
        register0.registerUser("", "hi!");
    }

    @Test
    public void test3189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest6.test3189");
        Register register0 = new Register();
        register0.registerUser("hi!", "");
        register0.loginUser("", "hi!");
        register0.runRegistrationSystem((int) 'a');
        register0.loginUser("", "hi!");
        register0.loginUser("hi!", "");
        register0.loginUser("hi!", "hi!");
        register0.runRegistrationSystem(0);
        register0.runRegistrationSystem((int) (short) 10);
        register0.registerUser("", "hi!");
        register0.loginUser("", "hi!");
        register0.registerUser("", "hi!");
        java.lang.Class<?> wildcardClass31 = register0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test3190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest6.test3190");
        Register register0 = new Register();
        register0.runRegistrationSystem((int) (byte) -1);
        register0.loginUser("", "");
        register0.runRegistrationSystem((int) (byte) -1);
    }

    @Test
    public void test3191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest6.test3191");
        Register register0 = new Register();
        register0.registerUser("hi!", "");
        register0.loginUser("", "hi!");
        register0.runRegistrationSystem((int) 'a');
        register0.loginUser("", "hi!");
        register0.loginUser("", "hi!");
        register0.registerUser("", "");
        register0.registerUser("hi!", "hi!");
        register0.loginUser("hi!", "hi!");
        register0.runRegistrationSystem((int) (byte) 0);
        register0.runRegistrationSystem((int) (byte) -1);
    }

    @Test
    public void test3192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest6.test3192");
        Register register0 = new Register();
        register0.runRegistrationSystem((int) (byte) -1);
        register0.registerUser("hi!", "");
        register0.loginUser("hi!", "hi!");
        register0.runRegistrationSystem((int) (byte) 1);
        register0.runRegistrationSystem((int) ' ');
        register0.loginUser("hi!", "hi!");
        register0.registerUser("hi!", "");
    }

    @Test
    public void test3193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest6.test3193");
        Register register0 = new Register();
        register0.runRegistrationSystem((int) '#');
        register0.registerUser("", "hi!");
        register0.runRegistrationSystem((int) (short) 0);
        register0.runRegistrationSystem((int) (byte) 1);
        register0.registerUser("", "");
        register0.runRegistrationSystem((int) (short) 10);
        register0.loginUser("hi!", "");
        register0.registerUser("hi!", "hi!");
        register0.runRegistrationSystem(0);
        register0.loginUser("hi!", "hi!");
        register0.registerUser("", "");
        java.lang.Class<?> wildcardClass29 = register0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass29);
    }

    @Test
    public void test3194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest6.test3194");
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
        register0.runRegistrationSystem(0);
        register0.registerUser("hi!", "hi!");
    }

    @Test
    public void test3195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest6.test3195");
        Register register0 = new Register();
        register0.runRegistrationSystem((int) '#');
        register0.loginUser("hi!", "hi!");
        register0.loginUser("", "hi!");
        register0.runRegistrationSystem((-1));
        register0.loginUser("hi!", "hi!");
        register0.registerUser("hi!", "hi!");
    }

    @Test
    public void test3196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest6.test3196");
        Register register0 = new Register();
        register0.runRegistrationSystem((int) (byte) -1);
        register0.runRegistrationSystem((int) (short) 10);
        register0.loginUser("hi!", "");
        register0.registerUser("", "hi!");
        register0.registerUser("hi!", "hi!");
        register0.runRegistrationSystem(0);
        register0.registerUser("", "hi!");
        register0.loginUser("hi!", "hi!");
        register0.runRegistrationSystem(100);
    }

    @Test
    public void test3197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest6.test3197");
        Register register0 = new Register();
        register0.runRegistrationSystem((int) '#');
        register0.loginUser("hi!", "hi!");
        register0.loginUser("hi!", "hi!");
        register0.loginUser("hi!", "");
        register0.loginUser("", "hi!");
        register0.loginUser("hi!", "hi!");
        register0.loginUser("hi!", "");
    }

    @Test
    public void test3198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest6.test3198");
        Register register0 = new Register();
        register0.registerUser("hi!", "");
        register0.loginUser("", "");
        register0.runRegistrationSystem((int) 'a');
        register0.registerUser("", "");
        register0.registerUser("hi!", "hi!");
        register0.registerUser("", "");
        register0.registerUser("hi!", "");
        register0.runRegistrationSystem(1);
        java.lang.Class<?> wildcardClass23 = register0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test3199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest6.test3199");
        Register register0 = new Register();
        register0.runRegistrationSystem((int) (byte) -1);
        register0.registerUser("hi!", "");
        register0.loginUser("hi!", "hi!");
        register0.runRegistrationSystem((int) (byte) 1);
        register0.registerUser("", "hi!");
        register0.loginUser("", "");
        register0.runRegistrationSystem(0);
        java.lang.Class<?> wildcardClass19 = register0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test3200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest6.test3200");
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
        register0.runRegistrationSystem((int) (short) 10);
    }

    @Test
    public void test3201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest6.test3201");
        Register register0 = new Register();
        register0.runRegistrationSystem((int) (short) 0);
        register0.loginUser("hi!", "hi!");
        register0.registerUser("", "");
        register0.runRegistrationSystem((-1));
        register0.runRegistrationSystem((int) (short) 0);
        register0.registerUser("", "");
        register0.runRegistrationSystem((int) (short) -1);
        register0.runRegistrationSystem((int) (short) -1);
        register0.runRegistrationSystem((int) 'a');
    }

    @Test
    public void test3202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest6.test3202");
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
        register0.runRegistrationSystem((int) (byte) 0);
        register0.registerUser("", "");
        register0.registerUser("", "hi!");
        register0.loginUser("hi!", "");
        register0.runRegistrationSystem((int) (short) -1);
        register0.registerUser("hi!", "hi!");
    }

    @Test
    public void test3203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest6.test3203");
        Register register0 = new Register();
        register0.loginUser("hi!", "hi!");
        register0.runRegistrationSystem(0);
        register0.registerUser("", "");
        register0.loginUser("", "hi!");
        register0.registerUser("", "");
        register0.runRegistrationSystem((int) '4');
        register0.loginUser("hi!", "hi!");
        register0.loginUser("hi!", "");
        register0.registerUser("hi!", "");
        register0.runRegistrationSystem((int) (short) 100);
    }

    @Test
    public void test3204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest6.test3204");
        Register register0 = new Register();
        register0.runRegistrationSystem((int) (byte) -1);
        register0.registerUser("hi!", "");
        register0.loginUser("hi!", "hi!");
        register0.loginUser("hi!", "");
        register0.loginUser("", "");
        register0.runRegistrationSystem(1);
        register0.registerUser("hi!", "hi!");
        register0.registerUser("hi!", "");
    }

    @Test
    public void test3205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest6.test3205");
        Register register0 = new Register();
        register0.loginUser("hi!", "hi!");
        register0.registerUser("hi!", "");
        register0.registerUser("hi!", "");
        register0.registerUser("", "hi!");
        register0.loginUser("", "");
        register0.loginUser("hi!", "");
        register0.registerUser("", "");
        register0.runRegistrationSystem(100);
        register0.registerUser("hi!", "hi!");
    }

    @Test
    public void test3206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest6.test3206");
        Register register0 = new Register();
        register0.runRegistrationSystem((int) (byte) -1);
        register0.registerUser("hi!", "");
        register0.runRegistrationSystem((int) (short) 1);
        register0.loginUser("", "hi!");
        register0.runRegistrationSystem((int) '4');
        register0.loginUser("", "");
        register0.registerUser("", "");
        register0.runRegistrationSystem((int) (byte) 0);
        register0.runRegistrationSystem((-1));
    }

    @Test
    public void test3207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest6.test3207");
        Register register0 = new Register();
        register0.loginUser("hi!", "hi!");
        register0.runRegistrationSystem(0);
        register0.loginUser("hi!", "");
        register0.loginUser("hi!", "hi!");
        register0.runRegistrationSystem((int) (byte) 0);
        register0.runRegistrationSystem((int) (byte) 10);
    }

    @Test
    public void test3208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest6.test3208");
        Register register0 = new Register();
        register0.runRegistrationSystem((int) (short) 0);
        register0.loginUser("hi!", "hi!");
        register0.registerUser("", "");
        register0.runRegistrationSystem((-1));
        register0.registerUser("", "");
        register0.runRegistrationSystem((int) (byte) -1);
        register0.runRegistrationSystem((int) (short) -1);
        register0.loginUser("", "hi!");
        register0.runRegistrationSystem(100);
    }

    @Test
    public void test3209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest6.test3209");
        Register register0 = new Register();
        register0.registerUser("hi!", "");
        register0.loginUser("", "hi!");
        register0.runRegistrationSystem((int) 'a');
        register0.loginUser("hi!", "");
        register0.runRegistrationSystem((int) (byte) 1);
        register0.loginUser("hi!", "hi!");
        register0.loginUser("", "");
        register0.runRegistrationSystem((int) (short) 10);
        register0.registerUser("", "hi!");
    }

    @Test
    public void test3210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest6.test3210");
        Register register0 = new Register();
        register0.loginUser("hi!", "hi!");
        register0.registerUser("hi!", "");
        register0.registerUser("", "");
        register0.registerUser("hi!", "");
        register0.registerUser("hi!", "");
        register0.runRegistrationSystem((int) 'a');
        register0.runRegistrationSystem((int) (short) 100);
        register0.registerUser("hi!", "");
        register0.runRegistrationSystem((int) '4');
    }

    @Test
    public void test3211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest6.test3211");
        Register register0 = new Register();
        register0.registerUser("hi!", "");
        register0.loginUser("", "hi!");
        register0.runRegistrationSystem((int) (byte) -1);
        register0.runRegistrationSystem(1);
        register0.loginUser("hi!", "");
        register0.runRegistrationSystem(0);
        register0.loginUser("", "hi!");
        register0.loginUser("hi!", "");
        register0.loginUser("hi!", "");
        register0.loginUser("hi!", "");
    }

    @Test
    public void test3212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest6.test3212");
        Register register0 = new Register();
        register0.registerUser("hi!", "");
        register0.loginUser("", "hi!");
        register0.runRegistrationSystem((int) (byte) -1);
        register0.runRegistrationSystem(1);
        register0.loginUser("hi!", "");
        register0.runRegistrationSystem((int) (short) -1);
        register0.registerUser("hi!", "");
        register0.runRegistrationSystem(1);
        register0.registerUser("", "hi!");
    }

    @Test
    public void test3213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest6.test3213");
        Register register0 = new Register();
        register0.loginUser("hi!", "hi!");
        register0.registerUser("hi!", "");
        register0.registerUser("hi!", "");
        register0.registerUser("", "");
        register0.runRegistrationSystem(100);
        register0.runRegistrationSystem((int) (byte) -1);
        register0.registerUser("hi!", "hi!");
        register0.loginUser("", "hi!");
    }

    @Test
    public void test3214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest6.test3214");
        Register register0 = new Register();
        register0.runRegistrationSystem((int) (short) 0);
        register0.loginUser("hi!", "hi!");
        register0.registerUser("", "");
        register0.runRegistrationSystem((-1));
        register0.loginUser("", "hi!");
        register0.loginUser("hi!", "hi!");
        register0.runRegistrationSystem(100);
        register0.runRegistrationSystem((int) (short) -1);
    }

    @Test
    public void test3215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest6.test3215");
        Register register0 = new Register();
        register0.runRegistrationSystem((int) (byte) -1);
        register0.registerUser("hi!", "");
        register0.registerUser("", "hi!");
        register0.runRegistrationSystem((int) (short) 10);
        register0.loginUser("hi!", "hi!");
        register0.loginUser("", "hi!");
        register0.loginUser("hi!", "");
        register0.loginUser("hi!", "hi!");
        register0.loginUser("hi!", "hi!");
        register0.loginUser("", "");
        register0.runRegistrationSystem((int) '#');
    }

    @Test
    public void test3216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest6.test3216");
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
        register0.registerUser("", "hi!");
    }

    @Test
    public void test3217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest6.test3217");
        Register register0 = new Register();
        register0.registerUser("hi!", "");
        register0.registerUser("hi!", "");
        register0.loginUser("hi!", "");
        register0.registerUser("", "hi!");
        register0.registerUser("hi!", "");
        register0.loginUser("", "hi!");
        register0.loginUser("", "");
        register0.runRegistrationSystem((int) ' ');
        register0.runRegistrationSystem(1);
    }

    @Test
    public void test3218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest6.test3218");
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
        register0.registerUser("hi!", "hi!");
        register0.loginUser("hi!", "hi!");
    }

    @Test
    public void test3219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest6.test3219");
        Register register0 = new Register();
        register0.registerUser("hi!", "");
        register0.loginUser("", "hi!");
        register0.runRegistrationSystem((int) 'a');
        register0.loginUser("", "hi!");
        register0.loginUser("", "hi!");
        register0.registerUser("", "");
        register0.registerUser("", "hi!");
        register0.loginUser("hi!", "");
        register0.registerUser("", "hi!");
        register0.runRegistrationSystem((int) (short) 0);
        register0.registerUser("hi!", "hi!");
    }

    @Test
    public void test3220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest6.test3220");
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
        register0.loginUser("hi!", "");
    }

    @Test
    public void test3221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest6.test3221");
        Register register0 = new Register();
        register0.loginUser("hi!", "hi!");
        register0.registerUser("hi!", "");
        register0.registerUser("", "");
        register0.registerUser("hi!", "hi!");
    }

    @Test
    public void test3222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest6.test3222");
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
        register0.registerUser("", "hi!");
    }

    @Test
    public void test3223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest6.test3223");
        Register register0 = new Register();
        register0.registerUser("hi!", "");
        register0.registerUser("hi!", "");
        register0.loginUser("hi!", "");
        register0.loginUser("", "hi!");
        register0.loginUser("", "");
        register0.registerUser("", "");
        register0.loginUser("hi!", "hi!");
        register0.registerUser("hi!", "");
        register0.runRegistrationSystem((int) (byte) 1);
    }

    @Test
    public void test3224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest6.test3224");
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
        register0.loginUser("hi!", "");
        java.lang.Class<?> wildcardClass28 = register0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test3225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest6.test3225");
        Register register0 = new Register();
        register0.runRegistrationSystem((int) (byte) -1);
        register0.registerUser("hi!", "");
        register0.registerUser("", "hi!");
        register0.loginUser("hi!", "hi!");
        register0.registerUser("hi!", "hi!");
        register0.loginUser("hi!", "hi!");
        register0.loginUser("hi!", "hi!");
        register0.runRegistrationSystem((int) (byte) 1);
    }

    @Test
    public void test3226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest6.test3226");
        Register register0 = new Register();
        register0.registerUser("hi!", "");
        register0.registerUser("hi!", "");
        register0.loginUser("hi!", "");
        register0.loginUser("", "hi!");
        register0.loginUser("hi!", "");
        register0.loginUser("hi!", "");
        register0.registerUser("hi!", "hi!");
        register0.registerUser("hi!", "");
    }

    @Test
    public void test3227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest6.test3227");
        Register register0 = new Register();
        register0.loginUser("hi!", "hi!");
        register0.registerUser("hi!", "hi!");
        register0.loginUser("hi!", "hi!");
        register0.runRegistrationSystem(0);
        register0.loginUser("", "");
        register0.registerUser("hi!", "hi!");
        register0.loginUser("hi!", "");
        register0.registerUser("", "hi!");
        register0.runRegistrationSystem((int) (short) 0);
        register0.registerUser("hi!", "hi!");
    }

    @Test
    public void test3228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest6.test3228");
        Register register0 = new Register();
        register0.registerUser("hi!", "");
        register0.loginUser("", "hi!");
        register0.runRegistrationSystem((int) (byte) -1);
        register0.loginUser("", "");
        register0.runRegistrationSystem((int) (short) 0);
        register0.runRegistrationSystem((int) '#');
        register0.loginUser("hi!", "");
        register0.registerUser("", "hi!");
    }

    @Test
    public void test3229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest6.test3229");
        Register register0 = new Register();
        register0.loginUser("hi!", "hi!");
        register0.registerUser("hi!", "hi!");
        register0.loginUser("hi!", "hi!");
        register0.runRegistrationSystem(0);
        register0.loginUser("", "");
        register0.runRegistrationSystem((int) (short) -1);
        register0.runRegistrationSystem(1);
    }

    @Test
    public void test3230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest6.test3230");
        Register register0 = new Register();
        register0.registerUser("hi!", "");
        register0.runRegistrationSystem(1);
        register0.registerUser("", "");
        register0.loginUser("hi!", "hi!");
        register0.loginUser("hi!", "");
        register0.runRegistrationSystem((int) ' ');
    }

    @Test
    public void test3231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest6.test3231");
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
        register0.runRegistrationSystem(1);
        register0.registerUser("hi!", "hi!");
        register0.runRegistrationSystem((int) (short) 10);
        register0.loginUser("hi!", "");
        register0.loginUser("", "");
    }

    @Test
    public void test3232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest6.test3232");
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
        register0.registerUser("hi!", "hi!");
        register0.runRegistrationSystem(0);
    }

    @Test
    public void test3233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest6.test3233");
        Register register0 = new Register();
        register0.runRegistrationSystem((int) '#');
        register0.registerUser("", "hi!");
        register0.runRegistrationSystem((int) (short) 0);
        register0.runRegistrationSystem((int) (byte) 1);
        register0.registerUser("", "");
        register0.loginUser("", "");
        register0.runRegistrationSystem(100);
        register0.runRegistrationSystem((int) (byte) -1);
        register0.runRegistrationSystem((int) '4');
        register0.runRegistrationSystem((int) (short) 1);
    }

    @Test
    public void test3234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest6.test3234");
        Register register0 = new Register();
        register0.runRegistrationSystem((int) '#');
        register0.loginUser("hi!", "hi!");
        register0.loginUser("hi!", "hi!");
        register0.loginUser("hi!", "");
        register0.loginUser("", "hi!");
        register0.runRegistrationSystem((int) (byte) 1);
        register0.loginUser("", "hi!");
        register0.registerUser("", "hi!");
    }

    @Test
    public void test3235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest6.test3235");
        Register register0 = new Register();
        register0.runRegistrationSystem((int) (short) 0);
        register0.loginUser("hi!", "hi!");
        register0.registerUser("", "");
        register0.loginUser("", "hi!");
        register0.registerUser("hi!", "");
        register0.runRegistrationSystem((int) '#');
        register0.runRegistrationSystem((int) (byte) -1);
        register0.loginUser("", "");
        java.lang.Class<?> wildcardClass22 = register0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test3236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest6.test3236");
        Register register0 = new Register();
        register0.registerUser("hi!", "");
        register0.loginUser("", "hi!");
        register0.runRegistrationSystem((int) 'a');
        register0.loginUser("hi!", "");
        register0.runRegistrationSystem((-1));
        register0.registerUser("hi!", "");
        register0.registerUser("", "hi!");
        register0.loginUser("hi!", "hi!");
        java.lang.Class<?> wildcardClass23 = register0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test3237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest6.test3237");
        Register register0 = new Register();
        register0.runRegistrationSystem((int) (byte) -1);
        register0.runRegistrationSystem((int) (short) 10);
        register0.loginUser("hi!", "");
        register0.loginUser("hi!", "");
        register0.loginUser("hi!", "hi!");
    }

    @Test
    public void test3238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest6.test3238");
        Register register0 = new Register();
        register0.runRegistrationSystem((int) (short) 0);
        register0.loginUser("hi!", "hi!");
        register0.registerUser("", "");
        register0.runRegistrationSystem((-1));
        register0.runRegistrationSystem((int) (byte) 0);
        register0.registerUser("", "hi!");
        register0.registerUser("", "hi!");
        register0.runRegistrationSystem((int) (byte) 100);
        register0.loginUser("", "");
    }

    @Test
    public void test3239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest6.test3239");
        Register register0 = new Register();
        register0.registerUser("hi!", "");
        register0.loginUser("", "hi!");
        register0.runRegistrationSystem((int) 'a');
        register0.loginUser("hi!", "");
        register0.runRegistrationSystem((-1));
        register0.registerUser("hi!", "");
        register0.loginUser("", "hi!");
        register0.runRegistrationSystem(100);
        register0.loginUser("", "hi!");
        java.lang.Class<?> wildcardClass25 = register0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test3240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest6.test3240");
        Register register0 = new Register();
        register0.loginUser("hi!", "hi!");
        register0.registerUser("hi!", "");
        register0.registerUser("", "");
        register0.registerUser("hi!", "");
        register0.registerUser("hi!", "");
        register0.registerUser("hi!", "");
        register0.runRegistrationSystem((int) (short) 0);
        register0.loginUser("", "hi!");
    }

    @Test
    public void test3241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest6.test3241");
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
        register0.registerUser("hi!", "");
        register0.registerUser("", "");
    }

    @Test
    public void test3242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest6.test3242");
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
        register0.runRegistrationSystem(10);
    }

    @Test
    public void test3243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest6.test3243");
        Register register0 = new Register();
        register0.loginUser("hi!", "hi!");
        register0.registerUser("hi!", "");
        register0.loginUser("hi!", "hi!");
        register0.runRegistrationSystem(100);
        register0.runRegistrationSystem((int) (byte) 1);
        register0.registerUser("", "hi!");
        java.lang.Class<?> wildcardClass17 = register0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test3244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest6.test3244");
        Register register0 = new Register();
        register0.runRegistrationSystem((int) '#');
        register0.registerUser("", "hi!");
        register0.runRegistrationSystem((int) (short) 0);
        register0.runRegistrationSystem((int) (byte) 1);
        register0.registerUser("", "");
        register0.runRegistrationSystem((int) (short) 10);
        register0.loginUser("hi!", "");
        register0.registerUser("hi!", "hi!");
        register0.runRegistrationSystem(0);
        register0.runRegistrationSystem((int) (short) -1);
    }

    @Test
    public void test3245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest6.test3245");
        Register register0 = new Register();
        register0.registerUser("hi!", "");
        register0.runRegistrationSystem(1);
        register0.loginUser("hi!", "");
        register0.registerUser("hi!", "");
        register0.registerUser("", "");
        register0.registerUser("", "hi!");
    }

    @Test
    public void test3246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest6.test3246");
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
        register0.runRegistrationSystem((int) (byte) 1);
    }

    @Test
    public void test3247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest6.test3247");
        Register register0 = new Register();
        register0.loginUser("hi!", "hi!");
        register0.registerUser("hi!", "");
        register0.loginUser("hi!", "hi!");
        register0.runRegistrationSystem(100);
        register0.runRegistrationSystem((int) (byte) 1);
        register0.registerUser("", "hi!");
        register0.registerUser("", "hi!");
    }

    @Test
    public void test3248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest6.test3248");
        Register register0 = new Register();
        register0.registerUser("hi!", "");
        register0.loginUser("", "");
        register0.runRegistrationSystem((int) 'a');
        register0.runRegistrationSystem((int) (short) 100);
        register0.runRegistrationSystem((int) (byte) -1);
        java.lang.Class<?> wildcardClass13 = register0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test3249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest6.test3249");
        Register register0 = new Register();
        register0.runRegistrationSystem((int) '#');
        register0.registerUser("", "hi!");
        register0.runRegistrationSystem((int) (short) 0);
        register0.runRegistrationSystem((int) (byte) 1);
        register0.runRegistrationSystem((int) 'a');
        register0.runRegistrationSystem(0);
        register0.loginUser("hi!", "");
        register0.runRegistrationSystem((int) (byte) -1);
        register0.runRegistrationSystem((int) (byte) -1);
    }

    @Test
    public void test3250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest6.test3250");
        Register register0 = new Register();
        register0.runRegistrationSystem((int) (byte) -1);
        register0.registerUser("hi!", "");
        register0.loginUser("hi!", "hi!");
        register0.loginUser("hi!", "");
        register0.runRegistrationSystem((int) (byte) -1);
        register0.loginUser("hi!", "");
        register0.loginUser("hi!", "");
        register0.registerUser("hi!", "");
        register0.loginUser("", "");
    }

    @Test
    public void test3251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest6.test3251");
        Register register0 = new Register();
        register0.runRegistrationSystem((int) '#');
        register0.loginUser("hi!", "hi!");
        register0.loginUser("hi!", "hi!");
        register0.loginUser("hi!", "");
        register0.loginUser("", "");
        register0.runRegistrationSystem((int) (short) 10);
        register0.runRegistrationSystem((int) (byte) 1);
        register0.registerUser("hi!", "hi!");
    }

    @Test
    public void test3252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest6.test3252");
        Register register0 = new Register();
        register0.runRegistrationSystem((int) (byte) -1);
        register0.runRegistrationSystem((int) (byte) 10);
        register0.registerUser("", "");
        register0.registerUser("", "hi!");
        register0.runRegistrationSystem((int) '4');
        register0.loginUser("hi!", "");
        register0.runRegistrationSystem((int) '4');
        register0.loginUser("hi!", "hi!");
        register0.registerUser("", "");
    }

    @Test
    public void test3253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest6.test3253");
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
        register0.runRegistrationSystem((int) (short) -1);
    }

    @Test
    public void test3254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest6.test3254");
        Register register0 = new Register();
        register0.runRegistrationSystem((int) '#');
        register0.runRegistrationSystem((int) (short) 100);
        register0.runRegistrationSystem(100);
        register0.registerUser("hi!", "");
        register0.loginUser("", "");
        register0.registerUser("", "hi!");
    }

    @Test
    public void test3255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest6.test3255");
        Register register0 = new Register();
        register0.loginUser("hi!", "hi!");
        register0.registerUser("hi!", "");
        register0.loginUser("hi!", "hi!");
        register0.runRegistrationSystem(100);
        register0.runRegistrationSystem((int) (byte) 1);
        register0.loginUser("", "");
        register0.registerUser("hi!", "hi!");
        register0.runRegistrationSystem((int) (short) 1);
    }

    @Test
    public void test3256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest6.test3256");
        Register register0 = new Register();
        register0.runRegistrationSystem((int) (short) 0);
        register0.loginUser("hi!", "hi!");
        register0.registerUser("", "");
        register0.runRegistrationSystem((-1));
        register0.loginUser("hi!", "");
        register0.registerUser("hi!", "hi!");
        register0.runRegistrationSystem((int) (short) 1);
        register0.loginUser("", "");
    }

    @Test
    public void test3257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest6.test3257");
        Register register0 = new Register();
        register0.loginUser("hi!", "hi!");
        register0.runRegistrationSystem(0);
        register0.loginUser("", "hi!");
        register0.runRegistrationSystem((int) (byte) 1);
        register0.runRegistrationSystem(0);
    }

    @Test
    public void test3258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest6.test3258");
        Register register0 = new Register();
        register0.loginUser("hi!", "hi!");
        register0.registerUser("hi!", "");
        register0.registerUser("hi!", "");
        register0.registerUser("", "");
        register0.runRegistrationSystem(100);
        register0.runRegistrationSystem((int) (byte) -1);
        register0.registerUser("hi!", "hi!");
        register0.runRegistrationSystem(100);
        register0.registerUser("", "hi!");
        register0.registerUser("hi!", "");
        register0.runRegistrationSystem((-1));
        register0.loginUser("hi!", "");
        register0.registerUser("hi!", "");
        register0.registerUser("", "hi!");
    }

    @Test
    public void test3259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest6.test3259");
        Register register0 = new Register();
        register0.registerUser("hi!", "");
        register0.loginUser("", "");
        register0.runRegistrationSystem((int) 'a');
        register0.runRegistrationSystem((int) (short) 100);
        register0.loginUser("hi!", "");
        register0.loginUser("hi!", "hi!");
        register0.runRegistrationSystem((int) (byte) 0);
        java.lang.Class<?> wildcardClass19 = register0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test3260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest6.test3260");
        Register register0 = new Register();
        register0.loginUser("hi!", "hi!");
        register0.registerUser("hi!", "");
        register0.registerUser("hi!", "");
        register0.registerUser("", "hi!");
        register0.loginUser("", "");
        register0.runRegistrationSystem((int) (short) 10);
        register0.loginUser("hi!", "hi!");
    }

    @Test
    public void test3261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest6.test3261");
        Register register0 = new Register();
        register0.runRegistrationSystem((int) (byte) -1);
        register0.runRegistrationSystem((int) (byte) 10);
        register0.loginUser("", "hi!");
        register0.registerUser("hi!", "");
        register0.runRegistrationSystem((-1));
        register0.runRegistrationSystem((int) (byte) -1);
        register0.loginUser("hi!", "");
        register0.registerUser("hi!", "");
        register0.registerUser("hi!", "hi!");
    }

    @Test
    public void test3262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest6.test3262");
        Register register0 = new Register();
        register0.loginUser("hi!", "hi!");
        register0.registerUser("hi!", "");
        register0.registerUser("hi!", "");
        register0.registerUser("", "");
        register0.runRegistrationSystem(100);
        register0.loginUser("", "");
        register0.runRegistrationSystem((int) (short) 0);
        register0.loginUser("", "");
        java.lang.Class<?> wildcardClass23 = register0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test3263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest6.test3263");
        Register register0 = new Register();
        register0.loginUser("hi!", "hi!");
        register0.registerUser("hi!", "");
        register0.registerUser("", "");
        register0.registerUser("hi!", "");
        register0.registerUser("hi!", "");
        register0.runRegistrationSystem((int) (short) 10);
        register0.loginUser("", "");
        register0.runRegistrationSystem((int) (short) 10);
    }

    @Test
    public void test3264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest6.test3264");
        Register register0 = new Register();
        register0.runRegistrationSystem((int) '#');
        register0.registerUser("", "hi!");
        register0.registerUser("", "hi!");
        register0.registerUser("", "");
        register0.runRegistrationSystem((int) (byte) 10);
        register0.runRegistrationSystem((int) (short) 100);
        register0.runRegistrationSystem((int) (short) 1);
        register0.registerUser("", "");
        register0.runRegistrationSystem((int) (byte) 1);
        register0.registerUser("hi!", "hi!");
        register0.runRegistrationSystem(0);
    }

    @Test
    public void test3265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest6.test3265");
        Register register0 = new Register();
        register0.registerUser("hi!", "");
        register0.loginUser("", "hi!");
        register0.runRegistrationSystem((int) 'a');
        register0.loginUser("", "hi!");
        register0.loginUser("", "hi!");
        register0.registerUser("", "");
        register0.registerUser("", "hi!");
        register0.loginUser("hi!", "");
        register0.registerUser("", "hi!");
        register0.runRegistrationSystem((int) (short) 0);
        register0.registerUser("", "hi!");
        java.lang.Class<?> wildcardClass32 = register0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass32);
    }

    @Test
    public void test3266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest6.test3266");
        Register register0 = new Register();
        register0.loginUser("hi!", "hi!");
        register0.registerUser("hi!", "");
        register0.registerUser("", "");
        register0.registerUser("", "hi!");
        register0.loginUser("hi!", "");
        register0.loginUser("", "");
        java.lang.Class<?> wildcardClass19 = register0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test3267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest6.test3267");
        Register register0 = new Register();
        register0.registerUser("hi!", "");
        register0.loginUser("", "hi!");
        register0.runRegistrationSystem((int) (byte) -1);
        register0.runRegistrationSystem(10);
        register0.runRegistrationSystem((int) (short) 10);
        register0.registerUser("hi!", "");
        register0.runRegistrationSystem((int) (short) -1);
    }

    @Test
    public void test3268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest6.test3268");
        Register register0 = new Register();
        register0.registerUser("hi!", "");
        register0.runRegistrationSystem(1);
        register0.registerUser("", "");
        register0.runRegistrationSystem((int) (short) 10);
        register0.loginUser("hi!", "hi!");
    }

    @Test
    public void test3269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest6.test3269");
        Register register0 = new Register();
        register0.registerUser("hi!", "");
        register0.runRegistrationSystem(1);
        register0.registerUser("", "");
        register0.runRegistrationSystem((int) (short) 10);
        register0.registerUser("hi!", "hi!");
        register0.registerUser("hi!", "");
        register0.registerUser("", "hi!");
        register0.runRegistrationSystem(1);
        register0.loginUser("", "hi!");
    }

    @Test
    public void test3270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest6.test3270");
        Register register0 = new Register();
        register0.registerUser("hi!", "");
        register0.registerUser("hi!", "");
        register0.loginUser("hi!", "");
        register0.loginUser("hi!", "");
        register0.runRegistrationSystem(10);
        register0.registerUser("", "");
        register0.registerUser("hi!", "hi!");
        register0.registerUser("", "hi!");
        register0.registerUser("hi!", "hi!");
    }

    @Test
    public void test3271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest6.test3271");
        Register register0 = new Register();
        register0.loginUser("hi!", "hi!");
        register0.registerUser("hi!", "");
        register0.registerUser("", "");
        register0.registerUser("", "hi!");
        register0.registerUser("", "");
        register0.registerUser("", "");
        register0.runRegistrationSystem((int) (short) 1);
        register0.loginUser("hi!", "hi!");
        register0.loginUser("hi!", "");
        java.lang.Class<?> wildcardClass27 = register0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test3272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest6.test3272");
        Register register0 = new Register();
        register0.runRegistrationSystem((int) (byte) -1);
        register0.registerUser("", "hi!");
        register0.loginUser("", "hi!");
        register0.loginUser("hi!", "hi!");
    }

    @Test
    public void test3273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest6.test3273");
        Register register0 = new Register();
        register0.runRegistrationSystem((int) '#');
        register0.registerUser("", "hi!");
        register0.runRegistrationSystem((int) (short) 0);
        register0.runRegistrationSystem((int) (byte) 1);
        register0.registerUser("", "");
        register0.runRegistrationSystem((int) (short) 10);
        register0.runRegistrationSystem((int) (short) -1);
        register0.loginUser("hi!", "hi!");
        register0.loginUser("hi!", "");
        register0.loginUser("hi!", "");
    }

    @Test
    public void test3274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest6.test3274");
        Register register0 = new Register();
        register0.registerUser("hi!", "");
        register0.runRegistrationSystem(1);
        register0.registerUser("", "");
        register0.runRegistrationSystem((int) (short) -1);
        register0.loginUser("", "");
        register0.registerUser("hi!", "hi!");
        register0.runRegistrationSystem((int) (byte) 1);
        java.lang.Class<?> wildcardClass19 = register0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test3275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest6.test3275");
        Register register0 = new Register();
        register0.registerUser("hi!", "");
        register0.registerUser("hi!", "");
        register0.loginUser("hi!", "");
        register0.registerUser("", "hi!");
        register0.registerUser("hi!", "");
        register0.loginUser("", "hi!");
        register0.registerUser("hi!", "hi!");
        register0.runRegistrationSystem((int) (short) 0);
        register0.loginUser("", "hi!");
        register0.registerUser("hi!", "hi!");
    }

    @Test
    public void test3276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest6.test3276");
        Register register0 = new Register();
        register0.runRegistrationSystem((int) '#');
        register0.registerUser("", "hi!");
        register0.runRegistrationSystem((int) (short) 0);
        register0.runRegistrationSystem((int) (byte) 1);
        register0.runRegistrationSystem((int) 'a');
        register0.registerUser("", "");
        register0.runRegistrationSystem((int) (short) 0);
        register0.registerUser("hi!", "");
        register0.loginUser("hi!", "hi!");
    }

    @Test
    public void test3277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest6.test3277");
        Register register0 = new Register();
        register0.registerUser("hi!", "");
        register0.loginUser("", "hi!");
        register0.runRegistrationSystem((int) (byte) -1);
        register0.runRegistrationSystem(1);
        register0.loginUser("hi!", "");
        register0.runRegistrationSystem(0);
        register0.registerUser("", "hi!");
        register0.loginUser("hi!", "");
        register0.runRegistrationSystem((int) (byte) 100);
    }

    @Test
    public void test3278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest6.test3278");
        Register register0 = new Register();
        register0.runRegistrationSystem((int) (byte) -1);
        register0.registerUser("hi!", "");
        register0.loginUser("hi!", "hi!");
        register0.loginUser("hi!", "");
        register0.registerUser("hi!", "");
        register0.registerUser("hi!", "");
        register0.runRegistrationSystem((int) '#');
        register0.loginUser("hi!", "");
        register0.loginUser("hi!", "hi!");
    }

    @Test
    public void test3279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest6.test3279");
        Register register0 = new Register();
        register0.registerUser("hi!", "");
        register0.loginUser("", "hi!");
        register0.runRegistrationSystem((int) 'a');
        register0.loginUser("hi!", "");
        register0.runRegistrationSystem((-1));
        register0.registerUser("hi!", "");
        register0.loginUser("", "hi!");
        register0.runRegistrationSystem(100);
        register0.loginUser("", "hi!");
        register0.runRegistrationSystem((int) (short) 100);
        register0.runRegistrationSystem(1);
        java.lang.Class<?> wildcardClass29 = register0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass29);
    }

    @Test
    public void test3280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest6.test3280");
        Register register0 = new Register();
        register0.runRegistrationSystem((int) '#');
        register0.loginUser("hi!", "hi!");
        register0.loginUser("hi!", "hi!");
        register0.loginUser("hi!", "");
        register0.loginUser("", "");
        register0.runRegistrationSystem((int) 'a');
        register0.runRegistrationSystem((int) (short) 0);
        register0.loginUser("hi!", "hi!");
        register0.loginUser("hi!", "hi!");
    }

    @Test
    public void test3281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest6.test3281");
        Register register0 = new Register();
        register0.registerUser("hi!", "");
        register0.registerUser("hi!", "");
        register0.loginUser("hi!", "");
        register0.registerUser("", "hi!");
        register0.registerUser("hi!", "");
        register0.loginUser("", "hi!");
        register0.registerUser("hi!", "hi!");
        register0.runRegistrationSystem((int) (short) 0);
        register0.registerUser("", "");
        register0.registerUser("", "");
    }

    @Test
    public void test3282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest6.test3282");
        Register register0 = new Register();
        register0.runRegistrationSystem((int) (byte) -1);
        register0.runRegistrationSystem((int) (byte) 10);
        register0.registerUser("", "");
        register0.loginUser("", "");
        register0.registerUser("", "hi!");
        register0.registerUser("hi!", "");
        register0.loginUser("hi!", "hi!");
        register0.runRegistrationSystem((int) (byte) 0);
        register0.runRegistrationSystem(1);
        register0.runRegistrationSystem(0);
    }

    @Test
    public void test3283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest6.test3283");
        Register register0 = new Register();
        register0.runRegistrationSystem((int) (short) 0);
        register0.loginUser("hi!", "hi!");
        register0.registerUser("", "");
        register0.runRegistrationSystem((int) '#');
        register0.runRegistrationSystem((int) '#');
        register0.loginUser("hi!", "");
        register0.runRegistrationSystem((int) (byte) 10);
        register0.loginUser("", "hi!");
        register0.runRegistrationSystem((int) (short) 0);
    }

    @Test
    public void test3284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest6.test3284");
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
        register0.runRegistrationSystem((int) (byte) 0);
        register0.runRegistrationSystem((int) 'a');
    }

    @Test
    public void test3285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest6.test3285");
        Register register0 = new Register();
        register0.runRegistrationSystem((int) (byte) -1);
        register0.registerUser("hi!", "");
        register0.runRegistrationSystem((int) (byte) -1);
        register0.loginUser("hi!", "hi!");
        register0.runRegistrationSystem(0);
        register0.runRegistrationSystem((int) 'a');
    }

    @Test
    public void test3286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest6.test3286");
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
        register0.runRegistrationSystem(10);
        register0.loginUser("", "hi!");
        register0.runRegistrationSystem((int) (byte) 10);
    }

    @Test
    public void test3287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest6.test3287");
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
        register0.registerUser("", "");
        register0.runRegistrationSystem((int) (byte) 1);
    }

    @Test
    public void test3288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest6.test3288");
        Register register0 = new Register();
        register0.registerUser("hi!", "");
        register0.loginUser("", "");
        register0.runRegistrationSystem((int) 'a');
        register0.registerUser("", "");
        register0.registerUser("hi!", "hi!");
        register0.registerUser("", "");
        register0.registerUser("hi!", "");
        register0.runRegistrationSystem(1);
        register0.loginUser("hi!", "hi!");
        register0.registerUser("", "");
        java.lang.Class<?> wildcardClass29 = register0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass29);
    }

    @Test
    public void test3289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest6.test3289");
        Register register0 = new Register();
        register0.runRegistrationSystem((int) '#');
        register0.registerUser("", "hi!");
        register0.loginUser("hi!", "hi!");
        register0.runRegistrationSystem(100);
        register0.registerUser("hi!", "hi!");
        register0.loginUser("hi!", "");
    }

    @Test
    public void test3290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest6.test3290");
        Register register0 = new Register();
        register0.loginUser("hi!", "hi!");
        register0.registerUser("hi!", "");
        register0.loginUser("hi!", "hi!");
        register0.registerUser("", "");
        register0.runRegistrationSystem(0);
        register0.registerUser("", "");
        register0.registerUser("hi!", "hi!");
        register0.loginUser("", "hi!");
    }

    @Test
    public void test3291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest6.test3291");
        Register register0 = new Register();
        register0.runRegistrationSystem((int) (short) 0);
        register0.loginUser("hi!", "hi!");
        register0.registerUser("", "");
        register0.runRegistrationSystem((-1));
        register0.registerUser("", "");
        register0.loginUser("hi!", "hi!");
        register0.registerUser("hi!", "");
        register0.registerUser("hi!", "");
        register0.runRegistrationSystem((int) (short) 10);
        register0.loginUser("", "hi!");
    }

    @Test
    public void test3292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest6.test3292");
        Register register0 = new Register();
        register0.registerUser("hi!", "");
        register0.registerUser("", "");
        register0.registerUser("", "hi!");
        register0.runRegistrationSystem(0);
        register0.runRegistrationSystem(1);
    }

    @Test
    public void test3293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest6.test3293");
        Register register0 = new Register();
        register0.registerUser("hi!", "");
        register0.loginUser("", "");
        register0.runRegistrationSystem((int) 'a');
        register0.loginUser("hi!", "");
    }

    @Test
    public void test3294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest6.test3294");
        Register register0 = new Register();
        register0.registerUser("hi!", "");
        register0.loginUser("", "hi!");
        register0.runRegistrationSystem((int) 'a');
        register0.loginUser("", "hi!");
        register0.loginUser("", "hi!");
        register0.loginUser("", "hi!");
        register0.registerUser("hi!", "hi!");
        register0.runRegistrationSystem((int) (short) 10);
        register0.runRegistrationSystem((int) (byte) 10);
        register0.runRegistrationSystem(10);
        register0.loginUser("", "hi!");
    }

    @Test
    public void test3295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest6.test3295");
        Register register0 = new Register();
        register0.registerUser("hi!", "");
        register0.registerUser("hi!", "");
        register0.loginUser("hi!", "");
        register0.loginUser("hi!", "");
        register0.runRegistrationSystem(10);
        register0.registerUser("", "");
        register0.registerUser("", "");
        register0.registerUser("", "hi!");
        register0.runRegistrationSystem((int) (short) 0);
        register0.runRegistrationSystem(1);
        register0.registerUser("hi!", "");
    }

    @Test
    public void test3296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest6.test3296");
        Register register0 = new Register();
        register0.runRegistrationSystem((int) (byte) -1);
        register0.registerUser("hi!", "");
        register0.loginUser("hi!", "hi!");
        register0.loginUser("hi!", "");
        register0.runRegistrationSystem((int) (byte) -1);
        register0.loginUser("hi!", "");
        register0.registerUser("", "hi!");
        register0.runRegistrationSystem((int) '4');
    }

    @Test
    public void test3297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest6.test3297");
        Register register0 = new Register();
        register0.loginUser("", "hi!");
        register0.registerUser("", "");
        register0.runRegistrationSystem((int) ' ');
        register0.loginUser("hi!", "");
        register0.loginUser("hi!", "");
        register0.loginUser("hi!", "");
    }

    @Test
    public void test3298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest6.test3298");
        Register register0 = new Register();
        register0.runRegistrationSystem((int) '#');
        register0.registerUser("", "hi!");
        register0.runRegistrationSystem((int) (short) 0);
        register0.loginUser("hi!", "hi!");
        register0.registerUser("", "hi!");
        register0.runRegistrationSystem((int) (byte) -1);
        register0.registerUser("", "");
    }

    @Test
    public void test3299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest6.test3299");
        Register register0 = new Register();
        register0.runRegistrationSystem((int) (byte) -1);
        register0.registerUser("hi!", "");
        register0.loginUser("hi!", "hi!");
        register0.loginUser("hi!", "hi!");
        register0.runRegistrationSystem((int) (short) 1);
        register0.registerUser("hi!", "hi!");
        register0.loginUser("", "");
    }

    @Test
    public void test3300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest6.test3300");
        Register register0 = new Register();
        register0.loginUser("hi!", "hi!");
        register0.registerUser("hi!", "");
        register0.registerUser("hi!", "");
        register0.registerUser("", "hi!");
        register0.registerUser("", "hi!");
        register0.runRegistrationSystem((int) (short) 10);
        register0.loginUser("hi!", "");
    }

    @Test
    public void test3301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest6.test3301");
        Register register0 = new Register();
        register0.runRegistrationSystem((int) '#');
        register0.registerUser("", "hi!");
        register0.runRegistrationSystem((int) (short) 0);
        register0.runRegistrationSystem((int) (byte) 1);
        register0.registerUser("", "");
        register0.runRegistrationSystem((int) (short) 10);
        register0.runRegistrationSystem((int) (short) -1);
        register0.loginUser("hi!", "hi!");
        register0.runRegistrationSystem(0);
        register0.runRegistrationSystem((int) (byte) 0);
    }

    @Test
    public void test3302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest6.test3302");
        Register register0 = new Register();
        register0.registerUser("", "hi!");
        register0.registerUser("", "hi!");
        register0.registerUser("hi!", "");
        register0.loginUser("hi!", "");
    }

    @Test
    public void test3303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest6.test3303");
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
        register0.loginUser("", "hi!");
        register0.registerUser("hi!", "");
        register0.loginUser("hi!", "");
    }

    @Test
    public void test3304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest6.test3304");
        Register register0 = new Register();
        register0.loginUser("hi!", "hi!");
        register0.registerUser("hi!", "");
        register0.registerUser("", "");
        register0.runRegistrationSystem((int) (byte) 100);
        register0.loginUser("", "");
    }

    @Test
    public void test3305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest6.test3305");
        Register register0 = new Register();
        register0.runRegistrationSystem((int) (byte) -1);
        register0.runRegistrationSystem((int) (byte) 10);
        register0.registerUser("", "");
        register0.registerUser("", "hi!");
        register0.runRegistrationSystem((int) '4');
        register0.loginUser("hi!", "");
        register0.loginUser("hi!", "hi!");
        register0.registerUser("hi!", "");
        register0.registerUser("", "");
    }

    @Test
    public void test3306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest6.test3306");
        Register register0 = new Register();
        register0.runRegistrationSystem((int) (byte) -1);
        register0.runRegistrationSystem((int) (byte) 10);
        register0.registerUser("", "");
        register0.registerUser("", "hi!");
        register0.runRegistrationSystem((int) '4');
        register0.loginUser("hi!", "");
        register0.loginUser("hi!", "hi!");
        register0.runRegistrationSystem((-1));
        register0.registerUser("", "");
        register0.runRegistrationSystem((int) 'a');
    }

    @Test
    public void test3307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest6.test3307");
        Register register0 = new Register();
        register0.loginUser("hi!", "hi!");
        register0.runRegistrationSystem(0);
        register0.registerUser("", "");
        register0.loginUser("", "hi!");
        register0.registerUser("", "");
        register0.runRegistrationSystem((int) '4');
        register0.loginUser("hi!", "hi!");
        register0.runRegistrationSystem((int) '#');
        register0.runRegistrationSystem((int) (byte) 0);
    }

    @Test
    public void test3308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest6.test3308");
        Register register0 = new Register();
        register0.registerUser("hi!", "");
        register0.registerUser("hi!", "");
        register0.loginUser("hi!", "");
        register0.runRegistrationSystem(10);
        register0.registerUser("hi!", "");
        register0.runRegistrationSystem(0);
    }

    @Test
    public void test3309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest6.test3309");
        Register register0 = new Register();
        register0.loginUser("hi!", "hi!");
        register0.registerUser("hi!", "");
        register0.registerUser("", "");
        register0.registerUser("", "hi!");
        register0.runRegistrationSystem((int) (short) 100);
        register0.loginUser("hi!", "hi!");
        register0.loginUser("", "");
        register0.registerUser("hi!", "hi!");
        register0.runRegistrationSystem((int) (short) 1);
    }

    @Test
    public void test3310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest6.test3310");
        Register register0 = new Register();
        register0.runRegistrationSystem((int) (byte) -1);
        register0.runRegistrationSystem((int) (byte) 10);
        register0.registerUser("", "");
        register0.registerUser("", "hi!");
        register0.runRegistrationSystem((int) '4');
        register0.loginUser("hi!", "");
        register0.loginUser("hi!", "hi!");
        register0.loginUser("hi!", "hi!");
        register0.registerUser("", "");
        register0.loginUser("", "");
        register0.loginUser("hi!", "");
    }

    @Test
    public void test3311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest6.test3311");
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
        register0.loginUser("hi!", "");
        register0.loginUser("hi!", "hi!");
        register0.runRegistrationSystem((int) ' ');
        register0.registerUser("", "");
    }

    @Test
    public void test3312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest6.test3312");
        Register register0 = new Register();
        register0.runRegistrationSystem((int) (byte) -1);
        register0.runRegistrationSystem((int) (byte) 10);
        register0.registerUser("", "");
        register0.loginUser("", "");
        register0.loginUser("hi!", "hi!");
        register0.loginUser("", "hi!");
        register0.runRegistrationSystem((int) '#');
    }

    @Test
    public void test3313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest6.test3313");
        Register register0 = new Register();
        register0.runRegistrationSystem((int) (byte) -1);
        register0.registerUser("hi!", "");
        register0.registerUser("", "hi!");
        register0.runRegistrationSystem((int) (short) 10);
        register0.loginUser("hi!", "hi!");
        register0.loginUser("", "hi!");
        register0.loginUser("hi!", "");
        register0.loginUser("hi!", "");
        register0.registerUser("hi!", "");
        register0.runRegistrationSystem((int) (byte) 0);
    }

    @Test
    public void test3314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest6.test3314");
        Register register0 = new Register();
        register0.loginUser("hi!", "hi!");
        register0.registerUser("hi!", "");
        register0.loginUser("hi!", "hi!");
        register0.runRegistrationSystem(100);
        register0.registerUser("hi!", "");
        register0.registerUser("", "");
        register0.runRegistrationSystem(10);
        register0.loginUser("", "");
        java.lang.Class<?> wildcardClass23 = register0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test3315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest6.test3315");
        Register register0 = new Register();
        register0.registerUser("hi!", "");
        register0.registerUser("hi!", "");
        register0.runRegistrationSystem((int) (byte) 0);
        register0.registerUser("", "");
        register0.runRegistrationSystem((int) (byte) 10);
        register0.registerUser("", "hi!");
        register0.registerUser("", "hi!");
        register0.registerUser("", "");
    }

    @Test
    public void test3316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest6.test3316");
        Register register0 = new Register();
        register0.runRegistrationSystem((int) (byte) -1);
        register0.registerUser("hi!", "");
        register0.loginUser("hi!", "hi!");
        register0.loginUser("hi!", "");
        register0.loginUser("", "");
        register0.registerUser("", "hi!");
        register0.runRegistrationSystem(0);
        register0.loginUser("hi!", "hi!");
        register0.registerUser("hi!", "hi!");
        java.lang.Class<?> wildcardClass26 = register0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass26);
    }

    @Test
    public void test3317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest6.test3317");
        Register register0 = new Register();
        register0.registerUser("hi!", "");
        register0.registerUser("hi!", "");
        register0.loginUser("hi!", "hi!");
        register0.loginUser("hi!", "");
        register0.loginUser("", "hi!");
        register0.registerUser("", "hi!");
        java.lang.Class<?> wildcardClass19 = register0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test3318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest6.test3318");
        Register register0 = new Register();
        register0.runRegistrationSystem((int) (short) 0);
        register0.loginUser("hi!", "hi!");
        register0.registerUser("", "");
        register0.runRegistrationSystem((int) '#');
        register0.registerUser("", "hi!");
        register0.registerUser("", "hi!");
        register0.registerUser("", "");
        register0.runRegistrationSystem((int) ' ');
        register0.registerUser("", "");
        register0.runRegistrationSystem(0);
        register0.runRegistrationSystem((int) (short) 10);
        register0.registerUser("hi!", "hi!");
        java.lang.Class<?> wildcardClass32 = register0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass32);
    }

    @Test
    public void test3319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest6.test3319");
        Register register0 = new Register();
        register0.loginUser("hi!", "hi!");
        register0.registerUser("hi!", "");
        register0.registerUser("", "");
        register0.registerUser("", "hi!");
        register0.registerUser("", "");
        register0.registerUser("", "");
        register0.registerUser("hi!", "");
        register0.registerUser("", "");
        register0.loginUser("hi!", "hi!");
        register0.registerUser("hi!", "");
        register0.loginUser("hi!", "hi!");
    }

    @Test
    public void test3320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest6.test3320");
        Register register0 = new Register();
        register0.runRegistrationSystem((int) (short) 0);
        register0.loginUser("hi!", "hi!");
        register0.loginUser("", "");
        register0.registerUser("hi!", "");
        register0.registerUser("hi!", "hi!");
        register0.runRegistrationSystem((int) (byte) 1);
        register0.registerUser("", "");
        register0.registerUser("", "hi!");
    }

    @Test
    public void test3321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest6.test3321");
        Register register0 = new Register();
        register0.runRegistrationSystem((int) (byte) -1);
        register0.registerUser("hi!", "");
        register0.runRegistrationSystem((int) (short) 1);
        register0.loginUser("", "hi!");
        register0.loginUser("", "");
        register0.runRegistrationSystem(1);
    }

    @Test
    public void test3322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest6.test3322");
        Register register0 = new Register();
        register0.registerUser("hi!", "");
        register0.registerUser("hi!", "");
        register0.loginUser("hi!", "");
        register0.loginUser("hi!", "");
        register0.runRegistrationSystem(10);
        register0.registerUser("", "");
        register0.registerUser("", "");
        register0.registerUser("hi!", "hi!");
        register0.loginUser("hi!", "");
    }

    @Test
    public void test3323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest6.test3323");
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
        register0.loginUser("", "hi!");
        register0.loginUser("", "");
        java.lang.Class<?> wildcardClass30 = register0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass30);
    }

    @Test
    public void test3324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest6.test3324");
        Register register0 = new Register();
        register0.registerUser("hi!", "");
        register0.loginUser("", "hi!");
        register0.runRegistrationSystem((int) 'a');
        register0.loginUser("", "hi!");
        register0.loginUser("", "hi!");
        register0.loginUser("", "hi!");
        register0.registerUser("", "hi!");
        register0.runRegistrationSystem((int) (short) 1);
        register0.loginUser("", "hi!");
        register0.runRegistrationSystem(10);
    }

    @Test
    public void test3325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest6.test3325");
        Register register0 = new Register();
        register0.registerUser("hi!", "");
        register0.registerUser("hi!", "");
        register0.loginUser("hi!", "");
        register0.loginUser("hi!", "");
        register0.loginUser("", "hi!");
        register0.loginUser("", "hi!");
        register0.runRegistrationSystem((int) (short) 100);
        register0.runRegistrationSystem(1);
        register0.runRegistrationSystem((int) ' ');
        register0.registerUser("hi!", "hi!");
    }

    @Test
    public void test3326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest6.test3326");
        Register register0 = new Register();
        register0.loginUser("hi!", "hi!");
        register0.registerUser("hi!", "");
        register0.registerUser("", "");
        register0.registerUser("", "");
        register0.runRegistrationSystem((int) (byte) 100);
        register0.runRegistrationSystem((int) (short) -1);
        register0.runRegistrationSystem(1);
        register0.registerUser("", "hi!");
        register0.loginUser("hi!", "hi!");
        register0.runRegistrationSystem((int) (short) -1);
    }

    @Test
    public void test3327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest6.test3327");
        Register register0 = new Register();
        register0.runRegistrationSystem((int) (short) 0);
        register0.loginUser("hi!", "hi!");
        register0.registerUser("", "");
        register0.loginUser("", "hi!");
        register0.registerUser("hi!", "");
        register0.runRegistrationSystem(0);
        java.lang.Class<?> wildcardClass17 = register0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test3328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest6.test3328");
        Register register0 = new Register();
        register0.runRegistrationSystem((int) (byte) -1);
        register0.registerUser("hi!", "");
        register0.runRegistrationSystem((int) (short) 1);
        register0.loginUser("", "");
        register0.loginUser("", "hi!");
        register0.registerUser("hi!", "hi!");
        register0.runRegistrationSystem((int) (short) 100);
        register0.loginUser("hi!", "");
    }

    @Test
    public void test3329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest6.test3329");
        Register register0 = new Register();
        register0.loginUser("hi!", "hi!");
        register0.runRegistrationSystem(0);
        register0.registerUser("", "");
        register0.loginUser("", "hi!");
        register0.registerUser("", "");
        register0.loginUser("hi!", "hi!");
        register0.runRegistrationSystem(10);
        register0.loginUser("", "");
        register0.registerUser("hi!", "");
        register0.registerUser("", "hi!");
    }

    @Test
    public void test3330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest6.test3330");
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
        register0.runRegistrationSystem(0);
        java.lang.Class<?> wildcardClass28 = register0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test3331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest6.test3331");
        Register register0 = new Register();
        register0.runRegistrationSystem((int) '#');
        register0.loginUser("hi!", "hi!");
        register0.registerUser("", "");
        register0.loginUser("", "hi!");
        register0.loginUser("", "");
        register0.loginUser("", "hi!");
        register0.runRegistrationSystem((int) ' ');
        register0.loginUser("", "");
    }

    @Test
    public void test3332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest6.test3332");
        Register register0 = new Register();
        register0.runRegistrationSystem((int) '#');
        register0.registerUser("", "hi!");
        register0.loginUser("hi!", "hi!");
        register0.runRegistrationSystem(100);
        register0.runRegistrationSystem((int) (short) 10);
        register0.runRegistrationSystem((int) (short) 0);
        register0.runRegistrationSystem((int) (short) 1);
        register0.registerUser("", "");
    }

    @Test
    public void test3333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest6.test3333");
        Register register0 = new Register();
        register0.loginUser("hi!", "hi!");
        register0.runRegistrationSystem(0);
        register0.runRegistrationSystem(10);
        register0.runRegistrationSystem(1);
        register0.loginUser("", "hi!");
    }

    @Test
    public void test3334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest6.test3334");
        Register register0 = new Register();
        register0.runRegistrationSystem((int) '#');
        register0.registerUser("", "hi!");
        register0.runRegistrationSystem((int) (short) 0);
        register0.runRegistrationSystem((int) (byte) 1);
        register0.runRegistrationSystem((int) 'a');
        register0.registerUser("hi!", "hi!");
        register0.runRegistrationSystem((int) '4');
        register0.runRegistrationSystem((int) (short) -1);
        register0.runRegistrationSystem((int) 'a');
    }

    @Test
    public void test3335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest6.test3335");
        Register register0 = new Register();
        register0.runRegistrationSystem((int) (byte) -1);
        register0.registerUser("hi!", "");
        register0.registerUser("", "hi!");
        register0.runRegistrationSystem((int) (short) 10);
        register0.registerUser("", "");
    }

    @Test
    public void test3336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest6.test3336");
        Register register0 = new Register();
        register0.loginUser("hi!", "hi!");
        register0.registerUser("hi!", "");
        register0.registerUser("hi!", "");
        register0.registerUser("", "");
        register0.loginUser("", "hi!");
        register0.loginUser("hi!", "");
        register0.registerUser("", "hi!");
        register0.loginUser("", "");
        register0.runRegistrationSystem(10);
    }

    @Test
    public void test3337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest6.test3337");
        Register register0 = new Register();
        register0.registerUser("hi!", "");
        register0.loginUser("", "hi!");
        register0.runRegistrationSystem((int) (byte) -1);
        register0.runRegistrationSystem(10);
        register0.runRegistrationSystem((int) (short) 10);
        register0.registerUser("", "");
        java.lang.Class<?> wildcardClass16 = register0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test3338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest6.test3338");
        Register register0 = new Register();
        register0.runRegistrationSystem((int) '#');
        register0.registerUser("", "hi!");
        register0.runRegistrationSystem((int) (short) 0);
        register0.runRegistrationSystem((int) (byte) 1);
        register0.runRegistrationSystem((int) 'a');
        register0.registerUser("", "");
        register0.registerUser("hi!", "hi!");
        register0.loginUser("", "hi!");
        register0.loginUser("hi!", "hi!");
        register0.runRegistrationSystem(100);
        register0.registerUser("", "");
    }

    @Test
    public void test3339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest6.test3339");
        Register register0 = new Register();
        register0.registerUser("hi!", "");
        register0.registerUser("hi!", "");
        register0.loginUser("hi!", "");
        register0.loginUser("hi!", "");
        register0.loginUser("", "hi!");
        register0.loginUser("hi!", "");
        register0.loginUser("", "hi!");
        register0.registerUser("hi!", "");
        register0.loginUser("hi!", "hi!");
        register0.runRegistrationSystem((int) '#');
    }

    @Test
    public void test3340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest6.test3340");
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
        register0.runRegistrationSystem((int) (short) 10);
    }

    @Test
    public void test3341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest6.test3341");
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
        java.lang.Class<?> wildcardClass29 = register0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass29);
    }

    @Test
    public void test3342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest6.test3342");
        Register register0 = new Register();
        register0.registerUser("hi!", "");
        register0.loginUser("", "hi!");
        register0.loginUser("", "hi!");
        register0.runRegistrationSystem(10);
        register0.loginUser("", "");
        register0.runRegistrationSystem((int) (byte) 10);
        register0.runRegistrationSystem((int) '#');
        register0.runRegistrationSystem((int) (short) 0);
    }

    @Test
    public void test3343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest6.test3343");
        Register register0 = new Register();
        register0.runRegistrationSystem((int) (short) 0);
        register0.loginUser("hi!", "hi!");
        register0.registerUser("", "");
        register0.runRegistrationSystem((-1));
        register0.runRegistrationSystem((int) (short) 10);
        register0.runRegistrationSystem(10);
        register0.loginUser("hi!", "");
        register0.runRegistrationSystem((int) (short) 0);
        register0.loginUser("hi!", "hi!");
    }

    @Test
    public void test3344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest6.test3344");
        Register register0 = new Register();
        register0.runRegistrationSystem((int) '#');
        register0.registerUser("", "hi!");
        register0.registerUser("", "hi!");
        register0.registerUser("", "");
        register0.runRegistrationSystem((int) (byte) 10);
        register0.runRegistrationSystem((int) (short) 100);
        register0.runRegistrationSystem((int) (short) 1);
        register0.registerUser("", "");
        register0.registerUser("", "hi!");
        register0.runRegistrationSystem((int) (short) 10);
    }

    @Test
    public void test3345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest6.test3345");
        Register register0 = new Register();
        register0.registerUser("hi!", "");
        register0.registerUser("hi!", "");
        register0.loginUser("hi!", "");
        register0.registerUser("", "hi!");
        register0.registerUser("hi!", "");
        register0.loginUser("", "hi!");
        register0.runRegistrationSystem((int) '#');
        register0.runRegistrationSystem((int) (byte) 1);
        register0.runRegistrationSystem((int) (byte) 10);
        register0.runRegistrationSystem((int) (byte) 10);
    }

    @Test
    public void test3346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest6.test3346");
        Register register0 = new Register();
        register0.registerUser("hi!", "");
        register0.loginUser("", "hi!");
        register0.loginUser("", "hi!");
        register0.runRegistrationSystem(10);
        register0.loginUser("", "");
        register0.runRegistrationSystem((int) (byte) 10);
        register0.loginUser("", "hi!");
        register0.registerUser("", "");
        register0.runRegistrationSystem((int) (byte) 10);
    }

    @Test
    public void test3347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest6.test3347");
        Register register0 = new Register();
        register0.loginUser("hi!", "hi!");
        register0.registerUser("hi!", "");
        register0.registerUser("hi!", "");
        register0.registerUser("", "");
        register0.runRegistrationSystem(100);
        register0.registerUser("hi!", "");
        register0.registerUser("", "");
        register0.runRegistrationSystem((int) (byte) 100);
        register0.registerUser("hi!", "hi!");
    }

    @Test
    public void test3348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest6.test3348");
        Register register0 = new Register();
        register0.registerUser("hi!", "");
        register0.loginUser("", "hi!");
        register0.runRegistrationSystem((int) 'a');
        register0.loginUser("", "hi!");
        register0.runRegistrationSystem((int) (byte) -1);
        register0.loginUser("", "hi!");
        register0.loginUser("", "hi!");
        register0.loginUser("hi!", "hi!");
        register0.registerUser("hi!", "hi!");
        register0.loginUser("hi!", "hi!");
        register0.registerUser("hi!", "");
        register0.registerUser("hi!", "");
    }

    @Test
    public void test3349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest6.test3349");
        Register register0 = new Register();
        register0.runRegistrationSystem((int) '#');
        register0.registerUser("", "hi!");
        register0.loginUser("hi!", "hi!");
        register0.runRegistrationSystem(100);
        register0.runRegistrationSystem(1);
        register0.runRegistrationSystem((int) ' ');
        java.lang.Class<?> wildcardClass15 = register0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test3350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest6.test3350");
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
        register0.registerUser("", "hi!");
        register0.runRegistrationSystem((int) (byte) 0);
    }

    @Test
    public void test3351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest6.test3351");
        Register register0 = new Register();
        register0.registerUser("hi!", "");
        register0.loginUser("", "hi!");
        register0.runRegistrationSystem((int) (byte) -1);
        register0.runRegistrationSystem(1);
        register0.registerUser("", "");
        register0.registerUser("hi!", "");
        register0.registerUser("hi!", "");
        register0.loginUser("hi!", "");
        java.lang.Class<?> wildcardClass23 = register0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test3352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest6.test3352");
        Register register0 = new Register();
        register0.loginUser("hi!", "hi!");
        register0.runRegistrationSystem(0);
        register0.runRegistrationSystem(10);
        register0.registerUser("hi!", "");
        register0.runRegistrationSystem((int) 'a');
        register0.loginUser("", "");
    }

    @Test
    public void test3353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest6.test3353");
        Register register0 = new Register();
        register0.loginUser("hi!", "hi!");
        register0.registerUser("hi!", "");
        register0.registerUser("", "");
        register0.registerUser("", "");
        register0.runRegistrationSystem((int) (short) 0);
        register0.registerUser("hi!", "");
        register0.loginUser("hi!", "hi!");
    }

    @Test
    public void test3354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest6.test3354");
        Register register0 = new Register();
        register0.loginUser("hi!", "hi!");
        register0.registerUser("hi!", "");
        register0.registerUser("", "");
        register0.registerUser("hi!", "");
        register0.registerUser("hi!", "");
        register0.runRegistrationSystem((int) 'a');
        register0.runRegistrationSystem((int) (short) 100);
        register0.registerUser("", "");
    }

    @Test
    public void test3355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest6.test3355");
        Register register0 = new Register();
        register0.loginUser("hi!", "hi!");
        register0.registerUser("hi!", "");
        register0.registerUser("", "");
        register0.registerUser("", "hi!");
        register0.loginUser("hi!", "hi!");
        register0.loginUser("hi!", "hi!");
        register0.loginUser("", "hi!");
        java.lang.Class<?> wildcardClass22 = register0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test3356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest6.test3356");
        Register register0 = new Register();
        register0.runRegistrationSystem((int) '#');
        register0.loginUser("hi!", "hi!");
        register0.loginUser("hi!", "hi!");
        register0.loginUser("hi!", "");
        register0.loginUser("", "");
        register0.runRegistrationSystem((int) (short) 1);
        register0.loginUser("hi!", "hi!");
        register0.runRegistrationSystem((int) ' ');
        register0.registerUser("hi!", "");
        register0.runRegistrationSystem((int) (short) 100);
    }

    @Test
    public void test3357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest6.test3357");
        Register register0 = new Register();
        register0.runRegistrationSystem((int) '#');
        register0.registerUser("", "hi!");
        register0.runRegistrationSystem((int) (short) 0);
        register0.runRegistrationSystem((int) (byte) 1);
        register0.runRegistrationSystem((int) 'a');
        register0.registerUser("hi!", "hi!");
        register0.runRegistrationSystem((int) '4');
        register0.loginUser("", "");
    }

    @Test
    public void test3358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest6.test3358");
        Register register0 = new Register();
        register0.runRegistrationSystem((int) (short) 0);
        register0.loginUser("hi!", "hi!");
        register0.registerUser("", "");
        register0.runRegistrationSystem((-1));
        register0.loginUser("hi!", "");
        register0.loginUser("", "");
    }

    @Test
    public void test3359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest6.test3359");
        Register register0 = new Register();
        register0.runRegistrationSystem((int) (short) 0);
        register0.loginUser("hi!", "hi!");
        register0.registerUser("", "");
        register0.runRegistrationSystem((int) '#');
        register0.runRegistrationSystem((int) '#');
        register0.loginUser("hi!", "");
        register0.runRegistrationSystem((int) (byte) 10);
        java.lang.Class<?> wildcardClass18 = register0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test3360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest6.test3360");
        Register register0 = new Register();
        register0.runRegistrationSystem((int) (short) 0);
        register0.loginUser("hi!", "hi!");
        register0.registerUser("", "");
        register0.runRegistrationSystem((int) '#');
        register0.loginUser("", "hi!");
        register0.loginUser("", "");
        register0.registerUser("", "hi!");
    }

    @Test
    public void test3361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest6.test3361");
        Register register0 = new Register();
        register0.runRegistrationSystem((int) (short) 0);
        register0.loginUser("hi!", "hi!");
        register0.registerUser("", "");
        register0.runRegistrationSystem((-1));
        register0.runRegistrationSystem((int) (short) 10);
        register0.runRegistrationSystem(0);
        register0.registerUser("", "hi!");
        register0.registerUser("", "hi!");
        java.lang.Class<?> wildcardClass21 = register0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test3362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest6.test3362");
        Register register0 = new Register();
        register0.runRegistrationSystem((int) (byte) -1);
        register0.runRegistrationSystem((int) (byte) 10);
        register0.registerUser("", "");
        register0.loginUser("", "");
        register0.registerUser("", "hi!");
        register0.registerUser("", "hi!");
        register0.registerUser("hi!", "hi!");
        register0.registerUser("hi!", "hi!");
        register0.registerUser("", "");
        register0.registerUser("hi!", "");
        register0.registerUser("hi!", "hi!");
    }

    @Test
    public void test3363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest6.test3363");
        Register register0 = new Register();
        register0.loginUser("hi!", "hi!");
        register0.registerUser("hi!", "");
        register0.registerUser("", "");
        register0.registerUser("", "");
        register0.runRegistrationSystem((int) (byte) 100);
        register0.runRegistrationSystem((int) (short) -1);
        register0.runRegistrationSystem(1);
        register0.runRegistrationSystem((int) (short) 1);
        register0.registerUser("", "hi!");
        java.lang.Class<?> wildcardClass24 = register0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test3364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest6.test3364");
        Register register0 = new Register();
        register0.registerUser("hi!", "");
        register0.registerUser("", "");
        register0.registerUser("", "hi!");
        register0.runRegistrationSystem(0);
        register0.loginUser("", "hi!");
    }

    @Test
    public void test3365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest6.test3365");
        Register register0 = new Register();
        register0.registerUser("hi!", "");
        register0.runRegistrationSystem(1);
        register0.registerUser("", "");
        register0.registerUser("hi!", "");
        register0.runRegistrationSystem((int) '4');
        java.lang.Class<?> wildcardClass14 = register0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test3366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest6.test3366");
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
        register0.runRegistrationSystem((int) (byte) 100);
    }

    @Test
    public void test3367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest6.test3367");
        Register register0 = new Register();
        register0.runRegistrationSystem((int) (byte) -1);
        register0.registerUser("hi!", "");
        register0.registerUser("", "");
        register0.runRegistrationSystem((int) (short) 100);
        register0.registerUser("", "hi!");
        java.lang.Class<?> wildcardClass14 = register0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test3368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest6.test3368");
        Register register0 = new Register();
        register0.registerUser("hi!", "");
        register0.registerUser("hi!", "");
        register0.runRegistrationSystem((int) (byte) 0);
        register0.registerUser("", "");
        register0.runRegistrationSystem((int) (byte) 10);
        register0.runRegistrationSystem((int) (byte) 1);
        register0.registerUser("", "hi!");
        register0.runRegistrationSystem((int) (short) 1);
        register0.loginUser("", "hi!");
        register0.registerUser("hi!", "");
    }

    @Test
    public void test3369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest6.test3369");
        Register register0 = new Register();
        register0.runRegistrationSystem((int) (byte) -1);
        register0.registerUser("hi!", "");
        register0.loginUser("hi!", "hi!");
        register0.runRegistrationSystem((int) (byte) 1);
        register0.registerUser("", "hi!");
        register0.loginUser("", "");
        register0.runRegistrationSystem(0);
        register0.loginUser("hi!", "");
    }

    @Test
    public void test3370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest6.test3370");
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
        java.lang.Class<?> wildcardClass33 = register0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass33);
    }

    @Test
    public void test3371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest6.test3371");
        Register register0 = new Register();
        register0.registerUser("hi!", "");
        java.lang.Class<?> wildcardClass4 = register0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test3372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest6.test3372");
        Register register0 = new Register();
        register0.runRegistrationSystem((int) '#');
        register0.runRegistrationSystem((int) (short) 100);
        register0.runRegistrationSystem(100);
        register0.registerUser("hi!", "");
        register0.loginUser("", "hi!");
        register0.loginUser("hi!", "hi!");
    }

    @Test
    public void test3373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest6.test3373");
        Register register0 = new Register();
        register0.runRegistrationSystem((int) (byte) -1);
        register0.registerUser("hi!", "");
        register0.runRegistrationSystem((int) (byte) 100);
        register0.runRegistrationSystem((int) (short) -1);
        register0.loginUser("", "");
        register0.runRegistrationSystem((int) (byte) 0);
        register0.loginUser("", "");
        register0.loginUser("", "");
    }

    @Test
    public void test3374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest6.test3374");
        Register register0 = new Register();
        register0.registerUser("hi!", "");
        register0.loginUser("", "hi!");
        register0.runRegistrationSystem((int) 'a');
        register0.loginUser("", "hi!");
        register0.loginUser("hi!", "");
        register0.registerUser("hi!", "hi!");
        register0.registerUser("", "hi!");
        register0.registerUser("", "");
        register0.loginUser("", "");
        register0.runRegistrationSystem(0);
        register0.registerUser("", "hi!");
        register0.runRegistrationSystem(10);
    }

    @Test
    public void test3375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest6.test3375");
        Register register0 = new Register();
        register0.registerUser("hi!", "");
        register0.loginUser("", "hi!");
        register0.runRegistrationSystem(0);
        register0.registerUser("hi!", "hi!");
        register0.loginUser("", "hi!");
        register0.runRegistrationSystem((int) (short) -1);
    }

    @Test
    public void test3376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest6.test3376");
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
        register0.registerUser("", "");
        register0.registerUser("hi!", "hi!");
    }

    @Test
    public void test3377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest6.test3377");
        Register register0 = new Register();
        register0.runRegistrationSystem((int) (byte) -1);
        register0.registerUser("hi!", "");
        register0.registerUser("", "");
        register0.runRegistrationSystem((int) (byte) 1);
        register0.registerUser("", "");
    }

    @Test
    public void test3378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest6.test3378");
        Register register0 = new Register();
        register0.runRegistrationSystem((int) (byte) -1);
        register0.registerUser("hi!", "");
        register0.loginUser("hi!", "hi!");
        register0.loginUser("hi!", "");
        register0.registerUser("hi!", "");
        register0.registerUser("hi!", "hi!");
        register0.registerUser("", "hi!");
        register0.loginUser("", "hi!");
        register0.loginUser("", "hi!");
        register0.runRegistrationSystem((int) '4');
        register0.loginUser("hi!", "hi!");
    }

    @Test
    public void test3379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest6.test3379");
        Register register0 = new Register();
        register0.loginUser("hi!", "hi!");
        register0.runRegistrationSystem(0);
        register0.registerUser("", "");
        register0.loginUser("", "hi!");
        register0.runRegistrationSystem((int) (short) 10);
    }

    @Test
    public void test3380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest6.test3380");
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
        register0.registerUser("hi!", "hi!");
    }

    @Test
    public void test3381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest6.test3381");
        Register register0 = new Register();
        register0.runRegistrationSystem((int) (byte) -1);
        register0.runRegistrationSystem((int) '#');
        register0.loginUser("", "");
        register0.runRegistrationSystem((int) (short) 0);
        register0.loginUser("", "hi!");
        register0.runRegistrationSystem((int) (byte) -1);
    }

    @Test
    public void test3382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest6.test3382");
        Register register0 = new Register();
        register0.runRegistrationSystem((int) '#');
        register0.registerUser("", "hi!");
        register0.runRegistrationSystem((int) (short) 0);
        register0.runRegistrationSystem((int) (byte) 1);
        register0.registerUser("", "");
        register0.runRegistrationSystem((int) (short) 10);
        register0.runRegistrationSystem((int) (short) -1);
        register0.loginUser("", "hi!");
        register0.loginUser("", "");
        register0.registerUser("hi!", "");
        register0.runRegistrationSystem((int) (short) 0);
    }

    @Test
    public void test3383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest6.test3383");
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
        register0.loginUser("hi!", "hi!");
        register0.registerUser("hi!", "");
        register0.runRegistrationSystem((int) (byte) -1);
        register0.runRegistrationSystem((int) '#');
    }

    @Test
    public void test3384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest6.test3384");
        Register register0 = new Register();
        register0.runRegistrationSystem((int) (byte) -1);
        register0.runRegistrationSystem((int) (byte) 10);
        register0.registerUser("", "");
        register0.loginUser("", "");
        register0.registerUser("", "hi!");
        register0.registerUser("hi!", "");
        register0.runRegistrationSystem((int) (byte) 0);
        register0.registerUser("", "");
        register0.registerUser("", "");
    }

    @Test
    public void test3385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest6.test3385");
        Register register0 = new Register();
        register0.runRegistrationSystem((int) (short) 0);
        register0.loginUser("hi!", "hi!");
        register0.registerUser("", "");
        register0.runRegistrationSystem((-1));
        register0.loginUser("", "hi!");
        register0.loginUser("", "");
        register0.runRegistrationSystem((int) ' ');
        register0.runRegistrationSystem((int) (short) 1);
        register0.registerUser("hi!", "");
        java.lang.Class<?> wildcardClass24 = register0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test3386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest6.test3386");
        Register register0 = new Register();
        register0.loginUser("hi!", "hi!");
        register0.registerUser("hi!", "");
        register0.loginUser("hi!", "hi!");
        register0.registerUser("", "");
        register0.runRegistrationSystem(0);
        register0.registerUser("", "");
        register0.registerUser("hi!", "hi!");
        register0.runRegistrationSystem((-1));
        register0.registerUser("", "");
        register0.loginUser("hi!", "hi!");
        register0.registerUser("", "hi!");
    }

    @Test
    public void test3387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest6.test3387");
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
        register0.loginUser("", "hi!");
        register0.runRegistrationSystem(100);
        register0.registerUser("hi!", "hi!");
    }

    @Test
    public void test3388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest6.test3388");
        Register register0 = new Register();
        register0.runRegistrationSystem((int) (short) 0);
        register0.loginUser("hi!", "hi!");
        register0.registerUser("", "");
        register0.loginUser("", "hi!");
        register0.registerUser("hi!", "");
        register0.runRegistrationSystem((int) '#');
        register0.registerUser("hi!", "");
        register0.runRegistrationSystem((int) (byte) 1);
        register0.runRegistrationSystem(100);
    }

    @Test
    public void test3389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest6.test3389");
        Register register0 = new Register();
        register0.loginUser("hi!", "hi!");
        register0.registerUser("hi!", "");
        register0.registerUser("", "");
        register0.registerUser("", "hi!");
        register0.loginUser("", "hi!");
        register0.registerUser("hi!", "hi!");
        register0.runRegistrationSystem(0);
        java.lang.Class<?> wildcardClass21 = register0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test3390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest6.test3390");
        Register register0 = new Register();
        register0.runRegistrationSystem((int) (short) 0);
        register0.loginUser("hi!", "hi!");
        register0.registerUser("", "");
        register0.runRegistrationSystem((-1));
        register0.runRegistrationSystem((int) (short) 10);
        register0.runRegistrationSystem(10);
        register0.registerUser("hi!", "");
        register0.runRegistrationSystem((-1));
        register0.registerUser("", "");
        register0.registerUser("hi!", "");
        register0.runRegistrationSystem((int) (short) 100);
        java.lang.Class<?> wildcardClass28 = register0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test3391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest6.test3391");
        Register register0 = new Register();
        register0.registerUser("hi!", "");
        register0.runRegistrationSystem(1);
        register0.registerUser("", "");
        register0.runRegistrationSystem((int) (short) -1);
        register0.loginUser("", "");
        register0.registerUser("", "hi!");
        register0.registerUser("", "");
    }

    @Test
    public void test3392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest6.test3392");
        Register register0 = new Register();
        register0.registerUser("hi!", "");
        register0.registerUser("hi!", "");
        register0.loginUser("hi!", "");
        register0.registerUser("", "hi!");
        register0.registerUser("hi!", "");
        register0.loginUser("", "hi!");
        register0.registerUser("hi!", "hi!");
        register0.loginUser("", "hi!");
        register0.loginUser("hi!", "hi!");
    }

    @Test
    public void test3393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest6.test3393");
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
        register0.registerUser("", "");
        register0.loginUser("hi!", "hi!");
    }

    @Test
    public void test3394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest6.test3394");
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
        register0.loginUser("", "hi!");
        register0.registerUser("", "hi!");
        register0.registerUser("", "");
    }

    @Test
    public void test3395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest6.test3395");
        Register register0 = new Register();
        register0.loginUser("hi!", "hi!");
        register0.registerUser("hi!", "");
        register0.loginUser("hi!", "hi!");
        register0.runRegistrationSystem(100);
        register0.registerUser("hi!", "");
        register0.registerUser("", "");
        register0.runRegistrationSystem(0);
        register0.runRegistrationSystem(0);
        register0.loginUser("", "hi!");
        register0.registerUser("hi!", "");
        register0.loginUser("hi!", "hi!");
        register0.loginUser("", "");
    }

    @Test
    public void test3396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest6.test3396");
        Register register0 = new Register();
        register0.runRegistrationSystem((int) (short) 0);
        register0.runRegistrationSystem((int) (byte) 1);
        register0.registerUser("", "");
        register0.loginUser("", "");
        register0.loginUser("", "hi!");
    }

    @Test
    public void test3397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest6.test3397");
        Register register0 = new Register();
        register0.registerUser("hi!", "");
        register0.registerUser("hi!", "");
        register0.loginUser("hi!", "");
        register0.runRegistrationSystem(10);
        register0.loginUser("", "hi!");
        register0.loginUser("", "hi!");
        register0.registerUser("", "hi!");
    }

    @Test
    public void test3398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest6.test3398");
        Register register0 = new Register();
        register0.runRegistrationSystem((int) (short) 0);
        register0.loginUser("hi!", "hi!");
        register0.registerUser("", "");
        register0.runRegistrationSystem((int) '#');
        register0.runRegistrationSystem((int) '#');
        register0.loginUser("hi!", "");
        register0.runRegistrationSystem((-1));
    }

    @Test
    public void test3399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest6.test3399");
        Register register0 = new Register();
        register0.loginUser("hi!", "hi!");
        register0.registerUser("hi!", "");
        register0.registerUser("hi!", "");
        register0.registerUser("", "");
        register0.runRegistrationSystem(100);
        register0.runRegistrationSystem((int) (byte) -1);
        register0.runRegistrationSystem((int) (short) 0);
    }

    @Test
    public void test3400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest6.test3400");
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
        register0.loginUser("hi!", "hi!");
    }

    @Test
    public void test3401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest6.test3401");
        Register register0 = new Register();
        register0.runRegistrationSystem((int) (byte) -1);
        register0.registerUser("hi!", "");
        register0.loginUser("hi!", "hi!");
        register0.loginUser("hi!", "");
        register0.registerUser("hi!", "");
        register0.registerUser("hi!", "hi!");
        register0.registerUser("", "hi!");
        register0.runRegistrationSystem(100);
        java.lang.Class<?> wildcardClass23 = register0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test3402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest6.test3402");
        Register register0 = new Register();
        register0.registerUser("hi!", "");
        register0.loginUser("", "hi!");
        register0.runRegistrationSystem((int) 'a');
        register0.loginUser("hi!", "");
        register0.registerUser("hi!", "");
        register0.loginUser("hi!", "hi!");
    }

    @Test
    public void test3403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest6.test3403");
        Register register0 = new Register();
        register0.registerUser("hi!", "");
        register0.runRegistrationSystem(1);
        register0.registerUser("", "hi!");
        register0.runRegistrationSystem(100);
        register0.runRegistrationSystem((int) 'a');
        register0.loginUser("hi!", "hi!");
        register0.loginUser("hi!", "");
        register0.registerUser("", "hi!");
        register0.loginUser("hi!", "");
        register0.registerUser("", "");
        java.lang.Class<?> wildcardClass28 = register0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test3404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest6.test3404");
        Register register0 = new Register();
        register0.runRegistrationSystem((int) (byte) -1);
        register0.registerUser("hi!", "");
        register0.loginUser("hi!", "hi!");
        register0.loginUser("hi!", "");
        register0.registerUser("hi!", "");
        register0.runRegistrationSystem(0);
    }

    @Test
    public void test3405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest6.test3405");
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
        register0.registerUser("hi!", "hi!");
    }

    @Test
    public void test3406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest6.test3406");
        Register register0 = new Register();
        register0.runRegistrationSystem((int) (byte) -1);
        register0.registerUser("hi!", "");
        register0.loginUser("hi!", "hi!");
        register0.loginUser("hi!", "");
        register0.loginUser("", "");
        register0.loginUser("hi!", "hi!");
        register0.registerUser("hi!", "hi!");
        register0.runRegistrationSystem(10);
    }

    @Test
    public void test3407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest6.test3407");
        Register register0 = new Register();
        register0.runRegistrationSystem((int) (short) 0);
        register0.loginUser("hi!", "hi!");
        register0.registerUser("", "");
        register0.runRegistrationSystem((-1));
        register0.runRegistrationSystem((int) (short) 10);
        register0.runRegistrationSystem(10);
        register0.loginUser("", "hi!");
        register0.runRegistrationSystem((int) (byte) 100);
        register0.loginUser("hi!", "");
    }

    @Test
    public void test3408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest6.test3408");
        Register register0 = new Register();
        register0.registerUser("hi!", "");
        register0.runRegistrationSystem(1);
        register0.registerUser("", "");
        register0.runRegistrationSystem((int) (short) -1);
        register0.loginUser("", "");
        register0.loginUser("hi!", "");
        register0.loginUser("hi!", "hi!");
        register0.runRegistrationSystem((-1));
        register0.runRegistrationSystem((int) (short) 0);
        register0.loginUser("hi!", "");
        register0.registerUser("", "");
        register0.loginUser("", "hi!");
        register0.registerUser("hi!", "hi!");
        register0.registerUser("", "hi!");
        register0.runRegistrationSystem(100);
    }

    @Test
    public void test3409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest6.test3409");
        Register register0 = new Register();
        register0.runRegistrationSystem((int) (short) 0);
        register0.loginUser("hi!", "hi!");
        register0.registerUser("", "");
        register0.runRegistrationSystem((int) '#');
        register0.registerUser("", "hi!");
        register0.registerUser("", "hi!");
        register0.registerUser("", "");
        register0.loginUser("hi!", "");
        register0.registerUser("", "hi!");
        register0.runRegistrationSystem((int) (byte) -1);
        register0.loginUser("hi!", "");
        register0.runRegistrationSystem((int) (byte) -1);
        register0.registerUser("hi!", "hi!");
    }

    @Test
    public void test3410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest6.test3410");
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
        register0.loginUser("hi!", "hi!");
        register0.loginUser("hi!", "hi!");
        register0.registerUser("hi!", "hi!");
        java.lang.Class<?> wildcardClass35 = register0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass35);
    }

    @Test
    public void test3411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest6.test3411");
        Register register0 = new Register();
        register0.runRegistrationSystem((int) '#');
        register0.registerUser("", "hi!");
        register0.loginUser("hi!", "hi!");
        register0.runRegistrationSystem(100);
        register0.runRegistrationSystem((int) (short) 10);
        register0.runRegistrationSystem((int) (short) 0);
        register0.runRegistrationSystem((int) (short) 1);
        register0.loginUser("", "hi!");
        register0.registerUser("", "hi!");
    }

    @Test
    public void test3412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest6.test3412");
        Register register0 = new Register();
        register0.runRegistrationSystem((int) (short) 0);
        register0.loginUser("hi!", "hi!");
        register0.registerUser("", "");
        register0.loginUser("hi!", "hi!");
    }

    @Test
    public void test3413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest6.test3413");
        Register register0 = new Register();
        register0.registerUser("hi!", "");
        register0.loginUser("", "hi!");
        register0.runRegistrationSystem((int) (byte) -1);
        register0.loginUser("", "");
        register0.runRegistrationSystem((int) (short) 0);
        register0.runRegistrationSystem((int) '#');
        register0.loginUser("hi!", "");
        register0.registerUser("hi!", "hi!");
    }

    @Test
    public void test3414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest6.test3414");
        Register register0 = new Register();
        register0.runRegistrationSystem((int) (short) 0);
        register0.loginUser("hi!", "hi!");
        register0.registerUser("", "");
        register0.loginUser("", "hi!");
        register0.registerUser("hi!", "hi!");
        register0.registerUser("hi!", "");
        register0.runRegistrationSystem(100);
    }

    @Test
    public void test3415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest6.test3415");
        Register register0 = new Register();
        register0.runRegistrationSystem((int) (byte) -1);
        register0.registerUser("hi!", "");
        register0.runRegistrationSystem((int) (short) 1);
        register0.runRegistrationSystem((int) 'a');
        register0.registerUser("", "");
        register0.runRegistrationSystem((int) (byte) 100);
        register0.registerUser("hi!", "");
        register0.runRegistrationSystem((int) (byte) 1);
        register0.runRegistrationSystem((int) (byte) -1);
        java.lang.Class<?> wildcardClass22 = register0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test3416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest6.test3416");
        Register register0 = new Register();
        register0.loginUser("hi!", "hi!");
        register0.registerUser("hi!", "");
        register0.registerUser("", "");
        register0.registerUser("", "hi!");
        register0.loginUser("hi!", "hi!");
        register0.loginUser("hi!", "hi!");
        register0.loginUser("", "");
        register0.registerUser("hi!", "hi!");
    }

    @Test
    public void test3417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest6.test3417");
        Register register0 = new Register();
        register0.registerUser("hi!", "");
        register0.loginUser("", "hi!");
        register0.runRegistrationSystem((int) 'a');
        register0.loginUser("", "hi!");
        register0.loginUser("", "hi!");
        register0.registerUser("", "");
        register0.loginUser("hi!", "hi!");
        register0.runRegistrationSystem(0);
        register0.registerUser("hi!", "");
    }

    @Test
    public void test3418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest6.test3418");
        Register register0 = new Register();
        register0.loginUser("hi!", "hi!");
        register0.loginUser("hi!", "hi!");
        register0.registerUser("", "");
        register0.runRegistrationSystem((int) (byte) 1);
        register0.loginUser("hi!", "");
        register0.loginUser("", "");
        register0.runRegistrationSystem((int) (byte) 100);
    }

    @Test
    public void test3419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest6.test3419");
        Register register0 = new Register();
        register0.loginUser("hi!", "hi!");
        register0.registerUser("hi!", "");
        register0.registerUser("hi!", "");
        register0.registerUser("", "");
        register0.loginUser("", "hi!");
        register0.loginUser("hi!", "");
        register0.registerUser("", "hi!");
        java.lang.Class<?> wildcardClass22 = register0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test3420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest6.test3420");
        Register register0 = new Register();
        register0.registerUser("hi!", "");
        register0.runRegistrationSystem(1);
        register0.registerUser("", "");
        register0.runRegistrationSystem((int) (short) -1);
        register0.loginUser("", "");
        register0.loginUser("hi!", "");
        register0.loginUser("hi!", "hi!");
        register0.runRegistrationSystem((-1));
        register0.runRegistrationSystem((int) (short) 0);
        register0.loginUser("hi!", "");
        register0.registerUser("", "");
        register0.loginUser("", "hi!");
        java.lang.Class<?> wildcardClass33 = register0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass33);
    }

    @Test
    public void test3421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest6.test3421");
        Register register0 = new Register();
        register0.loginUser("hi!", "hi!");
        register0.registerUser("hi!", "");
        register0.registerUser("", "");
        register0.registerUser("", "hi!");
        register0.runRegistrationSystem((int) (short) 100);
        register0.runRegistrationSystem((int) (byte) 1);
        register0.loginUser("", "");
        register0.registerUser("hi!", "");
        register0.registerUser("", "hi!");
        register0.loginUser("", "hi!");
        register0.runRegistrationSystem((int) (byte) 10);
    }

    @Test
    public void test3422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest6.test3422");
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
        register0.runRegistrationSystem(10);
        register0.registerUser("", "hi!");
    }

    @Test
    public void test3423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest6.test3423");
        Register register0 = new Register();
        register0.registerUser("hi!", "");
        register0.loginUser("", "hi!");
        register0.runRegistrationSystem((int) (byte) -1);
        register0.runRegistrationSystem(1);
        register0.loginUser("hi!", "");
        register0.runRegistrationSystem(0);
        register0.registerUser("", "");
        register0.runRegistrationSystem((int) '#');
        register0.loginUser("", "hi!");
        register0.loginUser("", "hi!");
        java.lang.Class<?> wildcardClass27 = register0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test3424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest6.test3424");
        Register register0 = new Register();
        register0.loginUser("hi!", "hi!");
        register0.registerUser("hi!", "");
        register0.registerUser("", "");
        register0.runRegistrationSystem((int) (byte) 100);
        register0.registerUser("hi!", "");
        register0.runRegistrationSystem(1);
        register0.runRegistrationSystem(0);
        register0.runRegistrationSystem((int) '4');
        register0.registerUser("hi!", "hi!");
        register0.loginUser("hi!", "");
    }

    @Test
    public void test3425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest6.test3425");
        Register register0 = new Register();
        register0.runRegistrationSystem((int) (byte) -1);
        register0.runRegistrationSystem((int) (byte) 10);
        register0.registerUser("", "");
        register0.loginUser("", "");
        register0.runRegistrationSystem((int) (byte) 0);
        register0.loginUser("", "hi!");
        register0.runRegistrationSystem((int) (short) -1);
        register0.runRegistrationSystem(10);
        register0.registerUser("", "");
    }

    @Test
    public void test3426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest6.test3426");
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
        register0.loginUser("hi!", "");
        register0.registerUser("", "hi!");
        register0.runRegistrationSystem((int) (byte) 1);
    }

    @Test
    public void test3427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest6.test3427");
        Register register0 = new Register();
        register0.runRegistrationSystem((int) '#');
        register0.registerUser("", "hi!");
        register0.runRegistrationSystem((int) (short) 0);
        register0.runRegistrationSystem((int) (byte) 1);
        register0.registerUser("", "");
        register0.runRegistrationSystem((int) (short) 10);
        register0.runRegistrationSystem((int) (short) -1);
        register0.loginUser("", "hi!");
        register0.loginUser("", "");
        register0.registerUser("hi!", "");
        register0.runRegistrationSystem((int) 'a');
        java.lang.Class<?> wildcardClass28 = register0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test3428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest6.test3428");
        Register register0 = new Register();
        register0.runRegistrationSystem((int) '#');
        register0.runRegistrationSystem((int) (short) 100);
        register0.runRegistrationSystem((int) (byte) 100);
        register0.runRegistrationSystem(100);
        java.lang.Class<?> wildcardClass9 = register0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test3429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest6.test3429");
        Register register0 = new Register();
        register0.loginUser("hi!", "hi!");
        register0.registerUser("hi!", "hi!");
        register0.loginUser("", "");
        register0.loginUser("hi!", "");
        register0.runRegistrationSystem((int) (short) 10);
        register0.loginUser("", "");
        register0.runRegistrationSystem((int) (byte) 100);
        register0.loginUser("", "hi!");
        register0.runRegistrationSystem((int) (byte) 10);
        register0.loginUser("", "hi!");
    }

    @Test
    public void test3430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest6.test3430");
        Register register0 = new Register();
        register0.loginUser("hi!", "hi!");
        register0.registerUser("hi!", "");
        register0.registerUser("", "");
        register0.registerUser("hi!", "");
        register0.registerUser("hi!", "");
        register0.runRegistrationSystem((int) (short) 10);
        register0.loginUser("", "");
        register0.registerUser("hi!", "hi!");
    }

    @Test
    public void test3431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest6.test3431");
        Register register0 = new Register();
        register0.runRegistrationSystem((int) (byte) -1);
        register0.registerUser("hi!", "");
        register0.loginUser("hi!", "hi!");
        register0.runRegistrationSystem((int) (byte) 1);
        register0.loginUser("hi!", "");
        register0.runRegistrationSystem((int) (short) 10);
        register0.loginUser("hi!", "");
        register0.runRegistrationSystem((int) (byte) 100);
    }

    @Test
    public void test3432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest6.test3432");
        Register register0 = new Register();
        register0.runRegistrationSystem((int) (short) 0);
        register0.loginUser("hi!", "hi!");
        register0.registerUser("", "");
        register0.runRegistrationSystem((int) '#');
        register0.registerUser("", "hi!");
        register0.registerUser("", "hi!");
        register0.registerUser("hi!", "hi!");
        register0.registerUser("hi!", "hi!");
        register0.registerUser("", "hi!");
        register0.registerUser("", "hi!");
        register0.runRegistrationSystem((int) (short) 10);
    }

    @Test
    public void test3433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest6.test3433");
        Register register0 = new Register();
        register0.runRegistrationSystem((int) (byte) -1);
        register0.registerUser("hi!", "");
        register0.loginUser("hi!", "hi!");
        register0.loginUser("", "");
        register0.registerUser("", "");
    }

    @Test
    public void test3434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest6.test3434");
        Register register0 = new Register();
        register0.runRegistrationSystem((int) '#');
        register0.registerUser("", "hi!");
        register0.runRegistrationSystem((int) (short) 0);
        register0.runRegistrationSystem((int) (byte) 1);
        register0.runRegistrationSystem((int) 'a');
        register0.registerUser("hi!", "hi!");
        register0.registerUser("", "");
        register0.registerUser("", "hi!");
        register0.loginUser("hi!", "");
        register0.loginUser("", "hi!");
    }

    @Test
    public void test3435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest6.test3435");
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
        register0.runRegistrationSystem((int) (short) 1);
        java.lang.Class<?> wildcardClass28 = register0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test3436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest6.test3436");
        Register register0 = new Register();
        register0.runRegistrationSystem((int) '#');
        register0.registerUser("", "hi!");
        register0.registerUser("", "hi!");
        register0.registerUser("", "");
        register0.runRegistrationSystem((int) (byte) 10);
        register0.runRegistrationSystem((int) (short) 100);
        register0.runRegistrationSystem((int) (short) 1);
        register0.registerUser("", "");
        register0.registerUser("", "hi!");
        java.lang.Class<?> wildcardClass24 = register0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test3437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest6.test3437");
        Register register0 = new Register();
        register0.runRegistrationSystem((int) (byte) -1);
        register0.runRegistrationSystem((int) (short) 10);
        register0.loginUser("hi!", "hi!");
        register0.runRegistrationSystem((int) (short) 100);
    }

    @Test
    public void test3438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest6.test3438");
        Register register0 = new Register();
        register0.loginUser("hi!", "hi!");
        register0.registerUser("hi!", "");
        register0.loginUser("hi!", "hi!");
        register0.runRegistrationSystem(100);
        register0.registerUser("hi!", "");
        register0.registerUser("", "");
        register0.runRegistrationSystem(10);
        register0.loginUser("", "");
        register0.loginUser("", "");
    }

    @Test
    public void test3439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest6.test3439");
        Register register0 = new Register();
        register0.registerUser("hi!", "");
        register0.loginUser("", "");
        register0.runRegistrationSystem((int) 'a');
        register0.loginUser("", "");
        register0.runRegistrationSystem(10);
    }

    @Test
    public void test3440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest6.test3440");
        Register register0 = new Register();
        register0.registerUser("hi!", "");
        register0.registerUser("hi!", "");
        register0.runRegistrationSystem((int) (byte) 0);
        register0.runRegistrationSystem((int) (short) 10);
        register0.registerUser("", "");
        register0.registerUser("", "hi!");
        register0.registerUser("hi!", "hi!");
    }

    @Test
    public void test3441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest6.test3441");
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
        register0.registerUser("hi!", "hi!");
    }

    @Test
    public void test3442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest6.test3442");
        Register register0 = new Register();
        register0.registerUser("", "");
        register0.registerUser("", "hi!");
        register0.registerUser("", "");
        register0.loginUser("hi!", "");
        register0.registerUser("", "hi!");
        register0.registerUser("hi!", "");
        register0.runRegistrationSystem((int) (short) 100);
        register0.loginUser("hi!", "");
    }

    @Test
    public void test3443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest6.test3443");
        Register register0 = new Register();
        register0.runRegistrationSystem((int) (short) 0);
        register0.loginUser("hi!", "hi!");
        register0.loginUser("", "");
        register0.registerUser("hi!", "");
        register0.registerUser("hi!", "hi!");
        register0.runRegistrationSystem((int) (byte) 1);
        register0.runRegistrationSystem((int) (byte) 0);
        register0.runRegistrationSystem((int) (short) 100);
        register0.registerUser("hi!", "hi!");
    }

    @Test
    public void test3444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest6.test3444");
        Register register0 = new Register();
        register0.runRegistrationSystem((int) (short) 0);
        register0.loginUser("hi!", "hi!");
        register0.registerUser("", "");
        register0.runRegistrationSystem((int) '#');
        register0.registerUser("", "hi!");
        register0.loginUser("", "");
        register0.loginUser("hi!", "hi!");
        java.lang.Class<?> wildcardClass20 = register0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test3445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest6.test3445");
        Register register0 = new Register();
        register0.runRegistrationSystem((int) (short) 0);
        register0.loginUser("hi!", "hi!");
        register0.registerUser("", "");
        register0.runRegistrationSystem((int) '#');
        register0.runRegistrationSystem((int) '#');
        register0.loginUser("hi!", "");
        register0.runRegistrationSystem((int) (short) 0);
        register0.loginUser("hi!", "hi!");
        java.lang.Class<?> wildcardClass21 = register0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test3446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest6.test3446");
        Register register0 = new Register();
        register0.runRegistrationSystem((int) (short) 0);
        register0.loginUser("hi!", "hi!");
        register0.registerUser("", "");
        register0.runRegistrationSystem((int) '#');
        register0.registerUser("", "hi!");
        register0.registerUser("", "hi!");
        register0.registerUser("", "");
        register0.loginUser("hi!", "");
        register0.registerUser("", "hi!");
        register0.runRegistrationSystem((int) (byte) -1);
        register0.loginUser("hi!", "");
        register0.runRegistrationSystem((int) (byte) 10);
        register0.loginUser("hi!", "");
        java.lang.Class<?> wildcardClass36 = register0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass36);
    }

    @Test
    public void test3447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest6.test3447");
        Register register0 = new Register();
        register0.runRegistrationSystem((int) (byte) -1);
        register0.registerUser("hi!", "");
        register0.registerUser("hi!", "hi!");
        register0.runRegistrationSystem(0);
        register0.registerUser("", "");
    }

    @Test
    public void test3448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest6.test3448");
        Register register0 = new Register();
        register0.registerUser("hi!", "");
        register0.runRegistrationSystem(1);
        register0.registerUser("", "");
        register0.runRegistrationSystem((int) (short) 10);
        register0.runRegistrationSystem((int) (byte) 10);
    }

    @Test
    public void test3449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest6.test3449");
        Register register0 = new Register();
        register0.loginUser("hi!", "hi!");
        register0.registerUser("hi!", "");
        register0.loginUser("hi!", "hi!");
        register0.runRegistrationSystem(100);
        register0.registerUser("hi!", "");
        register0.runRegistrationSystem((int) (short) -1);
        register0.registerUser("", "");
        register0.runRegistrationSystem((int) (short) 10);
    }

    @Test
    public void test3450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest6.test3450");
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
        register0.loginUser("", "hi!");
        register0.runRegistrationSystem((int) (short) 0);
    }

    @Test
    public void test3451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest6.test3451");
        Register register0 = new Register();
        register0.registerUser("", "");
        register0.registerUser("", "hi!");
        register0.registerUser("", "");
        register0.registerUser("hi!", "hi!");
        register0.runRegistrationSystem(0);
    }

    @Test
    public void test3452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest6.test3452");
        Register register0 = new Register();
        register0.loginUser("hi!", "hi!");
        register0.runRegistrationSystem(0);
        register0.runRegistrationSystem(10);
        register0.runRegistrationSystem((int) (byte) 100);
        register0.loginUser("hi!", "");
    }

    @Test
    public void test3453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest6.test3453");
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
        register0.loginUser("hi!", "");
        register0.loginUser("hi!", "hi!");
        register0.runRegistrationSystem((int) ' ');
        register0.runRegistrationSystem((int) (byte) 10);
    }

    @Test
    public void test3454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest6.test3454");
        Register register0 = new Register();
        register0.loginUser("hi!", "hi!");
        register0.runRegistrationSystem(0);
        register0.registerUser("", "");
        register0.loginUser("", "hi!");
        register0.runRegistrationSystem((int) ' ');
        register0.registerUser("", "hi!");
        register0.loginUser("", "");
    }

    @Test
    public void test3455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest6.test3455");
        Register register0 = new Register();
        register0.runRegistrationSystem((int) (short) 0);
        register0.loginUser("hi!", "hi!");
        register0.registerUser("", "");
        register0.runRegistrationSystem((-1));
        register0.runRegistrationSystem((int) (short) 10);
        register0.runRegistrationSystem(0);
        register0.registerUser("", "hi!");
        register0.runRegistrationSystem((-1));
    }

    @Test
    public void test3456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest6.test3456");
        Register register0 = new Register();
        register0.registerUser("hi!", "");
        register0.runRegistrationSystem(1);
        register0.registerUser("", "");
        register0.registerUser("hi!", "");
        register0.runRegistrationSystem((int) '4');
        register0.registerUser("hi!", "hi!");
    }

    @Test
    public void test3457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest6.test3457");
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
        register0.loginUser("", "hi!");
        register0.runRegistrationSystem((int) (byte) 100);
    }

    @Test
    public void test3458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest6.test3458");
        Register register0 = new Register();
        register0.registerUser("hi!", "");
        register0.registerUser("hi!", "");
        register0.loginUser("hi!", "");
        register0.loginUser("hi!", "");
        register0.runRegistrationSystem(10);
        register0.runRegistrationSystem((int) (byte) 10);
    }

    @Test
    public void test3459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest6.test3459");
        Register register0 = new Register();
        register0.loginUser("", "hi!");
        register0.registerUser("", "");
        register0.runRegistrationSystem((int) ' ');
        register0.registerUser("hi!", "");
        register0.registerUser("", "hi!");
    }

    @Test
    public void test3460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest6.test3460");
        Register register0 = new Register();
        register0.runRegistrationSystem((int) (byte) -1);
        register0.registerUser("hi!", "");
        register0.runRegistrationSystem((int) (short) 1);
        register0.runRegistrationSystem((int) 'a');
        register0.registerUser("", "");
        register0.loginUser("hi!", "");
        register0.runRegistrationSystem((int) (short) 100);
        register0.runRegistrationSystem((int) (byte) -1);
    }

    @Test
    public void test3461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest6.test3461");
        Register register0 = new Register();
        register0.loginUser("hi!", "hi!");
        register0.registerUser("hi!", "");
        register0.registerUser("", "");
        register0.registerUser("", "hi!");
        register0.runRegistrationSystem((int) (short) 100);
        register0.registerUser("", "hi!");
        java.lang.Class<?> wildcardClass18 = register0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test3462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest6.test3462");
        Register register0 = new Register();
        register0.runRegistrationSystem((int) '#');
        register0.registerUser("", "hi!");
        register0.runRegistrationSystem((int) (short) 0);
        register0.runRegistrationSystem((int) (byte) 1);
        register0.registerUser("", "");
        register0.runRegistrationSystem((int) (short) 10);
        register0.runRegistrationSystem((int) (short) -1);
        register0.registerUser("hi!", "hi!");
        java.lang.Class<?> wildcardClass20 = register0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test3463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest6.test3463");
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
        register0.loginUser("", "hi!");
        java.lang.Class<?> wildcardClass30 = register0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass30);
    }

    @Test
    public void test3464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest6.test3464");
        Register register0 = new Register();
        register0.runRegistrationSystem((int) (byte) -1);
        register0.runRegistrationSystem((int) (short) 10);
        register0.runRegistrationSystem((int) (byte) 100);
        register0.runRegistrationSystem(10);
        register0.registerUser("", "hi!");
        register0.runRegistrationSystem(0);
        register0.runRegistrationSystem((int) (short) 10);
    }

    @Test
    public void test3465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest6.test3465");
        Register register0 = new Register();
        register0.runRegistrationSystem((int) (byte) -1);
        register0.registerUser("hi!", "");
        register0.registerUser("", "hi!");
        register0.loginUser("hi!", "hi!");
        register0.registerUser("hi!", "hi!");
        register0.runRegistrationSystem((int) (short) 0);
        register0.registerUser("", "");
        register0.runRegistrationSystem((int) '4');
    }

    @Test
    public void test3466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest6.test3466");
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
        register0.loginUser("hi!", "hi!");
        register0.registerUser("", "hi!");
        register0.loginUser("", "hi!");
        register0.runRegistrationSystem((-1));
    }

    @Test
    public void test3467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest6.test3467");
        Register register0 = new Register();
        register0.registerUser("hi!", "");
        register0.registerUser("hi!", "");
        register0.loginUser("hi!", "");
        register0.loginUser("hi!", "");
        register0.runRegistrationSystem(10);
        register0.registerUser("", "");
        register0.registerUser("hi!", "hi!");
        register0.loginUser("hi!", "hi!");
        register0.loginUser("", "");
        register0.loginUser("", "");
        register0.registerUser("", "");
    }

    @Test
    public void test3468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest6.test3468");
        Register register0 = new Register();
        register0.runRegistrationSystem((int) (short) 0);
        register0.loginUser("hi!", "hi!");
        register0.registerUser("", "");
        register0.runRegistrationSystem((-1));
        register0.registerUser("", "");
        register0.loginUser("hi!", "hi!");
        register0.registerUser("hi!", "hi!");
    }

    @Test
    public void test3469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest6.test3469");
        Register register0 = new Register();
        register0.registerUser("hi!", "");
        register0.loginUser("", "hi!");
        register0.runRegistrationSystem((int) 'a');
        register0.loginUser("", "hi!");
        register0.loginUser("", "hi!");
        register0.runRegistrationSystem((int) ' ');
        register0.registerUser("hi!", "hi!");
        register0.runRegistrationSystem(100);
        register0.registerUser("hi!", "hi!");
        register0.runRegistrationSystem(10);
        register0.loginUser("", "hi!");
    }

    @Test
    public void test3470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest6.test3470");
        Register register0 = new Register();
        register0.runRegistrationSystem((int) '#');
        register0.registerUser("", "hi!");
        register0.loginUser("hi!", "hi!");
        register0.runRegistrationSystem((int) (short) 10);
        register0.runRegistrationSystem(100);
        register0.registerUser("", "");
        register0.registerUser("hi!", "");
    }

    @Test
    public void test3471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest6.test3471");
        Register register0 = new Register();
        register0.runRegistrationSystem((int) (short) 0);
        register0.loginUser("hi!", "hi!");
        register0.registerUser("", "");
        register0.runRegistrationSystem((-1));
        register0.runRegistrationSystem((int) (short) 10);
        register0.runRegistrationSystem(10);
        register0.registerUser("hi!", "");
        register0.runRegistrationSystem((-1));
        register0.registerUser("", "");
        register0.registerUser("hi!", "");
        register0.runRegistrationSystem((int) (short) 100);
        register0.registerUser("", "");
    }

    @Test
    public void test3472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest6.test3472");
        Register register0 = new Register();
        register0.registerUser("hi!", "");
        register0.loginUser("", "hi!");
        register0.runRegistrationSystem((int) (byte) -1);
        register0.loginUser("", "");
        register0.runRegistrationSystem((int) (short) 100);
        register0.runRegistrationSystem(0);
        register0.runRegistrationSystem((int) 'a');
        register0.loginUser("", "hi!");
        register0.runRegistrationSystem((int) (short) 100);
    }

    @Test
    public void test3473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest6.test3473");
        Register register0 = new Register();
        register0.registerUser("hi!", "");
        register0.loginUser("", "");
        register0.runRegistrationSystem((int) 'a');
        register0.registerUser("", "");
        register0.registerUser("hi!", "hi!");
        register0.registerUser("", "");
        register0.registerUser("hi!", "");
        register0.runRegistrationSystem(1);
        register0.loginUser("", "");
    }

    @Test
    public void test3474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest6.test3474");
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
        register0.loginUser("hi!", "hi!");
        register0.loginUser("", "");
        register0.runRegistrationSystem((int) (short) 100);
        register0.runRegistrationSystem(0);
    }

    @Test
    public void test3475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest6.test3475");
        Register register0 = new Register();
        register0.registerUser("hi!", "");
        register0.loginUser("", "hi!");
        register0.runRegistrationSystem((int) 'a');
        register0.loginUser("", "hi!");
        register0.loginUser("hi!", "");
        register0.loginUser("hi!", "hi!");
        register0.runRegistrationSystem(0);
        register0.runRegistrationSystem((int) 'a');
        register0.registerUser("", "hi!");
        register0.registerUser("", "hi!");
    }

    @Test
    public void test3476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest6.test3476");
        Register register0 = new Register();
        register0.registerUser("hi!", "");
        register0.runRegistrationSystem(1);
        register0.registerUser("", "");
        register0.registerUser("hi!", "");
        register0.registerUser("hi!", "hi!");
        register0.loginUser("hi!", "");
        register0.runRegistrationSystem((int) (byte) 1);
    }

    @Test
    public void test3477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest6.test3477");
        Register register0 = new Register();
        register0.runRegistrationSystem((int) (byte) -1);
        register0.runRegistrationSystem((int) (byte) 10);
        register0.registerUser("", "");
        register0.loginUser("", "");
        register0.runRegistrationSystem((int) (byte) 0);
        register0.loginUser("", "");
        register0.loginUser("", "");
    }

    @Test
    public void test3478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest6.test3478");
        Register register0 = new Register();
        register0.runRegistrationSystem((int) (byte) -1);
        register0.runRegistrationSystem((int) '#');
        java.lang.Class<?> wildcardClass5 = register0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test3479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest6.test3479");
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
        register0.runRegistrationSystem((int) (short) 0);
    }

    @Test
    public void test3480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest6.test3480");
        Register register0 = new Register();
        register0.registerUser("hi!", "");
        register0.loginUser("", "hi!");
        register0.runRegistrationSystem((int) 'a');
        register0.loginUser("", "hi!");
        register0.loginUser("hi!", "");
        register0.registerUser("hi!", "hi!");
        register0.registerUser("", "hi!");
        java.lang.Class<?> wildcardClass21 = register0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test3481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest6.test3481");
        Register register0 = new Register();
        register0.runRegistrationSystem((int) (short) 0);
        register0.loginUser("hi!", "hi!");
        register0.registerUser("", "");
        register0.runRegistrationSystem((int) '#');
        register0.runRegistrationSystem((int) '#');
        register0.loginUser("", "hi!");
        register0.loginUser("", "");
    }

    @Test
    public void test3482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest6.test3482");
        Register register0 = new Register();
        register0.runRegistrationSystem((int) (byte) -1);
        register0.registerUser("hi!", "");
        register0.loginUser("hi!", "hi!");
        register0.loginUser("hi!", "");
        register0.registerUser("hi!", "");
        register0.registerUser("hi!", "hi!");
        register0.registerUser("", "hi!");
        register0.loginUser("", "hi!");
        register0.loginUser("", "hi!");
        register0.runRegistrationSystem((int) '4');
        register0.runRegistrationSystem((int) (byte) 10);
        register0.registerUser("", "hi!");
        register0.runRegistrationSystem((int) (short) -1);
    }

    @Test
    public void test3483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest6.test3483");
        Register register0 = new Register();
        register0.registerUser("hi!", "");
        register0.loginUser("", "hi!");
        register0.runRegistrationSystem((int) 'a');
        register0.loginUser("hi!", "");
        register0.runRegistrationSystem((-1));
        register0.registerUser("hi!", "");
        register0.loginUser("", "hi!");
        register0.runRegistrationSystem(100);
        register0.loginUser("", "hi!");
        register0.runRegistrationSystem((int) 'a');
        register0.loginUser("hi!", "hi!");
    }

    @Test
    public void test3484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest6.test3484");
        Register register0 = new Register();
        register0.runRegistrationSystem((int) (short) 0);
        register0.loginUser("hi!", "hi!");
        register0.registerUser("", "");
        register0.runRegistrationSystem((int) '#');
        register0.runRegistrationSystem((int) '#');
        register0.loginUser("hi!", "");
        register0.runRegistrationSystem((int) (short) 0);
        register0.runRegistrationSystem(0);
        register0.runRegistrationSystem(0);
    }

    @Test
    public void test3485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest6.test3485");
        Register register0 = new Register();
        register0.runRegistrationSystem((int) '#');
        register0.registerUser("", "hi!");
        register0.loginUser("hi!", "hi!");
        register0.runRegistrationSystem((int) (short) 10);
        register0.loginUser("", "");
        register0.registerUser("", "hi!");
        register0.loginUser("hi!", "hi!");
    }

    @Test
    public void test3486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest6.test3486");
        Register register0 = new Register();
        register0.registerUser("hi!", "");
        register0.loginUser("", "hi!");
        register0.runRegistrationSystem(0);
        register0.registerUser("hi!", "hi!");
        register0.runRegistrationSystem((int) ' ');
    }

    @Test
    public void test3487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest6.test3487");
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
        register0.registerUser("", "");
        register0.registerUser("", "hi!");
    }
}

