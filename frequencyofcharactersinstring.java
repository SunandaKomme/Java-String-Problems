//. Find the frequency of each character in a string 
import java.util.*;
public class frequencyofcharactersinstring{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        for(int i=0;i<s.length();i++){
        boolean alreadyCounted=false;
            char ch=s.charAt(i);
            for(int k=0;k<i;k++){
                if(s.charAt(k)==ch){
                    alreadyCounted=true;
                    break;
                }
            }
            if(alreadyCounted){
                continue;
            }
            int count=1;
            for(int j=i+1;j<s.length();j++){
                   if(ch==s.charAt(j)){
                    count++;
                   }
            }
            System.out.println("frequency of "+ch+"="+count);

        }
    }
}