package ProgramsOnLinkedList;

import java.util.Scanner;

public class StudentsDetailsLinkedlist {
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		StudentData students=new StudentData();
		
		boolean End=true;
		while(End) {
				 System.out.println();
				 System.out.println(" Welcome to Login Page of Student Details ");
				 System.out.println();
				 System.out.println("Enter a choice");
				 System.out.println();
				 System.out.println("1 for Adding Student's data to the Linkedlist");
				 System.out.println("2 for Viewing Student Details ");
				 System.out.println("3 for Inserting Student Info at the specific position in the Linkedlist");
				 System.out.println("4 for Removing specific element from the Linkedlist");
				 System.out.println("5 for Sorting the Linkedlist using names");
				 System.out.println("6 for Searching the Linkedlist using their roll numbers");
				 System.out.println("7 for Copying one Linkedlist to another arraylist");
				 System.out.println("8 for Emptying the Linkedlist");
				 System.out.println("9 for Joining two Linkedlist");
				 System.out.println("10 for Checking the Linkedlist is empty or not");
				 System.out.println("11 for Comparing two Linkedlist");
				 System.out.println("12 for Shuffle the student Linkedlist");
				 System.out.println("13 for Triming The size");
				 System.out.println("14 for Increasing the capacity");
				 System.out.println("15 for Reversing LinkedList");
				 System.out.println("16 for Swapping two index in Linkedlist");
				 System.out.println("17 for Cloning a arraylist to another Linkedlist");
				 System.out.println("18 for Updating Student Info At Specific Index");
				 System.out.println("19 for Extracting a portion of student Info in Linkedlist");
				 System.out.println("20 to Exit the Program");
				 System.out.println();
				 byte choice=input.nextByte();
				 switch(choice) {
				 case 1:
					 System.out.println("Adding the Student details in Linked list");
					 students.studentdata();
					 break;
				 
		 		case 2:
		 			System.out.println("Viewing Student Details");
		 			StudentDataviewing.studentdataview(students.getStudent());
		 			break;
		 		case 3:
		 			System.out.println("Insering Student Info at the specific position in the Linkedlist");
		 			students.insertinginfo();
		 			break;
		 		case 4:
		 			System.out.println("Removing specific element from the Linked list");
		 			students.removeInfo();
		 			break;
				 case 20:
					 System.out.println("    Thank You    ");
					 End=false;
					 break;
				 default :
					 System.out.println("Enter a valid choice");
					 break;

			}
		 		
		}
		
	}

}
