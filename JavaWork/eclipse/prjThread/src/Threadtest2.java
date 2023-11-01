/*
public class Threadtest2 implements Runnable{
	// Threadtest1이 스레드
	// extends : 클래스 확장
	// implements : 인터페이스를 구현
	// 다른 클래스를 상속받기 위함, extends를 쓰면 다른 클래스를 상속받을 수 없기 때문
	long add = 0;
	String name;
	
	Threadtest2(long a, String n){
		add = a;
		name = n;
	}
	
	@Override
	public void run() {
		long all = 0;
	//스레드의 동작을 구현하는 메서드
	//오버라이딩임
		for(int i=0; i<=add; i++) {
			try {
				Thread.sleep(1000);
				// 스레드를 가져옴
				// 쉬는시간을 줘서 둘이 번갈이 가면서나옴
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			all += i;
			System.out.println(name + ":" + all);
		}
	}

	public static void main(String[] args) {
		// 메인이 스레드 1
		Threadtest1 t1 = new Threadtest2(5, "첫번째 스레드");
		Threadtest1 t2 = new Threadtest2(5, "두번째 스레드");
		// 스레드 클래스의 인스턴스, 스레드가 아님
		// 스레드 클래스를 상속받은게 아니라 인터페이스만 받음
		
		Thread tt1 = new Thread(t1);
		Thread tt2 = new Thread(t2);
		// 스레드 객체를 별도로 생성
		// 이렇게 해야 자식스레드 생성
		
		tt1.start();
		tt2.start();
		//run이라는 메서드를 호출,실행을 부탁
	}
}
*/

/*
public class Threadtest2 implements Runnable{
	// 인터페이스는 객체생성이 안됨
	
	long add = 0;
	String name;
	Threadtest2(long a, String name){
		//이름을 스레드에 저장
		add = a;
		this.name = name;
	}
	@Override
	public void run() {
		System.out.println(name +  "자식 스레드 시작");
		// 메인 스레드 시작보드 늦게 사직함
		// getName()으로 스레드의 이름을 붙여줌
		long all = 0;
	//스레드의 동작을 구현하는 메서드
	//오버라이딩임
		for(int i=0; i<=add; i++) {
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			all += i;
			System.out.println(name + ":" + all);
		}
		System.out.println(name + "자식 스레드 종료");
	}

	public static void main(String[] args) {
		// TODO Thread클래스를 상속받아 스레드를 만드는 방법
		// 메인이 부모 생성자가 자식 스레드
		System.out.println("메인 스레드 시작");
		Threadtest2 t1 = new Threadtest2(10, "first");
		Threadtest2 t2 = new Threadtest2(10, "second");
		// 새로운 객체가 스레드 2, 자식스레드
		
		Thread tt1 = new Thread(t1);
		Thread tt2 = new Thread(t2);
		// 따로 Thread객체 생성
		
		tt1.start();
		tt2.start();
		//run이라는 메서드를 호출,실행을 부탁
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
		System.out.println("메인 스레드 종료");
	}
}
*/

class Threaddemo implements Runnable{
	//Runnable을 상속받아 Thread를 만드는 방법
	String name;
	Thread t;
	
	Threaddemo(String name){
		this.name = name;
		
		t = new Thread(this);
		//스레드 객체 생성
		t.start();
	}// 생성자 생성
	
	@Override
	public void run() {
		for(int i = 0; i<5; i++) {
			System.out.println(name + ":" + i);
		}
	}
}

public class Threadtest2{
	public static void main(String[] args) {
		Threaddemo d1 = new Threaddemo("스레드1");
		Threaddemo d2 = new Threaddemo("스레드2");
		Threaddemo d3 = new Threaddemo("스레드3");
	}
}