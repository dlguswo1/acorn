class Staticdemo1{
	int a;
	int b;
	static int c; 
} // 밑에 객체 생성할 때 a,b와 따로 1개만 만들어짐. 공간은 같이 쓸 수 있음

public class Statictest1 {
	static int d;
	
	static void method1() {
		System.out.println("I'm method!");
	}
	public static void main(String[] args) {
		// TODO Static이란 무엇인가 ?
		Staticdemo1.c =100;
		System.out.println(Staticdemo1.c);
		
		Staticdemo1 demo1 = new Staticdemo1();
		Staticdemo1 demo2 = new Staticdemo1();
		System.out.println(demo1.c);
		System.out.println(demo2.c);
		
		demo1.c = 200;
		System.out.println(Staticdemo1.c);
		System.out.println(demo2.c);
		
		d = 300;
		method1();
		
	}
}
