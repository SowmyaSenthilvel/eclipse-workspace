package JerseyManagement;

public class LoginPojo {
	private String username;
	private String password;
	private String TypeOfUser;
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getTypeOfUser() {
		return TypeOfUser;
	}
	public void setTypeOfUser(String typeOfUser) {
		TypeOfUser = typeOfUser;
	}
	
	public LoginPojo(String username, String password, String typeOfUser) {
		super();
		this.username = username;
		this.password = password;
		TypeOfUser = typeOfUser;
	}
	public LoginPojo() {
		// TODO Auto-generated constructor stub
	}
	
	

}
