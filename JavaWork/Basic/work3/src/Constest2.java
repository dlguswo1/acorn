class Consdemo2{
	int iVal;
	double dVal;
	
	Consdemo2(int i, double d){
		iVal = i;
		dVal = d;
	}
	
	Consdemo2(){}
	
	void setVal(int i, double d){
	/*
		 �����ڵ�
	*/
	iVal = i;
	dVal = d;
	} // �޼��带 ���� ������� ����â�� ���ؼ�(������)
}

public class Constest2 {
	public static void main(String[] args) {
		Consdemo2 ob = new Consdemo2();
		System.out.println(ob.iVal);
		
		
		
		// �����ڵ�
		/*
			100�� ������ �ִ��� ������ �����ڵ�
		*/
		//ob.iVal = 100;
		//ob.dCal = 10.0;
		
		ob.setVal(100, 10.0);
		
		Consdemo2 ob2 = new Consdemo2(100, 10.0);
		System.out.println(ob2.iVal);
		
	}
}