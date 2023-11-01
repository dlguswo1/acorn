public class Stringtest {
	public static void main(String[] args) {
		String[] names = new String[10];
		names[0] = "Tom";
		names[1] = "Johnson";
		names[2] = "Marry";
		
		System.out.println(names[0]);
		System.out.println(names[1]);
		System.out.println(names[2]);
		
		
		
		String str = new String();
		str = "홍길동";
		System.out.println(str);
		
		String str2 = new String("임꺽정");
		System.out.println(str2);
		
		String str3 = "강감찬";
		System.out.println(str3);
		
		/////////////// String 클래스 APIs ////////////////
		
		String s1 = "java";
		//String s2 = "java"; 같다
		String s2 = new String("java"); // 다르다
		
		//if(s1 == s2) // 주소를 비교하는 것
		//	System.out.println("같다.");
		//else
		//	System.out.println("다르다");
	
		if(s1.equals(s2))
			System.out.println("같다.");
		else
			System.out.println("다르다");

		System.out.println("Java".equalsIgnoreCase(s2));
		
		
		String s3 = "java is beautiful";
		String s4 = "java just one";
		
		System.out.println(s3.compareTo(s4));
		
		System.out.println(s3.charAt(3));
		
		System.out.println(s3.indexOf("is"));
		System.out.println(s3.indexOf("a"));
		System.out.println(s3.lastIndexOf("a"));
		System.out.println(s3.indexOf("love"));
		
		System.out.println(s3.substring(5,6)); // 특정 문자열 찾기
		System.out.println(s3.substring(5));
		
		String[] sp = s3.split(" "); // 띄어쓰기 기준으로 나눔
		for(String s : sp){
			System.out.println(s);
		}
		
		for(int i=0; i<3; i++){
			System.out.println(sp[i]);
		}
		
		/////////////////불변성//////////////////
		String s5 = "Java";
		s5 = "java";
		System.out.println("s5: " + s5);
		
		String s6 = s5.concat(" is number one");
		System.out.println(s6);
		System.out.println(s5 == s6);
		
		StringBuffer s7 = new StringBuffer("java");
		StringBuffer s8 = s7.append("is number one");
		System.out.println(s7 == s8);
	}
}