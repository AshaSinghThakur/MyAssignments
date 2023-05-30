package week3day2;
// Base class 
public class Vehicle extends MyVehicle{
public void applyBreak()
{
	System.out.println("ApplyBreak Coming from Vehicle Class");
}
public void soundHorn()
{
	System.out.println("SoundOn Coming from Vehicle Class");
}
public static void main(String[] args) {
	Bajaj b=new Bajaj();
	b.applyBreak();
	b.soundHorn();
	b.handGear();
	b.meterBox();
	
}
}
