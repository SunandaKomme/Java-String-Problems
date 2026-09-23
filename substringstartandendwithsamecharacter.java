//18. Count how many substrings start and end with the same character 
import java.util.*;
public class substringstartandendwithsamecharacter{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        int count=0;
        for(int i=0;i<s.length();i++){
            for(int j=0;j<s.length();j++){
                if(s.charAt(i)==s.charAt(j)){
                   System.out.println(""+s.charAt(i)+s.charAt(j));
                }
            }
        }
        System.out.println(count);
    }
}