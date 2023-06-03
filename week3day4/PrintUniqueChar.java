package week3day4;

import java.util.LinkedHashSet;
import java.util.Set;

public class PrintUniqueChar {
public static void main(String[] args) {
	String name="google";
	char[] ch = name.toCharArray();
	Set<Character> unq=new LinkedHashSet<Character>();
	Set<Character> dup=new LinkedHashSet<Character>();
	 /*for (Character i : ch) {
		unq.add(i);
		
		
	}*/
	String Output="";
	for (Character i : ch) {
		if(!unq.add(i))
		{
		Output=Output+i;
		dup.add(i);
	}
	}	
		System.out.println("Output of Duplicate Char is :"+Output);
	System.out.println("Unique value of google is ( without duplicate ) "+unq);
	System.out.println("Duplicate Value :"+dup);
}
}

