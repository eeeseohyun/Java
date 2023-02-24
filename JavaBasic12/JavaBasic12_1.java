import java.util.*;
public class JavaBasic12_1 {
	public static void main(String[] args) {
		Vector MyVector = new Vector();
		MyVector.addElement(new Integer(3) );
		MyVector.addElement(new Float(3.14f));
		MyVector.addElement("java");
		MyVector.addElement("하이!");
		System.out.println( MyVector );
		System.out.println( MyVector.elementAt(2));
		int nVar = (int)MyVector.firstElement();
		System.out.println(nVar);
		System.out.println("저장된 객체 개수 : "+MyVector.size());
		
		//generics
		Vector<String> MyVector2 = new Vector();
		MyVector2.add("java");
		MyVector2.add("programming");
		MyVector2.add("android");
		MyVector2.add("hope");
		System.out.println( MyVector2);
		
		String str2 = MyVector2.get(2);
		System.out.println(str2);
		
		int nInDex = MyVector2.indexOf("hope");
		System.out.println( MyVector2.get(nInDex));
	}
}
