public class Excdemo3 {
	public static void main(String[] args) {
		int[] arr = new int[3];
		
		System.out.println("Exception 실행 예제...");
		try {
			arr[7] = 10;
		// ...
		}
		catch(Exception err) {
			System.out.println("오류 발생");
			return;
			// 더이상 코드 진행시키지말고 중단해라
			// finally는 제외하고 진행
			
			//System.exit(0);
			// finally 까지 실행 종료시키는 명령어
		}
		finally {
			System.out.println("이것은 반드시 실행되는 영역이다.");
		}
		
		System.out.println("이 문장이 보이는가?");
		// return을 사용하니 출력이 되지 않는 모습
	}
}