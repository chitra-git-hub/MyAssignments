package week3.day1;

import java.util.Arrays;

public class FindMissingElement {

	public static void main(String[] args) {
		int[] num = { 1, 4, 3, 2, 6, 7, 8 };
		Arrays.sort(num);//sorting the Array
		for (int i = 0; i < num.length; i++) {
			if (i + 1 != num[i]) // checking logic
				{
				System.out.println("The Missing Element is " + (i + 1));
				break;

			}
		}
	}
}
