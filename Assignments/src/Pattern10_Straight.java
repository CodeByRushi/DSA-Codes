/*
n=8
1**************1

 */
import java.util.Scanner;
public class Pattern10_Straight {


	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int row=1,col;
		col=1;
		System.out.print('1');
		while(col<=(n*2-2))
		{
			System.out.print('*');
			col++;
		}
		System.out.print('1');



	}

}
