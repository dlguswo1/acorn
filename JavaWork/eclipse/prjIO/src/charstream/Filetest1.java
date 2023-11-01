package charstream;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Filetest1 {
	public static void main(String[] args) {
		
		BufferedReader fin = null;
		try {
				fin = new BufferedReader(
						new FileReader("C:\\netsong7\\JavaWork\\test.txt"));
		
		
		String input = null;
			while((input = fin.readLine()) != null) {
					System.out.println(input);
			}
		}
		catch(FileNotFoundException e) {
			System.out.println("파일을 찾을 수 없다." + e);
		}
		catch(IOException e) {
			e.printStackTrace();
		}
		finally {
			try {
			fin.close();
			//fin은 지역번수 이기때문에
			//그래서 밖에 변수 선언은 해줌
			//IO문제를 try catch로 잡아줌
			}
			catch(IOException e) {}
		}
	}
}
