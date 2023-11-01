/*
class Stopdemo implements Runnable{
	@Override
	public void run() {
		try {
			while(true) {
				System.out.println("Thread is alive...");
				Thread.sleep(500);
			}
		}
		catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally {
			System.out.println("Thread is dead ...");
		}	
	}
}
public class Threadtest3 {

	public static void main(String[] args) throws InterruptedException{
		// 스레드의 강제 종료
		Stopdemo demo =new Stopdemo();
		Thread t = new Thread(demo);
		t.start();
		
		Thread.sleep(5000);
		
		t.stop();
	}
}
*/

/*
class Stopdemo implements Runnable{
	@Override
	public void run() {
		try {
			while(true) {
				System.out.println("Thread is alive...");
				Thread.sleep(500);
			}
		}
		catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally {
			System.out.println("Thread is dead ...");
		}	
	}
}
public class Threadtest3 {

	public static void main(String[] args) throws InterruptedException{
		// 스레드의 강제 종료
		Stopdemo demo =new Stopdemo();
		Thread t = new Thread(demo);
		t.start();
		
		Thread.sleep(5000);
		
		t.interrupt();
	}
}
*/


class Stopdemo implements Runnable{
	private boolean stopped = false;
	
	void off() {
		stopped = true;
	}
	@Override
	public void run() {
		try {
			while(!stopped) {
				System.out.println("Thread is alive...");
				Thread.sleep(500);
			}
		}
		catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally {
			System.out.println("Thread is dead ...");
		}	
	}
}
public class Threadtest3 {

	public static void main(String[] args) throws InterruptedException{
		// 스레드의 강제 종료
		Stopdemo demo =new Stopdemo();
		Thread t = new Thread(demo);
		t.start();
		
		Thread.sleep(5000);
		
		demo.off();
	}
}

