package week3.day2;

public class JavaConnection extends MySqlConnecction implements DataBaseConnection {

	public static void main(String[] args) {
		JavaConnection j= new JavaConnection();
		j.connect();
		j.executeUpdate();
		j.executeQuery();
		j.disconnect();

	}

	@Override
	public void connect() {
	System.out.println("Connect to the database");
		
	}

	@Override
	public void disconnect() {
		System.out.println("DisConnect from the database");
		
	}

	@Override
	public void executeUpdate() {
		System.out.println("Execute the update query");
		
	}

}
