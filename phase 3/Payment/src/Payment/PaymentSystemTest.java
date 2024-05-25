package Payment;

import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;

public class PaymentSystemTest {

    @Test
    public void payByCard() {
        // Example usage of the simplified payment system
        PaymentSystem.InvoiceStorage invoiceStorage = new PaymentSystem.InvoiceStorage();
        invoiceStorage.addInvoice(new PaymentSystem.Invoice("Room Charge", 100.0));
        invoiceStorage.addInvoice(new PaymentSystem.Invoice("Dinner", 30.0));

        PaymentSystem.Payment payment = new PaymentSystem.Payment(invoiceStorage);

        // Perform payments for invoices
        payment.payByCard(0, "1234567890123456", "12/23", "123");
        payment.payByCard(0, "1234567890123456", "12/23", "123");

        assertEquals(invoiceStorage.getAllInvoices().size(), 0);
        assertEquals(payment.getPaymentRecords().size(), 2);
    }

    @Test
    public void payByCash() {
        // Example usage of the simplified payment system
        PaymentSystem.InvoiceStorage invoiceStorage = new PaymentSystem.InvoiceStorage();
        invoiceStorage.addInvoice(new PaymentSystem.Invoice("Room Charge", 100.0));
        invoiceStorage.addInvoice(new PaymentSystem.Invoice("Dinner", 30.0));

        PaymentSystem.Payment payment = new PaymentSystem.Payment(invoiceStorage);

        // Perform payments for invoices
        payment.payByCash(0);
        payment.payByCash(0);

        assertEquals(invoiceStorage.getAllInvoices().size(), 0);
        assertEquals(payment.getPaymentRecords().size(), 2);
    }

    @Test
    public void payOnline() {
        // Example usage of the simplified payment system
        PaymentSystem.InvoiceStorage invoiceStorage = new PaymentSystem.InvoiceStorage();
        invoiceStorage.addInvoice(new PaymentSystem.Invoice("Room Charge", 100.0));
        invoiceStorage.addInvoice(new PaymentSystem.Invoice("Dinner", 30.0));
        assertEquals(invoiceStorage.getAllInvoices().size(), 2);

        PaymentSystem.Payment payment = new PaymentSystem.Payment(invoiceStorage);
        payment.payOnline(0, "PaymentGatewayXYZ");
        payment.payOnline(0, "PaymentGatewayXYZ");

        assertEquals(invoiceStorage.getAllInvoices().size(), 0);
        assertEquals(payment.getPaymentRecords().size(), 2);
        assertEquals(payment.getPaymentRecords().get(0).getPaymentMethod(), "Online Payment");
        assertEquals(payment.getPaymentRecords().get(1).getPaymentMethod(), "Online Payment");
    }
}