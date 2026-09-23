//Replace all spaces with ‘_’.
import java.util.*;
public class replaceallspaceswithunderscore{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(ch==' '){
                ch='_';
            }
                System.out.print(ch);
            }
        }
    }
