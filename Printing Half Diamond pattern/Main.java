import java.util.Scanner;
class Main {
	public static void main (String[] args){
	    // Type your code here
      Scanner in=new Scanner(System.in);
        int n=in.nextInt();
      int i,j,k=0;
      for(i=1;i<=n;++i,k=0)
      {
        for(j=1;j<=n-i;++j)
        {
          System.out.print(" ");
        }
        while(k!=2*i-1)
        {
          System.out.print("*");
          ++k;
        }
        System.out.print("\n");
      }
	}
}