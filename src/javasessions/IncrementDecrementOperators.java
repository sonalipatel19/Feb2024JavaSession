package javasessions;

public class IncrementDecrementOperators {

	public static void main(String[] args) {
		// ++  --
		
		//1. post increment(a++):first assign and then increase
		
		int a =1;
		int b= a++;
		System.out.println(a);//2
		System.out.println(b);//1
		
		int h= -99;
		int g= h++;
		System.out.println(h);//-98
		System.out.println(g);//-99
		
		int s=5;
		System.out.println(s++);//5
		System.out.println(s);//6
		
		int t=10;
		int f=t++;
		System.out.println(t);//11
		System.out.println(f);//10
		
		//2. pre-increment (++a):first increase and then assign
		
		int x=1;
		int y=++x;
		System.out.println(x);//2
		System.out.println(y);//2
		
		int u= -999;
		int v = ++u;
		System.out.println(u);//-998
		System.out.println(v);//-998
		
		int total=10;
		System.out.println(++total);//11
		System.out.println(total);//11
		
		int m1=0;
		int n1=++m1;
		System.out.println(m1);//1
		System.out.println(n1);//1
		
		//decrement --
		//post decrement (a--):first assign and then decrease
		
		int p1=2;
		int q1=p1--;
		System.out.println(p1);//1
		System.out.println(q1);//2
		
		int m=-999;
		int n=m--;
		System.out.println(m);//-1000
		System.out.println(n);//-999
		
		//4. pre-decrement (--a): first decrease and then assign
		
		int f1=2;
		int k= --f1;
		System.out.println(f1);//1
		System.out.println(k);//1
		
		int pop=10;
		System.out.println(--pop);//9
		System.out.println(pop);//9
		
		int bill= -1000;
		int finalbill = --bill;
		System.out.println(bill);//-1001
		System.out.println(finalbill);//-1001
		
		int th = 5;
		System.out.println(th--);//5
		System.out.println(th);//4

	}

}
