package homework15;

public class Invoice {
   private String model;
   private String description;
   private int sales;
   private double price;

   public Invoice(String model, String description, int sales, double price) {
     this.model = model;
   this.description =description;
   setSales(sales);
  setPrice(price);
   }

   public String getModel() {
      return model;
   }
   public void setModel(String model) {
      this.model = model;
   }


   public String getDescription() {
      return description;
   }
   public void setDescription(String description) {
      this.description = description;
   }


   public int getSales() {
      return sales;
   }
   public void setSales(int sales) {
      this.sales = (sales > 0) ? sales : 0;
   }


   public double getPrice() {
      return price;
   }
   public void setPrice(double price) {
      this.price = (price > 0.00) ? price : 0.00;
   }


   public double getAmount() {
      return sales * price;
   }



}
