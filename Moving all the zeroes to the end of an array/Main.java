import java.util.Scanner;
class Main{
    public static void main(String args[]) {
       // Type your code here
      Scanner in=new Scanner(System.in);
      int n=in.nextInt();
      int a[]=new int[n];
      int i;
      for(i=0;i<n;i++)
      {
        a[i]=in.nextInt();
      }
      zero(n,a);
      for(i=0;i<n;i++)
      {
        System.out.print(a[i]+" ");
      }
    }
  public static void zero(int n,int a[])
  {
      int i;
    int count=0;
      for(i=0;i<n;i++)
      {
        if(a[i]!=0)
        {
          a[count++]=a[i];
    
        }
      }
      while(count<n)
      {
          a[count++]=0;
      }
        
      

    }
}