package week3.day3;

import java.util.ArrayList;
import java.util.List;

/*
 * Pseudo Code
 *input: int[] a={3,2,11,4,6,7};
 *        int[] b={1,2,8,4,9,7};
 *output:2,4,7
 *
 * a) Declare An Array for {3,2,11,4,6,7};	 
 * b) Declare another Array for {1,2,8,4,9,7};
 * c) create a two empty Lists - list1 & list2
 * c) Declare for loop iterator from 0 to array a.length and add into list1
 * d) Declare for loop iterator from 0 to array b.length and add into another list2
 * e) Compare Both list1 & list2 using a nested for loop
 *    1)Print the matching number
 *  
 */

public class FindIntersection {
public static void main(String[] args) {
	
	int[] a={3,2,11,4,6,7};
	int[] b={1,2,8,4,9,7};
	List<Integer> list1=new ArrayList<Integer>();
	List<Integer> list2=new ArrayList<Integer>();
	for (int i = 0; i < a.length; i++) {
		list1.add(a[i]);
		
	}
	for (int i = 0; i < b.length; i++) {
		list2.add(b[i]);
	}
	System.out.println("a[i] values in list1 is :"+list1);
	System.out.println("b[i] values in list1 is :"+list2);
	//1 Using Array
/* for (int i = 0; i < a.length; i++) {
		for (int j = 0; j < b.length; j++) {
			if(a[i]==b[j])
			{
				
				System.out.println("Intersection value :"+a[i]);
			}
			
		}
		
	} 
	
	Using list varibales 
	for (int i = 0; i<list1.size(); i++) {
		for (int j = 0; j < list2.size(); j++) {
			if(list1.get(i)==list2.get(j))
			{
				
				System.out.println("Intersection value :"+list1.get(i));
			}
		}
			
	*/
	//Trying to use temp variable to hold the result
	
	List<Integer> temp=new ArrayList<Integer>();
	for (int i = 0; i<list1.size(); i++) {
		for (int j = 0; j < list2.size(); j++) {
			if(list1.get(i)==list2.get(j))
			{
				temp.add(list1.get(i));
			}
		}
	
}
	System.out.println("Intersection value :"+temp);
}
}

