import java.util.Scanner;

public class User {
    //super class (Parent class)
    private int uerId;
    private String Name;

  //set user
  public void setUserId(int id){
      this.uerId = id;
  }
  //get id 
   public int getId(){
    return uerId;
  }

  //set user name 
  public void setName(String name){
    this.Name = name;
  }

  //get name 
  public String getname(){
    return Name;
  }


}

class Learner extends User{

    //child class (Sub class of Generlization)
    private String courseName;
    private int progress;

    //method for enroll course 
    public void enrollCourse(){

    System.out.println("Select a Course:");
    Scanner sc = new Scanner(System.in);
    this.courseName = sc.nextLine();

    }

    //view course name
     public void showCourseName(){
        System.out.println("course name:"+courseName);
    }

    //set progress
    public void setProgress(int progress){
        this.progress = progress;
    }

    // view progress of learner
    public void viewProgress(){
        System.out.println("Total Progress:"+progress);
    }

}

class Admin extends User{
//child class (sub class of Generalization)
private int adminLevel;
private String Deparment;

//add new course 
public void addCourse(){
   System.out.println("Enter a course name you want to added");

}
 
 //remove course
 public void removeCourse(){
  System.out.println("Enter a course you want remove");
 }

 //set adminlevel 
 public void setAdminLevel(int level){
    this.adminLevel = level;
 }
 //view admin level 
 public void viewAdminLevel(){
    System.out.println(adminLevel);
 }

 //set department
 public void setDepartMent(String department){
    this.Deparment = department;
 }

 //view department
 public void showDepartment(){
    System.out.println(Deparment);
 }
}

class Main{
public static void main(String [] args){
    Learner l1 = new Learner();
    Admin a1 = new Admin();
    l1.enrollCourse();
    //l1.showCourseName();
    a1.showCourseName();

}
}