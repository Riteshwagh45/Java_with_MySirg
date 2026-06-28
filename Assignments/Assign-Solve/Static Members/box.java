public  class box {
    int boxHeight;
    int boxWidth;
    int boxLength;

    int boxDimension;

    static int boxCount;

    //calculate box count
    public box() {
        boxCount++;
    }

    //set dimension
    void setDimesion(int l , int w, int h){

        this.boxHeight = h;
        this.boxWidth = w;
        this.boxLength = l;
    }
     //show box dimension
    void showDimension(){

         System.out.println("Length = "+boxLength);
          System.out.println("width = "+boxWidth);
           System.out.println("height = "+boxHeight);
    }

     //show total box count

     void showTotalBox(){
        System.out.println(boxCount);
     }
       

     

    public static void main(String[] args) {
        box b1 = new box();
        //box b2 = new box();

        b1.setDimesion(10, 20, 30);
        b1.showDimension();
        b1.showTotalBox();

        
    }
}
