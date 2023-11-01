class Fdemo {
	int count;
	
	Fdemo(int cnt){
		count = cnt;
	}
	
	protected void finalize(){
		System.out.println("GC 가동중 :" + count);
	}
}

public class Finalizetest {
	public static void main(String[] args) {
		for(int i=0; i<100000; i++){
			new Fdemo(i);
		}
	}
}
// 질문하기