/*
 You have been given an integer array/list(ARR) of size N. Where N is equal to [2M + 1].
Now, in the given array/list, 'M' numbers are present twice and one number is present only once.
You need to find and return that number which is unique in the array/list.
 */
//optimised
package arraysAssignment;
public class FindUnique {

	public static int findUnique(int[] arr)
	{
		int sum = 0;
		for(int i=0;i<arr.length;i++)
		{
			sum = sum ^ arr[i];
		}
		return sum;
	}
	
	public static void main(String[] args) {
		int[] arr = {1,1,2,2,3,3,5};
		System.out.println(findUnique(arr));
	}
}
