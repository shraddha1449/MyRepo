package studentsInformation;

import java.util.Scanner;
import admin.Admin;


public class Students  {
	//Admin aobj=new Admin();
	Scanner sc = new Scanner(System.in);
	int total_student=3;
	String[] sName = new String[total_student];
	int[] sRoll = new int[total_student];
public void addStudents()
{
	System.out.println("***Add Students***");
	for(int i=0;i<total_student;i++)
	{
		System.out.println("Enter Student Roll NO.-");
		sRoll[i]=sc.nextInt();
		
		System.out.println("Enter Student Name-");
		sName[i]=sc.next();
		
	}
	System.out.println();
	System.out.println("All Students added successfully");	
}

public void showStudents()
{
	 if (total_student == 0) {
         System.out.println("The student list is empty.");
     } else {
         System.out.println("Students Information:");
         for (int i = 0; i < total_student; i++) {
             System.out.println(sRoll[i]);
             System.out.println(sName[i]);
             
         }
     }		
}
//after exit option go to admin page
public void studentpage()
{Scanner sc = new Scanner(System.in);
	System.out.println("**Student Page**");
	System.out.println("1.Add students");
	System.out.println("2.Display all students");
	System.out.println("3.Exit");
	System.out.println("Enter any option");
	
	int a=sc.nextInt();
	
	switch(a)
	{
	case 1:addStudents();

	break;
	
	case 2:
showStudents();

break;

	case 3:
		
		return;
		
		
	}
	studentpage();
	//aobj.adminpage();
}
public static void main(String[] args) {
	System.out.println("*");
	
}
}
