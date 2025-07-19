package week4.day1;

public class LearnOverLoading {

	public void reportStep(String msg, String status) {
		System.out.println(msg + " ," + status);
	}

	public void reportStep(String msg, String status, boolean snap) {
		System.out.println(msg + ", " + status);
		if (snap) {
			System.out.println("Snap is taken");
		} else {
			System.out.println("Snap is not taken");
		}

	}

	public static void main(String[] args) {

		LearnOverLoading ol = new LearnOverLoading();
		ol.reportStep("First report Step method", "Status is Open");
		ol.reportStep("Second report step method", "Status is Closed", true);
	}

}
