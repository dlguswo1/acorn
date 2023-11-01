// 인자 전달 방식
/*
class Methodtest2 {
	void swap(int num1, int num2){
		int temp = num1;
		num1 = num2;
		num2 = temp;
		return num1
	}
	public static void main(String[] args) {
		int num1 = 10, num2 = 15;
		
		System.out.println("두 수의 교환");
		new Methodtest2().swap(num1,num2);
		
		System.out.println("num1="+num1 + ", num2=" + num2);
	}
}
*/

// 주소로 이용해 교환하기
public class Methodtest2 {
	int num1 = 10, num2 = 15;
	
	void swap(Methodtest2 m){
		int temp = m.num1;
		m.num1 = m.num2;
		m.num2 = temp;
	}
	
	public static void main(String[] args) {
		int num1 = 10, num2 = 15;
		
		System.out.println("두 수의 교환");
		Methodtest2 m2 = new Methodtest2();  // 객체의 주소
		m2.swap(m2);  // 주소를 전달
		
		System.out.println("num1="+m2.num1 + ", num2=" + m2.num2);
	}
}