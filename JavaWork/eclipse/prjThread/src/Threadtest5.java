class Toilet {
	public synchronized void opendoor(String name){
		// 동기화 처리를 하겟다.
		System.out.println(name + "입장");
		
		for(int i = 0; i<10000; i++) {
			if(i == 5000) {
				System.out.println(name + " : 끄응 ~~");
			}
		}
		
		System.out.println(name + "퇴장");
	}
}

class Family extends Thread{
	Toilet toilet;
	String who;
	
	Family(Toilet t, String w){
		toilet = t;
		who = w;
	}
	
	@Override
	public void run() {
		toilet.opendoor(who);
	}
}

public class Threadtest5 {

	public static void main(String[] args) {
		// TODO 동기화 처리하기
		Toilet t = new Toilet();
		
		Family father = new Family(t, "아버지");
		Family mother = new Family(t, "어머니");
		Family brother = new Family(t, "형");
		Family sister = new Family(t, "누나");
		Family me = new Family(t, "나");
		
		father.start();
		mother.start();
		brother.start();
		sister.start();
		me.start();
	}
}
