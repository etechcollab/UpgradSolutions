import java.util.*;

public class BottomtoUp {
    public static void main(String args[]) {
        Stack<Integer> stack = new Stack<>();
       System.out.println("Enter the elements");
        try (Scanner s = new Scanner(System.in)) {
			int n = s.nextInt();
			System.out.println("Enter the elements : " +n);
			while (n-- > 0)
			    stack.push(s.nextInt());
        
        
        
        }
        printFifthElementFromStart(stack);
  
    
    
    }
 
    // Method to print the fifth element from the bottom of the stack
    static void printFifthElementFromStart(Stack<Integer> stack) {
        
    	  int n=stack.size();
    	  if (n < 5)
              System.out.println("There are not enough elements in the stack");
          else {
        	  while (stack.size() > 5){
                  stack.pop();
                   }
              System.out.println(stack.peek());
          }
    
    }
    		
    	}


    	
    	
    	
    
