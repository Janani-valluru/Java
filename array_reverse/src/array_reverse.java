import java.util.Arrays;

public class array_reverse {
		public static void main(String[] args) {
	   
			
		int[] arr = {1,4,6,8,9};
		//swap(arr,0,3);
		reverse(arr);
		System.out.println(Arrays.toString(arr));
		
	}
	static void reverse(int[] arr)
	{
		int start = 0;
		int end=arr.length-1;
		
		while(start<end)
		{
			swap(arr,start,end);
			start++;
			end--;
		}
		
	}
	static void swap(int[] arr,int index0,int index3) {
		int temp = arr[index0];
		arr[index0] = arr[index3];
		arr[index3] = temp;
		
	}

}
