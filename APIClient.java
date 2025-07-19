package week4.day1;

public class APIClient {
	public void sendRequest(String endPoint) {
		System.out.println("The End point passed in the request is " + endPoint);
	}

	public void sendRequest(String endPoint, String requestBody, boolean requestStatus) {
		System.out.println("For the passed end Point -  " + endPoint + " , The request Body is -  " + requestBody);
		if (requestStatus) {
			System.out.println("The request is successful");
		} else {
			System.out.println("The request is unsuccessful");
		}
	}

	public static void main(String[] args) {
		APIClient a = new APIClient();
		a.sendRequest("https://testjob");
		a.sendRequest("https://testjob", "test job created", true);
	}
}
