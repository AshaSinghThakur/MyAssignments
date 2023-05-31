package week3day2homework;

public class AxisBank extends BankInfo{

	public void deposit() {
		// TODO Auto-generated method stub
		System.out.println("Overriding deposit() in AxisBank");

	}
	public static void main(String[] args) {
		AxisBank a=new AxisBank();
		a.deposit();
		a.Fixed();
		a.saving();
	
	}
}
