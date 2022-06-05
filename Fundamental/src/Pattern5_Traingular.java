/*
n=3
1
12
123
 */
import java.util.Scanner;

public class Pattern5_Traingular {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int row=1,col;
		while(row<=n)
		{
			col=1;
			while(col<=row)
			{
				System.out.print(col);
				col++;
			}
			System.out.println();
			row++;
		}

	}

}
