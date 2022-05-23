package ProgramsOnArrayList;
import java.util.ArrayList;
import java.util.Scanner;

public class StudentDetailsInArrayList {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		
		boolean isExit=true;
		
		while(isExit) {
			 System.out.println();
			 System.out.println("****** Welcome to Login Page of Student Details ******");
			 System.out.println();
			 System.out.println("Enter a choice");
			 System.out.println();
			 System.out.println("1 for Adding Student's data to the arraylist");
			 System.out.println("2 for Viewing Student Details ");
			 System.out.println("3 for Inserting Student Info at the first position in the arraylist");
			 System.out.println("4 for Removing third element from the Arraylist");
			 System.out.println("5 for exit");
			 System.out.println();
			 byte choice=input.nextByte();
			 switch(choice) {
			 case 1:
				 new StudentDataCollector().studentdatacollector();
				 break;
				
			 case 2:
				 new StudentDataViewer().studentdataviewer();
				 break;
				
			 case 3:
				 System.out.println("Inserting Student Info At First Position");
				 new StudentDataCollector().insertinginfo();
				 break;
				 
			 case 4:
				 System.out.println("Removing third element from the Arraylist");
				 break;
				 
			 case 5:
				 System.out.println("    Thank You    ");
				 isExit=false;
				 break;
			 default :
				 System.out.println("Enter a valid choice");
				 break;
				
			 }
			 
		}
	}
		
}