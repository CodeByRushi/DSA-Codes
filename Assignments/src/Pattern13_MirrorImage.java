/*
 n=4
   1
  12
 123
1234
 */
import java.util.Scanner;
public class Pattern13_MirrorImage {


	public static void main(String[] args) {
		
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int row = 1,col,space;
        while(row <= n)
        {
            //print spaces
            space=1;
            while(space <= n-row)
            {
                System.out.print(" ");
                space++;
            }
            
            //print numbers
            col=1;
            while(col<=row)
            {
                System.out.print(col);
                col++;
            }
            System.out.println();
            row++;
        }

		
	}

}
