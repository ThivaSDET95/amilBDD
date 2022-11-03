package testProject_CalenderPick;

public class testconstructorChild   {

	String name;
	public testconstructorChild(String nName) {
		
		name=nName;
		System.out.println("my name is "+name);
		
	}
	
	
	public static void main(String[] args) {
		testconstructorChild c1=new testconstructorChild("keeki");
		testConstructorParentClass c2=new testConstructorParentClass(20);
	}

}
