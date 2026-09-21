//13. Count how many uppercase and lowercase letters a string has.
import java.util.*;
public class countuppercaseandlowercaseletters{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String a=sc.nextLine();
        int uppercase=0;
        int lowercase=0;
        for(int i=0;i<a.length();i++){
            char ch=a.charAt(i);
            if(Character.isUpperCase(ch)){
                uppercase++;
                }else if(ch==' '){

                }else{
                    lowercase++;
                }
        }
        System.out.println("Number of Uppercase letters are:"+uppercase);
        System.out.println("Number of Lowercase letters are:"+lowercase);


    }}
