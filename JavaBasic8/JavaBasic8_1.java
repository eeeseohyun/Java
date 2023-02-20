
public class JavaBasic8_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A Test = new A();
		Test.Print();
	}

}

interface InterfaceA{
	int m_nVar =7;
	void Print();
}

class A implements InterfaceA{
	public void Print() {
		System.out.println("interfacd m_nVar = "+ m_nVar);
	}
}
