import java.util.Vector;

public class Generictest1 {
	public static void main(String[] args) {
		// TODO Generictest1
		
		Vector<String> v = new Vector<String>();
		v.add("hello");
		v.add("world");
		v.add("홍길동");
		
		// 들어가있는 변수타입은 문자열이 아니라 오브젝트형
		//...
		//v.add(100);
		
		/*
		String str = null;
		for(int i=0; i<v.size(); i++) {
			str = (String)v.get(i);
			System.out.println(str);
		}
		*/
		
		for(String str : v) 
			System.out.println(str);
	}
}