import java.util.Scanner;

public class Division_UsingFunction {
	
	public static double division(int num,int deno)
	{
		if(deno==0)
		{
			return Integer.MIN_VALUE;//if divide by zero then provide min value of int
		}
		return (double)num/deno;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in); 
		int n = sc.nextInt();
		int b = sc.nextInt();
		double ans= division(n,b);
		System.out.println(ans);
	}

}
