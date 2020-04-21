import java.util.Scanner;
import java.util.ArrayList;

//Use Case #2: Checking Out an Item From the Library
//Author: Paul Bestul
public class Main {
   public static void main(String[] args){
      System.out.println("Welcome to the Library");
      Menu menu = new Menu();
      Catalouge catalouge = new Catalouge();
      menu.openCatalouge(catalouge);
      boolean logout = false;
      while(!logout){
         logout = menu.selectOption();
      }
   }
}

class Menu {
   LibrarySystem system;
   Catalouge catalouge = new Catalouge();
   public Menu() {
      this.system = new LibrarySystem();
   }
   
   //Handles Menu Options.
   //Only does check outs and logging out in this case.
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
   
   //Initiates the catalouge in this use case
   public void openCatalouge(Catalouge catalouge) {
      this.catalouge = catalouge;
   }
}

class Catalouge {
   ArrayList<CategoryItem> items = new ArrayList();
   public Catalouge() {
      addTest();
   }
   
   //Used to test this use case
   public void addTest() {
      CategoryItem item1 = new CategoryItem("Test Book", "Book");
      CategoryItem item2 = new CategoryItem("Test Movie", "Movie");
      CategoryItem item3 = new CategoryItem("Test Device", "Device");
      this.items.add(item1);
      this.items.add(item2);
      this.items.add(item3);
   }
   
   //Searches Catalouge Database for item. Returns dummy item if not found
   public CategoryItem findItem(String title) {
      CategoryItem query = new CategoryItem("Item Not Found", "None");
      for(int i = 0; i < items.size(); i++) {
         if(items.get(i).getTitle().equals(title)) {
            query = items.get(i);
         }
      }
      return query;
   }
}

class LibrarySystem {
   public LibrarySystem(){
   
   }
   
   public Menu openMenu() {
      return new Menu();
   }
   
   //Checks out the selected item
   //Checks to see if item is available for checkout first.   
   public void checkOut(CategoryItem item) {
      if(item.getStatus() == 0){
         item.setStatus(1);
         System.out.println("Item checked out. Returning to menu");
      }
      
      else{
         System.out.println("Item not available for checkout. Returning to menu");
      }
   }
}

class CategoryItem {
   String title;
   String type;
   int status = 0;
   
   public CategoryItem(String title, String type) {
      this.title = title;
      this.type = type;
      this.status = 0;
   }
   
   //Returns title of item
   public String getTitle() {
      return title;
   }
   
   //Returns type of item
   public String getType() {
      return type;
   }
   
   //Returns status of item(checked out/available)
   public int getStatus() {
      return status;
   }
   
   //Tracks whether item is checked out or not.
   //Checked Out = 1
   //Available = 0
   public void setStatus(int state) {
      this.status = state;
   }
}