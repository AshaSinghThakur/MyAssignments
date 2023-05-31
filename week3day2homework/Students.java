package week3day2homework;

public class Students {
	public void getStudentInfo(int id) {
		// TODO Auto-generated method stub
		System.out.println("passed id to getStudentInfo(): is "+id);

	}
	public void getStudentInfo(int id,String name) {
		// TODO Auto-generated method stub
		System.out.println("passed id is " +id +" and name to getStudentInfo(): is " +name );
	}
	public void getStudentInfo(String email,double phoneNumber) {
		// TODO Auto-generated method stub
		System.out.println("passed email is " +email +" and Phone number to getStudentInfo(): is "+phoneNumber);
	}
	
	public static void main(String[] args) {
		//Create multiple getStudentInfo() method by passing id argument alone, by id & name, by email & phoneNumber
		
		Students s=new Students();
		s.getStudentInfo(123);
		s.getStudentInfo(124, "Asha");
		s.getStudentInfo("asha@gmail.com",987654321);
		
	}

}
