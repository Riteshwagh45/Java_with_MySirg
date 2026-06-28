import java.util.*;

public class ReverseString {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);

        System.out.println("Enter a String :");
        String str = sc.nextLine();

        //StringBuilder sb = new StringBuilder(str);
       //System.out.println(sb.reverse());
        char arr[] = str.toCharArray();
        int si = 0;
        int ei = arr.length-1;

           while(si <= ei){
               char temp = arr[si];
               arr[si] = arr[ei];
               arr[ei] = temp;
               si++;
               ei--;
           }
           for(int i=0; i<arr.length; i++){
               System.out.print(arr[i]);
           }

    }
}