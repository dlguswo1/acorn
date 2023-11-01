/*
public class Excdemo1 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = new int[3];
		
		System.out.println("Exception 실행 예제...");
		
		arr[7] = 10;
		
		System.out.println("이 문장이 보이는가?");
	}
}
*/

public class Excdemo1 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = new int[3];
		
		System.out.println("Exception 실행 예제...");
		try {
		arr[2] = 10;
		// ...
		double d = 10/0;
		}
		/*
		catch(ArrayIndexOutOfBoundsException err) {
			System.out.println("배열의 범위를 벗어났습니다.");
			// 내가만든 에러 메시지
		}
		catch(ArithmeticException err) {
			System.out.println("산술 연산을 잘못했습니다.");
		}
		*/
		catch(Exception err) {}
		
		System.out.println("이 문장이 보이는가?");
	}
}
