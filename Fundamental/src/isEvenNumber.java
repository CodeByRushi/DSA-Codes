import java.util.Scanner;
public class isEvenNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		int n;
		n=sc.nextInt();
		if(n%2 ==0)
		{
			System.out.println("Even Number");
		}	
		else
		{
			System.out.println("Odd Number");
		}

		int a=50;
		int b=Integer.MIN_VALUE;
		if(a/0==b)
		{

			System.out.println("Hello");
		}
		else
		{
			System.out.println("Hi");
		}
	}

}
