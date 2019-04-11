import java.util.Scanner;
class Main
{
  public static int great(int a,int b,int c)
  {
    if(a>b&&a>c)
    {
      System.out.println(a);
    }
    else if(b>a&&b>c)
    {
      System.out.println(b);
    }
   else if(c>a&&c>b)
    {
      System.out.println(c);
    }
    return 0;
  }
	public static void main (String[] args)
    {
	    // Type your code here
     Scanner in=new Scanner(System.in);
      int d=in.nextInt();
      int e=in.nextInt();
      int f=in.nextInt();
      great(d,e,f);
	}
}