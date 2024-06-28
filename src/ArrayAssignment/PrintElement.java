package ArrayAssignment;

public class PrintElement {

	public static void main(String[] args) {
		// Q3: Print all the elements of this array using for, for each, while and do-while loop:

		int p[] = {1,3,4,5,22,56,89,90};
		
		for(int i=0; i<p.length; i++) {
			System.out.println(p[i]);
		}
		
		System.out.println("----------for each loop----------");
		
		for(int e: p) {
			System.out.println(e);
		}

		System.out.println("-------- while loop------------");
		
		int i = 0;
		while(i<p.length) {
			System.out.println(p[i]);
			i++;
		}
		
		System.out.println("--------- do while loop-------------");
		
		int j=0;
		do {
			System.out.println(p[j]);
			j++;
		} 
		while(j<p.length);
	}

}
