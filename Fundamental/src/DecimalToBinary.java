import java.lang.Math;
import java.util.Scanner;
public class DecimalToBinary {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int lastbit,ans=0,i=0;
		while(n!=0)
		{
			lastbit = n & 1;
			ans = (int)(lastbit * Math.pow(10,i) + ans);
			i++;
			n>>=1;
		}
		System.out.println(ans);
	}

}
