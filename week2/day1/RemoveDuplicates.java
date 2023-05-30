package week2.day1;

public class RemoveDuplicates {
	public static void main(String[] args) {
		String text = "We learn java basics as part of java sessions in java week1";
		String[] words = text.split(" ");
		//welearnjavabasics{"we","learn"
		int count;

		for (int i = 0; i < words.length; i++) {
			count = 1;
			for (int j = i + 1; j < words.length; j++) {
				if (words[i].equals(words[j])) {
					count++;
					if (count > 1) {
						words[j] = ""; // replace Null here i=2 j=7
						/*i=0 j=1 to 11 
						words[0]=words[1] we ===learn 
						i=0 j=2
						we==java
						i=0 j=3
						learn==java
						i=0 j=

						//i=1 j=2 to 11
						 words[1]=words[2]
						 //i=2 j=3
						  words[2]=words[3]
						  java==basics
						  i=2 j=4
						  java==as
						  i =2 j =7 
						  java==java
						  then count=2
						 */

					}
				}
			}
		}

		for (int s = 0; s < words.length; s++) {
			System.out.print(words[s]+" ");
		}
	}
}

