/*
n=5
1234554321
1234**4321
123****321
12******21
1********1
  
 */
import java.util.Scanner;
public class Pattern8_ThreeTogether {


	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int row=1,col;
        while(row<=n)
        {
        	//first triangle
           	col=1;
            while(col<=(n-row+1))
            {
                System.out.print(col);
                col++;
            }
            //second triangle
            col=1;
            while(col<=(row-1)*2)
            {
            	System.out.print('*');
            	col++;
            }
            
            //Third triangle
            col=1;
            while(col<=(n-row+1))
            {
            	System.out.print(n-row-col+2);
            	col++;
            }
            System.out.println();
            row++;
        }
		
	}

}
