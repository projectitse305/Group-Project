package Payment;

import java.util.ArrayList;
import java.util.List;

class PaymentSystem {

    // InvoiceStorage class manages storage of invoices
    public static class InvoiceStorage {
        private List<Invoice> invoices;

        // Constructor initializes an empty list of invoices
        public InvoiceStorage() {
            this.invoices = new ArrayList<>();
        }

        // Add a single invoice to the storage
        public void addInvoice(Invoice invoice) {
            invoices.add(invoice);
        }

        // Add a list of invoices to the storage
        public void addAllInvoices(List<Invoice> invoices) {
            this.invoices.addAll(invoices);
        }

        // Get a specific invoice based on index
        public Invoice getInvoice(int index) {
            return invoices.get(index);
        }

        // Get all invoices in the storage
        public List<Invoice> getAllInvoices() {
            return invoices;
        }

        // Delete a specific invoice based on index
        public void deleteInvoice(int index) {
            invoices.remove(index);
        }
    }

    // Invoice class represents an invoice with description and amount
    public static class Invoice {
        private String description;
        private double amount;

        // Constructor initializes an invoice with description and amount
        public Invoice(String description, double amount) {
            this.description = description;
            this.amount = amount;
        }

        // Get the amount of the invoice
        public double getAmount() {
            return amount;
        }
    }

    // Payment class handles payments, including card, cash, and online payments
    public static class Payment {
        private InvoiceStorage invoiceStorage;
        private List<PaymentRecord> paymentRecords;

        // Constructor initializes Payment with a specific InvoiceStorage
        public Payment(InvoiceStorage invoiceStorage) {
            this.invoiceStorage = invoiceStorage;
            this.paymentRecords = new ArrayList<>();
        }

        // Process a card payment for a specific invoice
        public boolean payByCard(int invoiceId, String cardNumber, String expiryDate, String cvv) {
            // Payment processing logic for card payment
            // ...

            return true;
        }

        // Process a cash payment for a specific invoice
        public boolean payByCash(int invoiceId) {
            // Payment processing logic for cash payment
            // ...

            return true;
        }

        // Process an online payment for a specific invoice
        public boolean payOnline(int invoiceId, String paymentGateway) {
            // Payment processing logic for online payment
            // ...

            return true;
        }

        // Get a list of payment records
        public List<PaymentRecord> getPaymentRecords() {
            return paymentRecords;
        }
    }

    // PaymentRecord class represents a payment record with payment method and amount
    public static class PaymentRecord {
        private String paymentMethod;
        private double amount;

        // Constructor initializes a PaymentRecord with payment method and amount
        public PaymentRecord(String paymentMethod, double amount) {
            this.paymentMethod = paymentMethod;
            this.amount = amount;
        }

        // Get the payment method
        public String getPaymentMethod() {
            return paymentMethod;
        }

        // Get the amount of the payment
        public double getAmount() {
            return amount;
        }
    }
}
