package arraysAssignment;

public class ReturnSum {
	public static int sum(int[] arr) {
		//Your code goes here
        int sum = 0;
        for(int i = 0;i < arr.length;i++)
        {
            sum = sum + arr[i];
        }
        return sum;
	}
	public static void main(String[] args) {
		int[] arr = {1,2,3,4,5};
		System.out.println(sum(arr));
	}
}
