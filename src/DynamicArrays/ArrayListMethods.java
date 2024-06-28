package DynamicArrays;

import java.util.ArrayList;

public class ArrayListMethods {

	public static void main(String[] args) {
		ArrayList<Integer> marksList = new ArrayList<Integer>();
		marksList.add(100);
		marksList.add(1200);
		marksList.add(3080);
		marksList.add(400);
		marksList.add(50);
		
		System.out.println(marksList);
		
//		marksList.remove(2);
//		System.out.println(marksList.get(2));
//		marksList.remove(0);
//		System.out.println(marksList);
		
		marksList.add(47);
		System.out.println(marksList);
		
		marksList.add(1, 2500);
		System.out.println(marksList);
		System.out.println(marksList.size());
		
		marksList.add(7, 4500);// IOBE
		System.out.println(marksList);
		
		ArrayList<Object> empData = new ArrayList<Object>();
		empData.add("Tom");
		empData.add(30);
		empData.add('m');
		empData.add(12.33);
		empData.add(true);
		
		System.out.println(empData);
//		empData.add(0, "Naveen");
//		System.out.println(empData);
		
		empData.add(empData.size(), "Google");
		System.out.println(empData);
		
		empData.set(0, "Naveen");// set() used to replace the data and it will not reduce the size of the data
		System.out.println(empData);
		
		empData.remove(0);// remove method will remove the data and reduce the size of the data
		System.out.println(empData);

	}

}
