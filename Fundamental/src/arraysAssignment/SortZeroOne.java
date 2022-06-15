/*
 *You have been given an integer array/list(ARR) of size N that contains only integers, 0 and 1.
 * Write a function to sort this array/list. 
 *Think of a solution which scans the array/list only once and don't require use of an extra array/list.
 */

package arraysAssignment;

public class SortZeroOne {
	public static void sortZero(int[] arr)
	{
		int start = 0, end = arr.length-1,temp;
		while(start < end)
		{
			while(arr[start] == 0 && start < end)
			{
				start++;
			}
			while(arr[end] == 1 && start < end)
			{
				end--;
			}
			if( start < end)
			{
				temp = arr[start];
				arr[start] = arr[end];
				arr[end] = temp;
			}
		}
	}
	public static void print(int[] arr)
	{
		for(int i:arr)
		{
			System.out.print(i + " ");
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {0, 1, 1 ,0, 1, 0, 1};
		sortZero(arr);
		print(arr);
	}

}
