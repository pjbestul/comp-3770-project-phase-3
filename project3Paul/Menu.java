import java.util.Scanner;

public class Menu {
   LibrarySystem system;
   public Menu() {
      this.system = new LibrarySystem();
   }
   
   public boolean selectOption() {
      Scanner scan = new Scanner(System.in);
      System.out.println("Welcome to the Library");
      System.out.println("Please make a selection:");
      System.out.println("[1] Check out a book");
      System.out.println("[x] Log out");
      String choice = scan.nextLine();
      
      if(choice.equals("1")) {
         Catalouge catalouge = openCatalouge();
         System.out.println("Please type in the title of the item.");
         String title = scan.nextLine();
         CategoryItem checkout = catalouge.findItem(title);
         system.checkOut(checkout);
         return false;
      }
      
      else if(choice.equals("x")) {
         return true;
      }
      
      else{
         System.out.println("Unrecognized input. Please try again");
         return false;
      }
   }
   
   public Catalouge openCatalouge() {
      return new Catalouge();
   }
}