package ClassAndObjectAssignment;

public class Employee {
	
	String name;
	int age;
	double salary;

	public static void main(String[] args) {
		// Assignment 3: Define a class named Employee with the following attributes:
		//Create three Employee objects and initialize their properties with different values.
		//Print the details of each employee and the total salary of all employees.
		//Give a raise to one employee by increasing their salary, and update the total salary accordingly.
		//Create another Employee object with a different salary and update the total salary of all employees.
		//Print the details of the new employee and the updated total salary of all employees.

		double totalSalary = 0;
		
		//1. Create three Employee objects and initialize their properties with different values.
		Employee emp = new Employee();
		emp.name="Sonali";
		emp.age= 25;
		emp.salary= 10000;
		totalSalary++;

		Employee emp1 = new Employee();
		emp1.name="Parth";
		emp1.age= 28;
		emp1.salary= 18000;
		totalSalary++;
		
		Employee emp2 = new Employee();
		emp2.name="Hiten";
		emp2.age= 20;
		emp2.salary= 15000;
		totalSalary++;
		
		//2. Print the details of each employee and the total salary of all employees.
		
		System.out.println("Emp Name" + "=" +emp.name + " " + "Emp Age" + "=" +emp.age + " " + "Emp Salary" + "=" +emp.salary);
		System.out.println("Emp Name" + "=" +emp1.name + " " + "Emp Age" + "=" +emp1.age + " " + "Emp Salary" + "=" +emp1.salary);
		System.out.println("Emp Name" + "=" +emp2.name + " " + "Emp Age" + "=" +emp2.age + " " + "Emp Salary" + "=" +emp2.salary);
		System.out.println("TotalSalary" +totalSalary);
		
		//3. Give a raise to one employee by increasing their salary, and update the total salary accordingly.
		
		emp1.salary = 20000;
		System.out.println("Emp Salary" + "=" +emp1.salary);
		System.out.println("TotalSalary" +totalSalary);
		
		//4. Create another Employee object with a different salary and update the total salary of all employees.
		Employee emp3 = new Employee();
		emp3.name="Isha";
		emp3.age= 29;
		emp3.salary= 17000;
		totalSalary++;
		
		//5. Print the details of the new employee and the updated total salary of all employees.
		System.out.println("Emp Name" + "=" +emp3.name + " " + "Emp Age" + "=" +emp3.age + " " + "Emp Salary" + "=" +emp3.salary);
		System.out.println("TotalSalary" +totalSalary);
	}

}
