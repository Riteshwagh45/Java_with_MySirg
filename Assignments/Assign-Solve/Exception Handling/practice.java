import java.util.Scanner;
public class practice {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

            System.out.println("Enter a two numbers : ");
            int a = sc.nextInt();
            int b = sc.nextInt();

            //throw the exception by me 
            if(b == 0){
                throw new ArithmeticException("we cant divide by zero");
            }
            
            int result = a / b;
            System.out.println("dividation = "+result);
        
 
            
      //  catch(ArithmeticException e ){
          //System.out.println(e.getMessage());
     //  }

        //catch(Exception e ){
           //System.out.println("Invalid input you have typed :");
       // }

        System.out.println("Enter a number:");
        int s = sc.nextInt();
        System.out.println("sqaure is = "+s*s);
        
       
    }
}