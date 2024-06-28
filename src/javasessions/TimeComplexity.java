package javasessions;

public class TimeComplexity {

	public static void main(String[] args) {
		//TC -- BIG O --> O
		
		int i=10;
		//O(1) -- Constant time
		
		System.out.println(i); //O(1)
		
		for(int k=1;k<=10;k++) {
			System.out.println(k);//O(n)
		}
		//1+n+n+n -->3n+1--> 3n --> Linear Equation
		//n ==> O(n)
		
		int p=1;
		while(p<=10) {
			System.out.println(p);
			p++;
			System.out.println("hello world");
		}
		//1+n+n+n+n -->4n+1 => 4n => O(n)
		
		for(int l=1; l<=10; l++) {
			System.out.println(l);
			if(l==5) {
				System.out.println("bye");
				break;
			}
		}
		
		for(int x=1;x<=5;x++) {
			for(int y=1; y<=5;y++) {
				System.out.println(x+ ""+y);
			}
		}
		//(1+n+n)(1+n+n+n)==> (1+2n)(1+3n)-> 1+3n+2n+6n^2 --> 6n^2+5n+1 --> Quadratic equation
		//6n^2+5n+1==> 6n^2+5n--> n(6n+5)--> O(n^2)
		
		for(int x=1;x<=5;x++) {
			for(int y=1; y<=5;y++) {
				for(int z=1; z<=5; z++) {
					System.out.println(x+ ""+y+z);
				}
			}
		}
		//(1+n+n)(1+n+n)(1+n+n+n)==> (1+2n)(1+2n)(1+3n)-> 1+4n+4n^2(1+3n)-> 1+7n+12n^2+4n^2+12n^3-> 1+7n+16n^2+12n^3 --> cubic equation
		//1+7n+16n^2+12n^3==> 7n+16n^2+12n^3-> n(7+16n+12n^2)-> n^2(16+12n)-> n^3(12)-> O(n^3)
		
		int s=1;
		while(s<=5) {
			for(int u=1;u<=5;u++) {
				System.out.println(u);
			}
			s++;
		}
		//(1+n+n)(1+n+n+n)==> O(n^2)
		
		//O(log n)
		//50 --> 50/2
		//k = n/2
		//log k = log(n/2)
		//log k = log n - log 2
		//log k = log n - 1
		//log k = log n
	}

}
