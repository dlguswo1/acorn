import java.io.IOException;

public class Excdemo5 {
	static void second() throws IOException, ArithmeticException{
		System.out.println("second 호출");
		
		int i = System.in.read();
		int j = i/5;
		throw new ArrayIndexOutOfBoundsException();
	}
	static void first() throws IOException, ArithmeticException{
		System.out.println("first 호출");
		second();
	}
	public static void main(String[] args) {
		try {
		first();
		}
		catch(Exception err){
			System.out.println("main에서 다 처리함...");
			err.printStackTrace();
		}
	}

}
