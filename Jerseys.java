public class Jerseys extends BasketballClothes {
  private String size;

  // No argument
  public Jerseys() {
    super();
    this.size = " ";
  }

  // parameterized
  public Jerseys(String brand, String size, double price) {
    super(brand, price);
    this.size = size;
  }
// accessor and mutator
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