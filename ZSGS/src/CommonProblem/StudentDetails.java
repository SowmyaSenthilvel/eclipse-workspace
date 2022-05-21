package CommonProblem;

public class StudentDetails {

	private int RegNo;
	private String Name;
	private String EmailId;
	private int Age;
	private int mark;
	private String clas;
	
	public StudentDetails(int regNo, String name, int mark, String clas) {
		RegNo = regNo;
		Name = name;
		this.mark = mark;
		this.clas = clas;
	}
	public String getClas() {
		return clas;
	}
	public void setClas(String clas) {
		this.clas = clas;
	}
	public int getRegNo() {
		return RegNo;
	}
	public void setRegNo(int regNo) {
		RegNo = regNo;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public String getEmailId() {
		return EmailId;
	}
	public void setEmailId(String emailId) {
		EmailId = emailId;
	}
	public int getAge() {
		return Age;
	}
	public void setAge(int age) {
		Age = age;
	}
	public int getMark() {
		return mark;
	}
	public void setMark(int mark) {
		this.mark = mark;
	}
	
	

}
