package mapInterFace;

import java.util.Collection;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class mapMethods {

	public static void main(String[] args) {
		
		HashMap<Object, Object> hashmap = new HashMap<Object,Object>();
		hashmap.put(1, "IronMan");
		hashmap.put(2, "Vision");
		hashmap.put(3, "Thor");
		hashmap.put(4, "Captain America");
		hashmap.put(5, "Captain Marvel");
		hashmap.put(6, "Falcon");
		
		Map<Object, Object> hashmapDuplicate = new HashMap<Object,Object>();
		hashmapDuplicate.putAll(hashmap);
		System.out.println(hashmapDuplicate);
		hashmapDuplicate.put(7, "Panneer");
		System.out.println(hashmap.equals(hashmapDuplicate));
		
		System.out.println(hashmap.putIfAbsent(2, "Batman"));
		
		hashmap.remove(2);
		
		System.out.println(hashmap);
		
		boolean remove = hashmap.remove(3, "Thor");
		System.out.println(remove);
		System.out.println(hashmap);
		
		Set<Object> keySet = hashmap.keySet();
		System.out.println(keySet);
		Set<Object> keySet2 = hashmapDuplicate.keySet();
		System.out.println(keySet2);
		
		hashmap.clear();
		
		System.out.println(hashmap);
		
		boolean containsKey = hashmapDuplicate.containsKey(10);
		System.out.println(containsKey);
		
		boolean containsValue = hashmapDuplicate.containsValue("Thor");
		System.out.println(containsValue);
		
		Object object = hashmapDuplicate.get(7);
		System.out.println(object);
		
		Object orDefault = hashmapDuplicate.getOrDefault(8, "RockStar");
		System.out.println(orDefault);
		
		System.out.println(hashmap.isEmpty());
		
		Object replace = hashmapDuplicate.replace(7, "Panneer Selvam");
		System.out.println("replace"+replace);
		System.out.println(hashmapDuplicate);
		
		boolean replaceTF = hashmapDuplicate.replace(7, "Panneer Selvam", "Hari Prasad");
		System.out.println(replaceTF);
		
		System.out.println(hashmapDuplicate);
		
		Collection<Object> values = hashmapDuplicate.values();
		
		System.out.println(values);
		
		int size = hashmapDuplicate.size();
		
		System.out.println(size);
		
		float size2 = hashmap.size();
		
		System.out.println(size);
		
		Set<Entry<Object, Object>> entrySet = hashmapDuplicate.entrySet();
		Iterator<Entry<Object, Object>> iterator = entrySet.iterator();
		for (Entry<Object, Object> entry : entrySet) {
			System.out.println(entry.getKey());
			System.out.println(entry.getValue());
			
			
		}
		
		System.out.println(entrySet);
	/*	hashmap.entrySet()  
	      //Returns a sequential Stream with this collection as its source  
	      .stream()  
	      //Sorted according to the provided Comparator  
	      .sorted(Map.Entry.comparingByKey(Comparator.reverseOrder()))  
	      //Performs an action for each element of this stream  
	      .forEach(System.out::println);*/  

	}
}
