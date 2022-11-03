package testProject_CalenderPick;

public class methodOverRiding extends methodOverLoading {

	public void thiva(String name) {
		System.out.println("Not a good name "+name);
	}
	public static void main(String[] args) {
		
		methodOverLoading oR=new methodOverRiding();
		oR.thiva("test");
	}

}
