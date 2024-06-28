package javasessions;

import java.util.Arrays;

public class Browser {

	//WAF:
	//launch a browser: browserName(String) -- input param: chrome,firefox,edge
	//return : boolean :true/false
	
	public Browser(int a) {
			System.out.println("value = " +a);
		}
	
	
	public boolean launchBrowser(String browserName) {
		System.out.println("launching browser: " +browserName);
		
		if(browserName.equals("chrome")) {
			System.out.println("Launch chrome");
			return true;
		}
		else if(browserName.equals("firefox")){
			System.out.println("Launch firefox");
			return true;
		}
		else if(browserName.equals("edge")){
			System.out.println("Launch Edge");
			return true;
		}
		else {
			System.out.println("plz pass the right browser...");
			return false;
		}
	}
	boolean flag = true;
	public boolean launchAppBrowser(String browserName) {
		System.out.println("launching browser: " +browserName);
		
	switch (browserName) {
	case "chrome":
		System.out.println("Launch chrome");
		//return true;
		break;
	case "firefox":
		System.out.println("Launch firefox");
		//return true;
		break;
	case "edge":
		System.out.println("Launch edge");
		//return true;
		break;
		default:
		System.out.println("plz pass the right browser...");
		//return false;
		flag = false;
		break;
	}
	return flag;
}
	
	//WAF: 
	//function name: getStudentMarks
	//input param: studentName(String)
	//return: marks(int)
	
	public int getStudentMarks(String studentName) {
		System.out.println("getting student marks: "+studentName);
		
		int marks = -1;
		switch (studentName) {
		case "sonali":
			marks = 90;
			break;
			
		case "naveen":
			marks = 55;
			break;
			
		case "nehal":
			marks = 75;
			break;
			
		case "tom":
			marks = 10;
			break;

		default:
			System.out.println("plz pass the right student name..." + studentName);
			break;
		}
		return marks;
	}
	
	public int[] getData() {
		int n[]= {10,20,30};
		return n;
	}
	
	
//	public static void main(String[] args) {
//		Browser obj = new Browser();
//		
//		int num[]= obj.getData();
//		System.out.println(Arrays.toString(num));
//		boolean flag = obj.launchBrowser("safari");
//		System.out.println(flag);
//		if(flag) {
//			System.out.println("enter url");
//		}else {
//			System.out.println("no need to enter url");
//		}

//		if(obj.launchAppBrowser("safari")) {
//			System.out.println("enter url");
//		}else {
//			System.out.println("no need to enter url");
//		}
		
//		int m1 = obj.getStudentMarks("sonali");
//			System.out.println(m1);
//			
//			if(m1>=0 && m1<=100) {
//				System.out.println("print the marksheet");
//		}
	//	}

}
