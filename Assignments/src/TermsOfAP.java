/*
 Write a program to print first x terms of the series 3N + 2 which are not multiples of 4.
 */
import java.util.Scanner;
public class TermsOfAP {
	
	public static void main(String[] args) {
		// Write your code here
		Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int n=1;int i=1;
       	while(n<=x)
        {
            if((3*(i)+2) % 4 != 0)
            {
                System.out.print((3*(i)+2) + " ");
                n++;

            }
            i++;
        }
	}
}
