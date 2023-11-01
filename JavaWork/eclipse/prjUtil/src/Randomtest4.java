import java.util.Random;

public class Randomtest4 {

	public static void main(String[] args) {
		// 로또 번호 추첨
		Random rnd = new Random();
		
		System.out.println("로또 번호 추첨");
		
		for (int i=0; i<6; i++) {
			System.out.println("[" + (rnd.nextInt(45-1+1)+1) + "]");
			
		}
		System.out.println("축하합니다 !!!");
		System.out.println(rnd.nextInt(10));
	}

}
