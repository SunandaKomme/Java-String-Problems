// Remove extra spaces between words (normalize spacing). 
/*import java.util.*;
public class removeextraspacebetweenwords{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        s=s.trim().replaceAll("\\s+"," ");
        System.out.println(s);
    }
}*/

//using built in join method
/*import java.util.*;
public class removeextraspacebetweenwords{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        String[]words=s.split("\\s+");
        String result=String.join(" ",words);
        System.out.println(result);
    }
}*/

import java.util.*;
public class removeextraspacebetweenwords{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        String result=" ";
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(ch!=' '){
                result=result+ch;
            }else if(result.length()>0&&result.charAt(result.length()-1)!=' '){
                result=result+" ";
            }
        }
        System.out.print(result.trim());
        
    }}


    