package CommonProblem;

import java.util.*;

public class StudentDataBase {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		System.out.println("Enter the number of students");
		int n =in.nextInt();
		
		for(int i=0;i<n;i++)
		{
			System.out.println("Enter the Name");
			String name = in.next();
			System.out.println("Enter the reg no.");
			int regNo = in.nextInt();
			System.out.println("Enter the mark");
			int mark = in.nextInt();
			System.out.println("Enter the class");	
			String className = in.next();
			
			StudentCreator.createStudent(regNo, name, mark, className);
			
		}
		
		System.out.println("Enter the mark to get the classname of the persons");
		int m = in.nextInt();
		
		ArrayList<StudentDetails> list = StudentCreator.getListOfStudentsForMark(m);
		
		for(StudentDetails stud:list) {
			System.out.println();
			System.out.println("The class of the student is "+stud.getClas());
		}
		
		
		
	}

}
