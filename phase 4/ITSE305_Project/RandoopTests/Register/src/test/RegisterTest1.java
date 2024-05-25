import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegisterTest1 {

    public static boolean debug = false;

    @Test
    public void test0501() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest1.test0501");
        Register register0 = new Register();
        register0.runRegistrationSystem((int) (byte) -1);
        register0.runRegistrationSystem((int) (byte) 10);
        register0.registerUser("", "hi!");
        register0.registerUser("", "hi!");
    }

    @Test
    public void test0502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest1.test0502");
        Register register0 = new Register();
        register0.runRegistrationSystem((int) (byte) -1);
        register0.runRegistrationSystem((int) (short) 10);
        register0.runRegistrationSystem(10);
        register0.loginUser("", "");
        register0.registerUser("hi!", "hi!");
        java.lang.Class<?> wildcardClass13 = register0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest1.test0503");
        Register register0 = new Register();
        register0.loginUser("hi!", "hi!");
        register0.registerUser("hi!", "");
        register0.registerUser("", "");
        register0.runRegistrationSystem((int) (byte) 100);
        register0.registerUser("", "hi!");
        java.lang.Class<?> wildcardClass15 = register0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest1.test0504");
        Register register0 = new Register();
        register0.runRegistrationSystem((int) (byte) -1);
        register0.registerUser("hi!", "");
        register0.runRegistrationSystem(0);
        java.lang.Class<?> wildcardClass8 = register0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest1.test0505");
        Register register0 = new Register();
        register0.runRegistrationSystem((int) '#');
        register0.registerUser("", "hi!");
        register0.loginUser("hi!", "hi!");
        register0.loginUser("", "hi!");
        register0.loginUser("hi!", "hi!");
        register0.registerUser("", "");
        register0.loginUser("hi!", "");
        java.lang.Class<?> wildcardClass21 = register0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test0506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest1.test0506");
        Register register0 = new Register();
        register0.loginUser("hi!", "hi!");
        register0.registerUser("hi!", "");
        register0.registerUser("", "");
        register0.registerUser("", "hi!");
        register0.loginUser("", "hi!");
        register0.registerUser("hi!", "hi!");
        register0.loginUser("", "");
        java.lang.Class<?> wildcardClass22 = register0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test0507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest1.test0507");
        Register register0 = new Register();
        register0.loginUser("hi!", "hi!");
        register0.registerUser("hi!", "");
        register0.registerUser("hi!", "");
        register0.loginUser("", "hi!");
        register0.registerUser("", "hi!");
        register0.loginUser("hi!", "");
        java.lang.Class<?> wildcardClass19 = register0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test0508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest1.test0508");
        Register register0 = new Register();
        register0.runRegistrationSystem((int) (byte) -1);
        register0.registerUser("hi!", "");
        register0.runRegistrationSystem((int) (byte) -1);
        register0.loginUser("", "hi!");
        java.lang.Class<?> wildcardClass11 = register0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest1.test0509");
        Register register0 = new Register();
        register0.runRegistrationSystem((int) '#');
        register0.registerUser("", "hi!");
        register0.runRegistrationSystem((int) (short) 0);
        register0.runRegistrationSystem((int) (byte) 1);
        register0.registerUser("", "");
        register0.runRegistrationSystem((int) (short) 10);
        register0.runRegistrationSystem((int) ' ');
        java.lang.Class<?> wildcardClass17 = register0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test0510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest1.test0510");
        Register register0 = new Register();
        register0.registerUser("hi!", "");
        register0.registerUser("", "");
        register0.registerUser("", "hi!");
        java.lang.Class<?> wildcardClass10 = register0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest1.test0511");
        Register register0 = new Register();
        register0.registerUser("hi!", "");
        register0.runRegistrationSystem(1);
        register0.registerUser("", "");
        register0.runRegistrationSystem((int) (short) -1);
        register0.loginUser("", "");
        register0.registerUser("", "hi!");
        java.lang.Class<?> wildcardClass17 = register0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test0512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest1.test0512");
        Register register0 = new Register();
        register0.registerUser("hi!", "");
        register0.registerUser("hi!", "");
        register0.loginUser("hi!", "");
        register0.loginUser("", "hi!");
        register0.loginUser("hi!", "");
        register0.loginUser("hi!", "");
        register0.registerUser("hi!", "hi!");
        java.lang.Class<?> wildcardClass22 = register0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test0513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest1.test0513");
        Register register0 = new Register();
        register0.runRegistrationSystem((int) (byte) -1);
        register0.registerUser("hi!", "");
        register0.runRegistrationSystem((int) (short) 1);
        register0.runRegistrationSystem(10);
        java.lang.Class<?> wildcardClass10 = register0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest1.test0514");
        Register register0 = new Register();
        register0.loginUser("hi!", "hi!");
        register0.registerUser("hi!", "");
        register0.registerUser("", "");
        register0.registerUser("", "hi!");
        register0.registerUser("", "");
        register0.registerUser("", "");
        register0.runRegistrationSystem((int) (short) 1);
        register0.loginUser("hi!", "hi!");
        java.lang.Class<?> wildcardClass24 = register0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test0515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest1.test0515");
        Register register0 = new Register();
        register0.loginUser("hi!", "hi!");
        register0.registerUser("hi!", "");
        register0.registerUser("", "");
        register0.registerUser("", "hi!");
        register0.registerUser("", "");
        register0.loginUser("", "hi!");
        register0.registerUser("hi!", "hi!");
        java.lang.Class<?> wildcardClass22 = register0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test0516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest1.test0516");
        Register register0 = new Register();
        register0.loginUser("hi!", "hi!");
        register0.registerUser("hi!", "");
        register0.registerUser("hi!", "");
        register0.registerUser("", "");
        register0.runRegistrationSystem(100);
        register0.loginUser("", "");
        register0.runRegistrationSystem((int) (short) 0);
        java.lang.Class<?> wildcardClass20 = register0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test0517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest1.test0517");
        Register register0 = new Register();
        register0.runRegistrationSystem((int) (byte) -1);
        register0.runRegistrationSystem((int) '#');
        register0.loginUser("", "");
        register0.runRegistrationSystem((int) (short) 0);
        register0.runRegistrationSystem((int) (short) 0);
    }

    @Test
    public void test0518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest1.test0518");
        Register register0 = new Register();
        register0.registerUser("hi!", "");
        register0.loginUser("", "hi!");
        register0.runRegistrationSystem((int) 'a');
        register0.loginUser("", "hi!");
        register0.loginUser("", "hi!");
        register0.loginUser("", "hi!");
        register0.registerUser("hi!", "hi!");
        register0.loginUser("hi!", "");
        java.lang.Class<?> wildcardClass24 = register0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test0519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest1.test0519");
        Register register0 = new Register();
        register0.runRegistrationSystem((int) (byte) -1);
        register0.runRegistrationSystem((int) '#');
        register0.loginUser("", "");
        register0.runRegistrationSystem((int) (short) 0);
        register0.runRegistrationSystem(0);
    }

    @Test
    public void test0520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest1.test0520");
        Register register0 = new Register();
        register0.runRegistrationSystem((int) (byte) -1);
        register0.registerUser("hi!", "");
        register0.registerUser("", "");
        register0.loginUser("", "");
        java.lang.Class<?> wildcardClass12 = register0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest1.test0521");
        Register register0 = new Register();
        register0.runRegistrationSystem((int) (byte) -1);
        register0.registerUser("hi!", "");
        register0.loginUser("hi!", "hi!");
        register0.loginUser("hi!", "");
        register0.runRegistrationSystem((int) (byte) -1);
        register0.loginUser("hi!", "");
        register0.runRegistrationSystem(0);
    }

    @Test
    public void test0522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest1.test0522");
        Register register0 = new Register();
        register0.loginUser("hi!", "hi!");
        register0.registerUser("hi!", "hi!");
        register0.loginUser("", "");
        register0.loginUser("hi!", "");
        register0.runRegistrationSystem((int) (short) 10);
        java.lang.Class<?> wildcardClass15 = register0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest1.test0523");
        Register register0 = new Register();
        register0.runRegistrationSystem((int) (byte) -1);
        register0.registerUser("hi!", "");
        register0.runRegistrationSystem((int) (short) 1);
        register0.loginUser("", "");
        register0.loginUser("hi!", "hi!");
        register0.registerUser("", "");
        java.lang.Class<?> wildcardClass17 = register0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test0524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest1.test0524");
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
        java.lang.Class<?> wildcardClass29 = register0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass29);
    }

    @Test
    public void test0525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest1.test0525");
        Register register0 = new Register();
        register0.loginUser("hi!", "hi!");
        register0.registerUser("hi!", "");
        register0.loginUser("hi!", "hi!");
        register0.runRegistrationSystem(100);
        register0.runRegistrationSystem((int) (byte) 1);
        register0.registerUser("", "");
        register0.loginUser("", "hi!");
        register0.loginUser("", "hi!");
    }

    @Test
    public void test0526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest1.test0526");
        Register register0 = new Register();
        register0.runRegistrationSystem((int) '#');
        register0.registerUser("", "hi!");
        register0.registerUser("hi!", "");
        register0.registerUser("", "");
    }

    @Test
    public void test0527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest1.test0527");
        Register register0 = new Register();
        register0.registerUser("hi!", "");
        register0.loginUser("", "hi!");
        register0.runRegistrationSystem((int) 'a');
        register0.loginUser("", "hi!");
        register0.loginUser("hi!", "");
        register0.registerUser("hi!", "hi!");
        register0.runRegistrationSystem(1);
        register0.registerUser("hi!", "hi!");
        register0.runRegistrationSystem((int) (short) 1);
    }

    @Test
    public void test0528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest1.test0528");
        Register register0 = new Register();
        register0.registerUser("hi!", "");
        register0.loginUser("", "hi!");
        register0.runRegistrationSystem((int) 'a');
        register0.loginUser("hi!", "");
        register0.runRegistrationSystem((-1));
        register0.registerUser("hi!", "");
        register0.registerUser("hi!", "hi!");
        java.lang.Class<?> wildcardClass20 = register0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test0529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest1.test0529");
        Register register0 = new Register();
        register0.runRegistrationSystem((int) (byte) -1);
        register0.runRegistrationSystem((int) (short) 10);
        register0.runRegistrationSystem(10);
        register0.loginUser("", "");
        register0.registerUser("hi!", "hi!");
        register0.runRegistrationSystem((int) (short) 10);
        java.lang.Class<?> wildcardClass15 = register0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest1.test0530");
        Register register0 = new Register();
        register0.loginUser("hi!", "hi!");
        register0.registerUser("hi!", "");
        register0.registerUser("hi!", "");
        register0.registerUser("", "");
        register0.loginUser("", "hi!");
        register0.loginUser("hi!", "");
        register0.registerUser("", "hi!");
        register0.runRegistrationSystem(0);
    }

    @Test
    public void test0531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest1.test0531");
        Register register0 = new Register();
        register0.registerUser("hi!", "");
        register0.registerUser("hi!", "");
        register0.loginUser("hi!", "hi!");
        register0.loginUser("hi!", "");
        register0.loginUser("", "hi!");
        register0.registerUser("", "hi!");
        register0.registerUser("", "hi!");
    }

    @Test
    public void test0532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest1.test0532");
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
        register0.runRegistrationSystem((int) (short) 100);
    }

    @Test
    public void test0533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest1.test0533");
        Register register0 = new Register();
        register0.registerUser("hi!", "");
        register0.loginUser("", "hi!");
        register0.runRegistrationSystem((int) 'a');
        register0.loginUser("hi!", "");
        register0.runRegistrationSystem((-1));
        register0.registerUser("hi!", "");
        register0.runRegistrationSystem((int) (byte) 1);
        register0.registerUser("hi!", "");
        java.lang.Class<?> wildcardClass22 = register0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test0534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest1.test0534");
        Register register0 = new Register();
        register0.runRegistrationSystem((int) '#');
        register0.registerUser("", "hi!");
        register0.loginUser("hi!", "hi!");
        register0.loginUser("", "hi!");
        register0.runRegistrationSystem((int) (byte) 1);
        register0.registerUser("", "hi!");
        register0.loginUser("hi!", "hi!");
        register0.registerUser("", "");
    }

    @Test
    public void test0535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest1.test0535");
        Register register0 = new Register();
        register0.registerUser("hi!", "");
        register0.loginUser("", "hi!");
        register0.runRegistrationSystem((int) (byte) -1);
        register0.runRegistrationSystem(1);
        register0.loginUser("hi!", "");
        register0.runRegistrationSystem((int) (short) -1);
        register0.registerUser("hi!", "");
        register0.loginUser("", "");
    }

    @Test
    public void test0536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest1.test0536");
        Register register0 = new Register();
        register0.runRegistrationSystem((int) (short) 0);
        register0.loginUser("hi!", "hi!");
        register0.runRegistrationSystem(1);
    }

    @Test
    public void test0537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest1.test0537");
        Register register0 = new Register();
        register0.runRegistrationSystem((int) (short) 0);
        register0.loginUser("hi!", "hi!");
        register0.registerUser("", "");
        register0.runRegistrationSystem((-1));
        register0.runRegistrationSystem((int) (short) 0);
        register0.registerUser("", "");
        register0.runRegistrationSystem((int) (short) -1);
        register0.runRegistrationSystem((int) (short) -1);
        register0.registerUser("hi!", "hi!");
    }

    @Test
    public void test0538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest1.test0538");
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
        java.lang.Class<?> wildcardClass26 = register0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass26);
    }

    @Test
    public void test0539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest1.test0539");
        Register register0 = new Register();
        register0.loginUser("hi!", "hi!");
        register0.runRegistrationSystem(0);
        register0.registerUser("", "");
        register0.registerUser("", "hi!");
        register0.loginUser("hi!", "");
        register0.registerUser("", "");
        java.lang.Class<?> wildcardClass18 = register0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test0540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest1.test0540");
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
        register0.registerUser("hi!", "hi!");
    }

    @Test
    public void test0541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest1.test0541");
        Register register0 = new Register();
        register0.loginUser("hi!", "hi!");
        register0.registerUser("hi!", "");
        register0.registerUser("hi!", "");
        register0.registerUser("", "");
        register0.runRegistrationSystem(100);
        register0.registerUser("hi!", "");
        java.lang.Class<?> wildcardClass18 = register0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test0542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest1.test0542");
        Register register0 = new Register();
        register0.registerUser("", "hi!");
        register0.registerUser("", "");
        register0.registerUser("", "");
    }

    @Test
    public void test0543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest1.test0543");
        Register register0 = new Register();
        register0.loginUser("hi!", "hi!");
        register0.registerUser("hi!", "");
        register0.loginUser("hi!", "hi!");
        register0.registerUser("", "");
        register0.runRegistrationSystem((int) 'a');
        register0.loginUser("hi!", "");
        register0.registerUser("", "hi!");
    }

    @Test
    public void test0544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest1.test0544");
        Register register0 = new Register();
        register0.loginUser("hi!", "hi!");
        register0.registerUser("hi!", "");
        register0.registerUser("hi!", "");
        register0.registerUser("", "hi!");
        register0.loginUser("", "");
        register0.runRegistrationSystem((int) (byte) 100);
        register0.runRegistrationSystem((int) 'a');
        register0.registerUser("hi!", "");
        register0.registerUser("hi!", "");
        java.lang.Class<?> wildcardClass26 = register0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass26);
    }

    @Test
    public void test0545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest1.test0545");
        Register register0 = new Register();
        register0.loginUser("hi!", "hi!");
        register0.loginUser("hi!", "hi!");
        register0.registerUser("", "");
        register0.runRegistrationSystem((int) (short) 10);
        register0.loginUser("hi!", "");
        register0.registerUser("", "");
        java.lang.Class<?> wildcardClass18 = register0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test0546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest1.test0546");
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
        register0.runRegistrationSystem((int) 'a');
    }

    @Test
    public void test0547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest1.test0547");
        Register register0 = new Register();
        register0.registerUser("hi!", "");
        register0.loginUser("", "hi!");
        register0.loginUser("", "hi!");
        register0.runRegistrationSystem(10);
        register0.loginUser("", "");
        register0.runRegistrationSystem((int) (byte) 10);
        register0.runRegistrationSystem((int) (short) 0);
        java.lang.Class<?> wildcardClass19 = register0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test0548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest1.test0548");
        Register register0 = new Register();
        register0.registerUser("hi!", "");
        register0.loginUser("", "hi!");
        register0.runRegistrationSystem((int) 'a');
        register0.loginUser("hi!", "");
        register0.registerUser("hi!", "hi!");
        register0.loginUser("", "hi!");
    }

    @Test
    public void test0549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest1.test0549");
        Register register0 = new Register();
        register0.registerUser("hi!", "");
        register0.loginUser("hi!", "hi!");
        register0.registerUser("hi!", "hi!");
        register0.loginUser("", "hi!");
        register0.registerUser("", "");
    }

    @Test
    public void test0550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest1.test0550");
        Register register0 = new Register();
        register0.runRegistrationSystem((int) (short) 0);
        register0.loginUser("hi!", "hi!");
        register0.registerUser("", "");
        register0.runRegistrationSystem((int) '#');
        register0.registerUser("", "hi!");
        register0.registerUser("hi!", "hi!");
        java.lang.Class<?> wildcardClass17 = register0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test0551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest1.test0551");
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
        register0.registerUser("hi!", "hi!");
        java.lang.Class<?> wildcardClass30 = register0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass30);
    }

    @Test
    public void test0552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest1.test0552");
        Register register0 = new Register();
        register0.registerUser("hi!", "");
        register0.registerUser("hi!", "");
        register0.loginUser("", "hi!");
    }

    @Test
    public void test0553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest1.test0553");
        Register register0 = new Register();
        register0.runRegistrationSystem((int) (short) 0);
        register0.loginUser("hi!", "hi!");
        register0.registerUser("", "");
        register0.runRegistrationSystem((-1));
        register0.loginUser("hi!", "");
        register0.registerUser("hi!", "hi!");
        register0.runRegistrationSystem(1);
        register0.runRegistrationSystem((int) (short) 100);
        java.lang.Class<?> wildcardClass21 = register0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test0554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest1.test0554");
        Register register0 = new Register();
        register0.registerUser("hi!", "");
        register0.runRegistrationSystem(1);
        register0.registerUser("", "");
        register0.runRegistrationSystem((int) (short) -1);
        register0.loginUser("", "");
        register0.loginUser("hi!", "");
        register0.loginUser("hi!", "hi!");
        register0.registerUser("", "hi!");
        register0.registerUser("", "");
        java.lang.Class<?> wildcardClass26 = register0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass26);
    }

    @Test
    public void test0555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest1.test0555");
        Register register0 = new Register();
        register0.registerUser("hi!", "");
        register0.registerUser("hi!", "");
        register0.loginUser("hi!", "");
        register0.loginUser("hi!", "");
        register0.runRegistrationSystem(10);
        register0.registerUser("", "");
        register0.registerUser("hi!", "hi!");
        java.lang.Class<?> wildcardClass21 = register0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test0556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest1.test0556");
        Register register0 = new Register();
        register0.runRegistrationSystem((int) (short) 0);
        register0.loginUser("hi!", "hi!");
        register0.registerUser("", "");
        register0.runRegistrationSystem((int) '#');
        register0.registerUser("", "hi!");
        register0.runRegistrationSystem((int) (short) 1);
        register0.runRegistrationSystem((int) 'a');
        register0.runRegistrationSystem((int) (short) 1);
    }

    @Test
    public void test0557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest1.test0557");
        Register register0 = new Register();
        register0.runRegistrationSystem((int) (short) 0);
        register0.loginUser("hi!", "hi!");
        register0.registerUser("", "");
        register0.runRegistrationSystem((int) '#');
        register0.runRegistrationSystem((int) (byte) 0);
        register0.runRegistrationSystem(0);
        register0.registerUser("", "hi!");
        register0.loginUser("", "");
        register0.loginUser("", "hi!");
    }

    @Test
    public void test0558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest1.test0558");
        Register register0 = new Register();
        register0.registerUser("hi!", "");
        register0.loginUser("hi!", "hi!");
        register0.runRegistrationSystem((int) '#');
        register0.registerUser("hi!", "hi!");
        register0.runRegistrationSystem(100);
    }

    @Test
    public void test0559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest1.test0559");
        Register register0 = new Register();
        register0.runRegistrationSystem((int) '#');
        register0.loginUser("hi!", "hi!");
        register0.registerUser("", "");
        register0.loginUser("", "hi!");
        register0.loginUser("", "");
        register0.registerUser("hi!", "");
    }

    @Test
    public void test0560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest1.test0560");
        Register register0 = new Register();
        register0.runRegistrationSystem((int) (byte) -1);
        register0.registerUser("hi!", "");
        register0.loginUser("hi!", "hi!");
        register0.runRegistrationSystem((int) (byte) 1);
        register0.registerUser("", "hi!");
        register0.loginUser("", "");
        register0.registerUser("hi!", "");
        java.lang.Class<?> wildcardClass20 = register0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test0561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest1.test0561");
        Register register0 = new Register();
        register0.registerUser("hi!", "");
        register0.loginUser("", "");
        register0.runRegistrationSystem((int) 'a');
        register0.runRegistrationSystem((int) (short) 100);
        register0.loginUser("", "hi!");
    }

    @Test
    public void test0562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest1.test0562");
        Register register0 = new Register();
        register0.runRegistrationSystem((int) '#');
        register0.registerUser("", "hi!");
        register0.runRegistrationSystem((int) (short) 0);
        register0.loginUser("hi!", "hi!");
        register0.registerUser("hi!", "");
    }

    @Test
    public void test0563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest1.test0563");
        Register register0 = new Register();
        register0.loginUser("hi!", "hi!");
        register0.registerUser("hi!", "");
        register0.registerUser("hi!", "");
        register0.registerUser("", "hi!");
        register0.loginUser("", "");
        register0.runRegistrationSystem((int) (byte) 100);
        register0.runRegistrationSystem((int) (short) 10);
    }

    @Test
    public void test0564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest1.test0564");
        Register register0 = new Register();
        register0.runRegistrationSystem((int) (byte) -1);
        register0.registerUser("hi!", "");
        register0.loginUser("hi!", "hi!");
        register0.registerUser("", "");
        java.lang.Class<?> wildcardClass12 = register0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest1.test0565");
        Register register0 = new Register();
        register0.runRegistrationSystem((int) (byte) -1);
        register0.registerUser("hi!", "");
        register0.runRegistrationSystem((int) (short) 1);
        register0.runRegistrationSystem((int) 'a');
        register0.registerUser("", "");
        register0.runRegistrationSystem((int) (byte) 100);
        register0.registerUser("hi!", "");
        register0.runRegistrationSystem((int) (byte) 1);
        java.lang.Class<?> wildcardClass20 = register0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test0566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest1.test0566");
        Register register0 = new Register();
        register0.registerUser("hi!", "");
        register0.loginUser("hi!", "hi!");
        register0.runRegistrationSystem((int) '#');
        register0.registerUser("hi!", "");
        register0.loginUser("", "");
        register0.runRegistrationSystem((int) (short) -1);
    }

    @Test
    public void test0567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest1.test0567");
        Register register0 = new Register();
        register0.loginUser("hi!", "hi!");
        register0.runRegistrationSystem(0);
        register0.registerUser("", "");
        register0.loginUser("", "");
        java.lang.Class<?> wildcardClass12 = register0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest1.test0568");
        Register register0 = new Register();
        register0.loginUser("hi!", "hi!");
        register0.registerUser("hi!", "");
        register0.loginUser("hi!", "hi!");
        register0.runRegistrationSystem(100);
        register0.registerUser("hi!", "");
        register0.runRegistrationSystem((int) (byte) -1);
        register0.registerUser("", "hi!");
    }

    @Test
    public void test0569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest1.test0569");
        Register register0 = new Register();
        register0.registerUser("hi!", "");
        register0.runRegistrationSystem(1);
        register0.loginUser("hi!", "");
        register0.runRegistrationSystem((int) (short) 1);
        java.lang.Class<?> wildcardClass11 = register0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest1.test0570");
        Register register0 = new Register();
        register0.runRegistrationSystem((int) (byte) -1);
        register0.runRegistrationSystem((int) (byte) 10);
        register0.registerUser("", "");
        register0.runRegistrationSystem((int) (byte) -1);
        register0.runRegistrationSystem(0);
    }

    @Test
    public void test0571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest1.test0571");
        Register register0 = new Register();
        register0.registerUser("hi!", "");
        register0.registerUser("hi!", "");
        register0.runRegistrationSystem((int) (byte) -1);
        register0.registerUser("", "hi!");
        java.lang.Class<?> wildcardClass12 = register0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest1.test0572");
        Register register0 = new Register();
        register0.registerUser("hi!", "");
        register0.runRegistrationSystem(1);
        register0.registerUser("", "");
        register0.runRegistrationSystem((int) (short) -1);
        register0.loginUser("", "");
        register0.loginUser("", "");
        register0.loginUser("", "hi!");
    }

    @Test
    public void test0573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest1.test0573");
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
        register0.registerUser("hi!", "hi!");
    }

    @Test
    public void test0574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest1.test0574");
        Register register0 = new Register();
        register0.registerUser("", "hi!");
        register0.registerUser("", "hi!");
        register0.registerUser("hi!", "");
        register0.registerUser("", "hi!");
        java.lang.Class<?> wildcardClass13 = register0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest1.test0575");
        Register register0 = new Register();
        register0.runRegistrationSystem((int) (short) 0);
        register0.loginUser("hi!", "hi!");
        register0.registerUser("", "");
        register0.runRegistrationSystem((-1));
        register0.runRegistrationSystem((int) (short) 10);
        register0.runRegistrationSystem(10);
        register0.registerUser("hi!", "");
        register0.registerUser("hi!", "hi!");
        register0.runRegistrationSystem((int) (byte) 10);
        java.lang.Class<?> wildcardClass23 = register0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test0576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest1.test0576");
        Register register0 = new Register();
        register0.runRegistrationSystem((int) (byte) -1);
        register0.registerUser("hi!", "");
        register0.registerUser("", "hi!");
        register0.loginUser("hi!", "hi!");
        register0.registerUser("hi!", "hi!");
        register0.loginUser("hi!", "hi!");
        java.lang.Class<?> wildcardClass18 = register0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test0577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest1.test0577");
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
        register0.loginUser("hi!", "hi!");
        register0.loginUser("", "");
        java.lang.Class<?> wildcardClass32 = register0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass32);
    }

    @Test
    public void test0578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest1.test0578");
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
        register0.registerUser("hi!", "hi!");
    }

    @Test
    public void test0579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest1.test0579");
        Register register0 = new Register();
        register0.registerUser("hi!", "");
        register0.registerUser("hi!", "");
        register0.loginUser("hi!", "");
        register0.runRegistrationSystem(10);
        register0.loginUser("", "hi!");
        register0.loginUser("hi!", "hi!");
    }

    @Test
    public void test0580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest1.test0580");
        Register register0 = new Register();
        register0.runRegistrationSystem((int) (short) 0);
        register0.loginUser("hi!", "hi!");
        register0.loginUser("", "");
        register0.registerUser("hi!", "");
        register0.loginUser("hi!", "hi!");
        register0.loginUser("", "hi!");
        register0.registerUser("", "");
        register0.runRegistrationSystem((int) (short) -1);
        register0.runRegistrationSystem(0);
    }

    @Test
    public void test0581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest1.test0581");
        Register register0 = new Register();
        register0.runRegistrationSystem((int) (short) 0);
        register0.loginUser("hi!", "hi!");
        register0.registerUser("", "");
        register0.runRegistrationSystem((-1));
        register0.runRegistrationSystem((int) (short) 10);
        register0.runRegistrationSystem(10);
        register0.loginUser("", "hi!");
        register0.runRegistrationSystem((int) (byte) 10);
        register0.runRegistrationSystem((int) (byte) 10);
        register0.registerUser("hi!", "hi!");
    }

    @Test
    public void test0582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest1.test0582");
        Register register0 = new Register();
        register0.runRegistrationSystem((int) (byte) -1);
        register0.registerUser("hi!", "");
        register0.loginUser("hi!", "hi!");
        register0.loginUser("hi!", "hi!");
        register0.runRegistrationSystem((int) (short) 1);
        register0.registerUser("hi!", "hi!");
        java.lang.Class<?> wildcardClass17 = register0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test0583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest1.test0583");
        Register register0 = new Register();
        register0.loginUser("", "hi!");
        register0.registerUser("", "");
        register0.runRegistrationSystem((int) ' ');
        register0.runRegistrationSystem((int) 'a');
        java.lang.Class<?> wildcardClass11 = register0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest1.test0584");
        Register register0 = new Register();
        register0.runRegistrationSystem((int) (short) 0);
        register0.loginUser("hi!", "hi!");
        register0.registerUser("", "");
        register0.runRegistrationSystem((-1));
        register0.runRegistrationSystem((int) (short) 0);
        register0.runRegistrationSystem((int) ' ');
        register0.loginUser("", "");
        java.lang.Class<?> wildcardClass18 = register0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test0585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest1.test0585");
        Register register0 = new Register();
        register0.loginUser("hi!", "hi!");
        register0.runRegistrationSystem(0);
        register0.registerUser("", "");
        register0.registerUser("", "hi!");
        register0.registerUser("", "");
    }

    @Test
    public void test0586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest1.test0586");
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
        register0.registerUser("", "hi!");
    }

    @Test
    public void test0587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest1.test0587");
        Register register0 = new Register();
        register0.runRegistrationSystem((int) '#');
        register0.loginUser("hi!", "hi!");
        register0.registerUser("", "");
        register0.loginUser("", "hi!");
        java.lang.Class<?> wildcardClass12 = register0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest1.test0588");
        Register register0 = new Register();
        register0.runRegistrationSystem((int) (short) 0);
        register0.loginUser("hi!", "hi!");
        register0.registerUser("", "");
        register0.runRegistrationSystem((int) '#');
        register0.runRegistrationSystem((int) (byte) 0);
        register0.runRegistrationSystem(0);
        register0.registerUser("", "hi!");
        register0.loginUser("", "");
        java.lang.Class<?> wildcardClass21 = register0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test0589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest1.test0589");
        Register register0 = new Register();
        register0.runRegistrationSystem((int) '#');
        register0.loginUser("hi!", "hi!");
        register0.loginUser("hi!", "hi!");
        register0.loginUser("hi!", "");
        register0.registerUser("", "hi!");
        java.lang.Class<?> wildcardClass15 = register0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest1.test0590");
        Register register0 = new Register();
        register0.registerUser("hi!", "");
        register0.registerUser("hi!", "");
        register0.loginUser("hi!", "");
        register0.loginUser("hi!", "");
        register0.loginUser("", "hi!");
        register0.loginUser("", "hi!");
        register0.registerUser("", "");
        register0.runRegistrationSystem((int) 'a');
        java.lang.Class<?> wildcardClass24 = register0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test0591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest1.test0591");
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
        register0.runRegistrationSystem((int) '#');
        java.lang.Class<?> wildcardClass31 = register0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test0592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest1.test0592");
        Register register0 = new Register();
        register0.runRegistrationSystem((int) (short) 0);
        register0.loginUser("hi!", "hi!");
        register0.registerUser("", "");
        register0.runRegistrationSystem((-1));
        register0.runRegistrationSystem((int) (short) 0);
        register0.runRegistrationSystem((int) (byte) -1);
        register0.registerUser("hi!", "");
        register0.registerUser("hi!", "");
    }

    @Test
    public void test0593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest1.test0593");
        Register register0 = new Register();
        register0.runRegistrationSystem((int) (short) 0);
        register0.loginUser("hi!", "hi!");
        register0.loginUser("", "");
        register0.runRegistrationSystem((int) (short) 1);
        register0.loginUser("", "hi!");
    }

    @Test
    public void test0594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest1.test0594");
        Register register0 = new Register();
        register0.loginUser("hi!", "hi!");
        register0.registerUser("hi!", "");
        register0.loginUser("hi!", "hi!");
        register0.runRegistrationSystem(100);
        register0.runRegistrationSystem((int) (byte) 1);
        register0.loginUser("", "");
        register0.registerUser("hi!", "hi!");
        register0.registerUser("hi!", "hi!");
    }

    @Test
    public void test0595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest1.test0595");
        Register register0 = new Register();
        register0.registerUser("", "");
        register0.registerUser("", "hi!");
        register0.registerUser("", "");
        java.lang.Class<?> wildcardClass10 = register0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest1.test0596");
        Register register0 = new Register();
        register0.runRegistrationSystem((int) (short) 0);
        register0.loginUser("hi!", "hi!");
        register0.registerUser("", "");
        register0.registerUser("", "hi!");
        register0.loginUser("", "");
    }

    @Test
    public void test0597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest1.test0597");
        Register register0 = new Register();
        register0.loginUser("hi!", "hi!");
        register0.runRegistrationSystem(0);
        register0.registerUser("", "");
        register0.loginUser("", "hi!");
        register0.runRegistrationSystem((int) ' ');
        java.lang.Class<?> wildcardClass14 = register0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest1.test0598");
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
        java.lang.Class<?> wildcardClass24 = register0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test0599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest1.test0599");
        Register register0 = new Register();
        register0.registerUser("hi!", "");
        register0.loginUser("hi!", "hi!");
        register0.runRegistrationSystem((int) '#');
        register0.loginUser("", "hi!");
        register0.runRegistrationSystem((int) (byte) 10);
        java.lang.Class<?> wildcardClass14 = register0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest1.test0600");
        Register register0 = new Register();
        register0.loginUser("hi!", "hi!");
        register0.registerUser("hi!", "");
        register0.registerUser("hi!", "");
        register0.registerUser("", "");
        register0.runRegistrationSystem(100);
        register0.registerUser("hi!", "");
        register0.registerUser("", "");
        register0.runRegistrationSystem(0);
        java.lang.Class<?> wildcardClass23 = register0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test0601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest1.test0601");
        Register register0 = new Register();
        register0.runRegistrationSystem((int) (short) 0);
        register0.loginUser("hi!", "hi!");
        register0.registerUser("", "");
        register0.runRegistrationSystem((int) '#');
        register0.registerUser("", "hi!");
        register0.registerUser("hi!", "hi!");
        register0.runRegistrationSystem((int) (byte) -1);
    }

    @Test
    public void test0602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest1.test0602");
        Register register0 = new Register();
        register0.loginUser("hi!", "hi!");
        register0.runRegistrationSystem(0);
        register0.runRegistrationSystem(10);
        register0.runRegistrationSystem(1);
        java.lang.Class<?> wildcardClass10 = register0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest1.test0603");
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
        java.lang.Class<?> wildcardClass29 = register0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass29);
    }

    @Test
    public void test0604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest1.test0604");
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
        register0.registerUser("", "hi!");
    }

    @Test
    public void test0605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest1.test0605");
        Register register0 = new Register();
        register0.runRegistrationSystem((int) '#');
        register0.loginUser("hi!", "hi!");
        register0.runRegistrationSystem((int) (byte) 10);
        register0.registerUser("hi!", "hi!");
        register0.runRegistrationSystem((int) (byte) 100);
        java.lang.Class<?> wildcardClass13 = register0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest1.test0606");
        Register register0 = new Register();
        register0.runRegistrationSystem((int) '#');
        register0.loginUser("hi!", "hi!");
        register0.loginUser("hi!", "hi!");
        register0.loginUser("hi!", "");
        register0.loginUser("", "hi!");
        register0.registerUser("", "");
    }

    @Test
    public void test0607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest1.test0607");
        Register register0 = new Register();
        register0.registerUser("hi!", "");
        register0.registerUser("hi!", "");
        register0.loginUser("hi!", "");
        register0.registerUser("", "hi!");
        register0.registerUser("hi!", "");
        register0.loginUser("", "hi!");
        register0.loginUser("", "");
        java.lang.Class<?> wildcardClass22 = register0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test0608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest1.test0608");
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
        register0.registerUser("", "");
    }

    @Test
    public void test0609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest1.test0609");
        Register register0 = new Register();
        register0.loginUser("hi!", "hi!");
        register0.registerUser("hi!", "");
        register0.registerUser("", "");
        register0.registerUser("hi!", "");
        register0.registerUser("hi!", "");
        register0.registerUser("hi!", "");
        register0.runRegistrationSystem((int) (byte) 0);
        java.lang.Class<?> wildcardClass21 = register0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test0610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest1.test0610");
        Register register0 = new Register();
        register0.loginUser("hi!", "hi!");
        register0.registerUser("", "");
        register0.loginUser("hi!", "hi!");
        register0.registerUser("hi!", "hi!");
        register0.runRegistrationSystem((int) '4');
        java.lang.Class<?> wildcardClass15 = register0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest1.test0611");
        Register register0 = new Register();
        register0.runRegistrationSystem((int) (byte) -1);
        register0.registerUser("hi!", "");
        register0.loginUser("hi!", "hi!");
        register0.loginUser("hi!", "");
        register0.registerUser("hi!", "");
        register0.runRegistrationSystem((int) (byte) 0);
        java.lang.Class<?> wildcardClass17 = register0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test0612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest1.test0612");
        Register register0 = new Register();
        register0.runRegistrationSystem((int) (byte) -1);
        register0.registerUser("hi!", "");
        register0.loginUser("hi!", "hi!");
        register0.loginUser("hi!", "");
        register0.registerUser("hi!", "");
        register0.registerUser("hi!", "");
        register0.runRegistrationSystem((int) '#');
        register0.loginUser("hi!", "");
        java.lang.Class<?> wildcardClass23 = register0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test0613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest1.test0613");
        Register register0 = new Register();
        register0.runRegistrationSystem((int) '#');
        register0.registerUser("", "hi!");
        register0.runRegistrationSystem((int) (short) 0);
        register0.runRegistrationSystem((int) (byte) 1);
        register0.registerUser("", "");
        register0.runRegistrationSystem((int) (short) 10);
        register0.loginUser("hi!", "");
        register0.loginUser("", "");
    }

    @Test
    public void test0614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest1.test0614");
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
        java.lang.Class<?> wildcardClass26 = register0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass26);
    }

    @Test
    public void test0615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest1.test0615");
        Register register0 = new Register();
        register0.registerUser("hi!", "");
        register0.registerUser("hi!", "");
        register0.loginUser("hi!", "");
        register0.loginUser("", "hi!");
        register0.loginUser("", "");
        register0.loginUser("", "");
    }

    @Test
    public void test0616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest1.test0616");
        Register register0 = new Register();
        register0.runRegistrationSystem((int) (short) 0);
        register0.loginUser("hi!", "hi!");
        register0.registerUser("", "");
        register0.runRegistrationSystem((-1));
        register0.runRegistrationSystem((int) (short) 0);
        register0.runRegistrationSystem((int) ' ');
        register0.loginUser("", "");
        register0.loginUser("hi!", "hi!");
        java.lang.Class<?> wildcardClass21 = register0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test0617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest1.test0617");
        Register register0 = new Register();
        register0.registerUser("hi!", "");
        register0.registerUser("hi!", "");
        register0.loginUser("hi!", "");
        register0.loginUser("hi!", "");
        register0.registerUser("", "");
        register0.loginUser("hi!", "hi!");
        java.lang.Class<?> wildcardClass19 = register0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test0618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest1.test0618");
        Register register0 = new Register();
        register0.runRegistrationSystem((int) '#');
        register0.registerUser("", "hi!");
        register0.loginUser("hi!", "hi!");
        register0.loginUser("", "hi!");
        register0.runRegistrationSystem(0);
        register0.runRegistrationSystem((int) (byte) 10);
    }

    @Test
    public void test0619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest1.test0619");
        Register register0 = new Register();
        register0.runRegistrationSystem((int) (byte) -1);
        register0.runRegistrationSystem((int) (short) 10);
        register0.registerUser("", "hi!");
        register0.runRegistrationSystem(0);
        register0.loginUser("hi!", "");
        java.lang.Class<?> wildcardClass13 = register0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest1.test0620");
        Register register0 = new Register();
        register0.loginUser("hi!", "hi!");
        register0.runRegistrationSystem(0);
        register0.runRegistrationSystem(10);
        register0.registerUser("hi!", "");
        register0.registerUser("", "hi!");
        register0.loginUser("hi!", "");
        java.lang.Class<?> wildcardClass17 = register0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test0621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest1.test0621");
        Register register0 = new Register();
        register0.runRegistrationSystem((int) (byte) -1);
        register0.runRegistrationSystem((int) (short) 10);
        register0.runRegistrationSystem((int) (short) -1);
        register0.runRegistrationSystem((int) (short) -1);
        java.lang.Class<?> wildcardClass9 = register0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest1.test0622");
        Register register0 = new Register();
        register0.registerUser("hi!", "");
        register0.loginUser("", "hi!");
        register0.runRegistrationSystem((int) 'a');
        register0.loginUser("", "hi!");
        register0.loginUser("hi!", "");
        register0.registerUser("hi!", "hi!");
        register0.registerUser("", "hi!");
        register0.runRegistrationSystem((int) (short) 10);
        java.lang.Class<?> wildcardClass23 = register0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test0623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest1.test0623");
        Register register0 = new Register();
        register0.loginUser("hi!", "hi!");
        register0.registerUser("hi!", "hi!");
        register0.registerUser("", "hi!");
        register0.runRegistrationSystem((int) (byte) -1);
        java.lang.Class<?> wildcardClass12 = register0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest1.test0624");
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
        register0.loginUser("", "hi!");
        register0.registerUser("", "");
    }

    @Test
    public void test0625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest1.test0625");
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
        java.lang.Class<?> wildcardClass27 = register0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test0626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest1.test0626");
        Register register0 = new Register();
        register0.runRegistrationSystem((int) '#');
        register0.loginUser("hi!", "hi!");
        register0.registerUser("", "");
        register0.loginUser("", "hi!");
        register0.loginUser("", "hi!");
        register0.loginUser("hi!", "hi!");
        java.lang.Class<?> wildcardClass18 = register0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test0627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest1.test0627");
        Register register0 = new Register();
        register0.loginUser("hi!", "hi!");
        register0.registerUser("hi!", "");
        register0.registerUser("", "");
        register0.registerUser("", "hi!");
        register0.registerUser("", "");
        register0.registerUser("", "");
        register0.runRegistrationSystem((int) (short) 1);
        register0.registerUser("", "hi!");
        java.lang.Class<?> wildcardClass24 = register0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test0628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest1.test0628");
        Register register0 = new Register();
        register0.registerUser("hi!", "");
        register0.loginUser("", "hi!");
        register0.runRegistrationSystem((int) 'a');
        register0.loginUser("hi!", "");
        register0.runRegistrationSystem((int) (byte) 1);
        register0.loginUser("hi!", "hi!");
        register0.registerUser("hi!", "");
        register0.loginUser("", "");
        java.lang.Class<?> wildcardClass23 = register0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test0629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest1.test0629");
        Register register0 = new Register();
        register0.loginUser("hi!", "hi!");
        register0.registerUser("hi!", "");
        register0.registerUser("", "");
        register0.registerUser("", "hi!");
        register0.runRegistrationSystem((int) (short) 100);
        register0.runRegistrationSystem((int) (byte) 1);
        register0.loginUser("", "");
        register0.runRegistrationSystem((int) (short) 100);
    }

    @Test
    public void test0630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest1.test0630");
        Register register0 = new Register();
        register0.runRegistrationSystem((int) (byte) -1);
        register0.runRegistrationSystem((int) (byte) 10);
        register0.registerUser("", "");
        register0.loginUser("", "");
        register0.registerUser("", "hi!");
        register0.registerUser("", "hi!");
        register0.registerUser("hi!", "hi!");
        register0.runRegistrationSystem((int) (short) -1);
        register0.registerUser("", "hi!");
        register0.loginUser("hi!", "hi!");
        java.lang.Class<?> wildcardClass28 = register0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test0631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest1.test0631");
        Register register0 = new Register();
        register0.loginUser("hi!", "hi!");
        register0.registerUser("hi!", "hi!");
        register0.runRegistrationSystem((int) (byte) 100);
        register0.loginUser("", "hi!");
        register0.loginUser("hi!", "hi!");
        java.lang.Class<?> wildcardClass15 = register0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest1.test0632");
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
        java.lang.Class<?> wildcardClass30 = register0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass30);
    }

    @Test
    public void test0633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest1.test0633");
        Register register0 = new Register();
        register0.loginUser("hi!", "hi!");
        register0.registerUser("hi!", "");
        register0.registerUser("", "");
        register0.registerUser("", "hi!");
        register0.runRegistrationSystem((int) (short) 100);
        register0.registerUser("", "hi!");
        register0.runRegistrationSystem(0);
        register0.loginUser("", "hi!");
        register0.registerUser("", "");
    }

    @Test
    public void test0634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest1.test0634");
        Register register0 = new Register();
        register0.loginUser("hi!", "hi!");
        register0.loginUser("hi!", "hi!");
        register0.registerUser("", "");
        register0.runRegistrationSystem((int) (byte) 1);
        register0.runRegistrationSystem((int) (short) 10);
        java.lang.Class<?> wildcardClass14 = register0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest1.test0635");
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
        java.lang.Class<?> wildcardClass25 = register0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test0636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest1.test0636");
        Register register0 = new Register();
        register0.loginUser("hi!", "hi!");
        register0.registerUser("", "");
        register0.loginUser("hi!", "hi!");
        register0.registerUser("hi!", "hi!");
        register0.runRegistrationSystem((int) '4');
        register0.loginUser("", "hi!");
    }

    @Test
    public void test0637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest1.test0637");
        Register register0 = new Register();
        register0.runRegistrationSystem((int) (short) 0);
        register0.loginUser("hi!", "hi!");
        register0.loginUser("", "");
        register0.registerUser("hi!", "");
        register0.registerUser("hi!", "hi!");
        register0.runRegistrationSystem((int) 'a');
        register0.loginUser("hi!", "");
        register0.loginUser("hi!", "");
        register0.runRegistrationSystem((int) (short) 0);
    }

    @Test
    public void test0638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest1.test0638");
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
        java.lang.Class<?> wildcardClass26 = register0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass26);
    }

    @Test
    public void test0639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest1.test0639");
        Register register0 = new Register();
        register0.registerUser("hi!", "");
        register0.registerUser("hi!", "");
        register0.loginUser("hi!", "");
        register0.loginUser("", "hi!");
        register0.loginUser("hi!", "");
        register0.loginUser("hi!", "");
        register0.loginUser("", "");
        register0.registerUser("hi!", "hi!");
        register0.runRegistrationSystem(0);
    }

    @Test
    public void test0640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest1.test0640");
        Register register0 = new Register();
        register0.loginUser("hi!", "hi!");
        register0.registerUser("hi!", "");
        register0.registerUser("hi!", "");
        register0.registerUser("", "");
        register0.runRegistrationSystem(100);
        register0.runRegistrationSystem((int) (byte) -1);
        register0.registerUser("hi!", "hi!");
        register0.runRegistrationSystem(100);
        java.lang.Class<?> wildcardClass22 = register0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test0641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest1.test0641");
        Register register0 = new Register();
        register0.runRegistrationSystem((int) '#');
        register0.registerUser("", "hi!");
        register0.loginUser("hi!", "hi!");
        register0.loginUser("", "hi!");
        register0.runRegistrationSystem((int) (byte) 1);
        register0.runRegistrationSystem(10);
        register0.registerUser("", "");
        java.lang.Class<?> wildcardClass19 = register0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test0642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest1.test0642");
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
        register0.loginUser("", "");
        register0.loginUser("hi!", "");
        register0.runRegistrationSystem((int) (short) 0);
        register0.loginUser("", "");
    }

    @Test
    public void test0643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest1.test0643");
        Register register0 = new Register();
        register0.runRegistrationSystem((int) (short) 0);
        register0.loginUser("hi!", "hi!");
        register0.registerUser("", "");
        register0.runRegistrationSystem((int) '#');
        register0.runRegistrationSystem((int) '#');
        register0.loginUser("hi!", "");
        register0.runRegistrationSystem((int) (short) 0);
        register0.registerUser("hi!", "");
        java.lang.Class<?> wildcardClass21 = register0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test0644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest1.test0644");
        Register register0 = new Register();
        register0.runRegistrationSystem((int) (short) 0);
        register0.loginUser("hi!", "hi!");
        register0.loginUser("", "");
        register0.registerUser("hi!", "");
        register0.registerUser("hi!", "hi!");
        register0.runRegistrationSystem((int) 'a');
        register0.loginUser("hi!", "");
        register0.loginUser("hi!", "");
        java.lang.Class<?> wildcardClass23 = register0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test0645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest1.test0645");
        Register register0 = new Register();
        register0.runRegistrationSystem((int) (byte) -1);
        register0.registerUser("hi!", "");
        register0.loginUser("hi!", "hi!");
        register0.loginUser("hi!", "");
        register0.registerUser("hi!", "");
        register0.registerUser("hi!", "hi!");
        register0.registerUser("", "hi!");
        register0.loginUser("", "hi!");
        register0.registerUser("hi!", "hi!");
    }

    @Test
    public void test0646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest1.test0646");
        Register register0 = new Register();
        register0.registerUser("hi!", "");
        register0.loginUser("", "hi!");
        register0.loginUser("", "hi!");
        register0.runRegistrationSystem(10);
        register0.registerUser("", "");
        register0.registerUser("", "hi!");
    }

    @Test
    public void test0647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest1.test0647");
        Register register0 = new Register();
        register0.registerUser("hi!", "");
        register0.loginUser("", "hi!");
        register0.runRegistrationSystem((int) 'a');
        register0.loginUser("", "hi!");
        register0.loginUser("hi!", "");
        register0.registerUser("hi!", "hi!");
        register0.runRegistrationSystem(1);
        java.lang.Class<?> wildcardClass20 = register0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test0648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest1.test0648");
        Register register0 = new Register();
        register0.registerUser("hi!", "");
        register0.loginUser("", "hi!");
        register0.runRegistrationSystem((int) (byte) -1);
        register0.runRegistrationSystem(1);
        register0.loginUser("hi!", "");
        register0.runRegistrationSystem(0);
        register0.loginUser("", "hi!");
        register0.loginUser("hi!", "");
        register0.registerUser("hi!", "hi!");
    }

    @Test
    public void test0649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest1.test0649");
        Register register0 = new Register();
        register0.runRegistrationSystem((int) '#');
        register0.runRegistrationSystem((int) (short) 100);
        register0.runRegistrationSystem(100);
        register0.registerUser("", "hi!");
        register0.registerUser("hi!", "");
    }

    @Test
    public void test0650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest1.test0650");
        Register register0 = new Register();
        register0.registerUser("hi!", "");
        register0.loginUser("", "hi!");
        register0.runRegistrationSystem((int) (byte) -1);
        register0.loginUser("", "");
        register0.runRegistrationSystem((-1));
        register0.loginUser("", "");
        register0.loginUser("hi!", "hi!");
    }

    @Test
    public void test0651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest1.test0651");
        Register register0 = new Register();
        register0.registerUser("hi!", "");
        register0.loginUser("", "hi!");
        register0.runRegistrationSystem((int) 'a');
        register0.loginUser("hi!", "");
        register0.runRegistrationSystem((int) (byte) 1);
        register0.loginUser("hi!", "hi!");
        register0.registerUser("hi!", "hi!");
        register0.runRegistrationSystem(100);
        register0.loginUser("", "hi!");
        java.lang.Class<?> wildcardClass25 = register0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test0652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest1.test0652");
        Register register0 = new Register();
        register0.runRegistrationSystem((int) (byte) -1);
        register0.runRegistrationSystem((int) (short) 10);
        register0.loginUser("hi!", "");
        register0.registerUser("", "hi!");
        register0.registerUser("hi!", "hi!");
        java.lang.Class<?> wildcardClass14 = register0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest1.test0653");
        Register register0 = new Register();
        register0.loginUser("hi!", "hi!");
        register0.registerUser("hi!", "");
        register0.loginUser("hi!", "hi!");
        register0.registerUser("", "");
        register0.runRegistrationSystem(0);
        register0.registerUser("", "");
        register0.runRegistrationSystem((int) '#');
        java.lang.Class<?> wildcardClass20 = register0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test0654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest1.test0654");
        Register register0 = new Register();
        register0.runRegistrationSystem((int) (short) 0);
        register0.loginUser("hi!", "hi!");
        register0.registerUser("", "");
        register0.runRegistrationSystem((int) '#');
        register0.registerUser("", "hi!");
        register0.loginUser("", "");
        register0.registerUser("hi!", "hi!");
        register0.loginUser("", "");
        register0.runRegistrationSystem((int) (byte) 10);
        register0.runRegistrationSystem(0);
    }

    @Test
    public void test0655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest1.test0655");
        Register register0 = new Register();
        register0.loginUser("hi!", "hi!");
        register0.loginUser("", "hi!");
        register0.runRegistrationSystem((int) (byte) 0);
        register0.runRegistrationSystem((int) (byte) 10);
    }

    @Test
    public void test0656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest1.test0656");
        Register register0 = new Register();
        register0.runRegistrationSystem((int) '#');
        register0.loginUser("hi!", "hi!");
        register0.registerUser("", "");
        register0.registerUser("hi!", "");
        register0.runRegistrationSystem((int) (byte) 10);
        register0.loginUser("hi!", "");
    }

    @Test
    public void test0657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest1.test0657");
        Register register0 = new Register();
        register0.registerUser("hi!", "");
        register0.loginUser("hi!", "hi!");
        register0.runRegistrationSystem((int) '#');
        register0.registerUser("", "");
        register0.loginUser("", "hi!");
    }

    @Test
    public void test0658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest1.test0658");
        Register register0 = new Register();
        register0.loginUser("hi!", "hi!");
        register0.registerUser("hi!", "");
        register0.registerUser("hi!", "");
        register0.registerUser("", "");
        register0.runRegistrationSystem((int) (short) 0);
        register0.loginUser("hi!", "hi!");
        register0.registerUser("hi!", "hi!");
        java.lang.Class<?> wildcardClass21 = register0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test0659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest1.test0659");
        Register register0 = new Register();
        register0.runRegistrationSystem((int) (byte) -1);
        register0.runRegistrationSystem((int) (byte) 10);
        register0.registerUser("", "");
        register0.loginUser("", "");
        register0.registerUser("", "hi!");
        register0.registerUser("hi!", "");
        register0.loginUser("hi!", "hi!");
        register0.loginUser("", "hi!");
        java.lang.Class<?> wildcardClass23 = register0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test0660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest1.test0660");
        Register register0 = new Register();
        register0.loginUser("hi!", "hi!");
        register0.loginUser("hi!", "hi!");
        register0.loginUser("", "hi!");
        register0.registerUser("", "");
        register0.loginUser("", "hi!");
        register0.loginUser("", "");
    }

    @Test
    public void test0661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest1.test0661");
        Register register0 = new Register();
        register0.loginUser("hi!", "hi!");
        register0.registerUser("hi!", "");
        register0.registerUser("", "");
        java.lang.Class<?> wildcardClass10 = register0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0662() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest1.test0662");
        Register register0 = new Register();
        register0.runRegistrationSystem((int) (byte) -1);
        register0.registerUser("hi!", "");
        register0.loginUser("hi!", "hi!");
        register0.runRegistrationSystem((int) (byte) 1);
        register0.loginUser("hi!", "");
        register0.runRegistrationSystem((int) (short) 10);
        java.lang.Class<?> wildcardClass16 = register0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0663() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest1.test0663");
        Register register0 = new Register();
        register0.runRegistrationSystem((int) (short) 0);
        register0.loginUser("hi!", "hi!");
        register0.registerUser("", "");
        register0.runRegistrationSystem((-1));
        register0.registerUser("", "");
        register0.loginUser("", "");
        register0.runRegistrationSystem((int) '4');
        register0.registerUser("", "");
        register0.registerUser("", "");
    }

    @Test
    public void test0664() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest1.test0664");
        Register register0 = new Register();
        register0.registerUser("hi!", "");
        register0.loginUser("", "");
        register0.runRegistrationSystem((int) 'a');
        register0.loginUser("", "");
        register0.runRegistrationSystem((int) (byte) 1);
        java.lang.Class<?> wildcardClass14 = register0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0665() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest1.test0665");
        Register register0 = new Register();
        register0.runRegistrationSystem((int) '#');
        register0.loginUser("hi!", "hi!");
        register0.loginUser("hi!", "hi!");
        register0.loginUser("hi!", "");
        register0.loginUser("", "hi!");
        register0.loginUser("hi!", "hi!");
        register0.registerUser("", "hi!");
    }

    @Test
    public void test0666() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest1.test0666");
        Register register0 = new Register();
        register0.loginUser("hi!", "hi!");
        register0.registerUser("hi!", "");
        register0.registerUser("hi!", "");
        register0.registerUser("", "");
        register0.runRegistrationSystem(100);
        register0.loginUser("", "");
        register0.runRegistrationSystem(0);
        register0.loginUser("", "hi!");
        register0.registerUser("", "");
    }

    @Test
    public void test0667() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest1.test0667");
        Register register0 = new Register();
        register0.registerUser("hi!", "");
        register0.runRegistrationSystem(1);
        register0.registerUser("", "");
        register0.runRegistrationSystem((int) (short) -1);
        register0.loginUser("", "");
        register0.loginUser("hi!", "");
        register0.loginUser("hi!", "hi!");
        register0.registerUser("", "hi!");
        java.lang.Class<?> wildcardClass23 = register0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test0668() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest1.test0668");
        Register register0 = new Register();
        register0.runRegistrationSystem((int) '#');
        register0.registerUser("", "hi!");
        register0.runRegistrationSystem((int) (short) 0);
        register0.runRegistrationSystem((int) (byte) 1);
        register0.runRegistrationSystem((int) 'a');
        register0.registerUser("", "");
        register0.registerUser("", "hi!");
        register0.runRegistrationSystem(0);
    }

    @Test
    public void test0669() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest1.test0669");
        Register register0 = new Register();
        register0.runRegistrationSystem((int) (byte) -1);
        register0.runRegistrationSystem((int) (byte) 10);
        register0.registerUser("", "");
        register0.loginUser("", "");
        register0.runRegistrationSystem((int) (byte) 0);
        register0.loginUser("", "hi!");
        register0.loginUser("hi!", "hi!");
    }

    @Test
    public void test0670() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest1.test0670");
        Register register0 = new Register();
        register0.registerUser("hi!", "");
        register0.loginUser("", "hi!");
        register0.runRegistrationSystem((int) 'a');
        register0.loginUser("", "hi!");
        register0.loginUser("", "hi!");
        register0.registerUser("", "");
        register0.runRegistrationSystem((int) '4');
        register0.runRegistrationSystem((int) (short) 0);
        java.lang.Class<?> wildcardClass22 = register0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test0671() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest1.test0671");
        Register register0 = new Register();
        register0.registerUser("hi!", "");
        register0.loginUser("", "");
        register0.runRegistrationSystem((int) 'a');
        register0.registerUser("", "");
        register0.registerUser("hi!", "hi!");
        register0.loginUser("", "hi!");
        java.lang.Class<?> wildcardClass18 = register0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test0672() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest1.test0672");
        Register register0 = new Register();
        register0.registerUser("hi!", "");
        register0.registerUser("hi!", "");
        register0.loginUser("hi!", "");
        register0.loginUser("hi!", "");
        register0.loginUser("", "hi!");
        register0.runRegistrationSystem((-1));
        register0.loginUser("", "");
    }

    @Test
    public void test0673() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest1.test0673");
        Register register0 = new Register();
        register0.loginUser("hi!", "hi!");
        register0.registerUser("hi!", "");
        register0.registerUser("", "");
        register0.registerUser("hi!", "");
        register0.runRegistrationSystem((int) (byte) 0);
        register0.registerUser("", "");
        register0.loginUser("", "");
        java.lang.Class<?> wildcardClass21 = register0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test0674() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest1.test0674");
        Register register0 = new Register();
        register0.registerUser("hi!", "");
        register0.runRegistrationSystem(1);
        register0.registerUser("", "");
        register0.registerUser("hi!", "");
        register0.runRegistrationSystem((int) (short) 1);
        register0.runRegistrationSystem(0);
    }

    @Test
    public void test0675() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest1.test0675");
        Register register0 = new Register();
        register0.runRegistrationSystem((int) (byte) -1);
        register0.registerUser("hi!", "");
        register0.runRegistrationSystem((int) (short) 1);
        register0.loginUser("", "");
        register0.loginUser("", "hi!");
        register0.runRegistrationSystem(100);
        register0.registerUser("", "");
    }

    @Test
    public void test0676() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest1.test0676");
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
        java.lang.Class<?> wildcardClass26 = register0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass26);
    }

    @Test
    public void test0677() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest1.test0677");
        Register register0 = new Register();
        register0.loginUser("hi!", "hi!");
        register0.registerUser("hi!", "");
        register0.registerUser("", "");
        register0.registerUser("", "hi!");
        register0.loginUser("", "hi!");
        register0.loginUser("", "hi!");
        register0.registerUser("", "");
    }

    @Test
    public void test0678() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest1.test0678");
        Register register0 = new Register();
        register0.runRegistrationSystem((int) (byte) -1);
        register0.registerUser("hi!", "");
        register0.runRegistrationSystem((int) (byte) -1);
        register0.loginUser("hi!", "hi!");
        register0.runRegistrationSystem(0);
        java.lang.Class<?> wildcardClass13 = register0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0679() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest1.test0679");
        Register register0 = new Register();
        register0.runRegistrationSystem((int) '#');
        register0.loginUser("hi!", "hi!");
        register0.runRegistrationSystem((int) (byte) 10);
        register0.registerUser("hi!", "");
        register0.registerUser("hi!", "hi!");
        java.lang.Class<?> wildcardClass14 = register0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0680() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest1.test0680");
        Register register0 = new Register();
        register0.runRegistrationSystem((int) (short) 0);
        register0.loginUser("hi!", "hi!");
        register0.registerUser("", "");
        register0.loginUser("", "hi!");
        register0.registerUser("hi!", "");
        register0.loginUser("", "hi!");
        register0.registerUser("hi!", "");
        register0.runRegistrationSystem((int) '4');
    }

    @Test
    public void test0681() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest1.test0681");
        Register register0 = new Register();
        register0.runRegistrationSystem((int) '#');
        register0.loginUser("hi!", "");
    }

    @Test
    public void test0682() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest1.test0682");
        Register register0 = new Register();
        register0.runRegistrationSystem((int) '#');
        register0.registerUser("", "hi!");
        register0.runRegistrationSystem((int) (short) 0);
        register0.runRegistrationSystem((int) (byte) 1);
        register0.registerUser("", "");
        register0.loginUser("", "");
        register0.loginUser("", "");
        register0.runRegistrationSystem((int) (short) 0);
        register0.loginUser("hi!", "");
        java.lang.Class<?> wildcardClass24 = register0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test0683() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest1.test0683");
        Register register0 = new Register();
        register0.loginUser("hi!", "hi!");
        register0.registerUser("hi!", "");
        register0.registerUser("hi!", "");
        register0.registerUser("", "hi!");
        register0.loginUser("", "");
        register0.runRegistrationSystem((int) (short) -1);
        register0.registerUser("hi!", "");
        register0.loginUser("hi!", "hi!");
        java.lang.Class<?> wildcardClass24 = register0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test0684() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest1.test0684");
        Register register0 = new Register();
        register0.loginUser("hi!", "hi!");
        register0.runRegistrationSystem(0);
        register0.runRegistrationSystem(10);
        register0.registerUser("hi!", "");
        register0.registerUser("", "hi!");
        register0.loginUser("", "");
    }

    @Test
    public void test0685() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest1.test0685");
        Register register0 = new Register();
        register0.loginUser("hi!", "hi!");
        register0.registerUser("hi!", "");
        register0.registerUser("", "");
        register0.registerUser("hi!", "");
        register0.registerUser("hi!", "");
        register0.registerUser("hi!", "");
        register0.registerUser("hi!", "");
        java.lang.Class<?> wildcardClass22 = register0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test0686() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest1.test0686");
        Register register0 = new Register();
        register0.runRegistrationSystem((int) (byte) -1);
        register0.registerUser("hi!", "");
        register0.runRegistrationSystem((int) (short) 1);
        register0.loginUser("", "hi!");
        register0.registerUser("hi!", "hi!");
        java.lang.Class<?> wildcardClass14 = register0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0687() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest1.test0687");
        Register register0 = new Register();
        register0.registerUser("hi!", "");
        register0.loginUser("", "hi!");
        register0.runRegistrationSystem((int) 'a');
        register0.loginUser("hi!", "");
        register0.runRegistrationSystem((-1));
        register0.registerUser("hi!", "");
        register0.loginUser("", "");
        register0.registerUser("", "hi!");
    }

    @Test
    public void test0688() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest1.test0688");
        Register register0 = new Register();
        register0.runRegistrationSystem((int) (byte) -1);
        register0.registerUser("hi!", "");
        register0.registerUser("", "hi!");
        register0.runRegistrationSystem((int) (short) 10);
        register0.registerUser("hi!", "");
        register0.loginUser("hi!", "hi!");
        register0.registerUser("", "");
    }

    @Test
    public void test0689() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest1.test0689");
        Register register0 = new Register();
        register0.registerUser("hi!", "");
        register0.loginUser("", "hi!");
        register0.runRegistrationSystem((int) 'a');
        register0.loginUser("", "hi!");
        register0.loginUser("hi!", "");
        register0.loginUser("hi!", "hi!");
        register0.runRegistrationSystem((int) '#');
    }

    @Test
    public void test0690() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest1.test0690");
        Register register0 = new Register();
        register0.loginUser("hi!", "hi!");
        register0.registerUser("hi!", "");
        register0.loginUser("hi!", "hi!");
        register0.registerUser("", "");
        register0.runRegistrationSystem((int) 'a');
        register0.loginUser("hi!", "");
        register0.registerUser("", "");
    }

    @Test
    public void test0691() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest1.test0691");
        Register register0 = new Register();
        register0.runRegistrationSystem((int) '#');
        register0.registerUser("", "hi!");
        register0.runRegistrationSystem((int) (short) 0);
        register0.runRegistrationSystem((int) (byte) 1);
        register0.runRegistrationSystem((int) 'a');
        register0.runRegistrationSystem(0);
        java.lang.Class<?> wildcardClass14 = register0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0692() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest1.test0692");
        Register register0 = new Register();
        register0.loginUser("hi!", "hi!");
        register0.runRegistrationSystem(0);
        register0.registerUser("", "");
        register0.loginUser("", "hi!");
        register0.registerUser("", "");
        register0.loginUser("", "");
        register0.runRegistrationSystem((int) (byte) 10);
        register0.loginUser("", "");
        java.lang.Class<?> wildcardClass23 = register0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test0693() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest1.test0693");
        Register register0 = new Register();
        register0.registerUser("hi!", "");
        register0.registerUser("hi!", "");
        register0.loginUser("hi!", "");
        register0.loginUser("hi!", "");
        register0.runRegistrationSystem(10);
        register0.registerUser("", "");
        register0.registerUser("", "");
        register0.registerUser("hi!", "hi!");
        register0.loginUser("", "");
    }

    @Test
    public void test0694() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest1.test0694");
        Register register0 = new Register();
        register0.registerUser("hi!", "");
        register0.loginUser("", "hi!");
        register0.runRegistrationSystem((int) 'a');
        register0.loginUser("", "hi!");
        register0.runRegistrationSystem((int) (short) 10);
        register0.runRegistrationSystem((int) 'a');
        register0.registerUser("", "hi!");
        register0.loginUser("hi!", "hi!");
    }

    @Test
    public void test0695() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest1.test0695");
        Register register0 = new Register();
        register0.runRegistrationSystem((int) '#');
        register0.registerUser("", "hi!");
        register0.registerUser("", "hi!");
        register0.registerUser("", "");
        register0.runRegistrationSystem((int) (byte) 10);
        register0.runRegistrationSystem((int) (short) 100);
        register0.runRegistrationSystem((int) (short) 1);
        register0.runRegistrationSystem((int) (byte) -1);
        java.lang.Class<?> wildcardClass20 = register0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test0696() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest1.test0696");
        Register register0 = new Register();
        register0.registerUser("hi!", "");
        register0.registerUser("hi!", "");
        register0.runRegistrationSystem((int) (byte) 0);
        register0.registerUser("", "");
        register0.runRegistrationSystem((int) (byte) 10);
        register0.registerUser("", "hi!");
        register0.registerUser("hi!", "");
        register0.runRegistrationSystem((int) 'a');
        register0.registerUser("hi!", "");
    }

    @Test
    public void test0697() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest1.test0697");
        Register register0 = new Register();
        register0.runRegistrationSystem((int) (byte) -1);
        register0.registerUser("hi!", "");
        register0.registerUser("", "hi!");
        register0.runRegistrationSystem((int) (short) 10);
        register0.registerUser("hi!", "hi!");
        register0.registerUser("hi!", "hi!");
        register0.registerUser("hi!", "");
    }

    @Test
    public void test0698() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest1.test0698");
        Register register0 = new Register();
        register0.runRegistrationSystem((int) (short) 0);
        register0.loginUser("hi!", "hi!");
        register0.registerUser("", "");
        register0.runRegistrationSystem((int) '#');
        register0.runRegistrationSystem((int) '#');
        register0.loginUser("hi!", "");
        register0.runRegistrationSystem((int) (short) 0);
        register0.loginUser("", "hi!");
    }

    @Test
    public void test0699() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest1.test0699");
        Register register0 = new Register();
        register0.runRegistrationSystem((int) '#');
        register0.registerUser("", "hi!");
        register0.registerUser("hi!", "");
        register0.runRegistrationSystem((int) (byte) 100);
        java.lang.Class<?> wildcardClass11 = register0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0700() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest1.test0700");
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
        register0.runRegistrationSystem((int) (byte) 10);
    }

    @Test
    public void test0701() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest1.test0701");
        Register register0 = new Register();
        register0.runRegistrationSystem((int) (short) 0);
        register0.loginUser("hi!", "hi!");
        register0.registerUser("", "");
        register0.runRegistrationSystem((int) '#');
        register0.runRegistrationSystem((int) (byte) 0);
        register0.runRegistrationSystem(0);
        register0.registerUser("", "hi!");
        register0.loginUser("", "");
        register0.registerUser("", "");
    }

    @Test
    public void test0702() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest1.test0702");
        Register register0 = new Register();
        register0.loginUser("hi!", "hi!");
        register0.runRegistrationSystem(0);
        register0.runRegistrationSystem(10);
        register0.registerUser("hi!", "");
        register0.runRegistrationSystem((int) 'a');
        java.lang.Class<?> wildcardClass13 = register0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0703() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest1.test0703");
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
        java.lang.Class<?> wildcardClass26 = register0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass26);
    }

    @Test
    public void test0704() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest1.test0704");
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
        java.lang.Class<?> wildcardClass29 = register0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass29);
    }

    @Test
    public void test0705() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest1.test0705");
        Register register0 = new Register();
        register0.registerUser("hi!", "");
        register0.runRegistrationSystem(1);
        register0.loginUser("hi!", "");
        register0.runRegistrationSystem(100);
    }

    @Test
    public void test0706() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest1.test0706");
        Register register0 = new Register();
        register0.runRegistrationSystem((int) (byte) -1);
        register0.runRegistrationSystem((int) (byte) 10);
        register0.registerUser("", "");
        register0.loginUser("", "");
        register0.registerUser("", "hi!");
        register0.registerUser("hi!", "");
        register0.runRegistrationSystem((int) 'a');
        register0.runRegistrationSystem((int) '#');
        register0.registerUser("", "hi!");
    }

    @Test
    public void test0707() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest1.test0707");
        Register register0 = new Register();
        register0.runRegistrationSystem((int) '#');
        register0.registerUser("", "hi!");
        register0.runRegistrationSystem((int) (short) 0);
        register0.loginUser("hi!", "hi!");
        register0.registerUser("", "hi!");
        register0.runRegistrationSystem((int) (byte) -1);
        register0.runRegistrationSystem((int) (byte) -1);
        java.lang.Class<?> wildcardClass18 = register0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test0708() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest1.test0708");
        Register register0 = new Register();
        register0.runRegistrationSystem((int) (byte) -1);
        register0.registerUser("hi!", "");
        register0.runRegistrationSystem((int) (short) 1);
        register0.runRegistrationSystem((int) 'a');
        register0.registerUser("", "");
        register0.runRegistrationSystem((int) (short) 100);
        register0.loginUser("hi!", "");
        register0.registerUser("", "hi!");
        java.lang.Class<?> wildcardClass21 = register0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test0709() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest1.test0709");
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
        register0.loginUser("", "hi!");
    }

    @Test
    public void test0710() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest1.test0710");
        Register register0 = new Register();
        register0.loginUser("hi!", "hi!");
        register0.runRegistrationSystem(0);
        register0.registerUser("", "");
        register0.loginUser("", "hi!");
        register0.registerUser("", "");
        register0.loginUser("hi!", "hi!");
        java.lang.Class<?> wildcardClass18 = register0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test0711() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest1.test0711");
        Register register0 = new Register();
        register0.loginUser("hi!", "hi!");
        register0.runRegistrationSystem(0);
        register0.runRegistrationSystem(10);
        register0.registerUser("hi!", "");
        register0.registerUser("", "hi!");
        register0.loginUser("hi!", "");
        register0.registerUser("", "hi!");
        register0.runRegistrationSystem((int) (byte) 10);
    }

    @Test
    public void test0712() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest1.test0712");
        Register register0 = new Register();
        register0.runRegistrationSystem((int) '#');
        register0.loginUser("hi!", "hi!");
        register0.loginUser("hi!", "hi!");
        register0.loginUser("hi!", "");
        register0.loginUser("", "");
        register0.runRegistrationSystem((int) (short) 10);
        register0.registerUser("", "hi!");
        java.lang.Class<?> wildcardClass20 = register0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test0713() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest1.test0713");
        Register register0 = new Register();
        register0.runRegistrationSystem((int) (byte) -1);
        register0.runRegistrationSystem((int) '#');
        register0.loginUser("", "");
        register0.runRegistrationSystem((int) (short) 0);
        register0.loginUser("hi!", "");
        register0.loginUser("", "hi!");
        java.lang.Class<?> wildcardClass16 = register0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0714() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest1.test0714");
        Register register0 = new Register();
        register0.registerUser("hi!", "");
        register0.runRegistrationSystem(1);
        register0.registerUser("", "");
        register0.registerUser("hi!", "");
        register0.registerUser("hi!", "hi!");
        register0.loginUser("hi!", "");
        java.lang.Class<?> wildcardClass18 = register0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test0715() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest1.test0715");
        Register register0 = new Register();
        register0.runRegistrationSystem((int) (short) 0);
        register0.loginUser("hi!", "hi!");
        register0.loginUser("hi!", "");
        register0.loginUser("", "hi!");
        register0.registerUser("hi!", "hi!");
        register0.loginUser("hi!", "hi!");
        register0.runRegistrationSystem((int) '4');
    }

    @Test
    public void test0716() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest1.test0716");
        Register register0 = new Register();
        register0.loginUser("hi!", "hi!");
        register0.loginUser("hi!", "hi!");
        register0.registerUser("", "");
        register0.runRegistrationSystem((int) (short) 10);
        register0.loginUser("hi!", "");
        register0.registerUser("", "");
        register0.registerUser("", "hi!");
        register0.loginUser("", "");
    }

    @Test
    public void test0717() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest1.test0717");
        Register register0 = new Register();
        register0.loginUser("hi!", "hi!");
        register0.registerUser("hi!", "");
        register0.registerUser("", "");
        register0.registerUser("", "hi!");
        register0.loginUser("hi!", "hi!");
        register0.runRegistrationSystem(0);
        register0.loginUser("hi!", "");
        register0.loginUser("", "");
    }

    @Test
    public void test0718() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest1.test0718");
        Register register0 = new Register();
        register0.registerUser("hi!", "");
        register0.loginUser("", "hi!");
        register0.runRegistrationSystem((int) (byte) -1);
        register0.runRegistrationSystem(10);
        register0.registerUser("", "hi!");
        register0.loginUser("hi!", "");
        java.lang.Class<?> wildcardClass17 = register0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test0719() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest1.test0719");
        Register register0 = new Register();
        register0.registerUser("hi!", "");
        register0.loginUser("", "hi!");
        register0.runRegistrationSystem((int) 'a');
        register0.loginUser("hi!", "");
        register0.runRegistrationSystem((-1));
        register0.registerUser("hi!", "");
        register0.registerUser("hi!", "hi!");
        register0.loginUser("", "");
        java.lang.Class<?> wildcardClass23 = register0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test0720() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest1.test0720");
        Register register0 = new Register();
        register0.runRegistrationSystem((int) (byte) -1);
        register0.runRegistrationSystem((int) (short) 10);
        register0.runRegistrationSystem((int) (byte) -1);
        register0.runRegistrationSystem(10);
        register0.registerUser("", "");
        register0.registerUser("hi!", "");
        register0.loginUser("", "hi!");
    }

    @Test
    public void test0721() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest1.test0721");
        Register register0 = new Register();
        register0.loginUser("hi!", "hi!");
        register0.loginUser("hi!", "hi!");
        register0.registerUser("", "");
        register0.registerUser("", "hi!");
    }

    @Test
    public void test0722() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest1.test0722");
        Register register0 = new Register();
        register0.runRegistrationSystem((int) (byte) -1);
        register0.runRegistrationSystem((int) '#');
        register0.loginUser("hi!", "hi!");
        register0.registerUser("hi!", "");
        register0.loginUser("", "");
    }

    @Test
    public void test0723() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest1.test0723");
        Register register0 = new Register();
        register0.registerUser("hi!", "");
        register0.registerUser("hi!", "");
        register0.runRegistrationSystem((int) (byte) 0);
        register0.registerUser("", "");
        register0.runRegistrationSystem((int) (byte) 10);
        register0.registerUser("", "hi!");
        register0.registerUser("", "hi!");
        register0.runRegistrationSystem(0);
        java.lang.Class<?> wildcardClass22 = register0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test0724() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest1.test0724");
        Register register0 = new Register();
        register0.runRegistrationSystem((int) (byte) -1);
        register0.registerUser("hi!", "");
        register0.runRegistrationSystem((int) (byte) 100);
        register0.runRegistrationSystem((int) (short) -1);
        register0.loginUser("", "");
        java.lang.Class<?> wildcardClass13 = register0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0725() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest1.test0725");
        Register register0 = new Register();
        register0.loginUser("hi!", "hi!");
        register0.registerUser("hi!", "");
        register0.registerUser("", "");
        register0.registerUser("", "hi!");
        register0.runRegistrationSystem((int) (short) 100);
        register0.runRegistrationSystem((int) (byte) 1);
        register0.loginUser("", "");
        register0.registerUser("hi!", "");
        register0.runRegistrationSystem((int) (byte) 100);
        java.lang.Class<?> wildcardClass25 = register0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test0726() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest1.test0726");
        Register register0 = new Register();
        register0.loginUser("hi!", "hi!");
        register0.runRegistrationSystem(0);
        register0.registerUser("", "");
        register0.loginUser("", "hi!");
        register0.registerUser("", "");
        register0.loginUser("", "hi!");
        register0.loginUser("", "hi!");
        java.lang.Class<?> wildcardClass21 = register0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test0727() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest1.test0727");
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
        java.lang.Class<?> wildcardClass27 = register0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test0728() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest1.test0728");
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
        java.lang.Class<?> wildcardClass29 = register0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass29);
    }

    @Test
    public void test0729() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest1.test0729");
        Register register0 = new Register();
        register0.runRegistrationSystem((int) (byte) -1);
        register0.registerUser("hi!", "");
        register0.loginUser("hi!", "hi!");
        register0.loginUser("hi!", "hi!");
        register0.runRegistrationSystem((int) (short) 1);
        register0.registerUser("hi!", "hi!");
        register0.registerUser("", "");
        register0.registerUser("hi!", "hi!");
        java.lang.Class<?> wildcardClass23 = register0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test0730() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest1.test0730");
        Register register0 = new Register();
        register0.runRegistrationSystem((int) (byte) -1);
        register0.registerUser("hi!", "");
        register0.loginUser("hi!", "hi!");
        register0.loginUser("", "");
        register0.registerUser("", "hi!");
        register0.registerUser("", "hi!");
    }

    @Test
    public void test0731() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest1.test0731");
        Register register0 = new Register();
        register0.runRegistrationSystem((int) (byte) -1);
        register0.registerUser("hi!", "");
        register0.runRegistrationSystem((int) (byte) -1);
        register0.loginUser("hi!", "hi!");
        register0.registerUser("", "");
        register0.registerUser("hi!", "hi!");
        register0.loginUser("", "");
        java.lang.Class<?> wildcardClass20 = register0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test0732() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest1.test0732");
        Register register0 = new Register();
        register0.runRegistrationSystem((int) (byte) -1);
        register0.registerUser("hi!", "");
        register0.registerUser("", "hi!");
        register0.runRegistrationSystem((int) ' ');
    }

    @Test
    public void test0733() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest1.test0733");
        Register register0 = new Register();
        register0.runRegistrationSystem((int) (short) 0);
        register0.loginUser("hi!", "hi!");
        register0.loginUser("", "");
        register0.loginUser("hi!", "");
        register0.registerUser("", "hi!");
    }

    @Test
    public void test0734() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest1.test0734");
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
        register0.loginUser("hi!", "hi!");
    }

    @Test
    public void test0735() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest1.test0735");
        Register register0 = new Register();
        register0.runRegistrationSystem((int) (byte) -1);
        register0.runRegistrationSystem((int) (byte) 10);
        register0.registerUser("", "");
        register0.loginUser("", "");
        register0.registerUser("", "hi!");
        register0.registerUser("hi!", "");
        register0.runRegistrationSystem((int) 'a');
        java.lang.Class<?> wildcardClass19 = register0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test0736() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest1.test0736");
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
        java.lang.Class<?> wildcardClass28 = register0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test0737() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest1.test0737");
        Register register0 = new Register();
        register0.runRegistrationSystem((int) (byte) -1);
        register0.runRegistrationSystem((int) (short) 10);
        register0.runRegistrationSystem((int) (short) -1);
        register0.registerUser("hi!", "hi!");
        java.lang.Class<?> wildcardClass10 = register0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0738() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest1.test0738");
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
        register0.registerUser("hi!", "hi!");
    }

    @Test
    public void test0739() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest1.test0739");
        Register register0 = new Register();
        register0.runRegistrationSystem((int) (short) 0);
        register0.loginUser("hi!", "hi!");
        register0.registerUser("", "");
        register0.runRegistrationSystem((int) '#');
        register0.registerUser("", "hi!");
        register0.registerUser("", "hi!");
        register0.registerUser("", "");
        register0.runRegistrationSystem((int) (short) 10);
        java.lang.Class<?> wildcardClass22 = register0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test0740() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest1.test0740");
        Register register0 = new Register();
        register0.runRegistrationSystem((int) (byte) -1);
        register0.registerUser("hi!", "");
        register0.runRegistrationSystem((int) (short) 1);
        register0.loginUser("", "hi!");
        register0.runRegistrationSystem((int) '4');
        register0.loginUser("hi!", "");
        register0.runRegistrationSystem((int) (short) -1);
        register0.loginUser("hi!", "");
    }

    @Test
    public void test0741() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest1.test0741");
        Register register0 = new Register();
        register0.loginUser("hi!", "hi!");
        register0.registerUser("hi!", "");
        register0.registerUser("", "");
        register0.runRegistrationSystem((int) (byte) 100);
        register0.registerUser("hi!", "");
        register0.runRegistrationSystem(1);
        register0.runRegistrationSystem(0);
        register0.runRegistrationSystem((int) (short) 100);
        register0.loginUser("", "hi!");
        java.lang.Class<?> wildcardClass24 = register0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test0742() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest1.test0742");
        Register register0 = new Register();
        register0.loginUser("hi!", "hi!");
        register0.runRegistrationSystem(0);
        register0.registerUser("", "");
        register0.loginUser("", "hi!");
        register0.registerUser("", "");
        register0.runRegistrationSystem((int) '4');
        register0.registerUser("hi!", "hi!");
        java.lang.Class<?> wildcardClass20 = register0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test0743() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest1.test0743");
        Register register0 = new Register();
        register0.runRegistrationSystem((int) '#');
        register0.registerUser("", "hi!");
        register0.runRegistrationSystem((int) (short) 0);
        register0.runRegistrationSystem((int) (byte) 1);
        register0.runRegistrationSystem((int) 'a');
        register0.registerUser("", "");
        register0.runRegistrationSystem((int) (short) 0);
        java.lang.Class<?> wildcardClass17 = register0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test0744() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest1.test0744");
        Register register0 = new Register();
        register0.runRegistrationSystem((int) (byte) -1);
        register0.runRegistrationSystem((int) (byte) 10);
        register0.registerUser("", "");
        register0.loginUser("", "");
        register0.registerUser("", "hi!");
        register0.registerUser("", "hi!");
        register0.registerUser("hi!", "hi!");
        register0.registerUser("", "");
    }

    @Test
    public void test0745() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest1.test0745");
        Register register0 = new Register();
        register0.loginUser("hi!", "hi!");
        register0.registerUser("hi!", "");
        register0.loginUser("hi!", "hi!");
        register0.runRegistrationSystem(100);
        register0.registerUser("hi!", "");
        register0.registerUser("", "");
        java.lang.Class<?> wildcardClass18 = register0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test0746() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest1.test0746");
        Register register0 = new Register();
        register0.registerUser("hi!", "");
        register0.loginUser("", "");
        register0.runRegistrationSystem((int) 'a');
        register0.runRegistrationSystem((int) (short) 100);
        register0.loginUser("hi!", "");
        register0.registerUser("", "");
    }

    @Test
    public void test0747() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest1.test0747");
        Register register0 = new Register();
        register0.loginUser("hi!", "hi!");
        register0.registerUser("hi!", "");
        register0.registerUser("hi!", "");
        register0.registerUser("", "hi!");
        register0.loginUser("hi!", "");
        register0.loginUser("hi!", "hi!");
        register0.loginUser("", "hi!");
        java.lang.Class<?> wildcardClass22 = register0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test0748() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest1.test0748");
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
        java.lang.Class<?> wildcardClass25 = register0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test0749() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest1.test0749");
        Register register0 = new Register();
        register0.loginUser("hi!", "hi!");
        register0.runRegistrationSystem(0);
        register0.registerUser("", "");
        register0.loginUser("", "hi!");
        register0.registerUser("", "");
        register0.loginUser("", "hi!");
        register0.loginUser("", "hi!");
        register0.registerUser("", "hi!");
        java.lang.Class<?> wildcardClass24 = register0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test0750() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest1.test0750");
        Register register0 = new Register();
        register0.loginUser("hi!", "hi!");
        register0.registerUser("hi!", "");
        register0.registerUser("", "");
        register0.registerUser("", "hi!");
        register0.loginUser("hi!", "hi!");
        register0.runRegistrationSystem(0);
        register0.loginUser("hi!", "");
        java.lang.Class<?> wildcardClass21 = register0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test0751() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest1.test0751");
        Register register0 = new Register();
        register0.runRegistrationSystem((int) (byte) -1);
        register0.registerUser("hi!", "");
        register0.loginUser("hi!", "hi!");
        register0.loginUser("hi!", "");
        register0.loginUser("hi!", "");
        register0.loginUser("hi!", "hi!");
        register0.registerUser("hi!", "");
        java.lang.Class<?> wildcardClass21 = register0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test0752() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest1.test0752");
        Register register0 = new Register();
        register0.registerUser("hi!", "");
        register0.loginUser("", "hi!");
        register0.runRegistrationSystem((int) 'a');
        register0.registerUser("", "");
        java.lang.Class<?> wildcardClass12 = register0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0753() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest1.test0753");
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
        register0.runRegistrationSystem((int) (byte) 0);
    }

    @Test
    public void test0754() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest1.test0754");
        Register register0 = new Register();
        register0.runRegistrationSystem((int) (byte) -1);
        register0.registerUser("hi!", "");
        register0.runRegistrationSystem((int) (short) 1);
        register0.runRegistrationSystem((int) 'a');
        register0.registerUser("", "");
        register0.runRegistrationSystem((int) (short) 100);
        register0.loginUser("", "");
    }

    @Test
    public void test0755() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest1.test0755");
        Register register0 = new Register();
        register0.registerUser("hi!", "");
        register0.loginUser("", "hi!");
        register0.loginUser("", "hi!");
        java.lang.Class<?> wildcardClass10 = register0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0756() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest1.test0756");
        Register register0 = new Register();
        register0.loginUser("hi!", "hi!");
        register0.registerUser("hi!", "");
        register0.registerUser("", "");
        register0.registerUser("hi!", "");
        register0.registerUser("hi!", "");
        register0.loginUser("hi!", "hi!");
        register0.registerUser("hi!", "hi!");
        register0.registerUser("", "");
        register0.registerUser("", "");
    }

    @Test
    public void test0757() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest1.test0757");
        Register register0 = new Register();
        register0.runRegistrationSystem((int) (short) 0);
        register0.loginUser("hi!", "hi!");
        register0.registerUser("", "");
        register0.runRegistrationSystem((-1));
        register0.runRegistrationSystem((int) (short) 0);
        register0.registerUser("", "");
        register0.runRegistrationSystem((int) (short) -1);
        register0.runRegistrationSystem((int) (short) -1);
        register0.loginUser("hi!", "");
        register0.loginUser("hi!", "hi!");
    }

    @Test
    public void test0758() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest1.test0758");
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
        register0.loginUser("", "");
        register0.loginUser("hi!", "");
        register0.loginUser("", "");
        java.lang.Class<?> wildcardClass35 = register0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass35);
    }

    @Test
    public void test0759() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest1.test0759");
        Register register0 = new Register();
        register0.runRegistrationSystem((int) '#');
        register0.registerUser("", "hi!");
        register0.runRegistrationSystem((int) (short) 0);
        register0.runRegistrationSystem((int) (byte) 1);
        register0.runRegistrationSystem((int) 'a');
        register0.registerUser("hi!", "hi!");
        register0.runRegistrationSystem((int) '4');
        register0.runRegistrationSystem((int) (short) -1);
        java.lang.Class<?> wildcardClass19 = register0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test0760() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest1.test0760");
        Register register0 = new Register();
        register0.loginUser("hi!", "hi!");
        register0.registerUser("", "");
        register0.loginUser("hi!", "hi!");
        register0.registerUser("hi!", "hi!");
        register0.runRegistrationSystem((int) '4');
        register0.runRegistrationSystem((int) (short) 10);
    }

    @Test
    public void test0761() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest1.test0761");
        Register register0 = new Register();
        register0.runRegistrationSystem((int) (short) 0);
        register0.loginUser("hi!", "hi!");
        register0.loginUser("", "");
        register0.registerUser("hi!", "");
        register0.registerUser("hi!", "hi!");
        register0.runRegistrationSystem((int) (byte) 1);
        register0.registerUser("hi!", "");
        register0.registerUser("", "hi!");
    }

    @Test
    public void test0762() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest1.test0762");
        Register register0 = new Register();
        register0.registerUser("hi!", "");
        register0.registerUser("hi!", "");
        register0.loginUser("hi!", "");
        register0.loginUser("", "hi!");
        register0.loginUser("hi!", "");
        register0.loginUser("", "hi!");
        register0.loginUser("", "hi!");
        register0.runRegistrationSystem((int) 'a');
    }

    @Test
    public void test0763() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest1.test0763");
        Register register0 = new Register();
        register0.loginUser("hi!", "hi!");
        register0.registerUser("hi!", "");
        register0.registerUser("", "");
        register0.registerUser("", "hi!");
        register0.runRegistrationSystem((int) (short) 100);
        register0.runRegistrationSystem((int) (byte) 1);
        register0.loginUser("", "");
        register0.runRegistrationSystem(100);
        register0.loginUser("hi!", "hi!");
        java.lang.Class<?> wildcardClass25 = register0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test0764() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest1.test0764");
        Register register0 = new Register();
        register0.runRegistrationSystem((int) (short) 0);
        register0.loginUser("hi!", "hi!");
        register0.loginUser("hi!", "");
        register0.loginUser("", "hi!");
        register0.registerUser("hi!", "hi!");
        register0.loginUser("hi!", "hi!");
        register0.registerUser("", "hi!");
        java.lang.Class<?> wildcardClass21 = register0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test0765() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest1.test0765");
        Register register0 = new Register();
        register0.loginUser("hi!", "hi!");
        register0.runRegistrationSystem(0);
        register0.registerUser("", "");
        register0.loginUser("", "hi!");
        register0.registerUser("", "");
        register0.loginUser("hi!", "hi!");
        register0.registerUser("hi!", "");
    }

    @Test
    public void test0766() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest1.test0766");
        Register register0 = new Register();
        register0.runRegistrationSystem((int) '#');
        register0.loginUser("hi!", "hi!");
        register0.registerUser("", "");
        register0.loginUser("", "hi!");
        register0.loginUser("", "hi!");
        register0.loginUser("hi!", "hi!");
        register0.runRegistrationSystem(0);
    }

    @Test
    public void test0767() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest1.test0767");
        Register register0 = new Register();
        register0.runRegistrationSystem((int) (short) 0);
        register0.loginUser("hi!", "hi!");
        register0.registerUser("", "");
        register0.runRegistrationSystem((-1));
        register0.runRegistrationSystem((int) (short) 0);
        register0.registerUser("", "");
        register0.loginUser("hi!", "hi!");
        java.lang.Class<?> wildcardClass19 = register0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test0768() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest1.test0768");
        Register register0 = new Register();
        register0.loginUser("hi!", "hi!");
        register0.registerUser("hi!", "");
        register0.registerUser("", "");
        register0.registerUser("", "hi!");
        register0.runRegistrationSystem((int) (short) 100);
        register0.registerUser("", "hi!");
        register0.runRegistrationSystem(0);
        register0.loginUser("hi!", "hi!");
        register0.runRegistrationSystem((int) (byte) 0);
    }

    @Test
    public void test0769() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest1.test0769");
        Register register0 = new Register();
        register0.registerUser("hi!", "");
        register0.registerUser("hi!", "");
        register0.loginUser("hi!", "");
        register0.registerUser("", "hi!");
        register0.registerUser("hi!", "");
        register0.registerUser("", "");
        register0.registerUser("hi!", "");
    }

    @Test
    public void test0770() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest1.test0770");
        Register register0 = new Register();
        register0.runRegistrationSystem((int) (short) 0);
        register0.loginUser("hi!", "hi!");
        register0.registerUser("", "");
        register0.runRegistrationSystem((int) '#');
        register0.registerUser("", "hi!");
        register0.registerUser("", "");
        java.lang.Class<?> wildcardClass17 = register0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test0771() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest1.test0771");
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
        java.lang.Class<?> wildcardClass29 = register0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass29);
    }

    @Test
    public void test0772() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest1.test0772");
        Register register0 = new Register();
        register0.runRegistrationSystem((int) (byte) -1);
        register0.runRegistrationSystem((int) (short) 10);
        register0.runRegistrationSystem(10);
        register0.loginUser("", "");
        register0.registerUser("hi!", "hi!");
        register0.runRegistrationSystem((int) (short) 10);
        register0.loginUser("hi!", "hi!");
        register0.registerUser("hi!", "hi!");
    }

    @Test
    public void test0773() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest1.test0773");
        Register register0 = new Register();
        register0.loginUser("", "hi!");
        register0.loginUser("", "hi!");
        register0.loginUser("hi!", "hi!");
        register0.registerUser("", "");
        register0.registerUser("", "");
    }

    @Test
    public void test0774() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest1.test0774");
        Register register0 = new Register();
        register0.runRegistrationSystem((int) (short) 0);
        register0.loginUser("hi!", "hi!");
        register0.registerUser("", "");
        register0.runRegistrationSystem((int) '#');
        register0.runRegistrationSystem((int) (byte) 0);
        register0.runRegistrationSystem(0);
        register0.registerUser("", "hi!");
        register0.registerUser("", "hi!");
        java.lang.Class<?> wildcardClass21 = register0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test0775() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest1.test0775");
        Register register0 = new Register();
        register0.runRegistrationSystem((int) (byte) -1);
        register0.registerUser("hi!", "");
        register0.runRegistrationSystem((int) (byte) -1);
        register0.loginUser("hi!", "hi!");
        register0.registerUser("", "");
        register0.runRegistrationSystem((int) ' ');
    }

    @Test
    public void test0776() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest1.test0776");
        Register register0 = new Register();
        register0.registerUser("hi!", "");
        register0.loginUser("", "hi!");
        register0.runRegistrationSystem(0);
        register0.registerUser("hi!", "hi!");
        register0.loginUser("", "hi!");
        register0.runRegistrationSystem((int) (byte) 100);
    }

    @Test
    public void test0777() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest1.test0777");
        Register register0 = new Register();
        register0.runRegistrationSystem((int) (byte) -1);
        register0.registerUser("hi!", "");
        register0.loginUser("hi!", "hi!");
        register0.runRegistrationSystem((int) (byte) 1);
        register0.runRegistrationSystem((int) ' ');
        register0.runRegistrationSystem((int) 'a');
        register0.registerUser("hi!", "");
        java.lang.Class<?> wildcardClass18 = register0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test0778() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest1.test0778");
        Register register0 = new Register();
        register0.registerUser("hi!", "");
        register0.registerUser("hi!", "");
        register0.loginUser("hi!", "");
        register0.loginUser("", "hi!");
        register0.loginUser("", "");
        java.lang.Class<?> wildcardClass16 = register0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0779() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest1.test0779");
        Register register0 = new Register();
        register0.runRegistrationSystem((int) (short) 0);
        register0.loginUser("hi!", "hi!");
        register0.registerUser("", "");
        register0.runRegistrationSystem((-1));
        register0.loginUser("hi!", "");
        register0.registerUser("hi!", "hi!");
        register0.runRegistrationSystem(1);
        java.lang.Class<?> wildcardClass19 = register0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test0780() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest1.test0780");
        Register register0 = new Register();
        register0.loginUser("hi!", "hi!");
        register0.runRegistrationSystem((int) (byte) 1);
        register0.runRegistrationSystem((int) (byte) 1);
        register0.runRegistrationSystem((int) (byte) 1);
    }

    @Test
    public void test0781() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest1.test0781");
        Register register0 = new Register();
        register0.runRegistrationSystem((int) '#');
        register0.loginUser("hi!", "hi!");
        register0.runRegistrationSystem((int) (byte) 10);
        register0.registerUser("hi!", "hi!");
        register0.runRegistrationSystem((int) (byte) 100);
        register0.registerUser("hi!", "");
        register0.loginUser("hi!", "");
        java.lang.Class<?> wildcardClass19 = register0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test0782() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest1.test0782");
        Register register0 = new Register();
        register0.runRegistrationSystem((int) (byte) -1);
        register0.registerUser("hi!", "");
        register0.runRegistrationSystem((int) (short) 1);
        register0.loginUser("", "hi!");
        register0.registerUser("", "");
        register0.runRegistrationSystem((int) (short) 0);
        register0.loginUser("", "");
        register0.registerUser("hi!", "hi!");
        java.lang.Class<?> wildcardClass22 = register0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test0783() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest1.test0783");
        Register register0 = new Register();
        register0.runRegistrationSystem((int) (byte) -1);
        register0.runRegistrationSystem((int) (short) 10);
        register0.registerUser("", "hi!");
        register0.runRegistrationSystem(0);
        register0.loginUser("hi!", "");
        register0.loginUser("hi!", "");
    }

    @Test
    public void test0784() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest1.test0784");
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
        java.lang.Class<?> wildcardClass30 = register0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass30);
    }

    @Test
    public void test0785() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest1.test0785");
        Register register0 = new Register();
        register0.registerUser("hi!", "");
        register0.loginUser("", "hi!");
        register0.loginUser("", "hi!");
        register0.runRegistrationSystem(10);
        register0.loginUser("", "");
        register0.runRegistrationSystem((int) (byte) 10);
        register0.runRegistrationSystem((int) (short) 1);
        java.lang.Class<?> wildcardClass19 = register0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test0786() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest1.test0786");
        Register register0 = new Register();
        register0.runRegistrationSystem((int) '#');
        register0.loginUser("hi!", "hi!");
        register0.registerUser("", "");
        register0.loginUser("", "hi!");
        register0.loginUser("", "");
        register0.loginUser("", "hi!");
        register0.registerUser("", "hi!");
        java.lang.Class<?> wildcardClass21 = register0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test0787() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest1.test0787");
        Register register0 = new Register();
        register0.registerUser("hi!", "");
        register0.runRegistrationSystem(1);
        register0.registerUser("", "");
        register0.runRegistrationSystem((int) (short) -1);
        register0.registerUser("", "");
        register0.runRegistrationSystem(100);
        register0.loginUser("", "");
    }

    @Test
    public void test0788() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest1.test0788");
        Register register0 = new Register();
        register0.runRegistrationSystem((int) (byte) -1);
        register0.runRegistrationSystem((int) (byte) 10);
        register0.registerUser("", "");
        register0.loginUser("", "");
        register0.registerUser("", "hi!");
        register0.registerUser("", "hi!");
        register0.registerUser("hi!", "hi!");
        register0.runRegistrationSystem((int) (short) -1);
        register0.loginUser("", "hi!");
    }

    @Test
    public void test0789() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest1.test0789");
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
        register0.loginUser("hi!", "hi!");
        java.lang.Class<?> wildcardClass31 = register0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test0790() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest1.test0790");
        Register register0 = new Register();
        register0.runRegistrationSystem((int) (short) 0);
        register0.loginUser("hi!", "hi!");
        register0.registerUser("", "");
        register0.runRegistrationSystem((-1));
        register0.runRegistrationSystem((int) (short) 10);
        register0.loginUser("", "");
        register0.registerUser("", "");
    }

    @Test
    public void test0791() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest1.test0791");
        Register register0 = new Register();
        register0.runRegistrationSystem((int) '#');
        register0.registerUser("", "hi!");
        register0.runRegistrationSystem((int) (short) 0);
        register0.runRegistrationSystem((int) (byte) 1);
        register0.runRegistrationSystem((int) 'a');
        register0.registerUser("hi!", "hi!");
        register0.runRegistrationSystem(1);
    }

    @Test
    public void test0792() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest1.test0792");
        Register register0 = new Register();
        register0.runRegistrationSystem((int) '#');
        register0.loginUser("hi!", "hi!");
        register0.loginUser("hi!", "hi!");
        register0.loginUser("hi!", "");
        register0.loginUser("", "");
        register0.runRegistrationSystem((int) (short) 10);
        register0.runRegistrationSystem((int) (byte) 1);
        register0.runRegistrationSystem((-1));
        java.lang.Class<?> wildcardClass21 = register0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test0793() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest1.test0793");
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
        register0.runRegistrationSystem(1);
        register0.registerUser("hi!", "hi!");
    }

    @Test
    public void test0794() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest1.test0794");
        Register register0 = new Register();
        register0.runRegistrationSystem((int) (byte) -1);
        register0.runRegistrationSystem((int) (byte) 10);
        register0.registerUser("", "");
        register0.loginUser("", "");
        register0.registerUser("", "hi!");
        register0.registerUser("", "hi!");
        register0.loginUser("hi!", "");
        register0.registerUser("hi!", "");
        register0.registerUser("", "");
        register0.loginUser("", "hi!");
    }

    @Test
    public void test0795() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest1.test0795");
        Register register0 = new Register();
        register0.loginUser("hi!", "hi!");
        register0.registerUser("hi!", "");
        register0.loginUser("hi!", "hi!");
        register0.registerUser("", "");
        register0.loginUser("", "");
        register0.registerUser("", "");
    }

    @Test
    public void test0796() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest1.test0796");
        Register register0 = new Register();
        register0.registerUser("hi!", "");
        register0.registerUser("hi!", "");
        register0.runRegistrationSystem((int) (byte) 0);
        register0.registerUser("", "");
        register0.runRegistrationSystem((int) (byte) 10);
        register0.runRegistrationSystem((int) (byte) 1);
        java.lang.Class<?> wildcardClass16 = register0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0797() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest1.test0797");
        Register register0 = new Register();
        register0.runRegistrationSystem((int) '#');
        register0.registerUser("", "hi!");
        register0.runRegistrationSystem((int) (short) 0);
        register0.runRegistrationSystem((int) (byte) 1);
        register0.registerUser("", "");
        register0.loginUser("", "");
        register0.runRegistrationSystem(100);
        register0.runRegistrationSystem((int) (short) 10);
        java.lang.Class<?> wildcardClass20 = register0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test0798() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest1.test0798");
        Register register0 = new Register();
        register0.runRegistrationSystem((int) '#');
        register0.registerUser("", "hi!");
        register0.runRegistrationSystem((int) (short) 0);
        register0.runRegistrationSystem((int) (byte) 1);
        register0.loginUser("", "hi!");
        register0.registerUser("", "hi!");
        register0.registerUser("", "");
        java.lang.Class<?> wildcardClass19 = register0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test0799() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest1.test0799");
        Register register0 = new Register();
        register0.runRegistrationSystem((int) '#');
        register0.loginUser("hi!", "hi!");
        register0.loginUser("hi!", "hi!");
        register0.loginUser("hi!", "");
        register0.loginUser("", "");
        register0.runRegistrationSystem((int) (short) 10);
        register0.registerUser("", "hi!");
        register0.runRegistrationSystem(0);
        register0.runRegistrationSystem((-1));
    }

    @Test
    public void test0800() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest1.test0800");
        Register register0 = new Register();
        register0.runRegistrationSystem((int) (byte) -1);
        register0.registerUser("hi!", "");
        register0.runRegistrationSystem((int) (short) 1);
        register0.loginUser("", "hi!");
        register0.runRegistrationSystem((int) '4');
        register0.loginUser("", "");
        java.lang.Class<?> wildcardClass16 = register0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0801() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest1.test0801");
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
        java.lang.Class<?> wildcardClass30 = register0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass30);
    }

    @Test
    public void test0802() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest1.test0802");
        Register register0 = new Register();
        register0.runRegistrationSystem((int) (byte) -1);
        register0.registerUser("hi!", "");
        register0.loginUser("hi!", "hi!");
        register0.loginUser("hi!", "");
        register0.registerUser("hi!", "");
        register0.registerUser("hi!", "hi!");
        java.lang.Class<?> wildcardClass18 = register0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test0803() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest1.test0803");
        Register register0 = new Register();
        register0.registerUser("hi!", "");
        register0.loginUser("", "hi!");
        register0.runRegistrationSystem((int) (byte) -1);
        register0.loginUser("", "");
        java.lang.Class<?> wildcardClass12 = register0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0804() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest1.test0804");
        Register register0 = new Register();
        register0.registerUser("", "hi!");
        register0.loginUser("hi!", "hi!");
        java.lang.Class<?> wildcardClass7 = register0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0805() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest1.test0805");
        Register register0 = new Register();
        register0.registerUser("hi!", "");
        register0.loginUser("", "hi!");
        register0.runRegistrationSystem((int) 'a');
        register0.loginUser("", "hi!");
        register0.loginUser("", "hi!");
        register0.registerUser("", "");
        register0.registerUser("hi!", "");
        register0.runRegistrationSystem((int) ' ');
        register0.registerUser("", "");
    }

    @Test
    public void test0806() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest1.test0806");
        Register register0 = new Register();
        register0.runRegistrationSystem((int) (byte) -1);
        register0.registerUser("hi!", "");
        register0.runRegistrationSystem((int) (byte) 100);
        register0.runRegistrationSystem((int) (short) -1);
        register0.registerUser("hi!", "hi!");
        register0.runRegistrationSystem((int) (short) 10);
    }

    @Test
    public void test0807() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest1.test0807");
        Register register0 = new Register();
        register0.runRegistrationSystem((int) '#');
        register0.loginUser("hi!", "hi!");
        register0.runRegistrationSystem((int) (byte) 10);
        register0.registerUser("hi!", "hi!");
        register0.runRegistrationSystem((int) (byte) 100);
        register0.registerUser("hi!", "");
        register0.registerUser("", "hi!");
        register0.runRegistrationSystem((int) (byte) 10);
    }

    @Test
    public void test0808() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest1.test0808");
        Register register0 = new Register();
        register0.registerUser("hi!", "");
        register0.loginUser("", "hi!");
        register0.runRegistrationSystem((int) 'a');
        register0.loginUser("", "hi!");
        register0.loginUser("", "hi!");
        register0.runRegistrationSystem((int) ' ');
        register0.runRegistrationSystem((-1));
        java.lang.Class<?> wildcardClass19 = register0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test0809() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest1.test0809");
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
        java.lang.Class<?> wildcardClass31 = register0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test0810() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest1.test0810");
        Register register0 = new Register();
        register0.runRegistrationSystem((int) (short) 0);
        register0.loginUser("hi!", "hi!");
        register0.registerUser("", "");
        register0.loginUser("", "hi!");
        register0.registerUser("", "");
        java.lang.Class<?> wildcardClass15 = register0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0811() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest1.test0811");
        Register register0 = new Register();
        register0.runRegistrationSystem((int) (byte) -1);
        register0.registerUser("hi!", "");
        register0.runRegistrationSystem((int) (short) 1);
        register0.runRegistrationSystem((int) 'a');
        register0.registerUser("", "");
        register0.loginUser("hi!", "");
        register0.runRegistrationSystem((int) (short) 100);
        register0.loginUser("", "");
    }

    @Test
    public void test0812() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest1.test0812");
        Register register0 = new Register();
        register0.runRegistrationSystem((int) (byte) -1);
        register0.runRegistrationSystem((int) (byte) 10);
        register0.registerUser("", "");
        register0.loginUser("", "");
        register0.runRegistrationSystem((int) (byte) 0);
        register0.loginUser("", "hi!");
        register0.loginUser("", "hi!");
        register0.runRegistrationSystem((int) (short) -1);
    }

    @Test
    public void test0813() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest1.test0813");
        Register register0 = new Register();
        register0.runRegistrationSystem((int) (byte) -1);
        register0.runRegistrationSystem((int) (byte) 10);
        register0.registerUser("", "");
        register0.registerUser("", "hi!");
        register0.runRegistrationSystem((int) '4');
        register0.loginUser("hi!", "");
        register0.runRegistrationSystem((int) '4');
        register0.loginUser("hi!", "hi!");
        register0.registerUser("hi!", "");
    }

    @Test
    public void test0814() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest1.test0814");
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
        register0.loginUser("hi!", "");
    }

    @Test
    public void test0815() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest1.test0815");
        Register register0 = new Register();
        register0.runRegistrationSystem((int) '#');
        register0.registerUser("", "hi!");
        register0.runRegistrationSystem((int) (short) 0);
        register0.runRegistrationSystem((int) (byte) 1);
        register0.registerUser("", "");
        register0.runRegistrationSystem((int) (short) 10);
        register0.registerUser("hi!", "");
        register0.registerUser("", "");
        register0.loginUser("", "");
    }

    @Test
    public void test0816() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest1.test0816");
        Register register0 = new Register();
        register0.loginUser("hi!", "hi!");
        register0.registerUser("hi!", "hi!");
        register0.loginUser("", "");
        register0.loginUser("hi!", "");
        register0.runRegistrationSystem((int) (short) 10);
        register0.loginUser("", "");
        register0.runRegistrationSystem((int) (byte) 100);
        register0.loginUser("", "hi!");
        java.lang.Class<?> wildcardClass23 = register0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test0817() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest1.test0817");
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
        java.lang.Class<?> wildcardClass30 = register0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass30);
    }

    @Test
    public void test0818() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest1.test0818");
        Register register0 = new Register();
        register0.runRegistrationSystem((int) (byte) -1);
        register0.registerUser("hi!", "");
        register0.runRegistrationSystem((int) (short) 1);
        register0.runRegistrationSystem(10);
        register0.registerUser("", "hi!");
        register0.loginUser("", "hi!");
    }

    @Test
    public void test0819() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest1.test0819");
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
        java.lang.Class<?> wildcardClass26 = register0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass26);
    }

    @Test
    public void test0820() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest1.test0820");
        Register register0 = new Register();
        register0.registerUser("hi!", "");
        register0.loginUser("", "");
        register0.runRegistrationSystem((int) 'a');
        register0.loginUser("", "");
        register0.runRegistrationSystem((int) (byte) 100);
        register0.registerUser("", "hi!");
        java.lang.Class<?> wildcardClass17 = register0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test0821() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest1.test0821");
        Register register0 = new Register();
        register0.registerUser("hi!", "");
        register0.loginUser("", "hi!");
        register0.runRegistrationSystem((int) 'a');
        register0.loginUser("", "hi!");
        register0.loginUser("hi!", "");
        register0.loginUser("hi!", "hi!");
        register0.runRegistrationSystem(0);
        java.lang.Class<?> wildcardClass20 = register0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test0822() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest1.test0822");
        Register register0 = new Register();
        register0.runRegistrationSystem((int) '#');
        register0.registerUser("", "hi!");
        register0.runRegistrationSystem((int) (short) 0);
        register0.runRegistrationSystem((int) (byte) 1);
        register0.runRegistrationSystem((int) 'a');
        register0.registerUser("", "");
        register0.registerUser("hi!", "hi!");
        register0.loginUser("hi!", "");
        register0.registerUser("", "");
        register0.loginUser("hi!", "");
    }

    @Test
    public void test0823() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest1.test0823");
        Register register0 = new Register();
        register0.loginUser("hi!", "hi!");
        register0.runRegistrationSystem(0);
        register0.registerUser("", "");
        register0.runRegistrationSystem((-1));
        register0.loginUser("", "");
        register0.registerUser("hi!", "hi!");
        register0.registerUser("", "");
        java.lang.Class<?> wildcardClass20 = register0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test0824() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest1.test0824");
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
        java.lang.Class<?> wildcardClass31 = register0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test0825() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest1.test0825");
        Register register0 = new Register();
        register0.registerUser("hi!", "");
        register0.loginUser("", "hi!");
        register0.runRegistrationSystem((int) (byte) -1);
        register0.runRegistrationSystem(1);
        register0.loginUser("hi!", "");
        register0.runRegistrationSystem(0);
        register0.registerUser("", "");
        register0.loginUser("", "");
        java.lang.Class<?> wildcardClass22 = register0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test0826() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest1.test0826");
        Register register0 = new Register();
        register0.registerUser("hi!", "");
        register0.registerUser("hi!", "");
        register0.loginUser("hi!", "");
        register0.loginUser("hi!", "");
        register0.loginUser("", "hi!");
        register0.loginUser("", "hi!");
        register0.runRegistrationSystem((int) (short) 100);
        java.lang.Class<?> wildcardClass21 = register0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test0827() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest1.test0827");
        Register register0 = new Register();
        register0.runRegistrationSystem((int) (byte) -1);
        register0.runRegistrationSystem((int) (byte) 10);
        register0.registerUser("", "");
        register0.loginUser("", "");
        register0.registerUser("", "hi!");
        register0.registerUser("", "hi!");
        register0.registerUser("hi!", "hi!");
        register0.registerUser("hi!", "hi!");
        register0.runRegistrationSystem((int) ' ');
    }

    @Test
    public void test0828() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest1.test0828");
        Register register0 = new Register();
        register0.runRegistrationSystem((int) (byte) -1);
        register0.loginUser("hi!", "hi!");
    }

    @Test
    public void test0829() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest1.test0829");
        Register register0 = new Register();
        register0.registerUser("hi!", "");
        register0.loginUser("", "hi!");
        register0.runRegistrationSystem((int) 'a');
        register0.loginUser("", "hi!");
        java.lang.Class<?> wildcardClass12 = register0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0830() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest1.test0830");
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
        register0.runRegistrationSystem((-1));
    }

    @Test
    public void test0831() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest1.test0831");
        Register register0 = new Register();
        register0.runRegistrationSystem((int) (short) 0);
        register0.loginUser("hi!", "hi!");
        register0.loginUser("", "");
        register0.runRegistrationSystem((int) (short) 1);
        register0.loginUser("", "");
    }

    @Test
    public void test0832() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest1.test0832");
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
        register0.loginUser("", "hi!");
    }

    @Test
    public void test0833() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest1.test0833");
        Register register0 = new Register();
        register0.runRegistrationSystem((int) (byte) -1);
        register0.runRegistrationSystem((int) (byte) 10);
        register0.registerUser("", "");
        register0.loginUser("", "");
        register0.registerUser("", "hi!");
        register0.registerUser("", "hi!");
        register0.registerUser("", "hi!");
        java.lang.Class<?> wildcardClass20 = register0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test0834() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest1.test0834");
        Register register0 = new Register();
        register0.runRegistrationSystem((int) (byte) -1);
        register0.runRegistrationSystem((int) (byte) 10);
        register0.registerUser("", "");
        register0.loginUser("", "");
        register0.registerUser("", "hi!");
        register0.registerUser("hi!", "");
        register0.runRegistrationSystem((int) 'a');
        register0.runRegistrationSystem((int) '#');
        register0.registerUser("", "");
    }

    @Test
    public void test0835() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest1.test0835");
        Register register0 = new Register();
        register0.registerUser("hi!", "");
        register0.registerUser("hi!", "");
        register0.runRegistrationSystem((int) (byte) 0);
        register0.runRegistrationSystem((int) (short) 10);
        register0.registerUser("", "");
        register0.runRegistrationSystem((int) (short) 10);
        java.lang.Class<?> wildcardClass16 = register0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0836() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest1.test0836");
        Register register0 = new Register();
        register0.runRegistrationSystem((int) '#');
        register0.registerUser("", "hi!");
        register0.loginUser("hi!", "hi!");
        register0.loginUser("", "hi!");
        register0.runRegistrationSystem(0);
        register0.loginUser("", "hi!");
        register0.loginUser("hi!", "hi!");
        register0.loginUser("hi!", "");
        java.lang.Class<?> wildcardClass23 = register0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test0837() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest1.test0837");
        Register register0 = new Register();
        register0.runRegistrationSystem((int) (byte) -1);
        register0.registerUser("hi!", "");
        register0.runRegistrationSystem((int) (short) 1);
        register0.runRegistrationSystem(10);
        register0.runRegistrationSystem(10);
        register0.runRegistrationSystem(0);
    }

    @Test
    public void test0838() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest1.test0838");
        Register register0 = new Register();
        register0.loginUser("hi!", "hi!");
        register0.runRegistrationSystem(0);
        register0.registerUser("", "");
        register0.registerUser("", "hi!");
        register0.loginUser("hi!", "");
        register0.registerUser("", "");
        register0.registerUser("hi!", "hi!");
    }

    @Test
    public void test0839() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest1.test0839");
        Register register0 = new Register();
        register0.loginUser("hi!", "hi!");
        register0.runRegistrationSystem(0);
        register0.runRegistrationSystem(10);
        register0.runRegistrationSystem(1);
        register0.runRegistrationSystem((int) (byte) -1);
        java.lang.Class<?> wildcardClass12 = register0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0840() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest1.test0840");
        Register register0 = new Register();
        register0.runRegistrationSystem((int) (short) 0);
        register0.loginUser("hi!", "hi!");
        register0.loginUser("", "");
        register0.runRegistrationSystem((int) (short) 1);
        java.lang.Class<?> wildcardClass11 = register0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0841() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest1.test0841");
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
        register0.runRegistrationSystem(0);
    }

    @Test
    public void test0842() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest1.test0842");
        Register register0 = new Register();
        register0.registerUser("hi!", "");
        register0.runRegistrationSystem(1);
        register0.registerUser("", "");
        register0.registerUser("hi!", "");
        register0.registerUser("hi!", "");
        register0.registerUser("", "");
        java.lang.Class<?> wildcardClass18 = register0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test0843() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest1.test0843");
        Register register0 = new Register();
        register0.runRegistrationSystem((int) (short) 0);
        register0.loginUser("hi!", "hi!");
        register0.registerUser("", "");
        register0.loginUser("", "hi!");
        register0.registerUser("hi!", "");
        register0.registerUser("hi!", "");
        register0.runRegistrationSystem((int) '4');
        java.lang.Class<?> wildcardClass20 = register0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test0844() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest1.test0844");
        Register register0 = new Register();
        register0.runRegistrationSystem((int) (byte) -1);
        register0.registerUser("hi!", "");
        register0.loginUser("hi!", "hi!");
        register0.loginUser("hi!", "hi!");
        register0.loginUser("", "");
        java.lang.Class<?> wildcardClass15 = register0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0845() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest1.test0845");
        Register register0 = new Register();
        register0.registerUser("hi!", "");
        register0.registerUser("hi!", "");
        register0.loginUser("hi!", "");
        register0.loginUser("hi!", "");
        register0.registerUser("", "");
        register0.loginUser("hi!", "hi!");
        register0.runRegistrationSystem((-1));
        java.lang.Class<?> wildcardClass21 = register0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test0846() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest1.test0846");
        Register register0 = new Register();
        register0.runRegistrationSystem((int) '#');
        register0.loginUser("hi!", "hi!");
        register0.loginUser("hi!", "hi!");
        java.lang.Class<?> wildcardClass9 = register0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0847() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest1.test0847");
        Register register0 = new Register();
        register0.runRegistrationSystem((int) (byte) -1);
        register0.registerUser("hi!", "");
        register0.runRegistrationSystem((int) (byte) 100);
        register0.runRegistrationSystem((int) (short) -1);
        register0.runRegistrationSystem(10);
        register0.registerUser("hi!", "hi!");
    }

    @Test
    public void test0848() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest1.test0848");
        Register register0 = new Register();
        register0.registerUser("hi!", "");
        register0.registerUser("hi!", "");
        register0.runRegistrationSystem((int) (byte) 0);
        register0.runRegistrationSystem((int) (short) 10);
        register0.registerUser("", "");
        register0.runRegistrationSystem((int) (byte) 1);
    }

    @Test
    public void test0849() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest1.test0849");
        Register register0 = new Register();
        register0.runRegistrationSystem((int) '#');
        register0.registerUser("", "hi!");
        register0.loginUser("hi!", "hi!");
        register0.runRegistrationSystem((int) (short) 10);
        register0.loginUser("", "");
        java.lang.Class<?> wildcardClass14 = register0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0850() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest1.test0850");
        Register register0 = new Register();
        register0.registerUser("hi!", "");
        register0.registerUser("hi!", "");
        register0.loginUser("hi!", "");
        register0.loginUser("hi!", "");
        register0.runRegistrationSystem(10);
        register0.registerUser("", "");
        register0.registerUser("", "");
        register0.registerUser("hi!", "hi!");
        java.lang.Class<?> wildcardClass24 = register0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test0851() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest1.test0851");
        Register register0 = new Register();
        register0.runRegistrationSystem((int) (byte) -1);
        register0.runRegistrationSystem((int) (short) 10);
        register0.loginUser("hi!", "");
        register0.registerUser("", "hi!");
        register0.registerUser("hi!", "hi!");
        register0.runRegistrationSystem((int) (byte) 1);
    }

    @Test
    public void test0852() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest1.test0852");
        Register register0 = new Register();
        register0.runRegistrationSystem((int) (byte) -1);
        register0.registerUser("hi!", "");
        register0.loginUser("hi!", "hi!");
        register0.loginUser("hi!", "hi!");
        java.lang.Class<?> wildcardClass12 = register0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0853() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest1.test0853");
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
        register0.runRegistrationSystem(10);
    }

    @Test
    public void test0854() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest1.test0854");
        Register register0 = new Register();
        register0.runRegistrationSystem((int) '#');
        register0.registerUser("", "hi!");
        register0.runRegistrationSystem((int) (short) 0);
        register0.runRegistrationSystem((int) (byte) 1);
        register0.registerUser("", "");
        register0.runRegistrationSystem((int) (short) 10);
        register0.loginUser("", "hi!");
        register0.registerUser("hi!", "hi!");
        register0.runRegistrationSystem((int) '#');
        java.lang.Class<?> wildcardClass23 = register0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test0855() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest1.test0855");
        Register register0 = new Register();
        register0.registerUser("hi!", "");
        register0.loginUser("", "");
        register0.runRegistrationSystem((int) 'a');
        register0.registerUser("", "");
        register0.registerUser("hi!", "hi!");
        register0.registerUser("", "");
        register0.registerUser("hi!", "");
        java.lang.Class<?> wildcardClass21 = register0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test0856() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest1.test0856");
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
        register0.loginUser("", "");
    }

    @Test
    public void test0857() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest1.test0857");
        Register register0 = new Register();
        register0.loginUser("", "hi!");
        register0.registerUser("", "");
        register0.runRegistrationSystem((int) ' ');
        register0.loginUser("hi!", "hi!");
    }

    @Test
    public void test0858() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest1.test0858");
        Register register0 = new Register();
        register0.registerUser("hi!", "");
        register0.runRegistrationSystem(1);
        register0.registerUser("", "");
        register0.registerUser("hi!", "");
        register0.registerUser("hi!", "hi!");
        java.lang.Class<?> wildcardClass15 = register0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0859() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest1.test0859");
        Register register0 = new Register();
        register0.runRegistrationSystem((int) (short) 0);
        register0.loginUser("hi!", "hi!");
        register0.registerUser("", "");
        register0.runRegistrationSystem((-1));
        register0.loginUser("hi!", "");
        register0.registerUser("hi!", "hi!");
        register0.runRegistrationSystem(1);
        register0.runRegistrationSystem((int) (short) 100);
        register0.loginUser("", "hi!");
    }

    @Test
    public void test0860() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest1.test0860");
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
        register0.loginUser("", "");
        register0.runRegistrationSystem((int) (short) 1);
    }

    @Test
    public void test0861() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest1.test0861");
        Register register0 = new Register();
        register0.loginUser("hi!", "hi!");
        register0.loginUser("", "hi!");
        register0.loginUser("", "");
        register0.runRegistrationSystem((int) (byte) 10);
        register0.runRegistrationSystem((-1));
        register0.runRegistrationSystem((int) (byte) 10);
    }

    @Test
    public void test0862() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest1.test0862");
        Register register0 = new Register();
        register0.runRegistrationSystem((int) (short) 0);
        register0.loginUser("hi!", "hi!");
        register0.loginUser("", "");
        register0.registerUser("hi!", "");
        register0.registerUser("hi!", "");
        register0.loginUser("hi!", "");
        register0.registerUser("", "");
    }

    @Test
    public void test0863() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest1.test0863");
        Register register0 = new Register();
        register0.runRegistrationSystem((int) (short) 0);
        register0.loginUser("hi!", "hi!");
        register0.registerUser("", "");
        register0.runRegistrationSystem((-1));
        register0.registerUser("", "hi!");
        register0.registerUser("hi!", "");
        java.lang.Class<?> wildcardClass17 = register0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test0864() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest1.test0864");
        Register register0 = new Register();
        register0.runRegistrationSystem((int) (short) 0);
        register0.loginUser("hi!", "hi!");
        register0.registerUser("", "");
        register0.runRegistrationSystem((int) '#');
        register0.registerUser("", "hi!");
        register0.loginUser("", "");
        register0.registerUser("hi!", "hi!");
        register0.loginUser("", "");
        register0.runRegistrationSystem((int) (byte) -1);
    }

    @Test
    public void test0865() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest1.test0865");
        Register register0 = new Register();
        register0.loginUser("hi!", "hi!");
        register0.runRegistrationSystem(0);
        register0.registerUser("", "");
        register0.registerUser("", "hi!");
        register0.loginUser("hi!", "");
        java.lang.Class<?> wildcardClass15 = register0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0866() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest1.test0866");
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
        register0.runRegistrationSystem((int) (byte) 100);
        register0.registerUser("hi!", "");
        java.lang.Class<?> wildcardClass27 = register0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test0867() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest1.test0867");
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
        java.lang.Class<?> wildcardClass26 = register0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass26);
    }

    @Test
    public void test0868() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest1.test0868");
        Register register0 = new Register();
        register0.registerUser("hi!", "");
        register0.loginUser("", "");
        register0.runRegistrationSystem((int) 'a');
        register0.registerUser("", "");
        register0.registerUser("hi!", "hi!");
        register0.loginUser("", "hi!");
        register0.loginUser("hi!", "hi!");
    }

    @Test
    public void test0869() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest1.test0869");
        Register register0 = new Register();
        register0.registerUser("hi!", "");
        register0.registerUser("hi!", "");
        register0.loginUser("hi!", "");
        register0.loginUser("hi!", "");
        register0.runRegistrationSystem(10);
        register0.registerUser("", "");
        register0.loginUser("hi!", "");
        register0.loginUser("", "");
        register0.loginUser("", "");
        register0.loginUser("", "");
        java.lang.Class<?> wildcardClass30 = register0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass30);
    }

    @Test
    public void test0870() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest1.test0870");
        Register register0 = new Register();
        register0.registerUser("hi!", "");
        register0.registerUser("hi!", "");
        register0.runRegistrationSystem((int) (byte) 0);
        register0.registerUser("", "");
        register0.loginUser("", "");
        register0.loginUser("", "hi!");
        register0.loginUser("hi!", "");
        register0.runRegistrationSystem(0);
        register0.runRegistrationSystem((-1));
    }

    @Test
    public void test0871() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest1.test0871");
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
        register0.registerUser("hi!", "hi!");
        register0.loginUser("hi!", "");
        register0.runRegistrationSystem((int) (short) 0);
    }

    @Test
    public void test0872() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest1.test0872");
        Register register0 = new Register();
        register0.runRegistrationSystem((int) (byte) -1);
        register0.runRegistrationSystem((int) (byte) 10);
        register0.registerUser("", "");
        register0.loginUser("", "");
        register0.registerUser("", "hi!");
        register0.registerUser("", "hi!");
        register0.loginUser("", "");
        register0.loginUser("", "hi!");
        register0.registerUser("", "hi!");
    }

    @Test
    public void test0873() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest1.test0873");
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
        java.lang.Class<?> wildcardClass26 = register0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass26);
    }

    @Test
    public void test0874() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest1.test0874");
        Register register0 = new Register();
        register0.runRegistrationSystem((int) '#');
        register0.loginUser("hi!", "hi!");
        register0.registerUser("", "");
        register0.registerUser("hi!", "");
        register0.runRegistrationSystem((int) (byte) 10);
        register0.registerUser("", "hi!");
    }

    @Test
    public void test0875() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest1.test0875");
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
        java.lang.Class<?> wildcardClass24 = register0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test0876() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest1.test0876");
        Register register0 = new Register();
        register0.runRegistrationSystem((int) (byte) -1);
        register0.registerUser("hi!", "");
        register0.loginUser("hi!", "hi!");
        register0.loginUser("", "");
        register0.runRegistrationSystem((int) (byte) 1);
        java.lang.Class<?> wildcardClass14 = register0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0877() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest1.test0877");
        Register register0 = new Register();
        register0.runRegistrationSystem((int) (byte) -1);
        register0.runRegistrationSystem((int) (short) 10);
        register0.runRegistrationSystem((int) (byte) -1);
        register0.runRegistrationSystem(10);
        register0.registerUser("", "");
        register0.registerUser("hi!", "hi!");
    }

    @Test
    public void test0878() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest1.test0878");
        Register register0 = new Register();
        register0.loginUser("hi!", "hi!");
        register0.registerUser("hi!", "");
        register0.loginUser("hi!", "hi!");
        register0.runRegistrationSystem(100);
        register0.registerUser("hi!", "");
        register0.runRegistrationSystem((int) (short) -1);
        register0.loginUser("", "");
        register0.loginUser("", "");
        java.lang.Class<?> wildcardClass23 = register0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test0879() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest1.test0879");
        Register register0 = new Register();
        register0.registerUser("hi!", "");
        register0.loginUser("", "hi!");
        register0.runRegistrationSystem((int) (byte) -1);
        register0.runRegistrationSystem(10);
        register0.registerUser("", "hi!");
        java.lang.Class<?> wildcardClass14 = register0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0880() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest1.test0880");
        Register register0 = new Register();
        register0.runRegistrationSystem((int) '#');
        register0.registerUser("", "hi!");
        register0.loginUser("hi!", "hi!");
        register0.runRegistrationSystem((int) (short) 10);
        register0.loginUser("", "");
        register0.runRegistrationSystem((int) (short) -1);
    }

    @Test
    public void test0881() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest1.test0881");
        Register register0 = new Register();
        register0.runRegistrationSystem((int) (byte) -1);
        register0.registerUser("hi!", "");
        register0.runRegistrationSystem((int) (short) 1);
        register0.loginUser("", "");
        register0.loginUser("hi!", "");
        register0.registerUser("", "");
    }

    @Test
    public void test0882() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest1.test0882");
        Register register0 = new Register();
        register0.runRegistrationSystem((int) (byte) -1);
        register0.runRegistrationSystem((int) (byte) 10);
        register0.registerUser("", "");
        register0.loginUser("hi!", "");
        register0.registerUser("", "");
    }

    @Test
    public void test0883() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest1.test0883");
        Register register0 = new Register();
        register0.registerUser("hi!", "");
        register0.loginUser("", "hi!");
        register0.runRegistrationSystem((int) (byte) -1);
        register0.runRegistrationSystem(1);
        register0.loginUser("hi!", "");
        register0.runRegistrationSystem(0);
        java.lang.Class<?> wildcardClass16 = register0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0884() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest1.test0884");
        Register register0 = new Register();
        register0.runRegistrationSystem((int) '#');
        register0.registerUser("", "hi!");
        register0.registerUser("", "hi!");
        register0.registerUser("", "");
        register0.loginUser("hi!", "hi!");
        java.lang.Class<?> wildcardClass15 = register0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0885() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest1.test0885");
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
        java.lang.Class<?> wildcardClass24 = register0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test0886() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest1.test0886");
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
        java.lang.Class<?> wildcardClass33 = register0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass33);
    }

    @Test
    public void test0887() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest1.test0887");
        Register register0 = new Register();
        register0.loginUser("hi!", "hi!");
        register0.registerUser("hi!", "");
        register0.registerUser("", "");
        register0.registerUser("hi!", "");
        register0.registerUser("hi!", "");
        register0.registerUser("", "");
        register0.loginUser("", "");
        register0.registerUser("", "");
        register0.runRegistrationSystem((int) (byte) 0);
    }

    @Test
    public void test0888() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest1.test0888");
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
        register0.runRegistrationSystem(10);
        java.lang.Class<?> wildcardClass28 = register0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test0889() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest1.test0889");
        Register register0 = new Register();
        register0.runRegistrationSystem((int) (byte) -1);
        register0.registerUser("hi!", "");
        register0.loginUser("hi!", "hi!");
        register0.loginUser("hi!", "");
        register0.loginUser("", "");
        register0.runRegistrationSystem(1);
        register0.runRegistrationSystem(10);
        register0.loginUser("hi!", "hi!");
    }

    @Test
    public void test0890() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest1.test0890");
        Register register0 = new Register();
        register0.registerUser("hi!", "");
        register0.runRegistrationSystem(1);
        register0.registerUser("", "hi!");
        register0.runRegistrationSystem(100);
        register0.runRegistrationSystem((int) 'a');
        register0.loginUser("", "");
        java.lang.Class<?> wildcardClass16 = register0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0891() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest1.test0891");
        Register register0 = new Register();
        register0.registerUser("hi!", "");
        register0.loginUser("", "hi!");
        register0.runRegistrationSystem((int) 'a');
        register0.loginUser("", "hi!");
        register0.loginUser("", "hi!");
        register0.runRegistrationSystem((int) ' ');
        register0.registerUser("", "hi!");
        register0.registerUser("", "hi!");
    }

    @Test
    public void test0892() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest1.test0892");
        Register register0 = new Register();
        register0.runRegistrationSystem((int) '#');
        register0.registerUser("", "hi!");
        register0.runRegistrationSystem((int) (short) 0);
        register0.loginUser("hi!", "hi!");
        register0.registerUser("", "hi!");
        register0.runRegistrationSystem((int) (byte) 1);
    }

    @Test
    public void test0893() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest1.test0893");
        Register register0 = new Register();
        register0.runRegistrationSystem((int) (short) 0);
        register0.loginUser("hi!", "hi!");
        register0.loginUser("", "");
        register0.registerUser("hi!", "");
        register0.loginUser("hi!", "hi!");
        register0.loginUser("", "hi!");
        register0.registerUser("", "");
        java.lang.Class<?> wildcardClass21 = register0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test0894() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest1.test0894");
        Register register0 = new Register();
        register0.runRegistrationSystem((int) (byte) -1);
        register0.registerUser("hi!", "");
        register0.runRegistrationSystem((int) (byte) -1);
        register0.loginUser("hi!", "hi!");
        register0.registerUser("", "hi!");
        register0.loginUser("hi!", "hi!");
    }

    @Test
    public void test0895() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest1.test0895");
        Register register0 = new Register();
        register0.runRegistrationSystem((int) (short) 0);
        register0.loginUser("hi!", "hi!");
        register0.registerUser("", "");
        register0.runRegistrationSystem((-1));
        register0.loginUser("hi!", "");
        register0.registerUser("hi!", "hi!");
        register0.runRegistrationSystem((int) (short) 1);
        register0.runRegistrationSystem((int) (short) -1);
    }

    @Test
    public void test0896() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest1.test0896");
        Register register0 = new Register();
        register0.loginUser("hi!", "hi!");
        register0.runRegistrationSystem(0);
        register0.loginUser("hi!", "");
        register0.loginUser("", "hi!");
        register0.loginUser("hi!", "hi!");
        register0.loginUser("hi!", "");
    }

    @Test
    public void test0897() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest1.test0897");
        Register register0 = new Register();
        register0.registerUser("hi!", "");
        register0.runRegistrationSystem(1);
        register0.registerUser("", "");
        register0.loginUser("hi!", "hi!");
        register0.loginUser("hi!", "");
        register0.runRegistrationSystem((int) (short) 10);
        java.lang.Class<?> wildcardClass17 = register0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test0898() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest1.test0898");
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
        register0.loginUser("hi!", "");
        register0.runRegistrationSystem(100);
    }

    @Test
    public void test0899() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest1.test0899");
        Register register0 = new Register();
        register0.runRegistrationSystem((int) (short) 0);
        register0.loginUser("hi!", "hi!");
        register0.loginUser("", "");
        register0.registerUser("hi!", "");
        register0.registerUser("hi!", "hi!");
        register0.runRegistrationSystem((int) (byte) 1);
        register0.runRegistrationSystem((int) (byte) 0);
        java.lang.Class<?> wildcardClass19 = register0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test0900() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest1.test0900");
        Register register0 = new Register();
        register0.runRegistrationSystem((int) (byte) -1);
        register0.runRegistrationSystem((int) (byte) 10);
        register0.registerUser("", "");
        register0.loginUser("", "");
        register0.registerUser("", "hi!");
        register0.registerUser("", "hi!");
        register0.loginUser("", "");
        register0.loginUser("", "hi!");
        register0.loginUser("hi!", "hi!");
        java.lang.Class<?> wildcardClass26 = register0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass26);
    }

    @Test
    public void test0901() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest1.test0901");
        Register register0 = new Register();
        register0.registerUser("hi!", "");
        register0.runRegistrationSystem(1);
        register0.registerUser("", "hi!");
        register0.loginUser("hi!", "");
        register0.registerUser("hi!", "");
        register0.registerUser("hi!", "");
        java.lang.Class<?> wildcardClass18 = register0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test0902() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest1.test0902");
        Register register0 = new Register();
        register0.loginUser("hi!", "hi!");
        register0.registerUser("hi!", "");
        register0.registerUser("", "");
        register0.registerUser("hi!", "");
        register0.registerUser("hi!", "");
        java.lang.Class<?> wildcardClass16 = register0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0903() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest1.test0903");
        Register register0 = new Register();
        register0.loginUser("hi!", "hi!");
        register0.loginUser("", "hi!");
        register0.runRegistrationSystem((int) (byte) 0);
        register0.registerUser("", "");
        register0.registerUser("hi!", "");
    }

    @Test
    public void test0904() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest1.test0904");
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
        register0.registerUser("", "hi!");
        register0.registerUser("", "");
    }

    @Test
    public void test0905() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest1.test0905");
        Register register0 = new Register();
        register0.registerUser("hi!", "");
        register0.loginUser("", "hi!");
        register0.runRegistrationSystem((int) 'a');
        register0.loginUser("", "hi!");
        register0.runRegistrationSystem((int) (byte) -1);
        register0.loginUser("", "hi!");
        register0.registerUser("", "");
        java.lang.Class<?> wildcardClass20 = register0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test0906() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest1.test0906");
        Register register0 = new Register();
        register0.registerUser("hi!", "");
        register0.loginUser("", "");
        register0.runRegistrationSystem((int) 'a');
        register0.runRegistrationSystem((int) (short) 100);
        register0.runRegistrationSystem((int) (short) -1);
        register0.loginUser("", "hi!");
        java.lang.Class<?> wildcardClass16 = register0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0907() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest1.test0907");
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
        java.lang.Class<?> wildcardClass28 = register0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test0908() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest1.test0908");
        Register register0 = new Register();
        register0.loginUser("hi!", "hi!");
        register0.registerUser("hi!", "");
        register0.registerUser("hi!", "");
        register0.registerUser("", "hi!");
        register0.loginUser("", "");
        register0.loginUser("hi!", "");
        register0.registerUser("", "");
        java.lang.Class<?> wildcardClass22 = register0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test0909() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest1.test0909");
        Register register0 = new Register();
        register0.runRegistrationSystem((int) (short) 0);
        register0.loginUser("hi!", "hi!");
        register0.registerUser("", "");
        register0.runRegistrationSystem((-1));
        register0.loginUser("", "hi!");
        register0.loginUser("", "");
        register0.runRegistrationSystem((int) (short) 0);
        java.lang.Class<?> wildcardClass19 = register0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test0910() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest1.test0910");
        Register register0 = new Register();
        register0.loginUser("hi!", "hi!");
        register0.registerUser("hi!", "");
        register0.registerUser("", "");
        register0.runRegistrationSystem((int) (byte) 100);
        register0.loginUser("", "hi!");
        register0.registerUser("", "hi!");
        register0.runRegistrationSystem((int) (byte) 0);
    }

    @Test
    public void test0911() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest1.test0911");
        Register register0 = new Register();
        register0.registerUser("hi!", "");
        register0.loginUser("", "");
        register0.runRegistrationSystem((int) 'a');
        register0.registerUser("", "");
        register0.registerUser("hi!", "");
    }

    @Test
    public void test0912() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest1.test0912");
        Register register0 = new Register();
        register0.registerUser("hi!", "");
        register0.loginUser("", "hi!");
        register0.runRegistrationSystem((int) (byte) -1);
        register0.runRegistrationSystem(1);
        register0.loginUser("hi!", "");
        register0.runRegistrationSystem((-1));
        register0.runRegistrationSystem(10);
        register0.loginUser("", "hi!");
        java.lang.Class<?> wildcardClass21 = register0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test0913() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest1.test0913");
        Register register0 = new Register();
        register0.runRegistrationSystem((int) (byte) -1);
        register0.runRegistrationSystem((int) (short) 10);
        register0.runRegistrationSystem((int) (byte) 100);
        register0.runRegistrationSystem(10);
        register0.registerUser("", "hi!");
        register0.loginUser("", "");
    }

    @Test
    public void test0914() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest1.test0914");
        Register register0 = new Register();
        register0.loginUser("hi!", "hi!");
        register0.registerUser("hi!", "");
        register0.registerUser("", "");
        register0.registerUser("", "hi!");
        register0.registerUser("", "");
        register0.loginUser("", "hi!");
        register0.registerUser("", "");
        register0.loginUser("", "hi!");
        register0.loginUser("", "");
    }

    @Test
    public void test0915() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest1.test0915");
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
        java.lang.Class<?> wildcardClass23 = register0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test0916() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest1.test0916");
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
        register0.registerUser("", "hi!");
    }

    @Test
    public void test0917() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest1.test0917");
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
        register0.loginUser("hi!", "hi!");
        java.lang.Class<?> wildcardClass28 = register0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test0918() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest1.test0918");
        Register register0 = new Register();
        register0.registerUser("hi!", "");
        register0.loginUser("", "hi!");
        register0.runRegistrationSystem((int) (byte) -1);
        register0.loginUser("", "");
        register0.runRegistrationSystem((int) (short) 100);
        register0.registerUser("", "hi!");
        java.lang.Class<?> wildcardClass17 = register0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test0919() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest1.test0919");
        Register register0 = new Register();
        register0.runRegistrationSystem((int) '#');
        register0.registerUser("", "hi!");
        register0.registerUser("", "hi!");
        register0.registerUser("", "");
        register0.runRegistrationSystem((int) (byte) 10);
        register0.runRegistrationSystem((int) (short) 100);
        register0.runRegistrationSystem((int) (short) 0);
        java.lang.Class<?> wildcardClass18 = register0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test0920() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest1.test0920");
        Register register0 = new Register();
        register0.registerUser("hi!", "");
        register0.registerUser("hi!", "");
        register0.loginUser("hi!", "");
        register0.loginUser("hi!", "");
        register0.runRegistrationSystem(10);
        register0.registerUser("", "");
        register0.registerUser("hi!", "hi!");
        register0.loginUser("hi!", "hi!");
        register0.loginUser("hi!", "hi!");
        java.lang.Class<?> wildcardClass27 = register0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test0921() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest1.test0921");
        Register register0 = new Register();
        register0.registerUser("hi!", "");
        register0.loginUser("", "hi!");
        register0.runRegistrationSystem((int) 'a');
        register0.registerUser("", "");
        register0.loginUser("", "hi!");
    }

    @Test
    public void test0922() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest1.test0922");
        Register register0 = new Register();
        register0.registerUser("hi!", "");
        register0.loginUser("", "hi!");
        register0.runRegistrationSystem((int) 'a');
        register0.loginUser("", "hi!");
        register0.loginUser("hi!", "");
        register0.registerUser("hi!", "hi!");
        register0.loginUser("hi!", "");
        java.lang.Class<?> wildcardClass21 = register0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test0923() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest1.test0923");
        Register register0 = new Register();
        register0.loginUser("hi!", "hi!");
        register0.runRegistrationSystem(0);
        register0.registerUser("", "");
        register0.runRegistrationSystem((-1));
        register0.loginUser("hi!", "");
        java.lang.Class<?> wildcardClass14 = register0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0924() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest1.test0924");
        Register register0 = new Register();
        register0.loginUser("hi!", "hi!");
        register0.loginUser("hi!", "hi!");
        register0.registerUser("", "");
        register0.runRegistrationSystem((int) (short) 10);
        register0.runRegistrationSystem((int) (byte) 10);
    }

    @Test
    public void test0925() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest1.test0925");
        Register register0 = new Register();
        register0.registerUser("hi!", "");
        register0.registerUser("hi!", "");
        register0.loginUser("hi!", "");
        register0.loginUser("", "hi!");
        register0.loginUser("", "");
        register0.registerUser("", "");
        register0.runRegistrationSystem((int) (byte) 10);
        register0.runRegistrationSystem((int) (short) -1);
        register0.runRegistrationSystem((int) (byte) 0);
    }

    @Test
    public void test0926() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest1.test0926");
        Register register0 = new Register();
        register0.registerUser("", "hi!");
        register0.loginUser("hi!", "hi!");
        register0.runRegistrationSystem(1);
        register0.loginUser("", "");
    }

    @Test
    public void test0927() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest1.test0927");
        Register register0 = new Register();
        register0.runRegistrationSystem((int) (byte) -1);
        register0.registerUser("hi!", "");
        register0.runRegistrationSystem((int) (short) 1);
        register0.loginUser("", "");
        register0.loginUser("", "hi!");
        register0.loginUser("hi!", "hi!");
        register0.registerUser("", "hi!");
        register0.loginUser("", "hi!");
        java.lang.Class<?> wildcardClass23 = register0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test0928() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest1.test0928");
        Register register0 = new Register();
        register0.runRegistrationSystem((int) '#');
        register0.registerUser("", "hi!");
        register0.registerUser("hi!", "");
        register0.runRegistrationSystem((int) (byte) 100);
        register0.loginUser("hi!", "hi!");
        java.lang.Class<?> wildcardClass14 = register0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0929() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest1.test0929");
        Register register0 = new Register();
        register0.runRegistrationSystem((int) (byte) -1);
        register0.registerUser("hi!", "");
        register0.loginUser("hi!", "hi!");
        register0.loginUser("hi!", "");
        register0.loginUser("", "");
        register0.runRegistrationSystem(1);
        register0.registerUser("hi!", "hi!");
        register0.loginUser("", "");
        register0.registerUser("", "");
    }

    @Test
    public void test0930() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest1.test0930");
        Register register0 = new Register();
        register0.runRegistrationSystem((int) (byte) -1);
        register0.registerUser("hi!", "");
        register0.runRegistrationSystem((int) (short) 1);
        register0.loginUser("", "hi!");
        register0.runRegistrationSystem((int) '4');
        register0.loginUser("hi!", "");
        register0.runRegistrationSystem(10);
        java.lang.Class<?> wildcardClass18 = register0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test0931() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest1.test0931");
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
        java.lang.Class<?> wildcardClass25 = register0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test0932() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest1.test0932");
        Register register0 = new Register();
        register0.runRegistrationSystem((int) (short) 0);
        register0.loginUser("hi!", "hi!");
        register0.registerUser("", "");
        register0.runRegistrationSystem((int) '#');
        register0.loginUser("", "hi!");
        register0.loginUser("", "hi!");
        java.lang.Class<?> wildcardClass17 = register0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test0933() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest1.test0933");
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
        register0.registerUser("hi!", "hi!");
    }

    @Test
    public void test0934() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest1.test0934");
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
        register0.runRegistrationSystem((int) (byte) -1);
    }

    @Test
    public void test0935() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest1.test0935");
        Register register0 = new Register();
        register0.registerUser("hi!", "");
        register0.loginUser("hi!", "hi!");
        register0.registerUser("hi!", "");
    }

    @Test
    public void test0936() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest1.test0936");
        Register register0 = new Register();
        register0.loginUser("hi!", "hi!");
        register0.registerUser("hi!", "");
        register0.registerUser("", "");
        register0.registerUser("", "hi!");
        register0.runRegistrationSystem((int) (short) 100);
        register0.runRegistrationSystem((int) (byte) 10);
        register0.runRegistrationSystem(0);
        register0.registerUser("", "hi!");
        java.lang.Class<?> wildcardClass22 = register0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test0937() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest1.test0937");
        Register register0 = new Register();
        register0.loginUser("hi!", "hi!");
        register0.registerUser("hi!", "");
        register0.registerUser("hi!", "");
        register0.registerUser("", "hi!");
        java.lang.Class<?> wildcardClass13 = register0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0938() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest1.test0938");
        Register register0 = new Register();
        register0.runRegistrationSystem((int) (byte) -1);
        register0.runRegistrationSystem((int) '#');
        register0.loginUser("", "");
        register0.runRegistrationSystem((int) (short) 0);
        register0.loginUser("hi!", "");
        register0.loginUser("hi!", "hi!");
    }

    @Test
    public void test0939() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest1.test0939");
        Register register0 = new Register();
        register0.registerUser("hi!", "");
        register0.runRegistrationSystem(1);
        register0.registerUser("", "hi!");
        register0.runRegistrationSystem(100);
        register0.runRegistrationSystem((int) 'a');
        register0.loginUser("hi!", "hi!");
        register0.runRegistrationSystem((-1));
        register0.registerUser("", "hi!");
    }

    @Test
    public void test0940() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest1.test0940");
        Register register0 = new Register();
        register0.registerUser("hi!", "");
        register0.loginUser("", "hi!");
        register0.runRegistrationSystem((int) 'a');
        register0.loginUser("", "hi!");
        register0.loginUser("", "hi!");
        register0.registerUser("", "");
        register0.runRegistrationSystem((int) '4');
        register0.runRegistrationSystem((int) (short) 0);
        register0.registerUser("hi!", "");
        java.lang.Class<?> wildcardClass25 = register0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test0941() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest1.test0941");
        Register register0 = new Register();
        register0.registerUser("hi!", "");
        register0.loginUser("", "hi!");
        register0.runRegistrationSystem((int) 'a');
        register0.loginUser("", "hi!");
        register0.loginUser("", "hi!");
        register0.runRegistrationSystem((int) ' ');
        register0.registerUser("", "hi!");
        register0.runRegistrationSystem((int) '#');
    }

    @Test
    public void test0942() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest1.test0942");
        Register register0 = new Register();
        register0.runRegistrationSystem((int) (short) 0);
        register0.loginUser("hi!", "hi!");
        register0.registerUser("", "");
        register0.runRegistrationSystem((-1));
        register0.runRegistrationSystem((int) (short) 0);
        register0.runRegistrationSystem((int) ' ');
        java.lang.Class<?> wildcardClass15 = register0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0943() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest1.test0943");
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
        register0.loginUser("", "");
    }

    @Test
    public void test0944() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest1.test0944");
        Register register0 = new Register();
        register0.registerUser("hi!", "");
        register0.loginUser("", "hi!");
        register0.runRegistrationSystem((int) 'a');
        register0.loginUser("", "hi!");
        register0.loginUser("hi!", "");
        register0.registerUser("hi!", "hi!");
        register0.registerUser("", "hi!");
        register0.runRegistrationSystem((int) (byte) 10);
        register0.registerUser("", "hi!");
        register0.registerUser("hi!", "hi!");
        java.lang.Class<?> wildcardClass29 = register0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass29);
    }

    @Test
    public void test0945() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest1.test0945");
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
        register0.registerUser("hi!", "");
    }

    @Test
    public void test0946() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest1.test0946");
        Register register0 = new Register();
        register0.runRegistrationSystem((int) (short) 0);
        register0.loginUser("hi!", "hi!");
        register0.registerUser("", "");
        register0.runRegistrationSystem((-1));
        register0.loginUser("hi!", "");
        register0.registerUser("", "hi!");
        java.lang.Class<?> wildcardClass17 = register0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test0947() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest1.test0947");
        Register register0 = new Register();
        register0.loginUser("hi!", "hi!");
        register0.runRegistrationSystem(0);
        register0.registerUser("", "");
        register0.runRegistrationSystem((-1));
        register0.loginUser("", "");
        register0.loginUser("", "");
    }

    @Test
    public void test0948() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest1.test0948");
        Register register0 = new Register();
        register0.runRegistrationSystem((int) (byte) -1);
        register0.registerUser("hi!", "");
        register0.runRegistrationSystem((int) (short) 1);
        register0.runRegistrationSystem(10);
        register0.registerUser("", "hi!");
        register0.registerUser("", "hi!");
    }

    @Test
    public void test0949() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest1.test0949");
        Register register0 = new Register();
        register0.runRegistrationSystem((int) (byte) -1);
        register0.registerUser("hi!", "");
        register0.runRegistrationSystem((int) (short) 1);
        register0.runRegistrationSystem(10);
        register0.registerUser("", "hi!");
        register0.registerUser("hi!", "");
    }

    @Test
    public void test0950() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest1.test0950");
        Register register0 = new Register();
        register0.runRegistrationSystem((int) (byte) -1);
        register0.registerUser("hi!", "");
        register0.runRegistrationSystem((int) (short) 1);
        register0.loginUser("", "");
        register0.loginUser("", "hi!");
        register0.runRegistrationSystem((int) (short) 1);
        java.lang.Class<?> wildcardClass16 = register0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0951() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest1.test0951");
        Register register0 = new Register();
        register0.loginUser("hi!", "hi!");
        register0.registerUser("hi!", "");
        register0.registerUser("hi!", "");
        register0.registerUser("", "hi!");
        register0.loginUser("", "");
        register0.runRegistrationSystem((int) (byte) 100);
        register0.runRegistrationSystem((int) (short) 0);
        register0.registerUser("", "hi!");
        java.lang.Class<?> wildcardClass23 = register0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test0952() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest1.test0952");
        Register register0 = new Register();
        register0.registerUser("", "hi!");
        register0.registerUser("", "hi!");
        register0.registerUser("hi!", "");
        register0.runRegistrationSystem((int) '#');
        register0.loginUser("", "");
        register0.runRegistrationSystem((int) 'a');
    }

    @Test
    public void test0953() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest1.test0953");
        Register register0 = new Register();
        register0.runRegistrationSystem((int) (short) 0);
        register0.loginUser("hi!", "hi!");
        register0.registerUser("", "");
        register0.runRegistrationSystem((int) '#');
        register0.loginUser("", "hi!");
        register0.loginUser("", "");
        register0.loginUser("", "hi!");
        register0.registerUser("", "hi!");
    }

    @Test
    public void test0954() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest1.test0954");
        Register register0 = new Register();
        register0.registerUser("hi!", "");
        register0.loginUser("", "hi!");
        register0.runRegistrationSystem((int) 'a');
        register0.loginUser("hi!", "");
        register0.runRegistrationSystem((-1));
        register0.registerUser("hi!", "");
        register0.loginUser("", "");
        register0.runRegistrationSystem((int) (short) 100);
        register0.runRegistrationSystem((int) (short) 0);
        register0.registerUser("", "");
    }

    @Test
    public void test0955() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest1.test0955");
        Register register0 = new Register();
        register0.runRegistrationSystem((int) (byte) -1);
        register0.registerUser("hi!", "");
        register0.runRegistrationSystem((int) (byte) -1);
        register0.loginUser("", "hi!");
        register0.loginUser("", "hi!");
        register0.registerUser("", "hi!");
    }

    @Test
    public void test0956() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest1.test0956");
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
        register0.registerUser("hi!", "");
    }

    @Test
    public void test0957() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest1.test0957");
        Register register0 = new Register();
        register0.loginUser("hi!", "hi!");
        register0.registerUser("hi!", "");
        register0.registerUser("", "");
        register0.runRegistrationSystem((int) (byte) 100);
        register0.registerUser("hi!", "");
        register0.runRegistrationSystem(1);
        register0.runRegistrationSystem(0);
        register0.runRegistrationSystem((int) '4');
        java.lang.Class<?> wildcardClass21 = register0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test0958() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest1.test0958");
        Register register0 = new Register();
        register0.runRegistrationSystem((int) '#');
        register0.loginUser("hi!", "hi!");
        register0.loginUser("hi!", "hi!");
        register0.loginUser("hi!", "");
        register0.loginUser("", "");
        register0.runRegistrationSystem((int) 'a');
        register0.runRegistrationSystem((int) (short) 0);
        register0.registerUser("hi!", "hi!");
    }

    @Test
    public void test0959() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest1.test0959");
        Register register0 = new Register();
        register0.runRegistrationSystem((int) '#');
        register0.registerUser("", "hi!");
        register0.runRegistrationSystem((int) (short) 0);
        register0.runRegistrationSystem((int) (byte) 1);
        register0.runRegistrationSystem((int) 'a');
        register0.runRegistrationSystem(0);
        register0.loginUser("hi!", "hi!");
        java.lang.Class<?> wildcardClass17 = register0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test0960() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest1.test0960");
        Register register0 = new Register();
        register0.loginUser("hi!", "hi!");
        register0.registerUser("hi!", "");
        register0.registerUser("", "");
        register0.registerUser("", "hi!");
        register0.loginUser("hi!", "hi!");
        register0.runRegistrationSystem(0);
        register0.loginUser("hi!", "");
        register0.registerUser("", "hi!");
        register0.registerUser("", "hi!");
    }

    @Test
    public void test0961() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest1.test0961");
        Register register0 = new Register();
        register0.runRegistrationSystem((int) (short) 0);
        register0.loginUser("hi!", "hi!");
        register0.registerUser("", "");
        register0.runRegistrationSystem((int) '#');
        register0.runRegistrationSystem((int) '#');
        register0.loginUser("hi!", "");
        java.lang.Class<?> wildcardClass16 = register0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0962() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest1.test0962");
        Register register0 = new Register();
        register0.runRegistrationSystem((int) (byte) -1);
        register0.registerUser("hi!", "");
        register0.runRegistrationSystem((int) (short) 1);
        register0.loginUser("", "");
        register0.loginUser("", "hi!");
        register0.runRegistrationSystem((int) (short) 1);
        register0.registerUser("", "");
        java.lang.Class<?> wildcardClass19 = register0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test0963() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest1.test0963");
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
        register0.registerUser("hi!", "");
    }

    @Test
    public void test0964() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest1.test0964");
        Register register0 = new Register();
        register0.runRegistrationSystem((int) (byte) -1);
        register0.runRegistrationSystem((int) (byte) 10);
        register0.registerUser("", "");
        register0.loginUser("", "");
        register0.registerUser("", "hi!");
        register0.registerUser("", "hi!");
        register0.loginUser("", "");
        register0.loginUser("", "hi!");
        java.lang.Class<?> wildcardClass23 = register0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test0965() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest1.test0965");
        Register register0 = new Register();
        register0.runRegistrationSystem((int) '#');
        register0.runRegistrationSystem((int) (short) 100);
        register0.runRegistrationSystem(100);
        register0.registerUser("hi!", "");
        register0.registerUser("", "hi!");
    }

    @Test
    public void test0966() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest1.test0966");
        Register register0 = new Register();
        register0.loginUser("hi!", "hi!");
        register0.registerUser("hi!", "");
        register0.registerUser("", "");
        register0.registerUser("", "hi!");
        register0.runRegistrationSystem((int) (short) 100);
        register0.loginUser("hi!", "");
    }

    @Test
    public void test0967() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest1.test0967");
        Register register0 = new Register();
        register0.loginUser("hi!", "hi!");
        register0.loginUser("", "hi!");
        register0.runRegistrationSystem((int) (byte) 0);
        register0.registerUser("", "");
        register0.registerUser("", "hi!");
        java.lang.Class<?> wildcardClass15 = register0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0968() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest1.test0968");
        Register register0 = new Register();
        register0.registerUser("hi!", "");
        register0.loginUser("", "hi!");
        register0.runRegistrationSystem((int) (byte) -1);
        register0.loginUser("", "");
        register0.runRegistrationSystem((-1));
        register0.loginUser("", "");
        register0.loginUser("", "");
        java.lang.Class<?> wildcardClass20 = register0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test0969() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest1.test0969");
        Register register0 = new Register();
        register0.registerUser("hi!", "");
        register0.runRegistrationSystem(1);
        register0.registerUser("", "");
        register0.runRegistrationSystem((int) (short) -1);
        register0.loginUser("", "");
        register0.loginUser("hi!", "");
        register0.registerUser("hi!", "hi!");
        register0.loginUser("hi!", "");
    }

    @Test
    public void test0970() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest1.test0970");
        Register register0 = new Register();
        register0.runRegistrationSystem((int) '#');
        register0.registerUser("", "hi!");
        register0.loginUser("hi!", "hi!");
        register0.runRegistrationSystem(100);
        register0.runRegistrationSystem((int) (short) 10);
        register0.registerUser("hi!", "");
    }

    @Test
    public void test0971() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest1.test0971");
        Register register0 = new Register();
        register0.registerUser("", "hi!");
        register0.registerUser("", "hi!");
        register0.registerUser("hi!", "");
        register0.registerUser("", "");
    }

    @Test
    public void test0972() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest1.test0972");
        Register register0 = new Register();
        register0.registerUser("hi!", "");
        register0.loginUser("", "hi!");
        register0.runRegistrationSystem((int) 'a');
        register0.loginUser("", "hi!");
        register0.loginUser("", "hi!");
        register0.loginUser("", "hi!");
        register0.registerUser("", "hi!");
        register0.loginUser("hi!", "");
        java.lang.Class<?> wildcardClass24 = register0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test0973() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest1.test0973");
        Register register0 = new Register();
        register0.loginUser("hi!", "hi!");
        register0.registerUser("hi!", "");
        register0.registerUser("hi!", "");
        register0.registerUser("", "");
        register0.loginUser("", "hi!");
        register0.registerUser("", "hi!");
        java.lang.Class<?> wildcardClass19 = register0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test0974() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest1.test0974");
        Register register0 = new Register();
        register0.registerUser("hi!", "");
        register0.registerUser("", "");
        register0.loginUser("", "hi!");
    }

    @Test
    public void test0975() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest1.test0975");
        Register register0 = new Register();
        register0.registerUser("", "hi!");
        register0.registerUser("", "hi!");
        register0.registerUser("hi!", "");
        register0.runRegistrationSystem((int) (byte) 10);
    }

    @Test
    public void test0976() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest1.test0976");
        Register register0 = new Register();
        register0.loginUser("hi!", "hi!");
        register0.registerUser("hi!", "");
        register0.registerUser("", "");
        register0.registerUser("", "");
        register0.loginUser("hi!", "hi!");
        register0.registerUser("", "hi!");
    }

    @Test
    public void test0977() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest1.test0977");
        Register register0 = new Register();
        register0.loginUser("hi!", "hi!");
        register0.registerUser("hi!", "");
        register0.registerUser("", "");
        register0.registerUser("", "");
        register0.runRegistrationSystem((int) (byte) 100);
        register0.runRegistrationSystem((int) (short) -1);
        register0.runRegistrationSystem((int) (short) 100);
        register0.loginUser("hi!", "hi!");
        java.lang.Class<?> wildcardClass22 = register0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test0978() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest1.test0978");
        Register register0 = new Register();
        register0.loginUser("hi!", "hi!");
        register0.registerUser("hi!", "");
        register0.registerUser("", "");
        register0.registerUser("", "");
        register0.runRegistrationSystem((int) (short) 0);
        register0.registerUser("hi!", "");
        register0.loginUser("", "hi!");
        register0.runRegistrationSystem((int) (byte) -1);
        register0.runRegistrationSystem((int) 'a');
        java.lang.Class<?> wildcardClass25 = register0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test0979() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest1.test0979");
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
        java.lang.Class<?> wildcardClass24 = register0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test0980() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest1.test0980");
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
        java.lang.Class<?> wildcardClass30 = register0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass30);
    }

    @Test
    public void test0981() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest1.test0981");
        Register register0 = new Register();
        register0.runRegistrationSystem((int) '#');
        register0.registerUser("", "hi!");
        register0.runRegistrationSystem((int) (short) 0);
        register0.runRegistrationSystem((int) (byte) 1);
        register0.runRegistrationSystem((int) 'a');
        register0.registerUser("hi!", "hi!");
        register0.runRegistrationSystem((int) '4');
        register0.runRegistrationSystem((int) (short) -1);
        register0.loginUser("hi!", "hi!");
    }

    @Test
    public void test0982() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest1.test0982");
        Register register0 = new Register();
        register0.runRegistrationSystem((int) (byte) -1);
        register0.registerUser("hi!", "");
        register0.loginUser("hi!", "hi!");
        register0.loginUser("hi!", "");
        register0.loginUser("", "");
        register0.runRegistrationSystem(1);
        register0.runRegistrationSystem(10);
        register0.loginUser("", "hi!");
        register0.loginUser("", "");
    }

    @Test
    public void test0983() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest1.test0983");
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
        register0.registerUser("", "hi!");
    }

    @Test
    public void test0984() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest1.test0984");
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
        java.lang.Class<?> wildcardClass26 = register0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass26);
    }

    @Test
    public void test0985() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest1.test0985");
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
        register0.registerUser("", "hi!");
    }

    @Test
    public void test0986() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest1.test0986");
        Register register0 = new Register();
        register0.registerUser("hi!", "");
        register0.loginUser("", "hi!");
        register0.runRegistrationSystem((int) 'a');
        register0.loginUser("", "hi!");
        register0.loginUser("hi!", "");
        register0.loginUser("hi!", "hi!");
        register0.loginUser("hi!", "");
        register0.runRegistrationSystem((int) (short) -1);
    }

    @Test
    public void test0987() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest1.test0987");
        Register register0 = new Register();
        register0.runRegistrationSystem((int) '#');
        register0.loginUser("hi!", "hi!");
        register0.loginUser("hi!", "hi!");
        register0.loginUser("hi!", "");
        register0.registerUser("", "hi!");
        register0.loginUser("", "hi!");
        register0.registerUser("hi!", "");
    }

    @Test
    public void test0988() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest1.test0988");
        Register register0 = new Register();
        register0.registerUser("", "hi!");
        register0.registerUser("", "hi!");
        register0.registerUser("hi!", "");
        register0.runRegistrationSystem((int) '#');
        java.lang.Class<?> wildcardClass12 = register0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0989() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest1.test0989");
        Register register0 = new Register();
        register0.registerUser("hi!", "");
        register0.runRegistrationSystem(1);
        register0.registerUser("", "");
        register0.registerUser("hi!", "");
        register0.registerUser("hi!", "");
        register0.loginUser("hi!", "");
    }

    @Test
    public void test0990() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest1.test0990");
        Register register0 = new Register();
        register0.loginUser("", "hi!");
        register0.loginUser("", "hi!");
        register0.loginUser("hi!", "hi!");
        register0.registerUser("", "");
        register0.runRegistrationSystem((int) (short) 100);
        register0.loginUser("hi!", "");
        register0.registerUser("", "hi!");
        java.lang.Class<?> wildcardClass21 = register0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test0991() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest1.test0991");
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
        java.lang.Class<?> wildcardClass28 = register0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test0992() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest1.test0992");
        Register register0 = new Register();
        register0.loginUser("", "hi!");
        register0.loginUser("", "hi!");
        register0.loginUser("hi!", "hi!");
        register0.runRegistrationSystem((int) '4');
        register0.loginUser("", "");
        register0.registerUser("", "hi!");
        java.lang.Class<?> wildcardClass18 = register0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test0993() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest1.test0993");
        Register register0 = new Register();
        register0.loginUser("hi!", "hi!");
        register0.registerUser("hi!", "hi!");
        register0.loginUser("hi!", "hi!");
        register0.runRegistrationSystem(100);
        register0.loginUser("", "");
    }

    @Test
    public void test0994() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest1.test0994");
        Register register0 = new Register();
        register0.loginUser("hi!", "hi!");
        register0.registerUser("hi!", "");
        register0.registerUser("", "");
        register0.registerUser("", "hi!");
        register0.loginUser("hi!", "");
        register0.runRegistrationSystem((int) 'a');
        register0.runRegistrationSystem(0);
    }

    @Test
    public void test0995() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest1.test0995");
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
        register0.loginUser("hi!", "");
    }

    @Test
    public void test0996() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest1.test0996");
        Register register0 = new Register();
        register0.registerUser("hi!", "");
        register0.runRegistrationSystem(1);
        register0.registerUser("", "");
        register0.loginUser("hi!", "hi!");
        register0.runRegistrationSystem((int) (byte) 10);
        register0.runRegistrationSystem(1);
    }

    @Test
    public void test0997() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest1.test0997");
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
        register0.registerUser("hi!", "hi!");
        register0.runRegistrationSystem(100);
    }

    @Test
    public void test0998() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest1.test0998");
        Register register0 = new Register();
        register0.runRegistrationSystem((int) (short) 0);
        register0.loginUser("hi!", "hi!");
        register0.registerUser("", "");
        register0.runRegistrationSystem((int) '#');
        register0.runRegistrationSystem((int) (byte) 0);
        register0.registerUser("", "");
        register0.runRegistrationSystem((int) (byte) 10);
        register0.loginUser("hi!", "");
        java.lang.Class<?> wildcardClass21 = register0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test0999() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest1.test0999");
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
        java.lang.Class<?> wildcardClass29 = register0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass29);
    }

    @Test
    public void test1000() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest1.test1000");
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
        register0.runRegistrationSystem((int) (short) 1);
    }
}

