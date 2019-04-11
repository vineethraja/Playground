 import java.util.Scanner;
class Main{
	public static void main (String[] args){
	    // Type your code here
      Scanner in=new Scanner(System.in);
      int n=in.nextInt();
      int temp;
      temp=n;
      int i,fact,sum=0,r;
      while(n>0)
      {
        r=n%10;
        fact=1;
      for(i=r;i>=1;i--)
      {
        fact=fact*i;
      }
        sum=sum+fact;
        n=n/10;
        
      }
      n=temp;
        if(sum==n)
        {
          System.out.println("Yes");
        }
        else
          System.out.println("No");
       
    }
}
      
	

	
