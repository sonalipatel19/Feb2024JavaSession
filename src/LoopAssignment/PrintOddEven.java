package LoopAssignment;

public class PrintOddEven {

	public static void main(String[] args) {
		//6. Print all odd and even numbers between 1 to 100
				System.out.println("-----while loop---------------");
				
				int even=1;
				while(even<=100) {
					even++;
					if(even%2==0) {
					System.out.println(even);
					}
				}
				
				System.out.println("==========for loop=========");
				
				for(int odd=1; odd<=100; odd++) {
					if(odd%2==1) {
						System.out.println(odd);
					}
				}

	}

}
