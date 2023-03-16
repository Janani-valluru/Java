import java.util.ArrayList;
import java.util.Arrays;

class subarrray {
{
	    //Function to find a continuous sub-array which adds up to a given number.
	    ArrayList<Integer> subarraySum(int[] arr, int n, int s)
	    {
	    ArrayList<Integer> a = new ArrayList<Integer>();
	      for(int i=0;i<n;i++)
	      {
	          int j=i+1;
	          int sum = arr[i];
	          while(sum<s && j < n)//1<12//1<arr.length
	          {
	              sum = sum + arr[j++];
	          }
	          if(sum == s)
	          {
	              a.add(i+1);
	              a.add(j);
	              return a;
	          }
	      }
	      a.add(-1);
	      return a;
	  }
	    
	}

}
