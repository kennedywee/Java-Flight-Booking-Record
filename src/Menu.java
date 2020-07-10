import java.text.DecimalFormat;
class Menu{
   String item;
   double price;
   
   public String getitem(){
      return this.item;
   }
   
   public double getprice(){
      return this.price;
   }
   
   Menu(){
      this.item = "";
      this.price = 0;
   }
   Menu(String item, double price){
      this.item = item;
      this.price = price;
   }
   
   DecimalFormat df = new DecimalFormat("#.00");
   
   public void printItem(){
      System.out.println(item + " [RM" + df.format(price) + "]");
   }
}