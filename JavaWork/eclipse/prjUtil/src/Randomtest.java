import java.util.Random;

public class Randomtest {

	public static void main(String[] args) {
		// TODO 난수 처리
		
		Random rnd = new Random();
		
		System.out.println(rnd.nextInt());
		System.out.println(rnd.nextInt(10));
		
		// (최대값 - 최소값 + 1) + 최소값
		// 11 ~ 25
		System.out.println(rnd.nextInt(25-11+1)+11);
		
		// 가위 바위 보 게임
		System.out.println(rnd.nextInt());
		// 로또 추출기

	}

}
