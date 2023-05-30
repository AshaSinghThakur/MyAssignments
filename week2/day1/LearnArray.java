package week2.day1;

import java.util.Arrays;

public class LearnArray {
	public static void main(String[] args) {
		
		int[] marks= {98,92,87,65,97,64,94,81};
		//length property
		//ctrl+2
		int length=marks.length;
		System.out.println("Total Number: "+length);
		//marks[5]
		System.out.println(marks[4]);
		//print last value
		System.out.println(marks[length-1]);
		//sort 
		Arrays.sort(marks);
		System.out.println("Sorted Order : ASC ");
		for(int i=0;i<marks.length;i++)
		{
			System.out.println(marks[i]);
		}
		// Array index out of bound exception
		//System.out.println(marks[10]);
		//Desc Sort order
		System.out.println("Sorted Order : DESC");
		for (int i = marks.length-1; i >=0; i--) {
			System.out.println(marks[i]);
		}
	}
}
