import java.util.Scanner;
import java.lang.Math;

public class Sample {
	 public static boolean isPrime(int x)
	 {
	     for(int i=2;i<x/2;i++)
	     {
	         if(x%i==0)
	         return false;
	     }
	     return true;

	 }
	 public static void main (String[] args) {
//	     System.out.print(isPrime(47));
//	     int[] arr = new int[5];
//	     arr = new int[6];
		 System.out.println(Integer.MAX_VALUE);
	 }
}