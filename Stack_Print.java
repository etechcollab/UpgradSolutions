import java.util.Stack;

public class Stack_Print {

    public static void main(String arg[]) {
        Stack<Integer> stack = new Stack<Integer>();
        stack.push(2);
        stack.push(45);
        stack.push(53);
        stack.push(54);
        //stack.pop();
        stack.push(12);


        //Write your code here. Your stack should finally look like this: [2, 45, 53, 54, 12].
        System.out.print(stack.toString());


    }
}