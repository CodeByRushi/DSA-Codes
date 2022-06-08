package Arrays;

import java.util.Scanner;

public class ArrayWithFunction {
	public static void printArray(int arr[])
	{
		int size = arr.length;
//		for(int i = 0;i<size;i++)
//		{
//			System.out.println(arr[i]);
//		}
		arr[0]=10;
	}
	public static int[] takeInput()
	{
		Scanner sc = new Scanner(System.in);
		int size = sc.nextInt();
		int[] arr = new int[size];
		for(int i = 0;i<size;i++)
		{
			arr[i] = sc.nextInt();
		}
		return arr;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = takeInput();
		printArray(arr);
		System.out.println(arr[0]);
	}

}
