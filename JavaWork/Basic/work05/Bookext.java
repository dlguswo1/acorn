
class Bookext extends BookPack.Book{
	private String publisher;
	
	Bookext(String t, String a, int d, String p){
		super(t,a,d);
		// �θ� ������ ȣ��
		publisher = p;
	}
	
	public void show(){
		System.out.println(title);
		System.out.println(author);
		System.out.println(pubDate);
		System.out.println(publisher);
		System.out.println("***************************");
	}
	
}
