interface volume{
	void volumeup(int vol);
	void volumedown(int vol);
	//소리 관련 메서드 생성
}

class tvi implements volume{
	private int vol;
	
	@Override
	public void volumeup(int vol) {
		this.vol += vol;
		System.out.println("현재 TV볼륨을 " + this.vol + "만큼 올렸습니다.");
	}
	
	@Override
	public void volumedown(int vol) {
		this.vol -= vol;
		System.out.println("현재 TV볼륨을 " + this.vol + "만큼 내렸습니다.");
	}
	
}

class radi implements volume{
	private int vol;
	
	@Override
	public void volumeup(int vol) {
		this.vol += vol;
		System.out.println("현재 라디오 볼륨을 " + this.vol + "만큼 올렸습니다.");
	}
	
	@Override
	public void volumedown(int vol) {
		this.vol -= vol;
		System.out.println("현재 라디오 볼륨을 " + this.vol + "만큼 내렸습니다.");
	}
}


public class Interfacetest3 {
	public static void main(String[] args) {
		// TODO 인터페이스 응용 프로그램
		/*
		* 1. Power 인터페이스를 작성하여 오버라이딩 한다.
		* 2. 소리를 높일 때 50이상 넘지 않게 한다.
		* 3. 소리를 낮출 때 0미만으로 줄일 수 없게 한다.(0은 뮤트 기능)
		* 4. 소리를 높이거나 줄일 때 반드시 전원이 켜저 있을 때에만 가능하게 한다.
		* 
		*  **** 실행 예시
		*  제품 선택
		*  1. tvi
		*  2. radio
		*  선택 :__
		*  
		*  tvi의 전원을 켜시겟습니까(Y/N)
		*  전원이 켜저 있다면 
		*  1. 소리증가
		*  2. 소리감소
		*  3. mute
		*  선택 :__
		*  
		*  radio의 전원을 켜시겟습니까(Y/N)
		*  전원이 켜저 있다면 
		*  1. 소리증가
		*  2. 소리감소
		*  3. mute
		*  선택 :__
		*/
	}
}
