package LoopAssignment;

public class PrintASCIIValues {

	public static void main(String[] args) {
		//7. What will be the output of this program:
//		int i = 1;
//		while(i<=1){
//		System.out.println("Hi Java"); // infinity
//		}
		
		//8. Print A-Z , a-z, 0-9 with  the respective ASCII numbers the console one using while and for loop.
		
		System.out.println("-------for loop--------");
		for(char ch='a'; ch<='z'; ch++) {
			System.out.println(ch + "=" +(byte)ch );
		}
		for(char ch='A'; ch<='Z'; ch++) {
			System.out.println(ch + "=" +(byte)ch );
		}
		for(char ch='0'; ch<='9'; ch++) {
			System.out.println(ch + "=" +(byte)ch );
		}
		
		System.out.println("=======while loop========");
		
		char ch='a';
		while(ch<='z') {
			System.out.println(ch + "=" +(byte)ch);
			ch++;
		}
		
		char ch1='A';
		while(ch1<='Z') {
			System.out.println(ch1 + "=" +(byte)ch1);
			ch1++;
		}
		
		char ch2='0';
		while(ch2<='9') {
			System.out.println(ch2 + "=" +(byte)ch2);
			ch2++;
		}

	}

}
