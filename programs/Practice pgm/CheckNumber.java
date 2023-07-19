//Java Program to check whether the given number is positive or negative
import java.util.Scanner;

class CheckNumber
{
    // Driver method
     public static void main(String []args)
     {
        Scanner sc=new Scanner(System.in);
        int num ;     //Number declaration
        System.out.println("Enter the number");
        num=sc.nextInt();    //Number Initialization

        if(num>0)
		{
        System.out.println("It is a positive number");
        
		}
		else if(num<0){
        System.out.println("It is a negative number");
        }
		else{
        System.out.println("Neither positive nor negative");
     } 
	 }
}