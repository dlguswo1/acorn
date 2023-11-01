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
		 검증코드
	*/
	iVal = i;
	dVal = d;
	} // 메서드를 새로 만들어줌 변수창출 위해서(가급적)
}

public class Constest2 {
	public static void main(String[] args) {
		Consdemo2 ob = new Consdemo2();
		System.out.println(ob.iVal);
		
		
		
		// 검증코드
		/*
			100이 문제가 있는지 없는지 검증코드
		*/
		//ob.iVal = 100;
		//ob.dCal = 10.0;
		
		ob.setVal(100, 10.0);
		
		Consdemo2 ob2 = new Consdemo2(100, 10.0);
		System.out.println(ob2.iVal);
		
	}
}