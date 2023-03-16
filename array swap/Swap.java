import java.util.Arrays;

public class Swap {
	public static void main(String[] agrs)
	{
		int[] arr = {1,4,6,8,9};
		swap(arr,0,3);
		System.out.println(Arrays.toString(arr));
		
	}
	
	static void swap(int[] arr,int index0,int index3) {
		int temp = arr[index0];
		arr[index0] = arr[index3];
		arr[index3] = temp;
		
	}
		
		
	
}
