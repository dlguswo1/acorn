import java.util.Stack;

class AutoMachine{
	Stack store = new Stack();
	
	synchronized void putdrink(String drink) {
		store.push(drink);
		notify();
	}
	
	synchronized String getdrink() {
		while(store.isEmpty()) {
			try {
				wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	
	return store.pop().toString();
	}

}
class Producer extends Thread{
	private AutoMachine auto;
	
	public Producer(AutoMachine auto) {
		this.auto = auto;
	}
	
	@Override
	public void run() {
		for(int i =0; i<10; i++) {
			System.out.println(getName() + ": 음료수 No. " + i +  " 채워넣음 ");
			auto.putdrink("음료수 No." + i);
			
			try {
				sleep(100);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}

class Customer extends Thread{
private AutoMachine auto;
	
	public Customer(AutoMachine auto) {
		this.auto = auto;
	}
	
	@Override
	public void run() {
		for(int i =0; i<10; i++) {
			System.out.println(getName() + ": 음료수 No. " + i +  " 꺼내먹음 ");
			auto.getdrink();
			
			try {
				sleep(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}

public class Threadtest6 {
	public static void main(String[] args) {
		// TODO wait, notify
		
		AutoMachine auto = new AutoMachine();
		
		Producer hong = new Producer(auto);
		Customer kim = new Customer(auto);
		
		hong.start();
		kim.start();

	}

}
