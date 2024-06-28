package SetConcept;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class HashSetConcept {

	public static void main(String[] args) {
		// can not have duplicate values
		//does not maintain the order
		// no index
		
		Set<String> browserSet = new HashSet<String>();
		browserSet.add("chrome");
		browserSet.add("firefox");
		browserSet.add("ie");
		browserSet.add("chrome");
		
		System.out.println(browserSet);
		
		//traverse:
		for(String e : browserSet) {
			System.out.println(e);
		}
		
		//iterator:
		Iterator<String> it = browserSet.iterator();
		
		while(it.hasNext()) {
			String br = it.next();
			System.out.println(br);
		}
		
		List<String> browserList  = new ArrayList<String>();
		System.out.println(browserList);
		
		
//		String b1 = it.next();
//		System.out.println(b1);
//		
//		String b2 = it.next();
//		System.out.println(b2);
			
			
		
		

	}

}
