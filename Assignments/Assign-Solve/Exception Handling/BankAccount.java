import java.util.*;

class Account{
    private int AccountNo;
    private double balance;

    public Account(int a , double balance){
        AccountNo = a;
        this.balance = balance;
    }

    public void Withdraw(double amount){

        if(balance < amount){
            
            //throw my own exception 
            throw new Insufficient("Insufficient balance");
        }

        balance = balance - amount;
    }

      public void showBalance(){
        System.out.println("Current Balance : "+balance);
    }

}

//user define class for handles the exception
class Insufficient extends ArithmeticException{

    public Insufficient(String s ){
        super(s);
    }

}
public class BankAccount{
    public static void main(String[] args)   //also call jvm for handle exception //throws Insufficient
     {
        Scanner sc = new Scanner(System.in);

        Account A1 = new Account(123456789, 5000);
        A1.showBalance();
        
        try{
                System.out.println("Enter Withdraw Amount:");
                A1.Withdraw(sc.nextDouble());
            
        }
       

        catch(Insufficient e ){
            System.out.println(e.getMessage());
        }
         A1.showBalance();
        
    }
}