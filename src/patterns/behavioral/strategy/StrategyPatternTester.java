package patterns.behavioral.strategy;

public class StrategyPatternTester {

    public static void main(String[] args) {
        // Create a shopping cart
        ShoppingCart cart = new ShoppingCart();

        // Set payment strategy to Credit Card
        PaymentStrategy creditCardPayment = new CreditCardPayment("1234-5678-9876-5432", "John Doe", "12/35");
        cart.setPaymentStrategy(creditCardPayment);
        cart.checkout(100.0);

        // Set payment strategy to UPI
        System.out.println();
        PaymentStrategy upiPayment = new UPIPayment("john.doe@upi");
        cart.setPaymentStrategy(upiPayment);
        cart.checkout(200.0);

        // Attempt checkout without a payment strategy
        System.out.println();
        cart.setPaymentStrategy(null);
        cart.checkout(50.0);
    }
}
