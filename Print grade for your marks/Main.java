import java.util.Scanner;
class Main {
	public static void main (String[] args) {
		// Type your code here
      Scanner in = new Scanner(System.in);
      int avg = in.nextInt();
      if(avg>=85)
        {
            System.out.print("A");
        }
        else if(avg>=75 && avg<=84)
        {
            System.out.print("B");
        }
        else if(avg>=65 && avg<=74)
        {
            System.out.print("C");
        }
       else if(avg>=55 && avg<=64)
        {
            System.out.print("D");
        }
        else if(avg>=45 && avg<=54)
        {
            System.out.print("E");
        }
        else
        {
            System.out.print("Fail");
        }
     
    }
}