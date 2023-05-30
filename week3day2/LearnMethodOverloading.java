package week3day2;

public class LearnMethodOverloading {
	public void add( float f, float g)
	{
		System.out.println(f+g);
	}
	public void add(int a, float b)
	{
		System.out.println(a+b);
	}
	public float sub(float a, int b)
	{
		return (int)b-a;

	}
	public float sub(int a,float b)
	{
		return a-b;
	}
	public static void main(String[] args) {
		LearnMethodOverloading lmo=new LearnMethodOverloading();
		lmo.add(10,20);
		lmo.add(20f,10.05f);
		/*int sub=lmo.sub(10,20);
		System.out.println(sub);
		System.out.println(lmo.add(2,3)); */
	}
}
