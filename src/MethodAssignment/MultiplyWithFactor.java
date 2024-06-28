package MethodAssignment;

public class MultiplyWithFactor {
	//Method without Return Value (void) and with Parameters (int, int[]):
	//Assignment: Write a method to print each element of an int array multiplied by a given factor. 
	
	public static void printArrayWithFactor(int factor, int[] array) {

        for (int num : array) {
            System.out.print((num * factor) + " ");
        }
        System.out.println(); //2 4 6 8 10 
    }

	public static void main(String[] args) {
		MultiplyWithFactor obj = new MultiplyWithFactor();
		int[] array = {1, 2, 3, 4, 5};
        printArrayWithFactor(3, array);

	}

}
