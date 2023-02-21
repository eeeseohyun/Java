
public class JavaBasic10_7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ClassB Test1 = new ClassB();
		Test1.SetClass(new ClassAA());
		
		Test1.SetClass(new ClassAA(){
			public void Print() {
				System.out.println("Good !");
			}
		});
	}

}

interface Testable1{
	public void Print();
}

class ClassAA implements Testable1{
	public void Print() {
		System.out.println("Hi !");
	}
}

class ClassB{
	void SetClass(ClassAA ObjectA) {
		ObjectA.Print();
	}
}