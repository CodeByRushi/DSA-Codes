import java.util.Scanner;

public class CheckIfNumberIsInPowersOfTwo {
	
	public static boolean checkNumber(int n)
	{
		int lastbit,cnt=0;
		while(n != 0)
		{
			lastbit = n & 1;
			if(lastbit == 1)
			{
				cnt++;
			}
			n>>=1;
		}
		if(cnt == 1)
			return true;
		else
			return false;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		boolean ifPowersOfTwo = checkNumber(n);
		if(ifPowersOfTwo == true)
		{
			System.out.println("Number is in powers of two.");
		}
		else
		{
			System.out.println("Number is not in powers of two.");
		}
	}

}
