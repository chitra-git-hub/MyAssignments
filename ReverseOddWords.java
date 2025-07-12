package week3.day1;

public class ReverseOddWords {

	public static void main(String[] args) {
		String test = "I am a software tester";
		String test1[] = test.split(" "); // Split the words and have it in an array 

		for (int i = 0; i < test1.length; i++) {
			if (i % 2 != 0) //finding odd index
				{
				char oddWord[] = test1[i].toCharArray(); //converting odd index word into character Array
				for (int j = (test1[i].length()) - 1; j >= 0; j--) {
					System.out.print(oddWord[j]); // printing odd index word in reverse order
				}

			} else {
				System.out.print(" " + test1[i] + " "); // printing even index words without any modification
			}
		}

	}

}
