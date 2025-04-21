package homework1;

public class TaxCalculator {
    public static void main(String[] args) {
        double price = 5.69;
        double tax = 1.99;
        int quantity = 98;
        double total = price * quantity * tax;
        String message = "I want to buy " + quantity + " shirt!";
        System.out.println(message);
        System.out.println("Total cost with tax is: " + total);
    }
}