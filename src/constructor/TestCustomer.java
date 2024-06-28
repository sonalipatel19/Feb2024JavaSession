package constructor;

import java.util.Arrays;

public class TestCustomer {

	public static void main(String[] args) {
		
		String d[] = {"Macbook Pro", "Iphone 14", "Keyboard"};
		Customer obj = new Customer("Rahul", 30, d);
		
		String rahuldev[] = obj.getDevicesInfo();
		System.out.println(Arrays.toString(rahuldev));
		
		int deviceCount = obj.getDevicesCount();
		System.out.println(deviceCount);
		
		Browser.get();
		Browser.close();
	}

}
