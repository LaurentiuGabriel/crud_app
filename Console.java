package crud_app;

import java.util.Scanner;

public class Console {

	public static void main(String[] args){
		ObjectBean obj = new ObjectBean();
	
		System.out.println("Choose one of the following options: ");
		System.out.println("1. Insert statement");
		System.out.println("2. Update statement");
		System.out.println("3. Select statement");
		System.out.println("4. Delete statement");
		Scanner scanner = new Scanner(System.in);
		int reader = scanner.nextInt();
		
		if(reader==1){
			System.out.println("Specify the username: ");
			Scanner scannerInsert = new Scanner(System.in);
			String username = scannerInsert.nextLine();
			System.out.println("Specify the password: ");
			String pwd = scannerInsert.nextLine();
			System.out.println("Specify the fullname: ");
			String fullname = scannerInsert.nextLine();
			System.out.println("Specify the email address of the user: ");
			String email = scannerInsert.nextLine();
			obj.insertStatement(username, pwd, fullname, email);
			scannerInsert.close();
		}
		if(reader==2){
			System.out.println("Specify the username: ");
			Scanner scannerUpdate = new Scanner(System.in);
			String username = scannerUpdate.next();
			System.out.println("Specify the password: ");
			String pwd = scannerUpdate.next();
			System.out.println("Specify the fullname: ");
			String fullname = scannerUpdate.next();
			System.out.println("Specify the email address of the user: ");
			String email = scannerUpdate.next();
			obj.updateStatement(username, pwd, fullname, email);
			scannerUpdate.close();
		}
		if(reader==3){
			System.out.println("Specify the username: ");
			Scanner scannerSelect = new Scanner(System.in);
			String username = scannerSelect.next();
			obj.selectStatement(username);
			scannerSelect.close();
		}
		if(reader==4){
			System.out.println("Specify the username: ");
			Scanner scannerDelete = new Scanner(System.in);
			String username = scannerDelete.next();
			obj.selectStatement(username);
			scannerDelete.close();
		}
		scanner.close();
		}
		
	}
	

