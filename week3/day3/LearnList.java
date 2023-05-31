package week3.day3;


import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class LearnList {
	public static void main(String[] args) {
		
	 
	
	//syntax 
		
	List<String> mentors=new ArrayList<String>();
	//M1 - add()
	mentors.add("Gokul");
	mentors.add("Ranjani");
	mentors.add("Raghu");
	mentors.add("Vinod");
	System.out.println(mentors);
	//m2 - size
	int size=mentors.size(); // 
	System.out.println("size :" +size);
	//m3 - method overriding
	mentors.add(2,"Dilip"); // index 2 
	System.out.println(mentors);
	mentors.add("Dilip"); // Duplciate value
	System.out.println(mentors);
	for (int i = 0; i <=size; i++) {
		System.out.println(mentors.get(i)); // here i get only 
	}
		int size2=mentors.size();
		System.out.println(size);
		System.out.println("-----------------------------");
		for (int j = 0; j < size2-1; j++) {
			System.out.println(mentors.get(j));
		}
		//m4 - remove
		String remove=mentors.remove(5);
		System.out.println("after remove"+mentors);
		
		List<String> data=new ArrayList<String>();
		//m5 - addAll()
		data.addAll(mentors);
		data.add("Aravind");
		data.add("Supraja");
		System.out.println(data);
		// - m6 - remove all
		data.removeAll(mentors);
		// observe same with opp 
		mentors.removeAll(data); // it's of no use
		System.out.println(data);
		//m7- clear()
		mentors.clear();
		System.out.println(mentors);
		//m8 - contains 
		boolean contains=data.contains("Gokul"); //mentors.contains check once
		
		System.out.println(contains);
		
		
	}
}


