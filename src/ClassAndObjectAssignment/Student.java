package ClassAndObjectAssignment;

public class Student {
	
	String name;
	int age;

	public static void main(String[] args) {
		// Assignment 1:Create two Student objects and initialize their properties.
		//Print the details of each student and the total number of students.
		//Modify the age of one student and print the updated details.
		//Create another Student object and update the total number of students.
		//Print the details of the new student and the updated total number of students.

		int totalStudent = 0;
		//1.Create two Student objects and initialize their properties.
		Student s1 = new Student();
		s1.name = "Priya";
		s1.age = 28;
		totalStudent++;
		
		Student s2 = new Student();
		s2.name = "Nehal";
		s2.age = 30;
		totalStudent++;
		
		//2. Print the details of each student and the total number of students.
		
		System.out.println("Name" + "=" + s1.name+ " " + "Age" + "=" + s1.age);
		System.out.println("Name" + "=" + s2.name+ " " + "Age" + "=" + s2.age);
		System.out.println("TotalStudents" + "=" + totalStudent);
		
		//3. Modify the age of one student and print the updated details.
		
		s1.age = 25;
		System.out.println("Age Updated" + "=" + s1.age);
		
		//4. Create another Student object and update the total number of students.
		Student s3 = new Student();
		
		s3.name = "Sonali";
		s3.age = 25;
		totalStudent++;
		
		//5. Print the details of the new student and the updated total number of students.
		
		System.out.println("Name" + "=" + s3.name+ " " + "Age" + "=" + s3.age);
		System.out.println("TotalStudents" + "=" + totalStudent);
		
		

	}

}
