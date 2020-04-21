import java.util.Scanner;

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