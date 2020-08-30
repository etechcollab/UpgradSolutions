import java.util.*;

public class stack_pattern {
    public static void main(String args[]) {
        Stack<Integer> stack = new Stack<>();
        try (Scanner s = new Scanner(System.in)) {
			//System.out.println("Enter elements :");
			int n = s.nextInt();
			//System.out.println("Enter the  element values :");
			while (n-- > 0)
			    stack.push(s.nextInt());
		}
        deleteFirstHalf(stack);
    }

    // Method to delete the first half of the elements from the bottom of the stack and print the remaining elements
    static void deleteFirstHalf(Stack<Integer> stack) {
        // Write your code here
       
    if(stack.isEmpty()) {
    	 return;
    }
  for (int i=0;i<stack.size();i++) {
    System.out.print(" " +stack.pop());	
	
    }
int n = 1;
reverse(stack, n);
    }
    
static void reverse(Stack<Integer> stack, int n) {
		        if (n > 0) {
		            int temp = stack.pop();
		            
		            reverse(stack, n - 1);
		            
		       
		        }
sort(stack);	
}
      
    
    


	
 static Stack<Integer> sort(Stack<Integer>input) 
{ 
	 
Stack<Integer> tmpStack1 = new Stack<Integer>(); 
while(!input.isEmpty()) 
{ 
 
int tmp = input.pop(); 

while(!tmpStack1.isEmpty() && tmpStack1.peek()  
        > tmp) 
{ 
input.push(tmpStack1.pop()); 
} 

 
tmpStack1.push(tmp); 
} 
return tmpStack1; 
} 
	
}
