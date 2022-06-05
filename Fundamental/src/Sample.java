import java.util.Scanner;
import java.lang.Math;

public class Sample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner inp=new Scanner(System.in);
        int n= inp.nextInt();
       int row = 1,col,odd;
       while(row <=n)
       {
    	   col=1;
    	   odd = row *2 -1;
    	   while(col <= n-row+1)
    	   {
    		   System.out.print(odd);
    		   odd = odd + 2;
    		   col++;
    	   }
    	   col=1;
    	   odd=1;
    	   while(col <= (row-1))
    	   {
    		   System.out.print(odd);
    		   odd+=2;
    		   col++;
    	   }
    	   System.out.println();
    	   row++;
       }
}
}