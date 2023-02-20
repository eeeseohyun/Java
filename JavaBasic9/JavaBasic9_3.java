
public class JavaBasic9_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int nVar =0;
		 int nResult;
		 
		 try {
			 nResult = 7/ nVar;
		 }catch(ArithmeticException e) {
			 System.out.println("failed");
		 }finally {
			 System.out.println("Good Bye");
		 }
	}

}
