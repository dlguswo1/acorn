// ���� ���� ���
/*
class Methodtest2 {
	void swap(int num1, int num2){
		int temp = num1;
		num1 = num2;
		num2 = temp;
		return num1
	}
	public static void main(String[] args) {
		int num1 = 10, num2 = 15;
		
		System.out.println("�� ���� ��ȯ");
		new Methodtest2().swap(num1,num2);
		
		System.out.println("num1="+num1 + ", num2=" + num2);
	}
}
*/

// �ּҷ� �̿��� ��ȯ�ϱ�
public class Methodtest2 {
	int num1 = 10, num2 = 15;
	
	void swap(Methodtest2 m){
		int temp = m.num1;
		m.num1 = m.num2;
		m.num2 = temp;
	}
	
	public static void main(String[] args) {
		int num1 = 10, num2 = 15;
		
		System.out.println("�� ���� ��ȯ");
		Methodtest2 m2 = new Methodtest2();  // ��ü�� �ּ�
		m2.swap(m2);  // �ּҸ� ����
		
		System.out.println("num1="+m2.num1 + ", num2=" + m2.num2);
	}
}