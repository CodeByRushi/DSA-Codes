/*
n=3
*
**
***
  
 */
import java.util.Scanner;
public class Pattern2_Triangular {


	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int row=1,col;
        while(row<=n)
        {
           	col=1;
            while(col<=row)
            {
                System.out.print('*');
                col++;
            }
            System.out.println();
            row++;
        }
		
	}

}
