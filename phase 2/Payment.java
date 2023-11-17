import java.util.Scanner;

class Payment {
    // Represents the total bill amount and the amount received for payment.
    private double totalBill;
    private double receivedAmount;

    // Constructor initializes the Payment object with the total bill amount.
    public Payment(double totalBill) {
        this.totalBill = totalBill;
        this.receivedAmount = 0;
    }

    // Allows the user to select a payment method (Cash, Online, or Credit Card) and invokes the corresponding payment method.
    public void pay() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Select a payment method:");
        System.out.println("1. Cash");
        System.out.println("2. Online");
        System.out.println("3. Credit Card");

        int choice = scanner.nextInt();
        switch (choice) {
            case 1:
                payByCash();
                break;
            case 2:
                payOnline();
                break;
            case 3:
                payByCreditCard();
                break;
            default:
                System.out.println("Invalid choice.");
        }
    }

    // Prompts the user to enter the payment amount and returns it.
    public double getAmount() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the amount to pay: ");
        return scanner.nextDouble();
    }

    // Adds the given payment amount to the total received amount.
    public void addPayment(double payment) {
        receivedAmount += payment;
    }

    // Prints a receipt with details of the payment, including total bill, received amount, and change.
    public void returnReceipt() {
        double change = receivedAmount - totalBill;
        if (change < 0) {
            System.out.println("Amount paid is insufficient. Please pay the remaining amount.");
        } else {
            System.out.println("Payment successful.");
            System.out.println("Total Bill: $" + totalBill);
            System.out.println("Received Amount: $" + receivedAmount);
            System.out.println("Change: $" + change);
            System.out.println("Thank you for your payment.");
        }
    }

    // Processes a cash payment by prompting the user to enter the payment amount.
    private void payByCash() {
        double payment = getAmount();
        addPayment(payment);
        returnReceipt();
    }

    // Processes an online payment by prompting the user to enter credit card details and simulating online payment logic.
    private void payOnline() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter Credit Card Number: ");
        String creditCardNumber = scanner.nextLine();

        System.out.print("Enter Expiration Date (MM/YY): ");
        String expirationDate = scanner.nextLine();

        System.out.print("Enter Cardholder Name: ");
        String cardholderName = scanner.nextLine();

        System.out.print("Enter Card Password: ");
        String cardPassword = scanner.nextLine();

        System.out.println("Processing payment...");

        double payment = getAmount();
        addPayment(payment);
        returnReceipt();
    }

    // Processes a credit card payment at the hotel, simulating credit card payment logic.
    private void payByCreditCard() {
        System.out.println("Paying by Credit Card at the hotel...");
        double payment = getAmount();
        addPayment(payment);
        returnReceipt();
    }

}