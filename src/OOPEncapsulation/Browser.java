package OOPEncapsulation;

public class Browser {
	
	
	public void launchBrowser() {
		System.out.println("Launching Browser....");
		checkBrowserVersion();
		checkBrowserOSCompatability();
		checkBrowserUpdates();
		checkRamSpace();
		System.out.println("browser is launching....");
	}
	
	private void checkBrowserVersion() {
		System.out.println("checkBrowserVersion....");
	}
	
	private void checkBrowserOSCompatability() {
		System.out.println("checkBrowserOSCompatability....");
	}
	
	private void checkBrowserUpdates() {
		System.out.println("checkBrowserUpdates....");
	}
	
	private void checkRamSpace() {
		System.out.println("checkRamSpace....");
	}

}
