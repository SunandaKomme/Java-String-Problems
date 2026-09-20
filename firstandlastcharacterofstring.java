// Print the first and last character of a string. 
import java.util.*;
public class firstandlastcharacterofstring{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        for(int i=0;i<s.length();i++){
            if(i==0||i==s.length()-1){
                System.out.println(s.charAt(i));
            }
        }
        
    }
}