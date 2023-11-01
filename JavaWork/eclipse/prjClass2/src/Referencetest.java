class First{
	int a = 10;
	
	void display() {
		System.out.println("a : " + a);
	}
}

class Second extends First{
	int b = 20;
	
	void show() {
		System.out.println("b : " + b);
	}
}

class Third{
	int c = 20;
	
	void print() {
		System.out.println("c : " + c);
	}
}

public class Referencetest {
	public static void main(String[] args) {
		// TODO 부모 클래스와 자식 클래스의 참조 관계
		First f1 = new First();
		f1.display();
		
		Second s1 = new Second();
		s1.show();
		
		Third t1 = new Third();
		t1.print();
		
		First f2 = f1;
		//f2가 f1의 주소를 받는다 : 객체를 참조할 수 있다.
		f2.display();
		
		// f2 = s1;
		// f2 = (First)s1;
		// 서로다른 클래스는 절대로 참조할 수 없다.
		
		f2 = s1;
		
		// Second s2 = f1;
		// 자식은 부모의 클래스는 참조할 수 없다.
		
		f2.a = 30;
		// 부모 가능
		f2.display();
		
		//f2.b = 40;
		// 자식은 안됨 자기가 물려준 것만 참조 가능
		
		Second s3 = (Second)f2;
		s3.display();
		s3.b = 40;
		s3.show();
		
	}

}
