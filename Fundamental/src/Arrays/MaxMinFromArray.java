package Arrays;

import java.util.Scanner;

public class MaxMinFromArray {

	public static int findMin(int[] arr)
	{
		int min = Integer.MAX_VALUE;
		for(int i = 0;i<arr.length;i++)
		{
			if(arr[i] < min)
			{
				min = arr[i];
			}
		}
		return min;

	}
	public static int findMax(int[] arr)
	{
		int max = Integer.MIN_VALUE;
		for(int i = 0;i< arr.length;i++)
		{
			if(arr[i] > max)
			{
				max = arr[i];
			}
				
		}
		return max;
	}
	public static int[] takeInput()
	{
		Scanner sc = new Scanner(System.in);
		int size = sc.nextInt();
		int[] a = new int[size];
		for(int i=0;i<size;i++)
		{
			a[i] = sc.nextInt();
		}
		return a;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arr = takeInput();
		int min = findMin(arr);
		int max = findMax(arr);
		System.out.println("Min value :"+min);
		System.out.println("Max value :"+max);

	}

}
