//remove all spacesfromstring
import java.util.*;
public class removeallspacesfromstring{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)!=' '){
                System.out.print(s.charAt(i));
            }
        }

    }}
