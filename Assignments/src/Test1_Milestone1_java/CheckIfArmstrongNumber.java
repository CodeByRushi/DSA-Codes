/*
Write a Program to determine if the given number is Armstrong number or not. Print true if number is armstrong, otherwise print false.
An Armstrong number is a number (with digits n) such that the sum of its digits raised to nth power is equal to the number itself.
For example,
371, as 3^3 + 7^3 + 1^3 = 371
1634, as 1^4 + 6^4 + 3^4 + 4^4 = 1634

*/
package Test1_Milestone1_java;
import java.util.Scanner;
import java.lang.Math;
public class CheckIfArmstrongNumber {
	
	public static void main(String[] args) {
		// Write your code here
		Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int cnt=0,num=n,rem,ans=0;
        while(num != 0)
        {
            cnt++;
            num/=10;
        }
        num=n;
        while(num != 0)
        {
            rem = num % 10;
            ans = ans + (int)(Math.pow(rem,cnt));
            num/=10;
        }
        if(ans == n)
        { 
            System.out.println("true");
        }
        else
        {
            System.out.println("false");

        }
           

	}
}
