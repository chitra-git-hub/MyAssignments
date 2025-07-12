package week3.day1;

import java.util.Arrays;

public class Anagram {

	public static void main(String[] args) {
		String text1 = "stops";
		String text2 = "potss";
		int count = 0;
		if (text1.length() != text2.length())//Check if the lengths of the two strings are equal
			{
			System.out.println("Lengths mismatch, therefore the strings are not an Anagram");

		} else {
			//Convert both the strings to character arrays
			char[] charArray1 = text1.toCharArray();
			char[] charArray2 = text2.toCharArray();
			// Sort both the character arrays 
			Arrays.sort(charArray1);
			Arrays.sort(charArray2);
		

			for (int i = 0; i < charArray2.length; i++) //Check if the sorted arrays are equal 
				{
				if (charArray1[i] == charArray2[i]) {
					count++;
				}
			}
				if (count == text1.length()) {
					System.out.println("The given strings are Anagram");
				} else {
					System.out.println("The given strings are not an Anagram");
				}
			}
		}
}
