package ProblemStatement_2;

public class problem2_1 {
	// Java program to check if a string is Palindrome
	// using command line arguments
	  
	class GFG {
	  
	    // Function to reverse a string
	    public static int isPalindrome(String str)
	    {
	        int n = str.length();
	  
	        // Check if the characters from one end
	        // match with the characters
	        // from the other end
	        for (int i = 0; i < n / 2; i++)
	            if (str.charAt(i) != str.charAt(n - i - 1))
	  
	                // Since characters do not match
	                // return 0 which resembles false
	                return 0;
	  
	        // Since all characters match
	        // return 1 which resembles true
	        return 1;
	    }
	  
	    // Driver code
	    public static void main(String[] args)
	    {
	  
	        // Check if length of args array is
	        // greater than 0
	        if (args.length > 0) {
	  
	            // Get the command line argument
	            // and check if it is Palindrome
	            int res = isPalindrome(args[0]);
	  
	            // Check if res is 0 or 1
	            if (res == 0)
	                // Print No
	                System.out.println("No\n");
	            else
	                // Print Yes
	                System.out.println("Yes\n");
	        }
	        else
	            System.out.println("No command line "
	                               + "arguments found.");
	    }
	}
}
