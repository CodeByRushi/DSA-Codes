package Arrays;

import java.util.Scanner;

public class PrintAllPairs {
	
	public static void findAllPairs(int[] arr)
	{
		for(int i=0;i<arr.length;i++)
		{
			for(int j=i+1;j<arr.length;j++)
			{
				System.out.println(arr[i]+","+arr[j]);
			}
		}
	}
	public static int[] takeInput()
	{
		Scanner sc = new Scanner(System.in);
		int size = sc.nextInt();
		int arr[] = new int[size];
		for(int i = 0; i<size ;i++)
		{
			 arr[i]=sc.nextInt();
		}
		return arr;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] input = takeInput();
		findAllPairs(input);

	}

}
