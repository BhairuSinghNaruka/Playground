import java.util.Scanner;
class Main{
	public static void main (String[] args){
	   Scanner input = new Scanner(System.in);
      int base = input.nextInt();
      int temp = base;
      int exp = input.nextInt();

      long result = 1;

        for (;exp != 0; --exp)
        {
            result *= base;
        }

        System.out.println(result);
	}
}