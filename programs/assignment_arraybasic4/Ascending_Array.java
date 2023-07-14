package assignment_arraybasic4;

public class Ascending_Array 
{
public static void main(String[] args)
{
	int temp=0;
	int[]arr = new int [5];
	arr[0]=15;
	arr[1]=11;
	arr[2]=84;
	arr[3]=18;
	arr[4]=26;
	
	System.out.println("Original array");
	for(int i=0;i<arr.length;i++)
	{
		System.out.println(arr[i]+ " ");
	}
		
	for (int i = 0; i < arr.length; i++) 
    {
        for (int j = i + 1; j < arr.length; j++) 
        {
            if (arr[i] > arr[j]) 
            {
                temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
    }
    System.out.print("Ascending Order:");
    for (int i = 0; i < arr.length - 1; i++) 
    {
        System.out.print(arr[i] + ",");
    }
    System.out.print(arr[arr.length - 1]);
}
}
