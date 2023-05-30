package week1.day2;

public class LearnForLoop {
	public static void main(String[] args) {
		//for - ctrl + space
		//i=0 - Initial number to start 
		for(int i=0;i<=10; i++)
		{
			if (i==8)
			{
				System.out.println("I reached " +i);
				continue;

			}
			System.out.println(i);
		}

		System.out.println("========================================");
		// reverse	

		for(int i=20;i>=0;i--)
		{
			if(i==6)
			{
				System.out.println("I reached 6");

				break;
			}
			System.out.println(i);
		}
	}

}
