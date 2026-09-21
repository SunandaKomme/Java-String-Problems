//. Count the number of digits, letters, and special characters in a string. 
import java.util.*;
public class countcharactersdigitsandspecialcharacters{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        int letters=0;
        int digits=0;
        int specialcharacters=0;

for(int i=0;i<s.length();i++){
    char ch=s.charAt(i);
    if(Character.isLetter(ch)){
           letters++;
    }else if(Character.isDigit(ch)){
        digits++;
    }else{
        specialcharacters++;
    }
} 
System.out.println("Letters:"+letters);
System.out.println("Digits:"+digits);
System.out.println("Specialcharacters:"+specialcharacters);   
        
    }
}