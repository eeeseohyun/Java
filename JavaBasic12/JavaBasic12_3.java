import java.util.*;
public class JavaBasic12_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList List1 = new LinkedList();
		
		List1.add(7);
		List1.add(3);
		List1.add(5);
		List1.add(1);
		List1.add(2);
		List1.add(6);
		List1.add(4);
		
		System.out.println(List1);
		System.out.println("처음 노드 : "+List1.getFirst());
		System.out.println("끝 노드 : " + List1.getLast());
		System.out.println("개수 : " + List1.size());
		
		List1.remove(3);
		System.out.println(List1);
		List1.set(3, 12);
		System.out.println(List1);
		
		Collections.sort(List1);
		System.out.println("sort : "+List1);
		List1.clear();
		System.out.println("개수 : "+List1.size());
		
	}

}
