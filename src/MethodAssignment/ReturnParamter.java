package MethodAssignment;

public class ReturnParamter {
	//Method with Return Value (double) and with Parameters (double[]):
	//Assignment: Write a method to calculate the average of elements in a double array and return the result.
	
public static double calculateAverage(double[] numbers) {
		
		double sum = 0.0;
		for(double e : numbers) {
			sum = sum + e;
		}
		
		return sum/numbers.length;
	}

	public static void main(String[] args) {
		
		double d[] = {1.2,1.3,1.4,1.5};
		double avg = calculateAverage(d);
		System.out.println(avg);

	}

}
