//Swap first and last words in a sentence.
import java.util.*;
public class swapfirstandlastwordinsentence{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        String[]words=s.split("\\s+");
        int n=words.length;
        for(int i=0;i<words.length;i++){
            String temp=words[0];
            if(i==0){
                System.out.print(words[n-1]);
            }else if(i==n-1){
                System.out.print(temp);
            }else{
                System.out.print(words[i]);
            }
            System.out.print(" ");
        }
    }
}