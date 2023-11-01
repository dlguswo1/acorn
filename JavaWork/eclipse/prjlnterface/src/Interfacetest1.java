//interface inter1 {
//	int a = 1;  //앞에 public static final이 생략되어있음
//	// 인터페이스 안에 있는 변수는 기본적으로 static이다.
//	
//	void Inter1method();
//	//추상 메서드여야 하기 때문에 중괄호가 붙으면 안된다. abstract가 앞에 안붙어도 됨
//}

abstract class Inter1{
	static int a =1;
	
	abstract void Inter1method();
}

public class Interfacetest1 extends Inter1{
	public void Inter1method() {
		System.out.println("오버라이드됨.");
		// 위에 메서드랑 똑같이 선언
	}
	
	public static void main(String[] args) {
		// TODO 인터페이스 기본 문법
		System.out.println(Inter1.a);
		//inter1.a = 10;
	}

}
