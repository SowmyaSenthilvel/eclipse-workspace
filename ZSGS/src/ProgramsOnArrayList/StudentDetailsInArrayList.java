package ProgramsOnArrayList;
import java.util.ArrayList;
import java.util.Scanner;

public class StudentDetailsInArrayList {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		ArrayList<StudentDetails> student=new ArrayList<StudentDetails>();
		System.out.println("Enter the number of students details you want:");
		int n=input.nextInt();
		for(int i=1;i<=n;i++) {
		StudentDetails stud=new StudentDetails();
		System.out.println("Enter Student Name ");
		stud.setName(input.next());
		System.out.println("Enter Student Register Number ");
		stud.setRegNo(input.nextInt());
		System.out.println("Enter Student Age ");
		stud.setAge(input.nextInt());
		System.out.println("Enter Student Email Id ");
		stud.setEmailId(input.next());
		System.out.println("Enter Student Aadhar Number ");
		stud.setAadharNo(input.nextLong());
		student.add(stud);
		System.out.println();
		}
		for(StudentDetails studObj:student) {
			System.out.println("Student Name " +studObj.getName());
			System.out.println("Student Register Number " +studObj.getRegNo());
			System.out.println("Student Age " +studObj.getAge());
			System.out.println("Student Email Address " +studObj.getEmailId());
			System.out.println("Student AadharNo "+studObj.getAadharNo());
			System.out.println();
			
		}

	}

}
