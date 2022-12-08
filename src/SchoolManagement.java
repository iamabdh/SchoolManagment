import java.security.DomainCombiner;
import java.util.Scanner;

public class SchoolManagement {
	public static void main(String[] args) {
	 displayHeadings("School Management System");
	 System.out.println("Select options: ");
	 System.out.println("1) Admission");
	 Scanner inputScanner = new Scanner(System.in);
	 int optionNumber = inputScanner.nextInt();
	 if(optionNumber == 1) {
		 admissionMenu();
	 } else {
		 System.out.println("Wrong Option");
		
	 }
	}
	
	/**
	 * repeat pattern for display
	 * @param pattern
	 * @param num
	 */

	public static void displayHeadings(String title) {
		 repeatPattern("*", 40);
		 System.out.println("\n\n\t"+ title +"\n\n");
		 repeatPattern("*", 40);
	}
	public static void repeatPattern(String pattern, int num) {
		for (int i = 0; i <= num; i++) {
			System.out.print(pattern);
		}
		System.out.println("\n");
	}
	
	public static void admissionMenu() {
		displayHeadings("Admission Menu");
		System.out.println("1) Register a new student");
		System.out.println("2) Manage student");
		Scanner inputOptionScanner = new Scanner(System.in);
		System.out.println("Choose option:  ");
		int option = inputOptionScanner.nextInt();
		
		if (option == 1) {
			
		} else if (option == 2) {
			
		} else {
			 System.out.println("Wrong Option");
		}
	}
}
