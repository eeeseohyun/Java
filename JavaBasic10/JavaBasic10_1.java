
public class JavaBasic10_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		OutClass OutTest1 = new OutClass();
		OutTest1.Inner.Print();
	}

}
class OutClass{
	int nVar1 =3;
	
	class InnerClass{
		void Print() {
			System.out.println("OutClass nVar1 : " + nVar1);
		}
	}
	InnerClass Inner = new InnerClass();
}