package bytestream;

import java.io.IOException;

public class Bytetest1 {
	// 한글은 2바이트이기 때문에 안됨
	public static void main(String[] args) throws IOException{
		byte data[] = new byte[10];
		
		System.out.println("문자열 입력: ");
		System.in.read(data);
		
		System.out.println("당신이 입력한 문자들 :");
		for(int i=0; i<data.length; i++) {
			System.out.print((char)data[i]);
			// write를 쓰면 결과가 나오지 않음
		}
	}
}
