
public class Max {
	public static void main(String[] args)
	{
		int [] arr = {2,3,4,5,8,9,7,6};
		System.out.println(maxRange(arr,1,6));
		
	}
	static int maxRange(int[] arr,int start,int end) {
		if(end>start) {
			return -1;
		}
		if(arr==null) {
			return -1;
		}
			int maxVal = arr[start];
		int sum =0;
		for(int i=start;i<=end;i++)
		{
			if(arr[i]>maxVal)
			{
				maxVal =arr[i];
				sum = sum +arr[i];
			}
		}
		return maxVal;
	}

	//imagine that array is not empty(arr([0]) or else if it it empty use Integer.MIN_VALUE
	static int max(int[] arr) {
		if(arr.length==0) {
			return -1;
		}
		int maxVal = Integer.MIN_VALUE;
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]>maxVal)
			{
				maxVal =arr[i];
			}
		}
		return maxVal;
	}
	
	
}


