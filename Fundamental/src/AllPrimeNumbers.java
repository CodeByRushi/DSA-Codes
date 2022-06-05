import java.util.Scanner;
public class AllPrimeNumbers {

	public static void main(String[] args) {
	
        Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
        boolean b=false;
        for(int i=2 ; i <=n ; i++)
        {
            b=false;
            for(int j=2;j<i;j++)
            {
                if(i % j == 0)
                {
                    b=true;
                    break;
                }
            }
            if(b==false)
            {
                System.out.println(i);
            }
            
        }
		
	}
}
