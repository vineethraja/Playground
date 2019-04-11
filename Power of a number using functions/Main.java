import java.util.Scanner;
import java.lang.Math;
class Main
{
  public static double power(int a,int b)
  {
    double c;
    c=Math.pow(a,b);
    return c;
  }
  public static void main(String args[])
  {
    Scanner in=new Scanner(System.in);
    int e=in.nextInt();
    int f=in.nextInt();
    double d=power(e,f);
  
  System.out.println(d);
}
}