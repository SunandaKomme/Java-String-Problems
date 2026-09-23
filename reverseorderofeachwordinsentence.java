//Reverse order of each word in a sentence.
import java.util.*;
public class reverseorderofeachwordinsentence{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine().trim();
        String[]words=s.split("\\s+");
        String reverse=" ".trim();
          for(int i=words.length-1;i>=0;i--){
            reverse=reverse+words[i]+" ";
            
            }
            System.out.println(reverse+" ");
        }


    }
