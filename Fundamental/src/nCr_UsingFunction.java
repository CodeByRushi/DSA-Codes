import java.util.Scanner;
public class nCr_UsingFunction {

	public static int factorial(int num)
	{
		int fact = 1;
		for(int i = 1; i <= num; i++)
		{
			fact = fact * i; 
		}
		return fact;
	}
	public static int findnCr(int n,int r)
	{
		int factN = factorial(n);
		int factR = factorial(r);
		int factNR = factorial(n-r);
		int nCr = factN /(factR * factNR);
		return nCr;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in); 
		int n = sc.nextInt();
		int r = sc.nextInt();
		int nCr = findnCr(n,r);
		System.out.println(nCr);

	}

}
