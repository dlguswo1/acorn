package bytestream;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class Objecttest {
	public static void main(String[] args) throws IOException, ClassNotFoundException{
		Employee[] emp = new Employee[3];
		// 불러온 생성자를 배열로 묶음
		emp[0] = new Employee(1, "홍길동", "영업", 3, 3500);
		emp[1] = new Employee(2, "임꺽정", "기술", 2, 2500);
		emp[2] = new Employee(3, "Tommy", "개발", 1, 3000);
				 // Employee 클래스에서 생성자를 선언 했음
		ObjectOutputStream oos =
		new ObjectOutputStream(new FileOutputStream("C:\\netsong7\\JavaWork//emp.dat"));
		// dat : 확장자
		
		oos.writeObject(emp[0]);
		oos.writeObject(emp[1]);
		oos.writeObject(emp[2]);
		
		oos.close();
		
		System.out.println("***************사원 정보****************");
		System.out.println("사번\t이름\t업무\t부서\t급여");
		System.out.println("--------------------------------------");
		
		ObjectInputStream ois = new ObjectInputStream(
						new FileInputStream("C:\\netsong7\\JavaWork//emp.dat"));
		
		for(int i=0; i<3; i++) {
			Employee e = (Employee)ois.readObject();
			System.out.println(e);
			// System.out.println(e);
			// toStrint() 이 생략
		}
		ois.close();
	}
}
