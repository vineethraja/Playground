import java.util.Scanner;

class Main{
    public static void main(String args[])
    {
        // Type your code here
      Scanner sc=new Scanner(System.in);
      int n=sc.nextInt();
      int b[] = new int[n]; 
      int a[]=new int[n];
      int c=0,i;
      for(i=0;i<n;i++)
      {
          a[i]=sc.nextInt();
      }
      for(int j=0;j<n;j++)
      {
          ++c;
          b[j]=c;
      }
 
for (i = 0; i < n; i++) 
        { 
            int j; 
            
            for (j = 0; j < n; j++) 
                if (b[i]==a[j]) 
                    break; 
  
            if (j== n) 
                System.out.print(b[i] + " "); 
        }
    }
}