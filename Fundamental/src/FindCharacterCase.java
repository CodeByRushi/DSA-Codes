import java.util.Scanner;
public class FindCharacterCase  {
    
    public static void main(String[] args) {
        // Write your code here
        Scanner sc= new Scanner(System.in);
        char ch=sc.next().charAt(0);
        if(ch>='A' && ch <='Z')
        {
            System.out.print("1");
        }
        else if(ch>='a' && ch <='z')
        {
            System.out.print("0");
        }
        else
        {
            System.out.print("-1");
        }
    }
}