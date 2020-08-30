
public class palindrome_func {
         static boolean isPalindrome(String str) {
		
		// Pointers pointing to the beginning and the end of the string 
		int i=0, j=str.length()-1;
		
		while(i<j) {
			// If there is a mismatch 
			if(str.charAt(i)!=str.charAt(j)) {
				return false;
				
				
				}
			 // Increment first pointer and 
            // decrement the other 
			i++;
			j--;
			
		}
		
		
		return true;
		
	}
	
	
public static void main(String[] args) {
	String str="racecar";
	 if (isPalindrome(str)) 
         System.out.print("Yes"); 
     else
         System.out.print("No"); 
 } 

	
	
	
	
}


