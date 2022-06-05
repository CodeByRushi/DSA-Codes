/*
n=4
1
21
321
4321

 */
import java.util.Scanner;
public class Pattern4_Triangular {


	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int row=1,col,cnt;
        while(row<=n)
        {
        	cnt=row;
           	col=1;
            while(col<=row)
            {
                System.out.print(cnt);
                cnt--;
                col++;
            }
            System.out.println();
            row++;
        }
		
	}

}
