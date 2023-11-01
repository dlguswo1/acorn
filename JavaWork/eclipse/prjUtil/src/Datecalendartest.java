import java.util.Date;
import java.util.Calendar;

public class Datecalendartest {

	public static void main(String[] args) {
		// TODO Date클래스와 Calendar클래스의 차이점
		
		// Date Class
		Date date = new Date();
		System.out.println(date);
		System.out.println(new Date());
		System.out.println(new Date().toString());
		// 현재 날짜표시
		
		Datecalendartest test = new Datecalendartest();
		System.out.println(test.toString());
		
		
		// Calendar Class
		Calendar cal = Calendar.getInstance();
		// 일반적인 객체생성 : new 생성자호출
		// singleton 단 하나의 인스턴스만 생성
		System.out.println(cal);
		System.out.println(cal.get(Calendar.YEAR));
		System.out.println(cal.get(Calendar.MONTH)+1);
		// 월은 0부터 시작하기 때문에 1이 적게나옴
		System.out.println(cal.get(Calendar.DATE));
		System.out.println(cal.get(Calendar.HOUR));

	}

}
