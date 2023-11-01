package bytestream;

import java.io.FileOutputStream;
import java.io.IOException;

public class Filetest3 {

	public static void main(String[] args) throws IOException{
		FileOutputStream font =
				new FileOutputStream("C:\\netsong7\\JavaWork\\test4.txt");
		
		for(int i=1; i<10; i++) {
		String str = i + "번째 줄입니다.\r\n";
		System.out.println(str);
		font.write(str.getBytes());
		// getBytes : 문자열을 바이트로 쪼개주는 명령어
		}
		font.close();
	}

}
