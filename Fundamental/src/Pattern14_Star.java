
import java.util.Scanner;

public class Pattern14_Star {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int row=1,col,space,num;
        while(row <= n)
        {
            //print spaces
            space=1;
            while(space <= n-row)
            {
                System.out.print(" ");
                space++;
            }
            
            //first triangle
            col=1;
            num=row;
            while(col <= row)
            {
                System.out.print(num);
                num++;
                col++;
            }
            
            //second triangle
            col=1;
            num--;
            while(col <= row-1)
            {
                num--;
                System.out.print(num);
                
                col++;
            }
            System.out.println();
            row++;
        }
	}
}
