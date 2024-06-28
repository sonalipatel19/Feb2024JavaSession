package HashMapConcept;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class HashMapTest {

	public static void main(String[] args) {
		Map<String, String> empMap = new HashMap<String, String>();//VC=15
		
		//Map<String, String> empMap = new LinkedHashMap<String, String>();//VC=15
		//Map<String, String> empMap = new TreeMap<String, String>();//VC=15
		
		empMap.put("Tom", "QA");
		empMap.put("Peter", "SDET");
		empMap.put("Lisa", "Dev");
		empMap.put("Ravi", null);
		empMap.put("Ravi", "Manager");
		empMap.put("Arti", "Fresher");
		empMap.put("aakash", "Fresher");
		empMap.put("1test", "Fresher");
		
		// K-V : KeySet(EntrySet)
		for(Map.Entry<String, String> entry : empMap.entrySet()) {
			System.out.println(entry.getKey() + ":" + entry.getValue());
		}
		
		//forEach method using lambda:
		
		empMap.forEach((k,v) -> System.out.println(k + ":" + v));;
		
		
		
		
		
		//empMap.put(null, "Fresher");//null is not allowed in TreeMap it will give NPE.
		
		System.out.println(empMap.get("Lisa"));
		
		System.out.println(empMap);
		
		
		

	}

}
