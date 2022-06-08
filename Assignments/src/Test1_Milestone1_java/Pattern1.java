

/*
 n=5
5432*
543*1
54*21
5*321
*4321
*/
package Test1_Milestone1_java;
import java.util.Scanner;
public class Pattern1 {

	public static void main(String[] args) {
		// Write your code here
		Scanner sc = new Scanner(System.in);
       int n = sc.nextInt();
       int row = 1,col,p;
       while(row <= n)
       {
           //print first triangle
           col = 1;
           while(col <= n-row)
           {
               System.out.print(n-col+1);
               col++;

           }
           System.out.print("*");
			p=row-1;
           col = 1;
           while(col <= row-1)
           {
               System.out.print(p);
				col++;
               p--;
           }
           System.out.println();
			row++;
       }
	}
}
