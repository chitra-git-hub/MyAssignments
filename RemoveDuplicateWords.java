package week3.day1;

public class RemoveDuplicateWords {

	public static void main(String[] args) {
		String text = "We learn Java basics as part of java sessions in java week1";
		String text1[] = text.split(" "); //Splitting the string based on space delimiter
		int count = 0;
		for (int i = 0; i < text1.length; i++) {
			for (int j = i + 1; j < text1.length; j++) {
				if (text1[i].equalsIgnoreCase(text1[j]))// compare each word with every other word in the String array
					{
					// If a duplicate word is found, it is replaced with an empty string and the count is incremented.
					text1[j] = " ";
					count++;

				}

			}
		}
		// if the count is greater than 1 ,prints the modified words array where duplicates have been replaced with empty strings.
		if (count >= 1) {
			for (int i = 0; i < text1.length; i++) {
				System.out.print(text1[i] + " ");
			}

		}
	}

}
