/*
 n=3
321
321
321
 */
import java.util.Scanner;

public class Pattern4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int row=1,col;
		while(row<=n)
		{
			col=1;
			while(col<=n)
			{
				System.out.print(n - col + 1);
				col++;
			}
			System.out.println();
			row++;
		}

	}

}
