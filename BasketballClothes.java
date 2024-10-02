public class BasketballClothes {
  
// Instance Variables
  private String brand;
  private double price;

// No Argument
public BasketballClothes() {
}
  

// Parametertized
  public BasketballClothes(String brand, double price) {
    this.brand = brand;
    this.price = price;
  }


  
// Accessor and Mutator Methods
  public String getBrand() {
  return brand;
}
  
  public void setBrand(String brand) {
    this.brand = brand;
  }

  public double getPrice() {
  return price;
}
  
  public void setPrice(double price) {
    this.price = price;
   }
}