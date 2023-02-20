
public class JavaBasic9_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int nVar[] = {0,1,2,3,4};
		
		try {
			for(int i=0; i<6; i++)
				System.out.println(nVar[i]);
		}catch(ArithmeticException e) {
			System.out.println("Arithemetic failed");
		}catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("Array Index Out!");
		}
	}

}
