/*
 You have been given a random integer array/list(ARR) and a number X. 
 Find and return the number of triplets in the array/list which sum to X.
 */

package arraysAssignment;

public class TripletSum {

	public static int triplet(int[] arr,int x)
	{
		int cnt=0;
		for(int i=0;i<arr.length;i++)
		{
			for(int j=i+1;j<arr.length;j++)
			{
				for(int k=j+1;k<arr.length;k++)
				{
					if(arr[i] + arr[j] + arr[k] == x)
						cnt++;
					
				}
			}
		}
		return cnt;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {1, 2, 3, 4, 5, 6, 7 };
		System.out.println(triplet(arr, 12));
	}

}
