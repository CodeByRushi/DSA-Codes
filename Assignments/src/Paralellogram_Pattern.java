/*
  n=3
***
 ***
  ***

 */
import java.util.Scanner; 
public class Paralellogram_Pattern {

    public static void main(String[] args) {
        // Write your code here
		Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int row=1,col,space;
        while(row <= n)
        {
            //print spaces
            space=1;
            while(space<=row-1)
            {
                System.out.print(" ");
				space++;
            }
            
            //print stars
            col=1;
            while(col <= n)
            {
                System.out.print('*');
				col++;
            }
            System.out.println();
			row++;
        }
    }
}

