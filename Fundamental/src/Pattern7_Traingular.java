/*
n=4
1
23
345
4567
 */
import java.util.Scanner;

public class Pattern7_Traingular {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int row=1,col,cnt=1;
		while(row<=n)
		{
			cnt=row;
			col=1;
			while(col<=row)
			{
				System.out.print(cnt);
				cnt++;
				col++;
			}
			System.out.println();
			row++;
		}

	}

}
