package DynamicArrays;

import java.util.ArrayList;

public class ArrayListConcept {

	public static void main(String[] args) {
		
		//ArrayList: default/inbuilt class: dynamic array
		
		ArrayList ar = new ArrayList();
		System.out.println(ar.size());//0
		
		ar.add(100);
		ar.add(200);
		
		System.out.println(ar.size());//2
		
		ar.add(300);
		ar.add(400);
		
		System.out.println(ar.size());//4
		
		ar.add(500);
		ar.add(600);
		
		System.out.println(ar.size());//6
		ar.add(700);
		
		System.out.println(ar.get(0));
		System.out.println(ar.get(5));
		System.out.println(ar.get(6));
		
		ArrayList ar1 = new ArrayList(5);//vc=5, pc=0
		System.out.println(ar1.size());
	}

}
