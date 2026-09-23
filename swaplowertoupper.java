//Swap case: uppercase → lowercase and lowercase → uppercase.
import java.util.*;
public class swaplowertoupper{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(Character.isLowerCase(ch)){
                ch=Character.toUpperCase(ch);
            }else{
                ch=Character.toLowerCase(ch);
            }
            System.out.print(ch);
        }
    }}
