//Count how many words are in a sentence.
import java.util.*;
public class counthowmanywordsinsentence{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        
        int count=s.isEmpty()?0:s.split("\\s+").length;
        System.out.println(count);

    }
}