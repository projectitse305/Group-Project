import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class PaymentTest0 {

    public static boolean debug = false;

    @Test
    public void test0001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PaymentTest0.test0001");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Class<?> wildcardClass1 = obj0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test0002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PaymentTest0.test0002");
        InvoiceStorage invoiceStorage0 = null;
        Payment payment1 = new Payment(invoiceStorage0);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean6 = payment1.payByCard((int) (byte) 1, "hi!", "hi!", "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"InvoiceStorage.getInvoice(int)\" because \"this.invoiceStorage\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PaymentTest0.test0003");
        InvoiceStorage invoiceStorage0 = null;
        Payment payment1 = new Payment(invoiceStorage0);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean4 = payment1.payOnline(0, "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"InvoiceStorage.getInvoice(int)\" because \"this.invoiceStorage\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PaymentTest0.test0004");
        InvoiceStorage invoiceStorage0 = null;
        Payment payment1 = new Payment(invoiceStorage0);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = payment1.payByCash((int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"InvoiceStorage.getInvoice(int)\" because \"this.invoiceStorage\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PaymentTest0.test0005");
        InvoiceStorage invoiceStorage0 = null;
        Payment payment1 = new Payment(invoiceStorage0);
        java.util.List<PaymentRecord> paymentRecordList2 = payment1.getPaymentRecords();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean7 = payment1.payByCard((int) 'a', "", "", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"InvoiceStorage.getInvoice(int)\" because \"this.invoiceStorage\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(paymentRecordList2);
    }

    @Test
    public void test0006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PaymentTest0.test0006");
        InvoiceStorage invoiceStorage0 = null;
        Payment payment1 = new Payment(invoiceStorage0);
        java.util.List<PaymentRecord> paymentRecordList2 = payment1.getPaymentRecords();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean7 = payment1.payByCard((int) (byte) -1, "hi!", "hi!", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"InvoiceStorage.getInvoice(int)\" because \"this.invoiceStorage\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(paymentRecordList2);
    }

    @Test
    public void test0007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PaymentTest0.test0007");
        InvoiceStorage invoiceStorage0 = null;
        Payment payment1 = new Payment(invoiceStorage0);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = payment1.payByCash((int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"InvoiceStorage.getInvoice(int)\" because \"this.invoiceStorage\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PaymentTest0.test0008");
        InvoiceStorage invoiceStorage0 = null;
        Payment payment1 = new Payment(invoiceStorage0);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean4 = payment1.payOnline((int) '4', "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"InvoiceStorage.getInvoice(int)\" because \"this.invoiceStorage\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PaymentTest0.test0009");
        InvoiceStorage invoiceStorage0 = null;
        Payment payment1 = new Payment(invoiceStorage0);
        java.util.List<PaymentRecord> paymentRecordList2 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList3 = payment1.getPaymentRecords();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean5 = payment1.payByCash((int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"InvoiceStorage.getInvoice(int)\" because \"this.invoiceStorage\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(paymentRecordList2);
        org.junit.Assert.assertNotNull(paymentRecordList3);
    }

    @Test
    public void test0010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PaymentTest0.test0010");
        InvoiceStorage invoiceStorage0 = null;
        Payment payment1 = new Payment(invoiceStorage0);
        java.util.List<PaymentRecord> paymentRecordList2 = payment1.getPaymentRecords();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean4 = payment1.payByCash((int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"InvoiceStorage.getInvoice(int)\" because \"this.invoiceStorage\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(paymentRecordList2);
    }

    @Test
    public void test0011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PaymentTest0.test0011");
        InvoiceStorage invoiceStorage0 = null;
        Payment payment1 = new Payment(invoiceStorage0);
        java.util.List<PaymentRecord> paymentRecordList2 = payment1.getPaymentRecords();
        java.lang.Class<?> wildcardClass3 = payment1.getClass();
        org.junit.Assert.assertNotNull(paymentRecordList2);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test0012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PaymentTest0.test0012");
        InvoiceStorage invoiceStorage0 = null;
        Payment payment1 = new Payment(invoiceStorage0);
        java.util.List<PaymentRecord> paymentRecordList2 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList3 = payment1.getPaymentRecords();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean6 = payment1.payOnline(100, "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"InvoiceStorage.getInvoice(int)\" because \"this.invoiceStorage\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(paymentRecordList2);
        org.junit.Assert.assertNotNull(paymentRecordList3);
    }

    @Test
    public void test0013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PaymentTest0.test0013");
        InvoiceStorage invoiceStorage0 = null;
        Payment payment1 = new Payment(invoiceStorage0);
        java.util.List<PaymentRecord> paymentRecordList2 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList3 = payment1.getPaymentRecords();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean5 = payment1.payByCash(0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"InvoiceStorage.getInvoice(int)\" because \"this.invoiceStorage\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(paymentRecordList2);
        org.junit.Assert.assertNotNull(paymentRecordList3);
    }

    @Test
    public void test0014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PaymentTest0.test0014");
        InvoiceStorage invoiceStorage0 = null;
        Payment payment1 = new Payment(invoiceStorage0);
        java.util.List<PaymentRecord> paymentRecordList2 = payment1.getPaymentRecords();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean7 = payment1.payByCard((int) (short) -1, "", "", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"InvoiceStorage.getInvoice(int)\" because \"this.invoiceStorage\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(paymentRecordList2);
    }

    @Test
    public void test0015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PaymentTest0.test0015");
        InvoiceStorage invoiceStorage0 = null;
        Payment payment1 = new Payment(invoiceStorage0);
        java.util.List<PaymentRecord> paymentRecordList2 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList3 = payment1.getPaymentRecords();
        java.lang.Class<?> wildcardClass4 = payment1.getClass();
        org.junit.Assert.assertNotNull(paymentRecordList2);
        org.junit.Assert.assertNotNull(paymentRecordList3);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PaymentTest0.test0016");
        InvoiceStorage invoiceStorage0 = null;
        Payment payment1 = new Payment(invoiceStorage0);
        java.util.List<PaymentRecord> paymentRecordList2 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList3 = payment1.getPaymentRecords();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean6 = payment1.payOnline((int) (byte) -1, "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"InvoiceStorage.getInvoice(int)\" because \"this.invoiceStorage\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(paymentRecordList2);
        org.junit.Assert.assertNotNull(paymentRecordList3);
    }

    @Test
    public void test0017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PaymentTest0.test0017");
        InvoiceStorage invoiceStorage0 = null;
        Payment payment1 = new Payment(invoiceStorage0);
        java.lang.Class<?> wildcardClass2 = payment1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test0018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PaymentTest0.test0018");
        InvoiceStorage invoiceStorage0 = null;
        Payment payment1 = new Payment(invoiceStorage0);
        java.util.List<PaymentRecord> paymentRecordList2 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList3 = payment1.getPaymentRecords();
        java.lang.Class<?> wildcardClass4 = paymentRecordList3.getClass();
        org.junit.Assert.assertNotNull(paymentRecordList2);
        org.junit.Assert.assertNotNull(paymentRecordList3);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PaymentTest0.test0019");
        InvoiceStorage invoiceStorage0 = null;
        Payment payment1 = new Payment(invoiceStorage0);
        java.util.List<PaymentRecord> paymentRecordList2 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList3 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList4 = payment1.getPaymentRecords();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean7 = payment1.payOnline((int) ' ', "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"InvoiceStorage.getInvoice(int)\" because \"this.invoiceStorage\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(paymentRecordList2);
        org.junit.Assert.assertNotNull(paymentRecordList3);
        org.junit.Assert.assertNotNull(paymentRecordList4);
    }

    @Test
    public void test0020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PaymentTest0.test0020");
        InvoiceStorage invoiceStorage0 = null;
        Payment payment1 = new Payment(invoiceStorage0);
        java.util.List<PaymentRecord> paymentRecordList2 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList3 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList4 = payment1.getPaymentRecords();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean6 = payment1.payByCash((int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"InvoiceStorage.getInvoice(int)\" because \"this.invoiceStorage\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(paymentRecordList2);
        org.junit.Assert.assertNotNull(paymentRecordList3);
        org.junit.Assert.assertNotNull(paymentRecordList4);
    }

    @Test
    public void test0021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PaymentTest0.test0021");
        InvoiceStorage invoiceStorage0 = null;
        Payment payment1 = new Payment(invoiceStorage0);
        java.util.List<PaymentRecord> paymentRecordList2 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList3 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList4 = payment1.getPaymentRecords();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean9 = payment1.payByCard((int) ' ', "", "hi!", "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"InvoiceStorage.getInvoice(int)\" because \"this.invoiceStorage\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(paymentRecordList2);
        org.junit.Assert.assertNotNull(paymentRecordList3);
        org.junit.Assert.assertNotNull(paymentRecordList4);
    }

    @Test
    public void test0022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PaymentTest0.test0022");
        InvoiceStorage invoiceStorage0 = null;
        Payment payment1 = new Payment(invoiceStorage0);
        java.util.List<PaymentRecord> paymentRecordList2 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList3 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList4 = payment1.getPaymentRecords();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean6 = payment1.payByCash((int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"InvoiceStorage.getInvoice(int)\" because \"this.invoiceStorage\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(paymentRecordList2);
        org.junit.Assert.assertNotNull(paymentRecordList3);
        org.junit.Assert.assertNotNull(paymentRecordList4);
    }

    @Test
    public void test0023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PaymentTest0.test0023");
        InvoiceStorage invoiceStorage0 = null;
        Payment payment1 = new Payment(invoiceStorage0);
        java.util.List<PaymentRecord> paymentRecordList2 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList3 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList4 = payment1.getPaymentRecords();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean7 = payment1.payOnline(0, "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"InvoiceStorage.getInvoice(int)\" because \"this.invoiceStorage\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(paymentRecordList2);
        org.junit.Assert.assertNotNull(paymentRecordList3);
        org.junit.Assert.assertNotNull(paymentRecordList4);
    }

    @Test
    public void test0024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PaymentTest0.test0024");
        InvoiceStorage invoiceStorage0 = null;
        Payment payment1 = new Payment(invoiceStorage0);
        java.util.List<PaymentRecord> paymentRecordList2 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList3 = payment1.getPaymentRecords();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean5 = payment1.payByCash((int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"InvoiceStorage.getInvoice(int)\" because \"this.invoiceStorage\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(paymentRecordList2);
        org.junit.Assert.assertNotNull(paymentRecordList3);
    }

    @Test
    public void test0025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PaymentTest0.test0025");
        InvoiceStorage invoiceStorage0 = null;
        Payment payment1 = new Payment(invoiceStorage0);
        java.util.List<PaymentRecord> paymentRecordList2 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList3 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList4 = payment1.getPaymentRecords();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean9 = payment1.payByCard((int) (byte) 10, "", "hi!", "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"InvoiceStorage.getInvoice(int)\" because \"this.invoiceStorage\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(paymentRecordList2);
        org.junit.Assert.assertNotNull(paymentRecordList3);
        org.junit.Assert.assertNotNull(paymentRecordList4);
    }

    @Test
    public void test0026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PaymentTest0.test0026");
        InvoiceStorage invoiceStorage0 = null;
        Payment payment1 = new Payment(invoiceStorage0);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = payment1.payByCash((-1));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"InvoiceStorage.getInvoice(int)\" because \"this.invoiceStorage\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PaymentTest0.test0027");
        InvoiceStorage invoiceStorage0 = null;
        Payment payment1 = new Payment(invoiceStorage0);
        java.util.List<PaymentRecord> paymentRecordList2 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList3 = payment1.getPaymentRecords();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean6 = payment1.payOnline((int) (short) 1, "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"InvoiceStorage.getInvoice(int)\" because \"this.invoiceStorage\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(paymentRecordList2);
        org.junit.Assert.assertNotNull(paymentRecordList3);
    }

    @Test
    public void test0028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PaymentTest0.test0028");
        InvoiceStorage invoiceStorage0 = null;
        Payment payment1 = new Payment(invoiceStorage0);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean6 = payment1.payByCard((int) (short) 1, "", "", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"InvoiceStorage.getInvoice(int)\" because \"this.invoiceStorage\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PaymentTest0.test0029");
        InvoiceStorage invoiceStorage0 = null;
        Payment payment1 = new Payment(invoiceStorage0);
        java.util.List<PaymentRecord> paymentRecordList2 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList3 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList4 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList5 = payment1.getPaymentRecords();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean8 = payment1.payOnline((int) (byte) 0, "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"InvoiceStorage.getInvoice(int)\" because \"this.invoiceStorage\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(paymentRecordList2);
        org.junit.Assert.assertNotNull(paymentRecordList3);
        org.junit.Assert.assertNotNull(paymentRecordList4);
        org.junit.Assert.assertNotNull(paymentRecordList5);
    }

    @Test
    public void test0030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PaymentTest0.test0030");
        InvoiceStorage invoiceStorage0 = null;
        Payment payment1 = new Payment(invoiceStorage0);
        java.util.List<PaymentRecord> paymentRecordList2 = payment1.getPaymentRecords();
        java.lang.Class<?> wildcardClass3 = paymentRecordList2.getClass();
        org.junit.Assert.assertNotNull(paymentRecordList2);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test0031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PaymentTest0.test0031");
        InvoiceStorage invoiceStorage0 = null;
        Payment payment1 = new Payment(invoiceStorage0);
        java.util.List<PaymentRecord> paymentRecordList2 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList3 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList4 = payment1.getPaymentRecords();
        java.lang.Class<?> wildcardClass5 = payment1.getClass();
        org.junit.Assert.assertNotNull(paymentRecordList2);
        org.junit.Assert.assertNotNull(paymentRecordList3);
        org.junit.Assert.assertNotNull(paymentRecordList4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PaymentTest0.test0032");
        InvoiceStorage invoiceStorage0 = null;
        Payment payment1 = new Payment(invoiceStorage0);
        java.util.List<PaymentRecord> paymentRecordList2 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList3 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList4 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList5 = payment1.getPaymentRecords();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean7 = payment1.payByCash((-1));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"InvoiceStorage.getInvoice(int)\" because \"this.invoiceStorage\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(paymentRecordList2);
        org.junit.Assert.assertNotNull(paymentRecordList3);
        org.junit.Assert.assertNotNull(paymentRecordList4);
        org.junit.Assert.assertNotNull(paymentRecordList5);
    }

    @Test
    public void test0033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PaymentTest0.test0033");
        InvoiceStorage invoiceStorage0 = null;
        Payment payment1 = new Payment(invoiceStorage0);
        java.util.List<PaymentRecord> paymentRecordList2 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList3 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList4 = payment1.getPaymentRecords();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean7 = payment1.payOnline((int) (byte) -1, "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"InvoiceStorage.getInvoice(int)\" because \"this.invoiceStorage\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(paymentRecordList2);
        org.junit.Assert.assertNotNull(paymentRecordList3);
        org.junit.Assert.assertNotNull(paymentRecordList4);
    }

    @Test
    public void test0034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PaymentTest0.test0034");
        InvoiceStorage invoiceStorage0 = null;
        Payment payment1 = new Payment(invoiceStorage0);
        java.util.List<PaymentRecord> paymentRecordList2 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList3 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList4 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList5 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList6 = payment1.getPaymentRecords();
        java.lang.Class<?> wildcardClass7 = payment1.getClass();
        org.junit.Assert.assertNotNull(paymentRecordList2);
        org.junit.Assert.assertNotNull(paymentRecordList3);
        org.junit.Assert.assertNotNull(paymentRecordList4);
        org.junit.Assert.assertNotNull(paymentRecordList5);
        org.junit.Assert.assertNotNull(paymentRecordList6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PaymentTest0.test0035");
        InvoiceStorage invoiceStorage0 = null;
        Payment payment1 = new Payment(invoiceStorage0);
        java.util.List<PaymentRecord> paymentRecordList2 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList3 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList4 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList5 = payment1.getPaymentRecords();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean7 = payment1.payByCash((int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"InvoiceStorage.getInvoice(int)\" because \"this.invoiceStorage\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(paymentRecordList2);
        org.junit.Assert.assertNotNull(paymentRecordList3);
        org.junit.Assert.assertNotNull(paymentRecordList4);
        org.junit.Assert.assertNotNull(paymentRecordList5);
    }

    @Test
    public void test0036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PaymentTest0.test0036");
        InvoiceStorage invoiceStorage0 = null;
        Payment payment1 = new Payment(invoiceStorage0);
        java.util.List<PaymentRecord> paymentRecordList2 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList3 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList4 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList5 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList6 = payment1.getPaymentRecords();
        java.lang.Class<?> wildcardClass7 = paymentRecordList6.getClass();
        org.junit.Assert.assertNotNull(paymentRecordList2);
        org.junit.Assert.assertNotNull(paymentRecordList3);
        org.junit.Assert.assertNotNull(paymentRecordList4);
        org.junit.Assert.assertNotNull(paymentRecordList5);
        org.junit.Assert.assertNotNull(paymentRecordList6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PaymentTest0.test0037");
        InvoiceStorage invoiceStorage0 = null;
        Payment payment1 = new Payment(invoiceStorage0);
        java.util.List<PaymentRecord> paymentRecordList2 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList3 = payment1.getPaymentRecords();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean6 = payment1.payOnline((int) '#', "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"InvoiceStorage.getInvoice(int)\" because \"this.invoiceStorage\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(paymentRecordList2);
        org.junit.Assert.assertNotNull(paymentRecordList3);
    }

    @Test
    public void test0038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PaymentTest0.test0038");
        InvoiceStorage invoiceStorage0 = null;
        Payment payment1 = new Payment(invoiceStorage0);
        java.util.List<PaymentRecord> paymentRecordList2 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList3 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList4 = payment1.getPaymentRecords();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean6 = payment1.payByCash((int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"InvoiceStorage.getInvoice(int)\" because \"this.invoiceStorage\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(paymentRecordList2);
        org.junit.Assert.assertNotNull(paymentRecordList3);
        org.junit.Assert.assertNotNull(paymentRecordList4);
    }

    @Test
    public void test0039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PaymentTest0.test0039");
        InvoiceStorage invoiceStorage0 = null;
        Payment payment1 = new Payment(invoiceStorage0);
        java.util.List<PaymentRecord> paymentRecordList2 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList3 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList4 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList5 = payment1.getPaymentRecords();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean10 = payment1.payByCard((int) (byte) 100, "hi!", "", "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"InvoiceStorage.getInvoice(int)\" because \"this.invoiceStorage\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(paymentRecordList2);
        org.junit.Assert.assertNotNull(paymentRecordList3);
        org.junit.Assert.assertNotNull(paymentRecordList4);
        org.junit.Assert.assertNotNull(paymentRecordList5);
    }

    @Test
    public void test0040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PaymentTest0.test0040");
        InvoiceStorage invoiceStorage0 = null;
        Payment payment1 = new Payment(invoiceStorage0);
        java.util.List<PaymentRecord> paymentRecordList2 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList3 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList4 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList5 = payment1.getPaymentRecords();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean8 = payment1.payOnline((int) ' ', "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"InvoiceStorage.getInvoice(int)\" because \"this.invoiceStorage\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(paymentRecordList2);
        org.junit.Assert.assertNotNull(paymentRecordList3);
        org.junit.Assert.assertNotNull(paymentRecordList4);
        org.junit.Assert.assertNotNull(paymentRecordList5);
    }

    @Test
    public void test0041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PaymentTest0.test0041");
        InvoiceStorage invoiceStorage0 = null;
        Payment payment1 = new Payment(invoiceStorage0);
        java.util.List<PaymentRecord> paymentRecordList2 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList3 = payment1.getPaymentRecords();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean5 = payment1.payByCash((-1));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"InvoiceStorage.getInvoice(int)\" because \"this.invoiceStorage\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(paymentRecordList2);
        org.junit.Assert.assertNotNull(paymentRecordList3);
    }

    @Test
    public void test0042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PaymentTest0.test0042");
        InvoiceStorage invoiceStorage0 = null;
        Payment payment1 = new Payment(invoiceStorage0);
        java.util.List<PaymentRecord> paymentRecordList2 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList3 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList4 = payment1.getPaymentRecords();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean7 = payment1.payOnline((int) (short) 100, "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"InvoiceStorage.getInvoice(int)\" because \"this.invoiceStorage\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(paymentRecordList2);
        org.junit.Assert.assertNotNull(paymentRecordList3);
        org.junit.Assert.assertNotNull(paymentRecordList4);
    }

    @Test
    public void test0043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PaymentTest0.test0043");
        InvoiceStorage invoiceStorage0 = null;
        Payment payment1 = new Payment(invoiceStorage0);
        java.util.List<PaymentRecord> paymentRecordList2 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList3 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList4 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList5 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList6 = payment1.getPaymentRecords();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean9 = payment1.payOnline((-1), "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"InvoiceStorage.getInvoice(int)\" because \"this.invoiceStorage\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(paymentRecordList2);
        org.junit.Assert.assertNotNull(paymentRecordList3);
        org.junit.Assert.assertNotNull(paymentRecordList4);
        org.junit.Assert.assertNotNull(paymentRecordList5);
        org.junit.Assert.assertNotNull(paymentRecordList6);
    }

    @Test
    public void test0044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PaymentTest0.test0044");
        InvoiceStorage invoiceStorage0 = null;
        Payment payment1 = new Payment(invoiceStorage0);
        java.util.List<PaymentRecord> paymentRecordList2 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList3 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList4 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList5 = payment1.getPaymentRecords();
        java.lang.Class<?> wildcardClass6 = payment1.getClass();
        org.junit.Assert.assertNotNull(paymentRecordList2);
        org.junit.Assert.assertNotNull(paymentRecordList3);
        org.junit.Assert.assertNotNull(paymentRecordList4);
        org.junit.Assert.assertNotNull(paymentRecordList5);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PaymentTest0.test0045");
        InvoiceStorage invoiceStorage0 = null;
        Payment payment1 = new Payment(invoiceStorage0);
        java.util.List<PaymentRecord> paymentRecordList2 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList3 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList4 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList5 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList6 = payment1.getPaymentRecords();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean8 = payment1.payByCash((-1));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"InvoiceStorage.getInvoice(int)\" because \"this.invoiceStorage\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(paymentRecordList2);
        org.junit.Assert.assertNotNull(paymentRecordList3);
        org.junit.Assert.assertNotNull(paymentRecordList4);
        org.junit.Assert.assertNotNull(paymentRecordList5);
        org.junit.Assert.assertNotNull(paymentRecordList6);
    }

    @Test
    public void test0046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PaymentTest0.test0046");
        InvoiceStorage invoiceStorage0 = null;
        Payment payment1 = new Payment(invoiceStorage0);
        java.util.List<PaymentRecord> paymentRecordList2 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList3 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList4 = payment1.getPaymentRecords();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean6 = payment1.payByCash((int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"InvoiceStorage.getInvoice(int)\" because \"this.invoiceStorage\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(paymentRecordList2);
        org.junit.Assert.assertNotNull(paymentRecordList3);
        org.junit.Assert.assertNotNull(paymentRecordList4);
    }

    @Test
    public void test0047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PaymentTest0.test0047");
        InvoiceStorage invoiceStorage0 = null;
        Payment payment1 = new Payment(invoiceStorage0);
        java.util.List<PaymentRecord> paymentRecordList2 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList3 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList4 = payment1.getPaymentRecords();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean9 = payment1.payByCard((int) 'a', "hi!", "hi!", "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"InvoiceStorage.getInvoice(int)\" because \"this.invoiceStorage\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(paymentRecordList2);
        org.junit.Assert.assertNotNull(paymentRecordList3);
        org.junit.Assert.assertNotNull(paymentRecordList4);
    }

    @Test
    public void test0048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PaymentTest0.test0048");
        InvoiceStorage invoiceStorage0 = null;
        Payment payment1 = new Payment(invoiceStorage0);
        java.util.List<PaymentRecord> paymentRecordList2 = payment1.getPaymentRecords();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean5 = payment1.payOnline((int) (byte) 10, "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"InvoiceStorage.getInvoice(int)\" because \"this.invoiceStorage\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(paymentRecordList2);
    }

    @Test
    public void test0049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PaymentTest0.test0049");
        InvoiceStorage invoiceStorage0 = null;
        Payment payment1 = new Payment(invoiceStorage0);
        java.util.List<PaymentRecord> paymentRecordList2 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList3 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList4 = payment1.getPaymentRecords();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean7 = payment1.payOnline(1, "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"InvoiceStorage.getInvoice(int)\" because \"this.invoiceStorage\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(paymentRecordList2);
        org.junit.Assert.assertNotNull(paymentRecordList3);
        org.junit.Assert.assertNotNull(paymentRecordList4);
    }

    @Test
    public void test0050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PaymentTest0.test0050");
        InvoiceStorage invoiceStorage0 = null;
        Payment payment1 = new Payment(invoiceStorage0);
        java.util.List<PaymentRecord> paymentRecordList2 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList3 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList4 = payment1.getPaymentRecords();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean9 = payment1.payByCard((int) '#', "", "", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"InvoiceStorage.getInvoice(int)\" because \"this.invoiceStorage\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(paymentRecordList2);
        org.junit.Assert.assertNotNull(paymentRecordList3);
        org.junit.Assert.assertNotNull(paymentRecordList4);
    }

    @Test
    public void test0051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PaymentTest0.test0051");
        InvoiceStorage invoiceStorage0 = null;
        Payment payment1 = new Payment(invoiceStorage0);
        java.util.List<PaymentRecord> paymentRecordList2 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList3 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList4 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList5 = payment1.getPaymentRecords();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean10 = payment1.payByCard((int) (short) -1, "", "", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"InvoiceStorage.getInvoice(int)\" because \"this.invoiceStorage\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(paymentRecordList2);
        org.junit.Assert.assertNotNull(paymentRecordList3);
        org.junit.Assert.assertNotNull(paymentRecordList4);
        org.junit.Assert.assertNotNull(paymentRecordList5);
    }

    @Test
    public void test0052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PaymentTest0.test0052");
        InvoiceStorage invoiceStorage0 = null;
        Payment payment1 = new Payment(invoiceStorage0);
        java.util.List<PaymentRecord> paymentRecordList2 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList3 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList4 = payment1.getPaymentRecords();
        java.lang.Class<?> wildcardClass5 = paymentRecordList4.getClass();
        org.junit.Assert.assertNotNull(paymentRecordList2);
        org.junit.Assert.assertNotNull(paymentRecordList3);
        org.junit.Assert.assertNotNull(paymentRecordList4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PaymentTest0.test0053");
        InvoiceStorage invoiceStorage0 = null;
        Payment payment1 = new Payment(invoiceStorage0);
        java.util.List<PaymentRecord> paymentRecordList2 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList3 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList4 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList5 = payment1.getPaymentRecords();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean10 = payment1.payByCard((int) (short) 0, "", "", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"InvoiceStorage.getInvoice(int)\" because \"this.invoiceStorage\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(paymentRecordList2);
        org.junit.Assert.assertNotNull(paymentRecordList3);
        org.junit.Assert.assertNotNull(paymentRecordList4);
        org.junit.Assert.assertNotNull(paymentRecordList5);
    }

    @Test
    public void test0054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PaymentTest0.test0054");
        InvoiceStorage invoiceStorage0 = null;
        Payment payment1 = new Payment(invoiceStorage0);
        java.util.List<PaymentRecord> paymentRecordList2 = payment1.getPaymentRecords();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean7 = payment1.payByCard(1, "hi!", "hi!", "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"InvoiceStorage.getInvoice(int)\" because \"this.invoiceStorage\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(paymentRecordList2);
    }

    @Test
    public void test0055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PaymentTest0.test0055");
        InvoiceStorage invoiceStorage0 = null;
        Payment payment1 = new Payment(invoiceStorage0);
        java.util.List<PaymentRecord> paymentRecordList2 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList3 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList4 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList5 = payment1.getPaymentRecords();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean7 = payment1.payByCash((int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"InvoiceStorage.getInvoice(int)\" because \"this.invoiceStorage\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(paymentRecordList2);
        org.junit.Assert.assertNotNull(paymentRecordList3);
        org.junit.Assert.assertNotNull(paymentRecordList4);
        org.junit.Assert.assertNotNull(paymentRecordList5);
    }

    @Test
    public void test0056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PaymentTest0.test0056");
        InvoiceStorage invoiceStorage0 = null;
        Payment payment1 = new Payment(invoiceStorage0);
        java.util.List<PaymentRecord> paymentRecordList2 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList3 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList4 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList5 = payment1.getPaymentRecords();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean10 = payment1.payByCard((int) '4', "hi!", "", "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"InvoiceStorage.getInvoice(int)\" because \"this.invoiceStorage\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(paymentRecordList2);
        org.junit.Assert.assertNotNull(paymentRecordList3);
        org.junit.Assert.assertNotNull(paymentRecordList4);
        org.junit.Assert.assertNotNull(paymentRecordList5);
    }

    @Test
    public void test0057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PaymentTest0.test0057");
        InvoiceStorage invoiceStorage0 = null;
        Payment payment1 = new Payment(invoiceStorage0);
        java.util.List<PaymentRecord> paymentRecordList2 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList3 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList4 = payment1.getPaymentRecords();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean9 = payment1.payByCard(100, "", "", "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"InvoiceStorage.getInvoice(int)\" because \"this.invoiceStorage\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(paymentRecordList2);
        org.junit.Assert.assertNotNull(paymentRecordList3);
        org.junit.Assert.assertNotNull(paymentRecordList4);
    }

    @Test
    public void test0058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PaymentTest0.test0058");
        InvoiceStorage invoiceStorage0 = null;
        Payment payment1 = new Payment(invoiceStorage0);
        java.util.List<PaymentRecord> paymentRecordList2 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList3 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList4 = payment1.getPaymentRecords();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean9 = payment1.payByCard((int) (byte) 10, "hi!", "", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"InvoiceStorage.getInvoice(int)\" because \"this.invoiceStorage\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(paymentRecordList2);
        org.junit.Assert.assertNotNull(paymentRecordList3);
        org.junit.Assert.assertNotNull(paymentRecordList4);
    }

    @Test
    public void test0059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PaymentTest0.test0059");
        InvoiceStorage invoiceStorage0 = null;
        Payment payment1 = new Payment(invoiceStorage0);
        java.util.List<PaymentRecord> paymentRecordList2 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList3 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList4 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList5 = payment1.getPaymentRecords();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean10 = payment1.payByCard((int) (short) 100, "hi!", "", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"InvoiceStorage.getInvoice(int)\" because \"this.invoiceStorage\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(paymentRecordList2);
        org.junit.Assert.assertNotNull(paymentRecordList3);
        org.junit.Assert.assertNotNull(paymentRecordList4);
        org.junit.Assert.assertNotNull(paymentRecordList5);
    }

    @Test
    public void test0060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PaymentTest0.test0060");
        InvoiceStorage invoiceStorage0 = null;
        Payment payment1 = new Payment(invoiceStorage0);
        java.util.List<PaymentRecord> paymentRecordList2 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList3 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList4 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList5 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList6 = payment1.getPaymentRecords();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean11 = payment1.payByCard((int) (short) 0, "hi!", "hi!", "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"InvoiceStorage.getInvoice(int)\" because \"this.invoiceStorage\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(paymentRecordList2);
        org.junit.Assert.assertNotNull(paymentRecordList3);
        org.junit.Assert.assertNotNull(paymentRecordList4);
        org.junit.Assert.assertNotNull(paymentRecordList5);
        org.junit.Assert.assertNotNull(paymentRecordList6);
    }

    @Test
    public void test0061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PaymentTest0.test0061");
        InvoiceStorage invoiceStorage0 = null;
        Payment payment1 = new Payment(invoiceStorage0);
        java.util.List<PaymentRecord> paymentRecordList2 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList3 = payment1.getPaymentRecords();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean6 = payment1.payOnline((int) (byte) 1, "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"InvoiceStorage.getInvoice(int)\" because \"this.invoiceStorage\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(paymentRecordList2);
        org.junit.Assert.assertNotNull(paymentRecordList3);
    }

    @Test
    public void test0062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PaymentTest0.test0062");
        InvoiceStorage invoiceStorage0 = null;
        Payment payment1 = new Payment(invoiceStorage0);
        java.util.List<PaymentRecord> paymentRecordList2 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList3 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList4 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList5 = payment1.getPaymentRecords();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean8 = payment1.payOnline((int) (short) 10, "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"InvoiceStorage.getInvoice(int)\" because \"this.invoiceStorage\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(paymentRecordList2);
        org.junit.Assert.assertNotNull(paymentRecordList3);
        org.junit.Assert.assertNotNull(paymentRecordList4);
        org.junit.Assert.assertNotNull(paymentRecordList5);
    }

    @Test
    public void test0063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PaymentTest0.test0063");
        InvoiceStorage invoiceStorage0 = null;
        Payment payment1 = new Payment(invoiceStorage0);
        java.util.List<PaymentRecord> paymentRecordList2 = payment1.getPaymentRecords();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean7 = payment1.payByCard((int) (byte) 0, "hi!", "", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"InvoiceStorage.getInvoice(int)\" because \"this.invoiceStorage\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(paymentRecordList2);
    }

    @Test
    public void test0064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PaymentTest0.test0064");
        InvoiceStorage invoiceStorage0 = null;
        Payment payment1 = new Payment(invoiceStorage0);
        java.util.List<PaymentRecord> paymentRecordList2 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList3 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList4 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList5 = payment1.getPaymentRecords();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean7 = payment1.payByCash((int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"InvoiceStorage.getInvoice(int)\" because \"this.invoiceStorage\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(paymentRecordList2);
        org.junit.Assert.assertNotNull(paymentRecordList3);
        org.junit.Assert.assertNotNull(paymentRecordList4);
        org.junit.Assert.assertNotNull(paymentRecordList5);
    }

    @Test
    public void test0065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PaymentTest0.test0065");
        InvoiceStorage invoiceStorage0 = null;
        Payment payment1 = new Payment(invoiceStorage0);
        java.util.List<PaymentRecord> paymentRecordList2 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList3 = payment1.getPaymentRecords();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean6 = payment1.payOnline((int) (short) -1, "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"InvoiceStorage.getInvoice(int)\" because \"this.invoiceStorage\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(paymentRecordList2);
        org.junit.Assert.assertNotNull(paymentRecordList3);
    }

    @Test
    public void test0066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PaymentTest0.test0066");
        InvoiceStorage invoiceStorage0 = null;
        Payment payment1 = new Payment(invoiceStorage0);
        java.util.List<PaymentRecord> paymentRecordList2 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList3 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList4 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList5 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList6 = payment1.getPaymentRecords();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean11 = payment1.payByCard((int) ' ', "", "", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"InvoiceStorage.getInvoice(int)\" because \"this.invoiceStorage\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(paymentRecordList2);
        org.junit.Assert.assertNotNull(paymentRecordList3);
        org.junit.Assert.assertNotNull(paymentRecordList4);
        org.junit.Assert.assertNotNull(paymentRecordList5);
        org.junit.Assert.assertNotNull(paymentRecordList6);
    }

    @Test
    public void test0067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PaymentTest0.test0067");
        InvoiceStorage invoiceStorage0 = null;
        Payment payment1 = new Payment(invoiceStorage0);
        java.util.List<PaymentRecord> paymentRecordList2 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList3 = payment1.getPaymentRecords();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean5 = payment1.payByCash((int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"InvoiceStorage.getInvoice(int)\" because \"this.invoiceStorage\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(paymentRecordList2);
        org.junit.Assert.assertNotNull(paymentRecordList3);
    }

    @Test
    public void test0068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PaymentTest0.test0068");
        InvoiceStorage invoiceStorage0 = null;
        Payment payment1 = new Payment(invoiceStorage0);
        java.util.List<PaymentRecord> paymentRecordList2 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList3 = payment1.getPaymentRecords();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean6 = payment1.payOnline(10, "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"InvoiceStorage.getInvoice(int)\" because \"this.invoiceStorage\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(paymentRecordList2);
        org.junit.Assert.assertNotNull(paymentRecordList3);
    }

    @Test
    public void test0069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PaymentTest0.test0069");
        InvoiceStorage invoiceStorage0 = null;
        Payment payment1 = new Payment(invoiceStorage0);
        java.util.List<PaymentRecord> paymentRecordList2 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList3 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList4 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList5 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList6 = payment1.getPaymentRecords();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean8 = payment1.payByCash((int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"InvoiceStorage.getInvoice(int)\" because \"this.invoiceStorage\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(paymentRecordList2);
        org.junit.Assert.assertNotNull(paymentRecordList3);
        org.junit.Assert.assertNotNull(paymentRecordList4);
        org.junit.Assert.assertNotNull(paymentRecordList5);
        org.junit.Assert.assertNotNull(paymentRecordList6);
    }

    @Test
    public void test0070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PaymentTest0.test0070");
        InvoiceStorage invoiceStorage0 = null;
        Payment payment1 = new Payment(invoiceStorage0);
        java.util.List<PaymentRecord> paymentRecordList2 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList3 = payment1.getPaymentRecords();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean5 = payment1.payByCash(100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"InvoiceStorage.getInvoice(int)\" because \"this.invoiceStorage\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(paymentRecordList2);
        org.junit.Assert.assertNotNull(paymentRecordList3);
    }

    @Test
    public void test0071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PaymentTest0.test0071");
        InvoiceStorage invoiceStorage0 = null;
        Payment payment1 = new Payment(invoiceStorage0);
        java.util.List<PaymentRecord> paymentRecordList2 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList3 = payment1.getPaymentRecords();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean8 = payment1.payByCard((int) (byte) 10, "hi!", "", "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"InvoiceStorage.getInvoice(int)\" because \"this.invoiceStorage\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(paymentRecordList2);
        org.junit.Assert.assertNotNull(paymentRecordList3);
    }

    @Test
    public void test0072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PaymentTest0.test0072");
        InvoiceStorage invoiceStorage0 = null;
        Payment payment1 = new Payment(invoiceStorage0);
        java.util.List<PaymentRecord> paymentRecordList2 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList3 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList4 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList5 = payment1.getPaymentRecords();
        java.lang.Class<?> wildcardClass6 = paymentRecordList5.getClass();
        org.junit.Assert.assertNotNull(paymentRecordList2);
        org.junit.Assert.assertNotNull(paymentRecordList3);
        org.junit.Assert.assertNotNull(paymentRecordList4);
        org.junit.Assert.assertNotNull(paymentRecordList5);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PaymentTest0.test0073");
        InvoiceStorage invoiceStorage0 = null;
        Payment payment1 = new Payment(invoiceStorage0);
        java.util.List<PaymentRecord> paymentRecordList2 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList3 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList4 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList5 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList6 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList7 = payment1.getPaymentRecords();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean12 = payment1.payByCard(1, "hi!", "", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"InvoiceStorage.getInvoice(int)\" because \"this.invoiceStorage\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(paymentRecordList2);
        org.junit.Assert.assertNotNull(paymentRecordList3);
        org.junit.Assert.assertNotNull(paymentRecordList4);
        org.junit.Assert.assertNotNull(paymentRecordList5);
        org.junit.Assert.assertNotNull(paymentRecordList6);
        org.junit.Assert.assertNotNull(paymentRecordList7);
    }

    @Test
    public void test0074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PaymentTest0.test0074");
        InvoiceStorage invoiceStorage0 = null;
        Payment payment1 = new Payment(invoiceStorage0);
        java.util.List<PaymentRecord> paymentRecordList2 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList3 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList4 = payment1.getPaymentRecords();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean9 = payment1.payByCard((int) (short) 1, "", "hi!", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"InvoiceStorage.getInvoice(int)\" because \"this.invoiceStorage\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(paymentRecordList2);
        org.junit.Assert.assertNotNull(paymentRecordList3);
        org.junit.Assert.assertNotNull(paymentRecordList4);
    }

    @Test
    public void test0075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PaymentTest0.test0075");
        InvoiceStorage invoiceStorage0 = null;
        Payment payment1 = new Payment(invoiceStorage0);
        java.util.List<PaymentRecord> paymentRecordList2 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList3 = payment1.getPaymentRecords();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean6 = payment1.payOnline((int) (byte) 0, "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"InvoiceStorage.getInvoice(int)\" because \"this.invoiceStorage\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(paymentRecordList2);
        org.junit.Assert.assertNotNull(paymentRecordList3);
    }

    @Test
    public void test0076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PaymentTest0.test0076");
        InvoiceStorage invoiceStorage0 = null;
        Payment payment1 = new Payment(invoiceStorage0);
        java.util.List<PaymentRecord> paymentRecordList2 = payment1.getPaymentRecords();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean4 = payment1.payByCash(100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"InvoiceStorage.getInvoice(int)\" because \"this.invoiceStorage\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(paymentRecordList2);
    }

    @Test
    public void test0077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PaymentTest0.test0077");
        InvoiceStorage invoiceStorage0 = null;
        Payment payment1 = new Payment(invoiceStorage0);
        java.util.List<PaymentRecord> paymentRecordList2 = payment1.getPaymentRecords();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean7 = payment1.payByCard((int) (byte) 10, "hi!", "", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"InvoiceStorage.getInvoice(int)\" because \"this.invoiceStorage\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(paymentRecordList2);
    }

    @Test
    public void test0078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PaymentTest0.test0078");
        InvoiceStorage invoiceStorage0 = null;
        Payment payment1 = new Payment(invoiceStorage0);
        java.util.List<PaymentRecord> paymentRecordList2 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList3 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList4 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList5 = payment1.getPaymentRecords();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean10 = payment1.payByCard((int) (byte) 100, "", "", "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"InvoiceStorage.getInvoice(int)\" because \"this.invoiceStorage\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(paymentRecordList2);
        org.junit.Assert.assertNotNull(paymentRecordList3);
        org.junit.Assert.assertNotNull(paymentRecordList4);
        org.junit.Assert.assertNotNull(paymentRecordList5);
    }

    @Test
    public void test0079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PaymentTest0.test0079");
        InvoiceStorage invoiceStorage0 = null;
        Payment payment1 = new Payment(invoiceStorage0);
        java.util.List<PaymentRecord> paymentRecordList2 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList3 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList4 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList5 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList6 = payment1.getPaymentRecords();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean11 = payment1.payByCard((int) (short) 100, "hi!", "hi!", "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"InvoiceStorage.getInvoice(int)\" because \"this.invoiceStorage\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(paymentRecordList2);
        org.junit.Assert.assertNotNull(paymentRecordList3);
        org.junit.Assert.assertNotNull(paymentRecordList4);
        org.junit.Assert.assertNotNull(paymentRecordList5);
        org.junit.Assert.assertNotNull(paymentRecordList6);
    }

    @Test
    public void test0080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PaymentTest0.test0080");
        InvoiceStorage invoiceStorage0 = null;
        Payment payment1 = new Payment(invoiceStorage0);
        java.util.List<PaymentRecord> paymentRecordList2 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList3 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList4 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList5 = payment1.getPaymentRecords();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean10 = payment1.payByCard((int) (byte) -1, "hi!", "", "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"InvoiceStorage.getInvoice(int)\" because \"this.invoiceStorage\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(paymentRecordList2);
        org.junit.Assert.assertNotNull(paymentRecordList3);
        org.junit.Assert.assertNotNull(paymentRecordList4);
        org.junit.Assert.assertNotNull(paymentRecordList5);
    }

    @Test
    public void test0081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PaymentTest0.test0081");
        InvoiceStorage invoiceStorage0 = null;
        Payment payment1 = new Payment(invoiceStorage0);
        java.util.List<PaymentRecord> paymentRecordList2 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList3 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList4 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList5 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList6 = payment1.getPaymentRecords();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean8 = payment1.payByCash((int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"InvoiceStorage.getInvoice(int)\" because \"this.invoiceStorage\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(paymentRecordList2);
        org.junit.Assert.assertNotNull(paymentRecordList3);
        org.junit.Assert.assertNotNull(paymentRecordList4);
        org.junit.Assert.assertNotNull(paymentRecordList5);
        org.junit.Assert.assertNotNull(paymentRecordList6);
    }

    @Test
    public void test0082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PaymentTest0.test0082");
        InvoiceStorage invoiceStorage0 = null;
        Payment payment1 = new Payment(invoiceStorage0);
        java.util.List<PaymentRecord> paymentRecordList2 = payment1.getPaymentRecords();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean7 = payment1.payByCard(0, "hi!", "hi!", "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"InvoiceStorage.getInvoice(int)\" because \"this.invoiceStorage\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(paymentRecordList2);
    }

    @Test
    public void test0083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PaymentTest0.test0083");
        InvoiceStorage invoiceStorage0 = null;
        Payment payment1 = new Payment(invoiceStorage0);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = payment1.payByCash((int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"InvoiceStorage.getInvoice(int)\" because \"this.invoiceStorage\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PaymentTest0.test0084");
        InvoiceStorage invoiceStorage0 = null;
        Payment payment1 = new Payment(invoiceStorage0);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean6 = payment1.payByCard((int) (short) 100, "hi!", "hi!", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"InvoiceStorage.getInvoice(int)\" because \"this.invoiceStorage\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PaymentTest0.test0085");
        InvoiceStorage invoiceStorage0 = null;
        Payment payment1 = new Payment(invoiceStorage0);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = payment1.payByCash((int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"InvoiceStorage.getInvoice(int)\" because \"this.invoiceStorage\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PaymentTest0.test0086");
        InvoiceStorage invoiceStorage0 = null;
        Payment payment1 = new Payment(invoiceStorage0);
        java.util.List<PaymentRecord> paymentRecordList2 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList3 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList4 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList5 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList6 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList7 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList8 = payment1.getPaymentRecords();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean13 = payment1.payByCard((int) (short) -1, "", "hi!", "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"InvoiceStorage.getInvoice(int)\" because \"this.invoiceStorage\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(paymentRecordList2);
        org.junit.Assert.assertNotNull(paymentRecordList3);
        org.junit.Assert.assertNotNull(paymentRecordList4);
        org.junit.Assert.assertNotNull(paymentRecordList5);
        org.junit.Assert.assertNotNull(paymentRecordList6);
        org.junit.Assert.assertNotNull(paymentRecordList7);
        org.junit.Assert.assertNotNull(paymentRecordList8);
    }

    @Test
    public void test0087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PaymentTest0.test0087");
        InvoiceStorage invoiceStorage0 = null;
        Payment payment1 = new Payment(invoiceStorage0);
        java.util.List<PaymentRecord> paymentRecordList2 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList3 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList4 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList5 = payment1.getPaymentRecords();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean8 = payment1.payOnline((int) '#', "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"InvoiceStorage.getInvoice(int)\" because \"this.invoiceStorage\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(paymentRecordList2);
        org.junit.Assert.assertNotNull(paymentRecordList3);
        org.junit.Assert.assertNotNull(paymentRecordList4);
        org.junit.Assert.assertNotNull(paymentRecordList5);
    }

    @Test
    public void test0088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PaymentTest0.test0088");
        InvoiceStorage invoiceStorage0 = null;
        Payment payment1 = new Payment(invoiceStorage0);
        java.util.List<PaymentRecord> paymentRecordList2 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList3 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList4 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList5 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList6 = payment1.getPaymentRecords();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean8 = payment1.payByCash((int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"InvoiceStorage.getInvoice(int)\" because \"this.invoiceStorage\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(paymentRecordList2);
        org.junit.Assert.assertNotNull(paymentRecordList3);
        org.junit.Assert.assertNotNull(paymentRecordList4);
        org.junit.Assert.assertNotNull(paymentRecordList5);
        org.junit.Assert.assertNotNull(paymentRecordList6);
    }

    @Test
    public void test0089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PaymentTest0.test0089");
        InvoiceStorage invoiceStorage0 = null;
        Payment payment1 = new Payment(invoiceStorage0);
        java.util.List<PaymentRecord> paymentRecordList2 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList3 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList4 = payment1.getPaymentRecords();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean6 = payment1.payByCash(0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"InvoiceStorage.getInvoice(int)\" because \"this.invoiceStorage\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(paymentRecordList2);
        org.junit.Assert.assertNotNull(paymentRecordList3);
        org.junit.Assert.assertNotNull(paymentRecordList4);
    }

    @Test
    public void test0090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PaymentTest0.test0090");
        InvoiceStorage invoiceStorage0 = null;
        Payment payment1 = new Payment(invoiceStorage0);
        java.util.List<PaymentRecord> paymentRecordList2 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList3 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList4 = payment1.getPaymentRecords();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean7 = payment1.payOnline(10, "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"InvoiceStorage.getInvoice(int)\" because \"this.invoiceStorage\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(paymentRecordList2);
        org.junit.Assert.assertNotNull(paymentRecordList3);
        org.junit.Assert.assertNotNull(paymentRecordList4);
    }

    @Test
    public void test0091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PaymentTest0.test0091");
        InvoiceStorage invoiceStorage0 = null;
        Payment payment1 = new Payment(invoiceStorage0);
        java.util.List<PaymentRecord> paymentRecordList2 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList3 = payment1.getPaymentRecords();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean8 = payment1.payByCard((int) (byte) 0, "hi!", "", "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"InvoiceStorage.getInvoice(int)\" because \"this.invoiceStorage\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(paymentRecordList2);
        org.junit.Assert.assertNotNull(paymentRecordList3);
    }

    @Test
    public void test0092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PaymentTest0.test0092");
        InvoiceStorage invoiceStorage0 = null;
        Payment payment1 = new Payment(invoiceStorage0);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean6 = payment1.payByCard(100, "hi!", "hi!", "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"InvoiceStorage.getInvoice(int)\" because \"this.invoiceStorage\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PaymentTest0.test0093");
        InvoiceStorage invoiceStorage0 = null;
        Payment payment1 = new Payment(invoiceStorage0);
        java.util.List<PaymentRecord> paymentRecordList2 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList3 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList4 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList5 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList6 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList7 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList8 = payment1.getPaymentRecords();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean10 = payment1.payByCash((-1));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"InvoiceStorage.getInvoice(int)\" because \"this.invoiceStorage\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(paymentRecordList2);
        org.junit.Assert.assertNotNull(paymentRecordList3);
        org.junit.Assert.assertNotNull(paymentRecordList4);
        org.junit.Assert.assertNotNull(paymentRecordList5);
        org.junit.Assert.assertNotNull(paymentRecordList6);
        org.junit.Assert.assertNotNull(paymentRecordList7);
        org.junit.Assert.assertNotNull(paymentRecordList8);
    }

    @Test
    public void test0094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PaymentTest0.test0094");
        InvoiceStorage invoiceStorage0 = null;
        Payment payment1 = new Payment(invoiceStorage0);
        java.util.List<PaymentRecord> paymentRecordList2 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList3 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList4 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList5 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList6 = payment1.getPaymentRecords();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean11 = payment1.payByCard((int) '4', "", "", "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"InvoiceStorage.getInvoice(int)\" because \"this.invoiceStorage\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(paymentRecordList2);
        org.junit.Assert.assertNotNull(paymentRecordList3);
        org.junit.Assert.assertNotNull(paymentRecordList4);
        org.junit.Assert.assertNotNull(paymentRecordList5);
        org.junit.Assert.assertNotNull(paymentRecordList6);
    }

    @Test
    public void test0095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PaymentTest0.test0095");
        InvoiceStorage invoiceStorage0 = null;
        Payment payment1 = new Payment(invoiceStorage0);
        java.util.List<PaymentRecord> paymentRecordList2 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList3 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList4 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList5 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList6 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList7 = payment1.getPaymentRecords();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean9 = payment1.payByCash((int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"InvoiceStorage.getInvoice(int)\" because \"this.invoiceStorage\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(paymentRecordList2);
        org.junit.Assert.assertNotNull(paymentRecordList3);
        org.junit.Assert.assertNotNull(paymentRecordList4);
        org.junit.Assert.assertNotNull(paymentRecordList5);
        org.junit.Assert.assertNotNull(paymentRecordList6);
        org.junit.Assert.assertNotNull(paymentRecordList7);
    }

    @Test
    public void test0096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PaymentTest0.test0096");
        InvoiceStorage invoiceStorage0 = null;
        Payment payment1 = new Payment(invoiceStorage0);
        java.util.List<PaymentRecord> paymentRecordList2 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList3 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList4 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList5 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList6 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList7 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList8 = payment1.getPaymentRecords();
        java.lang.Class<?> wildcardClass9 = payment1.getClass();
        org.junit.Assert.assertNotNull(paymentRecordList2);
        org.junit.Assert.assertNotNull(paymentRecordList3);
        org.junit.Assert.assertNotNull(paymentRecordList4);
        org.junit.Assert.assertNotNull(paymentRecordList5);
        org.junit.Assert.assertNotNull(paymentRecordList6);
        org.junit.Assert.assertNotNull(paymentRecordList7);
        org.junit.Assert.assertNotNull(paymentRecordList8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PaymentTest0.test0097");
        InvoiceStorage invoiceStorage0 = null;
        Payment payment1 = new Payment(invoiceStorage0);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = payment1.payByCash((int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"InvoiceStorage.getInvoice(int)\" because \"this.invoiceStorage\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PaymentTest0.test0098");
        InvoiceStorage invoiceStorage0 = null;
        Payment payment1 = new Payment(invoiceStorage0);
        java.util.List<PaymentRecord> paymentRecordList2 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList3 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList4 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList5 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList6 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList7 = payment1.getPaymentRecords();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean9 = payment1.payByCash(10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"InvoiceStorage.getInvoice(int)\" because \"this.invoiceStorage\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(paymentRecordList2);
        org.junit.Assert.assertNotNull(paymentRecordList3);
        org.junit.Assert.assertNotNull(paymentRecordList4);
        org.junit.Assert.assertNotNull(paymentRecordList5);
        org.junit.Assert.assertNotNull(paymentRecordList6);
        org.junit.Assert.assertNotNull(paymentRecordList7);
    }

    @Test
    public void test0099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PaymentTest0.test0099");
        InvoiceStorage invoiceStorage0 = null;
        Payment payment1 = new Payment(invoiceStorage0);
        java.util.List<PaymentRecord> paymentRecordList2 = payment1.getPaymentRecords();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean5 = payment1.payOnline((int) (short) 100, "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"InvoiceStorage.getInvoice(int)\" because \"this.invoiceStorage\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(paymentRecordList2);
    }

    @Test
    public void test0100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PaymentTest0.test0100");
        InvoiceStorage invoiceStorage0 = null;
        Payment payment1 = new Payment(invoiceStorage0);
        java.util.List<PaymentRecord> paymentRecordList2 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList3 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList4 = payment1.getPaymentRecords();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean6 = payment1.payByCash((int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"InvoiceStorage.getInvoice(int)\" because \"this.invoiceStorage\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(paymentRecordList2);
        org.junit.Assert.assertNotNull(paymentRecordList3);
        org.junit.Assert.assertNotNull(paymentRecordList4);
    }

    @Test
    public void test0101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PaymentTest0.test0101");
        InvoiceStorage invoiceStorage0 = null;
        Payment payment1 = new Payment(invoiceStorage0);
        java.util.List<PaymentRecord> paymentRecordList2 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList3 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList4 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList5 = payment1.getPaymentRecords();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean8 = payment1.payOnline((int) 'a', "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"InvoiceStorage.getInvoice(int)\" because \"this.invoiceStorage\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(paymentRecordList2);
        org.junit.Assert.assertNotNull(paymentRecordList3);
        org.junit.Assert.assertNotNull(paymentRecordList4);
        org.junit.Assert.assertNotNull(paymentRecordList5);
    }

    @Test
    public void test0102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PaymentTest0.test0102");
        InvoiceStorage invoiceStorage0 = null;
        Payment payment1 = new Payment(invoiceStorage0);
        java.util.List<PaymentRecord> paymentRecordList2 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList3 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList4 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList5 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList6 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList7 = payment1.getPaymentRecords();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean10 = payment1.payOnline(0, "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"InvoiceStorage.getInvoice(int)\" because \"this.invoiceStorage\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(paymentRecordList2);
        org.junit.Assert.assertNotNull(paymentRecordList3);
        org.junit.Assert.assertNotNull(paymentRecordList4);
        org.junit.Assert.assertNotNull(paymentRecordList5);
        org.junit.Assert.assertNotNull(paymentRecordList6);
        org.junit.Assert.assertNotNull(paymentRecordList7);
    }

    @Test
    public void test0103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PaymentTest0.test0103");
        InvoiceStorage invoiceStorage0 = null;
        Payment payment1 = new Payment(invoiceStorage0);
        java.util.List<PaymentRecord> paymentRecordList2 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList3 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList4 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList5 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList6 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList7 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList8 = payment1.getPaymentRecords();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean11 = payment1.payOnline((-1), "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"InvoiceStorage.getInvoice(int)\" because \"this.invoiceStorage\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(paymentRecordList2);
        org.junit.Assert.assertNotNull(paymentRecordList3);
        org.junit.Assert.assertNotNull(paymentRecordList4);
        org.junit.Assert.assertNotNull(paymentRecordList5);
        org.junit.Assert.assertNotNull(paymentRecordList6);
        org.junit.Assert.assertNotNull(paymentRecordList7);
        org.junit.Assert.assertNotNull(paymentRecordList8);
    }

    @Test
    public void test0104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PaymentTest0.test0104");
        InvoiceStorage invoiceStorage0 = null;
        Payment payment1 = new Payment(invoiceStorage0);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean4 = payment1.payOnline(1, "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"InvoiceStorage.getInvoice(int)\" because \"this.invoiceStorage\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PaymentTest0.test0105");
        InvoiceStorage invoiceStorage0 = null;
        Payment payment1 = new Payment(invoiceStorage0);
        java.util.List<PaymentRecord> paymentRecordList2 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList3 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList4 = payment1.getPaymentRecords();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean9 = payment1.payByCard((int) (short) 100, "hi!", "hi!", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"InvoiceStorage.getInvoice(int)\" because \"this.invoiceStorage\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(paymentRecordList2);
        org.junit.Assert.assertNotNull(paymentRecordList3);
        org.junit.Assert.assertNotNull(paymentRecordList4);
    }

    @Test
    public void test0106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PaymentTest0.test0106");
        InvoiceStorage invoiceStorage0 = null;
        Payment payment1 = new Payment(invoiceStorage0);
        java.util.List<PaymentRecord> paymentRecordList2 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList3 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList4 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList5 = payment1.getPaymentRecords();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean10 = payment1.payByCard((int) (byte) 1, "", "", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"InvoiceStorage.getInvoice(int)\" because \"this.invoiceStorage\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(paymentRecordList2);
        org.junit.Assert.assertNotNull(paymentRecordList3);
        org.junit.Assert.assertNotNull(paymentRecordList4);
        org.junit.Assert.assertNotNull(paymentRecordList5);
    }

    @Test
    public void test0107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PaymentTest0.test0107");
        InvoiceStorage invoiceStorage0 = null;
        Payment payment1 = new Payment(invoiceStorage0);
        java.util.List<PaymentRecord> paymentRecordList2 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList3 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList4 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList5 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList6 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList7 = payment1.getPaymentRecords();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean10 = payment1.payOnline((int) (short) 10, "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"InvoiceStorage.getInvoice(int)\" because \"this.invoiceStorage\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(paymentRecordList2);
        org.junit.Assert.assertNotNull(paymentRecordList3);
        org.junit.Assert.assertNotNull(paymentRecordList4);
        org.junit.Assert.assertNotNull(paymentRecordList5);
        org.junit.Assert.assertNotNull(paymentRecordList6);
        org.junit.Assert.assertNotNull(paymentRecordList7);
    }

    @Test
    public void test0108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PaymentTest0.test0108");
        InvoiceStorage invoiceStorage0 = null;
        Payment payment1 = new Payment(invoiceStorage0);
        java.util.List<PaymentRecord> paymentRecordList2 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList3 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList4 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList5 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList6 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList7 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList8 = payment1.getPaymentRecords();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean11 = payment1.payOnline((int) (byte) 1, "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"InvoiceStorage.getInvoice(int)\" because \"this.invoiceStorage\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(paymentRecordList2);
        org.junit.Assert.assertNotNull(paymentRecordList3);
        org.junit.Assert.assertNotNull(paymentRecordList4);
        org.junit.Assert.assertNotNull(paymentRecordList5);
        org.junit.Assert.assertNotNull(paymentRecordList6);
        org.junit.Assert.assertNotNull(paymentRecordList7);
        org.junit.Assert.assertNotNull(paymentRecordList8);
    }

    @Test
    public void test0109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PaymentTest0.test0109");
        InvoiceStorage invoiceStorage0 = null;
        Payment payment1 = new Payment(invoiceStorage0);
        java.util.List<PaymentRecord> paymentRecordList2 = payment1.getPaymentRecords();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean4 = payment1.payByCash(10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"InvoiceStorage.getInvoice(int)\" because \"this.invoiceStorage\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(paymentRecordList2);
    }

    @Test
    public void test0110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PaymentTest0.test0110");
        InvoiceStorage invoiceStorage0 = null;
        Payment payment1 = new Payment(invoiceStorage0);
        java.util.List<PaymentRecord> paymentRecordList2 = payment1.getPaymentRecords();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean4 = payment1.payByCash((int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"InvoiceStorage.getInvoice(int)\" because \"this.invoiceStorage\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(paymentRecordList2);
    }

    @Test
    public void test0111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PaymentTest0.test0111");
        InvoiceStorage invoiceStorage0 = null;
        Payment payment1 = new Payment(invoiceStorage0);
        java.util.List<PaymentRecord> paymentRecordList2 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList3 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList4 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList5 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList6 = payment1.getPaymentRecords();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean9 = payment1.payOnline((int) (byte) 100, "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"InvoiceStorage.getInvoice(int)\" because \"this.invoiceStorage\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(paymentRecordList2);
        org.junit.Assert.assertNotNull(paymentRecordList3);
        org.junit.Assert.assertNotNull(paymentRecordList4);
        org.junit.Assert.assertNotNull(paymentRecordList5);
        org.junit.Assert.assertNotNull(paymentRecordList6);
    }

    @Test
    public void test0112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PaymentTest0.test0112");
        InvoiceStorage invoiceStorage0 = null;
        Payment payment1 = new Payment(invoiceStorage0);
        java.util.List<PaymentRecord> paymentRecordList2 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList3 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList4 = payment1.getPaymentRecords();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean6 = payment1.payByCash((int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"InvoiceStorage.getInvoice(int)\" because \"this.invoiceStorage\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(paymentRecordList2);
        org.junit.Assert.assertNotNull(paymentRecordList3);
        org.junit.Assert.assertNotNull(paymentRecordList4);
    }

    @Test
    public void test0113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PaymentTest0.test0113");
        InvoiceStorage invoiceStorage0 = null;
        Payment payment1 = new Payment(invoiceStorage0);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = payment1.payByCash((int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"InvoiceStorage.getInvoice(int)\" because \"this.invoiceStorage\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PaymentTest0.test0114");
        InvoiceStorage invoiceStorage0 = null;
        Payment payment1 = new Payment(invoiceStorage0);
        java.util.List<PaymentRecord> paymentRecordList2 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList3 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList4 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList5 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList6 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList7 = payment1.getPaymentRecords();
        java.lang.Class<?> wildcardClass8 = payment1.getClass();
        org.junit.Assert.assertNotNull(paymentRecordList2);
        org.junit.Assert.assertNotNull(paymentRecordList3);
        org.junit.Assert.assertNotNull(paymentRecordList4);
        org.junit.Assert.assertNotNull(paymentRecordList5);
        org.junit.Assert.assertNotNull(paymentRecordList6);
        org.junit.Assert.assertNotNull(paymentRecordList7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PaymentTest0.test0115");
        InvoiceStorage invoiceStorage0 = null;
        Payment payment1 = new Payment(invoiceStorage0);
        java.util.List<PaymentRecord> paymentRecordList2 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList3 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList4 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList5 = payment1.getPaymentRecords();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean10 = payment1.payByCard((int) (byte) 0, "hi!", "", "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"InvoiceStorage.getInvoice(int)\" because \"this.invoiceStorage\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(paymentRecordList2);
        org.junit.Assert.assertNotNull(paymentRecordList3);
        org.junit.Assert.assertNotNull(paymentRecordList4);
        org.junit.Assert.assertNotNull(paymentRecordList5);
    }

    @Test
    public void test0116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PaymentTest0.test0116");
        InvoiceStorage invoiceStorage0 = null;
        Payment payment1 = new Payment(invoiceStorage0);
        java.util.List<PaymentRecord> paymentRecordList2 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList3 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList4 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList5 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList6 = payment1.getPaymentRecords();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean8 = payment1.payByCash(10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"InvoiceStorage.getInvoice(int)\" because \"this.invoiceStorage\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(paymentRecordList2);
        org.junit.Assert.assertNotNull(paymentRecordList3);
        org.junit.Assert.assertNotNull(paymentRecordList4);
        org.junit.Assert.assertNotNull(paymentRecordList5);
        org.junit.Assert.assertNotNull(paymentRecordList6);
    }

    @Test
    public void test0117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PaymentTest0.test0117");
        InvoiceStorage invoiceStorage0 = null;
        Payment payment1 = new Payment(invoiceStorage0);
        java.util.List<PaymentRecord> paymentRecordList2 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList3 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList4 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList5 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList6 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList7 = payment1.getPaymentRecords();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean12 = payment1.payByCard((int) ' ', "", "hi!", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"InvoiceStorage.getInvoice(int)\" because \"this.invoiceStorage\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(paymentRecordList2);
        org.junit.Assert.assertNotNull(paymentRecordList3);
        org.junit.Assert.assertNotNull(paymentRecordList4);
        org.junit.Assert.assertNotNull(paymentRecordList5);
        org.junit.Assert.assertNotNull(paymentRecordList6);
        org.junit.Assert.assertNotNull(paymentRecordList7);
    }

    @Test
    public void test0118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PaymentTest0.test0118");
        InvoiceStorage invoiceStorage0 = null;
        Payment payment1 = new Payment(invoiceStorage0);
        java.util.List<PaymentRecord> paymentRecordList2 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList3 = payment1.getPaymentRecords();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean5 = payment1.payByCash((int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"InvoiceStorage.getInvoice(int)\" because \"this.invoiceStorage\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(paymentRecordList2);
        org.junit.Assert.assertNotNull(paymentRecordList3);
    }

    @Test
    public void test0119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PaymentTest0.test0119");
        InvoiceStorage invoiceStorage0 = null;
        Payment payment1 = new Payment(invoiceStorage0);
        java.util.List<PaymentRecord> paymentRecordList2 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList3 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList4 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList5 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList6 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList7 = payment1.getPaymentRecords();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean10 = payment1.payOnline((int) 'a', "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"InvoiceStorage.getInvoice(int)\" because \"this.invoiceStorage\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(paymentRecordList2);
        org.junit.Assert.assertNotNull(paymentRecordList3);
        org.junit.Assert.assertNotNull(paymentRecordList4);
        org.junit.Assert.assertNotNull(paymentRecordList5);
        org.junit.Assert.assertNotNull(paymentRecordList6);
        org.junit.Assert.assertNotNull(paymentRecordList7);
    }

    @Test
    public void test0120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PaymentTest0.test0120");
        InvoiceStorage invoiceStorage0 = null;
        Payment payment1 = new Payment(invoiceStorage0);
        java.util.List<PaymentRecord> paymentRecordList2 = payment1.getPaymentRecords();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean5 = payment1.payOnline((int) (short) -1, "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"InvoiceStorage.getInvoice(int)\" because \"this.invoiceStorage\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(paymentRecordList2);
    }

    @Test
    public void test0121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PaymentTest0.test0121");
        InvoiceStorage invoiceStorage0 = null;
        Payment payment1 = new Payment(invoiceStorage0);
        java.util.List<PaymentRecord> paymentRecordList2 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList3 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList4 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList5 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList6 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList7 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList8 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList9 = payment1.getPaymentRecords();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean11 = payment1.payByCash((int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"InvoiceStorage.getInvoice(int)\" because \"this.invoiceStorage\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(paymentRecordList2);
        org.junit.Assert.assertNotNull(paymentRecordList3);
        org.junit.Assert.assertNotNull(paymentRecordList4);
        org.junit.Assert.assertNotNull(paymentRecordList5);
        org.junit.Assert.assertNotNull(paymentRecordList6);
        org.junit.Assert.assertNotNull(paymentRecordList7);
        org.junit.Assert.assertNotNull(paymentRecordList8);
        org.junit.Assert.assertNotNull(paymentRecordList9);
    }

    @Test
    public void test0122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PaymentTest0.test0122");
        InvoiceStorage invoiceStorage0 = null;
        Payment payment1 = new Payment(invoiceStorage0);
        java.util.List<PaymentRecord> paymentRecordList2 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList3 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList4 = payment1.getPaymentRecords();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean7 = payment1.payOnline((int) (short) 10, "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"InvoiceStorage.getInvoice(int)\" because \"this.invoiceStorage\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(paymentRecordList2);
        org.junit.Assert.assertNotNull(paymentRecordList3);
        org.junit.Assert.assertNotNull(paymentRecordList4);
    }

    @Test
    public void test0123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PaymentTest0.test0123");
        InvoiceStorage invoiceStorage0 = null;
        Payment payment1 = new Payment(invoiceStorage0);
        java.util.List<PaymentRecord> paymentRecordList2 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList3 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList4 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList5 = payment1.getPaymentRecords();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean8 = payment1.payOnline((int) (byte) 1, "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"InvoiceStorage.getInvoice(int)\" because \"this.invoiceStorage\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(paymentRecordList2);
        org.junit.Assert.assertNotNull(paymentRecordList3);
        org.junit.Assert.assertNotNull(paymentRecordList4);
        org.junit.Assert.assertNotNull(paymentRecordList5);
    }

    @Test
    public void test0124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PaymentTest0.test0124");
        InvoiceStorage invoiceStorage0 = null;
        Payment payment1 = new Payment(invoiceStorage0);
        java.util.List<PaymentRecord> paymentRecordList2 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList3 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList4 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList5 = payment1.getPaymentRecords();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean8 = payment1.payOnline((int) '4', "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"InvoiceStorage.getInvoice(int)\" because \"this.invoiceStorage\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(paymentRecordList2);
        org.junit.Assert.assertNotNull(paymentRecordList3);
        org.junit.Assert.assertNotNull(paymentRecordList4);
        org.junit.Assert.assertNotNull(paymentRecordList5);
    }

    @Test
    public void test0125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PaymentTest0.test0125");
        InvoiceStorage invoiceStorage0 = null;
        Payment payment1 = new Payment(invoiceStorage0);
        java.util.List<PaymentRecord> paymentRecordList2 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList3 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList4 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList5 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList6 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList7 = payment1.getPaymentRecords();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean12 = payment1.payByCard((int) (byte) 100, "", "hi!", "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"InvoiceStorage.getInvoice(int)\" because \"this.invoiceStorage\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(paymentRecordList2);
        org.junit.Assert.assertNotNull(paymentRecordList3);
        org.junit.Assert.assertNotNull(paymentRecordList4);
        org.junit.Assert.assertNotNull(paymentRecordList5);
        org.junit.Assert.assertNotNull(paymentRecordList6);
        org.junit.Assert.assertNotNull(paymentRecordList7);
    }

    @Test
    public void test0126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PaymentTest0.test0126");
        InvoiceStorage invoiceStorage0 = null;
        Payment payment1 = new Payment(invoiceStorage0);
        java.util.List<PaymentRecord> paymentRecordList2 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList3 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList4 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList5 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList6 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList7 = payment1.getPaymentRecords();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean10 = payment1.payOnline(1, "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"InvoiceStorage.getInvoice(int)\" because \"this.invoiceStorage\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(paymentRecordList2);
        org.junit.Assert.assertNotNull(paymentRecordList3);
        org.junit.Assert.assertNotNull(paymentRecordList4);
        org.junit.Assert.assertNotNull(paymentRecordList5);
        org.junit.Assert.assertNotNull(paymentRecordList6);
        org.junit.Assert.assertNotNull(paymentRecordList7);
    }

    @Test
    public void test0127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PaymentTest0.test0127");
        InvoiceStorage invoiceStorage0 = null;
        Payment payment1 = new Payment(invoiceStorage0);
        java.util.List<PaymentRecord> paymentRecordList2 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList3 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList4 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList5 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList6 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList7 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList8 = payment1.getPaymentRecords();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean10 = payment1.payByCash(0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"InvoiceStorage.getInvoice(int)\" because \"this.invoiceStorage\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(paymentRecordList2);
        org.junit.Assert.assertNotNull(paymentRecordList3);
        org.junit.Assert.assertNotNull(paymentRecordList4);
        org.junit.Assert.assertNotNull(paymentRecordList5);
        org.junit.Assert.assertNotNull(paymentRecordList6);
        org.junit.Assert.assertNotNull(paymentRecordList7);
        org.junit.Assert.assertNotNull(paymentRecordList8);
    }

    @Test
    public void test0128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PaymentTest0.test0128");
        InvoiceStorage invoiceStorage0 = null;
        Payment payment1 = new Payment(invoiceStorage0);
        java.util.List<PaymentRecord> paymentRecordList2 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList3 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList4 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList5 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList6 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList7 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList8 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList9 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList10 = payment1.getPaymentRecords();
        java.lang.Class<?> wildcardClass11 = paymentRecordList10.getClass();
        org.junit.Assert.assertNotNull(paymentRecordList2);
        org.junit.Assert.assertNotNull(paymentRecordList3);
        org.junit.Assert.assertNotNull(paymentRecordList4);
        org.junit.Assert.assertNotNull(paymentRecordList5);
        org.junit.Assert.assertNotNull(paymentRecordList6);
        org.junit.Assert.assertNotNull(paymentRecordList7);
        org.junit.Assert.assertNotNull(paymentRecordList8);
        org.junit.Assert.assertNotNull(paymentRecordList9);
        org.junit.Assert.assertNotNull(paymentRecordList10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PaymentTest0.test0129");
        InvoiceStorage invoiceStorage0 = null;
        Payment payment1 = new Payment(invoiceStorage0);
        java.util.List<PaymentRecord> paymentRecordList2 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList3 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList4 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList5 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList6 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList7 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList8 = payment1.getPaymentRecords();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean11 = payment1.payOnline((int) (byte) -1, "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"InvoiceStorage.getInvoice(int)\" because \"this.invoiceStorage\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(paymentRecordList2);
        org.junit.Assert.assertNotNull(paymentRecordList3);
        org.junit.Assert.assertNotNull(paymentRecordList4);
        org.junit.Assert.assertNotNull(paymentRecordList5);
        org.junit.Assert.assertNotNull(paymentRecordList6);
        org.junit.Assert.assertNotNull(paymentRecordList7);
        org.junit.Assert.assertNotNull(paymentRecordList8);
    }

    @Test
    public void test0130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PaymentTest0.test0130");
        InvoiceStorage invoiceStorage0 = null;
        Payment payment1 = new Payment(invoiceStorage0);
        java.util.List<PaymentRecord> paymentRecordList2 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList3 = payment1.getPaymentRecords();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean6 = payment1.payOnline(0, "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"InvoiceStorage.getInvoice(int)\" because \"this.invoiceStorage\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(paymentRecordList2);
        org.junit.Assert.assertNotNull(paymentRecordList3);
    }

    @Test
    public void test0131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PaymentTest0.test0131");
        InvoiceStorage invoiceStorage0 = null;
        Payment payment1 = new Payment(invoiceStorage0);
        java.util.List<PaymentRecord> paymentRecordList2 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList3 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList4 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList5 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList6 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList7 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList8 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList9 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList10 = payment1.getPaymentRecords();
        java.lang.Class<?> wildcardClass11 = payment1.getClass();
        org.junit.Assert.assertNotNull(paymentRecordList2);
        org.junit.Assert.assertNotNull(paymentRecordList3);
        org.junit.Assert.assertNotNull(paymentRecordList4);
        org.junit.Assert.assertNotNull(paymentRecordList5);
        org.junit.Assert.assertNotNull(paymentRecordList6);
        org.junit.Assert.assertNotNull(paymentRecordList7);
        org.junit.Assert.assertNotNull(paymentRecordList8);
        org.junit.Assert.assertNotNull(paymentRecordList9);
        org.junit.Assert.assertNotNull(paymentRecordList10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PaymentTest0.test0132");
        InvoiceStorage invoiceStorage0 = null;
        Payment payment1 = new Payment(invoiceStorage0);
        java.util.List<PaymentRecord> paymentRecordList2 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList3 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList4 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList5 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList6 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList7 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList8 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList9 = payment1.getPaymentRecords();
        java.lang.Class<?> wildcardClass10 = paymentRecordList9.getClass();
        org.junit.Assert.assertNotNull(paymentRecordList2);
        org.junit.Assert.assertNotNull(paymentRecordList3);
        org.junit.Assert.assertNotNull(paymentRecordList4);
        org.junit.Assert.assertNotNull(paymentRecordList5);
        org.junit.Assert.assertNotNull(paymentRecordList6);
        org.junit.Assert.assertNotNull(paymentRecordList7);
        org.junit.Assert.assertNotNull(paymentRecordList8);
        org.junit.Assert.assertNotNull(paymentRecordList9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PaymentTest0.test0133");
        InvoiceStorage invoiceStorage0 = null;
        Payment payment1 = new Payment(invoiceStorage0);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = payment1.payByCash((int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"InvoiceStorage.getInvoice(int)\" because \"this.invoiceStorage\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PaymentTest0.test0134");
        InvoiceStorage invoiceStorage0 = null;
        Payment payment1 = new Payment(invoiceStorage0);
        java.util.List<PaymentRecord> paymentRecordList2 = payment1.getPaymentRecords();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean7 = payment1.payByCard(10, "hi!", "hi!", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"InvoiceStorage.getInvoice(int)\" because \"this.invoiceStorage\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(paymentRecordList2);
    }

    @Test
    public void test0135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PaymentTest0.test0135");
        InvoiceStorage invoiceStorage0 = null;
        Payment payment1 = new Payment(invoiceStorage0);
        java.util.List<PaymentRecord> paymentRecordList2 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList3 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList4 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList5 = payment1.getPaymentRecords();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean7 = payment1.payByCash((int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"InvoiceStorage.getInvoice(int)\" because \"this.invoiceStorage\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(paymentRecordList2);
        org.junit.Assert.assertNotNull(paymentRecordList3);
        org.junit.Assert.assertNotNull(paymentRecordList4);
        org.junit.Assert.assertNotNull(paymentRecordList5);
    }

    @Test
    public void test0136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PaymentTest0.test0136");
        InvoiceStorage invoiceStorage0 = null;
        Payment payment1 = new Payment(invoiceStorage0);
        java.util.List<PaymentRecord> paymentRecordList2 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList3 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList4 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList5 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList6 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList7 = payment1.getPaymentRecords();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean10 = payment1.payOnline((int) (byte) 1, "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"InvoiceStorage.getInvoice(int)\" because \"this.invoiceStorage\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(paymentRecordList2);
        org.junit.Assert.assertNotNull(paymentRecordList3);
        org.junit.Assert.assertNotNull(paymentRecordList4);
        org.junit.Assert.assertNotNull(paymentRecordList5);
        org.junit.Assert.assertNotNull(paymentRecordList6);
        org.junit.Assert.assertNotNull(paymentRecordList7);
    }

    @Test
    public void test0137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PaymentTest0.test0137");
        InvoiceStorage invoiceStorage0 = null;
        Payment payment1 = new Payment(invoiceStorage0);
        java.util.List<PaymentRecord> paymentRecordList2 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList3 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList4 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList5 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList6 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList7 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList8 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList9 = payment1.getPaymentRecords();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean11 = payment1.payByCash((int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"InvoiceStorage.getInvoice(int)\" because \"this.invoiceStorage\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(paymentRecordList2);
        org.junit.Assert.assertNotNull(paymentRecordList3);
        org.junit.Assert.assertNotNull(paymentRecordList4);
        org.junit.Assert.assertNotNull(paymentRecordList5);
        org.junit.Assert.assertNotNull(paymentRecordList6);
        org.junit.Assert.assertNotNull(paymentRecordList7);
        org.junit.Assert.assertNotNull(paymentRecordList8);
        org.junit.Assert.assertNotNull(paymentRecordList9);
    }

    @Test
    public void test0138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PaymentTest0.test0138");
        InvoiceStorage invoiceStorage0 = null;
        Payment payment1 = new Payment(invoiceStorage0);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean4 = payment1.payOnline((int) (byte) 0, "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"InvoiceStorage.getInvoice(int)\" because \"this.invoiceStorage\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PaymentTest0.test0139");
        InvoiceStorage invoiceStorage0 = null;
        Payment payment1 = new Payment(invoiceStorage0);
        java.util.List<PaymentRecord> paymentRecordList2 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList3 = payment1.getPaymentRecords();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean8 = payment1.payByCard((int) (short) 10, "hi!", "hi!", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"InvoiceStorage.getInvoice(int)\" because \"this.invoiceStorage\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(paymentRecordList2);
        org.junit.Assert.assertNotNull(paymentRecordList3);
    }

    @Test
    public void test0140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PaymentTest0.test0140");
        InvoiceStorage invoiceStorage0 = null;
        Payment payment1 = new Payment(invoiceStorage0);
        java.util.List<PaymentRecord> paymentRecordList2 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList3 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList4 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList5 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList6 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList7 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList8 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList9 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList10 = payment1.getPaymentRecords();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean13 = payment1.payOnline((int) 'a', "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"InvoiceStorage.getInvoice(int)\" because \"this.invoiceStorage\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(paymentRecordList2);
        org.junit.Assert.assertNotNull(paymentRecordList3);
        org.junit.Assert.assertNotNull(paymentRecordList4);
        org.junit.Assert.assertNotNull(paymentRecordList5);
        org.junit.Assert.assertNotNull(paymentRecordList6);
        org.junit.Assert.assertNotNull(paymentRecordList7);
        org.junit.Assert.assertNotNull(paymentRecordList8);
        org.junit.Assert.assertNotNull(paymentRecordList9);
        org.junit.Assert.assertNotNull(paymentRecordList10);
    }

    @Test
    public void test0141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PaymentTest0.test0141");
        InvoiceStorage invoiceStorage0 = null;
        Payment payment1 = new Payment(invoiceStorage0);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean6 = payment1.payByCard((int) (byte) 1, "", "", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"InvoiceStorage.getInvoice(int)\" because \"this.invoiceStorage\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PaymentTest0.test0142");
        InvoiceStorage invoiceStorage0 = null;
        Payment payment1 = new Payment(invoiceStorage0);
        java.util.List<PaymentRecord> paymentRecordList2 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList3 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList4 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList5 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList6 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList7 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList8 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList9 = payment1.getPaymentRecords();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean12 = payment1.payOnline(0, "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"InvoiceStorage.getInvoice(int)\" because \"this.invoiceStorage\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(paymentRecordList2);
        org.junit.Assert.assertNotNull(paymentRecordList3);
        org.junit.Assert.assertNotNull(paymentRecordList4);
        org.junit.Assert.assertNotNull(paymentRecordList5);
        org.junit.Assert.assertNotNull(paymentRecordList6);
        org.junit.Assert.assertNotNull(paymentRecordList7);
        org.junit.Assert.assertNotNull(paymentRecordList8);
        org.junit.Assert.assertNotNull(paymentRecordList9);
    }

    @Test
    public void test0143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PaymentTest0.test0143");
        InvoiceStorage invoiceStorage0 = null;
        Payment payment1 = new Payment(invoiceStorage0);
        java.util.List<PaymentRecord> paymentRecordList2 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList3 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList4 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList5 = payment1.getPaymentRecords();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean10 = payment1.payByCard(10, "hi!", "", "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"InvoiceStorage.getInvoice(int)\" because \"this.invoiceStorage\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(paymentRecordList2);
        org.junit.Assert.assertNotNull(paymentRecordList3);
        org.junit.Assert.assertNotNull(paymentRecordList4);
        org.junit.Assert.assertNotNull(paymentRecordList5);
    }

    @Test
    public void test0144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PaymentTest0.test0144");
        InvoiceStorage invoiceStorage0 = null;
        Payment payment1 = new Payment(invoiceStorage0);
        java.util.List<PaymentRecord> paymentRecordList2 = payment1.getPaymentRecords();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean5 = payment1.payOnline((int) (byte) 1, "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"InvoiceStorage.getInvoice(int)\" because \"this.invoiceStorage\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(paymentRecordList2);
    }

    @Test
    public void test0145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PaymentTest0.test0145");
        InvoiceStorage invoiceStorage0 = null;
        Payment payment1 = new Payment(invoiceStorage0);
        java.util.List<PaymentRecord> paymentRecordList2 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList3 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList4 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList5 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList6 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList7 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList8 = payment1.getPaymentRecords();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean13 = payment1.payByCard((-1), "", "", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"InvoiceStorage.getInvoice(int)\" because \"this.invoiceStorage\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(paymentRecordList2);
        org.junit.Assert.assertNotNull(paymentRecordList3);
        org.junit.Assert.assertNotNull(paymentRecordList4);
        org.junit.Assert.assertNotNull(paymentRecordList5);
        org.junit.Assert.assertNotNull(paymentRecordList6);
        org.junit.Assert.assertNotNull(paymentRecordList7);
        org.junit.Assert.assertNotNull(paymentRecordList8);
    }

    @Test
    public void test0146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PaymentTest0.test0146");
        InvoiceStorage invoiceStorage0 = null;
        Payment payment1 = new Payment(invoiceStorage0);
        java.util.List<PaymentRecord> paymentRecordList2 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList3 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList4 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList5 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList6 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList7 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList8 = payment1.getPaymentRecords();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean11 = payment1.payOnline((int) '#', "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"InvoiceStorage.getInvoice(int)\" because \"this.invoiceStorage\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(paymentRecordList2);
        org.junit.Assert.assertNotNull(paymentRecordList3);
        org.junit.Assert.assertNotNull(paymentRecordList4);
        org.junit.Assert.assertNotNull(paymentRecordList5);
        org.junit.Assert.assertNotNull(paymentRecordList6);
        org.junit.Assert.assertNotNull(paymentRecordList7);
        org.junit.Assert.assertNotNull(paymentRecordList8);
    }

    @Test
    public void test0147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PaymentTest0.test0147");
        InvoiceStorage invoiceStorage0 = null;
        Payment payment1 = new Payment(invoiceStorage0);
        java.util.List<PaymentRecord> paymentRecordList2 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList3 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList4 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList5 = payment1.getPaymentRecords();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean10 = payment1.payByCard((int) (short) 0, "", "", "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"InvoiceStorage.getInvoice(int)\" because \"this.invoiceStorage\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(paymentRecordList2);
        org.junit.Assert.assertNotNull(paymentRecordList3);
        org.junit.Assert.assertNotNull(paymentRecordList4);
        org.junit.Assert.assertNotNull(paymentRecordList5);
    }

    @Test
    public void test0148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PaymentTest0.test0148");
        InvoiceStorage invoiceStorage0 = null;
        Payment payment1 = new Payment(invoiceStorage0);
        java.util.List<PaymentRecord> paymentRecordList2 = payment1.getPaymentRecords();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean7 = payment1.payByCard(100, "", "hi!", "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"InvoiceStorage.getInvoice(int)\" because \"this.invoiceStorage\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(paymentRecordList2);
    }

    @Test
    public void test0149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PaymentTest0.test0149");
        InvoiceStorage invoiceStorage0 = null;
        Payment payment1 = new Payment(invoiceStorage0);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = payment1.payByCash((int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"InvoiceStorage.getInvoice(int)\" because \"this.invoiceStorage\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PaymentTest0.test0150");
        InvoiceStorage invoiceStorage0 = null;
        Payment payment1 = new Payment(invoiceStorage0);
        java.util.List<PaymentRecord> paymentRecordList2 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList3 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList4 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList5 = payment1.getPaymentRecords();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean10 = payment1.payByCard(100, "", "hi!", "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"InvoiceStorage.getInvoice(int)\" because \"this.invoiceStorage\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(paymentRecordList2);
        org.junit.Assert.assertNotNull(paymentRecordList3);
        org.junit.Assert.assertNotNull(paymentRecordList4);
        org.junit.Assert.assertNotNull(paymentRecordList5);
    }

    @Test
    public void test0151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PaymentTest0.test0151");
        InvoiceStorage invoiceStorage0 = null;
        Payment payment1 = new Payment(invoiceStorage0);
        java.util.List<PaymentRecord> paymentRecordList2 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList3 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList4 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList5 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList6 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList7 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList8 = payment1.getPaymentRecords();
        java.lang.Class<?> wildcardClass9 = paymentRecordList8.getClass();
        org.junit.Assert.assertNotNull(paymentRecordList2);
        org.junit.Assert.assertNotNull(paymentRecordList3);
        org.junit.Assert.assertNotNull(paymentRecordList4);
        org.junit.Assert.assertNotNull(paymentRecordList5);
        org.junit.Assert.assertNotNull(paymentRecordList6);
        org.junit.Assert.assertNotNull(paymentRecordList7);
        org.junit.Assert.assertNotNull(paymentRecordList8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PaymentTest0.test0152");
        InvoiceStorage invoiceStorage0 = null;
        Payment payment1 = new Payment(invoiceStorage0);
        java.util.List<PaymentRecord> paymentRecordList2 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList3 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList4 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList5 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList6 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList7 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList8 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList9 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList10 = payment1.getPaymentRecords();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean13 = payment1.payOnline((int) (short) 1, "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"InvoiceStorage.getInvoice(int)\" because \"this.invoiceStorage\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(paymentRecordList2);
        org.junit.Assert.assertNotNull(paymentRecordList3);
        org.junit.Assert.assertNotNull(paymentRecordList4);
        org.junit.Assert.assertNotNull(paymentRecordList5);
        org.junit.Assert.assertNotNull(paymentRecordList6);
        org.junit.Assert.assertNotNull(paymentRecordList7);
        org.junit.Assert.assertNotNull(paymentRecordList8);
        org.junit.Assert.assertNotNull(paymentRecordList9);
        org.junit.Assert.assertNotNull(paymentRecordList10);
    }

    @Test
    public void test0153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PaymentTest0.test0153");
        InvoiceStorage invoiceStorage0 = null;
        Payment payment1 = new Payment(invoiceStorage0);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = payment1.payByCash((int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"InvoiceStorage.getInvoice(int)\" because \"this.invoiceStorage\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PaymentTest0.test0154");
        InvoiceStorage invoiceStorage0 = null;
        Payment payment1 = new Payment(invoiceStorage0);
        java.util.List<PaymentRecord> paymentRecordList2 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList3 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList4 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList5 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList6 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList7 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList8 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList9 = payment1.getPaymentRecords();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean14 = payment1.payByCard((int) (short) 1, "", "", "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"InvoiceStorage.getInvoice(int)\" because \"this.invoiceStorage\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(paymentRecordList2);
        org.junit.Assert.assertNotNull(paymentRecordList3);
        org.junit.Assert.assertNotNull(paymentRecordList4);
        org.junit.Assert.assertNotNull(paymentRecordList5);
        org.junit.Assert.assertNotNull(paymentRecordList6);
        org.junit.Assert.assertNotNull(paymentRecordList7);
        org.junit.Assert.assertNotNull(paymentRecordList8);
        org.junit.Assert.assertNotNull(paymentRecordList9);
    }

    @Test
    public void test0155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PaymentTest0.test0155");
        InvoiceStorage invoiceStorage0 = null;
        Payment payment1 = new Payment(invoiceStorage0);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean4 = payment1.payOnline((int) (short) 0, "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"InvoiceStorage.getInvoice(int)\" because \"this.invoiceStorage\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PaymentTest0.test0156");
        InvoiceStorage invoiceStorage0 = null;
        Payment payment1 = new Payment(invoiceStorage0);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = payment1.payByCash(0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"InvoiceStorage.getInvoice(int)\" because \"this.invoiceStorage\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PaymentTest0.test0157");
        InvoiceStorage invoiceStorage0 = null;
        Payment payment1 = new Payment(invoiceStorage0);
        java.util.List<PaymentRecord> paymentRecordList2 = payment1.getPaymentRecords();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean5 = payment1.payOnline(0, "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"InvoiceStorage.getInvoice(int)\" because \"this.invoiceStorage\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(paymentRecordList2);
    }

    @Test
    public void test0158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PaymentTest0.test0158");
        InvoiceStorage invoiceStorage0 = null;
        Payment payment1 = new Payment(invoiceStorage0);
        java.util.List<PaymentRecord> paymentRecordList2 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList3 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList4 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList5 = payment1.getPaymentRecords();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean8 = payment1.payOnline((int) (short) 10, "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"InvoiceStorage.getInvoice(int)\" because \"this.invoiceStorage\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(paymentRecordList2);
        org.junit.Assert.assertNotNull(paymentRecordList3);
        org.junit.Assert.assertNotNull(paymentRecordList4);
        org.junit.Assert.assertNotNull(paymentRecordList5);
    }

    @Test
    public void test0159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PaymentTest0.test0159");
        InvoiceStorage invoiceStorage0 = null;
        Payment payment1 = new Payment(invoiceStorage0);
        java.util.List<PaymentRecord> paymentRecordList2 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList3 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList4 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList5 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList6 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList7 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList8 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList9 = payment1.getPaymentRecords();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean11 = payment1.payByCash(100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"InvoiceStorage.getInvoice(int)\" because \"this.invoiceStorage\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(paymentRecordList2);
        org.junit.Assert.assertNotNull(paymentRecordList3);
        org.junit.Assert.assertNotNull(paymentRecordList4);
        org.junit.Assert.assertNotNull(paymentRecordList5);
        org.junit.Assert.assertNotNull(paymentRecordList6);
        org.junit.Assert.assertNotNull(paymentRecordList7);
        org.junit.Assert.assertNotNull(paymentRecordList8);
        org.junit.Assert.assertNotNull(paymentRecordList9);
    }

    @Test
    public void test0160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PaymentTest0.test0160");
        InvoiceStorage invoiceStorage0 = null;
        Payment payment1 = new Payment(invoiceStorage0);
        java.util.List<PaymentRecord> paymentRecordList2 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList3 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList4 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList5 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList6 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList7 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList8 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList9 = payment1.getPaymentRecords();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean11 = payment1.payByCash(0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"InvoiceStorage.getInvoice(int)\" because \"this.invoiceStorage\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(paymentRecordList2);
        org.junit.Assert.assertNotNull(paymentRecordList3);
        org.junit.Assert.assertNotNull(paymentRecordList4);
        org.junit.Assert.assertNotNull(paymentRecordList5);
        org.junit.Assert.assertNotNull(paymentRecordList6);
        org.junit.Assert.assertNotNull(paymentRecordList7);
        org.junit.Assert.assertNotNull(paymentRecordList8);
        org.junit.Assert.assertNotNull(paymentRecordList9);
    }

    @Test
    public void test0161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PaymentTest0.test0161");
        InvoiceStorage invoiceStorage0 = null;
        Payment payment1 = new Payment(invoiceStorage0);
        java.util.List<PaymentRecord> paymentRecordList2 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList3 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList4 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList5 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList6 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList7 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList8 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList9 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList10 = payment1.getPaymentRecords();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean13 = payment1.payOnline((int) (byte) -1, "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"InvoiceStorage.getInvoice(int)\" because \"this.invoiceStorage\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(paymentRecordList2);
        org.junit.Assert.assertNotNull(paymentRecordList3);
        org.junit.Assert.assertNotNull(paymentRecordList4);
        org.junit.Assert.assertNotNull(paymentRecordList5);
        org.junit.Assert.assertNotNull(paymentRecordList6);
        org.junit.Assert.assertNotNull(paymentRecordList7);
        org.junit.Assert.assertNotNull(paymentRecordList8);
        org.junit.Assert.assertNotNull(paymentRecordList9);
        org.junit.Assert.assertNotNull(paymentRecordList10);
    }

    @Test
    public void test0162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PaymentTest0.test0162");
        InvoiceStorage invoiceStorage0 = null;
        Payment payment1 = new Payment(invoiceStorage0);
        java.util.List<PaymentRecord> paymentRecordList2 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList3 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList4 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList5 = payment1.getPaymentRecords();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean8 = payment1.payOnline(0, "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"InvoiceStorage.getInvoice(int)\" because \"this.invoiceStorage\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(paymentRecordList2);
        org.junit.Assert.assertNotNull(paymentRecordList3);
        org.junit.Assert.assertNotNull(paymentRecordList4);
        org.junit.Assert.assertNotNull(paymentRecordList5);
    }

    @Test
    public void test0163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PaymentTest0.test0163");
        InvoiceStorage invoiceStorage0 = null;
        Payment payment1 = new Payment(invoiceStorage0);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean6 = payment1.payByCard((int) (short) -1, "hi!", "hi!", "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"InvoiceStorage.getInvoice(int)\" because \"this.invoiceStorage\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PaymentTest0.test0164");
        InvoiceStorage invoiceStorage0 = null;
        Payment payment1 = new Payment(invoiceStorage0);
        java.util.List<PaymentRecord> paymentRecordList2 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList3 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList4 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList5 = payment1.getPaymentRecords();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean7 = payment1.payByCash(10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"InvoiceStorage.getInvoice(int)\" because \"this.invoiceStorage\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(paymentRecordList2);
        org.junit.Assert.assertNotNull(paymentRecordList3);
        org.junit.Assert.assertNotNull(paymentRecordList4);
        org.junit.Assert.assertNotNull(paymentRecordList5);
    }

    @Test
    public void test0165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PaymentTest0.test0165");
        InvoiceStorage invoiceStorage0 = null;
        Payment payment1 = new Payment(invoiceStorage0);
        java.util.List<PaymentRecord> paymentRecordList2 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList3 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList4 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList5 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList6 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList7 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList8 = payment1.getPaymentRecords();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean11 = payment1.payOnline((int) (byte) 10, "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"InvoiceStorage.getInvoice(int)\" because \"this.invoiceStorage\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(paymentRecordList2);
        org.junit.Assert.assertNotNull(paymentRecordList3);
        org.junit.Assert.assertNotNull(paymentRecordList4);
        org.junit.Assert.assertNotNull(paymentRecordList5);
        org.junit.Assert.assertNotNull(paymentRecordList6);
        org.junit.Assert.assertNotNull(paymentRecordList7);
        org.junit.Assert.assertNotNull(paymentRecordList8);
    }

    @Test
    public void test0166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PaymentTest0.test0166");
        InvoiceStorage invoiceStorage0 = null;
        Payment payment1 = new Payment(invoiceStorage0);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean4 = payment1.payOnline((int) (short) 100, "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"InvoiceStorage.getInvoice(int)\" because \"this.invoiceStorage\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PaymentTest0.test0167");
        InvoiceStorage invoiceStorage0 = null;
        Payment payment1 = new Payment(invoiceStorage0);
        java.util.List<PaymentRecord> paymentRecordList2 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList3 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList4 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList5 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList6 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList7 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList8 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList9 = payment1.getPaymentRecords();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean12 = payment1.payOnline((-1), "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"InvoiceStorage.getInvoice(int)\" because \"this.invoiceStorage\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(paymentRecordList2);
        org.junit.Assert.assertNotNull(paymentRecordList3);
        org.junit.Assert.assertNotNull(paymentRecordList4);
        org.junit.Assert.assertNotNull(paymentRecordList5);
        org.junit.Assert.assertNotNull(paymentRecordList6);
        org.junit.Assert.assertNotNull(paymentRecordList7);
        org.junit.Assert.assertNotNull(paymentRecordList8);
        org.junit.Assert.assertNotNull(paymentRecordList9);
    }

    @Test
    public void test0168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PaymentTest0.test0168");
        InvoiceStorage invoiceStorage0 = null;
        Payment payment1 = new Payment(invoiceStorage0);
        java.util.List<PaymentRecord> paymentRecordList2 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList3 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList4 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList5 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList6 = payment1.getPaymentRecords();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean9 = payment1.payOnline((int) (short) -1, "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"InvoiceStorage.getInvoice(int)\" because \"this.invoiceStorage\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(paymentRecordList2);
        org.junit.Assert.assertNotNull(paymentRecordList3);
        org.junit.Assert.assertNotNull(paymentRecordList4);
        org.junit.Assert.assertNotNull(paymentRecordList5);
        org.junit.Assert.assertNotNull(paymentRecordList6);
    }

    @Test
    public void test0169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PaymentTest0.test0169");
        InvoiceStorage invoiceStorage0 = null;
        Payment payment1 = new Payment(invoiceStorage0);
        java.util.List<PaymentRecord> paymentRecordList2 = payment1.getPaymentRecords();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean5 = payment1.payOnline(1, "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"InvoiceStorage.getInvoice(int)\" because \"this.invoiceStorage\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(paymentRecordList2);
    }

    @Test
    public void test0170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PaymentTest0.test0170");
        InvoiceStorage invoiceStorage0 = null;
        Payment payment1 = new Payment(invoiceStorage0);
        java.util.List<PaymentRecord> paymentRecordList2 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList3 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList4 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList5 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList6 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList7 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList8 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList9 = payment1.getPaymentRecords();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean12 = payment1.payOnline(10, "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"InvoiceStorage.getInvoice(int)\" because \"this.invoiceStorage\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(paymentRecordList2);
        org.junit.Assert.assertNotNull(paymentRecordList3);
        org.junit.Assert.assertNotNull(paymentRecordList4);
        org.junit.Assert.assertNotNull(paymentRecordList5);
        org.junit.Assert.assertNotNull(paymentRecordList6);
        org.junit.Assert.assertNotNull(paymentRecordList7);
        org.junit.Assert.assertNotNull(paymentRecordList8);
        org.junit.Assert.assertNotNull(paymentRecordList9);
    }

    @Test
    public void test0171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PaymentTest0.test0171");
        InvoiceStorage invoiceStorage0 = null;
        Payment payment1 = new Payment(invoiceStorage0);
        java.util.List<PaymentRecord> paymentRecordList2 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList3 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList4 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList5 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList6 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList7 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList8 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList9 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList10 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList11 = payment1.getPaymentRecords();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean16 = payment1.payByCard((int) (byte) 10, "", "", "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"InvoiceStorage.getInvoice(int)\" because \"this.invoiceStorage\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(paymentRecordList2);
        org.junit.Assert.assertNotNull(paymentRecordList3);
        org.junit.Assert.assertNotNull(paymentRecordList4);
        org.junit.Assert.assertNotNull(paymentRecordList5);
        org.junit.Assert.assertNotNull(paymentRecordList6);
        org.junit.Assert.assertNotNull(paymentRecordList7);
        org.junit.Assert.assertNotNull(paymentRecordList8);
        org.junit.Assert.assertNotNull(paymentRecordList9);
        org.junit.Assert.assertNotNull(paymentRecordList10);
        org.junit.Assert.assertNotNull(paymentRecordList11);
    }

    @Test
    public void test0172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PaymentTest0.test0172");
        InvoiceStorage invoiceStorage0 = null;
        Payment payment1 = new Payment(invoiceStorage0);
        java.util.List<PaymentRecord> paymentRecordList2 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList3 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList4 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList5 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList6 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList7 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList8 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList9 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList10 = payment1.getPaymentRecords();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean15 = payment1.payByCard((-1), "hi!", "hi!", "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"InvoiceStorage.getInvoice(int)\" because \"this.invoiceStorage\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(paymentRecordList2);
        org.junit.Assert.assertNotNull(paymentRecordList3);
        org.junit.Assert.assertNotNull(paymentRecordList4);
        org.junit.Assert.assertNotNull(paymentRecordList5);
        org.junit.Assert.assertNotNull(paymentRecordList6);
        org.junit.Assert.assertNotNull(paymentRecordList7);
        org.junit.Assert.assertNotNull(paymentRecordList8);
        org.junit.Assert.assertNotNull(paymentRecordList9);
        org.junit.Assert.assertNotNull(paymentRecordList10);
    }

    @Test
    public void test0173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PaymentTest0.test0173");
        InvoiceStorage invoiceStorage0 = null;
        Payment payment1 = new Payment(invoiceStorage0);
        java.util.List<PaymentRecord> paymentRecordList2 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList3 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList4 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList5 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList6 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList7 = payment1.getPaymentRecords();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean10 = payment1.payOnline((-1), "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"InvoiceStorage.getInvoice(int)\" because \"this.invoiceStorage\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(paymentRecordList2);
        org.junit.Assert.assertNotNull(paymentRecordList3);
        org.junit.Assert.assertNotNull(paymentRecordList4);
        org.junit.Assert.assertNotNull(paymentRecordList5);
        org.junit.Assert.assertNotNull(paymentRecordList6);
        org.junit.Assert.assertNotNull(paymentRecordList7);
    }

    @Test
    public void test0174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PaymentTest0.test0174");
        InvoiceStorage invoiceStorage0 = null;
        Payment payment1 = new Payment(invoiceStorage0);
        java.util.List<PaymentRecord> paymentRecordList2 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList3 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList4 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList5 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList6 = payment1.getPaymentRecords();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean11 = payment1.payByCard((int) (byte) 10, "", "hi!", "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"InvoiceStorage.getInvoice(int)\" because \"this.invoiceStorage\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(paymentRecordList2);
        org.junit.Assert.assertNotNull(paymentRecordList3);
        org.junit.Assert.assertNotNull(paymentRecordList4);
        org.junit.Assert.assertNotNull(paymentRecordList5);
        org.junit.Assert.assertNotNull(paymentRecordList6);
    }

    @Test
    public void test0175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PaymentTest0.test0175");
        InvoiceStorage invoiceStorage0 = null;
        Payment payment1 = new Payment(invoiceStorage0);
        java.util.List<PaymentRecord> paymentRecordList2 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList3 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList4 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList5 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList6 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList7 = payment1.getPaymentRecords();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean9 = payment1.payByCash((int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"InvoiceStorage.getInvoice(int)\" because \"this.invoiceStorage\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(paymentRecordList2);
        org.junit.Assert.assertNotNull(paymentRecordList3);
        org.junit.Assert.assertNotNull(paymentRecordList4);
        org.junit.Assert.assertNotNull(paymentRecordList5);
        org.junit.Assert.assertNotNull(paymentRecordList6);
        org.junit.Assert.assertNotNull(paymentRecordList7);
    }

    @Test
    public void test0176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PaymentTest0.test0176");
        InvoiceStorage invoiceStorage0 = null;
        Payment payment1 = new Payment(invoiceStorage0);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean4 = payment1.payOnline((int) (byte) -1, "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"InvoiceStorage.getInvoice(int)\" because \"this.invoiceStorage\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PaymentTest0.test0177");
        InvoiceStorage invoiceStorage0 = null;
        Payment payment1 = new Payment(invoiceStorage0);
        java.util.List<PaymentRecord> paymentRecordList2 = payment1.getPaymentRecords();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean7 = payment1.payByCard((int) (byte) 10, "hi!", "", "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"InvoiceStorage.getInvoice(int)\" because \"this.invoiceStorage\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(paymentRecordList2);
    }

    @Test
    public void test0178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PaymentTest0.test0178");
        InvoiceStorage invoiceStorage0 = null;
        Payment payment1 = new Payment(invoiceStorage0);
        java.util.List<PaymentRecord> paymentRecordList2 = payment1.getPaymentRecords();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean5 = payment1.payOnline(1, "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"InvoiceStorage.getInvoice(int)\" because \"this.invoiceStorage\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(paymentRecordList2);
    }

    @Test
    public void test0179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PaymentTest0.test0179");
        InvoiceStorage invoiceStorage0 = null;
        Payment payment1 = new Payment(invoiceStorage0);
        java.util.List<PaymentRecord> paymentRecordList2 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList3 = payment1.getPaymentRecords();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean5 = payment1.payByCash(1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"InvoiceStorage.getInvoice(int)\" because \"this.invoiceStorage\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(paymentRecordList2);
        org.junit.Assert.assertNotNull(paymentRecordList3);
    }

    @Test
    public void test0180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PaymentTest0.test0180");
        InvoiceStorage invoiceStorage0 = null;
        Payment payment1 = new Payment(invoiceStorage0);
        java.util.List<PaymentRecord> paymentRecordList2 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList3 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList4 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList5 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList6 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList7 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList8 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList9 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList10 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList11 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList12 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList13 = payment1.getPaymentRecords();
        java.lang.Class<?> wildcardClass14 = payment1.getClass();
        org.junit.Assert.assertNotNull(paymentRecordList2);
        org.junit.Assert.assertNotNull(paymentRecordList3);
        org.junit.Assert.assertNotNull(paymentRecordList4);
        org.junit.Assert.assertNotNull(paymentRecordList5);
        org.junit.Assert.assertNotNull(paymentRecordList6);
        org.junit.Assert.assertNotNull(paymentRecordList7);
        org.junit.Assert.assertNotNull(paymentRecordList8);
        org.junit.Assert.assertNotNull(paymentRecordList9);
        org.junit.Assert.assertNotNull(paymentRecordList10);
        org.junit.Assert.assertNotNull(paymentRecordList11);
        org.junit.Assert.assertNotNull(paymentRecordList12);
        org.junit.Assert.assertNotNull(paymentRecordList13);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PaymentTest0.test0181");
        InvoiceStorage invoiceStorage0 = null;
        Payment payment1 = new Payment(invoiceStorage0);
        java.util.List<PaymentRecord> paymentRecordList2 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList3 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList4 = payment1.getPaymentRecords();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean9 = payment1.payByCard((int) '#', "", "", "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"InvoiceStorage.getInvoice(int)\" because \"this.invoiceStorage\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(paymentRecordList2);
        org.junit.Assert.assertNotNull(paymentRecordList3);
        org.junit.Assert.assertNotNull(paymentRecordList4);
    }

    @Test
    public void test0182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PaymentTest0.test0182");
        InvoiceStorage invoiceStorage0 = null;
        Payment payment1 = new Payment(invoiceStorage0);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = payment1.payByCash(100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"InvoiceStorage.getInvoice(int)\" because \"this.invoiceStorage\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PaymentTest0.test0183");
        InvoiceStorage invoiceStorage0 = null;
        Payment payment1 = new Payment(invoiceStorage0);
        java.util.List<PaymentRecord> paymentRecordList2 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList3 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList4 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList5 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList6 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList7 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList8 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList9 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList10 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList11 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList12 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList13 = payment1.getPaymentRecords();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean18 = payment1.payByCard((int) '#', "", "hi!", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"InvoiceStorage.getInvoice(int)\" because \"this.invoiceStorage\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(paymentRecordList2);
        org.junit.Assert.assertNotNull(paymentRecordList3);
        org.junit.Assert.assertNotNull(paymentRecordList4);
        org.junit.Assert.assertNotNull(paymentRecordList5);
        org.junit.Assert.assertNotNull(paymentRecordList6);
        org.junit.Assert.assertNotNull(paymentRecordList7);
        org.junit.Assert.assertNotNull(paymentRecordList8);
        org.junit.Assert.assertNotNull(paymentRecordList9);
        org.junit.Assert.assertNotNull(paymentRecordList10);
        org.junit.Assert.assertNotNull(paymentRecordList11);
        org.junit.Assert.assertNotNull(paymentRecordList12);
        org.junit.Assert.assertNotNull(paymentRecordList13);
    }

    @Test
    public void test0184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PaymentTest0.test0184");
        InvoiceStorage invoiceStorage0 = null;
        Payment payment1 = new Payment(invoiceStorage0);
        java.util.List<PaymentRecord> paymentRecordList2 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList3 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList4 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList5 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList6 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList7 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList8 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList9 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList10 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList11 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList12 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList13 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList14 = payment1.getPaymentRecords();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean17 = payment1.payOnline((int) (short) 1, "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"InvoiceStorage.getInvoice(int)\" because \"this.invoiceStorage\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(paymentRecordList2);
        org.junit.Assert.assertNotNull(paymentRecordList3);
        org.junit.Assert.assertNotNull(paymentRecordList4);
        org.junit.Assert.assertNotNull(paymentRecordList5);
        org.junit.Assert.assertNotNull(paymentRecordList6);
        org.junit.Assert.assertNotNull(paymentRecordList7);
        org.junit.Assert.assertNotNull(paymentRecordList8);
        org.junit.Assert.assertNotNull(paymentRecordList9);
        org.junit.Assert.assertNotNull(paymentRecordList10);
        org.junit.Assert.assertNotNull(paymentRecordList11);
        org.junit.Assert.assertNotNull(paymentRecordList12);
        org.junit.Assert.assertNotNull(paymentRecordList13);
        org.junit.Assert.assertNotNull(paymentRecordList14);
    }

    @Test
    public void test0185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PaymentTest0.test0185");
        InvoiceStorage invoiceStorage0 = null;
        Payment payment1 = new Payment(invoiceStorage0);
        java.util.List<PaymentRecord> paymentRecordList2 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList3 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList4 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList5 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList6 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList7 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList8 = payment1.getPaymentRecords();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean10 = payment1.payByCash(100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"InvoiceStorage.getInvoice(int)\" because \"this.invoiceStorage\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(paymentRecordList2);
        org.junit.Assert.assertNotNull(paymentRecordList3);
        org.junit.Assert.assertNotNull(paymentRecordList4);
        org.junit.Assert.assertNotNull(paymentRecordList5);
        org.junit.Assert.assertNotNull(paymentRecordList6);
        org.junit.Assert.assertNotNull(paymentRecordList7);
        org.junit.Assert.assertNotNull(paymentRecordList8);
    }

    @Test
    public void test0186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PaymentTest0.test0186");
        InvoiceStorage invoiceStorage0 = null;
        Payment payment1 = new Payment(invoiceStorage0);
        java.util.List<PaymentRecord> paymentRecordList2 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList3 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList4 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList5 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList6 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList7 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList8 = payment1.getPaymentRecords();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean13 = payment1.payByCard((int) ' ', "hi!", "", "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"InvoiceStorage.getInvoice(int)\" because \"this.invoiceStorage\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(paymentRecordList2);
        org.junit.Assert.assertNotNull(paymentRecordList3);
        org.junit.Assert.assertNotNull(paymentRecordList4);
        org.junit.Assert.assertNotNull(paymentRecordList5);
        org.junit.Assert.assertNotNull(paymentRecordList6);
        org.junit.Assert.assertNotNull(paymentRecordList7);
        org.junit.Assert.assertNotNull(paymentRecordList8);
    }

    @Test
    public void test0187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PaymentTest0.test0187");
        InvoiceStorage invoiceStorage0 = null;
        Payment payment1 = new Payment(invoiceStorage0);
        java.util.List<PaymentRecord> paymentRecordList2 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList3 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList4 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList5 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList6 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList7 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList8 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList9 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList10 = payment1.getPaymentRecords();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean15 = payment1.payByCard(1, "", "", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"InvoiceStorage.getInvoice(int)\" because \"this.invoiceStorage\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(paymentRecordList2);
        org.junit.Assert.assertNotNull(paymentRecordList3);
        org.junit.Assert.assertNotNull(paymentRecordList4);
        org.junit.Assert.assertNotNull(paymentRecordList5);
        org.junit.Assert.assertNotNull(paymentRecordList6);
        org.junit.Assert.assertNotNull(paymentRecordList7);
        org.junit.Assert.assertNotNull(paymentRecordList8);
        org.junit.Assert.assertNotNull(paymentRecordList9);
        org.junit.Assert.assertNotNull(paymentRecordList10);
    }

    @Test
    public void test0188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PaymentTest0.test0188");
        InvoiceStorage invoiceStorage0 = null;
        Payment payment1 = new Payment(invoiceStorage0);
        java.util.List<PaymentRecord> paymentRecordList2 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList3 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList4 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList5 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList6 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList7 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList8 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList9 = payment1.getPaymentRecords();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean12 = payment1.payOnline((int) 'a', "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"InvoiceStorage.getInvoice(int)\" because \"this.invoiceStorage\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(paymentRecordList2);
        org.junit.Assert.assertNotNull(paymentRecordList3);
        org.junit.Assert.assertNotNull(paymentRecordList4);
        org.junit.Assert.assertNotNull(paymentRecordList5);
        org.junit.Assert.assertNotNull(paymentRecordList6);
        org.junit.Assert.assertNotNull(paymentRecordList7);
        org.junit.Assert.assertNotNull(paymentRecordList8);
        org.junit.Assert.assertNotNull(paymentRecordList9);
    }

    @Test
    public void test0189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PaymentTest0.test0189");
        InvoiceStorage invoiceStorage0 = null;
        Payment payment1 = new Payment(invoiceStorage0);
        java.util.List<PaymentRecord> paymentRecordList2 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList3 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList4 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList5 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList6 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList7 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList8 = payment1.getPaymentRecords();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean10 = payment1.payByCash((int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"InvoiceStorage.getInvoice(int)\" because \"this.invoiceStorage\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(paymentRecordList2);
        org.junit.Assert.assertNotNull(paymentRecordList3);
        org.junit.Assert.assertNotNull(paymentRecordList4);
        org.junit.Assert.assertNotNull(paymentRecordList5);
        org.junit.Assert.assertNotNull(paymentRecordList6);
        org.junit.Assert.assertNotNull(paymentRecordList7);
        org.junit.Assert.assertNotNull(paymentRecordList8);
    }

    @Test
    public void test0190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PaymentTest0.test0190");
        InvoiceStorage invoiceStorage0 = null;
        Payment payment1 = new Payment(invoiceStorage0);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = payment1.payByCash((int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"InvoiceStorage.getInvoice(int)\" because \"this.invoiceStorage\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PaymentTest0.test0191");
        InvoiceStorage invoiceStorage0 = null;
        Payment payment1 = new Payment(invoiceStorage0);
        java.util.List<PaymentRecord> paymentRecordList2 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList3 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList4 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList5 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList6 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList7 = payment1.getPaymentRecords();
        java.lang.Class<?> wildcardClass8 = paymentRecordList7.getClass();
        org.junit.Assert.assertNotNull(paymentRecordList2);
        org.junit.Assert.assertNotNull(paymentRecordList3);
        org.junit.Assert.assertNotNull(paymentRecordList4);
        org.junit.Assert.assertNotNull(paymentRecordList5);
        org.junit.Assert.assertNotNull(paymentRecordList6);
        org.junit.Assert.assertNotNull(paymentRecordList7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PaymentTest0.test0192");
        InvoiceStorage invoiceStorage0 = null;
        Payment payment1 = new Payment(invoiceStorage0);
        java.util.List<PaymentRecord> paymentRecordList2 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList3 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList4 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList5 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList6 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList7 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList8 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList9 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList10 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList11 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList12 = payment1.getPaymentRecords();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean15 = payment1.payOnline((int) (short) 0, "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"InvoiceStorage.getInvoice(int)\" because \"this.invoiceStorage\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(paymentRecordList2);
        org.junit.Assert.assertNotNull(paymentRecordList3);
        org.junit.Assert.assertNotNull(paymentRecordList4);
        org.junit.Assert.assertNotNull(paymentRecordList5);
        org.junit.Assert.assertNotNull(paymentRecordList6);
        org.junit.Assert.assertNotNull(paymentRecordList7);
        org.junit.Assert.assertNotNull(paymentRecordList8);
        org.junit.Assert.assertNotNull(paymentRecordList9);
        org.junit.Assert.assertNotNull(paymentRecordList10);
        org.junit.Assert.assertNotNull(paymentRecordList11);
        org.junit.Assert.assertNotNull(paymentRecordList12);
    }

    @Test
    public void test0193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PaymentTest0.test0193");
        InvoiceStorage invoiceStorage0 = null;
        Payment payment1 = new Payment(invoiceStorage0);
        java.util.List<PaymentRecord> paymentRecordList2 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList3 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList4 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList5 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList6 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList7 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList8 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList9 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList10 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList11 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList12 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList13 = payment1.getPaymentRecords();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean16 = payment1.payOnline(0, "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"InvoiceStorage.getInvoice(int)\" because \"this.invoiceStorage\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(paymentRecordList2);
        org.junit.Assert.assertNotNull(paymentRecordList3);
        org.junit.Assert.assertNotNull(paymentRecordList4);
        org.junit.Assert.assertNotNull(paymentRecordList5);
        org.junit.Assert.assertNotNull(paymentRecordList6);
        org.junit.Assert.assertNotNull(paymentRecordList7);
        org.junit.Assert.assertNotNull(paymentRecordList8);
        org.junit.Assert.assertNotNull(paymentRecordList9);
        org.junit.Assert.assertNotNull(paymentRecordList10);
        org.junit.Assert.assertNotNull(paymentRecordList11);
        org.junit.Assert.assertNotNull(paymentRecordList12);
        org.junit.Assert.assertNotNull(paymentRecordList13);
    }

    @Test
    public void test0194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PaymentTest0.test0194");
        InvoiceStorage invoiceStorage0 = null;
        Payment payment1 = new Payment(invoiceStorage0);
        java.util.List<PaymentRecord> paymentRecordList2 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList3 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList4 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList5 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList6 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList7 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList8 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList9 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList10 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList11 = payment1.getPaymentRecords();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean16 = payment1.payByCard(100, "", "", "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"InvoiceStorage.getInvoice(int)\" because \"this.invoiceStorage\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(paymentRecordList2);
        org.junit.Assert.assertNotNull(paymentRecordList3);
        org.junit.Assert.assertNotNull(paymentRecordList4);
        org.junit.Assert.assertNotNull(paymentRecordList5);
        org.junit.Assert.assertNotNull(paymentRecordList6);
        org.junit.Assert.assertNotNull(paymentRecordList7);
        org.junit.Assert.assertNotNull(paymentRecordList8);
        org.junit.Assert.assertNotNull(paymentRecordList9);
        org.junit.Assert.assertNotNull(paymentRecordList10);
        org.junit.Assert.assertNotNull(paymentRecordList11);
    }

    @Test
    public void test0195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PaymentTest0.test0195");
        InvoiceStorage invoiceStorage0 = null;
        Payment payment1 = new Payment(invoiceStorage0);
        java.util.List<PaymentRecord> paymentRecordList2 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList3 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList4 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList5 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList6 = payment1.getPaymentRecords();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean8 = payment1.payByCash(100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"InvoiceStorage.getInvoice(int)\" because \"this.invoiceStorage\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(paymentRecordList2);
        org.junit.Assert.assertNotNull(paymentRecordList3);
        org.junit.Assert.assertNotNull(paymentRecordList4);
        org.junit.Assert.assertNotNull(paymentRecordList5);
        org.junit.Assert.assertNotNull(paymentRecordList6);
    }

    @Test
    public void test0196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PaymentTest0.test0196");
        InvoiceStorage invoiceStorage0 = null;
        Payment payment1 = new Payment(invoiceStorage0);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean4 = payment1.payOnline((int) (short) 0, "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"InvoiceStorage.getInvoice(int)\" because \"this.invoiceStorage\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PaymentTest0.test0197");
        InvoiceStorage invoiceStorage0 = null;
        Payment payment1 = new Payment(invoiceStorage0);
        java.util.List<PaymentRecord> paymentRecordList2 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList3 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList4 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList5 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList6 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList7 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList8 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList9 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList10 = payment1.getPaymentRecords();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean15 = payment1.payByCard((int) '4', "hi!", "hi!", "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"InvoiceStorage.getInvoice(int)\" because \"this.invoiceStorage\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(paymentRecordList2);
        org.junit.Assert.assertNotNull(paymentRecordList3);
        org.junit.Assert.assertNotNull(paymentRecordList4);
        org.junit.Assert.assertNotNull(paymentRecordList5);
        org.junit.Assert.assertNotNull(paymentRecordList6);
        org.junit.Assert.assertNotNull(paymentRecordList7);
        org.junit.Assert.assertNotNull(paymentRecordList8);
        org.junit.Assert.assertNotNull(paymentRecordList9);
        org.junit.Assert.assertNotNull(paymentRecordList10);
    }

    @Test
    public void test0198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PaymentTest0.test0198");
        InvoiceStorage invoiceStorage0 = null;
        Payment payment1 = new Payment(invoiceStorage0);
        java.util.List<PaymentRecord> paymentRecordList2 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList3 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList4 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList5 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList6 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList7 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList8 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList9 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList10 = payment1.getPaymentRecords();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean12 = payment1.payByCash((int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"InvoiceStorage.getInvoice(int)\" because \"this.invoiceStorage\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(paymentRecordList2);
        org.junit.Assert.assertNotNull(paymentRecordList3);
        org.junit.Assert.assertNotNull(paymentRecordList4);
        org.junit.Assert.assertNotNull(paymentRecordList5);
        org.junit.Assert.assertNotNull(paymentRecordList6);
        org.junit.Assert.assertNotNull(paymentRecordList7);
        org.junit.Assert.assertNotNull(paymentRecordList8);
        org.junit.Assert.assertNotNull(paymentRecordList9);
        org.junit.Assert.assertNotNull(paymentRecordList10);
    }

    @Test
    public void test0199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PaymentTest0.test0199");
        InvoiceStorage invoiceStorage0 = null;
        Payment payment1 = new Payment(invoiceStorage0);
        java.util.List<PaymentRecord> paymentRecordList2 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList3 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList4 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList5 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList6 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList7 = payment1.getPaymentRecords();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean12 = payment1.payByCard((int) (short) 10, "", "hi!", "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"InvoiceStorage.getInvoice(int)\" because \"this.invoiceStorage\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(paymentRecordList2);
        org.junit.Assert.assertNotNull(paymentRecordList3);
        org.junit.Assert.assertNotNull(paymentRecordList4);
        org.junit.Assert.assertNotNull(paymentRecordList5);
        org.junit.Assert.assertNotNull(paymentRecordList6);
        org.junit.Assert.assertNotNull(paymentRecordList7);
    }

    @Test
    public void test0200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PaymentTest0.test0200");
        InvoiceStorage invoiceStorage0 = null;
        Payment payment1 = new Payment(invoiceStorage0);
        java.util.List<PaymentRecord> paymentRecordList2 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList3 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList4 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList5 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList6 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList7 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList8 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList9 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList10 = payment1.getPaymentRecords();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean13 = payment1.payOnline(1, "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"InvoiceStorage.getInvoice(int)\" because \"this.invoiceStorage\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(paymentRecordList2);
        org.junit.Assert.assertNotNull(paymentRecordList3);
        org.junit.Assert.assertNotNull(paymentRecordList4);
        org.junit.Assert.assertNotNull(paymentRecordList5);
        org.junit.Assert.assertNotNull(paymentRecordList6);
        org.junit.Assert.assertNotNull(paymentRecordList7);
        org.junit.Assert.assertNotNull(paymentRecordList8);
        org.junit.Assert.assertNotNull(paymentRecordList9);
        org.junit.Assert.assertNotNull(paymentRecordList10);
    }

    @Test
    public void test0201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PaymentTest0.test0201");
        InvoiceStorage invoiceStorage0 = null;
        Payment payment1 = new Payment(invoiceStorage0);
        java.util.List<PaymentRecord> paymentRecordList2 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList3 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList4 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList5 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList6 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList7 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList8 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList9 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList10 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList11 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList12 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList13 = payment1.getPaymentRecords();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean16 = payment1.payOnline(10, "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"InvoiceStorage.getInvoice(int)\" because \"this.invoiceStorage\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(paymentRecordList2);
        org.junit.Assert.assertNotNull(paymentRecordList3);
        org.junit.Assert.assertNotNull(paymentRecordList4);
        org.junit.Assert.assertNotNull(paymentRecordList5);
        org.junit.Assert.assertNotNull(paymentRecordList6);
        org.junit.Assert.assertNotNull(paymentRecordList7);
        org.junit.Assert.assertNotNull(paymentRecordList8);
        org.junit.Assert.assertNotNull(paymentRecordList9);
        org.junit.Assert.assertNotNull(paymentRecordList10);
        org.junit.Assert.assertNotNull(paymentRecordList11);
        org.junit.Assert.assertNotNull(paymentRecordList12);
        org.junit.Assert.assertNotNull(paymentRecordList13);
    }

    @Test
    public void test0202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PaymentTest0.test0202");
        InvoiceStorage invoiceStorage0 = null;
        Payment payment1 = new Payment(invoiceStorage0);
        java.util.List<PaymentRecord> paymentRecordList2 = payment1.getPaymentRecords();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean5 = payment1.payOnline((int) (short) 0, "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"InvoiceStorage.getInvoice(int)\" because \"this.invoiceStorage\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(paymentRecordList2);
    }

    @Test
    public void test0203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PaymentTest0.test0203");
        InvoiceStorage invoiceStorage0 = null;
        Payment payment1 = new Payment(invoiceStorage0);
        java.util.List<PaymentRecord> paymentRecordList2 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList3 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList4 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList5 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList6 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList7 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList8 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList9 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList10 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList11 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList12 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList13 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList14 = payment1.getPaymentRecords();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean17 = payment1.payOnline((-1), "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"InvoiceStorage.getInvoice(int)\" because \"this.invoiceStorage\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(paymentRecordList2);
        org.junit.Assert.assertNotNull(paymentRecordList3);
        org.junit.Assert.assertNotNull(paymentRecordList4);
        org.junit.Assert.assertNotNull(paymentRecordList5);
        org.junit.Assert.assertNotNull(paymentRecordList6);
        org.junit.Assert.assertNotNull(paymentRecordList7);
        org.junit.Assert.assertNotNull(paymentRecordList8);
        org.junit.Assert.assertNotNull(paymentRecordList9);
        org.junit.Assert.assertNotNull(paymentRecordList10);
        org.junit.Assert.assertNotNull(paymentRecordList11);
        org.junit.Assert.assertNotNull(paymentRecordList12);
        org.junit.Assert.assertNotNull(paymentRecordList13);
        org.junit.Assert.assertNotNull(paymentRecordList14);
    }

    @Test
    public void test0204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PaymentTest0.test0204");
        InvoiceStorage invoiceStorage0 = null;
        Payment payment1 = new Payment(invoiceStorage0);
        java.util.List<PaymentRecord> paymentRecordList2 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList3 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList4 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList5 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList6 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList7 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList8 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList9 = payment1.getPaymentRecords();
        java.lang.Class<?> wildcardClass10 = payment1.getClass();
        org.junit.Assert.assertNotNull(paymentRecordList2);
        org.junit.Assert.assertNotNull(paymentRecordList3);
        org.junit.Assert.assertNotNull(paymentRecordList4);
        org.junit.Assert.assertNotNull(paymentRecordList5);
        org.junit.Assert.assertNotNull(paymentRecordList6);
        org.junit.Assert.assertNotNull(paymentRecordList7);
        org.junit.Assert.assertNotNull(paymentRecordList8);
        org.junit.Assert.assertNotNull(paymentRecordList9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PaymentTest0.test0205");
        InvoiceStorage invoiceStorage0 = null;
        Payment payment1 = new Payment(invoiceStorage0);
        java.util.List<PaymentRecord> paymentRecordList2 = payment1.getPaymentRecords();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean7 = payment1.payByCard(10, "hi!", "", "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"InvoiceStorage.getInvoice(int)\" because \"this.invoiceStorage\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(paymentRecordList2);
    }

    @Test
    public void test0206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PaymentTest0.test0206");
        InvoiceStorage invoiceStorage0 = null;
        Payment payment1 = new Payment(invoiceStorage0);
        java.util.List<PaymentRecord> paymentRecordList2 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList3 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList4 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList5 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList6 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList7 = payment1.getPaymentRecords();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean10 = payment1.payOnline(0, "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"InvoiceStorage.getInvoice(int)\" because \"this.invoiceStorage\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(paymentRecordList2);
        org.junit.Assert.assertNotNull(paymentRecordList3);
        org.junit.Assert.assertNotNull(paymentRecordList4);
        org.junit.Assert.assertNotNull(paymentRecordList5);
        org.junit.Assert.assertNotNull(paymentRecordList6);
        org.junit.Assert.assertNotNull(paymentRecordList7);
    }

    @Test
    public void test0207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PaymentTest0.test0207");
        InvoiceStorage invoiceStorage0 = null;
        Payment payment1 = new Payment(invoiceStorage0);
        java.util.List<PaymentRecord> paymentRecordList2 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList3 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList4 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList5 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList6 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList7 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList8 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList9 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList10 = payment1.getPaymentRecords();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean15 = payment1.payByCard(0, "", "hi!", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"InvoiceStorage.getInvoice(int)\" because \"this.invoiceStorage\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(paymentRecordList2);
        org.junit.Assert.assertNotNull(paymentRecordList3);
        org.junit.Assert.assertNotNull(paymentRecordList4);
        org.junit.Assert.assertNotNull(paymentRecordList5);
        org.junit.Assert.assertNotNull(paymentRecordList6);
        org.junit.Assert.assertNotNull(paymentRecordList7);
        org.junit.Assert.assertNotNull(paymentRecordList8);
        org.junit.Assert.assertNotNull(paymentRecordList9);
        org.junit.Assert.assertNotNull(paymentRecordList10);
    }

    @Test
    public void test0208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PaymentTest0.test0208");
        InvoiceStorage invoiceStorage0 = null;
        Payment payment1 = new Payment(invoiceStorage0);
        java.util.List<PaymentRecord> paymentRecordList2 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList3 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList4 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList5 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList6 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList7 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList8 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList9 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList10 = payment1.getPaymentRecords();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean15 = payment1.payByCard((int) '4', "", "hi!", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"InvoiceStorage.getInvoice(int)\" because \"this.invoiceStorage\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(paymentRecordList2);
        org.junit.Assert.assertNotNull(paymentRecordList3);
        org.junit.Assert.assertNotNull(paymentRecordList4);
        org.junit.Assert.assertNotNull(paymentRecordList5);
        org.junit.Assert.assertNotNull(paymentRecordList6);
        org.junit.Assert.assertNotNull(paymentRecordList7);
        org.junit.Assert.assertNotNull(paymentRecordList8);
        org.junit.Assert.assertNotNull(paymentRecordList9);
        org.junit.Assert.assertNotNull(paymentRecordList10);
    }

    @Test
    public void test0209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PaymentTest0.test0209");
        InvoiceStorage invoiceStorage0 = null;
        Payment payment1 = new Payment(invoiceStorage0);
        java.util.List<PaymentRecord> paymentRecordList2 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList3 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList4 = payment1.getPaymentRecords();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean9 = payment1.payByCard((int) 'a', "", "", "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"InvoiceStorage.getInvoice(int)\" because \"this.invoiceStorage\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(paymentRecordList2);
        org.junit.Assert.assertNotNull(paymentRecordList3);
        org.junit.Assert.assertNotNull(paymentRecordList4);
    }

    @Test
    public void test0210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PaymentTest0.test0210");
        InvoiceStorage invoiceStorage0 = null;
        Payment payment1 = new Payment(invoiceStorage0);
        java.util.List<PaymentRecord> paymentRecordList2 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList3 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList4 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList5 = payment1.getPaymentRecords();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean10 = payment1.payByCard((int) (byte) -1, "", "hi!", "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"InvoiceStorage.getInvoice(int)\" because \"this.invoiceStorage\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(paymentRecordList2);
        org.junit.Assert.assertNotNull(paymentRecordList3);
        org.junit.Assert.assertNotNull(paymentRecordList4);
        org.junit.Assert.assertNotNull(paymentRecordList5);
    }

    @Test
    public void test0211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PaymentTest0.test0211");
        InvoiceStorage invoiceStorage0 = null;
        Payment payment1 = new Payment(invoiceStorage0);
        java.util.List<PaymentRecord> paymentRecordList2 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList3 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList4 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList5 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList6 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList7 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList8 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList9 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList10 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList11 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList12 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList13 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList14 = payment1.getPaymentRecords();
        java.lang.Class<?> wildcardClass15 = payment1.getClass();
        org.junit.Assert.assertNotNull(paymentRecordList2);
        org.junit.Assert.assertNotNull(paymentRecordList3);
        org.junit.Assert.assertNotNull(paymentRecordList4);
        org.junit.Assert.assertNotNull(paymentRecordList5);
        org.junit.Assert.assertNotNull(paymentRecordList6);
        org.junit.Assert.assertNotNull(paymentRecordList7);
        org.junit.Assert.assertNotNull(paymentRecordList8);
        org.junit.Assert.assertNotNull(paymentRecordList9);
        org.junit.Assert.assertNotNull(paymentRecordList10);
        org.junit.Assert.assertNotNull(paymentRecordList11);
        org.junit.Assert.assertNotNull(paymentRecordList12);
        org.junit.Assert.assertNotNull(paymentRecordList13);
        org.junit.Assert.assertNotNull(paymentRecordList14);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PaymentTest0.test0212");
        InvoiceStorage invoiceStorage0 = null;
        Payment payment1 = new Payment(invoiceStorage0);
        java.util.List<PaymentRecord> paymentRecordList2 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList3 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList4 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList5 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList6 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList7 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList8 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList9 = payment1.getPaymentRecords();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean14 = payment1.payByCard((int) (short) 10, "", "", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"InvoiceStorage.getInvoice(int)\" because \"this.invoiceStorage\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(paymentRecordList2);
        org.junit.Assert.assertNotNull(paymentRecordList3);
        org.junit.Assert.assertNotNull(paymentRecordList4);
        org.junit.Assert.assertNotNull(paymentRecordList5);
        org.junit.Assert.assertNotNull(paymentRecordList6);
        org.junit.Assert.assertNotNull(paymentRecordList7);
        org.junit.Assert.assertNotNull(paymentRecordList8);
        org.junit.Assert.assertNotNull(paymentRecordList9);
    }

    @Test
    public void test0213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PaymentTest0.test0213");
        InvoiceStorage invoiceStorage0 = null;
        Payment payment1 = new Payment(invoiceStorage0);
        java.util.List<PaymentRecord> paymentRecordList2 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList3 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList4 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList5 = payment1.getPaymentRecords();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean10 = payment1.payByCard((int) '4', "hi!", "hi!", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"InvoiceStorage.getInvoice(int)\" because \"this.invoiceStorage\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(paymentRecordList2);
        org.junit.Assert.assertNotNull(paymentRecordList3);
        org.junit.Assert.assertNotNull(paymentRecordList4);
        org.junit.Assert.assertNotNull(paymentRecordList5);
    }

    @Test
    public void test0214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PaymentTest0.test0214");
        InvoiceStorage invoiceStorage0 = null;
        Payment payment1 = new Payment(invoiceStorage0);
        java.util.List<PaymentRecord> paymentRecordList2 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList3 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList4 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList5 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList6 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList7 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList8 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList9 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList10 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList11 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList12 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList13 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList14 = payment1.getPaymentRecords();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean19 = payment1.payByCard(10, "hi!", "hi!", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"InvoiceStorage.getInvoice(int)\" because \"this.invoiceStorage\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(paymentRecordList2);
        org.junit.Assert.assertNotNull(paymentRecordList3);
        org.junit.Assert.assertNotNull(paymentRecordList4);
        org.junit.Assert.assertNotNull(paymentRecordList5);
        org.junit.Assert.assertNotNull(paymentRecordList6);
        org.junit.Assert.assertNotNull(paymentRecordList7);
        org.junit.Assert.assertNotNull(paymentRecordList8);
        org.junit.Assert.assertNotNull(paymentRecordList9);
        org.junit.Assert.assertNotNull(paymentRecordList10);
        org.junit.Assert.assertNotNull(paymentRecordList11);
        org.junit.Assert.assertNotNull(paymentRecordList12);
        org.junit.Assert.assertNotNull(paymentRecordList13);
        org.junit.Assert.assertNotNull(paymentRecordList14);
    }

    @Test
    public void test0215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PaymentTest0.test0215");
        InvoiceStorage invoiceStorage0 = null;
        Payment payment1 = new Payment(invoiceStorage0);
        java.util.List<PaymentRecord> paymentRecordList2 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList3 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList4 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList5 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList6 = payment1.getPaymentRecords();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean8 = payment1.payByCash((int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"InvoiceStorage.getInvoice(int)\" because \"this.invoiceStorage\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(paymentRecordList2);
        org.junit.Assert.assertNotNull(paymentRecordList3);
        org.junit.Assert.assertNotNull(paymentRecordList4);
        org.junit.Assert.assertNotNull(paymentRecordList5);
        org.junit.Assert.assertNotNull(paymentRecordList6);
    }

    @Test
    public void test0216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PaymentTest0.test0216");
        InvoiceStorage invoiceStorage0 = null;
        Payment payment1 = new Payment(invoiceStorage0);
        java.util.List<PaymentRecord> paymentRecordList2 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList3 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList4 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList5 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList6 = payment1.getPaymentRecords();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean9 = payment1.payOnline(10, "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"InvoiceStorage.getInvoice(int)\" because \"this.invoiceStorage\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(paymentRecordList2);
        org.junit.Assert.assertNotNull(paymentRecordList3);
        org.junit.Assert.assertNotNull(paymentRecordList4);
        org.junit.Assert.assertNotNull(paymentRecordList5);
        org.junit.Assert.assertNotNull(paymentRecordList6);
    }

    @Test
    public void test0217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PaymentTest0.test0217");
        InvoiceStorage invoiceStorage0 = null;
        Payment payment1 = new Payment(invoiceStorage0);
        java.util.List<PaymentRecord> paymentRecordList2 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList3 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList4 = payment1.getPaymentRecords();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean9 = payment1.payByCard((int) (byte) 10, "", "", "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"InvoiceStorage.getInvoice(int)\" because \"this.invoiceStorage\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(paymentRecordList2);
        org.junit.Assert.assertNotNull(paymentRecordList3);
        org.junit.Assert.assertNotNull(paymentRecordList4);
    }

    @Test
    public void test0218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PaymentTest0.test0218");
        InvoiceStorage invoiceStorage0 = null;
        Payment payment1 = new Payment(invoiceStorage0);
        java.util.List<PaymentRecord> paymentRecordList2 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList3 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList4 = payment1.getPaymentRecords();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean6 = payment1.payByCash(100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"InvoiceStorage.getInvoice(int)\" because \"this.invoiceStorage\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(paymentRecordList2);
        org.junit.Assert.assertNotNull(paymentRecordList3);
        org.junit.Assert.assertNotNull(paymentRecordList4);
    }

    @Test
    public void test0219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PaymentTest0.test0219");
        InvoiceStorage invoiceStorage0 = null;
        Payment payment1 = new Payment(invoiceStorage0);
        java.util.List<PaymentRecord> paymentRecordList2 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList3 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList4 = payment1.getPaymentRecords();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean6 = payment1.payByCash((int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"InvoiceStorage.getInvoice(int)\" because \"this.invoiceStorage\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(paymentRecordList2);
        org.junit.Assert.assertNotNull(paymentRecordList3);
        org.junit.Assert.assertNotNull(paymentRecordList4);
    }

    @Test
    public void test0220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PaymentTest0.test0220");
        InvoiceStorage invoiceStorage0 = null;
        Payment payment1 = new Payment(invoiceStorage0);
        java.util.List<PaymentRecord> paymentRecordList2 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList3 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList4 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList5 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList6 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList7 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList8 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList9 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList10 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList11 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList12 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList13 = payment1.getPaymentRecords();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean16 = payment1.payOnline((int) (byte) 0, "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"InvoiceStorage.getInvoice(int)\" because \"this.invoiceStorage\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(paymentRecordList2);
        org.junit.Assert.assertNotNull(paymentRecordList3);
        org.junit.Assert.assertNotNull(paymentRecordList4);
        org.junit.Assert.assertNotNull(paymentRecordList5);
        org.junit.Assert.assertNotNull(paymentRecordList6);
        org.junit.Assert.assertNotNull(paymentRecordList7);
        org.junit.Assert.assertNotNull(paymentRecordList8);
        org.junit.Assert.assertNotNull(paymentRecordList9);
        org.junit.Assert.assertNotNull(paymentRecordList10);
        org.junit.Assert.assertNotNull(paymentRecordList11);
        org.junit.Assert.assertNotNull(paymentRecordList12);
        org.junit.Assert.assertNotNull(paymentRecordList13);
    }

    @Test
    public void test0221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PaymentTest0.test0221");
        InvoiceStorage invoiceStorage0 = null;
        Payment payment1 = new Payment(invoiceStorage0);
        java.util.List<PaymentRecord> paymentRecordList2 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList3 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList4 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList5 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList6 = payment1.getPaymentRecords();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean9 = payment1.payOnline((-1), "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"InvoiceStorage.getInvoice(int)\" because \"this.invoiceStorage\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(paymentRecordList2);
        org.junit.Assert.assertNotNull(paymentRecordList3);
        org.junit.Assert.assertNotNull(paymentRecordList4);
        org.junit.Assert.assertNotNull(paymentRecordList5);
        org.junit.Assert.assertNotNull(paymentRecordList6);
    }

    @Test
    public void test0222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PaymentTest0.test0222");
        InvoiceStorage invoiceStorage0 = null;
        Payment payment1 = new Payment(invoiceStorage0);
        java.util.List<PaymentRecord> paymentRecordList2 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList3 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList4 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList5 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList6 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList7 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList8 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList9 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList10 = payment1.getPaymentRecords();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean13 = payment1.payOnline((int) (byte) 1, "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"InvoiceStorage.getInvoice(int)\" because \"this.invoiceStorage\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(paymentRecordList2);
        org.junit.Assert.assertNotNull(paymentRecordList3);
        org.junit.Assert.assertNotNull(paymentRecordList4);
        org.junit.Assert.assertNotNull(paymentRecordList5);
        org.junit.Assert.assertNotNull(paymentRecordList6);
        org.junit.Assert.assertNotNull(paymentRecordList7);
        org.junit.Assert.assertNotNull(paymentRecordList8);
        org.junit.Assert.assertNotNull(paymentRecordList9);
        org.junit.Assert.assertNotNull(paymentRecordList10);
    }

    @Test
    public void test0223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PaymentTest0.test0223");
        InvoiceStorage invoiceStorage0 = null;
        Payment payment1 = new Payment(invoiceStorage0);
        java.util.List<PaymentRecord> paymentRecordList2 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList3 = payment1.getPaymentRecords();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean8 = payment1.payByCard((int) (short) 100, "", "hi!", "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"InvoiceStorage.getInvoice(int)\" because \"this.invoiceStorage\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(paymentRecordList2);
        org.junit.Assert.assertNotNull(paymentRecordList3);
    }

    @Test
    public void test0224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PaymentTest0.test0224");
        InvoiceStorage invoiceStorage0 = null;
        Payment payment1 = new Payment(invoiceStorage0);
        java.util.List<PaymentRecord> paymentRecordList2 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList3 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList4 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList5 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList6 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList7 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList8 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList9 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList10 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList11 = payment1.getPaymentRecords();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean13 = payment1.payByCash((int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"InvoiceStorage.getInvoice(int)\" because \"this.invoiceStorage\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(paymentRecordList2);
        org.junit.Assert.assertNotNull(paymentRecordList3);
        org.junit.Assert.assertNotNull(paymentRecordList4);
        org.junit.Assert.assertNotNull(paymentRecordList5);
        org.junit.Assert.assertNotNull(paymentRecordList6);
        org.junit.Assert.assertNotNull(paymentRecordList7);
        org.junit.Assert.assertNotNull(paymentRecordList8);
        org.junit.Assert.assertNotNull(paymentRecordList9);
        org.junit.Assert.assertNotNull(paymentRecordList10);
        org.junit.Assert.assertNotNull(paymentRecordList11);
    }

    @Test
    public void test0225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PaymentTest0.test0225");
        InvoiceStorage invoiceStorage0 = null;
        Payment payment1 = new Payment(invoiceStorage0);
        java.util.List<PaymentRecord> paymentRecordList2 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList3 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList4 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList5 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList6 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList7 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList8 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList9 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList10 = payment1.getPaymentRecords();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean13 = payment1.payOnline((int) (short) 100, "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"InvoiceStorage.getInvoice(int)\" because \"this.invoiceStorage\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(paymentRecordList2);
        org.junit.Assert.assertNotNull(paymentRecordList3);
        org.junit.Assert.assertNotNull(paymentRecordList4);
        org.junit.Assert.assertNotNull(paymentRecordList5);
        org.junit.Assert.assertNotNull(paymentRecordList6);
        org.junit.Assert.assertNotNull(paymentRecordList7);
        org.junit.Assert.assertNotNull(paymentRecordList8);
        org.junit.Assert.assertNotNull(paymentRecordList9);
        org.junit.Assert.assertNotNull(paymentRecordList10);
    }

    @Test
    public void test0226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PaymentTest0.test0226");
        InvoiceStorage invoiceStorage0 = null;
        Payment payment1 = new Payment(invoiceStorage0);
        java.util.List<PaymentRecord> paymentRecordList2 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList3 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList4 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList5 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList6 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList7 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList8 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList9 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList10 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList11 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList12 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList13 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList14 = payment1.getPaymentRecords();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean17 = payment1.payOnline((int) (byte) 0, "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"InvoiceStorage.getInvoice(int)\" because \"this.invoiceStorage\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(paymentRecordList2);
        org.junit.Assert.assertNotNull(paymentRecordList3);
        org.junit.Assert.assertNotNull(paymentRecordList4);
        org.junit.Assert.assertNotNull(paymentRecordList5);
        org.junit.Assert.assertNotNull(paymentRecordList6);
        org.junit.Assert.assertNotNull(paymentRecordList7);
        org.junit.Assert.assertNotNull(paymentRecordList8);
        org.junit.Assert.assertNotNull(paymentRecordList9);
        org.junit.Assert.assertNotNull(paymentRecordList10);
        org.junit.Assert.assertNotNull(paymentRecordList11);
        org.junit.Assert.assertNotNull(paymentRecordList12);
        org.junit.Assert.assertNotNull(paymentRecordList13);
        org.junit.Assert.assertNotNull(paymentRecordList14);
    }

    @Test
    public void test0227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PaymentTest0.test0227");
        InvoiceStorage invoiceStorage0 = null;
        Payment payment1 = new Payment(invoiceStorage0);
        java.util.List<PaymentRecord> paymentRecordList2 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList3 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList4 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList5 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList6 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList7 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList8 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList9 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList10 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList11 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList12 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList13 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList14 = payment1.getPaymentRecords();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean19 = payment1.payByCard((int) 'a', "", "hi!", "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"InvoiceStorage.getInvoice(int)\" because \"this.invoiceStorage\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(paymentRecordList2);
        org.junit.Assert.assertNotNull(paymentRecordList3);
        org.junit.Assert.assertNotNull(paymentRecordList4);
        org.junit.Assert.assertNotNull(paymentRecordList5);
        org.junit.Assert.assertNotNull(paymentRecordList6);
        org.junit.Assert.assertNotNull(paymentRecordList7);
        org.junit.Assert.assertNotNull(paymentRecordList8);
        org.junit.Assert.assertNotNull(paymentRecordList9);
        org.junit.Assert.assertNotNull(paymentRecordList10);
        org.junit.Assert.assertNotNull(paymentRecordList11);
        org.junit.Assert.assertNotNull(paymentRecordList12);
        org.junit.Assert.assertNotNull(paymentRecordList13);
        org.junit.Assert.assertNotNull(paymentRecordList14);
    }

    @Test
    public void test0228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PaymentTest0.test0228");
        InvoiceStorage invoiceStorage0 = null;
        Payment payment1 = new Payment(invoiceStorage0);
        java.util.List<PaymentRecord> paymentRecordList2 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList3 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList4 = payment1.getPaymentRecords();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean6 = payment1.payByCash((int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"InvoiceStorage.getInvoice(int)\" because \"this.invoiceStorage\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(paymentRecordList2);
        org.junit.Assert.assertNotNull(paymentRecordList3);
        org.junit.Assert.assertNotNull(paymentRecordList4);
    }

    @Test
    public void test0229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PaymentTest0.test0229");
        InvoiceStorage invoiceStorage0 = null;
        Payment payment1 = new Payment(invoiceStorage0);
        java.util.List<PaymentRecord> paymentRecordList2 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList3 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList4 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList5 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList6 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList7 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList8 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList9 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList10 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList11 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList12 = payment1.getPaymentRecords();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean17 = payment1.payByCard((int) (short) 0, "hi!", "", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"InvoiceStorage.getInvoice(int)\" because \"this.invoiceStorage\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(paymentRecordList2);
        org.junit.Assert.assertNotNull(paymentRecordList3);
        org.junit.Assert.assertNotNull(paymentRecordList4);
        org.junit.Assert.assertNotNull(paymentRecordList5);
        org.junit.Assert.assertNotNull(paymentRecordList6);
        org.junit.Assert.assertNotNull(paymentRecordList7);
        org.junit.Assert.assertNotNull(paymentRecordList8);
        org.junit.Assert.assertNotNull(paymentRecordList9);
        org.junit.Assert.assertNotNull(paymentRecordList10);
        org.junit.Assert.assertNotNull(paymentRecordList11);
        org.junit.Assert.assertNotNull(paymentRecordList12);
    }

    @Test
    public void test0230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PaymentTest0.test0230");
        InvoiceStorage invoiceStorage0 = null;
        Payment payment1 = new Payment(invoiceStorage0);
        java.util.List<PaymentRecord> paymentRecordList2 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList3 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList4 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList5 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList6 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList7 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList8 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList9 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList10 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList11 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList12 = payment1.getPaymentRecords();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean17 = payment1.payByCard((int) (byte) 0, "", "", "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"InvoiceStorage.getInvoice(int)\" because \"this.invoiceStorage\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(paymentRecordList2);
        org.junit.Assert.assertNotNull(paymentRecordList3);
        org.junit.Assert.assertNotNull(paymentRecordList4);
        org.junit.Assert.assertNotNull(paymentRecordList5);
        org.junit.Assert.assertNotNull(paymentRecordList6);
        org.junit.Assert.assertNotNull(paymentRecordList7);
        org.junit.Assert.assertNotNull(paymentRecordList8);
        org.junit.Assert.assertNotNull(paymentRecordList9);
        org.junit.Assert.assertNotNull(paymentRecordList10);
        org.junit.Assert.assertNotNull(paymentRecordList11);
        org.junit.Assert.assertNotNull(paymentRecordList12);
    }

    @Test
    public void test0231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PaymentTest0.test0231");
        InvoiceStorage invoiceStorage0 = null;
        Payment payment1 = new Payment(invoiceStorage0);
        java.util.List<PaymentRecord> paymentRecordList2 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList3 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList4 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList5 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList6 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList7 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList8 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList9 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList10 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList11 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList12 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList13 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList14 = payment1.getPaymentRecords();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean19 = payment1.payByCard(0, "hi!", "hi!", "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"InvoiceStorage.getInvoice(int)\" because \"this.invoiceStorage\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(paymentRecordList2);
        org.junit.Assert.assertNotNull(paymentRecordList3);
        org.junit.Assert.assertNotNull(paymentRecordList4);
        org.junit.Assert.assertNotNull(paymentRecordList5);
        org.junit.Assert.assertNotNull(paymentRecordList6);
        org.junit.Assert.assertNotNull(paymentRecordList7);
        org.junit.Assert.assertNotNull(paymentRecordList8);
        org.junit.Assert.assertNotNull(paymentRecordList9);
        org.junit.Assert.assertNotNull(paymentRecordList10);
        org.junit.Assert.assertNotNull(paymentRecordList11);
        org.junit.Assert.assertNotNull(paymentRecordList12);
        org.junit.Assert.assertNotNull(paymentRecordList13);
        org.junit.Assert.assertNotNull(paymentRecordList14);
    }

    @Test
    public void test0232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PaymentTest0.test0232");
        InvoiceStorage invoiceStorage0 = null;
        Payment payment1 = new Payment(invoiceStorage0);
        java.util.List<PaymentRecord> paymentRecordList2 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList3 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList4 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList5 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList6 = payment1.getPaymentRecords();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean9 = payment1.payOnline((int) '#', "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"InvoiceStorage.getInvoice(int)\" because \"this.invoiceStorage\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(paymentRecordList2);
        org.junit.Assert.assertNotNull(paymentRecordList3);
        org.junit.Assert.assertNotNull(paymentRecordList4);
        org.junit.Assert.assertNotNull(paymentRecordList5);
        org.junit.Assert.assertNotNull(paymentRecordList6);
    }

    @Test
    public void test0233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PaymentTest0.test0233");
        InvoiceStorage invoiceStorage0 = null;
        Payment payment1 = new Payment(invoiceStorage0);
        java.util.List<PaymentRecord> paymentRecordList2 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList3 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList4 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList5 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList6 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList7 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList8 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList9 = payment1.getPaymentRecords();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean12 = payment1.payOnline((int) (byte) 1, "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"InvoiceStorage.getInvoice(int)\" because \"this.invoiceStorage\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(paymentRecordList2);
        org.junit.Assert.assertNotNull(paymentRecordList3);
        org.junit.Assert.assertNotNull(paymentRecordList4);
        org.junit.Assert.assertNotNull(paymentRecordList5);
        org.junit.Assert.assertNotNull(paymentRecordList6);
        org.junit.Assert.assertNotNull(paymentRecordList7);
        org.junit.Assert.assertNotNull(paymentRecordList8);
        org.junit.Assert.assertNotNull(paymentRecordList9);
    }

    @Test
    public void test0234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PaymentTest0.test0234");
        InvoiceStorage invoiceStorage0 = null;
        Payment payment1 = new Payment(invoiceStorage0);
        java.util.List<PaymentRecord> paymentRecordList2 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList3 = payment1.getPaymentRecords();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean8 = payment1.payByCard(1, "hi!", "hi!", "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"InvoiceStorage.getInvoice(int)\" because \"this.invoiceStorage\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(paymentRecordList2);
        org.junit.Assert.assertNotNull(paymentRecordList3);
    }

    @Test
    public void test0235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PaymentTest0.test0235");
        InvoiceStorage invoiceStorage0 = null;
        Payment payment1 = new Payment(invoiceStorage0);
        java.util.List<PaymentRecord> paymentRecordList2 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList3 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList4 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList5 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList6 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList7 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList8 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList9 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList10 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList11 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList12 = payment1.getPaymentRecords();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean14 = payment1.payByCash((int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"InvoiceStorage.getInvoice(int)\" because \"this.invoiceStorage\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(paymentRecordList2);
        org.junit.Assert.assertNotNull(paymentRecordList3);
        org.junit.Assert.assertNotNull(paymentRecordList4);
        org.junit.Assert.assertNotNull(paymentRecordList5);
        org.junit.Assert.assertNotNull(paymentRecordList6);
        org.junit.Assert.assertNotNull(paymentRecordList7);
        org.junit.Assert.assertNotNull(paymentRecordList8);
        org.junit.Assert.assertNotNull(paymentRecordList9);
        org.junit.Assert.assertNotNull(paymentRecordList10);
        org.junit.Assert.assertNotNull(paymentRecordList11);
        org.junit.Assert.assertNotNull(paymentRecordList12);
    }

    @Test
    public void test0236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PaymentTest0.test0236");
        InvoiceStorage invoiceStorage0 = null;
        Payment payment1 = new Payment(invoiceStorage0);
        java.util.List<PaymentRecord> paymentRecordList2 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList3 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList4 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList5 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList6 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList7 = payment1.getPaymentRecords();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean9 = payment1.payByCash((int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"InvoiceStorage.getInvoice(int)\" because \"this.invoiceStorage\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(paymentRecordList2);
        org.junit.Assert.assertNotNull(paymentRecordList3);
        org.junit.Assert.assertNotNull(paymentRecordList4);
        org.junit.Assert.assertNotNull(paymentRecordList5);
        org.junit.Assert.assertNotNull(paymentRecordList6);
        org.junit.Assert.assertNotNull(paymentRecordList7);
    }

    @Test
    public void test0237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PaymentTest0.test0237");
        InvoiceStorage invoiceStorage0 = null;
        Payment payment1 = new Payment(invoiceStorage0);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean6 = payment1.payByCard((int) (short) 1, "hi!", "", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"InvoiceStorage.getInvoice(int)\" because \"this.invoiceStorage\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PaymentTest0.test0238");
        InvoiceStorage invoiceStorage0 = null;
        Payment payment1 = new Payment(invoiceStorage0);
        java.util.List<PaymentRecord> paymentRecordList2 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList3 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList4 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList5 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList6 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList7 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList8 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList9 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList10 = payment1.getPaymentRecords();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean13 = payment1.payOnline((int) (byte) 10, "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"InvoiceStorage.getInvoice(int)\" because \"this.invoiceStorage\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(paymentRecordList2);
        org.junit.Assert.assertNotNull(paymentRecordList3);
        org.junit.Assert.assertNotNull(paymentRecordList4);
        org.junit.Assert.assertNotNull(paymentRecordList5);
        org.junit.Assert.assertNotNull(paymentRecordList6);
        org.junit.Assert.assertNotNull(paymentRecordList7);
        org.junit.Assert.assertNotNull(paymentRecordList8);
        org.junit.Assert.assertNotNull(paymentRecordList9);
        org.junit.Assert.assertNotNull(paymentRecordList10);
    }

    @Test
    public void test0239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PaymentTest0.test0239");
        InvoiceStorage invoiceStorage0 = null;
        Payment payment1 = new Payment(invoiceStorage0);
        java.util.List<PaymentRecord> paymentRecordList2 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList3 = payment1.getPaymentRecords();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean8 = payment1.payByCard((int) (byte) 1, "hi!", "", "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"InvoiceStorage.getInvoice(int)\" because \"this.invoiceStorage\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(paymentRecordList2);
        org.junit.Assert.assertNotNull(paymentRecordList3);
    }

    @Test
    public void test0240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PaymentTest0.test0240");
        InvoiceStorage invoiceStorage0 = null;
        Payment payment1 = new Payment(invoiceStorage0);
        java.util.List<PaymentRecord> paymentRecordList2 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList3 = payment1.getPaymentRecords();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean8 = payment1.payByCard((-1), "hi!", "hi!", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"InvoiceStorage.getInvoice(int)\" because \"this.invoiceStorage\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(paymentRecordList2);
        org.junit.Assert.assertNotNull(paymentRecordList3);
    }

    @Test
    public void test0241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PaymentTest0.test0241");
        InvoiceStorage invoiceStorage0 = null;
        Payment payment1 = new Payment(invoiceStorage0);
        java.util.List<PaymentRecord> paymentRecordList2 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList3 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList4 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList5 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList6 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList7 = payment1.getPaymentRecords();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean12 = payment1.payByCard((int) (byte) 0, "hi!", "", "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"InvoiceStorage.getInvoice(int)\" because \"this.invoiceStorage\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(paymentRecordList2);
        org.junit.Assert.assertNotNull(paymentRecordList3);
        org.junit.Assert.assertNotNull(paymentRecordList4);
        org.junit.Assert.assertNotNull(paymentRecordList5);
        org.junit.Assert.assertNotNull(paymentRecordList6);
        org.junit.Assert.assertNotNull(paymentRecordList7);
    }

    @Test
    public void test0242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PaymentTest0.test0242");
        InvoiceStorage invoiceStorage0 = null;
        Payment payment1 = new Payment(invoiceStorage0);
        java.util.List<PaymentRecord> paymentRecordList2 = payment1.getPaymentRecords();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean7 = payment1.payByCard((int) (short) 10, "hi!", "", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"InvoiceStorage.getInvoice(int)\" because \"this.invoiceStorage\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(paymentRecordList2);
    }

    @Test
    public void test0243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PaymentTest0.test0243");
        InvoiceStorage invoiceStorage0 = null;
        Payment payment1 = new Payment(invoiceStorage0);
        java.util.List<PaymentRecord> paymentRecordList2 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList3 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList4 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList5 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList6 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList7 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList8 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList9 = payment1.getPaymentRecords();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean14 = payment1.payByCard((int) (byte) 100, "hi!", "hi!", "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"InvoiceStorage.getInvoice(int)\" because \"this.invoiceStorage\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(paymentRecordList2);
        org.junit.Assert.assertNotNull(paymentRecordList3);
        org.junit.Assert.assertNotNull(paymentRecordList4);
        org.junit.Assert.assertNotNull(paymentRecordList5);
        org.junit.Assert.assertNotNull(paymentRecordList6);
        org.junit.Assert.assertNotNull(paymentRecordList7);
        org.junit.Assert.assertNotNull(paymentRecordList8);
        org.junit.Assert.assertNotNull(paymentRecordList9);
    }

    @Test
    public void test0244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PaymentTest0.test0244");
        InvoiceStorage invoiceStorage0 = null;
        Payment payment1 = new Payment(invoiceStorage0);
        java.util.List<PaymentRecord> paymentRecordList2 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList3 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList4 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList5 = payment1.getPaymentRecords();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean7 = payment1.payByCash((int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"InvoiceStorage.getInvoice(int)\" because \"this.invoiceStorage\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(paymentRecordList2);
        org.junit.Assert.assertNotNull(paymentRecordList3);
        org.junit.Assert.assertNotNull(paymentRecordList4);
        org.junit.Assert.assertNotNull(paymentRecordList5);
    }

    @Test
    public void test0245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PaymentTest0.test0245");
        InvoiceStorage invoiceStorage0 = null;
        Payment payment1 = new Payment(invoiceStorage0);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean6 = payment1.payByCard((int) (byte) 10, "", "hi!", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"InvoiceStorage.getInvoice(int)\" because \"this.invoiceStorage\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PaymentTest0.test0246");
        InvoiceStorage invoiceStorage0 = null;
        Payment payment1 = new Payment(invoiceStorage0);
        java.util.List<PaymentRecord> paymentRecordList2 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList3 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList4 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList5 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList6 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList7 = payment1.getPaymentRecords();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean10 = payment1.payOnline((int) (byte) 10, "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"InvoiceStorage.getInvoice(int)\" because \"this.invoiceStorage\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(paymentRecordList2);
        org.junit.Assert.assertNotNull(paymentRecordList3);
        org.junit.Assert.assertNotNull(paymentRecordList4);
        org.junit.Assert.assertNotNull(paymentRecordList5);
        org.junit.Assert.assertNotNull(paymentRecordList6);
        org.junit.Assert.assertNotNull(paymentRecordList7);
    }

    @Test
    public void test0247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PaymentTest0.test0247");
        InvoiceStorage invoiceStorage0 = null;
        Payment payment1 = new Payment(invoiceStorage0);
        java.util.List<PaymentRecord> paymentRecordList2 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList3 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList4 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList5 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList6 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList7 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList8 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList9 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList10 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList11 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList12 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList13 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList14 = payment1.getPaymentRecords();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean16 = payment1.payByCash((int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"InvoiceStorage.getInvoice(int)\" because \"this.invoiceStorage\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(paymentRecordList2);
        org.junit.Assert.assertNotNull(paymentRecordList3);
        org.junit.Assert.assertNotNull(paymentRecordList4);
        org.junit.Assert.assertNotNull(paymentRecordList5);
        org.junit.Assert.assertNotNull(paymentRecordList6);
        org.junit.Assert.assertNotNull(paymentRecordList7);
        org.junit.Assert.assertNotNull(paymentRecordList8);
        org.junit.Assert.assertNotNull(paymentRecordList9);
        org.junit.Assert.assertNotNull(paymentRecordList10);
        org.junit.Assert.assertNotNull(paymentRecordList11);
        org.junit.Assert.assertNotNull(paymentRecordList12);
        org.junit.Assert.assertNotNull(paymentRecordList13);
        org.junit.Assert.assertNotNull(paymentRecordList14);
    }

    @Test
    public void test0248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PaymentTest0.test0248");
        InvoiceStorage invoiceStorage0 = null;
        Payment payment1 = new Payment(invoiceStorage0);
        java.util.List<PaymentRecord> paymentRecordList2 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList3 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList4 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList5 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList6 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList7 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList8 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList9 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList10 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList11 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList12 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList13 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList14 = payment1.getPaymentRecords();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean19 = payment1.payByCard((int) (short) 10, "hi!", "", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"InvoiceStorage.getInvoice(int)\" because \"this.invoiceStorage\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(paymentRecordList2);
        org.junit.Assert.assertNotNull(paymentRecordList3);
        org.junit.Assert.assertNotNull(paymentRecordList4);
        org.junit.Assert.assertNotNull(paymentRecordList5);
        org.junit.Assert.assertNotNull(paymentRecordList6);
        org.junit.Assert.assertNotNull(paymentRecordList7);
        org.junit.Assert.assertNotNull(paymentRecordList8);
        org.junit.Assert.assertNotNull(paymentRecordList9);
        org.junit.Assert.assertNotNull(paymentRecordList10);
        org.junit.Assert.assertNotNull(paymentRecordList11);
        org.junit.Assert.assertNotNull(paymentRecordList12);
        org.junit.Assert.assertNotNull(paymentRecordList13);
        org.junit.Assert.assertNotNull(paymentRecordList14);
    }

    @Test
    public void test0249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PaymentTest0.test0249");
        InvoiceStorage invoiceStorage0 = null;
        Payment payment1 = new Payment(invoiceStorage0);
        java.util.List<PaymentRecord> paymentRecordList2 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList3 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList4 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList5 = payment1.getPaymentRecords();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean8 = payment1.payOnline((int) (byte) 0, "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"InvoiceStorage.getInvoice(int)\" because \"this.invoiceStorage\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(paymentRecordList2);
        org.junit.Assert.assertNotNull(paymentRecordList3);
        org.junit.Assert.assertNotNull(paymentRecordList4);
        org.junit.Assert.assertNotNull(paymentRecordList5);
    }

    @Test
    public void test0250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PaymentTest0.test0250");
        InvoiceStorage invoiceStorage0 = null;
        Payment payment1 = new Payment(invoiceStorage0);
        java.util.List<PaymentRecord> paymentRecordList2 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList3 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList4 = payment1.getPaymentRecords();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean7 = payment1.payOnline((-1), "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"InvoiceStorage.getInvoice(int)\" because \"this.invoiceStorage\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(paymentRecordList2);
        org.junit.Assert.assertNotNull(paymentRecordList3);
        org.junit.Assert.assertNotNull(paymentRecordList4);
    }

    @Test
    public void test0251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PaymentTest0.test0251");
        InvoiceStorage invoiceStorage0 = null;
        Payment payment1 = new Payment(invoiceStorage0);
        java.util.List<PaymentRecord> paymentRecordList2 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList3 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList4 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList5 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList6 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList7 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList8 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList9 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList10 = payment1.getPaymentRecords();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean15 = payment1.payByCard((int) (byte) 10, "", "hi!", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"InvoiceStorage.getInvoice(int)\" because \"this.invoiceStorage\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(paymentRecordList2);
        org.junit.Assert.assertNotNull(paymentRecordList3);
        org.junit.Assert.assertNotNull(paymentRecordList4);
        org.junit.Assert.assertNotNull(paymentRecordList5);
        org.junit.Assert.assertNotNull(paymentRecordList6);
        org.junit.Assert.assertNotNull(paymentRecordList7);
        org.junit.Assert.assertNotNull(paymentRecordList8);
        org.junit.Assert.assertNotNull(paymentRecordList9);
        org.junit.Assert.assertNotNull(paymentRecordList10);
    }

    @Test
    public void test0252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PaymentTest0.test0252");
        InvoiceStorage invoiceStorage0 = null;
        Payment payment1 = new Payment(invoiceStorage0);
        java.util.List<PaymentRecord> paymentRecordList2 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList3 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList4 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList5 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList6 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList7 = payment1.getPaymentRecords();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean12 = payment1.payByCard(1, "", "", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"InvoiceStorage.getInvoice(int)\" because \"this.invoiceStorage\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(paymentRecordList2);
        org.junit.Assert.assertNotNull(paymentRecordList3);
        org.junit.Assert.assertNotNull(paymentRecordList4);
        org.junit.Assert.assertNotNull(paymentRecordList5);
        org.junit.Assert.assertNotNull(paymentRecordList6);
        org.junit.Assert.assertNotNull(paymentRecordList7);
    }

    @Test
    public void test0253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PaymentTest0.test0253");
        InvoiceStorage invoiceStorage0 = null;
        Payment payment1 = new Payment(invoiceStorage0);
        java.util.List<PaymentRecord> paymentRecordList2 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList3 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList4 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList5 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList6 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList7 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList8 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList9 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList10 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList11 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList12 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList13 = payment1.getPaymentRecords();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean18 = payment1.payByCard((int) (short) 10, "hi!", "hi!", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"InvoiceStorage.getInvoice(int)\" because \"this.invoiceStorage\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(paymentRecordList2);
        org.junit.Assert.assertNotNull(paymentRecordList3);
        org.junit.Assert.assertNotNull(paymentRecordList4);
        org.junit.Assert.assertNotNull(paymentRecordList5);
        org.junit.Assert.assertNotNull(paymentRecordList6);
        org.junit.Assert.assertNotNull(paymentRecordList7);
        org.junit.Assert.assertNotNull(paymentRecordList8);
        org.junit.Assert.assertNotNull(paymentRecordList9);
        org.junit.Assert.assertNotNull(paymentRecordList10);
        org.junit.Assert.assertNotNull(paymentRecordList11);
        org.junit.Assert.assertNotNull(paymentRecordList12);
        org.junit.Assert.assertNotNull(paymentRecordList13);
    }

    @Test
    public void test0254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PaymentTest0.test0254");
        InvoiceStorage invoiceStorage0 = null;
        Payment payment1 = new Payment(invoiceStorage0);
        java.util.List<PaymentRecord> paymentRecordList2 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList3 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList4 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList5 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList6 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList7 = payment1.getPaymentRecords();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean10 = payment1.payOnline((int) (short) 10, "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"InvoiceStorage.getInvoice(int)\" because \"this.invoiceStorage\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(paymentRecordList2);
        org.junit.Assert.assertNotNull(paymentRecordList3);
        org.junit.Assert.assertNotNull(paymentRecordList4);
        org.junit.Assert.assertNotNull(paymentRecordList5);
        org.junit.Assert.assertNotNull(paymentRecordList6);
        org.junit.Assert.assertNotNull(paymentRecordList7);
    }

    @Test
    public void test0255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PaymentTest0.test0255");
        InvoiceStorage invoiceStorage0 = null;
        Payment payment1 = new Payment(invoiceStorage0);
        java.util.List<PaymentRecord> paymentRecordList2 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList3 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList4 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList5 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList6 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList7 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList8 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList9 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList10 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList11 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList12 = payment1.getPaymentRecords();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean14 = payment1.payByCash(0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"InvoiceStorage.getInvoice(int)\" because \"this.invoiceStorage\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(paymentRecordList2);
        org.junit.Assert.assertNotNull(paymentRecordList3);
        org.junit.Assert.assertNotNull(paymentRecordList4);
        org.junit.Assert.assertNotNull(paymentRecordList5);
        org.junit.Assert.assertNotNull(paymentRecordList6);
        org.junit.Assert.assertNotNull(paymentRecordList7);
        org.junit.Assert.assertNotNull(paymentRecordList8);
        org.junit.Assert.assertNotNull(paymentRecordList9);
        org.junit.Assert.assertNotNull(paymentRecordList10);
        org.junit.Assert.assertNotNull(paymentRecordList11);
        org.junit.Assert.assertNotNull(paymentRecordList12);
    }

    @Test
    public void test0256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PaymentTest0.test0256");
        InvoiceStorage invoiceStorage0 = null;
        Payment payment1 = new Payment(invoiceStorage0);
        java.util.List<PaymentRecord> paymentRecordList2 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList3 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList4 = payment1.getPaymentRecords();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean9 = payment1.payByCard((int) (short) -1, "hi!", "", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"InvoiceStorage.getInvoice(int)\" because \"this.invoiceStorage\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(paymentRecordList2);
        org.junit.Assert.assertNotNull(paymentRecordList3);
        org.junit.Assert.assertNotNull(paymentRecordList4);
    }

    @Test
    public void test0257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PaymentTest0.test0257");
        InvoiceStorage invoiceStorage0 = null;
        Payment payment1 = new Payment(invoiceStorage0);
        java.util.List<PaymentRecord> paymentRecordList2 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList3 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList4 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList5 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList6 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList7 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList8 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList9 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList10 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList11 = payment1.getPaymentRecords();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean16 = payment1.payByCard((int) (short) 1, "hi!", "hi!", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"InvoiceStorage.getInvoice(int)\" because \"this.invoiceStorage\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(paymentRecordList2);
        org.junit.Assert.assertNotNull(paymentRecordList3);
        org.junit.Assert.assertNotNull(paymentRecordList4);
        org.junit.Assert.assertNotNull(paymentRecordList5);
        org.junit.Assert.assertNotNull(paymentRecordList6);
        org.junit.Assert.assertNotNull(paymentRecordList7);
        org.junit.Assert.assertNotNull(paymentRecordList8);
        org.junit.Assert.assertNotNull(paymentRecordList9);
        org.junit.Assert.assertNotNull(paymentRecordList10);
        org.junit.Assert.assertNotNull(paymentRecordList11);
    }

    @Test
    public void test0258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PaymentTest0.test0258");
        InvoiceStorage invoiceStorage0 = null;
        Payment payment1 = new Payment(invoiceStorage0);
        java.util.List<PaymentRecord> paymentRecordList2 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList3 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList4 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList5 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList6 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList7 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList8 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList9 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList10 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList11 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList12 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList13 = payment1.getPaymentRecords();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean16 = payment1.payOnline((int) (byte) 0, "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"InvoiceStorage.getInvoice(int)\" because \"this.invoiceStorage\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(paymentRecordList2);
        org.junit.Assert.assertNotNull(paymentRecordList3);
        org.junit.Assert.assertNotNull(paymentRecordList4);
        org.junit.Assert.assertNotNull(paymentRecordList5);
        org.junit.Assert.assertNotNull(paymentRecordList6);
        org.junit.Assert.assertNotNull(paymentRecordList7);
        org.junit.Assert.assertNotNull(paymentRecordList8);
        org.junit.Assert.assertNotNull(paymentRecordList9);
        org.junit.Assert.assertNotNull(paymentRecordList10);
        org.junit.Assert.assertNotNull(paymentRecordList11);
        org.junit.Assert.assertNotNull(paymentRecordList12);
        org.junit.Assert.assertNotNull(paymentRecordList13);
    }

    @Test
    public void test0259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PaymentTest0.test0259");
        InvoiceStorage invoiceStorage0 = null;
        Payment payment1 = new Payment(invoiceStorage0);
        java.util.List<PaymentRecord> paymentRecordList2 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList3 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList4 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList5 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList6 = payment1.getPaymentRecords();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean11 = payment1.payByCard((int) ' ', "hi!", "hi!", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"InvoiceStorage.getInvoice(int)\" because \"this.invoiceStorage\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(paymentRecordList2);
        org.junit.Assert.assertNotNull(paymentRecordList3);
        org.junit.Assert.assertNotNull(paymentRecordList4);
        org.junit.Assert.assertNotNull(paymentRecordList5);
        org.junit.Assert.assertNotNull(paymentRecordList6);
    }

    @Test
    public void test0260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PaymentTest0.test0260");
        InvoiceStorage invoiceStorage0 = null;
        Payment payment1 = new Payment(invoiceStorage0);
        java.util.List<PaymentRecord> paymentRecordList2 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList3 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList4 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList5 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList6 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList7 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList8 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList9 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList10 = payment1.getPaymentRecords();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean15 = payment1.payByCard((int) (short) 0, "", "hi!", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"InvoiceStorage.getInvoice(int)\" because \"this.invoiceStorage\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(paymentRecordList2);
        org.junit.Assert.assertNotNull(paymentRecordList3);
        org.junit.Assert.assertNotNull(paymentRecordList4);
        org.junit.Assert.assertNotNull(paymentRecordList5);
        org.junit.Assert.assertNotNull(paymentRecordList6);
        org.junit.Assert.assertNotNull(paymentRecordList7);
        org.junit.Assert.assertNotNull(paymentRecordList8);
        org.junit.Assert.assertNotNull(paymentRecordList9);
        org.junit.Assert.assertNotNull(paymentRecordList10);
    }

    @Test
    public void test0261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PaymentTest0.test0261");
        InvoiceStorage invoiceStorage0 = null;
        Payment payment1 = new Payment(invoiceStorage0);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = payment1.payByCash(1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"InvoiceStorage.getInvoice(int)\" because \"this.invoiceStorage\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PaymentTest0.test0262");
        InvoiceStorage invoiceStorage0 = null;
        Payment payment1 = new Payment(invoiceStorage0);
        java.util.List<PaymentRecord> paymentRecordList2 = payment1.getPaymentRecords();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean4 = payment1.payByCash((int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"InvoiceStorage.getInvoice(int)\" because \"this.invoiceStorage\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(paymentRecordList2);
    }

    @Test
    public void test0263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PaymentTest0.test0263");
        InvoiceStorage invoiceStorage0 = null;
        Payment payment1 = new Payment(invoiceStorage0);
        java.util.List<PaymentRecord> paymentRecordList2 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList3 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList4 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList5 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList6 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList7 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList8 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList9 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList10 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList11 = payment1.getPaymentRecords();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean14 = payment1.payOnline((int) (short) 0, "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"InvoiceStorage.getInvoice(int)\" because \"this.invoiceStorage\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(paymentRecordList2);
        org.junit.Assert.assertNotNull(paymentRecordList3);
        org.junit.Assert.assertNotNull(paymentRecordList4);
        org.junit.Assert.assertNotNull(paymentRecordList5);
        org.junit.Assert.assertNotNull(paymentRecordList6);
        org.junit.Assert.assertNotNull(paymentRecordList7);
        org.junit.Assert.assertNotNull(paymentRecordList8);
        org.junit.Assert.assertNotNull(paymentRecordList9);
        org.junit.Assert.assertNotNull(paymentRecordList10);
        org.junit.Assert.assertNotNull(paymentRecordList11);
    }

    @Test
    public void test0264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PaymentTest0.test0264");
        InvoiceStorage invoiceStorage0 = null;
        Payment payment1 = new Payment(invoiceStorage0);
        java.util.List<PaymentRecord> paymentRecordList2 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList3 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList4 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList5 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList6 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList7 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList8 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList9 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList10 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList11 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList12 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList13 = payment1.getPaymentRecords();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean15 = payment1.payByCash((int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"InvoiceStorage.getInvoice(int)\" because \"this.invoiceStorage\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(paymentRecordList2);
        org.junit.Assert.assertNotNull(paymentRecordList3);
        org.junit.Assert.assertNotNull(paymentRecordList4);
        org.junit.Assert.assertNotNull(paymentRecordList5);
        org.junit.Assert.assertNotNull(paymentRecordList6);
        org.junit.Assert.assertNotNull(paymentRecordList7);
        org.junit.Assert.assertNotNull(paymentRecordList8);
        org.junit.Assert.assertNotNull(paymentRecordList9);
        org.junit.Assert.assertNotNull(paymentRecordList10);
        org.junit.Assert.assertNotNull(paymentRecordList11);
        org.junit.Assert.assertNotNull(paymentRecordList12);
        org.junit.Assert.assertNotNull(paymentRecordList13);
    }

    @Test
    public void test0265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PaymentTest0.test0265");
        InvoiceStorage invoiceStorage0 = null;
        Payment payment1 = new Payment(invoiceStorage0);
        java.util.List<PaymentRecord> paymentRecordList2 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList3 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList4 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList5 = payment1.getPaymentRecords();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean7 = payment1.payByCash((int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"InvoiceStorage.getInvoice(int)\" because \"this.invoiceStorage\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(paymentRecordList2);
        org.junit.Assert.assertNotNull(paymentRecordList3);
        org.junit.Assert.assertNotNull(paymentRecordList4);
        org.junit.Assert.assertNotNull(paymentRecordList5);
    }

    @Test
    public void test0266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PaymentTest0.test0266");
        InvoiceStorage invoiceStorage0 = null;
        Payment payment1 = new Payment(invoiceStorage0);
        java.util.List<PaymentRecord> paymentRecordList2 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList3 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList4 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList5 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList6 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList7 = payment1.getPaymentRecords();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean12 = payment1.payByCard((int) (byte) 0, "", "hi!", "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"InvoiceStorage.getInvoice(int)\" because \"this.invoiceStorage\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(paymentRecordList2);
        org.junit.Assert.assertNotNull(paymentRecordList3);
        org.junit.Assert.assertNotNull(paymentRecordList4);
        org.junit.Assert.assertNotNull(paymentRecordList5);
        org.junit.Assert.assertNotNull(paymentRecordList6);
        org.junit.Assert.assertNotNull(paymentRecordList7);
    }

    @Test
    public void test0267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PaymentTest0.test0267");
        InvoiceStorage invoiceStorage0 = null;
        Payment payment1 = new Payment(invoiceStorage0);
        java.util.List<PaymentRecord> paymentRecordList2 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList3 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList4 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList5 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList6 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList7 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList8 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList9 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList10 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList11 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList12 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList13 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList14 = payment1.getPaymentRecords();
        java.lang.Class<?> wildcardClass15 = paymentRecordList14.getClass();
        org.junit.Assert.assertNotNull(paymentRecordList2);
        org.junit.Assert.assertNotNull(paymentRecordList3);
        org.junit.Assert.assertNotNull(paymentRecordList4);
        org.junit.Assert.assertNotNull(paymentRecordList5);
        org.junit.Assert.assertNotNull(paymentRecordList6);
        org.junit.Assert.assertNotNull(paymentRecordList7);
        org.junit.Assert.assertNotNull(paymentRecordList8);
        org.junit.Assert.assertNotNull(paymentRecordList9);
        org.junit.Assert.assertNotNull(paymentRecordList10);
        org.junit.Assert.assertNotNull(paymentRecordList11);
        org.junit.Assert.assertNotNull(paymentRecordList12);
        org.junit.Assert.assertNotNull(paymentRecordList13);
        org.junit.Assert.assertNotNull(paymentRecordList14);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PaymentTest0.test0268");
        InvoiceStorage invoiceStorage0 = null;
        Payment payment1 = new Payment(invoiceStorage0);
        java.util.List<PaymentRecord> paymentRecordList2 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList3 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList4 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList5 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList6 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList7 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList8 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList9 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList10 = payment1.getPaymentRecords();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean13 = payment1.payOnline((int) (short) -1, "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"InvoiceStorage.getInvoice(int)\" because \"this.invoiceStorage\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(paymentRecordList2);
        org.junit.Assert.assertNotNull(paymentRecordList3);
        org.junit.Assert.assertNotNull(paymentRecordList4);
        org.junit.Assert.assertNotNull(paymentRecordList5);
        org.junit.Assert.assertNotNull(paymentRecordList6);
        org.junit.Assert.assertNotNull(paymentRecordList7);
        org.junit.Assert.assertNotNull(paymentRecordList8);
        org.junit.Assert.assertNotNull(paymentRecordList9);
        org.junit.Assert.assertNotNull(paymentRecordList10);
    }

    @Test
    public void test0269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PaymentTest0.test0269");
        InvoiceStorage invoiceStorage0 = null;
        Payment payment1 = new Payment(invoiceStorage0);
        java.util.List<PaymentRecord> paymentRecordList2 = payment1.getPaymentRecords();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean7 = payment1.payByCard((int) (byte) 100, "", "hi!", "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"InvoiceStorage.getInvoice(int)\" because \"this.invoiceStorage\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(paymentRecordList2);
    }

    @Test
    public void test0270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PaymentTest0.test0270");
        InvoiceStorage invoiceStorage0 = null;
        Payment payment1 = new Payment(invoiceStorage0);
        java.util.List<PaymentRecord> paymentRecordList2 = payment1.getPaymentRecords();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean7 = payment1.payByCard((int) (byte) -1, "hi!", "", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"InvoiceStorage.getInvoice(int)\" because \"this.invoiceStorage\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(paymentRecordList2);
    }

    @Test
    public void test0271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PaymentTest0.test0271");
        InvoiceStorage invoiceStorage0 = null;
        Payment payment1 = new Payment(invoiceStorage0);
        java.util.List<PaymentRecord> paymentRecordList2 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList3 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList4 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList5 = payment1.getPaymentRecords();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean10 = payment1.payByCard(100, "hi!", "", "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"InvoiceStorage.getInvoice(int)\" because \"this.invoiceStorage\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(paymentRecordList2);
        org.junit.Assert.assertNotNull(paymentRecordList3);
        org.junit.Assert.assertNotNull(paymentRecordList4);
        org.junit.Assert.assertNotNull(paymentRecordList5);
    }

    @Test
    public void test0272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PaymentTest0.test0272");
        InvoiceStorage invoiceStorage0 = null;
        Payment payment1 = new Payment(invoiceStorage0);
        java.util.List<PaymentRecord> paymentRecordList2 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList3 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList4 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList5 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList6 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList7 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList8 = payment1.getPaymentRecords();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean10 = payment1.payByCash((int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"InvoiceStorage.getInvoice(int)\" because \"this.invoiceStorage\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(paymentRecordList2);
        org.junit.Assert.assertNotNull(paymentRecordList3);
        org.junit.Assert.assertNotNull(paymentRecordList4);
        org.junit.Assert.assertNotNull(paymentRecordList5);
        org.junit.Assert.assertNotNull(paymentRecordList6);
        org.junit.Assert.assertNotNull(paymentRecordList7);
        org.junit.Assert.assertNotNull(paymentRecordList8);
    }

    @Test
    public void test0273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PaymentTest0.test0273");
        InvoiceStorage invoiceStorage0 = null;
        Payment payment1 = new Payment(invoiceStorage0);
        java.util.List<PaymentRecord> paymentRecordList2 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList3 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList4 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList5 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList6 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList7 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList8 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList9 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList10 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList11 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList12 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList13 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList14 = payment1.getPaymentRecords();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean19 = payment1.payByCard(0, "", "hi!", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"InvoiceStorage.getInvoice(int)\" because \"this.invoiceStorage\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(paymentRecordList2);
        org.junit.Assert.assertNotNull(paymentRecordList3);
        org.junit.Assert.assertNotNull(paymentRecordList4);
        org.junit.Assert.assertNotNull(paymentRecordList5);
        org.junit.Assert.assertNotNull(paymentRecordList6);
        org.junit.Assert.assertNotNull(paymentRecordList7);
        org.junit.Assert.assertNotNull(paymentRecordList8);
        org.junit.Assert.assertNotNull(paymentRecordList9);
        org.junit.Assert.assertNotNull(paymentRecordList10);
        org.junit.Assert.assertNotNull(paymentRecordList11);
        org.junit.Assert.assertNotNull(paymentRecordList12);
        org.junit.Assert.assertNotNull(paymentRecordList13);
        org.junit.Assert.assertNotNull(paymentRecordList14);
    }

    @Test
    public void test0274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PaymentTest0.test0274");
        InvoiceStorage invoiceStorage0 = null;
        Payment payment1 = new Payment(invoiceStorage0);
        java.util.List<PaymentRecord> paymentRecordList2 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList3 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList4 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList5 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList6 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList7 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList8 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList9 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList10 = payment1.getPaymentRecords();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean12 = payment1.payByCash((int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"InvoiceStorage.getInvoice(int)\" because \"this.invoiceStorage\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(paymentRecordList2);
        org.junit.Assert.assertNotNull(paymentRecordList3);
        org.junit.Assert.assertNotNull(paymentRecordList4);
        org.junit.Assert.assertNotNull(paymentRecordList5);
        org.junit.Assert.assertNotNull(paymentRecordList6);
        org.junit.Assert.assertNotNull(paymentRecordList7);
        org.junit.Assert.assertNotNull(paymentRecordList8);
        org.junit.Assert.assertNotNull(paymentRecordList9);
        org.junit.Assert.assertNotNull(paymentRecordList10);
    }

    @Test
    public void test0275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PaymentTest0.test0275");
        InvoiceStorage invoiceStorage0 = null;
        Payment payment1 = new Payment(invoiceStorage0);
        java.util.List<PaymentRecord> paymentRecordList2 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList3 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList4 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList5 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList6 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList7 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList8 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList9 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList10 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList11 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList12 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList13 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList14 = payment1.getPaymentRecords();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean19 = payment1.payByCard((int) (short) 1, "", "hi!", "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"InvoiceStorage.getInvoice(int)\" because \"this.invoiceStorage\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(paymentRecordList2);
        org.junit.Assert.assertNotNull(paymentRecordList3);
        org.junit.Assert.assertNotNull(paymentRecordList4);
        org.junit.Assert.assertNotNull(paymentRecordList5);
        org.junit.Assert.assertNotNull(paymentRecordList6);
        org.junit.Assert.assertNotNull(paymentRecordList7);
        org.junit.Assert.assertNotNull(paymentRecordList8);
        org.junit.Assert.assertNotNull(paymentRecordList9);
        org.junit.Assert.assertNotNull(paymentRecordList10);
        org.junit.Assert.assertNotNull(paymentRecordList11);
        org.junit.Assert.assertNotNull(paymentRecordList12);
        org.junit.Assert.assertNotNull(paymentRecordList13);
        org.junit.Assert.assertNotNull(paymentRecordList14);
    }

    @Test
    public void test0276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PaymentTest0.test0276");
        InvoiceStorage invoiceStorage0 = null;
        Payment payment1 = new Payment(invoiceStorage0);
        java.util.List<PaymentRecord> paymentRecordList2 = payment1.getPaymentRecords();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean7 = payment1.payByCard((int) (short) 0, "", "", "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"InvoiceStorage.getInvoice(int)\" because \"this.invoiceStorage\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(paymentRecordList2);
    }

    @Test
    public void test0277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PaymentTest0.test0277");
        InvoiceStorage invoiceStorage0 = null;
        Payment payment1 = new Payment(invoiceStorage0);
        java.util.List<PaymentRecord> paymentRecordList2 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList3 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList4 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList5 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList6 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList7 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList8 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList9 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList10 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList11 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList12 = payment1.getPaymentRecords();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean17 = payment1.payByCard(0, "hi!", "", "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"InvoiceStorage.getInvoice(int)\" because \"this.invoiceStorage\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(paymentRecordList2);
        org.junit.Assert.assertNotNull(paymentRecordList3);
        org.junit.Assert.assertNotNull(paymentRecordList4);
        org.junit.Assert.assertNotNull(paymentRecordList5);
        org.junit.Assert.assertNotNull(paymentRecordList6);
        org.junit.Assert.assertNotNull(paymentRecordList7);
        org.junit.Assert.assertNotNull(paymentRecordList8);
        org.junit.Assert.assertNotNull(paymentRecordList9);
        org.junit.Assert.assertNotNull(paymentRecordList10);
        org.junit.Assert.assertNotNull(paymentRecordList11);
        org.junit.Assert.assertNotNull(paymentRecordList12);
    }

    @Test
    public void test0278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PaymentTest0.test0278");
        InvoiceStorage invoiceStorage0 = null;
        Payment payment1 = new Payment(invoiceStorage0);
        java.util.List<PaymentRecord> paymentRecordList2 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList3 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList4 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList5 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList6 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList7 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList8 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList9 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList10 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList11 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList12 = payment1.getPaymentRecords();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean17 = payment1.payByCard((int) (byte) 1, "", "", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"InvoiceStorage.getInvoice(int)\" because \"this.invoiceStorage\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(paymentRecordList2);
        org.junit.Assert.assertNotNull(paymentRecordList3);
        org.junit.Assert.assertNotNull(paymentRecordList4);
        org.junit.Assert.assertNotNull(paymentRecordList5);
        org.junit.Assert.assertNotNull(paymentRecordList6);
        org.junit.Assert.assertNotNull(paymentRecordList7);
        org.junit.Assert.assertNotNull(paymentRecordList8);
        org.junit.Assert.assertNotNull(paymentRecordList9);
        org.junit.Assert.assertNotNull(paymentRecordList10);
        org.junit.Assert.assertNotNull(paymentRecordList11);
        org.junit.Assert.assertNotNull(paymentRecordList12);
    }

    @Test
    public void test0279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PaymentTest0.test0279");
        InvoiceStorage invoiceStorage0 = null;
        Payment payment1 = new Payment(invoiceStorage0);
        java.util.List<PaymentRecord> paymentRecordList2 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList3 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList4 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList5 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList6 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList7 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList8 = payment1.getPaymentRecords();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean13 = payment1.payByCard((int) (short) 0, "hi!", "hi!", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"InvoiceStorage.getInvoice(int)\" because \"this.invoiceStorage\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(paymentRecordList2);
        org.junit.Assert.assertNotNull(paymentRecordList3);
        org.junit.Assert.assertNotNull(paymentRecordList4);
        org.junit.Assert.assertNotNull(paymentRecordList5);
        org.junit.Assert.assertNotNull(paymentRecordList6);
        org.junit.Assert.assertNotNull(paymentRecordList7);
        org.junit.Assert.assertNotNull(paymentRecordList8);
    }

    @Test
    public void test0280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PaymentTest0.test0280");
        InvoiceStorage invoiceStorage0 = null;
        Payment payment1 = new Payment(invoiceStorage0);
        java.util.List<PaymentRecord> paymentRecordList2 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList3 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList4 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList5 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList6 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList7 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList8 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList9 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList10 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList11 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList12 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList13 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList14 = payment1.getPaymentRecords();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean19 = payment1.payByCard((int) (short) 0, "hi!", "hi!", "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"InvoiceStorage.getInvoice(int)\" because \"this.invoiceStorage\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(paymentRecordList2);
        org.junit.Assert.assertNotNull(paymentRecordList3);
        org.junit.Assert.assertNotNull(paymentRecordList4);
        org.junit.Assert.assertNotNull(paymentRecordList5);
        org.junit.Assert.assertNotNull(paymentRecordList6);
        org.junit.Assert.assertNotNull(paymentRecordList7);
        org.junit.Assert.assertNotNull(paymentRecordList8);
        org.junit.Assert.assertNotNull(paymentRecordList9);
        org.junit.Assert.assertNotNull(paymentRecordList10);
        org.junit.Assert.assertNotNull(paymentRecordList11);
        org.junit.Assert.assertNotNull(paymentRecordList12);
        org.junit.Assert.assertNotNull(paymentRecordList13);
        org.junit.Assert.assertNotNull(paymentRecordList14);
    }

    @Test
    public void test0281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PaymentTest0.test0281");
        InvoiceStorage invoiceStorage0 = null;
        Payment payment1 = new Payment(invoiceStorage0);
        java.util.List<PaymentRecord> paymentRecordList2 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList3 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList4 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList5 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList6 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList7 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList8 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList9 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList10 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList11 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList12 = payment1.getPaymentRecords();
        java.lang.Class<?> wildcardClass13 = payment1.getClass();
        org.junit.Assert.assertNotNull(paymentRecordList2);
        org.junit.Assert.assertNotNull(paymentRecordList3);
        org.junit.Assert.assertNotNull(paymentRecordList4);
        org.junit.Assert.assertNotNull(paymentRecordList5);
        org.junit.Assert.assertNotNull(paymentRecordList6);
        org.junit.Assert.assertNotNull(paymentRecordList7);
        org.junit.Assert.assertNotNull(paymentRecordList8);
        org.junit.Assert.assertNotNull(paymentRecordList9);
        org.junit.Assert.assertNotNull(paymentRecordList10);
        org.junit.Assert.assertNotNull(paymentRecordList11);
        org.junit.Assert.assertNotNull(paymentRecordList12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PaymentTest0.test0282");
        InvoiceStorage invoiceStorage0 = null;
        Payment payment1 = new Payment(invoiceStorage0);
        java.util.List<PaymentRecord> paymentRecordList2 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList3 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList4 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList5 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList6 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList7 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList8 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList9 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList10 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList11 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList12 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList13 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList14 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList15 = payment1.getPaymentRecords();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean18 = payment1.payOnline(100, "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"InvoiceStorage.getInvoice(int)\" because \"this.invoiceStorage\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(paymentRecordList2);
        org.junit.Assert.assertNotNull(paymentRecordList3);
        org.junit.Assert.assertNotNull(paymentRecordList4);
        org.junit.Assert.assertNotNull(paymentRecordList5);
        org.junit.Assert.assertNotNull(paymentRecordList6);
        org.junit.Assert.assertNotNull(paymentRecordList7);
        org.junit.Assert.assertNotNull(paymentRecordList8);
        org.junit.Assert.assertNotNull(paymentRecordList9);
        org.junit.Assert.assertNotNull(paymentRecordList10);
        org.junit.Assert.assertNotNull(paymentRecordList11);
        org.junit.Assert.assertNotNull(paymentRecordList12);
        org.junit.Assert.assertNotNull(paymentRecordList13);
        org.junit.Assert.assertNotNull(paymentRecordList14);
        org.junit.Assert.assertNotNull(paymentRecordList15);
    }

    @Test
    public void test0283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PaymentTest0.test0283");
        InvoiceStorage invoiceStorage0 = null;
        Payment payment1 = new Payment(invoiceStorage0);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean4 = payment1.payOnline((int) (byte) 1, "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"InvoiceStorage.getInvoice(int)\" because \"this.invoiceStorage\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PaymentTest0.test0284");
        InvoiceStorage invoiceStorage0 = null;
        Payment payment1 = new Payment(invoiceStorage0);
        java.util.List<PaymentRecord> paymentRecordList2 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList3 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList4 = payment1.getPaymentRecords();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean6 = payment1.payByCash((int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"InvoiceStorage.getInvoice(int)\" because \"this.invoiceStorage\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(paymentRecordList2);
        org.junit.Assert.assertNotNull(paymentRecordList3);
        org.junit.Assert.assertNotNull(paymentRecordList4);
    }

    @Test
    public void test0285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PaymentTest0.test0285");
        InvoiceStorage invoiceStorage0 = null;
        Payment payment1 = new Payment(invoiceStorage0);
        java.util.List<PaymentRecord> paymentRecordList2 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList3 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList4 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList5 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList6 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList7 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList8 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList9 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList10 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList11 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList12 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList13 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList14 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList15 = payment1.getPaymentRecords();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean17 = payment1.payByCash((-1));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"InvoiceStorage.getInvoice(int)\" because \"this.invoiceStorage\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(paymentRecordList2);
        org.junit.Assert.assertNotNull(paymentRecordList3);
        org.junit.Assert.assertNotNull(paymentRecordList4);
        org.junit.Assert.assertNotNull(paymentRecordList5);
        org.junit.Assert.assertNotNull(paymentRecordList6);
        org.junit.Assert.assertNotNull(paymentRecordList7);
        org.junit.Assert.assertNotNull(paymentRecordList8);
        org.junit.Assert.assertNotNull(paymentRecordList9);
        org.junit.Assert.assertNotNull(paymentRecordList10);
        org.junit.Assert.assertNotNull(paymentRecordList11);
        org.junit.Assert.assertNotNull(paymentRecordList12);
        org.junit.Assert.assertNotNull(paymentRecordList13);
        org.junit.Assert.assertNotNull(paymentRecordList14);
        org.junit.Assert.assertNotNull(paymentRecordList15);
    }

    @Test
    public void test0286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PaymentTest0.test0286");
        InvoiceStorage invoiceStorage0 = null;
        Payment payment1 = new Payment(invoiceStorage0);
        java.util.List<PaymentRecord> paymentRecordList2 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList3 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList4 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList5 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList6 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList7 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList8 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList9 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList10 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList11 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList12 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList13 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList14 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList15 = payment1.getPaymentRecords();
        java.lang.Class<?> wildcardClass16 = payment1.getClass();
        org.junit.Assert.assertNotNull(paymentRecordList2);
        org.junit.Assert.assertNotNull(paymentRecordList3);
        org.junit.Assert.assertNotNull(paymentRecordList4);
        org.junit.Assert.assertNotNull(paymentRecordList5);
        org.junit.Assert.assertNotNull(paymentRecordList6);
        org.junit.Assert.assertNotNull(paymentRecordList7);
        org.junit.Assert.assertNotNull(paymentRecordList8);
        org.junit.Assert.assertNotNull(paymentRecordList9);
        org.junit.Assert.assertNotNull(paymentRecordList10);
        org.junit.Assert.assertNotNull(paymentRecordList11);
        org.junit.Assert.assertNotNull(paymentRecordList12);
        org.junit.Assert.assertNotNull(paymentRecordList13);
        org.junit.Assert.assertNotNull(paymentRecordList14);
        org.junit.Assert.assertNotNull(paymentRecordList15);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PaymentTest0.test0287");
        InvoiceStorage invoiceStorage0 = null;
        Payment payment1 = new Payment(invoiceStorage0);
        java.util.List<PaymentRecord> paymentRecordList2 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList3 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList4 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList5 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList6 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList7 = payment1.getPaymentRecords();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean9 = payment1.payByCash((int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"InvoiceStorage.getInvoice(int)\" because \"this.invoiceStorage\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(paymentRecordList2);
        org.junit.Assert.assertNotNull(paymentRecordList3);
        org.junit.Assert.assertNotNull(paymentRecordList4);
        org.junit.Assert.assertNotNull(paymentRecordList5);
        org.junit.Assert.assertNotNull(paymentRecordList6);
        org.junit.Assert.assertNotNull(paymentRecordList7);
    }

    @Test
    public void test0288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PaymentTest0.test0288");
        InvoiceStorage invoiceStorage0 = null;
        Payment payment1 = new Payment(invoiceStorage0);
        java.util.List<PaymentRecord> paymentRecordList2 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList3 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList4 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList5 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList6 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList7 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList8 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList9 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList10 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList11 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList12 = payment1.getPaymentRecords();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean14 = payment1.payByCash((int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"InvoiceStorage.getInvoice(int)\" because \"this.invoiceStorage\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(paymentRecordList2);
        org.junit.Assert.assertNotNull(paymentRecordList3);
        org.junit.Assert.assertNotNull(paymentRecordList4);
        org.junit.Assert.assertNotNull(paymentRecordList5);
        org.junit.Assert.assertNotNull(paymentRecordList6);
        org.junit.Assert.assertNotNull(paymentRecordList7);
        org.junit.Assert.assertNotNull(paymentRecordList8);
        org.junit.Assert.assertNotNull(paymentRecordList9);
        org.junit.Assert.assertNotNull(paymentRecordList10);
        org.junit.Assert.assertNotNull(paymentRecordList11);
        org.junit.Assert.assertNotNull(paymentRecordList12);
    }

    @Test
    public void test0289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PaymentTest0.test0289");
        InvoiceStorage invoiceStorage0 = null;
        Payment payment1 = new Payment(invoiceStorage0);
        java.util.List<PaymentRecord> paymentRecordList2 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList3 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList4 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList5 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList6 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList7 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList8 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList9 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList10 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList11 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList12 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList13 = payment1.getPaymentRecords();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean18 = payment1.payByCard((int) '4', "hi!", "", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"InvoiceStorage.getInvoice(int)\" because \"this.invoiceStorage\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(paymentRecordList2);
        org.junit.Assert.assertNotNull(paymentRecordList3);
        org.junit.Assert.assertNotNull(paymentRecordList4);
        org.junit.Assert.assertNotNull(paymentRecordList5);
        org.junit.Assert.assertNotNull(paymentRecordList6);
        org.junit.Assert.assertNotNull(paymentRecordList7);
        org.junit.Assert.assertNotNull(paymentRecordList8);
        org.junit.Assert.assertNotNull(paymentRecordList9);
        org.junit.Assert.assertNotNull(paymentRecordList10);
        org.junit.Assert.assertNotNull(paymentRecordList11);
        org.junit.Assert.assertNotNull(paymentRecordList12);
        org.junit.Assert.assertNotNull(paymentRecordList13);
    }

    @Test
    public void test0290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PaymentTest0.test0290");
        InvoiceStorage invoiceStorage0 = null;
        Payment payment1 = new Payment(invoiceStorage0);
        java.util.List<PaymentRecord> paymentRecordList2 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList3 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList4 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList5 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList6 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList7 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList8 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList9 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList10 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList11 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList12 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList13 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList14 = payment1.getPaymentRecords();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean17 = payment1.payOnline((-1), "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"InvoiceStorage.getInvoice(int)\" because \"this.invoiceStorage\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(paymentRecordList2);
        org.junit.Assert.assertNotNull(paymentRecordList3);
        org.junit.Assert.assertNotNull(paymentRecordList4);
        org.junit.Assert.assertNotNull(paymentRecordList5);
        org.junit.Assert.assertNotNull(paymentRecordList6);
        org.junit.Assert.assertNotNull(paymentRecordList7);
        org.junit.Assert.assertNotNull(paymentRecordList8);
        org.junit.Assert.assertNotNull(paymentRecordList9);
        org.junit.Assert.assertNotNull(paymentRecordList10);
        org.junit.Assert.assertNotNull(paymentRecordList11);
        org.junit.Assert.assertNotNull(paymentRecordList12);
        org.junit.Assert.assertNotNull(paymentRecordList13);
        org.junit.Assert.assertNotNull(paymentRecordList14);
    }

    @Test
    public void test0291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PaymentTest0.test0291");
        InvoiceStorage invoiceStorage0 = null;
        Payment payment1 = new Payment(invoiceStorage0);
        java.util.List<PaymentRecord> paymentRecordList2 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList3 = payment1.getPaymentRecords();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean6 = payment1.payOnline((int) (short) 1, "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"InvoiceStorage.getInvoice(int)\" because \"this.invoiceStorage\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(paymentRecordList2);
        org.junit.Assert.assertNotNull(paymentRecordList3);
    }

    @Test
    public void test0292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PaymentTest0.test0292");
        InvoiceStorage invoiceStorage0 = null;
        Payment payment1 = new Payment(invoiceStorage0);
        java.util.List<PaymentRecord> paymentRecordList2 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList3 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList4 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList5 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList6 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList7 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList8 = payment1.getPaymentRecords();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean11 = payment1.payOnline((int) 'a', "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"InvoiceStorage.getInvoice(int)\" because \"this.invoiceStorage\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(paymentRecordList2);
        org.junit.Assert.assertNotNull(paymentRecordList3);
        org.junit.Assert.assertNotNull(paymentRecordList4);
        org.junit.Assert.assertNotNull(paymentRecordList5);
        org.junit.Assert.assertNotNull(paymentRecordList6);
        org.junit.Assert.assertNotNull(paymentRecordList7);
        org.junit.Assert.assertNotNull(paymentRecordList8);
    }

    @Test
    public void test0293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PaymentTest0.test0293");
        InvoiceStorage invoiceStorage0 = null;
        Payment payment1 = new Payment(invoiceStorage0);
        java.util.List<PaymentRecord> paymentRecordList2 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList3 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList4 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList5 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList6 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList7 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList8 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList9 = payment1.getPaymentRecords();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean14 = payment1.payByCard(0, "", "hi!", "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"InvoiceStorage.getInvoice(int)\" because \"this.invoiceStorage\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(paymentRecordList2);
        org.junit.Assert.assertNotNull(paymentRecordList3);
        org.junit.Assert.assertNotNull(paymentRecordList4);
        org.junit.Assert.assertNotNull(paymentRecordList5);
        org.junit.Assert.assertNotNull(paymentRecordList6);
        org.junit.Assert.assertNotNull(paymentRecordList7);
        org.junit.Assert.assertNotNull(paymentRecordList8);
        org.junit.Assert.assertNotNull(paymentRecordList9);
    }

    @Test
    public void test0294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PaymentTest0.test0294");
        InvoiceStorage invoiceStorage0 = null;
        Payment payment1 = new Payment(invoiceStorage0);
        java.util.List<PaymentRecord> paymentRecordList2 = payment1.getPaymentRecords();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean4 = payment1.payByCash((int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"InvoiceStorage.getInvoice(int)\" because \"this.invoiceStorage\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(paymentRecordList2);
    }

    @Test
    public void test0295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PaymentTest0.test0295");
        InvoiceStorage invoiceStorage0 = null;
        Payment payment1 = new Payment(invoiceStorage0);
        java.util.List<PaymentRecord> paymentRecordList2 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList3 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList4 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList5 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList6 = payment1.getPaymentRecords();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean9 = payment1.payOnline((int) (short) 100, "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"InvoiceStorage.getInvoice(int)\" because \"this.invoiceStorage\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(paymentRecordList2);
        org.junit.Assert.assertNotNull(paymentRecordList3);
        org.junit.Assert.assertNotNull(paymentRecordList4);
        org.junit.Assert.assertNotNull(paymentRecordList5);
        org.junit.Assert.assertNotNull(paymentRecordList6);
    }

    @Test
    public void test0296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PaymentTest0.test0296");
        InvoiceStorage invoiceStorage0 = null;
        Payment payment1 = new Payment(invoiceStorage0);
        java.util.List<PaymentRecord> paymentRecordList2 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList3 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList4 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList5 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList6 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList7 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList8 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList9 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList10 = payment1.getPaymentRecords();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean13 = payment1.payOnline((int) (short) -1, "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"InvoiceStorage.getInvoice(int)\" because \"this.invoiceStorage\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(paymentRecordList2);
        org.junit.Assert.assertNotNull(paymentRecordList3);
        org.junit.Assert.assertNotNull(paymentRecordList4);
        org.junit.Assert.assertNotNull(paymentRecordList5);
        org.junit.Assert.assertNotNull(paymentRecordList6);
        org.junit.Assert.assertNotNull(paymentRecordList7);
        org.junit.Assert.assertNotNull(paymentRecordList8);
        org.junit.Assert.assertNotNull(paymentRecordList9);
        org.junit.Assert.assertNotNull(paymentRecordList10);
    }

    @Test
    public void test0297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PaymentTest0.test0297");
        InvoiceStorage invoiceStorage0 = null;
        Payment payment1 = new Payment(invoiceStorage0);
        java.util.List<PaymentRecord> paymentRecordList2 = payment1.getPaymentRecords();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean4 = payment1.payByCash((int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"InvoiceStorage.getInvoice(int)\" because \"this.invoiceStorage\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(paymentRecordList2);
    }

    @Test
    public void test0298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PaymentTest0.test0298");
        InvoiceStorage invoiceStorage0 = null;
        Payment payment1 = new Payment(invoiceStorage0);
        java.util.List<PaymentRecord> paymentRecordList2 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList3 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList4 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList5 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList6 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList7 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList8 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList9 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList10 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList11 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList12 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList13 = payment1.getPaymentRecords();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean15 = payment1.payByCash((int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"InvoiceStorage.getInvoice(int)\" because \"this.invoiceStorage\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(paymentRecordList2);
        org.junit.Assert.assertNotNull(paymentRecordList3);
        org.junit.Assert.assertNotNull(paymentRecordList4);
        org.junit.Assert.assertNotNull(paymentRecordList5);
        org.junit.Assert.assertNotNull(paymentRecordList6);
        org.junit.Assert.assertNotNull(paymentRecordList7);
        org.junit.Assert.assertNotNull(paymentRecordList8);
        org.junit.Assert.assertNotNull(paymentRecordList9);
        org.junit.Assert.assertNotNull(paymentRecordList10);
        org.junit.Assert.assertNotNull(paymentRecordList11);
        org.junit.Assert.assertNotNull(paymentRecordList12);
        org.junit.Assert.assertNotNull(paymentRecordList13);
    }

    @Test
    public void test0299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PaymentTest0.test0299");
        InvoiceStorage invoiceStorage0 = null;
        Payment payment1 = new Payment(invoiceStorage0);
        java.util.List<PaymentRecord> paymentRecordList2 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList3 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList4 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList5 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList6 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList7 = payment1.getPaymentRecords();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean12 = payment1.payByCard((int) (short) 1, "hi!", "", "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"InvoiceStorage.getInvoice(int)\" because \"this.invoiceStorage\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(paymentRecordList2);
        org.junit.Assert.assertNotNull(paymentRecordList3);
        org.junit.Assert.assertNotNull(paymentRecordList4);
        org.junit.Assert.assertNotNull(paymentRecordList5);
        org.junit.Assert.assertNotNull(paymentRecordList6);
        org.junit.Assert.assertNotNull(paymentRecordList7);
    }

    @Test
    public void test0300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PaymentTest0.test0300");
        InvoiceStorage invoiceStorage0 = null;
        Payment payment1 = new Payment(invoiceStorage0);
        java.util.List<PaymentRecord> paymentRecordList2 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList3 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList4 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList5 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList6 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList7 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList8 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList9 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList10 = payment1.getPaymentRecords();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean13 = payment1.payOnline((int) (short) 1, "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"InvoiceStorage.getInvoice(int)\" because \"this.invoiceStorage\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(paymentRecordList2);
        org.junit.Assert.assertNotNull(paymentRecordList3);
        org.junit.Assert.assertNotNull(paymentRecordList4);
        org.junit.Assert.assertNotNull(paymentRecordList5);
        org.junit.Assert.assertNotNull(paymentRecordList6);
        org.junit.Assert.assertNotNull(paymentRecordList7);
        org.junit.Assert.assertNotNull(paymentRecordList8);
        org.junit.Assert.assertNotNull(paymentRecordList9);
        org.junit.Assert.assertNotNull(paymentRecordList10);
    }

    @Test
    public void test0301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PaymentTest0.test0301");
        InvoiceStorage invoiceStorage0 = null;
        Payment payment1 = new Payment(invoiceStorage0);
        java.util.List<PaymentRecord> paymentRecordList2 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList3 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList4 = payment1.getPaymentRecords();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean6 = payment1.payByCash(10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"InvoiceStorage.getInvoice(int)\" because \"this.invoiceStorage\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(paymentRecordList2);
        org.junit.Assert.assertNotNull(paymentRecordList3);
        org.junit.Assert.assertNotNull(paymentRecordList4);
    }

    @Test
    public void test0302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PaymentTest0.test0302");
        InvoiceStorage invoiceStorage0 = null;
        Payment payment1 = new Payment(invoiceStorage0);
        java.util.List<PaymentRecord> paymentRecordList2 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList3 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList4 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList5 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList6 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList7 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList8 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList9 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList10 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList11 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList12 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList13 = payment1.getPaymentRecords();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean15 = payment1.payByCash((int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"InvoiceStorage.getInvoice(int)\" because \"this.invoiceStorage\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(paymentRecordList2);
        org.junit.Assert.assertNotNull(paymentRecordList3);
        org.junit.Assert.assertNotNull(paymentRecordList4);
        org.junit.Assert.assertNotNull(paymentRecordList5);
        org.junit.Assert.assertNotNull(paymentRecordList6);
        org.junit.Assert.assertNotNull(paymentRecordList7);
        org.junit.Assert.assertNotNull(paymentRecordList8);
        org.junit.Assert.assertNotNull(paymentRecordList9);
        org.junit.Assert.assertNotNull(paymentRecordList10);
        org.junit.Assert.assertNotNull(paymentRecordList11);
        org.junit.Assert.assertNotNull(paymentRecordList12);
        org.junit.Assert.assertNotNull(paymentRecordList13);
    }

    @Test
    public void test0303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PaymentTest0.test0303");
        InvoiceStorage invoiceStorage0 = null;
        Payment payment1 = new Payment(invoiceStorage0);
        java.util.List<PaymentRecord> paymentRecordList2 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList3 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList4 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList5 = payment1.getPaymentRecords();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean7 = payment1.payByCash((int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"InvoiceStorage.getInvoice(int)\" because \"this.invoiceStorage\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(paymentRecordList2);
        org.junit.Assert.assertNotNull(paymentRecordList3);
        org.junit.Assert.assertNotNull(paymentRecordList4);
        org.junit.Assert.assertNotNull(paymentRecordList5);
    }

    @Test
    public void test0304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PaymentTest0.test0304");
        InvoiceStorage invoiceStorage0 = null;
        Payment payment1 = new Payment(invoiceStorage0);
        java.util.List<PaymentRecord> paymentRecordList2 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList3 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList4 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList5 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList6 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList7 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList8 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList9 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList10 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList11 = payment1.getPaymentRecords();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean14 = payment1.payOnline((int) (byte) -1, "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"InvoiceStorage.getInvoice(int)\" because \"this.invoiceStorage\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(paymentRecordList2);
        org.junit.Assert.assertNotNull(paymentRecordList3);
        org.junit.Assert.assertNotNull(paymentRecordList4);
        org.junit.Assert.assertNotNull(paymentRecordList5);
        org.junit.Assert.assertNotNull(paymentRecordList6);
        org.junit.Assert.assertNotNull(paymentRecordList7);
        org.junit.Assert.assertNotNull(paymentRecordList8);
        org.junit.Assert.assertNotNull(paymentRecordList9);
        org.junit.Assert.assertNotNull(paymentRecordList10);
        org.junit.Assert.assertNotNull(paymentRecordList11);
    }

    @Test
    public void test0305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PaymentTest0.test0305");
        InvoiceStorage invoiceStorage0 = null;
        Payment payment1 = new Payment(invoiceStorage0);
        java.util.List<PaymentRecord> paymentRecordList2 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList3 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList4 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList5 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList6 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList7 = payment1.getPaymentRecords();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean9 = payment1.payByCash(0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"InvoiceStorage.getInvoice(int)\" because \"this.invoiceStorage\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(paymentRecordList2);
        org.junit.Assert.assertNotNull(paymentRecordList3);
        org.junit.Assert.assertNotNull(paymentRecordList4);
        org.junit.Assert.assertNotNull(paymentRecordList5);
        org.junit.Assert.assertNotNull(paymentRecordList6);
        org.junit.Assert.assertNotNull(paymentRecordList7);
    }

    @Test
    public void test0306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PaymentTest0.test0306");
        InvoiceStorage invoiceStorage0 = null;
        Payment payment1 = new Payment(invoiceStorage0);
        java.util.List<PaymentRecord> paymentRecordList2 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList3 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList4 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList5 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList6 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList7 = payment1.getPaymentRecords();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean9 = payment1.payByCash((int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"InvoiceStorage.getInvoice(int)\" because \"this.invoiceStorage\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(paymentRecordList2);
        org.junit.Assert.assertNotNull(paymentRecordList3);
        org.junit.Assert.assertNotNull(paymentRecordList4);
        org.junit.Assert.assertNotNull(paymentRecordList5);
        org.junit.Assert.assertNotNull(paymentRecordList6);
        org.junit.Assert.assertNotNull(paymentRecordList7);
    }

    @Test
    public void test0307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PaymentTest0.test0307");
        InvoiceStorage invoiceStorage0 = null;
        Payment payment1 = new Payment(invoiceStorage0);
        java.util.List<PaymentRecord> paymentRecordList2 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList3 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList4 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList5 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList6 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList7 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList8 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList9 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList10 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList11 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList12 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList13 = payment1.getPaymentRecords();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean18 = payment1.payByCard((int) (byte) -1, "", "", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"InvoiceStorage.getInvoice(int)\" because \"this.invoiceStorage\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(paymentRecordList2);
        org.junit.Assert.assertNotNull(paymentRecordList3);
        org.junit.Assert.assertNotNull(paymentRecordList4);
        org.junit.Assert.assertNotNull(paymentRecordList5);
        org.junit.Assert.assertNotNull(paymentRecordList6);
        org.junit.Assert.assertNotNull(paymentRecordList7);
        org.junit.Assert.assertNotNull(paymentRecordList8);
        org.junit.Assert.assertNotNull(paymentRecordList9);
        org.junit.Assert.assertNotNull(paymentRecordList10);
        org.junit.Assert.assertNotNull(paymentRecordList11);
        org.junit.Assert.assertNotNull(paymentRecordList12);
        org.junit.Assert.assertNotNull(paymentRecordList13);
    }

    @Test
    public void test0308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PaymentTest0.test0308");
        InvoiceStorage invoiceStorage0 = null;
        Payment payment1 = new Payment(invoiceStorage0);
        java.util.List<PaymentRecord> paymentRecordList2 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList3 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList4 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList5 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList6 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList7 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList8 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList9 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList10 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList11 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList12 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList13 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList14 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList15 = payment1.getPaymentRecords();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean20 = payment1.payByCard((-1), "hi!", "", "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"InvoiceStorage.getInvoice(int)\" because \"this.invoiceStorage\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(paymentRecordList2);
        org.junit.Assert.assertNotNull(paymentRecordList3);
        org.junit.Assert.assertNotNull(paymentRecordList4);
        org.junit.Assert.assertNotNull(paymentRecordList5);
        org.junit.Assert.assertNotNull(paymentRecordList6);
        org.junit.Assert.assertNotNull(paymentRecordList7);
        org.junit.Assert.assertNotNull(paymentRecordList8);
        org.junit.Assert.assertNotNull(paymentRecordList9);
        org.junit.Assert.assertNotNull(paymentRecordList10);
        org.junit.Assert.assertNotNull(paymentRecordList11);
        org.junit.Assert.assertNotNull(paymentRecordList12);
        org.junit.Assert.assertNotNull(paymentRecordList13);
        org.junit.Assert.assertNotNull(paymentRecordList14);
        org.junit.Assert.assertNotNull(paymentRecordList15);
    }

    @Test
    public void test0309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PaymentTest0.test0309");
        InvoiceStorage invoiceStorage0 = null;
        Payment payment1 = new Payment(invoiceStorage0);
        java.util.List<PaymentRecord> paymentRecordList2 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList3 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList4 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList5 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList6 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList7 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList8 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList9 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList10 = payment1.getPaymentRecords();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean13 = payment1.payOnline(10, "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"InvoiceStorage.getInvoice(int)\" because \"this.invoiceStorage\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(paymentRecordList2);
        org.junit.Assert.assertNotNull(paymentRecordList3);
        org.junit.Assert.assertNotNull(paymentRecordList4);
        org.junit.Assert.assertNotNull(paymentRecordList5);
        org.junit.Assert.assertNotNull(paymentRecordList6);
        org.junit.Assert.assertNotNull(paymentRecordList7);
        org.junit.Assert.assertNotNull(paymentRecordList8);
        org.junit.Assert.assertNotNull(paymentRecordList9);
        org.junit.Assert.assertNotNull(paymentRecordList10);
    }

    @Test
    public void test0310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PaymentTest0.test0310");
        InvoiceStorage invoiceStorage0 = null;
        Payment payment1 = new Payment(invoiceStorage0);
        java.util.List<PaymentRecord> paymentRecordList2 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList3 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList4 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList5 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList6 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList7 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList8 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList9 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList10 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList11 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList12 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList13 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList14 = payment1.getPaymentRecords();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean16 = payment1.payByCash((int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"InvoiceStorage.getInvoice(int)\" because \"this.invoiceStorage\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(paymentRecordList2);
        org.junit.Assert.assertNotNull(paymentRecordList3);
        org.junit.Assert.assertNotNull(paymentRecordList4);
        org.junit.Assert.assertNotNull(paymentRecordList5);
        org.junit.Assert.assertNotNull(paymentRecordList6);
        org.junit.Assert.assertNotNull(paymentRecordList7);
        org.junit.Assert.assertNotNull(paymentRecordList8);
        org.junit.Assert.assertNotNull(paymentRecordList9);
        org.junit.Assert.assertNotNull(paymentRecordList10);
        org.junit.Assert.assertNotNull(paymentRecordList11);
        org.junit.Assert.assertNotNull(paymentRecordList12);
        org.junit.Assert.assertNotNull(paymentRecordList13);
        org.junit.Assert.assertNotNull(paymentRecordList14);
    }

    @Test
    public void test0311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PaymentTest0.test0311");
        InvoiceStorage invoiceStorage0 = null;
        Payment payment1 = new Payment(invoiceStorage0);
        java.util.List<PaymentRecord> paymentRecordList2 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList3 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList4 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList5 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList6 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList7 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList8 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList9 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList10 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList11 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList12 = payment1.getPaymentRecords();
        java.lang.Class<?> wildcardClass13 = paymentRecordList12.getClass();
        org.junit.Assert.assertNotNull(paymentRecordList2);
        org.junit.Assert.assertNotNull(paymentRecordList3);
        org.junit.Assert.assertNotNull(paymentRecordList4);
        org.junit.Assert.assertNotNull(paymentRecordList5);
        org.junit.Assert.assertNotNull(paymentRecordList6);
        org.junit.Assert.assertNotNull(paymentRecordList7);
        org.junit.Assert.assertNotNull(paymentRecordList8);
        org.junit.Assert.assertNotNull(paymentRecordList9);
        org.junit.Assert.assertNotNull(paymentRecordList10);
        org.junit.Assert.assertNotNull(paymentRecordList11);
        org.junit.Assert.assertNotNull(paymentRecordList12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PaymentTest0.test0312");
        InvoiceStorage invoiceStorage0 = null;
        Payment payment1 = new Payment(invoiceStorage0);
        java.util.List<PaymentRecord> paymentRecordList2 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList3 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList4 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList5 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList6 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList7 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList8 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList9 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList10 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList11 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList12 = payment1.getPaymentRecords();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean14 = payment1.payByCash((int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"InvoiceStorage.getInvoice(int)\" because \"this.invoiceStorage\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(paymentRecordList2);
        org.junit.Assert.assertNotNull(paymentRecordList3);
        org.junit.Assert.assertNotNull(paymentRecordList4);
        org.junit.Assert.assertNotNull(paymentRecordList5);
        org.junit.Assert.assertNotNull(paymentRecordList6);
        org.junit.Assert.assertNotNull(paymentRecordList7);
        org.junit.Assert.assertNotNull(paymentRecordList8);
        org.junit.Assert.assertNotNull(paymentRecordList9);
        org.junit.Assert.assertNotNull(paymentRecordList10);
        org.junit.Assert.assertNotNull(paymentRecordList11);
        org.junit.Assert.assertNotNull(paymentRecordList12);
    }

    @Test
    public void test0313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PaymentTest0.test0313");
        InvoiceStorage invoiceStorage0 = null;
        Payment payment1 = new Payment(invoiceStorage0);
        java.util.List<PaymentRecord> paymentRecordList2 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList3 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList4 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList5 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList6 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList7 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList8 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList9 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList10 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList11 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList12 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList13 = payment1.getPaymentRecords();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean18 = payment1.payByCard((int) (byte) 0, "hi!", "hi!", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"InvoiceStorage.getInvoice(int)\" because \"this.invoiceStorage\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(paymentRecordList2);
        org.junit.Assert.assertNotNull(paymentRecordList3);
        org.junit.Assert.assertNotNull(paymentRecordList4);
        org.junit.Assert.assertNotNull(paymentRecordList5);
        org.junit.Assert.assertNotNull(paymentRecordList6);
        org.junit.Assert.assertNotNull(paymentRecordList7);
        org.junit.Assert.assertNotNull(paymentRecordList8);
        org.junit.Assert.assertNotNull(paymentRecordList9);
        org.junit.Assert.assertNotNull(paymentRecordList10);
        org.junit.Assert.assertNotNull(paymentRecordList11);
        org.junit.Assert.assertNotNull(paymentRecordList12);
        org.junit.Assert.assertNotNull(paymentRecordList13);
    }

    @Test
    public void test0314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PaymentTest0.test0314");
        InvoiceStorage invoiceStorage0 = null;
        Payment payment1 = new Payment(invoiceStorage0);
        java.util.List<PaymentRecord> paymentRecordList2 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList3 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList4 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList5 = payment1.getPaymentRecords();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean8 = payment1.payOnline((int) (short) 0, "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"InvoiceStorage.getInvoice(int)\" because \"this.invoiceStorage\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(paymentRecordList2);
        org.junit.Assert.assertNotNull(paymentRecordList3);
        org.junit.Assert.assertNotNull(paymentRecordList4);
        org.junit.Assert.assertNotNull(paymentRecordList5);
    }

    @Test
    public void test0315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PaymentTest0.test0315");
        InvoiceStorage invoiceStorage0 = null;
        Payment payment1 = new Payment(invoiceStorage0);
        java.util.List<PaymentRecord> paymentRecordList2 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList3 = payment1.getPaymentRecords();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean6 = payment1.payOnline((int) (byte) 10, "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"InvoiceStorage.getInvoice(int)\" because \"this.invoiceStorage\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(paymentRecordList2);
        org.junit.Assert.assertNotNull(paymentRecordList3);
    }

    @Test
    public void test0316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PaymentTest0.test0316");
        InvoiceStorage invoiceStorage0 = null;
        Payment payment1 = new Payment(invoiceStorage0);
        java.util.List<PaymentRecord> paymentRecordList2 = payment1.getPaymentRecords();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean5 = payment1.payOnline((int) '4', "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"InvoiceStorage.getInvoice(int)\" because \"this.invoiceStorage\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(paymentRecordList2);
    }

    @Test
    public void test0317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PaymentTest0.test0317");
        InvoiceStorage invoiceStorage0 = null;
        Payment payment1 = new Payment(invoiceStorage0);
        java.util.List<PaymentRecord> paymentRecordList2 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList3 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList4 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList5 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList6 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList7 = payment1.getPaymentRecords();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean10 = payment1.payOnline((int) ' ', "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"InvoiceStorage.getInvoice(int)\" because \"this.invoiceStorage\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(paymentRecordList2);
        org.junit.Assert.assertNotNull(paymentRecordList3);
        org.junit.Assert.assertNotNull(paymentRecordList4);
        org.junit.Assert.assertNotNull(paymentRecordList5);
        org.junit.Assert.assertNotNull(paymentRecordList6);
        org.junit.Assert.assertNotNull(paymentRecordList7);
    }

    @Test
    public void test0318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PaymentTest0.test0318");
        InvoiceStorage invoiceStorage0 = null;
        Payment payment1 = new Payment(invoiceStorage0);
        java.util.List<PaymentRecord> paymentRecordList2 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList3 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList4 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList5 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList6 = payment1.getPaymentRecords();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean8 = payment1.payByCash(1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"InvoiceStorage.getInvoice(int)\" because \"this.invoiceStorage\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(paymentRecordList2);
        org.junit.Assert.assertNotNull(paymentRecordList3);
        org.junit.Assert.assertNotNull(paymentRecordList4);
        org.junit.Assert.assertNotNull(paymentRecordList5);
        org.junit.Assert.assertNotNull(paymentRecordList6);
    }

    @Test
    public void test0319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PaymentTest0.test0319");
        InvoiceStorage invoiceStorage0 = null;
        Payment payment1 = new Payment(invoiceStorage0);
        java.util.List<PaymentRecord> paymentRecordList2 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList3 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList4 = payment1.getPaymentRecords();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean7 = payment1.payOnline(0, "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"InvoiceStorage.getInvoice(int)\" because \"this.invoiceStorage\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(paymentRecordList2);
        org.junit.Assert.assertNotNull(paymentRecordList3);
        org.junit.Assert.assertNotNull(paymentRecordList4);
    }

    @Test
    public void test0320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PaymentTest0.test0320");
        InvoiceStorage invoiceStorage0 = null;
        Payment payment1 = new Payment(invoiceStorage0);
        java.util.List<PaymentRecord> paymentRecordList2 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList3 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList4 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList5 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList6 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList7 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList8 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList9 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList10 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList11 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList12 = payment1.getPaymentRecords();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean15 = payment1.payOnline(0, "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"InvoiceStorage.getInvoice(int)\" because \"this.invoiceStorage\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(paymentRecordList2);
        org.junit.Assert.assertNotNull(paymentRecordList3);
        org.junit.Assert.assertNotNull(paymentRecordList4);
        org.junit.Assert.assertNotNull(paymentRecordList5);
        org.junit.Assert.assertNotNull(paymentRecordList6);
        org.junit.Assert.assertNotNull(paymentRecordList7);
        org.junit.Assert.assertNotNull(paymentRecordList8);
        org.junit.Assert.assertNotNull(paymentRecordList9);
        org.junit.Assert.assertNotNull(paymentRecordList10);
        org.junit.Assert.assertNotNull(paymentRecordList11);
        org.junit.Assert.assertNotNull(paymentRecordList12);
    }

    @Test
    public void test0321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PaymentTest0.test0321");
        InvoiceStorage invoiceStorage0 = null;
        Payment payment1 = new Payment(invoiceStorage0);
        java.util.List<PaymentRecord> paymentRecordList2 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList3 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList4 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList5 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList6 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList7 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList8 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList9 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList10 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList11 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList12 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList13 = payment1.getPaymentRecords();
        java.lang.Class<?> wildcardClass14 = paymentRecordList13.getClass();
        org.junit.Assert.assertNotNull(paymentRecordList2);
        org.junit.Assert.assertNotNull(paymentRecordList3);
        org.junit.Assert.assertNotNull(paymentRecordList4);
        org.junit.Assert.assertNotNull(paymentRecordList5);
        org.junit.Assert.assertNotNull(paymentRecordList6);
        org.junit.Assert.assertNotNull(paymentRecordList7);
        org.junit.Assert.assertNotNull(paymentRecordList8);
        org.junit.Assert.assertNotNull(paymentRecordList9);
        org.junit.Assert.assertNotNull(paymentRecordList10);
        org.junit.Assert.assertNotNull(paymentRecordList11);
        org.junit.Assert.assertNotNull(paymentRecordList12);
        org.junit.Assert.assertNotNull(paymentRecordList13);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PaymentTest0.test0322");
        InvoiceStorage invoiceStorage0 = null;
        Payment payment1 = new Payment(invoiceStorage0);
        java.util.List<PaymentRecord> paymentRecordList2 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList3 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList4 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList5 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList6 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList7 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList8 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList9 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList10 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList11 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList12 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList13 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList14 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList15 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList16 = payment1.getPaymentRecords();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean21 = payment1.payByCard((int) 'a', "", "", "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"InvoiceStorage.getInvoice(int)\" because \"this.invoiceStorage\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(paymentRecordList2);
        org.junit.Assert.assertNotNull(paymentRecordList3);
        org.junit.Assert.assertNotNull(paymentRecordList4);
        org.junit.Assert.assertNotNull(paymentRecordList5);
        org.junit.Assert.assertNotNull(paymentRecordList6);
        org.junit.Assert.assertNotNull(paymentRecordList7);
        org.junit.Assert.assertNotNull(paymentRecordList8);
        org.junit.Assert.assertNotNull(paymentRecordList9);
        org.junit.Assert.assertNotNull(paymentRecordList10);
        org.junit.Assert.assertNotNull(paymentRecordList11);
        org.junit.Assert.assertNotNull(paymentRecordList12);
        org.junit.Assert.assertNotNull(paymentRecordList13);
        org.junit.Assert.assertNotNull(paymentRecordList14);
        org.junit.Assert.assertNotNull(paymentRecordList15);
        org.junit.Assert.assertNotNull(paymentRecordList16);
    }

    @Test
    public void test0323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PaymentTest0.test0323");
        InvoiceStorage invoiceStorage0 = null;
        Payment payment1 = new Payment(invoiceStorage0);
        java.util.List<PaymentRecord> paymentRecordList2 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList3 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList4 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList5 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList6 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList7 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList8 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList9 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList10 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList11 = payment1.getPaymentRecords();
        java.lang.Class<?> wildcardClass12 = payment1.getClass();
        org.junit.Assert.assertNotNull(paymentRecordList2);
        org.junit.Assert.assertNotNull(paymentRecordList3);
        org.junit.Assert.assertNotNull(paymentRecordList4);
        org.junit.Assert.assertNotNull(paymentRecordList5);
        org.junit.Assert.assertNotNull(paymentRecordList6);
        org.junit.Assert.assertNotNull(paymentRecordList7);
        org.junit.Assert.assertNotNull(paymentRecordList8);
        org.junit.Assert.assertNotNull(paymentRecordList9);
        org.junit.Assert.assertNotNull(paymentRecordList10);
        org.junit.Assert.assertNotNull(paymentRecordList11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PaymentTest0.test0324");
        InvoiceStorage invoiceStorage0 = null;
        Payment payment1 = new Payment(invoiceStorage0);
        java.util.List<PaymentRecord> paymentRecordList2 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList3 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList4 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList5 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList6 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList7 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList8 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList9 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList10 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList11 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList12 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList13 = payment1.getPaymentRecords();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean18 = payment1.payByCard((int) (byte) 1, "hi!", "", "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"InvoiceStorage.getInvoice(int)\" because \"this.invoiceStorage\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(paymentRecordList2);
        org.junit.Assert.assertNotNull(paymentRecordList3);
        org.junit.Assert.assertNotNull(paymentRecordList4);
        org.junit.Assert.assertNotNull(paymentRecordList5);
        org.junit.Assert.assertNotNull(paymentRecordList6);
        org.junit.Assert.assertNotNull(paymentRecordList7);
        org.junit.Assert.assertNotNull(paymentRecordList8);
        org.junit.Assert.assertNotNull(paymentRecordList9);
        org.junit.Assert.assertNotNull(paymentRecordList10);
        org.junit.Assert.assertNotNull(paymentRecordList11);
        org.junit.Assert.assertNotNull(paymentRecordList12);
        org.junit.Assert.assertNotNull(paymentRecordList13);
    }

    @Test
    public void test0325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PaymentTest0.test0325");
        InvoiceStorage invoiceStorage0 = null;
        Payment payment1 = new Payment(invoiceStorage0);
        java.util.List<PaymentRecord> paymentRecordList2 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList3 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList4 = payment1.getPaymentRecords();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean7 = payment1.payOnline((int) (byte) 0, "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"InvoiceStorage.getInvoice(int)\" because \"this.invoiceStorage\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(paymentRecordList2);
        org.junit.Assert.assertNotNull(paymentRecordList3);
        org.junit.Assert.assertNotNull(paymentRecordList4);
    }

    @Test
    public void test0326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PaymentTest0.test0326");
        InvoiceStorage invoiceStorage0 = null;
        Payment payment1 = new Payment(invoiceStorage0);
        java.util.List<PaymentRecord> paymentRecordList2 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList3 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList4 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList5 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList6 = payment1.getPaymentRecords();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean11 = payment1.payByCard((int) (byte) 100, "", "", "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"InvoiceStorage.getInvoice(int)\" because \"this.invoiceStorage\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(paymentRecordList2);
        org.junit.Assert.assertNotNull(paymentRecordList3);
        org.junit.Assert.assertNotNull(paymentRecordList4);
        org.junit.Assert.assertNotNull(paymentRecordList5);
        org.junit.Assert.assertNotNull(paymentRecordList6);
    }

    @Test
    public void test0327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PaymentTest0.test0327");
        InvoiceStorage invoiceStorage0 = null;
        Payment payment1 = new Payment(invoiceStorage0);
        java.util.List<PaymentRecord> paymentRecordList2 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList3 = payment1.getPaymentRecords();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean5 = payment1.payByCash((int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"InvoiceStorage.getInvoice(int)\" because \"this.invoiceStorage\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(paymentRecordList2);
        org.junit.Assert.assertNotNull(paymentRecordList3);
    }

    @Test
    public void test0328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PaymentTest0.test0328");
        InvoiceStorage invoiceStorage0 = null;
        Payment payment1 = new Payment(invoiceStorage0);
        java.util.List<PaymentRecord> paymentRecordList2 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList3 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList4 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList5 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList6 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList7 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList8 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList9 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList10 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList11 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList12 = payment1.getPaymentRecords();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean14 = payment1.payByCash((int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"InvoiceStorage.getInvoice(int)\" because \"this.invoiceStorage\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(paymentRecordList2);
        org.junit.Assert.assertNotNull(paymentRecordList3);
        org.junit.Assert.assertNotNull(paymentRecordList4);
        org.junit.Assert.assertNotNull(paymentRecordList5);
        org.junit.Assert.assertNotNull(paymentRecordList6);
        org.junit.Assert.assertNotNull(paymentRecordList7);
        org.junit.Assert.assertNotNull(paymentRecordList8);
        org.junit.Assert.assertNotNull(paymentRecordList9);
        org.junit.Assert.assertNotNull(paymentRecordList10);
        org.junit.Assert.assertNotNull(paymentRecordList11);
        org.junit.Assert.assertNotNull(paymentRecordList12);
    }

    @Test
    public void test0329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PaymentTest0.test0329");
        InvoiceStorage invoiceStorage0 = null;
        Payment payment1 = new Payment(invoiceStorage0);
        java.util.List<PaymentRecord> paymentRecordList2 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList3 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList4 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList5 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList6 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList7 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList8 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList9 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList10 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList11 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList12 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList13 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList14 = payment1.getPaymentRecords();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean16 = payment1.payByCash((int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"InvoiceStorage.getInvoice(int)\" because \"this.invoiceStorage\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(paymentRecordList2);
        org.junit.Assert.assertNotNull(paymentRecordList3);
        org.junit.Assert.assertNotNull(paymentRecordList4);
        org.junit.Assert.assertNotNull(paymentRecordList5);
        org.junit.Assert.assertNotNull(paymentRecordList6);
        org.junit.Assert.assertNotNull(paymentRecordList7);
        org.junit.Assert.assertNotNull(paymentRecordList8);
        org.junit.Assert.assertNotNull(paymentRecordList9);
        org.junit.Assert.assertNotNull(paymentRecordList10);
        org.junit.Assert.assertNotNull(paymentRecordList11);
        org.junit.Assert.assertNotNull(paymentRecordList12);
        org.junit.Assert.assertNotNull(paymentRecordList13);
        org.junit.Assert.assertNotNull(paymentRecordList14);
    }

    @Test
    public void test0330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PaymentTest0.test0330");
        InvoiceStorage invoiceStorage0 = null;
        Payment payment1 = new Payment(invoiceStorage0);
        java.util.List<PaymentRecord> paymentRecordList2 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList3 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList4 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList5 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList6 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList7 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList8 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList9 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList10 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList11 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList12 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList13 = payment1.getPaymentRecords();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean16 = payment1.payOnline((int) (byte) 100, "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"InvoiceStorage.getInvoice(int)\" because \"this.invoiceStorage\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(paymentRecordList2);
        org.junit.Assert.assertNotNull(paymentRecordList3);
        org.junit.Assert.assertNotNull(paymentRecordList4);
        org.junit.Assert.assertNotNull(paymentRecordList5);
        org.junit.Assert.assertNotNull(paymentRecordList6);
        org.junit.Assert.assertNotNull(paymentRecordList7);
        org.junit.Assert.assertNotNull(paymentRecordList8);
        org.junit.Assert.assertNotNull(paymentRecordList9);
        org.junit.Assert.assertNotNull(paymentRecordList10);
        org.junit.Assert.assertNotNull(paymentRecordList11);
        org.junit.Assert.assertNotNull(paymentRecordList12);
        org.junit.Assert.assertNotNull(paymentRecordList13);
    }

    @Test
    public void test0331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PaymentTest0.test0331");
        InvoiceStorage invoiceStorage0 = null;
        Payment payment1 = new Payment(invoiceStorage0);
        java.util.List<PaymentRecord> paymentRecordList2 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList3 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList4 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList5 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList6 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList7 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList8 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList9 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList10 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList11 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList12 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList13 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList14 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList15 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList16 = payment1.getPaymentRecords();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean18 = payment1.payByCash((int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"InvoiceStorage.getInvoice(int)\" because \"this.invoiceStorage\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(paymentRecordList2);
        org.junit.Assert.assertNotNull(paymentRecordList3);
        org.junit.Assert.assertNotNull(paymentRecordList4);
        org.junit.Assert.assertNotNull(paymentRecordList5);
        org.junit.Assert.assertNotNull(paymentRecordList6);
        org.junit.Assert.assertNotNull(paymentRecordList7);
        org.junit.Assert.assertNotNull(paymentRecordList8);
        org.junit.Assert.assertNotNull(paymentRecordList9);
        org.junit.Assert.assertNotNull(paymentRecordList10);
        org.junit.Assert.assertNotNull(paymentRecordList11);
        org.junit.Assert.assertNotNull(paymentRecordList12);
        org.junit.Assert.assertNotNull(paymentRecordList13);
        org.junit.Assert.assertNotNull(paymentRecordList14);
        org.junit.Assert.assertNotNull(paymentRecordList15);
        org.junit.Assert.assertNotNull(paymentRecordList16);
    }

    @Test
    public void test0332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PaymentTest0.test0332");
        InvoiceStorage invoiceStorage0 = null;
        Payment payment1 = new Payment(invoiceStorage0);
        java.util.List<PaymentRecord> paymentRecordList2 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList3 = payment1.getPaymentRecords();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean8 = payment1.payByCard((int) 'a', "hi!", "", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"InvoiceStorage.getInvoice(int)\" because \"this.invoiceStorage\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(paymentRecordList2);
        org.junit.Assert.assertNotNull(paymentRecordList3);
    }

    @Test
    public void test0333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PaymentTest0.test0333");
        InvoiceStorage invoiceStorage0 = null;
        Payment payment1 = new Payment(invoiceStorage0);
        java.util.List<PaymentRecord> paymentRecordList2 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList3 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList4 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList5 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList6 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList7 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList8 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList9 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList10 = payment1.getPaymentRecords();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean13 = payment1.payOnline(0, "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"InvoiceStorage.getInvoice(int)\" because \"this.invoiceStorage\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(paymentRecordList2);
        org.junit.Assert.assertNotNull(paymentRecordList3);
        org.junit.Assert.assertNotNull(paymentRecordList4);
        org.junit.Assert.assertNotNull(paymentRecordList5);
        org.junit.Assert.assertNotNull(paymentRecordList6);
        org.junit.Assert.assertNotNull(paymentRecordList7);
        org.junit.Assert.assertNotNull(paymentRecordList8);
        org.junit.Assert.assertNotNull(paymentRecordList9);
        org.junit.Assert.assertNotNull(paymentRecordList10);
    }

    @Test
    public void test0334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PaymentTest0.test0334");
        InvoiceStorage invoiceStorage0 = null;
        Payment payment1 = new Payment(invoiceStorage0);
        java.util.List<PaymentRecord> paymentRecordList2 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList3 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList4 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList5 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList6 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList7 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList8 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList9 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList10 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList11 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList12 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList13 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList14 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList15 = payment1.getPaymentRecords();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean20 = payment1.payByCard((int) (byte) -1, "hi!", "", "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"InvoiceStorage.getInvoice(int)\" because \"this.invoiceStorage\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(paymentRecordList2);
        org.junit.Assert.assertNotNull(paymentRecordList3);
        org.junit.Assert.assertNotNull(paymentRecordList4);
        org.junit.Assert.assertNotNull(paymentRecordList5);
        org.junit.Assert.assertNotNull(paymentRecordList6);
        org.junit.Assert.assertNotNull(paymentRecordList7);
        org.junit.Assert.assertNotNull(paymentRecordList8);
        org.junit.Assert.assertNotNull(paymentRecordList9);
        org.junit.Assert.assertNotNull(paymentRecordList10);
        org.junit.Assert.assertNotNull(paymentRecordList11);
        org.junit.Assert.assertNotNull(paymentRecordList12);
        org.junit.Assert.assertNotNull(paymentRecordList13);
        org.junit.Assert.assertNotNull(paymentRecordList14);
        org.junit.Assert.assertNotNull(paymentRecordList15);
    }

    @Test
    public void test0335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PaymentTest0.test0335");
        InvoiceStorage invoiceStorage0 = null;
        Payment payment1 = new Payment(invoiceStorage0);
        java.util.List<PaymentRecord> paymentRecordList2 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList3 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList4 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList5 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList6 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList7 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList8 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList9 = payment1.getPaymentRecords();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean14 = payment1.payByCard((int) (byte) 10, "hi!", "hi!", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"InvoiceStorage.getInvoice(int)\" because \"this.invoiceStorage\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(paymentRecordList2);
        org.junit.Assert.assertNotNull(paymentRecordList3);
        org.junit.Assert.assertNotNull(paymentRecordList4);
        org.junit.Assert.assertNotNull(paymentRecordList5);
        org.junit.Assert.assertNotNull(paymentRecordList6);
        org.junit.Assert.assertNotNull(paymentRecordList7);
        org.junit.Assert.assertNotNull(paymentRecordList8);
        org.junit.Assert.assertNotNull(paymentRecordList9);
    }

    @Test
    public void test0336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PaymentTest0.test0336");
        InvoiceStorage invoiceStorage0 = null;
        Payment payment1 = new Payment(invoiceStorage0);
        java.util.List<PaymentRecord> paymentRecordList2 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList3 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList4 = payment1.getPaymentRecords();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean7 = payment1.payOnline((int) (short) 0, "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"InvoiceStorage.getInvoice(int)\" because \"this.invoiceStorage\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(paymentRecordList2);
        org.junit.Assert.assertNotNull(paymentRecordList3);
        org.junit.Assert.assertNotNull(paymentRecordList4);
    }

    @Test
    public void test0337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PaymentTest0.test0337");
        InvoiceStorage invoiceStorage0 = null;
        Payment payment1 = new Payment(invoiceStorage0);
        java.util.List<PaymentRecord> paymentRecordList2 = payment1.getPaymentRecords();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean7 = payment1.payByCard((int) '4', "hi!", "", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"InvoiceStorage.getInvoice(int)\" because \"this.invoiceStorage\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(paymentRecordList2);
    }

    @Test
    public void test0338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PaymentTest0.test0338");
        InvoiceStorage invoiceStorage0 = null;
        Payment payment1 = new Payment(invoiceStorage0);
        java.util.List<PaymentRecord> paymentRecordList2 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList3 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList4 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList5 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList6 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList7 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList8 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList9 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList10 = payment1.getPaymentRecords();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean12 = payment1.payByCash((int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"InvoiceStorage.getInvoice(int)\" because \"this.invoiceStorage\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(paymentRecordList2);
        org.junit.Assert.assertNotNull(paymentRecordList3);
        org.junit.Assert.assertNotNull(paymentRecordList4);
        org.junit.Assert.assertNotNull(paymentRecordList5);
        org.junit.Assert.assertNotNull(paymentRecordList6);
        org.junit.Assert.assertNotNull(paymentRecordList7);
        org.junit.Assert.assertNotNull(paymentRecordList8);
        org.junit.Assert.assertNotNull(paymentRecordList9);
        org.junit.Assert.assertNotNull(paymentRecordList10);
    }

    @Test
    public void test0339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PaymentTest0.test0339");
        InvoiceStorage invoiceStorage0 = null;
        Payment payment1 = new Payment(invoiceStorage0);
        java.util.List<PaymentRecord> paymentRecordList2 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList3 = payment1.getPaymentRecords();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean6 = payment1.payOnline((int) (short) 100, "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"InvoiceStorage.getInvoice(int)\" because \"this.invoiceStorage\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(paymentRecordList2);
        org.junit.Assert.assertNotNull(paymentRecordList3);
    }

    @Test
    public void test0340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PaymentTest0.test0340");
        InvoiceStorage invoiceStorage0 = null;
        Payment payment1 = new Payment(invoiceStorage0);
        java.util.List<PaymentRecord> paymentRecordList2 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList3 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList4 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList5 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList6 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList7 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList8 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList9 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList10 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList11 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList12 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList13 = payment1.getPaymentRecords();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean18 = payment1.payByCard((int) (short) 0, "", "", "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"InvoiceStorage.getInvoice(int)\" because \"this.invoiceStorage\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(paymentRecordList2);
        org.junit.Assert.assertNotNull(paymentRecordList3);
        org.junit.Assert.assertNotNull(paymentRecordList4);
        org.junit.Assert.assertNotNull(paymentRecordList5);
        org.junit.Assert.assertNotNull(paymentRecordList6);
        org.junit.Assert.assertNotNull(paymentRecordList7);
        org.junit.Assert.assertNotNull(paymentRecordList8);
        org.junit.Assert.assertNotNull(paymentRecordList9);
        org.junit.Assert.assertNotNull(paymentRecordList10);
        org.junit.Assert.assertNotNull(paymentRecordList11);
        org.junit.Assert.assertNotNull(paymentRecordList12);
        org.junit.Assert.assertNotNull(paymentRecordList13);
    }

    @Test
    public void test0341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PaymentTest0.test0341");
        InvoiceStorage invoiceStorage0 = null;
        Payment payment1 = new Payment(invoiceStorage0);
        java.util.List<PaymentRecord> paymentRecordList2 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList3 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList4 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList5 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList6 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList7 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList8 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList9 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList10 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList11 = payment1.getPaymentRecords();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean13 = payment1.payByCash(1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"InvoiceStorage.getInvoice(int)\" because \"this.invoiceStorage\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(paymentRecordList2);
        org.junit.Assert.assertNotNull(paymentRecordList3);
        org.junit.Assert.assertNotNull(paymentRecordList4);
        org.junit.Assert.assertNotNull(paymentRecordList5);
        org.junit.Assert.assertNotNull(paymentRecordList6);
        org.junit.Assert.assertNotNull(paymentRecordList7);
        org.junit.Assert.assertNotNull(paymentRecordList8);
        org.junit.Assert.assertNotNull(paymentRecordList9);
        org.junit.Assert.assertNotNull(paymentRecordList10);
        org.junit.Assert.assertNotNull(paymentRecordList11);
    }

    @Test
    public void test0342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PaymentTest0.test0342");
        InvoiceStorage invoiceStorage0 = null;
        Payment payment1 = new Payment(invoiceStorage0);
        java.util.List<PaymentRecord> paymentRecordList2 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList3 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList4 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList5 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList6 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList7 = payment1.getPaymentRecords();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean9 = payment1.payByCash((int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"InvoiceStorage.getInvoice(int)\" because \"this.invoiceStorage\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(paymentRecordList2);
        org.junit.Assert.assertNotNull(paymentRecordList3);
        org.junit.Assert.assertNotNull(paymentRecordList4);
        org.junit.Assert.assertNotNull(paymentRecordList5);
        org.junit.Assert.assertNotNull(paymentRecordList6);
        org.junit.Assert.assertNotNull(paymentRecordList7);
    }

    @Test
    public void test0343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PaymentTest0.test0343");
        InvoiceStorage invoiceStorage0 = null;
        Payment payment1 = new Payment(invoiceStorage0);
        java.util.List<PaymentRecord> paymentRecordList2 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList3 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList4 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList5 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList6 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList7 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList8 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList9 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList10 = payment1.getPaymentRecords();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean12 = payment1.payByCash((int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"InvoiceStorage.getInvoice(int)\" because \"this.invoiceStorage\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(paymentRecordList2);
        org.junit.Assert.assertNotNull(paymentRecordList3);
        org.junit.Assert.assertNotNull(paymentRecordList4);
        org.junit.Assert.assertNotNull(paymentRecordList5);
        org.junit.Assert.assertNotNull(paymentRecordList6);
        org.junit.Assert.assertNotNull(paymentRecordList7);
        org.junit.Assert.assertNotNull(paymentRecordList8);
        org.junit.Assert.assertNotNull(paymentRecordList9);
        org.junit.Assert.assertNotNull(paymentRecordList10);
    }

    @Test
    public void test0344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PaymentTest0.test0344");
        InvoiceStorage invoiceStorage0 = null;
        Payment payment1 = new Payment(invoiceStorage0);
        java.util.List<PaymentRecord> paymentRecordList2 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList3 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList4 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList5 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList6 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList7 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList8 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList9 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList10 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList11 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList12 = payment1.getPaymentRecords();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean17 = payment1.payByCard(1, "hi!", "", "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"InvoiceStorage.getInvoice(int)\" because \"this.invoiceStorage\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(paymentRecordList2);
        org.junit.Assert.assertNotNull(paymentRecordList3);
        org.junit.Assert.assertNotNull(paymentRecordList4);
        org.junit.Assert.assertNotNull(paymentRecordList5);
        org.junit.Assert.assertNotNull(paymentRecordList6);
        org.junit.Assert.assertNotNull(paymentRecordList7);
        org.junit.Assert.assertNotNull(paymentRecordList8);
        org.junit.Assert.assertNotNull(paymentRecordList9);
        org.junit.Assert.assertNotNull(paymentRecordList10);
        org.junit.Assert.assertNotNull(paymentRecordList11);
        org.junit.Assert.assertNotNull(paymentRecordList12);
    }

    @Test
    public void test0345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PaymentTest0.test0345");
        InvoiceStorage invoiceStorage0 = null;
        Payment payment1 = new Payment(invoiceStorage0);
        java.util.List<PaymentRecord> paymentRecordList2 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList3 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList4 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList5 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList6 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList7 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList8 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList9 = payment1.getPaymentRecords();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean14 = payment1.payByCard((int) 'a', "", "", "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"InvoiceStorage.getInvoice(int)\" because \"this.invoiceStorage\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(paymentRecordList2);
        org.junit.Assert.assertNotNull(paymentRecordList3);
        org.junit.Assert.assertNotNull(paymentRecordList4);
        org.junit.Assert.assertNotNull(paymentRecordList5);
        org.junit.Assert.assertNotNull(paymentRecordList6);
        org.junit.Assert.assertNotNull(paymentRecordList7);
        org.junit.Assert.assertNotNull(paymentRecordList8);
        org.junit.Assert.assertNotNull(paymentRecordList9);
    }

    @Test
    public void test0346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PaymentTest0.test0346");
        InvoiceStorage invoiceStorage0 = null;
        Payment payment1 = new Payment(invoiceStorage0);
        java.util.List<PaymentRecord> paymentRecordList2 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList3 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList4 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList5 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList6 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList7 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList8 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList9 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList10 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList11 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList12 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList13 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList14 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList15 = payment1.getPaymentRecords();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean18 = payment1.payOnline((int) ' ', "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"InvoiceStorage.getInvoice(int)\" because \"this.invoiceStorage\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(paymentRecordList2);
        org.junit.Assert.assertNotNull(paymentRecordList3);
        org.junit.Assert.assertNotNull(paymentRecordList4);
        org.junit.Assert.assertNotNull(paymentRecordList5);
        org.junit.Assert.assertNotNull(paymentRecordList6);
        org.junit.Assert.assertNotNull(paymentRecordList7);
        org.junit.Assert.assertNotNull(paymentRecordList8);
        org.junit.Assert.assertNotNull(paymentRecordList9);
        org.junit.Assert.assertNotNull(paymentRecordList10);
        org.junit.Assert.assertNotNull(paymentRecordList11);
        org.junit.Assert.assertNotNull(paymentRecordList12);
        org.junit.Assert.assertNotNull(paymentRecordList13);
        org.junit.Assert.assertNotNull(paymentRecordList14);
        org.junit.Assert.assertNotNull(paymentRecordList15);
    }

    @Test
    public void test0347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PaymentTest0.test0347");
        InvoiceStorage invoiceStorage0 = null;
        Payment payment1 = new Payment(invoiceStorage0);
        java.util.List<PaymentRecord> paymentRecordList2 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList3 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList4 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList5 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList6 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList7 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList8 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList9 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList10 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList11 = payment1.getPaymentRecords();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean16 = payment1.payByCard((int) (short) -1, "", "hi!", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"InvoiceStorage.getInvoice(int)\" because \"this.invoiceStorage\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(paymentRecordList2);
        org.junit.Assert.assertNotNull(paymentRecordList3);
        org.junit.Assert.assertNotNull(paymentRecordList4);
        org.junit.Assert.assertNotNull(paymentRecordList5);
        org.junit.Assert.assertNotNull(paymentRecordList6);
        org.junit.Assert.assertNotNull(paymentRecordList7);
        org.junit.Assert.assertNotNull(paymentRecordList8);
        org.junit.Assert.assertNotNull(paymentRecordList9);
        org.junit.Assert.assertNotNull(paymentRecordList10);
        org.junit.Assert.assertNotNull(paymentRecordList11);
    }

    @Test
    public void test0348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PaymentTest0.test0348");
        InvoiceStorage invoiceStorage0 = null;
        Payment payment1 = new Payment(invoiceStorage0);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean6 = payment1.payByCard((int) (short) 1, "", "", "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"InvoiceStorage.getInvoice(int)\" because \"this.invoiceStorage\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PaymentTest0.test0349");
        InvoiceStorage invoiceStorage0 = null;
        Payment payment1 = new Payment(invoiceStorage0);
        java.util.List<PaymentRecord> paymentRecordList2 = payment1.getPaymentRecords();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean5 = payment1.payOnline((-1), "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"InvoiceStorage.getInvoice(int)\" because \"this.invoiceStorage\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(paymentRecordList2);
    }

    @Test
    public void test0350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PaymentTest0.test0350");
        InvoiceStorage invoiceStorage0 = null;
        Payment payment1 = new Payment(invoiceStorage0);
        java.util.List<PaymentRecord> paymentRecordList2 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList3 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList4 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList5 = payment1.getPaymentRecords();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean10 = payment1.payByCard((int) (byte) 10, "hi!", "hi!", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"InvoiceStorage.getInvoice(int)\" because \"this.invoiceStorage\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(paymentRecordList2);
        org.junit.Assert.assertNotNull(paymentRecordList3);
        org.junit.Assert.assertNotNull(paymentRecordList4);
        org.junit.Assert.assertNotNull(paymentRecordList5);
    }

    @Test
    public void test0351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PaymentTest0.test0351");
        InvoiceStorage invoiceStorage0 = null;
        Payment payment1 = new Payment(invoiceStorage0);
        java.util.List<PaymentRecord> paymentRecordList2 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList3 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList4 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList5 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList6 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList7 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList8 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList9 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList10 = payment1.getPaymentRecords();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean13 = payment1.payOnline((int) (short) 0, "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"InvoiceStorage.getInvoice(int)\" because \"this.invoiceStorage\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(paymentRecordList2);
        org.junit.Assert.assertNotNull(paymentRecordList3);
        org.junit.Assert.assertNotNull(paymentRecordList4);
        org.junit.Assert.assertNotNull(paymentRecordList5);
        org.junit.Assert.assertNotNull(paymentRecordList6);
        org.junit.Assert.assertNotNull(paymentRecordList7);
        org.junit.Assert.assertNotNull(paymentRecordList8);
        org.junit.Assert.assertNotNull(paymentRecordList9);
        org.junit.Assert.assertNotNull(paymentRecordList10);
    }

    @Test
    public void test0352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PaymentTest0.test0352");
        InvoiceStorage invoiceStorage0 = null;
        Payment payment1 = new Payment(invoiceStorage0);
        java.util.List<PaymentRecord> paymentRecordList2 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList3 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList4 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList5 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList6 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList7 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList8 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList9 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList10 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList11 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList12 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList13 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList14 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList15 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList16 = payment1.getPaymentRecords();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean21 = payment1.payByCard((int) (byte) 1, "", "", "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"InvoiceStorage.getInvoice(int)\" because \"this.invoiceStorage\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(paymentRecordList2);
        org.junit.Assert.assertNotNull(paymentRecordList3);
        org.junit.Assert.assertNotNull(paymentRecordList4);
        org.junit.Assert.assertNotNull(paymentRecordList5);
        org.junit.Assert.assertNotNull(paymentRecordList6);
        org.junit.Assert.assertNotNull(paymentRecordList7);
        org.junit.Assert.assertNotNull(paymentRecordList8);
        org.junit.Assert.assertNotNull(paymentRecordList9);
        org.junit.Assert.assertNotNull(paymentRecordList10);
        org.junit.Assert.assertNotNull(paymentRecordList11);
        org.junit.Assert.assertNotNull(paymentRecordList12);
        org.junit.Assert.assertNotNull(paymentRecordList13);
        org.junit.Assert.assertNotNull(paymentRecordList14);
        org.junit.Assert.assertNotNull(paymentRecordList15);
        org.junit.Assert.assertNotNull(paymentRecordList16);
    }

    @Test
    public void test0353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PaymentTest0.test0353");
        InvoiceStorage invoiceStorage0 = null;
        Payment payment1 = new Payment(invoiceStorage0);
        java.util.List<PaymentRecord> paymentRecordList2 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList3 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList4 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList5 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList6 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList7 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList8 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList9 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList10 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList11 = payment1.getPaymentRecords();
        java.lang.Class<?> wildcardClass12 = paymentRecordList11.getClass();
        org.junit.Assert.assertNotNull(paymentRecordList2);
        org.junit.Assert.assertNotNull(paymentRecordList3);
        org.junit.Assert.assertNotNull(paymentRecordList4);
        org.junit.Assert.assertNotNull(paymentRecordList5);
        org.junit.Assert.assertNotNull(paymentRecordList6);
        org.junit.Assert.assertNotNull(paymentRecordList7);
        org.junit.Assert.assertNotNull(paymentRecordList8);
        org.junit.Assert.assertNotNull(paymentRecordList9);
        org.junit.Assert.assertNotNull(paymentRecordList10);
        org.junit.Assert.assertNotNull(paymentRecordList11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PaymentTest0.test0354");
        InvoiceStorage invoiceStorage0 = null;
        Payment payment1 = new Payment(invoiceStorage0);
        java.util.List<PaymentRecord> paymentRecordList2 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList3 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList4 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList5 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList6 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList7 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList8 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList9 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList10 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList11 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList12 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList13 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList14 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList15 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList16 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList17 = payment1.getPaymentRecords();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean20 = payment1.payOnline((int) '4', "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"InvoiceStorage.getInvoice(int)\" because \"this.invoiceStorage\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(paymentRecordList2);
        org.junit.Assert.assertNotNull(paymentRecordList3);
        org.junit.Assert.assertNotNull(paymentRecordList4);
        org.junit.Assert.assertNotNull(paymentRecordList5);
        org.junit.Assert.assertNotNull(paymentRecordList6);
        org.junit.Assert.assertNotNull(paymentRecordList7);
        org.junit.Assert.assertNotNull(paymentRecordList8);
        org.junit.Assert.assertNotNull(paymentRecordList9);
        org.junit.Assert.assertNotNull(paymentRecordList10);
        org.junit.Assert.assertNotNull(paymentRecordList11);
        org.junit.Assert.assertNotNull(paymentRecordList12);
        org.junit.Assert.assertNotNull(paymentRecordList13);
        org.junit.Assert.assertNotNull(paymentRecordList14);
        org.junit.Assert.assertNotNull(paymentRecordList15);
        org.junit.Assert.assertNotNull(paymentRecordList16);
        org.junit.Assert.assertNotNull(paymentRecordList17);
    }

    @Test
    public void test0355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PaymentTest0.test0355");
        InvoiceStorage invoiceStorage0 = null;
        Payment payment1 = new Payment(invoiceStorage0);
        java.util.List<PaymentRecord> paymentRecordList2 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList3 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList4 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList5 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList6 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList7 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList8 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList9 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList10 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList11 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList12 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList13 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList14 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList15 = payment1.getPaymentRecords();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean17 = payment1.payByCash((int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"InvoiceStorage.getInvoice(int)\" because \"this.invoiceStorage\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(paymentRecordList2);
        org.junit.Assert.assertNotNull(paymentRecordList3);
        org.junit.Assert.assertNotNull(paymentRecordList4);
        org.junit.Assert.assertNotNull(paymentRecordList5);
        org.junit.Assert.assertNotNull(paymentRecordList6);
        org.junit.Assert.assertNotNull(paymentRecordList7);
        org.junit.Assert.assertNotNull(paymentRecordList8);
        org.junit.Assert.assertNotNull(paymentRecordList9);
        org.junit.Assert.assertNotNull(paymentRecordList10);
        org.junit.Assert.assertNotNull(paymentRecordList11);
        org.junit.Assert.assertNotNull(paymentRecordList12);
        org.junit.Assert.assertNotNull(paymentRecordList13);
        org.junit.Assert.assertNotNull(paymentRecordList14);
        org.junit.Assert.assertNotNull(paymentRecordList15);
    }

    @Test
    public void test0356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PaymentTest0.test0356");
        InvoiceStorage invoiceStorage0 = null;
        Payment payment1 = new Payment(invoiceStorage0);
        java.util.List<PaymentRecord> paymentRecordList2 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList3 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList4 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList5 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList6 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList7 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList8 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList9 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList10 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList11 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList12 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList13 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList14 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList15 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList16 = payment1.getPaymentRecords();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean21 = payment1.payByCard((int) '#', "", "hi!", "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"InvoiceStorage.getInvoice(int)\" because \"this.invoiceStorage\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(paymentRecordList2);
        org.junit.Assert.assertNotNull(paymentRecordList3);
        org.junit.Assert.assertNotNull(paymentRecordList4);
        org.junit.Assert.assertNotNull(paymentRecordList5);
        org.junit.Assert.assertNotNull(paymentRecordList6);
        org.junit.Assert.assertNotNull(paymentRecordList7);
        org.junit.Assert.assertNotNull(paymentRecordList8);
        org.junit.Assert.assertNotNull(paymentRecordList9);
        org.junit.Assert.assertNotNull(paymentRecordList10);
        org.junit.Assert.assertNotNull(paymentRecordList11);
        org.junit.Assert.assertNotNull(paymentRecordList12);
        org.junit.Assert.assertNotNull(paymentRecordList13);
        org.junit.Assert.assertNotNull(paymentRecordList14);
        org.junit.Assert.assertNotNull(paymentRecordList15);
        org.junit.Assert.assertNotNull(paymentRecordList16);
    }

    @Test
    public void test0357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PaymentTest0.test0357");
        InvoiceStorage invoiceStorage0 = null;
        Payment payment1 = new Payment(invoiceStorage0);
        java.util.List<PaymentRecord> paymentRecordList2 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList3 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList4 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList5 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList6 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList7 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList8 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList9 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList10 = payment1.getPaymentRecords();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean13 = payment1.payOnline((int) (short) 100, "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"InvoiceStorage.getInvoice(int)\" because \"this.invoiceStorage\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(paymentRecordList2);
        org.junit.Assert.assertNotNull(paymentRecordList3);
        org.junit.Assert.assertNotNull(paymentRecordList4);
        org.junit.Assert.assertNotNull(paymentRecordList5);
        org.junit.Assert.assertNotNull(paymentRecordList6);
        org.junit.Assert.assertNotNull(paymentRecordList7);
        org.junit.Assert.assertNotNull(paymentRecordList8);
        org.junit.Assert.assertNotNull(paymentRecordList9);
        org.junit.Assert.assertNotNull(paymentRecordList10);
    }

    @Test
    public void test0358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PaymentTest0.test0358");
        InvoiceStorage invoiceStorage0 = null;
        Payment payment1 = new Payment(invoiceStorage0);
        java.util.List<PaymentRecord> paymentRecordList2 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList3 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList4 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList5 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList6 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList7 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList8 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList9 = payment1.getPaymentRecords();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean14 = payment1.payByCard((int) (short) 10, "", "hi!", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"InvoiceStorage.getInvoice(int)\" because \"this.invoiceStorage\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(paymentRecordList2);
        org.junit.Assert.assertNotNull(paymentRecordList3);
        org.junit.Assert.assertNotNull(paymentRecordList4);
        org.junit.Assert.assertNotNull(paymentRecordList5);
        org.junit.Assert.assertNotNull(paymentRecordList6);
        org.junit.Assert.assertNotNull(paymentRecordList7);
        org.junit.Assert.assertNotNull(paymentRecordList8);
        org.junit.Assert.assertNotNull(paymentRecordList9);
    }

    @Test
    public void test0359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PaymentTest0.test0359");
        InvoiceStorage invoiceStorage0 = null;
        Payment payment1 = new Payment(invoiceStorage0);
        java.util.List<PaymentRecord> paymentRecordList2 = payment1.getPaymentRecords();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean7 = payment1.payByCard(1, "", "", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"InvoiceStorage.getInvoice(int)\" because \"this.invoiceStorage\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(paymentRecordList2);
    }

    @Test
    public void test0360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PaymentTest0.test0360");
        InvoiceStorage invoiceStorage0 = null;
        Payment payment1 = new Payment(invoiceStorage0);
        java.util.List<PaymentRecord> paymentRecordList2 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList3 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList4 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList5 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList6 = payment1.getPaymentRecords();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean11 = payment1.payByCard((-1), "", "hi!", "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"InvoiceStorage.getInvoice(int)\" because \"this.invoiceStorage\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(paymentRecordList2);
        org.junit.Assert.assertNotNull(paymentRecordList3);
        org.junit.Assert.assertNotNull(paymentRecordList4);
        org.junit.Assert.assertNotNull(paymentRecordList5);
        org.junit.Assert.assertNotNull(paymentRecordList6);
    }

    @Test
    public void test0361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PaymentTest0.test0361");
        InvoiceStorage invoiceStorage0 = null;
        Payment payment1 = new Payment(invoiceStorage0);
        java.util.List<PaymentRecord> paymentRecordList2 = payment1.getPaymentRecords();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean7 = payment1.payByCard((int) (short) 1, "", "hi!", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"InvoiceStorage.getInvoice(int)\" because \"this.invoiceStorage\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(paymentRecordList2);
    }

    @Test
    public void test0362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PaymentTest0.test0362");
        InvoiceStorage invoiceStorage0 = null;
        Payment payment1 = new Payment(invoiceStorage0);
        java.util.List<PaymentRecord> paymentRecordList2 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList3 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList4 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList5 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList6 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList7 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList8 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList9 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList10 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList11 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList12 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList13 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList14 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList15 = payment1.getPaymentRecords();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean18 = payment1.payOnline((int) '#', "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"InvoiceStorage.getInvoice(int)\" because \"this.invoiceStorage\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(paymentRecordList2);
        org.junit.Assert.assertNotNull(paymentRecordList3);
        org.junit.Assert.assertNotNull(paymentRecordList4);
        org.junit.Assert.assertNotNull(paymentRecordList5);
        org.junit.Assert.assertNotNull(paymentRecordList6);
        org.junit.Assert.assertNotNull(paymentRecordList7);
        org.junit.Assert.assertNotNull(paymentRecordList8);
        org.junit.Assert.assertNotNull(paymentRecordList9);
        org.junit.Assert.assertNotNull(paymentRecordList10);
        org.junit.Assert.assertNotNull(paymentRecordList11);
        org.junit.Assert.assertNotNull(paymentRecordList12);
        org.junit.Assert.assertNotNull(paymentRecordList13);
        org.junit.Assert.assertNotNull(paymentRecordList14);
        org.junit.Assert.assertNotNull(paymentRecordList15);
    }

    @Test
    public void test0363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PaymentTest0.test0363");
        InvoiceStorage invoiceStorage0 = null;
        Payment payment1 = new Payment(invoiceStorage0);
        java.util.List<PaymentRecord> paymentRecordList2 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList3 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList4 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList5 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList6 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList7 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList8 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList9 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList10 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList11 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList12 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList13 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList14 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList15 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList16 = payment1.getPaymentRecords();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean18 = payment1.payByCash((int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"InvoiceStorage.getInvoice(int)\" because \"this.invoiceStorage\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(paymentRecordList2);
        org.junit.Assert.assertNotNull(paymentRecordList3);
        org.junit.Assert.assertNotNull(paymentRecordList4);
        org.junit.Assert.assertNotNull(paymentRecordList5);
        org.junit.Assert.assertNotNull(paymentRecordList6);
        org.junit.Assert.assertNotNull(paymentRecordList7);
        org.junit.Assert.assertNotNull(paymentRecordList8);
        org.junit.Assert.assertNotNull(paymentRecordList9);
        org.junit.Assert.assertNotNull(paymentRecordList10);
        org.junit.Assert.assertNotNull(paymentRecordList11);
        org.junit.Assert.assertNotNull(paymentRecordList12);
        org.junit.Assert.assertNotNull(paymentRecordList13);
        org.junit.Assert.assertNotNull(paymentRecordList14);
        org.junit.Assert.assertNotNull(paymentRecordList15);
        org.junit.Assert.assertNotNull(paymentRecordList16);
    }

    @Test
    public void test0364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PaymentTest0.test0364");
        InvoiceStorage invoiceStorage0 = null;
        Payment payment1 = new Payment(invoiceStorage0);
        java.util.List<PaymentRecord> paymentRecordList2 = payment1.getPaymentRecords();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean5 = payment1.payOnline(10, "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"InvoiceStorage.getInvoice(int)\" because \"this.invoiceStorage\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(paymentRecordList2);
    }

    @Test
    public void test0365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PaymentTest0.test0365");
        InvoiceStorage invoiceStorage0 = null;
        Payment payment1 = new Payment(invoiceStorage0);
        java.util.List<PaymentRecord> paymentRecordList2 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList3 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList4 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList5 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList6 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList7 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList8 = payment1.getPaymentRecords();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean11 = payment1.payOnline((int) (short) 10, "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"InvoiceStorage.getInvoice(int)\" because \"this.invoiceStorage\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(paymentRecordList2);
        org.junit.Assert.assertNotNull(paymentRecordList3);
        org.junit.Assert.assertNotNull(paymentRecordList4);
        org.junit.Assert.assertNotNull(paymentRecordList5);
        org.junit.Assert.assertNotNull(paymentRecordList6);
        org.junit.Assert.assertNotNull(paymentRecordList7);
        org.junit.Assert.assertNotNull(paymentRecordList8);
    }

    @Test
    public void test0366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PaymentTest0.test0366");
        InvoiceStorage invoiceStorage0 = null;
        Payment payment1 = new Payment(invoiceStorage0);
        java.util.List<PaymentRecord> paymentRecordList2 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList3 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList4 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList5 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList6 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList7 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList8 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList9 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList10 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList11 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList12 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList13 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList14 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList15 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList16 = payment1.getPaymentRecords();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean18 = payment1.payByCash((int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"InvoiceStorage.getInvoice(int)\" because \"this.invoiceStorage\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(paymentRecordList2);
        org.junit.Assert.assertNotNull(paymentRecordList3);
        org.junit.Assert.assertNotNull(paymentRecordList4);
        org.junit.Assert.assertNotNull(paymentRecordList5);
        org.junit.Assert.assertNotNull(paymentRecordList6);
        org.junit.Assert.assertNotNull(paymentRecordList7);
        org.junit.Assert.assertNotNull(paymentRecordList8);
        org.junit.Assert.assertNotNull(paymentRecordList9);
        org.junit.Assert.assertNotNull(paymentRecordList10);
        org.junit.Assert.assertNotNull(paymentRecordList11);
        org.junit.Assert.assertNotNull(paymentRecordList12);
        org.junit.Assert.assertNotNull(paymentRecordList13);
        org.junit.Assert.assertNotNull(paymentRecordList14);
        org.junit.Assert.assertNotNull(paymentRecordList15);
        org.junit.Assert.assertNotNull(paymentRecordList16);
    }

    @Test
    public void test0367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PaymentTest0.test0367");
        InvoiceStorage invoiceStorage0 = null;
        Payment payment1 = new Payment(invoiceStorage0);
        java.util.List<PaymentRecord> paymentRecordList2 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList3 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList4 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList5 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList6 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList7 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList8 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList9 = payment1.getPaymentRecords();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean12 = payment1.payOnline(0, "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"InvoiceStorage.getInvoice(int)\" because \"this.invoiceStorage\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(paymentRecordList2);
        org.junit.Assert.assertNotNull(paymentRecordList3);
        org.junit.Assert.assertNotNull(paymentRecordList4);
        org.junit.Assert.assertNotNull(paymentRecordList5);
        org.junit.Assert.assertNotNull(paymentRecordList6);
        org.junit.Assert.assertNotNull(paymentRecordList7);
        org.junit.Assert.assertNotNull(paymentRecordList8);
        org.junit.Assert.assertNotNull(paymentRecordList9);
    }

    @Test
    public void test0368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PaymentTest0.test0368");
        InvoiceStorage invoiceStorage0 = null;
        Payment payment1 = new Payment(invoiceStorage0);
        java.util.List<PaymentRecord> paymentRecordList2 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList3 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList4 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList5 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList6 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList7 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList8 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList9 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList10 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList11 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList12 = payment1.getPaymentRecords();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean17 = payment1.payByCard((int) (byte) 1, "", "hi!", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"InvoiceStorage.getInvoice(int)\" because \"this.invoiceStorage\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(paymentRecordList2);
        org.junit.Assert.assertNotNull(paymentRecordList3);
        org.junit.Assert.assertNotNull(paymentRecordList4);
        org.junit.Assert.assertNotNull(paymentRecordList5);
        org.junit.Assert.assertNotNull(paymentRecordList6);
        org.junit.Assert.assertNotNull(paymentRecordList7);
        org.junit.Assert.assertNotNull(paymentRecordList8);
        org.junit.Assert.assertNotNull(paymentRecordList9);
        org.junit.Assert.assertNotNull(paymentRecordList10);
        org.junit.Assert.assertNotNull(paymentRecordList11);
        org.junit.Assert.assertNotNull(paymentRecordList12);
    }

    @Test
    public void test0369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PaymentTest0.test0369");
        InvoiceStorage invoiceStorage0 = null;
        Payment payment1 = new Payment(invoiceStorage0);
        java.util.List<PaymentRecord> paymentRecordList2 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList3 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList4 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList5 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList6 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList7 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList8 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList9 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList10 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList11 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList12 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList13 = payment1.getPaymentRecords();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean16 = payment1.payOnline((int) '4', "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"InvoiceStorage.getInvoice(int)\" because \"this.invoiceStorage\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(paymentRecordList2);
        org.junit.Assert.assertNotNull(paymentRecordList3);
        org.junit.Assert.assertNotNull(paymentRecordList4);
        org.junit.Assert.assertNotNull(paymentRecordList5);
        org.junit.Assert.assertNotNull(paymentRecordList6);
        org.junit.Assert.assertNotNull(paymentRecordList7);
        org.junit.Assert.assertNotNull(paymentRecordList8);
        org.junit.Assert.assertNotNull(paymentRecordList9);
        org.junit.Assert.assertNotNull(paymentRecordList10);
        org.junit.Assert.assertNotNull(paymentRecordList11);
        org.junit.Assert.assertNotNull(paymentRecordList12);
        org.junit.Assert.assertNotNull(paymentRecordList13);
    }

    @Test
    public void test0370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PaymentTest0.test0370");
        InvoiceStorage invoiceStorage0 = null;
        Payment payment1 = new Payment(invoiceStorage0);
        java.util.List<PaymentRecord> paymentRecordList2 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList3 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList4 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList5 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList6 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList7 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList8 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList9 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList10 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList11 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList12 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList13 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList14 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList15 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList16 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList17 = payment1.getPaymentRecords();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean22 = payment1.payByCard((int) (short) 1, "hi!", "hi!", "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"InvoiceStorage.getInvoice(int)\" because \"this.invoiceStorage\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(paymentRecordList2);
        org.junit.Assert.assertNotNull(paymentRecordList3);
        org.junit.Assert.assertNotNull(paymentRecordList4);
        org.junit.Assert.assertNotNull(paymentRecordList5);
        org.junit.Assert.assertNotNull(paymentRecordList6);
        org.junit.Assert.assertNotNull(paymentRecordList7);
        org.junit.Assert.assertNotNull(paymentRecordList8);
        org.junit.Assert.assertNotNull(paymentRecordList9);
        org.junit.Assert.assertNotNull(paymentRecordList10);
        org.junit.Assert.assertNotNull(paymentRecordList11);
        org.junit.Assert.assertNotNull(paymentRecordList12);
        org.junit.Assert.assertNotNull(paymentRecordList13);
        org.junit.Assert.assertNotNull(paymentRecordList14);
        org.junit.Assert.assertNotNull(paymentRecordList15);
        org.junit.Assert.assertNotNull(paymentRecordList16);
        org.junit.Assert.assertNotNull(paymentRecordList17);
    }

    @Test
    public void test0371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PaymentTest0.test0371");
        InvoiceStorage invoiceStorage0 = null;
        Payment payment1 = new Payment(invoiceStorage0);
        java.util.List<PaymentRecord> paymentRecordList2 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList3 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList4 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList5 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList6 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList7 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList8 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList9 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList10 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList11 = payment1.getPaymentRecords();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean14 = payment1.payOnline(100, "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"InvoiceStorage.getInvoice(int)\" because \"this.invoiceStorage\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(paymentRecordList2);
        org.junit.Assert.assertNotNull(paymentRecordList3);
        org.junit.Assert.assertNotNull(paymentRecordList4);
        org.junit.Assert.assertNotNull(paymentRecordList5);
        org.junit.Assert.assertNotNull(paymentRecordList6);
        org.junit.Assert.assertNotNull(paymentRecordList7);
        org.junit.Assert.assertNotNull(paymentRecordList8);
        org.junit.Assert.assertNotNull(paymentRecordList9);
        org.junit.Assert.assertNotNull(paymentRecordList10);
        org.junit.Assert.assertNotNull(paymentRecordList11);
    }

    @Test
    public void test0372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PaymentTest0.test0372");
        InvoiceStorage invoiceStorage0 = null;
        Payment payment1 = new Payment(invoiceStorage0);
        java.util.List<PaymentRecord> paymentRecordList2 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList3 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList4 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList5 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList6 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList7 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList8 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList9 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList10 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList11 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList12 = payment1.getPaymentRecords();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean15 = payment1.payOnline((int) (byte) 0, "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"InvoiceStorage.getInvoice(int)\" because \"this.invoiceStorage\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(paymentRecordList2);
        org.junit.Assert.assertNotNull(paymentRecordList3);
        org.junit.Assert.assertNotNull(paymentRecordList4);
        org.junit.Assert.assertNotNull(paymentRecordList5);
        org.junit.Assert.assertNotNull(paymentRecordList6);
        org.junit.Assert.assertNotNull(paymentRecordList7);
        org.junit.Assert.assertNotNull(paymentRecordList8);
        org.junit.Assert.assertNotNull(paymentRecordList9);
        org.junit.Assert.assertNotNull(paymentRecordList10);
        org.junit.Assert.assertNotNull(paymentRecordList11);
        org.junit.Assert.assertNotNull(paymentRecordList12);
    }

    @Test
    public void test0373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PaymentTest0.test0373");
        InvoiceStorage invoiceStorage0 = null;
        Payment payment1 = new Payment(invoiceStorage0);
        java.util.List<PaymentRecord> paymentRecordList2 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList3 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList4 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList5 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList6 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList7 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList8 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList9 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList10 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList11 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList12 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList13 = payment1.getPaymentRecords();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean16 = payment1.payOnline((int) 'a', "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"InvoiceStorage.getInvoice(int)\" because \"this.invoiceStorage\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(paymentRecordList2);
        org.junit.Assert.assertNotNull(paymentRecordList3);
        org.junit.Assert.assertNotNull(paymentRecordList4);
        org.junit.Assert.assertNotNull(paymentRecordList5);
        org.junit.Assert.assertNotNull(paymentRecordList6);
        org.junit.Assert.assertNotNull(paymentRecordList7);
        org.junit.Assert.assertNotNull(paymentRecordList8);
        org.junit.Assert.assertNotNull(paymentRecordList9);
        org.junit.Assert.assertNotNull(paymentRecordList10);
        org.junit.Assert.assertNotNull(paymentRecordList11);
        org.junit.Assert.assertNotNull(paymentRecordList12);
        org.junit.Assert.assertNotNull(paymentRecordList13);
    }

    @Test
    public void test0374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PaymentTest0.test0374");
        InvoiceStorage invoiceStorage0 = null;
        Payment payment1 = new Payment(invoiceStorage0);
        java.util.List<PaymentRecord> paymentRecordList2 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList3 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList4 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList5 = payment1.getPaymentRecords();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean8 = payment1.payOnline((int) (byte) 100, "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"InvoiceStorage.getInvoice(int)\" because \"this.invoiceStorage\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(paymentRecordList2);
        org.junit.Assert.assertNotNull(paymentRecordList3);
        org.junit.Assert.assertNotNull(paymentRecordList4);
        org.junit.Assert.assertNotNull(paymentRecordList5);
    }

    @Test
    public void test0375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PaymentTest0.test0375");
        InvoiceStorage invoiceStorage0 = null;
        Payment payment1 = new Payment(invoiceStorage0);
        java.util.List<PaymentRecord> paymentRecordList2 = payment1.getPaymentRecords();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean7 = payment1.payByCard((int) (byte) 0, "hi!", "hi!", "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"InvoiceStorage.getInvoice(int)\" because \"this.invoiceStorage\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(paymentRecordList2);
    }

    @Test
    public void test0376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PaymentTest0.test0376");
        InvoiceStorage invoiceStorage0 = null;
        Payment payment1 = new Payment(invoiceStorage0);
        java.util.List<PaymentRecord> paymentRecordList2 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList3 = payment1.getPaymentRecords();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean8 = payment1.payByCard((int) '4', "hi!", "hi!", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"InvoiceStorage.getInvoice(int)\" because \"this.invoiceStorage\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(paymentRecordList2);
        org.junit.Assert.assertNotNull(paymentRecordList3);
    }

    @Test
    public void test0377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PaymentTest0.test0377");
        InvoiceStorage invoiceStorage0 = null;
        Payment payment1 = new Payment(invoiceStorage0);
        java.util.List<PaymentRecord> paymentRecordList2 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList3 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList4 = payment1.getPaymentRecords();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean9 = payment1.payByCard((int) (byte) 0, "hi!", "", "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"InvoiceStorage.getInvoice(int)\" because \"this.invoiceStorage\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(paymentRecordList2);
        org.junit.Assert.assertNotNull(paymentRecordList3);
        org.junit.Assert.assertNotNull(paymentRecordList4);
    }

    @Test
    public void test0378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PaymentTest0.test0378");
        InvoiceStorage invoiceStorage0 = null;
        Payment payment1 = new Payment(invoiceStorage0);
        java.util.List<PaymentRecord> paymentRecordList2 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList3 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList4 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList5 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList6 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList7 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList8 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList9 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList10 = payment1.getPaymentRecords();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean12 = payment1.payByCash((int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"InvoiceStorage.getInvoice(int)\" because \"this.invoiceStorage\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(paymentRecordList2);
        org.junit.Assert.assertNotNull(paymentRecordList3);
        org.junit.Assert.assertNotNull(paymentRecordList4);
        org.junit.Assert.assertNotNull(paymentRecordList5);
        org.junit.Assert.assertNotNull(paymentRecordList6);
        org.junit.Assert.assertNotNull(paymentRecordList7);
        org.junit.Assert.assertNotNull(paymentRecordList8);
        org.junit.Assert.assertNotNull(paymentRecordList9);
        org.junit.Assert.assertNotNull(paymentRecordList10);
    }

    @Test
    public void test0379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PaymentTest0.test0379");
        InvoiceStorage invoiceStorage0 = null;
        Payment payment1 = new Payment(invoiceStorage0);
        java.util.List<PaymentRecord> paymentRecordList2 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList3 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList4 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList5 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList6 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList7 = payment1.getPaymentRecords();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean9 = payment1.payByCash((int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"InvoiceStorage.getInvoice(int)\" because \"this.invoiceStorage\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(paymentRecordList2);
        org.junit.Assert.assertNotNull(paymentRecordList3);
        org.junit.Assert.assertNotNull(paymentRecordList4);
        org.junit.Assert.assertNotNull(paymentRecordList5);
        org.junit.Assert.assertNotNull(paymentRecordList6);
        org.junit.Assert.assertNotNull(paymentRecordList7);
    }

    @Test
    public void test0380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PaymentTest0.test0380");
        InvoiceStorage invoiceStorage0 = null;
        Payment payment1 = new Payment(invoiceStorage0);
        java.util.List<PaymentRecord> paymentRecordList2 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList3 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList4 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList5 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList6 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList7 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList8 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList9 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList10 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList11 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList12 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList13 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList14 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList15 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList16 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList17 = payment1.getPaymentRecords();
        java.lang.Class<?> wildcardClass18 = payment1.getClass();
        org.junit.Assert.assertNotNull(paymentRecordList2);
        org.junit.Assert.assertNotNull(paymentRecordList3);
        org.junit.Assert.assertNotNull(paymentRecordList4);
        org.junit.Assert.assertNotNull(paymentRecordList5);
        org.junit.Assert.assertNotNull(paymentRecordList6);
        org.junit.Assert.assertNotNull(paymentRecordList7);
        org.junit.Assert.assertNotNull(paymentRecordList8);
        org.junit.Assert.assertNotNull(paymentRecordList9);
        org.junit.Assert.assertNotNull(paymentRecordList10);
        org.junit.Assert.assertNotNull(paymentRecordList11);
        org.junit.Assert.assertNotNull(paymentRecordList12);
        org.junit.Assert.assertNotNull(paymentRecordList13);
        org.junit.Assert.assertNotNull(paymentRecordList14);
        org.junit.Assert.assertNotNull(paymentRecordList15);
        org.junit.Assert.assertNotNull(paymentRecordList16);
        org.junit.Assert.assertNotNull(paymentRecordList17);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test0381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PaymentTest0.test0381");
        InvoiceStorage invoiceStorage0 = null;
        Payment payment1 = new Payment(invoiceStorage0);
        java.util.List<PaymentRecord> paymentRecordList2 = payment1.getPaymentRecords();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean5 = payment1.payOnline((int) ' ', "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"InvoiceStorage.getInvoice(int)\" because \"this.invoiceStorage\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(paymentRecordList2);
    }

    @Test
    public void test0382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PaymentTest0.test0382");
        InvoiceStorage invoiceStorage0 = null;
        Payment payment1 = new Payment(invoiceStorage0);
        java.util.List<PaymentRecord> paymentRecordList2 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList3 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList4 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList5 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList6 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList7 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList8 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList9 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList10 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList11 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList12 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList13 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList14 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList15 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList16 = payment1.getPaymentRecords();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean21 = payment1.payByCard(100, "hi!", "", "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"InvoiceStorage.getInvoice(int)\" because \"this.invoiceStorage\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(paymentRecordList2);
        org.junit.Assert.assertNotNull(paymentRecordList3);
        org.junit.Assert.assertNotNull(paymentRecordList4);
        org.junit.Assert.assertNotNull(paymentRecordList5);
        org.junit.Assert.assertNotNull(paymentRecordList6);
        org.junit.Assert.assertNotNull(paymentRecordList7);
        org.junit.Assert.assertNotNull(paymentRecordList8);
        org.junit.Assert.assertNotNull(paymentRecordList9);
        org.junit.Assert.assertNotNull(paymentRecordList10);
        org.junit.Assert.assertNotNull(paymentRecordList11);
        org.junit.Assert.assertNotNull(paymentRecordList12);
        org.junit.Assert.assertNotNull(paymentRecordList13);
        org.junit.Assert.assertNotNull(paymentRecordList14);
        org.junit.Assert.assertNotNull(paymentRecordList15);
        org.junit.Assert.assertNotNull(paymentRecordList16);
    }

    @Test
    public void test0383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PaymentTest0.test0383");
        InvoiceStorage invoiceStorage0 = null;
        Payment payment1 = new Payment(invoiceStorage0);
        java.util.List<PaymentRecord> paymentRecordList2 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList3 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList4 = payment1.getPaymentRecords();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean7 = payment1.payOnline((int) 'a', "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"InvoiceStorage.getInvoice(int)\" because \"this.invoiceStorage\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(paymentRecordList2);
        org.junit.Assert.assertNotNull(paymentRecordList3);
        org.junit.Assert.assertNotNull(paymentRecordList4);
    }

    @Test
    public void test0384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PaymentTest0.test0384");
        InvoiceStorage invoiceStorage0 = null;
        Payment payment1 = new Payment(invoiceStorage0);
        java.util.List<PaymentRecord> paymentRecordList2 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList3 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList4 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList5 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList6 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList7 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList8 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList9 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList10 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList11 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList12 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList13 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList14 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList15 = payment1.getPaymentRecords();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean20 = payment1.payByCard((int) (short) 10, "hi!", "hi!", "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"InvoiceStorage.getInvoice(int)\" because \"this.invoiceStorage\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(paymentRecordList2);
        org.junit.Assert.assertNotNull(paymentRecordList3);
        org.junit.Assert.assertNotNull(paymentRecordList4);
        org.junit.Assert.assertNotNull(paymentRecordList5);
        org.junit.Assert.assertNotNull(paymentRecordList6);
        org.junit.Assert.assertNotNull(paymentRecordList7);
        org.junit.Assert.assertNotNull(paymentRecordList8);
        org.junit.Assert.assertNotNull(paymentRecordList9);
        org.junit.Assert.assertNotNull(paymentRecordList10);
        org.junit.Assert.assertNotNull(paymentRecordList11);
        org.junit.Assert.assertNotNull(paymentRecordList12);
        org.junit.Assert.assertNotNull(paymentRecordList13);
        org.junit.Assert.assertNotNull(paymentRecordList14);
        org.junit.Assert.assertNotNull(paymentRecordList15);
    }

    @Test
    public void test0385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PaymentTest0.test0385");
        InvoiceStorage invoiceStorage0 = null;
        Payment payment1 = new Payment(invoiceStorage0);
        java.util.List<PaymentRecord> paymentRecordList2 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList3 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList4 = payment1.getPaymentRecords();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean9 = payment1.payByCard((int) (short) -1, "", "", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"InvoiceStorage.getInvoice(int)\" because \"this.invoiceStorage\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(paymentRecordList2);
        org.junit.Assert.assertNotNull(paymentRecordList3);
        org.junit.Assert.assertNotNull(paymentRecordList4);
    }

    @Test
    public void test0386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PaymentTest0.test0386");
        InvoiceStorage invoiceStorage0 = null;
        Payment payment1 = new Payment(invoiceStorage0);
        java.util.List<PaymentRecord> paymentRecordList2 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList3 = payment1.getPaymentRecords();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean5 = payment1.payByCash(10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"InvoiceStorage.getInvoice(int)\" because \"this.invoiceStorage\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(paymentRecordList2);
        org.junit.Assert.assertNotNull(paymentRecordList3);
    }

    @Test
    public void test0387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PaymentTest0.test0387");
        InvoiceStorage invoiceStorage0 = null;
        Payment payment1 = new Payment(invoiceStorage0);
        java.util.List<PaymentRecord> paymentRecordList2 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList3 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList4 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList5 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList6 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList7 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList8 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList9 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList10 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList11 = payment1.getPaymentRecords();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean13 = payment1.payByCash(0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"InvoiceStorage.getInvoice(int)\" because \"this.invoiceStorage\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(paymentRecordList2);
        org.junit.Assert.assertNotNull(paymentRecordList3);
        org.junit.Assert.assertNotNull(paymentRecordList4);
        org.junit.Assert.assertNotNull(paymentRecordList5);
        org.junit.Assert.assertNotNull(paymentRecordList6);
        org.junit.Assert.assertNotNull(paymentRecordList7);
        org.junit.Assert.assertNotNull(paymentRecordList8);
        org.junit.Assert.assertNotNull(paymentRecordList9);
        org.junit.Assert.assertNotNull(paymentRecordList10);
        org.junit.Assert.assertNotNull(paymentRecordList11);
    }

    @Test
    public void test0388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PaymentTest0.test0388");
        InvoiceStorage invoiceStorage0 = null;
        Payment payment1 = new Payment(invoiceStorage0);
        java.util.List<PaymentRecord> paymentRecordList2 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList3 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList4 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList5 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList6 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList7 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList8 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList9 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList10 = payment1.getPaymentRecords();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean15 = payment1.payByCard((int) '4', "hi!", "hi!", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"InvoiceStorage.getInvoice(int)\" because \"this.invoiceStorage\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(paymentRecordList2);
        org.junit.Assert.assertNotNull(paymentRecordList3);
        org.junit.Assert.assertNotNull(paymentRecordList4);
        org.junit.Assert.assertNotNull(paymentRecordList5);
        org.junit.Assert.assertNotNull(paymentRecordList6);
        org.junit.Assert.assertNotNull(paymentRecordList7);
        org.junit.Assert.assertNotNull(paymentRecordList8);
        org.junit.Assert.assertNotNull(paymentRecordList9);
        org.junit.Assert.assertNotNull(paymentRecordList10);
    }

    @Test
    public void test0389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PaymentTest0.test0389");
        InvoiceStorage invoiceStorage0 = null;
        Payment payment1 = new Payment(invoiceStorage0);
        java.util.List<PaymentRecord> paymentRecordList2 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList3 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList4 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList5 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList6 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList7 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList8 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList9 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList10 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList11 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList12 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList13 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList14 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList15 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList16 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList17 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList18 = payment1.getPaymentRecords();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean21 = payment1.payOnline(0, "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"InvoiceStorage.getInvoice(int)\" because \"this.invoiceStorage\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(paymentRecordList2);
        org.junit.Assert.assertNotNull(paymentRecordList3);
        org.junit.Assert.assertNotNull(paymentRecordList4);
        org.junit.Assert.assertNotNull(paymentRecordList5);
        org.junit.Assert.assertNotNull(paymentRecordList6);
        org.junit.Assert.assertNotNull(paymentRecordList7);
        org.junit.Assert.assertNotNull(paymentRecordList8);
        org.junit.Assert.assertNotNull(paymentRecordList9);
        org.junit.Assert.assertNotNull(paymentRecordList10);
        org.junit.Assert.assertNotNull(paymentRecordList11);
        org.junit.Assert.assertNotNull(paymentRecordList12);
        org.junit.Assert.assertNotNull(paymentRecordList13);
        org.junit.Assert.assertNotNull(paymentRecordList14);
        org.junit.Assert.assertNotNull(paymentRecordList15);
        org.junit.Assert.assertNotNull(paymentRecordList16);
        org.junit.Assert.assertNotNull(paymentRecordList17);
        org.junit.Assert.assertNotNull(paymentRecordList18);
    }

    @Test
    public void test0390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PaymentTest0.test0390");
        InvoiceStorage invoiceStorage0 = null;
        Payment payment1 = new Payment(invoiceStorage0);
        java.util.List<PaymentRecord> paymentRecordList2 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList3 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList4 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList5 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList6 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList7 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList8 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList9 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList10 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList11 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList12 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList13 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList14 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList15 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList16 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList17 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList18 = payment1.getPaymentRecords();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean20 = payment1.payByCash((int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"InvoiceStorage.getInvoice(int)\" because \"this.invoiceStorage\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(paymentRecordList2);
        org.junit.Assert.assertNotNull(paymentRecordList3);
        org.junit.Assert.assertNotNull(paymentRecordList4);
        org.junit.Assert.assertNotNull(paymentRecordList5);
        org.junit.Assert.assertNotNull(paymentRecordList6);
        org.junit.Assert.assertNotNull(paymentRecordList7);
        org.junit.Assert.assertNotNull(paymentRecordList8);
        org.junit.Assert.assertNotNull(paymentRecordList9);
        org.junit.Assert.assertNotNull(paymentRecordList10);
        org.junit.Assert.assertNotNull(paymentRecordList11);
        org.junit.Assert.assertNotNull(paymentRecordList12);
        org.junit.Assert.assertNotNull(paymentRecordList13);
        org.junit.Assert.assertNotNull(paymentRecordList14);
        org.junit.Assert.assertNotNull(paymentRecordList15);
        org.junit.Assert.assertNotNull(paymentRecordList16);
        org.junit.Assert.assertNotNull(paymentRecordList17);
        org.junit.Assert.assertNotNull(paymentRecordList18);
    }

    @Test
    public void test0391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PaymentTest0.test0391");
        InvoiceStorage invoiceStorage0 = null;
        Payment payment1 = new Payment(invoiceStorage0);
        java.util.List<PaymentRecord> paymentRecordList2 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList3 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList4 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList5 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList6 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList7 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList8 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList9 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList10 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList11 = payment1.getPaymentRecords();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean16 = payment1.payByCard(0, "", "hi!", "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"InvoiceStorage.getInvoice(int)\" because \"this.invoiceStorage\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(paymentRecordList2);
        org.junit.Assert.assertNotNull(paymentRecordList3);
        org.junit.Assert.assertNotNull(paymentRecordList4);
        org.junit.Assert.assertNotNull(paymentRecordList5);
        org.junit.Assert.assertNotNull(paymentRecordList6);
        org.junit.Assert.assertNotNull(paymentRecordList7);
        org.junit.Assert.assertNotNull(paymentRecordList8);
        org.junit.Assert.assertNotNull(paymentRecordList9);
        org.junit.Assert.assertNotNull(paymentRecordList10);
        org.junit.Assert.assertNotNull(paymentRecordList11);
    }

    @Test
    public void test0392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PaymentTest0.test0392");
        InvoiceStorage invoiceStorage0 = null;
        Payment payment1 = new Payment(invoiceStorage0);
        java.util.List<PaymentRecord> paymentRecordList2 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList3 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList4 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList5 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList6 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList7 = payment1.getPaymentRecords();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean9 = payment1.payByCash(1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"InvoiceStorage.getInvoice(int)\" because \"this.invoiceStorage\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(paymentRecordList2);
        org.junit.Assert.assertNotNull(paymentRecordList3);
        org.junit.Assert.assertNotNull(paymentRecordList4);
        org.junit.Assert.assertNotNull(paymentRecordList5);
        org.junit.Assert.assertNotNull(paymentRecordList6);
        org.junit.Assert.assertNotNull(paymentRecordList7);
    }

    @Test
    public void test0393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PaymentTest0.test0393");
        InvoiceStorage invoiceStorage0 = null;
        Payment payment1 = new Payment(invoiceStorage0);
        java.util.List<PaymentRecord> paymentRecordList2 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList3 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList4 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList5 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList6 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList7 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList8 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList9 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList10 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList11 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList12 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList13 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList14 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList15 = payment1.getPaymentRecords();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean18 = payment1.payOnline((int) (byte) 0, "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"InvoiceStorage.getInvoice(int)\" because \"this.invoiceStorage\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(paymentRecordList2);
        org.junit.Assert.assertNotNull(paymentRecordList3);
        org.junit.Assert.assertNotNull(paymentRecordList4);
        org.junit.Assert.assertNotNull(paymentRecordList5);
        org.junit.Assert.assertNotNull(paymentRecordList6);
        org.junit.Assert.assertNotNull(paymentRecordList7);
        org.junit.Assert.assertNotNull(paymentRecordList8);
        org.junit.Assert.assertNotNull(paymentRecordList9);
        org.junit.Assert.assertNotNull(paymentRecordList10);
        org.junit.Assert.assertNotNull(paymentRecordList11);
        org.junit.Assert.assertNotNull(paymentRecordList12);
        org.junit.Assert.assertNotNull(paymentRecordList13);
        org.junit.Assert.assertNotNull(paymentRecordList14);
        org.junit.Assert.assertNotNull(paymentRecordList15);
    }

    @Test
    public void test0394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PaymentTest0.test0394");
        InvoiceStorage invoiceStorage0 = null;
        Payment payment1 = new Payment(invoiceStorage0);
        java.util.List<PaymentRecord> paymentRecordList2 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList3 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList4 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList5 = payment1.getPaymentRecords();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean8 = payment1.payOnline((int) (byte) 10, "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"InvoiceStorage.getInvoice(int)\" because \"this.invoiceStorage\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(paymentRecordList2);
        org.junit.Assert.assertNotNull(paymentRecordList3);
        org.junit.Assert.assertNotNull(paymentRecordList4);
        org.junit.Assert.assertNotNull(paymentRecordList5);
    }

    @Test
    public void test0395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PaymentTest0.test0395");
        InvoiceStorage invoiceStorage0 = null;
        Payment payment1 = new Payment(invoiceStorage0);
        java.util.List<PaymentRecord> paymentRecordList2 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList3 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList4 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList5 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList6 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList7 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList8 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList9 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList10 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList11 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList12 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList13 = payment1.getPaymentRecords();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean18 = payment1.payByCard((int) (short) 1, "hi!", "hi!", "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"InvoiceStorage.getInvoice(int)\" because \"this.invoiceStorage\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(paymentRecordList2);
        org.junit.Assert.assertNotNull(paymentRecordList3);
        org.junit.Assert.assertNotNull(paymentRecordList4);
        org.junit.Assert.assertNotNull(paymentRecordList5);
        org.junit.Assert.assertNotNull(paymentRecordList6);
        org.junit.Assert.assertNotNull(paymentRecordList7);
        org.junit.Assert.assertNotNull(paymentRecordList8);
        org.junit.Assert.assertNotNull(paymentRecordList9);
        org.junit.Assert.assertNotNull(paymentRecordList10);
        org.junit.Assert.assertNotNull(paymentRecordList11);
        org.junit.Assert.assertNotNull(paymentRecordList12);
        org.junit.Assert.assertNotNull(paymentRecordList13);
    }

    @Test
    public void test0396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PaymentTest0.test0396");
        InvoiceStorage invoiceStorage0 = null;
        Payment payment1 = new Payment(invoiceStorage0);
        java.util.List<PaymentRecord> paymentRecordList2 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList3 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList4 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList5 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList6 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList7 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList8 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList9 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList10 = payment1.getPaymentRecords();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean12 = payment1.payByCash((int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"InvoiceStorage.getInvoice(int)\" because \"this.invoiceStorage\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(paymentRecordList2);
        org.junit.Assert.assertNotNull(paymentRecordList3);
        org.junit.Assert.assertNotNull(paymentRecordList4);
        org.junit.Assert.assertNotNull(paymentRecordList5);
        org.junit.Assert.assertNotNull(paymentRecordList6);
        org.junit.Assert.assertNotNull(paymentRecordList7);
        org.junit.Assert.assertNotNull(paymentRecordList8);
        org.junit.Assert.assertNotNull(paymentRecordList9);
        org.junit.Assert.assertNotNull(paymentRecordList10);
    }

    @Test
    public void test0397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PaymentTest0.test0397");
        InvoiceStorage invoiceStorage0 = null;
        Payment payment1 = new Payment(invoiceStorage0);
        java.util.List<PaymentRecord> paymentRecordList2 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList3 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList4 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList5 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList6 = payment1.getPaymentRecords();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean11 = payment1.payByCard((-1), "hi!", "", "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"InvoiceStorage.getInvoice(int)\" because \"this.invoiceStorage\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(paymentRecordList2);
        org.junit.Assert.assertNotNull(paymentRecordList3);
        org.junit.Assert.assertNotNull(paymentRecordList4);
        org.junit.Assert.assertNotNull(paymentRecordList5);
        org.junit.Assert.assertNotNull(paymentRecordList6);
    }

    @Test
    public void test0398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PaymentTest0.test0398");
        InvoiceStorage invoiceStorage0 = null;
        Payment payment1 = new Payment(invoiceStorage0);
        java.util.List<PaymentRecord> paymentRecordList2 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList3 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList4 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList5 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList6 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList7 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList8 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList9 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList10 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList11 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList12 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList13 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList14 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList15 = payment1.getPaymentRecords();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean18 = payment1.payOnline(0, "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"InvoiceStorage.getInvoice(int)\" because \"this.invoiceStorage\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(paymentRecordList2);
        org.junit.Assert.assertNotNull(paymentRecordList3);
        org.junit.Assert.assertNotNull(paymentRecordList4);
        org.junit.Assert.assertNotNull(paymentRecordList5);
        org.junit.Assert.assertNotNull(paymentRecordList6);
        org.junit.Assert.assertNotNull(paymentRecordList7);
        org.junit.Assert.assertNotNull(paymentRecordList8);
        org.junit.Assert.assertNotNull(paymentRecordList9);
        org.junit.Assert.assertNotNull(paymentRecordList10);
        org.junit.Assert.assertNotNull(paymentRecordList11);
        org.junit.Assert.assertNotNull(paymentRecordList12);
        org.junit.Assert.assertNotNull(paymentRecordList13);
        org.junit.Assert.assertNotNull(paymentRecordList14);
        org.junit.Assert.assertNotNull(paymentRecordList15);
    }

    @Test
    public void test0399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PaymentTest0.test0399");
        InvoiceStorage invoiceStorage0 = null;
        Payment payment1 = new Payment(invoiceStorage0);
        java.util.List<PaymentRecord> paymentRecordList2 = payment1.getPaymentRecords();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean5 = payment1.payOnline(10, "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"InvoiceStorage.getInvoice(int)\" because \"this.invoiceStorage\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(paymentRecordList2);
    }

    @Test
    public void test0400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PaymentTest0.test0400");
        InvoiceStorage invoiceStorage0 = null;
        Payment payment1 = new Payment(invoiceStorage0);
        java.util.List<PaymentRecord> paymentRecordList2 = payment1.getPaymentRecords();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean4 = payment1.payByCash((int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"InvoiceStorage.getInvoice(int)\" because \"this.invoiceStorage\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(paymentRecordList2);
    }

    @Test
    public void test0401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PaymentTest0.test0401");
        InvoiceStorage invoiceStorage0 = null;
        Payment payment1 = new Payment(invoiceStorage0);
        java.util.List<PaymentRecord> paymentRecordList2 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList3 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList4 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList5 = payment1.getPaymentRecords();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean10 = payment1.payByCard((int) '#', "hi!", "", "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"InvoiceStorage.getInvoice(int)\" because \"this.invoiceStorage\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(paymentRecordList2);
        org.junit.Assert.assertNotNull(paymentRecordList3);
        org.junit.Assert.assertNotNull(paymentRecordList4);
        org.junit.Assert.assertNotNull(paymentRecordList5);
    }

    @Test
    public void test0402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PaymentTest0.test0402");
        InvoiceStorage invoiceStorage0 = null;
        Payment payment1 = new Payment(invoiceStorage0);
        java.util.List<PaymentRecord> paymentRecordList2 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList3 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList4 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList5 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList6 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList7 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList8 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList9 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList10 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList11 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList12 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList13 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList14 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList15 = payment1.getPaymentRecords();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean18 = payment1.payOnline((int) (byte) 100, "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"InvoiceStorage.getInvoice(int)\" because \"this.invoiceStorage\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(paymentRecordList2);
        org.junit.Assert.assertNotNull(paymentRecordList3);
        org.junit.Assert.assertNotNull(paymentRecordList4);
        org.junit.Assert.assertNotNull(paymentRecordList5);
        org.junit.Assert.assertNotNull(paymentRecordList6);
        org.junit.Assert.assertNotNull(paymentRecordList7);
        org.junit.Assert.assertNotNull(paymentRecordList8);
        org.junit.Assert.assertNotNull(paymentRecordList9);
        org.junit.Assert.assertNotNull(paymentRecordList10);
        org.junit.Assert.assertNotNull(paymentRecordList11);
        org.junit.Assert.assertNotNull(paymentRecordList12);
        org.junit.Assert.assertNotNull(paymentRecordList13);
        org.junit.Assert.assertNotNull(paymentRecordList14);
        org.junit.Assert.assertNotNull(paymentRecordList15);
    }

    @Test
    public void test0403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PaymentTest0.test0403");
        InvoiceStorage invoiceStorage0 = null;
        Payment payment1 = new Payment(invoiceStorage0);
        java.util.List<PaymentRecord> paymentRecordList2 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList3 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList4 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList5 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList6 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList7 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList8 = payment1.getPaymentRecords();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean10 = payment1.payByCash((int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"InvoiceStorage.getInvoice(int)\" because \"this.invoiceStorage\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(paymentRecordList2);
        org.junit.Assert.assertNotNull(paymentRecordList3);
        org.junit.Assert.assertNotNull(paymentRecordList4);
        org.junit.Assert.assertNotNull(paymentRecordList5);
        org.junit.Assert.assertNotNull(paymentRecordList6);
        org.junit.Assert.assertNotNull(paymentRecordList7);
        org.junit.Assert.assertNotNull(paymentRecordList8);
    }

    @Test
    public void test0404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PaymentTest0.test0404");
        InvoiceStorage invoiceStorage0 = null;
        Payment payment1 = new Payment(invoiceStorage0);
        java.util.List<PaymentRecord> paymentRecordList2 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList3 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList4 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList5 = payment1.getPaymentRecords();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean8 = payment1.payOnline(100, "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"InvoiceStorage.getInvoice(int)\" because \"this.invoiceStorage\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(paymentRecordList2);
        org.junit.Assert.assertNotNull(paymentRecordList3);
        org.junit.Assert.assertNotNull(paymentRecordList4);
        org.junit.Assert.assertNotNull(paymentRecordList5);
    }

    @Test
    public void test0405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PaymentTest0.test0405");
        InvoiceStorage invoiceStorage0 = null;
        Payment payment1 = new Payment(invoiceStorage0);
        java.util.List<PaymentRecord> paymentRecordList2 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList3 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList4 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList5 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList6 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList7 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList8 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList9 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList10 = payment1.getPaymentRecords();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean13 = payment1.payOnline((int) '#', "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"InvoiceStorage.getInvoice(int)\" because \"this.invoiceStorage\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(paymentRecordList2);
        org.junit.Assert.assertNotNull(paymentRecordList3);
        org.junit.Assert.assertNotNull(paymentRecordList4);
        org.junit.Assert.assertNotNull(paymentRecordList5);
        org.junit.Assert.assertNotNull(paymentRecordList6);
        org.junit.Assert.assertNotNull(paymentRecordList7);
        org.junit.Assert.assertNotNull(paymentRecordList8);
        org.junit.Assert.assertNotNull(paymentRecordList9);
        org.junit.Assert.assertNotNull(paymentRecordList10);
    }

    @Test
    public void test0406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PaymentTest0.test0406");
        InvoiceStorage invoiceStorage0 = null;
        Payment payment1 = new Payment(invoiceStorage0);
        java.util.List<PaymentRecord> paymentRecordList2 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList3 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList4 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList5 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList6 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList7 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList8 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList9 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList10 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList11 = payment1.getPaymentRecords();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean16 = payment1.payByCard((int) 'a', "", "", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"InvoiceStorage.getInvoice(int)\" because \"this.invoiceStorage\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(paymentRecordList2);
        org.junit.Assert.assertNotNull(paymentRecordList3);
        org.junit.Assert.assertNotNull(paymentRecordList4);
        org.junit.Assert.assertNotNull(paymentRecordList5);
        org.junit.Assert.assertNotNull(paymentRecordList6);
        org.junit.Assert.assertNotNull(paymentRecordList7);
        org.junit.Assert.assertNotNull(paymentRecordList8);
        org.junit.Assert.assertNotNull(paymentRecordList9);
        org.junit.Assert.assertNotNull(paymentRecordList10);
        org.junit.Assert.assertNotNull(paymentRecordList11);
    }

    @Test
    public void test0407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PaymentTest0.test0407");
        InvoiceStorage invoiceStorage0 = null;
        Payment payment1 = new Payment(invoiceStorage0);
        java.util.List<PaymentRecord> paymentRecordList2 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList3 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList4 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList5 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList6 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList7 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList8 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList9 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList10 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList11 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList12 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList13 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList14 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList15 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList16 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList17 = payment1.getPaymentRecords();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean20 = payment1.payOnline(1, "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"InvoiceStorage.getInvoice(int)\" because \"this.invoiceStorage\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(paymentRecordList2);
        org.junit.Assert.assertNotNull(paymentRecordList3);
        org.junit.Assert.assertNotNull(paymentRecordList4);
        org.junit.Assert.assertNotNull(paymentRecordList5);
        org.junit.Assert.assertNotNull(paymentRecordList6);
        org.junit.Assert.assertNotNull(paymentRecordList7);
        org.junit.Assert.assertNotNull(paymentRecordList8);
        org.junit.Assert.assertNotNull(paymentRecordList9);
        org.junit.Assert.assertNotNull(paymentRecordList10);
        org.junit.Assert.assertNotNull(paymentRecordList11);
        org.junit.Assert.assertNotNull(paymentRecordList12);
        org.junit.Assert.assertNotNull(paymentRecordList13);
        org.junit.Assert.assertNotNull(paymentRecordList14);
        org.junit.Assert.assertNotNull(paymentRecordList15);
        org.junit.Assert.assertNotNull(paymentRecordList16);
        org.junit.Assert.assertNotNull(paymentRecordList17);
    }

    @Test
    public void test0408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PaymentTest0.test0408");
        InvoiceStorage invoiceStorage0 = null;
        Payment payment1 = new Payment(invoiceStorage0);
        java.util.List<PaymentRecord> paymentRecordList2 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList3 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList4 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList5 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList6 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList7 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList8 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList9 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList10 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList11 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList12 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList13 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList14 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList15 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList16 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList17 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList18 = payment1.getPaymentRecords();
        java.lang.Class<?> wildcardClass19 = paymentRecordList18.getClass();
        org.junit.Assert.assertNotNull(paymentRecordList2);
        org.junit.Assert.assertNotNull(paymentRecordList3);
        org.junit.Assert.assertNotNull(paymentRecordList4);
        org.junit.Assert.assertNotNull(paymentRecordList5);
        org.junit.Assert.assertNotNull(paymentRecordList6);
        org.junit.Assert.assertNotNull(paymentRecordList7);
        org.junit.Assert.assertNotNull(paymentRecordList8);
        org.junit.Assert.assertNotNull(paymentRecordList9);
        org.junit.Assert.assertNotNull(paymentRecordList10);
        org.junit.Assert.assertNotNull(paymentRecordList11);
        org.junit.Assert.assertNotNull(paymentRecordList12);
        org.junit.Assert.assertNotNull(paymentRecordList13);
        org.junit.Assert.assertNotNull(paymentRecordList14);
        org.junit.Assert.assertNotNull(paymentRecordList15);
        org.junit.Assert.assertNotNull(paymentRecordList16);
        org.junit.Assert.assertNotNull(paymentRecordList17);
        org.junit.Assert.assertNotNull(paymentRecordList18);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test0409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PaymentTest0.test0409");
        InvoiceStorage invoiceStorage0 = null;
        Payment payment1 = new Payment(invoiceStorage0);
        java.util.List<PaymentRecord> paymentRecordList2 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList3 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList4 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList5 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList6 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList7 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList8 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList9 = payment1.getPaymentRecords();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean11 = payment1.payByCash((int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"InvoiceStorage.getInvoice(int)\" because \"this.invoiceStorage\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(paymentRecordList2);
        org.junit.Assert.assertNotNull(paymentRecordList3);
        org.junit.Assert.assertNotNull(paymentRecordList4);
        org.junit.Assert.assertNotNull(paymentRecordList5);
        org.junit.Assert.assertNotNull(paymentRecordList6);
        org.junit.Assert.assertNotNull(paymentRecordList7);
        org.junit.Assert.assertNotNull(paymentRecordList8);
        org.junit.Assert.assertNotNull(paymentRecordList9);
    }

    @Test
    public void test0410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PaymentTest0.test0410");
        InvoiceStorage invoiceStorage0 = null;
        Payment payment1 = new Payment(invoiceStorage0);
        java.util.List<PaymentRecord> paymentRecordList2 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList3 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList4 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList5 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList6 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList7 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList8 = payment1.getPaymentRecords();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean10 = payment1.payByCash((int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"InvoiceStorage.getInvoice(int)\" because \"this.invoiceStorage\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(paymentRecordList2);
        org.junit.Assert.assertNotNull(paymentRecordList3);
        org.junit.Assert.assertNotNull(paymentRecordList4);
        org.junit.Assert.assertNotNull(paymentRecordList5);
        org.junit.Assert.assertNotNull(paymentRecordList6);
        org.junit.Assert.assertNotNull(paymentRecordList7);
        org.junit.Assert.assertNotNull(paymentRecordList8);
    }

    @Test
    public void test0411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PaymentTest0.test0411");
        InvoiceStorage invoiceStorage0 = null;
        Payment payment1 = new Payment(invoiceStorage0);
        java.util.List<PaymentRecord> paymentRecordList2 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList3 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList4 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList5 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList6 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList7 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList8 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList9 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList10 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList11 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList12 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList13 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList14 = payment1.getPaymentRecords();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean19 = payment1.payByCard((int) (byte) 1, "", "", "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"InvoiceStorage.getInvoice(int)\" because \"this.invoiceStorage\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(paymentRecordList2);
        org.junit.Assert.assertNotNull(paymentRecordList3);
        org.junit.Assert.assertNotNull(paymentRecordList4);
        org.junit.Assert.assertNotNull(paymentRecordList5);
        org.junit.Assert.assertNotNull(paymentRecordList6);
        org.junit.Assert.assertNotNull(paymentRecordList7);
        org.junit.Assert.assertNotNull(paymentRecordList8);
        org.junit.Assert.assertNotNull(paymentRecordList9);
        org.junit.Assert.assertNotNull(paymentRecordList10);
        org.junit.Assert.assertNotNull(paymentRecordList11);
        org.junit.Assert.assertNotNull(paymentRecordList12);
        org.junit.Assert.assertNotNull(paymentRecordList13);
        org.junit.Assert.assertNotNull(paymentRecordList14);
    }

    @Test
    public void test0412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PaymentTest0.test0412");
        InvoiceStorage invoiceStorage0 = null;
        Payment payment1 = new Payment(invoiceStorage0);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean4 = payment1.payOnline((int) (byte) 100, "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"InvoiceStorage.getInvoice(int)\" because \"this.invoiceStorage\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PaymentTest0.test0413");
        InvoiceStorage invoiceStorage0 = null;
        Payment payment1 = new Payment(invoiceStorage0);
        java.util.List<PaymentRecord> paymentRecordList2 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList3 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList4 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList5 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList6 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList7 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList8 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList9 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList10 = payment1.getPaymentRecords();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean12 = payment1.payByCash((int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"InvoiceStorage.getInvoice(int)\" because \"this.invoiceStorage\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(paymentRecordList2);
        org.junit.Assert.assertNotNull(paymentRecordList3);
        org.junit.Assert.assertNotNull(paymentRecordList4);
        org.junit.Assert.assertNotNull(paymentRecordList5);
        org.junit.Assert.assertNotNull(paymentRecordList6);
        org.junit.Assert.assertNotNull(paymentRecordList7);
        org.junit.Assert.assertNotNull(paymentRecordList8);
        org.junit.Assert.assertNotNull(paymentRecordList9);
        org.junit.Assert.assertNotNull(paymentRecordList10);
    }

    @Test
    public void test0414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PaymentTest0.test0414");
        InvoiceStorage invoiceStorage0 = null;
        Payment payment1 = new Payment(invoiceStorage0);
        java.util.List<PaymentRecord> paymentRecordList2 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList3 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList4 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList5 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList6 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList7 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList8 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList9 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList10 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList11 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList12 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList13 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList14 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList15 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList16 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList17 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList18 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList19 = payment1.getPaymentRecords();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean24 = payment1.payByCard(100, "", "hi!", "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"InvoiceStorage.getInvoice(int)\" because \"this.invoiceStorage\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(paymentRecordList2);
        org.junit.Assert.assertNotNull(paymentRecordList3);
        org.junit.Assert.assertNotNull(paymentRecordList4);
        org.junit.Assert.assertNotNull(paymentRecordList5);
        org.junit.Assert.assertNotNull(paymentRecordList6);
        org.junit.Assert.assertNotNull(paymentRecordList7);
        org.junit.Assert.assertNotNull(paymentRecordList8);
        org.junit.Assert.assertNotNull(paymentRecordList9);
        org.junit.Assert.assertNotNull(paymentRecordList10);
        org.junit.Assert.assertNotNull(paymentRecordList11);
        org.junit.Assert.assertNotNull(paymentRecordList12);
        org.junit.Assert.assertNotNull(paymentRecordList13);
        org.junit.Assert.assertNotNull(paymentRecordList14);
        org.junit.Assert.assertNotNull(paymentRecordList15);
        org.junit.Assert.assertNotNull(paymentRecordList16);
        org.junit.Assert.assertNotNull(paymentRecordList17);
        org.junit.Assert.assertNotNull(paymentRecordList18);
        org.junit.Assert.assertNotNull(paymentRecordList19);
    }

    @Test
    public void test0415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PaymentTest0.test0415");
        InvoiceStorage invoiceStorage0 = null;
        Payment payment1 = new Payment(invoiceStorage0);
        java.util.List<PaymentRecord> paymentRecordList2 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList3 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList4 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList5 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList6 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList7 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList8 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList9 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList10 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList11 = payment1.getPaymentRecords();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean14 = payment1.payOnline(1, "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"InvoiceStorage.getInvoice(int)\" because \"this.invoiceStorage\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(paymentRecordList2);
        org.junit.Assert.assertNotNull(paymentRecordList3);
        org.junit.Assert.assertNotNull(paymentRecordList4);
        org.junit.Assert.assertNotNull(paymentRecordList5);
        org.junit.Assert.assertNotNull(paymentRecordList6);
        org.junit.Assert.assertNotNull(paymentRecordList7);
        org.junit.Assert.assertNotNull(paymentRecordList8);
        org.junit.Assert.assertNotNull(paymentRecordList9);
        org.junit.Assert.assertNotNull(paymentRecordList10);
        org.junit.Assert.assertNotNull(paymentRecordList11);
    }

    @Test
    public void test0416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PaymentTest0.test0416");
        InvoiceStorage invoiceStorage0 = null;
        Payment payment1 = new Payment(invoiceStorage0);
        java.util.List<PaymentRecord> paymentRecordList2 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList3 = payment1.getPaymentRecords();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean8 = payment1.payByCard(0, "hi!", "hi!", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"InvoiceStorage.getInvoice(int)\" because \"this.invoiceStorage\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(paymentRecordList2);
        org.junit.Assert.assertNotNull(paymentRecordList3);
    }

    @Test
    public void test0417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PaymentTest0.test0417");
        InvoiceStorage invoiceStorage0 = null;
        Payment payment1 = new Payment(invoiceStorage0);
        java.util.List<PaymentRecord> paymentRecordList2 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList3 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList4 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList5 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList6 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList7 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList8 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList9 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList10 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList11 = payment1.getPaymentRecords();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean13 = payment1.payByCash((int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"InvoiceStorage.getInvoice(int)\" because \"this.invoiceStorage\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(paymentRecordList2);
        org.junit.Assert.assertNotNull(paymentRecordList3);
        org.junit.Assert.assertNotNull(paymentRecordList4);
        org.junit.Assert.assertNotNull(paymentRecordList5);
        org.junit.Assert.assertNotNull(paymentRecordList6);
        org.junit.Assert.assertNotNull(paymentRecordList7);
        org.junit.Assert.assertNotNull(paymentRecordList8);
        org.junit.Assert.assertNotNull(paymentRecordList9);
        org.junit.Assert.assertNotNull(paymentRecordList10);
        org.junit.Assert.assertNotNull(paymentRecordList11);
    }

    @Test
    public void test0418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PaymentTest0.test0418");
        InvoiceStorage invoiceStorage0 = null;
        Payment payment1 = new Payment(invoiceStorage0);
        java.util.List<PaymentRecord> paymentRecordList2 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList3 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList4 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList5 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList6 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList7 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList8 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList9 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList10 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList11 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList12 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList13 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList14 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList15 = payment1.getPaymentRecords();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean17 = payment1.payByCash((int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"InvoiceStorage.getInvoice(int)\" because \"this.invoiceStorage\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(paymentRecordList2);
        org.junit.Assert.assertNotNull(paymentRecordList3);
        org.junit.Assert.assertNotNull(paymentRecordList4);
        org.junit.Assert.assertNotNull(paymentRecordList5);
        org.junit.Assert.assertNotNull(paymentRecordList6);
        org.junit.Assert.assertNotNull(paymentRecordList7);
        org.junit.Assert.assertNotNull(paymentRecordList8);
        org.junit.Assert.assertNotNull(paymentRecordList9);
        org.junit.Assert.assertNotNull(paymentRecordList10);
        org.junit.Assert.assertNotNull(paymentRecordList11);
        org.junit.Assert.assertNotNull(paymentRecordList12);
        org.junit.Assert.assertNotNull(paymentRecordList13);
        org.junit.Assert.assertNotNull(paymentRecordList14);
        org.junit.Assert.assertNotNull(paymentRecordList15);
    }

    @Test
    public void test0419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PaymentTest0.test0419");
        InvoiceStorage invoiceStorage0 = null;
        Payment payment1 = new Payment(invoiceStorage0);
        java.util.List<PaymentRecord> paymentRecordList2 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList3 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList4 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList5 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList6 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList7 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList8 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList9 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList10 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList11 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList12 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList13 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList14 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList15 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList16 = payment1.getPaymentRecords();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean21 = payment1.payByCard(0, "", "", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"InvoiceStorage.getInvoice(int)\" because \"this.invoiceStorage\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(paymentRecordList2);
        org.junit.Assert.assertNotNull(paymentRecordList3);
        org.junit.Assert.assertNotNull(paymentRecordList4);
        org.junit.Assert.assertNotNull(paymentRecordList5);
        org.junit.Assert.assertNotNull(paymentRecordList6);
        org.junit.Assert.assertNotNull(paymentRecordList7);
        org.junit.Assert.assertNotNull(paymentRecordList8);
        org.junit.Assert.assertNotNull(paymentRecordList9);
        org.junit.Assert.assertNotNull(paymentRecordList10);
        org.junit.Assert.assertNotNull(paymentRecordList11);
        org.junit.Assert.assertNotNull(paymentRecordList12);
        org.junit.Assert.assertNotNull(paymentRecordList13);
        org.junit.Assert.assertNotNull(paymentRecordList14);
        org.junit.Assert.assertNotNull(paymentRecordList15);
        org.junit.Assert.assertNotNull(paymentRecordList16);
    }

    @Test
    public void test0420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PaymentTest0.test0420");
        InvoiceStorage invoiceStorage0 = null;
        Payment payment1 = new Payment(invoiceStorage0);
        java.util.List<PaymentRecord> paymentRecordList2 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList3 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList4 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList5 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList6 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList7 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList8 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList9 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList10 = payment1.getPaymentRecords();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean13 = payment1.payOnline((-1), "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"InvoiceStorage.getInvoice(int)\" because \"this.invoiceStorage\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(paymentRecordList2);
        org.junit.Assert.assertNotNull(paymentRecordList3);
        org.junit.Assert.assertNotNull(paymentRecordList4);
        org.junit.Assert.assertNotNull(paymentRecordList5);
        org.junit.Assert.assertNotNull(paymentRecordList6);
        org.junit.Assert.assertNotNull(paymentRecordList7);
        org.junit.Assert.assertNotNull(paymentRecordList8);
        org.junit.Assert.assertNotNull(paymentRecordList9);
        org.junit.Assert.assertNotNull(paymentRecordList10);
    }

    @Test
    public void test0421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PaymentTest0.test0421");
        InvoiceStorage invoiceStorage0 = null;
        Payment payment1 = new Payment(invoiceStorage0);
        java.util.List<PaymentRecord> paymentRecordList2 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList3 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList4 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList5 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList6 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList7 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList8 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList9 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList10 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList11 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList12 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList13 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList14 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList15 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList16 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList17 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList18 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList19 = payment1.getPaymentRecords();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean21 = payment1.payByCash((int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"InvoiceStorage.getInvoice(int)\" because \"this.invoiceStorage\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(paymentRecordList2);
        org.junit.Assert.assertNotNull(paymentRecordList3);
        org.junit.Assert.assertNotNull(paymentRecordList4);
        org.junit.Assert.assertNotNull(paymentRecordList5);
        org.junit.Assert.assertNotNull(paymentRecordList6);
        org.junit.Assert.assertNotNull(paymentRecordList7);
        org.junit.Assert.assertNotNull(paymentRecordList8);
        org.junit.Assert.assertNotNull(paymentRecordList9);
        org.junit.Assert.assertNotNull(paymentRecordList10);
        org.junit.Assert.assertNotNull(paymentRecordList11);
        org.junit.Assert.assertNotNull(paymentRecordList12);
        org.junit.Assert.assertNotNull(paymentRecordList13);
        org.junit.Assert.assertNotNull(paymentRecordList14);
        org.junit.Assert.assertNotNull(paymentRecordList15);
        org.junit.Assert.assertNotNull(paymentRecordList16);
        org.junit.Assert.assertNotNull(paymentRecordList17);
        org.junit.Assert.assertNotNull(paymentRecordList18);
        org.junit.Assert.assertNotNull(paymentRecordList19);
    }

    @Test
    public void test0422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PaymentTest0.test0422");
        InvoiceStorage invoiceStorage0 = null;
        Payment payment1 = new Payment(invoiceStorage0);
        java.util.List<PaymentRecord> paymentRecordList2 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList3 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList4 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList5 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList6 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList7 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList8 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList9 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList10 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList11 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList12 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList13 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList14 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList15 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList16 = payment1.getPaymentRecords();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean19 = payment1.payOnline((int) '#', "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"InvoiceStorage.getInvoice(int)\" because \"this.invoiceStorage\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(paymentRecordList2);
        org.junit.Assert.assertNotNull(paymentRecordList3);
        org.junit.Assert.assertNotNull(paymentRecordList4);
        org.junit.Assert.assertNotNull(paymentRecordList5);
        org.junit.Assert.assertNotNull(paymentRecordList6);
        org.junit.Assert.assertNotNull(paymentRecordList7);
        org.junit.Assert.assertNotNull(paymentRecordList8);
        org.junit.Assert.assertNotNull(paymentRecordList9);
        org.junit.Assert.assertNotNull(paymentRecordList10);
        org.junit.Assert.assertNotNull(paymentRecordList11);
        org.junit.Assert.assertNotNull(paymentRecordList12);
        org.junit.Assert.assertNotNull(paymentRecordList13);
        org.junit.Assert.assertNotNull(paymentRecordList14);
        org.junit.Assert.assertNotNull(paymentRecordList15);
        org.junit.Assert.assertNotNull(paymentRecordList16);
    }

    @Test
    public void test0423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PaymentTest0.test0423");
        InvoiceStorage invoiceStorage0 = null;
        Payment payment1 = new Payment(invoiceStorage0);
        java.util.List<PaymentRecord> paymentRecordList2 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList3 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList4 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList5 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList6 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList7 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList8 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList9 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList10 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList11 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList12 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList13 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList14 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList15 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList16 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList17 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList18 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList19 = payment1.getPaymentRecords();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean22 = payment1.payOnline((int) (short) 0, "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"InvoiceStorage.getInvoice(int)\" because \"this.invoiceStorage\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(paymentRecordList2);
        org.junit.Assert.assertNotNull(paymentRecordList3);
        org.junit.Assert.assertNotNull(paymentRecordList4);
        org.junit.Assert.assertNotNull(paymentRecordList5);
        org.junit.Assert.assertNotNull(paymentRecordList6);
        org.junit.Assert.assertNotNull(paymentRecordList7);
        org.junit.Assert.assertNotNull(paymentRecordList8);
        org.junit.Assert.assertNotNull(paymentRecordList9);
        org.junit.Assert.assertNotNull(paymentRecordList10);
        org.junit.Assert.assertNotNull(paymentRecordList11);
        org.junit.Assert.assertNotNull(paymentRecordList12);
        org.junit.Assert.assertNotNull(paymentRecordList13);
        org.junit.Assert.assertNotNull(paymentRecordList14);
        org.junit.Assert.assertNotNull(paymentRecordList15);
        org.junit.Assert.assertNotNull(paymentRecordList16);
        org.junit.Assert.assertNotNull(paymentRecordList17);
        org.junit.Assert.assertNotNull(paymentRecordList18);
        org.junit.Assert.assertNotNull(paymentRecordList19);
    }

    @Test
    public void test0424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PaymentTest0.test0424");
        InvoiceStorage invoiceStorage0 = null;
        Payment payment1 = new Payment(invoiceStorage0);
        java.util.List<PaymentRecord> paymentRecordList2 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList3 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList4 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList5 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList6 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList7 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList8 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList9 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList10 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList11 = payment1.getPaymentRecords();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean16 = payment1.payByCard((int) (byte) 10, "", "hi!", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"InvoiceStorage.getInvoice(int)\" because \"this.invoiceStorage\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(paymentRecordList2);
        org.junit.Assert.assertNotNull(paymentRecordList3);
        org.junit.Assert.assertNotNull(paymentRecordList4);
        org.junit.Assert.assertNotNull(paymentRecordList5);
        org.junit.Assert.assertNotNull(paymentRecordList6);
        org.junit.Assert.assertNotNull(paymentRecordList7);
        org.junit.Assert.assertNotNull(paymentRecordList8);
        org.junit.Assert.assertNotNull(paymentRecordList9);
        org.junit.Assert.assertNotNull(paymentRecordList10);
        org.junit.Assert.assertNotNull(paymentRecordList11);
    }

    @Test
    public void test0425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PaymentTest0.test0425");
        InvoiceStorage invoiceStorage0 = null;
        Payment payment1 = new Payment(invoiceStorage0);
        java.util.List<PaymentRecord> paymentRecordList2 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList3 = payment1.getPaymentRecords();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean6 = payment1.payOnline((int) (byte) -1, "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"InvoiceStorage.getInvoice(int)\" because \"this.invoiceStorage\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(paymentRecordList2);
        org.junit.Assert.assertNotNull(paymentRecordList3);
    }

    @Test
    public void test0426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PaymentTest0.test0426");
        InvoiceStorage invoiceStorage0 = null;
        Payment payment1 = new Payment(invoiceStorage0);
        java.util.List<PaymentRecord> paymentRecordList2 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList3 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList4 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList5 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList6 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList7 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList8 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList9 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList10 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList11 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList12 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList13 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList14 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList15 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList16 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList17 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList18 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList19 = payment1.getPaymentRecords();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean21 = payment1.payByCash((int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"InvoiceStorage.getInvoice(int)\" because \"this.invoiceStorage\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(paymentRecordList2);
        org.junit.Assert.assertNotNull(paymentRecordList3);
        org.junit.Assert.assertNotNull(paymentRecordList4);
        org.junit.Assert.assertNotNull(paymentRecordList5);
        org.junit.Assert.assertNotNull(paymentRecordList6);
        org.junit.Assert.assertNotNull(paymentRecordList7);
        org.junit.Assert.assertNotNull(paymentRecordList8);
        org.junit.Assert.assertNotNull(paymentRecordList9);
        org.junit.Assert.assertNotNull(paymentRecordList10);
        org.junit.Assert.assertNotNull(paymentRecordList11);
        org.junit.Assert.assertNotNull(paymentRecordList12);
        org.junit.Assert.assertNotNull(paymentRecordList13);
        org.junit.Assert.assertNotNull(paymentRecordList14);
        org.junit.Assert.assertNotNull(paymentRecordList15);
        org.junit.Assert.assertNotNull(paymentRecordList16);
        org.junit.Assert.assertNotNull(paymentRecordList17);
        org.junit.Assert.assertNotNull(paymentRecordList18);
        org.junit.Assert.assertNotNull(paymentRecordList19);
    }

    @Test
    public void test0427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PaymentTest0.test0427");
        InvoiceStorage invoiceStorage0 = null;
        Payment payment1 = new Payment(invoiceStorage0);
        java.util.List<PaymentRecord> paymentRecordList2 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList3 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList4 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList5 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList6 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList7 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList8 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList9 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList10 = payment1.getPaymentRecords();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean15 = payment1.payByCard((int) (short) 1, "", "", "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"InvoiceStorage.getInvoice(int)\" because \"this.invoiceStorage\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(paymentRecordList2);
        org.junit.Assert.assertNotNull(paymentRecordList3);
        org.junit.Assert.assertNotNull(paymentRecordList4);
        org.junit.Assert.assertNotNull(paymentRecordList5);
        org.junit.Assert.assertNotNull(paymentRecordList6);
        org.junit.Assert.assertNotNull(paymentRecordList7);
        org.junit.Assert.assertNotNull(paymentRecordList8);
        org.junit.Assert.assertNotNull(paymentRecordList9);
        org.junit.Assert.assertNotNull(paymentRecordList10);
    }

    @Test
    public void test0428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PaymentTest0.test0428");
        InvoiceStorage invoiceStorage0 = null;
        Payment payment1 = new Payment(invoiceStorage0);
        java.util.List<PaymentRecord> paymentRecordList2 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList3 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList4 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList5 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList6 = payment1.getPaymentRecords();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean9 = payment1.payOnline((int) (byte) 1, "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"InvoiceStorage.getInvoice(int)\" because \"this.invoiceStorage\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(paymentRecordList2);
        org.junit.Assert.assertNotNull(paymentRecordList3);
        org.junit.Assert.assertNotNull(paymentRecordList4);
        org.junit.Assert.assertNotNull(paymentRecordList5);
        org.junit.Assert.assertNotNull(paymentRecordList6);
    }

    @Test
    public void test0429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PaymentTest0.test0429");
        InvoiceStorage invoiceStorage0 = null;
        Payment payment1 = new Payment(invoiceStorage0);
        java.util.List<PaymentRecord> paymentRecordList2 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList3 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList4 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList5 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList6 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList7 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList8 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList9 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList10 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList11 = payment1.getPaymentRecords();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean13 = payment1.payByCash(10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"InvoiceStorage.getInvoice(int)\" because \"this.invoiceStorage\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(paymentRecordList2);
        org.junit.Assert.assertNotNull(paymentRecordList3);
        org.junit.Assert.assertNotNull(paymentRecordList4);
        org.junit.Assert.assertNotNull(paymentRecordList5);
        org.junit.Assert.assertNotNull(paymentRecordList6);
        org.junit.Assert.assertNotNull(paymentRecordList7);
        org.junit.Assert.assertNotNull(paymentRecordList8);
        org.junit.Assert.assertNotNull(paymentRecordList9);
        org.junit.Assert.assertNotNull(paymentRecordList10);
        org.junit.Assert.assertNotNull(paymentRecordList11);
    }

    @Test
    public void test0430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PaymentTest0.test0430");
        InvoiceStorage invoiceStorage0 = null;
        Payment payment1 = new Payment(invoiceStorage0);
        java.util.List<PaymentRecord> paymentRecordList2 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList3 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList4 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList5 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList6 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList7 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList8 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList9 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList10 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList11 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList12 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList13 = payment1.getPaymentRecords();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean16 = payment1.payOnline((int) (byte) 1, "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"InvoiceStorage.getInvoice(int)\" because \"this.invoiceStorage\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(paymentRecordList2);
        org.junit.Assert.assertNotNull(paymentRecordList3);
        org.junit.Assert.assertNotNull(paymentRecordList4);
        org.junit.Assert.assertNotNull(paymentRecordList5);
        org.junit.Assert.assertNotNull(paymentRecordList6);
        org.junit.Assert.assertNotNull(paymentRecordList7);
        org.junit.Assert.assertNotNull(paymentRecordList8);
        org.junit.Assert.assertNotNull(paymentRecordList9);
        org.junit.Assert.assertNotNull(paymentRecordList10);
        org.junit.Assert.assertNotNull(paymentRecordList11);
        org.junit.Assert.assertNotNull(paymentRecordList12);
        org.junit.Assert.assertNotNull(paymentRecordList13);
    }

    @Test
    public void test0431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PaymentTest0.test0431");
        InvoiceStorage invoiceStorage0 = null;
        Payment payment1 = new Payment(invoiceStorage0);
        java.util.List<PaymentRecord> paymentRecordList2 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList3 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList4 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList5 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList6 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList7 = payment1.getPaymentRecords();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean10 = payment1.payOnline((int) (short) 100, "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"InvoiceStorage.getInvoice(int)\" because \"this.invoiceStorage\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(paymentRecordList2);
        org.junit.Assert.assertNotNull(paymentRecordList3);
        org.junit.Assert.assertNotNull(paymentRecordList4);
        org.junit.Assert.assertNotNull(paymentRecordList5);
        org.junit.Assert.assertNotNull(paymentRecordList6);
        org.junit.Assert.assertNotNull(paymentRecordList7);
    }

    @Test
    public void test0432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PaymentTest0.test0432");
        InvoiceStorage invoiceStorage0 = null;
        Payment payment1 = new Payment(invoiceStorage0);
        java.util.List<PaymentRecord> paymentRecordList2 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList3 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList4 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList5 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList6 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList7 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList8 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList9 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList10 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList11 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList12 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList13 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList14 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList15 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList16 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList17 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList18 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList19 = payment1.getPaymentRecords();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean24 = payment1.payByCard((int) (byte) 10, "", "", "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"InvoiceStorage.getInvoice(int)\" because \"this.invoiceStorage\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(paymentRecordList2);
        org.junit.Assert.assertNotNull(paymentRecordList3);
        org.junit.Assert.assertNotNull(paymentRecordList4);
        org.junit.Assert.assertNotNull(paymentRecordList5);
        org.junit.Assert.assertNotNull(paymentRecordList6);
        org.junit.Assert.assertNotNull(paymentRecordList7);
        org.junit.Assert.assertNotNull(paymentRecordList8);
        org.junit.Assert.assertNotNull(paymentRecordList9);
        org.junit.Assert.assertNotNull(paymentRecordList10);
        org.junit.Assert.assertNotNull(paymentRecordList11);
        org.junit.Assert.assertNotNull(paymentRecordList12);
        org.junit.Assert.assertNotNull(paymentRecordList13);
        org.junit.Assert.assertNotNull(paymentRecordList14);
        org.junit.Assert.assertNotNull(paymentRecordList15);
        org.junit.Assert.assertNotNull(paymentRecordList16);
        org.junit.Assert.assertNotNull(paymentRecordList17);
        org.junit.Assert.assertNotNull(paymentRecordList18);
        org.junit.Assert.assertNotNull(paymentRecordList19);
    }

    @Test
    public void test0433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PaymentTest0.test0433");
        InvoiceStorage invoiceStorage0 = null;
        Payment payment1 = new Payment(invoiceStorage0);
        java.util.List<PaymentRecord> paymentRecordList2 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList3 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList4 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList5 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList6 = payment1.getPaymentRecords();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean11 = payment1.payByCard(0, "hi!", "hi!", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"InvoiceStorage.getInvoice(int)\" because \"this.invoiceStorage\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(paymentRecordList2);
        org.junit.Assert.assertNotNull(paymentRecordList3);
        org.junit.Assert.assertNotNull(paymentRecordList4);
        org.junit.Assert.assertNotNull(paymentRecordList5);
        org.junit.Assert.assertNotNull(paymentRecordList6);
    }

    @Test
    public void test0434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PaymentTest0.test0434");
        InvoiceStorage invoiceStorage0 = null;
        Payment payment1 = new Payment(invoiceStorage0);
        java.util.List<PaymentRecord> paymentRecordList2 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList3 = payment1.getPaymentRecords();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean5 = payment1.payByCash((int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"InvoiceStorage.getInvoice(int)\" because \"this.invoiceStorage\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(paymentRecordList2);
        org.junit.Assert.assertNotNull(paymentRecordList3);
    }

    @Test
    public void test0435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PaymentTest0.test0435");
        InvoiceStorage invoiceStorage0 = null;
        Payment payment1 = new Payment(invoiceStorage0);
        java.util.List<PaymentRecord> paymentRecordList2 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList3 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList4 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList5 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList6 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList7 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList8 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList9 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList10 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList11 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList12 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList13 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList14 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList15 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList16 = payment1.getPaymentRecords();
        java.lang.Class<?> wildcardClass17 = paymentRecordList16.getClass();
        org.junit.Assert.assertNotNull(paymentRecordList2);
        org.junit.Assert.assertNotNull(paymentRecordList3);
        org.junit.Assert.assertNotNull(paymentRecordList4);
        org.junit.Assert.assertNotNull(paymentRecordList5);
        org.junit.Assert.assertNotNull(paymentRecordList6);
        org.junit.Assert.assertNotNull(paymentRecordList7);
        org.junit.Assert.assertNotNull(paymentRecordList8);
        org.junit.Assert.assertNotNull(paymentRecordList9);
        org.junit.Assert.assertNotNull(paymentRecordList10);
        org.junit.Assert.assertNotNull(paymentRecordList11);
        org.junit.Assert.assertNotNull(paymentRecordList12);
        org.junit.Assert.assertNotNull(paymentRecordList13);
        org.junit.Assert.assertNotNull(paymentRecordList14);
        org.junit.Assert.assertNotNull(paymentRecordList15);
        org.junit.Assert.assertNotNull(paymentRecordList16);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test0436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PaymentTest0.test0436");
        InvoiceStorage invoiceStorage0 = null;
        Payment payment1 = new Payment(invoiceStorage0);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean6 = payment1.payByCard((int) (short) 10, "hi!", "hi!", "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"InvoiceStorage.getInvoice(int)\" because \"this.invoiceStorage\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PaymentTest0.test0437");
        InvoiceStorage invoiceStorage0 = null;
        Payment payment1 = new Payment(invoiceStorage0);
        java.util.List<PaymentRecord> paymentRecordList2 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList3 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList4 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList5 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList6 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList7 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList8 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList9 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList10 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList11 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList12 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList13 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList14 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList15 = payment1.getPaymentRecords();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean18 = payment1.payOnline((int) (short) 100, "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"InvoiceStorage.getInvoice(int)\" because \"this.invoiceStorage\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(paymentRecordList2);
        org.junit.Assert.assertNotNull(paymentRecordList3);
        org.junit.Assert.assertNotNull(paymentRecordList4);
        org.junit.Assert.assertNotNull(paymentRecordList5);
        org.junit.Assert.assertNotNull(paymentRecordList6);
        org.junit.Assert.assertNotNull(paymentRecordList7);
        org.junit.Assert.assertNotNull(paymentRecordList8);
        org.junit.Assert.assertNotNull(paymentRecordList9);
        org.junit.Assert.assertNotNull(paymentRecordList10);
        org.junit.Assert.assertNotNull(paymentRecordList11);
        org.junit.Assert.assertNotNull(paymentRecordList12);
        org.junit.Assert.assertNotNull(paymentRecordList13);
        org.junit.Assert.assertNotNull(paymentRecordList14);
        org.junit.Assert.assertNotNull(paymentRecordList15);
    }

    @Test
    public void test0438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PaymentTest0.test0438");
        InvoiceStorage invoiceStorage0 = null;
        Payment payment1 = new Payment(invoiceStorage0);
        java.util.List<PaymentRecord> paymentRecordList2 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList3 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList4 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList5 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList6 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList7 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList8 = payment1.getPaymentRecords();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean10 = payment1.payByCash((int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"InvoiceStorage.getInvoice(int)\" because \"this.invoiceStorage\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(paymentRecordList2);
        org.junit.Assert.assertNotNull(paymentRecordList3);
        org.junit.Assert.assertNotNull(paymentRecordList4);
        org.junit.Assert.assertNotNull(paymentRecordList5);
        org.junit.Assert.assertNotNull(paymentRecordList6);
        org.junit.Assert.assertNotNull(paymentRecordList7);
        org.junit.Assert.assertNotNull(paymentRecordList8);
    }

    @Test
    public void test0439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PaymentTest0.test0439");
        InvoiceStorage invoiceStorage0 = null;
        Payment payment1 = new Payment(invoiceStorage0);
        java.util.List<PaymentRecord> paymentRecordList2 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList3 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList4 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList5 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList6 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList7 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList8 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList9 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList10 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList11 = payment1.getPaymentRecords();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean13 = payment1.payByCash((int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"InvoiceStorage.getInvoice(int)\" because \"this.invoiceStorage\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(paymentRecordList2);
        org.junit.Assert.assertNotNull(paymentRecordList3);
        org.junit.Assert.assertNotNull(paymentRecordList4);
        org.junit.Assert.assertNotNull(paymentRecordList5);
        org.junit.Assert.assertNotNull(paymentRecordList6);
        org.junit.Assert.assertNotNull(paymentRecordList7);
        org.junit.Assert.assertNotNull(paymentRecordList8);
        org.junit.Assert.assertNotNull(paymentRecordList9);
        org.junit.Assert.assertNotNull(paymentRecordList10);
        org.junit.Assert.assertNotNull(paymentRecordList11);
    }

    @Test
    public void test0440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PaymentTest0.test0440");
        InvoiceStorage invoiceStorage0 = null;
        Payment payment1 = new Payment(invoiceStorage0);
        java.util.List<PaymentRecord> paymentRecordList2 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList3 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList4 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList5 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList6 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList7 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList8 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList9 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList10 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList11 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList12 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList13 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList14 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList15 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList16 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList17 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList18 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList19 = payment1.getPaymentRecords();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean22 = payment1.payOnline(0, "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"InvoiceStorage.getInvoice(int)\" because \"this.invoiceStorage\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(paymentRecordList2);
        org.junit.Assert.assertNotNull(paymentRecordList3);
        org.junit.Assert.assertNotNull(paymentRecordList4);
        org.junit.Assert.assertNotNull(paymentRecordList5);
        org.junit.Assert.assertNotNull(paymentRecordList6);
        org.junit.Assert.assertNotNull(paymentRecordList7);
        org.junit.Assert.assertNotNull(paymentRecordList8);
        org.junit.Assert.assertNotNull(paymentRecordList9);
        org.junit.Assert.assertNotNull(paymentRecordList10);
        org.junit.Assert.assertNotNull(paymentRecordList11);
        org.junit.Assert.assertNotNull(paymentRecordList12);
        org.junit.Assert.assertNotNull(paymentRecordList13);
        org.junit.Assert.assertNotNull(paymentRecordList14);
        org.junit.Assert.assertNotNull(paymentRecordList15);
        org.junit.Assert.assertNotNull(paymentRecordList16);
        org.junit.Assert.assertNotNull(paymentRecordList17);
        org.junit.Assert.assertNotNull(paymentRecordList18);
        org.junit.Assert.assertNotNull(paymentRecordList19);
    }

    @Test
    public void test0441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PaymentTest0.test0441");
        InvoiceStorage invoiceStorage0 = null;
        Payment payment1 = new Payment(invoiceStorage0);
        java.util.List<PaymentRecord> paymentRecordList2 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList3 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList4 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList5 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList6 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList7 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList8 = payment1.getPaymentRecords();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean13 = payment1.payByCard(0, "", "hi!", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"InvoiceStorage.getInvoice(int)\" because \"this.invoiceStorage\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(paymentRecordList2);
        org.junit.Assert.assertNotNull(paymentRecordList3);
        org.junit.Assert.assertNotNull(paymentRecordList4);
        org.junit.Assert.assertNotNull(paymentRecordList5);
        org.junit.Assert.assertNotNull(paymentRecordList6);
        org.junit.Assert.assertNotNull(paymentRecordList7);
        org.junit.Assert.assertNotNull(paymentRecordList8);
    }

    @Test
    public void test0442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PaymentTest0.test0442");
        InvoiceStorage invoiceStorage0 = null;
        Payment payment1 = new Payment(invoiceStorage0);
        java.util.List<PaymentRecord> paymentRecordList2 = payment1.getPaymentRecords();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean7 = payment1.payByCard((int) (short) 1, "", "", "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"InvoiceStorage.getInvoice(int)\" because \"this.invoiceStorage\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(paymentRecordList2);
    }

    @Test
    public void test0443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PaymentTest0.test0443");
        InvoiceStorage invoiceStorage0 = null;
        Payment payment1 = new Payment(invoiceStorage0);
        java.util.List<PaymentRecord> paymentRecordList2 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList3 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList4 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList5 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList6 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList7 = payment1.getPaymentRecords();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean9 = payment1.payByCash(100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"InvoiceStorage.getInvoice(int)\" because \"this.invoiceStorage\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(paymentRecordList2);
        org.junit.Assert.assertNotNull(paymentRecordList3);
        org.junit.Assert.assertNotNull(paymentRecordList4);
        org.junit.Assert.assertNotNull(paymentRecordList5);
        org.junit.Assert.assertNotNull(paymentRecordList6);
        org.junit.Assert.assertNotNull(paymentRecordList7);
    }

    @Test
    public void test0444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PaymentTest0.test0444");
        InvoiceStorage invoiceStorage0 = null;
        Payment payment1 = new Payment(invoiceStorage0);
        java.util.List<PaymentRecord> paymentRecordList2 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList3 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList4 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList5 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList6 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList7 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList8 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList9 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList10 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList11 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList12 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList13 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList14 = payment1.getPaymentRecords();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean16 = payment1.payByCash(1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"InvoiceStorage.getInvoice(int)\" because \"this.invoiceStorage\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(paymentRecordList2);
        org.junit.Assert.assertNotNull(paymentRecordList3);
        org.junit.Assert.assertNotNull(paymentRecordList4);
        org.junit.Assert.assertNotNull(paymentRecordList5);
        org.junit.Assert.assertNotNull(paymentRecordList6);
        org.junit.Assert.assertNotNull(paymentRecordList7);
        org.junit.Assert.assertNotNull(paymentRecordList8);
        org.junit.Assert.assertNotNull(paymentRecordList9);
        org.junit.Assert.assertNotNull(paymentRecordList10);
        org.junit.Assert.assertNotNull(paymentRecordList11);
        org.junit.Assert.assertNotNull(paymentRecordList12);
        org.junit.Assert.assertNotNull(paymentRecordList13);
        org.junit.Assert.assertNotNull(paymentRecordList14);
    }

    @Test
    public void test0445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PaymentTest0.test0445");
        InvoiceStorage invoiceStorage0 = null;
        Payment payment1 = new Payment(invoiceStorage0);
        java.util.List<PaymentRecord> paymentRecordList2 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList3 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList4 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList5 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList6 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList7 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList8 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList9 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList10 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList11 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList12 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList13 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList14 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList15 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList16 = payment1.getPaymentRecords();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean19 = payment1.payOnline((int) (byte) 10, "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"InvoiceStorage.getInvoice(int)\" because \"this.invoiceStorage\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(paymentRecordList2);
        org.junit.Assert.assertNotNull(paymentRecordList3);
        org.junit.Assert.assertNotNull(paymentRecordList4);
        org.junit.Assert.assertNotNull(paymentRecordList5);
        org.junit.Assert.assertNotNull(paymentRecordList6);
        org.junit.Assert.assertNotNull(paymentRecordList7);
        org.junit.Assert.assertNotNull(paymentRecordList8);
        org.junit.Assert.assertNotNull(paymentRecordList9);
        org.junit.Assert.assertNotNull(paymentRecordList10);
        org.junit.Assert.assertNotNull(paymentRecordList11);
        org.junit.Assert.assertNotNull(paymentRecordList12);
        org.junit.Assert.assertNotNull(paymentRecordList13);
        org.junit.Assert.assertNotNull(paymentRecordList14);
        org.junit.Assert.assertNotNull(paymentRecordList15);
        org.junit.Assert.assertNotNull(paymentRecordList16);
    }

    @Test
    public void test0446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PaymentTest0.test0446");
        InvoiceStorage invoiceStorage0 = null;
        Payment payment1 = new Payment(invoiceStorage0);
        java.util.List<PaymentRecord> paymentRecordList2 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList3 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList4 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList5 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList6 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList7 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList8 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList9 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList10 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList11 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList12 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList13 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList14 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList15 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList16 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList17 = payment1.getPaymentRecords();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean19 = payment1.payByCash((int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"InvoiceStorage.getInvoice(int)\" because \"this.invoiceStorage\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(paymentRecordList2);
        org.junit.Assert.assertNotNull(paymentRecordList3);
        org.junit.Assert.assertNotNull(paymentRecordList4);
        org.junit.Assert.assertNotNull(paymentRecordList5);
        org.junit.Assert.assertNotNull(paymentRecordList6);
        org.junit.Assert.assertNotNull(paymentRecordList7);
        org.junit.Assert.assertNotNull(paymentRecordList8);
        org.junit.Assert.assertNotNull(paymentRecordList9);
        org.junit.Assert.assertNotNull(paymentRecordList10);
        org.junit.Assert.assertNotNull(paymentRecordList11);
        org.junit.Assert.assertNotNull(paymentRecordList12);
        org.junit.Assert.assertNotNull(paymentRecordList13);
        org.junit.Assert.assertNotNull(paymentRecordList14);
        org.junit.Assert.assertNotNull(paymentRecordList15);
        org.junit.Assert.assertNotNull(paymentRecordList16);
        org.junit.Assert.assertNotNull(paymentRecordList17);
    }

    @Test
    public void test0447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PaymentTest0.test0447");
        InvoiceStorage invoiceStorage0 = null;
        Payment payment1 = new Payment(invoiceStorage0);
        java.util.List<PaymentRecord> paymentRecordList2 = payment1.getPaymentRecords();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean4 = payment1.payByCash(0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"InvoiceStorage.getInvoice(int)\" because \"this.invoiceStorage\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(paymentRecordList2);
    }

    @Test
    public void test0448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PaymentTest0.test0448");
        InvoiceStorage invoiceStorage0 = null;
        Payment payment1 = new Payment(invoiceStorage0);
        java.util.List<PaymentRecord> paymentRecordList2 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList3 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList4 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList5 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList6 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList7 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList8 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList9 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList10 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList11 = payment1.getPaymentRecords();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean14 = payment1.payOnline((int) '#', "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"InvoiceStorage.getInvoice(int)\" because \"this.invoiceStorage\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(paymentRecordList2);
        org.junit.Assert.assertNotNull(paymentRecordList3);
        org.junit.Assert.assertNotNull(paymentRecordList4);
        org.junit.Assert.assertNotNull(paymentRecordList5);
        org.junit.Assert.assertNotNull(paymentRecordList6);
        org.junit.Assert.assertNotNull(paymentRecordList7);
        org.junit.Assert.assertNotNull(paymentRecordList8);
        org.junit.Assert.assertNotNull(paymentRecordList9);
        org.junit.Assert.assertNotNull(paymentRecordList10);
        org.junit.Assert.assertNotNull(paymentRecordList11);
    }

    @Test
    public void test0449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PaymentTest0.test0449");
        InvoiceStorage invoiceStorage0 = null;
        Payment payment1 = new Payment(invoiceStorage0);
        java.util.List<PaymentRecord> paymentRecordList2 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList3 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList4 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList5 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList6 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList7 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList8 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList9 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList10 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList11 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList12 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList13 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList14 = payment1.getPaymentRecords();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean16 = payment1.payByCash((int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"InvoiceStorage.getInvoice(int)\" because \"this.invoiceStorage\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(paymentRecordList2);
        org.junit.Assert.assertNotNull(paymentRecordList3);
        org.junit.Assert.assertNotNull(paymentRecordList4);
        org.junit.Assert.assertNotNull(paymentRecordList5);
        org.junit.Assert.assertNotNull(paymentRecordList6);
        org.junit.Assert.assertNotNull(paymentRecordList7);
        org.junit.Assert.assertNotNull(paymentRecordList8);
        org.junit.Assert.assertNotNull(paymentRecordList9);
        org.junit.Assert.assertNotNull(paymentRecordList10);
        org.junit.Assert.assertNotNull(paymentRecordList11);
        org.junit.Assert.assertNotNull(paymentRecordList12);
        org.junit.Assert.assertNotNull(paymentRecordList13);
        org.junit.Assert.assertNotNull(paymentRecordList14);
    }

    @Test
    public void test0450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PaymentTest0.test0450");
        InvoiceStorage invoiceStorage0 = null;
        Payment payment1 = new Payment(invoiceStorage0);
        java.util.List<PaymentRecord> paymentRecordList2 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList3 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList4 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList5 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList6 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList7 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList8 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList9 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList10 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList11 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList12 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList13 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList14 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList15 = payment1.getPaymentRecords();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean20 = payment1.payByCard((int) (short) 0, "hi!", "hi!", "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"InvoiceStorage.getInvoice(int)\" because \"this.invoiceStorage\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(paymentRecordList2);
        org.junit.Assert.assertNotNull(paymentRecordList3);
        org.junit.Assert.assertNotNull(paymentRecordList4);
        org.junit.Assert.assertNotNull(paymentRecordList5);
        org.junit.Assert.assertNotNull(paymentRecordList6);
        org.junit.Assert.assertNotNull(paymentRecordList7);
        org.junit.Assert.assertNotNull(paymentRecordList8);
        org.junit.Assert.assertNotNull(paymentRecordList9);
        org.junit.Assert.assertNotNull(paymentRecordList10);
        org.junit.Assert.assertNotNull(paymentRecordList11);
        org.junit.Assert.assertNotNull(paymentRecordList12);
        org.junit.Assert.assertNotNull(paymentRecordList13);
        org.junit.Assert.assertNotNull(paymentRecordList14);
        org.junit.Assert.assertNotNull(paymentRecordList15);
    }

    @Test
    public void test0451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PaymentTest0.test0451");
        InvoiceStorage invoiceStorage0 = null;
        Payment payment1 = new Payment(invoiceStorage0);
        java.util.List<PaymentRecord> paymentRecordList2 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList3 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList4 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList5 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList6 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList7 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList8 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList9 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList10 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList11 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList12 = payment1.getPaymentRecords();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean14 = payment1.payByCash((-1));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"InvoiceStorage.getInvoice(int)\" because \"this.invoiceStorage\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(paymentRecordList2);
        org.junit.Assert.assertNotNull(paymentRecordList3);
        org.junit.Assert.assertNotNull(paymentRecordList4);
        org.junit.Assert.assertNotNull(paymentRecordList5);
        org.junit.Assert.assertNotNull(paymentRecordList6);
        org.junit.Assert.assertNotNull(paymentRecordList7);
        org.junit.Assert.assertNotNull(paymentRecordList8);
        org.junit.Assert.assertNotNull(paymentRecordList9);
        org.junit.Assert.assertNotNull(paymentRecordList10);
        org.junit.Assert.assertNotNull(paymentRecordList11);
        org.junit.Assert.assertNotNull(paymentRecordList12);
    }

    @Test
    public void test0452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PaymentTest0.test0452");
        InvoiceStorage invoiceStorage0 = null;
        Payment payment1 = new Payment(invoiceStorage0);
        java.util.List<PaymentRecord> paymentRecordList2 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList3 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList4 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList5 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList6 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList7 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList8 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList9 = payment1.getPaymentRecords();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean11 = payment1.payByCash(1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"InvoiceStorage.getInvoice(int)\" because \"this.invoiceStorage\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(paymentRecordList2);
        org.junit.Assert.assertNotNull(paymentRecordList3);
        org.junit.Assert.assertNotNull(paymentRecordList4);
        org.junit.Assert.assertNotNull(paymentRecordList5);
        org.junit.Assert.assertNotNull(paymentRecordList6);
        org.junit.Assert.assertNotNull(paymentRecordList7);
        org.junit.Assert.assertNotNull(paymentRecordList8);
        org.junit.Assert.assertNotNull(paymentRecordList9);
    }

    @Test
    public void test0453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PaymentTest0.test0453");
        InvoiceStorage invoiceStorage0 = null;
        Payment payment1 = new Payment(invoiceStorage0);
        java.util.List<PaymentRecord> paymentRecordList2 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList3 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList4 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList5 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList6 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList7 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList8 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList9 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList10 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList11 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList12 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList13 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList14 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList15 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList16 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList17 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList18 = payment1.getPaymentRecords();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean21 = payment1.payOnline((int) (short) 10, "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"InvoiceStorage.getInvoice(int)\" because \"this.invoiceStorage\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(paymentRecordList2);
        org.junit.Assert.assertNotNull(paymentRecordList3);
        org.junit.Assert.assertNotNull(paymentRecordList4);
        org.junit.Assert.assertNotNull(paymentRecordList5);
        org.junit.Assert.assertNotNull(paymentRecordList6);
        org.junit.Assert.assertNotNull(paymentRecordList7);
        org.junit.Assert.assertNotNull(paymentRecordList8);
        org.junit.Assert.assertNotNull(paymentRecordList9);
        org.junit.Assert.assertNotNull(paymentRecordList10);
        org.junit.Assert.assertNotNull(paymentRecordList11);
        org.junit.Assert.assertNotNull(paymentRecordList12);
        org.junit.Assert.assertNotNull(paymentRecordList13);
        org.junit.Assert.assertNotNull(paymentRecordList14);
        org.junit.Assert.assertNotNull(paymentRecordList15);
        org.junit.Assert.assertNotNull(paymentRecordList16);
        org.junit.Assert.assertNotNull(paymentRecordList17);
        org.junit.Assert.assertNotNull(paymentRecordList18);
    }

    @Test
    public void test0454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PaymentTest0.test0454");
        InvoiceStorage invoiceStorage0 = null;
        Payment payment1 = new Payment(invoiceStorage0);
        java.util.List<PaymentRecord> paymentRecordList2 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList3 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList4 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList5 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList6 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList7 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList8 = payment1.getPaymentRecords();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean13 = payment1.payByCard((int) (short) 10, "", "hi!", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"InvoiceStorage.getInvoice(int)\" because \"this.invoiceStorage\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(paymentRecordList2);
        org.junit.Assert.assertNotNull(paymentRecordList3);
        org.junit.Assert.assertNotNull(paymentRecordList4);
        org.junit.Assert.assertNotNull(paymentRecordList5);
        org.junit.Assert.assertNotNull(paymentRecordList6);
        org.junit.Assert.assertNotNull(paymentRecordList7);
        org.junit.Assert.assertNotNull(paymentRecordList8);
    }

    @Test
    public void test0455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PaymentTest0.test0455");
        InvoiceStorage invoiceStorage0 = null;
        Payment payment1 = new Payment(invoiceStorage0);
        java.util.List<PaymentRecord> paymentRecordList2 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList3 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList4 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList5 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList6 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList7 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList8 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList9 = payment1.getPaymentRecords();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean14 = payment1.payByCard((int) (short) 0, "", "", "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"InvoiceStorage.getInvoice(int)\" because \"this.invoiceStorage\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(paymentRecordList2);
        org.junit.Assert.assertNotNull(paymentRecordList3);
        org.junit.Assert.assertNotNull(paymentRecordList4);
        org.junit.Assert.assertNotNull(paymentRecordList5);
        org.junit.Assert.assertNotNull(paymentRecordList6);
        org.junit.Assert.assertNotNull(paymentRecordList7);
        org.junit.Assert.assertNotNull(paymentRecordList8);
        org.junit.Assert.assertNotNull(paymentRecordList9);
    }

    @Test
    public void test0456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PaymentTest0.test0456");
        InvoiceStorage invoiceStorage0 = null;
        Payment payment1 = new Payment(invoiceStorage0);
        java.util.List<PaymentRecord> paymentRecordList2 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList3 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList4 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList5 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList6 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList7 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList8 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList9 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList10 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList11 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList12 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList13 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList14 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList15 = payment1.getPaymentRecords();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean17 = payment1.payByCash(0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"InvoiceStorage.getInvoice(int)\" because \"this.invoiceStorage\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(paymentRecordList2);
        org.junit.Assert.assertNotNull(paymentRecordList3);
        org.junit.Assert.assertNotNull(paymentRecordList4);
        org.junit.Assert.assertNotNull(paymentRecordList5);
        org.junit.Assert.assertNotNull(paymentRecordList6);
        org.junit.Assert.assertNotNull(paymentRecordList7);
        org.junit.Assert.assertNotNull(paymentRecordList8);
        org.junit.Assert.assertNotNull(paymentRecordList9);
        org.junit.Assert.assertNotNull(paymentRecordList10);
        org.junit.Assert.assertNotNull(paymentRecordList11);
        org.junit.Assert.assertNotNull(paymentRecordList12);
        org.junit.Assert.assertNotNull(paymentRecordList13);
        org.junit.Assert.assertNotNull(paymentRecordList14);
        org.junit.Assert.assertNotNull(paymentRecordList15);
    }

    @Test
    public void test0457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PaymentTest0.test0457");
        InvoiceStorage invoiceStorage0 = null;
        Payment payment1 = new Payment(invoiceStorage0);
        java.util.List<PaymentRecord> paymentRecordList2 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList3 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList4 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList5 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList6 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList7 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList8 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList9 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList10 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList11 = payment1.getPaymentRecords();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean13 = payment1.payByCash((int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"InvoiceStorage.getInvoice(int)\" because \"this.invoiceStorage\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(paymentRecordList2);
        org.junit.Assert.assertNotNull(paymentRecordList3);
        org.junit.Assert.assertNotNull(paymentRecordList4);
        org.junit.Assert.assertNotNull(paymentRecordList5);
        org.junit.Assert.assertNotNull(paymentRecordList6);
        org.junit.Assert.assertNotNull(paymentRecordList7);
        org.junit.Assert.assertNotNull(paymentRecordList8);
        org.junit.Assert.assertNotNull(paymentRecordList9);
        org.junit.Assert.assertNotNull(paymentRecordList10);
        org.junit.Assert.assertNotNull(paymentRecordList11);
    }

    @Test
    public void test0458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PaymentTest0.test0458");
        InvoiceStorage invoiceStorage0 = null;
        Payment payment1 = new Payment(invoiceStorage0);
        java.util.List<PaymentRecord> paymentRecordList2 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList3 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList4 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList5 = payment1.getPaymentRecords();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean10 = payment1.payByCard((int) (byte) 100, "", "", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"InvoiceStorage.getInvoice(int)\" because \"this.invoiceStorage\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(paymentRecordList2);
        org.junit.Assert.assertNotNull(paymentRecordList3);
        org.junit.Assert.assertNotNull(paymentRecordList4);
        org.junit.Assert.assertNotNull(paymentRecordList5);
    }

    @Test
    public void test0459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PaymentTest0.test0459");
        InvoiceStorage invoiceStorage0 = null;
        Payment payment1 = new Payment(invoiceStorage0);
        java.util.List<PaymentRecord> paymentRecordList2 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList3 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList4 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList5 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList6 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList7 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList8 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList9 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList10 = payment1.getPaymentRecords();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean12 = payment1.payByCash((int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"InvoiceStorage.getInvoice(int)\" because \"this.invoiceStorage\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(paymentRecordList2);
        org.junit.Assert.assertNotNull(paymentRecordList3);
        org.junit.Assert.assertNotNull(paymentRecordList4);
        org.junit.Assert.assertNotNull(paymentRecordList5);
        org.junit.Assert.assertNotNull(paymentRecordList6);
        org.junit.Assert.assertNotNull(paymentRecordList7);
        org.junit.Assert.assertNotNull(paymentRecordList8);
        org.junit.Assert.assertNotNull(paymentRecordList9);
        org.junit.Assert.assertNotNull(paymentRecordList10);
    }

    @Test
    public void test0460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PaymentTest0.test0460");
        InvoiceStorage invoiceStorage0 = null;
        Payment payment1 = new Payment(invoiceStorage0);
        java.util.List<PaymentRecord> paymentRecordList2 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList3 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList4 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList5 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList6 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList7 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList8 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList9 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList10 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList11 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList12 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList13 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList14 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList15 = payment1.getPaymentRecords();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean17 = payment1.payByCash((int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"InvoiceStorage.getInvoice(int)\" because \"this.invoiceStorage\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(paymentRecordList2);
        org.junit.Assert.assertNotNull(paymentRecordList3);
        org.junit.Assert.assertNotNull(paymentRecordList4);
        org.junit.Assert.assertNotNull(paymentRecordList5);
        org.junit.Assert.assertNotNull(paymentRecordList6);
        org.junit.Assert.assertNotNull(paymentRecordList7);
        org.junit.Assert.assertNotNull(paymentRecordList8);
        org.junit.Assert.assertNotNull(paymentRecordList9);
        org.junit.Assert.assertNotNull(paymentRecordList10);
        org.junit.Assert.assertNotNull(paymentRecordList11);
        org.junit.Assert.assertNotNull(paymentRecordList12);
        org.junit.Assert.assertNotNull(paymentRecordList13);
        org.junit.Assert.assertNotNull(paymentRecordList14);
        org.junit.Assert.assertNotNull(paymentRecordList15);
    }

    @Test
    public void test0461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PaymentTest0.test0461");
        InvoiceStorage invoiceStorage0 = null;
        Payment payment1 = new Payment(invoiceStorage0);
        java.util.List<PaymentRecord> paymentRecordList2 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList3 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList4 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList5 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList6 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList7 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList8 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList9 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList10 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList11 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList12 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList13 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList14 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList15 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList16 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList17 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList18 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList19 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList20 = payment1.getPaymentRecords();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean22 = payment1.payByCash((int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"InvoiceStorage.getInvoice(int)\" because \"this.invoiceStorage\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(paymentRecordList2);
        org.junit.Assert.assertNotNull(paymentRecordList3);
        org.junit.Assert.assertNotNull(paymentRecordList4);
        org.junit.Assert.assertNotNull(paymentRecordList5);
        org.junit.Assert.assertNotNull(paymentRecordList6);
        org.junit.Assert.assertNotNull(paymentRecordList7);
        org.junit.Assert.assertNotNull(paymentRecordList8);
        org.junit.Assert.assertNotNull(paymentRecordList9);
        org.junit.Assert.assertNotNull(paymentRecordList10);
        org.junit.Assert.assertNotNull(paymentRecordList11);
        org.junit.Assert.assertNotNull(paymentRecordList12);
        org.junit.Assert.assertNotNull(paymentRecordList13);
        org.junit.Assert.assertNotNull(paymentRecordList14);
        org.junit.Assert.assertNotNull(paymentRecordList15);
        org.junit.Assert.assertNotNull(paymentRecordList16);
        org.junit.Assert.assertNotNull(paymentRecordList17);
        org.junit.Assert.assertNotNull(paymentRecordList18);
        org.junit.Assert.assertNotNull(paymentRecordList19);
        org.junit.Assert.assertNotNull(paymentRecordList20);
    }

    @Test
    public void test0462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PaymentTest0.test0462");
        InvoiceStorage invoiceStorage0 = null;
        Payment payment1 = new Payment(invoiceStorage0);
        java.util.List<PaymentRecord> paymentRecordList2 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList3 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList4 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList5 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList6 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList7 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList8 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList9 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList10 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList11 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList12 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList13 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList14 = payment1.getPaymentRecords();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean19 = payment1.payByCard(1, "hi!", "", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"InvoiceStorage.getInvoice(int)\" because \"this.invoiceStorage\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(paymentRecordList2);
        org.junit.Assert.assertNotNull(paymentRecordList3);
        org.junit.Assert.assertNotNull(paymentRecordList4);
        org.junit.Assert.assertNotNull(paymentRecordList5);
        org.junit.Assert.assertNotNull(paymentRecordList6);
        org.junit.Assert.assertNotNull(paymentRecordList7);
        org.junit.Assert.assertNotNull(paymentRecordList8);
        org.junit.Assert.assertNotNull(paymentRecordList9);
        org.junit.Assert.assertNotNull(paymentRecordList10);
        org.junit.Assert.assertNotNull(paymentRecordList11);
        org.junit.Assert.assertNotNull(paymentRecordList12);
        org.junit.Assert.assertNotNull(paymentRecordList13);
        org.junit.Assert.assertNotNull(paymentRecordList14);
    }

    @Test
    public void test0463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PaymentTest0.test0463");
        InvoiceStorage invoiceStorage0 = null;
        Payment payment1 = new Payment(invoiceStorage0);
        java.util.List<PaymentRecord> paymentRecordList2 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList3 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList4 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList5 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList6 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList7 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList8 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList9 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList10 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList11 = payment1.getPaymentRecords();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean13 = payment1.payByCash((int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"InvoiceStorage.getInvoice(int)\" because \"this.invoiceStorage\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(paymentRecordList2);
        org.junit.Assert.assertNotNull(paymentRecordList3);
        org.junit.Assert.assertNotNull(paymentRecordList4);
        org.junit.Assert.assertNotNull(paymentRecordList5);
        org.junit.Assert.assertNotNull(paymentRecordList6);
        org.junit.Assert.assertNotNull(paymentRecordList7);
        org.junit.Assert.assertNotNull(paymentRecordList8);
        org.junit.Assert.assertNotNull(paymentRecordList9);
        org.junit.Assert.assertNotNull(paymentRecordList10);
        org.junit.Assert.assertNotNull(paymentRecordList11);
    }

    @Test
    public void test0464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PaymentTest0.test0464");
        InvoiceStorage invoiceStorage0 = null;
        Payment payment1 = new Payment(invoiceStorage0);
        java.util.List<PaymentRecord> paymentRecordList2 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList3 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList4 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList5 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList6 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList7 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList8 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList9 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList10 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList11 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList12 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList13 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList14 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList15 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList16 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList17 = payment1.getPaymentRecords();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean20 = payment1.payOnline(100, "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"InvoiceStorage.getInvoice(int)\" because \"this.invoiceStorage\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(paymentRecordList2);
        org.junit.Assert.assertNotNull(paymentRecordList3);
        org.junit.Assert.assertNotNull(paymentRecordList4);
        org.junit.Assert.assertNotNull(paymentRecordList5);
        org.junit.Assert.assertNotNull(paymentRecordList6);
        org.junit.Assert.assertNotNull(paymentRecordList7);
        org.junit.Assert.assertNotNull(paymentRecordList8);
        org.junit.Assert.assertNotNull(paymentRecordList9);
        org.junit.Assert.assertNotNull(paymentRecordList10);
        org.junit.Assert.assertNotNull(paymentRecordList11);
        org.junit.Assert.assertNotNull(paymentRecordList12);
        org.junit.Assert.assertNotNull(paymentRecordList13);
        org.junit.Assert.assertNotNull(paymentRecordList14);
        org.junit.Assert.assertNotNull(paymentRecordList15);
        org.junit.Assert.assertNotNull(paymentRecordList16);
        org.junit.Assert.assertNotNull(paymentRecordList17);
    }

    @Test
    public void test0465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PaymentTest0.test0465");
        InvoiceStorage invoiceStorage0 = null;
        Payment payment1 = new Payment(invoiceStorage0);
        java.util.List<PaymentRecord> paymentRecordList2 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList3 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList4 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList5 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList6 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList7 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList8 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList9 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList10 = payment1.getPaymentRecords();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean13 = payment1.payOnline((int) '#', "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"InvoiceStorage.getInvoice(int)\" because \"this.invoiceStorage\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(paymentRecordList2);
        org.junit.Assert.assertNotNull(paymentRecordList3);
        org.junit.Assert.assertNotNull(paymentRecordList4);
        org.junit.Assert.assertNotNull(paymentRecordList5);
        org.junit.Assert.assertNotNull(paymentRecordList6);
        org.junit.Assert.assertNotNull(paymentRecordList7);
        org.junit.Assert.assertNotNull(paymentRecordList8);
        org.junit.Assert.assertNotNull(paymentRecordList9);
        org.junit.Assert.assertNotNull(paymentRecordList10);
    }

    @Test
    public void test0466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PaymentTest0.test0466");
        InvoiceStorage invoiceStorage0 = null;
        Payment payment1 = new Payment(invoiceStorage0);
        java.util.List<PaymentRecord> paymentRecordList2 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList3 = payment1.getPaymentRecords();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean8 = payment1.payByCard((int) ' ', "", "", "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"InvoiceStorage.getInvoice(int)\" because \"this.invoiceStorage\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(paymentRecordList2);
        org.junit.Assert.assertNotNull(paymentRecordList3);
    }

    @Test
    public void test0467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PaymentTest0.test0467");
        InvoiceStorage invoiceStorage0 = null;
        Payment payment1 = new Payment(invoiceStorage0);
        java.util.List<PaymentRecord> paymentRecordList2 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList3 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList4 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList5 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList6 = payment1.getPaymentRecords();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean9 = payment1.payOnline((int) 'a', "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"InvoiceStorage.getInvoice(int)\" because \"this.invoiceStorage\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(paymentRecordList2);
        org.junit.Assert.assertNotNull(paymentRecordList3);
        org.junit.Assert.assertNotNull(paymentRecordList4);
        org.junit.Assert.assertNotNull(paymentRecordList5);
        org.junit.Assert.assertNotNull(paymentRecordList6);
    }

    @Test
    public void test0468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PaymentTest0.test0468");
        InvoiceStorage invoiceStorage0 = null;
        Payment payment1 = new Payment(invoiceStorage0);
        java.util.List<PaymentRecord> paymentRecordList2 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList3 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList4 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList5 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList6 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList7 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList8 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList9 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList10 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList11 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList12 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList13 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList14 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList15 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList16 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList17 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList18 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList19 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList20 = payment1.getPaymentRecords();
        java.lang.Class<?> wildcardClass21 = payment1.getClass();
        org.junit.Assert.assertNotNull(paymentRecordList2);
        org.junit.Assert.assertNotNull(paymentRecordList3);
        org.junit.Assert.assertNotNull(paymentRecordList4);
        org.junit.Assert.assertNotNull(paymentRecordList5);
        org.junit.Assert.assertNotNull(paymentRecordList6);
        org.junit.Assert.assertNotNull(paymentRecordList7);
        org.junit.Assert.assertNotNull(paymentRecordList8);
        org.junit.Assert.assertNotNull(paymentRecordList9);
        org.junit.Assert.assertNotNull(paymentRecordList10);
        org.junit.Assert.assertNotNull(paymentRecordList11);
        org.junit.Assert.assertNotNull(paymentRecordList12);
        org.junit.Assert.assertNotNull(paymentRecordList13);
        org.junit.Assert.assertNotNull(paymentRecordList14);
        org.junit.Assert.assertNotNull(paymentRecordList15);
        org.junit.Assert.assertNotNull(paymentRecordList16);
        org.junit.Assert.assertNotNull(paymentRecordList17);
        org.junit.Assert.assertNotNull(paymentRecordList18);
        org.junit.Assert.assertNotNull(paymentRecordList19);
        org.junit.Assert.assertNotNull(paymentRecordList20);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test0469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PaymentTest0.test0469");
        InvoiceStorage invoiceStorage0 = null;
        Payment payment1 = new Payment(invoiceStorage0);
        java.util.List<PaymentRecord> paymentRecordList2 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList3 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList4 = payment1.getPaymentRecords();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean7 = payment1.payOnline((int) (short) 10, "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"InvoiceStorage.getInvoice(int)\" because \"this.invoiceStorage\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(paymentRecordList2);
        org.junit.Assert.assertNotNull(paymentRecordList3);
        org.junit.Assert.assertNotNull(paymentRecordList4);
    }

    @Test
    public void test0470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PaymentTest0.test0470");
        InvoiceStorage invoiceStorage0 = null;
        Payment payment1 = new Payment(invoiceStorage0);
        java.util.List<PaymentRecord> paymentRecordList2 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList3 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList4 = payment1.getPaymentRecords();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean9 = payment1.payByCard((int) (byte) 100, "", "hi!", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"InvoiceStorage.getInvoice(int)\" because \"this.invoiceStorage\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(paymentRecordList2);
        org.junit.Assert.assertNotNull(paymentRecordList3);
        org.junit.Assert.assertNotNull(paymentRecordList4);
    }

    @Test
    public void test0471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PaymentTest0.test0471");
        InvoiceStorage invoiceStorage0 = null;
        Payment payment1 = new Payment(invoiceStorage0);
        java.util.List<PaymentRecord> paymentRecordList2 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList3 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList4 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList5 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList6 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList7 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList8 = payment1.getPaymentRecords();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean11 = payment1.payOnline((int) (short) 1, "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"InvoiceStorage.getInvoice(int)\" because \"this.invoiceStorage\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(paymentRecordList2);
        org.junit.Assert.assertNotNull(paymentRecordList3);
        org.junit.Assert.assertNotNull(paymentRecordList4);
        org.junit.Assert.assertNotNull(paymentRecordList5);
        org.junit.Assert.assertNotNull(paymentRecordList6);
        org.junit.Assert.assertNotNull(paymentRecordList7);
        org.junit.Assert.assertNotNull(paymentRecordList8);
    }

    @Test
    public void test0472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PaymentTest0.test0472");
        InvoiceStorage invoiceStorage0 = null;
        Payment payment1 = new Payment(invoiceStorage0);
        java.util.List<PaymentRecord> paymentRecordList2 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList3 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList4 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList5 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList6 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList7 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList8 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList9 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList10 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList11 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList12 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList13 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList14 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList15 = payment1.getPaymentRecords();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean17 = payment1.payByCash((int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"InvoiceStorage.getInvoice(int)\" because \"this.invoiceStorage\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(paymentRecordList2);
        org.junit.Assert.assertNotNull(paymentRecordList3);
        org.junit.Assert.assertNotNull(paymentRecordList4);
        org.junit.Assert.assertNotNull(paymentRecordList5);
        org.junit.Assert.assertNotNull(paymentRecordList6);
        org.junit.Assert.assertNotNull(paymentRecordList7);
        org.junit.Assert.assertNotNull(paymentRecordList8);
        org.junit.Assert.assertNotNull(paymentRecordList9);
        org.junit.Assert.assertNotNull(paymentRecordList10);
        org.junit.Assert.assertNotNull(paymentRecordList11);
        org.junit.Assert.assertNotNull(paymentRecordList12);
        org.junit.Assert.assertNotNull(paymentRecordList13);
        org.junit.Assert.assertNotNull(paymentRecordList14);
        org.junit.Assert.assertNotNull(paymentRecordList15);
    }

    @Test
    public void test0473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PaymentTest0.test0473");
        InvoiceStorage invoiceStorage0 = null;
        Payment payment1 = new Payment(invoiceStorage0);
        java.util.List<PaymentRecord> paymentRecordList2 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList3 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList4 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList5 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList6 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList7 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList8 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList9 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList10 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList11 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList12 = payment1.getPaymentRecords();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean17 = payment1.payByCard((int) (short) 10, "", "", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"InvoiceStorage.getInvoice(int)\" because \"this.invoiceStorage\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(paymentRecordList2);
        org.junit.Assert.assertNotNull(paymentRecordList3);
        org.junit.Assert.assertNotNull(paymentRecordList4);
        org.junit.Assert.assertNotNull(paymentRecordList5);
        org.junit.Assert.assertNotNull(paymentRecordList6);
        org.junit.Assert.assertNotNull(paymentRecordList7);
        org.junit.Assert.assertNotNull(paymentRecordList8);
        org.junit.Assert.assertNotNull(paymentRecordList9);
        org.junit.Assert.assertNotNull(paymentRecordList10);
        org.junit.Assert.assertNotNull(paymentRecordList11);
        org.junit.Assert.assertNotNull(paymentRecordList12);
    }

    @Test
    public void test0474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PaymentTest0.test0474");
        InvoiceStorage invoiceStorage0 = null;
        Payment payment1 = new Payment(invoiceStorage0);
        java.util.List<PaymentRecord> paymentRecordList2 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList3 = payment1.getPaymentRecords();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean6 = payment1.payOnline((int) (byte) 0, "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"InvoiceStorage.getInvoice(int)\" because \"this.invoiceStorage\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(paymentRecordList2);
        org.junit.Assert.assertNotNull(paymentRecordList3);
    }

    @Test
    public void test0475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PaymentTest0.test0475");
        InvoiceStorage invoiceStorage0 = null;
        Payment payment1 = new Payment(invoiceStorage0);
        java.util.List<PaymentRecord> paymentRecordList2 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList3 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList4 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList5 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList6 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList7 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList8 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList9 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList10 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList11 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList12 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList13 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList14 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList15 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList16 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList17 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList18 = payment1.getPaymentRecords();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean20 = payment1.payByCash((int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"InvoiceStorage.getInvoice(int)\" because \"this.invoiceStorage\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(paymentRecordList2);
        org.junit.Assert.assertNotNull(paymentRecordList3);
        org.junit.Assert.assertNotNull(paymentRecordList4);
        org.junit.Assert.assertNotNull(paymentRecordList5);
        org.junit.Assert.assertNotNull(paymentRecordList6);
        org.junit.Assert.assertNotNull(paymentRecordList7);
        org.junit.Assert.assertNotNull(paymentRecordList8);
        org.junit.Assert.assertNotNull(paymentRecordList9);
        org.junit.Assert.assertNotNull(paymentRecordList10);
        org.junit.Assert.assertNotNull(paymentRecordList11);
        org.junit.Assert.assertNotNull(paymentRecordList12);
        org.junit.Assert.assertNotNull(paymentRecordList13);
        org.junit.Assert.assertNotNull(paymentRecordList14);
        org.junit.Assert.assertNotNull(paymentRecordList15);
        org.junit.Assert.assertNotNull(paymentRecordList16);
        org.junit.Assert.assertNotNull(paymentRecordList17);
        org.junit.Assert.assertNotNull(paymentRecordList18);
    }

    @Test
    public void test0476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PaymentTest0.test0476");
        InvoiceStorage invoiceStorage0 = null;
        Payment payment1 = new Payment(invoiceStorage0);
        java.util.List<PaymentRecord> paymentRecordList2 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList3 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList4 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList5 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList6 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList7 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList8 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList9 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList10 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList11 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList12 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList13 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList14 = payment1.getPaymentRecords();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean19 = payment1.payByCard((int) ' ', "hi!", "hi!", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"InvoiceStorage.getInvoice(int)\" because \"this.invoiceStorage\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(paymentRecordList2);
        org.junit.Assert.assertNotNull(paymentRecordList3);
        org.junit.Assert.assertNotNull(paymentRecordList4);
        org.junit.Assert.assertNotNull(paymentRecordList5);
        org.junit.Assert.assertNotNull(paymentRecordList6);
        org.junit.Assert.assertNotNull(paymentRecordList7);
        org.junit.Assert.assertNotNull(paymentRecordList8);
        org.junit.Assert.assertNotNull(paymentRecordList9);
        org.junit.Assert.assertNotNull(paymentRecordList10);
        org.junit.Assert.assertNotNull(paymentRecordList11);
        org.junit.Assert.assertNotNull(paymentRecordList12);
        org.junit.Assert.assertNotNull(paymentRecordList13);
        org.junit.Assert.assertNotNull(paymentRecordList14);
    }

    @Test
    public void test0477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PaymentTest0.test0477");
        InvoiceStorage invoiceStorage0 = null;
        Payment payment1 = new Payment(invoiceStorage0);
        java.util.List<PaymentRecord> paymentRecordList2 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList3 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList4 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList5 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList6 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList7 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList8 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList9 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList10 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList11 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList12 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList13 = payment1.getPaymentRecords();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean15 = payment1.payByCash((int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"InvoiceStorage.getInvoice(int)\" because \"this.invoiceStorage\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(paymentRecordList2);
        org.junit.Assert.assertNotNull(paymentRecordList3);
        org.junit.Assert.assertNotNull(paymentRecordList4);
        org.junit.Assert.assertNotNull(paymentRecordList5);
        org.junit.Assert.assertNotNull(paymentRecordList6);
        org.junit.Assert.assertNotNull(paymentRecordList7);
        org.junit.Assert.assertNotNull(paymentRecordList8);
        org.junit.Assert.assertNotNull(paymentRecordList9);
        org.junit.Assert.assertNotNull(paymentRecordList10);
        org.junit.Assert.assertNotNull(paymentRecordList11);
        org.junit.Assert.assertNotNull(paymentRecordList12);
        org.junit.Assert.assertNotNull(paymentRecordList13);
    }

    @Test
    public void test0478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PaymentTest0.test0478");
        InvoiceStorage invoiceStorage0 = null;
        Payment payment1 = new Payment(invoiceStorage0);
        java.util.List<PaymentRecord> paymentRecordList2 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList3 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList4 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList5 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList6 = payment1.getPaymentRecords();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean9 = payment1.payOnline((int) (byte) -1, "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"InvoiceStorage.getInvoice(int)\" because \"this.invoiceStorage\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(paymentRecordList2);
        org.junit.Assert.assertNotNull(paymentRecordList3);
        org.junit.Assert.assertNotNull(paymentRecordList4);
        org.junit.Assert.assertNotNull(paymentRecordList5);
        org.junit.Assert.assertNotNull(paymentRecordList6);
    }

    @Test
    public void test0479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PaymentTest0.test0479");
        InvoiceStorage invoiceStorage0 = null;
        Payment payment1 = new Payment(invoiceStorage0);
        java.util.List<PaymentRecord> paymentRecordList2 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList3 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList4 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList5 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList6 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList7 = payment1.getPaymentRecords();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean12 = payment1.payByCard(10, "hi!", "", "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"InvoiceStorage.getInvoice(int)\" because \"this.invoiceStorage\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(paymentRecordList2);
        org.junit.Assert.assertNotNull(paymentRecordList3);
        org.junit.Assert.assertNotNull(paymentRecordList4);
        org.junit.Assert.assertNotNull(paymentRecordList5);
        org.junit.Assert.assertNotNull(paymentRecordList6);
        org.junit.Assert.assertNotNull(paymentRecordList7);
    }

    @Test
    public void test0480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PaymentTest0.test0480");
        InvoiceStorage invoiceStorage0 = null;
        Payment payment1 = new Payment(invoiceStorage0);
        java.util.List<PaymentRecord> paymentRecordList2 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList3 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList4 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList5 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList6 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList7 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList8 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList9 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList10 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList11 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList12 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList13 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList14 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList15 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList16 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList17 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList18 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList19 = payment1.getPaymentRecords();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean21 = payment1.payByCash(0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"InvoiceStorage.getInvoice(int)\" because \"this.invoiceStorage\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(paymentRecordList2);
        org.junit.Assert.assertNotNull(paymentRecordList3);
        org.junit.Assert.assertNotNull(paymentRecordList4);
        org.junit.Assert.assertNotNull(paymentRecordList5);
        org.junit.Assert.assertNotNull(paymentRecordList6);
        org.junit.Assert.assertNotNull(paymentRecordList7);
        org.junit.Assert.assertNotNull(paymentRecordList8);
        org.junit.Assert.assertNotNull(paymentRecordList9);
        org.junit.Assert.assertNotNull(paymentRecordList10);
        org.junit.Assert.assertNotNull(paymentRecordList11);
        org.junit.Assert.assertNotNull(paymentRecordList12);
        org.junit.Assert.assertNotNull(paymentRecordList13);
        org.junit.Assert.assertNotNull(paymentRecordList14);
        org.junit.Assert.assertNotNull(paymentRecordList15);
        org.junit.Assert.assertNotNull(paymentRecordList16);
        org.junit.Assert.assertNotNull(paymentRecordList17);
        org.junit.Assert.assertNotNull(paymentRecordList18);
        org.junit.Assert.assertNotNull(paymentRecordList19);
    }

    @Test
    public void test0481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PaymentTest0.test0481");
        InvoiceStorage invoiceStorage0 = null;
        Payment payment1 = new Payment(invoiceStorage0);
        java.util.List<PaymentRecord> paymentRecordList2 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList3 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList4 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList5 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList6 = payment1.getPaymentRecords();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean8 = payment1.payByCash((int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"InvoiceStorage.getInvoice(int)\" because \"this.invoiceStorage\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(paymentRecordList2);
        org.junit.Assert.assertNotNull(paymentRecordList3);
        org.junit.Assert.assertNotNull(paymentRecordList4);
        org.junit.Assert.assertNotNull(paymentRecordList5);
        org.junit.Assert.assertNotNull(paymentRecordList6);
    }

    @Test
    public void test0482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PaymentTest0.test0482");
        InvoiceStorage invoiceStorage0 = null;
        Payment payment1 = new Payment(invoiceStorage0);
        java.util.List<PaymentRecord> paymentRecordList2 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList3 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList4 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList5 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList6 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList7 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList8 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList9 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList10 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList11 = payment1.getPaymentRecords();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean16 = payment1.payByCard((int) (byte) 1, "hi!", "", "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"InvoiceStorage.getInvoice(int)\" because \"this.invoiceStorage\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(paymentRecordList2);
        org.junit.Assert.assertNotNull(paymentRecordList3);
        org.junit.Assert.assertNotNull(paymentRecordList4);
        org.junit.Assert.assertNotNull(paymentRecordList5);
        org.junit.Assert.assertNotNull(paymentRecordList6);
        org.junit.Assert.assertNotNull(paymentRecordList7);
        org.junit.Assert.assertNotNull(paymentRecordList8);
        org.junit.Assert.assertNotNull(paymentRecordList9);
        org.junit.Assert.assertNotNull(paymentRecordList10);
        org.junit.Assert.assertNotNull(paymentRecordList11);
    }

    @Test
    public void test0483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PaymentTest0.test0483");
        InvoiceStorage invoiceStorage0 = null;
        Payment payment1 = new Payment(invoiceStorage0);
        java.util.List<PaymentRecord> paymentRecordList2 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList3 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList4 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList5 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList6 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList7 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList8 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList9 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList10 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList11 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList12 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList13 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList14 = payment1.getPaymentRecords();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean19 = payment1.payByCard((int) (byte) 10, "", "", "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"InvoiceStorage.getInvoice(int)\" because \"this.invoiceStorage\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(paymentRecordList2);
        org.junit.Assert.assertNotNull(paymentRecordList3);
        org.junit.Assert.assertNotNull(paymentRecordList4);
        org.junit.Assert.assertNotNull(paymentRecordList5);
        org.junit.Assert.assertNotNull(paymentRecordList6);
        org.junit.Assert.assertNotNull(paymentRecordList7);
        org.junit.Assert.assertNotNull(paymentRecordList8);
        org.junit.Assert.assertNotNull(paymentRecordList9);
        org.junit.Assert.assertNotNull(paymentRecordList10);
        org.junit.Assert.assertNotNull(paymentRecordList11);
        org.junit.Assert.assertNotNull(paymentRecordList12);
        org.junit.Assert.assertNotNull(paymentRecordList13);
        org.junit.Assert.assertNotNull(paymentRecordList14);
    }

    @Test
    public void test0484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PaymentTest0.test0484");
        InvoiceStorage invoiceStorage0 = null;
        Payment payment1 = new Payment(invoiceStorage0);
        java.util.List<PaymentRecord> paymentRecordList2 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList3 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList4 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList5 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList6 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList7 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList8 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList9 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList10 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList11 = payment1.getPaymentRecords();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean16 = payment1.payByCard((int) (short) 100, "", "", "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"InvoiceStorage.getInvoice(int)\" because \"this.invoiceStorage\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(paymentRecordList2);
        org.junit.Assert.assertNotNull(paymentRecordList3);
        org.junit.Assert.assertNotNull(paymentRecordList4);
        org.junit.Assert.assertNotNull(paymentRecordList5);
        org.junit.Assert.assertNotNull(paymentRecordList6);
        org.junit.Assert.assertNotNull(paymentRecordList7);
        org.junit.Assert.assertNotNull(paymentRecordList8);
        org.junit.Assert.assertNotNull(paymentRecordList9);
        org.junit.Assert.assertNotNull(paymentRecordList10);
        org.junit.Assert.assertNotNull(paymentRecordList11);
    }

    @Test
    public void test0485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PaymentTest0.test0485");
        InvoiceStorage invoiceStorage0 = null;
        Payment payment1 = new Payment(invoiceStorage0);
        java.util.List<PaymentRecord> paymentRecordList2 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList3 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList4 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList5 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList6 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList7 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList8 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList9 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList10 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList11 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList12 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList13 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList14 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList15 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList16 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList17 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList18 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList19 = payment1.getPaymentRecords();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean21 = payment1.payByCash(100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"InvoiceStorage.getInvoice(int)\" because \"this.invoiceStorage\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(paymentRecordList2);
        org.junit.Assert.assertNotNull(paymentRecordList3);
        org.junit.Assert.assertNotNull(paymentRecordList4);
        org.junit.Assert.assertNotNull(paymentRecordList5);
        org.junit.Assert.assertNotNull(paymentRecordList6);
        org.junit.Assert.assertNotNull(paymentRecordList7);
        org.junit.Assert.assertNotNull(paymentRecordList8);
        org.junit.Assert.assertNotNull(paymentRecordList9);
        org.junit.Assert.assertNotNull(paymentRecordList10);
        org.junit.Assert.assertNotNull(paymentRecordList11);
        org.junit.Assert.assertNotNull(paymentRecordList12);
        org.junit.Assert.assertNotNull(paymentRecordList13);
        org.junit.Assert.assertNotNull(paymentRecordList14);
        org.junit.Assert.assertNotNull(paymentRecordList15);
        org.junit.Assert.assertNotNull(paymentRecordList16);
        org.junit.Assert.assertNotNull(paymentRecordList17);
        org.junit.Assert.assertNotNull(paymentRecordList18);
        org.junit.Assert.assertNotNull(paymentRecordList19);
    }

    @Test
    public void test0486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PaymentTest0.test0486");
        InvoiceStorage invoiceStorage0 = null;
        Payment payment1 = new Payment(invoiceStorage0);
        java.util.List<PaymentRecord> paymentRecordList2 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList3 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList4 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList5 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList6 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList7 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList8 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList9 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList10 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList11 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList12 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList13 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList14 = payment1.getPaymentRecords();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean16 = payment1.payByCash((int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"InvoiceStorage.getInvoice(int)\" because \"this.invoiceStorage\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(paymentRecordList2);
        org.junit.Assert.assertNotNull(paymentRecordList3);
        org.junit.Assert.assertNotNull(paymentRecordList4);
        org.junit.Assert.assertNotNull(paymentRecordList5);
        org.junit.Assert.assertNotNull(paymentRecordList6);
        org.junit.Assert.assertNotNull(paymentRecordList7);
        org.junit.Assert.assertNotNull(paymentRecordList8);
        org.junit.Assert.assertNotNull(paymentRecordList9);
        org.junit.Assert.assertNotNull(paymentRecordList10);
        org.junit.Assert.assertNotNull(paymentRecordList11);
        org.junit.Assert.assertNotNull(paymentRecordList12);
        org.junit.Assert.assertNotNull(paymentRecordList13);
        org.junit.Assert.assertNotNull(paymentRecordList14);
    }

    @Test
    public void test0487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PaymentTest0.test0487");
        InvoiceStorage invoiceStorage0 = null;
        Payment payment1 = new Payment(invoiceStorage0);
        java.util.List<PaymentRecord> paymentRecordList2 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList3 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList4 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList5 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList6 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList7 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList8 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList9 = payment1.getPaymentRecords();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean14 = payment1.payByCard((int) (byte) -1, "", "hi!", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"InvoiceStorage.getInvoice(int)\" because \"this.invoiceStorage\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(paymentRecordList2);
        org.junit.Assert.assertNotNull(paymentRecordList3);
        org.junit.Assert.assertNotNull(paymentRecordList4);
        org.junit.Assert.assertNotNull(paymentRecordList5);
        org.junit.Assert.assertNotNull(paymentRecordList6);
        org.junit.Assert.assertNotNull(paymentRecordList7);
        org.junit.Assert.assertNotNull(paymentRecordList8);
        org.junit.Assert.assertNotNull(paymentRecordList9);
    }

    @Test
    public void test0488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PaymentTest0.test0488");
        InvoiceStorage invoiceStorage0 = null;
        Payment payment1 = new Payment(invoiceStorage0);
        java.util.List<PaymentRecord> paymentRecordList2 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList3 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList4 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList5 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList6 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList7 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList8 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList9 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList10 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList11 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList12 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList13 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList14 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList15 = payment1.getPaymentRecords();
        java.lang.Class<?> wildcardClass16 = paymentRecordList15.getClass();
        org.junit.Assert.assertNotNull(paymentRecordList2);
        org.junit.Assert.assertNotNull(paymentRecordList3);
        org.junit.Assert.assertNotNull(paymentRecordList4);
        org.junit.Assert.assertNotNull(paymentRecordList5);
        org.junit.Assert.assertNotNull(paymentRecordList6);
        org.junit.Assert.assertNotNull(paymentRecordList7);
        org.junit.Assert.assertNotNull(paymentRecordList8);
        org.junit.Assert.assertNotNull(paymentRecordList9);
        org.junit.Assert.assertNotNull(paymentRecordList10);
        org.junit.Assert.assertNotNull(paymentRecordList11);
        org.junit.Assert.assertNotNull(paymentRecordList12);
        org.junit.Assert.assertNotNull(paymentRecordList13);
        org.junit.Assert.assertNotNull(paymentRecordList14);
        org.junit.Assert.assertNotNull(paymentRecordList15);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PaymentTest0.test0489");
        InvoiceStorage invoiceStorage0 = null;
        Payment payment1 = new Payment(invoiceStorage0);
        java.util.List<PaymentRecord> paymentRecordList2 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList3 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList4 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList5 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList6 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList7 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList8 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList9 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList10 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList11 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList12 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList13 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList14 = payment1.getPaymentRecords();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean17 = payment1.payOnline(100, "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"InvoiceStorage.getInvoice(int)\" because \"this.invoiceStorage\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(paymentRecordList2);
        org.junit.Assert.assertNotNull(paymentRecordList3);
        org.junit.Assert.assertNotNull(paymentRecordList4);
        org.junit.Assert.assertNotNull(paymentRecordList5);
        org.junit.Assert.assertNotNull(paymentRecordList6);
        org.junit.Assert.assertNotNull(paymentRecordList7);
        org.junit.Assert.assertNotNull(paymentRecordList8);
        org.junit.Assert.assertNotNull(paymentRecordList9);
        org.junit.Assert.assertNotNull(paymentRecordList10);
        org.junit.Assert.assertNotNull(paymentRecordList11);
        org.junit.Assert.assertNotNull(paymentRecordList12);
        org.junit.Assert.assertNotNull(paymentRecordList13);
        org.junit.Assert.assertNotNull(paymentRecordList14);
    }

    @Test
    public void test0490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PaymentTest0.test0490");
        InvoiceStorage invoiceStorage0 = null;
        Payment payment1 = new Payment(invoiceStorage0);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean6 = payment1.payByCard((int) (short) 10, "hi!", "", "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"InvoiceStorage.getInvoice(int)\" because \"this.invoiceStorage\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PaymentTest0.test0491");
        InvoiceStorage invoiceStorage0 = null;
        Payment payment1 = new Payment(invoiceStorage0);
        java.util.List<PaymentRecord> paymentRecordList2 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList3 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList4 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList5 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList6 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList7 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList8 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList9 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList10 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList11 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList12 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList13 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList14 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList15 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList16 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList17 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList18 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList19 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList20 = payment1.getPaymentRecords();
        java.lang.Class<?> wildcardClass21 = paymentRecordList20.getClass();
        org.junit.Assert.assertNotNull(paymentRecordList2);
        org.junit.Assert.assertNotNull(paymentRecordList3);
        org.junit.Assert.assertNotNull(paymentRecordList4);
        org.junit.Assert.assertNotNull(paymentRecordList5);
        org.junit.Assert.assertNotNull(paymentRecordList6);
        org.junit.Assert.assertNotNull(paymentRecordList7);
        org.junit.Assert.assertNotNull(paymentRecordList8);
        org.junit.Assert.assertNotNull(paymentRecordList9);
        org.junit.Assert.assertNotNull(paymentRecordList10);
        org.junit.Assert.assertNotNull(paymentRecordList11);
        org.junit.Assert.assertNotNull(paymentRecordList12);
        org.junit.Assert.assertNotNull(paymentRecordList13);
        org.junit.Assert.assertNotNull(paymentRecordList14);
        org.junit.Assert.assertNotNull(paymentRecordList15);
        org.junit.Assert.assertNotNull(paymentRecordList16);
        org.junit.Assert.assertNotNull(paymentRecordList17);
        org.junit.Assert.assertNotNull(paymentRecordList18);
        org.junit.Assert.assertNotNull(paymentRecordList19);
        org.junit.Assert.assertNotNull(paymentRecordList20);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test0492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PaymentTest0.test0492");
        InvoiceStorage invoiceStorage0 = null;
        Payment payment1 = new Payment(invoiceStorage0);
        java.util.List<PaymentRecord> paymentRecordList2 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList3 = payment1.getPaymentRecords();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean8 = payment1.payByCard((int) (short) 100, "hi!", "hi!", "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"InvoiceStorage.getInvoice(int)\" because \"this.invoiceStorage\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(paymentRecordList2);
        org.junit.Assert.assertNotNull(paymentRecordList3);
    }

    @Test
    public void test0493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PaymentTest0.test0493");
        InvoiceStorage invoiceStorage0 = null;
        Payment payment1 = new Payment(invoiceStorage0);
        java.util.List<PaymentRecord> paymentRecordList2 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList3 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList4 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList5 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList6 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList7 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList8 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList9 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList10 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList11 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList12 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList13 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList14 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList15 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList16 = payment1.getPaymentRecords();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean21 = payment1.payByCard(10, "", "hi!", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"InvoiceStorage.getInvoice(int)\" because \"this.invoiceStorage\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(paymentRecordList2);
        org.junit.Assert.assertNotNull(paymentRecordList3);
        org.junit.Assert.assertNotNull(paymentRecordList4);
        org.junit.Assert.assertNotNull(paymentRecordList5);
        org.junit.Assert.assertNotNull(paymentRecordList6);
        org.junit.Assert.assertNotNull(paymentRecordList7);
        org.junit.Assert.assertNotNull(paymentRecordList8);
        org.junit.Assert.assertNotNull(paymentRecordList9);
        org.junit.Assert.assertNotNull(paymentRecordList10);
        org.junit.Assert.assertNotNull(paymentRecordList11);
        org.junit.Assert.assertNotNull(paymentRecordList12);
        org.junit.Assert.assertNotNull(paymentRecordList13);
        org.junit.Assert.assertNotNull(paymentRecordList14);
        org.junit.Assert.assertNotNull(paymentRecordList15);
        org.junit.Assert.assertNotNull(paymentRecordList16);
    }

    @Test
    public void test0494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PaymentTest0.test0494");
        InvoiceStorage invoiceStorage0 = null;
        Payment payment1 = new Payment(invoiceStorage0);
        java.util.List<PaymentRecord> paymentRecordList2 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList3 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList4 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList5 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList6 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList7 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList8 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList9 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList10 = payment1.getPaymentRecords();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean15 = payment1.payByCard((int) (short) 10, "", "hi!", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"InvoiceStorage.getInvoice(int)\" because \"this.invoiceStorage\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(paymentRecordList2);
        org.junit.Assert.assertNotNull(paymentRecordList3);
        org.junit.Assert.assertNotNull(paymentRecordList4);
        org.junit.Assert.assertNotNull(paymentRecordList5);
        org.junit.Assert.assertNotNull(paymentRecordList6);
        org.junit.Assert.assertNotNull(paymentRecordList7);
        org.junit.Assert.assertNotNull(paymentRecordList8);
        org.junit.Assert.assertNotNull(paymentRecordList9);
        org.junit.Assert.assertNotNull(paymentRecordList10);
    }

    @Test
    public void test0495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PaymentTest0.test0495");
        InvoiceStorage invoiceStorage0 = null;
        Payment payment1 = new Payment(invoiceStorage0);
        java.util.List<PaymentRecord> paymentRecordList2 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList3 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList4 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList5 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList6 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList7 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList8 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList9 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList10 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList11 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList12 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList13 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList14 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList15 = payment1.getPaymentRecords();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean17 = payment1.payByCash(1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"InvoiceStorage.getInvoice(int)\" because \"this.invoiceStorage\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(paymentRecordList2);
        org.junit.Assert.assertNotNull(paymentRecordList3);
        org.junit.Assert.assertNotNull(paymentRecordList4);
        org.junit.Assert.assertNotNull(paymentRecordList5);
        org.junit.Assert.assertNotNull(paymentRecordList6);
        org.junit.Assert.assertNotNull(paymentRecordList7);
        org.junit.Assert.assertNotNull(paymentRecordList8);
        org.junit.Assert.assertNotNull(paymentRecordList9);
        org.junit.Assert.assertNotNull(paymentRecordList10);
        org.junit.Assert.assertNotNull(paymentRecordList11);
        org.junit.Assert.assertNotNull(paymentRecordList12);
        org.junit.Assert.assertNotNull(paymentRecordList13);
        org.junit.Assert.assertNotNull(paymentRecordList14);
        org.junit.Assert.assertNotNull(paymentRecordList15);
    }

    @Test
    public void test0496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PaymentTest0.test0496");
        InvoiceStorage invoiceStorage0 = null;
        Payment payment1 = new Payment(invoiceStorage0);
        java.util.List<PaymentRecord> paymentRecordList2 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList3 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList4 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList5 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList6 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList7 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList8 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList9 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList10 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList11 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList12 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList13 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList14 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList15 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList16 = payment1.getPaymentRecords();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean21 = payment1.payByCard((int) (byte) -1, "", "", "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"InvoiceStorage.getInvoice(int)\" because \"this.invoiceStorage\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(paymentRecordList2);
        org.junit.Assert.assertNotNull(paymentRecordList3);
        org.junit.Assert.assertNotNull(paymentRecordList4);
        org.junit.Assert.assertNotNull(paymentRecordList5);
        org.junit.Assert.assertNotNull(paymentRecordList6);
        org.junit.Assert.assertNotNull(paymentRecordList7);
        org.junit.Assert.assertNotNull(paymentRecordList8);
        org.junit.Assert.assertNotNull(paymentRecordList9);
        org.junit.Assert.assertNotNull(paymentRecordList10);
        org.junit.Assert.assertNotNull(paymentRecordList11);
        org.junit.Assert.assertNotNull(paymentRecordList12);
        org.junit.Assert.assertNotNull(paymentRecordList13);
        org.junit.Assert.assertNotNull(paymentRecordList14);
        org.junit.Assert.assertNotNull(paymentRecordList15);
        org.junit.Assert.assertNotNull(paymentRecordList16);
    }

    @Test
    public void test0497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PaymentTest0.test0497");
        InvoiceStorage invoiceStorage0 = null;
        Payment payment1 = new Payment(invoiceStorage0);
        java.util.List<PaymentRecord> paymentRecordList2 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList3 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList4 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList5 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList6 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList7 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList8 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList9 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList10 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList11 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList12 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList13 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList14 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList15 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList16 = payment1.getPaymentRecords();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean19 = payment1.payOnline((int) 'a', "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"InvoiceStorage.getInvoice(int)\" because \"this.invoiceStorage\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(paymentRecordList2);
        org.junit.Assert.assertNotNull(paymentRecordList3);
        org.junit.Assert.assertNotNull(paymentRecordList4);
        org.junit.Assert.assertNotNull(paymentRecordList5);
        org.junit.Assert.assertNotNull(paymentRecordList6);
        org.junit.Assert.assertNotNull(paymentRecordList7);
        org.junit.Assert.assertNotNull(paymentRecordList8);
        org.junit.Assert.assertNotNull(paymentRecordList9);
        org.junit.Assert.assertNotNull(paymentRecordList10);
        org.junit.Assert.assertNotNull(paymentRecordList11);
        org.junit.Assert.assertNotNull(paymentRecordList12);
        org.junit.Assert.assertNotNull(paymentRecordList13);
        org.junit.Assert.assertNotNull(paymentRecordList14);
        org.junit.Assert.assertNotNull(paymentRecordList15);
        org.junit.Assert.assertNotNull(paymentRecordList16);
    }

    @Test
    public void test0498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PaymentTest0.test0498");
        InvoiceStorage invoiceStorage0 = null;
        Payment payment1 = new Payment(invoiceStorage0);
        java.util.List<PaymentRecord> paymentRecordList2 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList3 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList4 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList5 = payment1.getPaymentRecords();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean7 = payment1.payByCash((int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"InvoiceStorage.getInvoice(int)\" because \"this.invoiceStorage\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(paymentRecordList2);
        org.junit.Assert.assertNotNull(paymentRecordList3);
        org.junit.Assert.assertNotNull(paymentRecordList4);
        org.junit.Assert.assertNotNull(paymentRecordList5);
    }

    @Test
    public void test0499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PaymentTest0.test0499");
        InvoiceStorage invoiceStorage0 = null;
        Payment payment1 = new Payment(invoiceStorage0);
        java.util.List<PaymentRecord> paymentRecordList2 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList3 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList4 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList5 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList6 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList7 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList8 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList9 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList10 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList11 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList12 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList13 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList14 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList15 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList16 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList17 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList18 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList19 = payment1.getPaymentRecords();
        java.lang.Class<?> wildcardClass20 = paymentRecordList19.getClass();
        org.junit.Assert.assertNotNull(paymentRecordList2);
        org.junit.Assert.assertNotNull(paymentRecordList3);
        org.junit.Assert.assertNotNull(paymentRecordList4);
        org.junit.Assert.assertNotNull(paymentRecordList5);
        org.junit.Assert.assertNotNull(paymentRecordList6);
        org.junit.Assert.assertNotNull(paymentRecordList7);
        org.junit.Assert.assertNotNull(paymentRecordList8);
        org.junit.Assert.assertNotNull(paymentRecordList9);
        org.junit.Assert.assertNotNull(paymentRecordList10);
        org.junit.Assert.assertNotNull(paymentRecordList11);
        org.junit.Assert.assertNotNull(paymentRecordList12);
        org.junit.Assert.assertNotNull(paymentRecordList13);
        org.junit.Assert.assertNotNull(paymentRecordList14);
        org.junit.Assert.assertNotNull(paymentRecordList15);
        org.junit.Assert.assertNotNull(paymentRecordList16);
        org.junit.Assert.assertNotNull(paymentRecordList17);
        org.junit.Assert.assertNotNull(paymentRecordList18);
        org.junit.Assert.assertNotNull(paymentRecordList19);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test0500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PaymentTest0.test0500");
        InvoiceStorage invoiceStorage0 = null;
        Payment payment1 = new Payment(invoiceStorage0);
        java.util.List<PaymentRecord> paymentRecordList2 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList3 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList4 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList5 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList6 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList7 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList8 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList9 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList10 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList11 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList12 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList13 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList14 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList15 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList16 = payment1.getPaymentRecords();
        java.util.List<PaymentRecord> paymentRecordList17 = payment1.getPaymentRecords();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean22 = payment1.payByCard((int) (byte) -1, "", "", "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"InvoiceStorage.getInvoice(int)\" because \"this.invoiceStorage\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(paymentRecordList2);
        org.junit.Assert.assertNotNull(paymentRecordList3);
        org.junit.Assert.assertNotNull(paymentRecordList4);
        org.junit.Assert.assertNotNull(paymentRecordList5);
        org.junit.Assert.assertNotNull(paymentRecordList6);
        org.junit.Assert.assertNotNull(paymentRecordList7);
        org.junit.Assert.assertNotNull(paymentRecordList8);
        org.junit.Assert.assertNotNull(paymentRecordList9);
        org.junit.Assert.assertNotNull(paymentRecordList10);
        org.junit.Assert.assertNotNull(paymentRecordList11);
        org.junit.Assert.assertNotNull(paymentRecordList12);
        org.junit.Assert.assertNotNull(paymentRecordList13);
        org.junit.Assert.assertNotNull(paymentRecordList14);
        org.junit.Assert.assertNotNull(paymentRecordList15);
        org.junit.Assert.assertNotNull(paymentRecordList16);
        org.junit.Assert.assertNotNull(paymentRecordList17);
    }
}

