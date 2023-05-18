package week1.day1;

public class Bike {
	public void driveBike()
	{
		System.out.println("DriveBike Method calling");
	}

	public void applyBike() {
		// TODO Auto-generated method stub
		System.out.println("Apply Bike Method calling");

	}
	public void soundHorn() {
		// TODO Auto-generated method stub
		System.out.println("Sound Horn Method calling");
	}
	public void isPuncture() {
		// TODO Auto-generated method stub
		System.out.println("Is Punture method calling");
	}
	public static void main(String[] args) {
		Bike b=new Bike();
		b.applyBike();
		b.driveBike();
		b.soundHorn();
		b.isPuncture();
	}
}
