
// TODO 상속을 위한 고객관리 프로그램 샘플
public class Cms {
	 private int no;
	 String name;
	 private char level;
	
	public Cms(int no, String name, char level) {
		super();
		this.no = no;
		this.name = name;
		this.level = level;
	}
	
	Cms(){}
	
	int getNo() {
		return no;
	}  //  일반적인 getter 메서드
	
	public String getName() {
		return name;
	}
	
	public char getLevel() {
		return level;
	}
	
	void setNo(int no){
		this.no = no;
	}  //  일반적인 setter메서드
	
	void setName(String name){
		this.name = name;
	}
	
	public void setLevel(char level){
		this.level = level;
	}  //  private로 저장된 변수를 get,set이용해서 불러올 수 있게 함
	
	void display() {
		System.out.println("고객 번호 :" + no);
		System.out.println("고객 이름 :" + name);
		System.out.println("고객 등급 :" + level);
	}

}
