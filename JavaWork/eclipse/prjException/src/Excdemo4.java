public class Excdemo4 {
	public static void main(String[] args) {
		try {
			System.out.println("여기는 트라이블럭 내부");
			throw new RuntimeException("이것은 테스트용이다.");
			// 써줌으로써 catch문이 실행됨
		}
		catch(Exception err) {
			System.out.println("예외 처리됨.. : " + err.getMessage() );
			// getMessage() : throw문 안에있는 함수내용 을 문자열로 반환
		}
	}
}