package InheritanceAssignment;

public class TestAnimal {

	public static void main(String[] args) {
		
		Dog d = new Dog();
		d.bark();
		System.out.println(d.breed);
		System.out.println(d.species);
		d.giveBirth();
		d.eat();
		
		System.out.println("------------------");
		Eagle e = new Eagle();
		e.eat();
		e.fly();
		System.out.println(e.nestLocation);
		
		System.out.println("------------------");
		Snake s = new Snake();
		s.sleep();
		s.crawl();
		s.strike();
		
		System.out.println("------------------");
		Mammal m = new Mammal();
		System.out.println(m.age);
		m.giveBirth();
		m.eat();
		
		

	}

}
