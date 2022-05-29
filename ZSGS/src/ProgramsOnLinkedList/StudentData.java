package ProgramsOnLinkedList;

import java.util.LinkedList;
import java.util.Scanner;

import ProgramsOnArrayList.StudentDataViewer;

public class StudentData {
	LinkedList<StudentPojoDetails> student=new LinkedList<StudentPojoDetails>();
	
	public LinkedList<StudentPojoDetails> getStudent() {
		return student;
	}

	public void studentdata() {
		Scanner input=new Scanner(System.in);
		System.out.println("Enter the number of Student details you want to add ");
		int n=input.nextInt();
		for(int i=1;i<=n;i++) {
			StudentPojoDetails studPojo=new StudentPojoDetails();
			System.out.println("Enter Student Name ");
			studPojo.setName(input.next());
			System.out.println("Enter Student Register Number ");
			studPojo.setRegNo(input.nextInt());
			System.out.println("Enter Student Age ");
			studPojo.setAge(input.nextInt());
			System.out.println("Enter Student Email Id ");
			studPojo.setEmailId(input.next());
			System.out.println("Enter Student Mobile Number ");
			studPojo.setMobileNum(input.nextLong());
			student.add(studPojo);
			System.out.println();
			
		}
		
		
		
	}

	public void insertinginfo() {
		Scanner input=new Scanner(System.in);
		System.out.println("Enter the index you want to insert a student Info");
		int index=input.nextInt();
		StudentPojoDetails stud=new StudentPojoDetails();
		if(index<student.size()) {
			System.out.println("Enter Student Name ");
			stud.setName(input.next());
			System.out.println("Enter Student Register Number ");
			stud.setRegNo(input.nextInt());
			System.out.println("Enter Student Age ");
			stud.setAge(input.nextInt());
			System.out.println("Enter Student Email Id ");
			stud.setEmailId(input.next());
			System.out.println("Enter Student Aadhar Number ");
			stud.setMobileNum(input.nextLong());
			student.add(index,stud);
		}
		else {
			System.out.println("Please enter the index within the arraylist size to insert Student info");
		}
	}

	public void removeInfo() {
		Scanner input=new Scanner(System.in);
		System.out.println("Enter the index you want to insert a student Info");
		int index=input.nextInt();
		if(index<student.size()) {
			student.remove(index);
			StudentDataviewing.studentdataview(student);
			}
			else {
				System.out.println("Please enter the index within the arraylist size to remove Student info");
			}
			System.out.println();
		
	}

	

	
}
