// 클래스 이용한 성적표
class Student{
	String name;
	int no;
	int kor;
	int eng;
	int tot;
	int avg;
	int rank;
	char grade;
	
	Student(String name, int no, int kor, int eng){
		this.name = name;
		this.no = no;
		this.kor = kor;
		this.eng = eng;
	}
}

public class Sungjuk_v3{
	public static void main(String[] args){
		Student[] st = new Student[3];
		st[0] = new Student("홍길동", 1, 98, 90);
		st[1] = new Student("임꺽정", 2, 73, 55);
		st[2] = new Student("신돌석", 3, 85, 73);
		
		// 총점 구하기
		for (int i=0; i<st.length; i++){
			st[i].tot = st[i].kor + st[i].eng;
		}
		
		// 평균 구하기
		for (int i=0; i<st.length; i++){
			st[i].avg = st[i].tot / 2;
		}
		
		// 학점 구하기
		for(int i=0; i<st.length; i++) {
			if(st[i].avg>=90)
				st[i].grade = 'A';
			else if(st[i].avg>=80)
				st[i].grade = 'B';
			else if(st[i].avg>=70)
				st[i].grade = 'C';
			else if(st[i].avg>=60)
				st[i].grade = 'D';
			else
				st[i].grade = 'F';
		}
				
		
		// 등수 구하기
		
		// 출력
		System.out.println("***성적 결과***");
		System.out.println("학번\t국어\t영어\t총점\t평균\t학점");
		System.out.println("-----------------------------------------------");
		for(int i=0; i<st.length; i++) {
			System.out.println(st[i].no + "\t\t" + 
				st[i].kor + "\t" + st[i].eng + "\t" 
				+ st[i].tot + "\t" + st[i].avg+ "\t"
				+ st[i].grade);
		}// 정렬 전 결과표
		
		
		
		// 정렬 후 출력
		for(int row=0; row<st.length-1; row++){
			for(int col=row+1; col<st.length; col++){
				if(st[row].avg < st[col].avg){
					Student temp = st[row];
					st[row] = st[col];
					st[col] = temp;
				}
			}// for(col) 종료
		}// for(row) 종료
		
		System.out.println("***성적 결과***");
		System.out.println("학번\t국어\t영어\t총점\t평균\t학점");
		System.out.println("-----------------------------------------------");
		for(int i=0; i<st.length; i++) {
			System.out.println(st[i].no + "\t\t" + 
				st[i].kor + "\t" + st[i].eng + "\t" 
				+ st[i].tot + "\t" + st[i].avg+ "\t"
				+ st[i].grade);
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

/*
// 성적 입력하여 출력하기

class Student{
	String name;
	int age;
	int kor;
	int eng;
	int tot;
	int avg;
	int rank;
	char grade;
}



public class Sungjuk_v4 {
	public static void main(String[] args) {
		java.util.Scanner scan = new java.util.Scanner(System.in);
		Student[] sungjuk = new Student[3];
		sungjuk[0] = new Student(); 
		sungjuk[1] = new Student();
		sungjuk[2] = new Student();
		
		for(int i=0; i<3; i++){
			
			//정보 입력
			System.out.print("이름 입력: ");
			String name = scan.next();
			sungjuk[i].name = (String)name;
					
			System.out.print("나이 입력: ");
			int age = scan.nextInt();
			sungjuk[i].age = age;
					
			System.out.print("국어 점수 입력: ");
			double kor = scan.nextDouble();
			sungjuk[i].kor = (int)kor;
			
			System.out.print("영어 점수 입력: ");
			double eng = scan.nextDouble();
			sungjuk[i].eng = (int)eng;
			
			//점수 합계 계산
			int tot = (int)kor + (int)eng;
			sungjuk[i].tot = tot;
			
			//점수 평균 계산
			int avg = tot / 2;
			sungjuk[i].avg = avg;
			
			//학점 계산
			if(sungjuk[i].avg >= 90){
				sungjuk[i].grade = 'A';
			} else if(sungjuk[i].avg >= 80){
				sungjuk[i].grade = 'B';
			} else if(sungjuk[i].avg >= 70){
				sungjuk[i].grade = 'C';
			} else if(sungjuk[i].avg >= 60){
				sungjuk[i].grade = 'D';
			} else {sungjuk[i].avg = 'F';}
			
		}
		
		
		
		
		for(int row=0; row <sungjuk.length-1; row++){
			for(int col=row+1; col<sungjuk.length; col++){
				if(sungjuk[row].avg < sungjuk[col].avg){
					Student temp = sungjuk[row];
					sungjuk[row] = sungjuk[col];
					sungjuk[col] = temp;
										
				}
			} 
		} 
		
		
		
		System.out.println("***성적 결과***");
		System.out.println("이름\t나이\t국어\t영어\t총점\t평균\t학점");
		System.out.println("-----------------------------------------------");
		for(int i=0; i<sungjuk.length; i++) {
			System.out.println(sungjuk[i].name + "\t" + sungjuk[i].age + "\t"
				+ sungjuk[i].kor + "\t" + sungjuk[i].eng + "\t" +
				sungjuk[i].tot + "\t" + sungjuk[i].avg + "\t" + sungjuk[i].grade);
		}
		
	}
}
*/