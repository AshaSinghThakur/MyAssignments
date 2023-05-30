package week2.day1;

import java.util.Arrays;
/*MissingElementInAnArray

		// Here is the input
		int[] arr = {1,2,3,4,7,6,8};

		// Sort the array	
		

		// loop through the array (start i from arr[0] till the length of the array)

			// check if the iterator variable is not equal to the array values respectively
			
				// print the number
				
				// once printed break the iteration
				 * */
public class MissingElementInanArray {
public static void main(String[] args) {

	int[] a ={1,2,3,4,7,6,8};
	
	Arrays.sort(a);   //1234678	

	for (int i = 0; i < a.length-1; i++) {
		if(a[i+1]-a[i]==1)
		{
			continue;
		}
		else
		{
			System.out.println("Missing :" +(a[i]+1));
		}
	}
	
}}