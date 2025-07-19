package week4.day1;

public class LoginPage extends Basepage {
	@Override
	public void performCommonTasks() {
		System.out.println("This method will perform common tasks --> from sub class");
	}

	public static void main(String[] args) {

		LoginPage lp = new LoginPage();
		lp.findElement();
		lp.clickElement();
		lp.enterText();
		lp.performCommonTasks();
	}

}
