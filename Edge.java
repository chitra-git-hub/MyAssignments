package week3.day2;

public class Edge extends Browser {
public void takeSnap()
{
	System.out.println("Taken Snap --> sub class");
	}
public void clearCookies() {
	System.out.println("cookies are cleared--> sub class");
}

public static void main(String[] args) {
	Edge e= new Edge();
	e.openURL();
	e.takeSnap();
	e.clearCookies();
	e.navigateBack();
	e.closeBrowser();
}
}
