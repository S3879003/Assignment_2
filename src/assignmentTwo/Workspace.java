package assignmentTwo;
import java.util.Scanner;

public class Workspace {
	UserAccount currentUser;
	
	public Workspace(UserAccount currUser) {
		currentUser = currUser;
	}
	
	public void openWorkSpace() {
		Scanner input = new Scanner(System.in);
		
		int menuSelect = 0;
		while(menuSelect != 5) {
			System.out.println("--Workspace Menu--");
			System.out.println("1. edit profile");
			System.out.println("2. create new project");
			System.out.println("3. set default project");
			System.out.println("4. change project board");
			System.out.println("5. Logout");
			
			menuSelect = input.nextInt();
			switch(menuSelect) {
				case 1:
					editProfile();
					break;
				case 2:
					createNewProject();
					break;
				case 3:
					setDefaultProject();
					break;
				case 4:
					changeProject();
					break;
				case 5:
					logout();
					break;
			}	
		}
	}
	
	public void editProfile() {
		Scanner input = new Scanner(System.in);
		
		System.out.println("--Edit profile--");
		System.out.println("1. change first name");
		System.out.println("2. change last name");
		System.out.println("3. change profile picture");
		System.out.println("4. back");
		
		int menuSelect = input.nextInt();
		
		switch(menuSelect) {
			case 1:
				System.out.println("Please enter a new first name");
				currentUser.fName = input.nextLine();
				break;
			case 2:
				System.out.println("Please enter a new last name");
				currentUser.lName = input.nextLine();
				break;
			case 3:
				System.out.println("Please select a new profile picture");
				currentUser.picture = input.nextLine();
				break;
			case 4:
//				System.out.println("returning to menu");
				break;
		}
	}
	
	public void createNewProject() {}
	
	public void setDefaultProject() {}
	
	public void changeProject() {}

	public void logout() {}

}
