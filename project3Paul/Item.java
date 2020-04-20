public class CategoryItem {
   String title;
   String type;
   int status = 0;
   public CategoryItem() {
      this.status = 0;
   }
   
   public CategoryItem(String title, String type) {
      this.title = title;
      this.type = type;
      this.status = 0;
   }
   
   public String getTitle() {
      return title;
   }
   
   public String getType() {
      return type;
   }
   
   public int getStatus() {
      return status;
   }
   
   public void checkOut() {
      this.status = 1;
   }
}