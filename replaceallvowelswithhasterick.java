//. Replace all vowels with ‘*’.
import java.util.*;
public class replaceallvowelswithhasterick{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'){
                ch='*';
                System.out.print(ch);
            }else{
                System.out.print(ch);
            }
        }

    }}
