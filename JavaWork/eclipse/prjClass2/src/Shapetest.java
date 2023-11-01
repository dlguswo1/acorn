abstract class TwoDshape{
	private double width;
	private double height;
	private String name;
	// 2차원 도형이 가질 수 있는 가장 기본적인 속성
	// abstract 추상클래스
	
	public TwoDshape(double width, double height, String name) {
		
		this.width = width;
		this.height = height;
		this.name = name;
		// 생성자 만들기
	}
		
	public double getWidth() {return width;}
	public double getHeight() {return height;}
	public String getName() {return name;}
	// getter만들기
	
	/*
	double getArea() {
		return 0.0;
	}
	//  밑에 추상 메서드 만들라고 잠시 주석처리
	*/
	public abstract double getArea();
	// 추상메서드
}


class Triangle extends TwoDshape{
	Triangle(double w, double h, String n){
		super(w, h, n);
	}
	
	@Override
	public double getArea() {
		return getWidth() * getHeight() / 2;
	// 오버라이징, 부모와 똑같이 선언
	}
}

class Rectangle extends TwoDshape{
	Rectangle(double w, double h, String n){
		super(w, h, n);
	}
	
	public double getArea() {
		return getWidth() * getHeight();
	// 오버라이징, 부모와 똑같이 선언
	}
}

public class Shapetest {
	public static void main(String[] args) {
		// TODO 2차원 도형을 그리기 위한 프로그램
		Triangle tr1 = new Triangle(5.0, 5.0, "정삼각형");
		Triangle tr2 = new Triangle(7.0, 15.0, "직각삼각형");
		Rectangle re1 = new Rectangle(3.0, 3.0, "정사각형");
		Rectangle re2 = new Rectangle(3.0, 6.0, "직사각형");
//		TwoDshape ts1 = new TwoDshape(5.0, 5.0, "2차원 도형");
		// 추상클래스임을 명확하게 하기 위해서
				
//		System.out.println(tr1.getName() + " : " + tr1.getArea());
//		System.out.println(re1.getName() + " : " + re1.getArea());
				
		TwoDshape[] t = {tr1, tr2, re1, re2, new Rectangle(3.0, 4.0, "사각형")};
		
		for(int i=0; i<t.length; i++) {
			System.out.println(t[i].getName() + ":" + t[i].getArea());
		}
	}
}