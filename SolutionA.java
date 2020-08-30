 import java.util.Scanner;

//upgrad Solution for Graded Question.
public class SolutionA{



    public static int searchEqually(int arr[], int n) {
        
    	//flag is used to set constant value to "determine we have reached a particular condition"
    	int flag =0;


        for(int i=1;i<n;) {
           //arr[i] is the index position of the given value in "to store in array"
        	//A[M] = M
        	if (arr[i]==i) {


                System.out.println("Matches not found");
                 flag=1;
                 break;
            } 
            
           if (flag==0) {
           	 System.out.println("Element "+n+"  found at " +arr[i]+ " index");
            }
           return  n;
        }
		return flag;
       



    }

    public static void main(String[] args) {
       
    	//Scanner element to take input from the user.
    	
    	try (Scanner sc = new Scanner(System.in)) {
			//Taking array_Size as the input from the user. 
			System.out.println("Enter the size of the array");
			int q;

			q=sc.nextInt();
			int  a[]=new int[q];
     //Taking array_Values to be stored in Array as the input from the user.
			System.out.println("Enter the Values");
			for (int i=0;i<q;i++)
			{
			    
			    a[i]=sc.nextInt();
			}
			//calling again the defined function and passing on parameters.
			System.out.println(+searchEqually(a, q));
		}
    }


}

