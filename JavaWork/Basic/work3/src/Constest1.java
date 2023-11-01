class Consdemo1{
	int iVal;
	double dVal;
	
	Consdemo1(int i){
		System.out.println("생성자 호출됨");
	}
	
	Consdemo1(){
	}
}

public class Constest1 {
	public static void main(String[] args) {
		new Consdemo1(10);
		new Consdemo1(10);
	}
}