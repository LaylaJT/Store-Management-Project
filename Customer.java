public class Customer {
  private String name;

  public Customer(String name) {
    this.name = name;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public void purchaseItem(BasketballClothes item) {
    System.out.println(" ");
    System.out.println(name + ", you have successfully purchased the item!");
    
   } 
}