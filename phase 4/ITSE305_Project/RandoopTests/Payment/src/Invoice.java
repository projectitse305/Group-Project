// Represents an invoice with a description and an amount
public class Invoice {
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