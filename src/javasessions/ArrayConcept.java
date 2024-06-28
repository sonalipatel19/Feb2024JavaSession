package javasessions;

import java.util.Arrays;

public class ArrayConcept {

	public static void main(String[] args) {
		// Array is collection of similar type of data.
		
		int i =10;
		i=20;
		i=30;
		System.out.println(i);
		
		// array is non-primitive data type.
		// declare array:
		
		int a[]= new int[5]; // length = 5 , li=0 , hi= length-1
		a[0]= 10;
		a[1]= 20;
		a[2]= 30;
		a[3]= 40;
		a[4]= 50;
		
		System.out.println(a[3]);//40
		//System.out.println(a[5]);// ArrayIndexOutOfBound Exception
		
		int len = a.length;
		int hi = len-1;
		int li = 0;
		System.out.println(len);
		System.out.println(hi);
		System.out.println(li);
		
		for(int k=0; k<len; k++) {
			System.out.println(a[k]);
		}
		
		//for each:
		for(int e: a) {
			System.out.println(e);
		}
		// double array:
		
		double d[]= new double[3];
		d[0]=12.33;
		d[1]=22.32;
		d[2]=23.25;
		
		for(double e: d)
			System.out.println(e);
		
		// char array:
		
		char c[] =new char[3];
		c[0]='a';
		c[1]='b';
		c[2]='c';
		
		for(char e: c)
			System.out.println(e);
		
		// String array:
		String empNames[]= new String[3];
		empNames[0]="Sonali";
		empNames[1]="hiten";
		empNames[2]="parth";
		
		System.out.println(empNames[0]);
		
		for(String e: empNames)
			System.out.println(e);
		
		System.out.println("-----------------");
		
		int num[] = new int[3];
		num[0]= 100;
		num[1]= 200;
		num[2]= 300;
		
		//System.out.println(num);// it will give memory address. so we didnot have to use this.
		System.err.println(Arrays.toString(num));
		
		// 
		String names[] = new String[5];
		names[0]= "Sonali";
		names[1]= "Priya";
		names[2]= "Isha";
		names[3]= "Shivani";
		names[4]= "Reema";
		
		for(String e: names) {
			System.out.println(e);
			if(e.equals("Isha")) {
				System.out.println("HR");
				break;
			}
			else if(e.equals("Reema")) {
				System.out.println("Admin");
			}
		}
		
		int n[] = new int[3];
		n[0]= 100;
		n[1]= 200;
		n[2]= 300;
		
		System.out.println(n.length);
		System.out.println(Arrays.toString(n));
		
		for(int e: n) {
			System.out.println(e);
			if(e==200) {
				System.out.println("bye");
				break;
			}
		}

		//emp data: name(String), age(int), salary(double), gender(char), isPerm(boolean)
		//Object Array: Object is class
		
		Object obj[] = new Object[5];
		obj[0] = "Sonali";
		obj[1]= "25";
		obj[2]= "12.33";
		obj[3]= 'f';
		obj[4]= true;
		System.out.println(Arrays.toString(obj));
		
		for(Object e: obj)
			System.out.println(e);
	}

}
