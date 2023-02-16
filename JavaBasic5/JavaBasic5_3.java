
public class JavaBasic5_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A Test1 = new A();
		System.out.println("Test1 m_nVar : " + Test1.Get());
		System.out.println("Test1 m_fVar : " + Test1.m_fVar);
		
		A Test2 = new A(7);
		System.out.println("Test2 m_nVar : " + Test2.Get());
		System.out.println("Test2 m_fVar : " + Test2.m_fVar);
		
	}

}
class A{
	private int m_nVar;
	public float m_fVar = 3.14f;
	
	public A() {
		m_nVar =12;
	}
	
	public A( int nVar) {
		m_nVar = nVar;
	}
	
	public int Get() {
		return m_nVar;
	}
}
