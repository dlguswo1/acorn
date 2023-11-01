import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class Collectiontest3 {

	public static void main(String[] args) {
		// TODO Map
		HashMap map = new HashMap();
		map.put("k1" , "홍길동");
		map.put("k2" , "임꺽정");
		map.put("k3" , "유비");
		map.put("k4", "관우");
		map.put("k5" , "장비");
		
		System.out.println("데이터 개수 : " + map.size());
		System.out.println(map);
		
		System.out.println(map.get("k2"));
		
		Set set = map.keySet();
		Iterator it = set.iterator();
		while(it.hasNext()) {
			String key = (String)it.next();
			//부모는 자식에게 참조 가능함
			// 부모인 Object 는 String에 참조할 수 있기 때문에 (String)으로 문자열로 표현할 수 있다.
			System.out.println(key);
			System.out.println(map.get(key));
		}
	}
}
