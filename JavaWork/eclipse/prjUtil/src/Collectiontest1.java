import java.util.HashSet;
import java.util.Iterator;
import java.util.TreeSet;

public class Collectiontest1 {

	public static void main(String[] args) {
		// TODO  Set계열의 클래스들
		HashSet set = new HashSet();
		
		set.add("carrie");
		set.add("kabin");
		set.add("kairo");
		set.add("kairo");
		set.add("kariss");
		System.out.println("데이터 개수 :" + set.size());
		// 중복은 하나로 묶음
		System.out.println(set);
		// 순서 상관 없이 저장만함
		
		Iterator it = set.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
			// 1개씩 꺼내옴
		}
		
		TreeSet tree = new TreeSet();
		tree.add("juliet");
		tree.add("terry");
		tree.add("kabin");
		tree.add("terry");
		tree.add("carrie");
		
		System.out.println("데이터 개수 :" + tree.size());
		System.out.println(tree);
		
	}
}
