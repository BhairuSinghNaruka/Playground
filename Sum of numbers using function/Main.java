import java.util.Scanner;
class Main{
  public static int getSum(int n) 
    { 
        int  count, total = 0;

       for(count = 1; count <= n; count++){
           total = total + count;
       } 
  
        return total; 
    } 
	public static void main (String[] args){
	   Scanner input = new Scanner(System.in);
       int n = input.nextInt();
      System.out.println(getSum(n));
	}
}