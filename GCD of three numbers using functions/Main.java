import java.util.Scanner;
class Main
{
  public static int great(int a,int b,int c)
  {
    int min,gcd;
    if((a<b)&&(a<c))
    {
      min=a;
    }
    else if(b<c)
    {
      min=b;
    }
   else 
    {
      min=c;
    }
    
    while(min>=1)
    {
      if((a%min==0)&&(b%min==0)&&(c%min==0))
      {
        gcd=min;
      return gcd;
      }
      min--;
    }
    return 0;
  }
	public static void main (String[] args)
    {
	    // Type your code here
     Scanner in=new Scanner(System.in);
      int a=in.nextInt();
      int b=in.nextInt();
      int c=in.nextInt();
      System.out.println(great(a,b,c));
	}
}