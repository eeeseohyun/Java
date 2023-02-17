
public class JavaBasic6_6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BB Test1 = new BB();
		Test1.Print();
		
		DD Test2 = new DD();
		Test2.Print();
	}

}

class AA{
	int m_nVar;
	public AA(int nVar) {
		m_nVar = nVar;
		System.out.println("constructor of the super Class AA");
	}
}

class BB extends AA {
	public BB() {
		super(7);
	}
	
	public void Print() {
		System.out.println("super class A: " + m_nVar);
	}
}

class CC {
	int m_nVar;
	public CC() {
		m_nVar =11;
		System.out.println("constructor of the super class CC");
	}
}

class DD extends CC{
	public DD() {
		super(); // 생략 가능 자동 호출 
	}
	
	public void Print() {
		System.out.println("super class C: "+ m_nVar);
	}
}