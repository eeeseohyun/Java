
public class JavaBasic4_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 
		int nVar = 1;
		int [][] nArray;
		nArray = new int[3][];
		nArray[0] = new int[2];
		nArray[1] = new int[3];
		nArray[2] = new int[5];
		
		for(int i=0; i<nArray.length; i++) {
			for(int j=0; j<nArray[i].length; j++) {
				nArray[i][j] = nVar++;
				System.out.printf("%1$d ", nArray[i][j]);
			}
			System.out.println();
		}
	}

}
