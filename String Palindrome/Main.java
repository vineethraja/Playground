import java.util.Scanner;
class Main{
    public static void main(String args[]) {
        // Type your code here
      Scanner sc=new Scanner(System.in);
      String s=sc.nextLine();
      String b="";
      int n=s.length();
     for(int i=n-1;i>=0;i--)
    {
        b=b+s.charAt(i);
    }  
     
      if(s.equals(b))
      {
        System.out.println("Yes");
      }
      else
      {
        System.out.println("No");
      }
    } 
}