package week3.day3;

public class Icici implements Rbi {

	public int withdraw() {
		// TODO Auto-generated method stub
		return 1000000;
	}

	public String kyc() {
		// TODO Auto-generated method stub
		return "Pan Card";
	}
	public int withdrawlimit()
	{
		return 1000;
		
	}
	public static void main(String[] args) {
		Icici I=new Icici();
		System.out.println(I.withdraw());
		System.out.println(I.kyc());
		System.out.println(I.withdrawlimit());
		
	}

	public float ppf() {
		return 8.5f;
		// TODO Auto-generated method stub
		
	}

	public void data() {
		// TODO Auto-generated method stub
		
	}

}
