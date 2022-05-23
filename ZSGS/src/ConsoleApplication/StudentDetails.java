package ConsoleApplication;

import java.util.Map.Entry;

public class StudentDetails {

	public void studentdetails() {
		System.out.println();
		System.out.println("   Welcome to Student Details View   ");
		System.out.println();
		for(Entry<Long,Student> entryObject: StudentCreation.student.entrySet()) {
			System.out.println("Key "+entryObject.getKey());
			Student details=entryObject.getValue();
			System.out.println("Students's Name "+details.name);
			System.out.println("Students's Mobile Number"+details.MobileNo);
			System.out.println("Students's Email Id "+details.EmailId);
			
		}
	}

}
