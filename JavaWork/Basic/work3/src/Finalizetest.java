class Fdemo {
	int count;
	
	Fdemo(int cnt){
		count = cnt;
	}
	
	protected void finalize(){
		System.out.println("GC ������ :" + count);
	}
}

public class Finalizetest {
	public static void main(String[] args) {
		for(int i=0; i<100000; i++){
			new Fdemo(i);
		}
	}
}
// �����ϱ�