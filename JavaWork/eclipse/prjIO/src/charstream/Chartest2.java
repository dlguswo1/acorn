package charstream;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

/*
public class Chartest2 {
	static void Streamtest(InputStream in) throws IOException{
		InputStreamReader isr =  new InputStreamReader(in);
		// 한글도 입력받고 출력할 수 있는 명령어
		
		int input = isr.read();
		
		while(input != -1) {
			// -1 : Ctrl + z
			
			System.out.print((char)input);
			// input = isr.read();
			// 한글자씩 입력받아오는 명령어
		}
	}
	
	public static void main(String[] args) throws IOException{
		Streamtest(System.in);
	}
}
*/


public class Chartest2 {
	static void Streamtest(InputStream in) throws IOException{
		InputStreamReader isr =  new InputStreamReader(in);
		// 한글도 입력받고 출력할 수 있는 명령어
		BufferedReader br =  new BufferedReader(isr);
		// 보조 스트림, 한줄 씩 입력 받음, String변수 사용
		
		String input = br.readLine();
		
		while(input != null) {
			// -1 : Ctrl + z
			// readLine 은 null로 끝을 표현
			
			//System.out.print((char)input);
			// input = isr.read();
			// 한글자씩 입력받아오는 명령어
			
			System.out.print(input);
			// 버퍼리더 쓰면 String이기 때문
			input = br.readLine();
			
			isr.close();
			br.close();
		}
	}
	
	public static void main(String[] args) throws IOException{
		Streamtest(System.in);
	}
}
