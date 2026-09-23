//. Find the longest word in a sentence.
import java.util.*;
public class findlongestword{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        String[]words=s.split("\\s+");
        int max=words[0].length();
        for(int i=1;i<words.length;i++){
            if(words[i].length()>max){
                max=words[i].length();
            }
        }
        for(int i=0;i<words.length;i++){
            if(words[i].length()==max){
                System.out.print(words[i]);
            }

        }
    
    }}
