package bytestream;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class Filetest4 {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		/*
		// 입력내용을 test2에 저장
		FileOutputStream sin =
				new FileOutputStream("C:\\netsong7\\JavaWork\\test.txt");
		
		int input;
		
		while((input = System.in.read()) != -1) {
			sin.write((char)input);
		}
		sin.flush();
		sin.close();
		*/
		
		FileInputStream fin =
				new FileInputStream("C:\\netsong7\\JavaWork\\test.txt");
		
		FileOutputStream din =
				new FileOutputStream("C:\\netsong7\\JavaWork\\test2.txt", true);
		
		
		int data;
		
		while((data = fin.read()) != -1) {
			din.write(data);
			OutputStream os = System.out;
			os.write(data);
			os.flush();
		}
		fin.close();
		din.close();
		// fin파일을 din파일에 복사
	}
}
