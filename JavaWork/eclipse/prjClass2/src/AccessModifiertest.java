class EmpManager{
	String name;
	public int no;
	private double pay;
	
	void setPay(double pay) {
		this.pay = pay;
	}  // private로 막힐 때 값을 넣어줄 수 있게 , setter Method
	
	double getPay() {
		return pay;
	}  // 이렇게 돌려서 pay를 꺼내옴, getter Method
}

public class AccessModifiertest {
	public static void main(String[] args) {
		// TODO 접근 제한자 연습
		
		EmpManager hong = new EmpManager();
		hong.name = "홍길동";
		hong.no = 123;
		hong.setPay(1000000);
		
		System.out.println(hong.name + ", " + hong.no
				+ ", "+  hong.getPay());

	}

}
