
public class Type_Casting {
	public static void main(String ar[])
	{
		int i=100;
		long l1= i;//implicit
		System.out.println(l1);//100

		double d=100.04;
		long l2=(long)d;//explicit
		System.out.println(l2);//100

		char ch = 'a';
		int i1= ch;
		ch = (char)i;//explicit
		ch = (char)(ch + 1);//ch + 1 => gives int. Hence explicit conversion.
		
		char c= 97;
		System.out.println(c);
		
		
	}

}
