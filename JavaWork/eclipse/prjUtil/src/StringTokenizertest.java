import java.util.StringTokenizer;

public class StringTokenizertest {

	public static void main(String[] args) {
		// TODO 문자열 분리
		String data = "홍길동, 임꺽정, 신돌석, 강감찬";
		
		String[] names = data.split(",");  //  ,기준으로 나눈다
		for (String name : names) {
			System.out.println(name.trim());
			// trim : 공백제거
		}
		
		StringTokenizer token = new StringTokenizer(data, ",");
		System.out.println(token.countTokens());
		/*
		System.out.println(token.nextToken());
		System.out.println(token.nextToken());
		System.out.println(token.nextToken());
		System.out.println(token.nextToken());
		*/
		
		while(token.hasMoreTokens()) {
			System.out.println(token.nextToken().trim());
		}
		
		
		String data2 = "홍길동 + 임꺽정* 신동석? 권욜~ 강감찬";
		StringTokenizer tk = new StringTokenizer(data2, "+*?~");
		// 스플릿과 다르게 표현들을 전부 적어주면 된다.
		
		while(token.hasMoreTokens()) {
			System.out.println(token.nextToken().trim());
		}
		
		String data3 = "JavaTM 언어사양 제2판:James Gosling, Bill Join, " +
					"Gilad Bracha:무라카미 마사키:피어슨 에듀케이션:2000:5500";
		
		/*
		 * 책 제목 : JavaTM 언어사양 제2판
		 * 저자 : James Gosling
		 * 		Bill Join
		 * 		Gilad Bracha
		 * 역자 : 무라카미 마사키
		 * 출판사 : 피어슨 에듀케이션
		 * 출판년도 :2000
		 * 가격 : 5500
		 */
		
		StringTokenizer tkt = new StringTokenizer(data3, ":");
		System.out.println("저자 : " + tkt.nextToken());
		System.out.println("역자 : " + tkt.nextToken());
		System.out.println("출판사 : " + tkt.nextToken());
		System.out.println("출판년도 : " + tkt.nextToken());
		System.out.println("가격 : " + tkt.nextToken());
	}
}
