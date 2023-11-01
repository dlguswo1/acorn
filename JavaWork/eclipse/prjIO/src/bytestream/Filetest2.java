package bytestream;

import java.io.FileOutputStream;
import java.io.IOException;

public class Filetest2 {
	public static void main(String[] args) throws IOException{
		// TODO 키보드로부터 입력받아 파일로 출력
		FileOutputStream font =
			new FileOutputStream("C:\\netsong7\\JavaWork\\test3.txt", true);
		
		int input = 0;
		while(true) {
			input = System.in.read();
			
			if(input == -1)
				break;
		
				font.write((char)input);
				font.flush();
		}
		font.close();
	}
}

/*
 *  java jcopy a.txt b.txt
 *  // 뒤에 두개 합치는 카피 프로그램
 *  
 *  java jcomp a.txt b.txt
 *  // 두개 비교해서 같은 파일인지 아닌지
 */