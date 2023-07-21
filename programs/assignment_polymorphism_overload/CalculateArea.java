package assignment_polymorphism_overload;

public class CalculateArea {
void area(float a)
{
	System.out.println("Area of Circle "+3.14* a*a);
}

public void area(float a , float b,float c)
{
	double temp=(a+b+c);
	double s=temp/2;
	double triarea = Math.sqrt(s*(s-a)*(s-b)*(s-c));
	System.out.println("Area of triangle "+triarea);
}

public void area(float a,float b)
{
	System.out.println("Area of rectangle "+a*b);	
}
public static void main(String[] args)
{
		CalculateArea obj = new CalculateArea();
		obj.area(5);
		obj.area(10,20);
		obj.area(5,6,7);
}
}
