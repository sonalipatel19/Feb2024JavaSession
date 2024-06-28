package WebDriver_Arch_Interface;

public class ChromeDriver implements WebDriver{
	
	public ChromeDriver() {
		System.out.println("chrome is launched");
	}

	@Override
	public void findElement(String name) {
		System.out.println("finding element with name : " + name);
		
	}

	@Override
	public void findElements(String name) {
		System.out.println("finding elements with name : " + name);
		
	}

	@Override
	public void click(String element) {
		System.out.println("clicking on element : " + element);
		
	}

	@Override
	public void get(String url) {
		System.out.println("launching url : " + url);
		
	}

	@Override
	public String getTitle() {
		
		return "Amazon";
	}

	@Override
	public void sendKeys(String element, String value) {
		System.out.println("enter the elements : " + element + " in value : " + value);
		
	}

	@Override
	public void close() {
		
		System.out.println("closing the browser");
	}

}
