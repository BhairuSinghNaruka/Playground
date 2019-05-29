import java.util.Scanner;
class Main{
	public static void main (String[] args){
        // Type your code here
      Scanner input = new Scanner(System.in);
      int number = input.nextInt();
      int i,fact=1;      
      for(i=1;i<=number;i++){    
      fact=fact*i;    
          }    
      System.out.println(fact);
	}
}