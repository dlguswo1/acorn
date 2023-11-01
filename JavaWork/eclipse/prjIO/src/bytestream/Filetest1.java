package bytestream;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.OutputStream;

public class Filetest1 {

	public static void main(String[] args) throws IOException{
		// 파일로부터 입력받아 콘솔로 출력
		FileInputStream fin =
			new FileInputStream("C:\\netsong7\\JavaWork\\test.txt");
		
		// 파일로 부터 한글짜씩 입력받아 input에 저장
		int input = 0;
		while(input != -1) {
			// 파일에서 -1 : 더이상 읽어올 글자가 없을 때, 파일의 마지막
			input = fin.read();
			// System.out.print((char)input);
			// print로하면 한글이 깨짐
			OutputStream os = System.out;
			os.write((char)input);
			os.flush();
		}
		fin.close();
	}
}
