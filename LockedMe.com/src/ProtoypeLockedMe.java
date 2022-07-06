import java.util.Scanner;
import java.io.File;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

class ProtoypeLockedMe {
	// Method for Welcome Page
	public static void WelcomePage(String detail) {
		System.out.println(detail);
	}
	// Method for First Option to return the current file names from any folder in ascending order.
	public static void FirstOption() {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter Folder Path : ");
		File fileDir = new File(scan.nextLine());
		if(fileDir.isDirectory()){
			List<String> listFile = Arrays.asList(fileDir.list());
			System.out.println("Sorting by filename in ascending order :");
			for(String s:listFile){
				System.out.println(s);
				}			}
		else{
			System.out.println(fileDir.getAbsolutePath() + " is not a directory");
		} }
	public static void main(String[] args) {
		WelcomePage("+++++++++Welcome to LockedMe!+++++++++");
		WelcomePage("Generic details : ");
		WelcomePage("1. Project: LockedMe.com");
		WelcomePage("2. Developed by: Shubham Raj");
		WelcomePage("3. Email: raiandbala@outlook.com");
		WelcomePage("------------------------------------------------------------------");
		FirstOption();
	}	}


