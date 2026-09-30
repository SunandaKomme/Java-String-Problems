//Capitalize the first letter of each word.
import java.util.*;
public class capitalizefirstletterofeachword{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine().toLowerCase();
        for(String word:s.split("\\s+")){
            for(int i=0;i<word.length();i++){
                if(i==0){
                    System.out.print(Character.toUpperCase(word.charAt(i)));
                }else{
                    System.out.print(word.charAt(i));
                }
            }
            System.out.print(" ");
        }
    }
}