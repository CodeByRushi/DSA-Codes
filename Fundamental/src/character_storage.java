
public class character_storage {

	public static void main(String ar[])
	{
		char ch= 'a' + 1;
		System.out.println(ch);// b will be printed
		
		char c= 'a';
		int var= c + 1;
		System.out.println(var);//98 will be printed
		
		System.out.println(c+3);//100 will be printed
		
		System.out.println('a'+'b');// 195 will be printed.
		
		int min = Integer.MIN_VALUE;
		int max = Integer.MAX_VALUE;
		System.out.println(min + " to " + max);//range from min to max
		
		char k = 97;
		System.out.println(k); //a will be printed.
		int i = 'c';
		System.out.println(i);
	}
}
