public class Shorts extends BasketballClothes {
  private String length;

  public Shorts() {
    super();
    this.length = " ";
  }

  public Shorts(String brand, String length, double price) {
    super(brand, price);
    this.length = length;
  }

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