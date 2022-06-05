/*
 n=4
    1
   121
  12321
 1234321
 */
import java.util.Scanner;
public class Pattern14_IscoscelesTraiangle {


	public static void main(String[] args) {
		
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int row = 1,col,space;
        while(row <= n)
        {
        	//print spaces
        	space=1;
        	while(space <= (n-row+1))
        	{
        		System.out.print(" ");
        		space++;
        	}
        	
        	//print numbers
        	col=1;space=1;
        	while(col<=row)
        	{
        		System.out.print(space);
        		space++;
        		col++;
        	}
        	
        	//print third triangle
        	col=1;space=row-1;
        	while(col<=row-1)
        	{
        		System.out.print(space);
        		space--;
        		col++;
        	}
            System.out.println();
            row++;
        }

		
	}

}
