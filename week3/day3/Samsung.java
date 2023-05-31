package week3.day3;

public class Samsung extends AndroidTV{

	public void playVideo() {
		// TODO Auto-generated method stub
		System.out.println("playVideo() in interface Implemented in Samsung concrete class");
		
	}
	public void samsungM() {
		// TODO Auto-generated method stub
		System.out.println("samsung()");

	}
	public static void main(String[] args) {
		Samsung s=new Samsung();
		s.openApp();
		s.playVideo();
		s.samsungM();
	}

}
