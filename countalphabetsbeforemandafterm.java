//Count how many alphabets are before ‘m’ and after ‘m’ in a given string.
import java.util.*;
public class countalphabetsbeforemandafterm{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        int countbeforem=0;
        int countafterm=0;
        char target='m';
        for(int i=0;i<s.length();i++){
          char ch=s.charAt(i);
          if(ch<target){
            countbeforem++;
          }else if(ch>target){
            countafterm++;
          }else{
            
          }
        }
        System.out.println(countbeforem);
        System.out.println(countafterm);
    }}
