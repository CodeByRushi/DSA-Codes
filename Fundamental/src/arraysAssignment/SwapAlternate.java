/*
 You have been given an array/list(ARR) of size N. You need to swap every pair of alternate elements in the array/list.
You don't need to print or return anything, just change in the input array itself.
 */

package arraysAssignment;

public class SwapAlternate {
	
	public static void swapAlternate(int arr[]) {
    	//Your code goes here
        int temp;
        for(int start = 0;start+1 < arr.length;start+=2)
        {
            temp = arr[start];
            arr[start] = arr[start+1];
            arr[start+1]=temp;
        }
    }
	public static void printArray(int[] arr)
	{
		for(int i:arr)
		{
			System.out.print(i + " ");
		}
	}
	public static void main(String[] args) {
		int[] arr = {1,2,3,4,5,6,7};
		swapAlternate(arr);
		printArray(arr);
	}

}
