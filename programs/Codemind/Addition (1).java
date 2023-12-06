
class Addition{

public static void main(String[] args){
	
	Addition obj = new Addition();
	
	int res = obj.add();
	System.out.println("Result of Addition Methos id -"+res);
	
	obj.substraction();
	
	//First obj1 = new First();
	//obj1.first();

}

int add(){
	int a = 10;
	int b = 20;
	
	int c = a+b;
	
	return c;
	
	}
	
void substraction(){

	First obj1 = new First();
	obj1.first();
	
	int a = 10;
	int b = 20;
	
	int c = a-b;
	
	System.out.println("Substraction of two number - " +c);
	
}

}