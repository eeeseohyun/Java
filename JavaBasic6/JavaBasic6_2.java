import sample.*;
public class JavaBasic6_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		B Test = new B();
		Test.PrintA();
		Test.m_nVar1 = 13;
		Test.PrintC();
		System.out.println(Test.m_nVar1);
		
		E Test2 = new E();
		Test2.PrintE();
	}

}
class A{
	protected int m_nVar1 =11;
	protected void PrintA() {
		System.out.println("A Class " + m_nVar1);
		
	}
}

class B extends A{
	public void PrintC() {
		System.out.println("B Class "+ m_nVar1);
	}
}

class E extends F{
	public void PrintE() {
		System.out.println("D Class "+ m_nVar1);
	}
}