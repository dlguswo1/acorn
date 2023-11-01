public class Overloadtest {
	void display(){
		System.out.println("기본 출력 내용");
	}
	
	void display(int i) {
		System.out.println("i=" +i);
	}
	
	void display(double i) {
		System.out.println("i=" +i);
	}
	
	void display(double i, int j) {
		System.out.println("i=" + i + ", j=" + j);
	}
	
	public static void main(String[] args) {
		Overloadtest test = new Overloadtest();
		
		test.display(100);
		test.display();
		test.display(3.14, 200);
		test.display(100.0);
		
		
	}
}

/* 클래스 내에 같은 이름의 메소드를 여러 개 선언하는 것을 메소드 오버로딩이라고 한다.*/