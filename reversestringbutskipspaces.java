//Reverse string but skip spaces.
import java.util.*;
public class reversestringbutskipspaces{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        String rev="";
        for(int i=s.length()-1;i>=0;i--){
            if(s.charAt(i)!=' '){
                rev=rev+s.charAt(i);
            }
        }
        System.out.print(rev);

               

    }}
