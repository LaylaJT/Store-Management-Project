public class Customer {
  private String name;

  // parameterized
  public Customer(String name) {
    this.name = name;
  }

  // accessor
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  // purchased clothing
  public void purchaseItem(BasketballClothes item) {
    System.out.println(" ");
    System.out.println(name + ", you have successfully purchased the item!");
    
   } 
}