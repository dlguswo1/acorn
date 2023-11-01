import java.util.Scanner;

interface sound{
	void soundUp(int snd);
	void soundDown(int snd);
	void mute();
	//소리 관련 메서드 생성
}

interface Power{
	void On();
	void Off();
}

class TV implements sound, Power{
	private int snd;
	private boolean power = false;
	
	@Override
	public void On() {
		if (this.power == false) {
			System.out.println("전원 on");
			this.power = true;
		}else {
			System.out.println("전원이 켜져 있습니다.");
		}
	}
	
	@Override
	public void Off() {
		if(this.power == false) {
			System.out.println("전원 꺼짐");
			this.power = true;
		}
		else {
			
		}
	}
	
	@Override
	public void soundUp(int vol) {
		
		if(this.snd>=50) {
			System.out.println("최대음량 입니다.");
		}else {
		this.snd += vol;
		System.out.println("현재 TV볼륨을 " + this.snd + "만큼 올렸습니다.");
		}
		System.out.println("볼륨 : " + this.snd);
	}
	
	@Override
	public void soundDown(int vol) {
		
		if(this.snd <= 0) {
			System.out.println("음소거 입니다.");
			this.snd = 0;
		}else {
		this.snd -= vol;
		System.out.println("현재 TV볼륨을 " + this.snd + "만큼 내렸습니다.");
		}
		System.out.println("현재 TV 볼륨 : " + this.snd);
	}
	
	@Override
	public void mute() {
		System.out.println("음소거 되었습니다.");
		this.snd = 0;
	}
}
	
	class Radio implements sound, Power{
		private int vol;
		private boolean power = false;
		
		@Override
		public void On() {
			if (this.power == false) {
				System.out.println("전원 on");
				this.power = true;
			}else {
				System.out.println("전원이 켜져 있습니다.");
			}
		}
		
		@Override
		public void Off() {
			if(this.power == true) {
				System.out.println("전원 꺼짐");
				this.power = false;
			}
			else {
				System.out.println("전원 꺼짐");
			}
		}
		
		@Override
		public void soundUp(int vol) {
			
			if(this.vol>=50) {
				System.out.println("최대음량 입니다.");
			}else {
			this.vol += vol;
			System.out.println("현재 라디오볼륨을 " + this.vol + "만큼 올렸습니다.");
			}
			System.out.println("현재 볼륨 : " + this.vol);
		}
		
		@Override
		public void soundDown(int vol) {
			
			if(this.vol <= 0) {
				System.out.println("음소거 입니다.");
				this.vol = 0;
			}else {
			this.vol -= vol;
			System.out.println("현재 라디오볼륨을 " + this.vol + "만큼 내렸습니다.");
			}
			System.out.println("현재 라디오 볼륨 : " + this.vol);
		}
		
		@Override
		public void mute() {
			System.out.println("음소거 되었습니다.");
			this.vol = 0;
		}
	}


public class Interfacetest4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		TV tv = new TV();
		Radio rd = new Radio();
		boolean On = true;
		
		System.out.println("**제품선택**");
        System.out.println("1.TV");
        System.out.println("2.RADIO");
        System.out.print("선택 : ");
        	int a1 = sc.nextInt();
        	
        	if (a1 == 1 ) {
        		System.out.println("TV 전원을 켜시겠습니까? (Y/N)");
        		char b1 = sc.next().charAt(0);
        		if ( b1 == 'y') {
	        			System.out.println("1.소리증가");
	        			System.out.println("2.소리감소");
	        			System.out.println("3.음소거");
	        			System.out.println("4.전원 끔");
	        			System.out.println("선택 : ");
	        		int c1 = sc.nextInt();
	        		if (c1 == 1) {
	        			System.out.println("증가할 볼륨 :");
	        			int volUp = sc.nextInt();
	        			tv.soundUp(volUp);
	        			
	        		}
	        		if (c1 == 2) {
	        			System.out.println("감소할 볼륨 :");
	        			int volDown = sc.nextInt();
	        			tv.soundDown(volDown);
	        			
	        		}
	        		if (c1 == 3) {
	        			tv.mute();
	        		}
	        		if (c1 == 4) {
	        			tv.Off();
	        		}
        		}
        		else {
        			tv.Off();
        		}
        	}
        	else {
        		if (a1 == 2) {
        		System.out.println("라디오 전원을 켜시겠습니까? (Y/N)");
        		char b2 = sc.next().charAt(0);
	        		if ( b2 == 'y') {
		        			System.out.println("1.소리증가");
		        			System.out.println("2.소리감소");
		        			System.out.println("3.음소거");
		        			System.out.println("4.전원 끔");
		        			System.out.println("선택 : ");
		        		int c2 = sc.nextInt();
		        		if (c2 == 1) {
		        			System.out.println("증가할 볼륨 :");
		        			int volUp = sc.nextInt();
		        			rd.soundUp(volUp);
		        			
		        		}
		        		if (c2 == 2) {
		        			System.out.println("감소할 볼륨 :");
		        			int volDown = sc.nextInt();
		        			rd.soundDown(volDown);
		        			
		        		}
		        		if (c2 == 3) {
		        			rd.mute();
		        		}
		        		if (c2 == 4) {
		        			rd.Off();
		        		}
	        		}
	        		else {
	        			
	        			rd.Off();
	        		}
        		}
        	}
	}
}


