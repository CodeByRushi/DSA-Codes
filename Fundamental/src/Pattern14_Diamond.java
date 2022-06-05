import java.util.Scanner;
import java.lang.Math;
public class Pattern14_Diamond {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		double n1=n/2.0;
		long n2= (int)Math.ceil(n1);
		//System.out.println(n2);
		int row = 1,star,space,col;
		while(row <= n2)
		{
			//print spaces
			space = 1;
			while(space <= n2-row)
			{
				System.out.print(" ");
				space++;
			}
			//print 1st stars
			star = 1;
			while(star <= row*2 -1)
			{
				System.out.print("*");
				star++;
			}
			System.out.println();
			row++;
		}
		//print next spaces and triangle
		n2=n-n2;
		row=1;
		long n3=n2;
		while(row<=n2)
		{
			//print spaces
			col=1;
			while(col<=row)
			{
				System.out.print(" ");
				col++;
			}
			
			//print stars
			col=1;
			while(col<=(n3*2-1))
			{
				System.out.print("*");
				col++;
			}
			System.out.println();
			row++;
			n3--;
		}

	}
}


