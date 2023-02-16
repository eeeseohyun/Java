
public class JavaBasic5_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		B Test = new B();
		Test.SetPrint(11);
	}

}
class B {
	private int m_nVar;
	
	public void SetPrint(int nVar) {
		this.m_nVar = nVar;
		this.Print();
	}
	
	public void Print() {
		System.out.println("m_nVar : "+m_nVar);
	}
	
}
