error id: file:///D:/java_with_Saurabh_shukla/wrapperClasses/Marksheet.java:java/lang/Float#
file:///D:/java_with_Saurabh_shukla/wrapperClasses/Marksheet.java
empty definition using pc, found symbol in pc: java/lang/Float#
empty definition using semanticdb
empty definition using fallback
non-local guesses:

offset: 1273
uri: file:///D:/java_with_Saurabh_shukla/wrapperClasses/Marksheet.java
text:
```scala
public class Marksheet{

    Integer physics , chemistry , mathematics , English;

      //set physics
    void setPhysics(Integer p){
        this.physics = p;
    }
     //get physics marks
     public Integer getPhysics(){
        return physics;
     }

     //set chemistry mar̥ks
     void setChem(Integer chem){
        this.chemistry = chem;

     }
     //get chemistry marks
     Integer getChem(){
        return chemistry;
     }

     // set english marks
     void setEng(Integer e){
        this.English = e;
     }
     // get english marks
     Integer getEng(){
        return English;
     }

     //set mathematics marks
     void setMath(Integer m){
        this.mathematics = m;
     }

     //get math marks
     Integer getMath(){
        return mathematics;
     }

     //get maximum marks
     Integer getMaximumMarks(){
     // calculate maximum marks
     if(physics > chemistry && physics > English && physics > mathematics){
        return physics;
     }

     else if(chemistry > English && chemistry > mathematics){
        return chemistry;
     } 

     else if(mathematics > English){
        return mathematics;
     }

     else{
        return English;
     }
     }
     @@Float getAvg(){
        return (Float(physics+chemistry+mathematics+English))/4;
     }

    public static void main(String[] args) {
        Marksheet m1 = new Marksheet();

        m1.setPhysics(1243);
        m1.setChem(105);
        m1.setEng(10);
        m1.setMath(110);

         //System.out.println(m1.getMath());
         System.out.println(m1.getMaximumMarks());

    }
}
```


#### Short summary: 

empty definition using pc, found symbol in pc: java/lang/Float#