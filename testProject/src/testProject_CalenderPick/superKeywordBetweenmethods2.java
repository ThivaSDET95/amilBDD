package testProject_CalenderPick;

public class superKeywordBetweenmethods2 extends superKeywordBetweenMethods{

	public void method2() {
		super.method1();
		System.out.println("i'm restored");
	}
	public static void main(String[] args) {
		superKeywordBetweenmethods2 t1=new superKeywordBetweenmethods2();
t1.method2();
	}

}
