import java.util.Scanner;
class Main{
    public static void main(String args[]){
        // Type your code here
      Scanner in=new Scanner(System.in);
      int n=in.nextInt();
    
      int a[]=new int[n];
      int i,c=-1,d=-1;
      for(i=0;i<n;i++)
      {
        a[i]=in.nextInt();
      }
      int n1=in.nextInt();
      int n2=in.nextInt();
      for(i=0;i<n;i++)
      {
        if(a[i]==n1)
        {
          c=i;
        }
         
         
        if(a[i]==n2)
        {
          d=i;
        }
      }
        System.out.println(c);
          System.out.print(d);
      
    }
}