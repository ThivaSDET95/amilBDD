package testProject_CalenderPick;

public class superKeywordExample_ParentClass {

	String name;
	public superKeywordExample_ParentClass() {
		
		System.out.println("i'm young ");
	}
	
public superKeywordExample_ParentClass(String name) {
		
		this.name=name;
		System.out.println("this is my name "+name);
	}
	
	public static void main (String [] args) {
		superKeywordExample_ParentClass c1=new superKeywordExample_ParentClass();
	}
}
