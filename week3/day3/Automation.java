package week3.day3;

public class Automation extends MultipleLanguage implements Language , TestTool{

	public void selenium() {
		// TODO Auto-generated method stub
		System.out.println("Implementing selenium()of Testtool interface in Automation concrete class");
		
	}

	public void java() {
		// TODO Auto-generated method stub
		System.out.println("Implementing java()of Language interface in Automation concrete class");
	}

	@Override
	public void ruby() {
		// TODO Auto-generated method stub
		System.out.println("Implementing ruby()of MultipleLanguage abstract class in Automation concrete class");
		
	}
public static void main(String[] args) {
	Automation A=new Automation();
	A.java();
	A.python();
	A.selenium();
	A.ruby();
}
}
