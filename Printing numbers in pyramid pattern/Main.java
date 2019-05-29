import java.util.Scanner;
class Main{
	public static void main (String[] args){
      	  Scanner input = new Scanner(System.in);
        int n = input.nextInt();
      int num=1;
    	for (int i=0; i<n; i++) 
        { 
  
            for (int j=n-i; j>1; j--) 
            {  
                System.out.print(" "); 
            } 
  
            for (int j=0; j<=i; j++ ) 
            { 
                // printing stars 
                System.out.print(num+ " "); 
              num = num + 1;
            } 
   
            System.out.println(); 
        } 
    }    
}