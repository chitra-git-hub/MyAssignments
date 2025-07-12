package week3.day2;

public class Browser {

	String browserName;
	int browserVersion;
	
	public void  openURL()
	{
		System.out.println("URL is opened --> super class");
	}
	public void  closeBrowser() {
		System.out.println("Browser is closed --> super class");
	}	
	public void navigateBack()
	{
		System.out.println("Navigated back --> super class");
	}
}
