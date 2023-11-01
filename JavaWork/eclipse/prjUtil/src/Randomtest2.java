import java.util.Random;
import java.util.Scanner;

public class Randomtest2 {
	

	public static void main(String[] args) {
		// 가위 바위 보 게임
		Random rnd = new Random();
		Scanner sc = new Scanner(System.in);
		
		System.out.println("1.주먹");
		System.out.println("2.가위");
		System.out.println("3.보자기");
		System.out.println("선택 : ");
		
		
		int a = sc.nextInt();
		int result = rnd.nextInt();
		if(a == 1) {
			result = rnd.nextInt(3)+1;
			if(result == 1) {
				System.out.println("컴퓨터 : 주먹");
				System.out.println("비겼습니다.");
			}
			if(result == 2) {
				System.out.println("컴퓨터 : 가위");
				System.out.println("이겼습니다.");
			}
			if(result == 3) {
				System.out.println("컴퓨터 : 보자기");
				System.out.println("졌습니다.");
			}
		}
		if(a == 2) {
			result = rnd.nextInt(3)+1;
			if(result == 1) {
				System.out.println("컴퓨터 : 주먹");
				System.out.println("졌습니다.");
			}
			if(result == 2) {
				System.out.println("컴퓨터 : 가위");
				System.out.println("비겼습니다.");
			}
			if(result == 3) {
				System.out.println("컴퓨터 : 보자기");
				System.out.println("이겼습니다.");
			}
		}
		if(a == 3) {
			result = rnd.nextInt(3)+1;
			if(result == 1) {
				System.out.println("컴퓨터 : 주먹");
				System.out.println("이겼습니다");
			}
			if(result == 2) {
				System.out.println("컴퓨터 : 가위");
				System.out.println("졌습니다.");
			}
			if(result == 3) {
				System.out.println("컴퓨터 : 보자기");
				System.out.println("비겼습니다.");
			}
		}
		sc.close();
	}
	

}
