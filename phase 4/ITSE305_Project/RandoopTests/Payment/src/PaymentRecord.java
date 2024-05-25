// Represents a payment record with a payment method and an amount
public class PaymentRecord {
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