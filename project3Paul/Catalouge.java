import java.util.List;

public class Catalouge {
   List items;
   public Catalouge() {
      items.add(new CategoryItem("Test Book", "Book"));
      items.add(new CategoryItem("Test Movie", "Movie"));
      items.add(new CategoryItem("Test Device", "Device"));
   }
   
   public Item findItem(String title) {
      return null;
   }
}