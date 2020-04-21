public class LibrarySystem {
   public LibrarySystem(){
   
   }
   
   public Menu openMenu() {
      return new Menu();
   }
   
      
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