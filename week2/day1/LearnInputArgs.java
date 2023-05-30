package week2.day1;

public class LearnInputArgs {
public int add(int a,int b) {
	// TODO Auto-generated constructor stub
	return a+b;
}
public int sub(int a,int b)
{
	return a-b;
}
public void mul()
{
	
}
public static void main(String[] args) {
	LearnInputArgs arg=new LearnInputArgs();
	System.out.println(arg.add(10,20));
	System.out.println(arg.sub(20,30));
int output=arg.add(10,20);
System.out.println("Output Value :"+output);
arg.mul(); // it does not expect any return type as this is void.

}
}
