import java.util.Random;

public class Randomtest3 {

	public static void main(String[] args) {
		// 로또 번호 추첨
		Random rnd = new Random();
		
		System.out.println("로또 번호 추첨");
		try {

			Thread.sleep(1000); //1초 대기

		} catch (InterruptedException e) {

			e.printStackTrace();

		}
		for (int i=0; i<6; i++) {
			System.out.println ("[" + (rnd.nextInt(45-1+1)+1) + "]");
			try {

				Thread.sleep(1000); //1초 대기

			} catch (InterruptedException e) {

				e.printStackTrace();

			}
		}
		System.out.println("축하합니다 !!!");
	}

}
