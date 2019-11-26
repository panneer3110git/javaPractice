package mapInterFace;

import java.util.HashMap;

public class HashMapLearn {

	public static void main(String[] args) {
		HashMap<Object, Object> hashmap = new HashMap<Object, Object>();
		Object put = hashmap.put(1, "IronMan");
		System.out.println(put);
		
		Object put2 = hashmap.put(1, "Alpha");
		System.out.println(put2);
		
		Object putIfAbsent = hashmap.putIfAbsent(1, "Thor");
		System.out.println(putIfAbsent);
		
		System.out.println(hashmap.isEmpty());
		
		Object clone = hashmap.clone();
		System.out.println(clone);
		
	}

}
