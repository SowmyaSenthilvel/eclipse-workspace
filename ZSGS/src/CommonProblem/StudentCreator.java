package CommonProblem;

import java.util.ArrayList;
import java.util.HashMap;

public class StudentCreator {

	public static HashMap<Integer, ArrayList<StudentDetails>> markVsStudents = new HashMap<>();

	public static void createStudent(int regNo, String name, int mark, String clas)
	{
		StudentDetails obj = new StudentDetails(regNo, name, mark, clas);
		
		ArrayList<StudentDetails> list = markVsStudents.getOrDefault(mark, new ArrayList<StudentDetails>());
		list.add(obj);
		
		markVsStudents.put(mark, list);
		
		
	}
	
	public static ArrayList<StudentDetails> getListOfStudentsForMark(int mark)
	{
		return markVsStudents.getOrDefault(mark, new ArrayList<StudentDetails>());
	}
}
