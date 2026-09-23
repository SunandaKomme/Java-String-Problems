//Remove duplicate characters from a string.
import java.util.*;
public class removeduplicatecharactersfromstring {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            boolean isDuplicate=false;
            for(int k=0;k<i;k++){
                if(ch==s.charAt(k)){
                    isDuplicate=true;
                    break;
                }

            }
            if(isDuplicate){
               continue;
            }
            System.out.print(ch);
        }

    }}
