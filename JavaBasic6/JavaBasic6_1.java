
public class JavaBasic6_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		C TestA = new C();
		TestA.PrintB();
	}

}
class C{
	public int m_nVar1 = 11;
	public void PrintA() {
		System.out.println("A Class " + m_nVar1);
	}
	
	public void PrintB() {
		PrintA();
	}
}

class D extends C{
	void PrintC() {
		PrintA();
		System.out.println(m_nVar1);
	}
}
