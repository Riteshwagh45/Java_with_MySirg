import java.util.*;
public class StringInput {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a String :");
        String s1 = sc.nextLine();
        System.out.println(s1);

        int length = s1.length();
        System.out.println("Length = "+length);

        //print first character
        System.out.println("First char = "+ s1.charAt(0));

        //print last character
        System.out.println("Last char = "+ s1.charAt(s1.length()-1));

        //string convert uppercae
        String result = s1.toUpperCase();
        System.out.println("Upper Case = "+result);

        //print lowe case
        String result2 = s1.toLowerCase();
        System.out.println("lower case = "+ result2);
    }
}