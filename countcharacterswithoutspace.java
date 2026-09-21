// Count how many characters (excluding spaces) are in the string
import java.util.*;
public class countcharacterswithoutspace{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        int count=0;
        for(char ch:s.toCharArray()){
            if(ch!=' '){
                count++;
            }
        }
        System.out.println(count);
    }
}