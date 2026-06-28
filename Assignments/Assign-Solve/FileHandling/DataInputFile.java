import java.util.*;
import java.io.*;
public class DataInputFile {

    public static void f1() throws IOException{

        FileOutputStream fout;
        fout = new FileOutputStream("D:\\java_with_Saurabh_shukla\\Assignments\\Assign-Solve\\FileHandling\\DataFile\\mydata.txt",true);

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your data:");
        String data = sc.nextLine();

        for(int i=0; i<data.length(); i++)
            fout.write(data.charAt(i));

        fout.close();
        System.out.println("Data Stored in file:");
     }
     public static void f2() throws IOException{
        //write the data into a file using buffer class
        FileWriter file = new FileWriter("D:\\java_with_Saurabh_shukla\\Assignments\\Assign-Solve\\FileHandling\\DataFile\\file1.txt",true);
        BufferedWriter buff = new BufferedWriter(file);

        Scanner sc = new Scanner(System.in);
         System.out.println("Enter Your Componany name:");
         String name = sc.nextLine();
         buff.write(name);
         buff.close();

         System.out.println("data successfully entered ...");
     }
    public static void main(String[] args) {
        try {
            f2();
        }

        catch (IOException e){

            System.out.println(e.getMessage());
        }

    }
}