import java.util.Scanner;
class Main {
	public static void main (String[] args){
	    // Type your code here
      Scanner in=new Scanner(System.in);
        int n=in.nextInt();
      int i,j,k,val=1,no;
      no=n;
      for(i=1;i<=n;i++)
      {
        for(j=2;j<=no;j++)
        {
          System.out.print(" ");
          
         }
        no--;
         for(k=1;k<=i;k++)
          {
            System.out.print(val+" ");
            val++;
          }
          System.out.print("\n");
      }
	}
}