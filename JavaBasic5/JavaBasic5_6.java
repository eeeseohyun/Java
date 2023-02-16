
public class JavaBasic5_6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		D.m_nVar = 5;
		
		D Test1 = new D();
		D Test2 = new D();
		D Test3 = new D();
		System.out.printf("%1$d %2$d %3$d\n", Test1.m_nVar, Test2.m_nVar, Test3.m_nVar);
		
		Test1.m_nVar = 11;
		System.out.printf("%1$d %2$d %3$d\n", Test1.m_nVar, Test2.m_nVar, Test3.m_nVar);
		
		D.m_nVar = 7;
		System.out.printf("%1$d %2$d %3$d\n", Test1.m_nVar, Test2.m_nVar, Test3.m_nVar);
	}
	
}
	class D{
		public static int m_nVar;
	}


