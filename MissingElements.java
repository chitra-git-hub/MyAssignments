package week4.day1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class MissingElements {

	public static void main(String[] args) {

		List<Integer> numbers = new ArrayList<Integer>(Arrays.asList(1, 2, 3, 4, 10, 6, 8));
		Collections.sort(numbers);
		for (int i = 0; i < numbers.size()-1; i++) {
			int currentNumber = numbers.get(i);
			int nextNumber= numbers.get(i + 1);
			if ((currentNumber + 1) != nextNumber) {
				System.out.println(currentNumber + 1);
			}
		}
		
		/*same logic using Array
		int[] numberArray = {1, 2, 3, 4, 10, 6, 8};
		Arrays.sort(numberArray);
		for (int i = 0; i < numberArray.length-1; i++) {
			if((numberArray[i]+1)!=numberArray[i+1]) {
				System.out.println(numberArray[i]+1);
			}
		}*/
	}

}


