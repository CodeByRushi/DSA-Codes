/*
n=3
1
23
456
 */
import java.util.Scanner;

public class Pattern6_Traingular {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int row=1,col,cnt=1;
		while(row<=n)
		{
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
