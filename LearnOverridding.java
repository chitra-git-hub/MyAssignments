package week4.day1;

public class LearnOverridding extends LearnOverLoading {

	public void reportSnap(String msg, String status, boolean snap) {
		System.out.println("The message is " + msg);
		System.out.println("The status is " + msg);
		System.out.println(snap);
	}

	public static void main(String[] args) {

		LearnOverridding or = new LearnOverridding();
		or.reportSnap("Hello", "Open", false);
	}

}
