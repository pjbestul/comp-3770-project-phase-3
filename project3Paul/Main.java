import java.util.Scanner;

public class Main {
   public static void main(String[] args){
      Menu menu = new Menu();
      Scanner scan = new Scanner(System.in);
      System.out.println("Welcome to the Library");
      System.out.println("Please make a selection:");
      System.out.println("{1}Check out a book");
      
      String choice = scan.nextLine();
      if(choice.equals("1")) {
         Catalouge catalouge = menu.openCatalouge();
         System.out.println("Please type in the title of the item.");
         String title = scan.nextLine();
         catalouge.findItem(title);
      }
   }
}