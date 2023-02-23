
public class JavaBasic11_7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringBuffer strFileName = new StringBuffer(100);
		strFileName.append("test.txt");
		System.out.println(strFileName);
		
		strFileName.delete(0, strFileName.length()-4);
		strFileName.insert(0, "success");
		System.out.println(strFileName);
				
	}

}
