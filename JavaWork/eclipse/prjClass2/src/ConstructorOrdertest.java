class A{
	A(){
		System.out.println("A 생성자가 호출되었다.");
	}
}

class B extends A{
	B(int i){
		// super();가 생략되어있음
		System.out.println("B 생성자가 호출되었다.");
	}
	
	B(){}  //  기본 생성자를 만들어줘서 int i 변수 선언을 할 수 있다.
}

class C extends B{
	C(){
		// super();가 생략되어있음
		System.out.println("C 생성자가 호출되었다.");
	}
	
}

public class ConstructorOrdertest {

	public static void main(String[] args) {
		// TODO 생성자 호출 순서
		new C();

	}

}
