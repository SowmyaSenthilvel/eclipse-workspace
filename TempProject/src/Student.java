
public class Student {
	private String name;
	private int age;
	private String email;
	private String mobNo;
	private String gender;
	
	//Constructor....//
	/*public Student(){
		super();
	}
	public Student(String name, int age, String email, String mobNo, String gender) {
		super();
		this.name = name;
		this.age = age;
		this.email = email;
		this.mobNo = mobNo;
		this.gender = gender;
	}*/
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getMobNo() {
		return mobNo;
	}
	public void setMobNo(String mobNo) {
		this.mobNo = mobNo;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	
}