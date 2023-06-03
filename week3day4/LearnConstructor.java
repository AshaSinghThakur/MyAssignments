package week3day4;

public class LearnConstructor {
	int x;
	String name;
	// default constuctor 
	LearnConstructor()
	{
		System.out.println("I am a default Constructor");
		x=20;
		name="Asha";

	}
	//parameterized Constructor
	LearnConstructor(int age,String Value)
	{
		System.out.println("I am Parameterized Constructor ");
		System.out.println(age+" "+Value);
		
	}
	public static void main(String[] args) {
		
		LearnConstructor lc=new LearnConstructor();
		LearnConstructor lc1=new LearnConstructor(21,"Asha");
		LearnConstructor lc2=new LearnConstructor(25,"Nav");
		System.out.println("Default Value of Int :" +lc.x);
		System.out.println("Default value of String : "+lc.name);
	}
	

}
