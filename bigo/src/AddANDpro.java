import java.util.Scanner;

public class AddANDpro {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AddANDpro main = new AddANDpro();
		int[] array = {1,4,6,9};
		main. arrayex(array);
		

	}
	
	void arrayex(int arr[] )
	{
		int sum =0;     // o(1)
		int product = 1;    // o(1)
		
		for(int i =0; i<arr.length;i++)       // o(N)
		{
			sum = sum+arr[i];   // o(1)
		}
		
		for (int i =0;i<arr.length;i++)    // o(N)
		{
			product=product *arr[i];  // o(1)
		}
	
	System.out.println(sum +","+product);
	}

}
// TIME COMPLEXITY IS O(N)
