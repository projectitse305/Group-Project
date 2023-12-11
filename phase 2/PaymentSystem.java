package Payment;

import java.util.ArrayList;
import java.util.List;

class PaymentSystem {

    public static class InvoiceStorage {
        private List<Invoice> invoices;

        public InvoiceStorage() {
            this.invoices = new ArrayList<>();
        }


        public void addInvoice(Invoice invoice) {
            invoices.add(invoice);
        }

        public void addAllInvoices(List<Invoice> invoices) {
            invoices.addAll(invoices);
        }

        public Invoice getInvoice(int index) {
            return invoices.get(index);
        }

        public List<Invoice> getAllInvoices() {
            return invoices;
        }

        public void deleteInvoice(int index) {
            invoices.remove(index);
        }
    }

    public static class Invoice {
        private String description;
        private double amount;

        public Invoice(String description, double amount) {
            this.description = description;
            this.amount = amount;
        }

        public double getAmount() {
            return amount;
        }
    }

    public static class Payment {
        private InvoiceStorage invoiceStorage;
        private List<PaymentRecord> paymentRecords;

        public Payment(InvoiceStorage invoiceStorage) {
            this.invoiceStorage = invoiceStorage;
            this.paymentRecords = new ArrayList<>();
        }

        public boolean payByCard(int invoiceId, String cardNumber, String expiryDate, String cvv) {
            String cardInfo = String.format("Card no: %s expiry date: %s cvv: %s ", cardNumber, expiryDate, cvv);
            System.out.println("Processing card payment for " + cardInfo);
            Invoice invoice = invoiceStorage.getInvoice(invoiceId);
            paymentRecords.add(new PaymentRecord("Card Payment", invoice.getAmount()));
            invoiceStorage.deleteInvoice(invoiceId);
            return true;
        }

        public boolean payByCash(int invoiceId) {
            System.out.println("Processing cash payment...");
            Invoice invoice = invoiceStorage.getInvoice(invoiceId);
            paymentRecords.add(new PaymentRecord("Cash Payment", invoice.getAmount()));
            invoiceStorage.deleteInvoice(invoiceId);
            return true;
        }

        public boolean payOnline(int invoiceId, String paymentGateway) {
            System.out.println("Processing online payment...");
            Invoice invoice = invoiceStorage.getInvoice(invoiceId);
            paymentRecords.add(new PaymentRecord("Online Payment", invoice.getAmount()));
            invoiceStorage.deleteInvoice(invoiceId);
            return true;
        }

        public List<PaymentRecord> getPaymentRecords() {

            return paymentRecords;
        }
    }

    public static class PaymentRecord {
        private String paymentMethod;
        private double amount;

        public PaymentRecord(String paymentMethod, double amount) {
            this.paymentMethod = paymentMethod;
            this.amount = amount;
        }

        public String getPaymentMethod() {
            return paymentMethod;
        }

        public double getAmount() {
            return amount;
        }
    }
}

