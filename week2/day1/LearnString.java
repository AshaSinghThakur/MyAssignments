package week2.day1;

import java.util.Iterator;

public class LearnString {
	public static void main(String[] args) {
		//method 1 - Using String Literal 
		String name="Give me Some Sunshine";
		String name1="Give me Some Sunshine";
		//method 2 - Using String Instantiation
		String str=new String("Give me Some Sunshine");
		String str1=new String("Give me Some Sunshine");
		//Method 1 Using Length() method
		int length=name.length();
		System.out.println("Using String Literal method finding a length : "+length);
		//equal() method
		//dif between equals() - Compare String value and == compare the memory address 
		if(name.equals(str)) //Stores in constant pool memory
		{
			System.out.println("Data matched using equals () : True");
		} else 
			System.out.println("Data is not matched using equals ()  : False");
	//comparing string literal with string Instantiation
	if(name==str) // has same memory address - heap memory
	{
		System.out.println("Data matched using == Operator for literal vs Instatiation : True");
	}
	else 
		System.out.println("Data is not matched using == operator  for literal vs Instatiation : False");
	
	if(name==name1) // comparing 2 Literal strings with == operator 
	{
		System.out.println("Data matched using == Operator for Literal var : True");
	}
	else 
		System.out.println("Data is not matched using == operator for Literal var : False");
	if(str==str1) // comparing 2 Instantiation strings var with == operator 
		// please note here instantiation variables uses new so it creates new obj everytime = New memory address ( 300m ==400m ) 	
	{
		System.out.println("Data matched using == Operator for Instantiation var : True");
	}
	else 
		System.out.println("Data is not matched using == operator for Instantiation var : False");
	
	// Method 3 equalIgnore case
	if(name.equalsIgnoreCase(str1))
	{
		System.out.println("Literval vs Instantiation var comaprision with equalsIgnorexcase : True ");
	}
	else System.out.println("Literval vs Instantiation var comaprision with equalsIgnorexcase : False ");
	
	//method 4 contains() returns boolean statement 
	boolean contains = name.contains("s");
	System.out.println("contains() method validation:" +contains);
	//method 5 toCharArray()
	String name2="Asha";
	char[] charArray = name2.toCharArray();
	for (int i = 0; i < charArray.length; i++) {
		System.out.println(charArray[i]);
	}
	//method 6 charAt(index) index starts from 0
	char charAt = name2.charAt(2);
	System.out.println("charAt(index) method :"+charAt);
	//Method 7 toUppercase()
	String upperCase = name2.toUpperCase();
	System.out.println("toUpperCase(): "+upperCase);
	//method 8 toLowerCase()
	String lowerCase = name2.toLowerCase();
	System.out.println("toLowerCase() :"+lowerCase);
	// method 9 split()
	String str2="Life is Beautiful";
	String[] split = str2.split(" ");
	for (int i = 0; i < split.length; i++) {
		System.out.println(split[i]);
	}
	
	
}
}