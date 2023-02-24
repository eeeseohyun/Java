import java.util.*;
public class JavaBasic12_2 {
	public static void main(String[] args) {
		ArrayList List1 = new ArrayList();
		List1.add(7);
		List1.add(3);
		List1.add(1);
		List1.add(5);
		List1.add(2);
		List1.add(4);
		List1.add(6);
		
		System.out.println("개수 : " + List1.size());
		System.out.println("리스트 : "  + List1);
		
		Collections.sort(List1);
		System.out.println("sort된 List1의 리스트 : " + List1);
		
		List1.set(6,11);
		System.out.println("List의 리스트 : " + List1);
		
		int nVar = (int)List1.get(2);
		System.out.println(nVar);
		
		List1.clear();
		System.out.println("개수 : "+ List1.size());
		
		ArrayList<String> List2 = new ArrayList();
		List2.add("java");
		List2.add("programming");
		List2.add("now");
		List2.add("hope");
		System.out.println(List2);
		int nIndex = List2.indexOf("now");
		System.out.println(List2.get(nIndex));
		List2.set(nIndex, "android");
		System.out.println(List2);
	}
}
