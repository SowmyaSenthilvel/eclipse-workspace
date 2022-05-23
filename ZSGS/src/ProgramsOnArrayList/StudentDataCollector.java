package ProgramsOnArrayList;

import java.util.ArrayList;
import java.util.Scanner;

public class StudentDataCollector {

	public void studentdatacollector() {
		// TODO Auto-generated method stub
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
		
		
	}

	public void insertinginfo() {
		Scanner input=new Scanner(System.in);
		System.out.println("Enter a student's index to add details ");
		ArrayList<StudentDetails> student=new ArrayList<StudentDetails>();
		int m=input.nextInt();
		student.add(m,stud);
		
	}
	

}
