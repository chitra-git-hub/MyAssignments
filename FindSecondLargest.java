package week4.day1;

import java.util.Arrays;

public class FindSecondLargest {

	public static void main(String[] args) {
		int[] arr={3, 2, 11, 4, 6, 7};
	    int length =arr.length;
	    Arrays.sort(arr);
	    System.out.println(arr[length-2]);
	}

}
