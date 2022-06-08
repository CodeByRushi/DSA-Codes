package Arrays;

public class ArrayOperations {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean[] arr1 = new boolean[10];
		int[] arr2 = new int[5];
		float[] arr3 = new float[5];
		double[] arr4 = new double[5];
		char[] arr5 = new char[4];
		System.out.println(arr1[0]);
		System.out.println(arr2[0]);
		System.out.println(arr3[0]);
		System.out.println(arr4[0]);
		System.out.println(arr5[0]);
		
		arr2[1] = 10;
		arr2 = new int[2];//arr2 is now pointing to new array of size 2.
		System.out.println(arr2[1]);  
	}

}
