//Print the second half of the string in reverse
import java.util.*;
public class printsecondhalfofstring{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        int n=s.length()/2;
        String rev="";
        for(int i=s.length()-1;i>=n;i--){
            rev=rev+s.charAt(i);
        }
        System.out.print(rev);
    }}

