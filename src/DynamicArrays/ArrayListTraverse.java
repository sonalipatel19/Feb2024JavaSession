package DynamicArrays;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListTraverse {

	public static void main(String[] args) {
		ArrayList<Integer> marksList = new ArrayList<Integer>();
		marksList.add(100);
		marksList.add(1200);
		marksList.add(3080);
		marksList.add(400);
		marksList.add(50);
		
		
		System.out.println(marksList);
		
		for(int i=0; i<marksList.size(); i++) {
			System.out.println(marksList.get(i));
		}
		
		System.out.println("--------------");
		for(Integer e : marksList) {
			System.out.println(e);
		}
		System.out.println("--------------");
		Collections.sort(marksList);
		System.out.println(marksList);

		System.out.println("--------------");
		Collections.sort(marksList, Collections.reverseOrder());
		System.out.println(marksList);
		
		System.out.println("--------------");
		ArrayList<String> empList = new ArrayList<String>();
		empList.add("Tom");
		empList.add("Peter");
		empList.add("Ravi");
		empList.add("Parth");
		System.out.println(empList);
		Collections.sort(empList);
		System.out.println(empList);
		
		Collections.swap(empList, 0, 1);
		System.out.println("Swap data: " + empList);
		
		
		
		
	}

}
