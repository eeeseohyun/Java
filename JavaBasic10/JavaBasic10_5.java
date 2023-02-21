
public class JavaBasic10_5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		OutClass4 OutTest1 = new OutClass4();
		OutTest1.Print();
	}

}

class OutClass4{
	int nVar1 =3;
	
	class InnerClass{
		void Print() {
			System.out.println("OutClass nVar1: "+nVar1);
		}
	}
	
	void Print() {
		InnerClass Inner = new InnerClass();
		Inner.Print();
	}
}