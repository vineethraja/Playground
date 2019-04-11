import java.util.Scanner;
class Main
{
  public static int square(int num)
  {
    int p=num*num;
    return p;
  }
      public static void main (String[] args)
    {
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        int p1=square(n);
        System.out.println(p1);
	 // Type your code here   
	} 
}