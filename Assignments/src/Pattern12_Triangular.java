/*
n=3
*
**
***
  
 */
import java.util.Scanner;
public class Pattern12_Triangular {


	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int row=1,col;
        while(row<=n)
        {
        	col=1;
           System.out.print(row);
           while(col<=(row-2))
           {
        	   System.out.print('0');
        	   col++;
           }
           if(row!=1)
           {
           	System.out.println(row);
           }
           else{
        	   System.out.println();
           }
           row++;
        }
		
	}

}