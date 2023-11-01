class Optest{
	public static void main(String[] args) {
		// &&와 & 의 차이
		int a = 10, b = 7;
		
		//java.lang.System.out.println(a && b);
		java.lang.System.out.println(a>5 && b<3);
		java.lang.System.out.println(a & b);
		
		java.lang.System.out.println(a<12 && ++b>5);
		java.lang.System.out.println("b:" + b);
		
		// -----------------------------------------
		
		// 강제 형 변환 연산자 변수 앞에 (강제변환연산자) < 뒤에 소숫점 잃어버림
		double d1=3.5, d2=2.3;
		
		int c = (int)d1 + (int)d2;
		java.lang.System.out.println("c:"+c);
		
		byte b1 = (byte)c;
		java.lang.System.out.println("b1:"+b1);
		
		b1 = 100+ 5;
		java.lang.System.out.println("b1:"+b1);
		
		b1 = (byte)(b1 + 5);
		java.lang.System.out.println("b1:"+b1);
		
		b1 += 5;  //  b1= b1 + 5
		java.lang.System.out.println("b1:"+b1);
		
		// float f1 = (float)3.14; 밑에랑 같은 뜻
		float f1 = 3.14f;
		java.lang.System.out.println("f1:"+f1);
		
		//f1 = f1 + 2.5;
		f1 += 2.5;
		java.lang.System.out.println("f1:"+f1);
		
		int i = 'a';
		java.lang.System.out.println("i:"+i);
		// 정수형으로 문자 저장 가능
		
		char h1 = 94;
		java.lang.System.out.println("h1:"+h1);
		
		long x = 10000000000L;
		java.lang.System.out.println("x:"+x);
		
		
	}
}