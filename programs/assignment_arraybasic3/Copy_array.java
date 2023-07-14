package assignment_arraybasic3;

public class Copy_array {
public static void main(String[] args)
{
	int[] arr1 = new int[5];
	arr1[0]=10;
	arr1[1]=20;
	arr1[2]=30;
	arr1[3]=40;
	arr1[4]=50;
	
	int arr2[] = new int[arr1.length];
	
	for(int i=0;i<arr1.length;i++)
	{
		arr2[i]=arr1[i];
	}
	System.out.println("Elements of first array");
	
for(int i=0;i<arr1.length;i++)
{
	System.out.println(arr1[i]+ " ");
}

System.out.println("***************************");

System.out.println("Elements of second array:-");
for(int i=0;i<arr2.length;i++)
{
	System.out.println(arr2[i]+" ");
}
}
}
