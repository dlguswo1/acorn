class Thisdemo {
	int iVal;
	double dVal;
	
	Thisdemo(int i, double d){
//Thisdemo(�ּ�(this), int i, double d){
		this.iVal = i;
		this.dVal = d;
	//this.iVal = iVal;
	//this.iVal = dVal;  >> �ƿ� �ٸ� ����
	}
	
	void display(){
		System.out.println(this.iVal + "," + this.dVal);
	}
}

public class Thistest {
	public static void main(String[] args) {
		Thisdemo t1 = new Thisdemo(10, 10.5);
	//Thisdemo t1 = new Thisdemo(�ּ�(this) ,10, 10.5);
		Thisdemo t2 = new Thisdemo(20, 20.5);
		Thisdemo t3 = new Thisdemo(30, 30.5);
		
		t1.display();
		t2.display();
		t3.display();
	}
}