import java.util.Scanner;
public class ScannerDemo{
	public static void main(String[] args){
		String username;
		String password;
		Scanner userentry = new Scanner(System.in);
		System.out.println("Enter your username");
		username =userentry.nextLine();


		System.out.println("Enter password for :" + username);
		password = userentry.nextLine();

		if ( password.equals(username)) {
			System.out.println("Correct password");
		}else {
			System.out.println("Incorrect password");
		}



	}
}