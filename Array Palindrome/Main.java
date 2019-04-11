import java.util.Scanner;
import java.util.Arrays;
class Main{
    public static void main(String args[])
    {
        // Type your code here
      Scanner sc=new Scanner(System.in);
      int n=sc.nextInt();
      int b[] = new int[n]; 
      int a[]=new int[n];
      for(int i=0;i<n;i++)
      {
          a[i]=sc.nextInt();
      }
        int j = n; 
      
        for (int i = 0; i < n; i++) 
        { 
            b[j - 1] = a[i]; 
            j = j - 1; 
        }
         
        if(Arrays.equals(a,b))
        {
            System.out.println("Yes");
        }
        else
        System.out.println("No");
    } 
}