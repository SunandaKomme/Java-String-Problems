//Count how many spaces are there in a sentence.
import java.util.*;
public class countspacesinstring{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        int count=0;
        for(char c:s.toCharArray()){
            if(c==' '){
                count++;
            }
        }
        System.out.println("Number of spaces: "+count);

    }}
