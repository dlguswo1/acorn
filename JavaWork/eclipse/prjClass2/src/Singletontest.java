class Singletondemo{
	private int i;
	
	private Singletondemo() {}
	
	private static Singletondemo instance = new Singletondemo();
	
	public static Singletondemo getinstance() {
		return instance;
	}
}  //  변수를 외부로부터 보호, 생성자를 private하면 밖에서 생성자 못만듬
public class Singletontest {

	public static void main(String[] args) {
		// TODO Singleton Pattern
		//Singletondemo demo1 = new Singletondemo();
		//Singletondemo demo2 = new Singletondemo();
		
		Singletondemo demo1 = Singletondemo.getinstance();
		Singletondemo demo2 = Singletondemo.getinstance();
		System.out.println(demo1 == demo2);

	}

}
