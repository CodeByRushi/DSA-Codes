import java.util.Scanner;

public class FibonacciNumber {

	public static boolean checkMember(int n){

		int first = 0,second = 1,third = 1;
		if(n == 0 || n == 1)
		{
			return true;
		}
		for(int i = 1; third <= n; i++)
		{
			third = first + second;
			if(third == n)
				return true;
			first = second;
			second = third;
		}

		return false;

	}

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		System.out.println(checkMember(n));
	}

}
