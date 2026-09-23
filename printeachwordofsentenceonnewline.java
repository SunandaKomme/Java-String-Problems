//. Print each word of a sentence on a new line.
import java.util.*;
public class printeachwordofsentenceonnewline{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        String[]words=s.split("\\s+");
        for(int i=0;i<words.length;i++){
            System.out.println(words[i]);
    }
    }
}