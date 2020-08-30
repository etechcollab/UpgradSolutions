import java.util.Scanner;

public class SoluB {

	public static void main(String[] args) {
		try (Scanner scan = new Scanner (System.in)) {
			
			//Taking Total Number of Elements From User as input
			System.out.println("Enter Total Number Of Elements");
			int array=scan.nextInt();
			int[] input=new int [array];
			
			 
			//Entering Total Element Values As Input
			System.out.printf("Enter %d integers %n", array);
			 for (int i=0;i<array;i++) {
				 input[i]=scan.nextInt();
				 
			 }
			
			 //Taking in Number to be searched in Array values
			 System.out.println("Please enter number to be searched in array");
			 int key = scan.nextInt();
			 int index = binarySearchValues(input, key);    

			 //Found or not found conditions
			 
if(index==-1) {
			System.out.printf("Sorry, %d is not found in array %n", key);

}
else   {
			System.out.printf("great, %d is found in array %n", key, index);
}
		}
	
	}
	




//Implementation of binary search using BinarySearchValues method.
public static int binarySearchValues(int[] input, int number) {
	int low=0;
	int high=input.length-1;
	
	while(high>=low) {
		int middle = (low + high) / 2;
        if(input[middle]==number) {
        	return middle;
        	
        }else if(input[middle]<number) {
        	low=middle+1;
        }else if(input[middle]>number) {
        	high=middle-1;
        }
		}
	
	
	
return -1;
	
}



}











