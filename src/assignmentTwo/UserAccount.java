package assignmentTwo;

public class UserAccount {
	String username;
	String password;
	
	String fName;
	String lName;
	
	Workspace usersWorkspace;
	
	String picture;
	
	public UserAccount(String username, String password, String fName, String lName) {
		this.username = username;
		this.password = password;
		this.fName = fName;
		this.lName = lName;
	}
	
	public void updateFirstName() {}
	
	public void updateLastName() {}
}
