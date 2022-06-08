import java.util.Scanner;

public class FahrenheitToCelsiusTable {

	public static void printFahrenheitTable(int start, int end, int step) {
		for(int i = start; i <= end; i = i + step)
		{
			long fahrenheit = (long)((5.0/9.0) * (i - 32.0));
			System.out.println(i + "\t"+ fahrenheit);

		}

	}
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int start = s.nextInt();
		int end = s.nextInt();
		int step = s.nextInt();
		printFahrenheitTable(start, end, step);
	}
}
