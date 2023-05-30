package week2.day1;

public class FindDuplicateValues {
	public static void main(String[] args) {

		int[] num= {1,3,4,3,1,2,5,6,5,7,4,2};
		//Duplicate values 1 2 3 4 5
		//num[0]=1 Outer most for loop
		for (int i = 0; i < num.length; i++) {
			//num[0+1]=3 inner most for loop 
			for (int j = i+1; j < num.length; j++) {
				if(num[i]==num[j])
				{
					System.out.println("Duplicate values are :" +num[i]);
				}


			}


		}
	}

}


