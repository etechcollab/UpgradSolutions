//To reverse integer that is 321---->123

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class reverse_AQueue{
    static Queue<Integer> q = new LinkedList<Integer>();
    
    public static Queue<Integer> func() {
        while(!q.isEmpty()) {
        	System.out.print(q.peek() + " ");
        	q.remove();
        	
        }
		return q;

        } 
    
    
    
    private static Queue<Integer> reverseQueue(Queue<Integer> q) {
    	 // Base case 
        if (q.isEmpty()) 
            return q; 
      
        // Dequeue current item (from front)   
        int data = q.peek(); 
        q.remove(); 
      
        // Reverse remaining queue   
        q = reverseQueue(q); 
      
        // Enqueue current item (to rear)   
        q.add(data); 
              
        return q; 	
  }


public static void main(String arg[]) {
        try (Scanner in = new Scanner(System.in)) {
			int n = in.nextInt();

			for (int j = 0; j < n; j++) {
			    q.add(in.nextInt());
			}
		}
        reverseQueue(q);
        func();
        System.out.print(q);
    }
}