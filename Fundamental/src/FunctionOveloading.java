
public class FunctionOveloading {
	
	public static int sum(int a,int b)
	{
		return a+b;
	}
	public static double sum(double a,double b)
	{
		return a+b;
	}
	public static int sum(int a)
	{
		return a + 1;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a =10,b=5;
		System.out.println(sum(a,b));
		System.out.println(sum(10.0,5.0));
		System.out.println(sum(a));
	}

}
