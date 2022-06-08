
/*

Print the following pattern
Pattern for N = 4
*000*000*
0*00*00*0
00*0*0*00
000***000

*/

package Test1_Milestone1_java;

import java.util.Scanner;
public class Pattern2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int row=1,col;
        while(row <= n)
        {
            //1
            col = 1;
            while(col <= row-1)
            {
                System.out.print("0");
                col++;
            }
            
            //2
            System.out.print("*");
			
            //3
            col=1;
            while(col <= n-row)
            {
                System.out.print("0");
				col++;
            }
            
            //4
            System.out.print("*");
            
            //5
            col=1;
            while(col <= n-row)
            {
                System.out.print("0");
                col++;

            }
            
            //6
            System.out.print("*");
            
            //7
            col = 1;
            while(col <= row-1)
            {
                System.out.print("0");
				col++;
            }
            row++;
            System.out.println();


        }
		
	}	


}
