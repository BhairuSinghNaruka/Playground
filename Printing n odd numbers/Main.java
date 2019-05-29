import java.util.Scanner;
class Main {
	public static void main (String[] args){
	   Scanner in  = new Scanner(System.in);
	     int n = in.nextInt();
         int sum=0;
         // Run for loop until it reaches the given number
	     for(int i=1;i<=n;i++)
        {
         System.out.println (2*i-1);
           sum+=2*i-1;
         }
	}
}