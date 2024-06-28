package LoopAssignment;

public class PrintTableOf5 {

	public static void main(String[] args) {

		//5. Write a program in Java to print all the multiplication of 5 from 1 to 100 using while /for/do-while loop
		
		System.out.println("---------for loop----------");
		
		for(int m=1; m<=100; m++) {
			if(m%5==0) {
				System.out.println(m);
			}
		}
		
		System.out.println("=========while loop===========");
		
		int num =1;
		while(num<=100) {
			num++;
			if(num%5==0) {
				System.out.println(num);
			}
		}
		
		System.out.println("----------do while loop----------");
		int num1 = 1;
		do {
			num1++;
			if(num1%5==0) {
			System.out.println(num1);
			
			}
		}
		while(num1<=100);
		

	}

}
