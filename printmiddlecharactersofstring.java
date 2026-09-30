// Print the middle character(s) of a string.
import java.util.*;
public class printmiddlecharactersofstring{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        String[]words=s.split("\\s+");
        for(String word:words){
            int low=0;
            int high=word.length();
            int mid=low+(high-low)/2;
            if(word.length()%2==0&&word.length()>2){
            System.out.print(word.charAt(mid-1)+" "+word.charAt(mid)+" ");
          }
    else{
        System.out.print(word.charAt(mid)+" ");
    }
    }
}
}

