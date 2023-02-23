
public class JavaBasic11_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Integer IntVar1 = new Integer(123);
		int nVar = IntVar1.intValue();
		System.out.println("정수값 : " +nVar);
		
		String str = IntVar1.toString();
		System.out.println("문자열 : "+str);
		
		nVar = Integer.parseInt("300");
		System.out.println("정수값 : "+nVar);
		
		str =Integer.toString(nVar);
		System.out.println("문자열 : "+str);
		
		Integer IntVar3 = Integer.valueOf("100");
		System.out.println("Integer에 저장된 정수 값 : "+IntVar3.intValue());
		
	}

}
