class GenericDemo<T>{
	T value;
	// 만능타입
	public GenericDemo(T val) {
		value = val;
	}
	
	T getValue() {
		return value;
	}
} // <T>클래스에 <>을 추가해 변수의 타입을 전부 수용함

public class Generictest2 {
	public static void main(String[] args) {
		// TODO Template 기능
		
		GenericDemo<Integer> demo1 = new GenericDemo<Integer>(10);
		System.out.println(demo1.getValue());
		
		GenericDemo demo2 = new GenericDemo(3.14);
		System.out.println(demo2.getValue());
		
		GenericDemo demo3 = new GenericDemo("이것은 제너릭");
		System.out.println(demo3.getValue());

	}

}
