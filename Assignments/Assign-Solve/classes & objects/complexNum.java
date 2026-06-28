import java.util.*;

public class complexNum{
    static class complex{
        int imagnary;
        int complex;

         void setComplex(int x, int y){
              imagnary = x;
              complex = y;
         }

          void printNumbers(){

            System.out.println(imagnary);
            System.out.println(complex);
          }
    }
    

    public static void main(String[] args) {
        complex cc = new complex();
        cc.setComplex(10,20);
        cc.printNumbers();


    }
    
}