import java.util.*;

class Person{
	String strName;
	public Person(String str) {
		strName =str;
	}
}
public class JavaBasic12_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<Person> List = new LinkedList();
		List.add(new Person("A Name"));
		List.add(new Person("B Name"));
		List.add(new Person("C Name"));
		List.add(new Person("D Name"));
		List.add(new Person("F Name"));
		
		for(int i=0; i < List.size(); i++) {
			System.out.println(List.get(i).strName);
		}
		
		int nSearchIndex = -1;
		for(int i=0; i< List.size(); i++) {
			if(List.get(i).strName.equals("C Name")) {
				System.out.println(List.get(i).strName + "을"  + (i+1) + " 번째에서 찾았습니다" );
				
				nSearchIndex = i;
				break;
			}
		}
		
		List.remove( nSearchIndex);
		System.out.println("삭제-----------");
		for(int i=0; i<List.size();i++) {
			System.out.println( List.get(i).strName);
		}
		
		List.add(nSearchIndex , new Person("C Name"));
		System.out.println("삽입-----------");
		for(int i=0; i <List.size(); i++) {
			System.out.println(List.get(i).strName);
		}
	}

}
