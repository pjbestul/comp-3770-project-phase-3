import java.util.Scanner;

public class Menu {
   LibrarySystem system;
   Catalouge catalouge = new Catalouge();
   public Menu() {
      this.system = new LibrarySystem();
   }
   
   public boolean selectOption() {
      Scanner scan = new Scanner(System.in);

      System.out.println("Please make a selection:");
      System.out.println("[1] Check out a book");
      System.out.println("[x] Log out");
      String choice = scan.nextLine();
      
      if(choice.equals("1")) {
         System.out.println("Please type in the title of the item.");
         String title = scan.nextLine();
         CategoryItem checkout = catalouge.findItem(title);
         if(checkout.getTitle().equals("Item Not Found") || checkout.getType().equals("None")){
            System.out.println("Item not found. Returning to menu");
            return false;
         }
         system.checkOut(checkout);
         return false;
      }
      
      else if(choice.equals("x")) {
         System.out.println("Logging out");
         System.out.println("Thank you for using the Library");
         return true;
      }
      
      else{
         System.out.println("Unrecognized input. Please try again");
         return false;
      }
   }
   
   public void openCatalouge(Catalouge catalouge) {
      this.catalouge = catalouge;
   }
}