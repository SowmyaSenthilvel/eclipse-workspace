package ConsoleApplication;
import java.util.HashMap;
import java.util.Scanner;
public class StudentCreation { 
	long regNo;
	String name;
	String MobileNo;
	String EmailId;
	
	static HashMap<Long,Student> student=new HashMap<Long,Student>();

	public void studentcreation() {
		System.out.println();
		System.out.println(" Add the Student Details here");
		Scanner input=new Scanner(System.in);
		System.out.println();
		System.out.println("Enter Student's Register Number");
		this.regNo=input.nextLong();
		System.out.println("Enter Student's Name");
		input.nextLine();
		this.name=input.nextLine();
		System.out.println("Enter Student's Mobile Number");
		this.MobileNo=input.next();
		System.out.println("Enter Student's Email id");
		this.EmailId=input.next();
		
		Student stud=new Student(name,MobileNo,EmailId);
		student.put(regNo, stud);
		
		
	}

}
