package constructor;

public class Registration {
	
	String name;
	String emailId;
	String phone;
	int age;
	String city;
	String dob;
	
	// hidden - default const will be added by Java

	public Registration(String name, String emailId) {
		
		this.name = name;
		this.emailId = emailId;
	}

	public Registration(String name, String emailId, String phone) {
		
		this.name = name;
		this.emailId = emailId;
		this.phone = phone;
	}

	public Registration(String name, String emailId, String phone, int age, String city) {
		
		this.name = name;
		this.emailId = emailId;
		this.phone = phone;
		this.age = age;
		this.city = city;
	}

	public Registration(String name, String emailId, String phone, int age, String city, String dob) {
		
		this.name = name;
		this.emailId = emailId;
		this.phone = phone;
		this.age = age;
		this.city = city;
		this.dob = dob;
	}

	public static void main(String[] args) {

		Registration r = new Registration("sonali", "sonali@gmail.com");
		System.out.println(r.name + " " + r.age + " " + r.emailId + " " + r.city + " " + r.dob + " " + r.phone);
		r.phone = "12345679890";
		System.out.println(r.name + " " + r.age + " " + r.emailId + " " + r.city + " " + r.dob + " " + r.phone);

	}
}
