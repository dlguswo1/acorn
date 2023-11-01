import java.io.IOException;
/*
public class Exdemo2 {
	public static void main(String[] args) {
		System.out.println("문자를 입력해 주세요 : ");
		try {
			int input = java.lang.System.in.read();
			System.out.println("입력받은 값 :" + (char)input);
		}
		catch(IOException err) {
			System.out.println("입력 오류 :" + err);
		}
	}
}
*/

public class Excdemo2 {
	public static void main(String[] args) throws IOException{
		// throws를 이용해 대신 예외를 처리함
		System.out.println("문자를 입력해 주세요 : ");
		
			int input = java.lang.System.in.read();
			System.out.println("입력받은 값 :" + (char)input);
	}
}