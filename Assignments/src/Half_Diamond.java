/*
 n=3
*
*1*
*121*
*12321*
*121*
*1*
*

*/
import java.util.Scanner;

public class Half_Diamond {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int row=1,col;
		int n1 = ((n*2)+1) - (n+1);
		n=n+1;
		while(row <= n)
		{
			System.out.print("*");
			col=1;
			while(col <= (row-1))
			{
				System.out.print(col);
				col++;
			}
			col-=2;
			while(col>=1)
			{
				System.out.print(col);
				col--;
			}
			if(row != 1)
			{
				System.out.print("*");
			}
			System.out.println();
			row++;
		}
		//second half
		row = n1;
		if(row==0)
			row=1;
		while(row >= 1)
		{
			System.out.print("*");
			col=1;
			while(col <= (row-1))
			{
				System.out.print(col);
				col++;
			}
			col-=2;
			while(col>=1)
			{
				System.out.print(col);
				col--;
			}
			if(row != 1)
			{
				System.out.print("*");
			}
			
			row--;
			System.out.println();
		}
	}

}
