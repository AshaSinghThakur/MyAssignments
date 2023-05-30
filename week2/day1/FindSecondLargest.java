package week2.day1;

/*FindSecondLargest
// Here is the input
int[] data = {3,2,11,4,6,7};


/*
 Pseudo Code:
 1) Arrange the array in ascending order
 2) Pick the 2nd element from the last and print it
 */


import java.util.Arrays;

public class FindSecondLargest {
	public static void main(String[] args) {
		int[] data= {3,2,11,4,6,7};
		Arrays.sort(data);
		for (int i = 0; i < data.length; i++) {
			System.out.println("Asending order Sort :"+data[i]);
			
		}
		System.out.println("------------------------------");
		
		System.out.println("Second Largest Number: "+data[data.length-2]);
	}

}
