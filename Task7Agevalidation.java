package task7;

import java.util.Scanner;

public class Task7Agevalidation  {
	
	public static void validateAge(int age) throws Task7Invalidageexcep{
		if(age<18) {
			throw new Task7Invalidageexcep("You must be at least 18 years to vote");		
		}
	}	
		

	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your age ");
		int age =sc.nextInt();	
		
		try{
			validateAge(age);
			System.out.println("You are eligbli to vote!");
			}
		catch(Task7Invalidageexcep e) {
			System.out.println("Error: "+ e.getMessage());			
		
			sc.close();	
		}
		
		

	}

}
