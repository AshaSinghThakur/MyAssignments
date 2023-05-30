package week1.day2;
//Assignment 1
public class NegToPositive {
public static void main(String[] args) {
	int num=-30;
	if(num<0)
	{
		System.out.println("Negative number is "+num);
		num=(-num);
		System.out.println("Converted Negative to positive number is " +num);
	}
}
}
