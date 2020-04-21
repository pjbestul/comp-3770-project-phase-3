public class LibrarySystem {
   public LibrarySystem(){
   
   }
   
   public Menu openMenu() {
      return new Menu();
   }
   
      
   public void checkOut(CategoryItem item) {
      item.setStatus(1);
   }
}