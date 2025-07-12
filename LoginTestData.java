package week3.day2;

public class LoginTestData extends TestData{

	public void enterUsername() {
		System.out.println("Enter the username --> sub class");
	}
	public void enterPassword() {
		System.out.println("Enter the password --> sub class");
	}
	
	public static void main(String[] args) {
		LoginTestData l= new LoginTestData();
		l.enterCredentials();
		l.enterUsername();
		l.enterPassword();
		l.navigateToHomePage();
	}

}
