package LoopAssignment;

public class PrintBatman {

	public static void main(String[] args) {
		// 1. WAP to print following output: I am Batman(5 times)

				for(int i=1; i<=5; i++)
					System.out.println("I am Batman");
				
				System.out.println("------Using While Loop--------");
				
				int i=1;
				while(i<=5) {
					System.out.println("I am Batman");
					i++;
				}

	}

}
