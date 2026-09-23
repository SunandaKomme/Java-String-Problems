//Reverse  each word in a sentence
import java.util.*;
public class reverseeachwordinsentence{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine().trim();
        String[]words=s.split("\\s+");
        for(String word:words){
            for(int i=word.length()-1;i>=0;i--){
                System.out.print(word.charAt(i));
            }
            System.out.print(" ");
        }

    }}
