package charstream;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class Filetest4 {
	public static void main(String[] args) throws IOException{
		// TODO PrintWriter 예제 2
		
		//PrintWriter pw = new PrintWriter(new BufferedWriter(
		//		new FileWriter("C:\\netsong7\\JavaWork\\sungjuk.txt")));
		PrintWriter pw = new PrintWriter("C:\\netsong7\\JavaWork\\sungjuk.txt");
		// 위와 같은결과
		
		pw.println("***************성적표****************");
		pw.println("------------------------------------");
		pw.printf("%3s : %5d %5d %5.1f %n",
				"홍길동", 98, 67,(float)((98+67)/2));
		pw.printf("%3s : %5d %5d %5.1f %n",
				"임꺽정", 89, 76,(float)((89+76)/2));
		pw.printf("%3s : %5d %5d %5.1f %n",
				"신돌석", 100, 81,(float)((100+81)/2));
		pw.close();
	}
}
/*

BufferedReader
:Scanner와 유사.

Bufferedwriter
:System.out.println();과 유사

*/