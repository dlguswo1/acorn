class Inputtest {
	public static void main(String[] args) throws java.io.IOException {
		System.out.println("문자를 입력해 주세요 : ");
		int input = java.lang.System.in.read();
		System.out.println("입력받은 값 :" + (char)input);
		
		System.in.skip(2);
		// 안스면 문자입력란에 입력시 숫자입력도 같이 이루어짐. 텀을 두는 것
		
		System.out.print("숫자를 입력하세요: ");
		input = System.in.read()-48;
		System.out.println("입력받은 값 :" + input);
	}