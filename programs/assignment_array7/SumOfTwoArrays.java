package assignment_array7;

public class SumOfTwoArrays
{
public static void main(String args[])
{ 
	int arr1[] = new int[] {26,18,15,11,7,84};
	int arr2[] = new int[] {10,20,30,40,50,60};
	System.out.println("First array is");
	

	for(int i=0;i<arr1.length;i++)
	{
		System.out.println(arr1[i]);
	}
	
	System.out.println("Second array is");
	
	for(int i=0;i<arr2.length;i++)
	{
		System.out.println(arr2[i]);
	}
	
	System.out.println("sum of two array");
	int arr3[]= new int[arr1.length];
	for(int i=0;i<arr3.length;i++)
	{
	arr3[i]=arr1[i]+arr2[i];
	
}
	for(int i=0;i<arr3.length;i++)
	{
		System.out.println(arr3[i]+" ");
	}
}
}