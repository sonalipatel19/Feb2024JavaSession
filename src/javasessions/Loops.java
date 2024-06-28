package javasessions;

public class Loops {

	public static void main(String[] args) {
		// 1. while loop
		// Print 1- 10

		int i = 1;
		while(i<=10) {
			System.out.println(i);
			
			//++i;
			//i=i+1; any of this
			
			if(i==5) {
				System.out.println("bye");
				break;
			}
			i++;
		}
		
//		while(true) {
//			System.out.println("welcome"); //infinity loop
//		}
		System.out.println("----------");
		int t=-10;
		while(t<=1) {
			System.out.println(t);
			t++;
		}
		System.out.println("=========================");
		//2. for Loop:
		//1 to 10
		
		for(int j=1;j<=10;j++) {
			System.out.println(j);
			if(j==5) {
					System.out.println("bye");
					break;
				}
		}
		System.out.println("-------------");
		for(double d=1.0;d<=5.0;d++) {
			System.out.println(d);
		}
		
		System.out.println("==================");
		for(char ch='a'; ch<='z';ch++) {
			System.out.println(ch + " = " +(int)ch);
		}
		for(char ch='A'; ch<='Z';ch++) {
			System.out.println(ch + " = " +(int)ch);
		}
		for(char ch='0'; ch<='9';ch++) {
			System.out.println(ch + " = " +(int)ch);
		}
		
		System.out.println("--------------------");
//		for(;;) {
//			System.out.println("helloooo");
//		break;
//		}
		
		for(float b=1.3f; b<=4.5;b++) {
			System.out.println(b);
		}
		
		System.out.println("=============");
		System.out.println(10>5);
		System.out.println(10!=5);
		
		//diff between for and while loop
		//while loop: number of iteration/cycle are not fixed
		//for loop: number of iteration/cycle are fixed
		
		//3. do-while loop:
		//1 to 10
		
		System.out.println("----------------");
		int x=1;
		do {
			//x++;
			System.out.println(x);
			x++;
			//break;
		}
		while(x<=10);
	}

}
