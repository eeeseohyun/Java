
public class JavaBasic6_7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		C1 C_Test = new C1();
		B1 B_Test = new C1();
		//B_Test.Print3(); error
		A1 A_Test = (A1)C_Test;
		
		A_Test.Print1();
		B_Test.Print2();
	}

}

class A1{
	public void Print1() {
		System.out.println("class A");
	}
}

class B1 extends A1{
	public void Print2() {
		System.out.println("class B");
	}
}

class C1 extends B1{
	public void Print3() {
		System.out.println("class C");
	}
}
