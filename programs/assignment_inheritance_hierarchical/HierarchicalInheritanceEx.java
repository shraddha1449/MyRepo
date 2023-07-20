package assignment_inheritance_hierarchical;

public class HierarchicalInheritanceEx {
public static void main(String args[])
{
    Motorcycle obj1 = new Motorcycle();
    Car obj2 = new Car();
    
  
    obj1.showVehicle();
    obj1.showMotorcycle();
    
    obj2.showVehicle();
    obj2.showCar();
    
}
}
