import java.util.ArrayList;
import java.util.List;

// Manages payments and records payment methods and amounts
public class Payment {
    private InvoiceStorage invoiceStorage;
    private List<PaymentRecord> paymentRecords;

    // Constructor initializing payment with an associated invoice storage
    public Payment(InvoiceStorage invoiceStorage) {
        this.invoiceStorage = invoiceStorage;
        this.paymentRecords = new ArrayList<>();
    }

    // Processes a card payment for a specific invoice
    public boolean payByCard(int invoiceId, String cardNumber, String expiryDate, String cvv) {
        String cardInfo = String.format("Card no: %s expiry date: %s cvv: %s ", cardNumber, expiryDate, cvv);
        System.out.println("Processing card payment for " + cardInfo);
        Invoice invoice = invoiceStorage.getInvoice(invoiceId);
        paymentRecords.add(new PaymentRecord("Card Payment", invoice.getAmount()));
        invoiceStorage.deleteInvoice(invoiceId);
        return true;
    }

    // Processes a cash payment for a specific invoice
    public boolean payByCash(int invoiceId) {
        System.out.println("Processing cash payment...");
        Invoice invoice = invoiceStorage.getInvoice(invoiceId);
        paymentRecords.add(new PaymentRecord("Cash Payment", invoice.getAmount()));
        invoiceStorage.deleteInvoice(invoiceId);
        return true;
    }

    // Processes an online payment for a specific invoice
    public boolean payOnline(int invoiceId, String paymentGateway) {
        System.out.println("Processing online payment...");
        Invoice invoice = invoiceStorage.getInvoice(invoiceId);
        paymentRecords.add(new PaymentRecord("Online Payment", invoice.getAmount()));
        invoiceStorage.deleteInvoice(invoiceId);
        return true;
    }

    // Retrieves all payment records
    public List<PaymentRecord> getPaymentRecords() {
        return paymentRecords;
    }
}