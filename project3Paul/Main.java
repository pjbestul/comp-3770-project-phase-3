import java.util.Scanner;

public class Main {
   public static void main(String[] args){
      Menu menu = new Menu();
      boolean logout = false;
      while(!logout){
         logout = menu.selectOption();
      }
   }
}