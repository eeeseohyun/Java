
public class JavaBasic10_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		OutClass2.InnerClass.Print();
	}

}

class OutClass2{
	static class InnerClass{
		static void Print() {
			System.out.println("static inner class");
		}
	}
}