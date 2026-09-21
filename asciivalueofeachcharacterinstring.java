//. Print the ASCII value of each character in a string.
import java.util.*;
public class asciivalueofeachcharacterinstring{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        for(char c:s.toCharArray()){
            if(c!=' '){
                System.out.println(c+" = "+(int)c);
            }
        }
    }
}