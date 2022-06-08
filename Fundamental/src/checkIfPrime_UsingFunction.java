import java.util.Scanner;

public class checkIfPrime_UsingFunction {

	
	public static boolean checkPrime(int n)
	{
		for(int i = 2; i < n; i++)
		{
			if(n % i == 0)
			{
				return false;
			}
		}
		return true;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		boolean ifPrime = checkPrime(n);
		System.out.println(ifPrime);//false -> not prime ;; true -> prime
	}

}
