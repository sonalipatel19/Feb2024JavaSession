package OOPEncapsulation;

public class CustomerTest {

	public static void main(String[] args) {

		//CRUD --> Create Retrieve Update Delete
		//Post --> Create
		Customer c = new Customer("Sonali", 25, 23.44, true);
		
		//get--> Retrieve
		System.out.println((c.getName() + " " + c.getAge() + " " + c.getSalary() + " " + c.isActive()));
		
		//put/patch --> Update
		c.setAge(30);
		c.setSalary(33.23);
		
		//get
		System.out.println((c.getName() + " " + c.getAge() + " " + c.getSalary() + " " + c.isActive()));
		
		Customer c1 = new Customer();
		System.out.println((c1.getName() + " " + c.getAge() + " " + c1.getSalary() + " " + c1.isActive()));
		
		c1.setName("Ravi");
		c1.setAge(40);
		c1.setSalary(55.23);
		c1.setActive(true);
		
		System.out.println((c1.getName() + " " + c.getAge() + " " + c1.getSalary() + " " + c1.isActive()));
		

	}

}
