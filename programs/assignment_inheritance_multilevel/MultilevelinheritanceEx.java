package assignment_inheritance_multilevel;

public class MultilevelinheritanceEx {

	public static void main(String[] args) {
		
 Parent Obj1 = new Parent();
		
		
		Obj1.parent();
		
		
		Child obj2 = new Child();
		
		obj2.parent();
		obj2.child();
		
		
		GrandChild Obj3 = new GrandChild();
			
		Obj3.parent();
		Obj3.child();
		Obj3.grandchild();
	}

}
