package myLibrary;
import java.util.Scanner;
import admin.Admin;
public class WelcomePage
{
	
Scanner sc = new Scanner(System.in);
Admin adobj = new Admin();

public void display()
{
	System.out.println("***Library Management System***");
	System.out.println("1.Login");
	System.out.println("2.Sign Up");
	System.out.println("3.Exit");
	System.out.println("Enter any option");
	boolean temp=true;
	int a=sc.nextInt();
	switch(a)
	{
	case 1:temp=adobj.login();
		if(temp)
	{
		adobj.adminpage();break;
	}
	
	
	
	case 2:
//display();
break;

	case 3:
		break;
	}
	if(temp)
	{
		adobj.adminpage();
	}
	
}
}
