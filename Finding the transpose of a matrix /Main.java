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
    int i,j;
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
        b[j][i]=a[i][j];
      }
    }
    for(i=0;i<m;i++)
    {
      for(j=0;j<n;j++)
      {
       System.out.print(b[i][j]+" ");
      }
      System.out.println();
    }
  }
}