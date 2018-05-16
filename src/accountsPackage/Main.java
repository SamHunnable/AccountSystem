package accountsPackage;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		int key, input;
		boolean escape=true;

		Service service = new Service();
		Scanner keyboard = new Scanner(System.in);
		
		
		while (escape) {
			
			System.out.println("Enter 1 for create account, 2 for view account, 3 for delete account and 4 to exit");
			input = keyboard.nextInt();
			
			if (input == 1) {
				System.out.println("Enter the new account number");
				key = keyboard.nextInt();
				service.CreateAccount(key);
			}
			
			else if (input == 2) {
				System.out.println("Enter the account number you wish to view");
				key = keyboard.nextInt();
				service.ViewAccount(key);
			}
			
			else if (input == 3) {
				System.out.println("Enter the account number you wish to delete");
				key = keyboard.nextInt();
				service.removeAccount(key);
			}
			
			else if (input == 4) {
				escape = false;
			}
			

		}
		
		keyboard.close();

	}

}
