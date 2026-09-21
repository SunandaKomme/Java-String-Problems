//Count how many vowels and consonants are in a string. 
import java.util.*;
public class countvowelsandconsonants{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        int vowels=0;
        int consonants=0;
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'){
                vowels++;

            }else if(ch==' ') {
    
            }else{
                consonants++;
            }
        }
        System.out.println("Vowels:"+vowels);
        System.out.println("Consonants:"+consonants);
    }
}