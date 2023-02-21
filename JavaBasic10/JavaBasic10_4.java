
public class JavaBasic10_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		OutClass3.InnerClass.Print();
	}

}

class OutClass3{
	static int nVar1 =3;
	
	static class InnerClass{
		static void Print() {
			System.out.println("static inner class");
			System.out.println("out class static nVar1: "+nVar1);
		}
	}
}