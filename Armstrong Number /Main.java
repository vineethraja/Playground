 import java.util.Scanner;
import java.lang.Math;
class Main{
	public static void main (String[] args){
	    // Type your code here
      Scanner in=new Scanner(System.in);
      int n=in.nextInt();
      int temp,z;
      z=n;
      temp=n;
      int i,count=0;
      double sum=0,r;
      while(n>0)
      {
        if(n%10!=0)
        {
        n=n/10;
        count++;
        }
      }
      for(i=0;i<count;i++)
      {
        
        r=temp%10;
       
        sum=sum+Math.pow(r,count);
        temp=temp/10;
        
      }
      
        if(sum==z)
        {
          System.out.println("Armstrong Number");
        }
        else
          System.out.println("Not a Armstrong Number");
       
    }
}
      
	

	
