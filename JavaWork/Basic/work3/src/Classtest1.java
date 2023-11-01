class Classdemo {
	int m_no;
	double m_point;
}	

class Classtest1 {
	int m_ival;
	double m_dval;
	
	public static void main(String[] args){
		//new Classtest1().m_ival = 10;
		//System.out.println(m_ival);
		
		Classtest1 i = new Classtest1();  //  i는 참조변수,객체변수
		i.m_ival = 10;
		System.out.println(i.m_ival);
		
		System.out.println("--------------------------------");
		
		Classdemo j = new Classdemo();
		j.m_no = 100;
		j.m_point = 3.14;
		System.out.println(j.m_no + ", " + j.m_point);
	}
}