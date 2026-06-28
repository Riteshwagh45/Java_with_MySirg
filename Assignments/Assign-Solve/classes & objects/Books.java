public class Books{
public static class Book{
      String BookName;
      String AuthorName;
      int price;

      void setBook(String BName , String AName, int Newprice){
          BookName = BName;
         AuthorName = AName;
         price = Newprice;
}
    void showBookDetails(){
     System.out.println("book name: " + BookName);
     System.out.println("Author: "+ AuthorName);
     System.out.println("BookPrice: " + price);
   }
      
}
static class car{
        int carPrice;
        String CarName;
        String owner;

     void setCarDetails(int price, String CName, String Owner){
      carPrice = price;
      CarName = CName;
      owner = Owner;

 }
   void showCar(){
      System.out.println("Price = " +carPrice);
      System.out.println("carname = "+CarName);
      System.out.println("owner = "+owner);
   }

}
static class Employee{
         int Empsalary;
         String EmpName;
         String Jobrole;
}
public static void main(String[] args) {
   //book
   /* 
    Book b1 = new Book();
     b1.setBook("java","ritesh",100);
     b1.showBookDetails();
    b1.setBook("javascript", "shubham", 500);
   b1.showBookDetails();
   */

   //car
   car c = new car();
     c.setCarDetails(5000,"xuv","Ritesh");
     c.showCar();
}
}