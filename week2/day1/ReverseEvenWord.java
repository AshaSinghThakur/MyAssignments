package week2.day1;

public class ReverseEvenWord {

	public static void main(String[] args) {

		String test = "I am a software tester";
		//s[0] s[1] s[2] s[3] s[4]

		String[] s = test.split(" ");
		String output="";
		for(int i=0;i<s.length;i++){
			if(i%2 !=0){ // reverse code s[1] am 
				String reversedword = "";
				char[] evenword = s[i].toCharArray(); // s[1] = am  --> {'a','m'}, s[3] = software ---> {'s','o','f','t','w','a','r','e'};
				for (int j = evenword.length-1; j>=0 ;j--) { // j=1 , 1>=0 , 
					reversedword = reversedword + evenword[j]; // ""+'m' j=0 , 0>=0 'm'+'a'
				} //ma
				output = output + reversedword + " "; // (2) /ma (4)

			}else {
				output = output + s[i] +" "; // (1) I (3)
			}
		}

		System.out.println(output);



	}

}
