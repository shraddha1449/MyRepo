package assignment_arraybasic3;

public class Reverse_Array {

	public static void main(String[] args)
	{
		int[] arr= new int[5];
		arr[0]=1;
		arr[1]=2;
		arr[2]=3;
		arr[3]=4;
		arr[4]=5;
			
		System.out.println("Original array");
		for(int i=0;i<arr.length;i++)
		{
			System.out.println(arr[i] +" ");
		}
		System.out.println("**************");
		
	

	System.out.println("Reversed array");
	for(int i=arr.length-1;i>=0;i--)
	{
		System.out.println(arr[i] +" ");
	}
}
}