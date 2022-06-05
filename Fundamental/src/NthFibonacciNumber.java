import java.util.Scanner;
public class NthFibonacciNumber {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int first=1,second=1,third=0;
        if(n==1)
        {
            System.out.println(first);
            return;
        }
        if(n==2)
        {
            System.out.println(second);
            return;
        }
        for(int i=3; i<=n ;i++)
        {
            third = first + second;
            first = second;
            second = third;
        }
        System.out.println(third);

    }

}
