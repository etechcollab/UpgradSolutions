import java.util.Scanner;
 public class SolutionB
{
   public static void main(String args[])
   {
      int i, toSearch, key, arr[], low, high, mid;
      try (
	Scanner input = new Scanner(System.in)) {
		System.out.println("Enter total number of elements:");
		toSearch = input.nextInt(); 

		  //Create array to store the all the numbers
		  arr = new int[toSearch];

		  System.out.println("Enter " + toSearch + " integer values");
		  
		  
		  //Conditional statement//
		  
		  for (i = 0; i < toSearch; i++)
		      arr[i] = input.nextInt();

		  System.out.println("Enter the search value in the array:");
		key = input.nextInt();
	}
      low = 0;
      high = toSearch- 1;
      mid = (low + high)/2;

      while( low <= high )
      {
         if ( arr[mid] < key)
          low = mid + 1;
         else if ( arr[mid] == key )
         {
           System.out.println(key + " found at position in array " + (mid  + 1) + ".");
           break;
         }
         else
         {
        	 high = mid - 1;
         }
         mid= (low + high)/2;
      }
      if ( low > high )
          System.out.println(key + " is not found");
   }
}