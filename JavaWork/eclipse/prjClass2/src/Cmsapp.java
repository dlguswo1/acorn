
public class Cmsapp {

	public static void main(String[] args) {
		// TODO 상속에 대한 기본 개념과 문법
//		Cms kim = new Cms(1, "김유신", 'C');
//		kim.display();
		
		Cmsext lee = new Cmsext(1, "이순신", 'A', "서울시 강남구");
		lee.display();
		
		Cmsext kim = new Cmsext(2, "홍길동", 'B', "서울시 강북구");
		kim.display();
		

	}

}
