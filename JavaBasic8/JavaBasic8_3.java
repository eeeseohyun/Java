
public class JavaBasic8_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DD Test = new DD();
		Test.PrintA();
		Test.PrintB();
		Test.PrintC();
	}

}

interface AAA{
	void PrintA();
}

interface BB{
	void PrintB();
}

class CC{
	public void PrintC() {
		System.out.println("class C");
	}
	
}

class DD extends CC implements AAA,BB{
	public void PrintA() {
		System.out.println("interface A");
	}
	public void PrintB() {
		System.out.println("interface B");
	}
}