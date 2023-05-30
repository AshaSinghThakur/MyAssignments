package week1.day2;
//Assignment 3
public class Fibonacci {
	public static void main(String[] args) {
		int range=8;
		int FirstNum=0,SecondNum=1,sum;
		System.out.println("Fibonacci of Range "+range +" is as follows :");
		System.out.println(FirstNum);
		System.out.println(SecondNum);
		sum=FirstNum+SecondNum;
		System.out.println(sum);
		for (int i = 1; i <range-2; i++) {
			
			FirstNum=SecondNum;
			SecondNum=sum;
			sum=FirstNum+SecondNum;
			System.out.println(sum);
		}
	}

}
