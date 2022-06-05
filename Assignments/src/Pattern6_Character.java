/*
n=4
A
BC
CDE
DEFG
 */
import java.util.Scanner;

public class Pattern6_Character {

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
				ch++;
				col++;
			}
			System.out.println();
			row++;
		}

	}

}
