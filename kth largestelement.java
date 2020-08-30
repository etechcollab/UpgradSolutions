package kthlargestElement;

import java.util.*;

public class Source {
  // This function returns the sorted stack
   public static Stack < Integer > sortStack(Stack < Integer > input) {
	findKthLargestNum(input, 0);
   
	 return sortStack(input);
   
   }

   public static void findKthLargestNum(Stack <Integer> sortedStack, int k) {
     
	   Stack <Integer> temp=new Stack< Integer > ();
	   int value = k;
	   while(!sortedStack.isEmpty()) {
		   sortedStack.pop();
	    value=sortedStack.pop();
	   }
	
	   while(!temp.isEmpty()&& value<temp.peek() ) {
		   
		   sortedStack.push(temp.pop());
		   
	   }
	   temp.push(value);
	   
   
}


  public static void main(String args[]) {
        Stack < Integer > inputStack = new Stack < Integer > ();
        Scanner in = new Scanner(System.in);
        int n = in .nextInt();
        for (int i = 0; i < n; i++) {
            inputStack.add( in .nextInt());
        }

        if (inputStack.isEmpty()) {
            System.out.println("stack is empty");
            System.exit(0);
        }

        int k = in .nextInt();
        if (k > inputStack.size()) {
            System.out.println("invalid input");
            System.exit(0);
        }

        // This is the temporary stack

        Stack < Integer > temp = sortStack(inputStack);
        findKthLargestNum(temp, k);

    }
}
