import java.util.Scanner;
public class SchoolManagement {
	
	public static String[][] StudentData = new String[10][4];
	public static int IndexStudentData = 0;
	public static void main(String[] args) {		
		displayHeadings("School Management System");
		String contiune = "y";
		
		while (contiune != "n") {
			System.out.println("Select options: ");
			System.out.println("1) Admission");
			Scanner inputScanner = new Scanner(System.in);
			int optionNumber = inputScanner.nextInt();
			if(optionNumber == 1) {
				 admissionMenu();
			} else {
				 System.out.println("Wrong Option");
				
			}
			System.out.println("continue: y or n");
			contiune = inputScanner.next();
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
		System.out.println("3) Display Student");
		Scanner inputOptionScanner = new Scanner(System.in);
		System.out.println("Choose option:  ");
		int option = inputOptionScanner.nextInt();
		
		if (option == 1) {
			System.out.print("Id number: ");
			int id = inputOptionScanner.nextInt();
			System.out.print("First name: ");
			String fname = inputOptionScanner.next();
			System.out.print("Last name: ");
			String lname = inputOptionScanner.next();
			inputOptionScanner.nextLine();
			System.out.println("College: ");
			String college = inputOptionScanner.nextLine();
			addStudent(id, fname, lname, college);
			
		} else if (option == 2) {
			
		} else if (option == 3) {
			displayStudent();
		} else {
			 System.out.println("Wrong Option");
		}
	}
	
	public static void addStudent(int id, String fname, String lname, String college) {
		if (IndexStudentData <= 9) {
			StudentData[IndexStudentData][0] = Integer.toString(id);
			StudentData[IndexStudentData][1] = fname;
			StudentData[IndexStudentData][2] = lname;
			StudentData[IndexStudentData][3] = college;	
			IndexStudentData ++;
			System.out.println("Student Saved Successfully");
		} else {
			System.out.println("error: MAX SIZE");
		}
	}
	
	public static void displayStudent() {
		for (int i =  0; i <= IndexStudentData; i++) {
			System.out.println();
			System.out.print(StudentData[i][0]);
			System.out.print("\t");
			System.out.print(StudentData[i][1]);
			System.out.print("\t");
			System.out.print(StudentData[i][2]);
			System.out.print("\t");
			System.out.print(StudentData[i][3]);
		}
	} 
}
