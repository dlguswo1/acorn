public class Cmsext extends Cms{
// extends : Cms파일 복사해놓은거임, Cms가 부모(super)클래스 Cmsext는 자식(sub)클래스
// 상속은 부모의 코드를 복사해오는 것
	private String address;
	String name;

	public Cmsext(int no, String name, char level, String address) {
		/*
		this.no = no;
		this.name = name;
		this.level = level;
		this.address = address;
		//  일반변수 받아오기
		*/
		
		/*
		setNo(no);
		setName(name);
		setLevel(level);
		//  private로 선언된 변수 받아오기
		*/
		
		super(no, name, level);
		//super : 부모의 생성자를 호출하겠다.
		// 변수 호출해와서 위에 변수에 저장
		// 가장 처음으로 호출해야한다.
		this.name = "자식";
		this.address = address;
		
	}
	
	/*
	void print() {
		display();
		System.out.println("고객 주소 :" +address);
		System.out.println("고객 이름 :" +name);
		// 부모한테 맡겨놓은 name : 이순신
	}
	*/
	
	void display() {
		// 오버라이즈 Cms.java
		
		System.out.println("고객 번호 :" + getNo());
		System.out.println("고객 이름 :" + super.name);
		System.out.println("고객 등급 :" + getLevel());
		
		/*
		super.display();
		System.out.println("고객 주소 :" + address);
		*/
	}
}
