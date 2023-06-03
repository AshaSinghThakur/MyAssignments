package week3day4;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

import io.cucumber.java.lv.Un;

public class PrintUniqueValueUsingList {
public static void main(String[] args) {
	int[] num= {2,3,4,2,5,7,9,2,4,6,10,8,7};
	Set<Integer> Unique=new LinkedHashSet<Integer>();
	Set<Integer> Duplicate=new TreeSet<Integer>();
	//for (int i = 0; i < num.length; i++) {
		//Unique.add(num[i])	;
		for (int j = 0; j < num.length; j++) {
			if(!Unique.add(num[j]))
			{
				Duplicate.add(num[j]);
			}
		}
		
		// or below 
		
	System.out.println(Unique);
	System.out.println(Duplicate);
	
	//how to convert Set into List to get an access to get()
	List<Integer> data=new ArrayList<Integer>(Unique);
	System.out.println("Coming from Set to List "+Unique);
	Integer Value=data.get(5);
	System.out.println("Printing Value using List get() " +Value);
	}
}
//}
