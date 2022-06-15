package Arrays;

public class Sample {
	public static int findTriplet(int[] arr, int x) {
		//Your code goes here
		int cnt=0,sum;
		for(int i=0;i<arr.length;i++)
		{
			for(int j=i+1;j<arr.length;j++)
			{

				for(int k=j+1;k<arr.length;k++)
				{
					sum = arr[i] + arr[j] + arr[k];
					if(sum == x)
					{
						System.out.println(arr[i] + " " +arr[j]+ " "+arr[k]);

						cnt++;
					}
				}
			}
		}
		return cnt;
	}

	public static void main(String[] args) {
		int[] arr = {5,5,4,4,5,4};
		findTriplet(arr,13);
		
	}
}

