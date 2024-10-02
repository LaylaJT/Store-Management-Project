public class Jerseys extends BasketballClothes {
  private String size;

  public Jerseys() {
    super();
    this.size = " ";
  }

  public Jerseys(String brand, String size, double price) {
    super(brand, price);
    this.size = size;
  }

  public String getSize() {
    return size;
  }

  public void setSize(String size){
    this.size = size;
  }

// toString override
  public String toString() {
    return getBrand() + " Jersey - Size: " + size + ", Price: $" + getPrice();
   }
}