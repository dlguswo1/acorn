/*
class Finishdemo implements Runnable{
	long add = 0;
	String name;
	
	Finishdemo(long a, String name){
		this.name = name;
		//이름을 스레드에 저장
		add = a;
	}
	@Override
	public void run() {
		System.out.println(name + "자식 스레드 시작");
		// 메인 스레드 시작보드 늦게 사직함
		// getName()으로 스레드의 이름을 붙여줌
		long all = 0;
	//스레드의 동작을 구현하는 메서드
	//오버라이딩임
		for(int i=0; i<=add; i++) {
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			all += i;
			System.out.println(name + ":" + all);
		}
		System.out.println(name + "자식 스레드 종료");
	}
}
public class Threadtest4 {
	public static void main(String[] args){
		// TODO 스레드의 종료시점
		System.out.println("메인 스레드 시작");
		Finishdemo t1 = new Finishdemo(10, "first");
		Finishdemo t2 = new Finishdemo(10, "second");
		// 새로운 객체가 스레드 2, 자식스레드
		
		Thread tt1 = new Thread(t1);
		Thread tt2 = new Thread(t2);
		// 따로 Thread객체 생성
		
		tt1.start();
		tt2.start();
		
		for(; ;) {
			if(!tt1.isAlive() && !tt2.isAlive()) {
				break;
			}
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			// 쉬는 시간을 주면 메인스레드와 자식스레드가 서로 1번씩 번갈아 실행됨
			// try catch로 일하는 비중 조절 가능
			System.out.print(".");
		}
		System.out.println("메인 스레드 종료");
	}
}
*/


class Finishdemo implements Runnable{
	long add = 0;
	String name;
	
	Finishdemo(long a, String name){
		this.name = name;
		//이름을 스레드에 저장
		add = a;
	}
	@Override
	public void run() {
		System.out.println(name + "자식 스레드 시작");
		// 메인 스레드 시작보드 늦게 사직함
		// getName()으로 스레드의 이름을 붙여줌
		long all = 0;
	//스레드의 동작을 구현하는 메서드
	//오버라이딩임
		for(int i=0; i<=add; i++) {
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			all += i;
			System.out.println(name + ":" + all);
		}
		System.out.println(name + "자식 스레드 종료");
	}
}
public class Threadtest4 {
	public static void main(String[] args) throws InterruptedException{
		// TODO 스레드의 종료시점
		System.out.println("메인 스레드 시작");
		Finishdemo t1 = new Finishdemo(10, "first");
		Finishdemo t2 = new Finishdemo(10, "second");
		// 새로운 객체가 스레드 2, 자식스레드
		
		Thread tt1 = new Thread(t1);
		Thread tt2 = new Thread(t2);
		// 따로 Thread객체 생성
		
		tt1.start();
		tt2.start();
		
		for(int i = 0; i<10; i++) {
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			// 쉬는 시간을 주면 메인스레드와 자식스레드가 서로 1번씩 번갈아 실행됨
			// try catch로 일하는 비중 조절 가능
			System.out.print(".");
		}
		
		tt1.join();
		tt2.join();
		
		System.out.println("메인 스레드 종료");
	}
}
