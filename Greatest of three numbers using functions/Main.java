import java.util.Scanner;
class Main{
	public static void main (String[] args){
    Scanner in = new Scanner(System.in);
      int x, y, z;
 
    x = in.nextInt();
    y = in.nextInt();
    z = in.nextInt();
 
    if (x > y && x > z)
      System.out.println(x);
    else if (y > x && y > z)
      System.out.println(y);
    else if (z > x && z > y)
      System.out.println("Third number is largest.");
    else
      System.out.println("The numbers are not distinct.");
	}
}