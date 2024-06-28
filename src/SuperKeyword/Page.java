package SuperKeyword;

public class Page {
	
	String name;
	String title;
	
	public Page() {
		this("loginPage", "amazon");// it is 1st statement to call constructor
		System.out.println("default const.....");
	}
	
	public Page(String name, String title) {
		System.out.println("two param const.....");
		System.out.println(name);
		System.out.println(title);
	}

}
