/*
 n=3
 111
 222
 333
 */
import java.util.Scanner;

public class Pattern2 {

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
				System.out.print(row);
				col++;
			}
			System.out.println();
			row++;
		}

	}

}
