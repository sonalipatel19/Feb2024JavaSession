package constructor;

public class Employee {
	
	String name;
	int age;
	double salary;
	
	//Constructor:
	//Constructor name will be same as class name.
	//it looks like a function but its not function
	//constructor did not have void and no return type
	//constructor can be overloaded
	
	public Employee(String name) {
		this.name = name;
	}
	
	public Employee(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	public Employee(String name, int age, double salary) {
		this.name = name;
		this.age = age;
		this.salary = salary;
	}
	public static void main(String[] args) {
		Employee e = new Employee("Tom", 20);
		System.out.println(e.name);
		System.out.println(e.age);
		
		e.age = 30;
		System.out.println(e.age);
		
		Employee e1 = new Employee("Lisa", 20 , 12.33);
		
	}

}
