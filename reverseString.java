package week3.day1;

public class reverseString {

	public static void main(String[] args) {
		String companyName = "TestLeaf";
		long num=153;
		 String str = Long.toString(num);
		 System.out.println(str);
		int length = companyName.length();
		String reversedString = "";
		char[] characters = companyName.toCharArray();
		for (int i = length - 1; i >= 0; i--) {
			reversedString += characters[i];
		}
		System.out.println(reversedString);
	}

}
