public class Shorts extends BasketballClothes {
  private String length;

    // No argument
  public Shorts() {
    super();
    this.length = " ";
  }

  // parameterized
  public Shorts(String brand, String length, double price) {
    super(brand, price);
    this.length = length;
  }

// accessor and mutator
  public String getLength() {
    return length;
  }

  public void setLength(String length){
    this.length = length;
  }

// toString override
  public String toString() {
    return getBrand() + " Shorts - Length: " + length + ", Price: $" + getPrice();
   }
}