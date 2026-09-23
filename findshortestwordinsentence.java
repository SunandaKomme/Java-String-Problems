//Find the shortest word in a sentence.
import java.util.*;
public class findshortestwordinsentence{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        String[]words=s.split("\\s+");
        int min=words[0].length();
        for(String word:words){
            if(word.length()<min){
                min=word.length();
            }

        }
        for(int i=0;i<words.length;i++){
            if(words[i].length()==min){
                System.out.print(words[i]+" ");
            }
        }
    }}
