import java.lang.Math;
import java.util.Scanner;
public class DecimalToBinary {
	
	public static void main(String[] args) {
		// Write your code here
		Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int lastbit,i=0;
        long ans=0;
        while(n != 0)
        {
            lastbit = n & 1;
            ans = lastbit * (long)(Math.pow(10,i))+ ans;
            n>>=1;
            i++;
        }
        System.out.println(ans);

	}
}
