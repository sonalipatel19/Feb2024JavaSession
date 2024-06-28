package javasessions;

public class Casting {

	public static void main(String[] args) {
		
		byte a = 100;
		byte b = 110;
		
		//to add two byte we need to store data in int or long.
		//It will not support byte and short it will give compilation error
		int c = a+b;
		//System.out.println(c);

		short s1 = 100;
		short s2 = 300;
		
		int s3 = s1+s2;
		//System.out.println(s3);
		
		int i = 200;
		int j = 300;
		
		int k = i+j;
		//System.out.println(k);
		
		int r1 = 200;
		byte r2 = (byte) r1;
		System.out.println(r2);
		
		char c1 = 'a';
		byte b1 = (byte)(int) c1;
		System.out.println(b1);
		
		double d1 = 12.33;
		int d2 = (int) d1;
		System.out.println(d2);
		
		char c2 = 'c';
		char c3 = 'd';
		
		System.out.println(c2*c3);//9900
		System.out.println(c2+c3);//199
		System.out.println(c2-c3);//-1
		System.out.println(c2/c3);//0
		
		System.out.println(c2+" "+c3);//c d
		System.out.println(c2+' '+c3);//231
		
		System.out.println(' '+' ');//64
		System.out.println(" "+' ');//    it is added with string so it will contain 2 space.
		
		System.out.println((byte)1000);
	}

}
