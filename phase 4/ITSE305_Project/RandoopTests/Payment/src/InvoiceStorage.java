import java.util.ArrayList;
import java.util.List;

// Manages storage and operations related to invoices
public class InvoiceStorage {
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