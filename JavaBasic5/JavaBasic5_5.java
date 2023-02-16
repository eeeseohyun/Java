
public class JavaBasic5_5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		C Test = new C();
		System.out.println("m_nVar : " + Test.m_nVar);
		System.out.println("m_fVar : " + Test.m_fVar);

	}

}

class C{
	public int m_nVar;
	public float m_fVar = 0.5f;
	
	public C(){
		this(3.14f);
		m_nVar = 12;
		
	}
	public C(float fVar) {
		m_fVar =fVar;
	}
}
