
public class JavaBasic6_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		L Test = new L();
	}

}

class M{
	public M() {
		System.out.println("constructor of the M class");
	}
}

class N extends M{
	public N() {
		System.out.println("constructor of the N Class");
	}
}

class L extends N{
	public L() {
		System.out.println("constructor of the L Class");
	}
}