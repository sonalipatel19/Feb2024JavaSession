package javasessions;

public class Util {
	
	String name;
	int age;
	static final String compName = "Google";
	
	public void getInfo() {
		System.out.println("getInfo");
	}
	
	public static void sendMail() {
		System.out.println("send Mail");
	}
	
	public static void main(String[] args) {
		
		Util u = new Util();
		u.name = "sonali";
		u.age = 25;
		u.getInfo();
		
		//how to access static vars and method:
		System.out.println(Util.compName);
		Util.sendMail();

	}

}
