
public class JavaBasic5_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Book JavaBook = new Book();
		JavaBook.SetTitle("Java programming");
		System.out.println("Book Title: " + JavaBook.GetTitle());
		JavaBook.SetPublisher("Now Communication");
		System.out.println("Publisher: "+ JavaBook.GetPublisher());
	}

}
class Book{
	private String m_strTitle;
	private int m_nPage;
	private String m_strPublisher;
	private int m_nPrice;
	
	public void SetTitle(String strTitle) {
		m_strTitle = strTitle;
	}
	
	public String GetTitle() {
		return m_strTitle;
	}
	
	public void SetPage(int nPage) {
		m_nPage = nPage;
	}
	
	public int GetPage() {
		return m_nPage;
	}
	
	public void SetPublisher(String strPublisher) {
		m_strPublisher = strPublisher;
	}
	
	public String GetPublisher() {
		return m_strPublisher;
	}
	
	public void SetPrice(int nPrice) {
		m_nPrice = nPrice;
	}
	
	public int GetSetPrice() {
		return m_nPrice;
	}
}