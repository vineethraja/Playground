import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    Scanner in=new Scanner(System.in);
    char ch=in.next().charAt(0);
    int k=in.nextInt();
    if(ch>='a'&&ch<='z')
      {
         ch=(char)(ch-k+26);
      }
    else if(ch>='A'&&ch<='Z')
      {
        ch=(char)(ch-k);
      }
    System.out.print(ch);
  }
}