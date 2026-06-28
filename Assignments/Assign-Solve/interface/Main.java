
interface printer{
  public void print();
}

interface scanner{
  public  void scan();
}
class Machine implements printer ,  scanner{
    @java.lang.Override
    public void print() {
        System.out.println("it is a printer");
    }

    @java.lang.Override
    public void scan() {
        System.out.println("scan the doccuments");
    }
}
public class Main {

    public static void main(String[] args) {
        Machine m1 = new Machine();
        m1.print();
        m1.scan();

    }
}