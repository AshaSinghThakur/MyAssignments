package week3day2homework;

public class Desktop extends Computer{
	public void desktopSize() {
		// TODO Auto-generated method stub
		System.out.println("desktopSize() method is called from Desktop");

	}
	public static void main(String[] args) {
		Desktop d=new Desktop();
		d.computerMode();
		d.desktopSize();
	}

}
