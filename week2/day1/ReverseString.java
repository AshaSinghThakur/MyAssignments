package week2.day1;

public class ReverseString {
	public static void main(String[] args) {
		String data="test leaf";
		System.out.println("Before string reverse"+data);
		//faeltset Reverse of data
		char[] charArray = data.toCharArray();
		for (int i = charArray.length-1; i >=0; i--) {
			System.out.println("String Reverse :"+charArray[i]);
			
		}
	}

}
