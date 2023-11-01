package bytestream;

import java.io.Serializable;

public class Employee implements Serializable{
	// 복잡한 데이터를 연결하는 직렬화를 해라 ( implements : 상속)
	private int no;
	private String name;
	private String job;
	private int deptno;
	private double sal;
	public Employee(int no, String name, String job, int deptno, double sal) {
		super();
		this.no = no;
		this.name = name;
		this.job = job;
		this.deptno = deptno;
		this.sal = sal;
	}
	
	// 오버라이딩 : Object는 모든 객체의 부모버전 따라서 오브젝트의 메서드인 String toString()이 사용가능
	// 퍼블릭도 똑같이 선언
	@Override
	public String toString() {
		return no + "\t" + name + "\t" + job + "\t" + deptno + "\t" + sal;
	}
}