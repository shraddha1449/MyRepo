package admin;
import java.util.Scanner;

import booksInformation.Books;
import studentsInformation.Students;
public class Admin 
{
String adminId="Admin";
String adminpass="Admin";

Scanner sc = new Scanner(System.in);
Students stobj = new Students();
Books bobj = new Books();
public boolean login()
{
	System.out.println("Login Page");
	System.out.println("Enter Id-");
	String a= sc.nextLine();
	
	System.out.println("Enter Password-");
	String b= sc.nextLine();
	
	if(adminId.equals(a)&& adminpass.equals(b))
	{
		System.out.println();
		System.out.println("Login Successful");
		System.out.println();
		System.out.println("Welcome Admin");
		
	}
	else 
	{
		System.out.println("Invalid Login");
		return false;
	}
	return true;
}
public void adminpage()
{
	System.out.println("**Admin Page**");
	System.out.println("1.Student Records");
	System.out.println("2.Book Records");
	System.out.println("3.Manage Books");
	System.out.println("4.Exit");
	System.out.println("Enter any option");
	
	int a=sc.nextInt();
	
	switch(a)
	{
	case 1:stobj.studentpage();
	 adminpage();
	break;
	
	case 2:
    bobj.bookRecords();
    adminpage();
    break;

	case 3:
		bobj.manageBooks();
		break;
		
	case 4:
		return;
	}
	}




}