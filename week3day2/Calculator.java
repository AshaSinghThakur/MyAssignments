package week3day2;

public class Calculator {
public void add(int a,int b)
{
	System.out.println(a+b);
}
public void add(int a,int b,int c)
{
	System.out.println(a+b+c);
}
public void multiple(double a,double b)
{
	System.out.println(a*b);
}
public void multiple(float a, float b)
{
	System.out.println(a*b);
}
public static void main(String[] args) {
	
	Calculator cal=new Calculator();
	cal.add(10, 20);
	cal.add(10,20,30);
	cal.multiple(10.1234567890, 20.9876543210);
	cal.multiple(10.04f, 20.078f);
	
}
}
