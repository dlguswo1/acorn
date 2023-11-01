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
		   
		System.out.println("암호화 된 값: " +enc);
		
		for(int i=0; i<key.length(); i++){
			dec += (char)(key.charAt(i)^msg.charAt(cnt));
			cnt++;
			if(cnt == msg.length()){
				cnt = 0;
			}
		}
		System.out.println("암호화 된 값: " +dec);
	}
}



public class Encode {
    public static String cryptMsg(String msg) {
        String key = "axdk?*!z";

        char[] msgChar = msg.toCharArray();
        char[] keyChar = key.toCharArray();
        char[] msgCryptedChar = new char[msgChar.length];

        for (int i = 0; i < msgChar.length; i++) {
            msgCryptedChar[i] = (char) (msgChar[i] ^ keyChar[i % keyChar.length]);
        }
        String msgCrypted = String.valueOf(msgCryptedChar);
        System.out.println(msgCrypted);
        return msgCrypted;
    }

    public static void main(String[] args) {
        String msg = "X맨은 홍길동이다.";

        // 메시지를 암호화한 값
        String msgEncrypted = cryptMsg(msg);

        // 메시지를 복호화한 값
        String msgDecrypted = cryptMsg(msgEncrypted);
    }
}
