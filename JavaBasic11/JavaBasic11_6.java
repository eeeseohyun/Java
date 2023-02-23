
public class JavaBasic11_6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringBuffer str1 = new StringBuffer("abcdefg");
		String str2 = "hijk";
		str1.append(str2);
		System.out.println(str1 + " 문자열 길이 : "+ str1.length());
		
		StringBuffer str3 = new StringBuffer();
		str3.append("abcdefghijklmn");
		System.out.println(str3+" 문자열 길이 : "+str3.length());
	}

}
