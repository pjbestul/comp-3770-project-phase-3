import java.util.ArrayList;

public class Catalouge {
   ArrayList<CategoryItem> items = new ArrayList();
   public Catalouge() {
      addTest();
   }
   
   public void addTest() {
      CategoryItem item1 = new CategoryItem("Test Book", "Book");
      CategoryItem item2 = new CategoryItem("Test Movie", "Movie");
      CategoryItem item3 = new CategoryItem("Test Device", "Device");
      this.items.add(item1);
      this.items.add(item2);
      this.items.add(item3);
   }
   
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