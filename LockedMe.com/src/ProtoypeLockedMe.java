import java.io.File;
import java.io.IOException;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
class ProtoypeLockedMe {

	public static void WelcomePage(String detail) {
		System.out.println(detail);
	}
	public static void SecondOption(){
		Scanner scan = new Scanner(System.in);
		System.out.println("We have various options for you to select : ");
		System.out.println("But First kindly provide the path name including the desired filename and type below : ");
		String Path = scan.nextLine();
		File file = new File(Path); 
		boolean result;  
		
		System.out.println("Great! Now which option do you want to go with from below? Please provide the option no.:");
		System.out.println("1 - Add a file to the existing directory list.");
		System.out.println("2 - Delete a user specified file from the existing directory list.");
		System.out.println("3 - Search a user specified file from the main directory."); 
		
		int Option = scan.nextInt();
		try   
		{ 
			result = file.createNewFile(); 
		if(result && Option == 1)    
		{  
		System.out.println("file created "+file.getCanonicalPath()); 
		}  
		else  
		{  
		System.out.println("File already exist at location: "+file.getCanonicalPath());  
		}  
		}   
		catch (IOException e)   
		{  
		System.out.println(e);
		}
	}
	public static void main(String[] args) {
		WelcomePage("+++++++++Welcome to LockedMe!+++++++++");
		WelcomePage("Generic details : ");
		WelcomePage("1. Project: LockedMe.com");
		WelcomePage("2. Developed by: Shubham Raj");
		WelcomePage("2. Developed by: Shubham Raj");
		WelcomePage("3. Email: raiandbala@outlook.com");
		WelcomePage("-----------------------------------------------------------------------------------");
		SecondOption();
	}

}
