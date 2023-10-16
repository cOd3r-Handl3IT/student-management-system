package StudentManagementSystem;

import java.util.Scanner;

public class Student
{
	private String firstName;
	private String lastName;
	private int classmanYear;
	private String classman;
	private static int id = 1000;
	private String studentId;
	private String courses = "";
	private double tuitionBalance = 0;
	private static double costOfCourse = 500;
	
	// Constructor gets input for student name and year of study
	public Student() 
	{
		Scanner userInput = new Scanner(System.in);
		
		System.out.print("\nEnter student first name: ");
		this.firstName = userInput.nextLine();
		
		System.out.print("Enter student last name: ");
		this.lastName = userInput.nextLine();
		
		System.out.print("Enter student grade level: \n[-1-]Freshman\n[-2-]Sophomore\n[-3-]Junior\n[-4-]Senior\nEnter student class year: ");
		this.classmanYear = userInput.nextInt();
		
		switch(classmanYear)
		{
		case 1:
			classman = ("Freshman");
			break;
		case 2:
			classman = ("Sophomore");
			break;
		case 3:
			classman = ("Junior");
			break;
		case 4:
			classman = ("Senior");
			break;
		}
		
		setStudentId();
	
	}
	// End of student constructor
	
	// Generate a student ID
	private void setStudentId() 
	{
		studentId = classmanYear + "" + id;						// student year & id
		id++;
	}
	// End of student ID
	
	// Enroll in course(s)
	public void enroll() 
	{
		do
		{
			System.out.print("Enter course to enroll (0 to quit): ");
			Scanner userInput = new Scanner (System.in);
			String newCourse = userInput.nextLine();
			if(!newCourse.equals("0"))
			{
				courses = courses + "\n  " + newCourse;
				tuitionBalance = tuitionBalance + costOfCourse;
				System.out.println("Added " + newCourse + " to enrollment.");
			}
			else
			{
				break;
			}
		} while (1 != 0);										// infinite loop adding courses
		
		System.out.println("\n" + firstName + " " + lastName + " is enrolled in: " + courses + "\n");
	}
	// End of course enrollment
	
	// Pay tuition and check balance
	public void viewBalance() 
	{
		System.out.println(firstName + " " + lastName + "'s balance is: $ " + tuitionBalance);
	}
	
	public void makePayment() 
	{
		viewBalance();
		System.out.print("Enter the desired payment amount: $");
		Scanner userInput = new Scanner (System.in);
		double paymentAmount = userInput.nextDouble();
		tuitionBalance = tuitionBalance - paymentAmount;
		System.out.println("Your payment of $" + paymentAmount + " has been applied to your balance.");
		viewBalance();
	}
	// End of balance and pay tuition
	
	// Check student status
	public String checkStudentStatus() 
	{
		return "Student profile:\n\n" + 
				firstName + " " + lastName + 
				"\n" + classman + " (year " + classmanYear + ")" +
				"\nEnrolled in courses: " + courses +
				"\nStudent balance is: $" + tuitionBalance;
	}
	// End of check status
	
}
