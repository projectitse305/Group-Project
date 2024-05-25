package Payment;

import java.util.ArrayList;
import java.util.List;

class PaymentSystem {

    // Manages storage and operations related to invoices
    public static class InvoiceStorage {
        private List<Invoice> invoices;

        // Constructor initializing the list of invoices
        public InvoiceStorage() {
            this.invoices = new ArrayList<>();
        }

        // Adds a single invoice to the storage
        public void addInvoice(Invoice invoice) {
            invoices.add(invoice);
        }

        // Adds a list of invoices to the storage
        public void addAllInvoices(List<Invoice> invoices) {
            this.invoices.addAll(invoices);
        }

        // Retrieves a specific invoice by index
        public Invoice getInvoice(int index) {
            return invoices.get(index);
        }

        // Retrieves all invoices in the storage
        public List<Invoice> getAllInvoices() {
            return invoices;
        }

        // Deletes an invoice from the storage by index
        public void deleteInvoice(int index) {
            invoices.remove(index);
        }
    }

    // Represents an invoice with a description and an amount
    public static class Invoice {
        private String description;
        private double amount;

        // Constructor initializing invoice with a description and an amount
        public Invoice(String description, double amount) {
            this.description = description;
            this.amount = amount;
        }

        // Retrieves the amount of the invoice
        public double getAmount() {
            return amount;
        }
    }

    // Manages payments and records payment methods and amounts
    public static class Payment {
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

    // Represents a payment record with a payment method and an amount
    public static class PaymentRecord {
        private String paymentMethod;
        private double amount;

        // Constructor initializing payment record with a payment method and an amount
        public PaymentRecord(String paymentMethod, double amount) {
            this.paymentMethod = paymentMethod;
            this.amount = amount;
        }

        // Retrieves the payment method
        public String getPaymentMethod() {
            return paymentMethod;
        }

        // Retrieves the amount of the payment
        public double getAmount() {
            return amount;
        }
    }
}
