import java.util.Scanner;
import java.util.regex.Pattern; 
public class Main {  
    static String reverseWords(String str) 
    { 
        Pattern pattern = Pattern.compile("\\s"); 
        String[] temp = pattern.split(str); 
        String result = ""; 
        for (int i = 0; i < temp.length; i++) { 
            if (i == temp.length - 1) 
                result = temp[i] + result; 
            else
                result = " " + temp[i] + result; 
        } 
        return result; 
    } 
  
    public static void main(String[] args) 
    { 
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        int n=s.length();
        System.out.print(reverseWords(s));
    } 
} 