import java.lang.Math;
import java.util.Scanner;
public class BinaryToDecimal {
	
	public static void main(String[] args) {
		// Write your code here
		Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();//take binary number
        int lastdigit,ans = 0,i=0;
        while(n != 0)
        {
            lastdigit = n % 10;
            if(lastdigit == 1)
            {
                ans = ans + (int)Math.pow(2,i);
            }
            i++;
            n/=10;
        }
        System.out.println(ans);

	}
}
