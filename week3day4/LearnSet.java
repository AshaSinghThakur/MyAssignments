package week3day4;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class LearnSet {
	public static void main(String[] args) {
		Set<String> mentors=new LinkedHashSet<String>();
		//LinkedHashSet<String>();
		//TreeSet<String>();
		//observe the output with 3 dif implemated classes 
		
		
		mentors.add("Ranjani");
		mentors.add("Gokul");
		mentors.add("Vinod");
		mentors.add("Ragu");
		System.out.println(mentors);
		
	}

}
