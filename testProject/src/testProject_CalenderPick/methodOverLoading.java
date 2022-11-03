package testProject_CalenderPick;

import java.security.PublicKey;

public class methodOverLoading {
	
	public void thiva(String name) {
		System.out.println("good name "+name);
	}
	
	public void thiva(int age) {
		System.out.println("too young "+age);
	}
	public void thiva() {
		System.out.println("hot");
		
	}

	public static void main(String[] args) {
		 
		methodOverLoading oL=new methodOverLoading();
		oL.thiva(20);
		oL.thiva();
	}

}
