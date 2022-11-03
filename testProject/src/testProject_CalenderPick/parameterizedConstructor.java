package testProject_CalenderPick;

public class parameterizedConstructor {

	static String newName;
	static int nAge;
	parameterizedConstructor(String wName,int wAge){
		System.out.println("my name is construuctor thivakar");
		newName=wName;
		nAge=wAge;

	}
	public static void test1() {
		
		System.out.println("wife name is "+newName+" and age is "+nAge);

	}
	public static void main(String[] args) {
		parameterizedConstructor pcon=new parameterizedConstructor("keeki", 25);

		pcon.test1();
	System.out.println(pcon.newName);
	}

}
