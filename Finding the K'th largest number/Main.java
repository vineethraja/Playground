import java.util.Scanner;
class Main{
    public static void main(String args[])
    {
      // Type your code here
      Scanner sc=new Scanner(System.in);
      int n=sc.nextInt();
      int a[]=new int[n];
      int i,temp,j;
      for(i=0;i<n;i++)
      {
        a[i]=sc.nextInt();
      }
      int k=sc.nextInt();
      for(i=0;i<n;i++)
     {
         for(j=i+1;j<n;j++)
         {
             if(a[i]<a[j])
             {
                 temp=a[i];
                 a[i]=a[j];
                 a[j]=temp;
             }
         }
     } 
     
         System.out.println(a[k-1]);
     
      
    }   
}