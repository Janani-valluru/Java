//{ Driver Code Starts
//Initial Template for Java
import java.io.*;
import java.util.*; 
class GFG{
    public static void main(String args[]) throws IOException { 
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine().trim());
        while(t-- > 0){
            String str = read.readLine().trim();
            Solution ob = new Solution();
            System.out.println(ob.to_upper(str));
        }
    }
}
// } Driver Code Ends


//User function Template for Java
class Solution 
{ 
    String to_upper(String str) 
    { 
      
       String n =str.toUpperCase();
       return n;
    }
     
       public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        Solution aa = new Solution();
        String a = s.next();
        aa.to_upper(a);
} 
    
    
}