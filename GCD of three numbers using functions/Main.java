import java.util.Scanner;
public class Main{
  public static int greatest(int a, int b, int c){
    if(a>=b && a>=c){
        return a;
    }
    else if(b>=a && b>=c){
        return b;
    }
    else if(c>=a && c>=b){
        return c;
    }
    return a;
}
	public static void main (String[] args)
	{
	   Scanner in = new Scanner(System.in);
      int x, y, z;
 
    x = in.nextInt();
    y = in.nextInt();
    z = in.nextInt();
      int gcd;
    
    for(gcd=greatest(x,y,z); gcd>=1; gcd--){
        if(x%gcd==0 && y%gcd==0 && z%gcd==0){
            break;
        }
    }
      System.out.println(gcd);
	}
}