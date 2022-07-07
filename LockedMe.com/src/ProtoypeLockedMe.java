import java.util.Scanner;
import java.io.File;
import java.util.Arrays;
import java.util.List;
import java.io.IOException;

class ProtoypeLockedMe {

	// Method for Welcome Page
	public static void WelcomePage(String detail) {
		System.out.println(detail);
	}

	// Method for First Option to return the current file names from any folder in ascending order.
	public static void FirstOption() {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter Folder Path so that the files inside it can be displayed in ascending order: ");
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
	// Method for Second Option to work according to options mentioned in below program
		public static void SecondOption(){
		Scanner scan = new Scanner(System.in);
			System.out.println("We have various options for you to select : ");
			System.out.println("But First kindly provide the path name including the desired filename and type below : ");
			String Path = scan.nextLine();
			File file = new File(Path); 
			System.out.println("Great! Now which option do you want to go with from below? Please provide the option no. :");
			System.out.println("1 - Add a file to the existing directory list.");
			System.out.println("2 - Delete a user specified file from the existing directory list.");
			System.out.println("3 - Search a user specified file from the main directory.");
		int Option = scan.nextInt();
		try   
		{ 
			boolean AddFile; 
			boolean DeleteFile;
			boolean SearchFile;
			if(Option == 1)    
			{  
				AddFile = file.createNewFile(); 
			System.out.println("file created "); 
			}  
			else if(Option == 2)    
		{  
				DeleteFile = file.delete();
		System.out.println("file deleted "); 
		}  
			else if(Option == 3)    
			{  
				SearchFile = file.exists();
			System.out.println("file found "+file.getCanonicalPath()); 
			}  
		else  
		{  
		System.out.println("File not found at location: "+file.getCanonicalPath());  
		}  
		}   
		catch (IOException e)   
		{  
		System.out.println(e);
		}
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

		WelcomePage("+++++++++Welcome to LockedMe!++++++++++");
		WelcomePage("Application Details : ");
		WelcomePage("1. Project: LockedMe.com");
		WelcomePage("2. Developed by: Shubham Raj");
		WelcomePage("3. Git Repo: https://github.com/raiandbala/Locked-Me.Com");
		WelcomePage("4. Email: raiandbala@outlook.com");
		WelcomePage("----------------------------------------------------------------------------------");
		FirstOption();
		WelcomePage("----------------------------------------------------------------------------------");
		SecondOption();
		WelcomePage("----------------------------------------------------------------------------------");
		ThirdOption();
	}
}


