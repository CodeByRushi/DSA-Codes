/*
n=4
D
CD
BCD
ABCD
 */
import java.util.Scanner;

public class Pattern7_Character {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int row=1,col;
		char ch='A';
		while(row<=n)
		{
			ch=(char)('A'+ n - row);
			col=1;
			while(col<=row)
			{
				System.out.print(ch);
				ch++;
				col++;
			}
			System.out.println();
			row++;
		}

	}

}
