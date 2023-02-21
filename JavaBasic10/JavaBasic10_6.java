
public class JavaBasic10_6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		InterfaceClass Test1 = new InterfaceClass();
		Test1.Print();
		ClassA Test2 = new ClassA();
		Test2.Print();
		
		InterfaceClass Test3 = new InterfaceClass() {
			public void Print() {
				System.out.println("Anonymous interface");
			}
		};
		
		Test3.Print();
		
		ClassA Test4 = new ClassA() {
			public void Print() {
				System.out.println("Anonymous class");
			}
		};
		
		Test4.Print();
		
		ClassA Test5 = new ClassA() {
			public void Print() {
				System.out.println("Anonymous class");
			}
		};
		
		Test5.Print();
		
		Testable Test6 = new Testable() {
			public void Print() {
				System.out.println("Anonymous interface");
			}
		};
		Test6.Print();
	}

}
interface Testable{
	public void Print();
}

class InterfaceClass implements Testable{
	public void Print() {
		System.out.println("Hi !");
	}
}
class ClassA{
	public void Print() {
		System.out.println("good !");
	}
}