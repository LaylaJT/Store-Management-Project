import java.util.Scanner;

public class Store {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    // create customer
    System.out.print("Please enter your name: ");
    String customerName = scanner.nextLine();
    Customer customer = new Customer(customerName);

    // available jerseys
     System.out.println(" ");
     System.out.println("Available Jerseys:");
     System.out.println(" ");
     Jerseys jersey1 = new Jerseys("Adidas", "M", 29.99);
     Jerseys jersey2 = new Jerseys("Adidas", "S", 29.99);
     Jerseys jersey3 = new Jerseys("Nike", "L", 34.99);
     Jerseys jersey4 = new Jerseys("Nike", "XL", 35.99);

     System.out.println(jersey1);
     System.out.println(jersey2);
     System.out.println(jersey3);
     System.out.println(jersey4);

    // purchase jersey
     System.out.println(" ");
     System.out.println("Which jersey would you like to puchase? (Adidas/Nike): ");
     String selectedBrand = scanner.nextLine();     

     System.out.println(" ");
     System.out.println("Enter size (S/M/L/XL): ");
     String selectedSize = scanner.nextLine();
    

     if (selectedBrand.equalsIgnoreCase("Adidas") && selectedSize.equalsIgnoreCase("M")) {
         customer.purchaseItem(jersey1);
     System.out.println(" ");
         System.out.println(customer.getName() + " purchased: " + jersey1.getBrand() + " Size: " + jersey1.getSize());
       
     } else if (selectedBrand.equalsIgnoreCase("Adidas") && selectedSize.equalsIgnoreCase("S")) {
         customer.purchaseItem(jersey2);
     System.out.println(" ");
         System.out.println(customer.getName() + " purchased: " + jersey2.getBrand() + " Size: " + jersey2.getSize());    
       
     } else if (selectedBrand.equalsIgnoreCase("Nike") && selectedSize.equalsIgnoreCase("L")) {
         customer.purchaseItem(jersey3);
     System.out.println(" ");
         System.out.println(customer.getName() + " purchased: " + jersey3.getBrand() + " Size: " + jersey3.getSize());
       
     } else if (selectedBrand.equalsIgnoreCase("Nike") && selectedSize.equalsIgnoreCase("XL")) {
         customer.purchaseItem(jersey4);
     System.out.println(" ");
         System.out.println(customer.getName() + " purchased: " + jersey4.getBrand() + " Size: " + jersey4.getSize());
       
     } else {
         System.out.println("\nSelected item not available.");
         return;
     }

// available shorts
     System.out.println(" ");
     System.out.println("\nAvailable Shorts:");
     System.out.println(" ");
     Shorts shorts1 = new Shorts("Adidas", "Short", 23.99);
     Shorts shorts2 = new Shorts("Adidas", "Long", 24.99);
     Shorts shorts3 = new Shorts("Nike", "Long", 22.99);
     Shorts shorts4 = new Shorts("Nike", "Short", 19.99);

     System.out.println(shorts1);
     System.out.println(shorts2);
     System.out.println(shorts3);
     System.out.println(shorts4);

  // purchase shorts
     System.out.println(" ");
     System.out.println("Which shorts would you like to puchase? (Adidas/Nike): ");
     String selectedShortsBrand = scanner.nextLine();     

     System.out.println(" ");
     System.out.println("Enter length (Short/Long): ");
     String selectedLength = scanner.nextLine();
    

     if (selectedShortsBrand.equalsIgnoreCase("Adidas") && selectedLength.equalsIgnoreCase("Long")) {
         customer.purchaseItem(shorts1);
     System.out.println(" ");
         System.out.println(customer.getName() + " purchased: " + shorts1.getBrand() + " Length: " + shorts1.getLength());
       
     } else if (selectedShortsBrand.equalsIgnoreCase("Adidas") && selectedLength.equalsIgnoreCase("Short")) {
         customer.purchaseItem(shorts2);
     System.out.println(" ");
         System.out.println(customer.getName() + " purchased: " + shorts2.getBrand() + " Length: " + shorts2.getLength());    
       
     } else if (selectedShortsBrand.equalsIgnoreCase("Nike") && selectedLength.equalsIgnoreCase("Long")) {
         customer.purchaseItem(shorts3);
     System.out.println(" ");
         System.out.println(customer.getName() + " purchased: " + shorts3.getBrand() + " Length: " + shorts3.getLength());
       
     } else if (selectedShortsBrand.equalsIgnoreCase("Nike") && selectedLength.equalsIgnoreCase("Short")) {
         customer.purchaseItem(shorts4);
     System.out.println(" ");
         System.out.println(customer.getName() + " purchased: " + shorts4.getBrand() + " Length: " + shorts4.getLength());
       
     } else {
         System.out.println("\nSelected item not available.");   
         return;
     }     

        System.out.println(" ");   

        System.out.println("Thank you for shopping! Have a great rest of your day, goodbye.");   

    scanner.close();
    
   }
}