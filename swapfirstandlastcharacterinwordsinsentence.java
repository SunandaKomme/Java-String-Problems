//// Swap first and last character of each word in a sentence.
import java.util.*;
public class swapfirstandlastcharacterinwordsinsentence{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        String[]words=s.split("\\s+");
        for(String word:words){
            if(word.length()==1){
                System.out.print(word);
            }else{
            for(int i=0;i<word.length();i++){
                char temp=word.charAt(0);
                if(i==0){
                    System.out.print(word.charAt(word.length()-1));
                }else if(i==word.length()-1){
                    System.out.print(temp);
                }else{
                    System.out.print(word.charAt(i));
                }
            }
            }
            System.out.print(" ");
            
        }
    }}
