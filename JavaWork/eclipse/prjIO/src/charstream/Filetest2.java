package charstream;

import java.io.BufferedReader;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;

public class Filetest2 {
	public static void main(String[] args) throws IOException{
		
		BufferedReader font = new BufferedReader(
			new FileReader("C:\\netsong7\\JavaWork\\test3.txt"));
		
		String input = null;
		while(true) {
			input = (String)font.readLine();
			
			if(input == null)
				break;
			
			font.readLine();
		}
		font.close();
	}
}
