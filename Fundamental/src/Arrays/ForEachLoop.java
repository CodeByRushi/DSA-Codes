package Arrays;

import java.util.Scanner;

public class ForEachLoop {
	public static int[] takeInput()
	{
		
		Scanner sc = new Scanner(System.in);
		int size = sc.nextInt();
		int[] arr = new int[size];
		for(int i=0;i<size;i++)
		{
			arr[i]=sc.nextInt();
		}
		return arr;
	}
	//use of "for each loop" is only for traversing an array. 
	public static void printArray(int[] arr)
	{
		for(int i:arr)
		{
			System.out.print(i + " ");
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = takeInput();
		printArray(arr);
	}

}
