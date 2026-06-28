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
         if(English < passingMarks){
            return false;
         }
         if(mathematics < passingMarks){
            return false;
         }
         return result;
      }
    public static void main(String[] args) {
        Marksheet m1 = new Marksheet();

        m1.setPhysics(34);
        m1.setChem(35);
        m1.setEng(35);
        m1.setMath(35);

         //System.out.println(m1.getMath());
         System.out.println(m1.getMaximumMarks());
         System.out.println(m1.getAvg());
         System.out.println(m1.isPass(35));

    }
}