//Check if two strings are the reverse of each other.
import java.util.*;
public class checkiftwostringsarereverseofeachother{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        String a=sc.nextLine();
        String b=sc.nextLine();
        boolean reverse=true;
        if(a.length()!=b.length()){
            reverse=false;
        }
        else{
        for(int i=0;i<a.length();i++){
            if(a.charAt(i)!=b.charAt(b.length()-1-i)){
                reverse=false;
                break;
            }
        }
        }
        if(reverse){
            System.out.println("Both strings are reverse of each other");
        }else{
            System.out.println("Both strings are not reverse of each other");
        }

    }
}