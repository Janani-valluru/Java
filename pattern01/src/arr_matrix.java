import java.util.Scanner;
import java.util.Arrays;

public class arr_matrix {

		public static void main(String[] args)
		{    
			
			Scanner sc = new Scanner(System.in);
			int[][] arr = new int[3][3];
			System.out.println(arr.length);
			
			
			//input
			for(int row=0;row<arr.length;row++) {
				for( int col = 0;col <arr[row].length;col++)
				{
					arr[row][col]= sc.nextInt();
				}
			}
			//output
			//for(int row=0;row<arr.length;row++) {
			//	for( int col = 0;col <arr[row].length;col++)
			//		System.out.println(arr[row][col] + "");
				
				for(int row=0;row<arr.length;row++) {
				        System.out.println(Arrays.toString(arr[row]));	
			}
			System.out.println();
			
		}
	}
		