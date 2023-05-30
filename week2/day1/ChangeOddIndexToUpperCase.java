package week2.day1;




/* ChangeOddIndexToUpperCase
	 Pseudo Code
	 
	 * Declare String Input as Follow
	  
	 * String test = "changeme";
	 
	 * a) Convert the String to character array
	 
	 * b) Traverse through each character (using loop)
	 
	 * c)find the odd index within the loop (use mod operator)
	 
	 * d)within the loop, change the character to uppercase, if the index is odd else don't change
	  
	 */

public class ChangeOddIndexToUpperCase {
	public static void main(String[] args) {	
		String s = "changeme";
		char[] c = s.toCharArray();
		String output = "";
		
		for(int i=0;i<c.length;i++){
		    if(i%2 !=0){
		    char ch = Character.toUpperCase(c[i]); //c
		    output += ch;
		    }else 
		    {
		    	output = output + c[i]; //cH
		    }
		}
		System.out.println("Output : " +output);
		
	}
	}

