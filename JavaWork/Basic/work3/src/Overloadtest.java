public class Overloadtest {
	void display(){
		System.out.println("�⺻ ��� ����");
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

/* Ŭ���� ���� ���� �̸��� �޼ҵ带 ���� �� �����ϴ� ���� �޼ҵ� �����ε��̶�� �Ѵ�.*/