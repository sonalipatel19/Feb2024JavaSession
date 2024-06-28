package HashMapConcept;

import java.util.HashMap;

public class Employee {

	public static void main(String[] args) {
		
		HashMap<String, String> studentMap = new HashMap<String, String>();
		
		studentMap.put("Tom", "A");
		studentMap.put("Peter", "B");
		studentMap.put("Lisa", "A++");
		studentMap.put("Ravi", null);
		studentMap.put("Ravi", "C++");
		studentMap.put("Arti", null);
		studentMap.put("Ekta", null);
		studentMap.put(null, "Z");
		studentMap.put(null, "Z++");
		
		
		System.out.println(studentMap);
		System.out.println(studentMap.get("Tom"));
		System.out.println(studentMap.get(null));
		System.out.println(studentMap.size());
		
		HashMap<String, Integer> empMap = new HashMap<String, Integer>();
		empMap.put("Tom", 1000);
		empMap.put("Peter", 2000);
		empMap.put("Lisa", 3000);
		empMap.put("Ravi", 4000);
		
		System.out.println(empMap.get("Ravi"));
		System.out.println(empMap);
		
		HashMap<Integer, Integer> mp = new HashMap<Integer, Integer>();
		mp.put(101, 1000);
		mp.put(102, 2000);
		mp.put(103, 3000);
		mp.put(104, 4000);
		mp.put(null, 4000);
		
		System.out.println(mp);
		
		HashMap<String, Object> obj = new HashMap<String, Object>();
		obj.put("Tom", 1000);
		obj.put("Peter", "SDET");
		
		System.out.println(obj);
	}

}
