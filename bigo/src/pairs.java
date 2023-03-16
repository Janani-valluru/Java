
public class pairs {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		pairs main = new pairs();
		int[] array = {1,4,6,9};
		main. arrayex(array);
	}
	
	void arrayex(int arr[] )
	{
		for(int i=0;i<arr.length;i++)     //O(N)
			for(int j=1;j<arr.length;j++) //O(N)
			{
				System.out.println(  arr[i]+","+arr[j]);     //O(1)
			}
	}

}

//TIME COMPLEXITY IS O(N2)
