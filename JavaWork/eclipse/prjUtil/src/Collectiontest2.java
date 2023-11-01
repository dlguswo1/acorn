import java.util.ArrayList;

public class Collectiontest2 {

	public static void main(String[] args) {
		// TODO List계열의 클래스들
		
		
		ArrayList list = new ArrayList();
		list.add("carrie");
		list.add("kairo");
		list.add("kabin");
		list.add("kairo");
		list.add("terry");
		
		System.out.println("데이터 개수 :" + list.size());
		System.out.println(list);
		
		for(int i=0; i<list.size(); i++) {
			System.out.println(list.get(i));
			// 깨내올 수 있음
		}
		
		if(list.contains("kairo")) {
			System.out.println("찾았다.");
			System.out.println(list.indexOf("kairo") + "번째있다.");
		}
		else {
			System.out.println("못찾았다.");
		}
		
		list.add(2, 100);
		System.out.println(list);
		
		list.remove(3);
		System.out.println(list);
	}
}
