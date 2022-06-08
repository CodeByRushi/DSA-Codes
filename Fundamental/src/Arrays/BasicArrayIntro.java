package Arrays;

public class BasicArrayIntro {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = new int[5];
		arr[1] = 10;
		arr = new int[2];
		System.out.println(arr[1]);   
		/*arr initially refers to an array of size 5, line 8 assigns 10 to arr[1] 
		but in line 9 arr is made to point to a new array of size 2. 
		By default all elements of integer array are initialized to 0. Hence line 10 will print 0.*/

	}

}
