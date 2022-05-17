
public class EmployeePojo {
	private int emp_Id;
	private String emp_Name;
	private int emp_Age;
	private String address;
	
	
	public int getEmp_Id() {
		return emp_Id;
	}
	public void setEmp_Id(int emp_Id) {
		this.emp_Id = emp_Id;
	}
	public String getEmp_Name() {
		return emp_Name;
	}
	public void setEmp_Name(String emp_Name) {
		this.emp_Name = emp_Name;
	}
	public int getEmp_Age() {
		return emp_Age;
	}
	public void setEmp_Age(int emp_Age) {
		this.emp_Age = emp_Age;
	}
	public String getAddress() {
		return address;
	}
	public EmployeePojo(int emp_Id, String emp_Name, int emp_Age, String address) {
		super();
		this.emp_Id = emp_Id;
		this.emp_Name = emp_Name;
		this.emp_Age = emp_Age;
		this.address = address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	@Override
	public String toString() {
		return "EmployeePojo [emp_Id=" + emp_Id + ", emp_Name=" + emp_Name + ", emp_Age=" + emp_Age + ", address="
				+ address + "]";
	}
	public EmployeePojo() {
		// TODO Auto-generated constructor stub
	}
	

}
