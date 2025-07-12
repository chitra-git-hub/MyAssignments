package week3.day2;

public class Chrome extends Browser {
public void openIncognito() {
	System.out.println("Browser opened in incgoniti mode");
}
public void clearCache() {
	System.out.println("Cache Cleared");
}

public static void main(String[] args) {
	Chrome c= new Chrome();
	c.openURL();
c.clearCache();
c.closeBrowser();

}
}
