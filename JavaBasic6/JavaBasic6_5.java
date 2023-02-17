
public class JavaBasic6_5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		J Test = new J();
		Test.Print();
	}

}
class S{
	protected void Print() {
		System.out.println("S Class");
	}
}

class J extends S{
	public void Print() {
		super.Print();
		System.out.println("J Class");
	}
}