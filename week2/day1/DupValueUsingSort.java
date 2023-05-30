package week2.day1;

import java.util.Arrays;
//finding duplicate using single loop and using sort()

public class DupValueUsingSort {
	public static void main(String[] args) {
		int[] num= {2,5,7,7,9,2,3};
		//Sort 2,2,3,5,7,7,9
		Arrays.sort(num);
		for (int i = 0; i < num.length-1; i++) {
			if(num[i]==num[i+1])
				System.out.println(num[i]);
			
		}
	}

}
