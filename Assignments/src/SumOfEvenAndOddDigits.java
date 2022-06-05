import java.util.Scanner;
public class SumOfEvenAndOddDigits {
		public static void main(String[] args) {
			// Write your code here
	        Scanner sc = new Scanner(System.in);
	        int n = sc.nextInt();
	        int digit,even=0,odd=0;
	        while(n!=0)
	        {
	            digit = n % 10;
	            if(digit % 2 ==0)
	            {
	                even = even + digit;
	            }
	            else
	            {
	                odd = odd + digit;
	            }
	            n/=10;
	        }
	        System.out.print(even+" "+odd);
	        

		}
	}


