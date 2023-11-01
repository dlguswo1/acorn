// 내부 클래스가 static일 경우
/*
public class Outerclass {
	private int outer1;
	
static class Innerclass{
	private int inner1;
	
	void innermethod() {
		System.out.println("Innermethod() 호출됨");
		
		Outerclass oc = new Outerclass();
		oc.outer1 = 200;
		System.out.println(oc.outer1);
		 // 바깥에서 private을 선언하고 내부 클래스 객체를 생성해서 접근할 수 있다.
	} 
}


	public static void main(String[] args) {
		// TODO 중첩 클래스
		Innerclass ic = new Innerclass();
		ic.innermethod();
		ic.inner1 = 100;
		System.out.println(ic.inner1);

	}

}// private가 있음에도 불구하고 클래스 안에 포함시키면
 // private에 접근할 수 있다.
*/


//내부 클래스가 일반 클래스일 경우
public class Outerclass {
	private int outer1;
	
class Innerclass{
	private int inner1;
	
	void innermethod() {
		System.out.println("Innermethod() 호출됨");
		
//		Outerclass oc = new Outerclass();
//		oc.outer1 = 200;
//		System.out.println(oc.outer1);
		 // 바깥에서 private을 선언하고 내부 클래스 객체를 생성해서 접근할 수 있다.
		
		outer1 = 200;
		System.out.println(outer1);
	} 
}


	public static void main(String[] args) {
		// TODO 중첩 클래스
//		Outerclass oc = new Outerclass();
//		Innerclass ic = oc.new Innerclass();
		Innerclass ic = new Outerclass().new Innerclass();
		ic.innermethod();
		ic.inner1 = 100;
		System.out.println(ic.inner1);

	}  //  스태틱이 없으면 메인에서 outer객체를 먼저 만들어주어야 안에있는 inner의 객체를 만들 수 있다.

}