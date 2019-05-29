import java.util.Scanner;
class Main{
	public static void main (String[] args){
	   // Type your code here
      Scanner input = new Scanner(System.in);
      int num = input.nextInt();
      int number, temp, total = 0;

        number = num;
        while (number != 0)
        {
            temp = number % 10;
            total = total + temp*temp*temp;
            number /= 10;
        }

        if(total == num)
            System.out.println("Armstrong Number");
        else
            System.out.println("Not a Armstrong Number");
	}
}