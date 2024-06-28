package javasessions;

public class SwitchCase {

	public static void main(String[] args) {
		
		String browser = "Chrome";
		
		switch (browser.trim().toLowerCase()) {
		case "chrome":
			System.out.println("launch chrome");
			break;
			
		case "firefox":
			System.out.println("launch firefox");
			break;
		case "edge":
			System.out.println("launch edge");
			break;
		case "safari":
			System.out.println("launch safari");
			break;

		default:
			System.out.println("plz pass the right browser name: "+browser);
			break; // we can put another case after default
		case "ie":
			System.out.println("launch ie");
			break;
		}
				
//			char gender = 'f';
//			
//			switch(gender) {
//			case 'm':
//				System.out.println("Male");
//				break;
//			
//			case 'f':
//				System.out.println("Female");
//				break;
//		}
			

	}

}
