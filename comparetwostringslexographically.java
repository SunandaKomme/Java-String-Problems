//. Compare two strings lexicographically (like dictionary order).
import java.util.*;
public class comparetwostringslexographically{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String a=sc.nextLine();
        String b=sc.nextLine();
        int result=a.compareToIgnoreCase(b);
        if(result==0){
            System.out.println("Both strings are equal");

        }else if(result<0){
            System.out.println(a+" comes before "+b);
        }else{
            System.out.println(a+" comes after "+b);
        }

    }}

