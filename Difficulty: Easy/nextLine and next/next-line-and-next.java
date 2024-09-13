//{ Driver Code Starts
//Initial Template for Java
/*package whatever //do not write package name here */

import java.io.*;
import java.util.*;

class GFG {
	public static void main (String[] args) {
		
		Geeks g = new Geeks();
		g.getInput();
	}
}
// } Driver Code Ends


// Back-end complete function Template for Java

class Geeks {
    // Method to get input from user
    static void getInput () {
        // Creating a Scanner object to read input from user
        Scanner sc = new Scanner(System.in);
        
        // Getting the number of test cases from user
        int t = sc.nextInt();
        
        // Looping through each test case
        while (t-- > 0) {
            // Getting the integer input from user
            int a = sc.nextInt();
            
            // Moving to the next line to read the string input
            sc.nextLine();
            
            // Getting the string input from user
            String s = sc.nextLine();
            
            // Printing the integer value
            System.out.println(a);
            
            // Printing the string value
            System.out.println(s);
        }
    }
}