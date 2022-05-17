package assignmentTwo;
import java.util.ArrayList;
import java.util.Scanner;

public class SmartBoard {
	static void main (String[] args) {
		Scanner input =  new Scanner(System.in);
		
		ArrayList<UserAccount> userAccounts = new ArrayList<UserAccount>();
		
		//print out welcome message
		System.out.println("welcome to smart board");
		
		System.out.println("1. Login");
		System.out.println("2. Create an Account");
		
		
		int menuSelect = 0;
		while(menuSelect != 3) {
			menuSelect = input.nextInt();
			switch(menuSelect) {
				case 1:
					System.out.println("--LOGIN--");
					System.out.println("Please enter user Name");
					String Username = input.nextLine();
					
					System.out.println("Please enter password");
					String Password = input.nextLine();
					
					if(Username == userAccounts.get(0).username && Password == userAccounts.get(0).password) {
						
					}
					
					break;
				case 2:
					System.out.println("--LOGIN--");
					System.out.println("Please enter a unique user Name");
					String newUserName = input.nextLine();
					
					System.out.println("Please enter secure password");
					String newPassword = input.nextLine();
					
					System.out.println("Please enter your first name");
					String fName = input.nextLine();
					
					System.out.println("Please enter your last name");
					String lName = input.nextLine();
					
					UserAccount newUser = new UserAccount(newUserName, newPassword, fName, lName);
					userAccounts.add(newUser);
					
					System.out.println("Account creation successful. Please login.");
					break;
			}
		}
	}
}	
