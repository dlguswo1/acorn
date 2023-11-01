public class Encode{
	public static void main(String[] args){
		String msg = " X맨은 홍길동이다. ";
		String key = "axdk?*!z";
		String enc = "", dec= "";
		
		int cnt =0;
		// 메시지를 암호화한 값
		for(int i=0; i<msg.length(); i++){
			enc += (char)(msg.charAt(i)^key.charAt(cnt));
			cnt++;
			if(cnt == key.length()){
				cnt = 0;
			}
		}  //  ^ : a와 b를 XOR 처리( 두 비트가 달라야지 1 )
		   //  charAt : 글자 뽑아오기
		   
		System.out.println("암호화 된 값: "+enc);
		
		int dnt = 0;
		for(int i=0; i<key.length(); i++){
			dec += (char)(enc.charAt(i)^key.charAt(dnt));
			dnt++;
			if(dnt == key.length()){
				dnt = 0;
			}
		}
		System.out.println("복호화 된 값: " +dec);
	}
}
