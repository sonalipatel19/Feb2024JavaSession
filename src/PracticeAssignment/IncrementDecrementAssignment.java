package PracticeAssignment;

public class IncrementDecrementAssignment {

	public static void main(String[] args) {
		// 1. What will be the output of the following program?
			
			int i = 11;//12-13
			i = i++ + ++i;//11+13
			System.out.println(i);//24
			
		// 2) Guess the output of the following program?
			int a=11, b=22, c;//12/13 23/24
			c = a + b + a++ + b++ + ++a + ++b;
			//  11+22+11+22+13+24
			System.out.println("a="+a);//13
			System.out.println("b="+b);//24
			System.out.println("c="+c);//103
			
		// 3. What will be the output of the below program?
			int i1=0; //1-0-1-0
			i1 = i++ - --i + ++i - i--;
			//   0-0+1-1
			System.out.println(i1);//0
			
		// 4. Is the below program written correctly?
			
//			boolean b1 = true;
// 			b1++;                     increment and decrement is not possible with boolean
// 			System.out.println(b1);
			
		// 5. What will be the output of the below program?
			
			int i2=1, j=2, k=3; //0 1  2
			int m = i2-- - j-- - k--;
			//    1-2-3
			System.out.println("i="+i2);//0
			System.out.println("j="+j);//1
			System.out.println("k="+k);//2
			System.out.println("m="+m);//-4
			
		// 6. What will be the output of the following program?
			
			int a1=1, b1=2;// 2/1  1/2
			System.out.println(--b1 - ++a1 + ++b1 - --a1);//0
			//                  1-2+2-1
			
		// 7. What will be the value of i, j and k in the below program?
			
			int s=19, u=29, v=0;// 18 28 -1
			int m1 = s-- - u-- - v--;
			//       19-29-0
			System.out.println("s="+s);//18
			System.out.println("u="+u);//28
			System.out.println("v="+v);//-1
			System.out.println("m1="+m1);//-10
			
		// 8. What is wrong with the below program? Why it is showing compilation error?
			
			int ch = 11;
		//	int c1 = --(ch++); // it is not possible to use both increment and decrement at same time.
			
		// 9. Guess the value of p in the below program?
			
			int m2 = 0, n = 0;//-1/-2 -1/-2
			int p = --m2 * --n * n-- * m2--;
			//      -1*-1*-1*-1
			System.out.println("p="+p);//1
			System.out.println("m2="+m2);//-2
			System.out.println("n="+n);//-2
			
		// 10. What will be the output of the following program?
			
			int d=1;//2/3/2/1
			int d2 = d++ + ++d * --d - d--;
			//  1+3*2-2
			System.out.println(d2);//5
			System.out.println(d);//1
			
		// 11. What will be the outcome of the below program?
			//int o = 11++;// we cannot assign increment/decrement sign while assigning the value.
			
		// 12. What will be the outcome of the below program?
			
			int ch1 = 'A';
			System.out.println(ch1++);//65
			
		 // 13. What will be the outcome of the below program?
			
			int ch2 = 'A';
			System.out.println(++ch2);//66
			System.out.println((char)ch2);//B
						
		// 14. What will be the outcome of the below program?
			
			double num = 1.5, D = 2.5; //2.5 3.5
			System.out.println(num++ + ++D);//5.0
			//                  1.5+3.5
	}
}
