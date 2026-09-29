// Count how many times a given character appears in a string. 
import java.util.*;
public class counthowmanytimesgivencharacterappearinstring{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        char target=sc.next().charAt(0);
        sc.nextLine();
        String s=sc.nextLine();
        int count=0;
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(ch==target){
                count++;
            }

        }
        
        System.out.println(count);
    }
}