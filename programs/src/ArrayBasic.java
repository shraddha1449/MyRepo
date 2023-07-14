
public class ArrayBasic {
	
	public static void main(String[] args) {
		
		int[] sRno = new int[5];
		sRno[0] = 1;
		sRno[1] = 2;
		sRno[2] = 3;
		sRno[3] = 4;
		sRno[4] = 5;
		
		for(int i=0; i < sRno.length; i++) {
			int val = sRno[i];
			System.out.println("Rno Value - "+val);
		}
		
		Student[] sArray = new Student[5];
		
		Student sObj = new Student();
		sObj.setRno(1);
		sObj.setName("Avishkar");
		
		Student sObj1 = new Student();
		sObj1.setRno(2);
		sObj1.setName("Shitosh");
		
		sArray[0] = sObj;
		sArray[1] = sObj1;
		
		for(int i=0; i < sArray.length; i++) {
			
			Student sVal = sArray[i];
			
			if(sVal != null) {
				System.out.println(sVal.getRno());
				System.out.println(sVal.getName());
			}
			
			System.out.println("Student for loop Iteration-"+i);
			
		}
		
	}

}
