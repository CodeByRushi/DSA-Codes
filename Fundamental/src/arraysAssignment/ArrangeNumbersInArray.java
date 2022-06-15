/*
 You have been given an empty array(ARR) and its size N. The only input taken from the user will be N and you need not worry about the array.
Your task is to populate the array using the integer values in the range 1 to N(both inclusive) in the order - 1,3,5,.......,6,4,2.
 */


package arraysAssignment;

public class ArrangeNumbersInArray {

	public static void arrange(int[] arr, int n) {
		//Your code goes here
		int start = 0,end=n-1 ;
		int cnt=1;
		while(start <= end)
		{
			if(start == end)
			{
				arr[start] = cnt;
				break;
			}
			arr[start]=cnt;
			cnt++;
			arr[end]=cnt;
			cnt++;
			start++;
			end--;
		}

	}
	public static void printArray(int[] arr)
	{
		for(int i:arr)
		{
			System.out.print(i + " ");
		}
	}
	public static void main(String[] args){
		int[] arr = new int[9];
		arrange(arr,arr.length);
		printArray(arr);

	}

}
