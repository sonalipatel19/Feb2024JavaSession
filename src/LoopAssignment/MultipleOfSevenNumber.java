package LoopAssignment;

public class MultipleOfSevenNumber {

	public static void main(String[] args) {
		// Print 1 to 10 and break the loop once you find the multiplication of 7 with a message "bye, see you tomorrow".
		
		System.out.println("---------for loop---------");
		
		for(int i=1; i<=100; i++) {
			if(i%7==0) {
				System.out.println(i);
			}
		}
		
		System.out.println("========while loop=========");
		
		int i=1;
		while(i<=100) {
			i++;
			if(i%7==0) {
				System.out.println(i);
			}	
		}

	}

}
