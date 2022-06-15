/*
 You have been given two integer arrays/list(ARR1 and ARR2) of size N and M, respectively. 
 You need to print their intersection; 
 An intersection for this problem can be defined when both the arrays/lists contain a particular value or to put it in other words, when there is a common value that exists in both the arrays/lists.
 */

package arraysAssignment;

public class IntersectionOfTwoArray {

	public static void intersection(int[] arr1,int[] arr2)
	{
		for(int i=0;i<arr1.length;i++)
		{
			for(int j=0;j<arr2.length;j++)
			{
				if(arr1[i] == arr2[j])
				{
					arr2[j]=Integer.MIN_VALUE;
					System.out.print(arr1[i]+ " ");
					break;
				}
			}
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr1 = {2, 6, 8, 5, 4, 3};
		int[] arr2 = {2, 3, 4, 7} ;
		intersection(arr1,arr2);
	}

}
