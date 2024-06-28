package constructor;

public class Login {
	String username;
	String password;

	public Login(String username, String password) {
		super();
		this.username = username;
		this.password = password;
	}
	
	public void doLogin() {
		System.out.println("Enter your username: " +username);
		System.out.println("Enter your password: " +password);
		System.out.println("click on login button");
		System.out.println("login is done...");
	}

	public static void main(String[] args) {
		Login l = new Login("deepak", "deepak123");
		l.doLogin();
		Login l1 = new Login("ravi", "ravi123");
		l1.doLogin();

	}

}
