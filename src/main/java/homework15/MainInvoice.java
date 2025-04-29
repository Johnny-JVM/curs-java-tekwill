package homework15;

public class MainInvoice {
    public static void main(String[] args) {
Invoice invoice = new Invoice("microwave", "bla bla bla", -347, -234.99);

        System.out.println("Счёт-фактура:");
        System.out.println("Model: " + invoice.getModel() + "\n" +
                "Description: " + invoice.getDescription() + "\n" +
                "Sales: " + invoice.getSales() + "\n" +
                "Price: " + invoice.getPrice() + "\n" +
                "Amount in Bank: " + invoice.getAmount()
        );


    }
}
