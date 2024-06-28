package javasessions;

public class User1 {

	String name;
	int age;
	String city;
	
	public static void main(String[] args) {
		User u1 = new User();
		u1.name="payal";
		u1.age=20;
		u1.city="surat";
		
		User u2 = new User();
		u2.name="krish";
		u2.age=25;
		u2.city="USA";
		
		User u3 = new User();
		u3.name="heena";
		u3.age=30;
		u3.city="LA";
		
		User u4 = new User();
		u4.name="deep";
		u4.age=35;
		u4.city="Vadodara";
		
		System.out.println("Original Value");
		System.out.println(u1.name+ " "+ u1.age + " " + u1.city);
		System.out.println(u2.name+ " "+ u2.age + " " + u2.city);
		System.out.println(u3.name+ " "+ u3.age + " " + u3.city);
		System.out.println(u4.name+ " "+ u4.age + " " + u4.city);
		
		System.out.println("-------------------");
		
		u1 = u2;
		
		System.out.println(u1.name+ " "+ u1.age + " " + u1.city);//krish
		System.out.println(u2.name+ " "+ u2.age + " " + u2.city);//krish
		System.out.println(u3.name+ " "+ u3.age + " " + u3.city);//heena
		System.out.println(u4.name+ " "+ u4.age + " " + u4.city);//deep

		System.out.println("-------------------");
		u2 = u3;
		
		System.out.println(u1.name+ " "+ u1.age + " " + u1.city);//krish
		System.out.println(u2.name+ " "+ u2.age + " " + u2.city);//heena
		System.out.println(u3.name+ " "+ u3.age + " " + u3.city);//heena
		System.out.println(u4.name+ " "+ u4.age + " " + u4.city);//deep
		
		System.out.println("-------------------");
		
		u3 = u4;
		System.out.println(u1.name+ " "+ u1.age + " " + u1.city);//krish
		System.out.println(u2.name+ " "+ u2.age + " " + u2.city);//heena
		System.out.println(u3.name+ " "+ u3.age + " " + u3.city);//deep
		System.out.println(u4.name+ " "+ u4.age + " " + u4.city);//deep
		
		System.out.println("-------------------");
		u4 = u1;
		System.out.println(u1.name+ " "+ u1.age + " " + u1.city);//krish
		System.out.println(u2.name+ " "+ u2.age + " " + u2.city);//heena
		System.out.println(u3.name+ " "+ u3.age + " " + u3.city);//deep
		System.out.println(u4.name+ " "+ u4.age + " " + u4.city);//krish


	}

}
