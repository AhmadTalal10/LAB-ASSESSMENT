public class Product{
  private static String id;
  private static double maxPrice=0 ;
  private static double  minPrice=0;
  private double price;
  private int qtty;
  private static int count=0;
  private String name;

 public Product(String name, double price, int qtty){
   this.name=name;
   this.price=price;
   this.qtty=qtty;
   count++;
   id = String.format("p%03d",count);
     if(price > maxPrice){
     maxPrice=price;
}
    if(price < minPrice ){
     minPrice=price;
}
 else if(minPrice==0){
 minPrice=price;

}
}

   public void displayProduct(){
    System.out.println("Name : " + name);
    System.out.println("Price : " + price);
    System.out.println("MAX price : " + maxPrice);
    System.out.println("MIN price : " + minPrice);
    System.out.println("Quantity : " + qtty);
    System.out.println("ID : " + id);
}
}





    
