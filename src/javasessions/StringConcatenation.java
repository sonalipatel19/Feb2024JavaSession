package javasessions;

public class StringConcatenation {

	public static void main(String[] args) {
		
		int a = 100;
		int b = 200;
		
		System.out.println("the value of a : "+ a);
		System.out.println("the value of b : "+ b);
		System.out.println("sum of a and b : " +a+b);
		System.out.println("sum of a and b : " +(a+b));
		
		String x = "hello";
		String y = "world";
		
		System.out.println(a+b);//300 when add two integer, character it is called addition of 2 numbers
		System.out.println(x+y);//helloworld when add two string it is called concatenation
		
		// start from left to right and if it start with int then add two number and then add character
		System.out.println(x+a);//hello100
		System.out.println(x+y+a+b);//helloworld100200
		System.out.println(x+a+y+b+a+b);//hello100world200100200
		System.out.println(x+y+(a+b));//helloworld300
		
		System.out.println(a+b+x+y+a+b);//300helloworld100200
		
		double c = 12.33;
		double d = 23.44;
		
		System.out.println(x+y+c+d);//helloworld12.3323.44
		System.out.println(a+b+c+d+x+y);//335.77helloworld
		
		char c1 = 'a';
		char c2 = 'b';
		
		System.out.println(c1+c2+x+y);//195helloworld
		System.out.println(c1+c2);//195
		System.out.println(c1+""+c2);//ab
		
		System.out.println(x+ " " +y);//hello world
		System.out.println(c1+' '+c2);//97+32+98= 227
		
		System.out.println(true+x);//truehello
		
		System.out.println('a'+'b'+"hello"+"selenium"+100+200+12.33);//195helloselenium10020012.33

	}

}
