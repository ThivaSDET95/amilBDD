package testProject_CalenderPick;

public class thisKeywordExample {
int id;
String username;
String password;

	public thisKeywordExample(String username, String password) {
	this.username=username;
	this.password=password;
	System.out.println(" username is "+username+ " password is "+password);
	}
	
public thisKeywordExample(int id,String username, String password) {
	this(username,password);
	this.id=id;
	}
	
public void printCredentials() {
	System.out.println("id is "+id+" username is "+username+ " password is "+password);
}
	
	
	public static void main(String[] args) {
		
		thisKeywordExample thisKey=new thisKeywordExample(12, "'thiva21'", "'keeki@12345'");
		thisKey.printCredentials();
	}

}
