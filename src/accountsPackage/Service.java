package accountsPackage;

import java.util.HashMap;
import java.util.Scanner;


public class Service {
	
	HashMap<Integer, Account> userInfo = new HashMap<>();
	
	
	public void CreateAccount(int key) {
		
		String input;
		Account account = new Account();
		Scanner keyboard = new Scanner(System.in);
		
		userInfo.put(key, account);
		
		
		System.out.println("Enter first name");
		input = keyboard.nextLine();
		userInfo.get(key).setFirstName(input);
		
		System.out.println("Enter last name");
		input = keyboard.nextLine();	
		userInfo.get(key).setLastName(input);
		
		keyboard.close();
			
	}
	
	public void ViewAccount(int key) {
		System.out.println( userInfo.get(key).getFirstName() );
		System.out.println( userInfo.get(key).getLastName() );
		
	}

	
	
}
