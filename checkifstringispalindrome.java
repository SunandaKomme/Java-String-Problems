//check if the given string is palindrome
import java.util.*;
public class checkifstringispalindrome{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        String rev="";
        for(int i=s.length()-1;i>=0;i--){
            rev=rev+s.charAt(i);
        }
        if(s.equals(rev)){
            System.out.println("Given string is palindrome");

            }else{
                System.out.println("given string is not palindrome");

       }
        
        
    }}

