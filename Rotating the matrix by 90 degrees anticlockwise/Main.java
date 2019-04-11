import java.util.Scanner;
class Main{ 
  public static void main(String args[]) 
  { 
    // Type your code here
    Scanner in=new Scanner(System.in);
    int m=in.nextInt();
    int n=in.nextInt();
    int a[][]=new int[m][n];
    int i,j;
    for(i=0;i<m;i++)
    {
      for(j=0;j<n;j++)
      {
        a[i][j]=in.nextInt();
      }
    }
    for(i=n-1;i>=0;i--)
    {
      for(j=0;j<=m-1;j++)
      {
       System.out.print(a[j][i]+" ");
      }
      System.out.println();
    }
  }
}