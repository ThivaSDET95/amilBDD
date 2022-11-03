package testProject_CalenderPick;

public class superKeywordExample_ChildClass extends superKeywordExample_ParentClass {
String password;

	public superKeywordExample_ChildClass() {
		super();
		
	}
	public superKeywordExample_ChildClass(String name, String password) {
		super(name);
		this.password=password;
		
		
	}
	public void displayDetails() {
		System.out.println("user name is "+name+" password is "+password);
	}
	
	public static void main(String [] args) {
		superKeywordExample_ChildClass c1=new superKeywordExample_ChildClass();
		superKeywordExample_ChildClass c2=new superKeywordExample_ChildClass("'Adminteekay'", "'Admin@12345'");
		c2.displayDetails();
	}

}
