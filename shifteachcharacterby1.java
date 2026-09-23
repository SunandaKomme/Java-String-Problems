//Shift each character by 1 (e.g., “abc” → “bcd”).
import java.util.*;
public class shifteachcharacterby1{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            System.out.print((char)(ch+1));
        }

    }}
