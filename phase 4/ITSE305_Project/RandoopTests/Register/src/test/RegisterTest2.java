import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegisterTest2 {

    public static boolean debug = false;

    @Test
    public void test1001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest2.test1001");
        Register register0 = new Register();
        register0.loginUser("hi!", "hi!");
        register0.registerUser("hi!", "");
        register0.registerUser("hi!", "");
        register0.registerUser("", "hi!");
        register0.loginUser("", "");
        register0.runRegistrationSystem((int) (short) -1);
        register0.runRegistrationSystem((int) '#');
        java.lang.Class<?> wildcardClass20 = register0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test1002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest2.test1002");
        Register register0 = new Register();
        register0.runRegistrationSystem((int) '#');
        register0.registerUser("", "hi!");
        register0.runRegistrationSystem((int) (short) 0);
        register0.loginUser("hi!", "hi!");
        register0.registerUser("", "hi!");
        register0.runRegistrationSystem((int) (byte) -1);
        register0.runRegistrationSystem((int) (byte) -1);
        register0.registerUser("hi!", "");
        register0.runRegistrationSystem((int) (byte) 100);
        java.lang.Class<?> wildcardClass23 = register0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test1003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest2.test1003");
        Register register0 = new Register();
        register0.runRegistrationSystem((int) (byte) -1);
        register0.runRegistrationSystem((int) '#');
        register0.loginUser("", "");
        register0.runRegistrationSystem((int) (short) 0);
        register0.runRegistrationSystem(100);
    }

    @Test
    public void test1004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest2.test1004");
        Register register0 = new Register();
        register0.loginUser("hi!", "hi!");
        register0.loginUser("hi!", "hi!");
        register0.registerUser("", "");
        java.lang.Class<?> wildcardClass10 = register0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test1005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest2.test1005");
        Register register0 = new Register();
        register0.registerUser("hi!", "");
        register0.registerUser("hi!", "");
        register0.runRegistrationSystem((int) (byte) 0);
        register0.registerUser("", "");
        register0.runRegistrationSystem(0);
    }

    @Test
    public void test1006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest2.test1006");
        Register register0 = new Register();
        register0.runRegistrationSystem((int) '#');
        register0.runRegistrationSystem((int) (short) 100);
        register0.runRegistrationSystem((int) '4');
        register0.loginUser("hi!", "");
        register0.registerUser("hi!", "hi!");
        register0.loginUser("", "");
        java.lang.Class<?> wildcardClass16 = register0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test1007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest2.test1007");
        Register register0 = new Register();
        register0.loginUser("hi!", "hi!");
        register0.registerUser("hi!", "");
        register0.registerUser("", "");
        register0.registerUser("", "hi!");
        register0.runRegistrationSystem((int) (short) 100);
        register0.runRegistrationSystem((int) (byte) 1);
        register0.loginUser("", "");
        register0.registerUser("hi!", "");
        register0.loginUser("", "hi!");
        register0.runRegistrationSystem((int) (byte) 1);
        java.lang.Class<?> wildcardClass28 = register0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test1008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest2.test1008");
        Register register0 = new Register();
        register0.runRegistrationSystem((int) '#');
        register0.loginUser("hi!", "hi!");
        register0.runRegistrationSystem((int) (byte) 10);
        register0.loginUser("", "");
        register0.runRegistrationSystem((int) (byte) 0);
    }

    @Test
    public void test1009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest2.test1009");
        Register register0 = new Register();
        register0.loginUser("hi!", "hi!");
        register0.runRegistrationSystem(0);
        register0.registerUser("", "");
        register0.registerUser("", "hi!");
        register0.loginUser("hi!", "");
        register0.registerUser("hi!", "");
        register0.runRegistrationSystem((int) (byte) -1);
        register0.loginUser("hi!", "hi!");
    }

    @Test
    public void test1010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest2.test1010");
        Register register0 = new Register();
        register0.loginUser("hi!", "hi!");
        register0.runRegistrationSystem(0);
        register0.registerUser("", "");
        register0.runRegistrationSystem((-1));
        register0.loginUser("", "");
        register0.loginUser("hi!", "");
    }

    @Test
    public void test1011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest2.test1011");
        Register register0 = new Register();
        register0.runRegistrationSystem((int) (byte) -1);
        register0.runRegistrationSystem((int) (byte) 10);
        register0.registerUser("", "");
        register0.loginUser("", "");
        register0.registerUser("", "hi!");
        register0.registerUser("hi!", "");
        register0.loginUser("hi!", "hi!");
        register0.loginUser("", "hi!");
        register0.registerUser("", "hi!");
        register0.registerUser("", "hi!");
        register0.registerUser("", "hi!");
        java.lang.Class<?> wildcardClass32 = register0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass32);
    }

    @Test
    public void test1012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest2.test1012");
        Register register0 = new Register();
        register0.registerUser("hi!", "");
        register0.registerUser("hi!", "");
        register0.loginUser("hi!", "");
        register0.loginUser("hi!", "");
        register0.runRegistrationSystem(10);
        register0.registerUser("", "");
        register0.registerUser("hi!", "hi!");
        register0.registerUser("", "hi!");
        register0.loginUser("", "");
        register0.loginUser("", "");
        java.lang.Class<?> wildcardClass30 = register0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass30);
    }

    @Test
    public void test1013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest2.test1013");
        Register register0 = new Register();
        register0.runRegistrationSystem((int) (byte) -1);
        register0.runRegistrationSystem((int) (byte) 10);
        register0.loginUser("", "hi!");
        register0.runRegistrationSystem(1);
    }

    @Test
    public void test1014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest2.test1014");
        Register register0 = new Register();
        register0.runRegistrationSystem((int) (byte) -1);
        register0.runRegistrationSystem((int) (short) 10);
        register0.runRegistrationSystem((int) (byte) -1);
        register0.runRegistrationSystem(10);
        register0.loginUser("", "hi!");
        register0.loginUser("", "");
    }

    @Test
    public void test1015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest2.test1015");
        Register register0 = new Register();
        register0.runRegistrationSystem((int) '#');
        register0.loginUser("hi!", "hi!");
        register0.loginUser("hi!", "hi!");
        register0.loginUser("hi!", "");
        register0.loginUser("", "hi!");
        register0.runRegistrationSystem((int) '#');
        register0.runRegistrationSystem((int) (byte) -1);
    }

    @Test
    public void test1016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest2.test1016");
        Register register0 = new Register();
        register0.runRegistrationSystem((int) (byte) -1);
        register0.runRegistrationSystem((int) (short) 10);
        register0.registerUser("", "hi!");
        register0.runRegistrationSystem(0);
        register0.runRegistrationSystem((int) (short) 0);
        register0.runRegistrationSystem((int) (short) -1);
        java.lang.Class<?> wildcardClass14 = register0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test1017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest2.test1017");
        Register register0 = new Register();
        register0.runRegistrationSystem((int) (short) 0);
        register0.loginUser("hi!", "hi!");
        register0.registerUser("", "");
        register0.runRegistrationSystem((-1));
        register0.runRegistrationSystem((int) (short) 0);
        register0.registerUser("", "");
        register0.loginUser("hi!", "hi!");
        register0.runRegistrationSystem((int) (byte) 100);
        register0.registerUser("hi!", "");
    }

    @Test
    public void test1018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest2.test1018");
        Register register0 = new Register();
        register0.registerUser("hi!", "");
        register0.registerUser("hi!", "");
        register0.loginUser("hi!", "");
        register0.loginUser("hi!", "");
        register0.registerUser("", "");
        register0.runRegistrationSystem(0);
    }

    @Test
    public void test1019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest2.test1019");
        Register register0 = new Register();
        register0.loginUser("hi!", "hi!");
        register0.loginUser("hi!", "hi!");
        register0.loginUser("hi!", "");
        java.lang.Class<?> wildcardClass10 = register0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test1020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest2.test1020");
        Register register0 = new Register();
        register0.runRegistrationSystem((int) (byte) -1);
        register0.runRegistrationSystem((int) (byte) 10);
        register0.registerUser("", "");
        register0.loginUser("", "");
        register0.registerUser("", "hi!");
        register0.registerUser("hi!", "");
        register0.runRegistrationSystem((int) (short) 100);
        register0.registerUser("", "");
        java.lang.Class<?> wildcardClass22 = register0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test1021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest2.test1021");
        Register register0 = new Register();
        register0.runRegistrationSystem((int) (byte) -1);
        register0.runRegistrationSystem((int) '#');
        register0.registerUser("hi!", "hi!");
        register0.registerUser("", "hi!");
    }

    @Test
    public void test1022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest2.test1022");
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
        java.lang.Class<?> wildcardClass28 = register0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test1023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest2.test1023");
        Register register0 = new Register();
        register0.runRegistrationSystem((int) (byte) -1);
        register0.runRegistrationSystem((int) (byte) 10);
        register0.registerUser("", "");
        register0.loginUser("", "");
        register0.runRegistrationSystem((int) (byte) 0);
        register0.runRegistrationSystem((int) (byte) -1);
        register0.registerUser("hi!", "");
        java.lang.Class<?> wildcardClass18 = register0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test1024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest2.test1024");
        Register register0 = new Register();
        register0.registerUser("hi!", "");
        register0.registerUser("hi!", "");
        register0.loginUser("hi!", "");
        register0.registerUser("", "hi!");
        register0.registerUser("hi!", "");
        register0.loginUser("", "hi!");
        register0.runRegistrationSystem(10);
    }

    @Test
    public void test1025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest2.test1025");
        Register register0 = new Register();
        register0.runRegistrationSystem((int) '#');
        register0.registerUser("", "hi!");
        register0.runRegistrationSystem((int) (short) 0);
        register0.runRegistrationSystem((int) (byte) 1);
        register0.registerUser("", "");
        register0.runRegistrationSystem((int) (short) 10);
        register0.registerUser("hi!", "");
        register0.registerUser("", "");
        register0.runRegistrationSystem((int) '#');
    }

    @Test
    public void test1026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest2.test1026");
        Register register0 = new Register();
        register0.runRegistrationSystem((int) '#');
        register0.runRegistrationSystem((int) (short) 100);
        register0.runRegistrationSystem((int) '4');
        register0.loginUser("hi!", "");
        java.lang.Class<?> wildcardClass10 = register0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test1027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest2.test1027");
        Register register0 = new Register();
        register0.registerUser("hi!", "");
        register0.loginUser("", "hi!");
        register0.runRegistrationSystem((int) 'a');
        register0.loginUser("", "hi!");
        register0.loginUser("hi!", "");
        register0.loginUser("hi!", "hi!");
        register0.runRegistrationSystem(0);
        register0.loginUser("", "");
        register0.registerUser("hi!", "");
        register0.registerUser("hi!", "");
        register0.loginUser("", "");
    }

    @Test
    public void test1028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest2.test1028");
        Register register0 = new Register();
        register0.runRegistrationSystem((int) (short) 0);
        register0.loginUser("hi!", "hi!");
        register0.registerUser("", "");
        register0.runRegistrationSystem((-1));
        register0.registerUser("", "hi!");
        register0.loginUser("hi!", "");
    }

    @Test
    public void test1029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest2.test1029");
        Register register0 = new Register();
        register0.runRegistrationSystem((int) (byte) -1);
        register0.loginUser("", "hi!");
        register0.runRegistrationSystem((int) (byte) 100);
    }

    @Test
    public void test1030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest2.test1030");
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
        register0.runRegistrationSystem(0);
        register0.runRegistrationSystem((int) (short) 1);
        register0.runRegistrationSystem((int) (byte) -1);
    }

    @Test
    public void test1031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest2.test1031");
        Register register0 = new Register();
        register0.registerUser("hi!", "");
        register0.loginUser("", "hi!");
        register0.loginUser("", "hi!");
        register0.runRegistrationSystem(10);
        register0.loginUser("", "");
        register0.loginUser("", "hi!");
        register0.runRegistrationSystem(10);
    }

    @Test
    public void test1032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest2.test1032");
        Register register0 = new Register();
        register0.registerUser("hi!", "");
        register0.loginUser("", "");
        register0.runRegistrationSystem((int) 'a');
        register0.registerUser("", "");
        register0.registerUser("hi!", "hi!");
        register0.loginUser("", "hi!");
        register0.runRegistrationSystem((int) (short) 100);
    }

    @Test
    public void test1033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest2.test1033");
        Register register0 = new Register();
        register0.runRegistrationSystem((int) (byte) -1);
        register0.registerUser("hi!", "");
        register0.loginUser("hi!", "hi!");
        register0.loginUser("hi!", "");
        register0.runRegistrationSystem((int) (byte) -1);
        register0.loginUser("hi!", "");
        register0.loginUser("hi!", "");
        register0.registerUser("hi!", "");
        java.lang.Class<?> wildcardClass23 = register0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test1034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest2.test1034");
        Register register0 = new Register();
        register0.loginUser("hi!", "hi!");
        register0.runRegistrationSystem(0);
        register0.loginUser("hi!", "");
        register0.runRegistrationSystem((int) '4');
    }

    @Test
    public void test1035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest2.test1035");
        Register register0 = new Register();
        register0.registerUser("hi!", "");
        register0.registerUser("hi!", "");
        register0.runRegistrationSystem((int) (byte) -1);
        register0.registerUser("hi!", "");
        register0.loginUser("", "hi!");
        register0.runRegistrationSystem((int) (byte) 1);
    }

    @Test
    public void test1036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest2.test1036");
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
        register0.runRegistrationSystem((int) (short) 0);
        java.lang.Class<?> wildcardClass31 = register0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test1037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest2.test1037");
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
        register0.runRegistrationSystem((int) (short) -1);
        register0.loginUser("", "hi!");
        register0.loginUser("hi!", "");
    }

    @Test
    public void test1038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest2.test1038");
        Register register0 = new Register();
        register0.runRegistrationSystem((int) (byte) -1);
        register0.registerUser("hi!", "");
        register0.runRegistrationSystem((int) (byte) -1);
        register0.loginUser("hi!", "hi!");
        register0.registerUser("", "");
        register0.registerUser("hi!", "hi!");
        register0.registerUser("", "hi!");
    }

    @Test
    public void test1039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest2.test1039");
        Register register0 = new Register();
        register0.loginUser("hi!", "hi!");
        register0.registerUser("hi!", "");
        register0.registerUser("", "");
        register0.registerUser("hi!", "");
        register0.runRegistrationSystem((int) (byte) 0);
        register0.registerUser("", "");
        register0.loginUser("", "");
        register0.registerUser("hi!", "");
        java.lang.Class<?> wildcardClass24 = register0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test1040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest2.test1040");
        Register register0 = new Register();
        register0.loginUser("hi!", "hi!");
        register0.registerUser("hi!", "hi!");
        register0.loginUser("hi!", "hi!");
        register0.runRegistrationSystem(100);
        register0.runRegistrationSystem((int) (byte) 0);
        register0.registerUser("", "hi!");
    }

    @Test
    public void test1041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest2.test1041");
        Register register0 = new Register();
        register0.runRegistrationSystem((int) (short) 0);
        register0.loginUser("hi!", "hi!");
        register0.registerUser("", "");
        register0.runRegistrationSystem((-1));
        register0.runRegistrationSystem((int) (short) 10);
        register0.runRegistrationSystem(10);
        register0.loginUser("hi!", "");
        register0.registerUser("", "hi!");
        java.lang.Class<?> wildcardClass21 = register0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test1042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest2.test1042");
        Register register0 = new Register();
        register0.loginUser("hi!", "hi!");
        register0.registerUser("hi!", "hi!");
        register0.loginUser("", "");
        register0.loginUser("hi!", "");
        register0.runRegistrationSystem((int) (short) 10);
        register0.registerUser("", "");
        register0.registerUser("hi!", "hi!");
    }

    @Test
    public void test1043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest2.test1043");
        Register register0 = new Register();
        register0.runRegistrationSystem((int) '#');
        register0.loginUser("hi!", "hi!");
        register0.loginUser("hi!", "hi!");
        register0.loginUser("hi!", "");
        register0.loginUser("", "");
        register0.runRegistrationSystem((int) (short) 10);
        register0.registerUser("", "hi!");
        register0.loginUser("hi!", "");
        java.lang.Class<?> wildcardClass23 = register0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test1044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest2.test1044");
        Register register0 = new Register();
        register0.registerUser("hi!", "");
        register0.loginUser("", "hi!");
        register0.runRegistrationSystem((int) (byte) -1);
        register0.loginUser("", "");
        register0.runRegistrationSystem((int) (short) 0);
        register0.registerUser("hi!", "");
    }

    @Test
    public void test1045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest2.test1045");
        Register register0 = new Register();
        register0.loginUser("hi!", "hi!");
        register0.runRegistrationSystem(0);
        register0.registerUser("", "");
        register0.loginUser("", "hi!");
        register0.registerUser("", "");
        register0.registerUser("hi!", "hi!");
        register0.loginUser("", "");
    }

    @Test
    public void test1046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest2.test1046");
        Register register0 = new Register();
        register0.loginUser("hi!", "hi!");
        register0.registerUser("hi!", "");
        register0.registerUser("hi!", "");
        register0.registerUser("", "");
        register0.runRegistrationSystem(100);
        register0.runRegistrationSystem((int) (byte) -1);
        register0.registerUser("", "hi!");
    }

    @Test
    public void test1047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest2.test1047");
        Register register0 = new Register();
        register0.runRegistrationSystem((int) (byte) -1);
        register0.registerUser("hi!", "");
        register0.loginUser("hi!", "hi!");
        register0.loginUser("hi!", "");
        register0.loginUser("", "");
        register0.runRegistrationSystem(1);
        register0.registerUser("hi!", "hi!");
        register0.registerUser("hi!", "hi!");
    }

    @Test
    public void test1048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest2.test1048");
        Register register0 = new Register();
        register0.runRegistrationSystem((int) (byte) -1);
        register0.registerUser("hi!", "");
        register0.registerUser("", "");
        register0.registerUser("hi!", "hi!");
    }

    @Test
    public void test1049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest2.test1049");
        Register register0 = new Register();
        register0.runRegistrationSystem((int) (short) 0);
        register0.loginUser("hi!", "hi!");
        register0.registerUser("", "");
        register0.runRegistrationSystem((int) '#');
        register0.registerUser("", "hi!");
        register0.loginUser("", "");
        java.lang.Class<?> wildcardClass17 = register0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test1050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest2.test1050");
        Register register0 = new Register();
        register0.registerUser("hi!", "");
        register0.registerUser("hi!", "");
        register0.loginUser("hi!", "");
        register0.loginUser("hi!", "");
        register0.runRegistrationSystem(10);
        register0.registerUser("", "");
        register0.registerUser("", "");
        register0.registerUser("", "hi!");
        register0.registerUser("hi!", "hi!");
        register0.loginUser("", "hi!");
        register0.runRegistrationSystem((int) (byte) 0);
    }

    @Test
    public void test1051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest2.test1051");
        Register register0 = new Register();
        register0.runRegistrationSystem((int) '#');
        register0.registerUser("", "hi!");
        register0.loginUser("hi!", "");
        register0.registerUser("hi!", "hi!");
    }

    @Test
    public void test1052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest2.test1052");
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
        register0.runRegistrationSystem(1);
    }

    @Test
    public void test1053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest2.test1053");
        Register register0 = new Register();
        register0.runRegistrationSystem((int) (byte) -1);
        register0.registerUser("hi!", "");
        register0.loginUser("hi!", "hi!");
        register0.loginUser("hi!", "hi!");
        register0.loginUser("", "");
        register0.registerUser("hi!", "hi!");
        java.lang.Class<?> wildcardClass18 = register0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test1054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest2.test1054");
        Register register0 = new Register();
        register0.registerUser("hi!", "");
        register0.loginUser("", "hi!");
        register0.runRegistrationSystem((int) (byte) -1);
        register0.runRegistrationSystem(1);
        register0.runRegistrationSystem((int) (short) 10);
    }

    @Test
    public void test1055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest2.test1055");
        Register register0 = new Register();
        register0.registerUser("hi!", "");
        register0.loginUser("", "hi!");
        register0.runRegistrationSystem((int) 'a');
        register0.loginUser("hi!", "");
        register0.runRegistrationSystem((int) (byte) 1);
        register0.loginUser("hi!", "hi!");
        register0.registerUser("hi!", "");
        register0.registerUser("hi!", "");
        register0.loginUser("hi!", "hi!");
    }

    @Test
    public void test1056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest2.test1056");
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
        java.lang.Class<?> wildcardClass24 = register0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test1057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest2.test1057");
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
        register0.runRegistrationSystem((int) 'a');
        register0.runRegistrationSystem((int) (short) 1);
        java.lang.Class<?> wildcardClass43 = register0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass43);
    }

    @Test
    public void test1058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest2.test1058");
        Register register0 = new Register();
        register0.runRegistrationSystem((int) (short) 0);
        register0.loginUser("", "");
    }

    @Test
    public void test1059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest2.test1059");
        Register register0 = new Register();
        register0.runRegistrationSystem((int) (byte) -1);
        register0.registerUser("hi!", "");
        register0.runRegistrationSystem((int) (short) 1);
        register0.loginUser("", "");
        register0.loginUser("", "hi!");
        register0.runRegistrationSystem((int) (short) -1);
        register0.loginUser("hi!", "");
        register0.runRegistrationSystem((int) (byte) 100);
        register0.registerUser("", "");
        register0.registerUser("", "");
        register0.loginUser("", "");
    }

    @Test
    public void test1060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest2.test1060");
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
        java.lang.Class<?> wildcardClass26 = register0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass26);
    }

    @Test
    public void test1061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest2.test1061");
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
        java.lang.Class<?> wildcardClass24 = register0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test1062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest2.test1062");
        Register register0 = new Register();
        register0.runRegistrationSystem((int) (byte) -1);
        register0.runRegistrationSystem((int) (short) 10);
        register0.runRegistrationSystem((int) (byte) -1);
        register0.runRegistrationSystem(10);
        register0.registerUser("", "");
        register0.runRegistrationSystem((-1));
        register0.runRegistrationSystem((int) ' ');
    }

    @Test
    public void test1063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest2.test1063");
        Register register0 = new Register();
        register0.loginUser("hi!", "hi!");
        register0.registerUser("hi!", "");
        register0.registerUser("", "");
        register0.registerUser("", "hi!");
        register0.loginUser("hi!", "hi!");
        register0.loginUser("hi!", "hi!");
        register0.loginUser("", "");
        register0.runRegistrationSystem((int) '#');
    }

    @Test
    public void test1064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest2.test1064");
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
        register0.runRegistrationSystem(10);
    }

    @Test
    public void test1065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest2.test1065");
        Register register0 = new Register();
        register0.loginUser("hi!", "hi!");
        register0.registerUser("hi!", "");
        register0.registerUser("", "");
        register0.registerUser("", "hi!");
        register0.loginUser("", "hi!");
        register0.registerUser("hi!", "hi!");
        register0.loginUser("", "");
        register0.loginUser("hi!", "hi!");
        java.lang.Class<?> wildcardClass25 = register0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test1066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest2.test1066");
        Register register0 = new Register();
        register0.loginUser("hi!", "hi!");
        register0.registerUser("hi!", "");
        register0.registerUser("", "");
        register0.registerUser("", "hi!");
        register0.registerUser("", "");
        register0.loginUser("", "hi!");
        register0.registerUser("", "hi!");
        register0.registerUser("", "");
    }

    @Test
    public void test1067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest2.test1067");
        Register register0 = new Register();
        register0.runRegistrationSystem((int) '#');
        register0.registerUser("", "hi!");
        register0.runRegistrationSystem((int) (short) 0);
        register0.runRegistrationSystem((int) (byte) 1);
        register0.runRegistrationSystem((int) 'a');
        register0.registerUser("", "");
        register0.registerUser("hi!", "hi!");
        register0.loginUser("hi!", "");
        register0.loginUser("", "hi!");
    }

    @Test
    public void test1068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest2.test1068");
        Register register0 = new Register();
        register0.loginUser("hi!", "hi!");
        register0.registerUser("", "");
        register0.loginUser("hi!", "hi!");
        register0.registerUser("hi!", "hi!");
        register0.loginUser("", "hi!");
        register0.registerUser("hi!", "");
        java.lang.Class<?> wildcardClass19 = register0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test1069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest2.test1069");
        Register register0 = new Register();
        register0.runRegistrationSystem((int) (short) 0);
        register0.loginUser("hi!", "hi!");
        register0.registerUser("", "");
        register0.runRegistrationSystem((int) '#');
        register0.runRegistrationSystem((int) (byte) 0);
        register0.runRegistrationSystem(0);
        register0.registerUser("", "hi!");
        java.lang.Class<?> wildcardClass18 = register0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test1070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest2.test1070");
        Register register0 = new Register();
        register0.registerUser("hi!", "");
        register0.loginUser("", "hi!");
        register0.runRegistrationSystem((int) (byte) -1);
        register0.runRegistrationSystem(1);
        register0.loginUser("hi!", "");
        register0.runRegistrationSystem((int) (short) -1);
        register0.registerUser("", "");
        register0.runRegistrationSystem((int) (byte) 1);
        register0.runRegistrationSystem((int) '4');
    }

    @Test
    public void test1071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest2.test1071");
        Register register0 = new Register();
        register0.runRegistrationSystem((int) '#');
        register0.registerUser("", "hi!");
        register0.runRegistrationSystem((int) (short) 0);
        register0.runRegistrationSystem((int) (byte) 1);
        register0.registerUser("", "");
        register0.loginUser("", "");
        register0.runRegistrationSystem(100);
        register0.registerUser("", "");
        register0.runRegistrationSystem((int) (byte) 100);
    }

    @Test
    public void test1072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest2.test1072");
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
        register0.registerUser("", "");
    }

    @Test
    public void test1073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest2.test1073");
        Register register0 = new Register();
        register0.runRegistrationSystem((int) (byte) -1);
        register0.registerUser("hi!", "");
        register0.runRegistrationSystem(0);
        register0.registerUser("hi!", "");
        register0.registerUser("hi!", "hi!");
    }

    @Test
    public void test1074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest2.test1074");
        Register register0 = new Register();
        register0.loginUser("hi!", "hi!");
        register0.registerUser("hi!", "");
        register0.registerUser("hi!", "");
        register0.registerUser("", "");
        register0.runRegistrationSystem(100);
        register0.loginUser("", "");
        register0.runRegistrationSystem((int) (short) 0);
        register0.loginUser("", "hi!");
    }

    @Test
    public void test1075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest2.test1075");
        Register register0 = new Register();
        register0.loginUser("hi!", "hi!");
        register0.registerUser("hi!", "");
        register0.registerUser("", "");
        register0.registerUser("hi!", "");
        register0.runRegistrationSystem((int) (byte) 0);
        register0.registerUser("", "");
        register0.runRegistrationSystem((int) '#');
        register0.loginUser("hi!", "");
    }

    @Test
    public void test1076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest2.test1076");
        Register register0 = new Register();
        register0.registerUser("hi!", "");
        register0.loginUser("", "hi!");
        register0.runRegistrationSystem((int) 'a');
        register0.loginUser("hi!", "");
        register0.runRegistrationSystem((int) (byte) 1);
        register0.registerUser("hi!", "");
        java.lang.Class<?> wildcardClass17 = register0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test1077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest2.test1077");
        Register register0 = new Register();
        register0.registerUser("hi!", "");
        register0.registerUser("hi!", "");
        register0.runRegistrationSystem((int) (byte) 0);
        register0.registerUser("", "");
        register0.loginUser("hi!", "");
        register0.loginUser("hi!", "hi!");
        register0.runRegistrationSystem(0);
        java.lang.Class<?> wildcardClass20 = register0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test1078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest2.test1078");
        Register register0 = new Register();
        register0.registerUser("hi!", "");
        register0.loginUser("", "hi!");
        register0.runRegistrationSystem((int) 'a');
        register0.loginUser("", "hi!");
        register0.runRegistrationSystem((int) (byte) -1);
        register0.loginUser("", "hi!");
        register0.loginUser("", "hi!");
        java.lang.Class<?> wildcardClass20 = register0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test1079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest2.test1079");
        Register register0 = new Register();
        register0.loginUser("hi!", "hi!");
        register0.loginUser("", "hi!");
        register0.runRegistrationSystem((int) (byte) 0);
        register0.registerUser("", "");
        java.lang.Class<?> wildcardClass12 = register0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test1080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest2.test1080");
        Register register0 = new Register();
        register0.runRegistrationSystem((int) '#');
        register0.registerUser("", "hi!");
        register0.registerUser("", "hi!");
        register0.registerUser("", "");
        register0.runRegistrationSystem((int) (byte) 10);
        register0.runRegistrationSystem((int) (short) 100);
        register0.runRegistrationSystem((int) (short) 1);
        register0.registerUser("", "");
        register0.registerUser("hi!", "hi!");
        register0.runRegistrationSystem((-1));
        register0.runRegistrationSystem((int) 'a');
        java.lang.Class<?> wildcardClass28 = register0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test1081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest2.test1081");
        Register register0 = new Register();
        register0.loginUser("hi!", "hi!");
        register0.registerUser("hi!", "");
        register0.registerUser("hi!", "");
        register0.registerUser("", "");
        register0.runRegistrationSystem(100);
        register0.registerUser("hi!", "");
        register0.runRegistrationSystem(1);
        register0.registerUser("hi!", "");
        java.lang.Class<?> wildcardClass23 = register0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test1082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest2.test1082");
        Register register0 = new Register();
        register0.runRegistrationSystem((int) '#');
        register0.loginUser("hi!", "hi!");
        register0.loginUser("hi!", "hi!");
        register0.loginUser("hi!", "");
        register0.loginUser("", "");
        register0.runRegistrationSystem((int) (short) 10);
        register0.registerUser("", "");
        register0.loginUser("", "");
    }

    @Test
    public void test1083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest2.test1083");
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
        register0.registerUser("", "hi!");
        java.lang.Class<?> wildcardClass29 = register0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass29);
    }

    @Test
    public void test1084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest2.test1084");
        Register register0 = new Register();
        register0.loginUser("hi!", "hi!");
        register0.registerUser("hi!", "");
        register0.loginUser("hi!", "hi!");
        register0.registerUser("", "");
        register0.runRegistrationSystem(0);
        register0.registerUser("", "");
        register0.runRegistrationSystem((int) (byte) 100);
        register0.runRegistrationSystem((int) (short) -1);
    }

    @Test
    public void test1085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest2.test1085");
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
        java.lang.Class<?> wildcardClass36 = register0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass36);
    }

    @Test
    public void test1086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest2.test1086");
        Register register0 = new Register();
        register0.runRegistrationSystem((int) '#');
        register0.registerUser("", "hi!");
        register0.runRegistrationSystem((int) (short) 0);
        register0.runRegistrationSystem((int) (byte) 1);
        register0.runRegistrationSystem((int) 'a');
        register0.registerUser("hi!", "hi!");
        register0.registerUser("", "");
        register0.registerUser("", "hi!");
        java.lang.Class<?> wildcardClass21 = register0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test1087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest2.test1087");
        Register register0 = new Register();
        register0.registerUser("hi!", "");
        register0.loginUser("", "");
        register0.runRegistrationSystem((int) 'a');
        register0.runRegistrationSystem((int) (short) 100);
        register0.registerUser("hi!", "");
        register0.loginUser("", "");
    }

    @Test
    public void test1088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest2.test1088");
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
        register0.loginUser("", "");
    }

    @Test
    public void test1089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest2.test1089");
        Register register0 = new Register();
        register0.runRegistrationSystem((int) (short) 0);
        register0.loginUser("hi!", "hi!");
        register0.registerUser("", "");
        register0.runRegistrationSystem((int) '#');
        register0.registerUser("", "hi!");
        register0.registerUser("", "hi!");
        register0.registerUser("", "");
        register0.runRegistrationSystem((int) ' ');
        register0.registerUser("", "hi!");
        register0.runRegistrationSystem(10);
        register0.registerUser("", "");
    }

    @Test
    public void test1090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest2.test1090");
        Register register0 = new Register();
        register0.runRegistrationSystem((int) (byte) -1);
        register0.registerUser("hi!", "");
        register0.runRegistrationSystem((int) (short) 1);
        register0.loginUser("", "hi!");
        register0.runRegistrationSystem((int) '4');
        register0.registerUser("hi!", "");
        register0.loginUser("hi!", "hi!");
    }

    @Test
    public void test1091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest2.test1091");
        Register register0 = new Register();
        register0.registerUser("hi!", "");
        register0.registerUser("hi!", "");
        register0.loginUser("hi!", "");
        register0.loginUser("", "hi!");
        register0.loginUser("hi!", "");
        java.lang.Class<?> wildcardClass16 = register0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test1092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest2.test1092");
        Register register0 = new Register();
        register0.runRegistrationSystem((int) '#');
        register0.registerUser("", "hi!");
        register0.runRegistrationSystem((int) (short) 0);
        register0.runRegistrationSystem((int) (byte) 1);
        register0.registerUser("", "");
        register0.runRegistrationSystem((int) (short) 10);
        register0.registerUser("hi!", "");
        register0.registerUser("", "");
        register0.runRegistrationSystem((int) (byte) 0);
    }

    @Test
    public void test1093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest2.test1093");
        Register register0 = new Register();
        register0.loginUser("hi!", "hi!");
        register0.registerUser("hi!", "");
        register0.registerUser("", "");
        register0.registerUser("hi!", "");
        register0.registerUser("hi!", "");
        register0.registerUser("", "");
        register0.loginUser("", "");
        register0.runRegistrationSystem((int) (short) 10);
        register0.runRegistrationSystem((int) (byte) 1);
    }

    @Test
    public void test1094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest2.test1094");
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
        java.lang.Class<?> wildcardClass27 = register0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test1095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest2.test1095");
        Register register0 = new Register();
        register0.runRegistrationSystem((int) (byte) -1);
        register0.registerUser("hi!", "");
        register0.loginUser("hi!", "hi!");
        register0.loginUser("hi!", "");
        register0.loginUser("", "");
        register0.runRegistrationSystem(1);
        register0.registerUser("hi!", "hi!");
        register0.loginUser("", "");
        register0.registerUser("hi!", "hi!");
        register0.registerUser("hi!", "");
        register0.loginUser("hi!", "");
    }

    @Test
    public void test1096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest2.test1096");
        Register register0 = new Register();
        register0.registerUser("hi!", "");
        register0.registerUser("hi!", "");
        register0.loginUser("hi!", "");
        register0.registerUser("", "hi!");
        register0.registerUser("hi!", "");
        register0.loginUser("", "hi!");
        register0.registerUser("hi!", "hi!");
        register0.registerUser("", "");
    }

    @Test
    public void test1097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest2.test1097");
        Register register0 = new Register();
        register0.runRegistrationSystem((int) (byte) -1);
        register0.runRegistrationSystem((int) (byte) 10);
        register0.loginUser("hi!", "");
        java.lang.Class<?> wildcardClass8 = register0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test1098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest2.test1098");
        Register register0 = new Register();
        register0.loginUser("hi!", "hi!");
        register0.runRegistrationSystem(0);
        register0.registerUser("", "");
        register0.registerUser("", "hi!");
        register0.loginUser("hi!", "");
        register0.registerUser("hi!", "");
        java.lang.Class<?> wildcardClass18 = register0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test1099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest2.test1099");
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
        java.lang.Class<?> wildcardClass26 = register0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass26);
    }

    @Test
    public void test1100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest2.test1100");
        Register register0 = new Register();
        register0.runRegistrationSystem((int) '#');
        register0.registerUser("", "hi!");
        register0.registerUser("", "hi!");
        register0.registerUser("", "");
        register0.runRegistrationSystem((int) (byte) 10);
        register0.runRegistrationSystem((int) (short) 100);
        register0.runRegistrationSystem((int) (short) 1);
        register0.registerUser("", "");
        register0.registerUser("hi!", "hi!");
        register0.runRegistrationSystem((-1));
        register0.loginUser("hi!", "");
    }

    @Test
    public void test1101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest2.test1101");
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
        register0.registerUser("hi!", "hi!");
        register0.runRegistrationSystem((int) (byte) 100);
    }

    @Test
    public void test1102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest2.test1102");
        Register register0 = new Register();
        register0.loginUser("hi!", "hi!");
        register0.runRegistrationSystem(0);
        register0.registerUser("", "");
        register0.loginUser("", "hi!");
        register0.registerUser("", "");
        register0.loginUser("", "");
        register0.runRegistrationSystem((int) (byte) 10);
        register0.loginUser("", "");
        register0.registerUser("", "");
        register0.runRegistrationSystem((int) (short) 1);
    }

    @Test
    public void test1103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest2.test1103");
        Register register0 = new Register();
        register0.runRegistrationSystem((int) (short) 0);
        register0.loginUser("hi!", "hi!");
        register0.registerUser("", "");
        register0.runRegistrationSystem((-1));
        register0.loginUser("", "hi!");
        register0.loginUser("hi!", "hi!");
        java.lang.Class<?> wildcardClass17 = register0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test1104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest2.test1104");
        Register register0 = new Register();
        register0.runRegistrationSystem((int) (byte) -1);
        register0.runRegistrationSystem((int) (byte) 10);
        register0.registerUser("", "");
        register0.registerUser("", "hi!");
        register0.runRegistrationSystem((int) '4');
        register0.loginUser("hi!", "");
        register0.runRegistrationSystem((int) '4');
        register0.loginUser("hi!", "");
    }

    @Test
    public void test1105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest2.test1105");
        Register register0 = new Register();
        register0.runRegistrationSystem((int) (byte) -1);
        register0.registerUser("hi!", "");
        register0.loginUser("hi!", "hi!");
        register0.loginUser("hi!", "");
        register0.loginUser("", "");
        register0.runRegistrationSystem(1);
        register0.registerUser("hi!", "hi!");
        register0.loginUser("", "");
        register0.loginUser("", "hi!");
        register0.registerUser("hi!", "");
        register0.runRegistrationSystem(10);
    }

    @Test
    public void test1106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest2.test1106");
        Register register0 = new Register();
        register0.loginUser("hi!", "hi!");
        register0.registerUser("hi!", "");
        register0.registerUser("hi!", "");
        register0.registerUser("", "");
        register0.runRegistrationSystem(100);
        register0.registerUser("hi!", "");
        register0.registerUser("", "");
        register0.runRegistrationSystem((int) (byte) 100);
        register0.loginUser("hi!", "hi!");
        java.lang.Class<?> wildcardClass26 = register0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass26);
    }

    @Test
    public void test1107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest2.test1107");
        Register register0 = new Register();
        register0.runRegistrationSystem((int) (short) 0);
        register0.loginUser("hi!", "hi!");
        register0.loginUser("hi!", "");
        register0.loginUser("", "hi!");
        register0.loginUser("hi!", "");
        java.lang.Class<?> wildcardClass15 = register0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test1108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest2.test1108");
        Register register0 = new Register();
        register0.runRegistrationSystem((int) (short) 0);
        register0.loginUser("hi!", "hi!");
        register0.loginUser("", "");
        register0.runRegistrationSystem((int) (short) 1);
        register0.runRegistrationSystem((int) 'a');
    }

    @Test
    public void test1109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest2.test1109");
        Register register0 = new Register();
        register0.registerUser("hi!", "");
        register0.registerUser("hi!", "");
        register0.loginUser("hi!", "");
        register0.registerUser("", "hi!");
        register0.registerUser("hi!", "");
        register0.loginUser("", "hi!");
        register0.loginUser("", "");
        register0.runRegistrationSystem((int) ' ');
        register0.loginUser("", "");
        java.lang.Class<?> wildcardClass27 = register0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test1110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest2.test1110");
        Register register0 = new Register();
        register0.registerUser("hi!", "");
        register0.loginUser("hi!", "hi!");
        register0.registerUser("hi!", "hi!");
        register0.loginUser("", "hi!");
        register0.registerUser("", "hi!");
        java.lang.Class<?> wildcardClass16 = register0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test1111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest2.test1111");
        Register register0 = new Register();
        register0.loginUser("hi!", "hi!");
        register0.registerUser("hi!", "");
        register0.registerUser("", "");
        register0.registerUser("hi!", "");
        register0.registerUser("hi!", "");
        register0.runRegistrationSystem((int) (short) 10);
        register0.loginUser("", "");
        register0.runRegistrationSystem((int) (short) 0);
        register0.loginUser("", "");
        register0.runRegistrationSystem((int) (byte) -1);
        java.lang.Class<?> wildcardClass28 = register0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test1112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest2.test1112");
        Register register0 = new Register();
        register0.runRegistrationSystem((int) (byte) -1);
        register0.registerUser("hi!", "");
        register0.registerUser("", "hi!");
        register0.loginUser("hi!", "hi!");
        java.lang.Class<?> wildcardClass12 = register0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test1113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest2.test1113");
        Register register0 = new Register();
        register0.runRegistrationSystem((int) (byte) -1);
        register0.registerUser("hi!", "");
        register0.runRegistrationSystem((int) (short) 1);
        register0.loginUser("", "hi!");
        register0.registerUser("", "");
        register0.runRegistrationSystem((int) (short) 0);
        register0.loginUser("", "hi!");
    }

    @Test
    public void test1114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest2.test1114");
        Register register0 = new Register();
        register0.runRegistrationSystem((int) '#');
        register0.registerUser("", "hi!");
        register0.runRegistrationSystem((int) (short) 0);
        register0.runRegistrationSystem((int) (byte) 1);
        register0.registerUser("", "");
        register0.runRegistrationSystem((int) (short) 10);
        register0.loginUser("", "hi!");
        register0.registerUser("hi!", "");
        java.lang.Class<?> wildcardClass21 = register0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test1115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest2.test1115");
        Register register0 = new Register();
        register0.runRegistrationSystem((int) '#');
        register0.registerUser("", "hi!");
        register0.runRegistrationSystem((int) (short) 0);
        register0.runRegistrationSystem((int) (byte) 1);
        register0.runRegistrationSystem((int) (byte) 0);
        register0.loginUser("", "");
        register0.runRegistrationSystem((int) (byte) 0);
        java.lang.Class<?> wildcardClass17 = register0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test1116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest2.test1116");
        Register register0 = new Register();
        register0.runRegistrationSystem((int) (short) 0);
        register0.loginUser("hi!", "hi!");
        register0.registerUser("", "");
        register0.runRegistrationSystem((int) '#');
        register0.registerUser("", "hi!");
        register0.registerUser("", "hi!");
        register0.registerUser("", "");
        register0.loginUser("hi!", "hi!");
    }

    @Test
    public void test1117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest2.test1117");
        Register register0 = new Register();
        register0.runRegistrationSystem((int) (byte) -1);
        register0.runRegistrationSystem((int) '#');
        register0.registerUser("hi!", "hi!");
        register0.runRegistrationSystem((int) (byte) 1);
        register0.registerUser("hi!", "hi!");
        register0.loginUser("hi!", "hi!");
        java.lang.Class<?> wildcardClass16 = register0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test1118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest2.test1118");
        Register register0 = new Register();
        register0.runRegistrationSystem((int) (short) 0);
        register0.loginUser("hi!", "hi!");
        register0.loginUser("", "");
        register0.registerUser("hi!", "");
        register0.loginUser("hi!", "hi!");
        register0.registerUser("hi!", "hi!");
    }

    @Test
    public void test1119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest2.test1119");
        Register register0 = new Register();
        register0.runRegistrationSystem((int) '#');
        register0.runRegistrationSystem((int) (short) 100);
        register0.runRegistrationSystem(100);
        register0.loginUser("", "hi!");
        register0.registerUser("", "hi!");
        register0.loginUser("", "");
    }

    @Test
    public void test1120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest2.test1120");
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
        register0.runRegistrationSystem((int) (byte) -1);
        java.lang.Class<?> wildcardClass35 = register0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass35);
    }

    @Test
    public void test1121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest2.test1121");
        Register register0 = new Register();
        register0.registerUser("hi!", "");
        register0.loginUser("", "hi!");
        register0.runRegistrationSystem((int) 'a');
        register0.loginUser("hi!", "");
        register0.runRegistrationSystem((int) (byte) 1);
        register0.loginUser("", "hi!");
        register0.registerUser("", "hi!");
    }

    @Test
    public void test1122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest2.test1122");
        Register register0 = new Register();
        register0.registerUser("hi!", "");
        register0.loginUser("", "hi!");
        register0.runRegistrationSystem((int) 'a');
        register0.loginUser("", "hi!");
        register0.loginUser("", "hi!");
        register0.runRegistrationSystem((int) (byte) 1);
        register0.runRegistrationSystem((int) (byte) 1);
        java.lang.Class<?> wildcardClass19 = register0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test1123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest2.test1123");
        Register register0 = new Register();
        register0.registerUser("hi!", "");
        register0.runRegistrationSystem(1);
        register0.registerUser("", "");
        register0.loginUser("hi!", "hi!");
        register0.runRegistrationSystem((int) (byte) 10);
        register0.loginUser("hi!", "hi!");
    }

    @Test
    public void test1124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest2.test1124");
        Register register0 = new Register();
        register0.loginUser("hi!", "hi!");
        register0.registerUser("hi!", "");
        register0.registerUser("", "");
        register0.registerUser("", "");
        register0.runRegistrationSystem((int) (byte) 100);
        register0.runRegistrationSystem((int) (short) -1);
        register0.runRegistrationSystem((int) '4');
    }

    @Test
    public void test1125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest2.test1125");
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
        java.lang.Class<?> wildcardClass26 = register0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass26);
    }

    @Test
    public void test1126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest2.test1126");
        Register register0 = new Register();
        register0.runRegistrationSystem((int) '#');
        register0.registerUser("", "hi!");
        register0.loginUser("hi!", "hi!");
        register0.runRegistrationSystem((int) (short) 10);
        register0.loginUser("hi!", "hi!");
        register0.runRegistrationSystem((int) (short) 0);
        register0.runRegistrationSystem((int) (byte) -1);
    }

    @Test
    public void test1127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest2.test1127");
        Register register0 = new Register();
        register0.loginUser("hi!", "hi!");
        register0.registerUser("hi!", "");
        register0.registerUser("", "");
        register0.registerUser("hi!", "");
        register0.registerUser("hi!", "");
        register0.registerUser("hi!", "");
        register0.runRegistrationSystem((int) (byte) 0);
        register0.registerUser("", "hi!");
        register0.loginUser("hi!", "");
        java.lang.Class<?> wildcardClass27 = register0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test1128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest2.test1128");
        Register register0 = new Register();
        register0.runRegistrationSystem((int) (short) 0);
        register0.loginUser("hi!", "hi!");
        register0.registerUser("", "");
        register0.runRegistrationSystem((-1));
        register0.runRegistrationSystem((int) (short) 0);
        register0.loginUser("hi!", "");
        register0.registerUser("", "");
        register0.runRegistrationSystem(100);
        register0.runRegistrationSystem((int) (short) 10);
        java.lang.Class<?> wildcardClass23 = register0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test1129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest2.test1129");
        Register register0 = new Register();
        register0.runRegistrationSystem((int) '#');
        register0.loginUser("hi!", "hi!");
        register0.registerUser("", "");
        register0.registerUser("hi!", "");
        register0.loginUser("hi!", "");
        register0.loginUser("hi!", "");
    }

    @Test
    public void test1130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest2.test1130");
        Register register0 = new Register();
        register0.runRegistrationSystem((int) '#');
        register0.registerUser("", "hi!");
        register0.loginUser("hi!", "hi!");
        register0.runRegistrationSystem(100);
        register0.runRegistrationSystem((int) (short) 10);
        register0.runRegistrationSystem((int) (short) 0);
        register0.runRegistrationSystem((int) (short) 1);
        register0.runRegistrationSystem((int) '#');
        register0.loginUser("", "");
        register0.registerUser("", "hi!");
        register0.registerUser("", "");
        register0.registerUser("", "");
    }

    @Test
    public void test1131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest2.test1131");
        Register register0 = new Register();
        register0.runRegistrationSystem((int) '#');
        register0.loginUser("hi!", "hi!");
        register0.loginUser("hi!", "hi!");
        register0.loginUser("hi!", "");
        register0.loginUser("", "");
        register0.runRegistrationSystem((int) (short) 10);
        register0.registerUser("", "hi!");
        register0.loginUser("hi!", "");
        register0.runRegistrationSystem((int) (short) 1);
    }

    @Test
    public void test1132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest2.test1132");
        Register register0 = new Register();
        register0.runRegistrationSystem((int) (short) 0);
        register0.loginUser("hi!", "hi!");
        register0.loginUser("", "");
        register0.registerUser("hi!", "");
        register0.registerUser("hi!", "");
        register0.loginUser("hi!", "");
        register0.runRegistrationSystem((int) (short) 10);
    }

    @Test
    public void test1133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest2.test1133");
        Register register0 = new Register();
        register0.runRegistrationSystem((int) (short) 0);
        register0.loginUser("hi!", "hi!");
        register0.registerUser("", "");
        register0.runRegistrationSystem((-1));
        register0.registerUser("", "");
        register0.loginUser("hi!", "hi!");
        register0.registerUser("hi!", "");
        register0.loginUser("hi!", "hi!");
        java.lang.Class<?> wildcardClass23 = register0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test1134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest2.test1134");
        Register register0 = new Register();
        register0.registerUser("", "");
        register0.registerUser("", "hi!");
        register0.registerUser("", "");
        register0.loginUser("hi!", "");
        register0.runRegistrationSystem((int) (short) 0);
        register0.registerUser("hi!", "hi!");
    }

    @Test
    public void test1135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest2.test1135");
        Register register0 = new Register();
        register0.loginUser("hi!", "hi!");
        register0.runRegistrationSystem(0);
        register0.registerUser("", "");
        register0.loginUser("", "hi!");
        register0.registerUser("", "");
        register0.registerUser("hi!", "hi!");
        register0.registerUser("hi!", "");
        register0.runRegistrationSystem((int) (short) 10);
        register0.runRegistrationSystem((int) 'a');
    }

    @Test
    public void test1136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest2.test1136");
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
        register0.registerUser("hi!", "");
    }

    @Test
    public void test1137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest2.test1137");
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
        register0.registerUser("hi!", "hi!");
    }

    @Test
    public void test1138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest2.test1138");
        Register register0 = new Register();
        register0.runRegistrationSystem((int) '#');
        register0.registerUser("", "hi!");
        register0.runRegistrationSystem((int) (short) 0);
        register0.loginUser("hi!", "hi!");
        register0.registerUser("", "hi!");
        register0.runRegistrationSystem((int) (byte) -1);
        register0.runRegistrationSystem((int) (byte) -1);
        register0.registerUser("hi!", "");
        register0.runRegistrationSystem(1);
    }

    @Test
    public void test1139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest2.test1139");
        Register register0 = new Register();
        register0.runRegistrationSystem((int) (short) 0);
        register0.runRegistrationSystem((int) (byte) 1);
        register0.loginUser("hi!", "");
    }

    @Test
    public void test1140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest2.test1140");
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
        register0.registerUser("hi!", "hi!");
        java.lang.Class<?> wildcardClass30 = register0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass30);
    }

    @Test
    public void test1141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest2.test1141");
        Register register0 = new Register();
        register0.loginUser("hi!", "hi!");
        register0.runRegistrationSystem(0);
        register0.registerUser("", "");
        register0.loginUser("", "hi!");
        register0.runRegistrationSystem((int) 'a');
        register0.runRegistrationSystem((int) (short) 100);
        register0.runRegistrationSystem((int) '4');
    }

    @Test
    public void test1142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest2.test1142");
        Register register0 = new Register();
        register0.runRegistrationSystem((int) '#');
        register0.registerUser("", "hi!");
        register0.runRegistrationSystem((int) (short) 0);
        register0.runRegistrationSystem((int) (byte) 1);
        register0.runRegistrationSystem((int) 'a');
        register0.registerUser("hi!", "hi!");
        java.lang.Class<?> wildcardClass15 = register0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test1143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest2.test1143");
        Register register0 = new Register();
        register0.registerUser("hi!", "");
        register0.loginUser("hi!", "hi!");
        register0.runRegistrationSystem((int) '#');
        register0.loginUser("hi!", "hi!");
        register0.registerUser("hi!", "hi!");
    }

    @Test
    public void test1144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest2.test1144");
        Register register0 = new Register();
        register0.loginUser("hi!", "hi!");
        register0.registerUser("hi!", "");
        register0.registerUser("", "");
        register0.registerUser("hi!", "");
        register0.registerUser("", "");
        register0.loginUser("", "");
        register0.loginUser("hi!", "");
    }

    @Test
    public void test1145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest2.test1145");
        Register register0 = new Register();
        register0.runRegistrationSystem((int) (short) 0);
        register0.loginUser("hi!", "hi!");
        register0.registerUser("", "");
        register0.loginUser("", "hi!");
        register0.registerUser("", "");
        register0.runRegistrationSystem(1);
    }

    @Test
    public void test1146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest2.test1146");
        Register register0 = new Register();
        register0.loginUser("hi!", "hi!");
        register0.runRegistrationSystem(0);
        register0.registerUser("", "");
        register0.loginUser("", "hi!");
        register0.registerUser("", "");
        register0.loginUser("hi!", "hi!");
        register0.runRegistrationSystem(10);
        register0.loginUser("", "");
        register0.registerUser("", "");
    }

    @Test
    public void test1147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest2.test1147");
        Register register0 = new Register();
        register0.loginUser("hi!", "hi!");
        register0.runRegistrationSystem(0);
        register0.registerUser("", "");
        register0.loginUser("", "hi!");
        register0.registerUser("", "");
        register0.loginUser("", "");
        register0.runRegistrationSystem((int) (short) 1);
        register0.loginUser("hi!", "hi!");
        register0.loginUser("", "");
    }

    @Test
    public void test1148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest2.test1148");
        Register register0 = new Register();
        register0.runRegistrationSystem((int) (short) 0);
        register0.loginUser("hi!", "hi!");
        register0.registerUser("", "");
        register0.runRegistrationSystem((int) '#');
        register0.registerUser("", "hi!");
        register0.runRegistrationSystem((int) (short) 1);
        register0.runRegistrationSystem((int) 'a');
        java.lang.Class<?> wildcardClass18 = register0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test1149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest2.test1149");
        Register register0 = new Register();
        register0.runRegistrationSystem((int) '#');
        register0.registerUser("", "hi!");
        register0.loginUser("hi!", "hi!");
        register0.runRegistrationSystem(100);
        register0.runRegistrationSystem((int) (short) 10);
        register0.runRegistrationSystem((int) (short) 0);
        register0.registerUser("", "hi!");
        register0.loginUser("", "hi!");
        register0.loginUser("", "");
    }

    @Test
    public void test1150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest2.test1150");
        Register register0 = new Register();
        register0.registerUser("hi!", "");
        register0.loginUser("", "hi!");
        register0.runRegistrationSystem((int) (byte) -1);
        register0.loginUser("", "");
        register0.runRegistrationSystem((int) (short) 100);
        register0.registerUser("", "hi!");
        register0.loginUser("hi!", "hi!");
        register0.loginUser("", "hi!");
        java.lang.Class<?> wildcardClass23 = register0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test1151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest2.test1151");
        Register register0 = new Register();
        register0.loginUser("hi!", "hi!");
        register0.registerUser("hi!", "");
        register0.registerUser("", "");
        register0.registerUser("", "hi!");
        register0.runRegistrationSystem((int) (short) 100);
        register0.loginUser("hi!", "hi!");
        register0.loginUser("", "");
        register0.runRegistrationSystem(0);
    }

    @Test
    public void test1152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest2.test1152");
        Register register0 = new Register();
        register0.runRegistrationSystem((int) '#');
        register0.registerUser("", "hi!");
        register0.runRegistrationSystem((int) (short) 0);
        register0.runRegistrationSystem((int) (byte) 1);
        register0.registerUser("", "");
        register0.runRegistrationSystem((int) (short) 10);
        register0.runRegistrationSystem((int) (short) -1);
        register0.registerUser("", "");
        register0.loginUser("hi!", "");
        register0.registerUser("", "");
    }

    @Test
    public void test1153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest2.test1153");
        Register register0 = new Register();
        register0.loginUser("hi!", "hi!");
        register0.loginUser("", "");
        register0.runRegistrationSystem(10);
        java.lang.Class<?> wildcardClass9 = register0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test1154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest2.test1154");
        Register register0 = new Register();
        register0.registerUser("hi!", "");
        register0.loginUser("", "hi!");
        register0.runRegistrationSystem((int) 'a');
        register0.loginUser("", "hi!");
        register0.runRegistrationSystem((int) (byte) -1);
        register0.runRegistrationSystem((int) (short) 1);
        register0.loginUser("", "hi!");
    }

    @Test
    public void test1155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest2.test1155");
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
        java.lang.Class<?> wildcardClass27 = register0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test1156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest2.test1156");
        Register register0 = new Register();
        register0.registerUser("hi!", "");
        register0.loginUser("", "hi!");
        register0.runRegistrationSystem((int) 'a');
        register0.registerUser("hi!", "hi!");
    }

    @Test
    public void test1157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest2.test1157");
        Register register0 = new Register();
        register0.registerUser("hi!", "");
        register0.loginUser("", "hi!");
        register0.loginUser("", "hi!");
        register0.runRegistrationSystem(10);
        register0.runRegistrationSystem((-1));
        register0.runRegistrationSystem((int) (short) 1);
        register0.registerUser("hi!", "hi!");
        register0.registerUser("hi!", "hi!");
        register0.runRegistrationSystem((int) (short) 0);
        register0.runRegistrationSystem((int) (short) 10);
    }

    @Test
    public void test1158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest2.test1158");
        Register register0 = new Register();
        register0.runRegistrationSystem((int) '#');
        register0.registerUser("", "hi!");
        register0.runRegistrationSystem((int) (short) 0);
        register0.runRegistrationSystem((int) (byte) 1);
        register0.registerUser("", "");
        register0.runRegistrationSystem((int) (short) 10);
        register0.loginUser("hi!", "");
        register0.registerUser("hi!", "");
        register0.registerUser("", "hi!");
    }

    @Test
    public void test1159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest2.test1159");
        Register register0 = new Register();
        register0.registerUser("hi!", "");
        register0.loginUser("", "hi!");
        register0.runRegistrationSystem((int) 'a');
        register0.loginUser("", "hi!");
        register0.loginUser("hi!", "");
        register0.loginUser("hi!", "hi!");
        register0.loginUser("hi!", "");
        register0.registerUser("hi!", "");
        register0.loginUser("hi!", "hi!");
    }

    @Test
    public void test1160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest2.test1160");
        Register register0 = new Register();
        register0.loginUser("hi!", "hi!");
        register0.registerUser("", "");
        register0.loginUser("hi!", "hi!");
        register0.registerUser("hi!", "hi!");
        register0.loginUser("", "hi!");
        register0.loginUser("hi!", "");
    }

    @Test
    public void test1161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest2.test1161");
        Register register0 = new Register();
        register0.runRegistrationSystem((int) (byte) -1);
        register0.registerUser("hi!", "");
        register0.loginUser("hi!", "hi!");
        register0.runRegistrationSystem((int) (byte) 1);
        register0.loginUser("hi!", "");
        register0.runRegistrationSystem((int) (short) -1);
    }

    @Test
    public void test1162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest2.test1162");
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
        register0.runRegistrationSystem((int) (byte) 1);
    }

    @Test
    public void test1163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest2.test1163");
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
        register0.runRegistrationSystem((int) (byte) 100);
    }

    @Test
    public void test1164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest2.test1164");
        Register register0 = new Register();
        register0.registerUser("hi!", "");
        register0.registerUser("hi!", "");
        register0.loginUser("hi!", "");
        register0.loginUser("", "hi!");
        register0.loginUser("hi!", "");
        register0.loginUser("hi!", "");
        java.lang.Class<?> wildcardClass19 = register0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test1165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest2.test1165");
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
        register0.registerUser("", "hi!");
    }

    @Test
    public void test1166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest2.test1166");
        Register register0 = new Register();
        register0.runRegistrationSystem((int) (byte) -1);
        register0.registerUser("hi!", "");
        register0.loginUser("hi!", "hi!");
        register0.runRegistrationSystem((int) (byte) 1);
        register0.loginUser("hi!", "");
        register0.registerUser("", "");
        register0.runRegistrationSystem((int) '#');
    }

    @Test
    public void test1167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest2.test1167");
        Register register0 = new Register();
        register0.loginUser("hi!", "hi!");
        register0.registerUser("hi!", "");
        register0.registerUser("", "");
        register0.registerUser("", "hi!");
        register0.runRegistrationSystem((int) (short) 100);
        register0.runRegistrationSystem((int) (byte) 1);
        register0.loginUser("", "");
        register0.registerUser("", "");
    }

    @Test
    public void test1168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest2.test1168");
        Register register0 = new Register();
        register0.runRegistrationSystem((int) (short) 0);
        register0.loginUser("hi!", "hi!");
        register0.registerUser("", "");
        register0.runRegistrationSystem((-1));
        register0.runRegistrationSystem((int) (short) 10);
        register0.runRegistrationSystem((int) '4');
        register0.runRegistrationSystem((int) 'a');
        java.lang.Class<?> wildcardClass17 = register0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test1169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest2.test1169");
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
        java.lang.Class<?> wildcardClass29 = register0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass29);
    }

    @Test
    public void test1170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest2.test1170");
        Register register0 = new Register();
        register0.runRegistrationSystem((int) (short) 0);
        register0.loginUser("hi!", "hi!");
        register0.registerUser("", "");
        register0.runRegistrationSystem((int) '#');
        register0.registerUser("", "hi!");
        register0.registerUser("", "hi!");
        register0.registerUser("", "");
        register0.runRegistrationSystem((int) (short) 10);
        register0.loginUser("", "hi!");
        java.lang.Class<?> wildcardClass25 = register0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test1171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest2.test1171");
        Register register0 = new Register();
        register0.registerUser("hi!", "");
        register0.loginUser("", "hi!");
        register0.runRegistrationSystem((int) 'a');
        register0.loginUser("", "hi!");
        register0.loginUser("hi!", "");
        register0.registerUser("hi!", "hi!");
        register0.runRegistrationSystem(1);
        register0.registerUser("hi!", "hi!");
        java.lang.Class<?> wildcardClass23 = register0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test1172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest2.test1172");
        Register register0 = new Register();
        register0.registerUser("hi!", "");
        register0.runRegistrationSystem(1);
        register0.registerUser("", "");
        register0.runRegistrationSystem((int) (short) -1);
        register0.loginUser("", "");
        register0.loginUser("hi!", "");
        register0.registerUser("hi!", "hi!");
        register0.registerUser("", "hi!");
    }

    @Test
    public void test1173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest2.test1173");
        Register register0 = new Register();
        register0.registerUser("hi!", "");
        register0.registerUser("hi!", "");
        register0.registerUser("hi!", "");
        register0.registerUser("", "hi!");
        register0.runRegistrationSystem(0);
        register0.loginUser("", "hi!");
    }

    @Test
    public void test1174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest2.test1174");
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
        register0.runRegistrationSystem(10);
    }

    @Test
    public void test1175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest2.test1175");
        Register register0 = new Register();
        register0.loginUser("hi!", "hi!");
        register0.registerUser("hi!", "");
        register0.registerUser("", "");
        register0.registerUser("hi!", "");
        register0.registerUser("hi!", "");
        register0.registerUser("", "");
        register0.runRegistrationSystem((int) '#');
        java.lang.Class<?> wildcardClass21 = register0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test1176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest2.test1176");
        Register register0 = new Register();
        register0.runRegistrationSystem((int) '#');
        register0.registerUser("", "hi!");
        register0.registerUser("", "hi!");
        register0.registerUser("", "");
        register0.runRegistrationSystem((int) (byte) 10);
        register0.runRegistrationSystem((int) (short) 100);
        register0.runRegistrationSystem((int) (short) 0);
        register0.runRegistrationSystem(100);
    }

    @Test
    public void test1177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest2.test1177");
        Register register0 = new Register();
        register0.runRegistrationSystem((int) (byte) -1);
        register0.runRegistrationSystem((int) (short) 10);
        register0.runRegistrationSystem((int) (byte) 100);
        register0.runRegistrationSystem(10);
        register0.registerUser("", "hi!");
        register0.runRegistrationSystem(0);
        register0.runRegistrationSystem((int) 'a');
    }

    @Test
    public void test1178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest2.test1178");
        Register register0 = new Register();
        register0.runRegistrationSystem((int) (byte) -1);
        register0.registerUser("hi!", "");
        register0.loginUser("hi!", "hi!");
        register0.loginUser("hi!", "");
        register0.loginUser("hi!", "");
        register0.loginUser("hi!", "hi!");
        register0.registerUser("hi!", "");
        register0.registerUser("hi!", "");
        register0.runRegistrationSystem((int) (short) 10);
    }

    @Test
    public void test1179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest2.test1179");
        Register register0 = new Register();
        register0.runRegistrationSystem((int) (short) 0);
        register0.loginUser("hi!", "hi!");
        register0.registerUser("", "");
        register0.runRegistrationSystem((int) '#');
        register0.runRegistrationSystem((int) (byte) 0);
        register0.registerUser("", "");
        register0.runRegistrationSystem((int) (byte) 10);
        java.lang.Class<?> wildcardClass18 = register0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test1180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest2.test1180");
        Register register0 = new Register();
        register0.runRegistrationSystem((int) (byte) -1);
        register0.runRegistrationSystem((int) '#');
        register0.registerUser("hi!", "hi!");
        register0.runRegistrationSystem((int) (byte) 1);
        register0.loginUser("", "");
        register0.runRegistrationSystem(0);
    }

    @Test
    public void test1181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest2.test1181");
        Register register0 = new Register();
        register0.registerUser("hi!", "");
        register0.registerUser("hi!", "");
        register0.runRegistrationSystem((int) (byte) 0);
        register0.registerUser("", "");
        register0.runRegistrationSystem((int) (byte) 10);
        register0.runRegistrationSystem((int) (byte) 1);
        register0.registerUser("", "hi!");
        register0.runRegistrationSystem((int) ' ');
    }

    @Test
    public void test1182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest2.test1182");
        Register register0 = new Register();
        register0.runRegistrationSystem((int) '#');
        register0.registerUser("", "hi!");
        register0.registerUser("", "hi!");
        register0.registerUser("", "");
        register0.runRegistrationSystem((int) (byte) 10);
        register0.loginUser("", "hi!");
        java.lang.Class<?> wildcardClass17 = register0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test1183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest2.test1183");
        Register register0 = new Register();
        register0.loginUser("", "hi!");
        register0.loginUser("", "hi!");
        register0.loginUser("hi!", "hi!");
        register0.registerUser("", "");
        register0.runRegistrationSystem((int) (short) 100);
        register0.loginUser("hi!", "");
        register0.loginUser("", "hi!");
        register0.runRegistrationSystem(0);
    }

    @Test
    public void test1184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest2.test1184");
        Register register0 = new Register();
        register0.runRegistrationSystem((int) (byte) -1);
        register0.runRegistrationSystem((int) (byte) 10);
        register0.registerUser("", "");
        register0.loginUser("", "");
        register0.registerUser("", "hi!");
        register0.registerUser("hi!", "");
        register0.loginUser("hi!", "hi!");
        register0.loginUser("", "hi!");
        register0.registerUser("", "hi!");
        register0.registerUser("", "hi!");
        java.lang.Class<?> wildcardClass29 = register0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass29);
    }

    @Test
    public void test1185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest2.test1185");
        Register register0 = new Register();
        register0.registerUser("hi!", "");
        register0.registerUser("hi!", "");
        register0.loginUser("hi!", "");
        register0.loginUser("hi!", "");
        register0.registerUser("", "");
        register0.runRegistrationSystem((int) (short) 1);
    }

    @Test
    public void test1186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest2.test1186");
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
        register0.runRegistrationSystem((int) (short) 0);
    }

    @Test
    public void test1187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest2.test1187");
        Register register0 = new Register();
        register0.loginUser("hi!", "hi!");
        register0.runRegistrationSystem(0);
        register0.runRegistrationSystem((int) (short) 100);
        register0.loginUser("", "hi!");
    }

    @Test
    public void test1188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest2.test1188");
        Register register0 = new Register();
        register0.registerUser("hi!", "");
        register0.loginUser("", "hi!");
        register0.runRegistrationSystem((int) (byte) -1);
        register0.loginUser("", "");
        register0.runRegistrationSystem((int) (short) 100);
        register0.registerUser("", "hi!");
        register0.registerUser("", "hi!");
    }

    @Test
    public void test1189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest2.test1189");
        Register register0 = new Register();
        register0.runRegistrationSystem((int) (byte) -1);
        register0.registerUser("hi!", "");
        register0.registerUser("", "hi!");
        register0.runRegistrationSystem((int) (short) 10);
        register0.loginUser("hi!", "hi!");
        register0.loginUser("", "hi!");
        register0.loginUser("hi!", "");
        register0.loginUser("hi!", "hi!");
        register0.loginUser("hi!", "");
    }

    @Test
    public void test1190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest2.test1190");
        Register register0 = new Register();
        register0.loginUser("hi!", "hi!");
        register0.loginUser("hi!", "hi!");
        register0.registerUser("", "");
        register0.runRegistrationSystem((int) (short) 10);
        register0.loginUser("hi!", "");
        register0.runRegistrationSystem((int) (byte) 100);
    }

    @Test
    public void test1191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest2.test1191");
        Register register0 = new Register();
        register0.runRegistrationSystem((int) (byte) -1);
        register0.runRegistrationSystem((int) (byte) 10);
        register0.registerUser("", "");
        register0.registerUser("", "hi!");
        register0.runRegistrationSystem((int) '4');
        register0.runRegistrationSystem((int) (short) 10);
        java.lang.Class<?> wildcardClass15 = register0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test1192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest2.test1192");
        Register register0 = new Register();
        register0.runRegistrationSystem((int) (byte) -1);
        register0.registerUser("hi!", "");
        register0.runRegistrationSystem((int) (byte) -1);
        register0.runRegistrationSystem((int) (short) 10);
    }

    @Test
    public void test1193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest2.test1193");
        Register register0 = new Register();
        register0.runRegistrationSystem((int) (byte) -1);
        register0.registerUser("hi!", "");
        register0.registerUser("", "hi!");
        register0.runRegistrationSystem((int) (short) 10);
        register0.loginUser("hi!", "hi!");
        register0.loginUser("", "hi!");
        register0.loginUser("hi!", "");
        register0.loginUser("hi!", "");
        java.lang.Class<?> wildcardClass23 = register0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test1194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest2.test1194");
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
        register0.loginUser("", "");
    }

    @Test
    public void test1195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest2.test1195");
        Register register0 = new Register();
        register0.registerUser("hi!", "");
        register0.registerUser("hi!", "");
        register0.loginUser("hi!", "");
        register0.loginUser("", "hi!");
        register0.loginUser("hi!", "");
        register0.loginUser("hi!", "");
        register0.loginUser("hi!", "");
        register0.loginUser("hi!", "hi!");
    }

    @Test
    public void test1196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest2.test1196");
        Register register0 = new Register();
        register0.registerUser("hi!", "");
        register0.runRegistrationSystem(1);
        register0.loginUser("hi!", "");
        register0.registerUser("hi!", "");
        register0.loginUser("", "hi!");
    }

    @Test
    public void test1197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest2.test1197");
        Register register0 = new Register();
        register0.runRegistrationSystem((int) '#');
        register0.loginUser("hi!", "hi!");
        register0.loginUser("hi!", "hi!");
        register0.loginUser("hi!", "");
        register0.loginUser("", "");
        register0.runRegistrationSystem((int) (short) 10);
        register0.runRegistrationSystem((int) (byte) 1);
        register0.loginUser("hi!", "");
        register0.registerUser("hi!", "hi!");
    }

    @Test
    public void test1198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest2.test1198");
        Register register0 = new Register();
        register0.loginUser("hi!", "hi!");
        register0.registerUser("hi!", "hi!");
        register0.loginUser("hi!", "hi!");
        register0.runRegistrationSystem(100);
        register0.runRegistrationSystem((int) (byte) 0);
        register0.registerUser("", "");
    }

    @Test
    public void test1199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest2.test1199");
        Register register0 = new Register();
        register0.runRegistrationSystem((int) (byte) -1);
        register0.registerUser("hi!", "");
        register0.runRegistrationSystem(0);
        register0.registerUser("hi!", "");
        register0.registerUser("", "hi!");
    }

    @Test
    public void test1200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest2.test1200");
        Register register0 = new Register();
        register0.runRegistrationSystem((int) '#');
        register0.loginUser("hi!", "hi!");
        register0.loginUser("hi!", "hi!");
        register0.loginUser("hi!", "");
        register0.loginUser("", "");
        register0.runRegistrationSystem((int) (short) 1);
        register0.registerUser("", "");
    }

    @Test
    public void test1201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest2.test1201");
        Register register0 = new Register();
        register0.registerUser("hi!", "");
        register0.loginUser("", "hi!");
        register0.runRegistrationSystem((int) 'a');
        register0.loginUser("", "hi!");
        register0.runRegistrationSystem((int) (byte) -1);
        register0.loginUser("", "hi!");
        register0.loginUser("", "hi!");
        register0.runRegistrationSystem((int) ' ');
    }

    @Test
    public void test1202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest2.test1202");
        Register register0 = new Register();
        register0.runRegistrationSystem((int) (byte) -1);
        register0.runRegistrationSystem((int) '#');
        register0.loginUser("hi!", "hi!");
        register0.loginUser("hi!", "");
        register0.runRegistrationSystem(0);
    }

    @Test
    public void test1203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest2.test1203");
        Register register0 = new Register();
        register0.registerUser("hi!", "");
        register0.loginUser("", "hi!");
        register0.runRegistrationSystem((int) (byte) -1);
        register0.runRegistrationSystem(1);
        register0.loginUser("hi!", "");
        register0.runRegistrationSystem(0);
        register0.registerUser("", "");
        register0.runRegistrationSystem((int) '#');
        register0.loginUser("", "");
    }

    @Test
    public void test1204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest2.test1204");
        Register register0 = new Register();
        register0.runRegistrationSystem((int) (byte) -1);
        register0.runRegistrationSystem((int) (short) 10);
        register0.loginUser("", "");
        register0.registerUser("hi!", "hi!");
        register0.registerUser("", "");
    }

    @Test
    public void test1205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest2.test1205");
        Register register0 = new Register();
        register0.runRegistrationSystem((int) (short) 0);
        register0.loginUser("hi!", "hi!");
        register0.registerUser("", "");
        register0.runRegistrationSystem((-1));
        register0.runRegistrationSystem((int) (short) 10);
        register0.loginUser("", "");
        register0.loginUser("", "hi!");
        register0.loginUser("", "");
        register0.registerUser("", "");
    }

    @Test
    public void test1206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest2.test1206");
        Register register0 = new Register();
        register0.loginUser("hi!", "hi!");
        register0.registerUser("hi!", "");
        register0.loginUser("hi!", "hi!");
        register0.runRegistrationSystem(100);
        register0.runRegistrationSystem((int) (byte) 1);
        register0.loginUser("", "");
        register0.registerUser("hi!", "hi!");
        register0.registerUser("", "");
    }

    @Test
    public void test1207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest2.test1207");
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
        register0.runRegistrationSystem((int) (short) 100);
        java.lang.Class<?> wildcardClass28 = register0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test1208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest2.test1208");
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
        register0.runRegistrationSystem((int) (short) 10);
    }

    @Test
    public void test1209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest2.test1209");
        Register register0 = new Register();
        register0.runRegistrationSystem((int) (byte) -1);
        register0.registerUser("hi!", "");
        register0.runRegistrationSystem((int) (short) 1);
        register0.loginUser("", "");
        register0.loginUser("hi!", "");
        register0.registerUser("hi!", "hi!");
    }

    @Test
    public void test1210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest2.test1210");
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
        register0.runRegistrationSystem((int) (short) 10);
        register0.runRegistrationSystem((int) '4');
        register0.registerUser("", "");
    }

    @Test
    public void test1211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest2.test1211");
        Register register0 = new Register();
        register0.loginUser("hi!", "hi!");
        register0.registerUser("hi!", "");
        register0.registerUser("hi!", "");
        register0.registerUser("", "hi!");
        register0.loginUser("", "");
        register0.runRegistrationSystem((int) (short) -1);
        register0.loginUser("", "");
        register0.runRegistrationSystem((int) (byte) 100);
        register0.registerUser("", "hi!");
        register0.runRegistrationSystem(10);
        java.lang.Class<?> wildcardClass28 = register0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test1212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest2.test1212");
        Register register0 = new Register();
        register0.loginUser("hi!", "hi!");
        register0.registerUser("hi!", "");
        register0.registerUser("hi!", "");
        register0.registerUser("", "");
        register0.runRegistrationSystem(100);
        register0.registerUser("hi!", "");
        register0.registerUser("", "");
        register0.runRegistrationSystem((int) (byte) 100);
        register0.runRegistrationSystem((int) (byte) 1);
    }

    @Test
    public void test1213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest2.test1213");
        Register register0 = new Register();
        register0.runRegistrationSystem((int) (short) 0);
        register0.loginUser("hi!", "hi!");
        register0.registerUser("", "");
        register0.runRegistrationSystem((int) '#');
        register0.runRegistrationSystem((int) (byte) 0);
        register0.runRegistrationSystem(0);
        register0.registerUser("", "hi!");
        register0.registerUser("", "hi!");
        register0.loginUser("hi!", "");
        register0.runRegistrationSystem((int) (short) -1);
    }

    @Test
    public void test1214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest2.test1214");
        Register register0 = new Register();
        register0.registerUser("hi!", "");
        register0.loginUser("", "hi!");
        register0.runRegistrationSystem((int) (byte) -1);
        register0.runRegistrationSystem(10);
        register0.registerUser("", "hi!");
        register0.loginUser("hi!", "");
        register0.registerUser("hi!", "hi!");
        register0.runRegistrationSystem(1);
    }

    @Test
    public void test1215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest2.test1215");
        Register register0 = new Register();
        register0.registerUser("hi!", "");
        register0.registerUser("hi!", "");
        register0.loginUser("hi!", "hi!");
        register0.runRegistrationSystem((int) (byte) 0);
    }

    @Test
    public void test1216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest2.test1216");
        Register register0 = new Register();
        register0.registerUser("hi!", "");
        register0.runRegistrationSystem(1);
        register0.loginUser("hi!", "");
        register0.runRegistrationSystem((int) (byte) -1);
        register0.registerUser("hi!", "");
    }

    @Test
    public void test1217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest2.test1217");
        Register register0 = new Register();
        register0.runRegistrationSystem((int) '#');
        register0.registerUser("", "hi!");
        register0.runRegistrationSystem((int) (short) 0);
        register0.runRegistrationSystem((int) (byte) 1);
        register0.loginUser("hi!", "hi!");
        java.lang.Class<?> wildcardClass13 = register0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test1218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest2.test1218");
        Register register0 = new Register();
        register0.runRegistrationSystem((int) (short) 0);
        register0.loginUser("hi!", "hi!");
        register0.registerUser("", "");
        register0.runRegistrationSystem((-1));
        register0.runRegistrationSystem((int) (short) 10);
        register0.loginUser("", "");
        register0.loginUser("", "hi!");
        register0.loginUser("", "");
        java.lang.Class<?> wildcardClass22 = register0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test1219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest2.test1219");
        Register register0 = new Register();
        register0.runRegistrationSystem((int) (short) 0);
        register0.loginUser("hi!", "hi!");
        register0.registerUser("", "");
        register0.runRegistrationSystem((int) '#');
        register0.registerUser("", "hi!");
        register0.registerUser("", "hi!");
        register0.registerUser("hi!", "hi!");
        register0.loginUser("hi!", "hi!");
        register0.registerUser("", "");
        java.lang.Class<?> wildcardClass26 = register0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass26);
    }

    @Test
    public void test1220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest2.test1220");
        Register register0 = new Register();
        register0.runRegistrationSystem((int) (byte) -1);
        register0.registerUser("hi!", "");
        register0.loginUser("hi!", "hi!");
        register0.loginUser("hi!", "");
        register0.loginUser("hi!", "");
        register0.registerUser("", "hi!");
        register0.loginUser("hi!", "hi!");
        java.lang.Class<?> wildcardClass21 = register0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test1221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest2.test1221");
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
        java.lang.Class<?> wildcardClass30 = register0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass30);
    }

    @Test
    public void test1222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest2.test1222");
        Register register0 = new Register();
        register0.loginUser("hi!", "hi!");
        register0.runRegistrationSystem(0);
        register0.registerUser("", "");
        register0.loginUser("", "hi!");
        register0.registerUser("", "");
        register0.loginUser("", "");
        register0.loginUser("hi!", "");
        register0.runRegistrationSystem((int) ' ');
        java.lang.Class<?> wildcardClass23 = register0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test1223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest2.test1223");
        Register register0 = new Register();
        register0.runRegistrationSystem((int) (short) 0);
        register0.loginUser("hi!", "hi!");
        register0.registerUser("", "");
        register0.loginUser("", "hi!");
        register0.registerUser("hi!", "");
        register0.registerUser("hi!", "");
        register0.runRegistrationSystem((int) (byte) 1);
        register0.registerUser("", "");
        register0.registerUser("", "hi!");
        register0.registerUser("hi!", "");
    }

    @Test
    public void test1224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest2.test1224");
        Register register0 = new Register();
        register0.runRegistrationSystem((int) (byte) -1);
        register0.runRegistrationSystem((int) (byte) 10);
        register0.registerUser("", "");
        register0.loginUser("", "");
        register0.registerUser("", "hi!");
        register0.registerUser("", "hi!");
        register0.registerUser("hi!", "hi!");
        register0.loginUser("hi!", "");
        register0.runRegistrationSystem((int) (short) 10);
        register0.loginUser("", "");
        register0.registerUser("hi!", "hi!");
    }

    @Test
    public void test1225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest2.test1225");
        Register register0 = new Register();
        register0.runRegistrationSystem((int) '#');
        register0.registerUser("", "hi!");
        register0.runRegistrationSystem((int) (short) 0);
        register0.runRegistrationSystem((int) (byte) 1);
        register0.registerUser("", "");
        register0.runRegistrationSystem((int) (short) 10);
        register0.loginUser("hi!", "");
        register0.registerUser("hi!", "hi!");
        java.lang.Class<?> wildcardClass21 = register0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test1226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest2.test1226");
        Register register0 = new Register();
        register0.loginUser("hi!", "hi!");
        register0.runRegistrationSystem(0);
        register0.runRegistrationSystem(10);
        register0.registerUser("hi!", "");
        register0.registerUser("", "hi!");
        register0.loginUser("hi!", "");
        register0.registerUser("", "hi!");
        register0.runRegistrationSystem((int) (short) 0);
    }

    @Test
    public void test1227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest2.test1227");
        Register register0 = new Register();
        register0.runRegistrationSystem((int) (byte) -1);
        register0.runRegistrationSystem((int) (byte) 10);
        register0.registerUser("", "");
        register0.registerUser("", "hi!");
        register0.runRegistrationSystem((int) '4');
        register0.loginUser("hi!", "");
        register0.runRegistrationSystem((int) '4');
        register0.runRegistrationSystem(0);
        java.lang.Class<?> wildcardClass20 = register0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test1228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest2.test1228");
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
        java.lang.Class<?> wildcardClass33 = register0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass33);
    }

    @Test
    public void test1229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest2.test1229");
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
        register0.runRegistrationSystem((int) (byte) 1);
        register0.loginUser("", "");
        register0.loginUser("", "hi!");
    }

    @Test
    public void test1230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest2.test1230");
        Register register0 = new Register();
        register0.registerUser("hi!", "");
        register0.loginUser("", "hi!");
        register0.runRegistrationSystem((int) 'a');
        register0.loginUser("hi!", "");
        register0.runRegistrationSystem((-1));
        register0.runRegistrationSystem(100);
        register0.runRegistrationSystem((int) (short) 0);
        register0.runRegistrationSystem((int) (byte) 10);
        register0.runRegistrationSystem((int) (short) 100);
    }

    @Test
    public void test1231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest2.test1231");
        Register register0 = new Register();
        register0.runRegistrationSystem((int) '#');
        register0.registerUser("", "hi!");
        register0.registerUser("", "hi!");
        register0.registerUser("", "");
        register0.runRegistrationSystem((int) (byte) 10);
        register0.loginUser("", "hi!");
        register0.loginUser("", "hi!");
    }

    @Test
    public void test1232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest2.test1232");
        Register register0 = new Register();
        register0.runRegistrationSystem((int) (byte) -1);
        register0.runRegistrationSystem((int) (short) 10);
        register0.loginUser("hi!", "");
        register0.runRegistrationSystem((int) 'a');
        register0.registerUser("", "");
    }

    @Test
    public void test1233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest2.test1233");
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
        register0.runRegistrationSystem((int) (short) 10);
    }

    @Test
    public void test1234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest2.test1234");
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
        register0.registerUser("hi!", "hi!");
    }

    @Test
    public void test1235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest2.test1235");
        Register register0 = new Register();
        register0.runRegistrationSystem((int) '#');
        register0.registerUser("", "hi!");
        register0.loginUser("hi!", "hi!");
        register0.runRegistrationSystem(100);
        register0.runRegistrationSystem((int) (short) 10);
        register0.runRegistrationSystem((int) (short) 0);
        register0.loginUser("hi!", "");
        register0.registerUser("", "");
        java.lang.Class<?> wildcardClass21 = register0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test1236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest2.test1236");
        Register register0 = new Register();
        register0.runRegistrationSystem((int) '#');
        register0.registerUser("", "hi!");
        register0.runRegistrationSystem((int) (short) 0);
        register0.runRegistrationSystem((int) (byte) 1);
        register0.runRegistrationSystem((int) 'a');
        register0.registerUser("", "");
        register0.runRegistrationSystem((int) (short) 0);
        register0.loginUser("", "hi!");
    }

    @Test
    public void test1237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest2.test1237");
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
        register0.runRegistrationSystem((int) '4');
        java.lang.Class<?> wildcardClass30 = register0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass30);
    }

    @Test
    public void test1238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest2.test1238");
        Register register0 = new Register();
        register0.loginUser("hi!", "hi!");
        register0.loginUser("hi!", "hi!");
        register0.loginUser("", "hi!");
        register0.registerUser("", "");
        register0.registerUser("", "");
        register0.registerUser("", "hi!");
    }

    @Test
    public void test1239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest2.test1239");
        Register register0 = new Register();
        register0.registerUser("hi!", "");
        register0.loginUser("", "hi!");
        register0.runRegistrationSystem((int) 'a');
        register0.loginUser("hi!", "");
        register0.runRegistrationSystem((int) (byte) 1);
        register0.loginUser("hi!", "hi!");
        register0.registerUser("hi!", "");
        register0.loginUser("", "");
        register0.runRegistrationSystem((int) '4');
    }

    @Test
    public void test1240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest2.test1240");
        Register register0 = new Register();
        register0.runRegistrationSystem((int) (byte) -1);
        register0.runRegistrationSystem((int) (short) 10);
        register0.runRegistrationSystem((int) (short) -1);
        register0.runRegistrationSystem((int) (short) -1);
        register0.loginUser("", "hi!");
        register0.runRegistrationSystem((int) '#');
        register0.registerUser("", "hi!");
        register0.runRegistrationSystem((int) (byte) 0);
    }

    @Test
    public void test1241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest2.test1241");
        Register register0 = new Register();
        register0.registerUser("", "hi!");
        register0.loginUser("hi!", "hi!");
        register0.registerUser("", "hi!");
        java.lang.Class<?> wildcardClass10 = register0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test1242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest2.test1242");
        Register register0 = new Register();
        register0.loginUser("hi!", "hi!");
        register0.runRegistrationSystem(0);
        register0.registerUser("", "");
        register0.runRegistrationSystem((-1));
        register0.registerUser("", "");
        register0.loginUser("", "hi!");
        register0.registerUser("", "hi!");
        register0.registerUser("", "");
        register0.registerUser("", "hi!");
        register0.loginUser("hi!", "hi!");
    }

    @Test
    public void test1243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest2.test1243");
        Register register0 = new Register();
        register0.runRegistrationSystem((int) (byte) -1);
        register0.runRegistrationSystem((int) (byte) 10);
        register0.registerUser("", "");
        register0.loginUser("", "");
        register0.runRegistrationSystem((int) (byte) 0);
        register0.registerUser("", "");
        register0.registerUser("", "");
    }

    @Test
    public void test1244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest2.test1244");
        Register register0 = new Register();
        register0.loginUser("hi!", "hi!");
        register0.registerUser("hi!", "");
        register0.loginUser("hi!", "hi!");
        register0.registerUser("", "");
        register0.loginUser("", "hi!");
        register0.registerUser("hi!", "");
        java.lang.Class<?> wildcardClass19 = register0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test1245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest2.test1245");
        Register register0 = new Register();
        register0.runRegistrationSystem((int) '#');
        register0.loginUser("hi!", "hi!");
        register0.registerUser("", "");
        register0.registerUser("hi!", "");
        register0.runRegistrationSystem((int) (byte) 10);
        register0.loginUser("", "hi!");
        java.lang.Class<?> wildcardClass17 = register0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test1246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest2.test1246");
        Register register0 = new Register();
        register0.runRegistrationSystem((int) (short) 0);
        register0.loginUser("hi!", "hi!");
        register0.registerUser("", "");
        register0.runRegistrationSystem((int) '#');
        register0.registerUser("", "hi!");
        register0.runRegistrationSystem((int) (short) 1);
        register0.runRegistrationSystem((int) 'a');
        register0.registerUser("hi!", "hi!");
        java.lang.Class<?> wildcardClass21 = register0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test1247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest2.test1247");
        Register register0 = new Register();
        register0.loginUser("hi!", "hi!");
        register0.registerUser("hi!", "");
        register0.registerUser("hi!", "");
        register0.registerUser("", "hi!");
        register0.loginUser("", "");
        register0.runRegistrationSystem((int) (byte) 100);
        register0.runRegistrationSystem((int) '#');
        register0.registerUser("", "");
        java.lang.Class<?> wildcardClass23 = register0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test1248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest2.test1248");
        Register register0 = new Register();
        register0.loginUser("hi!", "hi!");
        register0.runRegistrationSystem(0);
        register0.loginUser("", "hi!");
        register0.registerUser("", "hi!");
        register0.registerUser("", "hi!");
    }

    @Test
    public void test1249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest2.test1249");
        Register register0 = new Register();
        register0.runRegistrationSystem((int) '#');
        register0.registerUser("", "hi!");
        register0.runRegistrationSystem((int) (short) 0);
        register0.runRegistrationSystem((int) (byte) 1);
        register0.loginUser("", "hi!");
        register0.registerUser("", "hi!");
        register0.registerUser("", "");
        register0.registerUser("", "");
        register0.runRegistrationSystem((int) (byte) 0);
    }

    @Test
    public void test1250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest2.test1250");
        Register register0 = new Register();
        register0.loginUser("hi!", "hi!");
        register0.runRegistrationSystem(0);
        register0.registerUser("", "");
        register0.loginUser("", "hi!");
        register0.loginUser("hi!", "hi!");
        register0.registerUser("hi!", "hi!");
        java.lang.Class<?> wildcardClass18 = register0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test1251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest2.test1251");
        Register register0 = new Register();
        register0.loginUser("hi!", "hi!");
        register0.registerUser("hi!", "");
        register0.loginUser("hi!", "hi!");
        register0.runRegistrationSystem(100);
        register0.registerUser("hi!", "");
        register0.runRegistrationSystem((int) (short) -1);
        register0.loginUser("", "");
        register0.loginUser("", "");
        register0.registerUser("", "");
    }

    @Test
    public void test1252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest2.test1252");
        Register register0 = new Register();
        register0.loginUser("hi!", "hi!");
        register0.registerUser("hi!", "");
        register0.registerUser("hi!", "");
        register0.registerUser("", "hi!");
        register0.loginUser("", "");
        register0.runRegistrationSystem((int) (short) -1);
        register0.loginUser("", "");
        register0.runRegistrationSystem((int) (byte) 100);
        register0.registerUser("", "hi!");
        register0.runRegistrationSystem(10);
        register0.runRegistrationSystem((int) (short) 100);
    }

    @Test
    public void test1253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest2.test1253");
        Register register0 = new Register();
        register0.loginUser("hi!", "hi!");
        register0.runRegistrationSystem(0);
        register0.registerUser("", "");
        register0.runRegistrationSystem((-1));
        register0.loginUser("", "");
        register0.registerUser("hi!", "hi!");
        register0.registerUser("", "");
        register0.registerUser("", "");
        register0.runRegistrationSystem((int) (byte) 0);
        register0.runRegistrationSystem((int) ' ');
    }

    @Test
    public void test1254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest2.test1254");
        Register register0 = new Register();
        register0.runRegistrationSystem((int) (byte) -1);
        register0.registerUser("hi!", "");
        register0.runRegistrationSystem((int) (short) 1);
        register0.loginUser("", "");
        register0.loginUser("", "hi!");
        register0.loginUser("hi!", "hi!");
        register0.loginUser("", "");
        register0.runRegistrationSystem(10);
    }

    @Test
    public void test1255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest2.test1255");
        Register register0 = new Register();
        register0.runRegistrationSystem((int) (byte) -1);
        register0.runRegistrationSystem((int) '#');
        register0.registerUser("hi!", "hi!");
        register0.registerUser("hi!", "hi!");
        java.lang.Class<?> wildcardClass11 = register0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test1256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest2.test1256");
        Register register0 = new Register();
        register0.loginUser("hi!", "hi!");
        register0.registerUser("hi!", "");
        register0.registerUser("", "");
        register0.registerUser("", "hi!");
        register0.registerUser("", "");
        register0.registerUser("", "");
        register0.loginUser("hi!", "hi!");
    }

    @Test
    public void test1257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest2.test1257");
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
        register0.registerUser("", "");
        java.lang.Class<?> wildcardClass37 = register0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass37);
    }

    @Test
    public void test1258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest2.test1258");
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
        java.lang.Class<?> wildcardClass31 = register0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test1259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest2.test1259");
        Register register0 = new Register();
        register0.runRegistrationSystem((int) (short) 0);
        register0.loginUser("hi!", "hi!");
        register0.registerUser("", "");
        register0.runRegistrationSystem((-1));
        register0.runRegistrationSystem((int) (byte) -1);
        java.lang.Class<?> wildcardClass13 = register0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test1260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest2.test1260");
        Register register0 = new Register();
        register0.loginUser("hi!", "hi!");
        register0.runRegistrationSystem(0);
        register0.loginUser("", "hi!");
        register0.runRegistrationSystem((int) (byte) -1);
    }

    @Test
    public void test1261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest2.test1261");
        Register register0 = new Register();
        register0.loginUser("hi!", "hi!");
        register0.registerUser("hi!", "");
        register0.registerUser("", "");
        register0.registerUser("hi!", "");
        register0.registerUser("hi!", "");
        register0.runRegistrationSystem((int) (short) 10);
        register0.loginUser("", "");
        register0.runRegistrationSystem((int) (short) 0);
        register0.loginUser("", "");
        register0.loginUser("hi!", "");
    }

    @Test
    public void test1262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest2.test1262");
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
        register0.runRegistrationSystem(100);
    }

    @Test
    public void test1263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest2.test1263");
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
        register0.registerUser("", "hi!");
        java.lang.Class<?> wildcardClass29 = register0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass29);
    }

    @Test
    public void test1264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest2.test1264");
        Register register0 = new Register();
        register0.runRegistrationSystem((int) (byte) -1);
        register0.runRegistrationSystem((int) (byte) 10);
        register0.registerUser("", "");
        register0.registerUser("", "hi!");
        register0.runRegistrationSystem((int) '4');
        register0.loginUser("hi!", "");
        java.lang.Class<?> wildcardClass16 = register0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test1265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest2.test1265");
        Register register0 = new Register();
        register0.runRegistrationSystem((int) '#');
        register0.loginUser("hi!", "hi!");
        register0.runRegistrationSystem((int) (short) 100);
    }

    @Test
    public void test1266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest2.test1266");
        Register register0 = new Register();
        register0.runRegistrationSystem((int) (byte) -1);
        register0.runRegistrationSystem((int) (short) 10);
        register0.runRegistrationSystem((int) '4');
    }

    @Test
    public void test1267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest2.test1267");
        Register register0 = new Register();
        register0.registerUser("hi!", "");
        register0.loginUser("", "");
        register0.runRegistrationSystem((int) 'a');
        register0.runRegistrationSystem((int) (short) 100);
        register0.runRegistrationSystem((int) (short) -1);
        register0.loginUser("", "");
        register0.loginUser("hi!", "");
    }

    @Test
    public void test1268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest2.test1268");
        Register register0 = new Register();
        register0.runRegistrationSystem((int) (short) 0);
        register0.loginUser("hi!", "hi!");
        register0.registerUser("", "");
        register0.runRegistrationSystem((-1));
        register0.runRegistrationSystem((int) (short) 0);
        register0.loginUser("hi!", "");
        register0.loginUser("hi!", "");
        register0.runRegistrationSystem((int) '4');
    }

    @Test
    public void test1269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest2.test1269");
        Register register0 = new Register();
        register0.registerUser("hi!", "");
        register0.loginUser("", "");
        register0.runRegistrationSystem((int) 'a');
        register0.registerUser("", "");
        register0.registerUser("hi!", "hi!");
        register0.registerUser("", "");
        register0.loginUser("hi!", "");
        register0.registerUser("hi!", "");
        java.lang.Class<?> wildcardClass24 = register0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test1270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest2.test1270");
        Register register0 = new Register();
        register0.runRegistrationSystem((int) (byte) -1);
        register0.registerUser("hi!", "");
        register0.loginUser("hi!", "hi!");
        register0.runRegistrationSystem((int) (byte) 1);
        register0.registerUser("hi!", "hi!");
        register0.runRegistrationSystem((int) '#');
        java.lang.Class<?> wildcardClass16 = register0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test1271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest2.test1271");
        Register register0 = new Register();
        register0.loginUser("hi!", "hi!");
        register0.loginUser("", "hi!");
        register0.loginUser("", "");
        java.lang.Class<?> wildcardClass10 = register0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test1272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest2.test1272");
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
        register0.registerUser("", "");
    }

    @Test
    public void test1273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest2.test1273");
        Register register0 = new Register();
        register0.loginUser("hi!", "hi!");
        register0.registerUser("hi!", "");
        register0.registerUser("", "");
        register0.registerUser("", "hi!");
        register0.runRegistrationSystem((int) (short) 100);
        register0.runRegistrationSystem((int) (byte) 10);
        register0.runRegistrationSystem(0);
        register0.loginUser("", "hi!");
        register0.runRegistrationSystem((int) (byte) -1);
        register0.registerUser("hi!", "hi!");
    }

    @Test
    public void test1274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest2.test1274");
        Register register0 = new Register();
        register0.runRegistrationSystem((int) (byte) -1);
        register0.runRegistrationSystem((int) (byte) 10);
        register0.registerUser("", "");
        register0.loginUser("", "");
        register0.registerUser("", "hi!");
        register0.registerUser("", "hi!");
        register0.registerUser("hi!", "hi!");
        register0.loginUser("hi!", "");
        register0.runRegistrationSystem((int) (short) 10);
        register0.loginUser("", "");
        register0.runRegistrationSystem(0);
        register0.loginUser("hi!", "");
    }

    @Test
    public void test1275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest2.test1275");
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
        register0.runRegistrationSystem((int) 'a');
    }

    @Test
    public void test1276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest2.test1276");
        Register register0 = new Register();
        register0.registerUser("hi!", "");
        register0.loginUser("", "hi!");
        register0.runRegistrationSystem((int) (byte) -1);
        register0.loginUser("", "");
        register0.runRegistrationSystem((-1));
        register0.loginUser("", "");
        register0.runRegistrationSystem((int) (short) 10);
        register0.runRegistrationSystem((int) 'a');
    }

    @Test
    public void test1277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest2.test1277");
        Register register0 = new Register();
        register0.runRegistrationSystem((int) (short) 0);
        register0.loginUser("hi!", "hi!");
        register0.loginUser("", "");
        register0.registerUser("", "hi!");
        register0.runRegistrationSystem(10);
    }

    @Test
    public void test1278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest2.test1278");
        Register register0 = new Register();
        register0.runRegistrationSystem((int) (byte) -1);
        register0.runRegistrationSystem((int) (short) 10);
        register0.runRegistrationSystem((int) (short) -1);
        register0.runRegistrationSystem((int) (short) 1);
        register0.runRegistrationSystem(0);
    }

    @Test
    public void test1279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest2.test1279");
        Register register0 = new Register();
        register0.runRegistrationSystem((int) (short) 0);
        register0.loginUser("hi!", "hi!");
        register0.registerUser("", "");
        register0.runRegistrationSystem((int) '#');
        register0.registerUser("", "hi!");
        register0.registerUser("", "hi!");
        register0.registerUser("", "");
        register0.runRegistrationSystem((int) (byte) 0);
        register0.loginUser("", "");
        java.lang.Class<?> wildcardClass25 = register0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test1280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest2.test1280");
        Register register0 = new Register();
        register0.registerUser("hi!", "");
        register0.loginUser("", "hi!");
        register0.loginUser("", "hi!");
        register0.runRegistrationSystem(10);
        register0.loginUser("", "");
        register0.loginUser("", "hi!");
        register0.loginUser("", "hi!");
        register0.registerUser("hi!", "");
    }

    @Test
    public void test1281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest2.test1281");
        Register register0 = new Register();
        register0.runRegistrationSystem((int) (short) 0);
        register0.loginUser("hi!", "hi!");
        register0.registerUser("", "");
        register0.runRegistrationSystem((-1));
        register0.runRegistrationSystem((int) (byte) 0);
        register0.registerUser("", "hi!");
        java.lang.Class<?> wildcardClass16 = register0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test1282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest2.test1282");
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
        java.lang.Class<?> wildcardClass32 = register0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass32);
    }

    @Test
    public void test1283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest2.test1283");
        Register register0 = new Register();
        register0.runRegistrationSystem((int) (short) 0);
        register0.loginUser("hi!", "hi!");
        register0.registerUser("", "");
        register0.loginUser("", "hi!");
        register0.registerUser("hi!", "");
        register0.loginUser("", "hi!");
        register0.runRegistrationSystem((int) (short) -1);
    }

    @Test
    public void test1284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest2.test1284");
        Register register0 = new Register();
        register0.runRegistrationSystem((int) (byte) -1);
        register0.runRegistrationSystem((int) (short) 10);
        register0.runRegistrationSystem((int) (byte) -1);
        register0.runRegistrationSystem(10);
        register0.registerUser("", "");
        register0.registerUser("", "hi!");
        register0.runRegistrationSystem((int) (byte) 1);
        register0.runRegistrationSystem((int) 'a');
        register0.runRegistrationSystem((int) (short) 10);
    }

    @Test
    public void test1285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest2.test1285");
        Register register0 = new Register();
        register0.registerUser("hi!", "");
        register0.registerUser("hi!", "");
        register0.loginUser("hi!", "");
        register0.loginUser("", "hi!");
        register0.loginUser("hi!", "");
        register0.loginUser("hi!", "");
        register0.loginUser("", "");
        java.lang.Class<?> wildcardClass22 = register0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test1286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest2.test1286");
        Register register0 = new Register();
        register0.runRegistrationSystem((int) (byte) -1);
        register0.registerUser("hi!", "");
        register0.runRegistrationSystem((int) (short) 1);
        register0.loginUser("", "hi!");
        register0.registerUser("hi!", "hi!");
        register0.registerUser("hi!", "");
        register0.runRegistrationSystem((int) (short) 100);
        java.lang.Class<?> wildcardClass19 = register0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test1287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest2.test1287");
        Register register0 = new Register();
        register0.registerUser("hi!", "");
        register0.registerUser("hi!", "");
        register0.loginUser("hi!", "hi!");
        register0.loginUser("hi!", "");
        register0.registerUser("hi!", "");
        register0.runRegistrationSystem(0);
        java.lang.Class<?> wildcardClass18 = register0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test1288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest2.test1288");
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
        java.lang.Class<?> wildcardClass28 = register0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test1289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest2.test1289");
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
        register0.runRegistrationSystem((int) (short) 10);
        java.lang.Class<?> wildcardClass27 = register0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test1290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest2.test1290");
        Register register0 = new Register();
        register0.loginUser("hi!", "hi!");
        register0.runRegistrationSystem(0);
        register0.loginUser("", "hi!");
        register0.loginUser("hi!", "");
    }

    @Test
    public void test1291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest2.test1291");
        Register register0 = new Register();
        register0.loginUser("hi!", "hi!");
        register0.registerUser("hi!", "");
        register0.runRegistrationSystem(0);
    }

    @Test
    public void test1292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest2.test1292");
        Register register0 = new Register();
        register0.loginUser("hi!", "hi!");
        register0.registerUser("hi!", "");
        register0.registerUser("", "");
        register0.registerUser("", "hi!");
        register0.runRegistrationSystem((int) (short) 100);
        register0.runRegistrationSystem((int) (byte) 1);
        register0.loginUser("", "");
        register0.registerUser("hi!", "");
        register0.loginUser("", "hi!");
        register0.registerUser("", "");
    }

    @Test
    public void test1293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest2.test1293");
        Register register0 = new Register();
        register0.loginUser("hi!", "hi!");
        register0.registerUser("hi!", "");
        register0.registerUser("", "");
        register0.registerUser("hi!", "");
        register0.registerUser("hi!", "");
        register0.runRegistrationSystem((int) (short) 10);
        register0.loginUser("", "");
        register0.runRegistrationSystem((int) (short) 0);
        register0.loginUser("", "");
        register0.runRegistrationSystem((int) (byte) -1);
        register0.runRegistrationSystem((int) ' ');
    }

    @Test
    public void test1294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest2.test1294");
        Register register0 = new Register();
        register0.runRegistrationSystem((int) '#');
        register0.runRegistrationSystem((int) (short) 100);
        register0.runRegistrationSystem((int) '4');
        register0.loginUser("hi!", "");
        register0.registerUser("hi!", "hi!");
        register0.loginUser("", "");
        register0.registerUser("", "");
    }

    @Test
    public void test1295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest2.test1295");
        Register register0 = new Register();
        register0.runRegistrationSystem((int) (short) 0);
        register0.loginUser("hi!", "hi!");
        register0.registerUser("", "");
        register0.runRegistrationSystem((-1));
        register0.runRegistrationSystem((int) (short) 0);
        register0.loginUser("hi!", "");
        register0.runRegistrationSystem((int) (byte) -1);
        register0.loginUser("", "hi!");
        java.lang.Class<?> wildcardClass21 = register0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test1296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest2.test1296");
        Register register0 = new Register();
        register0.loginUser("hi!", "hi!");
        register0.registerUser("hi!", "");
        register0.registerUser("hi!", "");
        register0.registerUser("", "hi!");
        register0.loginUser("", "");
        register0.runRegistrationSystem((int) (short) 10);
        register0.registerUser("hi!", "hi!");
        register0.runRegistrationSystem(0);
        java.lang.Class<?> wildcardClass23 = register0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test1297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest2.test1297");
        Register register0 = new Register();
        register0.registerUser("hi!", "");
        register0.loginUser("", "hi!");
        register0.loginUser("", "hi!");
        register0.runRegistrationSystem(10);
        register0.loginUser("", "");
        register0.registerUser("hi!", "hi!");
        java.lang.Class<?> wildcardClass18 = register0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test1298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest2.test1298");
        Register register0 = new Register();
        register0.runRegistrationSystem((int) '#');
        register0.registerUser("", "hi!");
        register0.runRegistrationSystem((int) (short) 0);
        register0.runRegistrationSystem((int) (byte) 1);
        register0.runRegistrationSystem((int) 'a');
        register0.runRegistrationSystem(0);
        register0.runRegistrationSystem((int) (short) 10);
        register0.registerUser("", "");
        register0.runRegistrationSystem((int) 'a');
        register0.runRegistrationSystem((-1));
    }

    @Test
    public void test1299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest2.test1299");
        Register register0 = new Register();
        register0.registerUser("hi!", "");
        register0.loginUser("", "hi!");
        register0.loginUser("", "hi!");
        register0.runRegistrationSystem(10);
        register0.runRegistrationSystem((-1));
        register0.runRegistrationSystem((int) (short) 1);
        register0.loginUser("hi!", "");
    }

    @Test
    public void test1300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest2.test1300");
        Register register0 = new Register();
        register0.runRegistrationSystem((int) (byte) -1);
        register0.runRegistrationSystem((int) (short) 10);
        register0.runRegistrationSystem((int) (byte) 100);
        register0.runRegistrationSystem(10);
        register0.registerUser("", "hi!");
        register0.runRegistrationSystem(0);
        register0.loginUser("hi!", "");
        register0.registerUser("", "hi!");
    }

    @Test
    public void test1301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest2.test1301");
        Register register0 = new Register();
        register0.registerUser("hi!", "");
        register0.registerUser("hi!", "");
        register0.loginUser("hi!", "");
        register0.loginUser("hi!", "");
        register0.runRegistrationSystem(10);
        register0.registerUser("", "");
        register0.registerUser("", "");
        register0.registerUser("", "hi!");
        java.lang.Class<?> wildcardClass24 = register0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test1302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest2.test1302");
        Register register0 = new Register();
        register0.runRegistrationSystem((int) '#');
        register0.loginUser("hi!", "hi!");
        register0.registerUser("", "");
        register0.loginUser("", "hi!");
        register0.loginUser("", "");
        register0.registerUser("", "");
        java.lang.Class<?> wildcardClass18 = register0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test1303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest2.test1303");
        Register register0 = new Register();
        register0.runRegistrationSystem((int) '#');
        register0.registerUser("", "hi!");
        register0.loginUser("hi!", "hi!");
        register0.loginUser("", "hi!");
        register0.runRegistrationSystem((int) (byte) 1);
        register0.runRegistrationSystem(10);
        register0.registerUser("", "");
        register0.loginUser("", "");
        register0.loginUser("", "");
    }

    @Test
    public void test1304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest2.test1304");
        Register register0 = new Register();
        register0.loginUser("hi!", "hi!");
        register0.runRegistrationSystem(0);
        register0.registerUser("", "");
        register0.runRegistrationSystem((-1));
        register0.registerUser("", "");
        register0.loginUser("", "hi!");
        java.lang.Class<?> wildcardClass17 = register0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test1305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest2.test1305");
        Register register0 = new Register();
        register0.loginUser("hi!", "hi!");
        register0.registerUser("hi!", "");
        register0.registerUser("", "");
        register0.registerUser("", "");
        register0.loginUser("hi!", "hi!");
        register0.loginUser("", "");
        register0.registerUser("hi!", "hi!");
        register0.registerUser("hi!", "hi!");
    }

    @Test
    public void test1306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest2.test1306");
        Register register0 = new Register();
        register0.runRegistrationSystem((int) (short) 0);
        register0.loginUser("hi!", "hi!");
        register0.loginUser("", "");
        register0.loginUser("", "hi!");
        register0.registerUser("", "");
    }

    @Test
    public void test1307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest2.test1307");
        Register register0 = new Register();
        register0.runRegistrationSystem((int) (short) 0);
        register0.loginUser("hi!", "hi!");
        register0.registerUser("", "");
        register0.runRegistrationSystem((-1));
        register0.registerUser("", "hi!");
        register0.registerUser("hi!", "");
        register0.runRegistrationSystem(10);
        register0.registerUser("hi!", "hi!");
        register0.loginUser("", "");
    }

    @Test
    public void test1308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest2.test1308");
        Register register0 = new Register();
        register0.registerUser("hi!", "");
        register0.runRegistrationSystem(1);
        register0.registerUser("", "");
        register0.runRegistrationSystem((int) (short) 10);
        register0.loginUser("", "hi!");
        java.lang.Class<?> wildcardClass14 = register0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test1309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest2.test1309");
        Register register0 = new Register();
        register0.registerUser("hi!", "");
        register0.loginUser("", "");
        register0.runRegistrationSystem((int) 'a');
        register0.loginUser("", "");
        register0.runRegistrationSystem((int) (byte) 1);
        register0.loginUser("", "");
    }

    @Test
    public void test1310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest2.test1310");
        Register register0 = new Register();
        register0.loginUser("hi!", "hi!");
        register0.registerUser("hi!", "");
        register0.registerUser("", "");
        register0.registerUser("", "hi!");
        register0.registerUser("", "");
        register0.registerUser("", "");
        register0.loginUser("", "hi!");
    }

    @Test
    public void test1311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest2.test1311");
        Register register0 = new Register();
        register0.loginUser("hi!", "hi!");
        register0.runRegistrationSystem(0);
        register0.loginUser("hi!", "");
        register0.loginUser("", "hi!");
        register0.registerUser("", "");
        java.lang.Class<?> wildcardClass15 = register0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test1312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest2.test1312");
        Register register0 = new Register();
        register0.runRegistrationSystem((int) '#');
        register0.registerUser("", "hi!");
        register0.registerUser("", "hi!");
        register0.runRegistrationSystem((int) '4');
    }

    @Test
    public void test1313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest2.test1313");
        Register register0 = new Register();
        register0.registerUser("hi!", "");
        register0.registerUser("hi!", "");
        register0.loginUser("hi!", "");
        register0.loginUser("hi!", "");
        register0.loginUser("", "hi!");
        register0.loginUser("hi!", "");
        register0.runRegistrationSystem((int) (short) -1);
        register0.registerUser("", "");
    }

    @Test
    public void test1314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest2.test1314");
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
        register0.registerUser("", "hi!");
    }

    @Test
    public void test1315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest2.test1315");
        Register register0 = new Register();
        register0.runRegistrationSystem((int) (short) 0);
        register0.loginUser("hi!", "hi!");
        register0.registerUser("", "");
        register0.runRegistrationSystem((-1));
        register0.runRegistrationSystem((int) (short) 0);
        register0.registerUser("", "");
        register0.runRegistrationSystem((int) (byte) 0);
        register0.runRegistrationSystem((int) '#');
        register0.loginUser("hi!", "hi!");
    }

    @Test
    public void test1316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest2.test1316");
        Register register0 = new Register();
        register0.runRegistrationSystem((int) (byte) -1);
        register0.runRegistrationSystem((int) (short) 10);
        register0.loginUser("hi!", "");
        register0.registerUser("", "hi!");
        register0.registerUser("hi!", "hi!");
        register0.runRegistrationSystem(0);
        java.lang.Class<?> wildcardClass16 = register0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test1317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest2.test1317");
        Register register0 = new Register();
        register0.loginUser("hi!", "hi!");
        register0.runRegistrationSystem((-1));
    }

    @Test
    public void test1318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest2.test1318");
        Register register0 = new Register();
        register0.registerUser("hi!", "");
        register0.registerUser("hi!", "");
        register0.loginUser("hi!", "");
        register0.loginUser("", "hi!");
        register0.loginUser("hi!", "");
        register0.loginUser("", "hi!");
        java.lang.Class<?> wildcardClass19 = register0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test1319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest2.test1319");
        Register register0 = new Register();
        register0.registerUser("hi!", "");
        register0.loginUser("", "hi!");
        register0.runRegistrationSystem((int) '#');
        register0.loginUser("", "hi!");
        java.lang.Class<?> wildcardClass12 = register0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test1320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest2.test1320");
        Register register0 = new Register();
        register0.registerUser("hi!", "");
        register0.registerUser("hi!", "");
        register0.loginUser("hi!", "");
        register0.loginUser("hi!", "");
        register0.loginUser("", "hi!");
        register0.runRegistrationSystem((int) 'a');
        register0.runRegistrationSystem((int) (byte) 0);
    }

    @Test
    public void test1321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest2.test1321");
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
        register0.registerUser("", "hi!");
    }

    @Test
    public void test1322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest2.test1322");
        Register register0 = new Register();
        register0.registerUser("hi!", "");
        register0.loginUser("", "");
        register0.runRegistrationSystem((int) 'a');
        register0.runRegistrationSystem((int) (short) 100);
        register0.registerUser("hi!", "");
        java.lang.Class<?> wildcardClass14 = register0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test1323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest2.test1323");
        Register register0 = new Register();
        register0.registerUser("hi!", "");
        register0.registerUser("hi!", "");
        register0.runRegistrationSystem((int) (byte) 0);
        register0.runRegistrationSystem((int) '4');
    }

    @Test
    public void test1324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest2.test1324");
        Register register0 = new Register();
        register0.registerUser("hi!", "");
        register0.registerUser("hi!", "");
        register0.loginUser("hi!", "");
        register0.loginUser("hi!", "");
        register0.runRegistrationSystem(10);
        register0.loginUser("", "");
        register0.loginUser("", "");
        java.lang.Class<?> wildcardClass21 = register0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test1325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest2.test1325");
        Register register0 = new Register();
        register0.loginUser("hi!", "hi!");
        register0.runRegistrationSystem(0);
        register0.registerUser("", "");
        register0.registerUser("", "hi!");
        register0.loginUser("hi!", "");
        register0.runRegistrationSystem((int) 'a');
    }

    @Test
    public void test1326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest2.test1326");
        Register register0 = new Register();
        register0.loginUser("hi!", "hi!");
        register0.runRegistrationSystem(0);
        register0.registerUser("", "");
        register0.loginUser("", "hi!");
        register0.registerUser("", "");
        register0.loginUser("", "");
        register0.runRegistrationSystem((int) (short) 1);
        register0.loginUser("hi!", "hi!");
        java.lang.Class<?> wildcardClass23 = register0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test1327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest2.test1327");
        Register register0 = new Register();
        register0.registerUser("hi!", "");
        register0.loginUser("", "");
        register0.runRegistrationSystem((int) 'a');
        register0.registerUser("", "");
        register0.registerUser("hi!", "hi!");
        register0.registerUser("", "");
        register0.registerUser("", "");
        register0.runRegistrationSystem((int) (short) 10);
        register0.runRegistrationSystem((int) '4');
    }

    @Test
    public void test1328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest2.test1328");
        Register register0 = new Register();
        register0.runRegistrationSystem((int) (byte) -1);
        register0.runRegistrationSystem((int) (short) 10);
        register0.runRegistrationSystem((int) (short) -1);
        register0.runRegistrationSystem((int) (short) 1);
        register0.runRegistrationSystem((int) (short) 0);
        register0.registerUser("hi!", "");
    }

    @Test
    public void test1329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest2.test1329");
        Register register0 = new Register();
        register0.registerUser("hi!", "");
        register0.loginUser("", "hi!");
        register0.loginUser("", "hi!");
        register0.runRegistrationSystem(10);
        register0.runRegistrationSystem((-1));
        register0.runRegistrationSystem((int) (short) 1);
        register0.loginUser("", "");
    }

    @Test
    public void test1330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest2.test1330");
        Register register0 = new Register();
        register0.registerUser("hi!", "");
        register0.registerUser("hi!", "");
        register0.loginUser("hi!", "");
        register0.loginUser("hi!", "");
        register0.registerUser("", "");
        register0.loginUser("hi!", "");
    }

    @Test
    public void test1331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest2.test1331");
        Register register0 = new Register();
        register0.loginUser("hi!", "hi!");
        register0.loginUser("", "hi!");
        register0.loginUser("", "");
        register0.runRegistrationSystem((int) (byte) 10);
        register0.registerUser("", "");
        register0.loginUser("hi!", "hi!");
    }

    @Test
    public void test1332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest2.test1332");
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
        register0.runRegistrationSystem(0);
        register0.runRegistrationSystem(100);
    }

    @Test
    public void test1333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest2.test1333");
        Register register0 = new Register();
        register0.runRegistrationSystem((int) '#');
        register0.registerUser("", "hi!");
        register0.registerUser("", "hi!");
        register0.registerUser("", "");
        register0.runRegistrationSystem((int) (byte) 10);
        register0.runRegistrationSystem((int) (short) 100);
        register0.runRegistrationSystem((int) (short) 1);
        register0.runRegistrationSystem(0);
        register0.registerUser("hi!", "");
    }

    @Test
    public void test1334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest2.test1334");
        Register register0 = new Register();
        register0.runRegistrationSystem((int) (byte) -1);
        register0.registerUser("hi!", "");
        register0.runRegistrationSystem(0);
        register0.loginUser("", "hi!");
        java.lang.Class<?> wildcardClass11 = register0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test1335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest2.test1335");
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
        java.lang.Class<?> wildcardClass26 = register0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass26);
    }

    @Test
    public void test1336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest2.test1336");
        Register register0 = new Register();
        register0.loginUser("hi!", "hi!");
        register0.registerUser("hi!", "");
        register0.registerUser("hi!", "");
        register0.loginUser("", "hi!");
        register0.registerUser("", "hi!");
        register0.loginUser("hi!", "");
        register0.loginUser("hi!", "hi!");
    }

    @Test
    public void test1337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest2.test1337");
        Register register0 = new Register();
        register0.registerUser("hi!", "");
        register0.loginUser("", "hi!");
        register0.runRegistrationSystem((int) 'a');
        register0.registerUser("", "");
        register0.runRegistrationSystem((int) (short) 0);
        register0.registerUser("", "hi!");
    }

    @Test
    public void test1338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest2.test1338");
        Register register0 = new Register();
        register0.loginUser("hi!", "hi!");
        register0.registerUser("hi!", "");
        register0.registerUser("", "");
        register0.registerUser("hi!", "");
        register0.registerUser("hi!", "");
        register0.registerUser("", "");
        register0.loginUser("", "");
        register0.runRegistrationSystem((int) (short) 10);
        register0.loginUser("hi!", "");
        register0.loginUser("", "");
    }

    @Test
    public void test1339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest2.test1339");
        Register register0 = new Register();
        register0.runRegistrationSystem((int) (byte) -1);
        register0.registerUser("hi!", "");
        register0.registerUser("", "hi!");
        register0.registerUser("", "");
        register0.registerUser("hi!", "hi!");
    }

    @Test
    public void test1340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest2.test1340");
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
        java.lang.Class<?> wildcardClass29 = register0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass29);
    }

    @Test
    public void test1341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest2.test1341");
        Register register0 = new Register();
        register0.registerUser("", "hi!");
        java.lang.Class<?> wildcardClass4 = register0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test1342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest2.test1342");
        Register register0 = new Register();
        register0.runRegistrationSystem((int) '#');
        register0.loginUser("hi!", "hi!");
        register0.runRegistrationSystem((int) (byte) 10);
        register0.registerUser("hi!", "");
        register0.registerUser("hi!", "hi!");
        register0.registerUser("", "");
        register0.runRegistrationSystem((int) '4');
        register0.loginUser("", "");
    }

    @Test
    public void test1343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest2.test1343");
        Register register0 = new Register();
        register0.registerUser("hi!", "");
        register0.loginUser("", "hi!");
        register0.runRegistrationSystem((int) (byte) -1);
        register0.loginUser("", "");
        register0.runRegistrationSystem((int) (short) 100);
        register0.loginUser("", "hi!");
        register0.runRegistrationSystem((int) (short) 0);
        register0.runRegistrationSystem((int) (byte) -1);
        register0.runRegistrationSystem((int) (byte) 1);
    }

    @Test
    public void test1344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest2.test1344");
        Register register0 = new Register();
        register0.registerUser("hi!", "");
        register0.loginUser("hi!", "hi!");
        register0.runRegistrationSystem((int) '#');
        register0.loginUser("hi!", "hi!");
        java.lang.Class<?> wildcardClass12 = register0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test1345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest2.test1345");
        Register register0 = new Register();
        register0.runRegistrationSystem((int) (short) 0);
        register0.loginUser("hi!", "hi!");
        register0.registerUser("", "");
        register0.runRegistrationSystem((-1));
        register0.runRegistrationSystem((int) (short) 0);
        register0.registerUser("hi!", "hi!");
        java.lang.Class<?> wildcardClass16 = register0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test1346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest2.test1346");
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
        register0.runRegistrationSystem((int) '#');
    }

    @Test
    public void test1347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest2.test1347");
        Register register0 = new Register();
        register0.runRegistrationSystem((int) (byte) -1);
        register0.registerUser("hi!", "");
        register0.runRegistrationSystem((int) (short) 1);
        register0.loginUser("", "");
        register0.loginUser("", "hi!");
        register0.registerUser("hi!", "hi!");
        java.lang.Class<?> wildcardClass17 = register0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test1348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest2.test1348");
        Register register0 = new Register();
        register0.runRegistrationSystem((int) (byte) -1);
        register0.registerUser("hi!", "");
        register0.runRegistrationSystem(0);
        register0.runRegistrationSystem(1);
        register0.registerUser("", "");
        register0.loginUser("hi!", "");
        register0.runRegistrationSystem(0);
        register0.loginUser("hi!", "");
        register0.runRegistrationSystem((int) 'a');
    }

    @Test
    public void test1349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest2.test1349");
        Register register0 = new Register();
        register0.loginUser("hi!", "hi!");
        register0.registerUser("hi!", "");
        register0.registerUser("hi!", "");
        register0.registerUser("", "hi!");
        register0.loginUser("", "");
        register0.runRegistrationSystem((int) (short) -1);
        register0.loginUser("hi!", "hi!");
        register0.loginUser("hi!", "hi!");
        java.lang.Class<?> wildcardClass24 = register0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test1350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest2.test1350");
        Register register0 = new Register();
        register0.runRegistrationSystem((int) (short) 0);
        register0.loginUser("hi!", "hi!");
        register0.registerUser("", "");
        register0.runRegistrationSystem((-1));
        register0.runRegistrationSystem((int) (short) 10);
        register0.runRegistrationSystem(10);
        register0.loginUser("hi!", "");
        register0.registerUser("", "hi!");
        register0.registerUser("", "hi!");
    }

    @Test
    public void test1351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest2.test1351");
        Register register0 = new Register();
        register0.runRegistrationSystem((int) '#');
        register0.loginUser("hi!", "hi!");
        register0.runRegistrationSystem((int) (byte) 10);
        register0.registerUser("hi!", "hi!");
        register0.runRegistrationSystem(0);
        register0.registerUser("", "hi!");
    }

    @Test
    public void test1352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest2.test1352");
        Register register0 = new Register();
        register0.runRegistrationSystem((int) (byte) -1);
        register0.registerUser("hi!", "");
        register0.runRegistrationSystem((int) (byte) -1);
        register0.loginUser("", "hi!");
        register0.registerUser("", "");
    }

    @Test
    public void test1353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest2.test1353");
        Register register0 = new Register();
        register0.runRegistrationSystem((int) (byte) -1);
        register0.registerUser("hi!", "");
        register0.loginUser("hi!", "hi!");
        register0.loginUser("hi!", "");
        register0.runRegistrationSystem((int) (byte) -1);
        register0.registerUser("hi!", "hi!");
        register0.runRegistrationSystem((int) '4');
        register0.loginUser("hi!", "");
    }

    @Test
    public void test1354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest2.test1354");
        Register register0 = new Register();
        register0.registerUser("hi!", "");
        register0.loginUser("", "");
        register0.runRegistrationSystem((int) 'a');
        register0.runRegistrationSystem((int) (short) 100);
        register0.loginUser("hi!", "");
        register0.loginUser("", "hi!");
        java.lang.Class<?> wildcardClass17 = register0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test1355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest2.test1355");
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
        register0.loginUser("", "");
    }

    @Test
    public void test1356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest2.test1356");
        Register register0 = new Register();
        register0.loginUser("hi!", "hi!");
        register0.loginUser("", "hi!");
        register0.loginUser("hi!", "hi!");
        java.lang.Class<?> wildcardClass10 = register0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test1357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest2.test1357");
        Register register0 = new Register();
        register0.registerUser("hi!", "");
        register0.registerUser("hi!", "");
        register0.runRegistrationSystem((int) (byte) -1);
        register0.registerUser("hi!", "");
        register0.loginUser("", "hi!");
        register0.runRegistrationSystem((int) (short) 10);
    }

    @Test
    public void test1358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest2.test1358");
        Register register0 = new Register();
        register0.runRegistrationSystem((int) '#');
        register0.loginUser("hi!", "hi!");
        register0.runRegistrationSystem((int) (byte) 10);
        register0.registerUser("hi!", "hi!");
        register0.runRegistrationSystem(0);
        register0.runRegistrationSystem((int) (byte) 1);
    }

    @Test
    public void test1359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest2.test1359");
        Register register0 = new Register();
        register0.registerUser("hi!", "");
        register0.registerUser("hi!", "");
        register0.loginUser("hi!", "");
        register0.registerUser("", "hi!");
        register0.registerUser("hi!", "");
        register0.loginUser("", "hi!");
        register0.runRegistrationSystem((int) '#');
        register0.registerUser("", "");
    }

    @Test
    public void test1360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest2.test1360");
        Register register0 = new Register();
        register0.registerUser("hi!", "");
        register0.loginUser("", "hi!");
        register0.runRegistrationSystem(0);
        register0.runRegistrationSystem((int) ' ');
    }

    @Test
    public void test1361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest2.test1361");
        Register register0 = new Register();
        register0.runRegistrationSystem((int) '#');
        register0.loginUser("hi!", "hi!");
        register0.loginUser("hi!", "hi!");
        register0.loginUser("hi!", "");
        register0.runRegistrationSystem((int) (short) 100);
        register0.runRegistrationSystem((int) (short) 10);
        register0.runRegistrationSystem((int) '#');
        java.lang.Class<?> wildcardClass18 = register0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test1362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest2.test1362");
        Register register0 = new Register();
        register0.loginUser("", "hi!");
        register0.loginUser("", "hi!");
        register0.loginUser("hi!", "hi!");
        register0.registerUser("", "");
        register0.runRegistrationSystem((int) (short) 100);
        register0.loginUser("hi!", "");
        register0.registerUser("", "hi!");
        register0.loginUser("hi!", "hi!");
        register0.loginUser("hi!", "");
        register0.registerUser("", "hi!");
    }

    @Test
    public void test1363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest2.test1363");
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
        register0.registerUser("", "");
    }

    @Test
    public void test1364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest2.test1364");
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
        register0.runRegistrationSystem((int) '#');
    }

    @Test
    public void test1365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest2.test1365");
        Register register0 = new Register();
        register0.runRegistrationSystem((int) (short) 0);
        register0.loginUser("hi!", "hi!");
        register0.registerUser("", "");
        register0.runRegistrationSystem((int) '#');
        register0.registerUser("", "hi!");
        register0.registerUser("", "hi!");
        register0.registerUser("hi!", "hi!");
        register0.runRegistrationSystem((int) (byte) 100);
        register0.registerUser("hi!", "hi!");
        register0.runRegistrationSystem((int) 'a');
        register0.loginUser("", "");
        register0.loginUser("", "hi!");
        java.lang.Class<?> wildcardClass33 = register0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass33);
    }

    @Test
    public void test1366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest2.test1366");
        Register register0 = new Register();
        register0.runRegistrationSystem((int) (byte) -1);
        register0.registerUser("hi!", "");
        register0.runRegistrationSystem((int) (short) 1);
        register0.loginUser("", "");
        register0.loginUser("", "hi!");
        register0.runRegistrationSystem((int) (short) 1);
        register0.registerUser("", "");
        register0.registerUser("hi!", "");
        java.lang.Class<?> wildcardClass22 = register0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test1367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest2.test1367");
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
        register0.registerUser("hi!", "hi!");
    }

    @Test
    public void test1368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest2.test1368");
        Register register0 = new Register();
        register0.registerUser("hi!", "");
        register0.registerUser("", "");
        register0.registerUser("", "");
        register0.loginUser("hi!", "");
    }

    @Test
    public void test1369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest2.test1369");
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
        java.lang.Class<?> wildcardClass30 = register0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass30);
    }

    @Test
    public void test1370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest2.test1370");
        Register register0 = new Register();
        register0.runRegistrationSystem((int) (short) 0);
        register0.loginUser("hi!", "hi!");
        register0.loginUser("hi!", "");
        java.lang.Class<?> wildcardClass9 = register0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test1371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest2.test1371");
        Register register0 = new Register();
        register0.runRegistrationSystem((int) '#');
        register0.registerUser("", "hi!");
        register0.runRegistrationSystem((int) (short) 0);
        register0.runRegistrationSystem((int) (byte) 1);
        register0.runRegistrationSystem((int) 'a');
        register0.registerUser("hi!", "hi!");
        register0.registerUser("", "");
        register0.runRegistrationSystem((int) (short) -1);
        register0.runRegistrationSystem((-1));
        java.lang.Class<?> wildcardClass22 = register0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test1372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest2.test1372");
        Register register0 = new Register();
        register0.runRegistrationSystem((int) (byte) -1);
        register0.runRegistrationSystem((int) (byte) 10);
        register0.registerUser("", "");
        register0.loginUser("", "");
        register0.runRegistrationSystem((-1));
        java.lang.Class<?> wildcardClass13 = register0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test1373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest2.test1373");
        Register register0 = new Register();
        register0.registerUser("hi!", "");
        register0.registerUser("hi!", "");
        register0.loginUser("hi!", "");
        register0.loginUser("hi!", "");
        register0.loginUser("", "hi!");
        register0.loginUser("hi!", "");
        register0.loginUser("hi!", "");
        register0.registerUser("", "");
    }

    @Test
    public void test1374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest2.test1374");
        Register register0 = new Register();
        register0.runRegistrationSystem((int) '#');
        register0.registerUser("", "hi!");
        register0.loginUser("hi!", "hi!");
        register0.runRegistrationSystem(100);
        register0.runRegistrationSystem((int) (short) 10);
        register0.runRegistrationSystem((int) (short) 0);
        register0.runRegistrationSystem((int) (short) 1);
        register0.runRegistrationSystem((int) '#');
        register0.loginUser("", "");
        register0.registerUser("", "hi!");
        register0.loginUser("", "hi!");
        register0.registerUser("hi!", "hi!");
    }

    @Test
    public void test1375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest2.test1375");
        Register register0 = new Register();
        register0.runRegistrationSystem((int) '#');
        register0.loginUser("hi!", "hi!");
        register0.runRegistrationSystem((int) (byte) 10);
        java.lang.Class<?> wildcardClass8 = register0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test1376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest2.test1376");
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
        java.lang.Class<?> wildcardClass26 = register0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass26);
    }

    @Test
    public void test1377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest2.test1377");
        Register register0 = new Register();
        register0.runRegistrationSystem((int) (short) 0);
        register0.loginUser("hi!", "hi!");
        register0.registerUser("", "");
        register0.runRegistrationSystem((int) '#');
        register0.registerUser("", "hi!");
        register0.registerUser("", "hi!");
        register0.registerUser("", "");
        register0.runRegistrationSystem((int) ' ');
        register0.loginUser("", "");
        register0.registerUser("hi!", "hi!");
        java.lang.Class<?> wildcardClass28 = register0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test1378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest2.test1378");
        Register register0 = new Register();
        register0.runRegistrationSystem((int) '4');
        register0.registerUser("hi!", "hi!");
    }

    @Test
    public void test1379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest2.test1379");
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
        java.lang.Class<?> wildcardClass24 = register0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test1380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest2.test1380");
        Register register0 = new Register();
        register0.loginUser("hi!", "hi!");
        register0.registerUser("hi!", "");
        register0.loginUser("hi!", "hi!");
        register0.runRegistrationSystem(100);
        register0.registerUser("hi!", "");
        register0.registerUser("", "");
        register0.runRegistrationSystem(0);
        register0.runRegistrationSystem(0);
        java.lang.Class<?> wildcardClass22 = register0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test1381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest2.test1381");
        Register register0 = new Register();
        register0.runRegistrationSystem((int) (byte) -1);
        register0.runRegistrationSystem((int) (byte) 10);
        register0.loginUser("", "hi!");
        java.lang.Class<?> wildcardClass8 = register0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test1382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest2.test1382");
        Register register0 = new Register();
        register0.loginUser("hi!", "hi!");
        register0.registerUser("hi!", "");
        register0.registerUser("", "");
        register0.registerUser("", "hi!");
        register0.registerUser("", "");
        register0.registerUser("hi!", "hi!");
        register0.registerUser("hi!", "");
        register0.loginUser("hi!", "");
    }

    @Test
    public void test1383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest2.test1383");
        Register register0 = new Register();
        register0.registerUser("hi!", "");
        register0.loginUser("", "hi!");
        register0.runRegistrationSystem((int) 'a');
        register0.loginUser("", "hi!");
        register0.loginUser("", "hi!");
        register0.loginUser("", "hi!");
        register0.registerUser("hi!", "hi!");
        register0.loginUser("hi!", "");
        register0.loginUser("hi!", "hi!");
    }

    @Test
    public void test1384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest2.test1384");
        Register register0 = new Register();
        register0.registerUser("hi!", "");
        register0.registerUser("hi!", "");
        register0.loginUser("hi!", "");
        register0.loginUser("hi!", "");
        register0.runRegistrationSystem(10);
        register0.loginUser("", "");
        register0.runRegistrationSystem((int) (short) 1);
        register0.loginUser("", "hi!");
    }

    @Test
    public void test1385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest2.test1385");
        Register register0 = new Register();
        register0.registerUser("hi!", "");
        register0.registerUser("hi!", "");
        register0.runRegistrationSystem((int) (byte) 0);
        register0.registerUser("", "");
        register0.runRegistrationSystem((int) (byte) 10);
        register0.registerUser("", "hi!");
        register0.registerUser("", "hi!");
        register0.loginUser("", "hi!");
        register0.registerUser("hi!", "hi!");
    }

    @Test
    public void test1386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest2.test1386");
        Register register0 = new Register();
        register0.runRegistrationSystem((int) '#');
        register0.registerUser("", "hi!");
        register0.loginUser("hi!", "hi!");
        register0.loginUser("", "hi!");
        register0.runRegistrationSystem(0);
        register0.runRegistrationSystem((int) 'a');
        register0.runRegistrationSystem((-1));
        register0.loginUser("", "hi!");
    }

    @Test
    public void test1387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest2.test1387");
        Register register0 = new Register();
        register0.loginUser("hi!", "hi!");
        register0.registerUser("hi!", "");
        register0.registerUser("hi!", "");
        register0.registerUser("", "");
        register0.runRegistrationSystem(100);
        register0.runRegistrationSystem((int) (byte) -1);
        register0.runRegistrationSystem(1);
        register0.registerUser("hi!", "");
    }

    @Test
    public void test1388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest2.test1388");
        Register register0 = new Register();
        register0.registerUser("hi!", "");
        register0.loginUser("", "hi!");
        register0.runRegistrationSystem((int) 'a');
        register0.loginUser("", "hi!");
        register0.loginUser("", "hi!");
        register0.registerUser("", "");
        register0.runRegistrationSystem((int) '4');
        register0.registerUser("", "hi!");
        register0.runRegistrationSystem(100);
        java.lang.Class<?> wildcardClass25 = register0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test1389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest2.test1389");
        Register register0 = new Register();
        register0.registerUser("hi!", "");
        register0.loginUser("", "hi!");
        register0.runRegistrationSystem((int) 'a');
        register0.loginUser("", "hi!");
        register0.loginUser("", "hi!");
        register0.loginUser("", "hi!");
        register0.registerUser("", "hi!");
        register0.runRegistrationSystem((int) '4');
        register0.runRegistrationSystem(0);
    }

    @Test
    public void test1390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest2.test1390");
        Register register0 = new Register();
        register0.registerUser("hi!", "");
        register0.loginUser("", "hi!");
        register0.runRegistrationSystem((int) (byte) -1);
        register0.loginUser("", "");
        register0.runRegistrationSystem((int) (short) 100);
        register0.registerUser("", "hi!");
        register0.runRegistrationSystem((int) (byte) 1);
        register0.registerUser("hi!", "");
        register0.loginUser("hi!", "hi!");
        register0.runRegistrationSystem((int) (byte) 10);
    }

    @Test
    public void test1391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest2.test1391");
        Register register0 = new Register();
        register0.loginUser("hi!", "hi!");
        register0.loginUser("hi!", "");
        register0.registerUser("hi!", "");
        java.lang.Class<?> wildcardClass10 = register0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test1392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest2.test1392");
        Register register0 = new Register();
        register0.registerUser("hi!", "");
        register0.loginUser("", "hi!");
        register0.runRegistrationSystem((int) 'a');
        register0.loginUser("", "hi!");
        register0.runRegistrationSystem((int) (byte) -1);
        register0.loginUser("", "hi!");
        register0.loginUser("hi!", "hi!");
    }

    @Test
    public void test1393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest2.test1393");
        Register register0 = new Register();
        register0.runRegistrationSystem((int) (byte) -1);
        register0.runRegistrationSystem((int) (byte) 10);
        register0.registerUser("", "");
        register0.loginUser("", "");
        register0.registerUser("", "hi!");
        register0.registerUser("hi!", "");
        register0.loginUser("hi!", "hi!");
        register0.loginUser("", "hi!");
        register0.registerUser("", "hi!");
        register0.registerUser("hi!", "hi!");
        register0.runRegistrationSystem((int) ' ');
        java.lang.Class<?> wildcardClass31 = register0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test1394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest2.test1394");
        Register register0 = new Register();
        register0.runRegistrationSystem((int) (byte) -1);
        register0.runRegistrationSystem((int) (byte) 10);
        register0.registerUser("", "");
        register0.registerUser("", "hi!");
        register0.runRegistrationSystem((-1));
        register0.loginUser("hi!", "hi!");
    }

    @Test
    public void test1395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest2.test1395");
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
        java.lang.Class<?> wildcardClass26 = register0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass26);
    }

    @Test
    public void test1396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest2.test1396");
        Register register0 = new Register();
        register0.registerUser("hi!", "");
        register0.loginUser("", "hi!");
        register0.runRegistrationSystem((int) (byte) -1);
        register0.loginUser("", "");
        register0.runRegistrationSystem((-1));
        register0.loginUser("", "");
        register0.runRegistrationSystem((int) (short) 10);
        register0.registerUser("hi!", "");
        java.lang.Class<?> wildcardClass22 = register0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test1397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest2.test1397");
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
        register0.registerUser("", "hi!");
        register0.loginUser("hi!", "hi!");
    }

    @Test
    public void test1398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest2.test1398");
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
        java.lang.Class<?> wildcardClass28 = register0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test1399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest2.test1399");
        Register register0 = new Register();
        register0.runRegistrationSystem((int) (byte) -1);
        register0.registerUser("hi!", "");
        register0.loginUser("hi!", "hi!");
        register0.loginUser("hi!", "");
        register0.registerUser("hi!", "");
        register0.registerUser("hi!", "hi!");
        register0.registerUser("", "hi!");
        register0.loginUser("hi!", "hi!");
        register0.registerUser("hi!", "");
        register0.runRegistrationSystem((int) (short) -1);
        java.lang.Class<?> wildcardClass29 = register0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass29);
    }

    @Test
    public void test1400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest2.test1400");
        Register register0 = new Register();
        register0.loginUser("hi!", "hi!");
        register0.runRegistrationSystem(0);
        register0.runRegistrationSystem(10);
        register0.registerUser("hi!", "");
        register0.registerUser("", "hi!");
        register0.loginUser("hi!", "");
        register0.registerUser("", "hi!");
        register0.registerUser("hi!", "");
    }

    @Test
    public void test1401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest2.test1401");
        Register register0 = new Register();
        register0.registerUser("hi!", "");
        register0.runRegistrationSystem(1);
        register0.registerUser("", "");
        register0.runRegistrationSystem((int) (short) -1);
        register0.loginUser("", "hi!");
        java.lang.Class<?> wildcardClass14 = register0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test1402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest2.test1402");
        Register register0 = new Register();
        register0.runRegistrationSystem((int) (short) 0);
        register0.loginUser("hi!", "hi!");
        register0.registerUser("", "");
        register0.runRegistrationSystem((int) '#');
        register0.registerUser("", "hi!");
        register0.registerUser("", "hi!");
        register0.registerUser("", "");
        register0.runRegistrationSystem((int) ' ');
        register0.registerUser("", "hi!");
        register0.runRegistrationSystem(10);
        register0.runRegistrationSystem((-1));
    }

    @Test
    public void test1403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest2.test1403");
        Register register0 = new Register();
        register0.loginUser("hi!", "hi!");
        register0.registerUser("", "");
        register0.registerUser("hi!", "");
        register0.registerUser("hi!", "");
    }

    @Test
    public void test1404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest2.test1404");
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
        register0.registerUser("", "hi!");
        register0.registerUser("hi!", "");
    }

    @Test
    public void test1405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest2.test1405");
        Register register0 = new Register();
        register0.loginUser("hi!", "hi!");
        register0.runRegistrationSystem(0);
        register0.loginUser("", "hi!");
        register0.registerUser("", "hi!");
        register0.runRegistrationSystem(10);
        register0.loginUser("hi!", "hi!");
        register0.registerUser("", "hi!");
    }

    @Test
    public void test1406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest2.test1406");
        Register register0 = new Register();
        register0.runRegistrationSystem((int) (byte) -1);
        register0.runRegistrationSystem((int) (short) 10);
        register0.runRegistrationSystem((int) (short) -1);
        register0.runRegistrationSystem((int) (short) 1);
        register0.runRegistrationSystem((int) (short) 0);
        register0.loginUser("", "");
    }

    @Test
    public void test1407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest2.test1407");
        Register register0 = new Register();
        register0.loginUser("hi!", "hi!");
        register0.runRegistrationSystem(0);
        register0.registerUser("", "");
        register0.loginUser("", "hi!");
        register0.registerUser("", "");
        register0.loginUser("", "");
        register0.runRegistrationSystem((int) (byte) 10);
        register0.loginUser("", "");
        register0.registerUser("", "");
        register0.loginUser("", "hi!");
    }

    @Test
    public void test1408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest2.test1408");
        Register register0 = new Register();
        register0.loginUser("hi!", "hi!");
        register0.registerUser("hi!", "hi!");
        register0.registerUser("", "hi!");
        register0.registerUser("hi!", "");
        register0.loginUser("hi!", "hi!");
        register0.loginUser("hi!", "");
        java.lang.Class<?> wildcardClass19 = register0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test1409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest2.test1409");
        Register register0 = new Register();
        register0.registerUser("hi!", "");
        register0.loginUser("hi!", "hi!");
        register0.registerUser("hi!", "hi!");
        register0.runRegistrationSystem((int) (short) 10);
    }

    @Test
    public void test1410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest2.test1410");
        Register register0 = new Register();
        register0.loginUser("hi!", "hi!");
        register0.runRegistrationSystem(0);
        register0.registerUser("", "");
        register0.loginUser("", "hi!");
        register0.registerUser("", "");
        register0.loginUser("", "");
        register0.runRegistrationSystem((int) (short) 1);
        register0.loginUser("", "");
    }

    @Test
    public void test1411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest2.test1411");
        Register register0 = new Register();
        register0.runRegistrationSystem((int) (byte) -1);
        register0.registerUser("hi!", "");
        register0.loginUser("hi!", "hi!");
        register0.loginUser("hi!", "");
        register0.loginUser("", "");
        register0.loginUser("hi!", "hi!");
        register0.registerUser("", "hi!");
        java.lang.Class<?> wildcardClass21 = register0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test1412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest2.test1412");
        Register register0 = new Register();
        register0.runRegistrationSystem((int) (short) 0);
        register0.loginUser("hi!", "hi!");
        register0.registerUser("", "");
        register0.runRegistrationSystem((int) '#');
        register0.runRegistrationSystem((int) '#');
        register0.loginUser("hi!", "");
        register0.runRegistrationSystem((int) (byte) 10);
        register0.runRegistrationSystem(100);
        register0.runRegistrationSystem((int) (byte) -1);
    }

    @Test
    public void test1413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest2.test1413");
        Register register0 = new Register();
        register0.runRegistrationSystem((int) (byte) -1);
        register0.runRegistrationSystem((int) (byte) 10);
        register0.registerUser("", "");
        register0.registerUser("", "hi!");
        register0.runRegistrationSystem((int) '4');
        register0.loginUser("", "");
    }

    @Test
    public void test1414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest2.test1414");
        Register register0 = new Register();
        register0.runRegistrationSystem((int) (byte) -1);
        register0.runRegistrationSystem((int) (short) 10);
        register0.runRegistrationSystem((int) (byte) 100);
        register0.runRegistrationSystem(10);
        register0.registerUser("", "hi!");
        java.lang.Class<?> wildcardClass12 = register0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test1415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest2.test1415");
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
        register0.loginUser("hi!", "");
    }

    @Test
    public void test1416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest2.test1416");
        Register register0 = new Register();
        register0.runRegistrationSystem((int) (byte) -1);
        register0.registerUser("hi!", "");
        register0.loginUser("hi!", "hi!");
        register0.loginUser("hi!", "hi!");
        register0.runRegistrationSystem((int) (short) 1);
        register0.registerUser("hi!", "hi!");
        register0.registerUser("", "");
        register0.registerUser("hi!", "hi!");
        register0.loginUser("", "");
    }

    @Test
    public void test1417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest2.test1417");
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
        register0.registerUser("", "hi!");
    }

    @Test
    public void test1418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest2.test1418");
        Register register0 = new Register();
        register0.registerUser("hi!", "");
        register0.loginUser("", "hi!");
        register0.runRegistrationSystem((int) 'a');
        register0.loginUser("", "hi!");
        register0.loginUser("", "hi!");
        register0.runRegistrationSystem((int) (byte) 1);
        java.lang.Class<?> wildcardClass17 = register0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test1419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest2.test1419");
        Register register0 = new Register();
        register0.runRegistrationSystem((int) (short) 0);
        register0.loginUser("hi!", "hi!");
        register0.registerUser("", "");
        register0.runRegistrationSystem((int) '#');
        register0.runRegistrationSystem((int) (byte) 0);
        register0.registerUser("", "");
        register0.runRegistrationSystem((int) (byte) 1);
        register0.registerUser("hi!", "");
        register0.runRegistrationSystem((int) (short) 100);
    }

    @Test
    public void test1420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest2.test1420");
        Register register0 = new Register();
        register0.registerUser("hi!", "");
        register0.loginUser("", "hi!");
        register0.runRegistrationSystem((int) 'a');
        register0.loginUser("", "hi!");
        register0.loginUser("", "hi!");
        register0.loginUser("", "hi!");
        register0.registerUser("", "hi!");
        register0.runRegistrationSystem((int) (short) 1);
        java.lang.Class<?> wildcardClass23 = register0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test1421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest2.test1421");
        Register register0 = new Register();
        register0.runRegistrationSystem((int) (short) 0);
        register0.loginUser("hi!", "hi!");
        register0.registerUser("", "");
        register0.runRegistrationSystem((int) '#');
        register0.registerUser("", "hi!");
        register0.registerUser("", "hi!");
        register0.registerUser("", "");
        register0.runRegistrationSystem((int) ' ');
        register0.loginUser("", "");
        register0.registerUser("", "hi!");
        java.lang.Class<?> wildcardClass28 = register0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test1422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest2.test1422");
        Register register0 = new Register();
        register0.runRegistrationSystem((int) (byte) -1);
        register0.runRegistrationSystem((int) (byte) 10);
        register0.registerUser("", "");
        register0.registerUser("", "hi!");
        register0.loginUser("hi!", "");
        register0.registerUser("hi!", "");
        java.lang.Class<?> wildcardClass17 = register0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test1423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest2.test1423");
        Register register0 = new Register();
        register0.runRegistrationSystem((int) (byte) -1);
        register0.registerUser("hi!", "");
        register0.loginUser("hi!", "hi!");
        register0.loginUser("hi!", "");
        register0.loginUser("", "");
        register0.runRegistrationSystem(1);
        register0.registerUser("hi!", "hi!");
        register0.loginUser("", "hi!");
        register0.runRegistrationSystem((int) (byte) -1);
        register0.runRegistrationSystem((int) (short) 1);
        register0.loginUser("hi!", "");
    }

    @Test
    public void test1424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest2.test1424");
        Register register0 = new Register();
        register0.runRegistrationSystem((int) '#');
        register0.registerUser("", "hi!");
        register0.registerUser("", "hi!");
        register0.registerUser("", "");
        register0.runRegistrationSystem((int) (byte) 10);
        register0.runRegistrationSystem((int) (short) 100);
        register0.runRegistrationSystem((int) (short) 0);
        register0.runRegistrationSystem(0);
    }

    @Test
    public void test1425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest2.test1425");
        Register register0 = new Register();
        register0.loginUser("hi!", "hi!");
        register0.registerUser("hi!", "");
        register0.registerUser("hi!", "");
        register0.registerUser("", "");
        register0.loginUser("", "hi!");
        register0.loginUser("hi!", "");
        register0.runRegistrationSystem((int) (short) -1);
    }

    @Test
    public void test1426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest2.test1426");
        Register register0 = new Register();
        register0.registerUser("hi!", "");
        register0.registerUser("hi!", "");
        register0.loginUser("hi!", "");
        register0.registerUser("", "hi!");
        register0.registerUser("hi!", "");
        register0.loginUser("", "hi!");
        register0.loginUser("", "");
        register0.runRegistrationSystem((int) ' ');
        register0.runRegistrationSystem((int) (byte) -1);
        register0.runRegistrationSystem((int) '#');
        register0.runRegistrationSystem((int) '#');
        java.lang.Class<?> wildcardClass30 = register0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass30);
    }

    @Test
    public void test1427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest2.test1427");
        Register register0 = new Register();
        register0.runRegistrationSystem((int) (short) 0);
        register0.loginUser("hi!", "hi!");
        register0.registerUser("", "");
        register0.runRegistrationSystem((-1));
        register0.runRegistrationSystem((int) (short) 10);
        register0.runRegistrationSystem((int) '4');
        register0.registerUser("hi!", "hi!");
    }

    @Test
    public void test1428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest2.test1428");
        Register register0 = new Register();
        register0.registerUser("hi!", "");
        register0.loginUser("", "hi!");
        register0.runRegistrationSystem((int) 'a');
        register0.loginUser("hi!", "");
        register0.runRegistrationSystem((int) (byte) 1);
        register0.registerUser("", "hi!");
        register0.loginUser("", "");
    }

    @Test
    public void test1429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest2.test1429");
        Register register0 = new Register();
        register0.loginUser("", "hi!");
        register0.loginUser("", "hi!");
        register0.loginUser("hi!", "hi!");
        register0.runRegistrationSystem((int) '4');
        register0.loginUser("", "");
        register0.registerUser("hi!", "hi!");
        register0.runRegistrationSystem((int) (byte) 10);
        register0.loginUser("hi!", "");
        register0.registerUser("", "hi!");
    }

    @Test
    public void test1430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest2.test1430");
        Register register0 = new Register();
        register0.runRegistrationSystem((int) (byte) -1);
        register0.registerUser("hi!", "");
        register0.loginUser("hi!", "hi!");
        register0.runRegistrationSystem((int) (byte) 1);
        register0.runRegistrationSystem((int) ' ');
        register0.loginUser("", "hi!");
        register0.registerUser("hi!", "hi!");
        java.lang.Class<?> wildcardClass19 = register0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test1431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest2.test1431");
        Register register0 = new Register();
        register0.loginUser("hi!", "hi!");
        register0.loginUser("hi!", "hi!");
        register0.registerUser("", "");
        register0.runRegistrationSystem((int) (byte) 1);
        java.lang.Class<?> wildcardClass12 = register0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test1432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest2.test1432");
        Register register0 = new Register();
        register0.runRegistrationSystem((int) '#');
        register0.loginUser("hi!", "hi!");
        register0.loginUser("hi!", "hi!");
        register0.loginUser("hi!", "");
        register0.loginUser("", "");
        register0.registerUser("", "hi!");
    }

    @Test
    public void test1433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest2.test1433");
        Register register0 = new Register();
        register0.runRegistrationSystem((int) (byte) -1);
        register0.runRegistrationSystem((int) (short) 10);
        register0.registerUser("", "hi!");
        register0.runRegistrationSystem(0);
        register0.loginUser("hi!", "");
        register0.runRegistrationSystem((int) (byte) -1);
        register0.loginUser("hi!", "");
    }

    @Test
    public void test1434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest2.test1434");
        Register register0 = new Register();
        register0.runRegistrationSystem((int) (short) 0);
        register0.loginUser("hi!", "hi!");
        register0.loginUser("", "");
        register0.registerUser("hi!", "");
        register0.registerUser("hi!", "hi!");
        register0.loginUser("hi!", "");
        java.lang.Class<?> wildcardClass18 = register0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test1435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest2.test1435");
        Register register0 = new Register();
        register0.runRegistrationSystem((int) '#');
        register0.registerUser("", "hi!");
        register0.runRegistrationSystem((int) (short) 0);
        register0.runRegistrationSystem((int) (byte) 1);
        register0.registerUser("", "");
        register0.loginUser("", "");
        register0.runRegistrationSystem(100);
        register0.runRegistrationSystem((int) (byte) -1);
        register0.runRegistrationSystem((int) (byte) -1);
        register0.registerUser("", "");
        register0.registerUser("", "hi!");
    }

    @Test
    public void test1436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest2.test1436");
        Register register0 = new Register();
        register0.loginUser("hi!", "hi!");
        register0.loginUser("", "hi!");
        register0.loginUser("", "");
        register0.loginUser("", "");
    }

    @Test
    public void test1437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest2.test1437");
        Register register0 = new Register();
        register0.runRegistrationSystem((int) (short) 0);
        register0.loginUser("hi!", "hi!");
        register0.loginUser("hi!", "");
        register0.loginUser("", "hi!");
        register0.loginUser("", "hi!");
        java.lang.Class<?> wildcardClass15 = register0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test1438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest2.test1438");
        Register register0 = new Register();
        register0.loginUser("hi!", "hi!");
        register0.loginUser("hi!", "hi!");
        register0.registerUser("", "");
        register0.runRegistrationSystem((int) (byte) 1);
        register0.runRegistrationSystem((int) (short) 10);
        register0.runRegistrationSystem((int) (short) 1);
        register0.runRegistrationSystem((int) 'a');
    }

    @Test
    public void test1439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest2.test1439");
        Register register0 = new Register();
        register0.registerUser("hi!", "");
        register0.loginUser("", "hi!");
        register0.runRegistrationSystem((int) (byte) -1);
        register0.runRegistrationSystem(10);
        register0.runRegistrationSystem((int) (short) 10);
        java.lang.Class<?> wildcardClass13 = register0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test1440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest2.test1440");
        Register register0 = new Register();
        register0.registerUser("hi!", "");
        register0.loginUser("", "hi!");
        register0.runRegistrationSystem((int) (byte) -1);
        register0.runRegistrationSystem(1);
        register0.loginUser("hi!", "");
        register0.runRegistrationSystem(0);
        register0.loginUser("", "hi!");
        register0.runRegistrationSystem((int) (byte) 1);
    }

    @Test
    public void test1441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest2.test1441");
        Register register0 = new Register();
        register0.runRegistrationSystem((int) '#');
        register0.loginUser("hi!", "hi!");
        register0.loginUser("hi!", "hi!");
        register0.loginUser("hi!", "");
        register0.loginUser("", "hi!");
        register0.loginUser("hi!", "hi!");
        java.lang.Class<?> wildcardClass18 = register0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test1442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest2.test1442");
        Register register0 = new Register();
        register0.runRegistrationSystem((int) (byte) -1);
        register0.registerUser("hi!", "");
        register0.runRegistrationSystem((int) (short) 1);
        register0.loginUser("", "");
        register0.loginUser("", "hi!");
        register0.runRegistrationSystem((int) (short) 1);
        register0.runRegistrationSystem((int) (byte) 1);
        register0.registerUser("", "");
    }

    @Test
    public void test1443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest2.test1443");
        Register register0 = new Register();
        register0.runRegistrationSystem((int) '#');
        register0.registerUser("", "hi!");
        register0.runRegistrationSystem((int) (short) 0);
        register0.runRegistrationSystem((int) (byte) 1);
        register0.runRegistrationSystem((int) (byte) 0);
        register0.registerUser("hi!", "");
        register0.registerUser("", "hi!");
        java.lang.Class<?> wildcardClass18 = register0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test1444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest2.test1444");
        Register register0 = new Register();
        register0.registerUser("hi!", "");
        register0.loginUser("", "");
        register0.runRegistrationSystem((int) 'a');
        register0.runRegistrationSystem((int) (short) 100);
        register0.registerUser("hi!", "");
        register0.registerUser("hi!", "");
        register0.loginUser("", "");
    }

    @Test
    public void test1445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest2.test1445");
        Register register0 = new Register();
        register0.registerUser("hi!", "");
        register0.loginUser("", "hi!");
        register0.runRegistrationSystem((int) (byte) -1);
        register0.loginUser("", "");
        register0.runRegistrationSystem((int) (short) 100);
        register0.registerUser("", "hi!");
        register0.loginUser("hi!", "hi!");
        register0.loginUser("", "hi!");
        register0.registerUser("", "");
    }

    @Test
    public void test1446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest2.test1446");
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
        register0.registerUser("", "");
    }

    @Test
    public void test1447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest2.test1447");
        Register register0 = new Register();
        register0.runRegistrationSystem((int) (byte) -1);
        register0.registerUser("hi!", "");
        register0.runRegistrationSystem((int) (short) 1);
        register0.loginUser("", "");
        register0.loginUser("", "hi!");
        register0.runRegistrationSystem((int) (short) -1);
        register0.loginUser("hi!", "");
        register0.runRegistrationSystem((int) (byte) 100);
        register0.registerUser("", "");
        register0.registerUser("", "");
        register0.registerUser("hi!", "");
    }

    @Test
    public void test1448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest2.test1448");
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
        register0.runRegistrationSystem((int) (short) 100);
        register0.runRegistrationSystem((int) ' ');
        java.lang.Class<?> wildcardClass30 = register0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass30);
    }

    @Test
    public void test1449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest2.test1449");
        Register register0 = new Register();
        register0.registerUser("hi!", "");
        register0.loginUser("", "hi!");
        register0.runRegistrationSystem((int) 'a');
        register0.loginUser("hi!", "");
        register0.registerUser("hi!", "");
        java.lang.Class<?> wildcardClass15 = register0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test1450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest2.test1450");
        Register register0 = new Register();
        register0.runRegistrationSystem((int) '#');
        register0.loginUser("hi!", "hi!");
        register0.runRegistrationSystem((int) (byte) 10);
        register0.registerUser("hi!", "hi!");
        register0.runRegistrationSystem((int) (byte) 100);
        register0.registerUser("hi!", "");
        register0.registerUser("hi!", "hi!");
        register0.registerUser("", "");
    }

    @Test
    public void test1451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest2.test1451");
        Register register0 = new Register();
        register0.runRegistrationSystem((int) (short) 0);
        register0.loginUser("hi!", "hi!");
        register0.registerUser("", "");
        register0.runRegistrationSystem((int) '#');
        register0.runRegistrationSystem((int) (byte) 0);
        register0.runRegistrationSystem(0);
        register0.registerUser("", "hi!");
        register0.loginUser("", "hi!");
    }

    @Test
    public void test1452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest2.test1452");
        Register register0 = new Register();
        register0.loginUser("hi!", "hi!");
        register0.loginUser("", "hi!");
        register0.loginUser("", "");
        register0.runRegistrationSystem((int) (byte) 10);
        register0.runRegistrationSystem(10);
        register0.loginUser("", "");
        register0.loginUser("", "");
    }

    @Test
    public void test1453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest2.test1453");
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
        register0.loginUser("hi!", "");
    }

    @Test
    public void test1454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest2.test1454");
        Register register0 = new Register();
        register0.registerUser("hi!", "");
        register0.runRegistrationSystem(1);
        register0.registerUser("", "hi!");
        register0.runRegistrationSystem(100);
        register0.runRegistrationSystem((int) 'a');
        register0.loginUser("hi!", "hi!");
        register0.runRegistrationSystem((-1));
        register0.runRegistrationSystem((int) (short) 1);
        register0.registerUser("hi!", "");
        register0.runRegistrationSystem((int) (short) 100);
        java.lang.Class<?> wildcardClass25 = register0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test1455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest2.test1455");
        Register register0 = new Register();
        register0.runRegistrationSystem((int) (short) 0);
        register0.loginUser("hi!", "hi!");
        register0.registerUser("", "");
        register0.runRegistrationSystem((int) '#');
        register0.registerUser("", "hi!");
        register0.registerUser("", "hi!");
        register0.registerUser("", "");
        register0.runRegistrationSystem((int) ' ');
        register0.runRegistrationSystem((-1));
        register0.loginUser("hi!", "");
    }

    @Test
    public void test1456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest2.test1456");
        Register register0 = new Register();
        register0.loginUser("hi!", "hi!");
        register0.registerUser("hi!", "");
        register0.registerUser("", "");
        register0.registerUser("", "hi!");
        register0.runRegistrationSystem((int) (short) 100);
        register0.loginUser("hi!", "hi!");
        register0.registerUser("hi!", "hi!");
        java.lang.Class<?> wildcardClass21 = register0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test1457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest2.test1457");
        Register register0 = new Register();
        register0.registerUser("hi!", "");
        register0.loginUser("", "hi!");
        register0.runRegistrationSystem((int) 'a');
        register0.loginUser("", "hi!");
        register0.loginUser("", "hi!");
        register0.runRegistrationSystem((int) (byte) 1);
        register0.registerUser("", "hi!");
        java.lang.Class<?> wildcardClass20 = register0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test1458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest2.test1458");
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
        register0.registerUser("hi!", "");
    }

    @Test
    public void test1459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest2.test1459");
        Register register0 = new Register();
        register0.runRegistrationSystem((int) (byte) -1);
        register0.runRegistrationSystem((int) (byte) 10);
        register0.registerUser("", "");
        register0.loginUser("", "");
        register0.runRegistrationSystem((int) (byte) 0);
        register0.registerUser("", "");
        register0.registerUser("", "hi!");
    }

    @Test
    public void test1460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest2.test1460");
        Register register0 = new Register();
        register0.registerUser("hi!", "");
        register0.registerUser("hi!", "");
        register0.loginUser("hi!", "");
        register0.loginUser("hi!", "");
        register0.loginUser("", "hi!");
        register0.loginUser("", "hi!");
        register0.registerUser("", "");
        register0.runRegistrationSystem((int) (byte) -1);
        register0.registerUser("hi!", "");
    }

    @Test
    public void test1461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest2.test1461");
        Register register0 = new Register();
        register0.registerUser("hi!", "");
        register0.runRegistrationSystem(1);
        register0.registerUser("", "hi!");
        register0.loginUser("hi!", "");
        register0.registerUser("hi!", "");
        register0.registerUser("hi!", "");
        register0.registerUser("hi!", "");
    }

    @Test
    public void test1462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest2.test1462");
        Register register0 = new Register();
        register0.registerUser("hi!", "");
        register0.registerUser("hi!", "");
        register0.loginUser("hi!", "");
        register0.loginUser("", "hi!");
        register0.loginUser("hi!", "");
        register0.loginUser("hi!", "");
        register0.registerUser("hi!", "hi!");
        register0.loginUser("hi!", "hi!");
    }

    @Test
    public void test1463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest2.test1463");
        Register register0 = new Register();
        register0.registerUser("hi!", "");
        register0.registerUser("hi!", "");
        register0.runRegistrationSystem((int) (byte) -1);
        register0.registerUser("hi!", "");
        register0.loginUser("", "hi!");
        register0.registerUser("hi!", "");
    }

    @Test
    public void test1464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest2.test1464");
        Register register0 = new Register();
        register0.registerUser("hi!", "");
        register0.registerUser("hi!", "");
        register0.loginUser("hi!", "");
        register0.loginUser("hi!", "");
        register0.loginUser("", "hi!");
        register0.loginUser("hi!", "");
        register0.runRegistrationSystem((int) (short) -1);
        java.lang.Class<?> wildcardClass21 = register0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test1465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest2.test1465");
        Register register0 = new Register();
        register0.runRegistrationSystem((int) (byte) -1);
        register0.registerUser("hi!", "");
        register0.registerUser("", "");
        register0.runRegistrationSystem((int) (byte) 1);
        register0.runRegistrationSystem(100);
        java.lang.Class<?> wildcardClass13 = register0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test1466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest2.test1466");
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
        java.lang.Class<?> wildcardClass28 = register0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test1467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest2.test1467");
        Register register0 = new Register();
        register0.loginUser("hi!", "hi!");
        register0.registerUser("hi!", "");
        register0.registerUser("hi!", "");
        register0.registerUser("", "hi!");
        register0.loginUser("hi!", "");
        register0.registerUser("", "");
        register0.loginUser("", "");
        register0.registerUser("hi!", "hi!");
    }

    @Test
    public void test1468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest2.test1468");
        Register register0 = new Register();
        register0.registerUser("hi!", "");
        register0.loginUser("", "");
        register0.runRegistrationSystem((int) 'a');
        register0.registerUser("", "");
        register0.registerUser("hi!", "hi!");
        register0.registerUser("", "");
        register0.registerUser("hi!", "");
        register0.registerUser("hi!", "");
    }

    @Test
    public void test1469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest2.test1469");
        Register register0 = new Register();
        register0.runRegistrationSystem((int) '#');
        register0.registerUser("", "hi!");
        register0.registerUser("", "hi!");
        register0.registerUser("", "");
        register0.runRegistrationSystem((int) (byte) 10);
        register0.runRegistrationSystem((int) (short) 100);
        register0.runRegistrationSystem((int) (short) 1);
        register0.registerUser("", "hi!");
        java.lang.Class<?> wildcardClass21 = register0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test1470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest2.test1470");
        Register register0 = new Register();
        register0.registerUser("hi!", "");
        register0.loginUser("", "hi!");
        register0.runRegistrationSystem((int) 'a');
        register0.loginUser("hi!", "");
        register0.runRegistrationSystem((int) (byte) 1);
        register0.loginUser("hi!", "");
        register0.registerUser("hi!", "");
    }

    @Test
    public void test1471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest2.test1471");
        Register register0 = new Register();
        register0.loginUser("hi!", "hi!");
        register0.registerUser("hi!", "");
        register0.registerUser("", "");
        register0.registerUser("hi!", "");
        register0.runRegistrationSystem((int) (byte) 0);
        java.lang.Class<?> wildcardClass15 = register0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test1472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest2.test1472");
        Register register0 = new Register();
        register0.runRegistrationSystem((int) '#');
        register0.registerUser("", "hi!");
        register0.registerUser("", "hi!");
        register0.registerUser("", "hi!");
        register0.loginUser("hi!", "");
    }

    @Test
    public void test1473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest2.test1473");
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
        register0.runRegistrationSystem(10);
        register0.registerUser("", "");
    }

    @Test
    public void test1474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest2.test1474");
        Register register0 = new Register();
        register0.loginUser("hi!", "hi!");
        register0.registerUser("hi!", "");
        register0.registerUser("hi!", "");
        register0.registerUser("", "");
        register0.runRegistrationSystem(100);
        register0.loginUser("", "");
        register0.runRegistrationSystem(0);
        register0.loginUser("", "hi!");
        register0.loginUser("", "hi!");
    }

    @Test
    public void test1475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest2.test1475");
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
        register0.loginUser("", "hi!");
    }

    @Test
    public void test1476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest2.test1476");
        Register register0 = new Register();
        register0.registerUser("hi!", "");
        register0.loginUser("", "hi!");
        register0.runRegistrationSystem((int) (byte) -1);
        register0.runRegistrationSystem(1);
        register0.loginUser("hi!", "hi!");
        register0.runRegistrationSystem((int) (short) 10);
    }

    @Test
    public void test1477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest2.test1477");
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
        register0.registerUser("hi!", "hi!");
    }

    @Test
    public void test1478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest2.test1478");
        Register register0 = new Register();
        register0.loginUser("hi!", "hi!");
        register0.loginUser("hi!", "hi!");
        register0.registerUser("", "");
        register0.runRegistrationSystem((int) (byte) 1);
        register0.runRegistrationSystem((int) (short) 10);
        register0.runRegistrationSystem((int) (short) 1);
        register0.loginUser("hi!", "");
        java.lang.Class<?> wildcardClass19 = register0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test1479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest2.test1479");
        Register register0 = new Register();
        register0.runRegistrationSystem((int) (short) 0);
        register0.loginUser("hi!", "hi!");
        register0.registerUser("", "");
        register0.runRegistrationSystem((-1));
        register0.loginUser("hi!", "");
        register0.registerUser("hi!", "hi!");
        register0.runRegistrationSystem((int) (short) 1);
        java.lang.Class<?> wildcardClass19 = register0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test1480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest2.test1480");
        Register register0 = new Register();
        register0.runRegistrationSystem((int) (byte) -1);
        register0.registerUser("hi!", "");
        register0.runRegistrationSystem((int) (short) 1);
        register0.runRegistrationSystem((int) 'a');
        register0.registerUser("", "");
        register0.runRegistrationSystem((int) (byte) 100);
        register0.registerUser("hi!", "");
        register0.runRegistrationSystem((int) (byte) 1);
        register0.loginUser("", "hi!");
    }

    @Test
    public void test1481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest2.test1481");
        Register register0 = new Register();
        register0.runRegistrationSystem((int) (byte) -1);
        register0.registerUser("hi!", "");
        register0.registerUser("", "hi!");
        register0.runRegistrationSystem((int) (short) 10);
        register0.loginUser("hi!", "hi!");
        register0.loginUser("", "hi!");
        register0.loginUser("hi!", "");
        register0.registerUser("", "");
        register0.runRegistrationSystem(100);
    }

    @Test
    public void test1482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest2.test1482");
        Register register0 = new Register();
        register0.loginUser("hi!", "hi!");
        register0.registerUser("hi!", "");
        register0.registerUser("hi!", "");
        register0.registerUser("", "hi!");
        register0.runRegistrationSystem((int) (byte) 100);
        register0.runRegistrationSystem(10);
    }

    @Test
    public void test1483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest2.test1483");
        Register register0 = new Register();
        register0.runRegistrationSystem((int) (short) 0);
        register0.loginUser("hi!", "hi!");
        register0.registerUser("", "");
        register0.runRegistrationSystem((int) '#');
        register0.registerUser("", "hi!");
        register0.registerUser("", "hi!");
        register0.registerUser("", "");
        register0.runRegistrationSystem((int) (byte) 0);
        register0.runRegistrationSystem(100);
    }

    @Test
    public void test1484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest2.test1484");
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
        register0.registerUser("hi!", "hi!");
        register0.runRegistrationSystem((int) (byte) 10);
        register0.runRegistrationSystem((int) (short) 1);
    }

    @Test
    public void test1485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest2.test1485");
        Register register0 = new Register();
        register0.runRegistrationSystem((int) (byte) -1);
        register0.registerUser("hi!", "");
        register0.loginUser("hi!", "hi!");
        register0.loginUser("hi!", "");
        register0.registerUser("hi!", "");
        register0.registerUser("hi!", "hi!");
        register0.runRegistrationSystem((int) (short) 10);
        register0.loginUser("", "");
        register0.runRegistrationSystem((int) (byte) 100);
        register0.registerUser("hi!", "");
    }

    @Test
    public void test1486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest2.test1486");
        Register register0 = new Register();
        register0.registerUser("hi!", "");
        register0.loginUser("", "hi!");
        register0.loginUser("", "hi!");
        register0.runRegistrationSystem(10);
        register0.registerUser("", "");
        register0.registerUser("hi!", "hi!");
    }

    @Test
    public void test1487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest2.test1487");
        Register register0 = new Register();
        register0.loginUser("", "hi!");
        register0.loginUser("", "hi!");
        register0.registerUser("hi!", "");
        register0.registerUser("hi!", "");
        register0.loginUser("hi!", "");
    }

    @Test
    public void test1488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest2.test1488");
        Register register0 = new Register();
        register0.registerUser("hi!", "");
        register0.loginUser("", "hi!");
        register0.runRegistrationSystem((int) (byte) -1);
        register0.loginUser("", "");
        register0.runRegistrationSystem((int) (short) 100);
        register0.registerUser("", "hi!");
        register0.loginUser("hi!", "hi!");
        register0.loginUser("", "hi!");
        register0.runRegistrationSystem((int) (byte) -1);
        register0.registerUser("hi!", "");
    }

    @Test
    public void test1489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest2.test1489");
        Register register0 = new Register();
        register0.loginUser("hi!", "hi!");
        register0.registerUser("hi!", "");
        register0.registerUser("", "");
        register0.registerUser("", "hi!");
        register0.runRegistrationSystem((int) (short) 100);
        register0.runRegistrationSystem((int) (byte) 1);
        register0.runRegistrationSystem((-1));
        java.lang.Class<?> wildcardClass19 = register0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test1490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest2.test1490");
        Register register0 = new Register();
        register0.loginUser("hi!", "hi!");
        register0.registerUser("hi!", "");
        register0.registerUser("", "");
        register0.registerUser("hi!", "");
        register0.registerUser("hi!", "");
        register0.loginUser("hi!", "hi!");
        register0.loginUser("hi!", "hi!");
        register0.runRegistrationSystem((int) '4');
    }

    @Test
    public void test1491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest2.test1491");
        Register register0 = new Register();
        register0.loginUser("", "hi!");
        register0.loginUser("", "hi!");
        register0.loginUser("hi!", "hi!");
        register0.runRegistrationSystem((int) '4');
        register0.loginUser("", "");
        register0.registerUser("hi!", "hi!");
        register0.runRegistrationSystem((int) (byte) 10);
        java.lang.Class<?> wildcardClass20 = register0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test1492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest2.test1492");
        Register register0 = new Register();
        register0.registerUser("hi!", "");
        register0.loginUser("", "hi!");
        register0.runRegistrationSystem((int) (byte) -1);
        register0.loginUser("", "");
        register0.runRegistrationSystem((int) (short) 100);
        register0.registerUser("", "hi!");
        register0.loginUser("hi!", "hi!");
        register0.loginUser("", "hi!");
        register0.loginUser("", "");
    }

    @Test
    public void test1493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest2.test1493");
        Register register0 = new Register();
        register0.runRegistrationSystem((int) (byte) -1);
        register0.registerUser("hi!", "");
        register0.registerUser("", "hi!");
        register0.runRegistrationSystem((int) (short) 10);
        register0.loginUser("hi!", "hi!");
        register0.loginUser("", "hi!");
        register0.loginUser("hi!", "");
        register0.runRegistrationSystem(1);
    }

    @Test
    public void test1494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest2.test1494");
        Register register0 = new Register();
        register0.loginUser("hi!", "hi!");
        register0.registerUser("hi!", "");
        register0.loginUser("hi!", "hi!");
        register0.registerUser("", "");
        register0.runRegistrationSystem((int) 'a');
        register0.loginUser("hi!", "");
        register0.registerUser("hi!", "hi!");
    }

    @Test
    public void test1495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest2.test1495");
        Register register0 = new Register();
        register0.runRegistrationSystem((int) (byte) -1);
        register0.runRegistrationSystem((int) (short) 10);
        register0.loginUser("hi!", "");
        register0.registerUser("", "hi!");
        register0.registerUser("", "");
    }

    @Test
    public void test1496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest2.test1496");
        Register register0 = new Register();
        register0.runRegistrationSystem((int) (byte) -1);
        register0.registerUser("hi!", "");
        register0.loginUser("hi!", "hi!");
        register0.loginUser("hi!", "");
        register0.loginUser("", "");
        register0.runRegistrationSystem(1);
        register0.loginUser("hi!", "hi!");
        register0.registerUser("", "hi!");
        register0.loginUser("hi!", "hi!");
    }

    @Test
    public void test1497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest2.test1497");
        Register register0 = new Register();
        register0.runRegistrationSystem((int) '#');
        register0.registerUser("", "hi!");
        register0.loginUser("hi!", "hi!");
        register0.loginUser("", "hi!");
        register0.runRegistrationSystem((int) (short) 100);
        java.lang.Class<?> wildcardClass14 = register0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test1498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest2.test1498");
        Register register0 = new Register();
        register0.runRegistrationSystem((int) (short) 0);
        register0.loginUser("hi!", "hi!");
        register0.registerUser("", "");
        register0.runRegistrationSystem((int) '#');
        register0.runRegistrationSystem((int) (byte) 0);
        register0.registerUser("", "");
        register0.runRegistrationSystem((int) (byte) 10);
        register0.registerUser("", "");
        register0.runRegistrationSystem((int) (short) 1);
    }

    @Test
    public void test1499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest2.test1499");
        Register register0 = new Register();
        register0.registerUser("hi!", "");
        register0.loginUser("", "hi!");
        register0.runRegistrationSystem((int) 'a');
        register0.runRegistrationSystem((int) (byte) 100);
    }

    @Test
    public void test1500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest2.test1500");
        Register register0 = new Register();
        register0.registerUser("hi!", "");
        register0.loginUser("", "hi!");
        register0.loginUser("", "hi!");
        register0.runRegistrationSystem(10);
        register0.runRegistrationSystem((-1));
        register0.runRegistrationSystem((int) (short) 1);
        register0.registerUser("hi!", "hi!");
        register0.registerUser("", "");
    }
}

