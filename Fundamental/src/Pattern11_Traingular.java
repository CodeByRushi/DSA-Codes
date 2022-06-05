/*
n=4
   *
  **
 ***
****
 */
import java.util.Scanner;

public class Pattern11_Traingular {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int row=1;int col;
		while(row<=n)
		{
			//print spaces
			col=1;
			while(col<=(n-row))
			{
				System.out.print(" ");
				col++;
			}
			
			//print stars
			col=1;
			while(col<=row)
			{
				System.out.print("*");
				col++;
			}
				
			System.out.println();
			row++;
		}

	}

}
