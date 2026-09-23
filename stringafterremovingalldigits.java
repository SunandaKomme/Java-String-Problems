//Print the string after removing all digits.
import java.util.*;
public class stringafterremovingalldigits{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(!Character.isDigit(ch)){
               System.out.print(ch);
        }
    }
}
}