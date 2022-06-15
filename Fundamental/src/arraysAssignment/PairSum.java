/*
 You have been given an integer array/list(ARR) and a number X. 
 Find and return the total number of pairs in the array/list which sum to X.
 */

package arraysAssignment;

public class PairSum {

	public static int pairSum(int[] arr,int x)
	{
		int cnt=0;
		for(int i=0;i<arr.length;i++)
		{
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[i]+arr[j] == x)
				{
					cnt++;
				}
			}
		}
		return cnt;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {2, 8, 10, 5, -2, 5};
		System.out.println(pairSum(arr, 10));

	}

}
