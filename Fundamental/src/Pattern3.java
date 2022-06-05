/*
 n=3
123
123
123
 */
import java.util.Scanner;

public class Pattern3 {

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
				System.out.print(col);
				col++;
			}
			System.out.println();
			row++;
		}

	}

}
