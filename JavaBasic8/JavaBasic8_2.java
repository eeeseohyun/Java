
public class JavaBasic8_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		D Test = new D();
		Test.PrintA();
		Test.PrintB();
		Test.PrintC();
	}

}

interface AA{
	void PrintA();
}

interface B{
	void PrintB();
}

interface C extends AA,B{
	void PrintC();
}

class D implements C{
	public void PrintA() {
		System.out.println("interface A");
	}
	public void PrintB() {
		System.out.println("interface B");
	}
	public void PrintC() {
		System.out.println("interface C");
	}
}