//Remove the first and last character and print the remaining string.
import java.util.*;
public class removefirstandlastcharacter{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        for(int i=0;i<s.length()-1;i++){
            if(i!=0&&i!=s.length()-1){
                System.out.print(s.charAt(i));
                }
        }

    }}
