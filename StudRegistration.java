import java.util.Scanner;

class StudRegistration
{
	
	Scanner sc = new Scanner(System.in);
	String username = new  String();  
	String password = new String();
	public void login()
	{
		System.out.println("Username -");
		username = sc.next();
		System.out.println("Password -");
		password = sc.next();
	}
	public void auth()
	{
		login();
		if (username.equals("Student"))
		{
			if(password.equals("Student101"))
			{
				System.out.println("Access granted");
			}
		}
		else
		{
			System.out.println("Access denied! Try again");
		} 
	}
	public void Menulist()
	{
		int choice;
		Scanner sr = new Scanner(System.in) ;
		System.out.println("--------Menu--------");
		System.out.println("1. Enter New Data");
		System.out.println("2. Update Data");
		System.out.println("3. Display Data");
		System.out.println("4. Exit");
		System.out.println("\nChoose the option: ");
		choice = sr.nextInt () ;
		if(choice == 1)
		{
			String firstname;
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter First name of the Student");
			firstname = sc.next ();
			
			String surname;
			Scanner sn = new Scanner(System.in);
			System.out.println("Enter Surname of the Student");
			surname = sn.next () ;
			
			String date_of_birth;
			Scanner se = new Scanner(System.in);
			System.out.println("Enter date of birth of the student");
			date_of_birth = se.next();
			
			int gender;
			Scanner er = new Scanner(System.in);
			System.out.println("1. male");
			System.out.println("2. female");
			System.out.println("\n Choose the option");
			gender = er.nextInt () ;
			
			String nationality;
			Scanner ny = new Scanner(System.in);
			System.out.println("Enter Gender of the student");
			nationality = ny.next () ;
			
			String state;
			Scanner sC = new Scanner(System.in);
			System.out.println("Enter State of Origin");
			state = sC.next () ;
			
			String email;
			Scanner cs = new Scanner(System.in);
			System.out.println("Enter email address of the student");
			email = cs.next () ;
			
			int Pnumber;
			Scanner pn = new Scanner(System.in);
			System.out.println("Enter Phone Number of the student");
			Pnumber = pn.nextInt () ;
			
			String Religion;
			Scanner rn = new Scanner(System.in);
			System.out.println("1 Christian");
			System.out.println("2 Muslim");
			System.out.println("3 Tradionalist");
			System.out.println("4 None");
			System.out.println("\n Choose the option");
			Religion = rn.next () ;
			
			String Parent_Name;
			Scanner pe = new Scanner(System.in);
			System.out.println("Enter Parent/Guardian name");
			Parent_Name = pe.next ();
			
			int Ppnumber;
			Scanner ppn = new Scanner(System.in);
			System.out.println("Enter Parent/Guardian phone number");
			Ppnumber = ppn.nextInt () ;
		
			
			
		}
		else
		{
			System.out.println("Tried");
		}
		
	}
	public static void main(String[] a)
	{
		StudRegistration str = new StudRegistration();
		//str login();
		str.auth();
		str.Menulist();
	}
	
}