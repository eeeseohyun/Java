
public class JavaBasic4_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nArray = new int[3];
		boolean[]bArray = new boolean[3];
		float[] fArray = new float[3];
		
		for(int i=0; i< nArray.length; i++) 
			System.out.printf("%1$d ", nArray[i]);
	
		System.out.println();
		
		for(int i=0; i<bArray.length; i++)
			System.out.printf("%1$b ", bArray[i]);
		
		System.out.println();
		
		for(int i=0; i< fArray.length; i++) 
			System.out.printf("%1$.1f ", fArray[i]);
		
		System.out.println();
		
	}
}


