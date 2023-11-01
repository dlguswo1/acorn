public class PhoneBook{
	public static void main(String[] args) {
		
		/*
		java PhoneBook 홍길동
		사용법 : java PhoneBook 사람이름
		java PhoneBook 홍길동
		홍길동 111-1111 서울시 강남구
		---------------------------------
		String data[ ][ ] = {
		{"홍길동", "111-1111", "서울시 강남구"}
		{"임꺽정", "222-2222", "서울시 종로구"},
		{"신사임당", "333-3333", "서울시 도봉구"}}
		*/
		
		String data[][] = {
			{"홍길동", "111-1111", "서울시 강남구"},
			{"임꺽정", "222-2222", "서울시 종로구"},
			{"신사임당", "333-3333", "서울시 도봉구"}
		};
		
		System.out.println(data[0][0]);
		
		for(int i=0; i < data.length; i++){
			if(args[0].equals(data[i][0])){
			System.out.print(data[0][i]+ " ");
			} else if(args[0].equals(data[i][1])){
				System.out.print(data[1][i]+" ");
			} else if(args[0].equals(data[i][2])){
				System.out.print(data[2][i]+" ");
			} else {
				System.out.println("사용법 : java PhoneBook 사람이름");
			} break;
		}
	}
}