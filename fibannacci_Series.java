import java.util.Scanner;
public class fibannacci_Series {
    static int fib(int n) {
        /* Declare an array to store Fibonacci numbers */
        /* Assign the 0th, 1st, and 2nd numbers of the Fibonacci series to 0, 1, and 2 respectively */
        /* Add the previous three numbers in the series, and store them */
        /* Return the nth element in the series */
    	
    	 /* Declare an array to store Fibonacci numbers. */
        int f[] = new int[n+3]; // 1 extra to handle case, n = 0 
        int i; 
           
       
        f[0] = 0; 
        f[1] = 1; 
        f[2] = 2;
          
        for (i = 3; i <= n; i++) 
        { 
           /* Add the previous 3 numbers in the series 
             and store it */
            f[i] = f[i-1] + f[i-2]+f[i-3]; 
        } 
           
        return f[n-1]; 
        } 
     
    public static void main(String args[])
    {
    	Scanner scan = new Scanner(System.in);
    	// Enter the number n
        int n = scan.nextInt();
        System.out.println(fib(n));
    	scan.close();
    }
}