/*
n=4
A
BB
CCC
DDDD
 */
import java.util.Scanner;

public class Pattern9_Character {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int row=1,col;
		char ch='A';
		while(row<=n)
		{
			ch=(char)('A'+row -1);
			col=1;
			while(col<=row)
			{
				System.out.print(ch);
			
				col++;
			}
			System.out.println();
			row++;
		}

	}

}
