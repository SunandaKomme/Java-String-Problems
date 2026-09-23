//. Reverse only characters, keeping digits in place.
import java.util.*;
public class reverseonlycharacters{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        String rev="";
        for(int i=s.length()-1;i>=0;i--){
            char ch=s.charAt(i);
            if(Character.isDigit(ch)){
                rev[i]=ch;
            }else{
                rev=rev+ch;
                
            }
            
        }
        System.out.print(rev+" ");
    }}
