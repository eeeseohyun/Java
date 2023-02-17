
public class JavaBasic6_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Y Test = new Y();
		System.out.println(Test.Set(11));
	}

}
class X{
	protected int m_nVar;
	public int Set(int nVar) {
		m_nVar =nVar;
		return m_nVar;
	}
}

class Y extends X{
	public int Set(int nVar) {
		m_nVar = nVar + 1;
		return m_nVar;
	}
}
