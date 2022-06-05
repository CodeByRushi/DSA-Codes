import java.lang.Math;
import java.util.Scanner;
public class Salary_Evaluation {
	
	public static void main(String[] args) {
		// Write your code here
		Scanner sc = new Scanner(System.in);
        int basic = sc.nextInt();
        char ch = sc.next().charAt(0);
        double hra = (2.0/10)* basic;
        double da = (5.0/10) * basic;
        double pf = (11.0/100) * basic;
        double allow;
		if(ch=='A')
        {
            allow=1700;
        }
        else if(ch == 'B')
        {
            allow=1500;
        }
        else
        {
            allow=1300;
        }
        double total = basic + hra + da + allow - pf;
     	total = Math.round(total);
        long l = (long)total;
        System.out.print(l);
	}
}
