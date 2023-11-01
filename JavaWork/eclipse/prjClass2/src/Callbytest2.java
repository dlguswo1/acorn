/*
public class Callbytest2 {
	int num1 = 10, num2 = 15;
		
	void swap(Callbytest2 m){
		int temp = m.num1;
		m.num1 = m.num2;
		m.num2 = temp;
	}
	public static void main(String[] args) {
		// TODO 값과 참조에 의한 전달2
int num1 = 10, num2 = 15;
		
		System.out.println("두 수의 교환");
		Callbytest2 m2 = new Callbytest2();  // 객체의 주소
		m2.swap(m2);  // 주소를 전달
		
		System.out.println("num1="+m2.num1 + ", num2=" + m2.num2);
	}

}
*/

/*
public class Callbytest2 {
	void swap(int[] nums){
		int temp = nums[0];
		nums[0] = nums[1];
		nums[1] = temp;
	}
	
	public static void main(String[] args) {
		int []nums = {10, 15};
		
		System.out.println("두 수의 교환");
		Callbytest2 m2 = new Callbytest2();  // 객체의 주소
		m2.swap(nums);  // 주소를 전달
		
		System.out.println("num1="+nums[0] + ", num2=" + nums[1]);
	}
}
*/

public class Callbytest2 {
	int[] swap(int n1, int n2){
		int temp = n1;
		n1 = n2;
		n2 = temp;
		
		int[] nums = {n1, n2};
		return nums;
	}
	
	public static void main(String[] args) {
		int num1 = 10, num2 = 15;
		
		System.out.println("두 수의 교환");
		Callbytest2 m2 = new Callbytest2();  // 객체의 주소
		int[] nums = m2.swap(num1,num2);
		
		System.out.println("num1="+nums[0] + ", num2=" + nums[1]);
	}
}