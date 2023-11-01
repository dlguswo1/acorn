/*
public class Callbytest1 {
	void display(int a,int b,int c,int d,int e) {
		System.out.println(a +", "+ b + ", "+ c +", "+ d +", "+ e);
	}
	
	public static void main(String[] args) {
		// TODO 값과 참조에 의한 전달1
		int a=4, b=7, c=15, d=80, e=9;
		
		Callbytest1 call = new Callbytest1();
		call.display(a,b,c,d,e);
	}
}
*/

/*
//배열을 이용하는 방법
public class Callbytest1 {
	void display(int [] arr) {
		for(int a : arr) {
			System.out.println(a);
		}
	}
	
	public static void main(String[] args) {
		// TODO 값과 참조에 의한 전달1
		int arr[] = {4, 7, 15, 80, 9};
		
		Callbytest1 call = new Callbytest1();
		call.display(arr);
	}
}
*/

/*
// 인스턴스 변수를 이용하는 방법
public class Callbytest1 {
	int a=4, b=7, c=15, d=80, e=9;
	// 밖에서 선언해서 공유함 안에서 선언 안해서 바로 출력하면 됨
	void display() {
		System.out.println(this.a +", "+ b + ", "+ c +", "+ d +", "+ e);
	}
	
	public static void main(String[] args) {
		// TODO 값과 참조에 의한 전달1
		Callbytest1 call = new Callbytest1();
		call.display();
	}
}
*/

/*
public class Callbytest1 {
	void display(Argdata data) {
		System.out.println(data.i +", "+ data.d +
				", "+ data.c +", "+ data.b +", "+ data.s);
	}
	
	public static void main(String[] args) {
		// TODO 값과 참조에 의한 전달1
		Argdata data = new Argdata();
		
		
		Callbytest1 call = new Callbytest1();
		call.display(data);
	}
}
*/


//3. 데이터 타입이 다른 참조 전달

/*
public class Callbytest1 {
	void display(int i, double d, char c, boolean b, String s) {
		System.out.println 
		(
		i + ", " + d + ", " + c + ", " + b + ", " + s
		);
	}
	
public static void main(String[] args) {
	// TODO 값과 참조에 의한 전달 테스트 1
	int i=4;
	double d=3.14;
	char c='가';
	boolean b =true;
	String s="홍길동";
		
	Callbytest1 call = new Calbytest1();
	call.display(i, d, c, b, s);
	}
}
*/

// 예제 1

class Argdata{
	int i=4;
	double d=3.14;
	char c = '가';
	boolean b = true;
	String s = "홍길동";
}

public class Callbytest1 {
void intdisplay(int a) {
   System.out.println(a);
}

void doubledisplay(double b) {
   System.out.println(b);
}

void chardisplay(char c) {
   System.out.println(c);
}

void booleandisplay(boolean d) {
   System.out.println(d);
}

void Stringdisplay(String e) {
   System.out.println(e);
}

	public static void main(String[] args) {
	
	   int a = 4;
	   double b=3.14;
	   char c = '가';
	   boolean d = true;
	   String e = "홍길동";
	   
	   Callbytest1 call = new Callbytest1();
	   call.intdisplay(a);
	   call.doubledisplay(b);
	   call.chardisplay(c);
	   call.booleandisplay(d);
	   call.Stringdisplay(e);
	}
}
