package p1;

public class Box {
    private int length;
    private int height;
    private int bredth;

    protected int volume;
    protected int surfaceArea;

    //setters and getters
    void setlhb(int l, int h, int b){
        this.length = l;
        this.height = h;
        this.bredth = b;
    }
    void setvs(int v , int s ){
        this.volume = v;
        this.surfaceArea = s;
    }

    //calculate volume of a box
    int getVolume(){
        return length*height*bredth;
    }

    // calculate surface area of box
    int getSurfaceArea(){
        return (2*length*bredth) + (2*length*height) + (2*bredth*height);
    }
}
