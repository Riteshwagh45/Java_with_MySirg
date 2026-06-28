public class cuboid{
    static class Cuboid{
        int height;
        int width;
        int length;
        //setters
     void setHeight(int h){height = h;}
     void setWidth(int w){width = w;}
     void setLength(int l){length = l;}
     
     //getters
     int getHeight(){return height;}
     int getWidth(){return width;}
     int getLength(){return length;}

     //calculate volume of cuboid 
     int calVolume(){
        return height*length*width;
     }
      
     //calculate surface of a cuboid 
     int calSurface(){
        return 2*(length*width + width*height + height*length);
     }

    }
    public static void main(String[] args) {
        Cuboid c = new Cuboid();
        c.setHeight(10);
        c.setWidth(20);
        c.setLength(30);
        System.out.println(c.calVolume());
        System.out.println(c.calSurface());
    }
}