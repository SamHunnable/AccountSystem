package accountsPackage;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Service service = new Service();
		Scanner keyboard = new Scanner(System.in);
		
		//System.out.println("Enter 1 for create account and 2 for );
		
		service.CreateAccount(1);
		
		
		service.ViewAccount(1);

	}

}
