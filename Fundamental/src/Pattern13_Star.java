/*
  n=4
   *
  ***
 *****
*******
*/
import java.util.Scanner;
public class Pattern13_Star {


	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int row=1,col;
        while(row <= n)
        {
            //print spaces
            col = 1;
            while(col <= (n-row))
            {
                System.out.print(" ");
                col++;
            }
            //print stars
            col=1;
            while(col<=(row*2-1))
            {
                System.out.print("*");
                col++;
            }
            System.out.println();
            row++;
        }
	
		
	}

}
