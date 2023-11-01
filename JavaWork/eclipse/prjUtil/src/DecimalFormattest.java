import java.text.DecimalFormat;

public class DecimalFormattest {

	public static void main(String[] args) {
		// TODO 10진수 정수
		
		double d1 = 2.523, d2 = 3.123;
		double result = d1 + d2;
		System.out.println(result);
		
		DecimalFormat df = new DecimalFormat("#.##");
		// 정수 자리를 지정 가능 정수 1자리 소수 2자리까지
		String str = df.format(result);
		System.out.println(str);
		// 문자열
		
		double d =  Double.parseDouble(str);
		System.out.println(d);
		// 실수형
	}

}
