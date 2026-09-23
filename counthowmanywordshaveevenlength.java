//Count how many words have even length
import java.util.*;
public class counthowmanywordshaveevenlength{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        String[]words=s.split("\\s+");
        int count=0;
        for(String word:words){
          if(word.length()%2==0){
            count++;
          }
        }
        System.out.println(count);
    }
}