
public class JavaBasic4_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nArray;
		nArray = new int[5];
		for(int  i=0; i<5; i++) {
			nArray[i]=i+1;
			System.out.printf("%1$d", nArray[i]);
		}
		System.out.println();
		
		for(int i=0; i<nArray.length; i++) {
			nArray[i]=i+1;
			System.out.printf("%1$d", nArray[i]);
		}
	}

}
