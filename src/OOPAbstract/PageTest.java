package OOPAbstract;

public class PageTest {

	public static void main(String[] args) {
		
		LoginPage lp = new LoginPage(10, 20);
		
		lp.title();
		lp.url();
		lp.doLogin("sonali", "123456");
		Page.displayLogo();
		LoginPage.displayLogo();
		lp.getPageInfo();
		System.out.println(Page.TIME_OUT);
		System.out.println(LoginPage.TIME_OUT);
		lp.getBillingInfo();
		
		
//		Page p = new LoginPage();
//		p.title();
//		p.url();
//		p.getPageInfo();
		
		
		//down casting: not applicable
		

	}

}
