
public class JavaBasic7_1 {
	public static void main(String[] args) {
		B Test1 = new B();
		Test1.Print();
		Test1.Print1();
		
		A Test2 = new B();
		Test2.Print();
		Test2.Print1();
		
		A Test3 = new C();
		Test3.Print1();
	}
}

abstract class A{
	public int m_nVar =7;
	public void Print() {
		System.out.println("A class");
	}
	abstract void Print1();
}

class B extends A{
	void Print1() {
		System.out.println("B class");
	}
}

class C extends A{
	void Print1() {
		System.out.println("C class");
	}
}