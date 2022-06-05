import java.util.Scanner;

public class isPrime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int div = 2;
		while(div<=n/2)
		{
			if(n % div == 0)
			{
				System.out.println("Number is composite ");
				return;
			}
			div+=1;
			
		}
		System.out.println("Number is Prime");
	}

}
