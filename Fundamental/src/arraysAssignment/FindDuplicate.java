/*
 You have been given an integer array/list(ARR) of size N which contains numbers from 0 to (N - 2). 
 Each number is present at least once. That is, if N = 5, the array/list constitutes values ranging from 0 to 3 and among these, there is a single integer value that is present twice. 
 You need to find and return that duplicate number present in the array.
 */

package arraysAssignment;

public class FindDuplicate {

	public static int findDuplicate(int[] arr)
	{
		int sum=0,ans=0;
		for(int i=0;i<arr.length;i++)
		{
			sum = sum + arr[i]; 
		}
		for(int i=0;i<arr.length-1;i++)
		{
			ans = ans + arr[i]; 
		}
		return sum-ans;
	}
	public static void main(String[] args) {
		int[] arr= {0,1,2,3,1};
		System.out.println(findDuplicate(arr));
	}
}
