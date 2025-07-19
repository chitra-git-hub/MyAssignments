package week4.day2;

import java.util.LinkedHashSet;
import java.util.Set;

public class SetAssingnment {

	public static void main(String[] args) {
		String companyName="google";
		char[] CharArray = companyName.toCharArray();
		Set<Character> unique = new LinkedHashSet<Character>();
		for (int i = 0; i < CharArray.length; i++) {
			unique.add(CharArray[i]);
		}
		System.out.println(unique);
	}

}
