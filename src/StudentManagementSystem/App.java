package StudentManagementSystem;

import java.util.Scanner;

public class App 
{

	public static void main(String[] args)
	{
		// Welcome message
		System.out.println
				 ("   _____ _             _            _     __  __                                                   _   \r\n"
				+ "  / ____| |           | |          | |   |  \\/  |                                                 | |  \r\n"
				+ " | (___ | |_ _   _  __| | ___ _ __ | |_  | \\  / | __ _ _ __   __ _  __ _  ___ _ __ ___   ___ _ __ | |_ \r\n"
				+ "  \\___ \\| __| | | |/ _` |/ _ \\ '_ \\| __| | |\\/| |/ _` | '_ \\ / _` |/ _` |/ _ \\ '_ ` _ \\ / _ \\ '_ \\| __|\r\n"
				+ "  ____) | |_| |_| | (_| |  __/ | | | |_  | |  | | (_| | | | | (_| | (_| |  __/ | | | | |  __/ | | | |_ \r\n"
				+ " |_____/ \\__|\\__,_|\\__,_|\\___|_| |_|\\__| |_|  |_|\\__,_|_| |_|\\__,_|\\__, |\\___|_| |_| |_|\\___|_| |_|\\__|\r\n"
				+ "                                                                    __/ |                              \r\n"
				+ "                                                                   |___/                               ");
		// Main menu
		System.out.println("\nWelcome to the Student Management system.\n");
		
		// Ask for number of students to be added
		System.out.print("Enter the number of students to add to enrollment: ");
		Scanner userInput = new Scanner(System.in);
		int numberOfStudents = userInput.nextInt();
		Student[] students = new Student[numberOfStudents];
				
		// Create new students
		for(int i = 0; i < numberOfStudents; i++) 
		{
			students[i] = new Student();
			students[i].enroll();
			students[i].makePayment();
			System.out.println("\n" + students[i].checkStudentStatus());
		}
		// End of student creation
		userInput.close();								// added to close scanner ???
	}
}
