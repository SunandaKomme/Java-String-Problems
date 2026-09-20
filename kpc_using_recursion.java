// Get KPC number against characters.
    // "0" -> ".;"
    // "1" -> "abc" 
    // "2" -> "def" 
    // "3" -> "ghi" 
    // "4" -> "jkl" 
    // "5" -> "mno" 
    // "6" -> "pqrs" 
    // "7" -> "tu" 
    // "8" -> "vwx"
    // "9" -> "yz"

import java.util.Scanner;
import java.util.ArrayList;
public class kpc_using_recursion{
public static ArrayList<String> getKPC(String str) {
        String[] codes = {".;", "abc", "def", "ghi","jkl","mno","pqrs","tu","vwx","yz"};
        if (str.length() == 0) {
            ArrayList<String> base = new ArrayList<>();
            base.add("");
            return base;
        }
        char ch = str.charAt(0);
        ArrayList<String> recAns = getKPC(str.substring(1));
        int index = ch - '0';
        String code = codes[index];
        ArrayList<String> myAns = new ArrayList<>();
        for (int i = 0; i < code.length(); i++) {
            char chCode = code.charAt(i);
            for (String rstr : recAns) {
                myAns.add(chCode + rstr);
            }
        }
        return myAns;      
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a String : ");
        String s = sc.next();
        System.out.println(getKPC(s));
    }
}