package Arrays;

public class UniqueNumberOfOccurrences {
		public static void print(int[] arr)
		{
//			for(int i=0;i<3;i++)
//				System.out.println(arr[i]);
		}
	    public static boolean uniqueOccurrences(int[] arr,int[]occ) {
	        //int[] occ=new int[1000];
	        int cnt;int temp1,temp2;
	        int k=0;
	        for(int i=0; i<3;i++)
	        {
	        	temp1 = arr[i];
	            if(temp1 == Integer.MIN_VALUE)
	            {
	                continue;
	            }
	            cnt=0;
	            for(int j=0;j<3;j++)
	            {
	                if(temp1==arr[j])
	                {
	                    cnt++;
	                    
	                    arr[j]=Integer.MIN_VALUE;
	                }
	               // System.out.println(arr[j]);
	            }
	           // System.out.println(cnt);
	            for(int p=0;p<k;p++)
	            {
	                if(occ[p] == cnt)
	                {
	                	return false;
	                }
	            }
	            occ[k]=cnt;
	            k++;
	            
	        }
	      //  System.out.println("true");
	        return true;
	    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {1,2,2};
		int[] occ=new int[1000];
		boolean b =uniqueOccurrences(arr,occ);
		System.out.println(b);
		//print(occ);

	}

}
