package booksInformation;
import admin.Admin;
import studentsInformation.BooksVO;
import studentsInformation.Students;
import java.util.Scanner;
public class Books extends Students
{

int total_books=3;
String[] books = new String[total_books];
String[] studs =new String[total_books];
String[] Ibook =new String[total_books];
 boolean[] availability=new boolean[total_books];;

String stud1;
String Ibook1;

	Scanner sc = new Scanner(System.in);
	
Students Student = new Students();
BooksVO[] book = new BooksVO[5];



public void addBooks()
{
	System.out.println("***Add Books***");
	for(int i=0;i<total_books;i++)
	{
		System.out.println("Enter Book Name-");
		books[i]=sc.next();
		availability[i] = true;
	}
	System.out.println();
	System.out.println("All books added successfully");
}


public void displayBooks()
{
    System.out.println("Available books:");
    for (int i = 0; i < books.length; i++) {
        if (availability[i]) {
            System.out.println(i + ". " + books[i]);
        }
    }
}
public void issueBook(int index, String name) {
    if (index >= 0 && index < books.length && availability[index]) {
        availability[index] = false;
        studs[index]=name;
        System.out.println("You have successfully issued: " + books[index]+" to "+name);
    } else {
        System.out.println("Book not available for issuing.");
    }
}

public void returnBook(int index) {
    if (index >= 0 && index < books.length && !availability[index]) {
        availability[index] = true;
        String temp_name=studs[index];
        studs[index]=null;
        System.out.println(temp_name+" have successfully returned: " + books[index]);
    } else {
        System.out.println("Invalid book or already available.");
    }
}

public void manageBooks()
{
	Scanner sc = new Scanner(System.in);
    while (true) {
        System.out.println("\nMenu:");
        System.out.println("1. Issue a book");
        System.out.println("2. Return a book");
        System.out.println("3. Display available books");
        System.out.println("4. Exit");
        System.out.print("Select an option: ");
        int choice = sc.nextInt();

        switch (choice) {
            case 1:
                displayBooks();
                System.out.print("Enter the Name of student: ");
                String stud_name = sc.next();
                System.out.print("Enter the index of the book to issue: ");
                int issueIndex = sc.nextInt();
                issueBook(issueIndex,stud_name);
                break;

            case 2:
                displayBooks();
                System.out.print("Enter the index of the book to return: ");
                int returnIndex = sc.nextInt();
                returnBook(returnIndex);
                break;

            case 3:
                displayBooks();
                break;

            case 4:
                System.out.println("Exiting the program.");
                sc.close();
                System.exit(0);

            default:
                System.out.println("Invalid choice. Please select a valid option.");
        }
    }
    

	
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
		displayBooks();
		break;

	case 3:
		sc.close();
		return;
		
		
		
	}
	
	
}

}


