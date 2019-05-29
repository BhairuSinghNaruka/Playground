import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    Scanner in = new Scanner(System.in);
    int a = in.nextInt();
    /* int a = 478;
    int b = a/100;
    int c = a%100;
    int d = c/10;
    int e = c%10; */
    int  rev=0;
    while(a!=0)
    {
      rev = rev * 10;
      rev = rev + a%10;
      a = a/10;
    }
    
    System.out.println(rev);
    //Type your code here

  }
}