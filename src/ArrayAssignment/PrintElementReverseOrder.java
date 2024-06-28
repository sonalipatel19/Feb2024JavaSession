package ArrayAssignment;

public class PrintElementReverseOrder {

	public static void main(String[] args) {
		// Q4: Print all the elements of this array in reverse order using for, for each, while and do-while loop:

		int p[] = {1,3,4,5,22,56,89,90};
		
		System.out.println("---for loop----------");
		
		for(int i=p.length-1; i>0;i--) {
			System.out.println(p[i]);
		}
		
		System.out.println("--------- for each loop------------");
		// in for each loop reverse order is not possible
		
		System.out.println("--------while loop---------------");
		
		int i= p.length-1;
		while(i>-1) {
			System.out.println(p[i]);
			i--;
		}
		
		System.out.println("----------do while loop-------------");
		int j= p.length-1;
		do {
			System.out.println(p[j]);
			j--;
		}
		while(j>-1);
	}

}
