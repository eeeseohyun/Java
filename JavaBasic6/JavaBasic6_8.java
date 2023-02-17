
public class JavaBasic6_8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		C2 C_Test = new C2();
		A2 A_Test = C_Test;
		A_Test.Print();
	}

}
class A2{
	public void Print() {
		System.out.println("class A");
	}
}

class B2 extends A2{
	public void Print() {
		System.out.println("class B");
	}
}

class C2 extends B2{
	public void Print() {
		System.out.println("class C");
	}
}
