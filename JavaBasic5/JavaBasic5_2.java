
public class JavaBasic5_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 OverLoadTest OverLoadObject = new OverLoadTest();
		 System.out.println("Add(int nVar1, int nVar2) : " + OverLoadObject.Add(10,2));
		 System.out.println("Add(float fVar1, float fVar2) : " + OverLoadObject.Add(3.0f,0.14f));
		 System.out.println("Add(int nVar1, int nVar2) : " + OverLoadObject.Add(10,2,3.14f));
		 
	}

}
class OverLoadTest{
	public int Add(int nVar1, int nVar2) {
		return nVar1 + nVar2;
	}
	
	public float Add(float fVar1, float fVar2) {
		return fVar1 + fVar2;
	}
	
	public int Add(int nVar1, int nVar2, float fVar1 ) {
		return nVar1 + nVar2 + (int)fVar1;
	}
}
