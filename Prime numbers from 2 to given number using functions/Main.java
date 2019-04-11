import java.util.Scanner;
class Main
{
  public static int prime(int n)
  {
    for(int i=2;i<=n;i++)
    {
        int p=0;
        for(int j=2;j<i;j++)
        {
            
        if(i%j==0)
        p=1;
        }
      if(p==0)
        System.out.println(i);
    }
    return 0;
    
  }
  public static void main(String args[])
  {
    Scanner in=new Scanner(System.in);
    int e=in.nextInt();
    int d=prime(e);
  
  
}
}