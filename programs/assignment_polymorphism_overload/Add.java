package assignment_polymorphism_overload;

public class Add {
 
		 int add(int a,int b)
		{
			return a+b;
			}  
		double add(double a,int b)
		{
			return a+b;
			
		}  
		  
		public static void main(String[] args)
		{  
		Add obj = new Add();
		System.out.println(obj.add(5.7, 2));
		}
}
