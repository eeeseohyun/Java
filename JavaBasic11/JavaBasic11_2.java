
public class JavaBasic11_2 {

	public static int Add( Integer IntVar) {
		int nVar =10;
		IntVar = IntVar + nVar;
		return IntVar;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Integer IntVar =12;
		int nVar=3;
		int nTotal = nVar + IntVar;
		System.out.println("autoboxing : "+IntVar);
		System.out.println("합 : " + nTotal);
		
		IntVar++;
		System.out.println("++ autoboxing : "+IntVar);
	
		System.out.println("return : "+ Add(IntVar));
	}

}
