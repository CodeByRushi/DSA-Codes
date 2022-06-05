/*
 n=4
1357
3571
5713
7135
 
 */
import java.util.Scanner;
public class Pattern_OddSquare {
	
	public static void main(String[] args) {
		// Write your code here
        Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int row=1,col;
		int odd=1;
		while(row <= n)
		{
			col=1;
			odd=row+(row-1);
			while(col<=n-row+1)
			{
				System.out.print(odd);
				odd+=2;
				col++;
			}
//			System.out.println();
//			row++;
			
			col=1;odd=1;
			while(col<=row-1)
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
