error id: file:///D:/java_with_Saurabh_shukla/wrapperClasses/Marksheet.java:_empty_/en#
file:///D:/java_with_Saurabh_shukla/wrapperClasses/Marksheet.java
empty definition using pc, found symbol in pc: _empty_/en#
empty definition using semanticdb
empty definition using fallback
non-local guesses:

offset: 1681
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

     //getting average of marks
     Float getAvg(){
        return (physics+chemistry+mathematics+English)/4.0f;
     }
      //getting result pass or fails
      Boolean isPass(Integer passingMarks){
        Boolean result = true;

        if(physics < passingMarks){
            return false;
        }
         if(chemistry < passingMarks){
            return  false;
         }
         if(en@@)
      }
    public static void main(String[] args) {
        Marksheet m1 = new Marksheet();

        m1.setPhysics(35);
        m1.setChem(35);
        m1.setEng(35);
        m1.setMath(35);

         //System.out.println(m1.getMath());
         System.out.println(m1.getMaximumMarks());
         System.out.println(m1.getAvg());
         System.out.println(m1.getResult(35));

    }
}
```


#### Short summary: 

empty definition using pc, found symbol in pc: _empty_/en#