package charstream;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class Filetest3 {
	public static void main(String[] args) throws IOException{
		// TODO PrinterWriter 예제
		//FileWriter font =
		//		new FileWriter("C:\\netsong7\\JavaWork\\test3.txt");
		
		PrintWriter font =
				new PrintWriter("C:\\netsong7\\JavaWork\\test3.txt");
		
		for(int i=1; i<10; i++) {
			String data = i + "번째 줄입니다.\r\n";
			//font.write(data);
			font.println(data);
		}
		
		font.close();
	}
}
