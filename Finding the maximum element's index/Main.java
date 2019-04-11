import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    //Try your code here
    Scanner in=new Scanner(System.in);
    int n=in.nextInt();
    int a[]=new int[n];
    int i;
    for(i=0;i<n;i++)
    {
      a[i]=in.nextInt();
    }
    sum(a,n);
  }
  public static void sum(int a[],int n)
  {
      int b=0,index=0;
      for(int i=0;i<n;i++)
      {
          if(a[i]>b)
          {
              b=a[i];
              index=i;
          }
      }
      
      System.out.println(index);
  }
  }
