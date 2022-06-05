/*
 n=3
333
333
333

 */
import java.util.Scanner;
public class Pattern1 {


	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int i=1,j;
        while(i<=n)
        {
           	j=1;
            while(j<=n)
            {
                System.out.print(n);
                j++;
            }
            System.out.println();
            i++;
        }
		
	}

}
