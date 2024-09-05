package task7;

import java.util.Scanner;


public class Task11LoginSystem {
	String username;
	
	String password;
	
	public Task11LoginSystem(String user,String pword) {
		username=user;
		password=pword;
		
	}
	
	public void login(String username, String password) throws Task7Incorrectpasswordexception {		 
		 
		if(!this.password.equals(password)) {	
			throw new Task7Incorrectpasswordexception("Incorrect passwod!");
		
		}
		else if(!this.username.equals(username)) {
			System.out.println("User not found!");
			
		}
		else {
			System.out.println("Login successful!");
		}
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter username: ");
		String username=sc.nextLine();
		
		System.out.println("Enter password: ");
		String password=sc.nextLine();
		
		Task11LoginSystem obj= new Task11LoginSystem("Admin","admin@123");
		
		try {			
		   obj.login(username, password);
		   System.out.println("Sucessful loginAd");
			
		} catch (Task7Incorrectpasswordexception e) {
			System.out.println("Error: " + e.getMessage());
			
			// TODO: handle exception
		}
		sc.close();

	}

}
