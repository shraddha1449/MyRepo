import java.util.Scanner;
class Scan
{
void add()
{
System.out.println("Welcome to addition");

Scanner sc = new Scanner(System.in);
System.out.print("Enter first number"+" ");
int a=sc.nextInt();

System.out.print("Enter second number"+" ");
int b=sc.nextInt();

int answer=a+b;
System.out.println("Addition of two number is"+" "+answer);
System.out.println("****************************");
}

void sub()
{
System.out.println("Welcome to Subtraction");

Scanner sc = new Scanner(System.in);
System.out.print("Enter first number"+" ");
float a=sc.nextFloat();

System.out.print("Enter second number"+" ");
float b=sc.nextFloat();

float answer=a-b;
System.out.println("Subtraction of two number is"+" "+answer);
System.out.println("****************************");
}


void mul()
{
System.out.println("Welcome to Multiplication");

Scanner sc = new Scanner(System.in);
System.out.print("Enter first number"+" ");
int a=sc.nextInt();

System.out.print("Enter second number"+" ");
int b=sc.nextInt();

int answer=a*b;
System.out.println("Multiplication of two number is"+" "+answer);
System.out.println("****************************");
}


void div()
{
System.out.println("Welcome to Division");

Scanner sc = new Scanner(System.in);
System.out.print("Enter first number"+" ");
int a=sc.nextInt();

System.out.print("Enter second number"+" ");
int b=sc.nextInt();

int answer=a/b;
System.out.println("Division of two number is"+" "+answer);
System.out.println("****************************");
}

public static void main(String args[])
{
Scan obj=new Scan();
obj.add();
obj.sub();
obj.mul();
obj.div();
}
}

