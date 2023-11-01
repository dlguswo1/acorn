/*
class Methodtest {
	public static void main(String[] args) {
		int num1 = 10, num2 = 15;
		
		System.out.println("두 수의 합계");
		int result = num1 + num2;
		System.out.println("결과: " + result);
	}
	
	public static void main(String[] args) {
		int num1 = 10; , num2 = 15;
		
		int = result new Methodtest().sum(num1,num2);
		System.out.println("결과: " + result);
	}
}
*/


class Methodtest {
	int num1 = 10, num2 = 15, num3 = num1 + num2;
	
	void swap(Methodtest m){
		int num3 = m.num1 + m.num2;
	}
	public static void main(String[] args) {
		int num1 = 10, num2 = 15;
		
		Methodtest m2 = new Methodtest();
		m2.swap(m2);
		System.out.println("결과: " + m2.num3);
	}
}