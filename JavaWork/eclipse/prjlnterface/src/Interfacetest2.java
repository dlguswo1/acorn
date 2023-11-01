/*
interface interf1{
	int a = 1;
}

interface interf2{
	int b = 2;
}

interface interf3{
	int c = 3;
}



public class Interfacetest2 implements interf1, interf2, interf3{
	public static void main(String[] args) {
		// TODO 인터페이스 다중 상속
		//System.out.println(interf1.a + ", " + interf2.b + ", " + interf3.c);
		System.out.println(a + ", " + b + ", " + c);
		// 다중 상속 받은 후 아래처럼 가능
	}
}
*/


/*
interface interf1{
	int a = 1;
}

interface interf2 extends interf1{
	int b = 2;
}

interface interf3 extends interf2{
	int c = 3;
}
// 인터페이스들끼리도 상속 가능 (extends)

public class Interfacetest2 implements interf3{
	public static void main(String[] args) {
		// TODO 인터페이스 다중 상속
		//System.out.println(interf1.a + ", " + interf2.b + ", " + interf3.c);
		System.out.println(a + ", " + b + ", " + c);
		// 다중 상속 받은 후 아래처럼 가능
	}
}
*/


interface interf1{
	int a = 1;
}

interface interf2{
	int b = 2;
}

interface interf3 extends interf1, interf2{
	int c = 3;
}
// 인터페이스들끼리도 상속 가능 (extends)

public class Interfacetest2 implements interf3{
	public static void main(String[] args) {
		// TODO 인터페이스 다중 상속
		//System.out.println(interf1.a + ", " + interf2.b + ", " + interf3.c);
		System.out.println(a + ", " + b + ", " + c);
		// 다중 상속 받은 후 아래처럼 가능
	}
}