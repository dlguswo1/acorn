package bytestream;

import java.io.IOException;
import java.io.RandomAccessFile;

public class RandomAccessFiletest {

	public static void main(String[] args) throws IOException{
		// 임의 평균
		int data[] = {10, 20, 30, 40, 50, 60, 70, 80, 90, 100};
		
		RandomAccessFile raf =
				new RandomAccessFile("C:\\netsong7\\JavaWork\\test5.txt", "rw");
		
		for(int i=0; i<10; i++) {
			raf.writeInt(data[i]);
		}
		
		raf.seek(0);
		System.out.println(raf.readInt());
		
		raf.seek(8);
		System.out.println(raf.readInt());
		// 바이트 단위이기 때문에 30이 나온다
		
		raf.seek(4*3);
		System.out.println(raf.readInt());
		// 숫자 = Integer = 4byte이기 때문에 저게 편하다
		
		
	}

}
