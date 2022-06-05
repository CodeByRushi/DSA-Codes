import java.util.Scanner;
public class PowerOfNumber {
    
    public static void main(String[] args) {
        // Write your code here
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int n = sc.nextInt();
        long pow = 1;
        int i=1;
        if(n==0)
        {
            System.out.print(1);
            return;
        }
        while(i <= n)
        {
            pow = pow * x;
            i++;
        }
        System.out.print(pow);
    }
}