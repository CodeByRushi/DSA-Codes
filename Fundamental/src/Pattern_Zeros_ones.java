import java.util.Scanner;
public class Pattern_Zeros_ones {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int row=1,col;
		while(row <= n)
		{
			col=1;
			while(col<=(row-1))
			{
				System.out.print("0");
				col++;
			}
			
			System.out.print("*");
			
			col=1;
			while(col <= (n-row))
			{
				System.out.print("0");
				col++;
			}
			
			System.out.print("*");
			
			col=1;
			while(col <= (n-row))
			{
				System.out.print("0");
				col++;
			}
			
			System.out.print("*");
			
			col=1;
			while(col<=(row-1))
			{
				System.out.print("0");
				col++;
			}
			
			row++;
			System.out.println();
			
		}
	}

}
