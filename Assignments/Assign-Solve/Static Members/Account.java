public class Account{
static class BankAccount{

    long AccountNumber;
    int Balance;
    String CustomerName;

    static float rateOfInterest;

    
     void setAccountNumber(long n){
     AccountNumber = n;
}
    void setBalance(int b){
    Balance = b;
 }
    void setname(String name){
        CustomerName = name;

  }
     void setrateOfInterest(float rateofInterest){
    rateOfInterest = rateofInterest;

 }
    long getAccountNumber(){
        return AccountNumber;
    }
    int getAccountBalance(){
        return Balance;
    }
    String getName(){
        return CustomerName;
    }
    float getRateOfInterest(){
        return rateOfInterest;
    }
     //calculate simple interest principle*rate*time/100.0;
         double getSimpleInterest(int time){
        return Balance*rateOfInterest*time/100.0;

     }
}




public static void main(String[] args) {
    BankAccount b1 = new BankAccount();
    b1.setAccountNumber(7020242365L);
    b1.setBalance(500);
    b1.setname("Ritesh");
    b1.setrateOfInterest(10.20F);

    System.out.println("Balance:"+b1.getAccountBalance());
    System.out.println("Number:"+b1.getAccountNumber());
    System.out.println("Name:"+b1.getName());
    System.out.println("Simple Interest:"+b1.getSimpleInterest(12));

    
}
}
 