package LoopAssignment;

public class PrintReverseNumber {

	public static void main(String[] args) {
		//3. WAP to print 10 to 1 using for, while and do-while loop

				System.out.println("======for loop==============");
				
				for(int k=10; k>=1; k--)
					System.out.println(k);
				
				System.out.println("----------while loop-----------");
				
				int k=10;
				while(k>=1) {
					System.out.println(k);
					k--;
				}
				
				System.out.println("-----------do while loop----------");
				
				int k1=10;
				do{
					System.out.println(k1);
					k1--;
				}
				while(k1>=1);

	}

}
