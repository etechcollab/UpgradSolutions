import java.util.Scanner;
import java.util.Stack;

public class Reverse_Stack{
    public static void main(String arg[]) {
        Stack<Character> s = new Stack<Character>();
        System.out.println("Enter elements :");
        Scanner in = new Scanner(System.in);
        String data = in.nextLine();
        //write your code here
          for(int i=0;i<data.length();i++) {
        	  s.push(data.charAt(i));
        	  
        	  
          }
    
    System.out.println("Reversed element :");
    while(s.isEmpty()==false) {
    	Character sh=s.pop();
    	System.out.print(sh);
    	
    	
    	
    }
    
    
    
    
    
    }
}
