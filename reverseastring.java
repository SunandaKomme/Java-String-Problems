//21. Reverse a string without using built-in reverse.
import java.util.*;
public class reverseastring{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        String reverse=" ".trim();

        for(int i=s.length()-1;i>=0;i--){
            reverse=reverse+s.charAt(i);
            }
        System.out.println(reverse);
    }
}