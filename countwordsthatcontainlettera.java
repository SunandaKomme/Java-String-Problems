//Count how many words contain the letter ‘a’.
import java.util.*;
public class countwordsthatcontainlettera{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        int count=0;
        char ch='a';
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)==ch){
                count++;
            }
        }
        System.out.println(count);
    }
}
