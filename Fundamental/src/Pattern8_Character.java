/*
n=4
ABCD
ABCD
ABCD
ABCD
 */
import java.util.Scanner;

public class Pattern8_Character {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int row=1,col;
		char ch='A';
		while(row<=n)
		{
			ch='A';
			col=1;
			while(col<=n)
			{
				ch  =(char) ('A' + col -1);
				System.out.print(ch);
			
				col++;
			}
			System.out.println();
			row++;
		}

	}

}
