import java.util.Scanner;
public class Pattern16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int row=1,col,p;
		while(row <= n)
		{
			//print first
			col=1;
			while(col <=(n-row))
			{
				System.out.print(n-col+1);
				col++;
			}
			System.out.print("*");
			//print third
			col=1;
			p=row-1;
			while(col <= row-1)
			{
				System.out.print(p);
				p--;
				col++;
			}
			System.out.println();
			row++;
		}
	}

}
