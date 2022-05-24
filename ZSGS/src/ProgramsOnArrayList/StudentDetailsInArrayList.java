package ProgramsOnArrayList;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;
import java.util.stream.Collectors;

public class StudentDetailsInArrayList {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		StudentDataCollector students=new StudentDataCollector();
		
		boolean isExit=true;
		
		while(isExit) {
			 System.out.println();
			 System.out.println(" Welcome to Login Page of Student Details ");
			 System.out.println();
			 System.out.println("Enter a choice");
			 System.out.println();
			 System.out.println("1 for Adding Student's data to the arraylist");
			 System.out.println("2 for Viewing Student Details ");
			 System.out.println("3 for Inserting Student Info at the first position in the arraylist");
			 System.out.println("4 for Removing third element from the Arraylist");
			 System.out.println("5 for sorting the arraylist using names");
			 System.out.println("6 for Exit");
			 System.out.println();
			 byte choice=input.nextByte();
			 switch(choice) {
			 case 1:
				 students.studentdatacollector();
				 break;
				
			 case 2:
				 StudentDataViewer.studentdataviewer(students.getStudent());
				 break;
				
			 case 3:
				 System.out.println("Inserting Student Info  ");
				 students.insertinginfo();
				 break;
				 
			 case 4:
				 System.out.println("Removing element from the Arraylist");
      			 students.removinginfo();
				 break;
			 case 5:
				 System.out.println("The sorted arraylist using name is");
//				 ArrayList<StudentDetails> sorting=(ArrayList<StudentDetails>) student.stream().sorted(Comparator.comparing(StudentDetails::getName)).collect(Collectors.toList());
//				 System.out.println(sorting);
				 break;
				 
			 case 6:
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