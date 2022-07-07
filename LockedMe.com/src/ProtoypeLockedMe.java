import java.util.Scanner;
class ProtoypeLockedMe {

	public static void WelcomePage(String detail) {
		System.out.println(detail);
	}
	
	public static void SecondOption(){
		System.out.println("Ok then, we have various options for you to select : ");
		System.out.println("1 - Add a file to the existing directory list.");
		System.out.println("2 - Delete a user specified file from the existing directory list.");
		System.out.println("3 - Search a user specified file from the main directory.");
		System.out.println("So which option do you want to go with? Please provide the option no. below :");
	}
	public static void ThirdOption(){
		Scanner scan = new Scanner(System.in);
		System.out.println("Do you wish to continue with the options? Press Yes to continue or No to exit");
		String wish = scan.nextLine();
		if(wish.equalsIgnoreCase("Yes")) {
			SecondOption();
		}
		else {
			System.out.println("Bye! have a nice day");
		}
	}
	public static void main(String[] args) {
		WelcomePage("+++++++++Welcome to LockedMe!+++++++++");
		WelcomePage("app details : ");
		WelcomePage("1. Project: LockedMe.com");
		WelcomePage("2. Developed by: Shubham Raj");
		WelcomePage("2. Developed by: Shubham Raj");
		WelcomePage("3. Email: raiandbala@outlook.com");
		WelcomePage("----------------------------------------------------------------------------------");
		SecondOption();
		ThirdOption();
		
	}

}
