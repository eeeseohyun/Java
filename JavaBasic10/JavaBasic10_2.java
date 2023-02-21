
public class JavaBasic10_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		OutClass1 OutTest1 = new OutClass1();
		OutClass1.InnerClass InnerTest1 = OutTest1.new InnerClass();
		InnerTest1.Print();
	}

}
class OutClass1{
	int nVar1 = 3;
	
	class InnerClass{
		void Print() {
			System.out.println("OutClass nVar1 : " + nVar1);
		}
	}
}