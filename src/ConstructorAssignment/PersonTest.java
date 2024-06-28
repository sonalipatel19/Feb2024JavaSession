package ConstructorAssignment;

public class PersonTest {

	public static void main(String[] args) {
		
		Person p = new Person("sonali", 25, 'f', 5.5);
		System.out.println("Name" + "=" + p.name + " " + "Age" + "=" + p.age + " " + 
				"Gender" + "=" + p.gender + " " + "Height" + "=" +p.height);
		
		Person p1 = new Person("parth", 27, 'M', 5.5);
		System.out.println("Name" + "=" + p1.name + " " + "Age" + "=" + p1.age + " " + 
				"Gender" + "=" + p1.gender + " " + "Height" + "=" +p1.height);
		
		p.age = 28;
		System.out.println("Name" + "=" + p.name + " " + "Age" + "=" + p.age + " " + 
				"Gender" + "=" + p.gender + " " + "Height" + "=" +p.height);
		

	}

}
