// Count how many words end with ‘s’.
import java.util.*;
public class checkifwordsendswiths{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine().trim();
        int count=0;
        if(!s.isEmpty()){
            String[]words=s.split("\\s+");
            for(String word:words){
                if(word.toLowerCase().endsWith("s")){
                count++;
            }
    }
        }
    System.out.println(count);
    }


}
