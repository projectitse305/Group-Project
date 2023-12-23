import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegisterTest3 {

    public static boolean debug = false;

    @Test
    public void test1501() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest3.test1501");
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
        register0.loginUser("", "");
        java.lang.Class<?> wildcardClass32 = register0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass32);
    }

    @Test
    public void test1502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest3.test1502");
        Register register0 = new Register();
        register0.runRegistrationSystem((int) (byte) -1);
        register0.runRegistrationSystem((int) (byte) 10);
        register0.registerUser("", "");
        register0.loginUser("", "");
        register0.registerUser("", "hi!");
        register0.registerUser("", "hi!");
        register0.loginUser("hi!", "");
        register0.registerUser("hi!", "");
        register0.registerUser("", "hi!");
        register0.runRegistrationSystem(100);
    }

    @Test
    public void test1503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest3.test1503");
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
        register0.loginUser("hi!", "hi!");
    }

    @Test
    public void test1504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest3.test1504");
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
        register0.loginUser("hi!", "hi!");
        register0.registerUser("hi!", "hi!");
    }

    @Test
    public void test1505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest3.test1505");
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
        java.lang.Class<?> wildcardClass28 = register0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test1506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest3.test1506");
        Register register0 = new Register();
        register0.registerUser("hi!", "");
        register0.registerUser("hi!", "");
        register0.loginUser("hi!", "");
        register0.loginUser("hi!", "");
        register0.loginUser("", "");
    }

    @Test
    public void test1507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest3.test1507");
        Register register0 = new Register();
        register0.runRegistrationSystem((int) (byte) -1);
        register0.registerUser("hi!", "");
        register0.runRegistrationSystem((int) (short) 1);
        register0.runRegistrationSystem((int) 'a');
        register0.registerUser("", "");
        register0.runRegistrationSystem((int) (byte) 100);
        register0.registerUser("hi!", "");
        register0.runRegistrationSystem((int) (byte) 1);
        register0.runRegistrationSystem((int) (byte) 10);
    }

    @Test
    public void test1508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest3.test1508");
        Register register0 = new Register();
        register0.loginUser("hi!", "hi!");
        register0.registerUser("hi!", "");
        register0.loginUser("hi!", "hi!");
        register0.runRegistrationSystem(100);
        register0.registerUser("hi!", "");
        register0.runRegistrationSystem((int) (short) -1);
        register0.runRegistrationSystem((int) (byte) 100);
        register0.registerUser("hi!", "");
        register0.loginUser("hi!", "");
    }

    @Test
    public void test1509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest3.test1509");
        Register register0 = new Register();
        register0.loginUser("hi!", "hi!");
        register0.registerUser("hi!", "");
        register0.registerUser("", "");
        register0.registerUser("", "hi!");
        register0.runRegistrationSystem((int) (short) 100);
        register0.runRegistrationSystem((int) (byte) 10);
        register0.runRegistrationSystem(0);
        register0.loginUser("hi!", "hi!");
        register0.runRegistrationSystem(0);
    }

    @Test
    public void test1510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest3.test1510");
        Register register0 = new Register();
        register0.runRegistrationSystem((int) '#');
        register0.runRegistrationSystem((int) (short) 100);
        register0.runRegistrationSystem(100);
        register0.runRegistrationSystem((int) (short) 100);
        register0.registerUser("hi!", "hi!");
    }

    @Test
    public void test1511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest3.test1511");
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
        java.lang.Class<?> wildcardClass26 = register0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass26);
    }

    @Test
    public void test1512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest3.test1512");
        Register register0 = new Register();
        register0.registerUser("hi!", "");
        register0.loginUser("", "hi!");
        register0.runRegistrationSystem((int) (byte) -1);
        register0.runRegistrationSystem(1);
        register0.loginUser("hi!", "");
        register0.runRegistrationSystem((int) (short) -1);
        register0.registerUser("", "");
        register0.loginUser("hi!", "");
        register0.runRegistrationSystem((int) '4');
        java.lang.Class<?> wildcardClass24 = register0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test1513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest3.test1513");
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
        java.lang.Class<?> wildcardClass25 = register0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test1514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest3.test1514");
        Register register0 = new Register();
        register0.runRegistrationSystem((int) '#');
        register0.loginUser("hi!", "hi!");
        register0.loginUser("hi!", "hi!");
        register0.loginUser("hi!", "");
        register0.loginUser("", "");
        register0.runRegistrationSystem((int) 'a');
        register0.runRegistrationSystem((int) (short) 0);
        register0.registerUser("", "");
    }

    @Test
    public void test1515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest3.test1515");
        Register register0 = new Register();
        register0.loginUser("hi!", "hi!");
        register0.registerUser("hi!", "hi!");
        register0.loginUser("hi!", "hi!");
        register0.runRegistrationSystem(0);
        register0.loginUser("", "");
        register0.registerUser("hi!", "");
        register0.runRegistrationSystem((int) (short) 100);
    }

    @Test
    public void test1516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest3.test1516");
        Register register0 = new Register();
        register0.runRegistrationSystem((int) (short) 0);
        register0.loginUser("hi!", "hi!");
        register0.registerUser("", "");
        register0.runRegistrationSystem((-1));
        register0.registerUser("", "");
        register0.loginUser("hi!", "hi!");
        register0.registerUser("", "");
        register0.registerUser("", "hi!");
    }

    @Test
    public void test1517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest3.test1517");
        Register register0 = new Register();
        register0.runRegistrationSystem((int) (byte) -1);
        register0.runRegistrationSystem((int) (short) 10);
        register0.loginUser("hi!", "");
        register0.runRegistrationSystem((int) (byte) 10);
        register0.registerUser("", "");
    }

    @Test
    public void test1518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest3.test1518");
        Register register0 = new Register();
        register0.runRegistrationSystem((int) (short) 0);
        register0.loginUser("hi!", "hi!");
        register0.registerUser("", "");
        register0.loginUser("", "hi!");
        register0.registerUser("hi!", "");
        register0.runRegistrationSystem((int) '#');
        register0.loginUser("", "");
        java.lang.Class<?> wildcardClass20 = register0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test1519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest3.test1519");
        Register register0 = new Register();
        register0.loginUser("hi!", "hi!");
        register0.registerUser("hi!", "");
        register0.registerUser("", "");
        register0.registerUser("hi!", "");
        register0.registerUser("hi!", "");
        register0.registerUser("", "");
        register0.runRegistrationSystem(100);
        register0.loginUser("", "");
        java.lang.Class<?> wildcardClass24 = register0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test1520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest3.test1520");
        Register register0 = new Register();
        register0.runRegistrationSystem((int) '#');
        register0.loginUser("hi!", "hi!");
        register0.runRegistrationSystem((int) (byte) 10);
        register0.registerUser("hi!", "");
        register0.registerUser("hi!", "hi!");
        register0.runRegistrationSystem((int) 'a');
    }

    @Test
    public void test1521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest3.test1521");
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
        register0.runRegistrationSystem((int) ' ');
    }

    @Test
    public void test1522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest3.test1522");
        Register register0 = new Register();
        register0.runRegistrationSystem((int) '#');
        register0.registerUser("", "hi!");
        register0.registerUser("", "hi!");
        register0.registerUser("", "");
        register0.loginUser("hi!", "hi!");
        register0.loginUser("", "");
        java.lang.Class<?> wildcardClass18 = register0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test1523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest3.test1523");
        Register register0 = new Register();
        register0.loginUser("hi!", "hi!");
        register0.runRegistrationSystem(0);
        register0.loginUser("", "hi!");
        register0.registerUser("", "hi!");
        register0.runRegistrationSystem(10);
        register0.loginUser("hi!", "hi!");
        register0.registerUser("hi!", "hi!");
        java.lang.Class<?> wildcardClass20 = register0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test1524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest3.test1524");
        Register register0 = new Register();
        register0.runRegistrationSystem((int) (byte) -1);
        register0.registerUser("hi!", "");
        register0.loginUser("hi!", "hi!");
        register0.loginUser("hi!", "");
        register0.runRegistrationSystem((int) (byte) -1);
        register0.loginUser("hi!", "");
        java.lang.Class<?> wildcardClass17 = register0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test1525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest3.test1525");
        Register register0 = new Register();
        register0.loginUser("hi!", "hi!");
        register0.registerUser("hi!", "");
        register0.registerUser("", "");
        register0.registerUser("hi!", "");
        register0.registerUser("hi!", "");
        register0.registerUser("", "");
        register0.loginUser("", "");
        register0.registerUser("", "");
        java.lang.Class<?> wildcardClass25 = register0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test1526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest3.test1526");
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
        register0.runRegistrationSystem((int) '4');
    }

    @Test
    public void test1527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest3.test1527");
        Register register0 = new Register();
        register0.runRegistrationSystem((int) (short) 0);
        register0.loginUser("hi!", "hi!");
        register0.registerUser("", "");
        register0.runRegistrationSystem((int) '#');
        register0.runRegistrationSystem((int) (byte) 0);
        register0.runRegistrationSystem(0);
        register0.registerUser("", "");
        register0.registerUser("", "");
        register0.registerUser("", "");
        register0.runRegistrationSystem((int) ' ');
    }

    @Test
    public void test1528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest3.test1528");
        Register register0 = new Register();
        register0.registerUser("hi!", "");
        register0.loginUser("", "hi!");
        register0.runRegistrationSystem((int) 'a');
        register0.loginUser("hi!", "");
        register0.runRegistrationSystem((int) (byte) 1);
        register0.loginUser("hi!", "hi!");
        register0.loginUser("", "");
        java.lang.Class<?> wildcardClass20 = register0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test1529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest3.test1529");
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
        java.lang.Class<?> wildcardClass23 = register0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test1530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest3.test1530");
        Register register0 = new Register();
        register0.runRegistrationSystem((int) (short) 0);
        register0.loginUser("hi!", "hi!");
        register0.registerUser("", "");
        register0.runRegistrationSystem((-1));
        register0.runRegistrationSystem((int) (byte) 0);
        register0.registerUser("", "hi!");
        register0.loginUser("hi!", "hi!");
    }

    @Test
    public void test1531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest3.test1531");
        Register register0 = new Register();
        register0.loginUser("hi!", "hi!");
        register0.registerUser("hi!", "");
        register0.registerUser("hi!", "");
        register0.registerUser("", "hi!");
        register0.loginUser("", "");
        register0.runRegistrationSystem((int) (short) -1);
        register0.registerUser("hi!", "");
        register0.loginUser("", "");
        register0.runRegistrationSystem((int) (short) 1);
    }

    @Test
    public void test1532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest3.test1532");
        Register register0 = new Register();
        register0.runRegistrationSystem((int) (byte) -1);
        register0.registerUser("hi!", "");
        register0.loginUser("hi!", "hi!");
        register0.loginUser("hi!", "hi!");
        register0.runRegistrationSystem((int) (short) 1);
        register0.runRegistrationSystem((int) '4');
    }

    @Test
    public void test1533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest3.test1533");
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
        register0.loginUser("hi!", "");
        register0.loginUser("hi!", "");
    }

    @Test
    public void test1534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest3.test1534");
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
        java.lang.Class<?> wildcardClass27 = register0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test1535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest3.test1535");
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
        register0.registerUser("", "hi!");
    }

    @Test
    public void test1536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest3.test1536");
        Register register0 = new Register();
        register0.runRegistrationSystem((int) '#');
        register0.loginUser("hi!", "hi!");
        register0.registerUser("", "");
        register0.registerUser("hi!", "");
        register0.loginUser("hi!", "");
        java.lang.Class<?> wildcardClass15 = register0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test1537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest3.test1537");
        Register register0 = new Register();
        register0.runRegistrationSystem((int) (byte) -1);
        register0.runRegistrationSystem((int) (short) 10);
        register0.registerUser("", "hi!");
        register0.runRegistrationSystem(0);
        register0.runRegistrationSystem((int) (short) 0);
        register0.loginUser("hi!", "hi!");
        java.lang.Class<?> wildcardClass15 = register0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test1538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest3.test1538");
        Register register0 = new Register();
        register0.registerUser("hi!", "");
        register0.loginUser("", "hi!");
        register0.runRegistrationSystem((int) 'a');
        register0.loginUser("hi!", "");
        register0.runRegistrationSystem((-1));
        register0.runRegistrationSystem((int) (byte) 1);
        register0.registerUser("", "hi!");
    }

    @Test
    public void test1539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest3.test1539");
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
        java.lang.Class<?> wildcardClass32 = register0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass32);
    }

    @Test
    public void test1540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest3.test1540");
        Register register0 = new Register();
        register0.loginUser("hi!", "hi!");
        register0.runRegistrationSystem(0);
        register0.loginUser("", "hi!");
        register0.registerUser("", "hi!");
        register0.runRegistrationSystem(10);
        register0.loginUser("hi!", "hi!");
        register0.registerUser("hi!", "hi!");
        register0.runRegistrationSystem((int) '4');
        java.lang.Class<?> wildcardClass22 = register0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test1541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest3.test1541");
        Register register0 = new Register();
        register0.registerUser("hi!", "");
        register0.registerUser("hi!", "");
        register0.runRegistrationSystem((int) (byte) 0);
        register0.runRegistrationSystem((int) (short) -1);
    }

    @Test
    public void test1542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest3.test1542");
        Register register0 = new Register();
        register0.runRegistrationSystem((int) '#');
        register0.registerUser("", "hi!");
        register0.runRegistrationSystem((int) (short) 0);
        register0.runRegistrationSystem((int) (byte) 1);
        register0.runRegistrationSystem((int) 'a');
        register0.registerUser("hi!", "hi!");
        register0.runRegistrationSystem((int) '4');
        register0.runRegistrationSystem(100);
    }

    @Test
    public void test1543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest3.test1543");
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
        register0.runRegistrationSystem((int) (byte) -1);
    }

    @Test
    public void test1544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest3.test1544");
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
        java.lang.Class<?> wildcardClass34 = register0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass34);
    }

    @Test
    public void test1545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest3.test1545");
        Register register0 = new Register();
        register0.registerUser("", "hi!");
        register0.loginUser("", "hi!");
    }

    @Test
    public void test1546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest3.test1546");
        Register register0 = new Register();
        register0.runRegistrationSystem((int) '#');
        register0.registerUser("", "hi!");
        register0.registerUser("", "hi!");
        register0.registerUser("", "hi!");
        register0.loginUser("hi!", "hi!");
        register0.registerUser("hi!", "");
    }

    @Test
    public void test1547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest3.test1547");
        Register register0 = new Register();
        register0.registerUser("hi!", "");
        register0.loginUser("", "hi!");
        register0.loginUser("", "hi!");
        register0.runRegistrationSystem(10);
        register0.loginUser("", "");
        register0.registerUser("hi!", "hi!");
        register0.runRegistrationSystem((int) '4');
        register0.registerUser("hi!", "");
        java.lang.Class<?> wildcardClass23 = register0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test1548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest3.test1548");
        Register register0 = new Register();
        register0.loginUser("hi!", "hi!");
        register0.runRegistrationSystem(0);
        register0.runRegistrationSystem(10);
        register0.runRegistrationSystem((int) (byte) 100);
        register0.registerUser("", "hi!");
        register0.registerUser("hi!", "hi!");
    }

    @Test
    public void test1549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest3.test1549");
        Register register0 = new Register();
        register0.runRegistrationSystem((int) (byte) -1);
        register0.registerUser("hi!", "");
        register0.runRegistrationSystem((int) (short) 1);
        register0.loginUser("", "");
        register0.loginUser("", "hi!");
        register0.runRegistrationSystem((int) (short) 1);
        register0.runRegistrationSystem((int) (byte) 1);
        register0.loginUser("hi!", "hi!");
    }

    @Test
    public void test1550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest3.test1550");
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
        java.lang.Class<?> wildcardClass26 = register0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass26);
    }

    @Test
    public void test1551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest3.test1551");
        Register register0 = new Register();
        register0.registerUser("hi!", "");
        register0.registerUser("hi!", "");
        register0.runRegistrationSystem((int) (byte) 0);
        register0.runRegistrationSystem((int) (short) 10);
        register0.registerUser("", "");
        register0.registerUser("", "hi!");
        register0.runRegistrationSystem((int) (short) 1);
        register0.loginUser("", "hi!");
    }

    @Test
    public void test1552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest3.test1552");
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
        java.lang.Class<?> wildcardClass35 = register0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass35);
    }

    @Test
    public void test1553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest3.test1553");
        Register register0 = new Register();
        register0.loginUser("hi!", "hi!");
        register0.registerUser("hi!", "");
        register0.registerUser("", "");
        register0.registerUser("", "hi!");
        register0.loginUser("", "");
        register0.runRegistrationSystem((int) (short) 0);
    }

    @Test
    public void test1554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest3.test1554");
        Register register0 = new Register();
        register0.registerUser("hi!", "");
        register0.registerUser("hi!", "");
        register0.runRegistrationSystem((int) (byte) -1);
        register0.registerUser("", "hi!");
        register0.registerUser("hi!", "hi!");
        register0.loginUser("", "");
        register0.runRegistrationSystem((int) '#');
    }

    @Test
    public void test1555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest3.test1555");
        Register register0 = new Register();
        register0.runRegistrationSystem((int) (short) 0);
        register0.loginUser("hi!", "hi!");
        register0.registerUser("", "");
        register0.runRegistrationSystem((-1));
        register0.loginUser("hi!", "");
        register0.registerUser("hi!", "hi!");
        register0.registerUser("", "hi!");
    }

    @Test
    public void test1556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest3.test1556");
        Register register0 = new Register();
        register0.runRegistrationSystem((int) (byte) -1);
        register0.runRegistrationSystem((int) (byte) 10);
        register0.registerUser("", "");
        register0.loginUser("", "");
        register0.registerUser("", "hi!");
        register0.registerUser("hi!", "");
        register0.runRegistrationSystem((int) (short) 100);
        java.lang.Class<?> wildcardClass19 = register0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test1557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest3.test1557");
        Register register0 = new Register();
        register0.registerUser("", "");
        register0.registerUser("", "hi!");
        register0.registerUser("", "");
        register0.loginUser("hi!", "");
        register0.runRegistrationSystem(10);
    }

    @Test
    public void test1558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest3.test1558");
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
        java.lang.Class<?> wildcardClass28 = register0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test1559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest3.test1559");
        Register register0 = new Register();
        register0.loginUser("hi!", "hi!");
        register0.loginUser("hi!", "hi!");
        register0.loginUser("", "hi!");
        register0.registerUser("", "");
        register0.loginUser("", "hi!");
        register0.runRegistrationSystem(10);
    }

    @Test
    public void test1560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest3.test1560");
        Register register0 = new Register();
        register0.registerUser("hi!", "");
        register0.registerUser("hi!", "");
        register0.runRegistrationSystem((int) (byte) -1);
        register0.registerUser("hi!", "");
        register0.loginUser("", "hi!");
        register0.registerUser("", "hi!");
        register0.registerUser("", "");
    }

    @Test
    public void test1561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest3.test1561");
        Register register0 = new Register();
        register0.loginUser("hi!", "hi!");
        register0.registerUser("hi!", "");
        register0.loginUser("hi!", "hi!");
        register0.registerUser("", "");
        register0.runRegistrationSystem((int) 'a');
        register0.loginUser("hi!", "");
        register0.runRegistrationSystem((-1));
    }

    @Test
    public void test1562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest3.test1562");
        Register register0 = new Register();
        register0.runRegistrationSystem((int) (byte) -1);
        register0.registerUser("hi!", "");
        register0.registerUser("", "hi!");
        register0.loginUser("hi!", "hi!");
        register0.registerUser("hi!", "hi!");
        register0.loginUser("hi!", "hi!");
        register0.runRegistrationSystem((int) ' ');
    }

    @Test
    public void test1563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest3.test1563");
        Register register0 = new Register();
        register0.runRegistrationSystem((int) (byte) -1);
        register0.registerUser("hi!", "");
        register0.loginUser("hi!", "hi!");
        register0.loginUser("hi!", "hi!");
        register0.runRegistrationSystem((int) (short) 1);
        register0.registerUser("hi!", "hi!");
        register0.runRegistrationSystem((int) ' ');
        register0.loginUser("", "");
        java.lang.Class<?> wildcardClass22 = register0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test1564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest3.test1564");
        Register register0 = new Register();
        register0.runRegistrationSystem((int) (byte) -1);
        register0.runRegistrationSystem((int) (byte) 10);
        register0.registerUser("", "");
        register0.registerUser("", "hi!");
        register0.loginUser("hi!", "");
        register0.registerUser("hi!", "");
        register0.loginUser("hi!", "hi!");
    }

    @Test
    public void test1565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest3.test1565");
        Register register0 = new Register();
        register0.runRegistrationSystem((int) (byte) -1);
        register0.registerUser("hi!", "");
        register0.runRegistrationSystem((int) (short) 1);
        register0.loginUser("", "");
        register0.loginUser("hi!", "hi!");
        register0.runRegistrationSystem((int) (byte) 1);
    }

    @Test
    public void test1566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest3.test1566");
        Register register0 = new Register();
        register0.runRegistrationSystem((int) (byte) -1);
        register0.runRegistrationSystem((int) (byte) 10);
        register0.registerUser("", "");
        register0.registerUser("", "hi!");
        register0.runRegistrationSystem((int) '4');
        register0.loginUser("hi!", "");
        register0.runRegistrationSystem((int) '4');
        register0.runRegistrationSystem(0);
        register0.loginUser("", "");
    }

    @Test
    public void test1567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest3.test1567");
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
        register0.registerUser("", "hi!");
        java.lang.Class<?> wildcardClass28 = register0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test1568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest3.test1568");
        Register register0 = new Register();
        register0.runRegistrationSystem((int) '#');
        register0.registerUser("", "hi!");
        register0.runRegistrationSystem((int) (short) 0);
        register0.runRegistrationSystem((int) (byte) 1);
        register0.registerUser("", "");
        register0.runRegistrationSystem((int) (short) 10);
        register0.loginUser("", "");
    }

    @Test
    public void test1569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest3.test1569");
        Register register0 = new Register();
        register0.registerUser("hi!", "");
        register0.loginUser("", "hi!");
        register0.loginUser("", "hi!");
        register0.runRegistrationSystem(10);
        register0.runRegistrationSystem((int) (short) 1);
        register0.registerUser("hi!", "");
        register0.runRegistrationSystem((int) (byte) 1);
    }

    @Test
    public void test1570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest3.test1570");
        Register register0 = new Register();
        register0.loginUser("hi!", "hi!");
        register0.registerUser("", "");
        register0.loginUser("hi!", "hi!");
        register0.registerUser("hi!", "hi!");
        java.lang.Class<?> wildcardClass13 = register0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test1571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest3.test1571");
        Register register0 = new Register();
        register0.runRegistrationSystem((int) (byte) -1);
        register0.registerUser("hi!", "");
        register0.loginUser("hi!", "hi!");
        register0.loginUser("", "");
        register0.registerUser("hi!", "hi!");
    }

    @Test
    public void test1572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest3.test1572");
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
        register0.registerUser("hi!", "hi!");
    }

    @Test
    public void test1573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest3.test1573");
        Register register0 = new Register();
        register0.runRegistrationSystem((int) (short) 0);
        register0.loginUser("hi!", "hi!");
        register0.registerUser("", "");
        register0.loginUser("", "hi!");
        register0.registerUser("hi!", "");
        register0.runRegistrationSystem((int) '#');
        register0.loginUser("", "");
        register0.runRegistrationSystem(1);
        register0.loginUser("hi!", "hi!");
    }

    @Test
    public void test1574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest3.test1574");
        Register register0 = new Register();
        register0.registerUser("hi!", "");
        register0.loginUser("", "hi!");
        register0.runRegistrationSystem((int) 'a');
        register0.loginUser("hi!", "");
        register0.runRegistrationSystem((int) (byte) 1);
        register0.registerUser("", "hi!");
        register0.runRegistrationSystem((int) '#');
    }

    @Test
    public void test1575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest3.test1575");
        Register register0 = new Register();
        register0.runRegistrationSystem((int) '#');
        register0.loginUser("hi!", "hi!");
        register0.registerUser("", "");
        register0.registerUser("hi!", "");
        register0.runRegistrationSystem((int) (byte) 10);
        register0.registerUser("", "");
    }

    @Test
    public void test1576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest3.test1576");
        Register register0 = new Register();
        register0.loginUser("hi!", "hi!");
        register0.registerUser("hi!", "");
        register0.loginUser("hi!", "hi!");
        register0.runRegistrationSystem(100);
        register0.runRegistrationSystem((int) (byte) 1);
        register0.registerUser("hi!", "hi!");
        register0.loginUser("", "");
        java.lang.Class<?> wildcardClass20 = register0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test1577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest3.test1577");
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
        register0.runRegistrationSystem((int) (short) 0);
        java.lang.Class<?> wildcardClass26 = register0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass26);
    }

    @Test
    public void test1578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest3.test1578");
        Register register0 = new Register();
        register0.runRegistrationSystem((int) (byte) -1);
        register0.registerUser("hi!", "");
        register0.runRegistrationSystem(0);
        register0.runRegistrationSystem(1);
        register0.runRegistrationSystem((int) (short) 100);
        java.lang.Class<?> wildcardClass12 = register0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test1579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest3.test1579");
        Register register0 = new Register();
        register0.loginUser("hi!", "hi!");
        register0.runRegistrationSystem(0);
        register0.registerUser("", "");
        register0.registerUser("", "hi!");
        register0.loginUser("hi!", "");
        register0.registerUser("", "");
        register0.loginUser("", "hi!");
    }

    @Test
    public void test1580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest3.test1580");
        Register register0 = new Register();
        register0.runRegistrationSystem((int) '#');
        register0.registerUser("", "hi!");
        register0.runRegistrationSystem((int) (short) 0);
        register0.runRegistrationSystem((int) (byte) 1);
        register0.registerUser("", "");
        register0.runRegistrationSystem((int) (short) 10);
        register0.runRegistrationSystem((int) (short) -1);
        register0.loginUser("hi!", "hi!");
        register0.runRegistrationSystem((int) (short) -1);
    }

    @Test
    public void test1581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest3.test1581");
        Register register0 = new Register();
        register0.runRegistrationSystem((int) '#');
        register0.registerUser("", "hi!");
        register0.runRegistrationSystem((int) (short) 0);
        register0.runRegistrationSystem((int) (byte) 1);
        register0.runRegistrationSystem((int) (byte) 0);
        register0.registerUser("hi!", "");
        register0.loginUser("hi!", "hi!");
        register0.loginUser("", "");
        register0.registerUser("", "");
        java.lang.Class<?> wildcardClass24 = register0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test1582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest3.test1582");
        Register register0 = new Register();
        register0.runRegistrationSystem((int) '#');
        register0.registerUser("", "hi!");
        register0.runRegistrationSystem((int) (short) 0);
        register0.runRegistrationSystem((int) (byte) 1);
        register0.registerUser("", "");
        register0.loginUser("", "");
        register0.loginUser("", "");
        register0.runRegistrationSystem((int) (short) 0);
        register0.loginUser("", "");
        java.lang.Class<?> wildcardClass24 = register0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test1583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest3.test1583");
        Register register0 = new Register();
        register0.runRegistrationSystem((int) '#');
        register0.loginUser("hi!", "hi!");
        register0.loginUser("hi!", "hi!");
        register0.loginUser("hi!", "");
        register0.registerUser("", "hi!");
        register0.loginUser("", "hi!");
        register0.runRegistrationSystem((int) 'a');
    }

    @Test
    public void test1584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest3.test1584");
        Register register0 = new Register();
        register0.runRegistrationSystem((int) (short) 0);
        register0.loginUser("hi!", "hi!");
        register0.registerUser("", "");
        register0.runRegistrationSystem((-1));
        register0.registerUser("", "");
        register0.loginUser("", "");
        register0.runRegistrationSystem((int) (byte) -1);
        register0.loginUser("", "hi!");
    }

    @Test
    public void test1585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest3.test1585");
        Register register0 = new Register();
        register0.loginUser("", "hi!");
        register0.loginUser("", "hi!");
        register0.loginUser("hi!", "hi!");
        register0.registerUser("", "");
        register0.loginUser("", "");
        java.lang.Class<?> wildcardClass16 = register0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test1586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest3.test1586");
        Register register0 = new Register();
        register0.registerUser("hi!", "");
        register0.loginUser("hi!", "hi!");
        register0.registerUser("hi!", "hi!");
        register0.loginUser("", "");
    }

    @Test
    public void test1587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest3.test1587");
        Register register0 = new Register();
        register0.runRegistrationSystem((int) '#');
        register0.registerUser("", "hi!");
        register0.registerUser("", "hi!");
        register0.registerUser("", "");
        register0.runRegistrationSystem((int) (byte) 10);
        register0.runRegistrationSystem((int) (short) 100);
        register0.runRegistrationSystem((int) (short) 1);
        register0.registerUser("", "hi!");
        register0.runRegistrationSystem((-1));
    }

    @Test
    public void test1588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest3.test1588");
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
        register0.registerUser("hi!", "");
    }

    @Test
    public void test1589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest3.test1589");
        Register register0 = new Register();
        register0.runRegistrationSystem((int) (byte) -1);
        register0.runRegistrationSystem((int) (short) 10);
        register0.runRegistrationSystem((int) (short) -1);
        register0.runRegistrationSystem((int) (short) -1);
        register0.loginUser("", "hi!");
        register0.runRegistrationSystem((int) '#');
        register0.loginUser("", "hi!");
    }

    @Test
    public void test1590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest3.test1590");
        Register register0 = new Register();
        register0.runRegistrationSystem((int) '#');
        register0.loginUser("hi!", "hi!");
        register0.loginUser("hi!", "hi!");
        register0.loginUser("hi!", "");
        register0.loginUser("", "");
        register0.runRegistrationSystem((int) (short) 10);
        register0.registerUser("", "");
        register0.loginUser("hi!", "hi!");
        java.lang.Class<?> wildcardClass23 = register0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test1591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest3.test1591");
        Register register0 = new Register();
        register0.loginUser("hi!", "hi!");
        register0.runRegistrationSystem(0);
        register0.registerUser("", "");
        register0.loginUser("", "hi!");
        register0.runRegistrationSystem((int) 'a');
        register0.runRegistrationSystem((int) (short) 100);
        java.lang.Class<?> wildcardClass16 = register0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test1592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest3.test1592");
        Register register0 = new Register();
        register0.loginUser("", "hi!");
        register0.loginUser("", "hi!");
        register0.loginUser("hi!", "hi!");
        register0.runRegistrationSystem((int) '4');
        register0.loginUser("", "hi!");
        register0.loginUser("hi!", "");
    }

    @Test
    public void test1593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest3.test1593");
        Register register0 = new Register();
        register0.loginUser("hi!", "hi!");
        register0.registerUser("hi!", "");
        register0.registerUser("", "");
        register0.registerUser("", "hi!");
        register0.registerUser("hi!", "");
        java.lang.Class<?> wildcardClass16 = register0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test1594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest3.test1594");
        Register register0 = new Register();
        register0.runRegistrationSystem((int) (byte) -1);
        register0.registerUser("hi!", "");
        register0.loginUser("hi!", "hi!");
        register0.runRegistrationSystem((int) (byte) 1);
        register0.runRegistrationSystem((int) ' ');
        register0.runRegistrationSystem((int) 'a');
        register0.registerUser("hi!", "");
        register0.loginUser("", "");
        java.lang.Class<?> wildcardClass21 = register0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test1595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest3.test1595");
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
        register0.registerUser("hi!", "");
    }

    @Test
    public void test1596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest3.test1596");
        Register register0 = new Register();
        register0.loginUser("hi!", "hi!");
        register0.registerUser("hi!", "");
        register0.loginUser("hi!", "hi!");
        register0.runRegistrationSystem(100);
        register0.registerUser("hi!", "");
        register0.registerUser("", "");
        register0.runRegistrationSystem(0);
        register0.registerUser("hi!", "hi!");
    }

    @Test
    public void test1597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest3.test1597");
        Register register0 = new Register();
        register0.runRegistrationSystem((int) '#');
        register0.registerUser("", "hi!");
        register0.runRegistrationSystem((int) (short) 0);
        register0.runRegistrationSystem((int) (byte) 1);
        register0.registerUser("", "");
        register0.runRegistrationSystem((int) (short) 10);
        register0.registerUser("hi!", "");
        register0.registerUser("", "");
        register0.registerUser("", "");
    }

    @Test
    public void test1598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest3.test1598");
        Register register0 = new Register();
        register0.loginUser("hi!", "hi!");
        register0.registerUser("hi!", "hi!");
        register0.runRegistrationSystem((int) (byte) 100);
        register0.loginUser("", "hi!");
        register0.loginUser("hi!", "hi!");
        register0.loginUser("", "");
    }

    @Test
    public void test1599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest3.test1599");
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
        register0.runRegistrationSystem((int) (short) 1);
    }

    @Test
    public void test1600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest3.test1600");
        Register register0 = new Register();
        register0.registerUser("hi!", "");
        register0.registerUser("hi!", "");
        register0.loginUser("hi!", "hi!");
        register0.loginUser("hi!", "");
        register0.registerUser("hi!", "hi!");
        register0.loginUser("", "hi!");
    }

    @Test
    public void test1601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest3.test1601");
        Register register0 = new Register();
        register0.loginUser("hi!", "hi!");
        register0.runRegistrationSystem(0);
        register0.registerUser("", "");
        register0.runRegistrationSystem((-1));
        register0.runRegistrationSystem((int) (short) 10);
        register0.registerUser("hi!", "hi!");
        register0.runRegistrationSystem((int) (byte) 100);
        register0.runRegistrationSystem((int) (byte) 10);
    }

    @Test
    public void test1602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest3.test1602");
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
        register0.runRegistrationSystem((int) '#');
    }

    @Test
    public void test1603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest3.test1603");
        Register register0 = new Register();
        register0.registerUser("hi!", "");
        register0.registerUser("hi!", "");
        register0.runRegistrationSystem((int) (byte) 0);
        register0.registerUser("", "");
        register0.runRegistrationSystem((int) (byte) 10);
        register0.registerUser("", "");
        java.lang.Class<?> wildcardClass17 = register0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test1604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest3.test1604");
        Register register0 = new Register();
        register0.runRegistrationSystem((int) (byte) -1);
        register0.runRegistrationSystem((int) '#');
        register0.loginUser("", "");
        register0.runRegistrationSystem((int) (short) 1);
    }

    @Test
    public void test1605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest3.test1605");
        Register register0 = new Register();
        register0.loginUser("hi!", "hi!");
        register0.runRegistrationSystem(0);
        register0.registerUser("", "");
        register0.loginUser("", "hi!");
        register0.registerUser("", "");
        register0.loginUser("", "hi!");
        register0.runRegistrationSystem((int) '4');
    }

    @Test
    public void test1606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest3.test1606");
        Register register0 = new Register();
        register0.runRegistrationSystem((int) (byte) -1);
        register0.registerUser("hi!", "");
        register0.loginUser("hi!", "hi!");
        register0.runRegistrationSystem((int) (byte) 1);
        register0.runRegistrationSystem((int) (byte) -1);
        java.lang.Class<?> wildcardClass13 = register0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test1607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest3.test1607");
        Register register0 = new Register();
        register0.loginUser("hi!", "hi!");
        register0.registerUser("hi!", "");
        register0.registerUser("", "");
        register0.registerUser("", "");
        register0.registerUser("", "hi!");
    }

    @Test
    public void test1608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest3.test1608");
        Register register0 = new Register();
        register0.runRegistrationSystem((int) (short) 0);
        register0.loginUser("hi!", "hi!");
        register0.registerUser("", "");
        register0.runRegistrationSystem((-1));
        register0.runRegistrationSystem((int) (short) 0);
        register0.registerUser("", "");
        register0.runRegistrationSystem((int) (byte) 0);
        register0.runRegistrationSystem((int) '#');
        register0.registerUser("hi!", "hi!");
        register0.runRegistrationSystem((int) (short) 100);
    }

    @Test
    public void test1609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest3.test1609");
        Register register0 = new Register();
        register0.runRegistrationSystem((int) (short) 0);
        register0.loginUser("hi!", "hi!");
        register0.registerUser("", "");
        register0.runRegistrationSystem((-1));
        register0.loginUser("", "hi!");
        register0.loginUser("hi!", "hi!");
        register0.loginUser("hi!", "hi!");
    }

    @Test
    public void test1610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest3.test1610");
        Register register0 = new Register();
        register0.loginUser("hi!", "hi!");
        register0.registerUser("hi!", "");
        register0.loginUser("hi!", "hi!");
        register0.runRegistrationSystem(100);
        register0.registerUser("", "hi!");
        register0.loginUser("", "");
        java.lang.Class<?> wildcardClass18 = register0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test1611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest3.test1611");
        Register register0 = new Register();
        register0.runRegistrationSystem((int) (byte) -1);
        register0.registerUser("hi!", "");
        register0.registerUser("", "hi!");
        register0.runRegistrationSystem((int) (short) 10);
        register0.loginUser("hi!", "hi!");
        register0.loginUser("", "hi!");
        register0.loginUser("hi!", "");
        register0.loginUser("hi!", "hi!");
        register0.registerUser("hi!", "");
    }

    @Test
    public void test1612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest3.test1612");
        Register register0 = new Register();
        register0.loginUser("hi!", "hi!");
        register0.registerUser("hi!", "");
        register0.registerUser("", "");
        register0.registerUser("", "hi!");
        register0.registerUser("", "");
        register0.loginUser("", "hi!");
        register0.runRegistrationSystem((int) (byte) -1);
        java.lang.Class<?> wildcardClass21 = register0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test1613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest3.test1613");
        Register register0 = new Register();
        register0.runRegistrationSystem((int) '#');
        register0.registerUser("", "hi!");
        register0.loginUser("hi!", "hi!");
        register0.runRegistrationSystem((int) (short) 10);
        register0.runRegistrationSystem(100);
        register0.runRegistrationSystem((int) 'a');
    }

    @Test
    public void test1614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest3.test1614");
        Register register0 = new Register();
        register0.registerUser("hi!", "");
        register0.loginUser("", "hi!");
        register0.runRegistrationSystem((int) 'a');
        register0.loginUser("hi!", "");
        register0.runRegistrationSystem((int) (byte) 1);
        register0.loginUser("hi!", "hi!");
        register0.loginUser("", "");
        register0.loginUser("", "hi!");
        register0.loginUser("", "");
        register0.registerUser("", "");
    }

    @Test
    public void test1615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest3.test1615");
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
        register0.loginUser("hi!", "");
    }

    @Test
    public void test1616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest3.test1616");
        Register register0 = new Register();
        register0.runRegistrationSystem((int) (byte) -1);
        register0.registerUser("hi!", "");
        register0.loginUser("hi!", "hi!");
        register0.loginUser("hi!", "");
        register0.loginUser("", "");
        register0.runRegistrationSystem(1);
        register0.registerUser("hi!", "hi!");
        register0.loginUser("hi!", "");
    }

    @Test
    public void test1617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest3.test1617");
        Register register0 = new Register();
        register0.runRegistrationSystem((int) (byte) -1);
        register0.runRegistrationSystem((int) (short) 10);
        register0.runRegistrationSystem((int) (short) -1);
        register0.registerUser("hi!", "hi!");
        register0.runRegistrationSystem((int) (byte) 10);
    }

    @Test
    public void test1618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest3.test1618");
        Register register0 = new Register();
        register0.runRegistrationSystem((int) (short) 0);
        register0.loginUser("hi!", "hi!");
        register0.registerUser("", "");
        register0.runRegistrationSystem((int) '#');
        register0.registerUser("", "hi!");
        register0.registerUser("hi!", "hi!");
        register0.runRegistrationSystem((int) (byte) 100);
        java.lang.Class<?> wildcardClass19 = register0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test1619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest3.test1619");
        Register register0 = new Register();
        register0.registerUser("hi!", "");
        register0.loginUser("", "hi!");
        register0.loginUser("", "hi!");
        register0.runRegistrationSystem(10);
        register0.loginUser("", "");
        register0.runRegistrationSystem(1);
        register0.loginUser("hi!", "hi!");
    }

    @Test
    public void test1620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest3.test1620");
        Register register0 = new Register();
        register0.runRegistrationSystem((int) '#');
        register0.loginUser("hi!", "hi!");
        register0.runRegistrationSystem((int) (byte) 10);
        register0.registerUser("hi!", "hi!");
        register0.runRegistrationSystem((int) (byte) 100);
        register0.registerUser("hi!", "");
        register0.loginUser("hi!", "");
        register0.registerUser("hi!", "hi!");
        java.lang.Class<?> wildcardClass22 = register0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test1621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest3.test1621");
        Register register0 = new Register();
        register0.registerUser("hi!", "");
        register0.loginUser("", "");
        register0.runRegistrationSystem((int) 'a');
        register0.runRegistrationSystem((int) (short) 100);
        register0.runRegistrationSystem((int) (short) -1);
        register0.loginUser("hi!", "hi!");
        java.lang.Class<?> wildcardClass16 = register0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test1622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest3.test1622");
        Register register0 = new Register();
        register0.runRegistrationSystem((int) (byte) -1);
        register0.registerUser("hi!", "");
        register0.registerUser("", "hi!");
        register0.runRegistrationSystem((int) (short) 10);
        register0.loginUser("hi!", "hi!");
        register0.registerUser("", "");
        register0.runRegistrationSystem((int) (byte) -1);
        register0.loginUser("", "hi!");
        register0.registerUser("", "hi!");
    }

    @Test
    public void test1623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest3.test1623");
        Register register0 = new Register();
        register0.loginUser("hi!", "hi!");
        register0.registerUser("hi!", "");
        register0.registerUser("", "");
        register0.registerUser("hi!", "");
        register0.registerUser("hi!", "");
        register0.registerUser("", "");
        register0.runRegistrationSystem(100);
        register0.loginUser("", "");
        register0.runRegistrationSystem((int) '4');
        java.lang.Class<?> wildcardClass26 = register0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass26);
    }

    @Test
    public void test1624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest3.test1624");
        Register register0 = new Register();
        register0.runRegistrationSystem((int) (byte) -1);
        register0.registerUser("hi!", "");
        register0.loginUser("hi!", "hi!");
        register0.loginUser("hi!", "");
        register0.runRegistrationSystem((int) (byte) -1);
        register0.registerUser("hi!", "hi!");
        register0.runRegistrationSystem((int) '4');
        register0.runRegistrationSystem((int) (byte) 1);
        register0.runRegistrationSystem((int) (short) 100);
    }

    @Test
    public void test1625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest3.test1625");
        Register register0 = new Register();
        register0.registerUser("hi!", "");
        register0.registerUser("hi!", "");
        register0.loginUser("hi!", "");
        register0.loginUser("hi!", "");
        register0.loginUser("", "hi!");
        register0.loginUser("hi!", "");
        register0.loginUser("", "hi!");
        register0.runRegistrationSystem((int) (byte) -1);
    }

    @Test
    public void test1626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest3.test1626");
        Register register0 = new Register();
        register0.runRegistrationSystem((int) (byte) -1);
        register0.runRegistrationSystem((int) (short) 10);
        register0.runRegistrationSystem((int) (byte) 100);
        register0.runRegistrationSystem(10);
        register0.registerUser("", "hi!");
        register0.runRegistrationSystem(0);
        register0.loginUser("hi!", "");
        register0.runRegistrationSystem((int) (short) 10);
    }

    @Test
    public void test1627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest3.test1627");
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
        java.lang.Class<?> wildcardClass26 = register0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass26);
    }

    @Test
    public void test1628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest3.test1628");
        Register register0 = new Register();
        register0.loginUser("hi!", "hi!");
        register0.registerUser("hi!", "");
        register0.registerUser("hi!", "");
        register0.registerUser("", "hi!");
        register0.loginUser("", "");
        register0.runRegistrationSystem((int) (short) 10);
        register0.registerUser("hi!", "hi!");
        register0.loginUser("hi!", "");
    }

    @Test
    public void test1629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest3.test1629");
        Register register0 = new Register();
        register0.loginUser("hi!", "hi!");
        register0.registerUser("hi!", "");
        register0.loginUser("hi!", "hi!");
        register0.runRegistrationSystem(100);
        register0.loginUser("hi!", "hi!");
        java.lang.Class<?> wildcardClass15 = register0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test1630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest3.test1630");
        Register register0 = new Register();
        register0.runRegistrationSystem((int) (short) 0);
        register0.loginUser("hi!", "hi!");
        register0.registerUser("", "");
        register0.runRegistrationSystem((int) '#');
        register0.registerUser("", "hi!");
        register0.registerUser("", "hi!");
        register0.registerUser("", "");
        register0.runRegistrationSystem((int) ' ');
        java.lang.Class<?> wildcardClass22 = register0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test1631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest3.test1631");
        Register register0 = new Register();
        register0.runRegistrationSystem((int) '#');
        register0.loginUser("hi!", "hi!");
        register0.runRegistrationSystem((int) (byte) 10);
        register0.registerUser("hi!", "hi!");
        register0.registerUser("", "hi!");
    }

    @Test
    public void test1632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest3.test1632");
        Register register0 = new Register();
        register0.runRegistrationSystem((int) '#');
        register0.registerUser("", "hi!");
        register0.runRegistrationSystem((int) (short) 0);
        register0.loginUser("hi!", "hi!");
        register0.runRegistrationSystem(100);
        register0.runRegistrationSystem((int) (byte) 0);
    }

    @Test
    public void test1633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest3.test1633");
        Register register0 = new Register();
        register0.runRegistrationSystem((int) '#');
        register0.registerUser("", "hi!");
        register0.registerUser("", "hi!");
        register0.registerUser("", "");
        register0.loginUser("hi!", "hi!");
        register0.runRegistrationSystem((-1));
    }

    @Test
    public void test1634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest3.test1634");
        Register register0 = new Register();
        register0.registerUser("hi!", "");
        register0.runRegistrationSystem(1);
        register0.registerUser("", "");
        register0.registerUser("hi!", "");
        register0.registerUser("hi!", "hi!");
        register0.loginUser("hi!", "");
        register0.runRegistrationSystem((int) (short) 10);
        register0.runRegistrationSystem((int) (byte) 100);
    }

    @Test
    public void test1635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest3.test1635");
        Register register0 = new Register();
        register0.runRegistrationSystem((int) (byte) -1);
        register0.registerUser("hi!", "");
        register0.runRegistrationSystem((int) (short) 1);
        register0.loginUser("", "");
        register0.loginUser("", "hi!");
        register0.runRegistrationSystem((int) (short) 1);
        register0.registerUser("", "");
        register0.registerUser("hi!", "");
        register0.registerUser("", "");
        java.lang.Class<?> wildcardClass25 = register0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test1636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest3.test1636");
        Register register0 = new Register();
        register0.loginUser("hi!", "hi!");
        register0.runRegistrationSystem(0);
        register0.loginUser("", "hi!");
        java.lang.Class<?> wildcardClass9 = register0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test1637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest3.test1637");
        Register register0 = new Register();
        register0.registerUser("hi!", "");
        register0.loginUser("", "hi!");
        register0.runRegistrationSystem((int) 'a');
        register0.loginUser("hi!", "");
        register0.runRegistrationSystem((int) (byte) 1);
        register0.registerUser("", "hi!");
        register0.runRegistrationSystem(0);
        java.lang.Class<?> wildcardClass19 = register0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test1638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest3.test1638");
        Register register0 = new Register();
        register0.runRegistrationSystem((int) (byte) -1);
        register0.registerUser("hi!", "");
        register0.loginUser("hi!", "hi!");
        register0.runRegistrationSystem((int) (byte) 1);
        register0.registerUser("", "hi!");
        register0.loginUser("", "");
        register0.loginUser("hi!", "hi!");
        register0.loginUser("hi!", "hi!");
        register0.runRegistrationSystem((int) '#');
    }

    @Test
    public void test1639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest3.test1639");
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
        java.lang.Class<?> wildcardClass28 = register0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test1640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest3.test1640");
        Register register0 = new Register();
        register0.runRegistrationSystem((int) (byte) -1);
        register0.registerUser("hi!", "");
        register0.runRegistrationSystem((int) (short) 1);
        register0.loginUser("", "");
        register0.loginUser("", "hi!");
        register0.runRegistrationSystem(100);
        register0.runRegistrationSystem((int) '4');
        java.lang.Class<?> wildcardClass18 = register0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test1641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest3.test1641");
        Register register0 = new Register();
        register0.runRegistrationSystem((int) '#');
        register0.runRegistrationSystem((int) (short) 100);
        register0.runRegistrationSystem((int) '4');
        register0.loginUser("", "");
        register0.runRegistrationSystem((int) '#');
        java.lang.Class<?> wildcardClass12 = register0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test1642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest3.test1642");
        Register register0 = new Register();
        register0.loginUser("hi!", "hi!");
        register0.runRegistrationSystem(0);
        register0.registerUser("", "");
        register0.runRegistrationSystem((-1));
        register0.runRegistrationSystem((int) (byte) 10);
        java.lang.Class<?> wildcardClass13 = register0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test1643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest3.test1643");
        Register register0 = new Register();
        register0.runRegistrationSystem((int) '#');
        register0.runRegistrationSystem((int) (short) 100);
        register0.runRegistrationSystem((int) '4');
        register0.loginUser("hi!", "");
        register0.registerUser("hi!", "");
        register0.runRegistrationSystem((int) (short) -1);
    }

    @Test
    public void test1644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest3.test1644");
        Register register0 = new Register();
        register0.loginUser("hi!", "hi!");
        register0.registerUser("hi!", "");
        register0.registerUser("", "");
        register0.registerUser("", "hi!");
        register0.registerUser("", "");
        register0.loginUser("", "hi!");
        register0.registerUser("hi!", "hi!");
        register0.loginUser("hi!", "");
        register0.runRegistrationSystem((int) (byte) 100);
    }

    @Test
    public void test1645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest3.test1645");
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
        java.lang.Class<?> wildcardClass25 = register0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test1646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest3.test1646");
        Register register0 = new Register();
        register0.runRegistrationSystem((int) (byte) -1);
        register0.runRegistrationSystem((int) (byte) 10);
        register0.registerUser("", "");
        register0.loginUser("", "");
        register0.registerUser("", "hi!");
        register0.loginUser("hi!", "");
    }

    @Test
    public void test1647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest3.test1647");
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
        java.lang.Class<?> wildcardClass26 = register0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass26);
    }

    @Test
    public void test1648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest3.test1648");
        Register register0 = new Register();
        register0.runRegistrationSystem((int) (byte) -1);
        register0.registerUser("hi!", "");
        register0.loginUser("hi!", "hi!");
        register0.loginUser("hi!", "");
        register0.registerUser("hi!", "");
        register0.registerUser("hi!", "");
        register0.loginUser("hi!", "");
    }

    @Test
    public void test1649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest3.test1649");
        Register register0 = new Register();
        register0.runRegistrationSystem((int) (byte) -1);
        register0.registerUser("hi!", "");
        register0.loginUser("hi!", "hi!");
        register0.runRegistrationSystem((int) (byte) 1);
        register0.runRegistrationSystem((int) ' ');
        register0.runRegistrationSystem((int) 'a');
        register0.registerUser("hi!", "hi!");
        register0.loginUser("", "hi!");
    }

    @Test
    public void test1650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest3.test1650");
        Register register0 = new Register();
        register0.runRegistrationSystem((int) (byte) -1);
        register0.registerUser("hi!", "");
        register0.loginUser("hi!", "hi!");
        register0.loginUser("hi!", "hi!");
        register0.runRegistrationSystem((int) (short) 1);
        register0.registerUser("hi!", "hi!");
        register0.registerUser("", "");
        register0.registerUser("", "");
    }

    @Test
    public void test1651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest3.test1651");
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
        register0.loginUser("", "");
    }

    @Test
    public void test1652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest3.test1652");
        Register register0 = new Register();
        register0.runRegistrationSystem((int) '#');
        register0.registerUser("", "hi!");
        register0.registerUser("", "hi!");
        register0.registerUser("", "");
        register0.runRegistrationSystem((int) (byte) 10);
        register0.runRegistrationSystem((int) (short) 100);
        register0.runRegistrationSystem((int) (short) 1);
        java.lang.Class<?> wildcardClass18 = register0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test1653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest3.test1653");
        Register register0 = new Register();
        register0.runRegistrationSystem((int) '#');
        register0.registerUser("", "hi!");
        register0.loginUser("hi!", "hi!");
        register0.loginUser("", "hi!");
        register0.runRegistrationSystem(0);
        register0.runRegistrationSystem((int) 'a');
        register0.runRegistrationSystem((-1));
        java.lang.Class<?> wildcardClass18 = register0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test1654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest3.test1654");
        Register register0 = new Register();
        register0.loginUser("hi!", "hi!");
        register0.registerUser("hi!", "");
        register0.registerUser("", "");
        register0.registerUser("", "hi!");
        register0.runRegistrationSystem((int) (short) 100);
        register0.runRegistrationSystem((int) (byte) 10);
        register0.runRegistrationSystem(0);
        register0.loginUser("hi!", "hi!");
        register0.runRegistrationSystem((int) (byte) 100);
        register0.loginUser("", "hi!");
        java.lang.Class<?> wildcardClass27 = register0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test1655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest3.test1655");
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
        java.lang.Class<?> wildcardClass26 = register0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass26);
    }

    @Test
    public void test1656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest3.test1656");
        Register register0 = new Register();
        register0.registerUser("hi!", "");
        register0.loginUser("", "hi!");
        register0.runRegistrationSystem((int) 'a');
        register0.loginUser("", "hi!");
        register0.runRegistrationSystem((int) (byte) -1);
        register0.loginUser("", "hi!");
        register0.loginUser("", "hi!");
        register0.loginUser("hi!", "hi!");
        register0.registerUser("", "");
    }

    @Test
    public void test1657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest3.test1657");
        Register register0 = new Register();
        register0.runRegistrationSystem((int) '#');
        register0.registerUser("", "hi!");
        register0.runRegistrationSystem((int) (short) 0);
        register0.runRegistrationSystem((int) (byte) 1);
        register0.runRegistrationSystem((int) 'a');
        register0.registerUser("", "");
        register0.registerUser("hi!", "hi!");
        register0.runRegistrationSystem((int) ' ');
        register0.loginUser("hi!", "hi!");
    }

    @Test
    public void test1658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest3.test1658");
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
        register0.loginUser("hi!", "hi!");
    }

    @Test
    public void test1659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest3.test1659");
        Register register0 = new Register();
        register0.runRegistrationSystem((int) (byte) -1);
        register0.registerUser("hi!", "");
        register0.registerUser("", "hi!");
        register0.loginUser("hi!", "hi!");
        register0.registerUser("hi!", "hi!");
        register0.runRegistrationSystem((int) (short) 0);
        register0.loginUser("hi!", "hi!");
    }

    @Test
    public void test1660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest3.test1660");
        Register register0 = new Register();
        register0.loginUser("hi!", "hi!");
        register0.registerUser("hi!", "hi!");
        register0.registerUser("", "hi!");
        register0.runRegistrationSystem((int) (byte) -1);
        register0.runRegistrationSystem((int) (short) 10);
        register0.runRegistrationSystem((int) (byte) 100);
    }

    @Test
    public void test1661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest3.test1661");
        Register register0 = new Register();
        register0.registerUser("", "hi!");
        register0.loginUser("hi!", "hi!");
        register0.registerUser("hi!", "hi!");
        register0.runRegistrationSystem(0);
        register0.registerUser("hi!", "");
        java.lang.Class<?> wildcardClass15 = register0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test1662() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest3.test1662");
        Register register0 = new Register();
        register0.registerUser("hi!", "");
        register0.registerUser("hi!", "");
        register0.loginUser("hi!", "");
        register0.loginUser("hi!", "");
        register0.runRegistrationSystem(10);
        register0.runRegistrationSystem((int) (byte) 0);
    }

    @Test
    public void test1663() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest3.test1663");
        Register register0 = new Register();
        register0.loginUser("hi!", "hi!");
        register0.loginUser("hi!", "hi!");
        register0.loginUser("", "hi!");
        register0.loginUser("", "");
    }

    @Test
    public void test1664() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest3.test1664");
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
        register0.loginUser("hi!", "hi!");
        java.lang.Class<?> wildcardClass38 = register0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass38);
    }

    @Test
    public void test1665() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest3.test1665");
        Register register0 = new Register();
        register0.runRegistrationSystem((int) '#');
        register0.registerUser("", "hi!");
        register0.registerUser("", "hi!");
        register0.registerUser("", "");
        register0.runRegistrationSystem((int) (byte) 10);
        register0.runRegistrationSystem((int) (short) 100);
        register0.runRegistrationSystem((int) (short) 1);
        register0.runRegistrationSystem(0);
        register0.runRegistrationSystem((int) '#');
    }

    @Test
    public void test1666() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest3.test1666");
        Register register0 = new Register();
        register0.runRegistrationSystem((int) (short) 0);
        register0.loginUser("hi!", "hi!");
        register0.registerUser("", "");
        register0.runRegistrationSystem((-1));
        register0.runRegistrationSystem((int) (short) 10);
        register0.runRegistrationSystem((int) '4');
        register0.registerUser("", "hi!");
        register0.registerUser("", "");
        register0.loginUser("hi!", "hi!");
    }

    @Test
    public void test1667() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest3.test1667");
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
        register0.runRegistrationSystem((int) (byte) 0);
        register0.registerUser("hi!", "");
    }

    @Test
    public void test1668() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest3.test1668");
        Register register0 = new Register();
        register0.registerUser("hi!", "");
        register0.loginUser("", "hi!");
        register0.runRegistrationSystem((int) 'a');
        register0.loginUser("", "hi!");
        register0.loginUser("", "hi!");
        register0.registerUser("", "");
        register0.registerUser("hi!", "hi!");
        register0.loginUser("hi!", "");
        register0.runRegistrationSystem((int) (short) 100);
    }

    @Test
    public void test1669() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest3.test1669");
        Register register0 = new Register();
        register0.loginUser("hi!", "hi!");
        register0.registerUser("", "");
        register0.loginUser("hi!", "hi!");
        register0.registerUser("hi!", "hi!");
        register0.runRegistrationSystem(1);
    }

    @Test
    public void test1670() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest3.test1670");
        Register register0 = new Register();
        register0.registerUser("hi!", "");
        register0.loginUser("", "hi!");
        register0.runRegistrationSystem((int) 'a');
        register0.loginUser("", "hi!");
        register0.loginUser("", "hi!");
        register0.registerUser("", "");
        register0.runRegistrationSystem((int) '4');
        register0.runRegistrationSystem((int) (short) 0);
        register0.loginUser("", "");
    }

    @Test
    public void test1671() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest3.test1671");
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
        java.lang.Class<?> wildcardClass24 = register0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test1672() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest3.test1672");
        Register register0 = new Register();
        register0.runRegistrationSystem((int) (byte) -1);
        register0.registerUser("hi!", "");
        register0.loginUser("hi!", "hi!");
        register0.loginUser("hi!", "");
        register0.registerUser("hi!", "");
        register0.registerUser("hi!", "");
        register0.registerUser("hi!", "hi!");
        register0.registerUser("hi!", "hi!");
        java.lang.Class<?> wildcardClass24 = register0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test1673() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest3.test1673");
        Register register0 = new Register();
        register0.runRegistrationSystem((int) '#');
        register0.loginUser("hi!", "hi!");
        register0.runRegistrationSystem((int) (byte) 10);
        register0.registerUser("hi!", "");
        register0.registerUser("hi!", "hi!");
        register0.registerUser("", "");
        register0.runRegistrationSystem((int) '4');
        java.lang.Class<?> wildcardClass19 = register0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test1674() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest3.test1674");
        Register register0 = new Register();
        register0.registerUser("hi!", "");
        register0.registerUser("hi!", "");
        register0.loginUser("hi!", "");
        register0.loginUser("hi!", "");
        register0.runRegistrationSystem(10);
        register0.loginUser("", "");
        java.lang.Class<?> wildcardClass18 = register0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test1675() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest3.test1675");
        Register register0 = new Register();
        register0.loginUser("hi!", "hi!");
        register0.runRegistrationSystem(0);
        register0.loginUser("hi!", "");
        register0.loginUser("", "");
    }

    @Test
    public void test1676() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest3.test1676");
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
        register0.loginUser("", "hi!");
    }

    @Test
    public void test1677() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest3.test1677");
        Register register0 = new Register();
        register0.loginUser("hi!", "hi!");
        register0.runRegistrationSystem((int) (byte) 1);
        register0.runRegistrationSystem((int) (byte) 1);
        register0.registerUser("hi!", "");
        register0.runRegistrationSystem(100);
        java.lang.Class<?> wildcardClass13 = register0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test1678() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest3.test1678");
        Register register0 = new Register();
        register0.runRegistrationSystem((int) (short) 0);
        register0.loginUser("hi!", "hi!");
        register0.registerUser("", "");
        register0.runRegistrationSystem((-1));
        register0.runRegistrationSystem((int) (byte) 0);
        register0.runRegistrationSystem((int) (byte) 100);
        java.lang.Class<?> wildcardClass15 = register0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test1679() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest3.test1679");
        Register register0 = new Register();
        register0.loginUser("hi!", "hi!");
        register0.registerUser("hi!", "");
        register0.registerUser("", "");
        register0.registerUser("", "");
        register0.runRegistrationSystem((int) (byte) 100);
        register0.runRegistrationSystem((int) 'a');
        register0.loginUser("hi!", "hi!");
    }

    @Test
    public void test1680() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest3.test1680");
        Register register0 = new Register();
        register0.runRegistrationSystem((int) '#');
        register0.loginUser("hi!", "hi!");
        register0.runRegistrationSystem((int) (byte) 10);
        register0.registerUser("hi!", "hi!");
        register0.runRegistrationSystem((int) (byte) 100);
        register0.loginUser("", "");
        register0.runRegistrationSystem((int) (short) 0);
        java.lang.Class<?> wildcardClass18 = register0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test1681() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest3.test1681");
        Register register0 = new Register();
        register0.loginUser("hi!", "hi!");
        register0.runRegistrationSystem(0);
        register0.registerUser("", "");
        register0.loginUser("", "hi!");
        register0.registerUser("", "");
        register0.loginUser("", "");
        register0.loginUser("hi!", "");
        register0.runRegistrationSystem((int) ' ');
        register0.runRegistrationSystem((int) 'a');
    }

    @Test
    public void test1682() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest3.test1682");
        Register register0 = new Register();
        register0.runRegistrationSystem((int) (byte) -1);
        register0.registerUser("hi!", "");
        register0.loginUser("hi!", "hi!");
        register0.loginUser("hi!", "hi!");
        register0.runRegistrationSystem((int) (short) 1);
        register0.registerUser("hi!", "hi!");
        register0.runRegistrationSystem((int) ' ');
        register0.loginUser("hi!", "hi!");
    }

    @Test
    public void test1683() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest3.test1683");
        Register register0 = new Register();
        register0.runRegistrationSystem((int) (byte) -1);
        register0.registerUser("hi!", "");
        register0.loginUser("hi!", "hi!");
        register0.loginUser("hi!", "hi!");
        register0.runRegistrationSystem((int) (short) 1);
        register0.registerUser("hi!", "hi!");
        register0.registerUser("", "");
        register0.registerUser("hi!", "hi!");
        register0.registerUser("", "hi!");
    }

    @Test
    public void test1684() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest3.test1684");
        Register register0 = new Register();
        register0.runRegistrationSystem((int) (byte) -1);
        register0.registerUser("hi!", "");
        register0.runRegistrationSystem((int) (short) 1);
        register0.loginUser("", "");
        register0.loginUser("", "hi!");
        register0.registerUser("hi!", "hi!");
        register0.runRegistrationSystem((int) (short) 100);
        java.lang.Class<?> wildcardClass19 = register0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test1685() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest3.test1685");
        Register register0 = new Register();
        register0.registerUser("hi!", "");
        register0.loginUser("", "");
        register0.runRegistrationSystem((int) 'a');
        register0.runRegistrationSystem((int) (short) 100);
        register0.registerUser("hi!", "");
        register0.registerUser("hi!", "");
        java.lang.Class<?> wildcardClass17 = register0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test1686() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest3.test1686");
        Register register0 = new Register();
        register0.runRegistrationSystem((int) (byte) -1);
        register0.registerUser("hi!", "");
        register0.loginUser("hi!", "hi!");
        register0.loginUser("hi!", "");
        register0.registerUser("hi!", "");
        register0.registerUser("hi!", "hi!");
        register0.registerUser("", "hi!");
        register0.loginUser("", "hi!");
        register0.loginUser("hi!", "");
    }

    @Test
    public void test1687() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest3.test1687");
        Register register0 = new Register();
        register0.runRegistrationSystem((int) '#');
        register0.loginUser("hi!", "hi!");
        register0.loginUser("hi!", "hi!");
        register0.loginUser("hi!", "");
        register0.loginUser("", "");
        register0.runRegistrationSystem((int) (short) 10);
        register0.registerUser("", "hi!");
        register0.loginUser("hi!", "");
        register0.loginUser("hi!", "hi!");
        java.lang.Class<?> wildcardClass26 = register0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass26);
    }

    @Test
    public void test1688() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest3.test1688");
        Register register0 = new Register();
        register0.registerUser("hi!", "");
        register0.registerUser("hi!", "");
        register0.runRegistrationSystem((int) (byte) 0);
        register0.runRegistrationSystem((int) (short) 10);
        register0.registerUser("", "");
        register0.loginUser("hi!", "");
        register0.registerUser("hi!", "hi!");
    }

    @Test
    public void test1689() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest3.test1689");
        Register register0 = new Register();
        register0.loginUser("hi!", "hi!");
        register0.runRegistrationSystem(0);
        register0.registerUser("", "");
        register0.loginUser("", "hi!");
        register0.registerUser("", "");
        register0.runRegistrationSystem((int) '4');
        register0.loginUser("hi!", "hi!");
        register0.loginUser("hi!", "");
        java.lang.Class<?> wildcardClass23 = register0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test1690() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest3.test1690");
        Register register0 = new Register();
        register0.runRegistrationSystem((int) '#');
        register0.runRegistrationSystem((int) (short) 100);
        register0.runRegistrationSystem((int) '4');
        register0.loginUser("hi!", "");
        register0.registerUser("hi!", "hi!");
        register0.registerUser("hi!", "");
        register0.runRegistrationSystem((int) (byte) 1);
        java.lang.Class<?> wildcardClass18 = register0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test1691() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest3.test1691");
        Register register0 = new Register();
        register0.runRegistrationSystem((int) (byte) -1);
        register0.registerUser("hi!", "");
        register0.loginUser("hi!", "hi!");
        register0.loginUser("hi!", "");
        register0.runRegistrationSystem((int) (byte) -1);
        register0.loginUser("", "hi!");
        java.lang.Class<?> wildcardClass17 = register0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test1692() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest3.test1692");
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
        register0.runRegistrationSystem((int) ' ');
    }

    @Test
    public void test1693() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest3.test1693");
        Register register0 = new Register();
        register0.registerUser("hi!", "");
        register0.registerUser("hi!", "");
        register0.runRegistrationSystem((int) (byte) -1);
        register0.registerUser("hi!", "");
        register0.loginUser("", "hi!");
        register0.runRegistrationSystem(10);
        register0.loginUser("", "hi!");
    }

    @Test
    public void test1694() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest3.test1694");
        Register register0 = new Register();
        register0.runRegistrationSystem((int) (byte) -1);
        register0.registerUser("hi!", "");
        register0.runRegistrationSystem((int) (byte) -1);
        register0.loginUser("hi!", "hi!");
        register0.runRegistrationSystem(0);
        register0.registerUser("hi!", "");
        register0.loginUser("hi!", "hi!");
        register0.runRegistrationSystem((int) '4');
        register0.runRegistrationSystem((int) '#');
    }

    @Test
    public void test1695() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest3.test1695");
        Register register0 = new Register();
        register0.registerUser("hi!", "");
        register0.registerUser("hi!", "");
        register0.runRegistrationSystem((int) (byte) 0);
        register0.registerUser("", "");
        register0.loginUser("", "");
        register0.runRegistrationSystem(100);
        register0.runRegistrationSystem((int) '#');
    }

    @Test
    public void test1696() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest3.test1696");
        Register register0 = new Register();
        register0.registerUser("hi!", "");
        register0.registerUser("hi!", "");
        register0.runRegistrationSystem((int) (byte) 0);
        register0.registerUser("", "");
        register0.runRegistrationSystem((int) (byte) 10);
        register0.registerUser("", "hi!");
        register0.registerUser("hi!", "");
        register0.runRegistrationSystem((int) 'a');
        register0.registerUser("", "");
        register0.runRegistrationSystem((int) (short) 0);
    }

    @Test
    public void test1697() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest3.test1697");
        Register register0 = new Register();
        register0.loginUser("hi!", "hi!");
        register0.registerUser("hi!", "");
        register0.registerUser("hi!", "");
        register0.registerUser("", "");
        register0.runRegistrationSystem(100);
        register0.loginUser("", "");
        register0.runRegistrationSystem(0);
        java.lang.Class<?> wildcardClass20 = register0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test1698() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest3.test1698");
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
        java.lang.Class<?> wildcardClass27 = register0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test1699() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest3.test1699");
        Register register0 = new Register();
        register0.registerUser("hi!", "");
        register0.registerUser("hi!", "");
        register0.loginUser("hi!", "");
        register0.loginUser("", "hi!");
        register0.loginUser("", "");
        register0.registerUser("", "");
        register0.runRegistrationSystem((int) (byte) 10);
        register0.runRegistrationSystem((int) (short) -1);
        register0.loginUser("hi!", "");
    }

    @Test
    public void test1700() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest3.test1700");
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
        java.lang.Class<?> wildcardClass26 = register0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass26);
    }

    @Test
    public void test1701() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest3.test1701");
        Register register0 = new Register();
        register0.loginUser("hi!", "hi!");
        register0.runRegistrationSystem(0);
        register0.registerUser("", "");
        register0.runRegistrationSystem((-1));
        register0.loginUser("hi!", "");
        register0.registerUser("", "hi!");
        register0.loginUser("", "hi!");
    }

    @Test
    public void test1702() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest3.test1702");
        Register register0 = new Register();
        register0.registerUser("hi!", "");
        register0.loginUser("", "hi!");
        register0.loginUser("", "hi!");
        register0.runRegistrationSystem(10);
        register0.runRegistrationSystem((-1));
        register0.runRegistrationSystem((int) (short) 1);
        register0.registerUser("hi!", "hi!");
        register0.runRegistrationSystem((int) (short) 0);
    }

    @Test
    public void test1703() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest3.test1703");
        Register register0 = new Register();
        register0.runRegistrationSystem((int) (short) 0);
        register0.loginUser("hi!", "hi!");
        register0.registerUser("", "");
        register0.runRegistrationSystem((-1));
        register0.runRegistrationSystem((int) (short) 10);
        register0.runRegistrationSystem(10);
        register0.registerUser("hi!", "");
        register0.runRegistrationSystem((-1));
        register0.runRegistrationSystem(1);
        register0.loginUser("", "");
    }

    @Test
    public void test1704() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest3.test1704");
        Register register0 = new Register();
        register0.loginUser("hi!", "hi!");
        register0.registerUser("hi!", "");
        register0.registerUser("", "");
        register0.registerUser("hi!", "");
        register0.registerUser("hi!", "");
        register0.registerUser("", "");
        register0.loginUser("", "");
        register0.runRegistrationSystem((int) (short) 10);
        register0.registerUser("", "");
    }

    @Test
    public void test1705() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest3.test1705");
        Register register0 = new Register();
        register0.runRegistrationSystem((int) (short) 0);
        register0.loginUser("hi!", "hi!");
        register0.loginUser("", "");
        register0.registerUser("hi!", "");
        register0.registerUser("hi!", "hi!");
        register0.registerUser("", "hi!");
        register0.runRegistrationSystem((int) (short) 10);
        register0.runRegistrationSystem((int) '4');
    }

    @Test
    public void test1706() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest3.test1706");
        Register register0 = new Register();
        register0.loginUser("hi!", "hi!");
        register0.registerUser("hi!", "");
        register0.registerUser("hi!", "");
        register0.registerUser("", "hi!");
        register0.loginUser("", "");
        register0.runRegistrationSystem((int) (short) -1);
        register0.registerUser("hi!", "");
        register0.loginUser("", "");
        register0.runRegistrationSystem(0);
    }

    @Test
    public void test1707() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest3.test1707");
        Register register0 = new Register();
        register0.loginUser("hi!", "hi!");
        register0.registerUser("hi!", "");
        register0.registerUser("hi!", "");
        register0.registerUser("", "");
        register0.runRegistrationSystem((int) (short) 0);
        register0.loginUser("hi!", "hi!");
        register0.registerUser("", "hi!");
        register0.loginUser("hi!", "");
        register0.runRegistrationSystem((int) (byte) 1);
        register0.loginUser("", "hi!");
        java.lang.Class<?> wildcardClass29 = register0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass29);
    }

    @Test
    public void test1708() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest3.test1708");
        Register register0 = new Register();
        register0.loginUser("hi!", "hi!");
        register0.runRegistrationSystem(0);
        register0.registerUser("", "");
        register0.loginUser("", "hi!");
        register0.registerUser("", "");
        register0.registerUser("hi!", "hi!");
        register0.registerUser("hi!", "");
        register0.runRegistrationSystem((int) (short) 10);
        register0.runRegistrationSystem(100);
        register0.runRegistrationSystem((int) (byte) -1);
        register0.registerUser("", "hi!");
    }

    @Test
    public void test1709() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest3.test1709");
        Register register0 = new Register();
        register0.runRegistrationSystem((int) '#');
        register0.registerUser("", "hi!");
        register0.runRegistrationSystem((int) (short) 0);
        register0.runRegistrationSystem((int) (byte) 1);
        register0.runRegistrationSystem((int) 'a');
        register0.registerUser("hi!", "hi!");
        register0.registerUser("", "");
        register0.registerUser("", "hi!");
        register0.registerUser("hi!", "");
        register0.loginUser("", "hi!");
    }

    @Test
    public void test1710() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest3.test1710");
        Register register0 = new Register();
        register0.runRegistrationSystem((int) (byte) -1);
        register0.registerUser("hi!", "");
        register0.runRegistrationSystem((int) (short) 1);
        register0.loginUser("", "hi!");
        register0.runRegistrationSystem((int) '4');
        register0.registerUser("hi!", "");
        register0.runRegistrationSystem((int) (short) 1);
        java.lang.Class<?> wildcardClass18 = register0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test1711() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest3.test1711");
        Register register0 = new Register();
        register0.registerUser("hi!", "");
        register0.loginUser("", "hi!");
        register0.runRegistrationSystem((int) (byte) -1);
        register0.loginUser("", "");
        register0.loginUser("hi!", "");
        register0.registerUser("hi!", "hi!");
        register0.runRegistrationSystem(0);
    }

    @Test
    public void test1712() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest3.test1712");
        Register register0 = new Register();
        register0.runRegistrationSystem((int) (short) 0);
        register0.loginUser("hi!", "hi!");
        register0.registerUser("", "");
        register0.runRegistrationSystem((int) '#');
        register0.registerUser("", "hi!");
        register0.registerUser("", "hi!");
        register0.registerUser("", "");
        register0.loginUser("hi!", "");
        register0.loginUser("hi!", "hi!");
        register0.loginUser("", "");
        register0.runRegistrationSystem((int) '4');
        register0.loginUser("hi!", "");
    }

    @Test
    public void test1713() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest3.test1713");
        Register register0 = new Register();
        register0.registerUser("hi!", "");
        register0.registerUser("hi!", "");
        register0.runRegistrationSystem((int) (byte) 0);
        register0.registerUser("", "");
        register0.runRegistrationSystem((int) (byte) 10);
        register0.registerUser("", "hi!");
        register0.registerUser("hi!", "");
        register0.runRegistrationSystem(0);
        register0.loginUser("", "hi!");
        register0.runRegistrationSystem((int) (short) -1);
    }

    @Test
    public void test1714() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest3.test1714");
        Register register0 = new Register();
        register0.runRegistrationSystem((int) (short) 0);
        register0.loginUser("hi!", "hi!");
        register0.registerUser("", "");
        register0.runRegistrationSystem((-1));
        register0.runRegistrationSystem((int) (short) 10);
        register0.runRegistrationSystem(10);
        register0.loginUser("hi!", "");
        register0.registerUser("", "hi!");
        register0.loginUser("", "");
    }

    @Test
    public void test1715() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest3.test1715");
        Register register0 = new Register();
        register0.runRegistrationSystem((int) (short) 0);
        register0.loginUser("hi!", "hi!");
        register0.registerUser("", "");
        register0.runRegistrationSystem((int) '#');
        register0.runRegistrationSystem((int) (byte) 0);
        register0.registerUser("", "");
        register0.runRegistrationSystem((int) (byte) 10);
        register0.registerUser("", "");
        java.lang.Class<?> wildcardClass21 = register0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test1716() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest3.test1716");
        Register register0 = new Register();
        register0.loginUser("hi!", "hi!");
        register0.runRegistrationSystem(0);
        register0.registerUser("", "");
        register0.registerUser("", "hi!");
        register0.loginUser("hi!", "");
        register0.registerUser("", "");
        register0.runRegistrationSystem((-1));
        register0.loginUser("hi!", "hi!");
    }

    @Test
    public void test1717() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest3.test1717");
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
        register0.registerUser("hi!", "hi!");
    }

    @Test
    public void test1718() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest3.test1718");
        Register register0 = new Register();
        register0.registerUser("", "");
        register0.registerUser("", "hi!");
        register0.registerUser("", "");
        register0.loginUser("hi!", "");
        register0.runRegistrationSystem((int) (short) 0);
        register0.runRegistrationSystem((int) (short) -1);
        register0.loginUser("", "hi!");
    }

    @Test
    public void test1719() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest3.test1719");
        Register register0 = new Register();
        register0.loginUser("hi!", "hi!");
        register0.registerUser("hi!", "");
        register0.registerUser("", "");
        register0.registerUser("", "");
        register0.loginUser("hi!", "hi!");
        register0.loginUser("", "");
        register0.registerUser("hi!", "hi!");
        register0.registerUser("", "");
    }

    @Test
    public void test1720() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest3.test1720");
        Register register0 = new Register();
        register0.runRegistrationSystem((int) (short) 0);
        register0.loginUser("hi!", "hi!");
        register0.registerUser("", "");
        register0.runRegistrationSystem((-1));
        register0.loginUser("", "hi!");
        register0.loginUser("", "");
        register0.runRegistrationSystem((int) ' ');
        register0.runRegistrationSystem((int) ' ');
        register0.loginUser("", "");
    }

    @Test
    public void test1721() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest3.test1721");
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
        register0.runRegistrationSystem((int) '4');
        java.lang.Class<?> wildcardClass28 = register0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test1722() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest3.test1722");
        Register register0 = new Register();
        register0.loginUser("", "hi!");
        register0.loginUser("", "hi!");
        register0.loginUser("hi!", "hi!");
        register0.registerUser("", "");
        register0.runRegistrationSystem((-1));
        register0.registerUser("", "");
        register0.registerUser("hi!", "hi!");
    }

    @Test
    public void test1723() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest3.test1723");
        Register register0 = new Register();
        register0.registerUser("hi!", "");
        register0.loginUser("", "hi!");
        register0.runRegistrationSystem((int) 'a');
        register0.loginUser("", "hi!");
        register0.loginUser("", "hi!");
        register0.runRegistrationSystem((int) ' ');
        register0.registerUser("hi!", "hi!");
        register0.loginUser("hi!", "");
    }

    @Test
    public void test1724() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest3.test1724");
        Register register0 = new Register();
        register0.loginUser("hi!", "hi!");
        register0.registerUser("hi!", "");
        register0.registerUser("", "");
        register0.runRegistrationSystem((int) (byte) 100);
        register0.loginUser("", "hi!");
        register0.registerUser("", "hi!");
        register0.registerUser("", "hi!");
    }

    @Test
    public void test1725() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest3.test1725");
        Register register0 = new Register();
        register0.runRegistrationSystem((int) (short) 0);
        register0.loginUser("hi!", "hi!");
        register0.registerUser("", "");
        register0.loginUser("", "");
        register0.loginUser("hi!", "");
        java.lang.Class<?> wildcardClass15 = register0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test1726() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest3.test1726");
        Register register0 = new Register();
        register0.runRegistrationSystem((int) (short) 0);
        register0.loginUser("hi!", "hi!");
        register0.registerUser("", "");
        register0.runRegistrationSystem((int) '#');
        register0.loginUser("", "hi!");
        register0.registerUser("hi!", "hi!");
        register0.registerUser("", "hi!");
        register0.runRegistrationSystem((int) (short) -1);
    }

    @Test
    public void test1727() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest3.test1727");
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
        register0.runRegistrationSystem(100);
    }

    @Test
    public void test1728() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest3.test1728");
        Register register0 = new Register();
        register0.runRegistrationSystem((int) '#');
        register0.runRegistrationSystem((int) (short) 100);
        register0.runRegistrationSystem((int) '4');
        register0.loginUser("hi!", "");
        register0.loginUser("", "");
        register0.loginUser("", "hi!");
        java.lang.Class<?> wildcardClass16 = register0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test1729() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest3.test1729");
        Register register0 = new Register();
        register0.runRegistrationSystem((int) '#');
        register0.registerUser("", "hi!");
        register0.runRegistrationSystem((int) (short) 0);
        register0.runRegistrationSystem((int) (byte) 1);
        register0.runRegistrationSystem((int) (byte) 0);
        register0.registerUser("hi!", "");
        register0.loginUser("hi!", "");
        java.lang.Class<?> wildcardClass18 = register0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test1730() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest3.test1730");
        Register register0 = new Register();
        register0.registerUser("", "hi!");
        register0.loginUser("hi!", "hi!");
        register0.registerUser("hi!", "hi!");
        register0.loginUser("", "hi!");
    }

    @Test
    public void test1731() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest3.test1731");
        Register register0 = new Register();
        register0.runRegistrationSystem((int) (byte) -1);
        register0.runRegistrationSystem((int) (short) 10);
        register0.runRegistrationSystem(10);
        register0.loginUser("", "");
        register0.registerUser("hi!", "hi!");
        register0.runRegistrationSystem((int) (short) 10);
        register0.loginUser("hi!", "hi!");
        register0.runRegistrationSystem((int) (short) 1);
    }

    @Test
    public void test1732() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest3.test1732");
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
        register0.loginUser("", "");
    }

    @Test
    public void test1733() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest3.test1733");
        Register register0 = new Register();
        register0.registerUser("hi!", "");
        register0.loginUser("", "");
        register0.runRegistrationSystem((int) 'a');
        register0.loginUser("", "");
        register0.runRegistrationSystem((int) (byte) 100);
        register0.registerUser("", "hi!");
        register0.loginUser("hi!", "");
    }

    @Test
    public void test1734() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest3.test1734");
        Register register0 = new Register();
        register0.runRegistrationSystem((int) (byte) -1);
        register0.registerUser("hi!", "");
        register0.loginUser("hi!", "hi!");
        register0.loginUser("hi!", "");
        register0.runRegistrationSystem((int) (byte) -1);
        register0.registerUser("hi!", "hi!");
        register0.runRegistrationSystem((int) '#');
        register0.loginUser("", "hi!");
    }

    @Test
    public void test1735() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest3.test1735");
        Register register0 = new Register();
        register0.loginUser("hi!", "hi!");
        register0.registerUser("hi!", "");
        register0.registerUser("hi!", "");
        register0.registerUser("", "hi!");
        register0.loginUser("", "");
        register0.runRegistrationSystem((int) (short) 10);
        register0.registerUser("", "");
    }

    @Test
    public void test1736() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest3.test1736");
        Register register0 = new Register();
        register0.runRegistrationSystem((int) '#');
        register0.registerUser("", "hi!");
        register0.runRegistrationSystem((int) (short) 0);
        register0.runRegistrationSystem((int) (byte) 1);
        register0.runRegistrationSystem((int) 'a');
        register0.registerUser("hi!", "hi!");
        register0.registerUser("", "");
        register0.loginUser("", "hi!");
        register0.registerUser("hi!", "hi!");
        register0.loginUser("", "");
    }

    @Test
    public void test1737() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest3.test1737");
        Register register0 = new Register();
        register0.registerUser("hi!", "");
        register0.registerUser("hi!", "");
        register0.runRegistrationSystem((int) (byte) 0);
        register0.registerUser("", "");
        register0.runRegistrationSystem((int) (byte) 10);
        register0.registerUser("", "hi!");
        register0.registerUser("hi!", "");
        register0.runRegistrationSystem(0);
        register0.loginUser("", "");
        register0.runRegistrationSystem((int) ' ');
    }

    @Test
    public void test1738() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest3.test1738");
        Register register0 = new Register();
        register0.runRegistrationSystem((int) '#');
        register0.registerUser("", "hi!");
        register0.runRegistrationSystem((int) (short) 0);
        register0.runRegistrationSystem((int) (byte) 1);
        register0.registerUser("", "");
        register0.runRegistrationSystem((int) (short) 10);
        register0.registerUser("hi!", "");
        register0.loginUser("hi!", "hi!");
        register0.runRegistrationSystem(0);
    }

    @Test
    public void test1739() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest3.test1739");
        Register register0 = new Register();
        register0.registerUser("hi!", "");
        register0.loginUser("", "hi!");
        register0.runRegistrationSystem((int) (byte) -1);
        register0.loginUser("", "");
        register0.loginUser("hi!", "");
        register0.runRegistrationSystem((int) (byte) 1);
        register0.loginUser("hi!", "hi!");
    }

    @Test
    public void test1740() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest3.test1740");
        Register register0 = new Register();
        register0.loginUser("hi!", "hi!");
        register0.registerUser("hi!", "hi!");
        register0.registerUser("", "hi!");
        register0.registerUser("hi!", "");
        register0.loginUser("hi!", "hi!");
        register0.runRegistrationSystem((int) (byte) -1);
        register0.registerUser("hi!", "");
    }

    @Test
    public void test1741() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest3.test1741");
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
        register0.loginUser("hi!", "hi!");
        java.lang.Class<?> wildcardClass32 = register0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass32);
    }

    @Test
    public void test1742() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest3.test1742");
        Register register0 = new Register();
        register0.runRegistrationSystem((int) (byte) -1);
        register0.runRegistrationSystem((int) '#');
        register0.loginUser("", "");
        register0.registerUser("hi!", "");
        register0.runRegistrationSystem(0);
        register0.runRegistrationSystem((int) (short) 10);
        register0.runRegistrationSystem((int) (byte) 1);
        java.lang.Class<?> wildcardClass17 = register0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test1743() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest3.test1743");
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
        register0.loginUser("", "");
    }

    @Test
    public void test1744() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest3.test1744");
        Register register0 = new Register();
        register0.registerUser("hi!", "");
        register0.loginUser("", "hi!");
        register0.loginUser("", "hi!");
        register0.runRegistrationSystem(10);
        register0.loginUser("", "");
        register0.runRegistrationSystem((int) (byte) 10);
        register0.runRegistrationSystem((int) (short) 100);
        register0.registerUser("hi!", "");
    }

    @Test
    public void test1745() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest3.test1745");
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
        register0.loginUser("hi!", "hi!");
        java.lang.Class<?> wildcardClass26 = register0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass26);
    }

    @Test
    public void test1746() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest3.test1746");
        Register register0 = new Register();
        register0.registerUser("hi!", "");
        register0.registerUser("hi!", "");
        register0.runRegistrationSystem((int) (byte) 0);
        register0.registerUser("", "");
        register0.runRegistrationSystem((int) (byte) 10);
        register0.registerUser("", "hi!");
        register0.registerUser("hi!", "");
        register0.runRegistrationSystem(0);
        java.lang.Class<?> wildcardClass22 = register0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test1747() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest3.test1747");
        Register register0 = new Register();
        register0.runRegistrationSystem((int) (short) 0);
        register0.loginUser("hi!", "hi!");
        register0.registerUser("", "");
        register0.runRegistrationSystem((-1));
        register0.runRegistrationSystem((int) (short) 0);
        register0.registerUser("", "");
        register0.runRegistrationSystem((int) (short) -1);
        register0.loginUser("", "");
    }

    @Test
    public void test1748() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest3.test1748");
        Register register0 = new Register();
        register0.loginUser("hi!", "hi!");
        register0.loginUser("hi!", "hi!");
        register0.registerUser("", "");
        register0.runRegistrationSystem((int) (short) 10);
        java.lang.Class<?> wildcardClass12 = register0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test1749() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest3.test1749");
        Register register0 = new Register();
        register0.runRegistrationSystem((int) (byte) -1);
        register0.runRegistrationSystem((int) (byte) 10);
        register0.registerUser("", "");
        register0.loginUser("", "");
        register0.registerUser("", "hi!");
        register0.registerUser("", "hi!");
        register0.loginUser("hi!", "");
        register0.registerUser("", "");
        register0.runRegistrationSystem((int) (short) 100);
    }

    @Test
    public void test1750() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest3.test1750");
        Register register0 = new Register();
        register0.loginUser("hi!", "hi!");
        register0.registerUser("", "");
        register0.registerUser("", "hi!");
        register0.registerUser("hi!", "hi!");
    }

    @Test
    public void test1751() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest3.test1751");
        Register register0 = new Register();
        register0.registerUser("hi!", "");
        register0.loginUser("", "hi!");
        register0.runRegistrationSystem((int) 'a');
        register0.loginUser("", "hi!");
        register0.loginUser("", "hi!");
        register0.registerUser("", "hi!");
        register0.registerUser("", "");
        java.lang.Class<?> wildcardClass21 = register0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test1752() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest3.test1752");
        Register register0 = new Register();
        register0.runRegistrationSystem((int) '#');
        register0.registerUser("", "hi!");
        register0.registerUser("hi!", "");
        register0.loginUser("hi!", "hi!");
        java.lang.Class<?> wildcardClass12 = register0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test1753() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest3.test1753");
        Register register0 = new Register();
        register0.loginUser("hi!", "hi!");
        register0.runRegistrationSystem(0);
        register0.registerUser("", "");
        register0.loginUser("", "hi!");
        register0.registerUser("", "");
        register0.loginUser("", "hi!");
        register0.loginUser("", "hi!");
        register0.registerUser("", "hi!");
        register0.runRegistrationSystem((int) (short) 1);
    }

    @Test
    public void test1754() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest3.test1754");
        Register register0 = new Register();
        register0.runRegistrationSystem((int) (short) 0);
        register0.loginUser("hi!", "hi!");
        register0.registerUser("", "");
        register0.runRegistrationSystem((-1));
        register0.registerUser("", "");
        register0.runRegistrationSystem((int) (byte) -1);
        register0.registerUser("hi!", "hi!");
        register0.loginUser("", "hi!");
    }

    @Test
    public void test1755() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest3.test1755");
        Register register0 = new Register();
        register0.runRegistrationSystem((int) '#');
        register0.loginUser("hi!", "hi!");
        register0.loginUser("hi!", "hi!");
        register0.loginUser("hi!", "");
        register0.loginUser("", "");
        register0.runRegistrationSystem((int) (short) 10);
        register0.runRegistrationSystem((int) (byte) 1);
        register0.loginUser("", "");
        register0.runRegistrationSystem(0);
        register0.registerUser("hi!", "");
        java.lang.Class<?> wildcardClass27 = register0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test1756() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest3.test1756");
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
        java.lang.Class<?> wildcardClass26 = register0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass26);
    }

    @Test
    public void test1757() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest3.test1757");
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
        register0.loginUser("", "");
    }

    @Test
    public void test1758() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest3.test1758");
        Register register0 = new Register();
        register0.registerUser("hi!", "");
        register0.registerUser("hi!", "");
        register0.loginUser("hi!", "");
        register0.loginUser("hi!", "");
        register0.runRegistrationSystem(10);
        register0.loginUser("", "");
        register0.loginUser("", "");
        register0.registerUser("hi!", "hi!");
    }

    @Test
    public void test1759() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest3.test1759");
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
        register0.loginUser("", "");
        register0.loginUser("", "hi!");
    }

    @Test
    public void test1760() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest3.test1760");
        Register register0 = new Register();
        register0.runRegistrationSystem((int) (byte) -1);
        register0.runRegistrationSystem((int) (byte) 10);
        register0.registerUser("", "");
        register0.loginUser("", "");
        register0.registerUser("", "hi!");
        register0.registerUser("", "hi!");
        register0.registerUser("hi!", "hi!");
        register0.runRegistrationSystem(10);
    }

    @Test
    public void test1761() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest3.test1761");
        Register register0 = new Register();
        register0.runRegistrationSystem((int) (byte) -1);
        register0.registerUser("hi!", "");
        register0.registerUser("", "hi!");
        register0.loginUser("hi!", "hi!");
        register0.registerUser("hi!", "hi!");
        register0.runRegistrationSystem((int) (short) 0);
        register0.registerUser("hi!", "");
        java.lang.Class<?> wildcardClass20 = register0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test1762() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest3.test1762");
        Register register0 = new Register();
        register0.loginUser("hi!", "hi!");
        register0.runRegistrationSystem(0);
        register0.registerUser("", "");
        register0.loginUser("", "hi!");
        register0.registerUser("", "");
        register0.loginUser("", "");
        register0.loginUser("hi!", "");
        register0.loginUser("hi!", "hi!");
    }

    @Test
    public void test1763() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest3.test1763");
        Register register0 = new Register();
        register0.registerUser("hi!", "");
        register0.loginUser("", "");
        register0.runRegistrationSystem((int) 'a');
        register0.registerUser("", "");
        register0.registerUser("hi!", "hi!");
        register0.registerUser("hi!", "hi!");
    }

    @Test
    public void test1764() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest3.test1764");
        Register register0 = new Register();
        register0.runRegistrationSystem((int) '#');
        register0.loginUser("hi!", "hi!");
        register0.loginUser("hi!", "hi!");
        register0.loginUser("hi!", "");
        register0.loginUser("", "");
        register0.runRegistrationSystem((int) (short) 10);
        register0.registerUser("", "");
        register0.loginUser("hi!", "hi!");
        register0.loginUser("", "hi!");
    }

    @Test
    public void test1765() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest3.test1765");
        Register register0 = new Register();
        register0.loginUser("hi!", "hi!");
        register0.registerUser("hi!", "");
        register0.registerUser("", "");
        register0.registerUser("hi!", "");
        register0.registerUser("hi!", "");
        register0.registerUser("", "");
        register0.runRegistrationSystem(100);
        register0.runRegistrationSystem(1);
        java.lang.Class<?> wildcardClass23 = register0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test1766() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest3.test1766");
        Register register0 = new Register();
        register0.runRegistrationSystem((int) (byte) -1);
        register0.registerUser("hi!", "");
        register0.runRegistrationSystem((int) (short) 1);
        register0.loginUser("", "hi!");
        register0.registerUser("hi!", "hi!");
        register0.loginUser("", "");
        register0.runRegistrationSystem((-1));
        java.lang.Class<?> wildcardClass19 = register0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test1767() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest3.test1767");
        Register register0 = new Register();
        register0.registerUser("", "hi!");
        register0.registerUser("", "hi!");
        register0.registerUser("hi!", "");
        register0.runRegistrationSystem((int) '#');
        register0.registerUser("hi!", "");
        java.lang.Class<?> wildcardClass15 = register0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test1768() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest3.test1768");
        Register register0 = new Register();
        register0.runRegistrationSystem((int) '#');
        register0.registerUser("", "hi!");
        register0.runRegistrationSystem((int) (short) 0);
        register0.runRegistrationSystem((int) (byte) 1);
        register0.runRegistrationSystem((int) (byte) 0);
        register0.runRegistrationSystem((int) ' ');
        register0.runRegistrationSystem((int) (short) 1);
        register0.runRegistrationSystem((int) (short) 100);
        register0.loginUser("hi!", "");
        java.lang.Class<?> wildcardClass21 = register0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test1769() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest3.test1769");
        Register register0 = new Register();
        register0.runRegistrationSystem((int) (short) 0);
        register0.loginUser("hi!", "hi!");
        register0.registerUser("", "");
        register0.runRegistrationSystem((-1));
        register0.runRegistrationSystem((int) (short) 10);
        register0.runRegistrationSystem(0);
        register0.loginUser("hi!", "hi!");
        register0.loginUser("hi!", "");
    }

    @Test
    public void test1770() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest3.test1770");
        Register register0 = new Register();
        register0.registerUser("hi!", "");
        register0.loginUser("", "hi!");
        register0.runRegistrationSystem((int) (byte) -1);
        register0.runRegistrationSystem(1);
        register0.loginUser("hi!", "");
        register0.runRegistrationSystem((int) (short) -1);
        register0.registerUser("hi!", "");
        java.lang.Class<?> wildcardClass19 = register0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test1771() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest3.test1771");
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
        register0.runRegistrationSystem(1);
    }

    @Test
    public void test1772() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest3.test1772");
        Register register0 = new Register();
        register0.runRegistrationSystem((int) (byte) -1);
        register0.runRegistrationSystem((int) (short) 10);
        register0.runRegistrationSystem((int) (byte) -1);
        register0.runRegistrationSystem(10);
        register0.registerUser("", "");
        register0.registerUser("", "hi!");
        register0.runRegistrationSystem((-1));
        java.lang.Class<?> wildcardClass17 = register0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test1773() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest3.test1773");
        Register register0 = new Register();
        register0.runRegistrationSystem((int) (short) 0);
        register0.loginUser("hi!", "hi!");
        register0.registerUser("", "");
        register0.runRegistrationSystem((int) '#');
        register0.registerUser("", "hi!");
        register0.registerUser("", "hi!");
        register0.registerUser("", "");
        register0.runRegistrationSystem((int) (short) 0);
    }

    @Test
    public void test1774() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest3.test1774");
        Register register0 = new Register();
        register0.registerUser("hi!", "");
        register0.registerUser("hi!", "");
        register0.loginUser("hi!", "");
        register0.loginUser("", "hi!");
        register0.loginUser("hi!", "");
        register0.loginUser("", "hi!");
        register0.loginUser("", "hi!");
        register0.loginUser("hi!", "hi!");
        register0.runRegistrationSystem((int) '4');
        java.lang.Class<?> wildcardClass27 = register0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test1775() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest3.test1775");
        Register register0 = new Register();
        register0.runRegistrationSystem((int) (byte) -1);
        register0.runRegistrationSystem((int) (byte) 10);
        register0.registerUser("", "");
        register0.loginUser("", "");
        register0.registerUser("", "hi!");
        register0.registerUser("", "hi!");
        register0.loginUser("", "");
        register0.registerUser("", "");
        register0.runRegistrationSystem((int) (byte) 1);
    }

    @Test
    public void test1776() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest3.test1776");
        Register register0 = new Register();
        register0.runRegistrationSystem((int) (short) 0);
        register0.loginUser("hi!", "hi!");
        register0.registerUser("", "");
        register0.runRegistrationSystem((-1));
        register0.runRegistrationSystem((int) (short) 0);
        register0.runRegistrationSystem((int) (byte) -1);
        register0.runRegistrationSystem((int) (short) 1);
        java.lang.Class<?> wildcardClass17 = register0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test1777() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest3.test1777");
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
        register0.loginUser("", "");
    }

    @Test
    public void test1778() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest3.test1778");
        Register register0 = new Register();
        register0.runRegistrationSystem((int) (short) 0);
        register0.loginUser("hi!", "hi!");
        register0.loginUser("hi!", "");
        register0.loginUser("", "hi!");
        register0.registerUser("hi!", "hi!");
        register0.loginUser("hi!", "hi!");
        java.lang.Class<?> wildcardClass18 = register0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test1779() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest3.test1779");
        Register register0 = new Register();
        register0.loginUser("hi!", "hi!");
        register0.loginUser("", "hi!");
        register0.runRegistrationSystem((int) (byte) 0);
        register0.registerUser("", "");
        register0.runRegistrationSystem((int) (byte) 0);
        register0.loginUser("hi!", "hi!");
        register0.registerUser("", "hi!");
    }

    @Test
    public void test1780() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest3.test1780");
        Register register0 = new Register();
        register0.runRegistrationSystem((int) (short) 0);
        register0.loginUser("hi!", "hi!");
        register0.registerUser("", "");
        register0.runRegistrationSystem((-1));
        register0.runRegistrationSystem((int) (short) 0);
        register0.registerUser("", "");
        java.lang.Class<?> wildcardClass16 = register0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test1781() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest3.test1781");
        Register register0 = new Register();
        register0.loginUser("hi!", "hi!");
        register0.runRegistrationSystem(0);
        register0.loginUser("", "hi!");
        register0.registerUser("hi!", "");
    }

    @Test
    public void test1782() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest3.test1782");
        Register register0 = new Register();
        register0.loginUser("hi!", "hi!");
        register0.runRegistrationSystem(0);
        register0.registerUser("", "");
        register0.loginUser("", "hi!");
        register0.runRegistrationSystem((int) 'a');
        register0.runRegistrationSystem((int) (byte) -1);
    }

    @Test
    public void test1783() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest3.test1783");
        Register register0 = new Register();
        register0.runRegistrationSystem((int) '#');
        register0.registerUser("", "hi!");
        register0.loginUser("hi!", "hi!");
        register0.loginUser("", "hi!");
        register0.runRegistrationSystem((int) (short) 100);
        register0.registerUser("", "hi!");
    }

    @Test
    public void test1784() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest3.test1784");
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
        register0.loginUser("hi!", "");
    }

    @Test
    public void test1785() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest3.test1785");
        Register register0 = new Register();
        register0.runRegistrationSystem((int) (short) 0);
        register0.loginUser("hi!", "hi!");
        register0.registerUser("", "");
        register0.runRegistrationSystem((-1));
        register0.registerUser("", "");
        register0.loginUser("", "");
        register0.loginUser("hi!", "hi!");
        java.lang.Class<?> wildcardClass20 = register0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test1786() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest3.test1786");
        Register register0 = new Register();
        register0.registerUser("hi!", "");
        register0.runRegistrationSystem(1);
        register0.registerUser("", "");
        register0.runRegistrationSystem((int) (short) -1);
        register0.loginUser("", "");
        register0.registerUser("", "hi!");
        register0.runRegistrationSystem(1);
    }

    @Test
    public void test1787() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest3.test1787");
        Register register0 = new Register();
        register0.loginUser("hi!", "hi!");
        register0.runRegistrationSystem(0);
        register0.registerUser("", "");
        register0.loginUser("", "hi!");
        register0.registerUser("", "");
        register0.registerUser("hi!", "hi!");
        register0.registerUser("hi!", "");
        register0.runRegistrationSystem((int) (short) 10);
        register0.registerUser("", "");
        register0.loginUser("", "");
    }

    @Test
    public void test1788() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest3.test1788");
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
        register0.loginUser("", "hi!");
    }

    @Test
    public void test1789() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest3.test1789");
        Register register0 = new Register();
        register0.loginUser("hi!", "hi!");
        register0.registerUser("hi!", "");
        register0.registerUser("hi!", "");
        register0.registerUser("", "hi!");
        register0.loginUser("", "");
        register0.runRegistrationSystem((int) (short) -1);
        register0.loginUser("hi!", "");
        register0.registerUser("", "hi!");
        register0.loginUser("", "");
    }

    @Test
    public void test1790() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest3.test1790");
        Register register0 = new Register();
        register0.registerUser("hi!", "");
        register0.loginUser("", "hi!");
        register0.runRegistrationSystem((int) (byte) -1);
        register0.loginUser("", "");
        register0.runRegistrationSystem((int) (short) 100);
        register0.loginUser("", "");
        register0.registerUser("hi!", "");
    }

    @Test
    public void test1791() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest3.test1791");
        Register register0 = new Register();
        register0.loginUser("hi!", "hi!");
        register0.registerUser("hi!", "");
        register0.registerUser("hi!", "");
        register0.registerUser("", "hi!");
        register0.loginUser("", "");
        register0.runRegistrationSystem((int) (byte) 100);
        register0.loginUser("", "hi!");
        java.lang.Class<?> wildcardClass21 = register0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test1792() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest3.test1792");
        Register register0 = new Register();
        register0.runRegistrationSystem((int) '#');
        register0.loginUser("hi!", "hi!");
        register0.registerUser("", "");
        register0.registerUser("hi!", "");
        register0.runRegistrationSystem((int) (byte) 10);
        register0.loginUser("", "");
    }

    @Test
    public void test1793() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest3.test1793");
        Register register0 = new Register();
        register0.loginUser("hi!", "hi!");
        register0.registerUser("hi!", "hi!");
        register0.loginUser("hi!", "hi!");
        register0.runRegistrationSystem(100);
        register0.loginUser("", "hi!");
        register0.runRegistrationSystem((int) '4');
    }

    @Test
    public void test1794() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest3.test1794");
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
        java.lang.Class<?> wildcardClass22 = register0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test1795() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest3.test1795");
        Register register0 = new Register();
        register0.registerUser("hi!", "");
        register0.registerUser("hi!", "");
        register0.loginUser("hi!", "");
        register0.registerUser("", "hi!");
        register0.registerUser("hi!", "");
        register0.loginUser("", "hi!");
        register0.runRegistrationSystem((int) '#');
        register0.runRegistrationSystem((int) (byte) 1);
        java.lang.Class<?> wildcardClass23 = register0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test1796() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest3.test1796");
        Register register0 = new Register();
        register0.registerUser("hi!", "");
        register0.registerUser("hi!", "");
        register0.loginUser("hi!", "");
        register0.registerUser("", "hi!");
        register0.runRegistrationSystem((int) (byte) 1);
    }

    @Test
    public void test1797() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest3.test1797");
        Register register0 = new Register();
        register0.runRegistrationSystem((int) '#');
        register0.registerUser("", "hi!");
        register0.runRegistrationSystem((int) (short) 0);
        register0.runRegistrationSystem((int) (byte) 1);
        register0.registerUser("", "");
        register0.loginUser("", "");
        register0.runRegistrationSystem(100);
        register0.runRegistrationSystem((int) (short) 10);
        register0.loginUser("", "hi!");
        java.lang.Class<?> wildcardClass23 = register0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test1798() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest3.test1798");
        Register register0 = new Register();
        register0.loginUser("hi!", "hi!");
        register0.loginUser("hi!", "hi!");
        register0.registerUser("", "");
        register0.runRegistrationSystem((int) (byte) 1);
        register0.runRegistrationSystem((int) (short) 10);
        register0.runRegistrationSystem((int) (short) 1);
        register0.loginUser("hi!", "");
        register0.registerUser("", "");
    }

    @Test
    public void test1799() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest3.test1799");
        Register register0 = new Register();
        register0.runRegistrationSystem((int) (byte) -1);
        register0.registerUser("hi!", "");
        register0.runRegistrationSystem((int) (byte) -1);
        register0.runRegistrationSystem((int) 'a');
        register0.loginUser("", "hi!");
        register0.runRegistrationSystem((int) (byte) 10);
    }

    @Test
    public void test1800() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest3.test1800");
        Register register0 = new Register();
        register0.runRegistrationSystem((int) '#');
        register0.registerUser("", "hi!");
        register0.registerUser("", "hi!");
        register0.registerUser("", "");
        register0.runRegistrationSystem((int) (byte) 10);
        register0.runRegistrationSystem((int) (short) 100);
        register0.runRegistrationSystem((int) (short) 1);
        register0.registerUser("", "");
        register0.runRegistrationSystem((int) (short) 10);
    }

    @Test
    public void test1801() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest3.test1801");
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
        register0.registerUser("hi!", "");
    }

    @Test
    public void test1802() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest3.test1802");
        Register register0 = new Register();
        register0.runRegistrationSystem((int) (byte) -1);
        register0.registerUser("hi!", "");
        register0.loginUser("hi!", "hi!");
        register0.loginUser("hi!", "");
        register0.loginUser("hi!", "");
        register0.loginUser("hi!", "hi!");
        register0.loginUser("hi!", "");
    }

    @Test
    public void test1803() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest3.test1803");
        Register register0 = new Register();
        register0.runRegistrationSystem((int) (short) 0);
        register0.loginUser("hi!", "hi!");
        register0.registerUser("", "");
        register0.runRegistrationSystem((int) '#');
        register0.runRegistrationSystem((int) (byte) 0);
        register0.registerUser("", "");
        register0.loginUser("", "hi!");
    }

    @Test
    public void test1804() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest3.test1804");
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
        register0.registerUser("hi!", "hi!");
        register0.runRegistrationSystem(100);
        java.lang.Class<?> wildcardClass30 = register0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass30);
    }

    @Test
    public void test1805() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest3.test1805");
        Register register0 = new Register();
        register0.runRegistrationSystem((int) (short) 0);
        register0.runRegistrationSystem((int) (byte) 1);
        register0.registerUser("", "");
        register0.loginUser("hi!", "hi!");
        java.lang.Class<?> wildcardClass11 = register0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test1806() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest3.test1806");
        Register register0 = new Register();
        register0.loginUser("hi!", "hi!");
        register0.registerUser("hi!", "");
        register0.loginUser("hi!", "hi!");
        register0.runRegistrationSystem(100);
        register0.registerUser("hi!", "");
        register0.runRegistrationSystem((int) (short) -1);
        register0.loginUser("", "");
        register0.registerUser("", "hi!");
    }

    @Test
    public void test1807() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest3.test1807");
        Register register0 = new Register();
        register0.runRegistrationSystem((int) (byte) -1);
        register0.runRegistrationSystem((int) (short) 10);
        register0.runRegistrationSystem((int) (byte) 100);
        register0.runRegistrationSystem(10);
        register0.registerUser("", "hi!");
        register0.runRegistrationSystem(0);
        register0.loginUser("", "");
    }

    @Test
    public void test1808() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest3.test1808");
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
        register0.runRegistrationSystem((int) '4');
    }

    @Test
    public void test1809() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest3.test1809");
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
        java.lang.Class<?> wildcardClass30 = register0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass30);
    }

    @Test
    public void test1810() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest3.test1810");
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
        register0.runRegistrationSystem((int) (short) -1);
    }

    @Test
    public void test1811() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest3.test1811");
        Register register0 = new Register();
        register0.registerUser("hi!", "");
        register0.loginUser("", "");
        register0.runRegistrationSystem((int) 'a');
        register0.registerUser("hi!", "hi!");
    }

    @Test
    public void test1812() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest3.test1812");
        Register register0 = new Register();
        register0.runRegistrationSystem((int) (byte) -1);
        register0.registerUser("hi!", "");
        register0.loginUser("hi!", "hi!");
        register0.loginUser("hi!", "");
        register0.loginUser("hi!", "");
        register0.loginUser("hi!", "hi!");
        register0.registerUser("hi!", "");
        register0.registerUser("hi!", "");
        register0.runRegistrationSystem((int) ' ');
        java.lang.Class<?> wildcardClass26 = register0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass26);
    }

    @Test
    public void test1813() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest3.test1813");
        Register register0 = new Register();
        register0.registerUser("hi!", "");
        register0.registerUser("hi!", "");
        register0.loginUser("hi!", "");
        register0.registerUser("", "hi!");
        register0.registerUser("hi!", "");
        register0.loginUser("", "hi!");
        register0.loginUser("hi!", "hi!");
    }

    @Test
    public void test1814() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest3.test1814");
        Register register0 = new Register();
        register0.runRegistrationSystem((int) (short) 0);
        register0.loginUser("hi!", "hi!");
        register0.registerUser("", "");
        register0.runRegistrationSystem((-1));
        register0.registerUser("", "");
        register0.loginUser("", "");
        register0.loginUser("hi!", "");
        register0.loginUser("", "hi!");
    }

    @Test
    public void test1815() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest3.test1815");
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
        java.lang.Class<?> wildcardClass26 = register0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass26);
    }

    @Test
    public void test1816() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest3.test1816");
        Register register0 = new Register();
        register0.registerUser("hi!", "");
        register0.loginUser("", "hi!");
        register0.runRegistrationSystem(0);
        register0.runRegistrationSystem((int) (byte) 1);
    }

    @Test
    public void test1817() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest3.test1817");
        Register register0 = new Register();
        register0.runRegistrationSystem((int) (byte) -1);
        register0.runRegistrationSystem((int) (byte) 10);
        register0.registerUser("", "");
        register0.registerUser("", "hi!");
        register0.runRegistrationSystem((int) '4');
        register0.runRegistrationSystem((int) (byte) -1);
    }

    @Test
    public void test1818() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest3.test1818");
        Register register0 = new Register();
        register0.loginUser("hi!", "hi!");
        register0.registerUser("hi!", "");
        register0.registerUser("", "");
        register0.registerUser("hi!", "");
        register0.runRegistrationSystem((int) (byte) 0);
        register0.loginUser("", "hi!");
        register0.loginUser("", "hi!");
    }

    @Test
    public void test1819() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest3.test1819");
        Register register0 = new Register();
        register0.loginUser("hi!", "hi!");
        register0.registerUser("hi!", "");
        register0.loginUser("hi!", "hi!");
        register0.registerUser("", "");
        register0.runRegistrationSystem(0);
        register0.registerUser("", "");
        register0.runRegistrationSystem((int) '#');
        register0.runRegistrationSystem((int) '#');
        register0.loginUser("hi!", "");
    }

    @Test
    public void test1820() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest3.test1820");
        Register register0 = new Register();
        register0.loginUser("hi!", "hi!");
        register0.registerUser("hi!", "");
        register0.registerUser("", "");
        register0.registerUser("", "hi!");
        register0.loginUser("", "hi!");
        register0.loginUser("hi!", "hi!");
        register0.runRegistrationSystem(100);
        register0.registerUser("hi!", "");
        register0.loginUser("hi!", "");
    }

    @Test
    public void test1821() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest3.test1821");
        Register register0 = new Register();
        register0.registerUser("hi!", "");
        register0.loginUser("", "");
        register0.runRegistrationSystem((int) 'a');
        register0.runRegistrationSystem((int) (short) 100);
        register0.loginUser("hi!", "");
        register0.runRegistrationSystem(0);
    }

    @Test
    public void test1822() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest3.test1822");
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
        register0.loginUser("", "hi!");
        java.lang.Class<?> wildcardClass29 = register0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass29);
    }

    @Test
    public void test1823() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest3.test1823");
        Register register0 = new Register();
        register0.registerUser("hi!", "");
        register0.loginUser("hi!", "hi!");
        register0.registerUser("hi!", "hi!");
        register0.loginUser("", "hi!");
        register0.registerUser("", "hi!");
        register0.registerUser("hi!", "hi!");
        java.lang.Class<?> wildcardClass19 = register0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test1824() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest3.test1824");
        Register register0 = new Register();
        register0.registerUser("hi!", "");
        register0.registerUser("hi!", "");
        register0.runRegistrationSystem((int) (byte) -1);
        register0.registerUser("hi!", "");
        register0.loginUser("", "hi!");
        java.lang.Class<?> wildcardClass15 = register0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test1825() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest3.test1825");
        Register register0 = new Register();
        register0.runRegistrationSystem((int) '#');
        register0.registerUser("", "hi!");
        register0.runRegistrationSystem((int) (short) 0);
        register0.runRegistrationSystem((int) (byte) 1);
        register0.runRegistrationSystem((int) (byte) 0);
        register0.loginUser("", "");
        register0.registerUser("hi!", "");
    }

    @Test
    public void test1826() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest3.test1826");
        Register register0 = new Register();
        register0.runRegistrationSystem((int) (byte) -1);
        register0.runRegistrationSystem((int) (short) 10);
        register0.loginUser("hi!", "");
        register0.loginUser("hi!", "");
        register0.runRegistrationSystem((int) '#');
    }

    @Test
    public void test1827() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest3.test1827");
        Register register0 = new Register();
        register0.registerUser("hi!", "");
        register0.registerUser("hi!", "");
        register0.loginUser("hi!", "");
        register0.loginUser("hi!", "");
        register0.loginUser("", "hi!");
        register0.loginUser("", "hi!");
        register0.loginUser("hi!", "hi!");
        register0.runRegistrationSystem(0);
    }

    @Test
    public void test1828() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest3.test1828");
        Register register0 = new Register();
        register0.loginUser("hi!", "hi!");
        register0.runRegistrationSystem(0);
        register0.registerUser("", "");
        register0.loginUser("", "");
        register0.registerUser("hi!", "");
    }

    @Test
    public void test1829() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest3.test1829");
        Register register0 = new Register();
        register0.runRegistrationSystem((int) (byte) -1);
        register0.runRegistrationSystem((int) (byte) 10);
        register0.registerUser("", "");
        register0.loginUser("", "");
        register0.runRegistrationSystem((int) (byte) 0);
        register0.loginUser("", "");
        register0.runRegistrationSystem((int) (byte) 0);
    }

    @Test
    public void test1830() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest3.test1830");
        Register register0 = new Register();
        register0.runRegistrationSystem((int) (byte) -1);
        register0.runRegistrationSystem((int) '#');
        register0.runRegistrationSystem(100);
        register0.registerUser("hi!", "hi!");
        register0.loginUser("hi!", "");
        java.lang.Class<?> wildcardClass13 = register0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test1831() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest3.test1831");
        Register register0 = new Register();
        register0.registerUser("hi!", "");
        register0.registerUser("hi!", "");
        register0.loginUser("hi!", "");
        register0.loginUser("hi!", "");
        register0.runRegistrationSystem(10);
        register0.registerUser("", "");
        register0.loginUser("hi!", "");
        java.lang.Class<?> wildcardClass21 = register0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test1832() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest3.test1832");
        Register register0 = new Register();
        register0.runRegistrationSystem((int) (byte) -1);
        register0.registerUser("hi!", "");
        register0.loginUser("hi!", "hi!");
        register0.loginUser("hi!", "");
        register0.loginUser("hi!", "");
        register0.runRegistrationSystem((int) (byte) 0);
        register0.runRegistrationSystem((int) (short) 100);
    }

    @Test
    public void test1833() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest3.test1833");
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
        register0.loginUser("", "hi!");
    }

    @Test
    public void test1834() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest3.test1834");
        Register register0 = new Register();
        register0.loginUser("hi!", "hi!");
        register0.registerUser("hi!", "");
        register0.registerUser("", "");
        register0.registerUser("", "");
        register0.runRegistrationSystem((int) (short) 0);
        register0.registerUser("hi!", "");
        register0.loginUser("", "hi!");
        register0.runRegistrationSystem((int) (byte) -1);
        register0.loginUser("", "");
    }

    @Test
    public void test1835() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest3.test1835");
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
        java.lang.Class<?> wildcardClass25 = register0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test1836() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest3.test1836");
        Register register0 = new Register();
        register0.registerUser("hi!", "");
        register0.registerUser("hi!", "");
        register0.registerUser("", "");
        java.lang.Class<?> wildcardClass10 = register0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test1837() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest3.test1837");
        Register register0 = new Register();
        register0.runRegistrationSystem((int) '#');
        register0.loginUser("hi!", "hi!");
        register0.loginUser("hi!", "hi!");
        register0.loginUser("hi!", "");
        register0.registerUser("hi!", "hi!");
        register0.registerUser("", "hi!");
        register0.loginUser("", "");
    }

    @Test
    public void test1838() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest3.test1838");
        Register register0 = new Register();
        register0.loginUser("hi!", "hi!");
        register0.registerUser("hi!", "");
        register0.loginUser("hi!", "hi!");
        register0.runRegistrationSystem(100);
        register0.registerUser("hi!", "");
        register0.registerUser("", "");
        register0.runRegistrationSystem(10);
        register0.loginUser("", "");
        register0.registerUser("hi!", "");
    }

    @Test
    public void test1839() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest3.test1839");
        Register register0 = new Register();
        register0.loginUser("hi!", "hi!");
        register0.registerUser("hi!", "");
        register0.registerUser("hi!", "");
        register0.registerUser("", "");
        register0.runRegistrationSystem(100);
        register0.runRegistrationSystem((int) (byte) -1);
        register0.registerUser("hi!", "hi!");
        register0.runRegistrationSystem((int) (short) 0);
    }

    @Test
    public void test1840() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest3.test1840");
        Register register0 = new Register();
        register0.registerUser("hi!", "");
        register0.registerUser("hi!", "");
        register0.runRegistrationSystem((int) (byte) -1);
        register0.registerUser("", "hi!");
        register0.registerUser("hi!", "hi!");
        register0.loginUser("", "");
        register0.loginUser("", "hi!");
    }

    @Test
    public void test1841() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest3.test1841");
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
        register0.registerUser("", "");
        register0.runRegistrationSystem((int) '#');
    }

    @Test
    public void test1842() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest3.test1842");
        Register register0 = new Register();
        register0.runRegistrationSystem((int) (byte) -1);
        register0.registerUser("hi!", "");
        register0.loginUser("hi!", "hi!");
        register0.runRegistrationSystem((int) (byte) 1);
        register0.runRegistrationSystem((int) ' ');
        register0.loginUser("", "hi!");
        register0.runRegistrationSystem((int) (byte) 100);
    }

    @Test
    public void test1843() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest3.test1843");
        Register register0 = new Register();
        register0.loginUser("hi!", "hi!");
        register0.registerUser("", "");
        register0.registerUser("", "hi!");
        register0.registerUser("", "");
        register0.registerUser("hi!", "hi!");
    }

    @Test
    public void test1844() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest3.test1844");
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
        register0.registerUser("", "");
    }

    @Test
    public void test1845() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest3.test1845");
        Register register0 = new Register();
        register0.loginUser("hi!", "hi!");
        register0.registerUser("hi!", "");
        register0.registerUser("hi!", "");
        register0.registerUser("", "");
        register0.runRegistrationSystem(100);
        register0.registerUser("hi!", "");
        register0.registerUser("", "");
        register0.registerUser("", "");
        register0.registerUser("", "hi!");
    }

    @Test
    public void test1846() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest3.test1846");
        Register register0 = new Register();
        register0.registerUser("hi!", "");
        register0.loginUser("hi!", "hi!");
        register0.runRegistrationSystem((int) '#');
        register0.loginUser("", "hi!");
        register0.loginUser("", "");
        register0.loginUser("hi!", "");
        register0.registerUser("", "");
    }

    @Test
    public void test1847() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest3.test1847");
        Register register0 = new Register();
        register0.registerUser("", "hi!");
        register0.loginUser("hi!", "hi!");
        register0.registerUser("hi!", "hi!");
        register0.runRegistrationSystem(0);
        register0.registerUser("hi!", "");
        register0.registerUser("hi!", "");
        java.lang.Class<?> wildcardClass18 = register0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test1848() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest3.test1848");
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
        register0.registerUser("", "");
    }

    @Test
    public void test1849() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest3.test1849");
        Register register0 = new Register();
        register0.runRegistrationSystem((int) (byte) -1);
        register0.registerUser("hi!", "");
        register0.runRegistrationSystem((int) (byte) -1);
        register0.runRegistrationSystem((int) 'a');
        register0.registerUser("hi!", "");
        register0.registerUser("hi!", "");
    }

    @Test
    public void test1850() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest3.test1850");
        Register register0 = new Register();
        register0.runRegistrationSystem((int) '#');
        register0.registerUser("", "hi!");
        register0.loginUser("hi!", "hi!");
        register0.loginUser("", "hi!");
        register0.registerUser("hi!", "");
        register0.runRegistrationSystem((int) (short) 100);
        register0.loginUser("", "");
    }

    @Test
    public void test1851() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest3.test1851");
        Register register0 = new Register();
        register0.loginUser("hi!", "hi!");
        register0.runRegistrationSystem(0);
        register0.registerUser("", "");
        register0.runRegistrationSystem((-1));
        register0.runRegistrationSystem((int) (short) 10);
        register0.runRegistrationSystem(100);
        register0.runRegistrationSystem((int) (byte) 10);
        register0.loginUser("hi!", "hi!");
    }

    @Test
    public void test1852() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest3.test1852");
        Register register0 = new Register();
        register0.registerUser("hi!", "");
        register0.registerUser("hi!", "");
        register0.loginUser("hi!", "");
        register0.loginUser("hi!", "");
        register0.loginUser("", "hi!");
        register0.registerUser("", "");
    }

    @Test
    public void test1853() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest3.test1853");
        Register register0 = new Register();
        register0.runRegistrationSystem((int) (short) 0);
        register0.loginUser("hi!", "hi!");
        register0.registerUser("", "");
        register0.runRegistrationSystem((-1));
        register0.runRegistrationSystem((int) (short) 10);
        register0.runRegistrationSystem(10);
        register0.loginUser("", "hi!");
        java.lang.Class<?> wildcardClass18 = register0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test1854() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest3.test1854");
        Register register0 = new Register();
        register0.registerUser("hi!", "");
        register0.runRegistrationSystem(1);
        register0.registerUser("", "");
        register0.runRegistrationSystem((int) (short) 10);
        register0.registerUser("hi!", "hi!");
        register0.registerUser("hi!", "");
        register0.registerUser("hi!", "hi!");
        java.lang.Class<?> wildcardClass20 = register0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test1855() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest3.test1855");
        Register register0 = new Register();
        register0.runRegistrationSystem((int) (byte) -1);
        register0.runRegistrationSystem((int) (byte) 10);
        register0.registerUser("", "");
        register0.registerUser("", "hi!");
        register0.runRegistrationSystem((int) '4');
        register0.loginUser("hi!", "");
        register0.runRegistrationSystem((int) '4');
        register0.runRegistrationSystem(0);
        register0.loginUser("", "hi!");
        java.lang.Class<?> wildcardClass23 = register0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test1856() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest3.test1856");
        Register register0 = new Register();
        register0.registerUser("hi!", "");
        register0.registerUser("hi!", "");
        register0.loginUser("hi!", "");
        register0.runRegistrationSystem(10);
        register0.loginUser("", "hi!");
        register0.loginUser("", "hi!");
        register0.loginUser("", "");
    }

    @Test
    public void test1857() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest3.test1857");
        Register register0 = new Register();
        register0.runRegistrationSystem((int) (byte) -1);
        register0.registerUser("hi!", "");
        register0.runRegistrationSystem((int) (short) 1);
        register0.loginUser("", "");
        register0.loginUser("hi!", "");
        java.lang.Class<?> wildcardClass14 = register0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test1858() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest3.test1858");
        Register register0 = new Register();
        register0.runRegistrationSystem((int) '#');
        register0.registerUser("", "hi!");
        register0.loginUser("hi!", "hi!");
        register0.runRegistrationSystem(100);
        register0.runRegistrationSystem((int) (short) 10);
        register0.runRegistrationSystem((int) (short) 0);
        register0.runRegistrationSystem((int) (short) 1);
        register0.loginUser("", "");
        java.lang.Class<?> wildcardClass20 = register0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test1859() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest3.test1859");
        Register register0 = new Register();
        register0.loginUser("hi!", "hi!");
        register0.registerUser("hi!", "");
        register0.registerUser("", "");
        register0.registerUser("", "hi!");
        register0.runRegistrationSystem((int) (short) 100);
        register0.runRegistrationSystem((int) (byte) 10);
        register0.runRegistrationSystem(0);
        register0.loginUser("hi!", "hi!");
        java.lang.Class<?> wildcardClass22 = register0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test1860() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest3.test1860");
        Register register0 = new Register();
        register0.registerUser("", "hi!");
        register0.loginUser("hi!", "hi!");
        register0.registerUser("hi!", "hi!");
        register0.runRegistrationSystem(0);
        register0.registerUser("hi!", "hi!");
        register0.runRegistrationSystem((int) (byte) 100);
        java.lang.Class<?> wildcardClass17 = register0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test1861() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest3.test1861");
        Register register0 = new Register();
        register0.runRegistrationSystem((int) (byte) -1);
        register0.registerUser("hi!", "");
        register0.runRegistrationSystem((int) (short) 1);
        register0.loginUser("", "hi!");
        register0.registerUser("", "");
        register0.runRegistrationSystem((int) (short) 0);
        register0.runRegistrationSystem((int) (short) 1);
        java.lang.Class<?> wildcardClass18 = register0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test1862() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest3.test1862");
        Register register0 = new Register();
        register0.runRegistrationSystem((int) (byte) -1);
        register0.runRegistrationSystem((int) (byte) 10);
        register0.registerUser("", "");
        register0.loginUser("", "");
        register0.runRegistrationSystem((int) (byte) 0);
        register0.runRegistrationSystem((int) (byte) -1);
        register0.registerUser("hi!", "");
        register0.registerUser("hi!", "hi!");
        register0.runRegistrationSystem((int) ' ');
        register0.loginUser("", "hi!");
    }

    @Test
    public void test1863() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest3.test1863");
        Register register0 = new Register();
        register0.runRegistrationSystem((int) '#');
        register0.registerUser("", "hi!");
        register0.loginUser("hi!", "hi!");
        register0.loginUser("", "hi!");
        register0.loginUser("hi!", "hi!");
        register0.registerUser("", "");
        register0.registerUser("", "hi!");
        java.lang.Class<?> wildcardClass21 = register0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test1864() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest3.test1864");
        Register register0 = new Register();
        register0.runRegistrationSystem((int) (short) 0);
        register0.loginUser("hi!", "hi!");
        register0.registerUser("", "");
        register0.loginUser("", "hi!");
        register0.registerUser("hi!", "");
        register0.registerUser("hi!", "");
        register0.runRegistrationSystem(0);
        register0.registerUser("hi!", "");
    }

    @Test
    public void test1865() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest3.test1865");
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
        register0.registerUser("hi!", "");
    }

    @Test
    public void test1866() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest3.test1866");
        Register register0 = new Register();
        register0.registerUser("hi!", "");
        register0.loginUser("", "hi!");
        register0.runRegistrationSystem((int) 'a');
        register0.loginUser("", "hi!");
        register0.loginUser("", "hi!");
        register0.registerUser("", "hi!");
        register0.registerUser("", "hi!");
    }

    @Test
    public void test1867() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest3.test1867");
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
        register0.registerUser("hi!", "hi!");
    }

    @Test
    public void test1868() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest3.test1868");
        Register register0 = new Register();
        register0.loginUser("", "hi!");
        register0.registerUser("", "");
        register0.runRegistrationSystem((int) ' ');
        register0.runRegistrationSystem((int) 'a');
        register0.loginUser("hi!", "hi!");
    }

    @Test
    public void test1869() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest3.test1869");
        Register register0 = new Register();
        register0.registerUser("hi!", "");
        register0.registerUser("hi!", "");
        register0.runRegistrationSystem((int) (byte) -1);
        register0.registerUser("", "hi!");
        register0.registerUser("hi!", "hi!");
        register0.runRegistrationSystem(100);
        register0.loginUser("hi!", "");
    }

    @Test
    public void test1870() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest3.test1870");
        Register register0 = new Register();
        register0.runRegistrationSystem((int) (byte) -1);
        register0.registerUser("hi!", "");
        register0.loginUser("hi!", "hi!");
        register0.loginUser("hi!", "hi!");
        register0.runRegistrationSystem((int) (short) 1);
        register0.registerUser("hi!", "hi!");
        register0.runRegistrationSystem((int) ' ');
        register0.loginUser("hi!", "");
        register0.registerUser("", "");
        register0.loginUser("hi!", "");
    }

    @Test
    public void test1871() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest3.test1871");
        Register register0 = new Register();
        register0.runRegistrationSystem((int) (byte) -1);
        register0.registerUser("hi!", "");
        register0.loginUser("hi!", "hi!");
        register0.loginUser("hi!", "");
        register0.loginUser("", "");
        register0.runRegistrationSystem(1);
        register0.runRegistrationSystem(10);
        register0.loginUser("", "hi!");
        register0.registerUser("hi!", "hi!");
    }

    @Test
    public void test1872() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest3.test1872");
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
        register0.loginUser("", "hi!");
        java.lang.Class<?> wildcardClass32 = register0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass32);
    }

    @Test
    public void test1873() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest3.test1873");
        Register register0 = new Register();
        register0.loginUser("hi!", "hi!");
        register0.registerUser("hi!", "");
        register0.registerUser("", "");
        register0.registerUser("", "hi!");
        register0.runRegistrationSystem((int) (short) 100);
        register0.runRegistrationSystem((int) (byte) 1);
        register0.loginUser("", "");
        register0.runRegistrationSystem(100);
        register0.runRegistrationSystem((int) '#');
        register0.loginUser("", "hi!");
        register0.runRegistrationSystem((int) (short) 1);
    }

    @Test
    public void test1874() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest3.test1874");
        Register register0 = new Register();
        register0.runRegistrationSystem((int) '#');
        register0.registerUser("", "hi!");
        register0.runRegistrationSystem((int) (short) 0);
        register0.runRegistrationSystem((int) (byte) 1);
        register0.registerUser("", "");
        register0.loginUser("", "");
        register0.runRegistrationSystem(100);
        register0.runRegistrationSystem((int) (byte) -1);
        register0.loginUser("", "");
        register0.runRegistrationSystem((int) (byte) 1);
        java.lang.Class<?> wildcardClass25 = register0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test1875() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest3.test1875");
        Register register0 = new Register();
        register0.loginUser("hi!", "hi!");
        register0.registerUser("hi!", "");
        register0.registerUser("", "");
        register0.registerUser("hi!", "");
        register0.registerUser("hi!", "");
        register0.registerUser("", "");
        register0.runRegistrationSystem(0);
        register0.loginUser("", "");
        register0.loginUser("hi!", "");
    }

    @Test
    public void test1876() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest3.test1876");
        Register register0 = new Register();
        register0.loginUser("hi!", "hi!");
        register0.registerUser("hi!", "");
        register0.registerUser("", "");
        register0.registerUser("hi!", "");
        register0.registerUser("hi!", "");
        register0.loginUser("hi!", "hi!");
        register0.loginUser("hi!", "hi!");
        java.lang.Class<?> wildcardClass22 = register0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test1877() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest3.test1877");
        Register register0 = new Register();
        register0.runRegistrationSystem((int) (byte) -1);
        register0.registerUser("hi!", "");
        register0.registerUser("", "");
        register0.registerUser("", "hi!");
        register0.runRegistrationSystem((int) (byte) 10);
    }

    @Test
    public void test1878() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest3.test1878");
        Register register0 = new Register();
        register0.registerUser("hi!", "");
        register0.loginUser("hi!", "hi!");
        register0.runRegistrationSystem((int) '#');
        register0.registerUser("hi!", "");
        register0.loginUser("", "hi!");
        register0.loginUser("", "hi!");
    }

    @Test
    public void test1879() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest3.test1879");
        Register register0 = new Register();
        register0.runRegistrationSystem((int) '#');
        register0.registerUser("", "hi!");
        register0.runRegistrationSystem((int) (short) 0);
        register0.runRegistrationSystem((int) (byte) 1);
        register0.registerUser("", "");
        register0.loginUser("", "");
        register0.loginUser("", "");
        register0.runRegistrationSystem((int) (short) 0);
        register0.loginUser("", "");
        register0.registerUser("hi!", "");
    }

    @Test
    public void test1880() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest3.test1880");
        Register register0 = new Register();
        register0.registerUser("hi!", "");
        register0.loginUser("", "hi!");
        register0.runRegistrationSystem((int) (byte) -1);
        register0.loginUser("", "");
        register0.registerUser("hi!", "hi!");
        register0.registerUser("", "");
    }

    @Test
    public void test1881() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest3.test1881");
        Register register0 = new Register();
        register0.runRegistrationSystem((int) (byte) -1);
        register0.runRegistrationSystem((int) (byte) 10);
        register0.registerUser("", "");
        register0.loginUser("", "");
        register0.registerUser("", "hi!");
        register0.registerUser("", "hi!");
        register0.registerUser("hi!", "hi!");
        register0.runRegistrationSystem((int) (short) -1);
        register0.runRegistrationSystem((int) (short) 10);
        register0.runRegistrationSystem((int) (short) 1);
        register0.runRegistrationSystem((int) '#');
    }

    @Test
    public void test1882() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest3.test1882");
        Register register0 = new Register();
        register0.registerUser("hi!", "");
        register0.loginUser("", "hi!");
        register0.runRegistrationSystem((int) (byte) -1);
        register0.runRegistrationSystem(1);
        register0.loginUser("hi!", "");
        register0.runRegistrationSystem(0);
        register0.registerUser("", "");
        register0.runRegistrationSystem((int) (short) -1);
        register0.loginUser("hi!", "");
    }

    @Test
    public void test1883() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest3.test1883");
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
        register0.loginUser("", "");
    }

    @Test
    public void test1884() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest3.test1884");
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
        java.lang.Class<?> wildcardClass31 = register0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test1885() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest3.test1885");
        Register register0 = new Register();
        register0.registerUser("hi!", "");
        register0.loginUser("", "hi!");
        register0.runRegistrationSystem((int) 'a');
        register0.loginUser("", "hi!");
        register0.loginUser("hi!", "");
        register0.registerUser("hi!", "hi!");
        register0.registerUser("", "hi!");
        register0.registerUser("", "");
        register0.runRegistrationSystem((int) '#');
        java.lang.Class<?> wildcardClass26 = register0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass26);
    }

    @Test
    public void test1886() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest3.test1886");
        Register register0 = new Register();
        register0.runRegistrationSystem((int) (byte) -1);
        register0.runRegistrationSystem((int) (byte) 10);
        register0.registerUser("", "");
        register0.loginUser("", "");
        register0.runRegistrationSystem((int) (byte) 0);
        register0.registerUser("", "");
        register0.loginUser("", "");
    }

    @Test
    public void test1887() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest3.test1887");
        Register register0 = new Register();
        register0.runRegistrationSystem((int) '#');
        register0.registerUser("", "hi!");
        register0.loginUser("hi!", "hi!");
        register0.loginUser("", "hi!");
        register0.runRegistrationSystem((int) (byte) 1);
        register0.runRegistrationSystem(10);
        register0.registerUser("", "");
        register0.loginUser("", "");
        register0.loginUser("hi!", "");
        java.lang.Class<?> wildcardClass25 = register0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test1888() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest3.test1888");
        Register register0 = new Register();
        register0.registerUser("hi!", "");
        register0.loginUser("", "hi!");
        register0.runRegistrationSystem((int) (byte) -1);
        register0.runRegistrationSystem(10);
        register0.registerUser("", "hi!");
        register0.runRegistrationSystem(10);
        register0.runRegistrationSystem((int) (byte) 0);
    }

    @Test
    public void test1889() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest3.test1889");
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
        register0.runRegistrationSystem((int) ' ');
    }

    @Test
    public void test1890() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest3.test1890");
        Register register0 = new Register();
        register0.registerUser("hi!", "");
        register0.loginUser("", "hi!");
        register0.runRegistrationSystem((int) (byte) -1);
        register0.loginUser("", "");
        register0.runRegistrationSystem((int) (short) 100);
        register0.runRegistrationSystem(0);
        register0.runRegistrationSystem((int) 'a');
        register0.runRegistrationSystem(100);
    }

    @Test
    public void test1891() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest3.test1891");
        Register register0 = new Register();
        register0.runRegistrationSystem((int) (byte) -1);
        register0.registerUser("hi!", "");
        register0.loginUser("hi!", "hi!");
        register0.loginUser("hi!", "");
        register0.loginUser("hi!", "");
        register0.registerUser("", "hi!");
        register0.loginUser("hi!", "hi!");
        register0.registerUser("", "hi!");
        register0.runRegistrationSystem((int) (short) 100);
    }

    @Test
    public void test1892() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest3.test1892");
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
        register0.loginUser("hi!", "hi!");
        register0.registerUser("hi!", "hi!");
    }

    @Test
    public void test1893() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest3.test1893");
        Register register0 = new Register();
        register0.loginUser("hi!", "hi!");
        register0.registerUser("hi!", "");
        register0.registerUser("", "");
        register0.registerUser("", "");
        register0.runRegistrationSystem((int) (short) 0);
        register0.registerUser("hi!", "");
        register0.loginUser("", "hi!");
        register0.registerUser("", "");
    }

    @Test
    public void test1894() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest3.test1894");
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
        java.lang.Class<?> wildcardClass28 = register0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test1895() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest3.test1895");
        Register register0 = new Register();
        register0.runRegistrationSystem((int) (short) 0);
        register0.loginUser("hi!", "hi!");
        register0.registerUser("", "");
        register0.runRegistrationSystem((int) '#');
        register0.registerUser("", "hi!");
        register0.registerUser("hi!", "hi!");
        register0.runRegistrationSystem((int) (byte) 100);
        register0.runRegistrationSystem((int) (short) 0);
    }

    @Test
    public void test1896() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest3.test1896");
        Register register0 = new Register();
        register0.registerUser("hi!", "");
        register0.runRegistrationSystem(1);
        register0.registerUser("", "hi!");
        register0.loginUser("hi!", "");
        register0.registerUser("hi!", "");
        java.lang.Class<?> wildcardClass15 = register0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test1897() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest3.test1897");
        Register register0 = new Register();
        register0.runRegistrationSystem((int) (byte) -1);
        register0.registerUser("hi!", "");
        register0.runRegistrationSystem((int) (byte) -1);
        register0.loginUser("hi!", "hi!");
        register0.runRegistrationSystem(0);
        register0.registerUser("hi!", "");
        register0.loginUser("hi!", "hi!");
        register0.registerUser("hi!", "");
        register0.registerUser("", "hi!");
    }

    @Test
    public void test1898() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest3.test1898");
        Register register0 = new Register();
        register0.registerUser("hi!", "");
        register0.loginUser("", "hi!");
        register0.runRegistrationSystem((int) 'a');
        register0.loginUser("hi!", "");
        register0.runRegistrationSystem((int) (byte) 1);
        register0.runRegistrationSystem((int) (short) 1);
        java.lang.Class<?> wildcardClass16 = register0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test1899() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest3.test1899");
        Register register0 = new Register();
        register0.registerUser("hi!", "");
        register0.registerUser("hi!", "");
        register0.runRegistrationSystem((int) (byte) 0);
        register0.registerUser("", "");
        register0.runRegistrationSystem((int) (byte) 10);
        register0.registerUser("", "hi!");
        register0.registerUser("hi!", "");
        register0.runRegistrationSystem((int) 'a');
        register0.loginUser("hi!", "hi!");
    }

    @Test
    public void test1900() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest3.test1900");
        Register register0 = new Register();
        register0.registerUser("hi!", "");
        register0.registerUser("hi!", "");
        register0.loginUser("hi!", "");
        register0.loginUser("", "hi!");
        register0.loginUser("", "");
        register0.registerUser("", "");
        register0.loginUser("hi!", "hi!");
        register0.loginUser("", "");
    }

    @Test
    public void test1901() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest3.test1901");
        Register register0 = new Register();
        register0.registerUser("hi!", "");
        register0.runRegistrationSystem(1);
        register0.registerUser("", "");
        register0.runRegistrationSystem((int) (short) -1);
        register0.runRegistrationSystem((int) (short) 0);
        register0.runRegistrationSystem((int) 'a');
        java.lang.Class<?> wildcardClass15 = register0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test1902() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest3.test1902");
        Register register0 = new Register();
        register0.registerUser("hi!", "");
        register0.registerUser("hi!", "");
        register0.loginUser("hi!", "");
        register0.loginUser("hi!", "");
        register0.loginUser("", "hi!");
        register0.loginUser("hi!", "");
        register0.loginUser("", "hi!");
        register0.registerUser("hi!", "");
        register0.registerUser("hi!", "hi!");
    }

    @Test
    public void test1903() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest3.test1903");
        Register register0 = new Register();
        register0.runRegistrationSystem((int) (byte) -1);
        register0.runRegistrationSystem((int) '#');
        register0.loginUser("hi!", "hi!");
        register0.registerUser("hi!", "");
        register0.runRegistrationSystem(1);
    }

    @Test
    public void test1904() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest3.test1904");
        Register register0 = new Register();
        register0.loginUser("hi!", "hi!");
        register0.registerUser("hi!", "");
        register0.registerUser("hi!", "");
        register0.registerUser("", "hi!");
        register0.loginUser("hi!", "");
        register0.loginUser("hi!", "hi!");
        register0.registerUser("hi!", "hi!");
    }

    @Test
    public void test1905() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest3.test1905");
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
        register0.registerUser("hi!", "");
    }

    @Test
    public void test1906() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest3.test1906");
        Register register0 = new Register();
        register0.loginUser("hi!", "hi!");
        register0.runRegistrationSystem(0);
        register0.registerUser("", "");
        register0.runRegistrationSystem((-1));
        register0.runRegistrationSystem((int) (short) 10);
        register0.registerUser("hi!", "hi!");
        register0.registerUser("", "hi!");
        java.lang.Class<?> wildcardClass19 = register0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test1907() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest3.test1907");
        Register register0 = new Register();
        register0.runRegistrationSystem((int) '#');
        register0.loginUser("hi!", "hi!");
        register0.runRegistrationSystem((int) (byte) 10);
        register0.registerUser("hi!", "hi!");
        register0.runRegistrationSystem((int) (byte) 100);
        register0.registerUser("hi!", "");
        register0.registerUser("hi!", "hi!");
        register0.registerUser("", "hi!");
        java.lang.Class<?> wildcardClass22 = register0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test1908() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest3.test1908");
        Register register0 = new Register();
        register0.registerUser("hi!", "");
        register0.registerUser("hi!", "");
        register0.loginUser("hi!", "");
        register0.loginUser("", "hi!");
        register0.loginUser("hi!", "");
        register0.loginUser("", "hi!");
        register0.loginUser("", "hi!");
        register0.loginUser("hi!", "hi!");
        register0.runRegistrationSystem((int) '4');
        register0.runRegistrationSystem((int) (short) -1);
    }

    @Test
    public void test1909() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest3.test1909");
        Register register0 = new Register();
        register0.runRegistrationSystem((int) (byte) -1);
        register0.registerUser("hi!", "");
        register0.registerUser("", "hi!");
        register0.loginUser("hi!", "hi!");
        register0.registerUser("hi!", "hi!");
        register0.runRegistrationSystem((int) (short) 1);
        java.lang.Class<?> wildcardClass17 = register0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test1910() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest3.test1910");
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
        register0.runRegistrationSystem((-1));
    }

    @Test
    public void test1911() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest3.test1911");
        Register register0 = new Register();
        register0.runRegistrationSystem((int) '#');
        register0.loginUser("hi!", "hi!");
        register0.registerUser("", "");
        register0.registerUser("hi!", "");
        register0.runRegistrationSystem((int) (byte) 10);
        register0.runRegistrationSystem((int) (byte) 0);
        register0.loginUser("hi!", "hi!");
    }

    @Test
    public void test1912() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest3.test1912");
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
        java.lang.Class<?> wildcardClass28 = register0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test1913() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest3.test1913");
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
        register0.loginUser("", "hi!");
        register0.loginUser("hi!", "");
    }

    @Test
    public void test1914() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest3.test1914");
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
        register0.registerUser("", "hi!");
    }

    @Test
    public void test1915() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest3.test1915");
        Register register0 = new Register();
        register0.runRegistrationSystem((int) (byte) -1);
        register0.runRegistrationSystem((int) (short) 10);
        register0.loginUser("", "");
        register0.registerUser("", "");
        register0.loginUser("", "");
    }

    @Test
    public void test1916() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest3.test1916");
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
        register0.loginUser("", "");
        java.lang.Class<?> wildcardClass28 = register0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test1917() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest3.test1917");
        Register register0 = new Register();
        register0.loginUser("hi!", "hi!");
        register0.registerUser("hi!", "hi!");
        register0.runRegistrationSystem((int) (byte) 100);
        register0.runRegistrationSystem((int) (short) -1);
    }

    @Test
    public void test1918() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest3.test1918");
        Register register0 = new Register();
        register0.runRegistrationSystem((int) (byte) -1);
        register0.registerUser("hi!", "");
        register0.runRegistrationSystem(0);
        register0.loginUser("", "hi!");
        register0.loginUser("hi!", "");
        register0.registerUser("hi!", "hi!");
        register0.registerUser("", "");
    }

    @Test
    public void test1919() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest3.test1919");
        Register register0 = new Register();
        register0.runRegistrationSystem((int) (short) 0);
        register0.loginUser("hi!", "hi!");
        register0.registerUser("", "");
        register0.runRegistrationSystem((int) '#');
        register0.runRegistrationSystem((int) '#');
        register0.loginUser("hi!", "");
        register0.runRegistrationSystem((int) (byte) 10);
        register0.runRegistrationSystem(100);
        register0.registerUser("", "");
    }

    @Test
    public void test1920() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest3.test1920");
        Register register0 = new Register();
        register0.runRegistrationSystem((int) (byte) -1);
        register0.registerUser("hi!", "");
        register0.runRegistrationSystem((int) (short) 1);
        register0.loginUser("", "");
        register0.registerUser("", "");
        register0.loginUser("", "hi!");
    }

    @Test
    public void test1921() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest3.test1921");
        Register register0 = new Register();
        register0.registerUser("hi!", "");
        register0.loginUser("hi!", "hi!");
        register0.runRegistrationSystem((int) '#');
        register0.registerUser("hi!", "");
        register0.runRegistrationSystem((int) '#');
    }

    @Test
    public void test1922() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest3.test1922");
        Register register0 = new Register();
        register0.registerUser("hi!", "");
        register0.registerUser("hi!", "");
        register0.loginUser("hi!", "");
        register0.loginUser("hi!", "");
        register0.loginUser("", "hi!");
        register0.runRegistrationSystem((-1));
        register0.registerUser("hi!", "hi!");
    }

    @Test
    public void test1923() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest3.test1923");
        Register register0 = new Register();
        register0.loginUser("hi!", "hi!");
        register0.registerUser("hi!", "");
        register0.loginUser("hi!", "hi!");
        register0.registerUser("", "");
        register0.runRegistrationSystem(0);
        register0.registerUser("", "");
        register0.registerUser("hi!", "hi!");
        register0.runRegistrationSystem((-1));
        register0.registerUser("hi!", "");
        register0.registerUser("hi!", "hi!");
    }

    @Test
    public void test1924() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest3.test1924");
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
        register0.registerUser("", "hi!");
    }

    @Test
    public void test1925() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest3.test1925");
        Register register0 = new Register();
        register0.runRegistrationSystem((int) (byte) -1);
        register0.registerUser("hi!", "");
        register0.loginUser("hi!", "hi!");
        register0.loginUser("hi!", "");
        register0.registerUser("hi!", "");
        register0.registerUser("", "hi!");
        register0.registerUser("", "hi!");
    }

    @Test
    public void test1926() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest3.test1926");
        Register register0 = new Register();
        register0.loginUser("hi!", "hi!");
        register0.registerUser("hi!", "");
        register0.loginUser("hi!", "hi!");
        register0.runRegistrationSystem(100);
        register0.registerUser("", "hi!");
        register0.loginUser("", "");
        register0.registerUser("hi!", "hi!");
    }

    @Test
    public void test1927() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest3.test1927");
        Register register0 = new Register();
        register0.loginUser("hi!", "hi!");
        register0.registerUser("hi!", "");
        register0.registerUser("", "");
        register0.registerUser("hi!", "");
        register0.registerUser("hi!", "");
        register0.registerUser("hi!", "");
        register0.runRegistrationSystem((int) (byte) -1);
        register0.loginUser("hi!", "hi!");
    }

    @Test
    public void test1928() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest3.test1928");
        Register register0 = new Register();
        register0.runRegistrationSystem((int) (byte) -1);
        register0.registerUser("hi!", "");
        register0.loginUser("hi!", "hi!");
        register0.loginUser("hi!", "");
        register0.registerUser("hi!", "");
        register0.registerUser("", "hi!");
        register0.registerUser("", "");
    }

    @Test
    public void test1929() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest3.test1929");
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
        register0.registerUser("", "");
    }

    @Test
    public void test1930() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest3.test1930");
        Register register0 = new Register();
        register0.runRegistrationSystem((int) (byte) -1);
        register0.loginUser("", "hi!");
        register0.registerUser("", "");
        register0.runRegistrationSystem((int) (short) 1);
        java.lang.Class<?> wildcardClass11 = register0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test1931() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest3.test1931");
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
        register0.loginUser("hi!", "");
    }

    @Test
    public void test1932() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest3.test1932");
        Register register0 = new Register();
        register0.runRegistrationSystem((int) (byte) -1);
        register0.registerUser("hi!", "");
        register0.loginUser("hi!", "hi!");
        register0.loginUser("hi!", "");
        register0.registerUser("hi!", "");
        register0.registerUser("hi!", "hi!");
        register0.registerUser("", "hi!");
        register0.loginUser("hi!", "hi!");
        register0.registerUser("", "");
        java.lang.Class<?> wildcardClass27 = register0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test1933() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest3.test1933");
        Register register0 = new Register();
        register0.runRegistrationSystem((int) '#');
        register0.registerUser("", "hi!");
        register0.loginUser("hi!", "hi!");
        register0.runRegistrationSystem(100);
        register0.runRegistrationSystem((int) (short) 10);
        register0.runRegistrationSystem((int) (short) 0);
        register0.runRegistrationSystem((int) (short) 1);
        java.lang.Class<?> wildcardClass17 = register0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test1934() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest3.test1934");
        Register register0 = new Register();
        register0.loginUser("hi!", "hi!");
        register0.loginUser("", "hi!");
        register0.runRegistrationSystem((int) (byte) 0);
        register0.registerUser("", "");
        register0.runRegistrationSystem((int) (byte) 0);
        java.lang.Class<?> wildcardClass14 = register0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test1935() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest3.test1935");
        Register register0 = new Register();
        register0.runRegistrationSystem((int) '#');
        register0.registerUser("", "hi!");
        register0.runRegistrationSystem((int) (short) 0);
        register0.runRegistrationSystem((int) (byte) 1);
        register0.runRegistrationSystem((int) 'a');
        register0.runRegistrationSystem(0);
        register0.loginUser("hi!", "hi!");
        register0.runRegistrationSystem(0);
        register0.runRegistrationSystem((int) (short) 10);
    }

    @Test
    public void test1936() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest3.test1936");
        Register register0 = new Register();
        register0.runRegistrationSystem((int) (byte) -1);
        register0.registerUser("hi!", "");
        register0.loginUser("hi!", "hi!");
        register0.runRegistrationSystem((int) (byte) 1);
        register0.registerUser("", "hi!");
        register0.runRegistrationSystem((int) 'a');
        register0.registerUser("", "");
        register0.loginUser("", "");
        java.lang.Class<?> wildcardClass22 = register0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test1937() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest3.test1937");
        Register register0 = new Register();
        register0.registerUser("hi!", "");
        register0.registerUser("hi!", "");
        register0.loginUser("hi!", "");
        register0.loginUser("hi!", "");
        register0.loginUser("", "hi!");
        register0.loginUser("hi!", "");
        register0.loginUser("", "hi!");
        register0.runRegistrationSystem((int) 'a');
        register0.runRegistrationSystem(1);
        java.lang.Class<?> wildcardClass26 = register0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass26);
    }

    @Test
    public void test1938() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest3.test1938");
        Register register0 = new Register();
        register0.runRegistrationSystem((int) (short) 0);
        register0.loginUser("hi!", "hi!");
        register0.registerUser("", "");
        register0.runRegistrationSystem((int) '#');
        register0.loginUser("", "hi!");
        register0.loginUser("", "");
        register0.loginUser("", "hi!");
        register0.runRegistrationSystem(0);
    }

    @Test
    public void test1939() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest3.test1939");
        Register register0 = new Register();
        register0.loginUser("hi!", "hi!");
        register0.registerUser("hi!", "");
        register0.registerUser("", "");
        register0.registerUser("hi!", "");
        register0.registerUser("hi!", "");
        register0.registerUser("", "");
        register0.runRegistrationSystem(100);
        register0.runRegistrationSystem(100);
        register0.loginUser("hi!", "");
        register0.loginUser("hi!", "");
    }

    @Test
    public void test1940() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest3.test1940");
        Register register0 = new Register();
        register0.loginUser("hi!", "hi!");
        register0.registerUser("hi!", "");
        register0.registerUser("hi!", "");
        register0.registerUser("", "");
        register0.runRegistrationSystem((int) (short) 0);
        register0.registerUser("hi!", "hi!");
        java.lang.Class<?> wildcardClass18 = register0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test1941() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest3.test1941");
        Register register0 = new Register();
        register0.runRegistrationSystem((int) '#');
        register0.registerUser("", "hi!");
        register0.runRegistrationSystem((int) (short) 0);
        register0.runRegistrationSystem((int) (byte) 1);
        register0.registerUser("", "");
        register0.runRegistrationSystem((int) (short) 10);
        register0.registerUser("hi!", "");
        register0.loginUser("hi!", "hi!");
        java.lang.Class<?> wildcardClass21 = register0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test1942() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest3.test1942");
        Register register0 = new Register();
        register0.runRegistrationSystem((int) (byte) -1);
        register0.runRegistrationSystem((int) (byte) 10);
        register0.registerUser("", "");
        register0.runRegistrationSystem((int) (short) 0);
        register0.runRegistrationSystem((int) (short) -1);
    }

    @Test
    public void test1943() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest3.test1943");
        Register register0 = new Register();
        register0.registerUser("hi!", "");
        register0.loginUser("", "");
        register0.loginUser("hi!", "");
    }

    @Test
    public void test1944() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest3.test1944");
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
        register0.runRegistrationSystem((int) '#');
    }

    @Test
    public void test1945() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest3.test1945");
        Register register0 = new Register();
        register0.runRegistrationSystem((int) (short) 0);
        register0.loginUser("hi!", "hi!");
        register0.registerUser("", "");
        register0.runRegistrationSystem((int) '#');
        register0.registerUser("", "hi!");
        register0.registerUser("", "hi!");
        register0.registerUser("", "");
        register0.loginUser("hi!", "");
        register0.loginUser("hi!", "hi!");
        register0.loginUser("", "");
        register0.runRegistrationSystem((int) '4');
        java.lang.Class<?> wildcardClass31 = register0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test1946() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest3.test1946");
        Register register0 = new Register();
        register0.loginUser("hi!", "hi!");
        register0.registerUser("hi!", "");
        register0.registerUser("", "");
        register0.registerUser("", "hi!");
        register0.runRegistrationSystem((int) (short) 100);
        register0.runRegistrationSystem((int) (byte) 1);
        register0.loginUser("", "");
        register0.runRegistrationSystem(100);
        register0.runRegistrationSystem((int) '#');
        register0.loginUser("", "");
    }

    @Test
    public void test1947() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest3.test1947");
        Register register0 = new Register();
        register0.loginUser("", "hi!");
        register0.loginUser("", "hi!");
        register0.loginUser("hi!", "hi!");
        register0.registerUser("", "");
        register0.loginUser("", "");
        register0.loginUser("hi!", "hi!");
    }

    @Test
    public void test1948() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest3.test1948");
        Register register0 = new Register();
        register0.runRegistrationSystem((int) '#');
        register0.registerUser("", "hi!");
        register0.loginUser("hi!", "hi!");
        register0.loginUser("", "hi!");
        register0.runRegistrationSystem(0);
        register0.loginUser("", "hi!");
        register0.runRegistrationSystem((int) (short) 100);
    }

    @Test
    public void test1949() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest3.test1949");
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
        register0.runRegistrationSystem((int) (short) 10);
    }

    @Test
    public void test1950() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest3.test1950");
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
        register0.registerUser("hi!", "hi!");
        register0.registerUser("hi!", "");
        java.lang.Class<?> wildcardClass31 = register0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test1951() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest3.test1951");
        Register register0 = new Register();
        register0.loginUser("hi!", "hi!");
        register0.registerUser("hi!", "");
        register0.loginUser("hi!", "hi!");
        register0.runRegistrationSystem(100);
        register0.registerUser("hi!", "");
        register0.runRegistrationSystem((int) (short) -1);
        register0.runRegistrationSystem((int) (byte) 100);
        register0.runRegistrationSystem((int) (byte) 10);
        register0.loginUser("hi!", "hi!");
    }

    @Test
    public void test1952() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest3.test1952");
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
        register0.registerUser("", "hi!");
    }

    @Test
    public void test1953() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest3.test1953");
        Register register0 = new Register();
        register0.runRegistrationSystem((int) (byte) -1);
        register0.runRegistrationSystem((int) (byte) 10);
        register0.registerUser("", "");
        register0.registerUser("", "hi!");
        register0.loginUser("hi!", "");
        register0.registerUser("hi!", "");
        register0.registerUser("hi!", "");
    }

    @Test
    public void test1954() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest3.test1954");
        Register register0 = new Register();
        register0.runRegistrationSystem((int) (byte) -1);
        register0.runRegistrationSystem((int) '#');
        register0.loginUser("", "");
        register0.registerUser("hi!", "");
        register0.runRegistrationSystem(0);
        register0.loginUser("", "");
    }

    @Test
    public void test1955() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest3.test1955");
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
        java.lang.Class<?> wildcardClass26 = register0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass26);
    }

    @Test
    public void test1956() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest3.test1956");
        Register register0 = new Register();
        register0.loginUser("", "hi!");
        register0.loginUser("", "hi!");
        register0.loginUser("hi!", "hi!");
        register0.registerUser("", "");
        register0.runRegistrationSystem((int) (short) 100);
        register0.runRegistrationSystem((int) '#');
        register0.loginUser("", "hi!");
    }

    @Test
    public void test1957() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest3.test1957");
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
        register0.loginUser("hi!", "");
    }

    @Test
    public void test1958() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest3.test1958");
        Register register0 = new Register();
        register0.runRegistrationSystem((int) '#');
        register0.registerUser("", "hi!");
        register0.registerUser("", "hi!");
        register0.registerUser("", "");
        register0.runRegistrationSystem((int) (byte) 10);
        register0.registerUser("", "hi!");
        register0.loginUser("", "hi!");
    }

    @Test
    public void test1959() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest3.test1959");
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
        register0.registerUser("", "");
        register0.loginUser("", "");
    }

    @Test
    public void test1960() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest3.test1960");
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
        register0.runRegistrationSystem((int) (byte) 100);
    }

    @Test
    public void test1961() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest3.test1961");
        Register register0 = new Register();
        register0.runRegistrationSystem((int) '#');
        register0.registerUser("", "hi!");
        register0.runRegistrationSystem((int) (short) 0);
        register0.loginUser("hi!", "hi!");
        register0.runRegistrationSystem(100);
        register0.runRegistrationSystem((int) (short) 100);
    }

    @Test
    public void test1962() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest3.test1962");
        Register register0 = new Register();
        register0.loginUser("hi!", "hi!");
        register0.registerUser("hi!", "");
        register0.registerUser("", "");
        register0.runRegistrationSystem((int) (byte) 100);
        register0.registerUser("hi!", "");
        register0.runRegistrationSystem(1);
        register0.runRegistrationSystem(0);
        register0.runRegistrationSystem((int) '4');
        register0.loginUser("hi!", "");
        register0.runRegistrationSystem(0);
        register0.loginUser("", "");
    }

    @Test
    public void test1963() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest3.test1963");
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
        register0.loginUser("hi!", "hi!");
    }

    @Test
    public void test1964() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest3.test1964");
        Register register0 = new Register();
        register0.loginUser("hi!", "hi!");
        register0.loginUser("hi!", "hi!");
        register0.registerUser("", "");
        register0.runRegistrationSystem((int) (byte) 1);
        register0.loginUser("hi!", "");
        register0.registerUser("", "");
        register0.loginUser("hi!", "hi!");
    }

    @Test
    public void test1965() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest3.test1965");
        Register register0 = new Register();
        register0.loginUser("hi!", "hi!");
        register0.loginUser("", "hi!");
        register0.loginUser("", "");
        register0.runRegistrationSystem((int) (byte) 10);
        register0.runRegistrationSystem((-1));
        register0.registerUser("", "hi!");
    }

    @Test
    public void test1966() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest3.test1966");
        Register register0 = new Register();
        register0.runRegistrationSystem((int) (short) 0);
        register0.loginUser("hi!", "hi!");
        register0.registerUser("", "");
        register0.runRegistrationSystem((-1));
        register0.runRegistrationSystem((int) (short) 10);
        register0.runRegistrationSystem((int) '4');
        register0.registerUser("", "hi!");
        register0.registerUser("hi!", "");
        register0.runRegistrationSystem((int) (short) 100);
    }

    @Test
    public void test1967() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest3.test1967");
        Register register0 = new Register();
        register0.runRegistrationSystem((int) '#');
        register0.registerUser("", "hi!");
        register0.registerUser("hi!", "");
        register0.runRegistrationSystem((int) (byte) 100);
        register0.runRegistrationSystem((int) (byte) 1);
        register0.runRegistrationSystem((int) (short) -1);
    }

    @Test
    public void test1968() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest3.test1968");
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
        register0.loginUser("hi!", "");
        register0.runRegistrationSystem(10);
    }

    @Test
    public void test1969() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest3.test1969");
        Register register0 = new Register();
        register0.loginUser("hi!", "hi!");
        register0.registerUser("hi!", "");
        register0.registerUser("", "");
        register0.registerUser("hi!", "");
        register0.registerUser("hi!", "");
        register0.registerUser("", "");
        register0.runRegistrationSystem((int) '#');
        register0.runRegistrationSystem((int) (byte) 100);
        register0.runRegistrationSystem(10);
        register0.registerUser("hi!", "hi!");
        register0.loginUser("", "");
    }

    @Test
    public void test1970() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest3.test1970");
        Register register0 = new Register();
        register0.registerUser("hi!", "");
        register0.loginUser("", "");
        register0.runRegistrationSystem((int) 'a');
        register0.runRegistrationSystem((int) (short) 100);
        register0.loginUser("hi!", "");
        register0.loginUser("hi!", "hi!");
        register0.loginUser("", "");
        register0.registerUser("", "hi!");
    }

    @Test
    public void test1971() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest3.test1971");
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
        java.lang.Class<?> wildcardClass25 = register0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test1972() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest3.test1972");
        Register register0 = new Register();
        register0.runRegistrationSystem((int) (byte) -1);
        register0.registerUser("hi!", "");
        register0.registerUser("", "hi!");
        register0.runRegistrationSystem((int) (short) 10);
        register0.registerUser("hi!", "");
        register0.loginUser("hi!", "hi!");
        register0.runRegistrationSystem((int) 'a');
        java.lang.Class<?> wildcardClass19 = register0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test1973() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest3.test1973");
        Register register0 = new Register();
        register0.runRegistrationSystem((int) (short) 0);
        register0.loginUser("hi!", "hi!");
        register0.loginUser("", "");
        register0.registerUser("hi!", "");
        register0.registerUser("hi!", "hi!");
        register0.runRegistrationSystem((int) 'a');
        register0.runRegistrationSystem((int) 'a');
        register0.registerUser("hi!", "");
        register0.runRegistrationSystem(0);
    }

    @Test
    public void test1974() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest3.test1974");
        Register register0 = new Register();
        register0.runRegistrationSystem((int) (short) 0);
        register0.loginUser("hi!", "hi!");
        register0.loginUser("", "");
        register0.registerUser("hi!", "");
        register0.loginUser("hi!", "hi!");
        register0.loginUser("", "hi!");
        register0.registerUser("", "");
        register0.runRegistrationSystem((int) (short) -1);
        register0.runRegistrationSystem((int) '4');
    }

    @Test
    public void test1975() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest3.test1975");
        Register register0 = new Register();
        register0.loginUser("hi!", "hi!");
        register0.registerUser("hi!", "");
        register0.registerUser("hi!", "");
        register0.registerUser("", "");
        register0.runRegistrationSystem((int) (short) 0);
        register0.loginUser("hi!", "");
        register0.loginUser("hi!", "hi!");
        register0.loginUser("", "hi!");
        register0.registerUser("hi!", "");
        java.lang.Class<?> wildcardClass27 = register0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test1976() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest3.test1976");
        Register register0 = new Register();
        register0.runRegistrationSystem((int) (byte) -1);
        register0.runRegistrationSystem((int) (byte) 10);
        register0.registerUser("", "");
        register0.registerUser("", "hi!");
        register0.runRegistrationSystem((int) '4');
        register0.loginUser("hi!", "");
        register0.loginUser("hi!", "hi!");
        register0.runRegistrationSystem((-1));
        register0.runRegistrationSystem(1);
    }

    @Test
    public void test1977() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest3.test1977");
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
        register0.loginUser("hi!", "");
    }

    @Test
    public void test1978() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest3.test1978");
        Register register0 = new Register();
        register0.registerUser("hi!", "");
        register0.registerUser("hi!", "");
        register0.loginUser("hi!", "");
        register0.loginUser("", "hi!");
        register0.loginUser("", "");
        register0.registerUser("", "");
        register0.runRegistrationSystem((int) (byte) 100);
        register0.registerUser("", "hi!");
    }

    @Test
    public void test1979() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest3.test1979");
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
        register0.loginUser("", "");
        register0.loginUser("hi!", "");
    }

    @Test
    public void test1980() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest3.test1980");
        Register register0 = new Register();
        register0.loginUser("hi!", "hi!");
        register0.loginUser("", "");
        register0.runRegistrationSystem(10);
        register0.loginUser("hi!", "");
        java.lang.Class<?> wildcardClass12 = register0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test1981() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest3.test1981");
        Register register0 = new Register();
        register0.registerUser("hi!", "");
        register0.registerUser("hi!", "");
        register0.loginUser("hi!", "");
        register0.loginUser("hi!", "");
        register0.registerUser("", "");
        register0.registerUser("hi!", "");
        java.lang.Class<?> wildcardClass19 = register0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test1982() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest3.test1982");
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
        register0.registerUser("hi!", "");
        java.lang.Class<?> wildcardClass28 = register0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test1983() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest3.test1983");
        Register register0 = new Register();
        register0.loginUser("hi!", "hi!");
        register0.registerUser("hi!", "");
        register0.loginUser("hi!", "hi!");
        register0.runRegistrationSystem(100);
        register0.registerUser("hi!", "");
        register0.runRegistrationSystem((int) (short) -1);
        register0.loginUser("", "");
        register0.loginUser("", "hi!");
        java.lang.Class<?> wildcardClass23 = register0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test1984() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest3.test1984");
        Register register0 = new Register();
        register0.registerUser("hi!", "");
        register0.registerUser("hi!", "");
        register0.loginUser("hi!", "");
        register0.registerUser("", "hi!");
        register0.registerUser("hi!", "");
        register0.loginUser("", "hi!");
        register0.runRegistrationSystem((int) '#');
        register0.runRegistrationSystem((int) (byte) 1);
        register0.runRegistrationSystem((int) (short) 10);
        java.lang.Class<?> wildcardClass25 = register0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test1985() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest3.test1985");
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
        register0.loginUser("hi!", "");
    }

    @Test
    public void test1986() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest3.test1986");
        Register register0 = new Register();
        register0.registerUser("hi!", "");
        register0.loginUser("", "hi!");
        register0.runRegistrationSystem((int) 'a');
        register0.loginUser("", "hi!");
        register0.runRegistrationSystem((int) (short) 1);
        register0.registerUser("", "");
        register0.registerUser("", "");
        register0.registerUser("", "");
    }

    @Test
    public void test1987() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest3.test1987");
        Register register0 = new Register();
        register0.loginUser("hi!", "hi!");
        register0.loginUser("hi!", "hi!");
        register0.loginUser("", "hi!");
        register0.registerUser("", "");
        register0.runRegistrationSystem((int) (byte) 1);
    }

    @Test
    public void test1988() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest3.test1988");
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
        java.lang.Class<?> wildcardClass26 = register0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass26);
    }

    @Test
    public void test1989() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest3.test1989");
        Register register0 = new Register();
        register0.runRegistrationSystem((int) (byte) -1);
        register0.runRegistrationSystem((int) (short) 10);
        register0.loginUser("hi!", "");
        register0.runRegistrationSystem((int) (short) 0);
    }

    @Test
    public void test1990() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest3.test1990");
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
        register0.runRegistrationSystem((int) ' ');
    }

    @Test
    public void test1991() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest3.test1991");
        Register register0 = new Register();
        register0.runRegistrationSystem((int) '#');
        register0.loginUser("hi!", "hi!");
        register0.loginUser("hi!", "hi!");
        register0.loginUser("hi!", "");
        register0.loginUser("", "");
        register0.runRegistrationSystem((int) (short) 10);
        register0.runRegistrationSystem((int) (byte) 1);
        register0.loginUser("", "");
        register0.registerUser("hi!", "");
        java.lang.Class<?> wildcardClass25 = register0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test1992() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest3.test1992");
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
        register0.registerUser("hi!", "hi!");
    }

    @Test
    public void test1993() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest3.test1993");
        Register register0 = new Register();
        register0.runRegistrationSystem((int) '#');
        register0.runRegistrationSystem((int) (short) 100);
        register0.runRegistrationSystem((int) (byte) 100);
        java.lang.Class<?> wildcardClass7 = register0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test1994() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest3.test1994");
        Register register0 = new Register();
        register0.loginUser("hi!", "hi!");
        register0.registerUser("hi!", "");
        register0.loginUser("hi!", "hi!");
        register0.runRegistrationSystem(100);
        register0.runRegistrationSystem((int) (byte) 1);
        register0.registerUser("", "");
        register0.loginUser("", "hi!");
        java.lang.Class<?> wildcardClass20 = register0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test1995() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest3.test1995");
        Register register0 = new Register();
        register0.registerUser("hi!", "");
        register0.registerUser("hi!", "");
        register0.loginUser("hi!", "");
        register0.loginUser("hi!", "");
        register0.loginUser("", "hi!");
        register0.loginUser("hi!", "");
        register0.loginUser("hi!", "");
        register0.registerUser("hi!", "");
    }

    @Test
    public void test1996() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest3.test1996");
        Register register0 = new Register();
        register0.runRegistrationSystem((int) (byte) -1);
        register0.runRegistrationSystem((int) (byte) 10);
        register0.registerUser("", "");
        register0.registerUser("", "hi!");
        register0.loginUser("hi!", "");
        register0.registerUser("hi!", "");
        register0.runRegistrationSystem(0);
    }

    @Test
    public void test1997() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest3.test1997");
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
        register0.loginUser("hi!", "");
    }

    @Test
    public void test1998() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest3.test1998");
        Register register0 = new Register();
        register0.registerUser("hi!", "");
        register0.loginUser("", "hi!");
        register0.runRegistrationSystem((int) 'a');
        register0.loginUser("", "hi!");
        register0.loginUser("hi!", "");
        register0.registerUser("hi!", "hi!");
        register0.runRegistrationSystem(1);
        register0.loginUser("", "");
        java.lang.Class<?> wildcardClass23 = register0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test1999() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest3.test1999");
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
        register0.runRegistrationSystem(1);
    }

    @Test
    public void test2000() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegisterTest3.test2000");
        Register register0 = new Register();
        register0.registerUser("hi!", "");
        register0.loginUser("", "hi!");
        register0.loginUser("", "hi!");
        register0.runRegistrationSystem(10);
        register0.runRegistrationSystem((-1));
        register0.runRegistrationSystem((int) (short) 1);
        register0.registerUser("hi!", "hi!");
        java.lang.Class<?> wildcardClass19 = register0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass19);
    }
}

