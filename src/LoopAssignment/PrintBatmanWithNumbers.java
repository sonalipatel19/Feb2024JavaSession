package LoopAssignment;

public class PrintBatmanWithNumbers {

	public static void main(String[] args) {
		//2. WAP to print following output: I am Batman 1(upto 9)
		
				System.out.println("========for loop==========");
				for(int j=1; j<=9; j++)
					System.out.println("I am Batman " + j);
				
				
				System.out.println("---------while loop--------");
				
				int j=1;
				while(j<=9) {
					System.out.println("I am Batman " + j);
					j++;
				}

	}

}
