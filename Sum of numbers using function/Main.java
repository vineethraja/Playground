import java.util.Scanner;
class Main
{
  public static int sum(int num)
  {
    int s=0;
   for(int i=1;i<=num;i++)
   {
     s=s+i;
   }
    return s;
  }
      public static void main (String[] args)
    {
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        int p1=sum(n);
        System.out.println(p1);
	 // Type your code here   
	} 
}