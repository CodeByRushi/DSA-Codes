/*
  n=4
1=1
1+2=3
1+2+3=6
1+2+3+4=10
 */
import java.util.Scanner;

public class Sum_Pattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int row=1;int sum=0;
		while(row <= n)
		{
			int col=1;
			while(col<=row)
			{
				if(col != 1)
				{
					System.out.print("+");
				}
				System.out.print(col);
				col++;
				
			}
			System.out.println("="+(int)(sum=sum+row));
			row++;
		}

	}

}