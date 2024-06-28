package EncapsulationAssignment;

public class PersonTest {

	public static void main(String[] args) {
		
		Person p = new Person();
		
		p.setName("Sonali");
		p.setAge(25);
		p.setGender('F');
		System.out.println("Name" + "=" + p.getName() + "Age" + "=" + p.getAge() + "Gender" + "=" + p.getGender());
		
		p.printInfo("Arpita", 25, 'F');
		System.out.println("Name" + "=" + p.getName() + "Age" + "=" + p.getAge() + "Gender" + "=" + p.getGender());
		

	}

}
