/*
n=3
***
**
*

 */
import java.util.Scanner;

public class Pattern10_Traingular {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int row=1;int col;
		while(row<=n)
		{
			col=1;
			while(col<=(n-row+1))
			{
				System.out.print('*');
				col++;
				
			}
			System.out.println();
			row++;
		}

	}

}
