package ProgramsOnHashMap;

import java.util.HashMap;

import java.util.Scanner;
import java.util.Map.Entry;

public class StudentDetailsHashMap {

	public static void main(String[] args) {
		long StudentRollNo;
		String StudentName;
		String EmailID;
		long MobileNo;
		HashMap<Long,StudentDetails> student=new HashMap<Long,StudentDetails>();
		Scanner input=new Scanner(System.in);
		System.out.println("Enter the number of details You Want");
		int n=input.nextInt();
		for(int i=1;i<=n;i++) {
			
			System.out.println("Enter Student's Roll no");
			StudentRollNo=input.nextLong();
			System.out.println("Enter Student's name ");
			StudentName=input.next();
			System.out.println("Enter Student's Email ID ");
			EmailID=input.next();
			System.out.println("Enter Student's Mobile Number ");
			MobileNo=input.nextLong();
			StudentDetails studObj=new StudentDetails(StudentRollNo,StudentName,EmailID,MobileNo);
			student.put(StudentRollNo, studObj);
			System.out.println();
		}
		for(Entry<Long,StudentDetails> entryObj: student.entrySet()) {
			System.out.println();
			System.out.println("Student's Roll Number "+entryObj.getKey());
			StudentDetails details=entryObj.getValue();
			System.out.println("Student's Name"+details.StudentName);
			System.out.println("Student's EmailId "+details.EmailID);
			System.out.println("Student's Mobile Number "+details.MobileNo);
			System.out.println();
		}
		
		
	}

}
