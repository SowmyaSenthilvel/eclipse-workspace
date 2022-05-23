package ProgramsOnArrayList;

import java.util.ArrayList;

public class StudentDataViewer {

	public void studentdataviewer() {
		ArrayList<StudentDetails> student=new ArrayList<StudentDetails>();
		for(StudentDetails studObj: student) {
			System.out.println("Student Name " +studObj.getName());
			System.out.println("Student Register Number " +studObj.getRegNo());
			System.out.println("Student Age " +studObj.getAge());
			System.out.println("Student Email Address " +studObj.getEmailId());
			System.out.println("Student AadharNo "+studObj.getAadharNo());
			System.out.println();
			
		}
		
	}
	

}
