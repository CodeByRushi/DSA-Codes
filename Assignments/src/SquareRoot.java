/*
 * Given a number N, find its square root. 
 * You need to find and print only the integral part of square root of N.
 * */
import java.lang.Math;
import java.util.Scanner;
public class SquareRoot {
	
	public static void main(String[] args) {
		// Write your code here
		Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int i = 1;
        for(i=1; i*i <=n ; i++)
        {
            if(i*i == n)
            {
                System.out.println(i);
				return;
            }
        }
        System.out.println(i-1);


	}
}
