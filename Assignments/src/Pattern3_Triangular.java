/*
n=4
1
22
333
4444
  
 */
import java.util.Scanner;
public class Pattern3_Triangular {


	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int row=1,col;
        while(row<=n)
        {
           	col=1;
            while(col<=row)
            {
                System.out.print(row);
                col++;
            }
            System.out.println();
            row++;
        }
		
	}

}
