import java.util.Scanner;
class Main{ 
  public static void main(String args[]) 
  { 
    // Type your code here
    Scanner in=new Scanner(System.in);
    int m=in.nextInt();
    int n=in.nextInt();
    int a[][]=new int[m][n];
   int b[][]=new int[m][n];

    int i,j,c=1;
    for(i=0;i<m;i++)
    {
      for(j=0;j<n;j++)
      {
        a[i][j]=in.nextInt();
      }
    }
      for(i=0;i<m;i++)
    {
      for(j=0;j<n;j++)
      {
        b[i][j]=in.nextInt();
      }
    }
   
    for(i=0;i<m;i++)
    {
      for(j=0;j<n;j++)
      {
        if(a[i][j]!=b[i][j])
        {
          c=0;
        }
        
      }
    }
      if(c==1)
       System.out.print("Yes");
      
      else 
      System.out.println("No");
      
    
  }
}