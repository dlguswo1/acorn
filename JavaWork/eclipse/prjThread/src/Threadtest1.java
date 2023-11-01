/*
public class Threadtest1 {
	long add = 0;
	
	Threadtest1(long a){
		add = a;
	}

	public static void main(String[] args) {
		Threadtest1 t = new Threadtest1(100);
		long all= 0;
		
		for(int i=0; i<=t.add; i++) {
			all += i;
			System.out.println(all);
		}
	}
}
*/

/*
public class Threadtest1 extends Thread{
	// Threadtest1이 스레드
	long add = 0;
	String name;
	
	Threadtest1(long a, String n){
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
				sleep(500);
				// 쉬는시간을 줘서 둘이 번갈이 가면서나옴
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			all += i;
			System.out.println(name + ":" + all);
		}
	}

	public static void main(String[] args) {
		// 메인이 부모 생성자가 자식 스레드
		Threadtest1 t1 = new Threadtest1(5, "첫번째 스레드");
		Threadtest1 t2 = new Threadtest1(5, "두번째 스레드");
		// 새로운 객체가 스레드 2
		// 새로운 객체가 스레드 3
		t1.start();
		t2.start();
		//run이라는 메서드를 호출,실행을 부탁
	}
}
*/


public class Threadtest1 extends Thread{
	// Threadtest1이 스레드
	long add = 0;
	
	Threadtest1(long a, String name){
		super(name);
		//이름을 스레드에 저장
		add = a;
	}
	@Override
	public void run() {
		System.out.println(getName() + "자식 스레드 시작");
		// 메인 스레드 시작보드 늦게 사직함
		// getName()으로 스레드의 이름을 붙여줌
		long all = 0;
	//스레드의 동작을 구현하는 메서드
	//오버라이딩임
		for(int i=0; i<=add; i++) {
			try {
				sleep(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			all += i;
			System.out.println(getName() + ":" + all);
		}
		System.out.println(getName() + "자식 스레드 종료");
	}

	public static void main(String[] args) {
		// TODO Thread클래스를 상속받아 스레드를 만드는 방법
		// 메인이 부모 생성자가 자식 스레드
		System.out.println("메인 스레드 시작");
		Threadtest1 t1 = new Threadtest1(10, "first");
		Threadtest1 t2 = new Threadtest1(10, "second");
		// 새로운 객체가 스레드 2, 자식스레드
		t1.start();
		t2.start();
		//run이라는 메서드를 호출,실행을 부탁
		for(int i = 0; i<10; i++) {
			try {
				sleep(100);
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
