/*
n=4
4555
3455
2345
1234

 */
import java.util.Scanner;
public class Pattern11 {


	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int row=1,col;
		int cnt;
		while(row<=n)
		{
			//first triangle
			col=1;
			cnt=n-row+1;
			while(col<=row)
			{
				System.out.print(cnt);
				cnt++;
				col++;
			}
			
			//second triangle
			col=1;
			while(col<=n-row)
			{
				System.out.print(n+1);
				col++;
			}
			System.out.println();
			row++;
		}


	}

}
