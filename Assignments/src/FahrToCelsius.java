import java.util.Scanner;
public class FahrToCelsius {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner sc = new Scanner(System.in);
	        int start = sc.nextInt();
	        int end = sc.nextInt();
	        int step = sc.nextInt();
	        int cel;
	        while(start <= end)
	        {
	            cel = (int)((5.0/9.0) * (start - 32.0));
	            System.out.println(start+" "+cel);
	            start = start + step;
	        }

			
	}

}
