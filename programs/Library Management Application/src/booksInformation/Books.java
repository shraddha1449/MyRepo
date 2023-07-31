package booksInformation;
import admin.Admin;
import studentsInformation.BooksVO;
import studentsInformation.Students;
import java.util.Scanner;
public class Books extends Students
{

	int total_books=3;
String[] bName = new String[total_books];

	Scanner sc = new Scanner(System.in);
	
Students Student = new Students();
BooksVO[] book = new BooksVO[5];

public void addBooks()
{
	System.out.println("***Add Books***");
	for(int i=0;i<total_books;i++)
	{
		System.out.println("Enter Book Name-");
		bName[i]=sc.next();
	}
	System.out.println();
	System.out.println("All books added successfully");
}


public void showBooks()
{
	 if (total_books == 0) {
         System.out.println("The library is empty.");
     } else {
         System.out.println("Books in the library:");
         for (int i = 0; i < total_books; i++) {
             System.out.println(bName[i]);
         }
     }	
}

public void issueBook()
{
	 
          }
      
     

public void returnBook()
{
	
}
public void bookRecords()
{Scanner sc = new Scanner(System.in);
	System.out.println("**Books Page**");
	System.out.println("1.Add books");
	System.out.println("2.Display all books");
	System.out.println("3.Exit");
	System.out.println("Enter any option");
	
	int a=sc.nextInt();
	
	switch(a)
	{
	case 1:addBooks();
	
	
	break;
	
	case 2:
showBooks();

break;

	case 3:
		return;
		
		
		
	}
	
	
}

}


