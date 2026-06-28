abstract  class Account{
    private double balance;
    private int AccoutNo;

    private static double rateOfInterest;

    // set rateof interest
    void setRateOfInterest(double interest){
        rateOfInterest = interest;
    }

    //get interest
    public double getRateOfInterest(){
        return rateOfInterest;
    }


    //set balance
    void setBalance(double balance){
        this.balance = balance;
    }

    //get balance
  public   double getBalance(){
        return balance;
    }

    //set account no
    void setAccoutNo(int no){
        this.AccoutNo = no;
    }

    //get account number
  public  int getAccoutNo(){
        return AccoutNo;
    }

    abstract public double calculateinterest(int time);


}
class SavingAccount extends Account{
    private String customerName;

    //set cutomer name
    void setCustomerName(String name){
        this.customerName = name;
    }

    //get customer name
    public String getCustomerName(){
        return customerName;
    }

    @java.lang.Override
    public double calculateinterest(int time){
        return (time * getBalance() * getRateOfInterest())/100;
    }

}
public class Bank{

    public static void main(String[] args) {
        SavingAccount s1 = new SavingAccount();
        s1.setAccoutNo(123);
        s1.setBalance(35000);
        s1.setRateOfInterest(12);
        System.out.println(s1.calculateinterest(24));
        s1.setCustomerName("ritesh");
        System.out.println(s1.getCustomerName());

    }
}