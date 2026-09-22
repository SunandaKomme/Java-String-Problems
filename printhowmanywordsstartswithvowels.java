//Print how many words start with a vowel in a sentence.
import java.util.*;
public class printhowmanywordsstartswithvowels{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine().trim();
        int count=0;
        if(!s.isEmpty()){
            String[]words=s.split("\\s+");
            for(String word:words){
                char c=word.charAt(0);
                if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u'){
                    count++;
                }
            }
        }
        System.out.println(count);

    }
}