//Print all words that start and end with the same letter.
import java.util.*;
public class wordsthatstartandendwithsamecharacter{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        String[]words=s.split("\\s+");
        for(String word:words){
            if(word.charAt(0)==word.charAt(word.length()-1)){
                System.out.print(word+" ");
            }
        }
    }}

