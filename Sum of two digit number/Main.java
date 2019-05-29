import java.util.*;
class Main {
	public static void main (String[] args) {
		// Type your code here
      Scanner in = new Scanner(System.in);
      int num1 = in.nextInt();
      int num2 = num1/10;
      int num3 = num1%10;
      int num4 = num2+num3;
      System.out.println(num4);

    }
}