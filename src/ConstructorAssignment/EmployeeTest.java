package ConstructorAssignment;

public class EmployeeTest {

	public static void main(String[] args) {
		
		Employee e = new Employee("sonali", 25, 30.25);
		System.out.println(e.getName() + " " + e.getAge() + " " + e.getSalary());
		
		e.setSalary(40.25);
		System.out.println(e.getName() + " " + e.getAge() + " " + e.getSalary());

	}

}
