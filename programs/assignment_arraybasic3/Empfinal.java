package assignment_arraybasic3;
public class Empfinal {
public static void main (String args[])
{
	Emp[] eArray=new Emp[5];
	
	Emp obj=new Emp();
	obj.setEmp_id(101);
	obj.setName("Shraddha");
	obj.setAddress("Lonavala");
	obj.setDepartment("Computer");
	obj.setEmail("shindeshraddha072@gmail.com");
	
	Emp obj1=new Emp();
	obj1.setEmp_id(102);
	obj1.setName("Vikas");
	obj1.setAddress("Talegaon");
	obj1.setDepartment("Electrical");
	obj1.setEmail("vikas@gmail.com");
	
	eArray[0]=obj;
	eArray[1]=obj1;
	
	
	for(int i=0; i < eArray.length; i++) {
		
		Emp eVal = eArray[i];
		
		if(eVal != null) 
		{
			System.out.println(eVal.getEmp_id());
			System.out.println(eVal.getName());
			System.out.println(eVal.getAddress());
			System.out.println(eVal.getDepartment());
			System.out.println(eVal.getEmail());
			System.out.println("*********************************");
		}	
	
}
}
}