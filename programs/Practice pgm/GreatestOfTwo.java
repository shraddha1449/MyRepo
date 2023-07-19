import java.util.Scanner;

class GreatestOfTwo
{
  
    public static void main(String args[])
    {
        int a,b;
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter first number"+" ");
    a=sc.nextInt();
    
    System.out.println("Enter second number"+" ");
    b=sc.nextInt();
    
    if(a>b)
    {
      System.out.println("Greater number between two numbers is "+a);  
    }else 
    {
        System.out.println("Greater number is"+b);
    }
    }
}