import java.util.*;

public class JavaBasic11_8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nIntArray = {1,4,7,2,6,3,5};
		System.out.println("정렬전 : " + Arrays.toString(nIntArray));
		
		Arrays.sort(nIntArray);
		System.out.println("정렬후 : " + Arrays.toString(nIntArray));
		
		System.out.println(Arrays.binarySearch(nIntArray,13));
		System.out.println(Arrays.binarySearch(nIntArray, 5));
		
		Arrays.fill(nIntArray, 1,3,12);
		System.out.println("치환결과 : "+Arrays.toString(nIntArray));
	}

}
