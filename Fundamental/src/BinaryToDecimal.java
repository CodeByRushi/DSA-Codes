import java.lang.Math;
import java.util.Scanner;
public class BinaryToDecimal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();//binary number.
		int lastbit,ans= 0,i=0;
		while(n!=0)
		{
			lastbit = n % 10;
			if(lastbit!=0)
			{
				ans = (int)(ans + Math.pow(2, i));
			}
			i++;
			n/=10;
		}
		System.out.println(ans);
		
	}

}
