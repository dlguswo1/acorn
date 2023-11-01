

public class Nestedclasstest {
	public static void main(String[] args) {
		// TODO 중첩 클래스 활용 테스트
		
		/*
		// 내부클래스가 static일 경우
		Outerclass.Innerclass ic = new Outerclass.Innerclass();
		ic.innermethod();
		//ic.inner1 = 100;
		//System.out.println(ic.inner1);
		 
		// 외부에서 클래스를 가져와 쓴 경우
		*/
		
		// 내부 클래스가 General일 경우
		Outerclass.Innerclass ic = new Outerclass().new Innerclass();
		ic.innermethod();

	}


}
