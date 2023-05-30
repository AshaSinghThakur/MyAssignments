package week1.day2;
//Assignment 2
public class Factorial {
	public static void main(String[] args) {
		
		int Input=5;
		int fact=1;
	
		for (int i = 1; i <=Input; i++) {
			fact=fact*i;
			
		}
		System.out.println("Factorial of "+Input +" is : "+fact);
	}
	

}
