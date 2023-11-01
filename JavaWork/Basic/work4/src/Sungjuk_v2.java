// 2차원 배열을 이용한 성적표
public class Sungjuk_v2{
	public static void main(String[] args){
		
		String[] names = {"홍길동", "임꺽정", "신돌석"};
		char[] grade = new char[3];
		int[][] sungjuk = {
			{1, 98, 90, 0, 0, 0}, // 학번, 국어, 영어, 총점, 평균, 학점
			{2, 76, 55, 0, 0, 0},
			{3, 85, 73, 0, 0, 0}
		};
		
		// 총점 구하기
		for (int i=0; i<sungjuk.length; i++){
			sungjuk[i][3] = sungjuk[i][1] + sungjuk[i][2];
		}
		
		// 평균 구하기
		for (int i=0; i<sungjuk.length; i++){
			sungjuk[i][4] = sungjuk[i][3] / 2;
		}
		
		// 학점 구하기
		for(int i=0; i<sungjuk.length; i++) {
			if(sungjuk[i][4]>=90)
				grade[i] = 'A';
			else if(sungjuk[i][4]>=80)
				grade[i] = 'B';
			else if(sungjuk[i][4]>=70)
				grade[i] = 'C';
			else if(sungjuk[i][4]>=60)
				grade[i] = 'D';
			else
				grade[i] = 'F';
		}
				
		
		// 등수 구하기
		
		// 출력
		System.out.println("***성적 결과***");
		System.out.println("학번\t국어\t영어\t총점\t평균\t학점");
		System.out.println("-----------------------------------------------");
		for(int i=0; i<sungjuk.length; i++) {
			System.out.println(sungjuk[i][0] + "\t" + 
				sungjuk[i][1] + "\t" + sungjuk[i][2] + "\t" 
				+ sungjuk[i][3] + "\t" + sungjuk[i][4]+ "\t"
				+ grade[i]);
		}// 정렬 전 결과표
		
		
		
		// 정렬 후 출력
		for(int row=0; row<sungjuk.length-1; row++){
			for(int col=row+1; col<sungjuk.length; col++){
				if(sungjuk[row][4] < sungjuk[col][4]){
					int[] rowTemp = sungjuk[row];
					sungjuk[row] = sungjuk[col];
					sungjuk[col] = rowTemp;
					
					char ctemp = grade[row];
					grade[row] = grade[col];
					grade[col] = ctemp;
					
					String stemp = names[row];
					names[row] = names[col];
					names[col] = stemp;
				}
			}// for(col) 종료
		}// for(row) 종료
		
		System.out.println("***성적 결과***");
		System.out.println("학번\t국어\t영어\t총점\t평균\t학점");
		System.out.println("-----------------------------------------------");
		for(int i=0; i<sungjuk.length; i++) {
			System.out.println("\t" + sungjuk[i][0] + "\t"+
				sungjuk[i][1] + "\t" + sungjuk[i][2] + "\t" 
				+ sungjuk[i][3] + "\t" + sungjuk[i][4] + "\t" 
				+ grade[i]);
		}// 정렬 후 결과표
	}
}

/* 선택정렬
for(int row=0; row<no.length-1; row++){
			for(int col=row+1; col<no.length; col++){
				if(avg[row] > avg[col]){}
			}
		}
*/